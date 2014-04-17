/**
 */
package IFML.Extensions;

import IFML.Core.ViewComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Extensions.List#getSelectEvent <em>Select Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Extensions.ExtensionsPackage#getList()
 * @model
 * @generated
 */
public interface List extends ViewComponent {
	/**
	 * Returns the value of the '<em><b>Select Event</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Extensions.OnSelectEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Event</em>' containment reference list.
	 * @see IFML.Extensions.ExtensionsPackage#getList_SelectEvent()
	 * @model type="IFML.Extensions.OnSelectEvent" containment="true" ordered="false"
	 * @generated
	 */
	EList getSelectEvent();

} // List
