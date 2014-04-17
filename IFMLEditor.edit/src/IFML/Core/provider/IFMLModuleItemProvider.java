/**
 */
package IFML.Core.provider;


import IFML.Core.CoreFactory;
import IFML.Core.CorePackage;
import IFML.Core.IFMLModule;

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
 * This is the item provider adapter for a {@link IFML.Core.IFMLModule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IFMLModuleItemProvider
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
	public IFMLModuleItemProvider(AdapterFactory adapterFactory) {
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

			addInInteractionFlowsPropertyDescriptor(object);
			addModuleDefinitionPropertyDescriptor(object);
			addPortsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
	 * This adds a property descriptor for the Module Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModuleDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFMLModule_moduleDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFMLModule_moduleDefinition_feature", "_UI_IFMLModule_type"),
				 CorePackage.Literals.IFML_MODULE__MODULE_DEFINITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IFMLModule_ports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IFMLModule_ports_feature", "_UI_IFMLModule_type"),
				 CorePackage.Literals.IFML_MODULE__PORTS,
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
			childrenFeatures.add(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__PARAMETERS);
			childrenFeatures.add(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS);
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
	 * This returns IFMLModule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IFMLModule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((IFMLModule)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IFMLModule_type") :
			getString("_UI_IFMLModule_type") + " " + label;
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

		switch (notification.getFeatureID(IFMLModule.class)) {
			case CorePackage.IFML_MODULE__PARAMETERS:
			case CorePackage.IFML_MODULE__OUT_INTERACTION_FLOWS:
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
	}

}
