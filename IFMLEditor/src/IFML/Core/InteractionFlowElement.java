/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.InteractionFlowElement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link IFML.Core.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}</li>
 *   <li>{@link IFML.Core.InteractionFlowElement#getInInteractionFlows <em>In Interaction Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getInteractionFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFlowElement extends NamedElement, InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.IFMLParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getInteractionFlowElement_Parameters()
	 * @model type="IFML.Core.IFMLParameter" containment="true" ordered="false"
	 * @generated
	 */
	EList getParameters();

	/**
	 * Returns the value of the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.InteractionFlow}.
	 * It is bidirectional and its opposite is '{@link IFML.Core.InteractionFlow#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Interaction Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Interaction Flows</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getInteractionFlowElement_OutInteractionFlows()
	 * @see IFML.Core.InteractionFlow#getSourceInteractionFlowElement
	 * @model type="IFML.Core.InteractionFlow" opposite="sourceInteractionFlowElement" containment="true" ordered="false"
	 * @generated
	 */
	EList getOutInteractionFlows();

	/**
	 * Returns the value of the '<em><b>In Interaction Flows</b></em>' reference list.
	 * The list contents are of type {@link IFML.Core.InteractionFlow}.
	 * It is bidirectional and its opposite is '{@link IFML.Core.InteractionFlow#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Interaction Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Interaction Flows</em>' reference list.
	 * @see IFML.Core.CorePackage#getInteractionFlowElement_InInteractionFlows()
	 * @see IFML.Core.InteractionFlow#getTargetInteractionFlowElement
	 * @model type="IFML.Core.InteractionFlow" opposite="targetInteractionFlowElement" ordered="false"
	 * @generated
	 */
	EList getInInteractionFlows();

} // InteractionFlowElement
