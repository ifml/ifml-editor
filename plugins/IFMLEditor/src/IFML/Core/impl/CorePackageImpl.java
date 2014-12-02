/**
 */
package IFML.Core.impl;

import IFML.Core.ActionEvent;
import IFML.Core.ActivationExpression;
import IFML.Core.ActivityConcept;
import IFML.Core.Annotation;
import IFML.Core.BPMNActivityConcept;
import IFML.Core.BehaviorConcept;
import IFML.Core.BehavioralFeatureConcept;
import IFML.Core.BooleanExpression;
import IFML.Core.CatchingEvent;
import IFML.Core.ConditionalExpression;
import IFML.Core.Constraint;
import IFML.Core.ContentBinding;
import IFML.Core.Context;
import IFML.Core.ContextDimension;
import IFML.Core.ContextVariable;
import IFML.Core.CoreFactory;
import IFML.Core.CorePackage;
import IFML.Core.DataBinding;
import IFML.Core.DataContextVariable;
import IFML.Core.DataFlow;
import IFML.Core.DomainConcept;
import IFML.Core.DomainElement;
import IFML.Core.DomainModel;
import IFML.Core.DynamicBehavior;
import IFML.Core.Element;
import IFML.Core.Event;
import IFML.Core.Expression;
import IFML.Core.FeatureConcept;
import IFML.Core.IFMLAction;
import IFML.Core.IFMLModel;
import IFML.Core.IFMLModule;
import IFML.Core.IFMLParameter;
import IFML.Core.IFMLPort;
import IFML.Core.InteractionFlow;
import IFML.Core.InteractionFlowElement;
import IFML.Core.InteractionFlowExpression;
import IFML.Core.InteractionFlowModel;
import IFML.Core.InteractionFlowModelElement;
import IFML.Core.ModularizationElement;
import IFML.Core.ModuleDefinition;
import IFML.Core.ModulePackage;
import IFML.Core.NamedElement;
import IFML.Core.NavigationFlow;
import IFML.Core.ParameterBinding;
import IFML.Core.ParameterBindingGroup;
import IFML.Core.PortDefinition;
import IFML.Core.SimpleContextVariable;
import IFML.Core.SystemEvent;
import IFML.Core.ThrowingEvent;
import IFML.Core.UMLBehavior;
import IFML.Core.UMLBehavioralFeature;
import IFML.Core.UMLDomainConcept;
import IFML.Core.UMLStructuralFeature;
import IFML.Core.ViewComponent;
import IFML.Core.ViewComponentPart;
import IFML.Core.ViewContainer;
import IFML.Core.ViewElement;
import IFML.Core.ViewElementEvent;
import IFML.Core.Viewpoint;
import IFML.Core.VisualizationAttribute;

import IFML.DataTypes.DataTypesPackage;

import IFML.DataTypes.impl.DataTypesPackageImpl;

import IFML.Extensions.ExtensionsPackage;

