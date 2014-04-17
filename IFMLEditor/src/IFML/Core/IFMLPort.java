/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFML Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.IFMLPort#getPortDefinition <em>Port Definition</em>}</li>
 *   <li>{@link IFML.Core.IFMLPort#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getIFMLPort()
 * @model
 * @generated
 */
public interface IFMLPort extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Port Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.PortDefinition#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Definition</em>' reference.
	 * @see #setPortDefinition(PortDefinition)
	 * @see IFML.Core.CorePackage#getIFMLPort_PortDefinition()
	 * @see IFML.Core.PortDefinition#getPorts
	 * @model opposite="ports" required="true" ordered="false"
	 * @generated
	 */
	PortDefinition getPortDefinition();

	/**
	 * Sets the value of the '{@link IFML.Core.IFMLPort#getPortDefinition <em>Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Definition</em>' reference.
	 * @see #getPortDefinition()
	 * @generated
	 */
	void setPortDefinition(PortDefinition value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.IFMLModule#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(IFMLModule)
	 * @see IFML.Core.CorePackage#getIFMLPort_Module()
	 * @see IFML.Core.IFMLModule#getPorts
	 * @model opposite="ports" required="true" ordered="false"
	 * @generated
	 */
	IFMLModule getModule();

	/**
	 * Sets the value of the '{@link IFML.Core.IFMLPort#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(IFMLModule value);

} // IFMLPort
