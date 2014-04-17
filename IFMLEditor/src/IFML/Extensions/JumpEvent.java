/**
 */
package IFML.Extensions;

import IFML.Core.ThrowingEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Extensions.JumpEvent#getLandingEvent <em>Landing Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Extensions.ExtensionsPackage#getJumpEvent()
 * @model
 * @generated
 */
public interface JumpEvent extends ThrowingEvent {
	/**
	 * Returns the value of the '<em><b>Landing Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFML.Extensions.LandingEvent#getJumpingEvents <em>Jumping Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Landing Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Event</em>' reference.
	 * @see #setLandingEvent(LandingEvent)
	 * @see IFML.Extensions.ExtensionsPackage#getJumpEvent_LandingEvent()
	 * @see IFML.Extensions.LandingEvent#getJumpingEvents
	 * @model opposite="jumpingEvents" ordered="false"
	 * @generated
	 */
	LandingEvent getLandingEvent();

	/**
	 * Sets the value of the '{@link IFML.Extensions.JumpEvent#getLandingEvent <em>Landing Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Event</em>' reference.
	 * @see #getLandingEvent()
	 * @generated
	 */
	void setLandingEvent(LandingEvent value);

} // JumpEvent
