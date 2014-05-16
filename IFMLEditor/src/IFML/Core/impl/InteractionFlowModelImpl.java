/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.InteractionFlowModel;
import IFML.Core.InteractionFlowModelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Flow Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.InteractionFlowModelImpl#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionFlowModelImpl extends NamedElementImpl implements InteractionFlowModel {
	/**
	 * The cached value of the '{@link #getInteractionFlowModelElements() <em>Interaction Flow Model Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlowModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFlowModelElement> interactionFlowModelElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFlowModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INTERACTION_FLOW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFlowModelElement> getInteractionFlowModelElements() {
		if (interactionFlowModelElements == null) {
			interactionFlowModelElements = new EObjectContainmentEList<InteractionFlowModelElement>(InteractionFlowModelElement.class, this, CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS);
		}
		return interactionFlowModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
				return ((InternalEList<?>)getInteractionFlowModelElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
				return getInteractionFlowModelElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
				getInteractionFlowModelElements().clear();
				getInteractionFlowModelElements().addAll((Collection<? extends InteractionFlowModelElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
				getInteractionFlowModelElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS:
				return interactionFlowModelElements != null && !interactionFlowModelElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionFlowModelImpl
