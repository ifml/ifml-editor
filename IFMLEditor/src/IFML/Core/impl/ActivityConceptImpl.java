/**
 */
package IFML.Core.impl;

import IFML.Core.ActivityConcept;
import IFML.Core.CorePackage;
import IFML.Core.ModuleDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ActivityConceptImpl#getModuleDefinition <em>Module Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityConceptImpl extends NamedElementImpl implements ActivityConcept {
	/**
	 * The cached value of the '{@link #getModuleDefinition() <em>Module Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleDefinition()
	 * @generated
	 * @ordered
	 */
	protected ModuleDefinition moduleDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.ACTIVITY_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition getModuleDefinition() {
		if (moduleDefinition != null && moduleDefinition.eIsProxy()) {
			InternalEObject oldModuleDefinition = (InternalEObject)moduleDefinition;
			moduleDefinition = (ModuleDefinition)eResolveProxy(oldModuleDefinition);
			if (moduleDefinition != oldModuleDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION, oldModuleDefinition, moduleDefinition));
			}
		}
		return moduleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition basicGetModuleDefinition() {
		return moduleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleDefinition(ModuleDefinition newModuleDefinition, NotificationChain msgs) {
		ModuleDefinition oldModuleDefinition = moduleDefinition;
		moduleDefinition = newModuleDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION, oldModuleDefinition, newModuleDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleDefinition(ModuleDefinition newModuleDefinition) {
		if (newModuleDefinition != moduleDefinition) {
			NotificationChain msgs = null;
			if (moduleDefinition != null)
				msgs = ((InternalEObject)moduleDefinition).eInverseRemove(this, CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT, ModuleDefinition.class, msgs);
			if (newModuleDefinition != null)
				msgs = ((InternalEObject)newModuleDefinition).eInverseAdd(this, CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT, ModuleDefinition.class, msgs);
			msgs = basicSetModuleDefinition(newModuleDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION, newModuleDefinition, newModuleDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION:
				if (moduleDefinition != null)
					msgs = ((InternalEObject)moduleDefinition).eInverseRemove(this, CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT, ModuleDefinition.class, msgs);
				return basicSetModuleDefinition((ModuleDefinition)otherEnd, msgs);
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
			case CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION:
				return basicSetModuleDefinition(null, msgs);
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
			case CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION:
				if (resolve) return getModuleDefinition();
				return basicGetModuleDefinition();
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
			case CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION:
				setModuleDefinition((ModuleDefinition)newValue);
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
			case CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION:
				setModuleDefinition((ModuleDefinition)null);
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
			case CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION:
				return moduleDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityConceptImpl
