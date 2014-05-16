/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.InteractionFlowModel#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getInteractionFlowModel()
 * @model
 * @generated
 */
public interface InteractionFlowModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interaction Flow Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.InteractionFlowModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model Elements</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getInteractionFlowModel_InteractionFlowModelElements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InteractionFlowModelElement> getInteractionFlowModelElements();

} // InteractionFlowModel
