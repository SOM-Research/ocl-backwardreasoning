package cat.icrea.ocl.backwardreasoning.patterns;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.SetType;
import org.eclipse.ocl.ecore.internal.OCLStandardLibraryImpl;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.utilities.ExpressionInOCL;

import cat.icrea.ocl.backwardreasoning.utils.OCLUtil;
import cat.icrea.ocl.backwardreasoning.visitors.LookupAllInstancesVisitor;
import cat.icrea.ocl.backwardreasoning.visitors.LookupPropertyVisitor;


public class DeleteObject {
	
	private Constraint constraint;
	private ExpressionInOCL oclExpression;
	private EClass contextCls;
	private EClass eClass;
	private String variableName;
	OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper;
	public DeleteObject(Constraint constraint,EClass eClass, String variableName) throws ParserException{
		this.constraint = EcoreUtil.copy(constraint);
		this.eClass = eClass;
		this.variableName = variableName;
		 oclExpression = (ExpressionInOCL) this.constraint.getSpecification();
		contextCls = (EClass) constraint.getConstrainedElements().get(0);
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		helper = ocl
				.createOCLHelper();
		OCLUtil.insertQuantificationForSelf(helper, contextCls, oclExpression);
	}
	
	


	public  void insertQuantification()
			throws ParserException {

		OCLExpression bodyExp = oclExpression.getBodyExpression();
		LookupPropertyVisitor lookupVisitor = new LookupPropertyVisitor();
		LookupAllInstancesVisitor lookupAllInstancesVisitor = new LookupAllInstancesVisitor();
		bodyExp.accept(lookupVisitor);
		Set<PropertyCallExp<EClassifier, EStructuralFeature>> result = lookupVisitor.getResult();
		for(PropertyCallExp<EClassifier, EStructuralFeature> item : result)
			if ((item.getReferredProperty().getEType() instanceof EClass && ((EClass)item.getReferredProperty().getEType()).isSuperTypeOf(eClass)) || item.getReferredProperty().getEType() instanceof EClass && eClass.isSuperTypeOf((EClass)item.getReferredProperty().getEType())) {
		
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
			operationCallExp.setType(OCLStandardLibraryImpl.INSTANCE.getCollection());
			operationCallExp.getArgument().add(variable);
			operationCallExp.setSource(item);
			
			op.setSource(operationCallExp);
			
			

		}
		bodyExp.accept(lookupAllInstancesVisitor);
		Set<OperationCallExp<EClassifier, EOperation>> resultAllInstances = lookupAllInstancesVisitor.getResult();
		
		
		for(OperationCallExp<EClassifier, EOperation> item : resultAllInstances)
			if ((item.getType() != null &&  item.getType() instanceof SetType && ((SetType)item.getType()).getElementType() instanceof EClass && ((EClass)((SetType)item.getType()).getElementType()).isSuperTypeOf(eClass)) || (item.getType() != null &&  item.getType() instanceof SetType && ((SetType)item.getType()).getElementType() instanceof EClass && eClass.isSuperTypeOf(((EClass)((SetType)item.getType()).getElementType())))) {
				
			EcorePackage oclPackage = (EcorePackage) oclExpression.eClass()
					.getEPackage();
			EcoreFactory oclFactory = (EcoreFactory) oclPackage
					.getEFactoryInstance();
			org.eclipse.ocl.ecore.IteratorExp op = (org.eclipse.ocl.ecore.IteratorExp) item.eContainer();
			VariableExp variable = oclFactory.createVariableExp();
			variable.setName(variableName);
			variable.setType(eClass);
			Variable v = oclFactory.createVariable();
			v.setName(variableName);
			v.setType(eClass);
			variable.setReferredVariable(v);
			OperationCallExp operationCallExp = oclFactory.createOperationCallExp();
			EOperation including = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEOperation();
			including.setName("excluding");
			operationCallExp.setReferredOperation(including);
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
