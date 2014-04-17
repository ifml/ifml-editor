/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.DynamicBehavior#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}</li>
 *   <li>{@link IFML.Core.DynamicBehavior#getBehaviorConcept <em>Behavior Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getDynamicBehavior()
 * @model
 * @generated
 */
public interface DynamicBehavior extends ContentBinding {
	/**
	 * Returns the value of the '<em><b>Behavioral Feature Concept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.BehavioralFeatureConcept#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioral Feature Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioral Feature Concept</em>' reference.
	 * @see #setBehavioralFeatureConcept(BehavioralFeatureConcept)
	 * @see IFML.Core.CorePackage#getDynamicBehavior_BehavioralFeatureConcept()
	 * @see IFML.Core.BehavioralFeatureConcept#getDynamicBehavior
	 * @model opposite="dynamicBehavior" ordered="false"
	 * @generated
	 */
	BehavioralFeatureConcept getBehavioralFeatureConcept();

	/**
	 * Sets the value of the '{@link IFML.Core.DynamicBehavior#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Feature Concept</em>' reference.
	 * @see #getBehavioralFeatureConcept()
	 * @generated
	 */
	void setBehavioralFeatureConcept(BehavioralFeatureConcept value);

	/**
	 * Returns the value of the '<em><b>Behavior Concept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.BehaviorConcept#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Concept</em>' reference.
	 * @see #setBehaviorConcept(BehaviorConcept)
	 * @see IFML.Core.CorePackage#getDynamicBehavior_BehaviorConcept()
	 * @see IFML.Core.BehaviorConcept#getDynamicBehavior
	 * @model opposite="dynamicBehavior" ordered="false"
	 * @generated
	 */
	BehaviorConcept getBehaviorConcept();

	/**
	 * Sets the value of the '{@link IFML.Core.DynamicBehavior#getBehaviorConcept <em>Behavior Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Concept</em>' reference.
	 * @see #getBehaviorConcept()
	 * @generated
	 */
	void setBehaviorConcept(BehaviorConcept value);

} // DynamicBehavior
