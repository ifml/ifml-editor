/**
 */
package IFML.DataTypes.impl;

import IFML.Core.CorePackage;

import IFML.Core.impl.CorePackageImpl;

import IFML.DataTypes.ContextVariableScope;
import IFML.DataTypes.DataTypesFactory;
import IFML.DataTypes.DataTypesPackage;
import IFML.DataTypes.Direction;
import IFML.DataTypes.SystemEventType;

import IFML.Extensions.ExtensionsPackage;

import IFML.Extensions.impl.ExtensionsPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesPackageImpl extends EPackageImpl implements DataTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextVariableScopeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see IFML.DataTypes.DataTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataTypesPackageImpl() {
		super(eNS_URI, DataTypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DataTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataTypesPackage init() {
		if (isInited) return (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);

		// Obtain or create and register package
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataTypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) : ExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theDataTypesPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theDataTypesPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataTypesPackage.eNS_URI, theDataTypesPackage);
		return theDataTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemEventType() {
		return systemEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextVariableScope() {
		return contextVariableScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesFactory getDataTypesFactory() {
		return (DataTypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
		systemEventTypeEEnum = createEEnum(SYSTEM_EVENT_TYPE);
		contextVariableScopeEEnum = createEEnum(CONTEXT_VARIABLE_SCOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.IN);
		addEEnumLiteral(directionEEnum, Direction.OUT);
		addEEnumLiteral(directionEEnum, Direction.INOUT);

		initEEnum(systemEventTypeEEnum, SystemEventType.class, "SystemEventType");
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.TIME);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.SPECIAL_CONDITION);
		addEEnumLiteral(systemEventTypeEEnum, SystemEventType.ACTION_COMPLETION);

		initEEnum(contextVariableScopeEEnum, ContextVariableScope.class, "ContextVariableScope");
		addEEnumLiteral(contextVariableScopeEEnum, ContextVariableScope.APPLICATION_SCOPE);
		addEEnumLiteral(contextVariableScopeEEnum, ContextVariableScope.SESSION_SCOPE);
		addEEnumLiteral(contextVariableScopeEEnum, ContextVariableScope.VIEW_CONTAINER_SCOPE);

		// Create resource
		createResource(eNS_URI);
	}

} //DataTypesPackageImpl
