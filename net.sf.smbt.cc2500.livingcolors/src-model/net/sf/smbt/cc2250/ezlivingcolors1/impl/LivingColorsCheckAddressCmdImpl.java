/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.impl;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCheckAddressCmd;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Living Colors Check Address Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsCheckAddressCmdImpl#getAddr <em>Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivingColorsCheckAddressCmdImpl extends LivingColorsCmdImpl implements LivingColorsCheckAddressCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivingColorsCheckAddressCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ezlivingcolors1Package.Literals.LIVING_COLORS_CHECK_ADDRESS_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getAddr() {
		return (byte[])eGet(Ezlivingcolors1Package.Literals.LIVING_COLORS_CHECK_ADDRESS_CMD__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(byte[] newAddr) {
		eSet(Ezlivingcolors1Package.Literals.LIVING_COLORS_CHECK_ADDRESS_CMD__ADDR, newAddr);
	}

} //LivingColorsCheckAddressCmdImpl
