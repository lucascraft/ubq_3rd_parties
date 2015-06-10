/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.impl;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Liivng Colors Send Command Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LiivngColorsSendCommandCmdImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LiivngColorsSendCommandCmdImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LiivngColorsSendCommandCmdImpl#getH <em>H</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LiivngColorsSendCommandCmdImpl#getS <em>S</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LiivngColorsSendCommandCmdImpl#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiivngColorsSendCommandCmdImpl extends LivingColorsCmdImpl implements LiivngColorsSendCommandCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiivngColorsSendCommandCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCmd() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__CMD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmd(int newCmd) {
		eSet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__CMD, newCmd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getAddr() {
		return (Byte)eGet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(byte newAddr) {
		eSet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__ADDR, newAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getH() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__H, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(int newH) {
		eSet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__H, newH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getS() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__S, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(int newS) {
		eSet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__S, newS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getV() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__V, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(int newV) {
		eSet(Ezlivingcolors1Package.Literals.LIIVNG_COLORS_SEND_COMMAND_CMD__V, newV);
	}

} //LiivngColorsSendCommandCmdImpl
