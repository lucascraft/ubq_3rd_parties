/**
 * <copyright>
 * </copyright>
 *
 * $Id: ColorsPackage.java,v 1.1 2008/12/28 12:22:56 lucascraft Exp $
 */
package net.sf.smbt.model.colors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.model.colors.ColorsFactory
 * @model kind="package"
 * @generated
 */
public interface ColorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "colors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://net.sf.smbt/colors/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "colors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ColorsPackage eINSTANCE = net.sf.smbt.model.colors.impl.ColorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.model.colors.Color <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.model.colors.Color
	 * @see net.sf.smbt.model.colors.impl.ColorsPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 2;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.model.colors.impl.HSBImpl <em>HSB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.model.colors.impl.HSBImpl
	 * @see net.sf.smbt.model.colors.impl.ColorsPackageImpl#getHSB()
	 * @generated
	 */
	int HSB = 0;

	/**
	 * The feature id for the '<em><b>Hue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSB__HUE = COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Saturation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSB__SATURATION = COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSB__BRIGHTNESS = COLOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HSB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSB_FEATURE_COUNT = COLOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.model.colors.impl.RGBImpl <em>RGB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.model.colors.impl.RGBImpl
	 * @see net.sf.smbt.model.colors.impl.ColorsPackageImpl#getRGB()
	 * @generated
	 */
	int RGB = 1;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB__RED = COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB__GREEN = COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB__BLUE = COLOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RGB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_FEATURE_COUNT = COLOR_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.model.colors.HSB <em>HSB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSB</em>'.
	 * @see net.sf.smbt.model.colors.HSB
	 * @generated
	 */
	EClass getHSB();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.model.colors.HSB#getHue <em>Hue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hue</em>'.
	 * @see net.sf.smbt.model.colors.HSB#getHue()
	 * @see #getHSB()
	 * @generated
	 */
	EAttribute getHSB_Hue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.model.colors.HSB#getSaturation <em>Saturation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saturation</em>'.
	 * @see net.sf.smbt.model.colors.HSB#getSaturation()
	 * @see #getHSB()
	 * @generated
	 */
	EAttribute getHSB_Saturation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.model.colors.HSB#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see net.sf.smbt.model.colors.HSB#getBrightness()
	 * @see #getHSB()
	 * @generated
	 */
	EAttribute getHSB_Brightness();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.model.colors.RGB <em>RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB</em>'.
	 * @see net.sf.smbt.model.colors.RGB
	 * @generated
	 */
	EClass getRGB();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.model.colors.RGB#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see net.sf.smbt.model.colors.RGB#getRed()
	 * @see #getRGB()
	 * @generated
	 */
	EAttribute getRGB_Red();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.model.colors.RGB#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see net.sf.smbt.model.colors.RGB#getGreen()
	 * @see #getRGB()
	 * @generated
	 */
	EAttribute getRGB_Green();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.model.colors.RGB#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see net.sf.smbt.model.colors.RGB#getBlue()
	 * @see #getRGB()
	 * @generated
	 */
	EAttribute getRGB_Blue();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.model.colors.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see net.sf.smbt.model.colors.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ColorsFactory getColorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.model.colors.impl.HSBImpl <em>HSB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.model.colors.impl.HSBImpl
		 * @see net.sf.smbt.model.colors.impl.ColorsPackageImpl#getHSB()
		 * @generated
		 */
		EClass HSB = eINSTANCE.getHSB();

		/**
		 * The meta object literal for the '<em><b>Hue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HSB__HUE = eINSTANCE.getHSB_Hue();

		/**
		 * The meta object literal for the '<em><b>Saturation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HSB__SATURATION = eINSTANCE.getHSB_Saturation();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HSB__BRIGHTNESS = eINSTANCE.getHSB_Brightness();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.model.colors.impl.RGBImpl <em>RGB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.model.colors.impl.RGBImpl
		 * @see net.sf.smbt.model.colors.impl.ColorsPackageImpl#getRGB()
		 * @generated
		 */
		EClass RGB = eINSTANCE.getRGB();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB__RED = eINSTANCE.getRGB_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB__GREEN = eINSTANCE.getRGB_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB__BLUE = eINSTANCE.getRGB_Blue();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.model.colors.Color <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.model.colors.Color
		 * @see net.sf.smbt.model.colors.impl.ColorsPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

	}

} //ColorsPackage
