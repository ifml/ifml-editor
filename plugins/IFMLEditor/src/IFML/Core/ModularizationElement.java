/**
 */
package IFML.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modularization Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.ModularizationElement#getModulePackage <em>Module Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getModularizationElement()
 * @model
 * @generated
 */
public interface ModularizationElement extends NamedElement, InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Module Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IFML.Core.ModulePackage#getModularizationElements <em>Modularization Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Package</em>' container reference.
	 * @see #setModulePackage(ModulePackage)
	 * @see IFML.Core.CorePackage#getModularizationElement_ModulePackage()
	 * @see IFML.Core.ModulePackage#getModularizationElements
	 * @model opposite="modularizationElements" transient="false" ordered="false"
	 * @generated
	 */
	ModulePackage getModulePackage();

	/**
	 * Sets the value of the '{@link IFML.Core.ModularizationElement#getModulePackage <em>Module Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Package</em>' container reference.
	 * @see #getModulePackage()
	 * @generated
	 */
	void setModulePackage(ModulePackage value);

} // ModularizationElement
