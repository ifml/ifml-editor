/**
 */
package IFML.Core.impl;

import IFML.Core.ContentBinding;
import IFML.Core.CorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ContentBindingImpl#getUniformResourceIdentifier <em>Uniform Resource Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContentBindingImpl extends ViewComponentPartImpl implements ContentBinding {
	/**
	 * The default value of the '{@link #getUniformResourceIdentifier() <em>Uniform Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniformResourceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIFORM_RESOURCE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniformResourceIdentifier() <em>Uniform Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniformResourceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String uniformResourceIdentifier = UNIFORM_RESOURCE_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONTENT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniformResourceIdentifier() {
		return uniformResourceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniformResourceIdentifier(String newUniformResourceIdentifier) {
		String oldUniformResourceIdentifier = uniformResourceIdentifier;
		uniformResourceIdentifier = newUniformResourceIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER, oldUniformResourceIdentifier, uniformResourceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER:
				return getUniformResourceIdentifier();
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
			case CorePackage.CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER:
				setUniformResourceIdentifier((String)newValue);
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
			case CorePackage.CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER:
				setUniformResourceIdentifier(UNIFORM_RESOURCE_IDENTIFIER_EDEFAULT);
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
			case CorePackage.CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER:
				return UNIFORM_RESOURCE_IDENTIFIER_EDEFAULT == null ? uniformResourceIdentifier != null : !UNIFORM_RESOURCE_IDENTIFIER_EDEFAULT.equals(uniformResourceIdentifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uniformResourceIdentifier: ");
		result.append(uniformResourceIdentifier);
		result.append(')');
		return result.toString();
	}

} //ContentBindingImpl
