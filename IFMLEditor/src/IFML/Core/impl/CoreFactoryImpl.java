/**
 */
package IFML.Core.impl;

import IFML.Core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.INTERACTION_FLOW_EXPRESSION: return createInteractionFlowExpression();
			case CorePackage.SYSTEM_EVENT: return createSystemEvent();
			case CorePackage.PARAMETER_BINDING: return createParameterBinding();
			case CorePackage.ACTION_EVENT: return createActionEvent();
			case CorePackage.DOMAIN_MODEL: return createDomainModel();
			case CorePackage.PORT_DEFINITION: return createPortDefinition();
			case CorePackage.VIEW_ELEMENT: return createViewElement();
			case CorePackage.DYNAMIC_BEHAVIOR: return createDynamicBehavior();
			case CorePackage.VIEWPOINT: return createViewpoint();
			case CorePackage.DATA_FLOW: return createDataFlow();
			case CorePackage.VIEW_COMPONENT_PART: return createViewComponentPart();
			case CorePackage.VIEW_CONTAINER: return createViewContainer();
			case CorePackage.ACTIVATION_EXPRESSION: return createActivationExpression();
			case CorePackage.INTERACTION_FLOW_MODEL: return createInteractionFlowModel();
			case CorePackage.CONTEXT_DIMENSION: return createContextDimension();
			case CorePackage.IFML_MODEL: return createIFMLModel();
			case CorePackage.MODULE_DEFINITION: return createModuleDefinition();
			case CorePackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case CorePackage.IFML_ACTION: return createIFMLAction();
			case CorePackage.NAVIGATION_FLOW: return createNavigationFlow();
			case CorePackage.PARAMETER_BINDING_GROUP: return createParameterBindingGroup();
			case CorePackage.CONSTRAINT: return createConstraint();
			case CorePackage.VIEW_COMPONENT: return createViewComponent();
			case CorePackage.IFML_PARAMETER: return createIFMLParameter();
			case CorePackage.DATA_BINDING: return createDataBinding();
			case CorePackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
			case CorePackage.CONTEXT: return createContext();
			case CorePackage.VISUALIZATION_ATTRIBUTE: return createVisualizationAttribute();
			case CorePackage.EVENT: return createEvent();
			case CorePackage.VIEW_ELEMENT_EVENT: return createViewElementEvent();
			case CorePackage.ANNOTATION: return createAnnotation();
			case CorePackage.MODULE_PACKAGE: return createModulePackage();
			case CorePackage.MODULARIZATION_ELEMENT: return createModularizationElement();
			case CorePackage.IFML_MODULE: return createIFMLModule();
			case CorePackage.IFML_PORT: return createIFMLPort();
			case CorePackage.CATCHING_EVENT: return createCatchingEvent();
			case CorePackage.THROWING_EVENT: return createThrowingEvent();
			case CorePackage.BPMN_ACTIVITY_CONCEPT: return createBPMNActivityConcept();
			case CorePackage.CONTEXT_VARIABLE: return createContextVariable();
			case CorePackage.SIMPLE_CONTEXT_VARIABLE: return createSimpleContextVariable();
			case CorePackage.DATA_CONTEXT_VARIABLE: return createDataContextVariable();
			case CorePackage.DOMAIN_CONCEPT: return createDomainConcept();
			case CorePackage.FEATURE_CONCEPT: return createFeatureConcept();
			case CorePackage.BEHAVIOR_CONCEPT: return createBehaviorConcept();
			case CorePackage.BEHAVIORAL_FEATURE_CONCEPT: return createBehavioralFeatureConcept();
			case CorePackage.UML_BEHAVIOR: return createUMLBehavior();
			case CorePackage.UML_BEHAVIORAL_FEATURE: return createUMLBehavioralFeature();
			case CorePackage.UML_DOMAIN_CONCEPT: return createUMLDomainConcept();
			case CorePackage.UML_STRUCTURAL_FEATURE: return createUMLStructuralFeature();
			case CorePackage.ACTIVITY_CONCEPT: return createActivityConcept();
			case CorePackage.DOMAIN_ELEMENT: return createDomainElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFlowExpression createInteractionFlowExpression() {
		InteractionFlowExpressionImpl interactionFlowExpression = new InteractionFlowExpressionImpl();
		return interactionFlowExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemEvent createSystemEvent() {
		SystemEventImpl systemEvent = new SystemEventImpl();
		return systemEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBinding createParameterBinding() {
		ParameterBindingImpl parameterBinding = new ParameterBindingImpl();
		return parameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEvent createActionEvent() {
		ActionEventImpl actionEvent = new ActionEventImpl();
		return actionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition createPortDefinition() {
		PortDefinitionImpl portDefinition = new PortDefinitionImpl();
		return portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElement createViewElement() {
		ViewElementImpl viewElement = new ViewElementImpl();
		return viewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBehavior createDynamicBehavior() {
		DynamicBehaviorImpl dynamicBehavior = new DynamicBehaviorImpl();
		return dynamicBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewpoint createViewpoint() {
		ViewpointImpl viewpoint = new ViewpointImpl();
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewComponentPart createViewComponentPart() {
		ViewComponentPartImpl viewComponentPart = new ViewComponentPartImpl();
		return viewComponentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer createViewContainer() {
		ViewContainerImpl viewContainer = new ViewContainerImpl();
		return viewContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationExpression createActivationExpression() {
		ActivationExpressionImpl activationExpression = new ActivationExpressionImpl();
		return activationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFlowModel createInteractionFlowModel() {
		InteractionFlowModelImpl interactionFlowModel = new InteractionFlowModelImpl();
		return interactionFlowModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDimension createContextDimension() {
		ContextDimensionImpl contextDimension = new ContextDimensionImpl();
		return contextDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLModel createIFMLModel() {
		IFMLModelImpl ifmlModel = new IFMLModelImpl();
		return ifmlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition createModuleDefinition() {
		ModuleDefinitionImpl moduleDefinition = new ModuleDefinitionImpl();
		return moduleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLAction createIFMLAction() {
		IFMLActionImpl ifmlAction = new IFMLActionImpl();
		return ifmlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationFlow createNavigationFlow() {
		NavigationFlowImpl navigationFlow = new NavigationFlowImpl();
		return navigationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBindingGroup createParameterBindingGroup() {
		ParameterBindingGroupImpl parameterBindingGroup = new ParameterBindingGroupImpl();
		return parameterBindingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewComponent createViewComponent() {
		ViewComponentImpl viewComponent = new ViewComponentImpl();
		return viewComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLParameter createIFMLParameter() {
		IFMLParameterImpl ifmlParameter = new IFMLParameterImpl();
		return ifmlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBinding createDataBinding() {
		DataBindingImpl dataBinding = new DataBindingImpl();
		return dataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationAttribute createVisualizationAttribute() {
		VisualizationAttributeImpl visualizationAttribute = new VisualizationAttributeImpl();
		return visualizationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElementEvent createViewElementEvent() {
		ViewElementEventImpl viewElementEvent = new ViewElementEventImpl();
		return viewElementEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulePackage createModulePackage() {
		ModulePackageImpl modulePackage = new ModulePackageImpl();
		return modulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularizationElement createModularizationElement() {
		ModularizationElementImpl modularizationElement = new ModularizationElementImpl();
		return modularizationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLModule createIFMLModule() {
		IFMLModuleImpl ifmlModule = new IFMLModuleImpl();
		return ifmlModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLPort createIFMLPort() {
		IFMLPortImpl ifmlPort = new IFMLPortImpl();
		return ifmlPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchingEvent createCatchingEvent() {
		CatchingEventImpl catchingEvent = new CatchingEventImpl();
		return catchingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowingEvent createThrowingEvent() {
		ThrowingEventImpl throwingEvent = new ThrowingEventImpl();
		return throwingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNActivityConcept createBPMNActivityConcept() {
		BPMNActivityConceptImpl bpmnActivityConcept = new BPMNActivityConceptImpl();
		return bpmnActivityConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextVariable createContextVariable() {
		ContextVariableImpl contextVariable = new ContextVariableImpl();
		return contextVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleContextVariable createSimpleContextVariable() {
		SimpleContextVariableImpl simpleContextVariable = new SimpleContextVariableImpl();
		return simpleContextVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataContextVariable createDataContextVariable() {
		DataContextVariableImpl dataContextVariable = new DataContextVariableImpl();
		return dataContextVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainConcept createDomainConcept() {
		DomainConceptImpl domainConcept = new DomainConceptImpl();
		return domainConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConcept createFeatureConcept() {
		FeatureConceptImpl featureConcept = new FeatureConceptImpl();
		return featureConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConcept createBehaviorConcept() {
		BehaviorConceptImpl behaviorConcept = new BehaviorConceptImpl();
		return behaviorConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeatureConcept createBehavioralFeatureConcept() {
		BehavioralFeatureConceptImpl behavioralFeatureConcept = new BehavioralFeatureConceptImpl();
		return behavioralFeatureConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLBehavior createUMLBehavior() {
		UMLBehaviorImpl umlBehavior = new UMLBehaviorImpl();
		return umlBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLBehavioralFeature createUMLBehavioralFeature() {
		UMLBehavioralFeatureImpl umlBehavioralFeature = new UMLBehavioralFeatureImpl();
		return umlBehavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLDomainConcept createUMLDomainConcept() {
		UMLDomainConceptImpl umlDomainConcept = new UMLDomainConceptImpl();
		return umlDomainConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLStructuralFeature createUMLStructuralFeature() {
		UMLStructuralFeatureImpl umlStructuralFeature = new UMLStructuralFeatureImpl();
		return umlStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityConcept createActivityConcept() {
		ActivityConceptImpl activityConcept = new ActivityConceptImpl();
		return activityConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement createDomainElement() {
		DomainElementImpl domainElement = new DomainElementImpl();
		return domainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
