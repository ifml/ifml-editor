/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.PortDefinition#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getPortDefinition()
 * @model
 * @generated
 */
public interface PortDefinition extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link IFML.Core.IFMLPort}.
	 * It is bidirectional and its opposite is '{@link IFML.Core.IFMLPort#getPortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see IFML.Core.CorePackage#getPortDefinition_Ports()
	 * @see IFML.Core.IFMLPort#getPortDefinition
	 * @model opposite="portDefinition" ordered="false"
	 * @generated
	 */
	EList<IFMLPort> getPorts();

} // PortDefinition
