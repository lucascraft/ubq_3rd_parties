/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdxtopology.impl;

import net.sf.smbt.ezafdx.EzafdxPackage;

import net.sf.smbt.ezafdx.impl.EzafdxPackageImpl;

import net.sf.smbt.ezafdxtopology.AFDXTopology;
import net.sf.smbt.ezafdxtopology.EzafdxtopologyFactory;
import net.sf.smbt.ezafdxtopology.EzafdxtopologyPackage;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzafdxtopologyPackageImpl extends EPackageImpl implements EzafdxtopologyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afdxTopologyEClass = null;

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
	 * @see net.sf.smbt.ezafdxtopology.EzafdxtopologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzafdxtopologyPackageImpl() {
		super(eNS_URI, EzafdxtopologyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzafdxtopologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzafdxtopologyPackage init() {
		if (isInited) return (EzafdxtopologyPackage)EPackage.Registry.INSTANCE.getEPackage(EzafdxtopologyPackage.eNS_URI);

		// Obtain or create and register package
		EzafdxtopologyPackageImpl theEzafdxtopologyPackage = (EzafdxtopologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzafdxtopologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzafdxtopologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EzafdxPackageImpl theEzafdxPackage = (EzafdxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EzafdxPackage.eNS_URI) instanceof EzafdxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EzafdxPackage.eNS_URI) : EzafdxPackage.eINSTANCE);

		// Create package meta-data objects
		theEzafdxtopologyPackage.createPackageContents();
		theEzafdxPackage.createPackageContents();

		// Initialize created meta-data
		theEzafdxtopologyPackage.initializePackageContents();
		theEzafdxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzafdxtopologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzafdxtopologyPackage.eNS_URI, theEzafdxtopologyPackage);
		return theEzafdxtopologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFDXTopology() {
		return afdxTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFDXTopology_VirtualLinks() {
		return (EReference)afdxTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzafdxtopologyFactory getEzafdxtopologyFactory() {
		return (EzafdxtopologyFactory)getEFactoryInstance();
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

		// Create classes and their features
		afdxTopologyEClass = createEClass(AFDX_TOPOLOGY);
		createEReference(afdxTopologyEClass, AFDX_TOPOLOGY__VIRTUAL_LINKS);
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

		// Obtain other dependent packages
		EzafdxPackage theEzafdxPackage = (EzafdxPackage)EPackage.Registry.INSTANCE.getEPackage(EzafdxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(afdxTopologyEClass, AFDXTopology.class, "AFDXTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAFDXTopology_VirtualLinks(), theEzafdxPackage.getAFDXVirtualLink(), null, "virtualLinks", null, 0, -1, AFDXTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EzafdxtopologyPackageImpl
