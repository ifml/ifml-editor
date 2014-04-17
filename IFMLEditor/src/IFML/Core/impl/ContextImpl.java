/**
 */
package IFML.Core.impl;

import IFML.Core.Context;
import IFML.Core.ContextDimension;
import IFML.Core.ContextVariable;
import IFML.Core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.ContextImpl#getContextDimensions <em>Context Dimensions</em>}</li>
 *   <li>{@link IFML.Core.impl.ContextImpl#getContextVariables <em>Context Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends ElementImpl implements Context {
	/**
	 * The cached value of the '{@link #getContextDimensions() <em>Context Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList contextDimensions;

	/**
	 * The cached value of the '{@link #getContextVariables() <em>Context Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextVariables()
	 * @generated
	 * @ordered
	 */
	protected EList contextVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContextDimensions() {
		if (contextDimensions == null) {
			contextDimensions = new EObjectContainmentEList(ContextDimension.class, this, CorePackage.CONTEXT__CONTEXT_DIMENSIONS);
		}
		return contextDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContextVariables() {
		if (contextVariables == null) {
			contextVariables = new EObjectContainmentWithInverseEList(ContextVariable.class, this, CorePackage.CONTEXT__CONTEXT_VARIABLES, CorePackage.CONTEXT_VARIABLE__CONTEXT);
		}
		return contextVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONTEXT__CONTEXT_VARIABLES:
				return ((InternalEList)getContextVariables()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONTEXT__CONTEXT_DIMENSIONS:
				return ((InternalEList)getContextDimensions()).basicRemove(otherEnd, msgs);
			case CorePackage.CONTEXT__CONTEXT_VARIABLES:
				return ((InternalEList)getContextVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CONTEXT__CONTEXT_DIMENSIONS:
				return getContextDimensions();
			case CorePackage.CONTEXT__CONTEXT_VARIABLES:
				return getContextVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.CONTEXT__CONTEXT_DIMENSIONS:
				getContextDimensions().clear();
				getContextDimensions().addAll((Collection)newValue);
				return;
			case CorePackage.CONTEXT__CONTEXT_VARIABLES:
				getContextVariables().clear();
				getContextVariables().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.CONTEXT__CONTEXT_DIMENSIONS:
				getContextDimensions().clear();
				return;
			case CorePackage.CONTEXT__CONTEXT_VARIABLES:
				getContextVariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.CONTEXT__CONTEXT_DIMENSIONS:
				return contextDimensions != null && !contextDimensions.isEmpty();
			case CorePackage.CONTEXT__CONTEXT_VARIABLES:
				return contextVariables != null && !contextVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
