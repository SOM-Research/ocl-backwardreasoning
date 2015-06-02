package backwardreasoning.examples.bank;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.IteratorExp;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.IfExp;
import org.eclipse.ocl.expressions.IterateExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.utilities.ExpressionInOCL;

import backwardreasoning.examples.utils.OCLUtil;
import backwardreasoning.examples.visitors.LookupPropertyVisitor;
import backwardreasoning.examples.visitors.LookupVariableExpVisitor;

public class UpdateAttributePattern {

	private Constraint constraint;
	private ExpressionInOCL oclExpression;
	private EClass contextCls;
	private EClass eClass;
	private EAttribute eAttribute;
	private String newValLabel;
	private String eClassVariableName;
	OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper;

	public UpdateAttributePattern(Constraint constraint, EClass eClass, String eClassVariableName,
			EAttribute eAttribute,
			String newValLabel) throws ParserException {
		this.constraint = constraint;
		this.eClass = eClass;
		this.eAttribute = eAttribute;
		this.newValLabel = newValLabel;
		this.eClassVariableName = eClassVariableName;
		oclExpression = (ExpressionInOCL) constraint.getSpecification();
		contextCls = (EClass) constraint.getConstrainedElements().get(0);
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		helper = ocl.createOCLHelper();
		OCLUtil.insertQuantificationForSelf(helper, contextCls, oclExpression);
	}

	public void insertQuantification() throws ParserException {

		OCLExpression bodyExp = oclExpression.getBodyExpression();
		LookupPropertyVisitor lookupVisitor = new LookupPropertyVisitor();
		LookupVariableExpVisitor lookupVariable = new LookupVariableExpVisitor();
		bodyExp.accept(lookupVariable);
		bodyExp.accept(lookupVisitor);
		OCLExpression iterateBody = null;
		if (bodyExp instanceof IterateExp)
			iterateBody = ((IterateExp) bodyExp).getBody();
		Set<PropertyCallExp<EClassifier, EStructuralFeature>> result = lookupVisitor
				.getResult();
		VariableExp<EClassifier, EParameter> contextVariable = lookupVariable
				.getResult();
		for (PropertyCallExp<EClassifier, EStructuralFeature> item : result)
			if ( item.getReferredProperty().getName()
					.equals(eAttribute.getName())) {

				EcorePackage oclPackage = (EcorePackage) oclExpression.eClass()
						.getEPackage();
				EcoreFactory oclFactory = (EcoreFactory) oclPackage
						.getEFactoryInstance();
				OperationCallExp op = (OperationCallExp) item.eContainer();
				OperationCallExp clone = EcoreUtil
						.copy(getOperationContainer(op));
				IfExp ifExp = oclFactory.createIfExp();

				VariableExp varEClass = oclFactory.createVariableExp();
				varEClass.setName(eClassVariableName);
				varEClass.setType(eClass);
				Variable ve = oclFactory.createVariable();
				ve.setName(eClassVariableName);
				ve.setType(eClass);
				varEClass.setReferredVariable(ve);

				VariableExp varNewValue = oclFactory.createVariableExp();
				varNewValue.setName(newValLabel);
				varNewValue.setType(oclFactory.createPrimitiveType());
				Variable vs = oclFactory.createVariable();
				vs.setName(newValLabel);
				vs.setType(oclFactory.createPrimitiveType());
				varNewValue.setReferredVariable(vs);

				OperationCallExp conditionExp = oclFactory
						.createOperationCallExp();
				EOperation equals = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE
						.createEOperation();
				equals.setName("=");
				
				conditionExp.setReferredOperation(equals);
				conditionExp.setType(oclFactory.createPrimitiveType());
				conditionExp.getArgument().add(varEClass);
				conditionExp.setSource(contextVariable);


				ifExp.setCondition(conditionExp);
				ifExp.setName("if");
				ifExp.setThenExpression(varNewValue);
				ifExp.setElseExpression(clone);
				((IteratorExp) bodyExp).setBody(ifExp);
			}
	}

	public OperationCallExp getOperationContainer(OperationCallExp op) {
		OperationCallExp temp = op;
		while (op.eContainer() != null
				&& op.eContainer() instanceof OperationCallExp) {
			temp = (OperationCallExp) op.eContainer();
			op = temp;
		}
		return temp;
	}

	public Constraint getConstraint() {
		return constraint;
	}

	public void setConstraint(Constraint constraint) {
		this.constraint = constraint;
	}

	public ExpressionInOCL getOclExpression() {
		return oclExpression;
	}

	public void setOclExpression(ExpressionInOCL oclExpression) {
		this.oclExpression = oclExpression;
	}

	public EClass getContextCls() {
		return contextCls;
	}

	public void setContextCls(EClass contextCls) {
		this.contextCls = contextCls;
	}

	public OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> getHelper() {
		return helper;
	}

	public void setHelper(
			OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper) {
		this.helper = helper;
	}
}
