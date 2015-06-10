/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Factory
 * @model kind="package"
 * @generated
 */
public interface Ezlivingcolors1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezlivingcolors1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sf.net/smbt/cc2250/ezlivingcolors1/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezlivingcolors1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ezlivingcolors1Package eINSTANCE = net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCmdImpl <em>Living Colors Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsCmd()
	 * @generated
	 */
	int LIVING_COLORS_CMD = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_CMD__HEX = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Living Colors Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetRGBCmdImpl <em>Living Colors Set RGB Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetRGBCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsSetRGBCmd()
	 * @generated
	 */
	int LIVING_COLORS_SET_RGB_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_RGB_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_RGB_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_RGB_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_RGB_CMD__ADDR = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_RGB_CMD__R = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_RGB_CMD__G = LIVING_COLORS_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_RGB_CMD__B = LIVING_COLORS_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_RGB_CMD__INDEX = LIVING_COLORS_CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Living Colors Set RGB Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_RGB_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetHSVCmdImpl <em>Living Colors Set HSV Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetHSVCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsSetHSVCmd()
	 * @generated
	 */
	int LIVING_COLORS_SET_HSV_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_HSV_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_HSV_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_HSV_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_HSV_CMD__ADDR = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_HSV_CMD__H = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_HSV_CMD__S = LIVING_COLORS_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_HSV_CMD__V = LIVING_COLORS_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_HSV_CMD__INDEX = LIVING_COLORS_CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Living Colors Set HSV Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_HSV_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsInitCmdImpl <em>Living Colors Init Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsInitCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsInitCmd()
	 * @generated
	 */
	int LIVING_COLORS_INIT_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_INIT_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_INIT_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_INIT_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The number of structural features of the '<em>Living Colors Init Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_INIT_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetMaxNumLampsCmdImpl <em>Living Colors Get Max Num Lamps Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetMaxNumLampsCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsGetMaxNumLampsCmd()
	 * @generated
	 */
	int LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD__RESULT = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Living Colors Get Max Num Lamps Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsAddLampCmdImpl <em>Living Colors Add Lamp Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsAddLampCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsAddLampCmd()
	 * @generated
	 */
	int LIVING_COLORS_ADD_LAMP_CMD = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_ADD_LAMP_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_ADD_LAMP_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_ADD_LAMP_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_ADD_LAMP_CMD__ADDR = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Living Colors Add Lamp Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_ADD_LAMP_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetLampCmdImpl <em>Living Colors Get Lamp Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetLampCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsGetLampCmd()
	 * @generated
	 */
	int LIVING_COLORS_GET_LAMP_CMD = 14;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsLearnLampsCmdImpl <em>Living Colors Learn Lamps Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsLearnLampsCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsLearnLampsCmd()
	 * @generated
	 */
	int LIVING_COLORS_LEARN_LAMPS_CMD = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_LEARN_LAMPS_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_LEARN_LAMPS_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_LEARN_LAMPS_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The number of structural features of the '<em>Living Colors Learn Lamps Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_LEARN_LAMPS_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivinColorsClearLampsCmdImpl <em>Livin Colors Clear Lamps Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivinColorsClearLampsCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivinColorsClearLampsCmd()
	 * @generated
	 */
	int LIVIN_COLORS_CLEAR_LAMPS_CMD = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVIN_COLORS_CLEAR_LAMPS_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVIN_COLORS_CLEAR_LAMPS_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVIN_COLORS_CLEAR_LAMPS_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The number of structural features of the '<em>Livin Colors Clear Lamps Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVIN_COLORS_CLEAR_LAMPS_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnLampOnRGBCmdImpl <em>Living Colors Turn Lamp On RGB Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnLampOnRGBCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsTurnLampOnRGBCmd()
	 * @generated
	 */
	int LIVING_COLORS_TURN_LAMP_ON_RGB_CMD = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__INDEX = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__R = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__G = LIVING_COLORS_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__B = LIVING_COLORS_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Living Colors Turn Lamp On RGB Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_RGB_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnLampOnHSVCmdImpl <em>Living Colors Turn Lamp On HSV Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnLampOnHSVCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsTurnLampOnHSVCmd()
	 * @generated
	 */
	int LIVING_COLORS_TURN_LAMP_ON_HSV_CMD = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__INDEX = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__H = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__S = LIVING_COLORS_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__V = LIVING_COLORS_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Living Colors Turn Lamp On HSV Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_LAMP_ON_HSV_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnOffLampCmdImpl <em>Living Colors Turn Off Lamp Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnOffLampCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsTurnOffLampCmd()
	 * @generated
	 */
	int LIVING_COLORS_TURN_OFF_LAMP_CMD = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_OFF_LAMP_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_OFF_LAMP_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_OFF_LAMP_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_OFF_LAMP_CMD__INDEX = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Living Colors Turn Off Lamp Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_TURN_OFF_LAMP_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetAddressCmdImpl <em>Living Colors Set Address Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetAddressCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsSetAddressCmd()
	 * @generated
	 */
	int LIVING_COLORS_SET_ADDRESS_CMD = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_ADDRESS_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_ADDRESS_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_ADDRESS_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_ADDRESS_CMD__ADDR = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Living Colors Set Address Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_SET_ADDRESS_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LiivngColorsSendCommandCmdImpl <em>Liivng Colors Send Command Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LiivngColorsSendCommandCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLiivngColorsSendCommandCmd()
	 * @generated
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD__CMD = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD__ADDR = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD__H = LIVING_COLORS_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD__S = LIVING_COLORS_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD__V = LIVING_COLORS_CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Liivng Colors Send Command Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIIVNG_COLORS_SEND_COMMAND_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCheckAddressCmdImpl <em>Living Colors Check Address Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCheckAddressCmdImpl
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsCheckAddressCmd()
	 * @generated
	 */
	int LIVING_COLORS_CHECK_ADDRESS_CMD = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_CHECK_ADDRESS_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_CHECK_ADDRESS_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_CHECK_ADDRESS_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_CHECK_ADDRESS_CMD__ADDR = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Living Colors Check Address Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_CHECK_ADDRESS_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_LAMP_CMD__PRIORITY = LIVING_COLORS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_LAMP_CMD__STAMP = LIVING_COLORS_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_LAMP_CMD__HEX = LIVING_COLORS_CMD__HEX;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_LAMP_CMD__RESULT = LIVING_COLORS_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_LAMP_CMD__INDEX = LIVING_COLORS_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Living Colors Get Lamp Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_COLORS_GET_LAMP_CMD_FEATURE_COUNT = LIVING_COLORS_CMD_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd <em>Living Colors Set RGB Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Set RGB Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd
	 * @generated
	 */
	EClass getLivingColorsSetRGBCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getAddr()
	 * @see #getLivingColorsSetRGBCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetRGBCmd_Addr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getR()
	 * @see #getLivingColorsSetRGBCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetRGBCmd_R();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getG()
	 * @see #getLivingColorsSetRGBCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetRGBCmd_G();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getB()
	 * @see #getLivingColorsSetRGBCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetRGBCmd_B();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd#getIndex()
	 * @see #getLivingColorsSetRGBCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetRGBCmd_Index();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd <em>Living Colors Set HSV Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Set HSV Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd
	 * @generated
	 */
	EClass getLivingColorsSetHSVCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getAddr()
	 * @see #getLivingColorsSetHSVCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetHSVCmd_Addr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getH()
	 * @see #getLivingColorsSetHSVCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetHSVCmd_H();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getS()
	 * @see #getLivingColorsSetHSVCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetHSVCmd_S();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getV()
	 * @see #getLivingColorsSetHSVCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetHSVCmd_V();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd#getIndex()
	 * @see #getLivingColorsSetHSVCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetHSVCmd_Index();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsInitCmd <em>Living Colors Init Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Init Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsInitCmd
	 * @generated
	 */
	EClass getLivingColorsInitCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd <em>Living Colors Get Max Num Lamps Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Get Max Num Lamps Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd
	 * @generated
	 */
	EClass getLivingColorsGetMaxNumLampsCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd#getResult()
	 * @see #getLivingColorsGetMaxNumLampsCmd()
	 * @generated
	 */
	EAttribute getLivingColorsGetMaxNumLampsCmd_Result();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd <em>Living Colors Add Lamp Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Add Lamp Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd
	 * @generated
	 */
	EClass getLivingColorsAddLampCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd#getAddr()
	 * @see #getLivingColorsAddLampCmd()
	 * @generated
	 */
	EAttribute getLivingColorsAddLampCmd_Addr();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd <em>Living Colors Get Lamp Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Get Lamp Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd
	 * @generated
	 */
	EClass getLivingColorsGetLampCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd#getResult()
	 * @see #getLivingColorsGetLampCmd()
	 * @generated
	 */
	EAttribute getLivingColorsGetLampCmd_Result();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd#getIndex()
	 * @see #getLivingColorsGetLampCmd()
	 * @generated
	 */
	EAttribute getLivingColorsGetLampCmd_Index();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsLearnLampsCmd <em>Living Colors Learn Lamps Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Learn Lamps Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsLearnLampsCmd
	 * @generated
	 */
	EClass getLivingColorsLearnLampsCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivinColorsClearLampsCmd <em>Livin Colors Clear Lamps Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livin Colors Clear Lamps Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivinColorsClearLampsCmd
	 * @generated
	 */
	EClass getLivinColorsClearLampsCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd <em>Living Colors Turn Lamp On RGB Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Turn Lamp On RGB Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd
	 * @generated
	 */
	EClass getLivingColorsTurnLampOnRGBCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd#getIndex()
	 * @see #getLivingColorsTurnLampOnRGBCmd()
	 * @generated
	 */
	EAttribute getLivingColorsTurnLampOnRGBCmd_Index();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd#getR()
	 * @see #getLivingColorsTurnLampOnRGBCmd()
	 * @generated
	 */
	EAttribute getLivingColorsTurnLampOnRGBCmd_R();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd#getG()
	 * @see #getLivingColorsTurnLampOnRGBCmd()
	 * @generated
	 */
	EAttribute getLivingColorsTurnLampOnRGBCmd_G();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd#getB()
	 * @see #getLivingColorsTurnLampOnRGBCmd()
	 * @generated
	 */
	EAttribute getLivingColorsTurnLampOnRGBCmd_B();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd <em>Living Colors Turn Lamp On HSV Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Turn Lamp On HSV Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd
	 * @generated
	 */
	EClass getLivingColorsTurnLampOnHSVCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd#getIndex()
	 * @see #getLivingColorsTurnLampOnHSVCmd()
	 * @generated
	 */
	EAttribute getLivingColorsTurnLampOnHSVCmd_Index();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd#getH()
	 * @see #getLivingColorsTurnLampOnHSVCmd()
	 * @generated
	 */
	EAttribute getLivingColorsTurnLampOnHSVCmd_H();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd#getS()
	 * @see #getLivingColorsTurnLampOnHSVCmd()
	 * @generated
	 */
	EAttribute getLivingColorsTurnLampOnHSVCmd_S();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd#getV()
	 * @see #getLivingColorsTurnLampOnHSVCmd()
	 * @generated
	 */
	EAttribute getLivingColorsTurnLampOnHSVCmd_V();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnOffLampCmd <em>Living Colors Turn Off Lamp Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Turn Off Lamp Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnOffLampCmd
	 * @generated
	 */
	EClass getLivingColorsTurnOffLampCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnOffLampCmd#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnOffLampCmd#getIndex()
	 * @see #getLivingColorsTurnOffLampCmd()
	 * @generated
	 */
	EAttribute getLivingColorsTurnOffLampCmd_Index();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd <em>Living Colors Set Address Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Set Address Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd
	 * @generated
	 */
	EClass getLivingColorsSetAddressCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd#getAddr()
	 * @see #getLivingColorsSetAddressCmd()
	 * @generated
	 */
	EAttribute getLivingColorsSetAddressCmd_Addr();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd <em>Liivng Colors Send Command Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Liivng Colors Send Command Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd
	 * @generated
	 */
	EClass getLiivngColorsSendCommandCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getCmd()
	 * @see #getLiivngColorsSendCommandCmd()
	 * @generated
	 */
	EAttribute getLiivngColorsSendCommandCmd_Cmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getAddr()
	 * @see #getLiivngColorsSendCommandCmd()
	 * @generated
	 */
	EAttribute getLiivngColorsSendCommandCmd_Addr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getH()
	 * @see #getLiivngColorsSendCommandCmd()
	 * @generated
	 */
	EAttribute getLiivngColorsSendCommandCmd_H();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getS()
	 * @see #getLiivngColorsSendCommandCmd()
	 * @generated
	 */
	EAttribute getLiivngColorsSendCommandCmd_S();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd#getV()
	 * @see #getLiivngColorsSendCommandCmd()
	 * @generated
	 */
	EAttribute getLiivngColorsSendCommandCmd_V();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd <em>Living Colors Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd
	 * @generated
	 */
	EClass getLivingColorsCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd#getHex <em>Hex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hex</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd#getHex()
	 * @see #getLivingColorsCmd()
	 * @generated
	 */
	EAttribute getLivingColorsCmd_Hex();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCheckAddressCmd <em>Living Colors Check Address Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Colors Check Address Cmd</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCheckAddressCmd
	 * @generated
	 */
	EClass getLivingColorsCheckAddressCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCheckAddressCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCheckAddressCmd#getAddr()
	 * @see #getLivingColorsCheckAddressCmd()
	 * @generated
	 */
	EAttribute getLivingColorsCheckAddressCmd_Addr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ezlivingcolors1Factory getEzlivingcolors1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetRGBCmdImpl <em>Living Colors Set RGB Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetRGBCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsSetRGBCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_SET_RGB_CMD = eINSTANCE.getLivingColorsSetRGBCmd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_RGB_CMD__ADDR = eINSTANCE.getLivingColorsSetRGBCmd_Addr();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_RGB_CMD__R = eINSTANCE.getLivingColorsSetRGBCmd_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_RGB_CMD__G = eINSTANCE.getLivingColorsSetRGBCmd_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_RGB_CMD__B = eINSTANCE.getLivingColorsSetRGBCmd_B();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_RGB_CMD__INDEX = eINSTANCE.getLivingColorsSetRGBCmd_Index();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetHSVCmdImpl <em>Living Colors Set HSV Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetHSVCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsSetHSVCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_SET_HSV_CMD = eINSTANCE.getLivingColorsSetHSVCmd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_HSV_CMD__ADDR = eINSTANCE.getLivingColorsSetHSVCmd_Addr();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_HSV_CMD__H = eINSTANCE.getLivingColorsSetHSVCmd_H();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_HSV_CMD__S = eINSTANCE.getLivingColorsSetHSVCmd_S();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_HSV_CMD__V = eINSTANCE.getLivingColorsSetHSVCmd_V();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_HSV_CMD__INDEX = eINSTANCE.getLivingColorsSetHSVCmd_Index();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsInitCmdImpl <em>Living Colors Init Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsInitCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsInitCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_INIT_CMD = eINSTANCE.getLivingColorsInitCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetMaxNumLampsCmdImpl <em>Living Colors Get Max Num Lamps Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetMaxNumLampsCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsGetMaxNumLampsCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD = eINSTANCE.getLivingColorsGetMaxNumLampsCmd();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD__RESULT = eINSTANCE.getLivingColorsGetMaxNumLampsCmd_Result();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsAddLampCmdImpl <em>Living Colors Add Lamp Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsAddLampCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsAddLampCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_ADD_LAMP_CMD = eINSTANCE.getLivingColorsAddLampCmd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_ADD_LAMP_CMD__ADDR = eINSTANCE.getLivingColorsAddLampCmd_Addr();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetLampCmdImpl <em>Living Colors Get Lamp Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetLampCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsGetLampCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_GET_LAMP_CMD = eINSTANCE.getLivingColorsGetLampCmd();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_GET_LAMP_CMD__RESULT = eINSTANCE.getLivingColorsGetLampCmd_Result();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_GET_LAMP_CMD__INDEX = eINSTANCE.getLivingColorsGetLampCmd_Index();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsLearnLampsCmdImpl <em>Living Colors Learn Lamps Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsLearnLampsCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsLearnLampsCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_LEARN_LAMPS_CMD = eINSTANCE.getLivingColorsLearnLampsCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivinColorsClearLampsCmdImpl <em>Livin Colors Clear Lamps Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivinColorsClearLampsCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivinColorsClearLampsCmd()
		 * @generated
		 */
		EClass LIVIN_COLORS_CLEAR_LAMPS_CMD = eINSTANCE.getLivinColorsClearLampsCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnLampOnRGBCmdImpl <em>Living Colors Turn Lamp On RGB Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnLampOnRGBCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsTurnLampOnRGBCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_TURN_LAMP_ON_RGB_CMD = eINSTANCE.getLivingColorsTurnLampOnRGBCmd();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__INDEX = eINSTANCE.getLivingColorsTurnLampOnRGBCmd_Index();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__R = eINSTANCE.getLivingColorsTurnLampOnRGBCmd_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__G = eINSTANCE.getLivingColorsTurnLampOnRGBCmd_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_TURN_LAMP_ON_RGB_CMD__B = eINSTANCE.getLivingColorsTurnLampOnRGBCmd_B();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnLampOnHSVCmdImpl <em>Living Colors Turn Lamp On HSV Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnLampOnHSVCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsTurnLampOnHSVCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_TURN_LAMP_ON_HSV_CMD = eINSTANCE.getLivingColorsTurnLampOnHSVCmd();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__INDEX = eINSTANCE.getLivingColorsTurnLampOnHSVCmd_Index();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__H = eINSTANCE.getLivingColorsTurnLampOnHSVCmd_H();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__S = eINSTANCE.getLivingColorsTurnLampOnHSVCmd_S();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_TURN_LAMP_ON_HSV_CMD__V = eINSTANCE.getLivingColorsTurnLampOnHSVCmd_V();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnOffLampCmdImpl <em>Living Colors Turn Off Lamp Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnOffLampCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsTurnOffLampCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_TURN_OFF_LAMP_CMD = eINSTANCE.getLivingColorsTurnOffLampCmd();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_TURN_OFF_LAMP_CMD__INDEX = eINSTANCE.getLivingColorsTurnOffLampCmd_Index();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetAddressCmdImpl <em>Living Colors Set Address Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetAddressCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsSetAddressCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_SET_ADDRESS_CMD = eINSTANCE.getLivingColorsSetAddressCmd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_SET_ADDRESS_CMD__ADDR = eINSTANCE.getLivingColorsSetAddressCmd_Addr();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LiivngColorsSendCommandCmdImpl <em>Liivng Colors Send Command Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LiivngColorsSendCommandCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLiivngColorsSendCommandCmd()
		 * @generated
		 */
		EClass LIIVNG_COLORS_SEND_COMMAND_CMD = eINSTANCE.getLiivngColorsSendCommandCmd();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIIVNG_COLORS_SEND_COMMAND_CMD__CMD = eINSTANCE.getLiivngColorsSendCommandCmd_Cmd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIIVNG_COLORS_SEND_COMMAND_CMD__ADDR = eINSTANCE.getLiivngColorsSendCommandCmd_Addr();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIIVNG_COLORS_SEND_COMMAND_CMD__H = eINSTANCE.getLiivngColorsSendCommandCmd_H();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIIVNG_COLORS_SEND_COMMAND_CMD__S = eINSTANCE.getLiivngColorsSendCommandCmd_S();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIIVNG_COLORS_SEND_COMMAND_CMD__V = eINSTANCE.getLiivngColorsSendCommandCmd_V();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCmdImpl <em>Living Colors Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_CMD = eINSTANCE.getLivingColorsCmd();

		/**
		 * The meta object literal for the '<em><b>Hex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_CMD__HEX = eINSTANCE.getLivingColorsCmd_Hex();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCheckAddressCmdImpl <em>Living Colors Check Address Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCheckAddressCmdImpl
		 * @see net.sf.smbt.cc2250.ezlivingcolors1.impl.Ezlivingcolors1PackageImpl#getLivingColorsCheckAddressCmd()
		 * @generated
		 */
		EClass LIVING_COLORS_CHECK_ADDRESS_CMD = eINSTANCE.getLivingColorsCheckAddressCmd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_COLORS_CHECK_ADDRESS_CMD__ADDR = eINSTANCE.getLivingColorsCheckAddressCmd_Addr();

	}

} //Ezlivingcolors1Package
