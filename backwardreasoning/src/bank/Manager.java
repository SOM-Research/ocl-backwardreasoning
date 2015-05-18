/**
 */
package bank;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bank.Manager#getClients <em>Clients</em>}</li>
 *   <li>{@link bank.Manager#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bank.BankPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends EObject {
	/**
	 * Returns the value of the '<em><b>Clients</b></em>' reference list.
	 * The list contents are of type {@link bank.Client}.
	 * It is bidirectional and its opposite is '{@link bank.Client#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' reference list.
	 * @see bank.BankPackage#getManager_Clients()
	 * @see bank.Client#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	EList<Client> getClients();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bank.BankPackage#getManager_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bank.Manager#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Manager
