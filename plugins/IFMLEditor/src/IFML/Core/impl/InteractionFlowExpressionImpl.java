/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.InteractionFlow;
import IFML.Core.InteractionFlowExpression;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Flow Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.InteractionFlowExpressionImpl#getInteractionFlow <em>Interaction Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionFlowExpressionImpl extends ExpressionImpl implements InteractionFlowExpression {
	/**
	 * The cached value of the '{@link #getInteractionFlow() <em>Interaction Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFlow> interactionFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFlowExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INTERACTION_FLOW_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFlow> getInteractionFlow() {
		if (interactionFlow == null) {
			interactionFlow = new EObjectResolvingEList<InteractionFlow>(InteractionFlow.class, this, CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW);
		}
		return interactionFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW:
				return getInteractionFlow();
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
			case CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW:
				getInteractionFlow().clear();
				getInteractionFlow().addAll((Collection<? extends InteractionFlow>)newValue);
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
			case CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW:
				getInteractionFlow().clear();
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
			case CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW:
				return interactionFlow != null && !interactionFlow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionFlowExpressionImpl
