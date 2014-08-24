/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.DomainModel;
import IFML.Core.IFMLModel;
import IFML.Core.InteractionFlowModel;
import IFML.Core.Viewpoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFML Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.IFMLModelImpl#getInteractionFlowModel <em>Interaction Flow Model</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLModelImpl#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLModelImpl#getInteractionFlowModelViewpoint <em>Interaction Flow Model Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFMLModelImpl extends NamedElementImpl implements IFMLModel {
	/**
	 * The cached value of the '{@link #getInteractionFlowModel() <em>Interaction Flow Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlowModel()
	 * @generated
	 * @ordered
	 */
	protected InteractionFlowModel interactionFlowModel;

	/**
	 * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected DomainModel domainModel;

	/**
	 * The cached value of the '{@link #getInteractionFlowModelViewpoint() <em>Interaction Flow Model Viewpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlowModelViewpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> interactionFlowModelViewpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IFML_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFlowModel getInteractionFlowModel() {
		return interactionFlowModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionFlowModel(InteractionFlowModel newInteractionFlowModel, NotificationChain msgs) {
		InteractionFlowModel oldInteractionFlowModel = interactionFlowModel;
		interactionFlowModel = newInteractionFlowModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL, oldInteractionFlowModel, newInteractionFlowModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionFlowModel(InteractionFlowModel newInteractionFlowModel) {
		if (newInteractionFlowModel != interactionFlowModel) {
			NotificationChain msgs = null;
			if (interactionFlowModel != null)
				msgs = ((InternalEObject)interactionFlowModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL, null, msgs);
			if (newInteractionFlowModel != null)
				msgs = ((InternalEObject)newInteractionFlowModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL, null, msgs);
			msgs = basicSetInteractionFlowModel(newInteractionFlowModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL, newInteractionFlowModel, newInteractionFlowModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel getDomainModel() {
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainModel(DomainModel newDomainModel, NotificationChain msgs) {
		DomainModel oldDomainModel = domainModel;
		domainModel = newDomainModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODEL__DOMAIN_MODEL, oldDomainModel, newDomainModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModel(DomainModel newDomainModel) {
		if (newDomainModel != domainModel) {
			NotificationChain msgs = null;
			if (domainModel != null)
				msgs = ((InternalEObject)domainModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_MODEL__DOMAIN_MODEL, null, msgs);
			if (newDomainModel != null)
				msgs = ((InternalEObject)newDomainModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_MODEL__DOMAIN_MODEL, null, msgs);
			msgs = basicSetDomainModel(newDomainModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODEL__DOMAIN_MODEL, newDomainModel, newDomainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Viewpoint> getInteractionFlowModelViewpoint() {
		if (interactionFlowModelViewpoint == null) {
			interactionFlowModelViewpoint = new EObjectContainmentEList<Viewpoint>(Viewpoint.class, this, CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT);
		}
		return interactionFlowModelViewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
				return basicSetInteractionFlowModel(null, msgs);
			case CorePackage.IFML_MODEL__DOMAIN_MODEL:
				return basicSetDomainModel(null, msgs);
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT:
				return ((InternalEList<?>)getInteractionFlowModelViewpoint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
				return getInteractionFlowModel();
			case CorePackage.IFML_MODEL__DOMAIN_MODEL:
				return getDomainModel();
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT:
				return getInteractionFlowModelViewpoint();
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
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
				setInteractionFlowModel((InteractionFlowModel)newValue);
				return;
			case CorePackage.IFML_MODEL__DOMAIN_MODEL:
				setDomainModel((DomainModel)newValue);
				return;
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT:
				getInteractionFlowModelViewpoint().clear();
				getInteractionFlowModelViewpoint().addAll((Collection<? extends Viewpoint>)newValue);
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
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
				setInteractionFlowModel((InteractionFlowModel)null);
				return;
			case CorePackage.IFML_MODEL__DOMAIN_MODEL:
				setDomainModel((DomainModel)null);
				return;
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT:
				getInteractionFlowModelViewpoint().clear();
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
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
				return interactionFlowModel != null;
			case CorePackage.IFML_MODEL__DOMAIN_MODEL:
				return domainModel != null;
			case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT:
				return interactionFlowModelViewpoint != null && !interactionFlowModelViewpoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IFMLModelImpl
