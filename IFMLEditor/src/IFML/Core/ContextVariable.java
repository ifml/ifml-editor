/**
 */
package IFML.Core;

import IFML.DataTypes.ContextVariableScope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.ContextVariable#getContext <em>Context</em>}</li>
 *   <li>{@link IFML.Core.ContextVariable#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getContextVariable()
 * @model
 * @generated
 */
public interface ContextVariable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.Context#getContextVariables <em>Context Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(Context)
	 * @see IFML.Core.CorePackage#getContextVariable_Context()
	 * @see IFML.Core.Context#getContextVariables
	 * @model opposite="contextVariables" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link IFML.Core.ContextVariable#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link IFML.DataTypes.ContextVariableScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see IFML.DataTypes.ContextVariableScope
	 * @see #setScope(ContextVariableScope)
	 * @see IFML.Core.CorePackage#getContextVariable_Scope()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ContextVariableScope getScope();

	/**
	 * Sets the value of the '{@link IFML.Core.ContextVariable#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see IFML.DataTypes.ContextVariableScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ContextVariableScope value);

} // ContextVariable
