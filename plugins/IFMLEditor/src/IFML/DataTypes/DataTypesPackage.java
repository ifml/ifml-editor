/**
 */
package IFML.DataTypes;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see IFML.DataTypes.DataTypesFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/20130218/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesPackage eINSTANCE = IFML.DataTypes.impl.DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link IFML.DataTypes.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.DataTypes.Direction
	 * @see IFML.DataTypes.impl.DataTypesPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 0;

	/**
	 * The meta object id for the '{@link IFML.DataTypes.SystemEventType <em>System Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.DataTypes.SystemEventType
	 * @see IFML.DataTypes.impl.DataTypesPackageImpl#getSystemEventType()
	 * @generated
	 */
	int SYSTEM_EVENT_TYPE = 1;

	/**
	 * The meta object id for the '{@link IFML.DataTypes.ContextVariableScope <em>Context Variable Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.DataTypes.ContextVariableScope
	 * @see IFML.DataTypes.impl.DataTypesPackageImpl#getContextVariableScope()
	 * @generated
	 */
	int CONTEXT_VARIABLE_SCOPE = 2;


	/**
	 * Returns the meta object for enum '{@link IFML.DataTypes.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see IFML.DataTypes.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link IFML.DataTypes.SystemEventType <em>System Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Event Type</em>'.
	 * @see IFML.DataTypes.SystemEventType
	 * @generated
	 */
	EEnum getSystemEventType();

	/**
	 * Returns the meta object for enum '{@link IFML.DataTypes.ContextVariableScope <em>Context Variable Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Variable Scope</em>'.
	 * @see IFML.DataTypes.ContextVariableScope
	 * @generated
	 */
	EEnum getContextVariableScope();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypesFactory getDataTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link IFML.DataTypes.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.DataTypes.Direction
		 * @see IFML.DataTypes.impl.DataTypesPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link IFML.DataTypes.SystemEventType <em>System Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.DataTypes.SystemEventType
		 * @see IFML.DataTypes.impl.DataTypesPackageImpl#getSystemEventType()
		 * @generated
		 */
		EEnum SYSTEM_EVENT_TYPE = eINSTANCE.getSystemEventType();

		/**
		 * The meta object literal for the '{@link IFML.DataTypes.ContextVariableScope <em>Context Variable Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.DataTypes.ContextVariableScope
		 * @see IFML.DataTypes.impl.DataTypesPackageImpl#getContextVariableScope()
		 * @generated
		 */
		EEnum CONTEXT_VARIABLE_SCOPE = eINSTANCE.getContextVariableScope();

	}

} //DataTypesPackage
