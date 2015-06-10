/**
 * <copyright>
 * </copyright>
 *
 * $Id: ColorsPackageImpl.java,v 1.1 2008/12/28 12:22:56 lucascraft Exp $
 */
package net.sf.smbt.model.colors.impl;

import net.sf.smbt.model.colors.Color;
import net.sf.smbt.model.colors.ColorsFactory;
import net.sf.smbt.model.colors.ColorsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColorsPackageImpl extends EPackageImpl implements ColorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hsbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

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
	 * @see net.sf.smbt.model.colors.ColorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ColorsPackageImpl() {
		super(eNS_URI, ColorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ColorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ColorsPackage init() {
		if (isInited) return (ColorsPackage)EPackage.Registry.INSTANCE.getEPackage(ColorsPackage.eNS_URI);

		// Obtain or create and register package
		ColorsPackageImpl theColorsPackage = (ColorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ColorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ColorsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theColorsPackage.createPackageContents();

		// Initialize created meta-data
		theColorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theColorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ColorsPackage.eNS_URI, theColorsPackage);
		return theColorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSB() {
		return hsbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHSB_Hue() {
		return (EAttribute)hsbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHSB_Saturation() {
		return (EAttribute)hsbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHSB_Brightness() {
		return (EAttribute)hsbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGB() {
		return rgbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGB_Red() {
		return (EAttribute)rgbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGB_Green() {
		return (EAttribute)rgbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGB_Blue() {
		return (EAttribute)rgbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorsFactory getColorsFactory() {
		return (ColorsFactory)getEFactoryInstance();
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
		hsbEClass = createEClass(HSB);
		createEAttribute(hsbEClass, HSB__HUE);
		createEAttribute(hsbEClass, HSB__SATURATION);
		createEAttribute(hsbEClass, HSB__BRIGHTNESS);

		rgbEClass = createEClass(RGB);
		createEAttribute(rgbEClass, RGB__RED);
		createEAttribute(rgbEClass, RGB__GREEN);
		createEAttribute(rgbEClass, RGB__BLUE);

		colorEClass = createEClass(COLOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hsbEClass.getESuperTypes().add(this.getColor());
		rgbEClass.getESuperTypes().add(this.getColor());

		// Initialize classes and features; add operations and parameters
		initEClass(hsbEClass, net.sf.smbt.model.colors.HSB.class, "HSB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHSB_Hue(), ecorePackage.getEFloat(), "hue", null, 0, 1, net.sf.smbt.model.colors.HSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHSB_Saturation(), ecorePackage.getEFloat(), "saturation", null, 0, 1, net.sf.smbt.model.colors.HSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHSB_Brightness(), ecorePackage.getEFloat(), "brightness", null, 0, 1, net.sf.smbt.model.colors.HSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rgbEClass, net.sf.smbt.model.colors.RGB.class, "RGB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGB_Red(), ecorePackage.getEInt(), "red", null, 0, 1, net.sf.smbt.model.colors.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGB_Green(), ecorePackage.getEInt(), "green", null, 0, 1, net.sf.smbt.model.colors.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGB_Blue(), ecorePackage.getEInt(), "blue", null, 0, 1, net.sf.smbt.model.colors.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorEClass, Color.class, "Color", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ColorsPackageImpl
