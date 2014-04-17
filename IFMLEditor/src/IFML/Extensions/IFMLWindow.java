/**
 */
package IFML.Extensions;

import IFML.Core.ViewContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFML Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Extensions.IFMLWindow#isIsModal <em>Is Modal</em>}</li>
 *   <li>{@link IFML.Extensions.IFMLWindow#isIsNewWindow <em>Is New Window</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Extensions.ExtensionsPackage#getIFMLWindow()
 * @model
 * @generated
 */
public interface IFMLWindow extends ViewContainer {
	/**
	 * Returns the value of the '<em><b>Is Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modal</em>' attribute.
	 * @see #setIsModal(boolean)
	 * @see IFML.Extensions.ExtensionsPackage#getIFMLWindow_IsModal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsModal();

	/**
	 * Sets the value of the '{@link IFML.Extensions.IFMLWindow#isIsModal <em>Is Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modal</em>' attribute.
	 * @see #isIsModal()
	 * @generated
	 */
	void setIsModal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is New Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is New Window</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is New Window</em>' attribute.
	 * @see #setIsNewWindow(boolean)
	 * @see IFML.Extensions.ExtensionsPackage#getIFMLWindow_IsNewWindow()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsNewWindow();

	/**
	 * Sets the value of the '{@link IFML.Extensions.IFMLWindow#isIsNewWindow <em>Is New Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is New Window</em>' attribute.
	 * @see #isIsNewWindow()
	 * @generated
	 */
	void setIsNewWindow(boolean value);

} // IFMLWindow
