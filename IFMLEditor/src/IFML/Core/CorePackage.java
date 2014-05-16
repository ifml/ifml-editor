/**
 */
package IFML.Core;

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
 * @see IFML.Core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/20130218/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = IFML.Core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANNOTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowModelElementImpl <em>Interaction Flow Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowModelElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowModelElement()
	 * @generated
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS = ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Interaction Flow Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Flow Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowImpl <em>Interaction Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlow()
	 * @generated
	 */
	int INTERACTION_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interaction Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interaction Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LANGUAGE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__BODY = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowExpressionImpl <em>Interaction Flow Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowExpression()
	 * @generated
	 */
	int INTERACTION_FLOW_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__CONSTRAINTS = EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__BODY = EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Interaction Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Flow Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interaction Flow Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.NamedElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONSTRAINTS = ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowElementImpl <em>Interaction Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowElement()
	 * @generated
	 */
	int INTERACTION_FLOW_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interaction Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interaction Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.EventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ACTIVATION_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INTERACTION_FLOW_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.CatchingEventImpl <em>Catching Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.CatchingEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getCatchingEvent()
	 * @generated
	 */
	int CATCHING_EVENT = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__CONSTRAINTS = EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__ANNOTATIONS = EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__PARAMETERS = EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__IN_INTERACTION_FLOWS = EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__ACTIVATION_EXPRESSION = EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION = EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Catching Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catching Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.SystemEventImpl <em>System Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.SystemEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getSystemEvent()
	 * @generated
	 */
	int SYSTEM_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__ID = CATCHING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__CONSTRAINTS = CATCHING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__ANNOTATIONS = CATCHING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__NAME = CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__PARAMETERS = CATCHING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__OUT_INTERACTION_FLOWS = CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__IN_INTERACTION_FLOWS = CATCHING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__ACTIVATION_EXPRESSION = CATCHING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION = CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__TRIGGERING_EXPRESSIONS = CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__TYPE = CATCHING_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT_FEATURE_COUNT = CATCHING_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT_OPERATION_COUNT = CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ParameterBindingImpl
	 * @see IFML.Core.impl.CorePackageImpl#getParameterBinding()
	 * @generated
	 */
	int PARAMETER_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__SOURCE_PARAMETER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__TARGET_PARAMETER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ActionEventImpl <em>Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ActionEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getActionEvent()
	 * @generated
	 */
	int ACTION_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__ID = CATCHING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__CONSTRAINTS = CATCHING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__ANNOTATIONS = CATCHING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__NAME = CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__PARAMETERS = CATCHING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__OUT_INTERACTION_FLOWS = CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__IN_INTERACTION_FLOWS = CATCHING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__ACTIVATION_EXPRESSION = CATCHING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__INTERACTION_FLOW_EXPRESSION = CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT_FEATURE_COUNT = CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT_OPERATION_COUNT = CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DomainModelImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Domain Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__DOMAIN_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.PortDefinitionImpl <em>Port Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.PortDefinitionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getPortDefinition()
	 * @generated
	 */
	int PORT_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__PORTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewComponentPartImpl <em>View Component Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewComponentPartImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewComponentPart()
	 * @generated
	 */
	int VIEW_COMPONENT_PART = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View Component Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>View Component Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ContentBindingImpl <em>Content Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ContentBindingImpl
	 * @see IFML.Core.impl.CorePackageImpl#getContentBinding()
	 * @generated
	 */
	int CONTENT_BINDING = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__ID = VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__CONSTRAINTS = VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__ANNOTATIONS = VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__NAME = VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__PARAMETERS = VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__OUT_INTERACTION_FLOWS = VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__IN_INTERACTION_FLOWS = VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__VIEW_ELEMENT_EVENTS = VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__ACTIVATION_EXPRESSION = VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__PARENT_VIEW_COMPONENT_PART = VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__SUB_VIEW_COMPONENT_PARTS = VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Uniform Resource Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER = VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING_FEATURE_COUNT = VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Content Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING_OPERATION_COUNT = VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewElementImpl <em>View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewElement()
	 * @generated
	 */
	int VIEW_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__VIEW_ELEMENT_EVENTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__ACTIVATION_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__VIEW_CONTAINER = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DynamicBehaviorImpl <em>Dynamic Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DynamicBehaviorImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDynamicBehavior()
	 * @generated
	 */
	int DYNAMIC_BEHAVIOR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__ID = CONTENT_BINDING__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__CONSTRAINTS = CONTENT_BINDING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__ANNOTATIONS = CONTENT_BINDING__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__NAME = CONTENT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__PARAMETERS = CONTENT_BINDING__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__OUT_INTERACTION_FLOWS = CONTENT_BINDING__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__IN_INTERACTION_FLOWS = CONTENT_BINDING__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__VIEW_ELEMENT_EVENTS = CONTENT_BINDING__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__ACTIVATION_EXPRESSION = CONTENT_BINDING__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__PARENT_VIEW_COMPONENT_PART = CONTENT_BINDING__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__SUB_VIEW_COMPONENT_PARTS = CONTENT_BINDING__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Uniform Resource Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__UNIFORM_RESOURCE_IDENTIFIER = CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Behavioral Feature Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT = CONTENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT = CONTENT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR_FEATURE_COUNT = CONTENT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dynamic Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR_OPERATION_COUNT = CONTENT_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewpointImpl <em>Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewpointImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewpoint()
	 * @generated
	 */
	int VIEWPOINT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DataFlowImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ID = INTERACTION_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__CONSTRAINTS = INTERACTION_FLOW__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ANNOTATIONS = INTERACTION_FLOW__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW__PARAMETER_BINDING_GROUP;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = INTERACTION_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = INTERACTION_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewContainerImpl <em>View Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewContainerImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewContainer()
	 * @generated
	 */
	int VIEW_CONTAINER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__ID = VIEW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__CONSTRAINTS = VIEW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__ANNOTATIONS = VIEW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__NAME = VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__PARAMETERS = VIEW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__OUT_INTERACTION_FLOWS = VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IN_INTERACTION_FLOWS = VIEW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEW_ELEMENT_EVENTS = VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__ACTIVATION_EXPRESSION = VIEW_ELEMENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEW_CONTAINER = VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IS_LANDMARK = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IS_DEFAULT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IS_XOR = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEW_ELEMENTS = VIEW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__ACTIONS = VIEW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.BooleanExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__CONSTRAINTS = EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__BODY = EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ActivationExpressionImpl <em>Activation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ActivationExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getActivationExpression()
	 * @generated
	 */
	int ACTIVATION_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__ID = BOOLEAN_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__CONSTRAINTS = BOOLEAN_EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__ANNOTATIONS = BOOLEAN_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__LANGUAGE = BOOLEAN_EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__BODY = BOOLEAN_EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Activation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowModelImpl <em>Interaction Flow Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowModelImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowModel()
	 * @generated
	 */
	int INTERACTION_FLOW_MODEL = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Flow Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interaction Flow Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ContextDimensionImpl <em>Context Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ContextDimensionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getContextDimension()
	 * @generated
	 */
	int CONTEXT_DIMENSION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Context Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLModelImpl <em>IFML Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLModelImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLModel()
	 * @generated
	 */
	int IFML_MODEL = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__INTERACTION_FLOW_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__DOMAIN_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Viewpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IFML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IFML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ModularizationElementImpl <em>Modularization Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ModularizationElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getModularizationElement()
	 * @generated
	 */
	int MODULARIZATION_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__MODULE_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modularization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modularization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ModuleDefinitionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getModuleDefinition()
	 * @generated
	 */
	int MODULE_DEFINITION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__ID = MODULARIZATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__CONSTRAINTS = MODULARIZATION_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__ANNOTATIONS = MODULARIZATION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__NAME = MODULARIZATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__MODULE_PACKAGE = MODULARIZATION_ELEMENT__MODULE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__INPUT_PORTS = MODULARIZATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__OUTPUT_PORTS = MODULARIZATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT = MODULARIZATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__MODULES = MODULARIZATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__ACTIVITY_CONCEPT = MODULARIZATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION_FEATURE_COUNT = MODULARIZATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION_OPERATION_COUNT = MODULARIZATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLActionImpl <em>IFML Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLActionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLAction()
	 * @generated
	 */
	int IFML_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__ACTION_EVENTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__DYNAMIC_BEHAVIOR = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__VIEW_CONTAINER = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IFML Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IFML Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.NavigationFlowImpl <em>Navigation Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.NavigationFlowImpl
	 * @see IFML.Core.impl.CorePackageImpl#getNavigationFlow()
	 * @generated
	 */
	int NAVIGATION_FLOW = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__ID = INTERACTION_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__CONSTRAINTS = INTERACTION_FLOW__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__ANNOTATIONS = INTERACTION_FLOW__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW__PARAMETER_BINDING_GROUP;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Navigation Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW_FEATURE_COUNT = INTERACTION_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Navigation Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW_OPERATION_COUNT = INTERACTION_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ParameterBindingGroupImpl <em>Parameter Binding Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ParameterBindingGroupImpl
	 * @see IFML.Core.impl.CorePackageImpl#getParameterBindingGroup()
	 * @generated
	 */
	int PARAMETER_BINDING_GROUP = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__PARAMETER_BINDINGS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Binding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Binding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ConstraintImpl
	 * @see IFML.Core.impl.CorePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = BOOLEAN_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINTS = BOOLEAN_EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ANNOTATIONS = BOOLEAN_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LANGUAGE = BOOLEAN_EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = BOOLEAN_EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewComponentImpl <em>View Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewComponentImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewComponent()
	 * @generated
	 */
	int VIEW_COMPONENT = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__ID = VIEW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__CONSTRAINTS = VIEW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__ANNOTATIONS = VIEW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__NAME = VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__PARAMETERS = VIEW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__OUT_INTERACTION_FLOWS = VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__IN_INTERACTION_FLOWS = VIEW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VIEW_ELEMENT_EVENTS = VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__ACTIVATION_EXPRESSION = VIEW_ELEMENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VIEW_CONTAINER = VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VIEW_COMPONENT_PARTS = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLParameterImpl <em>IFML Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLParameterImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLParameter()
	 * @generated
	 */
	int IFML_PARAMETER = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__NAME = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__DIRECTION = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__DEFAULT_VALUE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IFML Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IFML Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DataBindingImpl <em>Data Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DataBindingImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDataBinding()
	 * @generated
	 */
	int DATA_BINDING = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__ID = CONTENT_BINDING__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__CONSTRAINTS = CONTENT_BINDING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__ANNOTATIONS = CONTENT_BINDING__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__NAME = CONTENT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__PARAMETERS = CONTENT_BINDING__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__OUT_INTERACTION_FLOWS = CONTENT_BINDING__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__IN_INTERACTION_FLOWS = CONTENT_BINDING__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__VIEW_ELEMENT_EVENTS = CONTENT_BINDING__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__ACTIVATION_EXPRESSION = CONTENT_BINDING__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__PARENT_VIEW_COMPONENT_PART = CONTENT_BINDING__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__SUB_VIEW_COMPONENT_PARTS = CONTENT_BINDING__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Uniform Resource Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__UNIFORM_RESOURCE_IDENTIFIER = CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__CONDITIONAL_EXPRESSION = CONTENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualization Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__VISUALIZATION_ATTRIBUTE = CONTENT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Context Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__DATA_CONTEXT_VARIABLES = CONTENT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__DOMAIN_CONCEPT = CONTENT_BINDING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_FEATURE_COUNT = CONTENT_BINDING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_OPERATION_COUNT = CONTENT_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ConditionalExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__CONSTRAINTS = EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__BODY = EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART = EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS = EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ContextImpl
	 * @see IFML.Core.impl.CorePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONSTRAINTS = ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Context Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_DIMENSIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_VARIABLES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.VisualizationAttributeImpl <em>Visualization Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.VisualizationAttributeImpl
	 * @see IFML.Core.impl.CorePackageImpl#getVisualizationAttribute()
	 * @generated
	 */
	int VISUALIZATION_ATTRIBUTE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__ID = VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__CONSTRAINTS = VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__ANNOTATIONS = VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__NAME = VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__PARAMETERS = VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__OUT_INTERACTION_FLOWS = VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__IN_INTERACTION_FLOWS = VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__VIEW_ELEMENT_EVENTS = VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__ACTIVATION_EXPRESSION = VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__PARENT_VIEW_COMPONENT_PART = VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__SUB_VIEW_COMPONENT_PARTS = VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Feature Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT = VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visualization Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE_FEATURE_COUNT = VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visualization Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE_OPERATION_COUNT = VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewElementEventImpl <em>View Element Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewElementEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewElementEvent()
	 * @generated
	 */
	int VIEW_ELEMENT_EVENT = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__ID = CATCHING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__CONSTRAINTS = CATCHING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__ANNOTATIONS = CATCHING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__NAME = CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__PARAMETERS = CATCHING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS = CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS = CATCHING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION = CATCHING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION = CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__VIEW_ELEMENT = CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT_FEATURE_COUNT = CATCHING_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT_OPERATION_COUNT = CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.AnnotationImpl
	 * @see IFML.Core.impl.CorePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 37;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ModulePackageImpl <em>Module Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ModulePackageImpl
	 * @see IFML.Core.impl.CorePackageImpl#getModulePackage()
	 * @generated
	 */
	int MODULE_PACKAGE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__ID = MODULARIZATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__CONSTRAINTS = MODULARIZATION_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__ANNOTATIONS = MODULARIZATION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__NAME = MODULARIZATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__MODULE_PACKAGE = MODULARIZATION_ELEMENT__MODULE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modularization Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__MODULARIZATION_ELEMENTS = MODULARIZATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE_FEATURE_COUNT = MODULARIZATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE_OPERATION_COUNT = MODULARIZATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLModuleImpl <em>IFML Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLModuleImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLModule()
	 * @generated
	 */
	int IFML_MODULE = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__OUT_INTERACTION_FLOWS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__IN_INTERACTION_FLOWS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__MODULE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__PORTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>IFML Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>IFML Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLPortImpl <em>IFML Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLPortImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLPort()
	 * @generated
	 */
	int IFML_PORT = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Port Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__PORT_DEFINITION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__MODULE = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IFML Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IFML Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ThrowingEventImpl <em>Throwing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ThrowingEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getThrowingEvent()
	 * @generated
	 */
	int THROWING_EVENT = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__CONSTRAINTS = EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__ANNOTATIONS = EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__PARAMETERS = EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__IN_INTERACTION_FLOWS = EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__ACTIVATION_EXPRESSION = EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__INTERACTION_FLOW_EXPRESSION = EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Throwing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Throwing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ActivityConceptImpl <em>Activity Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ActivityConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getActivityConcept()
	 * @generated
	 */
	int ACTIVITY_CONCEPT = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__MODULE_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.BPMNActivityConceptImpl <em>BPMN Activity Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.BPMNActivityConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getBPMNActivityConcept()
	 * @generated
	 */
	int BPMN_ACTIVITY_CONCEPT = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__ID = ACTIVITY_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__CONSTRAINTS = ACTIVITY_CONCEPT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__ANNOTATIONS = ACTIVITY_CONCEPT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__NAME = ACTIVITY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Module Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__MODULE_DEFINITION = ACTIVITY_CONCEPT__MODULE_DEFINITION;

	/**
	 * The number of structural features of the '<em>BPMN Activity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT_FEATURE_COUNT = ACTIVITY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BPMN Activity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT_OPERATION_COUNT = ACTIVITY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ContextVariableImpl <em>Context Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ContextVariableImpl
	 * @see IFML.Core.impl.CorePackageImpl#getContextVariable()
	 * @generated
	 */
	int CONTEXT_VARIABLE = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__SCOPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.SimpleContextVariableImpl <em>Simple Context Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.SimpleContextVariableImpl
	 * @see IFML.Core.impl.CorePackageImpl#getSimpleContextVariable()
	 * @generated
	 */
	int SIMPLE_CONTEXT_VARIABLE = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__ID = CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__CONSTRAINTS = CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__ANNOTATIONS = CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__NAME = CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__CONTEXT = CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__SCOPE = CONTEXT_VARIABLE__SCOPE;

	/**
	 * The number of structural features of the '<em>Simple Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE_FEATURE_COUNT = CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE_OPERATION_COUNT = CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DataContextVariableImpl <em>Data Context Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DataContextVariableImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDataContextVariable()
	 * @generated
	 */
	int DATA_CONTEXT_VARIABLE = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__ID = CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__CONSTRAINTS = CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__ANNOTATIONS = CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__NAME = CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__CONTEXT = CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__SCOPE = CONTEXT_VARIABLE__SCOPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__DATA_BINDING = CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE_FEATURE_COUNT = CONTEXT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE_OPERATION_COUNT = CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DomainElementImpl <em>Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DomainElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDomainElement()
	 * @generated
	 */
	int DOMAIN_ELEMENT = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DomainConceptImpl <em>Domain Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DomainConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDomainConcept()
	 * @generated
	 */
	int DOMAIN_CONCEPT = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__ID = DOMAIN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__CONSTRAINTS = DOMAIN_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__ANNOTATIONS = DOMAIN_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__DATA_BINDING = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.FeatureConceptImpl <em>Feature Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.FeatureConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getFeatureConcept()
	 * @generated
	 */
	int FEATURE_CONCEPT = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__ID = DOMAIN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__CONSTRAINTS = DOMAIN_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__ANNOTATIONS = DOMAIN_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visualization Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.BehaviorConceptImpl <em>Behavior Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.BehaviorConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getBehaviorConcept()
	 * @generated
	 */
	int BEHAVIOR_CONCEPT = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__ID = DOMAIN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__CONSTRAINTS = DOMAIN_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__ANNOTATIONS = DOMAIN_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavior Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.BehavioralFeatureConceptImpl <em>Behavioral Feature Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.BehavioralFeatureConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getBehavioralFeatureConcept()
	 * @generated
	 */
	int BEHAVIORAL_FEATURE_CONCEPT = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__ID = DOMAIN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__CONSTRAINTS = DOMAIN_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__ANNOTATIONS = DOMAIN_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavioral Feature Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavioral Feature Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.UMLBehaviorImpl <em>UML Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.UMLBehaviorImpl
	 * @see IFML.Core.impl.CorePackageImpl#getUMLBehavior()
	 * @generated
	 */
	int UML_BEHAVIOR = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__ID = BEHAVIOR_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__CONSTRAINTS = BEHAVIOR_CONCEPT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__ANNOTATIONS = BEHAVIOR_CONCEPT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__NAME = BEHAVIOR_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__DYNAMIC_BEHAVIOR = BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__BEHAVIOR = BEHAVIOR_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.UMLBehavioralFeatureImpl <em>UML Behavioral Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.UMLBehavioralFeatureImpl
	 * @see IFML.Core.impl.CorePackageImpl#getUMLBehavioralFeature()
	 * @generated
	 */
	int UML_BEHAVIORAL_FEATURE = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__ID = BEHAVIORAL_FEATURE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__CONSTRAINTS = BEHAVIORAL_FEATURE_CONCEPT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__ANNOTATIONS = BEHAVIORAL_FEATURE_CONCEPT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__NAME = BEHAVIORAL_FEATURE_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__DYNAMIC_BEHAVIOR = BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE = BEHAVIORAL_FEATURE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE_FEATURE_COUNT = BEHAVIORAL_FEATURE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE_OPERATION_COUNT = BEHAVIORAL_FEATURE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.UMLDomainConceptImpl <em>UML Domain Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.UMLDomainConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getUMLDomainConcept()
	 * @generated
	 */
	int UML_DOMAIN_CONCEPT = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__ID = DOMAIN_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__CONSTRAINTS = DOMAIN_CONCEPT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__ANNOTATIONS = DOMAIN_CONCEPT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__NAME = DOMAIN_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__DATA_BINDING = DOMAIN_CONCEPT__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__CLASSIFIER = DOMAIN_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Domain Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT_FEATURE_COUNT = DOMAIN_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Domain Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT_OPERATION_COUNT = DOMAIN_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.UMLStructuralFeatureImpl <em>UML Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.UMLStructuralFeatureImpl
	 * @see IFML.Core.impl.CorePackageImpl#getUMLStructuralFeature()
	 * @generated
	 */
	int UML_STRUCTURAL_FEATURE = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__ID = FEATURE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__CONSTRAINTS = FEATURE_CONCEPT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__ANNOTATIONS = FEATURE_CONCEPT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__NAME = FEATURE_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Visualization Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__VISUALIZATION_ATTRIBUTE = FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__STRUCTURAL_FEATURE = FEATURE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE_FEATURE_COUNT = FEATURE_CONCEPT_FEATURE_COUNT + 1;


	/**
	 * The number of operations of the '<em>UML Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE_OPERATION_COUNT = FEATURE_CONCEPT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlow <em>Interaction Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow</em>'.
	 * @see IFML.Core.InteractionFlow
	 * @generated
	 */
	EClass getInteractionFlow();

	/**
	 * Returns the meta object for the containment reference '{@link IFML.Core.InteractionFlow#getParameterBindingGroup <em>Parameter Binding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Binding Group</em>'.
	 * @see IFML.Core.InteractionFlow#getParameterBindingGroup()
	 * @see #getInteractionFlow()
	 * @generated
	 */
	EReference getInteractionFlow_ParameterBindingGroup();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.InteractionFlow#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Interaction Flow Element</em>'.
	 * @see IFML.Core.InteractionFlow#getSourceInteractionFlowElement()
	 * @see #getInteractionFlow()
	 * @generated
	 */
	EReference getInteractionFlow_SourceInteractionFlowElement();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.InteractionFlow#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Interaction Flow Element</em>'.
	 * @see IFML.Core.InteractionFlow#getTargetInteractionFlowElement()
	 * @see #getInteractionFlow()
	 * @generated
	 */
	EReference getInteractionFlow_TargetInteractionFlowElement();

	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlowExpression <em>Interaction Flow Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Expression</em>'.
	 * @see IFML.Core.InteractionFlowExpression
	 * @generated
	 */
	EClass getInteractionFlowExpression();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.InteractionFlowExpression#getInteractionFlow <em>Interaction Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Flow</em>'.
	 * @see IFML.Core.InteractionFlowExpression#getInteractionFlow()
	 * @see #getInteractionFlowExpression()
	 * @generated
	 */
	EReference getInteractionFlowExpression_InteractionFlow();

	/**
	 * Returns the meta object for class '{@link IFML.Core.SystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Event</em>'.
	 * @see IFML.Core.SystemEvent
	 * @generated
	 */
	EClass getSystemEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.SystemEvent#getTriggeringExpressions <em>Triggering Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggering Expressions</em>'.
	 * @see IFML.Core.SystemEvent#getTriggeringExpressions()
	 * @see #getSystemEvent()
	 * @generated
	 */
	EReference getSystemEvent_TriggeringExpressions();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.SystemEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see IFML.Core.SystemEvent#getType()
	 * @see #getSystemEvent()
	 * @generated
	 */
	EAttribute getSystemEvent_Type();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding</em>'.
	 * @see IFML.Core.ParameterBinding
	 * @generated
	 */
	EClass getParameterBinding();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ParameterBinding#getSourceParameter <em>Source Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Parameter</em>'.
	 * @see IFML.Core.ParameterBinding#getSourceParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_SourceParameter();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ParameterBinding#getTargetParameter <em>Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Parameter</em>'.
	 * @see IFML.Core.ParameterBinding#getTargetParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_TargetParameter();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Event</em>'.
	 * @see IFML.Core.ActionEvent
	 * @generated
	 */
	EClass getActionEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see IFML.Core.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.DomainModel#getDomainElements <em>Domain Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Elements</em>'.
	 * @see IFML.Core.DomainModel#getDomainElements()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_DomainElements();

	/**
	 * Returns the meta object for class '{@link IFML.Core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see IFML.Core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see IFML.Core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link IFML.Core.PortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Definition</em>'.
	 * @see IFML.Core.PortDefinition
	 * @generated
	 */
	EClass getPortDefinition();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.PortDefinition#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see IFML.Core.PortDefinition#getPorts()
	 * @see #getPortDefinition()
	 * @generated
	 */
	EReference getPortDefinition_Ports();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ContentBinding <em>Content Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Binding</em>'.
	 * @see IFML.Core.ContentBinding
	 * @generated
	 */
	EClass getContentBinding();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ContentBinding#getUniformResourceIdentifier <em>Uniform Resource Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniform Resource Identifier</em>'.
	 * @see IFML.Core.ContentBinding#getUniformResourceIdentifier()
	 * @see #getContentBinding()
	 * @generated
	 */
	EAttribute getContentBinding_UniformResourceIdentifier();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element</em>'.
	 * @see IFML.Core.ViewElement
	 * @generated
	 */
	EClass getViewElement();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewElement#getViewElementEvents <em>View Element Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Element Events</em>'.
	 * @see IFML.Core.ViewElement#getViewElementEvents()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_ViewElementEvents();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ViewElement#getActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Expression</em>'.
	 * @see IFML.Core.ViewElement#getActivationExpression()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_ActivationExpression();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.ViewElement#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View Container</em>'.
	 * @see IFML.Core.ViewElement#getViewContainer()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_ViewContainer();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see IFML.Core.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.Expression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see IFML.Core.Expression#getLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Language();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.Expression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see IFML.Core.Expression#getBody()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Body();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Behavior</em>'.
	 * @see IFML.Core.DynamicBehavior
	 * @generated
	 */
	EClass getDynamicBehavior();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DynamicBehavior#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavioral Feature Concept</em>'.
	 * @see IFML.Core.DynamicBehavior#getBehavioralFeatureConcept()
	 * @see #getDynamicBehavior()
	 * @generated
	 */
	EReference getDynamicBehavior_BehavioralFeatureConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DynamicBehavior#getBehaviorConcept <em>Behavior Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior Concept</em>'.
	 * @see IFML.Core.DynamicBehavior#getBehaviorConcept()
	 * @see #getDynamicBehavior()
	 * @generated
	 */
	EReference getDynamicBehavior_BehaviorConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint</em>'.
	 * @see IFML.Core.Viewpoint
	 * @generated
	 */
	EClass getViewpoint();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.Viewpoint#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Flow Model Elements</em>'.
	 * @see IFML.Core.Viewpoint#getInteractionFlowModelElements()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_InteractionFlowModelElements();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.Viewpoint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see IFML.Core.Viewpoint#getContext()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Context();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see IFML.Core.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewComponentPart <em>View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Component Part</em>'.
	 * @see IFML.Core.ViewComponentPart
	 * @generated
	 */
	EClass getViewComponentPart();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewComponentPart#getViewElementEvents <em>View Element Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Element Events</em>'.
	 * @see IFML.Core.ViewComponentPart#getViewElementEvents()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_ViewElementEvents();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ViewComponentPart#getActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Expression</em>'.
	 * @see IFML.Core.ViewComponentPart#getActivationExpression()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_ActivationExpression();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent View Component Part</em>'.
	 * @see IFML.Core.ViewComponentPart#getParentViewComponentPart()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_ParentViewComponentPart();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewComponentPart#getSubViewComponentParts <em>Sub View Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub View Component Parts</em>'.
	 * @see IFML.Core.ViewComponentPart#getSubViewComponentParts()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_SubViewComponentParts();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Container</em>'.
	 * @see IFML.Core.ViewContainer
	 * @generated
	 */
	EClass getViewContainer();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ViewContainer#isIsLandmark <em>Is Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Landmark</em>'.
	 * @see IFML.Core.ViewContainer#isIsLandmark()
	 * @see #getViewContainer()
	 * @generated
	 */
	EAttribute getViewContainer_IsLandmark();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ViewContainer#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see IFML.Core.ViewContainer#isIsDefault()
	 * @see #getViewContainer()
	 * @generated
	 */
	EAttribute getViewContainer_IsDefault();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ViewContainer#isIsXOR <em>Is XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is XOR</em>'.
	 * @see IFML.Core.ViewContainer#isIsXOR()
	 * @see #getViewContainer()
	 * @generated
	 */
	EAttribute getViewContainer_IsXOR();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewContainer#getViewElements <em>View Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Elements</em>'.
	 * @see IFML.Core.ViewContainer#getViewElements()
	 * @see #getViewContainer()
	 * @generated
	 */
	EReference getViewContainer_ViewElements();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see IFML.Core.ViewContainer#getActions()
	 * @see #getViewContainer()
	 * @generated
	 */
	EReference getViewContainer_Actions();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Expression</em>'.
	 * @see IFML.Core.ActivationExpression
	 * @generated
	 */
	EClass getActivationExpression();

	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlowModel <em>Interaction Flow Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Model</em>'.
	 * @see IFML.Core.InteractionFlowModel
	 * @generated
	 */
	EClass getInteractionFlowModel();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.InteractionFlowModel#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Flow Model Elements</em>'.
	 * @see IFML.Core.InteractionFlowModel#getInteractionFlowModelElements()
	 * @see #getInteractionFlowModel()
	 * @generated
	 */
	EReference getInteractionFlowModel_InteractionFlowModelElements();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ContextDimension <em>Context Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Dimension</em>'.
	 * @see IFML.Core.ContextDimension
	 * @generated
	 */
	EClass getContextDimension();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLModel <em>IFML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Model</em>'.
	 * @see IFML.Core.IFMLModel
	 * @generated
	 */
	EClass getIFMLModel();

	/**
	 * Returns the meta object for the containment reference '{@link IFML.Core.IFMLModel#getInteractionFlowModel <em>Interaction Flow Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction Flow Model</em>'.
	 * @see IFML.Core.IFMLModel#getInteractionFlowModel()
	 * @see #getIFMLModel()
	 * @generated
	 */
	EReference getIFMLModel_InteractionFlowModel();

	/**
	 * Returns the meta object for the containment reference '{@link IFML.Core.IFMLModel#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Model</em>'.
	 * @see IFML.Core.IFMLModel#getDomainModel()
	 * @see #getIFMLModel()
	 * @generated
	 */
	EReference getIFMLModel_DomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.IFMLModel#getInteractionFlowModelViewpoint <em>Interaction Flow Model Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Flow Model Viewpoint</em>'.
	 * @see IFML.Core.IFMLModel#getInteractionFlowModelViewpoint()
	 * @see #getIFMLModel()
	 * @generated
	 */
	EReference getIFMLModel_InteractionFlowModelViewpoint();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Definition</em>'.
	 * @see IFML.Core.ModuleDefinition
	 * @generated
	 */
	EClass getModuleDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ModuleDefinition#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see IFML.Core.ModuleDefinition#getInputPorts()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_InputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ModuleDefinition#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see IFML.Core.ModuleDefinition#getOutputPorts()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_OutputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ModuleDefinition#getInteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Flow Model Element</em>'.
	 * @see IFML.Core.ModuleDefinition#getInteractionFlowModelElement()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_InteractionFlowModelElement();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.ModuleDefinition#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see IFML.Core.ModuleDefinition#getModules()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_Modules();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ModuleDefinition#getActivityConcept <em>Activity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Concept</em>'.
	 * @see IFML.Core.ModuleDefinition#getActivityConcept()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_ActivityConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see IFML.Core.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlowElement <em>Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Element</em>'.
	 * @see IFML.Core.InteractionFlowElement
	 * @generated
	 */
	EClass getInteractionFlowElement();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.InteractionFlowElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see IFML.Core.InteractionFlowElement#getParameters()
	 * @see #getInteractionFlowElement()
	 * @generated
	 */
	EReference getInteractionFlowElement_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Interaction Flows</em>'.
	 * @see IFML.Core.InteractionFlowElement#getOutInteractionFlows()
	 * @see #getInteractionFlowElement()
	 * @generated
	 */
	EReference getInteractionFlowElement_OutInteractionFlows();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.InteractionFlowElement#getInInteractionFlows <em>In Interaction Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Interaction Flows</em>'.
	 * @see IFML.Core.InteractionFlowElement#getInInteractionFlows()
	 * @see #getInteractionFlowElement()
	 * @generated
	 */
	EReference getInteractionFlowElement_InInteractionFlows();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLAction <em>IFML Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Action</em>'.
	 * @see IFML.Core.IFMLAction
	 * @generated
	 */
	EClass getIFMLAction();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.IFMLAction#getActionEvents <em>Action Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Events</em>'.
	 * @see IFML.Core.IFMLAction#getActionEvents()
	 * @see #getIFMLAction()
	 * @generated
	 */
	EReference getIFMLAction_ActionEvents();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLAction#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Behavior</em>'.
	 * @see IFML.Core.IFMLAction#getDynamicBehavior()
	 * @see #getIFMLAction()
	 * @generated
	 */
	EReference getIFMLAction_DynamicBehavior();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.IFMLAction#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View Container</em>'.
	 * @see IFML.Core.IFMLAction#getViewContainer()
	 * @see #getIFMLAction()
	 * @generated
	 */
	EReference getIFMLAction_ViewContainer();

	/**
	 * Returns the meta object for class '{@link IFML.Core.NavigationFlow <em>Navigation Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Flow</em>'.
	 * @see IFML.Core.NavigationFlow
	 * @generated
	 */
	EClass getNavigationFlow();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ParameterBindingGroup <em>Parameter Binding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding Group</em>'.
	 * @see IFML.Core.ParameterBindingGroup
	 * @generated
	 */
	EClass getParameterBindingGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ParameterBindingGroup#getParameterBindings <em>Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
	 * @see IFML.Core.ParameterBindingGroup#getParameterBindings()
	 * @see #getParameterBindingGroup()
	 * @generated
	 */
	EReference getParameterBindingGroup_ParameterBindings();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see IFML.Core.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see IFML.Core.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.Element#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see IFML.Core.Element#getConstraints()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.Element#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see IFML.Core.Element#getAnnotations()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Annotations();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see IFML.Core.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Component</em>'.
	 * @see IFML.Core.ViewComponent
	 * @generated
	 */
	EClass getViewComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewComponent#getViewComponentParts <em>View Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Component Parts</em>'.
	 * @see IFML.Core.ViewComponent#getViewComponentParts()
	 * @see #getViewComponent()
	 * @generated
	 */
	EReference getViewComponent_ViewComponentParts();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLParameter <em>IFML Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Parameter</em>'.
	 * @see IFML.Core.IFMLParameter
	 * @generated
	 */
	EClass getIFMLParameter();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.IFMLParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see IFML.Core.IFMLParameter#getDirection()
	 * @see #getIFMLParameter()
	 * @generated
	 */
	EAttribute getIFMLParameter_Direction();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see IFML.Core.IFMLParameter#getDefaultValue()
	 * @see #getIFMLParameter()
	 * @generated
	 */
	EReference getIFMLParameter_DefaultValue();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Binding</em>'.
	 * @see IFML.Core.DataBinding
	 * @generated
	 */
	EClass getDataBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.DataBinding#getConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Expression</em>'.
	 * @see IFML.Core.DataBinding#getConditionalExpression()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_ConditionalExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.DataBinding#getVisualizationAttribute <em>Visualization Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualization Attribute</em>'.
	 * @see IFML.Core.DataBinding#getVisualizationAttribute()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_VisualizationAttribute();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.DataBinding#getDataContextVariables <em>Data Context Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Context Variables</em>'.
	 * @see IFML.Core.DataBinding#getDataContextVariables()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_DataContextVariables();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DataBinding#getDomainConcept <em>Domain Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Concept</em>'.
	 * @see IFML.Core.DataBinding#getDomainConcept()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_DomainConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see IFML.Core.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see IFML.Core.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.Context#getContextDimensions <em>Context Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Dimensions</em>'.
	 * @see IFML.Core.Context#getContextDimensions()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContextDimensions();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.Context#getContextVariables <em>Context Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Variables</em>'.
	 * @see IFML.Core.Context#getContextVariables()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContextVariables();

	/**
	 * Returns the meta object for class '{@link IFML.Core.VisualizationAttribute <em>Visualization Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Attribute</em>'.
	 * @see IFML.Core.VisualizationAttribute
	 * @generated
	 */
	EClass getVisualizationAttribute();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.VisualizationAttribute#getFeatureConcept <em>Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Concept</em>'.
	 * @see IFML.Core.VisualizationAttribute#getFeatureConcept()
	 * @see #getVisualizationAttribute()
	 * @generated
	 */
	EReference getVisualizationAttribute_FeatureConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see IFML.Core.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.Event#getActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Expression</em>'.
	 * @see IFML.Core.Event#getActivationExpression()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ActivationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link IFML.Core.Event#getInteractionFlowExpression <em>Interaction Flow Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction Flow Expression</em>'.
	 * @see IFML.Core.Event#getInteractionFlowExpression()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_InteractionFlowExpression();

	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Model Element</em>'.
	 * @see IFML.Core.InteractionFlowModelElement
	 * @generated
	 */
	EClass getInteractionFlowModelElement();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element Event</em>'.
	 * @see IFML.Core.ViewElementEvent
	 * @generated
	 */
	EClass getViewElementEvent();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ViewElementEvent#getViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View Element</em>'.
	 * @see IFML.Core.ViewElementEvent#getViewElement()
	 * @see #getViewElementEvent()
	 * @generated
	 */
	EReference getViewElementEvent_ViewElement();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see IFML.Core.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see IFML.Core.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ModulePackage <em>Module Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Package</em>'.
	 * @see IFML.Core.ModulePackage
	 * @generated
	 */
	EClass getModulePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ModulePackage#getModularizationElements <em>Modularization Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modularization Elements</em>'.
	 * @see IFML.Core.ModulePackage#getModularizationElements()
	 * @see #getModulePackage()
	 * @generated
	 */
	EReference getModulePackage_ModularizationElements();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ModularizationElement <em>Modularization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modularization Element</em>'.
	 * @see IFML.Core.ModularizationElement
	 * @generated
	 */
	EClass getModularizationElement();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.ModularizationElement#getModulePackage <em>Module Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module Package</em>'.
	 * @see IFML.Core.ModularizationElement#getModulePackage()
	 * @see #getModularizationElement()
	 * @generated
	 */
	EReference getModularizationElement_ModulePackage();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLModule <em>IFML Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Module</em>'.
	 * @see IFML.Core.IFMLModule
	 * @generated
	 */
	EClass getIFMLModule();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLModule#getModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Definition</em>'.
	 * @see IFML.Core.IFMLModule#getModuleDefinition()
	 * @see #getIFMLModule()
	 * @generated
	 */
	EReference getIFMLModule_ModuleDefinition();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.IFMLModule#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see IFML.Core.IFMLModule#getPorts()
	 * @see #getIFMLModule()
	 * @generated
	 */
	EReference getIFMLModule_Ports();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLPort <em>IFML Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Port</em>'.
	 * @see IFML.Core.IFMLPort
	 * @generated
	 */
	EClass getIFMLPort();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLPort#getPortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Definition</em>'.
	 * @see IFML.Core.IFMLPort#getPortDefinition()
	 * @see #getIFMLPort()
	 * @generated
	 */
	EReference getIFMLPort_PortDefinition();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLPort#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see IFML.Core.IFMLPort#getModule()
	 * @see #getIFMLPort()
	 * @generated
	 */
	EReference getIFMLPort_Module();

	/**
	 * Returns the meta object for class '{@link IFML.Core.CatchingEvent <em>Catching Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catching Event</em>'.
	 * @see IFML.Core.CatchingEvent
	 * @generated
	 */
	EClass getCatchingEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ThrowingEvent <em>Throwing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throwing Event</em>'.
	 * @see IFML.Core.ThrowingEvent
	 * @generated
	 */
	EClass getThrowingEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Core.BPMNActivityConcept <em>BPMN Activity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPMN Activity Concept</em>'.
	 * @see IFML.Core.BPMNActivityConcept
	 * @generated
	 */
	EClass getBPMNActivityConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ContextVariable <em>Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Variable</em>'.
	 * @see IFML.Core.ContextVariable
	 * @generated
	 */
	EClass getContextVariable();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.ContextVariable#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see IFML.Core.ContextVariable#getContext()
	 * @see #getContextVariable()
	 * @generated
	 */
	EReference getContextVariable_Context();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ContextVariable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see IFML.Core.ContextVariable#getScope()
	 * @see #getContextVariable()
	 * @generated
	 */
	EAttribute getContextVariable_Scope();

	/**
	 * Returns the meta object for class '{@link IFML.Core.SimpleContextVariable <em>Simple Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Context Variable</em>'.
	 * @see IFML.Core.SimpleContextVariable
	 * @generated
	 */
	EClass getSimpleContextVariable();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DataContextVariable <em>Data Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Context Variable</em>'.
	 * @see IFML.Core.DataContextVariable
	 * @generated
	 */
	EClass getDataContextVariable();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DataContextVariable#getDataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Binding</em>'.
	 * @see IFML.Core.DataContextVariable#getDataBinding()
	 * @see #getDataContextVariable()
	 * @generated
	 */
	EReference getDataContextVariable_DataBinding();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DomainConcept <em>Domain Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Concept</em>'.
	 * @see IFML.Core.DomainConcept
	 * @generated
	 */
	EClass getDomainConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DomainConcept#getDataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Binding</em>'.
	 * @see IFML.Core.DomainConcept#getDataBinding()
	 * @see #getDomainConcept()
	 * @generated
	 */
	EReference getDomainConcept_DataBinding();

	/**
	 * Returns the meta object for class '{@link IFML.Core.FeatureConcept <em>Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Concept</em>'.
	 * @see IFML.Core.FeatureConcept
	 * @generated
	 */
	EClass getFeatureConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.FeatureConcept#getVisualizationAttribute <em>Visualization Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visualization Attribute</em>'.
	 * @see IFML.Core.FeatureConcept#getVisualizationAttribute()
	 * @see #getFeatureConcept()
	 * @generated
	 */
	EReference getFeatureConcept_VisualizationAttribute();

	/**
	 * Returns the meta object for class '{@link IFML.Core.BehaviorConcept <em>Behavior Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Concept</em>'.
	 * @see IFML.Core.BehaviorConcept
	 * @generated
	 */
	EClass getBehaviorConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.BehaviorConcept#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Behavior</em>'.
	 * @see IFML.Core.BehaviorConcept#getDynamicBehavior()
	 * @see #getBehaviorConcept()
	 * @generated
	 */
	EReference getBehaviorConcept_DynamicBehavior();

	/**
	 * Returns the meta object for class '{@link IFML.Core.BehavioralFeatureConcept <em>Behavioral Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Feature Concept</em>'.
	 * @see IFML.Core.BehavioralFeatureConcept
	 * @generated
	 */
	EClass getBehavioralFeatureConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.BehavioralFeatureConcept#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Behavior</em>'.
	 * @see IFML.Core.BehavioralFeatureConcept#getDynamicBehavior()
	 * @see #getBehavioralFeatureConcept()
	 * @generated
	 */
	EReference getBehavioralFeatureConcept_DynamicBehavior();

	/**
	 * Returns the meta object for class '{@link IFML.Core.UMLBehavior <em>UML Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Behavior</em>'.
	 * @see IFML.Core.UMLBehavior
	 * @generated
	 */
	EClass getUMLBehavior();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.UMLBehavior#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see IFML.Core.UMLBehavior#getBehavior()
	 * @see #getUMLBehavior()
	 * @generated
	 */
	EReference getUMLBehavior_Behavior();

	/**
	 * Returns the meta object for class '{@link IFML.Core.UMLBehavioralFeature <em>UML Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Behavioral Feature</em>'.
	 * @see IFML.Core.UMLBehavioralFeature
	 * @generated
	 */
	EClass getUMLBehavioralFeature();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.UMLBehavioralFeature#getBehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavioral Feature</em>'.
	 * @see IFML.Core.UMLBehavioralFeature#getBehavioralFeature()
	 * @see #getUMLBehavioralFeature()
	 * @generated
	 */
	EReference getUMLBehavioralFeature_BehavioralFeature();

	/**
	 * Returns the meta object for class '{@link IFML.Core.UMLDomainConcept <em>UML Domain Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Domain Concept</em>'.
	 * @see IFML.Core.UMLDomainConcept
	 * @generated
	 */
	EClass getUMLDomainConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.UMLDomainConcept#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see IFML.Core.UMLDomainConcept#getClassifier()
	 * @see #getUMLDomainConcept()
	 * @generated
	 */
	EReference getUMLDomainConcept_Classifier();

	/**
	 * Returns the meta object for class '{@link IFML.Core.UMLStructuralFeature <em>UML Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Structural Feature</em>'.
	 * @see IFML.Core.UMLStructuralFeature
	 * @generated
	 */
	EClass getUMLStructuralFeature();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.UMLStructuralFeature#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see IFML.Core.UMLStructuralFeature#getStructuralFeature()
	 * @see #getUMLStructuralFeature()
	 * @generated
	 */
	EReference getUMLStructuralFeature_StructuralFeature();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ActivityConcept <em>Activity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Concept</em>'.
	 * @see IFML.Core.ActivityConcept
	 * @generated
	 */
	EClass getActivityConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ActivityConcept#getModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Definition</em>'.
	 * @see IFML.Core.ActivityConcept#getModuleDefinition()
	 * @see #getActivityConcept()
	 * @generated
	 */
	EReference getActivityConcept_ModuleDefinition();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Element</em>'.
	 * @see IFML.Core.DomainElement
	 * @generated
	 */
	EClass getDomainElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowImpl <em>Interaction Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlow()
		 * @generated
		 */
		EClass INTERACTION_FLOW = eINSTANCE.getInteractionFlow();

		/**
		 * The meta object literal for the '<em><b>Parameter Binding Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW__PARAMETER_BINDING_GROUP = eINSTANCE.getInteractionFlow_ParameterBindingGroup();

		/**
		 * The meta object literal for the '<em><b>Source Interaction Flow Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlow_SourceInteractionFlowElement();

		/**
		 * The meta object literal for the '<em><b>Target Interaction Flow Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlow_TargetInteractionFlowElement();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowExpressionImpl <em>Interaction Flow Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowExpression()
		 * @generated
		 */
		EClass INTERACTION_FLOW_EXPRESSION = eINSTANCE.getInteractionFlowExpression();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW = eINSTANCE.getInteractionFlowExpression_InteractionFlow();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.SystemEventImpl <em>System Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.SystemEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getSystemEvent()
		 * @generated
		 */
		EClass SYSTEM_EVENT = eINSTANCE.getSystemEvent();

		/**
		 * The meta object literal for the '<em><b>Triggering Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_EVENT__TRIGGERING_EXPRESSIONS = eINSTANCE.getSystemEvent_TriggeringExpressions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_EVENT__TYPE = eINSTANCE.getSystemEvent_Type();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ParameterBindingImpl
		 * @see IFML.Core.impl.CorePackageImpl#getParameterBinding()
		 * @generated
		 */
		EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Source Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__SOURCE_PARAMETER = eINSTANCE.getParameterBinding_SourceParameter();

		/**
		 * The meta object literal for the '<em><b>Target Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__TARGET_PARAMETER = eINSTANCE.getParameterBinding_TargetParameter();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ActionEventImpl <em>Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ActionEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getActionEvent()
		 * @generated
		 */
		EClass ACTION_EVENT = eINSTANCE.getActionEvent();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DomainModelImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Domain Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__DOMAIN_ELEMENTS = eINSTANCE.getDomainModel_DomainElements();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.NamedElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.PortDefinitionImpl <em>Port Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.PortDefinitionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getPortDefinition()
		 * @generated
		 */
		EClass PORT_DEFINITION = eINSTANCE.getPortDefinition();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_DEFINITION__PORTS = eINSTANCE.getPortDefinition_Ports();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ContentBindingImpl <em>Content Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ContentBindingImpl
		 * @see IFML.Core.impl.CorePackageImpl#getContentBinding()
		 * @generated
		 */
		EClass CONTENT_BINDING = eINSTANCE.getContentBinding();

		/**
		 * The meta object literal for the '<em><b>Uniform Resource Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER = eINSTANCE.getContentBinding_UniformResourceIdentifier();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewElementImpl <em>View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewElement()
		 * @generated
		 */
		EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

		/**
		 * The meta object literal for the '<em><b>View Element Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__VIEW_ELEMENT_EVENTS = eINSTANCE.getViewElement_ViewElementEvents();

		/**
		 * The meta object literal for the '<em><b>Activation Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__ACTIVATION_EXPRESSION = eINSTANCE.getViewElement_ActivationExpression();

		/**
		 * The meta object literal for the '<em><b>View Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__VIEW_CONTAINER = eINSTANCE.getViewElement_ViewContainer();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__LANGUAGE = eINSTANCE.getExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__BODY = eINSTANCE.getExpression_Body();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DynamicBehaviorImpl <em>Dynamic Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DynamicBehaviorImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDynamicBehavior()
		 * @generated
		 */
		EClass DYNAMIC_BEHAVIOR = eINSTANCE.getDynamicBehavior();

		/**
		 * The meta object literal for the '<em><b>Behavioral Feature Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT = eINSTANCE.getDynamicBehavior_BehavioralFeatureConcept();

		/**
		 * The meta object literal for the '<em><b>Behavior Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT = eINSTANCE.getDynamicBehavior_BehaviorConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewpointImpl <em>Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewpointImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewpoint()
		 * @generated
		 */
		EClass VIEWPOINT = eINSTANCE.getViewpoint();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS = eINSTANCE.getViewpoint_InteractionFlowModelElements();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__CONTEXT = eINSTANCE.getViewpoint_Context();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DataFlowImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewComponentPartImpl <em>View Component Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewComponentPartImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewComponentPart()
		 * @generated
		 */
		EClass VIEW_COMPONENT_PART = eINSTANCE.getViewComponentPart();

		/**
		 * The meta object literal for the '<em><b>View Element Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS = eINSTANCE.getViewComponentPart_ViewElementEvents();

		/**
		 * The meta object literal for the '<em><b>Activation Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION = eINSTANCE.getViewComponentPart_ActivationExpression();

		/**
		 * The meta object literal for the '<em><b>Parent View Component Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART = eINSTANCE.getViewComponentPart_ParentViewComponentPart();

		/**
		 * The meta object literal for the '<em><b>Sub View Component Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS = eINSTANCE.getViewComponentPart_SubViewComponentParts();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewContainerImpl <em>View Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewContainerImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewContainer()
		 * @generated
		 */
		EClass VIEW_CONTAINER = eINSTANCE.getViewContainer();

		/**
		 * The meta object literal for the '<em><b>Is Landmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONTAINER__IS_LANDMARK = eINSTANCE.getViewContainer_IsLandmark();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONTAINER__IS_DEFAULT = eINSTANCE.getViewContainer_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Is XOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONTAINER__IS_XOR = eINSTANCE.getViewContainer_IsXOR();

		/**
		 * The meta object literal for the '<em><b>View Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_CONTAINER__VIEW_ELEMENTS = eINSTANCE.getViewContainer_ViewElements();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_CONTAINER__ACTIONS = eINSTANCE.getViewContainer_Actions();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ActivationExpressionImpl <em>Activation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ActivationExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getActivationExpression()
		 * @generated
		 */
		EClass ACTIVATION_EXPRESSION = eINSTANCE.getActivationExpression();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowModelImpl <em>Interaction Flow Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowModelImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowModel()
		 * @generated
		 */
		EClass INTERACTION_FLOW_MODEL = eINSTANCE.getInteractionFlowModel();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS = eINSTANCE.getInteractionFlowModel_InteractionFlowModelElements();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ContextDimensionImpl <em>Context Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ContextDimensionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getContextDimension()
		 * @generated
		 */
		EClass CONTEXT_DIMENSION = eINSTANCE.getContextDimension();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLModelImpl <em>IFML Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLModelImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLModel()
		 * @generated
		 */
		EClass IFML_MODEL = eINSTANCE.getIFMLModel();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODEL__INTERACTION_FLOW_MODEL = eINSTANCE.getIFMLModel_InteractionFlowModel();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODEL__DOMAIN_MODEL = eINSTANCE.getIFMLModel_DomainModel();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Viewpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT = eINSTANCE.getIFMLModel_InteractionFlowModelViewpoint();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ModuleDefinitionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getModuleDefinition()
		 * @generated
		 */
		EClass MODULE_DEFINITION = eINSTANCE.getModuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__INPUT_PORTS = eINSTANCE.getModuleDefinition_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__OUTPUT_PORTS = eINSTANCE.getModuleDefinition_OutputPorts();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT = eINSTANCE.getModuleDefinition_InteractionFlowModelElement();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__MODULES = eINSTANCE.getModuleDefinition_Modules();

		/**
		 * The meta object literal for the '<em><b>Activity Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__ACTIVITY_CONCEPT = eINSTANCE.getModuleDefinition_ActivityConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.BooleanExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowElementImpl <em>Interaction Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowElement()
		 * @generated
		 */
		EClass INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlowElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_ELEMENT__PARAMETERS = eINSTANCE.getInteractionFlowElement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Out Interaction Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS = eINSTANCE.getInteractionFlowElement_OutInteractionFlows();

		/**
		 * The meta object literal for the '<em><b>In Interaction Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS = eINSTANCE.getInteractionFlowElement_InInteractionFlows();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLActionImpl <em>IFML Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLActionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLAction()
		 * @generated
		 */
		EClass IFML_ACTION = eINSTANCE.getIFMLAction();

		/**
		 * The meta object literal for the '<em><b>Action Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_ACTION__ACTION_EVENTS = eINSTANCE.getIFMLAction_ActionEvents();

		/**
		 * The meta object literal for the '<em><b>Dynamic Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_ACTION__DYNAMIC_BEHAVIOR = eINSTANCE.getIFMLAction_DynamicBehavior();

		/**
		 * The meta object literal for the '<em><b>View Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_ACTION__VIEW_CONTAINER = eINSTANCE.getIFMLAction_ViewContainer();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.NavigationFlowImpl <em>Navigation Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.NavigationFlowImpl
		 * @see IFML.Core.impl.CorePackageImpl#getNavigationFlow()
		 * @generated
		 */
		EClass NAVIGATION_FLOW = eINSTANCE.getNavigationFlow();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ParameterBindingGroupImpl <em>Parameter Binding Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ParameterBindingGroupImpl
		 * @see IFML.Core.impl.CorePackageImpl#getParameterBindingGroup()
		 * @generated
		 */
		EClass PARAMETER_BINDING_GROUP = eINSTANCE.getParameterBindingGroup();

		/**
		 * The meta object literal for the '<em><b>Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING_GROUP__PARAMETER_BINDINGS = eINSTANCE.getParameterBindingGroup_ParameterBindings();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONSTRAINTS = eINSTANCE.getElement_Constraints();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ANNOTATIONS = eINSTANCE.getElement_Annotations();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ConstraintImpl
		 * @see IFML.Core.impl.CorePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewComponentImpl <em>View Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewComponentImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewComponent()
		 * @generated
		 */
		EClass VIEW_COMPONENT = eINSTANCE.getViewComponent();

		/**
		 * The meta object literal for the '<em><b>View Component Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT__VIEW_COMPONENT_PARTS = eINSTANCE.getViewComponent_ViewComponentParts();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLParameterImpl <em>IFML Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLParameterImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLParameter()
		 * @generated
		 */
		EClass IFML_PARAMETER = eINSTANCE.getIFMLParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFML_PARAMETER__DIRECTION = eINSTANCE.getIFMLParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_PARAMETER__DEFAULT_VALUE = eINSTANCE.getIFMLParameter_DefaultValue();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DataBindingImpl <em>Data Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DataBindingImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDataBinding()
		 * @generated
		 */
		EClass DATA_BINDING = eINSTANCE.getDataBinding();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__CONDITIONAL_EXPRESSION = eINSTANCE.getDataBinding_ConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Visualization Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__VISUALIZATION_ATTRIBUTE = eINSTANCE.getDataBinding_VisualizationAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Context Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__DATA_CONTEXT_VARIABLES = eINSTANCE.getDataBinding_DataContextVariables();

		/**
		 * The meta object literal for the '<em><b>Domain Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__DOMAIN_CONCEPT = eINSTANCE.getDataBinding_DomainConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ConditionalExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ContextImpl
		 * @see IFML.Core.impl.CorePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Context Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXT_DIMENSIONS = eINSTANCE.getContext_ContextDimensions();

		/**
		 * The meta object literal for the '<em><b>Context Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXT_VARIABLES = eINSTANCE.getContext_ContextVariables();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.VisualizationAttributeImpl <em>Visualization Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.VisualizationAttributeImpl
		 * @see IFML.Core.impl.CorePackageImpl#getVisualizationAttribute()
		 * @generated
		 */
		EClass VISUALIZATION_ATTRIBUTE = eINSTANCE.getVisualizationAttribute();

		/**
		 * The meta object literal for the '<em><b>Feature Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT = eINSTANCE.getVisualizationAttribute_FeatureConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.EventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Activation Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ACTIVATION_EXPRESSION = eINSTANCE.getEvent_ActivationExpression();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__INTERACTION_FLOW_EXPRESSION = eINSTANCE.getEvent_InteractionFlowExpression();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowModelElementImpl <em>Interaction Flow Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowModelElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowModelElement()
		 * @generated
		 */
		EClass INTERACTION_FLOW_MODEL_ELEMENT = eINSTANCE.getInteractionFlowModelElement();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewElementEventImpl <em>View Element Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewElementEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewElementEvent()
		 * @generated
		 */
		EClass VIEW_ELEMENT_EVENT = eINSTANCE.getViewElementEvent();

		/**
		 * The meta object literal for the '<em><b>View Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT_EVENT__VIEW_ELEMENT = eINSTANCE.getViewElementEvent_ViewElement();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.AnnotationImpl
		 * @see IFML.Core.impl.CorePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ModulePackageImpl <em>Module Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ModulePackageImpl
		 * @see IFML.Core.impl.CorePackageImpl#getModulePackage()
		 * @generated
		 */
		EClass MODULE_PACKAGE = eINSTANCE.getModulePackage();

		/**
		 * The meta object literal for the '<em><b>Modularization Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PACKAGE__MODULARIZATION_ELEMENTS = eINSTANCE.getModulePackage_ModularizationElements();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ModularizationElementImpl <em>Modularization Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ModularizationElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getModularizationElement()
		 * @generated
		 */
		EClass MODULARIZATION_ELEMENT = eINSTANCE.getModularizationElement();

		/**
		 * The meta object literal for the '<em><b>Module Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULARIZATION_ELEMENT__MODULE_PACKAGE = eINSTANCE.getModularizationElement_ModulePackage();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLModuleImpl <em>IFML Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLModuleImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLModule()
		 * @generated
		 */
		EClass IFML_MODULE = eINSTANCE.getIFMLModule();

		/**
		 * The meta object literal for the '<em><b>Module Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODULE__MODULE_DEFINITION = eINSTANCE.getIFMLModule_ModuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODULE__PORTS = eINSTANCE.getIFMLModule_Ports();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLPortImpl <em>IFML Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLPortImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLPort()
		 * @generated
		 */
		EClass IFML_PORT = eINSTANCE.getIFMLPort();

		/**
		 * The meta object literal for the '<em><b>Port Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_PORT__PORT_DEFINITION = eINSTANCE.getIFMLPort_PortDefinition();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_PORT__MODULE = eINSTANCE.getIFMLPort_Module();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.CatchingEventImpl <em>Catching Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.CatchingEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getCatchingEvent()
		 * @generated
		 */
		EClass CATCHING_EVENT = eINSTANCE.getCatchingEvent();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ThrowingEventImpl <em>Throwing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ThrowingEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getThrowingEvent()
		 * @generated
		 */
		EClass THROWING_EVENT = eINSTANCE.getThrowingEvent();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.BPMNActivityConceptImpl <em>BPMN Activity Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.BPMNActivityConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getBPMNActivityConcept()
		 * @generated
		 */
		EClass BPMN_ACTIVITY_CONCEPT = eINSTANCE.getBPMNActivityConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ContextVariableImpl <em>Context Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ContextVariableImpl
		 * @see IFML.Core.impl.CorePackageImpl#getContextVariable()
		 * @generated
		 */
		EClass CONTEXT_VARIABLE = eINSTANCE.getContextVariable();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_VARIABLE__CONTEXT = eINSTANCE.getContextVariable_Context();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_VARIABLE__SCOPE = eINSTANCE.getContextVariable_Scope();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.SimpleContextVariableImpl <em>Simple Context Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.SimpleContextVariableImpl
		 * @see IFML.Core.impl.CorePackageImpl#getSimpleContextVariable()
		 * @generated
		 */
		EClass SIMPLE_CONTEXT_VARIABLE = eINSTANCE.getSimpleContextVariable();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DataContextVariableImpl <em>Data Context Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DataContextVariableImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDataContextVariable()
		 * @generated
		 */
		EClass DATA_CONTEXT_VARIABLE = eINSTANCE.getDataContextVariable();

		/**
		 * The meta object literal for the '<em><b>Data Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTEXT_VARIABLE__DATA_BINDING = eINSTANCE.getDataContextVariable_DataBinding();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DomainConceptImpl <em>Domain Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DomainConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDomainConcept()
		 * @generated
		 */
		EClass DOMAIN_CONCEPT = eINSTANCE.getDomainConcept();

		/**
		 * The meta object literal for the '<em><b>Data Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONCEPT__DATA_BINDING = eINSTANCE.getDomainConcept_DataBinding();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.FeatureConceptImpl <em>Feature Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.FeatureConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getFeatureConcept()
		 * @generated
		 */
		EClass FEATURE_CONCEPT = eINSTANCE.getFeatureConcept();

		/**
		 * The meta object literal for the '<em><b>Visualization Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE = eINSTANCE.getFeatureConcept_VisualizationAttribute();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.BehaviorConceptImpl <em>Behavior Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.BehaviorConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getBehaviorConcept()
		 * @generated
		 */
		EClass BEHAVIOR_CONCEPT = eINSTANCE.getBehaviorConcept();

		/**
		 * The meta object literal for the '<em><b>Dynamic Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR = eINSTANCE.getBehaviorConcept_DynamicBehavior();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.BehavioralFeatureConceptImpl <em>Behavioral Feature Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.BehavioralFeatureConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getBehavioralFeatureConcept()
		 * @generated
		 */
		EClass BEHAVIORAL_FEATURE_CONCEPT = eINSTANCE.getBehavioralFeatureConcept();

		/**
		 * The meta object literal for the '<em><b>Dynamic Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR = eINSTANCE.getBehavioralFeatureConcept_DynamicBehavior();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.UMLBehaviorImpl <em>UML Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.UMLBehaviorImpl
		 * @see IFML.Core.impl.CorePackageImpl#getUMLBehavior()
		 * @generated
		 */
		EClass UML_BEHAVIOR = eINSTANCE.getUMLBehavior();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_BEHAVIOR__BEHAVIOR = eINSTANCE.getUMLBehavior_Behavior();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.UMLBehavioralFeatureImpl <em>UML Behavioral Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.UMLBehavioralFeatureImpl
		 * @see IFML.Core.impl.CorePackageImpl#getUMLBehavioralFeature()
		 * @generated
		 */
		EClass UML_BEHAVIORAL_FEATURE = eINSTANCE.getUMLBehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Behavioral Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE = eINSTANCE.getUMLBehavioralFeature_BehavioralFeature();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.UMLDomainConceptImpl <em>UML Domain Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.UMLDomainConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getUMLDomainConcept()
		 * @generated
		 */
		EClass UML_DOMAIN_CONCEPT = eINSTANCE.getUMLDomainConcept();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DOMAIN_CONCEPT__CLASSIFIER = eINSTANCE.getUMLDomainConcept_Classifier();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.UMLStructuralFeatureImpl <em>UML Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.UMLStructuralFeatureImpl
		 * @see IFML.Core.impl.CorePackageImpl#getUMLStructuralFeature()
		 * @generated
		 */
		EClass UML_STRUCTURAL_FEATURE = eINSTANCE.getUMLStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_STRUCTURAL_FEATURE__STRUCTURAL_FEATURE = eINSTANCE.getUMLStructuralFeature_StructuralFeature();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ActivityConceptImpl <em>Activity Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ActivityConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getActivityConcept()
		 * @generated
		 */
		EClass ACTIVITY_CONCEPT = eINSTANCE.getActivityConcept();

		/**
		 * The meta object literal for the '<em><b>Module Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONCEPT__MODULE_DEFINITION = eINSTANCE.getActivityConcept_ModuleDefinition();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DomainElementImpl <em>Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DomainElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDomainElement()
		 * @generated
		 */
		EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

	}

} //CorePackage
