/**
 * <copyright>
 * </copyright>
 *
 * $Id: ColorsFactory.java,v 1.1 2008/12/28 12:22:56 lucascraft Exp $
 */
package net.sf.smbt.model.colors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.model.colors.ColorsPackage
 * @generated
 */
public interface ColorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ColorsFactory eINSTANCE = net.sf.smbt.model.colors.impl.ColorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HSB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSB</em>'.
	 * @generated
	 */
	HSB createHSB();

	/**
	 * Returns a new object of class '<em>RGB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RGB</em>'.
	 * @generated
	 */
	RGB createRGB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ColorsPackage getColorsPackage();

} //ColorsFactory
