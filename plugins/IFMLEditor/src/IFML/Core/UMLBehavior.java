/**
 */
package IFML.Core;

import org.eclipse.uml2.uml.Behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.UMLBehavior#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getUMLBehavior()
 * @model
 * @generated
 */
public interface UMLBehavior extends BehaviorConcept {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see IFML.Core.CorePackage#getUMLBehavior_Behavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link IFML.Core.UMLBehavior#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // UMLBehavior
