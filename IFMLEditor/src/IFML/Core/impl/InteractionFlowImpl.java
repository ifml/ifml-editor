/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.InteractionFlow;
import IFML.Core.InteractionFlowElement;
import IFML.Core.ParameterBindingGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.InteractionFlowImpl#getParameterBindingGroup <em>Parameter Binding Group</em>}</li>
 *   <li>{@link IFML.Core.impl.InteractionFlowImpl#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}</li>
 *   <li>{@link IFML.Core.impl.InteractionFlowImpl#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFlowImpl extends InteractionFlowModelElementImpl implements InteractionFlow {
	/**
	 * The cached value of the '{@link #getParameterBindingGroup() <em>Parameter Binding Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBindingGroup()
	 * @generated
	 * @ordered
	 */
	protected ParameterBindingGroup parameterBindingGroup;

	/**
	 * The cached value of the '{@link #getTargetInteractionFlowElement() <em>Target Interaction Flow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInteractionFlowElement()
	 * @generated
	 * @ordered
	 */
	protected InteractionFlowElement targetInteractionFlowElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INTERACTION_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBindingGroup getParameterBindingGroup() {
		return parameterBindingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterBindingGroup(ParameterBindingGroup newParameterBindingGroup, NotificationChain msgs) {
		ParameterBindingGroup oldParameterBindingGroup = parameterBindingGroup;
		parameterBindingGroup = newParameterBindingGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP, oldParameterBindingGroup, newParameterBindingGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterBindingGroup(ParameterBindingGroup newParameterBindingGroup) {
		if (newParameterBindingGroup != parameterBindingGroup) {
			NotificationChain msgs = null;
			if (parameterBindingGroup != null)
				msgs = ((InternalEObject)parameterBindingGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP, null, msgs);
			if (newParameterBindingGroup != null)
				msgs = ((InternalEObject)newParameterBindingGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP, null, msgs);
			msgs = basicSetParameterBindingGroup(newParameterBindingGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP, newParameterBindingGroup, newParameterBindingGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFlowElement getSourceInteractionFlowElement() {
		if (eContainerFeatureID() != CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT) return null;
		return (InteractionFlowElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceInteractionFlowElement(InteractionFlowElement newSourceInteractionFlowElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSourceInteractionFlowElement, CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceInteractionFlowElement(InteractionFlowElement newSourceInteractionFlowElement) {
		if (newSourceInteractionFlowElement != eInternalContainer() || (eContainerFeatureID() != CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT && newSourceInteractionFlowElement != null)) {
			if (EcoreUtil.isAncestor(this, newSourceInteractionFlowElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceInteractionFlowElement != null)
				msgs = ((InternalEObject)newSourceInteractionFlowElement).eInverseAdd(this, CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS, InteractionFlowElement.class, msgs);
			msgs = basicSetSourceInteractionFlowElement(newSourceInteractionFlowElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT, newSourceInteractionFlowElement, newSourceInteractionFlowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFlowElement getTargetInteractionFlowElement() {
		if (targetInteractionFlowElement != null && targetInteractionFlowElement.eIsProxy()) {
			InternalEObject oldTargetInteractionFlowElement = (InternalEObject)targetInteractionFlowElement;
			targetInteractionFlowElement = (InteractionFlowElement)eResolveProxy(oldTargetInteractionFlowElement);
			if (targetInteractionFlowElement != oldTargetInteractionFlowElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT, oldTargetInteractionFlowElement, targetInteractionFlowElement));
			}
		}
		return targetInteractionFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFlowElement basicGetTargetInteractionFlowElement() {
		return targetInteractionFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetInteractionFlowElement(InteractionFlowElement newTargetInteractionFlowElement, NotificationChain msgs) {
		InteractionFlowElement oldTargetInteractionFlowElement = targetInteractionFlowElement;
		targetInteractionFlowElement = newTargetInteractionFlowElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT, oldTargetInteractionFlowElement, newTargetInteractionFlowElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetInteractionFlowElement(InteractionFlowElement newTargetInteractionFlowElement) {
		if (newTargetInteractionFlowElement != targetInteractionFlowElement) {
			NotificationChain msgs = null;
			if (targetInteractionFlowElement != null)
				msgs = ((InternalEObject)targetInteractionFlowElement).eInverseRemove(this, CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS, InteractionFlowElement.class, msgs);
			if (newTargetInteractionFlowElement != null)
				msgs = ((InternalEObject)newTargetInteractionFlowElement).eInverseAdd(this, CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS, InteractionFlowElement.class, msgs);
			msgs = basicSetTargetInteractionFlowElement(newTargetInteractionFlowElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT, newTargetInteractionFlowElement, newTargetInteractionFlowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSourceInteractionFlowElement((InteractionFlowElement)otherEnd, msgs);
			case CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT:
				if (targetInteractionFlowElement != null)
					msgs = ((InternalEObject)targetInteractionFlowElement).eInverseRemove(this, CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS, InteractionFlowElement.class, msgs);
				return basicSetTargetInteractionFlowElement((InteractionFlowElement)otherEnd, msgs);
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
			case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
				return basicSetParameterBindingGroup(null, msgs);
			case CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT:
				return basicSetSourceInteractionFlowElement(null, msgs);
			case CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT:
				return basicSetTargetInteractionFlowElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT:
				return eInternalContainer().eInverseRemove(this, CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS, InteractionFlowElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
				return getParameterBindingGroup();
			case CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT:
				return getSourceInteractionFlowElement();
			case CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT:
				if (resolve) return getTargetInteractionFlowElement();
				return basicGetTargetInteractionFlowElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
				setParameterBindingGroup((ParameterBindingGroup)newValue);
				return;
			case CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT:
				setSourceInteractionFlowElement((InteractionFlowElement)newValue);
				return;
			case CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT:
				setTargetInteractionFlowElement((InteractionFlowElement)newValue);
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
			case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
				setParameterBindingGroup((ParameterBindingGroup)null);
				return;
			case CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT:
				setSourceInteractionFlowElement((InteractionFlowElement)null);
				return;
			case CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT:
				setTargetInteractionFlowElement((InteractionFlowElement)null);
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
			case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
				return parameterBindingGroup != null;
			case CorePackage.INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT:
				return getSourceInteractionFlowElement() != null;
			case CorePackage.INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT:
				return targetInteractionFlowElement != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionFlowImpl
