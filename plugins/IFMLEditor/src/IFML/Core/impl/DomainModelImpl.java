/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.DomainElement;
import IFML.Core.DomainModel;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.DomainModelImpl#getDomainElements <em>Domain Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainModelImpl extends NamedElementImpl implements DomainModel {
	/**
	 * The cached value of the '{@link #getDomainElements() <em>Domain Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainElement> domainElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DOMAIN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainElement> getDomainElements() {
		if (domainElements == null) {
			domainElements = new EObjectContainmentEList<DomainElement>(DomainElement.class, this, CorePackage.DOMAIN_MODEL__DOMAIN_ELEMENTS);
		}
		return domainElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DOMAIN_MODEL__DOMAIN_ELEMENTS:
				return ((InternalEList<?>)getDomainElements()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DOMAIN_MODEL__DOMAIN_ELEMENTS:
				return getDomainElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.DOMAIN_MODEL__DOMAIN_ELEMENTS:
				getDomainElements().clear();
				getDomainElements().addAll((Collection<? extends DomainElement>)newValue);
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
			case CorePackage.DOMAIN_MODEL__DOMAIN_ELEMENTS:
				getDomainElements().clear();
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
			case CorePackage.DOMAIN_MODEL__DOMAIN_ELEMENTS:
				return domainElements != null && !domainElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainModelImpl
