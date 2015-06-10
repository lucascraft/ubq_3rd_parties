/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.util;

import java.util.List;

import net.sf.smbt.cc2250.ezlivingcolors1.*;
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
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package
 * @generated
 */
public class Ezlivingcolors1Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ezlivingcolors1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ezlivingcolors1Switch() {
		if (modelPackage == null) {
			modelPackage = Ezlivingcolors1Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Ezlivingcolors1Package.LIVING_COLORS_SET_RGB_CMD: {
				LivingColorsSetRGBCmd livingColorsSetRGBCmd = (LivingColorsSetRGBCmd)theEObject;
				T result = caseLivingColorsSetRGBCmd(livingColorsSetRGBCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsSetRGBCmd);
				if (result == null) result = caseCmd(livingColorsSetRGBCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_SET_HSV_CMD: {
				LivingColorsSetHSVCmd livingColorsSetHSVCmd = (LivingColorsSetHSVCmd)theEObject;
				T result = caseLivingColorsSetHSVCmd(livingColorsSetHSVCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsSetHSVCmd);
				if (result == null) result = caseCmd(livingColorsSetHSVCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_INIT_CMD: {
				LivingColorsInitCmd livingColorsInitCmd = (LivingColorsInitCmd)theEObject;
				T result = caseLivingColorsInitCmd(livingColorsInitCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsInitCmd);
				if (result == null) result = caseCmd(livingColorsInitCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD: {
				LivingColorsGetMaxNumLampsCmd livingColorsGetMaxNumLampsCmd = (LivingColorsGetMaxNumLampsCmd)theEObject;
				T result = caseLivingColorsGetMaxNumLampsCmd(livingColorsGetMaxNumLampsCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsGetMaxNumLampsCmd);
				if (result == null) result = caseCmd(livingColorsGetMaxNumLampsCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_ADD_LAMP_CMD: {
				LivingColorsAddLampCmd livingColorsAddLampCmd = (LivingColorsAddLampCmd)theEObject;
				T result = caseLivingColorsAddLampCmd(livingColorsAddLampCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsAddLampCmd);
				if (result == null) result = caseCmd(livingColorsAddLampCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_LEARN_LAMPS_CMD: {
				LivingColorsLearnLampsCmd livingColorsLearnLampsCmd = (LivingColorsLearnLampsCmd)theEObject;
				T result = caseLivingColorsLearnLampsCmd(livingColorsLearnLampsCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsLearnLampsCmd);
				if (result == null) result = caseCmd(livingColorsLearnLampsCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVIN_COLORS_CLEAR_LAMPS_CMD: {
				LivinColorsClearLampsCmd livinColorsClearLampsCmd = (LivinColorsClearLampsCmd)theEObject;
				T result = caseLivinColorsClearLampsCmd(livinColorsClearLampsCmd);
				if (result == null) result = caseLivingColorsCmd(livinColorsClearLampsCmd);
				if (result == null) result = caseCmd(livinColorsClearLampsCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_TURN_LAMP_ON_RGB_CMD: {
				LivingColorsTurnLampOnRGBCmd livingColorsTurnLampOnRGBCmd = (LivingColorsTurnLampOnRGBCmd)theEObject;
				T result = caseLivingColorsTurnLampOnRGBCmd(livingColorsTurnLampOnRGBCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsTurnLampOnRGBCmd);
				if (result == null) result = caseCmd(livingColorsTurnLampOnRGBCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_TURN_LAMP_ON_HSV_CMD: {
				LivingColorsTurnLampOnHSVCmd livingColorsTurnLampOnHSVCmd = (LivingColorsTurnLampOnHSVCmd)theEObject;
				T result = caseLivingColorsTurnLampOnHSVCmd(livingColorsTurnLampOnHSVCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsTurnLampOnHSVCmd);
				if (result == null) result = caseCmd(livingColorsTurnLampOnHSVCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_TURN_OFF_LAMP_CMD: {
				LivingColorsTurnOffLampCmd livingColorsTurnOffLampCmd = (LivingColorsTurnOffLampCmd)theEObject;
				T result = caseLivingColorsTurnOffLampCmd(livingColorsTurnOffLampCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsTurnOffLampCmd);
				if (result == null) result = caseCmd(livingColorsTurnOffLampCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_SET_ADDRESS_CMD: {
				LivingColorsSetAddressCmd livingColorsSetAddressCmd = (LivingColorsSetAddressCmd)theEObject;
				T result = caseLivingColorsSetAddressCmd(livingColorsSetAddressCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsSetAddressCmd);
				if (result == null) result = caseCmd(livingColorsSetAddressCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIIVNG_COLORS_SEND_COMMAND_CMD: {
				LiivngColorsSendCommandCmd liivngColorsSendCommandCmd = (LiivngColorsSendCommandCmd)theEObject;
				T result = caseLiivngColorsSendCommandCmd(liivngColorsSendCommandCmd);
				if (result == null) result = caseLivingColorsCmd(liivngColorsSendCommandCmd);
				if (result == null) result = caseCmd(liivngColorsSendCommandCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_CMD: {
				LivingColorsCmd livingColorsCmd = (LivingColorsCmd)theEObject;
				T result = caseLivingColorsCmd(livingColorsCmd);
				if (result == null) result = caseCmd(livingColorsCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_CHECK_ADDRESS_CMD: {
				LivingColorsCheckAddressCmd livingColorsCheckAddressCmd = (LivingColorsCheckAddressCmd)theEObject;
				T result = caseLivingColorsCheckAddressCmd(livingColorsCheckAddressCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsCheckAddressCmd);
				if (result == null) result = caseCmd(livingColorsCheckAddressCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ezlivingcolors1Package.LIVING_COLORS_GET_LAMP_CMD: {
				LivingColorsGetLampCmd livingColorsGetLampCmd = (LivingColorsGetLampCmd)theEObject;
				T result = caseLivingColorsGetLampCmd(livingColorsGetLampCmd);
				if (result == null) result = caseLivingColorsCmd(livingColorsGetLampCmd);
				if (result == null) result = caseCmd(livingColorsGetLampCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Set RGB Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Set RGB Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsSetRGBCmd(LivingColorsSetRGBCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Set HSV Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Set HSV Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsSetHSVCmd(LivingColorsSetHSVCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Init Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Init Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsInitCmd(LivingColorsInitCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Get Max Num Lamps Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Get Max Num Lamps Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsGetMaxNumLampsCmd(LivingColorsGetMaxNumLampsCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Add Lamp Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Add Lamp Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsAddLampCmd(LivingColorsAddLampCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Get Lamp Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Get Lamp Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsGetLampCmd(LivingColorsGetLampCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Learn Lamps Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Learn Lamps Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsLearnLampsCmd(LivingColorsLearnLampsCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Livin Colors Clear Lamps Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Livin Colors Clear Lamps Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivinColorsClearLampsCmd(LivinColorsClearLampsCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Turn Lamp On RGB Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Turn Lamp On RGB Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsTurnLampOnRGBCmd(LivingColorsTurnLampOnRGBCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Turn Lamp On HSV Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Turn Lamp On HSV Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsTurnLampOnHSVCmd(LivingColorsTurnLampOnHSVCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Turn Off Lamp Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Turn Off Lamp Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsTurnOffLampCmd(LivingColorsTurnOffLampCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Set Address Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Set Address Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsSetAddressCmd(LivingColorsSetAddressCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Liivng Colors Send Command Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Liivng Colors Send Command Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiivngColorsSendCommandCmd(LiivngColorsSendCommandCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsCmd(LivingColorsCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Colors Check Address Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Colors Check Address Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingColorsCheckAddressCmd(LivingColorsCheckAddressCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Ezlivingcolors1Switch
