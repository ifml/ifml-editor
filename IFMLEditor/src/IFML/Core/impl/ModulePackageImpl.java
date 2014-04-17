/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.ModularizationElement;
import IFML.Core.ModulePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ModulePackageImpl#getModularizationElements <em>Modularization Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModulePackageImpl extends ModularizationElementImpl implements ModulePackage {
	/**
	 * The cached value of the '{@link #getModularizationElements() <em>Modularization Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModularizationElements()
	 * @generated
	 * @ordered
	 */
	protected EList modularizationElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.MODULE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getModularizationElements() {
		if (modularizationElements == null) {
			modularizationElements = new EObjectContainmentWithInverseEList(ModularizationElement.class, this, CorePackage.MODULE_PACKAGE__MODULARIZATION_ELEMENTS, CorePackage.MODULARIZATION_ELEMENT__MODULE_PACKAGE);
		}
		return modularizationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MODULE_PACKAGE__MODULARIZATION_ELEMENTS:
				return ((InternalEList)getModularizationElements()).basicAdd(otherEnd, msgs);
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
			case CorePackage.MODULE_PACKAGE__MODULARIZATION_ELEMENTS:
				return ((InternalEList)getModularizationElements()).basicRemove(otherEnd, msgs);
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
			case CorePackage.MODULE_PACKAGE__MODULARIZATION_ELEMENTS:
				return getModularizationElements();
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
			case CorePackage.MODULE_PACKAGE__MODULARIZATION_ELEMENTS:
				getModularizationElements().clear();
				getModularizationElements().addAll((Collection)newValue);
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
			case CorePackage.MODULE_PACKAGE__MODULARIZATION_ELEMENTS:
				getModularizationElements().clear();
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
			case CorePackage.MODULE_PACKAGE__MODULARIZATION_ELEMENTS:
				return modularizationElements != null && !modularizationElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModulePackageImpl
