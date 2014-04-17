/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.IFMLAction;
import IFML.Core.ViewContainer;
import IFML.Core.ViewElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ViewContainerImpl#isIsLandmark <em>Is Landmark</em>}</li>
 *   <li>{@link IFML.Core.impl.ViewContainerImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link IFML.Core.impl.ViewContainerImpl#isIsXOR <em>Is XOR</em>}</li>
 *   <li>{@link IFML.Core.impl.ViewContainerImpl#getViewElements <em>View Elements</em>}</li>
 *   <li>{@link IFML.Core.impl.ViewContainerImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewContainerImpl extends ViewElementImpl implements ViewContainer {
	/**
	 * The default value of the '{@link #isIsLandmark() <em>Is Landmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLandmark()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LANDMARK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLandmark() <em>Is Landmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLandmark()
	 * @generated
	 * @ordered
	 */
	protected boolean isLandmark = IS_LANDMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsXOR() <em>Is XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsXOR()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_XOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsXOR() <em>Is XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsXOR()
	 * @generated
	 * @ordered
	 */
	protected boolean isXOR = IS_XOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewElements() <em>View Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewElements()
	 * @generated
	 * @ordered
	 */
	protected EList viewElements;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.VIEW_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLandmark() {
		return isLandmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLandmark(boolean newIsLandmark) {
		boolean oldIsLandmark = isLandmark;
		isLandmark = newIsLandmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIEW_CONTAINER__IS_LANDMARK, oldIsLandmark, isLandmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(boolean newIsDefault) {
		boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIEW_CONTAINER__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsXOR() {
		return isXOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsXOR(boolean newIsXOR) {
		boolean oldIsXOR = isXOR;
		isXOR = newIsXOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIEW_CONTAINER__IS_XOR, oldIsXOR, isXOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getViewElements() {
		if (viewElements == null) {
			viewElements = new EObjectContainmentWithInverseEList(ViewElement.class, this, CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS, CorePackage.VIEW_ELEMENT__VIEW_CONTAINER);
		}
		return viewElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList(IFMLAction.class, this, CorePackage.VIEW_CONTAINER__ACTIONS, CorePackage.IFML_ACTION__VIEW_CONTAINER);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
				return ((InternalEList)getViewElements()).basicAdd(otherEnd, msgs);
			case CorePackage.VIEW_CONTAINER__ACTIONS:
				return ((InternalEList)getActions()).basicAdd(otherEnd, msgs);
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
			case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
				return ((InternalEList)getViewElements()).basicRemove(otherEnd, msgs);
			case CorePackage.VIEW_CONTAINER__ACTIONS:
				return ((InternalEList)getActions()).basicRemove(otherEnd, msgs);
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
			case CorePackage.VIEW_CONTAINER__IS_LANDMARK:
				return isIsLandmark() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.VIEW_CONTAINER__IS_DEFAULT:
				return isIsDefault() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.VIEW_CONTAINER__IS_XOR:
				return isIsXOR() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
				return getViewElements();
			case CorePackage.VIEW_CONTAINER__ACTIONS:
				return getActions();
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
			case CorePackage.VIEW_CONTAINER__IS_LANDMARK:
				setIsLandmark(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.VIEW_CONTAINER__IS_DEFAULT:
				setIsDefault(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.VIEW_CONTAINER__IS_XOR:
				setIsXOR(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
				getViewElements().clear();
				getViewElements().addAll((Collection)newValue);
				return;
			case CorePackage.VIEW_CONTAINER__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection)newValue);
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
			case CorePackage.VIEW_CONTAINER__IS_LANDMARK:
				setIsLandmark(IS_LANDMARK_EDEFAULT);
				return;
			case CorePackage.VIEW_CONTAINER__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case CorePackage.VIEW_CONTAINER__IS_XOR:
				setIsXOR(IS_XOR_EDEFAULT);
				return;
			case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
				getViewElements().clear();
				return;
			case CorePackage.VIEW_CONTAINER__ACTIONS:
				getActions().clear();
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
			case CorePackage.VIEW_CONTAINER__IS_LANDMARK:
				return isLandmark != IS_LANDMARK_EDEFAULT;
			case CorePackage.VIEW_CONTAINER__IS_DEFAULT:
				return isDefault != IS_DEFAULT_EDEFAULT;
			case CorePackage.VIEW_CONTAINER__IS_XOR:
				return isXOR != IS_XOR_EDEFAULT;
			case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
				return viewElements != null && !viewElements.isEmpty();
			case CorePackage.VIEW_CONTAINER__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		result.append(" (isLandmark: ");
		result.append(isLandmark);
		result.append(", isDefault: ");
		result.append(isDefault);
		result.append(", isXOR: ");
		result.append(isXOR);
		result.append(')');
		return result.toString();
	}

} //ViewContainerImpl
