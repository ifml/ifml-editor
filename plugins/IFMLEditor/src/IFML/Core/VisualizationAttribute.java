/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.VisualizationAttribute#getFeatureConcept <em>Feature Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getVisualizationAttribute()
 * @model
 * @generated
 */
public interface VisualizationAttribute extends ViewComponentPart {
	/**
	 * Returns the value of the '<em><b>Feature Concept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.FeatureConcept#getVisualizationAttribute <em>Visualization Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Concept</em>' reference.
	 * @see #setFeatureConcept(FeatureConcept)
	 * @see IFML.Core.CorePackage#getVisualizationAttribute_FeatureConcept()
	 * @see IFML.Core.FeatureConcept#getVisualizationAttribute
	 * @model opposite="visualizationAttribute" required="true" ordered="false"
	 * @generated
	 */
	FeatureConcept getFeatureConcept();

	/**
	 * Sets the value of the '{@link IFML.Core.VisualizationAttribute#getFeatureConcept <em>Feature Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Concept</em>' reference.
	 * @see #getFeatureConcept()
	 * @generated
	 */
	void setFeatureConcept(FeatureConcept value);

} // VisualizationAttribute
