/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Living Colors Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd#getHex <em>Hex</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#getLivingColorsCmd()
 * @model
 * @generated
 */
public interface LivingColorsCmd extends Cmd {

	/**
	 * Returns the value of the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex</em>' attribute.
	 * @see #setHex(byte)
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#getLivingColorsCmd_Hex()
	 * @model
	 * @generated
	 */
	byte getHex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd#getHex <em>Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex</em>' attribute.
	 * @see #getHex()
	 * @generated
	 */
	void setHex(byte value);
} // LivingColorsCmd
