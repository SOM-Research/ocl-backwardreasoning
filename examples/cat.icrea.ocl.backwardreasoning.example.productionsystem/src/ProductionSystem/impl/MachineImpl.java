/**
 */
package ProductionSystem.impl;

import ProductionSystem.Conveyor;
import ProductionSystem.Machine;
import ProductionSystem.ProductionSystemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProductionSystem.impl.MachineImpl#getIc <em>Ic</em>}</li>
 *   <li>{@link ProductionSystem.impl.MachineImpl#getOc <em>Oc</em>}</li>
 *   <li>{@link ProductionSystem.impl.MachineImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends MinimalEObjectImpl.Container implements Machine {
	/**
	 * The cached value of the '{@link #getIc() <em>Ic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIc()
	 * @generated
	 * @ordered
	 */
	protected EList<Conveyor> ic;

	/**
	 * The cached value of the '{@link #getOc() <em>Oc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOc()
	 * @generated
	 * @ordered
	 */
	protected EList<Conveyor> oc;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionSystemPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conveyor> getIc() {
		if (ic == null) {
			ic = new EObjectContainmentWithInverseEList<Conveyor>(Conveyor.class, this, ProductionSystemPackage.MACHINE__IC, ProductionSystemPackage.CONVEYOR__OM);
		}
		return ic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conveyor> getOc() {
		if (oc == null) {
			oc = new EObjectContainmentWithInverseEList<Conveyor>(Conveyor.class, this, ProductionSystemPackage.MACHINE__OC, ProductionSystemPackage.CONVEYOR__IM);
		}
		return oc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionSystemPackage.MACHINE__ID, oldId, id));
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
			case ProductionSystemPackage.MACHINE__IC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIc()).basicAdd(otherEnd, msgs);
			case ProductionSystemPackage.MACHINE__OC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOc()).basicAdd(otherEnd, msgs);
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
			case ProductionSystemPackage.MACHINE__IC:
				return ((InternalEList<?>)getIc()).basicRemove(otherEnd, msgs);
			case ProductionSystemPackage.MACHINE__OC:
				return ((InternalEList<?>)getOc()).basicRemove(otherEnd, msgs);
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
			case ProductionSystemPackage.MACHINE__IC:
				return getIc();
			case ProductionSystemPackage.MACHINE__OC:
				return getOc();
			case ProductionSystemPackage.MACHINE__ID:
				return getId();
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
			case ProductionSystemPackage.MACHINE__IC:
				getIc().clear();
				getIc().addAll((Collection<? extends Conveyor>)newValue);
				return;
			case ProductionSystemPackage.MACHINE__OC:
				getOc().clear();
				getOc().addAll((Collection<? extends Conveyor>)newValue);
				return;
			case ProductionSystemPackage.MACHINE__ID:
				setId((String)newValue);
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
			case ProductionSystemPackage.MACHINE__IC:
				getIc().clear();
				return;
			case ProductionSystemPackage.MACHINE__OC:
				getOc().clear();
				return;
			case ProductionSystemPackage.MACHINE__ID:
				setId(ID_EDEFAULT);
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
			case ProductionSystemPackage.MACHINE__IC:
				return ic != null && !ic.isEmpty();
			case ProductionSystemPackage.MACHINE__OC:
				return oc != null && !oc.isEmpty();
			case ProductionSystemPackage.MACHINE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MachineImpl
