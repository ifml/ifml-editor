/**
 */
package IFML.Core;

import org.eclipse.uml2.uml.BehavioralFeature;


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
	 * @see #setBehavioralFeature(BehavioralFeature)
	 * @see IFML.Core.CorePackage#getUMLBehavioralFeature_BehavioralFeature()
	 * @model ordered="false"
	 * @generated
	 */
	BehavioralFeature getBehavioralFeature();

	/**
	 * Sets the value of the '{@link IFML.Core.UMLBehavioralFeature#getBehavioralFeature <em>Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Feature</em>' reference.
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	void setBehavioralFeature(BehavioralFeature value);

} // UMLBehavioralFeature
