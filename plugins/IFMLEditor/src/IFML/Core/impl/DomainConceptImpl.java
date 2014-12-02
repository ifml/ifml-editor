/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.DataBinding;
import IFML.Core.DomainConcept;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.DomainConceptImpl#getDataBinding <em>Data Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainConceptImpl extends DomainElementImpl implements DomainConcept {
	/**
	 * The cached value of the '{@link #getDataBinding() <em>Data Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBinding()
	 * @generated
	 * @ordered
	 */
	protected DataBinding dataBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DOMAIN_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBinding getDataBinding() {
		if (dataBinding != null && dataBinding.eIsProxy()) {
			InternalEObject oldDataBinding = (InternalEObject)dataBinding;
			dataBinding = (DataBinding)eResolveProxy(oldDataBinding);
			if (dataBinding != oldDataBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DOMAIN_CONCEPT__DATA_BINDING, oldDataBinding, dataBinding));
			}
		}
		return dataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBinding basicGetDataBinding() {
		return dataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataBinding(DataBinding newDataBinding, NotificationChain msgs) {
		DataBinding oldDataBinding = dataBinding;
		dataBinding = newDataBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_CONCEPT__DATA_BINDING, oldDataBinding, newDataBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBinding(DataBinding newDataBinding) {
		if (newDataBinding != dataBinding) {
			NotificationChain msgs = null;
			if (dataBinding != null)
				msgs = ((InternalEObject)dataBinding).eInverseRemove(this, CorePackage.DATA_BINDING__DOMAIN_CONCEPT, DataBinding.class, msgs);
			if (newDataBinding != null)
				msgs = ((InternalEObject)newDataBinding).eInverseAdd(this, CorePackage.DATA_BINDING__DOMAIN_CONCEPT, DataBinding.class, msgs);
			msgs = basicSetDataBinding(newDataBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DOMAIN_CONCEPT__DATA_BINDING, newDataBinding, newDataBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DOMAIN_CONCEPT__DATA_BINDING:
				if (dataBinding != null)
					msgs = ((InternalEObject)dataBinding).eInverseRemove(this, CorePackage.DATA_BINDING__DOMAIN_CONCEPT, DataBinding.class, msgs);
				return basicSetDataBinding((DataBinding)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DOMAIN_CONCEPT__DATA_BINDING:
				return basicSetDataBinding(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DOMAIN_CONCEPT__DATA_BINDING:
				if (resolve) return getDataBinding();
				return basicGetDataBinding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.DOMAIN_CONCEPT__DATA_BINDING:
				setDataBinding((DataBinding)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.DOMAIN_CONCEPT__DATA_BINDING:
				setDataBinding((DataBinding)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.DOMAIN_CONCEPT__DATA_BINDING:
				return dataBinding != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainConceptImpl
