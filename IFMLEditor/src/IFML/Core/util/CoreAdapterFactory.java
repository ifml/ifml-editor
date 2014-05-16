/**
 */
package IFML.Core.util;

import IFML.Core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see IFML.Core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseInteractionFlow(InteractionFlow object) {
				return createInteractionFlowAdapter();
			}
			@Override
			public Adapter caseInteractionFlowExpression(InteractionFlowExpression object) {
				return createInteractionFlowExpressionAdapter();
			}
			@Override
			public Adapter caseSystemEvent(SystemEvent object) {
				return createSystemEventAdapter();
			}
			@Override
			public Adapter caseParameterBinding(ParameterBinding object) {
				return createParameterBindingAdapter();
			}
			@Override
			public Adapter caseActionEvent(ActionEvent object) {
				return createActionEventAdapter();
			}
			@Override
			public Adapter caseDomainModel(DomainModel object) {
				return createDomainModelAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePortDefinition(PortDefinition object) {
				return createPortDefinitionAdapter();
			}
			@Override
			public Adapter caseContentBinding(ContentBinding object) {
				return createContentBindingAdapter();
			}
			@Override
			public Adapter caseViewElement(ViewElement object) {
				return createViewElementAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseDynamicBehavior(DynamicBehavior object) {
				return createDynamicBehaviorAdapter();
			}
			@Override
			public Adapter caseViewpoint(Viewpoint object) {
				return createViewpointAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseViewComponentPart(ViewComponentPart object) {
				return createViewComponentPartAdapter();
			}
			@Override
			public Adapter caseViewContainer(ViewContainer object) {
				return createViewContainerAdapter();
			}
			@Override
			public Adapter caseActivationExpression(ActivationExpression object) {
				return createActivationExpressionAdapter();
			}
			@Override
			public Adapter caseInteractionFlowModel(InteractionFlowModel object) {
				return createInteractionFlowModelAdapter();
			}
			@Override
			public Adapter caseContextDimension(ContextDimension object) {
				return createContextDimensionAdapter();
			}
			@Override
			public Adapter caseIFMLModel(IFMLModel object) {
				return createIFMLModelAdapter();
			}
			@Override
			public Adapter caseModuleDefinition(ModuleDefinition object) {
				return createModuleDefinitionAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseInteractionFlowElement(InteractionFlowElement object) {
				return createInteractionFlowElementAdapter();
			}
			@Override
			public Adapter caseIFMLAction(IFMLAction object) {
				return createIFMLActionAdapter();
			}
			@Override
			public Adapter caseNavigationFlow(NavigationFlow object) {
				return createNavigationFlowAdapter();
			}
			@Override
			public Adapter caseParameterBindingGroup(ParameterBindingGroup object) {
				return createParameterBindingGroupAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseViewComponent(ViewComponent object) {
				return createViewComponentAdapter();
			}
			@Override
			public Adapter caseIFMLParameter(IFMLParameter object) {
				return createIFMLParameterAdapter();
			}
			@Override
			public Adapter caseDataBinding(DataBinding object) {
				return createDataBindingAdapter();
			}
			@Override
			public Adapter caseConditionalExpression(ConditionalExpression object) {
				return createConditionalExpressionAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseVisualizationAttribute(VisualizationAttribute object) {
				return createVisualizationAttributeAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseInteractionFlowModelElement(InteractionFlowModelElement object) {
				return createInteractionFlowModelElementAdapter();
			}
			@Override
			public Adapter caseViewElementEvent(ViewElementEvent object) {
				return createViewElementEventAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseModulePackage(ModulePackage object) {
				return createModulePackageAdapter();
			}
			@Override
			public Adapter caseModularizationElement(ModularizationElement object) {
				return createModularizationElementAdapter();
			}
			@Override
			public Adapter caseIFMLModule(IFMLModule object) {
				return createIFMLModuleAdapter();
			}
			@Override
			public Adapter caseIFMLPort(IFMLPort object) {
				return createIFMLPortAdapter();
			}
			@Override
			public Adapter caseCatchingEvent(CatchingEvent object) {
				return createCatchingEventAdapter();
			}
			@Override
			public Adapter caseThrowingEvent(ThrowingEvent object) {
				return createThrowingEventAdapter();
			}
			@Override
			public Adapter caseBPMNActivityConcept(BPMNActivityConcept object) {
				return createBPMNActivityConceptAdapter();
			}
			@Override
			public Adapter caseContextVariable(ContextVariable object) {
				return createContextVariableAdapter();
			}
			@Override
			public Adapter caseSimpleContextVariable(SimpleContextVariable object) {
				return createSimpleContextVariableAdapter();
			}
			@Override
			public Adapter caseDataContextVariable(DataContextVariable object) {
				return createDataContextVariableAdapter();
			}
			@Override
			public Adapter caseDomainConcept(DomainConcept object) {
				return createDomainConceptAdapter();
			}
			@Override
			public Adapter caseFeatureConcept(FeatureConcept object) {
				return createFeatureConceptAdapter();
			}
			@Override
			public Adapter caseBehaviorConcept(BehaviorConcept object) {
				return createBehaviorConceptAdapter();
			}
			@Override
			public Adapter caseBehavioralFeatureConcept(BehavioralFeatureConcept object) {
				return createBehavioralFeatureConceptAdapter();
			}
			@Override
			public Adapter caseUMLBehavior(UMLBehavior object) {
				return createUMLBehaviorAdapter();
			}
			@Override
			public Adapter caseUMLBehavioralFeature(UMLBehavioralFeature object) {
				return createUMLBehavioralFeatureAdapter();
			}
			@Override
			public Adapter caseUMLDomainConcept(UMLDomainConcept object) {
				return createUMLDomainConceptAdapter();
			}
			@Override
			public Adapter caseUMLStructuralFeature(UMLStructuralFeature object) {
				return createUMLStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseActivityConcept(ActivityConcept object) {
				return createActivityConceptAdapter();
			}
			@Override
			public Adapter caseDomainElement(DomainElement object) {
				return createDomainElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.InteractionFlow <em>Interaction Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.InteractionFlow
	 * @generated
	 */
	public Adapter createInteractionFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.InteractionFlowExpression <em>Interaction Flow Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.InteractionFlowExpression
	 * @generated
	 */
	public Adapter createInteractionFlowExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.SystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.SystemEvent
	 * @generated
	 */
	public Adapter createSystemEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ParameterBinding
	 * @generated
	 */
	public Adapter createParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ActionEvent
	 * @generated
	 */
	public Adapter createActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.PortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.PortDefinition
	 * @generated
	 */
	public Adapter createPortDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ContentBinding <em>Content Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ContentBinding
	 * @generated
	 */
	public Adapter createContentBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewElement
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.DynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.DynamicBehavior
	 * @generated
	 */
	public Adapter createDynamicBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Viewpoint
	 * @generated
	 */
	public Adapter createViewpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewComponentPart <em>View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewComponentPart
	 * @generated
	 */
	public Adapter createViewComponentPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewContainer
	 * @generated
	 */
	public Adapter createViewContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ActivationExpression
	 * @generated
	 */
	public Adapter createActivationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.InteractionFlowModel <em>Interaction Flow Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.InteractionFlowModel
	 * @generated
	 */
	public Adapter createInteractionFlowModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ContextDimension <em>Context Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ContextDimension
	 * @generated
	 */
	public Adapter createContextDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.IFMLModel <em>IFML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.IFMLModel
	 * @generated
	 */
	public Adapter createIFMLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ModuleDefinition
	 * @generated
	 */
	public Adapter createModuleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.InteractionFlowElement <em>Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.InteractionFlowElement
	 * @generated
	 */
	public Adapter createInteractionFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.IFMLAction <em>IFML Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.IFMLAction
	 * @generated
	 */
	public Adapter createIFMLActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.NavigationFlow <em>Navigation Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.NavigationFlow
	 * @generated
	 */
	public Adapter createNavigationFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ParameterBindingGroup <em>Parameter Binding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ParameterBindingGroup
	 * @generated
	 */
	public Adapter createParameterBindingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewComponent
	 * @generated
	 */
	public Adapter createViewComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.IFMLParameter <em>IFML Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.IFMLParameter
	 * @generated
	 */
	public Adapter createIFMLParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.DataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.DataBinding
	 * @generated
	 */
	public Adapter createDataBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ConditionalExpression
	 * @generated
	 */
	public Adapter createConditionalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.VisualizationAttribute <em>Visualization Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.VisualizationAttribute
	 * @generated
	 */
	public Adapter createVisualizationAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.InteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.InteractionFlowModelElement
	 * @generated
	 */
	public Adapter createInteractionFlowModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewElementEvent
	 * @generated
	 */
	public Adapter createViewElementEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ModulePackage <em>Module Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ModulePackage
	 * @generated
	 */
	public Adapter createModulePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ModularizationElement <em>Modularization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ModularizationElement
	 * @generated
	 */
	public Adapter createModularizationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.IFMLModule <em>IFML Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.IFMLModule
	 * @generated
	 */
	public Adapter createIFMLModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.IFMLPort <em>IFML Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.IFMLPort
	 * @generated
	 */
	public Adapter createIFMLPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.CatchingEvent <em>Catching Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.CatchingEvent
	 * @generated
	 */
	public Adapter createCatchingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ThrowingEvent <em>Throwing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ThrowingEvent
	 * @generated
	 */
	public Adapter createThrowingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.BPMNActivityConcept <em>BPMN Activity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.BPMNActivityConcept
	 * @generated
	 */
	public Adapter createBPMNActivityConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ContextVariable <em>Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ContextVariable
	 * @generated
	 */
	public Adapter createContextVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.SimpleContextVariable <em>Simple Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.SimpleContextVariable
	 * @generated
	 */
	public Adapter createSimpleContextVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.DataContextVariable <em>Data Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.DataContextVariable
	 * @generated
	 */
	public Adapter createDataContextVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.DomainConcept <em>Domain Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.DomainConcept
	 * @generated
	 */
	public Adapter createDomainConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.FeatureConcept <em>Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.FeatureConcept
	 * @generated
	 */
	public Adapter createFeatureConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.BehaviorConcept <em>Behavior Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.BehaviorConcept
	 * @generated
	 */
	public Adapter createBehaviorConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.BehavioralFeatureConcept <em>Behavioral Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.BehavioralFeatureConcept
	 * @generated
	 */
	public Adapter createBehavioralFeatureConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.UMLBehavior <em>UML Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.UMLBehavior
	 * @generated
	 */
	public Adapter createUMLBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.UMLBehavioralFeature <em>UML Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.UMLBehavioralFeature
	 * @generated
	 */
	public Adapter createUMLBehavioralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.UMLDomainConcept <em>UML Domain Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.UMLDomainConcept
	 * @generated
	 */
	public Adapter createUMLDomainConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.UMLStructuralFeature <em>UML Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.UMLStructuralFeature
	 * @generated
	 */
	public Adapter createUMLStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ActivityConcept <em>Activity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ActivityConcept
	 * @generated
	 */
	public Adapter createActivityConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.DomainElement
	 * @generated
	 */
	public Adapter createDomainElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
