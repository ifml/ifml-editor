/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.IFMLModule;
import IFML.Core.IFMLPort;
import IFML.Core.PortDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFML Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.IFMLPortImpl#getPortDefinition <em>Port Definition</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLPortImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFMLPortImpl extends InteractionFlowElementImpl implements IFMLPort {
	/**
	 * The cached value of the '{@link #getPortDefinition() <em>Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortDefinition()
	 * @generated
	 * @ordered
	 */
	protected PortDefinition portDefinition;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected IFMLModule module;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.IFML_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition getPortDefinition() {
		if (portDefinition != null && portDefinition.eIsProxy()) {
			InternalEObject oldPortDefinition = (InternalEObject)portDefinition;
			portDefinition = (PortDefinition)eResolveProxy(oldPortDefinition);
			if (portDefinition != oldPortDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IFML_PORT__PORT_DEFINITION, oldPortDefinition, portDefinition));
			}
		}
		return portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition basicGetPortDefinition() {
		return portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortDefinition(PortDefinition newPortDefinition, NotificationChain msgs) {
		PortDefinition oldPortDefinition = portDefinition;
		portDefinition = newPortDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PORT__PORT_DEFINITION, oldPortDefinition, newPortDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortDefinition(PortDefinition newPortDefinition) {
		if (newPortDefinition != portDefinition) {
			NotificationChain msgs = null;
			if (portDefinition != null)
				msgs = ((InternalEObject)portDefinition).eInverseRemove(this, CorePackage.PORT_DEFINITION__PORTS, PortDefinition.class, msgs);
			if (newPortDefinition != null)
				msgs = ((InternalEObject)newPortDefinition).eInverseAdd(this, CorePackage.PORT_DEFINITION__PORTS, PortDefinition.class, msgs);
			msgs = basicSetPortDefinition(newPortDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PORT__PORT_DEFINITION, newPortDefinition, newPortDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLModule getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = (IFMLModule)eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IFML_PORT__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLModule basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(IFMLModule newModule, NotificationChain msgs) {
		IFMLModule oldModule = module;
		module = newModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PORT__MODULE, oldModule, newModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(IFMLModule newModule) {
		if (newModule != module) {
			NotificationChain msgs = null;
			if (module != null)
				msgs = ((InternalEObject)module).eInverseRemove(this, CorePackage.IFML_MODULE__PORTS, IFMLModule.class, msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, CorePackage.IFML_MODULE__PORTS, IFMLModule.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PORT__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IFML_PORT__PORT_DEFINITION:
				if (portDefinition != null)
					msgs = ((InternalEObject)portDefinition).eInverseRemove(this, CorePackage.PORT_DEFINITION__PORTS, PortDefinition.class, msgs);
				return basicSetPortDefinition((PortDefinition)otherEnd, msgs);
			case CorePackage.IFML_PORT__MODULE:
				if (module != null)
					msgs = ((InternalEObject)module).eInverseRemove(this, CorePackage.IFML_MODULE__PORTS, IFMLModule.class, msgs);
				return basicSetModule((IFMLModule)otherEnd, msgs);
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
			case CorePackage.IFML_PORT__PORT_DEFINITION:
				return basicSetPortDefinition(null, msgs);
			case CorePackage.IFML_PORT__MODULE:
				return basicSetModule(null, msgs);
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
			case CorePackage.IFML_PORT__PORT_DEFINITION:
				if (resolve) return getPortDefinition();
				return basicGetPortDefinition();
			case CorePackage.IFML_PORT__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
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
			case CorePackage.IFML_PORT__PORT_DEFINITION:
				setPortDefinition((PortDefinition)newValue);
				return;
			case CorePackage.IFML_PORT__MODULE:
				setModule((IFMLModule)newValue);
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
			case CorePackage.IFML_PORT__PORT_DEFINITION:
				setPortDefinition((PortDefinition)null);
				return;
			case CorePackage.IFML_PORT__MODULE:
				setModule((IFMLModule)null);
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
			case CorePackage.IFML_PORT__PORT_DEFINITION:
				return portDefinition != null;
			case CorePackage.IFML_PORT__MODULE:
				return module != null;
		}
		return super.eIsSet(featureID);
	}

} //IFMLPortImpl
