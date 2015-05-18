/**
 */
package bank.impl;

import bank.Account;
import bank.BankPackage;
import bank.Card;
import bank.Client;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bank.impl.AccountImpl#getOwners <em>Owners</em>}</li>
 *   <li>{@link bank.impl.AccountImpl#getCredit <em>Credit</em>}</li>
 *   <li>{@link bank.impl.AccountImpl#getOverdraft <em>Overdraft</em>}</li>
 *   <li>{@link bank.impl.AccountImpl#getCards <em>Cards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
	/**
	 * The cached value of the '{@link #getOwners() <em>Owners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwners()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> owners;

	/**
	 * The default value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected double credit = CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverdraft() <em>Overdraft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverdraft()
	 * @generated
	 * @ordered
	 */
	protected static final double OVERDRAFT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOverdraft() <em>Overdraft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverdraft()
	 * @generated
	 * @ordered
	 */
	protected double overdraft = OVERDRAFT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCards() <em>Cards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCards()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> cards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getOwners() {
		if (owners == null) {
			owners = new EObjectWithInverseResolvingEList.ManyInverse<Client>(Client.class, this, BankPackage.ACCOUNT__OWNERS, BankPackage.CLIENT__ACCOUNTS);
		}
		return owners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCredit() {
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredit(double newCredit) {
		double oldCredit = credit;
		credit = newCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.ACCOUNT__CREDIT, oldCredit, credit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverdraft() {
		return overdraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverdraft(double newOverdraft) {
		double oldOverdraft = overdraft;
		overdraft = newOverdraft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.ACCOUNT__OVERDRAFT, oldOverdraft, overdraft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getCards() {
		if (cards == null) {
			cards = new EObjectResolvingEList<Card>(Card.class, this, BankPackage.ACCOUNT__CARDS);
		}
		return cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.ACCOUNT__OWNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwners()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.ACCOUNT__OWNERS:
				return ((InternalEList<?>)getOwners()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.ACCOUNT__OWNERS:
				return getOwners();
			case BankPackage.ACCOUNT__CREDIT:
				return getCredit();
			case BankPackage.ACCOUNT__OVERDRAFT:
				return getOverdraft();
			case BankPackage.ACCOUNT__CARDS:
				return getCards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankPackage.ACCOUNT__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends Client>)newValue);
				return;
			case BankPackage.ACCOUNT__CREDIT:
				setCredit((Double)newValue);
				return;
			case BankPackage.ACCOUNT__OVERDRAFT:
				setOverdraft((Double)newValue);
				return;
			case BankPackage.ACCOUNT__CARDS:
				getCards().clear();
				getCards().addAll((Collection<? extends Card>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BankPackage.ACCOUNT__OWNERS:
				getOwners().clear();
				return;
			case BankPackage.ACCOUNT__CREDIT:
				setCredit(CREDIT_EDEFAULT);
				return;
			case BankPackage.ACCOUNT__OVERDRAFT:
				setOverdraft(OVERDRAFT_EDEFAULT);
				return;
			case BankPackage.ACCOUNT__CARDS:
				getCards().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BankPackage.ACCOUNT__OWNERS:
				return owners != null && !owners.isEmpty();
			case BankPackage.ACCOUNT__CREDIT:
				return credit != CREDIT_EDEFAULT;
			case BankPackage.ACCOUNT__OVERDRAFT:
				return overdraft != OVERDRAFT_EDEFAULT;
			case BankPackage.ACCOUNT__CARDS:
				return cards != null && !cards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (credit: ");
		result.append(credit);
		result.append(", overdraft: ");
		result.append(overdraft);
		result.append(')');
		return result.toString();
	}

} //AccountImpl
