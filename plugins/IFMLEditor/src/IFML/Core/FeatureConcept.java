/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.FeatureConcept#getVisualizationAttribute <em>Visualization Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getFeatureConcept()
 * @model
 * @generated
 */
public interface FeatureConcept extends DomainElement {
	/**
	 * Returns the value of the '<em><b>Visualization Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualization Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Attribute</em>' reference.
	 * @see #setVisualizationAttribute(VisualizationAttribute)
	 * @see IFML.Core.CorePackage#getFeatureConcept_VisualizationAttribute()
	 * @model ordered="false"
	 * @generated
	 */
	VisualizationAttribute getVisualizationAttribute();

	/**
	 * Sets the value of the '{@link IFML.Core.FeatureConcept#getVisualizationAttribute <em>Visualization Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization Attribute</em>' reference.
	 * @see #getVisualizationAttribute()
	 * @generated
	 */
	void setVisualizationAttribute(VisualizationAttribute value);

} // FeatureConcept
