/**
 */
package bank.impl;

import bank.Account;
import bank.BankPackage;
import bank.Client;
import bank.Manager;

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
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bank.impl.ClientImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link bank.impl.ClientImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link bank.impl.ClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link bank.impl.ClientImpl#getSponsorships <em>Sponsorships</em>}</li>
 *   <li>{@link bank.impl.ClientImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClientImpl extends MinimalEObjectImpl.Container implements Client {
	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected EList<Manager> manager;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSponsorships() <em>Sponsorships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSponsorships()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> sponsorships;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manager> getManager() {
		if (manager == null) {
			manager = new EObjectWithInverseResolvingEList.ManyInverse<Manager>(Manager.class, this, BankPackage.CLIENT__MANAGER, BankPackage.MANAGER__CLIENTS);
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectWithInverseResolvingEList.ManyInverse<Account>(Account.class, this, BankPackage.CLIENT__ACCOUNTS, BankPackage.ACCOUNT__OWNERS);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.CLIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getSponsorships() {
		if (sponsorships == null) {
			sponsorships = new EObjectResolvingEList<Client>(Client.class, this, BankPackage.CLIENT__SPONSORSHIPS);
		}
		return sponsorships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankPackage.CLIENT__CAPACITY, oldCapacity, capacity));
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
			case BankPackage.CLIENT__MANAGER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManager()).basicAdd(otherEnd, msgs);
			case BankPackage.CLIENT__ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccounts()).basicAdd(otherEnd, msgs);
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
			case BankPackage.CLIENT__MANAGER:
				return ((InternalEList<?>)getManager()).basicRemove(otherEnd, msgs);
			case BankPackage.CLIENT__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
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
			case BankPackage.CLIENT__MANAGER:
				return getManager();
			case BankPackage.CLIENT__ACCOUNTS:
				return getAccounts();
			case BankPackage.CLIENT__NAME:
				return getName();
			case BankPackage.CLIENT__SPONSORSHIPS:
				return getSponsorships();
			case BankPackage.CLIENT__CAPACITY:
				return getCapacity();
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
			case BankPackage.CLIENT__MANAGER:
				getManager().clear();
				getManager().addAll((Collection<? extends Manager>)newValue);
				return;
			case BankPackage.CLIENT__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
				return;
			case BankPackage.CLIENT__NAME:
				setName((String)newValue);
				return;
			case BankPackage.CLIENT__SPONSORSHIPS:
				getSponsorships().clear();
				getSponsorships().addAll((Collection<? extends Client>)newValue);
				return;
			case BankPackage.CLIENT__CAPACITY:
				setCapacity((Integer)newValue);
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
			case BankPackage.CLIENT__MANAGER:
				getManager().clear();
				return;
			case BankPackage.CLIENT__ACCOUNTS:
				getAccounts().clear();
				return;
			case BankPackage.CLIENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BankPackage.CLIENT__SPONSORSHIPS:
				getSponsorships().clear();
				return;
			case BankPackage.CLIENT__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
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
			case BankPackage.CLIENT__MANAGER:
				return manager != null && !manager.isEmpty();
			case BankPackage.CLIENT__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
			case BankPackage.CLIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BankPackage.CLIENT__SPONSORSHIPS:
				return sponsorships != null && !sponsorships.isEmpty();
			case BankPackage.CLIENT__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
