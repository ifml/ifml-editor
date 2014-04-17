/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.ModularizationElement;
import IFML.Core.ModulePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modularization Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ModularizationElementImpl#getModulePackage <em>Module Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModularizationElementImpl extends NamedElementImpl implements ModularizationElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModularizationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.MODULARIZATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulePackage getModulePackage() {
		if (eContainerFeatureID() != CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE) return null;
		return (ModulePackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModulePackage(ModulePackage newModulePackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModulePackage, CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulePackage(ModulePackage newModulePackage) {
		if (newModulePackage != eInternalContainer() || (eContainerFeatureID() != CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE && newModulePackage != null)) {
			if (EcoreUtil.isAncestor(this, newModulePackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModulePackage != null)
				msgs = ((InternalEObject)newModulePackage).eInverseAdd(this, CorePackage.MODULE_PACKAGE__MODULARIZATION_ELEMENTS, ModulePackage.class, msgs);
			msgs = basicSetModulePackage(newModulePackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE, newModulePackage, newModulePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModulePackage((ModulePackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE:
				return basicSetModulePackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE:
				return eInternalContainer().eInverseRemove(this, CorePackage.MODULE_PACKAGE__MODULARIZATION_ELEMENTS, ModulePackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE:
				return getModulePackage();
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
			case CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE:
				setModulePackage((ModulePackage)newValue);
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
			case CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE:
				setModulePackage((ModulePackage)null);
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
			case CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE:
				return getModulePackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModularizationElementImpl
