/**
 */
package IFML.Core.impl;

import IFML.Core.ConditionalExpression;
import IFML.Core.CorePackage;
import IFML.Core.DataBinding;
import IFML.Core.DataContextVariable;
import IFML.Core.DomainConcept;
import IFML.Core.VisualizationAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.DataBindingImpl#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link IFML.Core.impl.DataBindingImpl#getVisualizationAttribute <em>Visualization Attribute</em>}</li>
 *   <li>{@link IFML.Core.impl.DataBindingImpl#getDataContextVariables <em>Data Context Variables</em>}</li>
 *   <li>{@link IFML.Core.impl.DataBindingImpl#getDomainConcept <em>Domain Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBindingImpl extends ContentBindingImpl implements DataBinding {
	/**
	 * The cached value of the '{@link #getConditionalExpression() <em>Conditional Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalExpression()
	 * @generated
	 * @ordered
	 */
	protected EList conditionalExpression;

	/**
	 * The cached value of the '{@link #getVisualizationAttribute() <em>Visualization Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList visualizationAttribute;

	/**
	 * The cached value of the '{@link #getDataContextVariables() <em>Data Context Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataContextVariables()
	 * @generated
	 * @ordered
	 */
	protected EList dataContextVariables;

	/**
	 * The cached value of the '{@link #getDomainConcept() <em>Domain Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainConcept()
	 * @generated
	 * @ordered
	 */
	protected DomainConcept domainConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.DATA_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConditionalExpression() {
		if (conditionalExpression == null) {
			conditionalExpression = new EObjectContainmentEList(ConditionalExpression.class, this, CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION);
		}
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVisualizationAttribute() {
		if (visualizationAttribute == null) {
			visualizationAttribute = new EObjectContainmentEList(VisualizationAttribute.class, this, CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTE);
		}
		return visualizationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataContextVariables() {
		if (dataContextVariables == null) {
			dataContextVariables = new EObjectWithInverseResolvingEList(DataContextVariable.class, this, CorePackage.DATA_BINDING__DATA_CONTEXT_VARIABLES, CorePackage.DATA_CONTEXT_VARIABLE__DATA_BINDING);
		}
		return dataContextVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainConcept getDomainConcept() {
		if (domainConcept != null && domainConcept.eIsProxy()) {
			InternalEObject oldDomainConcept = (InternalEObject)domainConcept;
			domainConcept = (DomainConcept)eResolveProxy(oldDomainConcept);
			if (domainConcept != oldDomainConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DATA_BINDING__DOMAIN_CONCEPT, oldDomainConcept, domainConcept));
			}
		}
		return domainConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainConcept basicGetDomainConcept() {
		return domainConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainConcept(DomainConcept newDomainConcept, NotificationChain msgs) {
		DomainConcept oldDomainConcept = domainConcept;
		domainConcept = newDomainConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DATA_BINDING__DOMAIN_CONCEPT, oldDomainConcept, newDomainConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainConcept(DomainConcept newDomainConcept) {
		if (newDomainConcept != domainConcept) {
			NotificationChain msgs = null;
			if (domainConcept != null)
				msgs = ((InternalEObject)domainConcept).eInverseRemove(this, CorePackage.DOMAIN_CONCEPT__DATA_BINDING, DomainConcept.class, msgs);
			if (newDomainConcept != null)
				msgs = ((InternalEObject)newDomainConcept).eInverseAdd(this, CorePackage.DOMAIN_CONCEPT__DATA_BINDING, DomainConcept.class, msgs);
			msgs = basicSetDomainConcept(newDomainConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DATA_BINDING__DOMAIN_CONCEPT, newDomainConcept, newDomainConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DATA_BINDING__DATA_CONTEXT_VARIABLES:
				return ((InternalEList)getDataContextVariables()).basicAdd(otherEnd, msgs);
			case CorePackage.DATA_BINDING__DOMAIN_CONCEPT:
				if (domainConcept != null)
					msgs = ((InternalEObject)domainConcept).eInverseRemove(this, CorePackage.DOMAIN_CONCEPT__DATA_BINDING, DomainConcept.class, msgs);
				return basicSetDomainConcept((DomainConcept)otherEnd, msgs);
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
			case CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION:
				return ((InternalEList)getConditionalExpression()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTE:
				return ((InternalEList)getVisualizationAttribute()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_BINDING__DATA_CONTEXT_VARIABLES:
				return ((InternalEList)getDataContextVariables()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_BINDING__DOMAIN_CONCEPT:
				return basicSetDomainConcept(null, msgs);
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
			case CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION:
				return getConditionalExpression();
			case CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTE:
				return getVisualizationAttribute();
			case CorePackage.DATA_BINDING__DATA_CONTEXT_VARIABLES:
				return getDataContextVariables();
			case CorePackage.DATA_BINDING__DOMAIN_CONCEPT:
				if (resolve) return getDomainConcept();
				return basicGetDomainConcept();
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
			case CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION:
				getConditionalExpression().clear();
				getConditionalExpression().addAll((Collection)newValue);
				return;
			case CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTE:
				getVisualizationAttribute().clear();
				getVisualizationAttribute().addAll((Collection)newValue);
				return;
			case CorePackage.DATA_BINDING__DATA_CONTEXT_VARIABLES:
				getDataContextVariables().clear();
				getDataContextVariables().addAll((Collection)newValue);
				return;
			case CorePackage.DATA_BINDING__DOMAIN_CONCEPT:
				setDomainConcept((DomainConcept)newValue);
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
			case CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION:
				getConditionalExpression().clear();
				return;
			case CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTE:
				getVisualizationAttribute().clear();
				return;
			case CorePackage.DATA_BINDING__DATA_CONTEXT_VARIABLES:
				getDataContextVariables().clear();
				return;
			case CorePackage.DATA_BINDING__DOMAIN_CONCEPT:
				setDomainConcept((DomainConcept)null);
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
			case CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION:
				return conditionalExpression != null && !conditionalExpression.isEmpty();
			case CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTE:
				return visualizationAttribute != null && !visualizationAttribute.isEmpty();
			case CorePackage.DATA_BINDING__DATA_CONTEXT_VARIABLES:
				return dataContextVariables != null && !dataContextVariables.isEmpty();
			case CorePackage.DATA_BINDING__DOMAIN_CONCEPT:
				return domainConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //DataBindingImpl
