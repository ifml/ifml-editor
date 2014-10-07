/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.FeatureConcept;
import IFML.Core.VisualizationAttribute;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.VisualizationAttributeImpl#getFeatureConcept <em>Feature Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualizationAttributeImpl extends ViewComponentPartImpl implements VisualizationAttribute {
	/**
	 * The cached value of the '{@link #getFeatureConcept() <em>Feature Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureConcept()
	 * @generated
	 * @ordered
	 */
	protected FeatureConcept featureConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VISUALIZATION_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConcept getFeatureConcept() {
		if (featureConcept != null && featureConcept.eIsProxy()) {
			InternalEObject oldFeatureConcept = (InternalEObject)featureConcept;
			featureConcept = (FeatureConcept)eResolveProxy(oldFeatureConcept);
			if (featureConcept != oldFeatureConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT, oldFeatureConcept, featureConcept));
			}
		}
		return featureConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConcept basicGetFeatureConcept() {
		return featureConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureConcept(FeatureConcept newFeatureConcept) {
		FeatureConcept oldFeatureConcept = featureConcept;
		featureConcept = newFeatureConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT, oldFeatureConcept, featureConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT:
				if (resolve) return getFeatureConcept();
				return basicGetFeatureConcept();
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
			case CorePackage.VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT:
				setFeatureConcept((FeatureConcept)newValue);
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
			case CorePackage.VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT:
				setFeatureConcept((FeatureConcept)null);
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
			case CorePackage.VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT:
				return featureConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //VisualizationAttributeImpl
