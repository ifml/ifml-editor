/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.IFMLParameter;
import IFML.Core.InteractionFlow;
import IFML.Core.InteractionFlowElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.InteractionFlowElementImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link IFML.Core.impl.InteractionFlowElementImpl#getOutInteractionFlows <em>Out Interaction Flows</em>}</li>
 *   <li>{@link IFML.Core.impl.InteractionFlowElementImpl#getInInteractionFlows <em>In Interaction Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFlowElementImpl extends NamedElementImpl implements InteractionFlowElement {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters;

	/**
	 * The cached value of the '{@link #getOutInteractionFlows() <em>Out Interaction Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutInteractionFlows()
	 * @generated
	 * @ordered
	 */
	protected EList outInteractionFlows;

	/**
	 * The cached value of the '{@link #getInInteractionFlows() <em>In Interaction Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInteractionFlows()
	 * @generated
	 * @ordered
	 */
	protected EList inInteractionFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.INTERACTION_FLOW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList(IFMLParameter.class, this, CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutInteractionFlows() {
		if (outInteractionFlows == null) {
			outInteractionFlows = new EObjectContainmentWithInverseEList(InteractionFlow.class, this, CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS, CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT);
		}
		return outInteractionFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInInteractionFlows() {
		if (inInteractionFlows == null) {
			inInteractionFlows = new EObjectWithInverseResolvingEList(InteractionFlow.class, this, CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS, CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT);
		}
		return inInteractionFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
				return ((InternalEList)getOutInteractionFlows()).basicAdd(otherEnd, msgs);
			case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
				return ((InternalEList)getInInteractionFlows()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
				return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
			case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
				return ((InternalEList)getOutInteractionFlows()).basicRemove(otherEnd, msgs);
			case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
				return ((InternalEList)getInInteractionFlows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
				return getParameters();
			case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
				return getOutInteractionFlows();
			case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
				return getInInteractionFlows();
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
			case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
				getOutInteractionFlows().clear();
				getOutInteractionFlows().addAll((Collection)newValue);
				return;
			case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
				getInInteractionFlows().clear();
				getInInteractionFlows().addAll((Collection)newValue);
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
			case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
				getParameters().clear();
				return;
			case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
				getOutInteractionFlows().clear();
				return;
			case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
				getInInteractionFlows().clear();
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
			case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
				return outInteractionFlows != null && !outInteractionFlows.isEmpty();
			case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
				return inInteractionFlows != null && !inInteractionFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionFlowElementImpl
