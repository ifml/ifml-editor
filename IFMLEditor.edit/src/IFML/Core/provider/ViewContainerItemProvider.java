/**
 */
package IFML.Core.provider;


import IFML.Core.CoreFactory;
import IFML.Core.CorePackage;
import IFML.Core.ViewContainer;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link IFML.Core.ViewContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewContainerItemProvider
	extends ViewElementItemProvider
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
	public ViewContainerItemProvider(AdapterFactory adapterFactory) {
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

			addIsLandmarkPropertyDescriptor(object);
			addIsDefaultPropertyDescriptor(object);
			addIsXORPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Landmark feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLandmarkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewContainer_isLandmark_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewContainer_isLandmark_feature", "_UI_ViewContainer_type"),
				 CorePackage.Literals.VIEW_CONTAINER__IS_LANDMARK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewContainer_isDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewContainer_isDefault_feature", "_UI_ViewContainer_type"),
				 CorePackage.Literals.VIEW_CONTAINER__IS_DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is XOR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsXORPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewContainer_isXOR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewContainer_isXOR_feature", "_UI_ViewContainer_type"),
				 CorePackage.Literals.VIEW_CONTAINER__IS_XOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(CorePackage.Literals.VIEW_CONTAINER__VIEW_ELEMENTS);
			childrenFeatures.add(CorePackage.Literals.VIEW_CONTAINER__ACTIONS);
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
	 * This returns ViewContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ViewContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ViewContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ViewContainer_type") :
			getString("_UI_ViewContainer_type") + " " + label;
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

		switch (notification.getFeatureID(ViewContainer.class)) {
			case CorePackage.VIEW_CONTAINER__IS_LANDMARK:
			case CorePackage.VIEW_CONTAINER__IS_DEFAULT:
			case CorePackage.VIEW_CONTAINER__IS_XOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
			case CorePackage.VIEW_CONTAINER__ACTIONS:
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
				(CorePackage.Literals.VIEW_CONTAINER__VIEW_ELEMENTS,
				 CoreFactory.eINSTANCE.createViewElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_CONTAINER__VIEW_ELEMENTS,
				 CoreFactory.eINSTANCE.createViewContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_CONTAINER__VIEW_ELEMENTS,
				 CoreFactory.eINSTANCE.createViewComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_CONTAINER__VIEW_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_CONTAINER__VIEW_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_CONTAINER__VIEW_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createDetails()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_CONTAINER__VIEW_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createIFMLWindow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_CONTAINER__VIEW_ELEMENTS,
				 ExtensionsFactory.eINSTANCE.createIFMLMenu()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_CONTAINER__ACTIONS,
				 CoreFactory.eINSTANCE.createIFMLAction()));
	}

}
