/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Living Colors Set Address Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd#getAddr <em>Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#getLivingColorsSetAddressCmd()
 * @model
 * @generated
 */
public interface LivingColorsSetAddressCmd extends LivingColorsCmd {
	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(byte[])
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#getLivingColorsSetAddressCmd_Addr()
	 * @model
	 * @generated
	 */
	byte[] getAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(byte[] value);

} // LivingColorsSetAddressCmd
