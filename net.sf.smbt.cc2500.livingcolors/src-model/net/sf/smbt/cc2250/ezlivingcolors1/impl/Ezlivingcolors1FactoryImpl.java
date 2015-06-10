/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.impl;

import net.sf.smbt.cc2250.ezlivingcolors1.*;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ezlivingcolors1FactoryImpl extends EFactoryImpl implements Ezlivingcolors1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ezlivingcolors1Factory init() {
		try {
			Ezlivingcolors1Factory theEzlivingcolors1Factory = (Ezlivingcolors1Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/cc2250/ezlivingcolors1/1.0"); 
			if (theEzlivingcolors1Factory != null) {
				return theEzlivingcolors1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ezlivingcolors1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ezlivingcolors1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Ezlivingcolors1Package.LIVING_COLORS_SET_RGB_CMD: return createLivingColorsSetRGBCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_SET_HSV_CMD: return createLivingColorsSetHSVCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_INIT_CMD: return createLivingColorsInitCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD: return createLivingColorsGetMaxNumLampsCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_ADD_LAMP_CMD: return createLivingColorsAddLampCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_LEARN_LAMPS_CMD: return createLivingColorsLearnLampsCmd();
			case Ezlivingcolors1Package.LIVIN_COLORS_CLEAR_LAMPS_CMD: return createLivinColorsClearLampsCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_TURN_LAMP_ON_RGB_CMD: return createLivingColorsTurnLampOnRGBCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_TURN_LAMP_ON_HSV_CMD: return createLivingColorsTurnLampOnHSVCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_TURN_OFF_LAMP_CMD: return createLivingColorsTurnOffLampCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_SET_ADDRESS_CMD: return createLivingColorsSetAddressCmd();
			case Ezlivingcolors1Package.LIIVNG_COLORS_SEND_COMMAND_CMD: return createLiivngColorsSendCommandCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_CMD: return createLivingColorsCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_CHECK_ADDRESS_CMD: return createLivingColorsCheckAddressCmd();
			case Ezlivingcolors1Package.LIVING_COLORS_GET_LAMP_CMD: return createLivingColorsGetLampCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsSetRGBCmd createLivingColorsSetRGBCmd() {
		LivingColorsSetRGBCmdImpl livingColorsSetRGBCmd = new LivingColorsSetRGBCmdImpl();
		return livingColorsSetRGBCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsSetHSVCmd createLivingColorsSetHSVCmd() {
		LivingColorsSetHSVCmdImpl livingColorsSetHSVCmd = new LivingColorsSetHSVCmdImpl();
		return livingColorsSetHSVCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsInitCmd createLivingColorsInitCmd() {
		LivingColorsInitCmdImpl livingColorsInitCmd = new LivingColorsInitCmdImpl();
		return livingColorsInitCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsGetMaxNumLampsCmd createLivingColorsGetMaxNumLampsCmd() {
		LivingColorsGetMaxNumLampsCmdImpl livingColorsGetMaxNumLampsCmd = new LivingColorsGetMaxNumLampsCmdImpl();
		return livingColorsGetMaxNumLampsCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsAddLampCmd createLivingColorsAddLampCmd() {
		LivingColorsAddLampCmdImpl livingColorsAddLampCmd = new LivingColorsAddLampCmdImpl();
		return livingColorsAddLampCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsGetLampCmd createLivingColorsGetLampCmd() {
		LivingColorsGetLampCmdImpl livingColorsGetLampCmd = new LivingColorsGetLampCmdImpl();
		return livingColorsGetLampCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsLearnLampsCmd createLivingColorsLearnLampsCmd() {
		LivingColorsLearnLampsCmdImpl livingColorsLearnLampsCmd = new LivingColorsLearnLampsCmdImpl();
		return livingColorsLearnLampsCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivinColorsClearLampsCmd createLivinColorsClearLampsCmd() {
		LivinColorsClearLampsCmdImpl livinColorsClearLampsCmd = new LivinColorsClearLampsCmdImpl();
		return livinColorsClearLampsCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsTurnLampOnRGBCmd createLivingColorsTurnLampOnRGBCmd() {
		LivingColorsTurnLampOnRGBCmdImpl livingColorsTurnLampOnRGBCmd = new LivingColorsTurnLampOnRGBCmdImpl();
		return livingColorsTurnLampOnRGBCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsTurnLampOnHSVCmd createLivingColorsTurnLampOnHSVCmd() {
		LivingColorsTurnLampOnHSVCmdImpl livingColorsTurnLampOnHSVCmd = new LivingColorsTurnLampOnHSVCmdImpl();
		return livingColorsTurnLampOnHSVCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsTurnOffLampCmd createLivingColorsTurnOffLampCmd() {
		LivingColorsTurnOffLampCmdImpl livingColorsTurnOffLampCmd = new LivingColorsTurnOffLampCmdImpl();
		return livingColorsTurnOffLampCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsSetAddressCmd createLivingColorsSetAddressCmd() {
		LivingColorsSetAddressCmdImpl livingColorsSetAddressCmd = new LivingColorsSetAddressCmdImpl();
		return livingColorsSetAddressCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiivngColorsSendCommandCmd createLiivngColorsSendCommandCmd() {
		LiivngColorsSendCommandCmdImpl liivngColorsSendCommandCmd = new LiivngColorsSendCommandCmdImpl();
		return liivngColorsSendCommandCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsCmd createLivingColorsCmd() {
		LivingColorsCmdImpl livingColorsCmd = new LivingColorsCmdImpl();
		return livingColorsCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivingColorsCheckAddressCmd createLivingColorsCheckAddressCmd() {
		LivingColorsCheckAddressCmdImpl livingColorsCheckAddressCmd = new LivingColorsCheckAddressCmdImpl();
		return livingColorsCheckAddressCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ezlivingcolors1Package getEzlivingcolors1Package() {
		return (Ezlivingcolors1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ezlivingcolors1Package getPackage() {
		return Ezlivingcolors1Package.eINSTANCE;
	}

} //Ezlivingcolors1FactoryImpl
