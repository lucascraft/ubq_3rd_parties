/**
 * <copyright>
 * </copyright>
 *
 * $Id: RGBImpl.java,v 1.1 2008/12/28 12:22:56 lucascraft Exp $
 */
package net.sf.smbt.model.colors.impl;

import net.sf.smbt.model.colors.ColorsPackage;
import net.sf.smbt.model.colors.RGB;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RGB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.model.colors.impl.RGBImpl#getRed <em>Red</em>}</li>
 *   <li>{@link net.sf.smbt.model.colors.impl.RGBImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link net.sf.smbt.model.colors.impl.RGBImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RGBImpl extends MinimalEObjectImpl.Container implements RGB {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RGBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColorsPackage.Literals.RGB;
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
	public int getRed() {
		return (Integer)eGet(ColorsPackage.Literals.RGB__RED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(int newRed) {
		eSet(ColorsPackage.Literals.RGB__RED, newRed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGreen() {
		return (Integer)eGet(ColorsPackage.Literals.RGB__GREEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(int newGreen) {
		eSet(ColorsPackage.Literals.RGB__GREEN, newGreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlue() {
		return (Integer)eGet(ColorsPackage.Literals.RGB__BLUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(int newBlue) {
		eSet(ColorsPackage.Literals.RGB__BLUE, newBlue);
	}

} //RGBImpl
