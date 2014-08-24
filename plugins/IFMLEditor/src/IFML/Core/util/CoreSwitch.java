/**
 */
package IFML.Core.util;

import IFML.Core.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see IFML.Core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.INTERACTION_FLOW: {
				InteractionFlow interactionFlow = (InteractionFlow)theEObject;
				T result = caseInteractionFlow(interactionFlow);
				if (result == null) result = caseInteractionFlowModelElement(interactionFlow);
				if (result == null) result = caseElement(interactionFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION_FLOW_EXPRESSION: {
				InteractionFlowExpression interactionFlowExpression = (InteractionFlowExpression)theEObject;
				T result = caseInteractionFlowExpression(interactionFlowExpression);
				if (result == null) result = caseExpression(interactionFlowExpression);
				if (result == null) result = caseInteractionFlowModelElement(interactionFlowExpression);
				if (result == null) result = caseElement(interactionFlowExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SYSTEM_EVENT: {
				SystemEvent systemEvent = (SystemEvent)theEObject;
				T result = caseSystemEvent(systemEvent);
				if (result == null) result = caseCatchingEvent(systemEvent);
				if (result == null) result = caseEvent(systemEvent);
				if (result == null) result = caseInteractionFlowElement(systemEvent);
				if (result == null) result = caseNamedElement(systemEvent);
				if (result == null) result = caseInteractionFlowModelElement(systemEvent);
				if (result == null) result = caseElement(systemEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARAMETER_BINDING: {
				ParameterBinding parameterBinding = (ParameterBinding)theEObject;
				T result = caseParameterBinding(parameterBinding);
				if (result == null) result = caseInteractionFlowModelElement(parameterBinding);
				if (result == null) result = caseElement(parameterBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ACTION_EVENT: {
				ActionEvent actionEvent = (ActionEvent)theEObject;
				T result = caseActionEvent(actionEvent);
				if (result == null) result = caseCatchingEvent(actionEvent);
				if (result == null) result = caseEvent(actionEvent);
				if (result == null) result = caseInteractionFlowElement(actionEvent);
				if (result == null) result = caseNamedElement(actionEvent);
				if (result == null) result = caseInteractionFlowModelElement(actionEvent);
				if (result == null) result = caseElement(actionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = caseNamedElement(domainModel);
				if (result == null) result = caseElement(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PORT_DEFINITION: {
				PortDefinition portDefinition = (PortDefinition)theEObject;
				T result = casePortDefinition(portDefinition);
				if (result == null) result = caseInteractionFlowElement(portDefinition);
				if (result == null) result = caseNamedElement(portDefinition);
				if (result == null) result = caseInteractionFlowModelElement(portDefinition);
				if (result == null) result = caseElement(portDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTENT_BINDING: {
				ContentBinding contentBinding = (ContentBinding)theEObject;
				T result = caseContentBinding(contentBinding);
				if (result == null) result = caseViewComponentPart(contentBinding);
				if (result == null) result = caseInteractionFlowElement(contentBinding);
				if (result == null) result = caseNamedElement(contentBinding);
				if (result == null) result = caseInteractionFlowModelElement(contentBinding);
				if (result == null) result = caseElement(contentBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_ELEMENT: {
				ViewElement viewElement = (ViewElement)theEObject;
				T result = caseViewElement(viewElement);
				if (result == null) result = caseInteractionFlowElement(viewElement);
				if (result == null) result = caseNamedElement(viewElement);
				if (result == null) result = caseInteractionFlowModelElement(viewElement);
				if (result == null) result = caseElement(viewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseInteractionFlowModelElement(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DYNAMIC_BEHAVIOR: {
				DynamicBehavior dynamicBehavior = (DynamicBehavior)theEObject;
				T result = caseDynamicBehavior(dynamicBehavior);
				if (result == null) result = caseContentBinding(dynamicBehavior);
				if (result == null) result = caseViewComponentPart(dynamicBehavior);
				if (result == null) result = caseInteractionFlowElement(dynamicBehavior);
				if (result == null) result = caseNamedElement(dynamicBehavior);
				if (result == null) result = caseInteractionFlowModelElement(dynamicBehavior);
				if (result == null) result = caseElement(dynamicBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEWPOINT: {
				Viewpoint viewpoint = (Viewpoint)theEObject;
				T result = caseViewpoint(viewpoint);
				if (result == null) result = caseNamedElement(viewpoint);
				if (result == null) result = caseElement(viewpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T result = caseDataFlow(dataFlow);
				if (result == null) result = caseInteractionFlow(dataFlow);
				if (result == null) result = caseInteractionFlowModelElement(dataFlow);
				if (result == null) result = caseElement(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_COMPONENT_PART: {
				ViewComponentPart viewComponentPart = (ViewComponentPart)theEObject;
				T result = caseViewComponentPart(viewComponentPart);
				if (result == null) result = caseInteractionFlowElement(viewComponentPart);
				if (result == null) result = caseNamedElement(viewComponentPart);
				if (result == null) result = caseInteractionFlowModelElement(viewComponentPart);
				if (result == null) result = caseElement(viewComponentPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_CONTAINER: {
				ViewContainer viewContainer = (ViewContainer)theEObject;
				T result = caseViewContainer(viewContainer);
				if (result == null) result = caseViewElement(viewContainer);
				if (result == null) result = caseInteractionFlowElement(viewContainer);
				if (result == null) result = caseNamedElement(viewContainer);
				if (result == null) result = caseInteractionFlowModelElement(viewContainer);
				if (result == null) result = caseElement(viewContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ACTIVATION_EXPRESSION: {
				ActivationExpression activationExpression = (ActivationExpression)theEObject;
				T result = caseActivationExpression(activationExpression);
				if (result == null) result = caseBooleanExpression(activationExpression);
				if (result == null) result = caseExpression(activationExpression);
				if (result == null) result = caseInteractionFlowModelElement(activationExpression);
				if (result == null) result = caseElement(activationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION_FLOW_MODEL: {
				InteractionFlowModel interactionFlowModel = (InteractionFlowModel)theEObject;
				T result = caseInteractionFlowModel(interactionFlowModel);
				if (result == null) result = caseNamedElement(interactionFlowModel);
				if (result == null) result = caseElement(interactionFlowModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTEXT_DIMENSION: {
				ContextDimension contextDimension = (ContextDimension)theEObject;
				T result = caseContextDimension(contextDimension);
				if (result == null) result = caseNamedElement(contextDimension);
				if (result == null) result = caseElement(contextDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IFML_MODEL: {
				IFMLModel ifmlModel = (IFMLModel)theEObject;
				T result = caseIFMLModel(ifmlModel);
				if (result == null) result = caseNamedElement(ifmlModel);
				if (result == null) result = caseElement(ifmlModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODULE_DEFINITION: {
				ModuleDefinition moduleDefinition = (ModuleDefinition)theEObject;
				T result = caseModuleDefinition(moduleDefinition);
				if (result == null) result = caseModularizationElement(moduleDefinition);
				if (result == null) result = caseNamedElement(moduleDefinition);
				if (result == null) result = caseInteractionFlowModelElement(moduleDefinition);
				if (result == null) result = caseElement(moduleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = caseInteractionFlowModelElement(booleanExpression);
				if (result == null) result = caseElement(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION_FLOW_ELEMENT: {
				InteractionFlowElement interactionFlowElement = (InteractionFlowElement)theEObject;
				T result = caseInteractionFlowElement(interactionFlowElement);
				if (result == null) result = caseNamedElement(interactionFlowElement);
				if (result == null) result = caseInteractionFlowModelElement(interactionFlowElement);
				if (result == null) result = caseElement(interactionFlowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IFML_ACTION: {
				IFMLAction ifmlAction = (IFMLAction)theEObject;
				T result = caseIFMLAction(ifmlAction);
				if (result == null) result = caseInteractionFlowElement(ifmlAction);
				if (result == null) result = caseNamedElement(ifmlAction);
				if (result == null) result = caseInteractionFlowModelElement(ifmlAction);
				if (result == null) result = caseElement(ifmlAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAVIGATION_FLOW: {
				NavigationFlow navigationFlow = (NavigationFlow)theEObject;
				T result = caseNavigationFlow(navigationFlow);
				if (result == null) result = caseInteractionFlow(navigationFlow);
				if (result == null) result = caseInteractionFlowModelElement(navigationFlow);
				if (result == null) result = caseElement(navigationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARAMETER_BINDING_GROUP: {
				ParameterBindingGroup parameterBindingGroup = (ParameterBindingGroup)theEObject;
				T result = caseParameterBindingGroup(parameterBindingGroup);
				if (result == null) result = caseInteractionFlowModelElement(parameterBindingGroup);
				if (result == null) result = caseElement(parameterBindingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseBooleanExpression(constraint);
				if (result == null) result = caseExpression(constraint);
				if (result == null) result = caseInteractionFlowModelElement(constraint);
				if (result == null) result = caseElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_COMPONENT: {
				ViewComponent viewComponent = (ViewComponent)theEObject;
				T result = caseViewComponent(viewComponent);
				if (result == null) result = caseViewElement(viewComponent);
				if (result == null) result = caseInteractionFlowElement(viewComponent);
				if (result == null) result = caseNamedElement(viewComponent);
				if (result == null) result = caseInteractionFlowModelElement(viewComponent);
				if (result == null) result = caseElement(viewComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IFML_PARAMETER: {
				IFMLParameter ifmlParameter = (IFMLParameter)theEObject;
				T result = caseIFMLParameter(ifmlParameter);
				if (result == null) result = caseInteractionFlowModelElement(ifmlParameter);
				if (result == null) result = caseNamedElement(ifmlParameter);
				if (result == null) result = caseElement(ifmlParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_BINDING: {
				DataBinding dataBinding = (DataBinding)theEObject;
				T result = caseDataBinding(dataBinding);
				if (result == null) result = caseContentBinding(dataBinding);
				if (result == null) result = caseViewComponentPart(dataBinding);
				if (result == null) result = caseInteractionFlowElement(dataBinding);
				if (result == null) result = caseNamedElement(dataBinding);
				if (result == null) result = caseInteractionFlowModelElement(dataBinding);
				if (result == null) result = caseElement(dataBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONDITIONAL_EXPRESSION: {
				ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
				T result = caseConditionalExpression(conditionalExpression);
				if (result == null) result = caseExpression(conditionalExpression);
				if (result == null) result = caseViewComponentPart(conditionalExpression);
				if (result == null) result = caseInteractionFlowElement(conditionalExpression);
				if (result == null) result = caseInteractionFlowModelElement(conditionalExpression);
				if (result == null) result = caseNamedElement(conditionalExpression);
				if (result == null) result = caseElement(conditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseElement(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VISUALIZATION_ATTRIBUTE: {
				VisualizationAttribute visualizationAttribute = (VisualizationAttribute)theEObject;
				T result = caseVisualizationAttribute(visualizationAttribute);
				if (result == null) result = caseViewComponentPart(visualizationAttribute);
				if (result == null) result = caseInteractionFlowElement(visualizationAttribute);
				if (result == null) result = caseNamedElement(visualizationAttribute);
				if (result == null) result = caseInteractionFlowModelElement(visualizationAttribute);
				if (result == null) result = caseElement(visualizationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseInteractionFlowElement(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = caseInteractionFlowModelElement(event);
				if (result == null) result = caseElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION_FLOW_MODEL_ELEMENT: {
				InteractionFlowModelElement interactionFlowModelElement = (InteractionFlowModelElement)theEObject;
				T result = caseInteractionFlowModelElement(interactionFlowModelElement);
				if (result == null) result = caseElement(interactionFlowModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_ELEMENT_EVENT: {
				ViewElementEvent viewElementEvent = (ViewElementEvent)theEObject;
				T result = caseViewElementEvent(viewElementEvent);
				if (result == null) result = caseCatchingEvent(viewElementEvent);
				if (result == null) result = caseEvent(viewElementEvent);
				if (result == null) result = caseInteractionFlowElement(viewElementEvent);
				if (result == null) result = caseNamedElement(viewElementEvent);
				if (result == null) result = caseInteractionFlowModelElement(viewElementEvent);
				if (result == null) result = caseElement(viewElementEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODULE_PACKAGE: {
				ModulePackage modulePackage = (ModulePackage)theEObject;
				T result = caseModulePackage(modulePackage);
				if (result == null) result = caseModularizationElement(modulePackage);
				if (result == null) result = caseNamedElement(modulePackage);
				if (result == null) result = caseInteractionFlowModelElement(modulePackage);
				if (result == null) result = caseElement(modulePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODULARIZATION_ELEMENT: {
				ModularizationElement modularizationElement = (ModularizationElement)theEObject;
				T result = caseModularizationElement(modularizationElement);
				if (result == null) result = caseNamedElement(modularizationElement);
				if (result == null) result = caseInteractionFlowModelElement(modularizationElement);
				if (result == null) result = caseElement(modularizationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IFML_MODULE: {
				IFMLModule ifmlModule = (IFMLModule)theEObject;
				T result = caseIFMLModule(ifmlModule);
				if (result == null) result = caseInteractionFlowElement(ifmlModule);
				if (result == null) result = caseNamedElement(ifmlModule);
				if (result == null) result = caseInteractionFlowModelElement(ifmlModule);
				if (result == null) result = caseElement(ifmlModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IFML_PORT: {
				IFMLPort ifmlPort = (IFMLPort)theEObject;
				T result = caseIFMLPort(ifmlPort);
				if (result == null) result = caseInteractionFlowElement(ifmlPort);
				if (result == null) result = caseNamedElement(ifmlPort);
				if (result == null) result = caseInteractionFlowModelElement(ifmlPort);
				if (result == null) result = caseElement(ifmlPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CATCHING_EVENT: {
				CatchingEvent catchingEvent = (CatchingEvent)theEObject;
				T result = caseCatchingEvent(catchingEvent);
				if (result == null) result = caseEvent(catchingEvent);
				if (result == null) result = caseInteractionFlowElement(catchingEvent);
				if (result == null) result = caseNamedElement(catchingEvent);
				if (result == null) result = caseInteractionFlowModelElement(catchingEvent);
				if (result == null) result = caseElement(catchingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.THROWING_EVENT: {
				ThrowingEvent throwingEvent = (ThrowingEvent)theEObject;
				T result = caseThrowingEvent(throwingEvent);
				if (result == null) result = caseEvent(throwingEvent);
				if (result == null) result = caseInteractionFlowElement(throwingEvent);
				if (result == null) result = caseNamedElement(throwingEvent);
				if (result == null) result = caseInteractionFlowModelElement(throwingEvent);
				if (result == null) result = caseElement(throwingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BPMN_ACTIVITY_CONCEPT: {
				BPMNActivityConcept bpmnActivityConcept = (BPMNActivityConcept)theEObject;
				T result = caseBPMNActivityConcept(bpmnActivityConcept);
				if (result == null) result = caseActivityConcept(bpmnActivityConcept);
				if (result == null) result = caseNamedElement(bpmnActivityConcept);
				if (result == null) result = caseElement(bpmnActivityConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTEXT_VARIABLE: {
				ContextVariable contextVariable = (ContextVariable)theEObject;
				T result = caseContextVariable(contextVariable);
				if (result == null) result = caseNamedElement(contextVariable);
				if (result == null) result = caseElement(contextVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SIMPLE_CONTEXT_VARIABLE: {
				SimpleContextVariable simpleContextVariable = (SimpleContextVariable)theEObject;
				T result = caseSimpleContextVariable(simpleContextVariable);
				if (result == null) result = caseContextVariable(simpleContextVariable);
				if (result == null) result = caseNamedElement(simpleContextVariable);
				if (result == null) result = caseElement(simpleContextVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_CONTEXT_VARIABLE: {
				DataContextVariable dataContextVariable = (DataContextVariable)theEObject;
				T result = caseDataContextVariable(dataContextVariable);
				if (result == null) result = caseContextVariable(dataContextVariable);
				if (result == null) result = caseNamedElement(dataContextVariable);
				if (result == null) result = caseElement(dataContextVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOMAIN_CONCEPT: {
				DomainConcept domainConcept = (DomainConcept)theEObject;
				T result = caseDomainConcept(domainConcept);
				if (result == null) result = caseDomainElement(domainConcept);
				if (result == null) result = caseNamedElement(domainConcept);
				if (result == null) result = caseElement(domainConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FEATURE_CONCEPT: {
				FeatureConcept featureConcept = (FeatureConcept)theEObject;
				T result = caseFeatureConcept(featureConcept);
				if (result == null) result = caseDomainElement(featureConcept);
				if (result == null) result = caseNamedElement(featureConcept);
				if (result == null) result = caseElement(featureConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BEHAVIOR_CONCEPT: {
				BehaviorConcept behaviorConcept = (BehaviorConcept)theEObject;
				T result = caseBehaviorConcept(behaviorConcept);
				if (result == null) result = caseDomainElement(behaviorConcept);
				if (result == null) result = caseNamedElement(behaviorConcept);
				if (result == null) result = caseElement(behaviorConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BEHAVIORAL_FEATURE_CONCEPT: {
				BehavioralFeatureConcept behavioralFeatureConcept = (BehavioralFeatureConcept)theEObject;
				T result = caseBehavioralFeatureConcept(behavioralFeatureConcept);
				if (result == null) result = caseDomainElement(behavioralFeatureConcept);
				if (result == null) result = caseNamedElement(behavioralFeatureConcept);
				if (result == null) result = caseElement(behavioralFeatureConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UML_BEHAVIOR: {
				UMLBehavior umlBehavior = (UMLBehavior)theEObject;
				T result = caseUMLBehavior(umlBehavior);
				if (result == null) result = caseBehaviorConcept(umlBehavior);
				if (result == null) result = caseDomainElement(umlBehavior);
				if (result == null) result = caseNamedElement(umlBehavior);
				if (result == null) result = caseElement(umlBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UML_BEHAVIORAL_FEATURE: {
				UMLBehavioralFeature umlBehavioralFeature = (UMLBehavioralFeature)theEObject;
				T result = caseUMLBehavioralFeature(umlBehavioralFeature);
				if (result == null) result = caseBehavioralFeatureConcept(umlBehavioralFeature);
				if (result == null) result = caseDomainElement(umlBehavioralFeature);
				if (result == null) result = caseNamedElement(umlBehavioralFeature);
				if (result == null) result = caseElement(umlBehavioralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UML_DOMAIN_CONCEPT: {
				UMLDomainConcept umlDomainConcept = (UMLDomainConcept)theEObject;
				T result = caseUMLDomainConcept(umlDomainConcept);
				if (result == null) result = caseDomainConcept(umlDomainConcept);
				if (result == null) result = caseDomainElement(umlDomainConcept);
				if (result == null) result = caseNamedElement(umlDomainConcept);
				if (result == null) result = caseElement(umlDomainConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UML_STRUCTURAL_FEATURE: {
				UMLStructuralFeature umlStructuralFeature = (UMLStructuralFeature)theEObject;
				T result = caseUMLStructuralFeature(umlStructuralFeature);
				if (result == null) result = caseFeatureConcept(umlStructuralFeature);
				if (result == null) result = caseDomainElement(umlStructuralFeature);
				if (result == null) result = caseNamedElement(umlStructuralFeature);
				if (result == null) result = caseElement(umlStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ACTIVITY_CONCEPT: {
				ActivityConcept activityConcept = (ActivityConcept)theEObject;
				T result = caseActivityConcept(activityConcept);
				if (result == null) result = caseNamedElement(activityConcept);
				if (result == null) result = caseElement(activityConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOMAIN_ELEMENT: {
				DomainElement domainElement = (DomainElement)theEObject;
				T result = caseDomainElement(domainElement);
				if (result == null) result = caseNamedElement(domainElement);
				if (result == null) result = caseElement(domainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlow(InteractionFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowExpression(InteractionFlowExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemEvent(SystemEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBinding(ParameterBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEvent(ActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDefinition(PortDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentBinding(ContentBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElement(ViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicBehavior(DynamicBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpoint(Viewpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Component Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Component Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewComponentPart(ViewComponentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewContainer(ViewContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationExpression(ActivationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowModel(InteractionFlowModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextDimension(ContextDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFMLModel(IFMLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinition(ModuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowElement(InteractionFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFMLAction(IFMLAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationFlow(NavigationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Binding Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Binding Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBindingGroup(ParameterBindingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewComponent(ViewComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFMLParameter(IFMLParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBinding(DataBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression(ConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizationAttribute(VisualizationAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowModelElement(InteractionFlowModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElementEvent(ViewElementEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulePackage(ModulePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modularization Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modularization Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModularizationElement(ModularizationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFMLModule(IFMLModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFMLPort(IFMLPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchingEvent(CatchingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throwing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throwing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowingEvent(ThrowingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Activity Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPMN Activity Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNActivityConcept(BPMNActivityConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextVariable(ContextVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Context Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleContextVariable(SimpleContextVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Context Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataContextVariable(DataContextVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainConcept(DomainConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureConcept(FeatureConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConcept(BehaviorConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Feature Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralFeatureConcept(BehavioralFeatureConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLBehavior(UMLBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Behavioral Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLBehavioralFeature(UMLBehavioralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Domain Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Domain Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLDomainConcept(UMLDomainConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLStructuralFeature(UMLStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityConcept(ActivityConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainElement(DomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
