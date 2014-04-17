/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.IFMLParameter;
import IFML.Core.ParameterBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ParameterBindingImpl#getSourceParameter <em>Source Parameter</em>}</li>
 *   <li>{@link IFML.Core.impl.ParameterBindingImpl#getTargetParameter <em>Target Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterBindingImpl extends InteractionFlowModelElementImpl implements ParameterBinding {
	/**
	 * The cached value of the '{@link #getSourceParameter() <em>Source Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceParameter()
	 * @generated
	 * @ordered
	 */
	protected IFMLParameter sourceParameter;

	/**
	 * The cached value of the '{@link #getTargetParameter() <em>Target Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParameter()
	 * @generated
	 * @ordered
	 */
	protected IFMLParameter targetParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.PARAMETER_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLParameter getSourceParameter() {
		if (sourceParameter != null && sourceParameter.eIsProxy()) {
			InternalEObject oldSourceParameter = (InternalEObject)sourceParameter;
			sourceParameter = (IFMLParameter)eResolveProxy(oldSourceParameter);
			if (sourceParameter != oldSourceParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.PARAMETER_BINDING__SOURCE_PARAMETER, oldSourceParameter, sourceParameter));
			}
		}
		return sourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLParameter basicGetSourceParameter() {
		return sourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceParameter(IFMLParameter newSourceParameter) {
		IFMLParameter oldSourceParameter = sourceParameter;
		sourceParameter = newSourceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARAMETER_BINDING__SOURCE_PARAMETER, oldSourceParameter, sourceParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLParameter getTargetParameter() {
		if (targetParameter != null && targetParameter.eIsProxy()) {
			InternalEObject oldTargetParameter = (InternalEObject)targetParameter;
			targetParameter = (IFMLParameter)eResolveProxy(oldTargetParameter);
			if (targetParameter != oldTargetParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.PARAMETER_BINDING__TARGET_PARAMETER, oldTargetParameter, targetParameter));
			}
		}
		return targetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLParameter basicGetTargetParameter() {
		return targetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetParameter(IFMLParameter newTargetParameter) {
		IFMLParameter oldTargetParameter = targetParameter;
		targetParameter = newTargetParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARAMETER_BINDING__TARGET_PARAMETER, oldTargetParameter, targetParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PARAMETER_BINDING__SOURCE_PARAMETER:
				if (resolve) return getSourceParameter();
				return basicGetSourceParameter();
			case CorePackage.PARAMETER_BINDING__TARGET_PARAMETER:
				if (resolve) return getTargetParameter();
				return basicGetTargetParameter();
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
			case CorePackage.PARAMETER_BINDING__SOURCE_PARAMETER:
				setSourceParameter((IFMLParameter)newValue);
				return;
			case CorePackage.PARAMETER_BINDING__TARGET_PARAMETER:
				setTargetParameter((IFMLParameter)newValue);
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
			case CorePackage.PARAMETER_BINDING__SOURCE_PARAMETER:
				setSourceParameter((IFMLParameter)null);
				return;
			case CorePackage.PARAMETER_BINDING__TARGET_PARAMETER:
				setTargetParameter((IFMLParameter)null);
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
			case CorePackage.PARAMETER_BINDING__SOURCE_PARAMETER:
				return sourceParameter != null;
			case CorePackage.PARAMETER_BINDING__TARGET_PARAMETER:
				return targetParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterBindingImpl
