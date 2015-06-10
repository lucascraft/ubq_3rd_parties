/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdxtopology;

import net.sf.smbt.ezafdx.AFDXVirtualLink;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFDX Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezafdxtopology.AFDXTopology#getVirtualLinks <em>Virtual Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezafdxtopology.EzafdxtopologyPackage#getAFDXTopology()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AFDXTopology extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Virtual Links</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezafdx.AFDXVirtualLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Links</em>' containment reference list.
	 * @see net.sf.smbt.ezafdxtopology.EzafdxtopologyPackage#getAFDXTopology_VirtualLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AFDXVirtualLink> getVirtualLinks();

} // AFDXTopology
