/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.impl;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Living Colors Get Lamp Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetLampCmdImpl#getResult <em>Result</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsGetLampCmdImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivingColorsGetLampCmdImpl extends LivingColorsCmdImpl implements LivingColorsGetLampCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivingColorsGetLampCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ezlivingcolors1Package.Literals.LIVING_COLORS_GET_LAMP_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getResult() {
		return (byte[])eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_GET_LAMP_CMD__RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(byte[] newResult) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_GET_LAMP_CMD__RESULT, newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_GET_LAMP_CMD__INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_GET_LAMP_CMD__INDEX, newIndex);
	}

} //LivingColorsGetLampCmdImpl
