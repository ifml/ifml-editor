/**
 */
package IFML.Extensions.impl;

import IFML.Core.CorePackage;

import IFML.Core.impl.CorePackageImpl;

import IFML.DataTypes.DataTypesPackage;

import IFML.DataTypes.impl.DataTypesPackageImpl;

import IFML.Extensions.Details;
import IFML.Extensions.Device;
import IFML.Extensions.ExtensionsFactory;
import IFML.Extensions.ExtensionsPackage;
import IFML.Extensions.Field;
import IFML.Extensions.Form;
import IFML.Extensions.IFMLMenu;
import IFML.Extensions.IFMLSlot;
import IFML.Extensions.IFMLWindow;
import IFML.Extensions.JumpEvent;
import IFML.Extensions.LandingEvent;
import IFML.Extensions.List;
import IFML.Extensions.OnLoadEvent;
import IFML.Extensions.OnSelectEvent;
import IFML.Extensions.OnSubmitEvent;
import IFML.Extensions.Position;
import IFML.Extensions.SelectionField;
import IFML.Extensions.SetContextEvent;
import IFML.Extensions.SimpleField;
import IFML.Extensions.UserRole;
import IFML.Extensions.ValidationRule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionsPackageImpl extends EPackageImpl implements ExtensionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onSubmitEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifmlSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onSelectEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifmlWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onLoadEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifmlMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setContextEventEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see IFML.Extensions.ExtensionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtensionsPackageImpl() {
		super(eNS_URI, ExtensionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExtensionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtensionsPackage init() {
		if (isInited) return (ExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI);

		// Obtain or create and register package
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtensionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theExtensionsPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theExtensionsPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtensionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtensionsPackage.eNS_URI, theExtensionsPackage);
		return theExtensionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnSubmitEvent() {
		return onSubmitEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidationRule() {
		return validationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_SelectEvent() {
		return (EReference)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRole() {
		return userRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFMLSlot() {
		return ifmlSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnSelectEvent() {
		return onSelectEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionField() {
		return selectionFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionField_IsMultiSelection() {
		return (EAttribute)selectionFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleField() {
		return simpleFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetails() {
		return detailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFMLWindow() {
		return ifmlWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIFMLWindow_IsModal() {
		return (EAttribute)ifmlWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIFMLWindow_IsNewWindow() {
		return (EAttribute)ifmlWindowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnLoadEvent() {
		return onLoadEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFMLMenu() {
		return ifmlMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJumpEvent() {
		return jumpEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJumpEvent_LandingEvent() {
		return (EReference)jumpEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLandingEvent() {
		return landingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandingEvent_JumpingEvents() {
		return (EReference)landingEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetContextEvent() {
		return setContextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsFactory getExtensionsFactory() {
		return (ExtensionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		onSubmitEventEClass = createEClass(ON_SUBMIT_EVENT);

		validationRuleEClass = createEClass(VALIDATION_RULE);

		listEClass = createEClass(LIST);
		createEReference(listEClass, LIST__SELECT_EVENT);

		positionEClass = createEClass(POSITION);

		userRoleEClass = createEClass(USER_ROLE);

		ifmlSlotEClass = createEClass(IFML_SLOT);

		onSelectEventEClass = createEClass(ON_SELECT_EVENT);

		fieldEClass = createEClass(FIELD);

		formEClass = createEClass(FORM);

		deviceEClass = createEClass(DEVICE);

		selectionFieldEClass = createEClass(SELECTION_FIELD);
		createEAttribute(selectionFieldEClass, SELECTION_FIELD__IS_MULTI_SELECTION);

		simpleFieldEClass = createEClass(SIMPLE_FIELD);

		detailsEClass = createEClass(DETAILS);

		ifmlWindowEClass = createEClass(IFML_WINDOW);
		createEAttribute(ifmlWindowEClass, IFML_WINDOW__IS_MODAL);
		createEAttribute(ifmlWindowEClass, IFML_WINDOW__IS_NEW_WINDOW);

		onLoadEventEClass = createEClass(ON_LOAD_EVENT);

		ifmlMenuEClass = createEClass(IFML_MENU);

		jumpEventEClass = createEClass(JUMP_EVENT);
		createEReference(jumpEventEClass, JUMP_EVENT__LANDING_EVENT);

		landingEventEClass = createEClass(LANDING_EVENT);
		createEReference(landingEventEClass, LANDING_EVENT__JUMPING_EVENTS);

		setContextEventEClass = createEClass(SET_CONTEXT_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		onSubmitEventEClass.getESuperTypes().add(theCorePackage.getViewElementEvent());
		validationRuleEClass.getESuperTypes().add(theCorePackage.getConstraint());
		listEClass.getESuperTypes().add(theCorePackage.getViewComponent());
		positionEClass.getESuperTypes().add(theCorePackage.getContextDimension());
		userRoleEClass.getESuperTypes().add(theCorePackage.getContextDimension());
		ifmlSlotEClass.getESuperTypes().add(theCorePackage.getViewComponentPart());
		ifmlSlotEClass.getESuperTypes().add(theCorePackage.getIFMLParameter());
		onSelectEventEClass.getESuperTypes().add(theCorePackage.getViewElementEvent());
		fieldEClass.getESuperTypes().add(theCorePackage.getViewComponentPart());
		fieldEClass.getESuperTypes().add(theCorePackage.getIFMLParameter());
		formEClass.getESuperTypes().add(theCorePackage.getViewComponent());
		deviceEClass.getESuperTypes().add(theCorePackage.getContextDimension());
		selectionFieldEClass.getESuperTypes().add(this.getField());
		simpleFieldEClass.getESuperTypes().add(this.getField());
		detailsEClass.getESuperTypes().add(theCorePackage.getViewComponent());
		ifmlWindowEClass.getESuperTypes().add(theCorePackage.getViewContainer());
		onLoadEventEClass.getESuperTypes().add(theCorePackage.getSystemEvent());
		ifmlMenuEClass.getESuperTypes().add(theCorePackage.getViewContainer());
		jumpEventEClass.getESuperTypes().add(theCorePackage.getThrowingEvent());
		landingEventEClass.getESuperTypes().add(theCorePackage.getCatchingEvent());
		setContextEventEClass.getESuperTypes().add(theCorePackage.getThrowingEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(onSubmitEventEClass, OnSubmitEvent.class, "OnSubmitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validationRuleEClass, ValidationRule.class, "ValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getList_SelectEvent(), this.getOnSelectEvent(), null, "selectEvent", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userRoleEClass, UserRole.class, "UserRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifmlSlotEClass, IFMLSlot.class, "IFMLSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onSelectEventEClass, OnSelectEvent.class, "OnSelectEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionFieldEClass, SelectionField.class, "SelectionField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionField_IsMultiSelection(), ecorePackage.getEBoolean(), "isMultiSelection", null, 1, 1, SelectionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleFieldEClass, SimpleField.class, "SimpleField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(detailsEClass, Details.class, "Details", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifmlWindowEClass, IFMLWindow.class, "IFMLWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIFMLWindow_IsModal(), ecorePackage.getEBoolean(), "isModal", null, 1, 1, IFMLWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIFMLWindow_IsNewWindow(), ecorePackage.getEBoolean(), "isNewWindow", null, 1, 1, IFMLWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(onLoadEventEClass, OnLoadEvent.class, "OnLoadEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifmlMenuEClass, IFMLMenu.class, "IFMLMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jumpEventEClass, JumpEvent.class, "JumpEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJumpEvent_LandingEvent(), this.getLandingEvent(), this.getLandingEvent_JumpingEvents(), "landingEvent", null, 0, 1, JumpEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(landingEventEClass, LandingEvent.class, "LandingEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLandingEvent_JumpingEvents(), this.getJumpEvent(), this.getJumpEvent_LandingEvent(), "jumpingEvents", null, 0, -1, LandingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setContextEventEClass, SetContextEvent.class, "SetContextEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtensionsPackageImpl
