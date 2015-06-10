/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Living Colors Get Lamp Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd#getResult <em>Result</em>}</li>
 *   <li>{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#getLivingColorsGetLampCmd()
 * @model
 * @generated
 */
public interface LivingColorsGetLampCmd extends LivingColorsCmd {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(byte[])
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#getLivingColorsGetLampCmd_Result()
	 * @model
	 * @generated
	 */
	byte[] getResult();

	/**
	 * Sets the value of the '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(byte[] value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package#getLivingColorsGetLampCmd_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // LivingColorsGetLampCmd