import IFML.Extensions.impl.ExtensionsPackageImpl;

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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFlowExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewComponentPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFlowModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifmlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFlowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifmlActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBindingGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifmlParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFlowModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modularizationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifmlModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifmlPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnActivityConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleContextVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataContextVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralFeatureConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlBehavioralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlDomainConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainElementEClass = null;

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
	 * @see IFML.Core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) : ExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFlow() {
		return interactionFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlow_ParameterBindingGroup() {
		return (EReference)interactionFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlow_SourceInteractionFlowElement() {
		return (EReference)interactionFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlow_TargetInteractionFlowElement() {
		return (EReference)interactionFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFlowExpression() {
		return interactionFlowExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowExpression_InteractionFlow() {
		return (EReference)interactionFlowExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemEvent() {
		return systemEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEvent_TriggeringExpressions() {
		return (EReference)systemEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemEvent_Type() {
		return (EAttribute)systemEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBinding() {
		return parameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBinding_SourceParameter() {
		return (EReference)parameterBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBinding_TargetParameter() {
		return (EReference)parameterBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionEvent() {
		return actionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModel() {
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_DomainElements() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDefinition() {
		return portDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortDefinition_Ports() {
		return (EReference)portDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentBinding() {
		return contentBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentBinding_UniformResourceIdentifier() {
		return (EAttribute)contentBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewElement() {
		return viewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_ViewElementEvents() {
		return (EReference)viewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_ActivationExpression() {
		return (EReference)viewElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_ViewContainer() {
		return (EReference)viewElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Language() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Body() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicBehavior() {
		return dynamicBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicBehavior_BehavioralFeatureConcept() {
		return (EReference)dynamicBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicBehavior_BehaviorConcept() {
		return (EReference)dynamicBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewpoint() {
		return viewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpoint_InteractionFlowModelElements() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewpoint_Context() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewComponentPart() {
		return viewComponentPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewComponentPart_ViewElementEvents() {
		return (EReference)viewComponentPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewComponentPart_ActivationExpression() {
		return (EReference)viewComponentPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewComponentPart_ParentViewComponentPart() {
		return (EReference)viewComponentPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewComponentPart_SubViewComponentParts() {
		return (EReference)viewComponentPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewContainer() {
		return viewContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewContainer_IsLandmark() {
		return (EAttribute)viewContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewContainer_IsDefault() {
		return (EAttribute)viewContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewContainer_IsXOR() {
		return (EAttribute)viewContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewContainer_ViewElements() {
		return (EReference)viewContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewContainer_Actions() {
		return (EReference)viewContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationExpression() {
		return activationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFlowModel() {
		return interactionFlowModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowModel_InteractionFlowModelElements() {
		return (EReference)interactionFlowModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextDimension() {
		return contextDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFMLModel() {
		return ifmlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLModel_InteractionFlowModel() {
		return (EReference)ifmlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLModel_DomainModel() {
		return (EReference)ifmlModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLModel_InteractionFlowModelViewpoint() {
		return (EReference)ifmlModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleDefinition() {
		return moduleDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_InputPorts() {
		return (EReference)moduleDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_OutputPorts() {
		return (EReference)moduleDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_InteractionFlowModelElement() {
		return (EReference)moduleDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_Modules() {
		return (EReference)moduleDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_ActivityConcept() {
		return (EReference)moduleDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFlowElement() {
		return interactionFlowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowElement_Parameters() {
		return (EReference)interactionFlowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowElement_OutInteractionFlows() {
		return (EReference)interactionFlowElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowElement_InInteractionFlows() {
		return (EReference)interactionFlowElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFMLAction() {
		return ifmlActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLAction_ActionEvents() {
		return (EReference)ifmlActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLAction_DynamicBehavior() {
		return (EReference)ifmlActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLAction_ViewContainer() {
		return (EReference)ifmlActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationFlow() {
		return navigationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBindingGroup() {
		return parameterBindingGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBindingGroup_ParameterBindings() {
		return (EReference)parameterBindingGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Constraints() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Annotations() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewComponent() {
		return viewComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewComponent_ViewComponentParts() {
		return (EReference)viewComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFMLParameter() {
		return ifmlParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIFMLParameter_Direction() {
		return (EAttribute)ifmlParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLParameter_DefaultValue() {
		return (EReference)ifmlParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLParameter_Type() {
		return (EReference)ifmlParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBinding() {
		return dataBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_ConditionalExpression() {
		return (EReference)dataBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_VisualizationAttribute() {
		return (EReference)dataBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_DataContextVariables() {
		return (EReference)dataBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBinding_DomainConcept() {
		return (EReference)dataBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpression() {
		return conditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ContextDimensions() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ContextVariables() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualizationAttribute() {
		return visualizationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualizationAttribute_FeatureConcept() {
		return (EReference)visualizationAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_ActivationExpression() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_InteractionFlowExpression() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFlowModelElement() {
		return interactionFlowModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewElementEvent() {
		return viewElementEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElementEvent_ViewElement() {
		return (EReference)viewElementEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Text() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulePackage() {
		return modulePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePackage_ModularizationElements() {
		return (EReference)modulePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModularizationElement() {
		return modularizationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModularizationElement_ModulePackage() {
		return (EReference)modularizationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFMLModule() {
		return ifmlModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLModule_ModuleDefinition() {
		return (EReference)ifmlModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLModule_Ports() {
		return (EReference)ifmlModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFMLPort() {
		return ifmlPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLPort_PortDefinition() {
		return (EReference)ifmlPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFMLPort_Module() {
		return (EReference)ifmlPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchingEvent() {
		return catchingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowingEvent() {
		return throwingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNActivityConcept() {
		return bpmnActivityConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextVariable() {
		return contextVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextVariable_Context() {
		return (EReference)contextVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextVariable_Scope() {
		return (EAttribute)contextVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleContextVariable() {
		return simpleContextVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataContextVariable() {
		return dataContextVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataContextVariable_DataBinding() {
		return (EReference)dataContextVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainConcept() {
		return domainConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainConcept_DataBinding() {
		return (EReference)domainConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureConcept() {
		return featureConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureConcept_VisualizationAttribute() {
		return (EReference)featureConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorConcept() {
		return behaviorConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorConcept_DynamicBehavior() {
		return (EReference)behaviorConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralFeatureConcept() {
		return behavioralFeatureConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeatureConcept_DynamicBehavior() {
		return (EReference)behavioralFeatureConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLBehavior() {
		return umlBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLBehavior_Behavior() {
		return (EReference)umlBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLBehavioralFeature() {
		return umlBehavioralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLBehavioralFeature_BehavioralFeature() {
		return (EReference)umlBehavioralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLDomainConcept() {
		return umlDomainConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLDomainConcept_Classifier() {
		return (EReference)umlDomainConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLStructuralFeature() {
		return umlStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLStructuralFeature_StructuralFeature() {
		return (EReference)umlStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityConcept() {
		return activityConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityConcept_ModuleDefinition() {
		return (EReference)activityConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainElement() {
		return domainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		interactionFlowEClass = createEClass(INTERACTION_FLOW);
		createEReference(interactionFlowEClass, INTERACTION_FLOW__PARAMETER_BINDING_GROUP);
		createEReference(interactionFlowEClass, INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT);
		createEReference(interactionFlowEClass, INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT);

		interactionFlowExpressionEClass = createEClass(INTERACTION_FLOW_EXPRESSION);
		createEReference(interactionFlowExpressionEClass, INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW);

		systemEventEClass = createEClass(SYSTEM_EVENT);
		createEReference(systemEventEClass, SYSTEM_EVENT__TRIGGERING_EXPRESSIONS);
		createEAttribute(systemEventEClass, SYSTEM_EVENT__TYPE);

		parameterBindingEClass = createEClass(PARAMETER_BINDING);
		createEReference(parameterBindingEClass, PARAMETER_BINDING__SOURCE_PARAMETER);
		createEReference(parameterBindingEClass, PARAMETER_BINDING__TARGET_PARAMETER);

		actionEventEClass = createEClass(ACTION_EVENT);

		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__DOMAIN_ELEMENTS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		portDefinitionEClass = createEClass(PORT_DEFINITION);
		createEReference(portDefinitionEClass, PORT_DEFINITION__PORTS);

		contentBindingEClass = createEClass(CONTENT_BINDING);
		createEAttribute(contentBindingEClass, CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER);

		viewElementEClass = createEClass(VIEW_ELEMENT);
		createEReference(viewElementEClass, VIEW_ELEMENT__VIEW_ELEMENT_EVENTS);
		createEReference(viewElementEClass, VIEW_ELEMENT__ACTIVATION_EXPRESSION);
		createEReference(viewElementEClass, VIEW_ELEMENT__VIEW_CONTAINER);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__LANGUAGE);
		createEAttribute(expressionEClass, EXPRESSION__BODY);

		dynamicBehaviorEClass = createEClass(DYNAMIC_BEHAVIOR);
		createEReference(dynamicBehaviorEClass, DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT);
		createEReference(dynamicBehaviorEClass, DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT);

		viewpointEClass = createEClass(VIEWPOINT);
		createEReference(viewpointEClass, VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS);
		createEReference(viewpointEClass, VIEWPOINT__CONTEXT);

		dataFlowEClass = createEClass(DATA_FLOW);

		viewComponentPartEClass = createEClass(VIEW_COMPONENT_PART);
		createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS);
		createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION);
		createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART);
		createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS);

		viewContainerEClass = createEClass(VIEW_CONTAINER);
		createEAttribute(viewContainerEClass, VIEW_CONTAINER__IS_LANDMARK);
		createEAttribute(viewContainerEClass, VIEW_CONTAINER__IS_DEFAULT);
		createEAttribute(viewContainerEClass, VIEW_CONTAINER__IS_XOR);
		createEReference(viewContainerEClass, VIEW_CONTAINER__VIEW_ELEMENTS);
		createEReference(viewContainerEClass, VIEW_CONTAINER__ACTIONS);

		activationExpressionEClass = createEClass(ACTIVATION_EXPRESSION);

		interactionFlowModelEClass = createEClass(INTERACTION_FLOW_MODEL);
		createEReference(interactionFlowModelEClass, INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS);

		contextDimensionEClass = createEClass(CONTEXT_DIMENSION);

		ifmlModelEClass = createEClass(IFML_MODEL);
		createEReference(ifmlModelEClass, IFML_MODEL__INTERACTION_FLOW_MODEL);
		createEReference(ifmlModelEClass, IFML_MODEL__DOMAIN_MODEL);
		createEReference(ifmlModelEClass, IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT);

		moduleDefinitionEClass = createEClass(MODULE_DEFINITION);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__INPUT_PORTS);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__OUTPUT_PORTS);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__MODULES);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__ACTIVITY_CONCEPT);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		interactionFlowElementEClass = createEClass(INTERACTION_FLOW_ELEMENT);
		createEReference(interactionFlowElementEClass, INTERACTION_FLOW_ELEMENT__PARAMETERS);
		createEReference(interactionFlowElementEClass, INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS);
		createEReference(interactionFlowElementEClass, INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS);

		ifmlActionEClass = createEClass(IFML_ACTION);
		createEReference(ifmlActionEClass, IFML_ACTION__ACTION_EVENTS);
		createEReference(ifmlActionEClass, IFML_ACTION__DYNAMIC_BEHAVIOR);
		createEReference(ifmlActionEClass, IFML_ACTION__VIEW_CONTAINER);

		navigationFlowEClass = createEClass(NAVIGATION_FLOW);

		parameterBindingGroupEClass = createEClass(PARAMETER_BINDING_GROUP);
		createEReference(parameterBindingGroupEClass, PARAMETER_BINDING_GROUP__PARAMETER_BINDINGS);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEReference(elementEClass, ELEMENT__CONSTRAINTS);
		createEReference(elementEClass, ELEMENT__ANNOTATIONS);

		constraintEClass = createEClass(CONSTRAINT);

		viewComponentEClass = createEClass(VIEW_COMPONENT);
		createEReference(viewComponentEClass, VIEW_COMPONENT__VIEW_COMPONENT_PARTS);

		ifmlParameterEClass = createEClass(IFML_PARAMETER);
		createEAttribute(ifmlParameterEClass, IFML_PARAMETER__DIRECTION);
		createEReference(ifmlParameterEClass, IFML_PARAMETER__DEFAULT_VALUE);
		createEReference(ifmlParameterEClass, IFML_PARAMETER__TYPE);

		dataBindingEClass = createEClass(DATA_BINDING);
		createEReference(dataBindingEClass, DATA_BINDING__CONDITIONAL_EXPRESSION);
		createEReference(dataBindingEClass, DATA_BINDING__VISUALIZATION_ATTRIBUTE);
		createEReference(dataBindingEClass, DATA_BINDING__DATA_CONTEXT_VARIABLES);
		createEReference(dataBindingEClass, DATA_BINDING__DOMAIN_CONCEPT);

		conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__CONTEXT_DIMENSIONS);
		createEReference(contextEClass, CONTEXT__CONTEXT_VARIABLES);

		visualizationAttributeEClass = createEClass(VISUALIZATION_ATTRIBUTE);
		createEReference(visualizationAttributeEClass, VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__ACTIVATION_EXPRESSION);
		createEReference(eventEClass, EVENT__INTERACTION_FLOW_EXPRESSION);

		interactionFlowModelElementEClass = createEClass(INTERACTION_FLOW_MODEL_ELEMENT);

		viewElementEventEClass = createEClass(VIEW_ELEMENT_EVENT);
		createEReference(viewElementEventEClass, VIEW_ELEMENT_EVENT__VIEW_ELEMENT);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__TEXT);

		modulePackageEClass = createEClass(MODULE_PACKAGE);
		createEReference(modulePackageEClass, MODULE_PACKAGE__MODULARIZATION_ELEMENTS);

		modularizationElementEClass = createEClass(MODULARIZATION_ELEMENT);
		createEReference(modularizationElementEClass, MODULARIZATION_ELEMENT__MODULE_PACKAGE);

		ifmlModuleEClass = createEClass(IFML_MODULE);
		createEReference(ifmlModuleEClass, IFML_MODULE__MODULE_DEFINITION);
		createEReference(ifmlModuleEClass, IFML_MODULE__PORTS);

		ifmlPortEClass = createEClass(IFML_PORT);
		createEReference(ifmlPortEClass, IFML_PORT__PORT_DEFINITION);
		createEReference(ifmlPortEClass, IFML_PORT__MODULE);

		catchingEventEClass = createEClass(CATCHING_EVENT);

		throwingEventEClass = createEClass(THROWING_EVENT);

		bpmnActivityConceptEClass = createEClass(BPMN_ACTIVITY_CONCEPT);

		contextVariableEClass = createEClass(CONTEXT_VARIABLE);
		createEReference(contextVariableEClass, CONTEXT_VARIABLE__CONTEXT);
		createEAttribute(contextVariableEClass, CONTEXT_VARIABLE__SCOPE);

		simpleContextVariableEClass = createEClass(SIMPLE_CONTEXT_VARIABLE);

		dataContextVariableEClass = createEClass(DATA_CONTEXT_VARIABLE);
		createEReference(dataContextVariableEClass, DATA_CONTEXT_VARIABLE__DATA_BINDING);

		domainConceptEClass = createEClass(DOMAIN_CONCEPT);
		createEReference(domainConceptEClass, DOMAIN_CONCEPT__DATA_BINDING);

		featureConceptEClass = createEClass(FEATURE_CONCEPT);
		createEReference(featureConceptEClass, FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE);

		behaviorConceptEClass = createEClass(BEHAVIOR_CONCEPT);
		createEReference(behaviorConceptEClass, BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR);

		behavioralFeatureConceptEClass = createEClass(BEHAVIORAL_FEATURE_CONCEPT);
		createEReference(behavioralFeatureConceptEClass, BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR);

		umlBehaviorEClass = createEClass(UML_BEHAVIOR);
		createEReference(umlBehaviorEClass, UML_BEHAVIOR__BEHAVIOR);

		umlBehavioralFeatureEClass = createEClass(UML_BEHAVIORAL_FEATURE);
		createEReference(umlBehavioralFeatureEClass, UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE);

		umlDomainConceptEClass = createEClass(UML_DOMAIN_CONCEPT);
		createEReference(umlDomainConceptEClass, UML_DOMAIN_CONCEPT__CLASSIFIER);

		umlStructuralFeatureEClass = createEClass(UML_STRUCTURAL_FEATURE);
		createEReference(umlStructuralFeatureEClass, UML_STRUCTURAL_FEATURE__STRUCTURAL_FEATURE);

		activityConceptEClass = createEClass(ACTIVITY_CONCEPT);
		createEReference(activityConceptEClass, ACTIVITY_CONCEPT__MODULE_DEFINITION);

		domainElementEClass = createEClass(DOMAIN_ELEMENT);
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
		DataTypesPackage theDataTypesPackage = (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interactionFlowEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		interactionFlowExpressionEClass.getESuperTypes().add(this.getExpression());
		systemEventEClass.getESuperTypes().add(this.getCatchingEvent());
		parameterBindingEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		actionEventEClass.getESuperTypes().add(this.getCatchingEvent());
		domainModelEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		portDefinitionEClass.getESuperTypes().add(this.getInteractionFlowElement());
		contentBindingEClass.getESuperTypes().add(this.getViewComponentPart());
		viewElementEClass.getESuperTypes().add(this.getInteractionFlowElement());
		expressionEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		dynamicBehaviorEClass.getESuperTypes().add(this.getContentBinding());
		viewpointEClass.getESuperTypes().add(this.getNamedElement());
		dataFlowEClass.getESuperTypes().add(this.getInteractionFlow());
		viewComponentPartEClass.getESuperTypes().add(this.getInteractionFlowElement());
		viewContainerEClass.getESuperTypes().add(this.getViewElement());
		activationExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		interactionFlowModelEClass.getESuperTypes().add(this.getNamedElement());
		contextDimensionEClass.getESuperTypes().add(this.getNamedElement());
		ifmlModelEClass.getESuperTypes().add(this.getNamedElement());
		moduleDefinitionEClass.getESuperTypes().add(this.getModularizationElement());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		interactionFlowElementEClass.getESuperTypes().add(this.getNamedElement());
		interactionFlowElementEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		ifmlActionEClass.getESuperTypes().add(this.getInteractionFlowElement());
		ifmlActionEClass.getESuperTypes().add(this.getNamedElement());
		navigationFlowEClass.getESuperTypes().add(this.getInteractionFlow());
		parameterBindingGroupEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		constraintEClass.getESuperTypes().add(this.getBooleanExpression());
		viewComponentEClass.getESuperTypes().add(this.getViewElement());
		ifmlParameterEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		ifmlParameterEClass.getESuperTypes().add(this.getNamedElement());
		dataBindingEClass.getESuperTypes().add(this.getContentBinding());
		conditionalExpressionEClass.getESuperTypes().add(this.getExpression());
		conditionalExpressionEClass.getESuperTypes().add(this.getViewComponentPart());
		contextEClass.getESuperTypes().add(this.getElement());
		visualizationAttributeEClass.getESuperTypes().add(this.getViewComponentPart());
		eventEClass.getESuperTypes().add(this.getInteractionFlowElement());
		interactionFlowModelElementEClass.getESuperTypes().add(this.getElement());
		viewElementEventEClass.getESuperTypes().add(this.getCatchingEvent());
		modulePackageEClass.getESuperTypes().add(this.getModularizationElement());
		modularizationElementEClass.getESuperTypes().add(this.getNamedElement());
		modularizationElementEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		ifmlModuleEClass.getESuperTypes().add(this.getNamedElement());
		ifmlModuleEClass.getESuperTypes().add(this.getInteractionFlowElement());
		ifmlPortEClass.getESuperTypes().add(this.getInteractionFlowElement());
		catchingEventEClass.getESuperTypes().add(this.getEvent());
		throwingEventEClass.getESuperTypes().add(this.getEvent());
		bpmnActivityConceptEClass.getESuperTypes().add(this.getActivityConcept());
		contextVariableEClass.getESuperTypes().add(this.getNamedElement());
		simpleContextVariableEClass.getESuperTypes().add(this.getContextVariable());
		dataContextVariableEClass.getESuperTypes().add(this.getContextVariable());
		domainConceptEClass.getESuperTypes().add(this.getDomainElement());
		featureConceptEClass.getESuperTypes().add(this.getDomainElement());
		behaviorConceptEClass.getESuperTypes().add(this.getDomainElement());
		behavioralFeatureConceptEClass.getESuperTypes().add(this.getDomainElement());
		umlBehaviorEClass.getESuperTypes().add(this.getBehaviorConcept());
		umlBehavioralFeatureEClass.getESuperTypes().add(this.getBehavioralFeatureConcept());
		umlDomainConceptEClass.getESuperTypes().add(this.getDomainConcept());
		umlStructuralFeatureEClass.getESuperTypes().add(this.getFeatureConcept());
		activityConceptEClass.getESuperTypes().add(this.getNamedElement());
		domainElementEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(interactionFlowEClass, InteractionFlow.class, "InteractionFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFlow_ParameterBindingGroup(), this.getParameterBindingGroup(), null, "parameterBindingGroup", null, 0, 1, InteractionFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFlow_SourceInteractionFlowElement(), this.getInteractionFlowElement(), this.getInteractionFlowElement_OutInteractionFlows(), "sourceInteractionFlowElement", null, 1, 1, InteractionFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFlow_TargetInteractionFlowElement(), this.getInteractionFlowElement(), this.getInteractionFlowElement_InInteractionFlows(), "targetInteractionFlowElement", null, 1, 1, InteractionFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionFlowExpressionEClass, InteractionFlowExpression.class, "InteractionFlowExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFlowExpression_InteractionFlow(), this.getInteractionFlow(), null, "interactionFlow", null, 2, -1, InteractionFlowExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemEventEClass, SystemEvent.class, "SystemEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemEvent_TriggeringExpressions(), this.getExpression(), null, "triggeringExpressions", null, 0, -1, SystemEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemEvent_Type(), theDataTypesPackage.getSystemEventType(), "type", null, 1, 1, SystemEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterBindingEClass, ParameterBinding.class, "ParameterBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterBinding_SourceParameter(), this.getIFMLParameter(), null, "sourceParameter", null, 1, 1, ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterBinding_TargetParameter(), this.getIFMLParameter(), null, "targetParameter", null, 1, 1, ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionEventEClass, ActionEvent.class, "ActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModel_DomainElements(), this.getDomainElement(), null, "domainElements", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portDefinitionEClass, PortDefinition.class, "PortDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortDefinition_Ports(), this.getIFMLPort(), this.getIFMLPort_PortDefinition(), "ports", null, 0, -1, PortDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contentBindingEClass, ContentBinding.class, "ContentBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentBinding_UniformResourceIdentifier(), ecorePackage.getEString(), "uniformResourceIdentifier", null, 0, 1, ContentBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(viewElementEClass, ViewElement.class, "ViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewElement_ViewElementEvents(), this.getViewElementEvent(), null, "viewElementEvents", null, 0, -1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViewElement_ActivationExpression(), this.getActivationExpression(), null, "activationExpression", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViewElement_ViewContainer(), this.getViewContainer(), this.getViewContainer_ViewElements(), "viewContainer", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Language(), ecorePackage.getEString(), "language", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dynamicBehaviorEClass, DynamicBehavior.class, "DynamicBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicBehavior_BehavioralFeatureConcept(), this.getBehavioralFeatureConcept(), this.getBehavioralFeatureConcept_DynamicBehavior(), "behavioralFeatureConcept", null, 0, 1, DynamicBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDynamicBehavior_BehaviorConcept(), this.getBehaviorConcept(), this.getBehaviorConcept_DynamicBehavior(), "behaviorConcept", null, 0, 1, DynamicBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(viewpointEClass, Viewpoint.class, "Viewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewpoint_InteractionFlowModelElements(), this.getInteractionFlowModelElement(), null, "interactionFlowModelElements", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViewpoint_Context(), this.getContext(), null, "context", null, 1, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewComponentPartEClass, ViewComponentPart.class, "ViewComponentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewComponentPart_ViewElementEvents(), this.getViewElementEvent(), null, "viewElementEvents", null, 0, -1, ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViewComponentPart_ActivationExpression(), this.getActivationExpression(), null, "activationExpression", null, 0, 1, ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViewComponentPart_ParentViewComponentPart(), this.getViewComponentPart(), null, "parentViewComponentPart", null, 1, 1, ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViewComponentPart_SubViewComponentParts(), this.getViewComponentPart(), null, "subViewComponentParts", null, 0, -1, ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(viewContainerEClass, ViewContainer.class, "ViewContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewContainer_IsLandmark(), ecorePackage.getEBoolean(), "isLandmark", null, 1, 1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getViewContainer_IsDefault(), ecorePackage.getEBoolean(), "isDefault", null, 1, 1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getViewContainer_IsXOR(), ecorePackage.getEBoolean(), "isXOR", null, 1, 1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViewContainer_ViewElements(), this.getViewElement(), this.getViewElement_ViewContainer(), "viewElements", null, 0, -1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViewContainer_Actions(), this.getIFMLAction(), this.getIFMLAction_ViewContainer(), "actions", null, 0, -1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activationExpressionEClass, ActivationExpression.class, "ActivationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionFlowModelEClass, InteractionFlowModel.class, "InteractionFlowModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFlowModel_InteractionFlowModelElements(), this.getInteractionFlowModelElement(), null, "interactionFlowModelElements", null, 0, -1, InteractionFlowModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contextDimensionEClass, ContextDimension.class, "ContextDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifmlModelEClass, IFMLModel.class, "IFMLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIFMLModel_InteractionFlowModel(), this.getInteractionFlowModel(), null, "interactionFlowModel", null, 1, 1, IFMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIFMLModel_DomainModel(), this.getDomainModel(), null, "domainModel", null, 1, 1, IFMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIFMLModel_InteractionFlowModelViewpoint(), this.getViewpoint(), null, "interactionFlowModelViewpoint", null, 0, -1, IFMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(moduleDefinitionEClass, ModuleDefinition.class, "ModuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleDefinition_InputPorts(), this.getPortDefinition(), null, "inputPorts", null, 0, -1, ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleDefinition_OutputPorts(), this.getPortDefinition(), null, "outputPorts", null, 0, -1, ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleDefinition_InteractionFlowModelElement(), this.getInteractionFlowModelElement(), null, "interactionFlowModelElement", null, 1, -1, ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleDefinition_Modules(), this.getIFMLModule(), this.getIFMLModule_ModuleDefinition(), "modules", null, 0, -1, ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleDefinition_ActivityConcept(), this.getActivityConcept(), this.getActivityConcept_ModuleDefinition(), "activityConcept", null, 0, 1, ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionFlowElementEClass, InteractionFlowElement.class, "InteractionFlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFlowElement_Parameters(), this.getIFMLParameter(), null, "parameters", null, 0, -1, InteractionFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFlowElement_OutInteractionFlows(), this.getInteractionFlow(), this.getInteractionFlow_SourceInteractionFlowElement(), "outInteractionFlows", null, 0, -1, InteractionFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFlowElement_InInteractionFlows(), this.getInteractionFlow(), this.getInteractionFlow_TargetInteractionFlowElement(), "inInteractionFlows", null, 0, -1, InteractionFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ifmlActionEClass, IFMLAction.class, "IFMLAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIFMLAction_ActionEvents(), this.getActionEvent(), null, "actionEvents", null, 0, -1, IFMLAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIFMLAction_DynamicBehavior(), this.getDynamicBehavior(), null, "dynamicBehavior", null, 0, 1, IFMLAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIFMLAction_ViewContainer(), this.getViewContainer(), this.getViewContainer_Actions(), "viewContainer", null, 0, 1, IFMLAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(navigationFlowEClass, NavigationFlow.class, "NavigationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterBindingGroupEClass, ParameterBindingGroup.class, "ParameterBindingGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterBindingGroup_ParameterBindings(), this.getParameterBinding(), null, "parameterBindings", null, 1, -1, ParameterBindingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewComponentEClass, ViewComponent.class, "ViewComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewComponent_ViewComponentParts(), this.getViewComponentPart(), null, "viewComponentParts", null, 0, -1, ViewComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ifmlParameterEClass, IFMLParameter.class, "IFMLParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIFMLParameter_Direction(), theDataTypesPackage.getDirection(), "direction", "in", 1, 1, IFMLParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIFMLParameter_DefaultValue(), this.getExpression(), null, "defaultValue", null, 0, 1, IFMLParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIFMLParameter_Type(), theUMLPackage.getType(), null, "type", null, 0, 1, IFMLParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBindingEClass, DataBinding.class, "DataBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBinding_ConditionalExpression(), this.getConditionalExpression(), null, "conditionalExpression", null, 0, -1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBinding_VisualizationAttribute(), this.getVisualizationAttribute(), null, "visualizationAttribute", null, 0, -1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBinding_DataContextVariables(), this.getDataContextVariable(), this.getDataContextVariable_DataBinding(), "dataContextVariables", null, 0, -1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBinding_DomainConcept(), this.getDomainConcept(), this.getDomainConcept_DataBinding(), "domainConcept", null, 1, 1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_ContextDimensions(), this.getContextDimension(), null, "contextDimensions", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContext_ContextVariables(), this.getContextVariable(), this.getContextVariable_Context(), "contextVariables", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(visualizationAttributeEClass, VisualizationAttribute.class, "VisualizationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisualizationAttribute_FeatureConcept(), this.getFeatureConcept(), null, "featureConcept", null, 1, 1, VisualizationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_ActivationExpression(), this.getActivationExpression(), null, "activationExpression", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvent_InteractionFlowExpression(), this.getInteractionFlowExpression(), null, "interactionFlowExpression", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionFlowModelElementEClass, InteractionFlowModelElement.class, "InteractionFlowModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewElementEventEClass, ViewElementEvent.class, "ViewElementEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewElementEvent_ViewElement(), this.getViewElement(), null, "viewElement", null, 1, 1, ViewElementEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modulePackageEClass, ModulePackage.class, "ModulePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModulePackage_ModularizationElements(), this.getModularizationElement(), this.getModularizationElement_ModulePackage(), "modularizationElements", null, 0, -1, ModulePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modularizationElementEClass, ModularizationElement.class, "ModularizationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModularizationElement_ModulePackage(), this.getModulePackage(), this.getModulePackage_ModularizationElements(), "modulePackage", null, 0, 1, ModularizationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ifmlModuleEClass, IFMLModule.class, "IFMLModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIFMLModule_ModuleDefinition(), this.getModuleDefinition(), this.getModuleDefinition_Modules(), "moduleDefinition", null, 1, 1, IFMLModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIFMLModule_Ports(), this.getIFMLPort(), this.getIFMLPort_Module(), "ports", null, 0, -1, IFMLModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ifmlPortEClass, IFMLPort.class, "IFMLPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIFMLPort_PortDefinition(), this.getPortDefinition(), this.getPortDefinition_Ports(), "portDefinition", null, 1, 1, IFMLPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIFMLPort_Module(), this.getIFMLModule(), this.getIFMLModule_Ports(), "module", null, 1, 1, IFMLPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(catchingEventEClass, CatchingEvent.class, "CatchingEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(throwingEventEClass, ThrowingEvent.class, "ThrowingEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmnActivityConceptEClass, BPMNActivityConcept.class, "BPMNActivityConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextVariableEClass, ContextVariable.class, "ContextVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextVariable_Context(), this.getContext(), this.getContext_ContextVariables(), "context", null, 1, 1, ContextVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContextVariable_Scope(), theDataTypesPackage.getContextVariableScope(), "scope", null, 1, 1, ContextVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleContextVariableEClass, SimpleContextVariable.class, "SimpleContextVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataContextVariableEClass, DataContextVariable.class, "DataContextVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataContextVariable_DataBinding(), this.getDataBinding(), this.getDataBinding_DataContextVariables(), "dataBinding", null, 1, 1, DataContextVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainConceptEClass, DomainConcept.class, "DomainConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainConcept_DataBinding(), this.getDataBinding(), this.getDataBinding_DomainConcept(), "dataBinding", null, 0, 1, DomainConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureConceptEClass, FeatureConcept.class, "FeatureConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureConcept_VisualizationAttribute(), this.getVisualizationAttribute(), null, "visualizationAttribute", null, 0, 1, FeatureConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorConceptEClass, BehaviorConcept.class, "BehaviorConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorConcept_DynamicBehavior(), this.getDynamicBehavior(), this.getDynamicBehavior_BehaviorConcept(), "dynamicBehavior", null, 0, 1, BehaviorConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behavioralFeatureConceptEClass, BehavioralFeatureConcept.class, "BehavioralFeatureConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioralFeatureConcept_DynamicBehavior(), this.getDynamicBehavior(), this.getDynamicBehavior_BehavioralFeatureConcept(), "dynamicBehavior", null, 1, 1, BehavioralFeatureConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlBehaviorEClass, UMLBehavior.class, "UMLBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLBehavior_Behavior(), theUMLPackage.getBehavior(), null, "behavior", null, 0, 1, UMLBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlBehavioralFeatureEClass, UMLBehavioralFeature.class, "UMLBehavioralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLBehavioralFeature_BehavioralFeature(), theUMLPackage.getBehavioralFeature(), null, "behavioralFeature", null, 0, 1, UMLBehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlDomainConceptEClass, UMLDomainConcept.class, "UMLDomainConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLDomainConcept_Classifier(), theUMLPackage.getClassifier(), null, "classifier", null, 0, 1, UMLDomainConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlStructuralFeatureEClass, UMLStructuralFeature.class, "UMLStructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLStructuralFeature_StructuralFeature(), theUMLPackage.getStructuralFeature(), null, "structuralFeature", null, 0, 1, UMLStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityConceptEClass, ActivityConcept.class, "ActivityConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityConcept_ModuleDefinition(), this.getModuleDefinition(), this.getModuleDefinition_ActivityConcept(), "moduleDefinition", null, 1, 1, ActivityConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainElementEClass, DomainElement.class, "DomainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CorePackageImpl
