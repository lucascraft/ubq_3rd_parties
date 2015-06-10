/**
 * <copyright>
 * </copyright>
 *
 * $Id: HSB.java,v 1.1 2008/12/28 12:22:56 lucascraft Exp $
 */
package net.sf.smbt.model.colors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HSB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.model.colors.HSB#getHue <em>Hue</em>}</li>
 *   <li>{@link net.sf.smbt.model.colors.HSB#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link net.sf.smbt.model.colors.HSB#getBrightness <em>Brightness</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.model.colors.ColorsPackage#getHSB()
 * @model
 * @generated
 */
public interface HSB extends Color {
	/**
	 * Returns the value of the '<em><b>Hue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hue</em>' attribute.
	 * @see #setHue(float)
	 * @see net.sf.smbt.model.colors.ColorsPackage#getHSB_Hue()
	 * @model
	 * @generated
	 */
	float getHue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.model.colors.HSB#getHue <em>Hue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hue</em>' attribute.
	 * @see #getHue()
	 * @generated
	 */
	void setHue(float value);

	/**
	 * Returns the value of the '<em><b>Saturation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saturation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saturation</em>' attribute.
	 * @see #setSaturation(float)
	 * @see net.sf.smbt.model.colors.ColorsPackage#getHSB_Saturation()
	 * @model
	 * @generated
	 */
	float getSaturation();

	/**
	 * Sets the value of the '{@link net.sf.smbt.model.colors.HSB#getSaturation <em>Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saturation</em>' attribute.
	 * @see #getSaturation()
	 * @generated
	 */
	void setSaturation(float value);

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' attribute.
	 * @see #setBrightness(float)
	 * @see net.sf.smbt.model.colors.ColorsPackage#getHSB_Brightness()
	 * @model
	 * @generated
	 */
	float getBrightness();

	/**
	 * Sets the value of the '{@link net.sf.smbt.model.colors.HSB#getBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(float value);

} // HSB
