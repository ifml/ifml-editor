/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.ParameterBinding#getSourceParameter <em>Source Parameter</em>}</li>
 *   <li>{@link IFML.Core.ParameterBinding#getTargetParameter <em>Target Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getParameterBinding()
 * @model
 * @generated
 */
public interface ParameterBinding extends InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Source Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Parameter</em>' reference.
	 * @see #setSourceParameter(IFMLParameter)
	 * @see IFML.Core.CorePackage#getParameterBinding_SourceParameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IFMLParameter getSourceParameter();

	/**
	 * Sets the value of the '{@link IFML.Core.ParameterBinding#getSourceParameter <em>Source Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Parameter</em>' reference.
	 * @see #getSourceParameter()
	 * @generated
	 */
	void setSourceParameter(IFMLParameter value);

	/**
	 * Returns the value of the '<em><b>Target Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Parameter</em>' reference.
	 * @see #setTargetParameter(IFMLParameter)
	 * @see IFML.Core.CorePackage#getParameterBinding_TargetParameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IFMLParameter getTargetParameter();

	/**
	 * Sets the value of the '{@link IFML.Core.ParameterBinding#getTargetParameter <em>Target Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Parameter</em>' reference.
	 * @see #getTargetParameter()
	 * @generated
	 */
	void setTargetParameter(IFMLParameter value);

} // ParameterBinding
