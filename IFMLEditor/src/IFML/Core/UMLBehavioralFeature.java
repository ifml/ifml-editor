/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.UMLBehavioralFeature#getBehavioralFeature <em>Behavioral Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getUMLBehavioralFeature()
 * @model
 * @generated
 */
public interface UMLBehavioralFeature extends BehavioralFeatureConcept {
	/**
	 * Returns the value of the '<em><b>Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioral Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioral Feature</em>' reference.
	 * @see #setBehavioralFeature(UMLBehavior)
	 * @see IFML.Core.CorePackage#getUMLBehavioralFeature_BehavioralFeature()
	 * @model ordered="false"
	 * @generated
	 */
	UMLBehavior getBehavioralFeature();

	/**
	 * Sets the value of the '{@link IFML.Core.UMLBehavioralFeature#getBehavioralFeature <em>Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Feature</em>' reference.
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	void setBehavioralFeature(UMLBehavior value);

} // UMLBehavioralFeature
