/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.ViewComponent;
import IFML.Core.ViewComponentPart;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ViewComponentImpl#getViewComponentParts <em>View Component Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewComponentImpl extends ViewElementImpl implements ViewComponent {
	/**
	 * The cached value of the '{@link #getViewComponentParts() <em>View Component Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewComponentParts()
	 * @generated
	 * @ordered
	 */
	protected EList viewComponentParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.VIEW_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getViewComponentParts() {
		if (viewComponentParts == null) {
			viewComponentParts = new EObjectContainmentEList(ViewComponentPart.class, this, CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS);
		}
		return viewComponentParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS:
				return ((InternalEList)getViewComponentParts()).basicRemove(otherEnd, msgs);
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
			case CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS:
				return getViewComponentParts();
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
			case CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS:
				getViewComponentParts().clear();
				getViewComponentParts().addAll((Collection)newValue);
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
			case CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS:
				getViewComponentParts().clear();
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
			case CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS:
				return viewComponentParts != null && !viewComponentParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewComponentImpl
