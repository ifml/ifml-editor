/**
 */
package IFML.Extensions.impl;

import IFML.Core.CorePackage;
import IFML.Core.Expression;
import IFML.Core.IFMLParameter;
import IFML.Core.impl.ViewComponentPartImpl;
import IFML.DataTypes.Direction;
import IFML.Extensions.ExtensionsPackage;
import IFML.Extensions.IFMLSlot;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFML Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Extensions.impl.IFMLSlotImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link IFML.Extensions.impl.IFMLSlotImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link IFML.Extensions.impl.IFMLSlotImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFMLSlotImpl extends ViewComponentPartImpl implements IFMLSlot {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Expression defaultValue;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.IFML_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.IFML_SLOT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefaultValue() {
		if (defaultValue != null && defaultValue.eIsProxy()) {
			InternalEObject oldDefaultValue = (InternalEObject)defaultValue;
			defaultValue = (Expression)eResolveProxy(oldDefaultValue);
			if (defaultValue != oldDefaultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionsPackage.IFML_SLOT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
			}
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(Expression newDefaultValue) {
		Expression oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.IFML_SLOT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionsPackage.IFML_SLOT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.IFML_SLOT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.IFML_SLOT__DIRECTION:
				return getDirection();
			case ExtensionsPackage.IFML_SLOT__DEFAULT_VALUE:
				if (resolve) return getDefaultValue();
				return basicGetDefaultValue();
			case ExtensionsPackage.IFML_SLOT__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionsPackage.IFML_SLOT__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case ExtensionsPackage.IFML_SLOT__DEFAULT_VALUE:
				setDefaultValue((Expression)newValue);
				return;
			case ExtensionsPackage.IFML_SLOT__TYPE:
				setType((Type)newValue);
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
			case ExtensionsPackage.IFML_SLOT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case ExtensionsPackage.IFML_SLOT__DEFAULT_VALUE:
				setDefaultValue((Expression)null);
				return;
			case ExtensionsPackage.IFML_SLOT__TYPE:
				setType((Type)null);
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
			case ExtensionsPackage.IFML_SLOT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case ExtensionsPackage.IFML_SLOT__DEFAULT_VALUE:
				return defaultValue != null;
			case ExtensionsPackage.IFML_SLOT__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IFMLParameter.class) {
			switch (derivedFeatureID) {
				case ExtensionsPackage.IFML_SLOT__DIRECTION: return CorePackage.IFML_PARAMETER__DIRECTION;
				case ExtensionsPackage.IFML_SLOT__DEFAULT_VALUE: return CorePackage.IFML_PARAMETER__DEFAULT_VALUE;
				case ExtensionsPackage.IFML_SLOT__TYPE: return CorePackage.IFML_PARAMETER__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IFMLParameter.class) {
			switch (baseFeatureID) {
				case CorePackage.IFML_PARAMETER__DIRECTION: return ExtensionsPackage.IFML_SLOT__DIRECTION;
				case CorePackage.IFML_PARAMETER__DEFAULT_VALUE: return ExtensionsPackage.IFML_SLOT__DEFAULT_VALUE;
				case CorePackage.IFML_PARAMETER__TYPE: return ExtensionsPackage.IFML_SLOT__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //IFMLSlotImpl
