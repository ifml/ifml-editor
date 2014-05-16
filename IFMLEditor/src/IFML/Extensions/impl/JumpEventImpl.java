/**
 */
package IFML.Extensions.impl;

import IFML.Core.impl.ThrowingEventImpl;

import IFML.Extensions.ExtensionsPackage;
import IFML.Extensions.JumpEvent;
import IFML.Extensions.LandingEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Extensions.impl.JumpEventImpl#getLandingEvent <em>Landing Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JumpEventImpl extends ThrowingEventImpl implements JumpEvent {
	/**
	 * The cached value of the '{@link #getLandingEvent() <em>Landing Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingEvent()
	 * @generated
	 * @ordered
	 */
	protected LandingEvent landingEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.JUMP_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandingEvent getLandingEvent() {
		if (landingEvent != null && landingEvent.eIsProxy()) {
			InternalEObject oldLandingEvent = (InternalEObject)landingEvent;
			landingEvent = (LandingEvent)eResolveProxy(oldLandingEvent);
			if (landingEvent != oldLandingEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionsPackage.JUMP_EVENT__LANDING_EVENT, oldLandingEvent, landingEvent));
			}
		}
		return landingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandingEvent basicGetLandingEvent() {
		return landingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingEvent(LandingEvent newLandingEvent, NotificationChain msgs) {
		LandingEvent oldLandingEvent = landingEvent;
		landingEvent = newLandingEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionsPackage.JUMP_EVENT__LANDING_EVENT, oldLandingEvent, newLandingEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLandingEvent(LandingEvent newLandingEvent) {
		if (newLandingEvent != landingEvent) {
			NotificationChain msgs = null;
			if (landingEvent != null)
				msgs = ((InternalEObject)landingEvent).eInverseRemove(this, ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS, LandingEvent.class, msgs);
			if (newLandingEvent != null)
				msgs = ((InternalEObject)newLandingEvent).eInverseAdd(this, ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS, LandingEvent.class, msgs);
			msgs = basicSetLandingEvent(newLandingEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.JUMP_EVENT__LANDING_EVENT, newLandingEvent, newLandingEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionsPackage.JUMP_EVENT__LANDING_EVENT:
				if (landingEvent != null)
					msgs = ((InternalEObject)landingEvent).eInverseRemove(this, ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS, LandingEvent.class, msgs);
				return basicSetLandingEvent((LandingEvent)otherEnd, msgs);
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
			case ExtensionsPackage.JUMP_EVENT__LANDING_EVENT:
				return basicSetLandingEvent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.JUMP_EVENT__LANDING_EVENT:
				if (resolve) return getLandingEvent();
				return basicGetLandingEvent();
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
			case ExtensionsPackage.JUMP_EVENT__LANDING_EVENT:
				setLandingEvent((LandingEvent)newValue);
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
			case ExtensionsPackage.JUMP_EVENT__LANDING_EVENT:
				setLandingEvent((LandingEvent)null);
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
			case ExtensionsPackage.JUMP_EVENT__LANDING_EVENT:
				return landingEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //JumpEventImpl
