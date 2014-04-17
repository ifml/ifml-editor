/**
 */
package IFML.DataTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Context Variable Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFML.DataTypes.DataTypesPackage#getContextVariableScope()
 * @model
 * @generated
 */
public final class ContextVariableScope extends AbstractEnumerator {
	/**
	 * The '<em><b>Application Scope</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Application Scope</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SCOPE_LITERAL
	 * @model name="ApplicationScope"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SCOPE = 0;

	/**
	 * The '<em><b>Session Scope</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Session Scope</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SESSION_SCOPE_LITERAL
	 * @model name="SessionScope"
	 * @generated
	 * @ordered
	 */
	public static final int SESSION_SCOPE = 0;

	/**
	 * The '<em><b>View Container Scope</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>View Container Scope</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIEW_CONTAINER_SCOPE_LITERAL
	 * @model name="ViewContainerScope"
	 * @generated
	 * @ordered
	 */
	public static final int VIEW_CONTAINER_SCOPE = 0;

	/**
	 * The '<em><b>Application Scope</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SCOPE
	 * @generated
	 * @ordered
	 */
	public static final ContextVariableScope APPLICATION_SCOPE_LITERAL = new ContextVariableScope(APPLICATION_SCOPE, "ApplicationScope", "ApplicationScope");

	/**
	 * The '<em><b>Session Scope</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SESSION_SCOPE
	 * @generated
	 * @ordered
	 */
	public static final ContextVariableScope SESSION_SCOPE_LITERAL = new ContextVariableScope(SESSION_SCOPE, "SessionScope", "SessionScope");

	/**
	 * The '<em><b>View Container Scope</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEW_CONTAINER_SCOPE
	 * @generated
	 * @ordered
	 */
	public static final ContextVariableScope VIEW_CONTAINER_SCOPE_LITERAL = new ContextVariableScope(VIEW_CONTAINER_SCOPE, "ViewContainerScope", "ViewContainerScope");

	/**
	 * An array of all the '<em><b>Context Variable Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContextVariableScope[] VALUES_ARRAY =
		new ContextVariableScope[] {
			APPLICATION_SCOPE_LITERAL,
			SESSION_SCOPE_LITERAL,
			VIEW_CONTAINER_SCOPE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Context Variable Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Context Variable Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextVariableScope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextVariableScope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Context Variable Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextVariableScope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextVariableScope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Context Variable Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextVariableScope get(int value) {
		switch (value) {
			case APPLICATION_SCOPE: return APPLICATION_SCOPE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ContextVariableScope(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ContextVariableScope
