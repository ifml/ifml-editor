/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.FeatureConcept;
import IFML.Core.VisualizationAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.FeatureConceptImpl#getVisualizationAttribute <em>Visualization Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureConceptImpl extends DomainElementImpl implements FeatureConcept {
	/**
	 * The cached value of the '{@link #getVisualizationAttribute() <em>Visualization Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationAttribute()
	 * @generated
	 * @ordered
	 */
	protected VisualizationAttribute visualizationAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.FEATURE_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationAttribute getVisualizationAttribute() {
		if (visualizationAttribute != null && visualizationAttribute.eIsProxy()) {
			InternalEObject oldVisualizationAttribute = (InternalEObject)visualizationAttribute;
			visualizationAttribute = (VisualizationAttribute)eResolveProxy(oldVisualizationAttribute);
			if (visualizationAttribute != oldVisualizationAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE, oldVisualizationAttribute, visualizationAttribute));
			}
		}
		return visualizationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationAttribute basicGetVisualizationAttribute() {
		return visualizationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualizationAttribute(VisualizationAttribute newVisualizationAttribute, NotificationChain msgs) {
		VisualizationAttribute oldVisualizationAttribute = visualizationAttribute;
		visualizationAttribute = newVisualizationAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE, oldVisualizationAttribute, newVisualizationAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualizationAttribute(VisualizationAttribute newVisualizationAttribute) {
		if (newVisualizationAttribute != visualizationAttribute) {
			NotificationChain msgs = null;
			if (visualizationAttribute != null)
				msgs = ((InternalEObject)visualizationAttribute).eInverseRemove(this, CorePackage.VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT, VisualizationAttribute.class, msgs);
			if (newVisualizationAttribute != null)
				msgs = ((InternalEObject)newVisualizationAttribute).eInverseAdd(this, CorePackage.VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT, VisualizationAttribute.class, msgs);
			msgs = basicSetVisualizationAttribute(newVisualizationAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE, newVisualizationAttribute, newVisualizationAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE:
				if (visualizationAttribute != null)
					msgs = ((InternalEObject)visualizationAttribute).eInverseRemove(this, CorePackage.VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT, VisualizationAttribute.class, msgs);
				return basicSetVisualizationAttribute((VisualizationAttribute)otherEnd, msgs);
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
			case CorePackage.FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE:
				return basicSetVisualizationAttribute(null, msgs);
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
			case CorePackage.FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE:
				if (resolve) return getVisualizationAttribute();
				return basicGetVisualizationAttribute();
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
			case CorePackage.FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE:
				setVisualizationAttribute((VisualizationAttribute)newValue);
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
			case CorePackage.FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE:
				setVisualizationAttribute((VisualizationAttribute)null);
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
			case CorePackage.FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE:
				return visualizationAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureConceptImpl
