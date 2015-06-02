/**
 */
package ProductionSystem.impl;

import ProductionSystem.Conveyor;
import ProductionSystem.Machine;
import ProductionSystem.Piece;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProductionSystem.impl.ConveyorImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ProductionSystem.impl.ConveyorImpl#getPiece <em>Piece</em>}</li>
 *   <li>{@link ProductionSystem.impl.ConveyorImpl#getNext <em>Next</em>}</li>
 *   <li>{@link ProductionSystem.impl.ConveyorImpl#getPrev <em>Prev</em>}</li>
 *   <li>{@link ProductionSystem.impl.ConveyorImpl#getIm <em>Im</em>}</li>
 *   <li>{@link ProductionSystem.impl.ConveyorImpl#getOm <em>Om</em>}</li>
 *   <li>{@link ProductionSystem.impl.ConveyorImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConveyorImpl extends MinimalEObjectImpl.Container implements Conveyor {
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
	 * The cached value of the '{@link #getPiece() <em>Piece</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiece()
	 * @generated
	 * @ordered
	 */
	protected EList<Piece> piece;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<Conveyor> next;

	/**
	 * The cached value of the '{@link #getPrev() <em>Prev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev()
	 * @generated
	 * @ordered
	 */
	protected Conveyor prev;

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
	protected ConveyorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionSystemPackage.Literals.CONVEYOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionSystemPackage.CONVEYOR__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Piece> getPiece() {
		if (piece == null) {
			piece = new EObjectContainmentWithInverseEList<Piece>(Piece.class, this, ProductionSystemPackage.CONVEYOR__PIECE, ProductionSystemPackage.PIECE__CONVEYOR);
		}
		return piece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conveyor> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList<Conveyor>(Conveyor.class, this, ProductionSystemPackage.CONVEYOR__NEXT, ProductionSystemPackage.CONVEYOR__PREV);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor getPrev() {
		if (prev != null && prev.eIsProxy()) {
			InternalEObject oldPrev = (InternalEObject)prev;
			prev = (Conveyor)eResolveProxy(oldPrev);
			if (prev != oldPrev) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionSystemPackage.CONVEYOR__PREV, oldPrev, prev));
			}
		}
		return prev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor basicGetPrev() {
		return prev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrev(Conveyor newPrev, NotificationChain msgs) {
		Conveyor oldPrev = prev;
		prev = newPrev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionSystemPackage.CONVEYOR__PREV, oldPrev, newPrev);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrev(Conveyor newPrev) {
		if (newPrev != prev) {
			NotificationChain msgs = null;
			if (prev != null)
				msgs = ((InternalEObject)prev).eInverseRemove(this, ProductionSystemPackage.CONVEYOR__NEXT, Conveyor.class, msgs);
			if (newPrev != null)
				msgs = ((InternalEObject)newPrev).eInverseAdd(this, ProductionSystemPackage.CONVEYOR__NEXT, Conveyor.class, msgs);
			msgs = basicSetPrev(newPrev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionSystemPackage.CONVEYOR__PREV, newPrev, newPrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getIm() {
		if (eContainerFeatureID() != ProductionSystemPackage.CONVEYOR__IM) return null;
		return (Machine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIm(Machine newIm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIm, ProductionSystemPackage.CONVEYOR__IM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIm(Machine newIm) {
		if (newIm != eInternalContainer() || (eContainerFeatureID() != ProductionSystemPackage.CONVEYOR__IM && newIm != null)) {
			if (EcoreUtil.isAncestor(this, newIm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIm != null)
				msgs = ((InternalEObject)newIm).eInverseAdd(this, ProductionSystemPackage.MACHINE__OC, Machine.class, msgs);
			msgs = basicSetIm(newIm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionSystemPackage.CONVEYOR__IM, newIm, newIm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getOm() {
		if (eContainerFeatureID() != ProductionSystemPackage.CONVEYOR__OM) return null;
		return (Machine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOm(Machine newOm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOm, ProductionSystemPackage.CONVEYOR__OM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOm(Machine newOm) {
		if (newOm != eInternalContainer() || (eContainerFeatureID() != ProductionSystemPackage.CONVEYOR__OM && newOm != null)) {
			if (EcoreUtil.isAncestor(this, newOm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOm != null)
				msgs = ((InternalEObject)newOm).eInverseAdd(this, ProductionSystemPackage.MACHINE__IC, Machine.class, msgs);
			msgs = basicSetOm(newOm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionSystemPackage.CONVEYOR__OM, newOm, newOm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionSystemPackage.CONVEYOR__ID, oldId, id));
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
			case ProductionSystemPackage.CONVEYOR__PIECE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPiece()).basicAdd(otherEnd, msgs);
			case ProductionSystemPackage.CONVEYOR__NEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNext()).basicAdd(otherEnd, msgs);
			case ProductionSystemPackage.CONVEYOR__PREV:
				if (prev != null)
					msgs = ((InternalEObject)prev).eInverseRemove(this, ProductionSystemPackage.CONVEYOR__NEXT, Conveyor.class, msgs);
				return basicSetPrev((Conveyor)otherEnd, msgs);
			case ProductionSystemPackage.CONVEYOR__IM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIm((Machine)otherEnd, msgs);
			case ProductionSystemPackage.CONVEYOR__OM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOm((Machine)otherEnd, msgs);
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
			case ProductionSystemPackage.CONVEYOR__PIECE:
				return ((InternalEList<?>)getPiece()).basicRemove(otherEnd, msgs);
			case ProductionSystemPackage.CONVEYOR__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
			case ProductionSystemPackage.CONVEYOR__PREV:
				return basicSetPrev(null, msgs);
			case ProductionSystemPackage.CONVEYOR__IM:
				return basicSetIm(null, msgs);
			case ProductionSystemPackage.CONVEYOR__OM:
				return basicSetOm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProductionSystemPackage.CONVEYOR__IM:
				return eInternalContainer().eInverseRemove(this, ProductionSystemPackage.MACHINE__OC, Machine.class, msgs);
			case ProductionSystemPackage.CONVEYOR__OM:
				return eInternalContainer().eInverseRemove(this, ProductionSystemPackage.MACHINE__IC, Machine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductionSystemPackage.CONVEYOR__CAPACITY:
				return getCapacity();
			case ProductionSystemPackage.CONVEYOR__PIECE:
				return getPiece();
			case ProductionSystemPackage.CONVEYOR__NEXT:
				return getNext();
			case ProductionSystemPackage.CONVEYOR__PREV:
				if (resolve) return getPrev();
				return basicGetPrev();
			case ProductionSystemPackage.CONVEYOR__IM:
				return getIm();
			case ProductionSystemPackage.CONVEYOR__OM:
				return getOm();
			case ProductionSystemPackage.CONVEYOR__ID:
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
			case ProductionSystemPackage.CONVEYOR__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case ProductionSystemPackage.CONVEYOR__PIECE:
				getPiece().clear();
				getPiece().addAll((Collection<? extends Piece>)newValue);
				return;
			case ProductionSystemPackage.CONVEYOR__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Conveyor>)newValue);
				return;
			case ProductionSystemPackage.CONVEYOR__PREV:
				setPrev((Conveyor)newValue);
				return;
			case ProductionSystemPackage.CONVEYOR__IM:
				setIm((Machine)newValue);
				return;
			case ProductionSystemPackage.CONVEYOR__OM:
				setOm((Machine)newValue);
				return;
			case ProductionSystemPackage.CONVEYOR__ID:
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
			case ProductionSystemPackage.CONVEYOR__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case ProductionSystemPackage.CONVEYOR__PIECE:
				getPiece().clear();
				return;
			case ProductionSystemPackage.CONVEYOR__NEXT:
				getNext().clear();
				return;
			case ProductionSystemPackage.CONVEYOR__PREV:
				setPrev((Conveyor)null);
				return;
			case ProductionSystemPackage.CONVEYOR__IM:
				setIm((Machine)null);
				return;
			case ProductionSystemPackage.CONVEYOR__OM:
				setOm((Machine)null);
				return;
			case ProductionSystemPackage.CONVEYOR__ID:
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
			case ProductionSystemPackage.CONVEYOR__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case ProductionSystemPackage.CONVEYOR__PIECE:
				return piece != null && !piece.isEmpty();
			case ProductionSystemPackage.CONVEYOR__NEXT:
				return next != null && !next.isEmpty();
			case ProductionSystemPackage.CONVEYOR__PREV:
				return prev != null;
			case ProductionSystemPackage.CONVEYOR__IM:
				return getIm() != null;
			case ProductionSystemPackage.CONVEYOR__OM:
				return getOm() != null;
			case ProductionSystemPackage.CONVEYOR__ID:
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ConveyorImpl
