/**
 */
package IFML.Core.impl;

import IFML.Core.BehavioralFeatureConcept;
import IFML.Core.CorePackage;
import IFML.Core.DynamicBehavior;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.BehavioralFeatureConceptImpl#getDynamicBehavior <em>Dynamic Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehavioralFeatureConceptImpl extends DomainElementImpl implements BehavioralFeatureConcept {
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
	protected BehavioralFeatureConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.BEHAVIORAL_FEATURE_CONCEPT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR, oldDynamicBehavior, dynamicBehavior));
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
	public NotificationChain basicSetDynamicBehavior(DynamicBehavior newDynamicBehavior, NotificationChain msgs) {
		DynamicBehavior oldDynamicBehavior = dynamicBehavior;
		dynamicBehavior = newDynamicBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR, oldDynamicBehavior, newDynamicBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicBehavior(DynamicBehavior newDynamicBehavior) {
		if (newDynamicBehavior != dynamicBehavior) {
			NotificationChain msgs = null;
			if (dynamicBehavior != null)
				msgs = ((InternalEObject)dynamicBehavior).eInverseRemove(this, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT, DynamicBehavior.class, msgs);
			if (newDynamicBehavior != null)
				msgs = ((InternalEObject)newDynamicBehavior).eInverseAdd(this, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT, DynamicBehavior.class, msgs);
			msgs = basicSetDynamicBehavior(newDynamicBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR, newDynamicBehavior, newDynamicBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR:
				if (dynamicBehavior != null)
					msgs = ((InternalEObject)dynamicBehavior).eInverseRemove(this, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT, DynamicBehavior.class, msgs);
				return basicSetDynamicBehavior((DynamicBehavior)otherEnd, msgs);
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
			case CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR:
				return basicSetDynamicBehavior(null, msgs);
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
			case CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR:
				if (resolve) return getDynamicBehavior();
				return basicGetDynamicBehavior();
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
			case CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR:
				setDynamicBehavior((DynamicBehavior)newValue);
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
			case CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR:
				setDynamicBehavior((DynamicBehavior)null);
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
			case CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR:
				return dynamicBehavior != null;
		}
		return super.eIsSet(featureID);
	}

} //BehavioralFeatureConceptImpl
