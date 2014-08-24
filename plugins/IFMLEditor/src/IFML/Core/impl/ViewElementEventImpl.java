/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.ViewElement;
import IFML.Core.ViewElementEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Element Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ViewElementEventImpl#getViewElement <em>View Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewElementEventImpl extends CatchingEventImpl implements ViewElementEvent {
	/**
	 * The cached value of the '{@link #getViewElement() <em>View Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewElement()
	 * @generated
	 * @ordered
	 */
	protected ViewElement viewElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewElementEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VIEW_ELEMENT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElement getViewElement() {
		if (viewElement != null && viewElement.eIsProxy()) {
			InternalEObject oldViewElement = (InternalEObject)viewElement;
			viewElement = (ViewElement)eResolveProxy(oldViewElement);
			if (viewElement != oldViewElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT, oldViewElement, viewElement));
			}
		}
		return viewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElement basicGetViewElement() {
		return viewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewElement(ViewElement newViewElement) {
		ViewElement oldViewElement = viewElement;
		viewElement = newViewElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT, oldViewElement, viewElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT:
				if (resolve) return getViewElement();
				return basicGetViewElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT:
				setViewElement((ViewElement)newValue);
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
			case CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT:
				setViewElement((ViewElement)null);
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
			case CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT:
				return viewElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewElementEventImpl
