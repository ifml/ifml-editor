/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.InteractionFlow#getParameterBindingGroup <em>Parameter Binding Group</em>}</li>
 *   <li>{@link IFML.Core.InteractionFlow#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}</li>
 *   <li>{@link IFML.Core.InteractionFlow#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getInteractionFlow()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFlow extends InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Binding Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Binding Group</em>' containment reference.
	 * @see #setParameterBindingGroup(ParameterBindingGroup)
	 * @see IFML.Core.CorePackage#getInteractionFlow_ParameterBindingGroup()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ParameterBindingGroup getParameterBindingGroup();

	/**
	 * Sets the value of the '{@link IFML.Core.InteractionFlow#getParameterBindingGroup <em>Parameter Binding Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Binding Group</em>' containment reference.
	 * @see #getParameterBindingGroup()
	 * @generated
	 */
	void setParameterBindingGroup(ParameterBindingGroup value);

	/**
	 * Returns the value of the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Interaction Flow Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Interaction Flow Element</em>' container reference.
	 * @see #setSourceInteractionFlowElement(InteractionFlowElement)
	 * @see IFML.Core.CorePackage#getInteractionFlow_SourceInteractionFlowElement()
	 * @see IFML.Core.InteractionFlowElement#getOutInteractionFlows
	 * @model opposite="outInteractionFlows" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InteractionFlowElement getSourceInteractionFlowElement();

	/**
	 * Sets the value of the '{@link IFML.Core.InteractionFlow#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Interaction Flow Element</em>' container reference.
	 * @see #getSourceInteractionFlowElement()
	 * @generated
	 */
	void setSourceInteractionFlowElement(InteractionFlowElement value);

	/**
	 * Returns the value of the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.InteractionFlowElement#getInInteractionFlows <em>In Interaction Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Interaction Flow Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Interaction Flow Element</em>' reference.
	 * @see #setTargetInteractionFlowElement(InteractionFlowElement)
	 * @see IFML.Core.CorePackage#getInteractionFlow_TargetInteractionFlowElement()
	 * @see IFML.Core.InteractionFlowElement#getInInteractionFlows
	 * @model opposite="inInteractionFlows" required="true" ordered="false"
	 * @generated
	 */
	InteractionFlowElement getTargetInteractionFlowElement();

	/**
	 * Sets the value of the '{@link IFML.Core.InteractionFlow#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Interaction Flow Element</em>' reference.
	 * @see #getTargetInteractionFlowElement()
	 * @generated
	 */
	void setTargetInteractionFlowElement(InteractionFlowElement value);

} // InteractionFlow
