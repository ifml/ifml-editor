/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.DomainModel#getDomainElements <em>Domain Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Domain Elements</b></em>' reference list.
	 * The list contents are of type {@link IFML.Core.DomainElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Elements</em>' reference list.
	 * @see IFML.Core.CorePackage#getDomainModel_DomainElements()
	 * @model type="IFML.Core.DomainElement" ordered="false"
	 * @generated
	 */
	EList getDomainElements();

} // DomainModel
