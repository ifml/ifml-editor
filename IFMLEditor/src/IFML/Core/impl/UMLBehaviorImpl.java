/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.DynamicBehavior;
import IFML.Core.UMLBehavior;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.UMLBehaviorImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLBehaviorImpl extends BehaviorConceptImpl implements UMLBehavior {
	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected DynamicBehavior behavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.UML_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBehavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (DynamicBehavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.UML_BEHAVIOR__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBehavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(DynamicBehavior newBehavior) {
		DynamicBehavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.UML_BEHAVIOR__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.UML_BEHAVIOR__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
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
			case CorePackage.UML_BEHAVIOR__BEHAVIOR:
				setBehavior((DynamicBehavior)newValue);
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
			case CorePackage.UML_BEHAVIOR__BEHAVIOR:
				setBehavior((DynamicBehavior)null);
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
			case CorePackage.UML_BEHAVIOR__BEHAVIOR:
				return behavior != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLBehaviorImpl
