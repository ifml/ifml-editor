/**
 */
package IFML.DataTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>System Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFML.DataTypes.DataTypesPackage#getSystemEventType()
 * @model
 * @generated
 */
public final class SystemEventType extends AbstractEnumerator {
	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_LITERAL
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME = 0;

	/**
	 * The '<em><b>Special Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Special Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_CONDITION_LITERAL
	 * @model name="specialCondition"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_CONDITION = 0;

	/**
	 * The '<em><b>Action Completion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Action Completion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTION_COMPLETION_LITERAL
	 * @model name="actionCompletion"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_COMPLETION = 0;

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @generated
	 * @ordered
	 */
	public static final SystemEventType TIME_LITERAL = new SystemEventType(TIME, "time", "time");

	/**
	 * The '<em><b>Special Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_CONDITION
	 * @generated
	 * @ordered
	 */
	public static final SystemEventType SPECIAL_CONDITION_LITERAL = new SystemEventType(SPECIAL_CONDITION, "specialCondition", "specialCondition");

	/**
	 * The '<em><b>Action Completion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_COMPLETION
	 * @generated
	 * @ordered
	 */
	public static final SystemEventType ACTION_COMPLETION_LITERAL = new SystemEventType(ACTION_COMPLETION, "actionCompletion", "actionCompletion");

	/**
	 * An array of all the '<em><b>System Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SystemEventType[] VALUES_ARRAY =
		new SystemEventType[] {
			TIME_LITERAL,
			SPECIAL_CONDITION_LITERAL,
			ACTION_COMPLETION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>System Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>System Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemEventType get(int value) {
		switch (value) {
			case TIME: return TIME_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SystemEventType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SystemEventType
