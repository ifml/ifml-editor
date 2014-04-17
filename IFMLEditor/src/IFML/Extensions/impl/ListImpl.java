/**
 */
package IFML.Extensions.impl;

import IFML.Core.impl.ViewComponentImpl;

import IFML.Extensions.ExtensionsPackage;
import IFML.Extensions.List;
import IFML.Extensions.OnSelectEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Extensions.impl.ListImpl#getSelectEvent <em>Select Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends ViewComponentImpl implements List {
	/**
	 * The cached value of the '{@link #getSelectEvent() <em>Select Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectEvent()
	 * @generated
	 * @ordered
	 */
	protected EList selectEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSelectEvent() {
		if (selectEvent == null) {
			selectEvent = new EObjectContainmentEList(OnSelectEvent.class, this, ExtensionsPackage.LIST__SELECT_EVENT);
		}
		return selectEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionsPackage.LIST__SELECT_EVENT:
				return ((InternalEList)getSelectEvent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.LIST__SELECT_EVENT:
				return getSelectEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionsPackage.LIST__SELECT_EVENT:
				getSelectEvent().clear();
				getSelectEvent().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExtensionsPackage.LIST__SELECT_EVENT:
				getSelectEvent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtensionsPackage.LIST__SELECT_EVENT:
				return selectEvent != null && !selectEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
