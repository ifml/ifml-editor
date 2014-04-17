/**
 */
package IFML.Core.provider;


import IFML.Core.CoreFactory;
import IFML.Core.CorePackage;
import IFML.Core.ViewComponent;

import IFML.Extensions.ExtensionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link IFML.Core.ViewComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewComponentItemProvider
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
	public ViewComponentItemProvider(AdapterFactory adapterFactory) {
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS);
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
	 * This returns ViewComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ViewComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ViewComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ViewComponent_type") :
			getString("_UI_ViewComponent_type") + " " + label;
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

		switch (notification.getFeatureID(ViewComponent.class)) {
			case CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS:
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
				(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createViewComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createDynamicBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS,
				 CoreFactory.eINSTANCE.createVisualizationAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS,
				 ExtensionsFactory.eINSTANCE.createIFMLSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS,
				 ExtensionsFactory.eINSTANCE.createSelectionField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS,
				 ExtensionsFactory.eINSTANCE.createSimpleField()));
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
			childFeature == CorePackage.Literals.INTERACTION_FLOW_ELEMENT__PARAMETERS ||
			childFeature == CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
