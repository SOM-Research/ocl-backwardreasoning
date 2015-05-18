package backwardreasoning.examples.bank;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.utilities.ExpressionInOCL;

import backwardreasoning.examples.utils.OCLUtil;
import backwardreasoning.examples.visitors.LookupPropertyVisitor;

public class DeleteObjectPattern {
	
	private Constraint constraint;
	private ExpressionInOCL oclExpression;
	private EClass contextCls;
	private EClass eClass;
	private String variableName;
	OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper;
	public DeleteObjectPattern(Constraint constraint,EClass eClass, String variableName) throws ParserException{
		this.constraint = constraint;
		this.eClass = eClass;
		this.variableName = variableName;
		 oclExpression = (ExpressionInOCL) constraint.getSpecification();
		contextCls = (EClass) constraint.getConstrainedElements().get(0);
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		helper = ocl
				.createOCLHelper();
		OCLUtil.insertQuantificationForSelf(helper, contextCls, oclExpression);
		System.out.println(oclExpression.getBodyExpression());
	}
	
	


	public  void insertQuantification()
			throws ParserException {

		OCLExpression bodyExp = oclExpression.getBodyExpression();
		LookupPropertyVisitor lookupVisitor = new LookupPropertyVisitor();
		bodyExp.accept(lookupVisitor);
		Set<PropertyCallExp<EClassifier, EStructuralFeature>> result = lookupVisitor.getResult();
		System.err.println("Delete object pattern");
		for(PropertyCallExp<EClassifier, EStructuralFeature> item : result)
		if (((EClass)item.getReferredProperty().getEType()).getName().equals(eClass.getName())) {
		
			EcorePackage oclPackage = (EcorePackage) oclExpression.eClass()
					.getEPackage();
			EcoreFactory oclFactory = (EcoreFactory) oclPackage
					.getEFactoryInstance();
			OperationCallExp op = (OperationCallExp) item.eContainer();
			VariableExp variable = oclFactory.createVariableExp();
			variable.setName(variableName);
			variable.setType(eClass);
			Variable v = oclFactory.createVariable();
			v.setName(variableName);
			v.setType(eClass);
			variable.setReferredVariable(v);
			OperationCallExp operationCallExp = oclFactory.createOperationCallExp();
			EOperation excluding = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEOperation();
			excluding.setName("excluding");
			operationCallExp.setReferredOperation(excluding);
			operationCallExp.getArgument().add(variable);
			operationCallExp.setSource(item);
			op.setSource(operationCallExp);

		}
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

	public EClass geteClass() {
		return eClass;
	}

	public void seteClass(EClass eClass) {
		this.eClass = eClass;
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> getHelper() {
		return helper;
	}

	public void setHelper(
			OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper) {
		this.helper = helper;
	}
}
