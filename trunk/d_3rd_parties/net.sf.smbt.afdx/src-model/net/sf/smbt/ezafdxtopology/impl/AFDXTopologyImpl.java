/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdxtopology.impl;

import net.sf.smbt.ezafdx.AFDXVirtualLink;

import net.sf.smbt.ezafdxtopology.AFDXTopology;
import net.sf.smbt.ezafdxtopology.EzafdxtopologyPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AFDX Topology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezafdxtopology.impl.AFDXTopologyImpl#getVirtualLinks <em>Virtual Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AFDXTopologyImpl extends CDOObjectImpl implements AFDXTopology {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFDXTopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzafdxtopologyPackage.Literals.AFDX_TOPOLOGY;
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
	@SuppressWarnings("unchecked")
	public EList<AFDXVirtualLink> getVirtualLinks() {
		return (EList<AFDXVirtualLink>)eGet(EzafdxtopologyPackage.Literals.AFDX_TOPOLOGY__VIRTUAL_LINKS, true);
	}

} //AFDXTopologyImpl
