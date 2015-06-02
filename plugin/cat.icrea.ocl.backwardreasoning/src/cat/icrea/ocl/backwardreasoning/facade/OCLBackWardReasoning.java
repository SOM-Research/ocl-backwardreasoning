package cat.icrea.ocl.backwardreasoning.facade;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;

import cat.icrea.ocl.backwardreasoning.patterns.CreateLink;
import cat.icrea.ocl.backwardreasoning.patterns.DeleteLink;
import cat.icrea.ocl.backwardreasoning.patterns.DeleteObject;
import cat.icrea.ocl.backwardreasoning.patterns.UpdateAttribute;

public class OCLBackWardReasoning {

	private CreateLink createLink;
	private DeleteLink deleteLink;
	private DeleteObject deleteObject;
	private UpdateAttribute updateAttribute;

	public Constraint createLink(Constraint constraint, EClass eClassSource,
			EClass eClassTarget, String variableNameSource,
			String variableNameTarget) throws ParserException {
		createLink = new CreateLink(constraint, eClassSource, eClassTarget,
				variableNameSource, variableNameTarget);

		createLink.insertQuantification();
		return createLink.getConstraint();
	}

	public Constraint deleteLink(Constraint constraint, EClass eClassSource,
			EClass eClassTarget, String variableNameSource,
			String variableNameTarget) throws ParserException {
		deleteLink = new DeleteLink(constraint, eClassSource, eClassTarget,
				variableNameSource, variableNameTarget);
		deleteLink.insertQuantification();
		return deleteLink.getConstraint();
	}

	public Constraint deleteObjet(Constraint constraint, EClass eClass,
			String variableName) throws ParserException {
		deleteObject = new DeleteObject(constraint, eClass, variableName);
		deleteObject.insertQuantification();
		return deleteObject.getConstraint();
	}

	public Constraint UpdateAttribute(Constraint constraint, EClass eClass,
			String eClassVariableName, EAttribute eAttribute, String newValLabel)
			throws ParserException {
		updateAttribute = new UpdateAttribute(constraint, eClass,
				eClassVariableName, eAttribute, newValLabel);
		updateAttribute.insertQuantification();
		return updateAttribute.getConstraint();
	}
}
