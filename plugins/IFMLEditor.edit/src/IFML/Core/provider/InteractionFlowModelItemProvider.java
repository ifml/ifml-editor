/**
 */
package IFML.Core.provider;


import IFML.Core.CoreFactory;
import IFML.Core.CorePackage;
import IFML.Core.InteractionFlowModel;

import IFML.Extensions.ExtensionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link IFML.Core.InteractionFlowModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionFlowModelItemProvider
	extends NamedElementItemProvider
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
	public InteractionFlowModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS);
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
	 * This returns InteractionFlowModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InteractionFlowModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InteractionFlowModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InteractionFlowModel_type") :
			getString("_UI_InteractionFlowModel_type") + " " + label;
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

		switch (notification.getFeatureID(InteractionFlowModel.class)) {
			case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
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
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createInteractionFlowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createCatchingEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createSystemEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createActionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createPortDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createViewComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createViewElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createDynamicBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createViewContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createActivationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createModularizationElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createIFMLAction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createNavigationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createParameterBindingGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createViewComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createIFMLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createVisualizationAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createViewElementEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createModulePackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createIFMLModule()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createIFMLPort()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 CoreFactory.eINSTANCE.createThrowingEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createOnSubmitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createValidationRule()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createIFMLSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createOnSelectEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createSelectionField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createSimpleField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createDetails()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createIFMLWindow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createOnLoadEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createIFMLMenu()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createJumpEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createLandingEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createSetContextEvent()));
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
			childFeature == CorePackage.Literals.ELEMENT__CONSTRAINTS ||
			childFeature == CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
