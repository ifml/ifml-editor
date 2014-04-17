/**
 */
package IFML.Core.impl;

import IFML.Core.ActivityConcept;
import IFML.Core.CorePackage;
import IFML.Core.IFMLModule;
import IFML.Core.InteractionFlowModelElement;
import IFML.Core.ModuleDefinition;
import IFML.Core.PortDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ModuleDefinitionImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link IFML.Core.impl.ModuleDefinitionImpl#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link IFML.Core.impl.ModuleDefinitionImpl#getInteractionFlowModelElement <em>Interaction Flow Model Element</em>}</li>
 *   <li>{@link IFML.Core.impl.ModuleDefinitionImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link IFML.Core.impl.ModuleDefinitionImpl#getActivityConcept <em>Activity Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleDefinitionImpl extends ModularizationElementImpl implements ModuleDefinition {
	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList inputPorts;

	/**
	 * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList outputPorts;

	/**
	 * The cached value of the '{@link #getInteractionFlowModelElement() <em>Interaction Flow Model Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlowModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList interactionFlowModelElement;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList modules;

	/**
	 * The cached value of the '{@link #getActivityConcept() <em>Activity Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityConcept()
	 * @generated
	 * @ordered
	 */
	protected ActivityConcept activityConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.MODULE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList(PortDefinition.class, this, CorePackage.MODULE_DEFINITION__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputPorts() {
		if (outputPorts == null) {
			outputPorts = new EObjectContainmentEList(PortDefinition.class, this, CorePackage.MODULE_DEFINITION__OUTPUT_PORTS);
		}
		return outputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInteractionFlowModelElement() {
		if (interactionFlowModelElement == null) {
			interactionFlowModelElement = new EObjectContainmentEList(InteractionFlowModelElement.class, this, CorePackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT);
		}
		return interactionFlowModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getModules() {
		if (modules == null) {
			modules = new EObjectWithInverseResolvingEList(IFMLModule.class, this, CorePackage.MODULE_DEFINITION__MODULES, CorePackage.IFML_MODULE__MODULE_DEFINITION);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityConcept getActivityConcept() {
		if (activityConcept != null && activityConcept.eIsProxy()) {
			InternalEObject oldActivityConcept = (InternalEObject)activityConcept;
			activityConcept = (ActivityConcept)eResolveProxy(oldActivityConcept);
			if (activityConcept != oldActivityConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT, oldActivityConcept, activityConcept));
			}
		}
		return activityConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityConcept basicGetActivityConcept() {
		return activityConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityConcept(ActivityConcept newActivityConcept, NotificationChain msgs) {
		ActivityConcept oldActivityConcept = activityConcept;
		activityConcept = newActivityConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT, oldActivityConcept, newActivityConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityConcept(ActivityConcept newActivityConcept) {
		if (newActivityConcept != activityConcept) {
			NotificationChain msgs = null;
			if (activityConcept != null)
				msgs = ((InternalEObject)activityConcept).eInverseRemove(this, CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION, ActivityConcept.class, msgs);
			if (newActivityConcept != null)
				msgs = ((InternalEObject)newActivityConcept).eInverseAdd(this, CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION, ActivityConcept.class, msgs);
			msgs = basicSetActivityConcept(newActivityConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT, newActivityConcept, newActivityConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MODULE_DEFINITION__MODULES:
				return ((InternalEList)getModules()).basicAdd(otherEnd, msgs);
			case CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT:
				if (activityConcept != null)
					msgs = ((InternalEObject)activityConcept).eInverseRemove(this, CorePackage.ACTIVITY_CONCEPT__MODULE_DEFINITION, ActivityConcept.class, msgs);
				return basicSetActivityConcept((ActivityConcept)otherEnd, msgs);
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
			case CorePackage.MODULE_DEFINITION__INPUT_PORTS:
				return ((InternalEList)getInputPorts()).basicRemove(otherEnd, msgs);
			case CorePackage.MODULE_DEFINITION__OUTPUT_PORTS:
				return ((InternalEList)getOutputPorts()).basicRemove(otherEnd, msgs);
			case CorePackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
				return ((InternalEList)getInteractionFlowModelElement()).basicRemove(otherEnd, msgs);
			case CorePackage.MODULE_DEFINITION__MODULES:
				return ((InternalEList)getModules()).basicRemove(otherEnd, msgs);
			case CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT:
				return basicSetActivityConcept(null, msgs);
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
			case CorePackage.MODULE_DEFINITION__INPUT_PORTS:
				return getInputPorts();
			case CorePackage.MODULE_DEFINITION__OUTPUT_PORTS:
				return getOutputPorts();
			case CorePackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
				return getInteractionFlowModelElement();
			case CorePackage.MODULE_DEFINITION__MODULES:
				return getModules();
			case CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT:
				if (resolve) return getActivityConcept();
				return basicGetActivityConcept();
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
			case CorePackage.MODULE_DEFINITION__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection)newValue);
				return;
			case CorePackage.MODULE_DEFINITION__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection)newValue);
				return;
			case CorePackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
				getInteractionFlowModelElement().clear();
				getInteractionFlowModelElement().addAll((Collection)newValue);
				return;
			case CorePackage.MODULE_DEFINITION__MODULES:
				getModules().clear();
				getModules().addAll((Collection)newValue);
				return;
			case CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT:
				setActivityConcept((ActivityConcept)newValue);
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
			case CorePackage.MODULE_DEFINITION__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case CorePackage.MODULE_DEFINITION__OUTPUT_PORTS:
				getOutputPorts().clear();
				return;
			case CorePackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
				getInteractionFlowModelElement().clear();
				return;
			case CorePackage.MODULE_DEFINITION__MODULES:
				getModules().clear();
				return;
			case CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT:
				setActivityConcept((ActivityConcept)null);
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
			case CorePackage.MODULE_DEFINITION__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case CorePackage.MODULE_DEFINITION__OUTPUT_PORTS:
				return outputPorts != null && !outputPorts.isEmpty();
			case CorePackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
				return interactionFlowModelElement != null && !interactionFlowModelElement.isEmpty();
			case CorePackage.MODULE_DEFINITION__MODULES:
				return modules != null && !modules.isEmpty();
			case CorePackage.MODULE_DEFINITION__ACTIVITY_CONCEPT:
				return activityConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleDefinitionImpl
