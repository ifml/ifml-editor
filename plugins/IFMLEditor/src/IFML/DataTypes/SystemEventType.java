/**
 */
package IFML.DataTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>System Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFML.DataTypes.DataTypesPackage#getSystemEventType()
 * @model
 * @generated
 */
public enum SystemEventType implements Enumerator
{
	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(0, "time", "time"),
	/**
	 * The '<em><b>Special Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL_CONDITION(0, "specialCondition", "specialCondition"),
	/**
	 * The '<em><b>Action Completion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_COMPLETION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_COMPLETION(0, "actionCompletion", "actionCompletion");
	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 0;

	/**
	 * The '<em><b>Special Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Special Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_CONDITION
	 * @model name="specialCondition"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_CONDITION_VALUE = 0;

	/**
	 * The '<em><b>Action Completion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Action Completion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTION_COMPLETION
	 * @model name="actionCompletion"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_COMPLETION_VALUE = 0;

	/**
	 * An array of all the '<em><b>System Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SystemEventType[] VALUES_ARRAY =
		new SystemEventType[] {
			TIME,
			SPECIAL_CONDITION,
			ACTION_COMPLETION,
		};

	/**
	 * A public read-only list of all the '<em><b>System Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SystemEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case TIME_VALUE: return TIME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SystemEventType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
