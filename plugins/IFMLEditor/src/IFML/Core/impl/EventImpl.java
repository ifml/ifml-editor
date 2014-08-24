/**
 */
package IFML.Core.impl;

import IFML.Core.ActivationExpression;
import IFML.Core.CorePackage;
import IFML.Core.Event;
import IFML.Core.InteractionFlowExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.EventImpl#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link IFML.Core.impl.EventImpl#getInteractionFlowExpression <em>Interaction Flow Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends InteractionFlowElementImpl implements Event {
	/**
	 * The cached value of the '{@link #getActivationExpression() <em>Activation Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationExpression()
	 * @generated
	 * @ordered
	 */
	protected ActivationExpression activationExpression;

	/**
	 * The cached value of the '{@link #getInteractionFlowExpression() <em>Interaction Flow Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlowExpression()
	 * @generated
	 * @ordered
	 */
	protected InteractionFlowExpression interactionFlowExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationExpression getActivationExpression() {
		if (activationExpression != null && activationExpression.eIsProxy()) {
			InternalEObject oldActivationExpression = (InternalEObject)activationExpression;
			activationExpression = (ActivationExpression)eResolveProxy(oldActivationExpression);
			if (activationExpression != oldActivationExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EVENT__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
			}
		}
		return activationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationExpression basicGetActivationExpression() {
		return activationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationExpression(ActivationExpression newActivationExpression) {
		ActivationExpression oldActivationExpression = activationExpression;
		activationExpression = newActivationExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EVENT__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFlowExpression getInteractionFlowExpression() {
		return interactionFlowExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionFlowExpression(InteractionFlowExpression newInteractionFlowExpression, NotificationChain msgs) {
		InteractionFlowExpression oldInteractionFlowExpression = interactionFlowExpression;
		interactionFlowExpression = newInteractionFlowExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION, oldInteractionFlowExpression, newInteractionFlowExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionFlowExpression(InteractionFlowExpression newInteractionFlowExpression) {
		if (newInteractionFlowExpression != interactionFlowExpression) {
			NotificationChain msgs = null;
			if (interactionFlowExpression != null)
				msgs = ((InternalEObject)interactionFlowExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION, null, msgs);
			if (newInteractionFlowExpression != null)
				msgs = ((InternalEObject)newInteractionFlowExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION, null, msgs);
			msgs = basicSetInteractionFlowExpression(newInteractionFlowExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION, newInteractionFlowExpression, newInteractionFlowExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION:
				return basicSetInteractionFlowExpression(null, msgs);
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
			case CorePackage.EVENT__ACTIVATION_EXPRESSION:
				if (resolve) return getActivationExpression();
				return basicGetActivationExpression();
			case CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION:
				return getInteractionFlowExpression();
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
			case CorePackage.EVENT__ACTIVATION_EXPRESSION:
				setActivationExpression((ActivationExpression)newValue);
				return;
			case CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION:
				setInteractionFlowExpression((InteractionFlowExpression)newValue);
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
			case CorePackage.EVENT__ACTIVATION_EXPRESSION:
				setActivationExpression((ActivationExpression)null);
				return;
			case CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION:
				setInteractionFlowExpression((InteractionFlowExpression)null);
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
			case CorePackage.EVENT__ACTIVATION_EXPRESSION:
				return activationExpression != null;
			case CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION:
				return interactionFlowExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EventImpl
