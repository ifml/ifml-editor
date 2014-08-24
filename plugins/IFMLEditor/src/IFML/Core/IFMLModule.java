/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFML Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.IFMLModule#getModuleDefinition <em>Module Definition</em>}</li>
 *   <li>{@link IFML.Core.IFMLModule#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getIFMLModule()
 * @model
 * @generated
 */
public interface IFMLModule extends NamedElement, InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Module Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.ModuleDefinition#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Definition</em>' reference.
	 * @see #setModuleDefinition(ModuleDefinition)
	 * @see IFML.Core.CorePackage#getIFMLModule_ModuleDefinition()
	 * @see IFML.Core.ModuleDefinition#getModules
	 * @model opposite="modules" required="true" ordered="false"
	 * @generated
	 */
	ModuleDefinition getModuleDefinition();

	/**
	 * Sets the value of the '{@link IFML.Core.IFMLModule#getModuleDefinition <em>Module Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Definition</em>' reference.
	 * @see #getModuleDefinition()
	 * @generated
	 */
	void setModuleDefinition(ModuleDefinition value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link IFML.Core.IFMLPort}.
	 * It is bidirectional and its opposite is '{@link IFML.Core.IFMLPort#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see IFML.Core.CorePackage#getIFMLModule_Ports()
	 * @see IFML.Core.IFMLPort#getModule
	 * @model opposite="module" ordered="false"
	 * @generated
	 */
	EList<IFMLPort> getPorts();

} // IFMLModule
