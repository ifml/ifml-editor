/**
 */
package IFML.Extensions.impl;

import IFML.Core.impl.CatchingEventImpl;

import IFML.Extensions.ExtensionsPackage;
import IFML.Extensions.JumpEvent;
import IFML.Extensions.LandingEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Extensions.impl.LandingEventImpl#getJumpingEvents <em>Jumping Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandingEventImpl extends CatchingEventImpl implements LandingEvent {
	/**
	 * The cached value of the '{@link #getJumpingEvents() <em>Jumping Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpingEvents()
	 * @generated
	 * @ordered
	 */
	protected EList jumpingEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.LANDING_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJumpingEvents() {
		if (jumpingEvents == null) {
			jumpingEvents = new EObjectWithInverseResolvingEList(JumpEvent.class, this, ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS, ExtensionsPackage.JUMP_EVENT__LANDING_EVENT);
		}
		return jumpingEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS:
				return ((InternalEList)getJumpingEvents()).basicAdd(otherEnd, msgs);
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
			case ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS:
				return ((InternalEList)getJumpingEvents()).basicRemove(otherEnd, msgs);
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
			case ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS:
				return getJumpingEvents();
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
			case ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS:
				getJumpingEvents().clear();
				getJumpingEvents().addAll((Collection)newValue);
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
			case ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS:
				getJumpingEvents().clear();
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
			case ExtensionsPackage.LANDING_EVENT__JUMPING_EVENTS:
				return jumpingEvents != null && !jumpingEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LandingEventImpl
