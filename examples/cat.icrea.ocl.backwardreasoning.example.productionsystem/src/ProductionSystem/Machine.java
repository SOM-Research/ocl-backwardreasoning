/**
 */
package ProductionSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProductionSystem.Machine#getIc <em>Ic</em>}</li>
 *   <li>{@link ProductionSystem.Machine#getOc <em>Oc</em>}</li>
 *   <li>{@link ProductionSystem.Machine#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProductionSystem.ProductionSystemPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject {
	/**
	 * Returns the value of the '<em><b>Ic</b></em>' containment reference list.
	 * The list contents are of type {@link ProductionSystem.Conveyor}.
	 * It is bidirectional and its opposite is '{@link ProductionSystem.Conveyor#getOm <em>Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ic</em>' containment reference list.
	 * @see ProductionSystem.ProductionSystemPackage#getMachine_Ic()
	 * @see ProductionSystem.Conveyor#getOm
	 * @model opposite="om" containment="true"
	 * @generated
	 */
	EList<Conveyor> getIc();

	/**
	 * Returns the value of the '<em><b>Oc</b></em>' containment reference list.
	 * The list contents are of type {@link ProductionSystem.Conveyor}.
	 * It is bidirectional and its opposite is '{@link ProductionSystem.Conveyor#getIm <em>Im</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oc</em>' containment reference list.
	 * @see ProductionSystem.ProductionSystemPackage#getMachine_Oc()
	 * @see ProductionSystem.Conveyor#getIm
	 * @model opposite="im" containment="true"
	 * @generated
	 */
	EList<Conveyor> getOc();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ProductionSystem.ProductionSystemPackage#getMachine_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ProductionSystem.Machine#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Machine
