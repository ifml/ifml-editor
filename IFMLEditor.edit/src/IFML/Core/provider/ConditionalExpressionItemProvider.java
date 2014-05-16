/**
 */
package IFML.Core.provider;


import IFML.Core.ConditionalExpression;
import IFML.Core.CoreFactory;
import IFML.Core.CorePackage;

import IFML.Extensions.ExtensionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link IFML.Core.ConditionalExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalExpressionItemProvider
	extends ExpressionItemProvider
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
	public ConditionalExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addInInteractionFlowsPropertyDescriptor(object);
			addActivationExpressionPropertyDescriptor(object);
			addParentViewComponentPartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 CorePackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Interaction Flows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInInteractionFlowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFlowElement_inInteractionFlows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFlowElement_inInteractionFlows_feature", "_UI_InteractionFlowElement_type"),
				 CorePackage.Literals.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activation Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivationExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewComponentPart_activationExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewComponentPart_activationExpression_feature", "_UI_ViewComponentPart_type"),
				 CorePackage.Literals.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent View Component Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentViewComponentPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewComponentPart_parentViewComponentPart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewComponentPart_parentViewComponentPart_feature", "_UI_ViewComponentPart_type"),
				 CorePackage.Literals.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__PARAMETERS);
			childrenFeatures.add(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS);
			childrenFeatures.add(CorePackage.Literals.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS);
			childrenFeatures.add(CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConditionalExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConditionalExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConditionalExpression)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConditionalExpression_type") :
			getString("_UI_ConditionalExpression_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConditionalExpression.class)) {
			case CorePackage.CONDITIONAL_EXPRESSION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__PARAMETERS:
			case CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS:
			case CorePackage.CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS:
			case CorePackage.CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS:
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
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__PARAMETERS,
				 CoreFactory.eINSTANCE.createIFMLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__PARAMETERS,
				 ExtensionsFactory.eINSTANCE.createIFMLSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__PARAMETERS,
				 ExtensionsFactory.eINSTANCE.createSelectionField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__PARAMETERS,
				 ExtensionsFactory.eINSTANCE.createSimpleField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS,
				 CoreFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS,
				 CoreFactory.eINSTANCE.createNavigationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS,
				 CoreFactory.eINSTANCE.createViewElementEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS,
				 ExtensionsFactory.eINSTANCE.createOnSubmitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS,
				 ExtensionsFactory.eINSTANCE.createOnSelectEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createViewComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createDynamicBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createVisualizationAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS,
				 ExtensionsFactory.eINSTANCE.createIFMLSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS,
				 ExtensionsFactory.eINSTANCE.createSelectionField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS,
				 ExtensionsFactory.eINSTANCE.createSimpleField()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorePackage.Literals.INTERACTION_FLOW_ELEMENT__PARAMETERS ||
			childFeature == CorePackage.Literals.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
