/**
 * <copyright>
 * </copyright>
 *
 * $Id: RGB.java,v 1.1 2008/12/28 12:22:56 lucascraft Exp $
 */
package net.sf.smbt.model.colors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RGB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.model.colors.RGB#getRed <em>Red</em>}</li>
 *   <li>{@link net.sf.smbt.model.colors.RGB#getGreen <em>Green</em>}</li>
 *   <li>{@link net.sf.smbt.model.colors.RGB#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.model.colors.ColorsPackage#getRGB()
 * @model
 * @generated
 */
public interface RGB extends Color {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(int)
	 * @see net.sf.smbt.model.colors.ColorsPackage#getRGB_Red()
	 * @model
	 * @generated
	 */
	int getRed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.model.colors.RGB#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(int value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(int)
	 * @see net.sf.smbt.model.colors.ColorsPackage#getRGB_Green()
	 * @model
	 * @generated
	 */
	int getGreen();

	/**
	 * Sets the value of the '{@link net.sf.smbt.model.colors.RGB#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(int value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(int)
	 * @see net.sf.smbt.model.colors.ColorsPackage#getRGB_Blue()
	 * @model
	 * @generated
	 */
	int getBlue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.model.colors.RGB#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(int value);

} // RGB
