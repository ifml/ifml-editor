/**
 */
package IFML.Extensions.impl;

import IFML.Extensions.ExtensionsPackage;
import IFML.Extensions.SelectionField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Extensions.impl.SelectionFieldImpl#isIsMultiSelection <em>Is Multi Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionFieldImpl extends FieldImpl implements SelectionField {
	/**
	 * The default value of the '{@link #isIsMultiSelection() <em>Is Multi Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiSelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTI_SELECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultiSelection() <em>Is Multi Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiSelection()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiSelection = IS_MULTI_SELECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.SELECTION_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultiSelection() {
		return isMultiSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiSelection(boolean newIsMultiSelection) {
		boolean oldIsMultiSelection = isMultiSelection;
		isMultiSelection = newIsMultiSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.SELECTION_FIELD__IS_MULTI_SELECTION, oldIsMultiSelection, isMultiSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.SELECTION_FIELD__IS_MULTI_SELECTION:
				return isIsMultiSelection() ? Boolean.TRUE : Boolean.FALSE;
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
			case ExtensionsPackage.SELECTION_FIELD__IS_MULTI_SELECTION:
				setIsMultiSelection(((Boolean)newValue).booleanValue());
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
			case ExtensionsPackage.SELECTION_FIELD__IS_MULTI_SELECTION:
				setIsMultiSelection(IS_MULTI_SELECTION_EDEFAULT);
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
			case ExtensionsPackage.SELECTION_FIELD__IS_MULTI_SELECTION:
				return isMultiSelection != IS_MULTI_SELECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isMultiSelection: ");
		result.append(isMultiSelection);
		result.append(')');
		return result.toString();
	}

} //SelectionFieldImpl
