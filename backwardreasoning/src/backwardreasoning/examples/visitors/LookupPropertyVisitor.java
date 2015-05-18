
package backwardreasoning.examples.visitors;

import java.util.HashSet;
import java.util.Set;

import javax.naming.spi.DirStateFactory.Result;

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
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.utilities.AbstractVisitor;


public class LookupPropertyVisitor extends AbstractVisitor<Set<PropertyCallExp<EClassifier,EStructuralFeature>>, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint> {

	public LookupPropertyVisitor() {
		super();
		result = new HashSet<PropertyCallExp<EClassifier,EStructuralFeature>>();
	}
	
	
	@Override
	public Set<PropertyCallExp<EClassifier,EStructuralFeature>> visitPropertyCallExp(PropertyCallExp<EClassifier,EStructuralFeature> property){
		
		result.add(property);
		
		
		return result;
		
	}

//	public  Variable<EClassifier, EParameter> visitVariableExp(VariableExp<EClassifier, EParameter> v) {
//		Variable<EClassifier, EParameter> referredVar = v.getReferredVariable();
//		
//		if(referredVar.getType() instanceof EClass)
//		{
//			result = referredVar;
//		}
//		return result;
//		
//	}
	
	/**
	 * If the "self" variable was referenced, this method return the declaration of the variable, 
	 * otherwise the method return null.
	 */
	public Set<PropertyCallExp<EClassifier,EStructuralFeature>> getResult() {
		return result;
	}
}