/**
 */
package IFML.Core.impl;

import IFML.Core.ActivationExpression;
import IFML.Core.ConditionalExpression;
import IFML.Core.CorePackage;
import IFML.Core.IFMLParameter;
import IFML.Core.InteractionFlow;
import IFML.Core.InteractionFlowElement;
import IFML.Core.NamedElement;
import IFML.Core.ViewComponentPart;
import IFML.Core.ViewElementEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ConditionalExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFML.Core.impl.ConditionalExpressionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link IFML.Core.impl.ConditionalExpressionImpl#getOutInteractionFlows <em>Out Interaction Flows</em>}</li>
 *   <li>{@link IFML.Core.impl.ConditionalExpressionImpl#getInInteractionFlows <em>In Interaction Flows</em>}</li>
 *   <li>{@link IFML.Core.impl.ConditionalExpressionImpl#getViewElementEvents <em>View Element Events</em>}</li>
 *   <li>{@link IFML.Core.impl.ConditionalExpressionImpl#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link IFML.Core.impl.ConditionalExpressionImpl#getParentViewComponentPart <em>Parent View Component Part</em>}</li>
 *   <li>{@link IFML.Core.impl.ConditionalExpressionImpl#getSubViewComponentParts <em>Sub View Component Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends ExpressionImpl implements ConditionalExpression {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<IFMLParameter> parameters;

	/**
	 * The cached value of the '{@link #getOutInteractionFlows() <em>Out Interaction Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutInteractionFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFlow> outInteractionFlows;

	/**
	 * The cached value of the '{@link #getInInteractionFlows() <em>In Interaction Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInteractionFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFlow> inInteractionFlows;

	/**
	 * The cached value of the '{@link #getViewElementEvents() <em>View Element Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewElementEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewElementEvent> viewElementEvents;

	/**
	 * The cached value of the '{@link #getActivationExpression() <em>Activation Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationExpression()
	 * @generated
	 * @ordered
	 */
	protected ActivationExpression activationExpression;

	/**
	 * The cached value of the '{@link #getParentViewComponentPart() <em>Parent View Component Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentViewComponentPart()
	 * @generated
	 * @ordered
	 */
	protected ViewComponentPart parentViewComponentPart;

	/**
	 * The cached value of the '{@link #getSubViewComponentParts() <em>Sub View Component Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubViewComponentParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewComponentPart> subViewComponentParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONDITIONAL_EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IFMLParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<IFMLParameter>(IFMLParameter.class, this, CorePackage.CONDITIONAL_EXPRESSION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFlow> getOutInteractionFlows() {
		if (outInteractionFlows == null) {
			outInteractionFlows = new EObjectContainmentWithInverseEList<InteractionFlow>(InteractionFlow.class, this, CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS, CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT);
		}
		return outInteractionFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFlow> getInInteractionFlows() {
		if (inInteractionFlows == null) {
			inInteractionFlows = new EObjectWithInverseResolvingEList<InteractionFlow>(InteractionFlow.class, this, CorePackage.CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS, CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT);
		}
		return inInteractionFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewElementEvent> getViewElementEvents() {
		if (viewElementEvents == null) {
			viewElementEvents = new EObjectContainmentEList<ViewElementEvent>(ViewElementEvent.class, this, CorePackage.CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS);
		}
		return viewElementEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationExpression getActivationExpression() {
		if (activationExpression != null && activationExpression.eIsProxy()) {
			InternalEObject oldActivationExpression = (InternalEObject)activationExpression;
			activationExpression = (ActivationExpression)eResolveProxy(oldActivationExpression);
			if (activationExpression != oldActivationExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
			}
		}
		return activationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationExpression basicGetActivationExpression() {
		return activationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationExpression(ActivationExpression newActivationExpression) {
		ActivationExpression oldActivationExpression = activationExpression;
		activationExpression = newActivationExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewComponentPart getParentViewComponentPart() {
		if (parentViewComponentPart != null && parentViewComponentPart.eIsProxy()) {
			InternalEObject oldParentViewComponentPart = (InternalEObject)parentViewComponentPart;
			parentViewComponentPart = (ViewComponentPart)eResolveProxy(oldParentViewComponentPart);
			if (parentViewComponentPart != oldParentViewComponentPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART, oldParentViewComponentPart, parentViewComponentPart));
			}
		}
		return parentViewComponentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewComponentPart basicGetParentViewComponentPart() {
		return parentViewComponentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentViewComponentPart(ViewComponentPart newParentViewComponentPart) {
		ViewComponentPart oldParentViewComponentPart = parentViewComponentPart;
		parentViewComponentPart = newParentViewComponentPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART, oldParentViewComponentPart, parentViewComponentPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewComponentPart> getSubViewComponentParts() {
		if (subViewComponentParts == null) {
			subViewComponentParts = new EObjectContainmentEList<ViewComponentPart>(ViewComponentPart.class, this, CorePackage.CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS);
		}
		return subViewComponentParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutInteractionFlows()).basicAdd(otherEnd, msgs);
			case CorePackage.CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInInteractionFlows()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONDITIONAL_EXPRESSION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS:
				return ((InternalEList<?>)getOutInteractionFlows()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS:
				return ((InternalEList<?>)getInInteractionFlows()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS:
				return ((InternalEList<?>)getViewElementEvents()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS:
				return ((InternalEList<?>)getSubViewComponentParts()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONDITIONAL_EXPRESSION__NAME:
				return getName();
			case CorePackage.CONDITIONAL_EXPRESSION__PARAMETERS:
				return getParameters();
			case CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS:
				return getOutInteractionFlows();
			case CorePackage.CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS:
				return getInInteractionFlows();
			case CorePackage.CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS:
				return getViewElementEvents();
			case CorePackage.CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION:
				if (resolve) return getActivationExpression();
				return basicGetActivationExpression();
			case CorePackage.CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART:
				if (resolve) return getParentViewComponentPart();
				return basicGetParentViewComponentPart();
			case CorePackage.CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS:
				return getSubViewComponentParts();
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
			case CorePackage.CONDITIONAL_EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends IFMLParameter>)newValue);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS:
				getOutInteractionFlows().clear();
				getOutInteractionFlows().addAll((Collection<? extends InteractionFlow>)newValue);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS:
				getInInteractionFlows().clear();
				getInInteractionFlows().addAll((Collection<? extends InteractionFlow>)newValue);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS:
				getViewElementEvents().clear();
				getViewElementEvents().addAll((Collection<? extends ViewElementEvent>)newValue);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION:
				setActivationExpression((ActivationExpression)newValue);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART:
				setParentViewComponentPart((ViewComponentPart)newValue);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS:
				getSubViewComponentParts().clear();
				getSubViewComponentParts().addAll((Collection<? extends ViewComponentPart>)newValue);
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
			case CorePackage.CONDITIONAL_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__PARAMETERS:
				getParameters().clear();
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS:
				getOutInteractionFlows().clear();
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS:
				getInInteractionFlows().clear();
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS:
				getViewElementEvents().clear();
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION:
				setActivationExpression((ActivationExpression)null);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART:
				setParentViewComponentPart((ViewComponentPart)null);
				return;
			case CorePackage.CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS:
				getSubViewComponentParts().clear();
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
			case CorePackage.CONDITIONAL_EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.CONDITIONAL_EXPRESSION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS:
				return outInteractionFlows != null && !outInteractionFlows.isEmpty();
			case CorePackage.CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS:
				return inInteractionFlows != null && !inInteractionFlows.isEmpty();
			case CorePackage.CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS:
				return viewElementEvents != null && !viewElementEvents.isEmpty();
			case CorePackage.CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION:
				return activationExpression != null;
			case CorePackage.CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART:
				return parentViewComponentPart != null;
			case CorePackage.CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS:
				return subViewComponentParts != null && !subViewComponentParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.CONDITIONAL_EXPRESSION__NAME: return CorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == InteractionFlowElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.CONDITIONAL_EXPRESSION__PARAMETERS: return CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS;
				case CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS: return CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;
				case CorePackage.CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS: return CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ViewComponentPart.class) {
			switch (derivedFeatureID) {
				case CorePackage.CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS: return CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;
				case CorePackage.CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION: return CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;
				case CorePackage.CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART: return CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;
				case CorePackage.CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS: return CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return CorePackage.CONDITIONAL_EXPRESSION__NAME;
				default: return -1;
			}
		}
		if (baseClass == InteractionFlowElement.class) {
			switch (baseFeatureID) {
				case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS: return CorePackage.CONDITIONAL_EXPRESSION__PARAMETERS;
				case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS: return CorePackage.CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS;
				case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS: return CorePackage.CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ViewComponentPart.class) {
			switch (baseFeatureID) {
				case CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS: return CorePackage.CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS;
				case CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION: return CorePackage.CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION;
				case CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART: return CorePackage.CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART;
				case CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS: return CorePackage.CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConditionalExpressionImpl
