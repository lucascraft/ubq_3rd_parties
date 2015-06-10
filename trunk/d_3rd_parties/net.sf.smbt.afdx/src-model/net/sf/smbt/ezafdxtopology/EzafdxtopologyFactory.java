/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdxtopology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezafdxtopology.EzafdxtopologyPackage
 * @generated
 */
public interface EzafdxtopologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzafdxtopologyFactory eINSTANCE = net.sf.smbt.ezafdxtopology.impl.EzafdxtopologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AFDX Topology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFDX Topology</em>'.
	 * @generated
	 */
	AFDXTopology createAFDXTopology();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzafdxtopologyPackage getEzafdxtopologyPackage();

} //EzafdxtopologyFactory
