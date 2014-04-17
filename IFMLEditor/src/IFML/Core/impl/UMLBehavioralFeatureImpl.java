/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.UMLBehavior;
import IFML.Core.UMLBehavioralFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.UMLBehavioralFeatureImpl#getBehavioralFeature <em>Behavioral Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLBehavioralFeatureImpl extends BehavioralFeatureConceptImpl implements UMLBehavioralFeature {
	/**
	 * The cached value of the '{@link #getBehavioralFeature() <em>Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralFeature()
	 * @generated
	 * @ordered
	 */
	protected UMLBehavior behavioralFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLBehavioralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.UML_BEHAVIORAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLBehavior getBehavioralFeature() {
		if (behavioralFeature != null && behavioralFeature.eIsProxy()) {
			InternalEObject oldBehavioralFeature = (InternalEObject)behavioralFeature;
			behavioralFeature = (UMLBehavior)eResolveProxy(oldBehavioralFeature);
			if (behavioralFeature != oldBehavioralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE, oldBehavioralFeature, behavioralFeature));
			}
		}
		return behavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLBehavior basicGetBehavioralFeature() {
		return behavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralFeature(UMLBehavior newBehavioralFeature) {
		UMLBehavior oldBehavioralFeature = behavioralFeature;
		behavioralFeature = newBehavioralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE, oldBehavioralFeature, behavioralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE:
				if (resolve) return getBehavioralFeature();
				return basicGetBehavioralFeature();
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
			case CorePackage.UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE:
				setBehavioralFeature((UMLBehavior)newValue);
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
			case CorePackage.UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE:
				setBehavioralFeature((UMLBehavior)null);
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
			case CorePackage.UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE:
				return behavioralFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLBehavioralFeatureImpl
