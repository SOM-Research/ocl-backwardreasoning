package cat.icrea.ocl.backwardreasoning.visitors;

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
import org.eclipse.ocl.expressions.AssociationClassCallExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.utilities.AbstractVisitor;


public class LookupAssociationVisitor extends AbstractVisitor<AssociationClassCallExp<EClassifier, EStructuralFeature>, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint> {
	
	
	@Override
	public AssociationClassCallExp<EClassifier, EStructuralFeature> visitAssociationClassCallExp(AssociationClassCallExp<EClassifier, EStructuralFeature> callExp){
		result = callExp;
		return result;
		
	}
	@Override
	public AssociationClassCallExp<EClassifier, EStructuralFeature> handleAssociationClassCallExp(AssociationClassCallExp<EClassifier, EStructuralFeature> callExp,  AssociationClassCallExp<EClassifier, EStructuralFeature> sourceResult, java.util.List<AssociationClassCallExp<EClassifier, EStructuralFeature>> qualifierResults){
		result = callExp;
		return result;
		
	}
	/**
	 * If the "self" variable was referenced, this method return the declaration of the variable, 
	 * otherwise the method return null.
	 */
	public AssociationClassCallExp<EClassifier, EStructuralFeature> getResult() {
		return result;
	}
}