/**
 */
package IFML.Core;

import IFML.DataTypes.SystemEventType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.SystemEvent#getTriggeringExpressions <em>Triggering Expressions</em>}</li>
 *   <li>{@link IFML.Core.SystemEvent#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getSystemEvent()
 * @model
 * @generated
 */
public interface SystemEvent extends CatchingEvent {
	/**
	 * Returns the value of the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggering Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggering Expressions</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getSystemEvent_TriggeringExpressions()
	 * @model type="IFML.Core.Expression" containment="true" ordered="false"
	 * @generated
	 */
	EList getTriggeringExpressions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFML.DataTypes.SystemEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see IFML.DataTypes.SystemEventType
	 * @see #setType(SystemEventType)
	 * @see IFML.Core.CorePackage#getSystemEvent_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SystemEventType getType();

	/**
	 * Sets the value of the '{@link IFML.Core.SystemEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see IFML.DataTypes.SystemEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(SystemEventType value);

} // SystemEvent
