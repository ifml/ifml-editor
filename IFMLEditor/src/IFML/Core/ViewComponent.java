/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.ViewComponent#getViewComponentParts <em>View Component Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getViewComponent()
 * @model
 * @generated
 */
public interface ViewComponent extends ViewElement {
	/**
	 * Returns the value of the '<em><b>View Component Parts</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.ViewComponentPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Component Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Component Parts</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getViewComponent_ViewComponentParts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ViewComponentPart> getViewComponentParts();

} // ViewComponent
