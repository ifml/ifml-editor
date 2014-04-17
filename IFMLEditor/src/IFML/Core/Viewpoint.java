/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.Viewpoint#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}</li>
 *   <li>{@link IFML.Core.Viewpoint#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getViewpoint()
 * @model
 * @generated
 */
public interface Viewpoint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interaction Flow Model Elements</b></em>' reference list.
	 * The list contents are of type {@link IFML.Core.InteractionFlowModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow Model Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model Elements</em>' reference list.
	 * @see IFML.Core.CorePackage#getViewpoint_InteractionFlowModelElements()
	 * @model type="IFML.Core.InteractionFlowModelElement" ordered="false"
	 * @generated
	 */
	EList getInteractionFlowModelElements();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see IFML.Core.CorePackage#getViewpoint_Context()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link IFML.Core.Viewpoint#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // Viewpoint
