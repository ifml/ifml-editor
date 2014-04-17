/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.ViewElement#getViewElementEvents <em>View Element Events</em>}</li>
 *   <li>{@link IFML.Core.ViewElement#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link IFML.Core.ViewElement#getViewContainer <em>View Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getViewElement()
 * @model
 * @generated
 */
public interface ViewElement extends InteractionFlowElement {
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
	 * @see IFML.Core.CorePackage#getViewElement_ViewElementEvents()
	 * @model type="IFML.Core.ViewElementEvent" containment="true" ordered="false"
	 * @generated
	 */
	EList getViewElementEvents();

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
	 * @see IFML.Core.CorePackage#getViewElement_ActivationExpression()
	 * @model ordered="false"
	 * @generated
	 */
	ActivationExpression getActivationExpression();

	/**
	 * Sets the value of the '{@link IFML.Core.ViewElement#getActivationExpression <em>Activation Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Expression</em>' reference.
	 * @see #getActivationExpression()
	 * @generated
	 */
	void setActivationExpression(ActivationExpression value);

	/**
	 * Returns the value of the '<em><b>View Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.ViewContainer#getViewElements <em>View Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Container</em>' container reference.
	 * @see #setViewContainer(ViewContainer)
	 * @see IFML.Core.CorePackage#getViewElement_ViewContainer()
	 * @see IFML.Core.ViewContainer#getViewElements
	 * @model opposite="viewElements" transient="false" ordered="false"
	 * @generated
	 */
	ViewContainer getViewContainer();

	/**
	 * Sets the value of the '{@link IFML.Core.ViewElement#getViewContainer <em>View Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Container</em>' container reference.
	 * @see #getViewContainer()
	 * @generated
	 */
	void setViewContainer(ViewContainer value);

} // ViewElement
