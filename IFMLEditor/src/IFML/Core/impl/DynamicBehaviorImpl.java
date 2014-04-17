/**
 */
package IFML.Core.impl;

import IFML.Core.BehaviorConcept;
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
 * An implementation of the model object '<em><b>Dynamic Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.DynamicBehaviorImpl#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}</li>
 *   <li>{@link IFML.Core.impl.DynamicBehaviorImpl#getBehaviorConcept <em>Behavior Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicBehaviorImpl extends ContentBindingImpl implements DynamicBehavior {
	/**
	 * The cached value of the '{@link #getBehavioralFeatureConcept() <em>Behavioral Feature Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralFeatureConcept()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeatureConcept behavioralFeatureConcept;

	/**
	 * The cached value of the '{@link #getBehaviorConcept() <em>Behavior Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorConcept()
	 * @generated
	 * @ordered
	 */
	protected BehaviorConcept behaviorConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.DYNAMIC_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeatureConcept getBehavioralFeatureConcept() {
		if (behavioralFeatureConcept != null && behavioralFeatureConcept.eIsProxy()) {
			InternalEObject oldBehavioralFeatureConcept = (InternalEObject)behavioralFeatureConcept;
			behavioralFeatureConcept = (BehavioralFeatureConcept)eResolveProxy(oldBehavioralFeatureConcept);
			if (behavioralFeatureConcept != oldBehavioralFeatureConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT, oldBehavioralFeatureConcept, behavioralFeatureConcept));
			}
		}
		return behavioralFeatureConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeatureConcept basicGetBehavioralFeatureConcept() {
		return behavioralFeatureConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavioralFeatureConcept(BehavioralFeatureConcept newBehavioralFeatureConcept, NotificationChain msgs) {
		BehavioralFeatureConcept oldBehavioralFeatureConcept = behavioralFeatureConcept;
		behavioralFeatureConcept = newBehavioralFeatureConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT, oldBehavioralFeatureConcept, newBehavioralFeatureConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralFeatureConcept(BehavioralFeatureConcept newBehavioralFeatureConcept) {
		if (newBehavioralFeatureConcept != behavioralFeatureConcept) {
			NotificationChain msgs = null;
			if (behavioralFeatureConcept != null)
				msgs = ((InternalEObject)behavioralFeatureConcept).eInverseRemove(this, CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR, BehavioralFeatureConcept.class, msgs);
			if (newBehavioralFeatureConcept != null)
				msgs = ((InternalEObject)newBehavioralFeatureConcept).eInverseAdd(this, CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR, BehavioralFeatureConcept.class, msgs);
			msgs = basicSetBehavioralFeatureConcept(newBehavioralFeatureConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT, newBehavioralFeatureConcept, newBehavioralFeatureConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConcept getBehaviorConcept() {
		if (behaviorConcept != null && behaviorConcept.eIsProxy()) {
			InternalEObject oldBehaviorConcept = (InternalEObject)behaviorConcept;
			behaviorConcept = (BehaviorConcept)eResolveProxy(oldBehaviorConcept);
			if (behaviorConcept != oldBehaviorConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT, oldBehaviorConcept, behaviorConcept));
			}
		}
		return behaviorConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConcept basicGetBehaviorConcept() {
		return behaviorConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviorConcept(BehaviorConcept newBehaviorConcept, NotificationChain msgs) {
		BehaviorConcept oldBehaviorConcept = behaviorConcept;
		behaviorConcept = newBehaviorConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT, oldBehaviorConcept, newBehaviorConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviorConcept(BehaviorConcept newBehaviorConcept) {
		if (newBehaviorConcept != behaviorConcept) {
			NotificationChain msgs = null;
			if (behaviorConcept != null)
				msgs = ((InternalEObject)behaviorConcept).eInverseRemove(this, CorePackage.BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR, BehaviorConcept.class, msgs);
			if (newBehaviorConcept != null)
				msgs = ((InternalEObject)newBehaviorConcept).eInverseAdd(this, CorePackage.BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR, BehaviorConcept.class, msgs);
			msgs = basicSetBehaviorConcept(newBehaviorConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT, newBehaviorConcept, newBehaviorConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				if (behavioralFeatureConcept != null)
					msgs = ((InternalEObject)behavioralFeatureConcept).eInverseRemove(this, CorePackage.BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR, BehavioralFeatureConcept.class, msgs);
				return basicSetBehavioralFeatureConcept((BehavioralFeatureConcept)otherEnd, msgs);
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				if (behaviorConcept != null)
					msgs = ((InternalEObject)behaviorConcept).eInverseRemove(this, CorePackage.BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR, BehaviorConcept.class, msgs);
				return basicSetBehaviorConcept((BehaviorConcept)otherEnd, msgs);
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
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				return basicSetBehavioralFeatureConcept(null, msgs);
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				return basicSetBehaviorConcept(null, msgs);
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
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				if (resolve) return getBehavioralFeatureConcept();
				return basicGetBehavioralFeatureConcept();
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				if (resolve) return getBehaviorConcept();
				return basicGetBehaviorConcept();
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
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				setBehavioralFeatureConcept((BehavioralFeatureConcept)newValue);
				return;
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				setBehaviorConcept((BehaviorConcept)newValue);
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
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				setBehavioralFeatureConcept((BehavioralFeatureConcept)null);
				return;
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				setBehaviorConcept((BehaviorConcept)null);
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
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				return behavioralFeatureConcept != null;
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				return behaviorConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicBehaviorImpl
