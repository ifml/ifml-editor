/**
 */
package IFML.Core.impl;

import IFML.Core.ActionEvent;
import IFML.Core.CorePackage;
import IFML.Core.DynamicBehavior;
import IFML.Core.IFMLAction;
import IFML.Core.ViewContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFML Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.IFMLActionImpl#getActionEvents <em>Action Events</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLActionImpl#getDynamicBehavior <em>Dynamic Behavior</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLActionImpl#getViewContainer <em>View Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFMLActionImpl extends InteractionFlowElementImpl implements IFMLAction {
	/**
	 * The cached value of the '{@link #getActionEvents() <em>Action Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionEvents()
	 * @generated
	 * @ordered
	 */
	protected EList actionEvents;

	/**
	 * The cached value of the '{@link #getDynamicBehavior() <em>Dynamic Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicBehavior()
	 * @generated
	 * @ordered
	 */
	protected DynamicBehavior dynamicBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.IFML_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActionEvents() {
		if (actionEvents == null) {
			actionEvents = new EObjectContainmentEList(ActionEvent.class, this, CorePackage.IFML_ACTION__ACTION_EVENTS);
		}
		return actionEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBehavior getDynamicBehavior() {
		if (dynamicBehavior != null && dynamicBehavior.eIsProxy()) {
			InternalEObject oldDynamicBehavior = (InternalEObject)dynamicBehavior;
			dynamicBehavior = (DynamicBehavior)eResolveProxy(oldDynamicBehavior);
			if (dynamicBehavior != oldDynamicBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IFML_ACTION__DYNAMIC_BEHAVIOR, oldDynamicBehavior, dynamicBehavior));
			}
		}
		return dynamicBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBehavior basicGetDynamicBehavior() {
		return dynamicBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicBehavior(DynamicBehavior newDynamicBehavior) {
		DynamicBehavior oldDynamicBehavior = dynamicBehavior;
		dynamicBehavior = newDynamicBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_ACTION__DYNAMIC_BEHAVIOR, oldDynamicBehavior, dynamicBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer getViewContainer() {
		if (eContainerFeatureID() != CorePackage.IFML_ACTION__VIEW_CONTAINER) return null;
		return (ViewContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewContainer(ViewContainer newViewContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newViewContainer, CorePackage.IFML_ACTION__VIEW_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewContainer(ViewContainer newViewContainer) {
		if (newViewContainer != eInternalContainer() || (eContainerFeatureID() != CorePackage.IFML_ACTION__VIEW_CONTAINER && newViewContainer != null)) {
			if (EcoreUtil.isAncestor(this, newViewContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newViewContainer != null)
				msgs = ((InternalEObject)newViewContainer).eInverseAdd(this, CorePackage.VIEW_CONTAINER__ACTIONS, ViewContainer.class, msgs);
			msgs = basicSetViewContainer(newViewContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_ACTION__VIEW_CONTAINER, newViewContainer, newViewContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IFML_ACTION__VIEW_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetViewContainer((ViewContainer)otherEnd, msgs);
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
			case CorePackage.IFML_ACTION__ACTION_EVENTS:
				return ((InternalEList)getActionEvents()).basicRemove(otherEnd, msgs);
			case CorePackage.IFML_ACTION__VIEW_CONTAINER:
				return basicSetViewContainer(null, msgs);
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
			case CorePackage.IFML_ACTION__VIEW_CONTAINER:
				return eInternalContainer().eInverseRemove(this, CorePackage.VIEW_CONTAINER__ACTIONS, ViewContainer.class, msgs);
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
			case CorePackage.IFML_ACTION__ACTION_EVENTS:
				return getActionEvents();
			case CorePackage.IFML_ACTION__DYNAMIC_BEHAVIOR:
				if (resolve) return getDynamicBehavior();
				return basicGetDynamicBehavior();
			case CorePackage.IFML_ACTION__VIEW_CONTAINER:
				return getViewContainer();
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
			case CorePackage.IFML_ACTION__ACTION_EVENTS:
				getActionEvents().clear();
				getActionEvents().addAll((Collection)newValue);
				return;
			case CorePackage.IFML_ACTION__DYNAMIC_BEHAVIOR:
				setDynamicBehavior((DynamicBehavior)newValue);
				return;
			case CorePackage.IFML_ACTION__VIEW_CONTAINER:
				setViewContainer((ViewContainer)newValue);
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
			case CorePackage.IFML_ACTION__ACTION_EVENTS:
				getActionEvents().clear();
				return;
			case CorePackage.IFML_ACTION__DYNAMIC_BEHAVIOR:
				setDynamicBehavior((DynamicBehavior)null);
				return;
			case CorePackage.IFML_ACTION__VIEW_CONTAINER:
				setViewContainer((ViewContainer)null);
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
			case CorePackage.IFML_ACTION__ACTION_EVENTS:
				return actionEvents != null && !actionEvents.isEmpty();
			case CorePackage.IFML_ACTION__DYNAMIC_BEHAVIOR:
				return dynamicBehavior != null;
			case CorePackage.IFML_ACTION__VIEW_CONTAINER:
				return getViewContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //IFMLActionImpl
