/**
 */
package IFML.Extensions;

import IFML.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see IFML.Extensions.ExtensionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Extensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/20130218/ext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionsPackage eINSTANCE = IFML.Extensions.impl.ExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.OnSubmitEventImpl <em>On Submit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.OnSubmitEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnSubmitEvent()
	 * @generated
	 */
	int ON_SUBMIT_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__ID = CorePackage.VIEW_ELEMENT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__CONSTRAINTS = CorePackage.VIEW_ELEMENT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__ANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__NAME = CorePackage.VIEW_ELEMENT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__PARAMETERS = CorePackage.VIEW_ELEMENT_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__VIEW_ELEMENT = CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>On Submit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>On Submit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.ValidationRuleImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getValidationRule()
	 * @generated
	 */
	int VALIDATION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__ID = CorePackage.CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__CONSTRAINTS = CorePackage.CONSTRAINT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__ANNOTATIONS = CorePackage.CONSTRAINT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__LANGUAGE = CorePackage.CONSTRAINT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__BODY = CorePackage.CONSTRAINT__BODY;

	/**
	 * The number of structural features of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_FEATURE_COUNT = CorePackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_OPERATION_COUNT = CorePackage.CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.ListImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Select Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SELECT_EVENT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.PositionImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ID = CorePackage.CONTEXT_DIMENSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__CONSTRAINTS = CorePackage.CONTEXT_DIMENSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ANNOTATIONS = CorePackage.CONTEXT_DIMENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = CorePackage.CONTEXT_DIMENSION__NAME;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = CorePackage.CONTEXT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = CorePackage.CONTEXT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.UserRoleImpl <em>User Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.UserRoleImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getUserRole()
	 * @generated
	 */
	int USER_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__ID = CorePackage.CONTEXT_DIMENSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__CONSTRAINTS = CorePackage.CONTEXT_DIMENSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__ANNOTATIONS = CorePackage.CONTEXT_DIMENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__NAME = CorePackage.CONTEXT_DIMENSION__NAME;

	/**
	 * The number of structural features of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_FEATURE_COUNT = CorePackage.CONTEXT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_OPERATION_COUNT = CorePackage.CONTEXT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.IFMLSlotImpl <em>IFML Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.IFMLSlotImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLSlot()
	 * @generated
	 */
	int IFML_SLOT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__ID = CorePackage.VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__CONSTRAINTS = CorePackage.VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__ANNOTATIONS = CorePackage.VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__NAME = CorePackage.VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__PARAMETERS = CorePackage.VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__PARENT_VIEW_COMPONENT_PART = CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__SUB_VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__DIRECTION = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__DEFAULT_VALUE = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__TYPE = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IFML Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IFML Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.OnSelectEventImpl <em>On Select Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.OnSelectEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnSelectEvent()
	 * @generated
	 */
	int ON_SELECT_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__ID = CorePackage.VIEW_ELEMENT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__CONSTRAINTS = CorePackage.VIEW_ELEMENT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__ANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__NAME = CorePackage.VIEW_ELEMENT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__PARAMETERS = CorePackage.VIEW_ELEMENT_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__VIEW_ELEMENT = CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>On Select Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>On Select Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.FieldImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = CorePackage.VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONSTRAINTS = CorePackage.VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATIONS = CorePackage.VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = CorePackage.VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PARAMETERS = CorePackage.VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PARENT_VIEW_COMPONENT_PART = CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SUB_VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DIRECTION = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DEFAULT_VALUE = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.FormImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.DeviceImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = CorePackage.CONTEXT_DIMENSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CONSTRAINTS = CorePackage.CONTEXT_DIMENSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ANNOTATIONS = CorePackage.CONTEXT_DIMENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = CorePackage.CONTEXT_DIMENSION__NAME;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = CorePackage.CONTEXT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = CorePackage.CONTEXT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.SelectionFieldImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSelectionField()
	 * @generated
	 */
	int SELECTION_FIELD = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__CONSTRAINTS = FIELD__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ANNOTATIONS = FIELD__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__PARAMETERS = FIELD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__OUT_INTERACTION_FLOWS = FIELD__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__IN_INTERACTION_FLOWS = FIELD__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__VIEW_ELEMENT_EVENTS = FIELD__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ACTIVATION_EXPRESSION = FIELD__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__PARENT_VIEW_COMPONENT_PART = FIELD__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__SUB_VIEW_COMPONENT_PARTS = FIELD__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__DIRECTION = FIELD__DIRECTION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__DEFAULT_VALUE = FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__TYPE = FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Is Multi Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__IS_MULTI_SELECTION = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.SimpleFieldImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSimpleField()
	 * @generated
	 */
	int SIMPLE_FIELD = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__CONSTRAINTS = FIELD__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__ANNOTATIONS = FIELD__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__PARAMETERS = FIELD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__OUT_INTERACTION_FLOWS = FIELD__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__IN_INTERACTION_FLOWS = FIELD__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__VIEW_ELEMENT_EVENTS = FIELD__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__ACTIVATION_EXPRESSION = FIELD__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__PARENT_VIEW_COMPONENT_PART = FIELD__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__SUB_VIEW_COMPONENT_PARTS = FIELD__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__DIRECTION = FIELD__DIRECTION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__DEFAULT_VALUE = FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__TYPE = FIELD__TYPE;

	/**
	 * The number of structural features of the '<em>Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.DetailsImpl <em>Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.DetailsImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getDetails()
	 * @generated
	 */
	int DETAILS = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The number of structural features of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.IFMLWindowImpl <em>IFML Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.IFMLWindowImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLWindow()
	 * @generated
	 */
	int IFML_WINDOW = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__ID = CorePackage.VIEW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__CONSTRAINTS = CorePackage.VIEW_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__ANNOTATIONS = CorePackage.VIEW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__NAME = CorePackage.VIEW_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__PARAMETERS = CorePackage.VIEW_CONTAINER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__OUT_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IN_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__ACTIVATION_EXPRESSION = CorePackage.VIEW_CONTAINER__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__VIEW_CONTAINER = CorePackage.VIEW_CONTAINER__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_LANDMARK = CorePackage.VIEW_CONTAINER__IS_LANDMARK;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_DEFAULT = CorePackage.VIEW_CONTAINER__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_XOR = CorePackage.VIEW_CONTAINER__IS_XOR;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__VIEW_ELEMENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__ACTIONS = CorePackage.VIEW_CONTAINER__ACTIONS;

	/**
	 * The feature id for the '<em><b>Is Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_MODAL = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is New Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_NEW_WINDOW = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IFML Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW_FEATURE_COUNT = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IFML Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW_OPERATION_COUNT = CorePackage.VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.OnLoadEventImpl <em>On Load Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.OnLoadEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnLoadEvent()
	 * @generated
	 */
	int ON_LOAD_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__ID = CorePackage.SYSTEM_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__CONSTRAINTS = CorePackage.SYSTEM_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__ANNOTATIONS = CorePackage.SYSTEM_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__NAME = CorePackage.SYSTEM_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__PARAMETERS = CorePackage.SYSTEM_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__OUT_INTERACTION_FLOWS = CorePackage.SYSTEM_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__IN_INTERACTION_FLOWS = CorePackage.SYSTEM_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__ACTIVATION_EXPRESSION = CorePackage.SYSTEM_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__TRIGGERING_EXPRESSIONS = CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__TYPE = CorePackage.SYSTEM_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>On Load Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT_FEATURE_COUNT = CorePackage.SYSTEM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>On Load Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT_OPERATION_COUNT = CorePackage.SYSTEM_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.IFMLMenuImpl <em>IFML Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.IFMLMenuImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLMenu()
	 * @generated
	 */
	int IFML_MENU = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__ID = CorePackage.VIEW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__CONSTRAINTS = CorePackage.VIEW_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__ANNOTATIONS = CorePackage.VIEW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__NAME = CorePackage.VIEW_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__PARAMETERS = CorePackage.VIEW_CONTAINER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__OUT_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__IN_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__ACTIVATION_EXPRESSION = CorePackage.VIEW_CONTAINER__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__VIEW_CONTAINER = CorePackage.VIEW_CONTAINER__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__IS_LANDMARK = CorePackage.VIEW_CONTAINER__IS_LANDMARK;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__IS_DEFAULT = CorePackage.VIEW_CONTAINER__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__IS_XOR = CorePackage.VIEW_CONTAINER__IS_XOR;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__VIEW_ELEMENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__ACTIONS = CorePackage.VIEW_CONTAINER__ACTIONS;

	/**
	 * The number of structural features of the '<em>IFML Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU_FEATURE_COUNT = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IFML Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU_OPERATION_COUNT = CorePackage.VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.JumpEventImpl <em>Jump Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.JumpEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getJumpEvent()
	 * @generated
	 */
	int JUMP_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__ID = CorePackage.THROWING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__CONSTRAINTS = CorePackage.THROWING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__ANNOTATIONS = CorePackage.THROWING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__NAME = CorePackage.THROWING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__PARAMETERS = CorePackage.THROWING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__OUT_INTERACTION_FLOWS = CorePackage.THROWING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__IN_INTERACTION_FLOWS = CorePackage.THROWING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__ACTIVATION_EXPRESSION = CorePackage.THROWING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.THROWING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Landing Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__LANDING_EVENT = CorePackage.THROWING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT_FEATURE_COUNT = CorePackage.THROWING_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jump Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT_OPERATION_COUNT = CorePackage.THROWING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.LandingEventImpl <em>Landing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.LandingEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getLandingEvent()
	 * @generated
	 */
	int LANDING_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__ID = CorePackage.CATCHING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__CONSTRAINTS = CorePackage.CATCHING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__ANNOTATIONS = CorePackage.CATCHING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__NAME = CorePackage.CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__PARAMETERS = CorePackage.CATCHING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__OUT_INTERACTION_FLOWS = CorePackage.CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__IN_INTERACTION_FLOWS = CorePackage.CATCHING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__ACTIVATION_EXPRESSION = CorePackage.CATCHING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Jumping Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__JUMPING_EVENTS = CorePackage.CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Landing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT_FEATURE_COUNT = CorePackage.CATCHING_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Landing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT_OPERATION_COUNT = CorePackage.CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.SetContextEventImpl <em>Set Context Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.SetContextEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSetContextEvent()
	 * @generated
	 */
	int SET_CONTEXT_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__ID = CorePackage.THROWING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__CONSTRAINTS = CorePackage.THROWING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__ANNOTATIONS = CorePackage.THROWING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__NAME = CorePackage.THROWING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__PARAMETERS = CorePackage.THROWING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.THROWING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__IN_INTERACTION_FLOWS = CorePackage.THROWING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__ACTIVATION_EXPRESSION = CorePackage.THROWING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.THROWING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Set Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT_FEATURE_COUNT = CorePackage.THROWING_EVENT_FEATURE_COUNT + 0;


	/**
	 * The number of operations of the '<em>Set Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT_OPERATION_COUNT = CorePackage.THROWING_EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link IFML.Extensions.OnSubmitEvent <em>On Submit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Submit Event</em>'.
	 * @see IFML.Extensions.OnSubmitEvent
	 * @generated
	 */
	EClass getOnSubmitEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rule</em>'.
	 * @see IFML.Extensions.ValidationRule
	 * @generated
	 */
	EClass getValidationRule();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see IFML.Extensions.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Extensions.List#getSelectEvent <em>Select Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select Event</em>'.
	 * @see IFML.Extensions.List#getSelectEvent()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SelectEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see IFML.Extensions.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.UserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Role</em>'.
	 * @see IFML.Extensions.UserRole
	 * @generated
	 */
	EClass getUserRole();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.IFMLSlot <em>IFML Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Slot</em>'.
	 * @see IFML.Extensions.IFMLSlot
	 * @generated
	 */
	EClass getIFMLSlot();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.OnSelectEvent <em>On Select Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Select Event</em>'.
	 * @see IFML.Extensions.OnSelectEvent
	 * @generated
	 */
	EClass getOnSelectEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see IFML.Extensions.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see IFML.Extensions.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see IFML.Extensions.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.SelectionField <em>Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Field</em>'.
	 * @see IFML.Extensions.SelectionField
	 * @generated
	 */
	EClass getSelectionField();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Extensions.SelectionField#isIsMultiSelection <em>Is Multi Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Selection</em>'.
	 * @see IFML.Extensions.SelectionField#isIsMultiSelection()
	 * @see #getSelectionField()
	 * @generated
	 */
	EAttribute getSelectionField_IsMultiSelection();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.SimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Field</em>'.
	 * @see IFML.Extensions.SimpleField
	 * @generated
	 */
	EClass getSimpleField();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Details <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details</em>'.
	 * @see IFML.Extensions.Details
	 * @generated
	 */
	EClass getDetails();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.IFMLWindow <em>IFML Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Window</em>'.
	 * @see IFML.Extensions.IFMLWindow
	 * @generated
	 */
	EClass getIFMLWindow();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Extensions.IFMLWindow#isIsModal <em>Is Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modal</em>'.
	 * @see IFML.Extensions.IFMLWindow#isIsModal()
	 * @see #getIFMLWindow()
	 * @generated
	 */
	EAttribute getIFMLWindow_IsModal();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Extensions.IFMLWindow#isIsNewWindow <em>Is New Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is New Window</em>'.
	 * @see IFML.Extensions.IFMLWindow#isIsNewWindow()
	 * @see #getIFMLWindow()
	 * @generated
	 */
	EAttribute getIFMLWindow_IsNewWindow();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.OnLoadEvent <em>On Load Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Load Event</em>'.
	 * @see IFML.Extensions.OnLoadEvent
	 * @generated
	 */
	EClass getOnLoadEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.IFMLMenu <em>IFML Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Menu</em>'.
	 * @see IFML.Extensions.IFMLMenu
	 * @generated
	 */
	EClass getIFMLMenu();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.JumpEvent <em>Jump Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Event</em>'.
	 * @see IFML.Extensions.JumpEvent
	 * @generated
	 */
	EClass getJumpEvent();

	/**
	 * Returns the meta object for the reference '{@link IFML.Extensions.JumpEvent#getLandingEvent <em>Landing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Landing Event</em>'.
	 * @see IFML.Extensions.JumpEvent#getLandingEvent()
	 * @see #getJumpEvent()
	 * @generated
	 */
	EReference getJumpEvent_LandingEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.LandingEvent <em>Landing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landing Event</em>'.
	 * @see IFML.Extensions.LandingEvent
	 * @generated
	 */
	EClass getLandingEvent();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Extensions.LandingEvent#getJumpingEvents <em>Jumping Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Jumping Events</em>'.
	 * @see IFML.Extensions.LandingEvent#getJumpingEvents()
	 * @see #getLandingEvent()
	 * @generated
	 */
	EReference getLandingEvent_JumpingEvents();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.SetContextEvent <em>Set Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Context Event</em>'.
	 * @see IFML.Extensions.SetContextEvent
	 * @generated
	 */
	EClass getSetContextEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionsFactory getExtensionsFactory();

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
		 * The meta object literal for the '{@link IFML.Extensions.impl.OnSubmitEventImpl <em>On Submit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.OnSubmitEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnSubmitEvent()
		 * @generated
		 */
		EClass ON_SUBMIT_EVENT = eINSTANCE.getOnSubmitEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.ValidationRuleImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getValidationRule()
		 * @generated
		 */
		EClass VALIDATION_RULE = eINSTANCE.getValidationRule();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.ListImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Select Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__SELECT_EVENT = eINSTANCE.getList_SelectEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.PositionImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.UserRoleImpl <em>User Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.UserRoleImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getUserRole()
		 * @generated
		 */
		EClass USER_ROLE = eINSTANCE.getUserRole();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.IFMLSlotImpl <em>IFML Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.IFMLSlotImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLSlot()
		 * @generated
		 */
		EClass IFML_SLOT = eINSTANCE.getIFMLSlot();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.OnSelectEventImpl <em>On Select Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.OnSelectEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnSelectEvent()
		 * @generated
		 */
		EClass ON_SELECT_EVENT = eINSTANCE.getOnSelectEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.FieldImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.FormImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.DeviceImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.SelectionFieldImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSelectionField()
		 * @generated
		 */
		EClass SELECTION_FIELD = eINSTANCE.getSelectionField();

		/**
		 * The meta object literal for the '<em><b>Is Multi Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_FIELD__IS_MULTI_SELECTION = eINSTANCE.getSelectionField_IsMultiSelection();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.SimpleFieldImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSimpleField()
		 * @generated
		 */
		EClass SIMPLE_FIELD = eINSTANCE.getSimpleField();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.DetailsImpl <em>Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.DetailsImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getDetails()
		 * @generated
		 */
		EClass DETAILS = eINSTANCE.getDetails();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.IFMLWindowImpl <em>IFML Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.IFMLWindowImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLWindow()
		 * @generated
		 */
		EClass IFML_WINDOW = eINSTANCE.getIFMLWindow();

		/**
		 * The meta object literal for the '<em><b>Is Modal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFML_WINDOW__IS_MODAL = eINSTANCE.getIFMLWindow_IsModal();

		/**
		 * The meta object literal for the '<em><b>Is New Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFML_WINDOW__IS_NEW_WINDOW = eINSTANCE.getIFMLWindow_IsNewWindow();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.OnLoadEventImpl <em>On Load Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.OnLoadEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnLoadEvent()
		 * @generated
		 */
		EClass ON_LOAD_EVENT = eINSTANCE.getOnLoadEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.IFMLMenuImpl <em>IFML Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.IFMLMenuImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLMenu()
		 * @generated
		 */
		EClass IFML_MENU = eINSTANCE.getIFMLMenu();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.JumpEventImpl <em>Jump Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.JumpEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getJumpEvent()
		 * @generated
		 */
		EClass JUMP_EVENT = eINSTANCE.getJumpEvent();

		/**
		 * The meta object literal for the '<em><b>Landing Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_EVENT__LANDING_EVENT = eINSTANCE.getJumpEvent_LandingEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.LandingEventImpl <em>Landing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.LandingEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getLandingEvent()
		 * @generated
		 */
		EClass LANDING_EVENT = eINSTANCE.getLandingEvent();

		/**
		 * The meta object literal for the '<em><b>Jumping Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_EVENT__JUMPING_EVENTS = eINSTANCE.getLandingEvent_JumpingEvents();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.SetContextEventImpl <em>Set Context Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.SetContextEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSetContextEvent()
		 * @generated
		 */
		EClass SET_CONTEXT_EVENT = eINSTANCE.getSetContextEvent();

	}

} //ExtensionsPackage
