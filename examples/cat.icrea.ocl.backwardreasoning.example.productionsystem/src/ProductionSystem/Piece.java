/**
 */
package ProductionSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProductionSystem.Piece#getConveyor <em>Conveyor</em>}</li>
 *   <li>{@link ProductionSystem.Piece#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProductionSystem.ProductionSystemPackage#getPiece()
 * @model abstract="true"
 * @generated
 */
public interface Piece extends EObject {
	/**
	 * Returns the value of the '<em><b>Conveyor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ProductionSystem.Conveyor#getPiece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conveyor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conveyor</em>' container reference.
	 * @see #setConveyor(Conveyor)
	 * @see ProductionSystem.ProductionSystemPackage#getPiece_Conveyor()
	 * @see ProductionSystem.Conveyor#getPiece
	 * @model opposite="piece" transient="false"
	 * @generated
	 */
	Conveyor getConveyor();

	/**
	 * Sets the value of the '{@link ProductionSystem.Piece#getConveyor <em>Conveyor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conveyor</em>' container reference.
	 * @see #getConveyor()
	 * @generated
	 */
	void setConveyor(Conveyor value);

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
	 * @see ProductionSystem.ProductionSystemPackage#getPiece_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ProductionSystem.Piece#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Piece
