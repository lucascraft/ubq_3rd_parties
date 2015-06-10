/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezafdx.EzafdxPackage
 * @generated
 */
public interface EzafdxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzafdxFactory eINSTANCE = net.sf.smbt.ezafdx.impl.EzafdxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AFDX Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFDX Frame</em>'.
	 * @generated
	 */
	AFDXFrame createAFDXFrame();

	/**
	 * Returns a new object of class '<em>AFDX Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFDX Payload</em>'.
	 * @generated
	 */
	AFDXPayload createAFDXPayload();

	/**
	 * Returns a new object of class '<em>AFDX Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFDX Bundle</em>'.
	 * @generated
	 */
	AFDXBundle createAFDXBundle();

	/**
	 * Returns a new object of class '<em>AFDX Virtual Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFDX Virtual Link</em>'.
	 * @generated
	 */
	AFDXVirtualLink createAFDXVirtualLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzafdxPackage getEzafdxPackage();

} //EzafdxFactory
