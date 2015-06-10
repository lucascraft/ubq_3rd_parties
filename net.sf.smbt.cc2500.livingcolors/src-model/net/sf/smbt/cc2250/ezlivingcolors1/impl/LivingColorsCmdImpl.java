/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.impl;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Living Colors Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCmdImpl#getHex <em>Hex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivingColorsCmdImpl extends CmdImpl implements LivingColorsCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivingColorsCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ezlivingcolors1Package.Literals.LIVING_COLORS_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getHex() {
		return (Byte)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_CMD__HEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHex(byte newHex) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_CMD__HEX, newHex);
	}

} //LivingColorsCmdImpl
