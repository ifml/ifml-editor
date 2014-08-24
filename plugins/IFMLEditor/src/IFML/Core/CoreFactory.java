/**
 */
package IFML.Core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IFML.Core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = IFML.Core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interaction Flow Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Flow Expression</em>'.
	 * @generated
	 */
	InteractionFlowExpression createInteractionFlowExpression();

	/**
	 * Returns a new object of class '<em>System Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Event</em>'.
	 * @generated
	 */
	SystemEvent createSystemEvent();

	/**
	 * Returns a new object of class '<em>Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Binding</em>'.
	 * @generated
	 */
	ParameterBinding createParameterBinding();

	/**
	 * Returns a new object of class '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Event</em>'.
	 * @generated
	 */
	ActionEvent createActionEvent();

	/**
	 * Returns a new object of class '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns a new object of class '<em>Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Definition</em>'.
	 * @generated
	 */
	PortDefinition createPortDefinition();

	/**
	 * Returns a new object of class '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Element</em>'.
	 * @generated
	 */
	ViewElement createViewElement();

	/**
	 * Returns a new object of class '<em>Dynamic Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Behavior</em>'.
	 * @generated
	 */
	DynamicBehavior createDynamicBehavior();

	/**
	 * Returns a new object of class '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viewpoint</em>'.
	 * @generated
	 */
	Viewpoint createViewpoint();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>View Component Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Component Part</em>'.
	 * @generated
	 */
	ViewComponentPart createViewComponentPart();

	/**
	 * Returns a new object of class '<em>View Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Container</em>'.
	 * @generated
	 */
	ViewContainer createViewContainer();

	/**
	 * Returns a new object of class '<em>Activation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Expression</em>'.
	 * @generated
	 */
	ActivationExpression createActivationExpression();

	/**
	 * Returns a new object of class '<em>Interaction Flow Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Flow Model</em>'.
	 * @generated
	 */
	InteractionFlowModel createInteractionFlowModel();

	/**
	 * Returns a new object of class '<em>Context Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Dimension</em>'.
	 * @generated
	 */
	ContextDimension createContextDimension();

	/**
	 * Returns a new object of class '<em>IFML Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFML Model</em>'.
	 * @generated
	 */
	IFMLModel createIFMLModel();

	/**
	 * Returns a new object of class '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition</em>'.
	 * @generated
	 */
	ModuleDefinition createModuleDefinition();

	/**
	 * Returns a new object of class '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression</em>'.
	 * @generated
	 */
	BooleanExpression createBooleanExpression();

	/**
	 * Returns a new object of class '<em>IFML Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFML Action</em>'.
	 * @generated
	 */
	IFMLAction createIFMLAction();

	/**
	 * Returns a new object of class '<em>Navigation Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Flow</em>'.
	 * @generated
	 */
	NavigationFlow createNavigationFlow();

	/**
	 * Returns a new object of class '<em>Parameter Binding Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Binding Group</em>'.
	 * @generated
	 */
	ParameterBindingGroup createParameterBindingGroup();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>View Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Component</em>'.
	 * @generated
	 */
	ViewComponent createViewComponent();

	/**
	 * Returns a new object of class '<em>IFML Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFML Parameter</em>'.
	 * @generated
	 */
	IFMLParameter createIFMLParameter();

	/**
	 * Returns a new object of class '<em>Data Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Binding</em>'.
	 * @generated
	 */
	DataBinding createDataBinding();

	/**
	 * Returns a new object of class '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Expression</em>'.
	 * @generated
	 */
	ConditionalExpression createConditionalExpression();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Visualization Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization Attribute</em>'.
	 * @generated
	 */
	VisualizationAttribute createVisualizationAttribute();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>View Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Element Event</em>'.
	 * @generated
	 */
	ViewElementEvent createViewElementEvent();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Module Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Package</em>'.
	 * @generated
	 */
	ModulePackage createModulePackage();

	/**
	 * Returns a new object of class '<em>Modularization Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modularization Element</em>'.
	 * @generated
	 */
	ModularizationElement createModularizationElement();

	/**
	 * Returns a new object of class '<em>IFML Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFML Module</em>'.
	 * @generated
	 */
	IFMLModule createIFMLModule();

	/**
	 * Returns a new object of class '<em>IFML Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFML Port</em>'.
	 * @generated
	 */
	IFMLPort createIFMLPort();

	/**
	 * Returns a new object of class '<em>Catching Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catching Event</em>'.
	 * @generated
	 */
	CatchingEvent createCatchingEvent();

	/**
	 * Returns a new object of class '<em>Throwing Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throwing Event</em>'.
	 * @generated
	 */
	ThrowingEvent createThrowingEvent();

	/**
	 * Returns a new object of class '<em>BPMN Activity Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPMN Activity Concept</em>'.
	 * @generated
	 */
	BPMNActivityConcept createBPMNActivityConcept();

	/**
	 * Returns a new object of class '<em>Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Variable</em>'.
	 * @generated
	 */
	ContextVariable createContextVariable();

	/**
	 * Returns a new object of class '<em>Simple Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Context Variable</em>'.
	 * @generated
	 */
	SimpleContextVariable createSimpleContextVariable();

	/**
	 * Returns a new object of class '<em>Data Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Context Variable</em>'.
	 * @generated
	 */
	DataContextVariable createDataContextVariable();

	/**
	 * Returns a new object of class '<em>Domain Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Concept</em>'.
	 * @generated
	 */
	DomainConcept createDomainConcept();

	/**
	 * Returns a new object of class '<em>Feature Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Concept</em>'.
	 * @generated
	 */
	FeatureConcept createFeatureConcept();

	/**
	 * Returns a new object of class '<em>Behavior Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Concept</em>'.
	 * @generated
	 */
	BehaviorConcept createBehaviorConcept();

	/**
	 * Returns a new object of class '<em>Behavioral Feature Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavioral Feature Concept</em>'.
	 * @generated
	 */
	BehavioralFeatureConcept createBehavioralFeatureConcept();

	/**
	 * Returns a new object of class '<em>UML Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Behavior</em>'.
	 * @generated
	 */
	UMLBehavior createUMLBehavior();

	/**
	 * Returns a new object of class '<em>UML Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Behavioral Feature</em>'.
	 * @generated
	 */
	UMLBehavioralFeature createUMLBehavioralFeature();

	/**
	 * Returns a new object of class '<em>UML Domain Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Domain Concept</em>'.
	 * @generated
	 */
	UMLDomainConcept createUMLDomainConcept();

	/**
	 * Returns a new object of class '<em>UML Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Structural Feature</em>'.
	 * @generated
	 */
	UMLStructuralFeature createUMLStructuralFeature();

	/**
	 * Returns a new object of class '<em>Activity Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Concept</em>'.
	 * @generated
	 */
	ActivityConcept createActivityConcept();

	/**
	 * Returns a new object of class '<em>Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Element</em>'.
	 * @generated
	 */
	DomainElement createDomainElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
