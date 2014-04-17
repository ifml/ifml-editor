/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.ModulePackage#getModularizationElements <em>Modularization Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getModulePackage()
 * @model
 * @generated
 */
public interface ModulePackage extends ModularizationElement {
	/**
	 * Returns the value of the '<em><b>Modularization Elements</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.ModularizationElement}.
	 * It is bidirectional and its opposite is '{@link IFML.Core.ModularizationElement#getModulePackage <em>Module Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modularization Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modularization Elements</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getModulePackage_ModularizationElements()
	 * @see IFML.Core.ModularizationElement#getModulePackage
	 * @model type="IFML.Core.ModularizationElement" opposite="modulePackage" containment="true" ordered="false"
	 * @generated
	 */
	EList getModularizationElements();

} // ModulePackage
