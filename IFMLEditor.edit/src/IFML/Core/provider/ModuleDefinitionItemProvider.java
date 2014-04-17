/**
 */
package IFML.Core.provider;


import IFML.Core.CoreFactory;
import IFML.Core.CorePackage;
import IFML.Core.ModuleDefinition;

import IFML.Extensions.ExtensionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link IFML.Core.ModuleDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleDefinitionItemProvider
	extends ModularizationElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addModulesPropertyDescriptor(object);
			addActivityConceptPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Modules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModuleDefinition_modules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModuleDefinition_modules_feature", "_UI_ModuleDefinition_type"),
				 CorePackage.Literals.MODULE_DEFINITION__MODULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activity Concept feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivityConceptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModuleDefinition_activityConcept_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModuleDefinition_activityConcept_feature", "_UI_ModuleDefinition_type"),
				 CorePackage.Literals.MODULE_DEFINITION__ACTIVITY_CONCEPT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.MODULE_DEFINITION__INPUT_PORTS);
			childrenFeatures.add(CorePackage.Literals.MODULE_DEFINITION__OUTPUT_PORTS);
			childrenFeatures.add(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ModuleDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ModuleDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModuleDefinition_type") :
			getString("_UI_ModuleDefinition_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ModuleDefinition.class)) {
			case CorePackage.MODULE_DEFINITION__INPUT_PORTS:
			case CorePackage.MODULE_DEFINITION__OUTPUT_PORTS:
			case CorePackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INPUT_PORTS,
				 CoreFactory.eINSTANCE.createPortDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__OUTPUT_PORTS,
				 CoreFactory.eINSTANCE.createPortDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createInteractionFlowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createCatchingEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createSystemEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createActionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createPortDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createViewComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createViewElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createDynamicBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createViewContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createActivationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createModularizationElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createIFMLAction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createNavigationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createParameterBindingGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createViewComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createIFMLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createVisualizationAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createViewElementEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createModulePackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createIFMLModule()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createIFMLPort()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createThrowingEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createOnSubmitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createValidationRule()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createIFMLSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createOnSelectEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createSelectionField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createSimpleField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createDetails()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createIFMLWindow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createOnLoadEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createIFMLMenu()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createJumpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createLandingEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT,
				 ExtensionsFactory.eINSTANCE.createSetContextEvent()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorePackage.Literals.ELEMENT__CONSTRAINTS ||
			childFeature == CorePackage.Literals.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT ||
			childFeature == CorePackage.Literals.MODULE_DEFINITION__INPUT_PORTS ||
			childFeature == CorePackage.Literals.MODULE_DEFINITION__OUTPUT_PORTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
