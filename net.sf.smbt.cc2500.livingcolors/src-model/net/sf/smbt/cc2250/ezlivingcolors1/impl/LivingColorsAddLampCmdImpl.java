/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.impl;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Living Colors Add Lamp Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsAddLampCmdImpl#getAddr <em>Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivingColorsAddLampCmdImpl extends LivingColorsCmdImpl implements LivingColorsAddLampCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivingColorsAddLampCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ezlivingcolors1Package.Literals.LIVING_COLORS_ADD_LAMP_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getAddr() {
		return (byte[])eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_ADD_LAMP_CMD__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(byte[] newAddr) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_ADD_LAMP_CMD__ADDR, newAddr);
	}

} //LivingColorsAddLampCmdImpl
