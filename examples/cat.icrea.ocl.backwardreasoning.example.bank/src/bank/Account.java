/**
 */
package bank;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bank.Account#getOwners <em>Owners</em>}</li>
 *   <li>{@link bank.Account#getCredit <em>Credit</em>}</li>
 *   <li>{@link bank.Account#getOverdraft <em>Overdraft</em>}</li>
 *   <li>{@link bank.Account#getCards <em>Cards</em>}</li>
 * </ul>
 * </p>
 *
 * @see bank.BankPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Owners</b></em>' reference list.
	 * The list contents are of type {@link bank.Client}.
	 * It is bidirectional and its opposite is '{@link bank.Client#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owners</em>' reference list.
	 * @see bank.BankPackage#getAccount_Owners()
	 * @see bank.Client#getAccounts
	 * @model opposite="accounts"
	 * @generated
	 */
	EList<Client> getOwners();

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(double)
	 * @see bank.BankPackage#getAccount_Credit()
	 * @model
	 * @generated
	 */
	double getCredit();

	/**
	 * Sets the value of the '{@link bank.Account#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(double value);

	/**
	 * Returns the value of the '<em><b>Overdraft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overdraft</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overdraft</em>' attribute.
	 * @see #setOverdraft(double)
	 * @see bank.BankPackage#getAccount_Overdraft()
	 * @model
	 * @generated
	 */
	double getOverdraft();

	/**
	 * Sets the value of the '{@link bank.Account#getOverdraft <em>Overdraft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overdraft</em>' attribute.
	 * @see #getOverdraft()
	 * @generated
	 */
	void setOverdraft(double value);

	/**
	 * Returns the value of the '<em><b>Cards</b></em>' reference list.
	 * The list contents are of type {@link bank.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' reference list.
	 * @see bank.BankPackage#getAccount_Cards()
	 * @model
	 * @generated
	 */
	EList<Card> getCards();

} // Account
