/**
 */
package bank.impl;

import bank.Account;
import bank.Bank;
import bank.BankPackage;
import bank.Client;
import bank.Manager;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bank.impl.BankImpl#getManagers <em>Managers</em>}</li>
 *   <li>{@link bank.impl.BankImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link bank.impl.BankImpl#getClients <em>Clients</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BankImpl extends MinimalEObjectImpl.Container implements Bank {
	/**
	 * The cached value of the '{@link #getManagers() <em>Managers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagers()
	 * @generated
	 * @ordered
	 */
	protected EList<Manager> managers;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;

	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> clients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manager> getManagers() {
		if (managers == null) {
			managers = new EObjectContainmentEList<Manager>(Manager.class, this, BankPackage.BANK__MANAGERS);
		}
		return managers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentEList<Account>(Account.class, this, BankPackage.BANK__ACCOUNTS);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClients() {
		if (clients == null) {
			clients = new EObjectContainmentEList<Client>(Client.class, this, BankPackage.BANK__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.BANK__MANAGERS:
				return ((InternalEList<?>)getManagers()).basicRemove(otherEnd, msgs);
			case BankPackage.BANK__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case BankPackage.BANK__CLIENTS:
				return ((InternalEList<?>)getClients()).basicRemove(otherEnd, msgs);
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
			case BankPackage.BANK__MANAGERS:
				return getManagers();
			case BankPackage.BANK__ACCOUNTS:
				return getAccounts();
			case BankPackage.BANK__CLIENTS:
				return getClients();
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
			case BankPackage.BANK__MANAGERS:
				getManagers().clear();
				getManagers().addAll((Collection<? extends Manager>)newValue);
				return;
			case BankPackage.BANK__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
				return;
			case BankPackage.BANK__CLIENTS:
				getClients().clear();
				getClients().addAll((Collection<? extends Client>)newValue);
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
			case BankPackage.BANK__MANAGERS:
				getManagers().clear();
				return;
			case BankPackage.BANK__ACCOUNTS:
				getAccounts().clear();
				return;
			case BankPackage.BANK__CLIENTS:
				getClients().clear();
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
			case BankPackage.BANK__MANAGERS:
				return managers != null && !managers.isEmpty();
			case BankPackage.BANK__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
			case BankPackage.BANK__CLIENTS:
				return clients != null && !clients.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BankImpl
