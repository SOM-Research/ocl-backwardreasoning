
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
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.utilities.AbstractVisitor;


public class LookupSelectVisitor extends AbstractVisitor<Set<IteratorExp<EClassifier, EParameter>>, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint> {

	public LookupSelectVisitor() {
		super();
		result = new HashSet<IteratorExp<EClassifier, EParameter>>();
	}
	
	@Override
	public Set<IteratorExp<EClassifier, EParameter>> visitIteratorExp(IteratorExp<EClassifier, EParameter> iteratorExp) {
		if(iteratorExp.getName().equals("select"))
			result.add(iteratorExp);
		return super.visitIteratorExp(iteratorExp);
		
	}
	
	
	public Set<IteratorExp<EClassifier, EParameter>> getResult() {
		return result;
	}
}