/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Component Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.ViewComponentPart#getViewElementEvents <em>View Element Events</em>}</li>
 *   <li>{@link IFML.Core.ViewComponentPart#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link IFML.Core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}</li>
 *   <li>{@link IFML.Core.ViewComponentPart#getSubViewComponentParts <em>Sub View Component Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getViewComponentPart()
 * @model
 * @generated
 */
public interface ViewComponentPart extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>View Element Events</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.ViewElementEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Element Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Element Events</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getViewComponentPart_ViewElementEvents()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ViewElementEvent> getViewElementEvents();

	/**
	 * Returns the value of the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Expression</em>' reference.
	 * @see #setActivationExpression(ActivationExpression)
	 * @see IFML.Core.CorePackage#getViewComponentPart_ActivationExpression()
	 * @model ordered="false"
	 * @generated
	 */
	ActivationExpression getActivationExpression();

	/**
	 * Sets the value of the '{@link IFML.Core.ViewComponentPart#getActivationExpression <em>Activation Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Expression</em>' reference.
	 * @see #getActivationExpression()
	 * @generated
	 */
	void setActivationExpression(ActivationExpression value);

	/**
	 * Returns the value of the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent View Component Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent View Component Part</em>' reference.
	 * @see #setParentViewComponentPart(ViewComponentPart)
	 * @see IFML.Core.CorePackage#getViewComponentPart_ParentViewComponentPart()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ViewComponentPart getParentViewComponentPart();

	/**
	 * Sets the value of the '{@link IFML.Core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent View Component Part</em>' reference.
	 * @see #getParentViewComponentPart()
	 * @generated
	 */
	void setParentViewComponentPart(ViewComponentPart value);

	/**
	 * Returns the value of the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.ViewComponentPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub View Component Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub View Component Parts</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getViewComponentPart_SubViewComponentParts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ViewComponentPart> getSubViewComponentParts();

} // ViewComponentPart
