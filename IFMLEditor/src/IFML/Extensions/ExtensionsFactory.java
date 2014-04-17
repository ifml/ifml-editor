/**
 */
package IFML.Extensions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IFML.Extensions.ExtensionsPackage
 * @generated
 */
public interface ExtensionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionsFactory eINSTANCE = IFML.Extensions.impl.ExtensionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>On Submit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Submit Event</em>'.
	 * @generated
	 */
	OnSubmitEvent createOnSubmitEvent();

	/**
	 * Returns a new object of class '<em>Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Rule</em>'.
	 * @generated
	 */
	ValidationRule createValidationRule();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>User Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Role</em>'.
	 * @generated
	 */
	UserRole createUserRole();

	/**
	 * Returns a new object of class '<em>IFML Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFML Slot</em>'.
	 * @generated
	 */
	IFMLSlot createIFMLSlot();

	/**
	 * Returns a new object of class '<em>On Select Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Select Event</em>'.
	 * @generated
	 */
	OnSelectEvent createOnSelectEvent();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Field</em>'.
	 * @generated
	 */
	SelectionField createSelectionField();

	/**
	 * Returns a new object of class '<em>Simple Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Field</em>'.
	 * @generated
	 */
	SimpleField createSimpleField();

	/**
	 * Returns a new object of class '<em>Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Details</em>'.
	 * @generated
	 */
	Details createDetails();

	/**
	 * Returns a new object of class '<em>IFML Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFML Window</em>'.
	 * @generated
	 */
	IFMLWindow createIFMLWindow();

	/**
	 * Returns a new object of class '<em>On Load Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Load Event</em>'.
	 * @generated
	 */
	OnLoadEvent createOnLoadEvent();

	/**
	 * Returns a new object of class '<em>IFML Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFML Menu</em>'.
	 * @generated
	 */
	IFMLMenu createIFMLMenu();

	/**
	 * Returns a new object of class '<em>Jump Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump Event</em>'.
	 * @generated
	 */
	JumpEvent createJumpEvent();

	/**
	 * Returns a new object of class '<em>Landing Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Landing Event</em>'.
	 * @generated
	 */
	LandingEvent createLandingEvent();

	/**
	 * Returns a new object of class '<em>Set Context Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Context Event</em>'.
	 * @generated
	 */
	SetContextEvent createSetContextEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtensionsPackage getExtensionsPackage();

} //ExtensionsFactory
