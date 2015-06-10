/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdxtopology;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see net.sf.smbt.ezafdxtopology.EzafdxtopologyFactory
 * @model kind="package"
 * @generated
 */
public interface EzafdxtopologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezafdxtopology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezafdxtopology/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezafdxtopology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzafdxtopologyPackage eINSTANCE = net.sf.smbt.ezafdxtopology.impl.EzafdxtopologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezafdxtopology.impl.AFDXTopologyImpl <em>AFDX Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezafdxtopology.impl.AFDXTopologyImpl
	 * @see net.sf.smbt.ezafdxtopology.impl.EzafdxtopologyPackageImpl#getAFDXTopology()
	 * @generated
	 */
	int AFDX_TOPOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Virtual Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_TOPOLOGY__VIRTUAL_LINKS = 0;

	/**
	 * The number of structural features of the '<em>AFDX Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_TOPOLOGY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezafdxtopology.AFDXTopology <em>AFDX Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFDX Topology</em>'.
	 * @see net.sf.smbt.ezafdxtopology.AFDXTopology
	 * @generated
	 */
	EClass getAFDXTopology();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezafdxtopology.AFDXTopology#getVirtualLinks <em>Virtual Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Links</em>'.
	 * @see net.sf.smbt.ezafdxtopology.AFDXTopology#getVirtualLinks()
	 * @see #getAFDXTopology()
	 * @generated
	 */
	EReference getAFDXTopology_VirtualLinks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzafdxtopologyFactory getEzafdxtopologyFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezafdxtopology.impl.AFDXTopologyImpl <em>AFDX Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezafdxtopology.impl.AFDXTopologyImpl
		 * @see net.sf.smbt.ezafdxtopology.impl.EzafdxtopologyPackageImpl#getAFDXTopology()
		 * @generated
		 */
		EClass AFDX_TOPOLOGY = eINSTANCE.getAFDXTopology();

		/**
		 * The meta object literal for the '<em><b>Virtual Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFDX_TOPOLOGY__VIRTUAL_LINKS = eINSTANCE.getAFDXTopology_VirtualLinks();

	}

} //EzafdxtopologyPackage
