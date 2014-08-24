/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.Expression#getLanguage <em>Language</em>}</li>
 *   <li>{@link IFML.Core.Expression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see IFML.Core.CorePackage#getExpression_Language()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link IFML.Core.Expression#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see IFML.Core.CorePackage#getExpression_Body()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link IFML.Core.Expression#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Expression
