/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.ModuleDefinition#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link IFML.Core.ModuleDefinition#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link IFML.Core.ModuleDefinition#getInteractionFlowModelElement <em>Interaction Flow Model Element</em>}</li>
 *   <li>{@link IFML.Core.ModuleDefinition#getModules <em>Modules</em>}</li>
 *   <li>{@link IFML.Core.ModuleDefinition#getActivityConcept <em>Activity Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getModuleDefinition()
 * @model
 * @generated
 */
public interface ModuleDefinition extends ModularizationElement {
	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.PortDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getModuleDefinition_InputPorts()
	 * @model type="IFML.Core.PortDefinition" containment="true" ordered="false"
	 * @generated
	 */
	EList getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.PortDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getModuleDefinition_OutputPorts()
	 * @model type="IFML.Core.PortDefinition" containment="true" ordered="false"
	 * @generated
	 */
	EList getOutputPorts();

	/**
	 * Returns the value of the '<em><b>Interaction Flow Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.InteractionFlowModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow Model Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model Element</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getModuleDefinition_InteractionFlowModelElement()
	 * @model type="IFML.Core.InteractionFlowModelElement" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getInteractionFlowModelElement();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link IFML.Core.IFMLModule}.
	 * It is bidirectional and its opposite is '{@link IFML.Core.IFMLModule#getModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see IFML.Core.CorePackage#getModuleDefinition_Modules()
	 * @see IFML.Core.IFMLModule#getModuleDefinition
	 * @model type="IFML.Core.IFMLModule" opposite="moduleDefinition" ordered="false"
	 * @generated
	 */
	EList getModules();

	/**
	 * Returns the value of the '<em><b>Activity Concept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.ActivityConcept#getModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Concept</em>' reference.
	 * @see #setActivityConcept(ActivityConcept)
	 * @see IFML.Core.CorePackage#getModuleDefinition_ActivityConcept()
	 * @see IFML.Core.ActivityConcept#getModuleDefinition
	 * @model opposite="moduleDefinition" ordered="false"
	 * @generated
	 */
	ActivityConcept getActivityConcept();

	/**
	 * Sets the value of the '{@link IFML.Core.ModuleDefinition#getActivityConcept <em>Activity Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Concept</em>' reference.
	 * @see #getActivityConcept()
	 * @generated
	 */
	void setActivityConcept(ActivityConcept value);

} // ModuleDefinition
