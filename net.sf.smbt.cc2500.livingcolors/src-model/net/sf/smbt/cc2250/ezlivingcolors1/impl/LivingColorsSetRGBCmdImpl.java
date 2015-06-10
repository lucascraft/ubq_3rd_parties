/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.impl;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Living Colors Set RGB Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetRGBCmdImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetRGBCmdImpl#getR <em>R</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetRGBCmdImpl#getG <em>G</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetRGBCmdImpl#getB <em>B</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsSetRGBCmdImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivingColorsSetRGBCmdImpl extends LivingColorsCmdImpl implements LivingColorsSetRGBCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivingColorsSetRGBCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getAddr() {
		return (Byte)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(byte newAddr) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__ADDR, newAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getR() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__R, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(int newR) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__R, newR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getG() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__G, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(int newG) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__G, newG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getB() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__B, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(int newB) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__B, newB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return (Integer)eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_RGB_CMD__INDEX, newIndex);
	}

} //LivingColorsSetRGBCmdImpl
