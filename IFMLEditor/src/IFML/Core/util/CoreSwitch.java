/**
 */
package IFML.Core.util;

import IFML.Core.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
public class CoreSwitch {
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.INTERACTION_FLOW: {
				InteractionFlow interactionFlow = (InteractionFlow)theEObject;
				Object result = caseInteractionFlow(interactionFlow);
				if (result == null) result = caseInteractionFlowModelElement(interactionFlow);
				if (result == null) result = caseElement(interactionFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION_FLOW_EXPRESSION: {
				InteractionFlowExpression interactionFlowExpression = (InteractionFlowExpression)theEObject;
				Object result = caseInteractionFlowExpression(interactionFlowExpression);
				if (result == null) result = caseExpression(interactionFlowExpression);
				if (result == null) result = caseInteractionFlowModelElement(interactionFlowExpression);
				if (result == null) result = caseElement(interactionFlowExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SYSTEM_EVENT: {
				SystemEvent systemEvent = (SystemEvent)theEObject;
				Object result = caseSystemEvent(systemEvent);
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
				Object result = caseParameterBinding(parameterBinding);
				if (result == null) result = caseInteractionFlowModelElement(parameterBinding);
				if (result == null) result = caseElement(parameterBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ACTION_EVENT: {
				ActionEvent actionEvent = (ActionEvent)theEObject;
				Object result = caseActionEvent(actionEvent);
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
				Object result = caseDomainModel(domainModel);
				if (result == null) result = caseNamedElement(domainModel);
				if (result == null) result = caseElement(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				Object result = caseNamedElement(namedElement);
				if (result == null) result = caseElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PORT_DEFINITION: {
				PortDefinition portDefinition = (PortDefinition)theEObject;
				Object result = casePortDefinition(portDefinition);
				if (result == null) result = caseInteractionFlowElement(portDefinition);
				if (result == null) result = caseNamedElement(portDefinition);
				if (result == null) result = caseInteractionFlowModelElement(portDefinition);
				if (result == null) result = caseElement(portDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTENT_BINDING: {
				ContentBinding contentBinding = (ContentBinding)theEObject;
				Object result = caseContentBinding(contentBinding);
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
				Object result = caseViewElement(viewElement);
				if (result == null) result = caseInteractionFlowElement(viewElement);
				if (result == null) result = caseNamedElement(viewElement);
				if (result == null) result = caseInteractionFlowModelElement(viewElement);
				if (result == null) result = caseElement(viewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				Object result = caseExpression(expression);
				if (result == null) result = caseInteractionFlowModelElement(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DYNAMIC_BEHAVIOR: {
				DynamicBehavior dynamicBehavior = (DynamicBehavior)theEObject;
				Object result = caseDynamicBehavior(dynamicBehavior);
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
				Object result = caseViewpoint(viewpoint);
				if (result == null) result = caseNamedElement(viewpoint);
				if (result == null) result = caseElement(viewpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				Object result = caseDataFlow(dataFlow);
				if (result == null) result = caseInteractionFlow(dataFlow);
				if (result == null) result = caseInteractionFlowModelElement(dataFlow);
				if (result == null) result = caseElement(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_COMPONENT_PART: {
				ViewComponentPart viewComponentPart = (ViewComponentPart)theEObject;
				Object result = caseViewComponentPart(viewComponentPart);
				if (result == null) result = caseInteractionFlowElement(viewComponentPart);
				if (result == null) result = caseNamedElement(viewComponentPart);
				if (result == null) result = caseInteractionFlowModelElement(viewComponentPart);
				if (result == null) result = caseElement(viewComponentPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_CONTAINER: {
				ViewContainer viewContainer = (ViewContainer)theEObject;
				Object result = caseViewContainer(viewContainer);
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
				Object result = caseActivationExpression(activationExpression);
				if (result == null) result = caseBooleanExpression(activationExpression);
				if (result == null) result = caseExpression(activationExpression);
				if (result == null) result = caseInteractionFlowModelElement(activationExpression);
				if (result == null) result = caseElement(activationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION_FLOW_MODEL: {
				InteractionFlowModel interactionFlowModel = (InteractionFlowModel)theEObject;
				Object result = caseInteractionFlowModel(interactionFlowModel);
				if (result == null) result = caseNamedElement(interactionFlowModel);
				if (result == null) result = caseElement(interactionFlowModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTEXT_DIMENSION: {
				ContextDimension contextDimension = (ContextDimension)theEObject;
				Object result = caseContextDimension(contextDimension);
				if (result == null) result = caseNamedElement(contextDimension);
				if (result == null) result = caseElement(contextDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IFML_MODEL: {
				IFMLModel ifmlModel = (IFMLModel)theEObject;
				Object result = caseIFMLModel(ifmlModel);
				if (result == null) result = caseNamedElement(ifmlModel);
				if (result == null) result = caseElement(ifmlModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODULE_DEFINITION: {
				ModuleDefinition moduleDefinition = (ModuleDefinition)theEObject;
				Object result = caseModuleDefinition(moduleDefinition);
				if (result == null) result = caseModularizationElement(moduleDefinition);
				if (result == null) result = caseNamedElement(moduleDefinition);
				if (result == null) result = caseInteractionFlowModelElement(moduleDefinition);
				if (result == null) result = caseElement(moduleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				Object result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = caseInteractionFlowModelElement(booleanExpression);
				if (result == null) result = caseElement(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION_FLOW_ELEMENT: {
				InteractionFlowElement interactionFlowElement = (InteractionFlowElement)theEObject;
				Object result = caseInteractionFlowElement(interactionFlowElement);
				if (result == null) result = caseNamedElement(interactionFlowElement);
				if (result == null) result = caseInteractionFlowModelElement(interactionFlowElement);
				if (result == null) result = caseElement(interactionFlowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IFML_ACTION: {
				IFMLAction ifmlAction = (IFMLAction)theEObject;
				Object result = caseIFMLAction(ifmlAction);
				if (result == null) result = caseInteractionFlowElement(ifmlAction);
				if (result == null) result = caseNamedElement(ifmlAction);
				if (result == null) result = caseInteractionFlowModelElement(ifmlAction);
				if (result == null) result = caseElement(ifmlAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAVIGATION_FLOW: {
				NavigationFlow navigationFlow = (NavigationFlow)theEObject;
				Object result = caseNavigationFlow(navigationFlow);
				if (result == null) result = caseInteractionFlow(navigationFlow);
				if (result == null) result = caseInteractionFlowModelElement(navigationFlow);
				if (result == null) result = caseElement(navigationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARAMETER_BINDING_GROUP: {
				ParameterBindingGroup parameterBindingGroup = (ParameterBindingGroup)theEObject;
				Object result = caseParameterBindingGroup(parameterBindingGroup);
				if (result == null) result = caseInteractionFlowModelElement(parameterBindingGroup);
				if (result == null) result = caseElement(parameterBindingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ELEMENT: {
				Element element = (Element)theEObject;
				Object result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				Object result = caseConstraint(constraint);
				if (result == null) result = caseBooleanExpression(constraint);
				if (result == null) result = caseExpression(constraint);
				if (result == null) result = caseInteractionFlowModelElement(constraint);
				if (result == null) result = caseElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_COMPONENT: {
				ViewComponent viewComponent = (ViewComponent)theEObject;
				Object result = caseViewComponent(viewComponent);
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
				Object result = caseIFMLParameter(ifmlParameter);
				if (result == null) result = caseInteractionFlowModelElement(ifmlParameter);
				if (result == null) result = caseNamedElement(ifmlParameter);
				if (result == null) result = caseElement(ifmlParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_BINDING: {
				DataBinding dataBinding = (DataBinding)theEObject;
				Object result = caseDataBinding(dataBinding);
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
				Object result = caseConditionalExpression(conditionalExpression);
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
				Object result = caseContext(context);
				if (result == null) result = caseElement(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VISUALIZATION_ATTRIBUTE: {
				VisualizationAttribute visualizationAttribute = (VisualizationAttribute)theEObject;
				Object result = caseVisualizationAttribute(visualizationAttribute);
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
				Object result = caseEvent(event);
				if (result == null) result = caseInteractionFlowElement(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = caseInteractionFlowModelElement(event);
				if (result == null) result = caseElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION_FLOW_MODEL_ELEMENT: {
				InteractionFlowModelElement interactionFlowModelElement = (InteractionFlowModelElement)theEObject;
				Object result = caseInteractionFlowModelElement(interactionFlowModelElement);
				if (result == null) result = caseElement(interactionFlowModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_ELEMENT_EVENT: {
				ViewElementEvent viewElementEvent = (ViewElementEvent)theEObject;
				Object result = caseViewElementEvent(viewElementEvent);
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
				Object result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODULE_PACKAGE: {
				ModulePackage modulePackage = (ModulePackage)theEObject;
				Object result = caseModulePackage(modulePackage);
				if (result == null) result = caseModularizationElement(modulePackage);
				if (result == null) result = caseNamedElement(modulePackage);
				if (result == null) result = caseInteractionFlowModelElement(modulePackage);
				if (result == null) result = caseElement(modulePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODULARIZATION_ELEMENT: {
				ModularizationElement modularizationElement = (ModularizationElement)theEObject;
				Object result = caseModularizationElement(modularizationElement);
				if (result == null) result = caseNamedElement(modularizationElement);
				if (result == null) result = caseInteractionFlowModelElement(modularizationElement);
				if (result == null) result = caseElement(modularizationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IFML_MODULE: {
				IFMLModule ifmlModule = (IFMLModule)theEObject;
				Object result = caseIFMLModule(ifmlModule);
				if (result == null) result = caseInteractionFlowElement(ifmlModule);
				if (result == null) result = caseNamedElement(ifmlModule);
				if (result == null) result = caseInteractionFlowModelElement(ifmlModule);
				if (result == null) result = caseElement(ifmlModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IFML_PORT: {
				IFMLPort ifmlPort = (IFMLPort)theEObject;
				Object result = caseIFMLPort(ifmlPort);
				if (result == null) result = caseInteractionFlowElement(ifmlPort);
				if (result == null) result = caseNamedElement(ifmlPort);
				if (result == null) result = caseInteractionFlowModelElement(ifmlPort);
				if (result == null) result = caseElement(ifmlPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CATCHING_EVENT: {
				CatchingEvent catchingEvent = (CatchingEvent)theEObject;
				Object result = caseCatchingEvent(catchingEvent);
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
				Object result = caseThrowingEvent(throwingEvent);
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
				Object result = caseBPMNActivityConcept(bpmnActivityConcept);
				if (result == null) result = caseActivityConcept(bpmnActivityConcept);
				if (result == null) result = caseNamedElement(bpmnActivityConcept);
				if (result == null) result = caseElement(bpmnActivityConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTEXT_VARIABLE: {
				ContextVariable contextVariable = (ContextVariable)theEObject;
				Object result = caseContextVariable(contextVariable);
				if (result == null) result = caseNamedElement(contextVariable);
				if (result == null) result = caseElement(contextVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SIMPLE_CONTEXT_VARIABLE: {
				SimpleContextVariable simpleContextVariable = (SimpleContextVariable)theEObject;
				Object result = caseSimpleContextVariable(simpleContextVariable);
				if (result == null) result = caseContextVariable(simpleContextVariable);
				if (result == null) result = caseNamedElement(simpleContextVariable);
				if (result == null) result = caseElement(simpleContextVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_CONTEXT_VARIABLE: {
				DataContextVariable dataContextVariable = (DataContextVariable)theEObject;
				Object result = caseDataContextVariable(dataContextVariable);
				if (result == null) result = caseContextVariable(dataContextVariable);
				if (result == null) result = caseNamedElement(dataContextVariable);
				if (result == null) result = caseElement(dataContextVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOMAIN_CONCEPT: {
				DomainConcept domainConcept = (DomainConcept)theEObject;
				Object result = caseDomainConcept(domainConcept);
				if (result == null) result = caseDomainElement(domainConcept);
				if (result == null) result = caseNamedElement(domainConcept);
				if (result == null) result = caseElement(domainConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FEATURE_CONCEPT: {
				FeatureConcept featureConcept = (FeatureConcept)theEObject;
				Object result = caseFeatureConcept(featureConcept);
				if (result == null) result = caseDomainElement(featureConcept);
				if (result == null) result = caseNamedElement(featureConcept);
				if (result == null) result = caseElement(featureConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BEHAVIOR_CONCEPT: {
				BehaviorConcept behaviorConcept = (BehaviorConcept)theEObject;
				Object result = caseBehaviorConcept(behaviorConcept);
				if (result == null) result = caseDomainElement(behaviorConcept);
				if (result == null) result = caseNamedElement(behaviorConcept);
				if (result == null) result = caseElement(behaviorConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BEHAVIORAL_FEATURE_CONCEPT: {
				BehavioralFeatureConcept behavioralFeatureConcept = (BehavioralFeatureConcept)theEObject;
				Object result = caseBehavioralFeatureConcept(behavioralFeatureConcept);
				if (result == null) result = caseDomainElement(behavioralFeatureConcept);
				if (result == null) result = caseNamedElement(behavioralFeatureConcept);
				if (result == null) result = caseElement(behavioralFeatureConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UML_BEHAVIOR: {
				UMLBehavior umlBehavior = (UMLBehavior)theEObject;
				Object result = caseUMLBehavior(umlBehavior);
				if (result == null) result = caseBehaviorConcept(umlBehavior);
				if (result == null) result = caseDomainElement(umlBehavior);
				if (result == null) result = caseNamedElement(umlBehavior);
				if (result == null) result = caseElement(umlBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UML_BEHAVIORAL_FEATURE: {
				UMLBehavioralFeature umlBehavioralFeature = (UMLBehavioralFeature)theEObject;
				Object result = caseUMLBehavioralFeature(umlBehavioralFeature);
				if (result == null) result = caseBehavioralFeatureConcept(umlBehavioralFeature);
				if (result == null) result = caseDomainElement(umlBehavioralFeature);
				if (result == null) result = caseNamedElement(umlBehavioralFeature);
				if (result == null) result = caseElement(umlBehavioralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UML_DOMAIN_CONCEPT: {
				UMLDomainConcept umlDomainConcept = (UMLDomainConcept)theEObject;
				Object result = caseUMLDomainConcept(umlDomainConcept);
				if (result == null) result = caseDomainConcept(umlDomainConcept);
				if (result == null) result = caseDomainElement(umlDomainConcept);
				if (result == null) result = caseNamedElement(umlDomainConcept);
				if (result == null) result = caseElement(umlDomainConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UML_STRUCTURAL_FEATURE: {
				UMLStructuralFeature umlStructuralFeature = (UMLStructuralFeature)theEObject;
				Object result = caseUMLStructuralFeature(umlStructuralFeature);
				if (result == null) result = caseFeatureConcept(umlStructuralFeature);
				if (result == null) result = caseDomainElement(umlStructuralFeature);
				if (result == null) result = caseNamedElement(umlStructuralFeature);
				if (result == null) result = caseElement(umlStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ACTIVITY_CONCEPT: {
				ActivityConcept activityConcept = (ActivityConcept)theEObject;
				Object result = caseActivityConcept(activityConcept);
				if (result == null) result = caseNamedElement(activityConcept);
				if (result == null) result = caseElement(activityConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOMAIN_ELEMENT: {
				DomainElement domainElement = (DomainElement)theEObject;
				Object result = caseDomainElement(domainElement);
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
	public Object caseInteractionFlow(InteractionFlow object) {
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
	public Object caseInteractionFlowExpression(InteractionFlowExpression object) {
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
	public Object caseSystemEvent(SystemEvent object) {
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
	public Object caseParameterBinding(ParameterBinding object) {
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
	public Object caseActionEvent(ActionEvent object) {
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
	public Object caseDomainModel(DomainModel object) {
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
	public Object caseNamedElement(NamedElement object) {
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
	public Object casePortDefinition(PortDefinition object) {
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
	public Object caseContentBinding(ContentBinding object) {
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
	public Object caseViewElement(ViewElement object) {
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
	public Object caseExpression(Expression object) {
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
	public Object caseDynamicBehavior(DynamicBehavior object) {
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
	public Object caseViewpoint(Viewpoint object) {
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
	public Object caseDataFlow(DataFlow object) {
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
	public Object caseViewComponentPart(ViewComponentPart object) {
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
	public Object caseViewContainer(ViewContainer object) {
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
	public Object caseActivationExpression(ActivationExpression object) {
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
	public Object caseInteractionFlowModel(InteractionFlowModel object) {
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
	public Object caseContextDimension(ContextDimension object) {
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
	public Object caseIFMLModel(IFMLModel object) {
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
	public Object caseModuleDefinition(ModuleDefinition object) {
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
	public Object caseBooleanExpression(BooleanExpression object) {
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
	public Object caseInteractionFlowElement(InteractionFlowElement object) {
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
	public Object caseIFMLAction(IFMLAction object) {
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
	public Object caseNavigationFlow(NavigationFlow object) {
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
	public Object caseParameterBindingGroup(ParameterBindingGroup object) {
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
	public Object caseElement(Element object) {
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
	public Object caseConstraint(Constraint object) {
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
	public Object caseViewComponent(ViewComponent object) {
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
	public Object caseIFMLParameter(IFMLParameter object) {
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
	public Object caseDataBinding(DataBinding object) {
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
	public Object caseConditionalExpression(ConditionalExpression object) {
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
	public Object caseContext(Context object) {
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
	public Object caseVisualizationAttribute(VisualizationAttribute object) {
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
	public Object caseEvent(Event object) {
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
	public Object caseInteractionFlowModelElement(InteractionFlowModelElement object) {
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
	public Object caseViewElementEvent(ViewElementEvent object) {
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
	public Object caseAnnotation(Annotation object) {
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
	public Object caseModulePackage(ModulePackage object) {
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
	public Object caseModularizationElement(ModularizationElement object) {
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
	public Object caseIFMLModule(IFMLModule object) {
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
	public Object caseIFMLPort(IFMLPort object) {
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
	public Object caseCatchingEvent(CatchingEvent object) {
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
	public Object caseThrowingEvent(ThrowingEvent object) {
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
	public Object caseBPMNActivityConcept(BPMNActivityConcept object) {
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
	public Object caseContextVariable(ContextVariable object) {
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
	public Object caseSimpleContextVariable(SimpleContextVariable object) {
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
	public Object caseDataContextVariable(DataContextVariable object) {
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
	public Object caseDomainConcept(DomainConcept object) {
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
	public Object caseFeatureConcept(FeatureConcept object) {
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
	public Object caseBehaviorConcept(BehaviorConcept object) {
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
	public Object caseBehavioralFeatureConcept(BehavioralFeatureConcept object) {
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
	public Object caseUMLBehavior(UMLBehavior object) {
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
	public Object caseUMLBehavioralFeature(UMLBehavioralFeature object) {
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
	public Object caseUMLDomainConcept(UMLDomainConcept object) {
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
	public Object caseUMLStructuralFeature(UMLStructuralFeature object) {
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
	public Object caseActivityConcept(ActivityConcept object) {
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
	public Object caseDomainElement(DomainElement object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
