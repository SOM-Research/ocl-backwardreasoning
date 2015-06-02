/**
 */
package ProductionSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProductionSystem.Conveyor#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ProductionSystem.Conveyor#getPiece <em>Piece</em>}</li>
 *   <li>{@link ProductionSystem.Conveyor#getNext <em>Next</em>}</li>
 *   <li>{@link ProductionSystem.Conveyor#getPrev <em>Prev</em>}</li>
 *   <li>{@link ProductionSystem.Conveyor#getIm <em>Im</em>}</li>
 *   <li>{@link ProductionSystem.Conveyor#getOm <em>Om</em>}</li>
 *   <li>{@link ProductionSystem.Conveyor#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProductionSystem.ProductionSystemPackage#getConveyor()
 * @model
 * @generated
 */
public interface Conveyor extends EObject {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see ProductionSystem.ProductionSystemPackage#getConveyor_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link ProductionSystem.Conveyor#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Piece</b></em>' containment reference list.
	 * The list contents are of type {@link ProductionSystem.Piece}.
	 * It is bidirectional and its opposite is '{@link ProductionSystem.Piece#getConveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piece</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece</em>' containment reference list.
	 * @see ProductionSystem.ProductionSystemPackage#getConveyor_Piece()
	 * @see ProductionSystem.Piece#getConveyor
	 * @model opposite="conveyor" containment="true"
	 * @generated
	 */
	EList<Piece> getPiece();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link ProductionSystem.Conveyor}.
	 * It is bidirectional and its opposite is '{@link ProductionSystem.Conveyor#getPrev <em>Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see ProductionSystem.ProductionSystemPackage#getConveyor_Next()
	 * @see ProductionSystem.Conveyor#getPrev
	 * @model opposite="prev"
	 * @generated
	 */
	EList<Conveyor> getNext();

	/**
	 * Returns the value of the '<em><b>Prev</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ProductionSystem.Conveyor#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev</em>' reference.
	 * @see #setPrev(Conveyor)
	 * @see ProductionSystem.ProductionSystemPackage#getConveyor_Prev()
	 * @see ProductionSystem.Conveyor#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Conveyor getPrev();

	/**
	 * Sets the value of the '{@link ProductionSystem.Conveyor#getPrev <em>Prev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev</em>' reference.
	 * @see #getPrev()
	 * @generated
	 */
	void setPrev(Conveyor value);

	/**
	 * Returns the value of the '<em><b>Im</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ProductionSystem.Machine#getOc <em>Oc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Im</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Im</em>' container reference.
	 * @see #setIm(Machine)
	 * @see ProductionSystem.ProductionSystemPackage#getConveyor_Im()
	 * @see ProductionSystem.Machine#getOc
	 * @model opposite="oc" transient="false"
	 * @generated
	 */
	Machine getIm();

	/**
	 * Sets the value of the '{@link ProductionSystem.Conveyor#getIm <em>Im</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Im</em>' container reference.
	 * @see #getIm()
	 * @generated
	 */
	void setIm(Machine value);

	/**
	 * Returns the value of the '<em><b>Om</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ProductionSystem.Machine#getIc <em>Ic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Om</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Om</em>' container reference.
	 * @see #setOm(Machine)
	 * @see ProductionSystem.ProductionSystemPackage#getConveyor_Om()
	 * @see ProductionSystem.Machine#getIc
	 * @model opposite="ic" transient="false"
	 * @generated
	 */
	Machine getOm();

	/**
	 * Sets the value of the '{@link ProductionSystem.Conveyor#getOm <em>Om</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Om</em>' container reference.
	 * @see #getOm()
	 * @generated
	 */
	void setOm(Machine value);

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
	 * @see ProductionSystem.ProductionSystemPackage#getConveyor_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ProductionSystem.Conveyor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Conveyor
