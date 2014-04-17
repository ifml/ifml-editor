/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.Context#getContextDimensions <em>Context Dimensions</em>}</li>
 *   <li>{@link IFML.Core.Context#getContextVariables <em>Context Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends Element {
	/**
	 * Returns the value of the '<em><b>Context Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.ContextDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Dimensions</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getContext_ContextDimensions()
	 * @model type="IFML.Core.ContextDimension" containment="true" ordered="false"
	 * @generated
	 */
	EList getContextDimensions();

	/**
	 * Returns the value of the '<em><b>Context Variables</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.ContextVariable}.
	 * It is bidirectional and its opposite is '{@link IFML.Core.ContextVariable#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Variables</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getContext_ContextVariables()
	 * @see IFML.Core.ContextVariable#getContext
	 * @model type="IFML.Core.ContextVariable" opposite="context" containment="true" ordered="false"
	 * @generated
	 */
	EList getContextVariables();

} // Context
