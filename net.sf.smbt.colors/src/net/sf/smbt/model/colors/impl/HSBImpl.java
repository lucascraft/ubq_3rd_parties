/**
 * <copyright>
 * </copyright>
 *
 * $Id: HSBImpl.java,v 1.1 2008/12/28 12:22:56 lucascraft Exp $
 */
package net.sf.smbt.model.colors.impl;

import net.sf.smbt.model.colors.ColorsPackage;
import net.sf.smbt.model.colors.HSB;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.model.colors.impl.HSBImpl#getHue <em>Hue</em>}</li>
 *   <li>{@link net.sf.smbt.model.colors.impl.HSBImpl#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link net.sf.smbt.model.colors.impl.HSBImpl#getBrightness <em>Brightness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HSBImpl extends MinimalEObjectImpl.Container implements HSB {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColorsPackage.Literals.HSB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHue() {
		return (Float)eGet(ColorsPackage.Literals.HSB__HUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHue(float newHue) {
		eSet(ColorsPackage.Literals.HSB__HUE, newHue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSaturation() {
		return (Float)eGet(ColorsPackage.Literals.HSB__SATURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaturation(float newSaturation) {
		eSet(ColorsPackage.Literals.HSB__SATURATION, newSaturation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBrightness() {
		return (Float)eGet(ColorsPackage.Literals.HSB__BRIGHTNESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrightness(float newBrightness) {
		eSet(ColorsPackage.Literals.HSB__BRIGHTNESS, newBrightness);
	}

} //HSBImpl
