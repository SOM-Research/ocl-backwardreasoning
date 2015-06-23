
package cat.icrea.ocl.backwardreasoning.visitors;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.utilities.AbstractVisitor;


public class LookupIncludingVisitor extends AbstractVisitor<Set<OperationCallExp<EClassifier, EOperation>>, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint> {

	public LookupIncludingVisitor() {
		super();
		result = new HashSet<OperationCallExp<EClassifier, EOperation>>();
	}
	
	
	@Override
	public Set<OperationCallExp<EClassifier, EOperation>> visitOperationCallExp(OperationCallExp<EClassifier, EOperation> operation){
		
		if(operation.getReferredOperation().getName().equals("including"))
		result.add(operation);
		
		return super.visitOperationCallExp(operation);
		
	}

	@Override
	public Set<OperationCallExp<EClassifier, EOperation>> handleOperationCallExp(OperationCallExp<EClassifier, EOperation> operation, Set<OperationCallExp<EClassifier, EOperation>> sourceResult, List<Set<OperationCallExp<EClassifier, EOperation>>> argumentResults){
		
		if(operation.getReferredOperation().getName().equals("including"))
		result.add(operation);
		
		return result;
	}
	
	
	public Set<OperationCallExp<EClassifier, EOperation>> getResult() {
		return result;
	}
}