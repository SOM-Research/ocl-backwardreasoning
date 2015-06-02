/**
 */
package bank;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bank.Client#getManager <em>Manager</em>}</li>
 *   <li>{@link bank.Client#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link bank.Client#getName <em>Name</em>}</li>
 *   <li>{@link bank.Client#getSponsorships <em>Sponsorships</em>}</li>
 *   <li>{@link bank.Client#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see bank.BankPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference list.
	 * The list contents are of type {@link bank.Manager}.
	 * It is bidirectional and its opposite is '{@link bank.Manager#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference list.
	 * @see bank.BankPackage#getClient_Manager()
	 * @see bank.Manager#getClients
	 * @model opposite="clients"
	 * @generated
	 */
	EList<Manager> getManager();

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' reference list.
	 * The list contents are of type {@link bank.Account}.
	 * It is bidirectional and its opposite is '{@link bank.Account#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' reference list.
	 * @see bank.BankPackage#getClient_Accounts()
	 * @see bank.Account#getOwners
	 * @model opposite="owners"
	 * @generated
	 */
	EList<Account> getAccounts();

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
	 * @see bank.BankPackage#getClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bank.Client#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sponsorships</b></em>' reference list.
	 * The list contents are of type {@link bank.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sponsorships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sponsorships</em>' reference list.
	 * @see bank.BankPackage#getClient_Sponsorships()
	 * @model
	 * @generated
	 */
	EList<Client> getSponsorships();

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
	 * @see bank.BankPackage#getClient_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link bank.Client#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Client
