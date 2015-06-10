/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.impl;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Living Colors Set HSV Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetHSVCmdImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetHSVCmdImpl#getH <em>H</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetHSVCmdImpl#getS <em>S</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetHSVCmdImpl#getV <em>V</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetHSVCmdImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivingColorsSetHSVCmdImpl extends LivingColorsCmdImpl implements LivingColorsSetHSVCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivingColorsSetHSVCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getAddr() {
		return (Byte)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(byte newAddr) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__ADDR, newAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getH() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__H, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(int newH) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__H, newH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getS() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__S, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(int newS) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__S, newS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getV() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__V, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(int newV) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__V, newV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__INDEX, newIndex);
	}

} //LivingColorsSetHSVCmdImpl
