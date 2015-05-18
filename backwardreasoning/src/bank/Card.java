/**
 */
package bank;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bank.Card#getNumber <em>Number</em>}</li>
 *   <li>{@link bank.Card#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bank.BankPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see bank.BankPackage#getCard_Number()
	 * @model
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link bank.Card#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bank.CardType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bank.CardType
	 * @see #setType(CardType)
	 * @see bank.BankPackage#getCard_Type()
	 * @model
	 * @generated
	 */
	CardType getType();

	/**
	 * Sets the value of the '{@link bank.Card#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bank.CardType
	 * @see #getType()
	 * @generated
	 */
	void setType(CardType value);

} // Card
