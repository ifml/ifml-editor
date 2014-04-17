/**
 */
package IFML.Core.impl;

import IFML.Core.Context;
import IFML.Core.CorePackage;
import IFML.Core.InteractionFlowModelElement;
import IFML.Core.Viewpoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ViewpointImpl#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}</li>
 *   <li>{@link IFML.Core.impl.ViewpointImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewpointImpl extends NamedElementImpl implements Viewpoint {
	/**
	 * The cached value of the '{@link #getInteractionFlowModelElements() <em>Interaction Flow Model Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlowModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList interactionFlowModelElements;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.VIEWPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInteractionFlowModelElements() {
		if (interactionFlowModelElements == null) {
			interactionFlowModelElements = new EObjectResolvingEList(InteractionFlowModelElement.class, this, CorePackage.VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS);
		}
		return interactionFlowModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Context)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VIEWPOINT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Context newContext) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIEWPOINT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS:
				return getInteractionFlowModelElements();
			case CorePackage.VIEWPOINT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS:
				getInteractionFlowModelElements().clear();
				getInteractionFlowModelElements().addAll((Collection)newValue);
				return;
			case CorePackage.VIEWPOINT__CONTEXT:
				setContext((Context)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS:
				getInteractionFlowModelElements().clear();
				return;
			case CorePackage.VIEWPOINT__CONTEXT:
				setContext((Context)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS:
				return interactionFlowModelElements != null && !interactionFlowModelElements.isEmpty();
			case CorePackage.VIEWPOINT__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewpointImpl
