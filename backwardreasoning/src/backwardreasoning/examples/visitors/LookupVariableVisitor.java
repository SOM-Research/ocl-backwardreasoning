
package backwardreasoning.examples.visitors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.utilities.AbstractVisitor;


public class LookupVariableVisitor extends AbstractVisitor<Variable<EClassifier, EParameter>, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint> {
	private EClass eClass;
	
	
	public LookupVariableVisitor(EClass eClass) {
		super();
		this.eClass = eClass;
	}

	public  Variable<EClassifier, EParameter> visitVariableExp(VariableExp<EClassifier, EParameter> v) {
		Variable<EClassifier, EParameter> referredVar = v.getReferredVariable();
		
		if(referredVar.getType() instanceof EClass)
		{
			result = referredVar;
		}
		return result;
		
	}
	
	/**
	 * If the "self" variable was referenced, this method return the declaration of the variable, 
	 * otherwise the method return null.
	 */
	public Variable<EClassifier, EParameter> getResult() {
		return result;
	}
}