/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.DataBinding#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link IFML.Core.DataBinding#getVisualizationAttribute <em>Visualization Attribute</em>}</li>
 *   <li>{@link IFML.Core.DataBinding#getDataContextVariables <em>Data Context Variables</em>}</li>
 *   <li>{@link IFML.Core.DataBinding#getDomainConcept <em>Domain Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getDataBinding()
 * @model
 * @generated
 */
public interface DataBinding extends ContentBinding {
	/**
	 * Returns the value of the '<em><b>Conditional Expression</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.ConditionalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Expression</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getDataBinding_ConditionalExpression()
	 * @model type="IFML.Core.ConditionalExpression" containment="true" ordered="false"
	 * @generated
	 */
	EList getConditionalExpression();

	/**
	 * Returns the value of the '<em><b>Visualization Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.VisualizationAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualization Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Attribute</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getDataBinding_VisualizationAttribute()
	 * @model type="IFML.Core.VisualizationAttribute" containment="true" ordered="false"
	 * @generated
	 */
	EList getVisualizationAttribute();

	/**
	 * Returns the value of the '<em><b>Data Context Variables</b></em>' reference list.
	 * The list contents are of type {@link IFML.Core.DataContextVariable}.
	 * It is bidirectional and its opposite is '{@link IFML.Core.DataContextVariable#getDataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Context Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Context Variables</em>' reference list.
	 * @see IFML.Core.CorePackage#getDataBinding_DataContextVariables()
	 * @see IFML.Core.DataContextVariable#getDataBinding
	 * @model type="IFML.Core.DataContextVariable" opposite="dataBinding" ordered="false"
	 * @generated
	 */
	EList getDataContextVariables();

	/**
	 * Returns the value of the '<em><b>Domain Concept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.DomainConcept#getDataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Concept</em>' reference.
	 * @see #setDomainConcept(DomainConcept)
	 * @see IFML.Core.CorePackage#getDataBinding_DomainConcept()
	 * @see IFML.Core.DomainConcept#getDataBinding
	 * @model opposite="dataBinding" required="true" ordered="false"
	 * @generated
	 */
	DomainConcept getDomainConcept();

	/**
	 * Sets the value of the '{@link IFML.Core.DataBinding#getDomainConcept <em>Domain Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Concept</em>' reference.
	 * @see #getDomainConcept()
	 * @generated
	 */
	void setDomainConcept(DomainConcept value);

} // DataBinding
