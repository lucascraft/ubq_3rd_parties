/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.impl;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Factory;
import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivinColorsClearLampsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCheckAddressCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsInitCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsLearnLampsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnOffLampCmd;
import net.sf.xqz.model.cmd.CmdPackage;

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
public class Ezlivingcolors1PackageImpl extends EPackageImpl implements Ezlivingcolors1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsSetRGBCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsSetHSVCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsInitCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsGetMaxNumLampsCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsAddLampCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsGetLampCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsLearnLampsCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livinColorsClearLampsCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsTurnLampOnRGBCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsTurnLampOnHSVCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsTurnOffLampCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsSetAddressCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liivngColorsSendCommandCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingColorsCheckAddressCmdEClass = null;
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
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ezlivingcolors1PackageImpl() {
		super(eNS_URI, Ezlivingcolors1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Ezlivingcolors1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ezlivingcolors1Package init() {
		if (isInited) return (Ezlivingcolors1Package)EPackage.Registry.INSTANCE.getEPackage(Ezlivingcolors1Package.eNS_URI);

		// Obtain or create and register package
		Ezlivingcolors1PackageImpl theEzlivingcolors1Package = (Ezlivingcolors1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ezlivingcolors1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ezlivingcolors1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzlivingcolors1Package.createPackageContents();

		// Initialize created meta-data
		theEzlivingcolors1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzlivingcolors1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ezlivingcolors1Package.eNS_URI, theEzlivingcolors1Package);
		return theEzlivingcolors1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsSetRGBCmd() {
		return livingColorsSetRGBCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetRGBCmd_Addr() {
		return (EAttribute)livingColorsSetRGBCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetRGBCmd_R() {
		return (EAttribute)livingColorsSetRGBCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetRGBCmd_G() {
		return (EAttribute)livingColorsSetRGBCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetRGBCmd_B() {
		return (EAttribute)livingColorsSetRGBCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetRGBCmd_Index() {
		return (EAttribute)livingColorsSetRGBCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsSetHSVCmd() {
		return livingColorsSetHSVCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetHSVCmd_Addr() {
		return (EAttribute)livingColorsSetHSVCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetHSVCmd_H() {
		return (EAttribute)livingColorsSetHSVCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetHSVCmd_S() {
		return (EAttribute)livingColorsSetHSVCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetHSVCmd_V() {
		return (EAttribute)livingColorsSetHSVCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetHSVCmd_Index() {
		return (EAttribute)livingColorsSetHSVCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsInitCmd() {
		return livingColorsInitCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsGetMaxNumLampsCmd() {
		return livingColorsGetMaxNumLampsCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsGetMaxNumLampsCmd_Result() {
		return (EAttribute)livingColorsGetMaxNumLampsCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsAddLampCmd() {
		return livingColorsAddLampCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsAddLampCmd_Addr() {
		return (EAttribute)livingColorsAddLampCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsGetLampCmd() {
		return livingColorsGetLampCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsGetLampCmd_Result() {
		return (EAttribute)livingColorsGetLampCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsGetLampCmd_Index() {
		return (EAttribute)livingColorsGetLampCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsLearnLampsCmd() {
		return livingColorsLearnLampsCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivinColorsClearLampsCmd() {
		return livinColorsClearLampsCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsTurnLampOnRGBCmd() {
		return livingColorsTurnLampOnRGBCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsTurnLampOnRGBCmd_Index() {
		return (EAttribute)livingColorsTurnLampOnRGBCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsTurnLampOnRGBCmd_R() {
		return (EAttribute)livingColorsTurnLampOnRGBCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsTurnLampOnRGBCmd_G() {
		return (EAttribute)livingColorsTurnLampOnRGBCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsTurnLampOnRGBCmd_B() {
		return (EAttribute)livingColorsTurnLampOnRGBCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsTurnLampOnHSVCmd() {
		return livingColorsTurnLampOnHSVCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsTurnLampOnHSVCmd_Index() {
		return (EAttribute)livingColorsTurnLampOnHSVCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsTurnLampOnHSVCmd_H() {
		return (EAttribute)livingColorsTurnLampOnHSVCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsTurnLampOnHSVCmd_S() {
		return (EAttribute)livingColorsTurnLampOnHSVCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsTurnLampOnHSVCmd_V() {
		return (EAttribute)livingColorsTurnLampOnHSVCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsTurnOffLampCmd() {
		return livingColorsTurnOffLampCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsTurnOffLampCmd_Index() {
		return (EAttribute)livingColorsTurnOffLampCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsSetAddressCmd() {
		return livingColorsSetAddressCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsSetAddressCmd_Addr() {
		return (EAttribute)livingColorsSetAddressCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiivngColorsSendCommandCmd() {
		return liivngColorsSendCommandCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiivngColorsSendCommandCmd_Cmd() {
		return (EAttribute)liivngColorsSendCommandCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiivngColorsSendCommandCmd_Addr() {
		return (EAttribute)liivngColorsSendCommandCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiivngColorsSendCommandCmd_H() {
		return (EAttribute)liivngColorsSendCommandCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiivngColorsSendCommandCmd_S() {
		return (EAttribute)liivngColorsSendCommandCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiivngColorsSendCommandCmd_V() {
		return (EAttribute)liivngColorsSendCommandCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsCmd() {
		return livingColorsCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsCmd_Hex() {
		return (EAttribute)livingColorsCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingColorsCheckAddressCmd() {
		return livingColorsCheckAddressCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingColorsCheckAddressCmd_Addr() {
		return (EAttribute)livingColorsCheckAddressCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ezlivingcolors1Factory getEzlivingcolors1Factory() {
		return (Ezlivingcolors1Factory)getEFactoryInstance();
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
		livingColorsSetRGBCmdEClass = createEClass(LIVING_COLORS_SET_RGB_CMD);
		createEAttribute(livingColorsSetRGBCmdEClass, LIVING_COLORS_SET_RGB_CMD__ADDR);
		createEAttribute(livingColorsSetRGBCmdEClass, LIVING_COLORS_SET_RGB_CMD__R);
		createEAttribute(livingColorsSetRGBCmdEClass, LIVING_COLORS_SET_RGB_CMD__G);
		createEAttribute(livingColorsSetRGBCmdEClass, LIVING_COLORS_SET_RGB_CMD__B);
		createEAttribute(livingColorsSetRGBCmdEClass, LIVING_COLORS_SET_RGB_CMD__INDEX);

		livingColorsSetHSVCmdEClass = createEClass(LIVING_COLORS_SET_HSV_CMD);
		createEAttribute(livingColorsSetHSVCmdEClass, LIVING_COLORS_SET_HSV_CMD__ADDR);
		createEAttribute(livingColorsSetHSVCmdEClass, LIVING_COLORS_SET_HSV_CMD__H);
		createEAttribute(livingColorsSetHSVCmdEClass, LIVING_COLORS_SET_HSV_CMD__S);
		createEAttribute(livingColorsSetHSVCmdEClass, LIVING_COLORS_SET_HSV_CMD__V);
		createEAttribute(livingColorsSetHSVCmdEClass, LIVING_COLORS_SET_HSV_CMD__INDEX);

		livingColorsInitCmdEClass = createEClass(LIVING_COLORS_INIT_CMD);

		livingColorsGetMaxNumLampsCmdEClass = createEClass(LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD);
		createEAttribute(livingColorsGetMaxNumLampsCmdEClass, LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD__RESULT);

		livingColorsAddLampCmdEClass = createEClass(LIVING_COLORS_ADD_LAMP_CMD);
		createEAttribute(livingColorsAddLampCmdEClass, LIVING_COLORS_ADD_LAMP_CMD__ADDR);

		livingColorsLearnLampsCmdEClass = createEClass(LIVING_COLORS_LEARN_LAMPS_CMD);

		livinColorsClearLampsCmdEClass = createEClass(LIVIN_COLORS_CLEAR_LAMPS_CMD);

		livingColorsTurnLampOnRGBCmdEClass = createEClass(LIVING_COLORS_TURN_LAMP_ON_RGB_CMD);
		createEAttribute(livingColorsTurnLampOnRGBCmdEClass, LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__INDEX);
		createEAttribute(livingColorsTurnLampOnRGBCmdEClass, LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__R);
		createEAttribute(livingColorsTurnLampOnRGBCmdEClass, LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__G);
		createEAttribute(livingColorsTurnLampOnRGBCmdEClass, LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__B);

		livingColorsTurnLampOnHSVCmdEClass = createEClass(LIVING_COLORS_TURN_LAMP_ON_HSV_CMD);
		createEAttribute(livingColorsTurnLampOnHSVCmdEClass, LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__INDEX);
		createEAttribute(livingColorsTurnLampOnHSVCmdEClass, LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__H);
		createEAttribute(livingColorsTurnLampOnHSVCmdEClass, LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__S);
		createEAttribute(livingColorsTurnLampOnHSVCmdEClass, LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__V);

		livingColorsTurnOffLampCmdEClass = createEClass(LIVING_COLORS_TURN_OFF_LAMP_CMD);
		createEAttribute(livingColorsTurnOffLampCmdEClass, LIVING_COLORS_TURN_OFF_LAMP_CMD__INDEX);

		livingColorsSetAddressCmdEClass = createEClass(LIVING_COLORS_SET_ADDRESS_CMD);
		createEAttribute(livingColorsSetAddressCmdEClass, LIVING_COLORS_SET_ADDRESS_CMD__ADDR);

		liivngColorsSendCommandCmdEClass = createEClass(LIIVNG_COLORS_SEND_COMMAND_CMD);
		createEAttribute(liivngColorsSendCommandCmdEClass, LIIVNG_COLORS_SEND_COMMAND_CMD__CMD);
		createEAttribute(liivngColorsSendCommandCmdEClass, LIIVNG_COLORS_SEND_COMMAND_CMD__ADDR);
		createEAttribute(liivngColorsSendCommandCmdEClass, LIIVNG_COLORS_SEND_COMMAND_CMD__H);
		createEAttribute(liivngColorsSendCommandCmdEClass, LIIVNG_COLORS_SEND_COMMAND_CMD__S);
		createEAttribute(liivngColorsSendCommandCmdEClass, LIIVNG_COLORS_SEND_COMMAND_CMD__V);

		livingColorsCmdEClass = createEClass(LIVING_COLORS_CMD);
		createEAttribute(livingColorsCmdEClass, LIVING_COLORS_CMD__HEX);

		livingColorsCheckAddressCmdEClass = createEClass(LIVING_COLORS_CHECK_ADDRESS_CMD);
		createEAttribute(livingColorsCheckAddressCmdEClass, LIVING_COLORS_CHECK_ADDRESS_CMD__ADDR);

		livingColorsGetLampCmdEClass = createEClass(LIVING_COLORS_GET_LAMP_CMD);
		createEAttribute(livingColorsGetLampCmdEClass, LIVING_COLORS_GET_LAMP_CMD__RESULT);
		createEAttribute(livingColorsGetLampCmdEClass, LIVING_COLORS_GET_LAMP_CMD__INDEX);
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
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		livingColorsSetRGBCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsSetHSVCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsInitCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsGetMaxNumLampsCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsAddLampCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsLearnLampsCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livinColorsClearLampsCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsTurnLampOnRGBCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsTurnLampOnHSVCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsTurnOffLampCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsSetAddressCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		liivngColorsSendCommandCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		livingColorsCheckAddressCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());
		livingColorsGetLampCmdEClass.getESuperTypes().add(this.getLivingColorsCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(livingColorsSetRGBCmdEClass, LivingColorsSetRGBCmd.class, "LivingColorsSetRGBCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsSetRGBCmd_Addr(), ecorePackage.getEByte(), "addr", null, 0, 1, LivingColorsSetRGBCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsSetRGBCmd_R(), ecorePackage.getEInt(), "r", null, 0, 1, LivingColorsSetRGBCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsSetRGBCmd_G(), ecorePackage.getEInt(), "g", null, 0, 1, LivingColorsSetRGBCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsSetRGBCmd_B(), ecorePackage.getEInt(), "b", null, 0, 1, LivingColorsSetRGBCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsSetRGBCmd_Index(), ecorePackage.getEInt(), "index", null, 0, 1, LivingColorsSetRGBCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsSetHSVCmdEClass, LivingColorsSetHSVCmd.class, "LivingColorsSetHSVCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsSetHSVCmd_Addr(), ecorePackage.getEByte(), "addr", null, 0, 1, LivingColorsSetHSVCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsSetHSVCmd_H(), ecorePackage.getEInt(), "h", null, 0, 1, LivingColorsSetHSVCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsSetHSVCmd_S(), ecorePackage.getEInt(), "s", null, 0, 1, LivingColorsSetHSVCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsSetHSVCmd_V(), ecorePackage.getEInt(), "v", null, 0, 1, LivingColorsSetHSVCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsSetHSVCmd_Index(), ecorePackage.getEInt(), "index", null, 0, 1, LivingColorsSetHSVCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsInitCmdEClass, LivingColorsInitCmd.class, "LivingColorsInitCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livingColorsGetMaxNumLampsCmdEClass, LivingColorsGetMaxNumLampsCmd.class, "LivingColorsGetMaxNumLampsCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsGetMaxNumLampsCmd_Result(), ecorePackage.getEInt(), "result", null, 0, 1, LivingColorsGetMaxNumLampsCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsAddLampCmdEClass, LivingColorsAddLampCmd.class, "LivingColorsAddLampCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsAddLampCmd_Addr(), ecorePackage.getEByteArray(), "addr", null, 0, 1, LivingColorsAddLampCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsLearnLampsCmdEClass, LivingColorsLearnLampsCmd.class, "LivingColorsLearnLampsCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livinColorsClearLampsCmdEClass, LivinColorsClearLampsCmd.class, "LivinColorsClearLampsCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livingColorsTurnLampOnRGBCmdEClass, LivingColorsTurnLampOnRGBCmd.class, "LivingColorsTurnLampOnRGBCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsTurnLampOnRGBCmd_Index(), ecorePackage.getEInt(), "index", null, 0, 1, LivingColorsTurnLampOnRGBCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsTurnLampOnRGBCmd_R(), ecorePackage.getEInt(), "r", null, 0, 1, LivingColorsTurnLampOnRGBCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsTurnLampOnRGBCmd_G(), ecorePackage.getEInt(), "g", null, 0, 1, LivingColorsTurnLampOnRGBCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsTurnLampOnRGBCmd_B(), ecorePackage.getEInt(), "b", null, 0, 1, LivingColorsTurnLampOnRGBCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsTurnLampOnHSVCmdEClass, LivingColorsTurnLampOnHSVCmd.class, "LivingColorsTurnLampOnHSVCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsTurnLampOnHSVCmd_Index(), ecorePackage.getEInt(), "index", null, 0, 1, LivingColorsTurnLampOnHSVCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsTurnLampOnHSVCmd_H(), ecorePackage.getEInt(), "h", null, 0, 1, LivingColorsTurnLampOnHSVCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsTurnLampOnHSVCmd_S(), ecorePackage.getEInt(), "s", null, 0, 1, LivingColorsTurnLampOnHSVCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsTurnLampOnHSVCmd_V(), ecorePackage.getEInt(), "v", null, 0, 1, LivingColorsTurnLampOnHSVCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsTurnOffLampCmdEClass, LivingColorsTurnOffLampCmd.class, "LivingColorsTurnOffLampCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsTurnOffLampCmd_Index(), ecorePackage.getEInt(), "index", null, 0, 1, LivingColorsTurnOffLampCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsSetAddressCmdEClass, LivingColorsSetAddressCmd.class, "LivingColorsSetAddressCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsSetAddressCmd_Addr(), ecorePackage.getEByteArray(), "addr", null, 0, 1, LivingColorsSetAddressCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liivngColorsSendCommandCmdEClass, LiivngColorsSendCommandCmd.class, "LiivngColorsSendCommandCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiivngColorsSendCommandCmd_Cmd(), ecorePackage.getEInt(), "cmd", null, 0, 1, LiivngColorsSendCommandCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiivngColorsSendCommandCmd_Addr(), ecorePackage.getEByte(), "addr", null, 0, 1, LiivngColorsSendCommandCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiivngColorsSendCommandCmd_H(), ecorePackage.getEInt(), "h", null, 0, 1, LiivngColorsSendCommandCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiivngColorsSendCommandCmd_S(), ecorePackage.getEInt(), "s", null, 0, 1, LiivngColorsSendCommandCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiivngColorsSendCommandCmd_V(), ecorePackage.getEInt(), "v", null, 0, 1, LiivngColorsSendCommandCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsCmdEClass, LivingColorsCmd.class, "LivingColorsCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsCmd_Hex(), ecorePackage.getEByte(), "hex", null, 0, 1, LivingColorsCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsCheckAddressCmdEClass, LivingColorsCheckAddressCmd.class, "LivingColorsCheckAddressCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsCheckAddressCmd_Addr(), ecorePackage.getEByteArray(), "addr", null, 0, 1, LivingColorsCheckAddressCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livingColorsGetLampCmdEClass, LivingColorsGetLampCmd.class, "LivingColorsGetLampCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingColorsGetLampCmd_Result(), ecorePackage.getEByteArray(), "result", null, 0, 1, LivingColorsGetLampCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivingColorsGetLampCmd_Index(), ecorePackage.getEInt(), "index", null, 0, 1, LivingColorsGetLampCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Ezlivingcolors1PackageImpl
