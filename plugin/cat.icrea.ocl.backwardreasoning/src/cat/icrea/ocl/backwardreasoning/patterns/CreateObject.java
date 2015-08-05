package cat.icrea.ocl.backwardreasoning.patterns;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.IntegerLiteralExp;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.internal.OCLStandardLibraryImpl;
import org.eclipse.ocl.expressions.IfExp;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.utilities.ExpressionInOCL;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import cat.icrea.ocl.backwardreasoning.utils.OCLUtil;
import cat.icrea.ocl.backwardreasoning.visitors.LookupAllInstancesVisitor;
import cat.icrea.ocl.backwardreasoning.visitors.LookupExcludingVisitor;
import cat.icrea.ocl.backwardreasoning.visitors.LookupPropertyVisitor;
import cat.icrea.ocl.backwardreasoning.visitors.LookupSelectVisitor;
import cat.icrea.ocl.backwardreasoning.visitors.LookupSizeVisitor;
import cat.icrea.ocl.backwardreasoning.visitors.LookupVariableExpVisitor;


public class CreateObject {
	
	private Constraint constraint;
	private ExpressionInOCL oclExpression;
	private EClass contextCls;
	private EClass eClass;
	private String variableName;
	OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper;
	public CreateObject(Constraint constraint,EClass eClass, String variableName) throws ParserException{
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
		EcorePackage oclPackage = (EcorePackage) oclExpression.eClass()
				.getEPackage();
		EcoreFactory oclFactory = (EcoreFactory) oclPackage
				.getEFactoryInstance();
		LookupAllInstancesVisitor lookupVisitor = new LookupAllInstancesVisitor();
		LookupSizeVisitor lookupSizeVisitor = new LookupSizeVisitor();
		LookupExcludingVisitor lookupExcludingVisitor = new LookupExcludingVisitor();
		LookupSelectVisitor lookupSelectVisitor = new LookupSelectVisitor();
		LookupPropertyVisitor lookupPropertyVisitor = new LookupPropertyVisitor();
		bodyExp.accept(lookupVisitor);
		bodyExp.accept(lookupSelectVisitor);
		bodyExp.accept(lookupExcludingVisitor);
		Set<OperationCallExp<EClassifier, EOperation>> result = lookupVisitor.getResult();
		Set<OperationCallExp<EClassifier, EOperation>> resultExcluding = lookupExcludingVisitor.getResult();
		Set<IteratorExp<EClassifier, EParameter>> resultSelect = lookupSelectVisitor.getResult();
		
//		for(OperationCallExp<EClassifier, EOperation> item : result)
//		if (((EClassifier)item.getSource().getType()).getName().equals(eClass.getName())) {
//		
//			EcorePackage oclPackage = (EcorePackage) oclExpression.eClass()
//					.getEPackage();
//			EcoreFactory oclFactory = (EcoreFactory) oclPackage
//					.getEFactoryInstance();
//			org.eclipse.ocl.ecore.IteratorExp op = (org.eclipse.ocl.ecore.IteratorExp) item.eContainer();
//			VariableExp variable = oclFactory.createVariableExp();
//			variable.setName(variableName);
//			variable.setType(eClass);
//			Variable v = oclFactory.createVariable();
//			v.setName(variableName);
//			v.setType(eClass);
//			variable.setReferredVariable(v);
//			OperationCallExp operationCallExp = oclFactory.createOperationCallExp();
//			EOperation including = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEOperation();
//			including.setName("including");
//			operationCallExp.setReferredOperation(including);
//			operationCallExp.getArgument().add(variable);
//			operationCallExp.setSource(item);
//			op.setSource(operationCallExp);
//
//		}
		for(OperationCallExp<EClassifier, EOperation> item : resultExcluding)
		if (item.getSource() instanceof OperationCallExp && !((OperationCallExp)item.getSource()).getArgument().isEmpty() &&((VariableExp)((OperationCallExp)item.getSource()).getArgument().get(0)).getName().equals(variableName)) {
			OperationCallExp including = (OperationCallExp) item.getSource();
			if(((VariableExp)including.getArgument().get(0)).getName().equals(((VariableExp)item.getArgument().get(0)).getName())){
			//TODO
			}
			else {
				OCLExpression source  = (OCLExpression)including.getSource();
				OCLExpression container = (OCLExpression) item.eContainer();
				including.setSource(item);
				item.setSource(source);
				if(container instanceof OperationCallExp )
					((OperationCallExp)container).setSource(including);
		
		}}
		for(IteratorExp<EClassifier, EParameter> item : resultSelect)
			{
			
				OperationCallExp copyforIf = (OperationCallExp) EcoreUtil.copy(item.eContainer());
				OperationCallExp copyforIf2 = (OperationCallExp) EcoreUtil.copy(item.eContainer());
				IteratorExp copySelect =  EcoreUtil.copy(item);
			
				OperationCallExp<EClassifier, EOperation> selectBody = (OperationCallExp<EClassifier, EOperation>) EcoreUtil.copy(item.getBody());
				IntegerLiteralExp integer =	oclFactory.createIntegerLiteralExp();
				integer.setIntegerSymbol(0);
				
				LookupVariableExpVisitor lookupVariableExpVisitor = new LookupVariableExpVisitor();
				selectBody.accept(lookupVariableExpVisitor);
				VariableExp<EClassifier, EParameter> resultForVariable = lookupVariableExpVisitor.getResult();
				if(resultForVariable != null){
					resultForVariable.setName(variableName);
					resultForVariable.getReferredVariable().setName(variableName);
					selectBody.setSource(integer);
				}
				
				VariableExp variable = oclFactory.createVariableExp();
				variable.setName(variableName);
				variable.setType(eClass);
				Variable v = oclFactory.createVariable();
				v.setName(variableName);
				v.setType(eClass);
				variable.setReferredVariable(v);
				OperationCallExp operationCallExp = oclFactory.createOperationCallExp();
				EOperation including = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEOperation();
				including.setName("including");
				operationCallExp.setReferredOperation(including);
				operationCallExp.getArgument().add(variable);
				operationCallExp.setType(OCLStandardLibraryImpl.INSTANCE.getCollection());
				operationCallExp.setSource(copySelect);
				copyforIf.setSource(operationCallExp);
				IfExp ifExp = oclFactory.createIfExp();
				ifExp.setCondition(selectBody);
				ifExp.setThenExpression(copyforIf);
				ifExp.setElseExpression(copyforIf2);
				ifExp.setType(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEString());
				oclExpression.setBodyExpression(ifExp);
				
			


			}
	
		bodyExp.accept(lookupPropertyVisitor);
		Set<PropertyCallExp<EClassifier, EStructuralFeature>> resultProperty = lookupPropertyVisitor
				.getResult();
		
		for(PropertyCallExp<EClassifier, EStructuralFeature> item : resultProperty){
			if(item.getSource() instanceof VariableExp && ((VariableExp)item.getSource()).getReferredVariable().getName().equals(variableName)){
			IntegerLiteralExp integer =	oclFactory.createIntegerLiteralExp();
			integer.setIntegerSymbol(0);
			EObject temp =  item.eContainer();
		if (temp instanceof OperationCallExp){
			((OperationCallExp)temp).setSource(integer);
		}
			}
		}
		
		Set<OperationCallExp<EClassifier, EOperation>> resultSize = lookupSizeVisitor.getResult();
		bodyExp.accept(lookupSizeVisitor);
		for(OperationCallExp item : resultSize){
			if(item.getSource() instanceof OperationCallExp && ((VariableExp)((OperationCallExp)item.getSource()).getArgument().get(0)).getName().equals(variableName)){
				
				OperationCallExp including = (OperationCallExp) item.getSource();
				OCLExpression source  = (OCLExpression)including.getSource();
				OCLExpression container = (OCLExpression) item.eContainer();
				item.setSource(source);
				OperationCallExp plusOperation = oclFactory.createOperationCallExp();
				EOperation plus = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEOperation();
				plus.setName("+");
				plusOperation.setReferredOperation(plus);
				IntegerLiteralExp integer =	oclFactory.createIntegerLiteralExp();
				integer.setIntegerSymbol(1);
				plusOperation.getArgument().add(integer);
				plusOperation.setType(OCLStandardLibraryImpl.INSTANCE.getInteger());
				plusOperation.setSource(item);
		
				if(container instanceof OperationCallExp )
					((OperationCallExp)container).setSource(plusOperation);
			}
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
