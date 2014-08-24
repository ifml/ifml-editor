/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.ContentBinding#getUniformResourceIdentifier <em>Uniform Resource Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getContentBinding()
 * @model abstract="true"
 * @generated
 */
public interface ContentBinding extends ViewComponentPart {
	/**
	 * Returns the value of the '<em><b>Uniform Resource Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uniform Resource Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uniform Resource Identifier</em>' attribute.
	 * @see #setUniformResourceIdentifier(String)
	 * @see IFML.Core.CorePackage#getContentBinding_UniformResourceIdentifier()
	 * @model ordered="false"
	 * @generated
	 */
	String getUniformResourceIdentifier();

	/**
	 * Sets the value of the '{@link IFML.Core.ContentBinding#getUniformResourceIdentifier <em>Uniform Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uniform Resource Identifier</em>' attribute.
	 * @see #getUniformResourceIdentifier()
	 * @generated
	 */
	void setUniformResourceIdentifier(String value);

} // ContentBinding
