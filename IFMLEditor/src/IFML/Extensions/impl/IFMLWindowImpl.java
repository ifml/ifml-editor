/**
 */
package IFML.Extensions.impl;

import IFML.Core.impl.ViewContainerImpl;

import IFML.Extensions.ExtensionsPackage;
import IFML.Extensions.IFMLWindow;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFML Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Extensions.impl.IFMLWindowImpl#isIsModal <em>Is Modal</em>}</li>
 *   <li>{@link IFML.Extensions.impl.IFMLWindowImpl#isIsNewWindow <em>Is New Window</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFMLWindowImpl extends ViewContainerImpl implements IFMLWindow {
	/**
	 * The default value of the '{@link #isIsModal() <em>Is Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsModal() <em>Is Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModal()
	 * @generated
	 * @ordered
	 */
	protected boolean isModal = IS_MODAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNewWindow() <em>Is New Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNewWindow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NEW_WINDOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNewWindow() <em>Is New Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNewWindow()
	 * @generated
	 * @ordered
	 */
	protected boolean isNewWindow = IS_NEW_WINDOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLWindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.IFML_WINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsModal() {
		return isModal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModal(boolean newIsModal) {
		boolean oldIsModal = isModal;
		isModal = newIsModal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.IFML_WINDOW__IS_MODAL, oldIsModal, isModal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNewWindow() {
		return isNewWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNewWindow(boolean newIsNewWindow) {
		boolean oldIsNewWindow = isNewWindow;
		isNewWindow = newIsNewWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.IFML_WINDOW__IS_NEW_WINDOW, oldIsNewWindow, isNewWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.IFML_WINDOW__IS_MODAL:
				return isIsModal() ? Boolean.TRUE : Boolean.FALSE;
			case ExtensionsPackage.IFML_WINDOW__IS_NEW_WINDOW:
				return isIsNewWindow() ? Boolean.TRUE : Boolean.FALSE;
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
			case ExtensionsPackage.IFML_WINDOW__IS_MODAL:
				setIsModal(((Boolean)newValue).booleanValue());
				return;
			case ExtensionsPackage.IFML_WINDOW__IS_NEW_WINDOW:
				setIsNewWindow(((Boolean)newValue).booleanValue());
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
			case ExtensionsPackage.IFML_WINDOW__IS_MODAL:
				setIsModal(IS_MODAL_EDEFAULT);
				return;
			case ExtensionsPackage.IFML_WINDOW__IS_NEW_WINDOW:
				setIsNewWindow(IS_NEW_WINDOW_EDEFAULT);
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
			case ExtensionsPackage.IFML_WINDOW__IS_MODAL:
				return isModal != IS_MODAL_EDEFAULT;
			case ExtensionsPackage.IFML_WINDOW__IS_NEW_WINDOW:
				return isNewWindow != IS_NEW_WINDOW_EDEFAULT;
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
		result.append(" (isModal: ");
		result.append(isModal);
		result.append(", isNewWindow: ");
		result.append(isNewWindow);
		result.append(')');
		return result.toString();
	}

} //IFMLWindowImpl
