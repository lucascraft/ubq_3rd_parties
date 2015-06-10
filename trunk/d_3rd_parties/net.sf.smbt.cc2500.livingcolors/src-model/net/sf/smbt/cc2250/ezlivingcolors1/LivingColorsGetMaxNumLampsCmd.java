/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Living Colors Get Max Num Lamps Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#getLivingColorsGetMaxNumLampsCmd()
 * @model
 * @generated
 */
public interface LivingColorsGetMaxNumLampsCmd extends LivingColorsCmd {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(int)
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#getLivingColorsGetMaxNumLampsCmd_Result()
	 * @model
	 * @generated
	 */
	int getResult();

	/**
	 * Sets the value of the '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(int value);

} // LivingColorsGetMaxNumLampsCmd
