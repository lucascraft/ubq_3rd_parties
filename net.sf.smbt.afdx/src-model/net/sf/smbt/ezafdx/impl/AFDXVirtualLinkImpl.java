/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx.impl;

import net.sf.smbt.ezafdx.AFDXVirtualLink;
import net.sf.smbt.ezafdx.EzafdxPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AFDX Virtual Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXVirtualLinkImpl#getUdpSrcPort <em>Udp Src Port</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXVirtualLinkImpl#getIpSrc <em>Ip Src</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXVirtualLinkImpl#getVirtLnkID <em>Virt Lnk ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXVirtualLinkImpl#getIpDst <em>Ip Dst</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXVirtualLinkImpl#getUdpDestPort <em>Udp Dest Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AFDXVirtualLinkImpl extends CDOObjectImpl implements AFDXVirtualLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFDXVirtualLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzafdxPackage.Literals.AFDX_VIRTUAL_LINK;
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
	public int getUdpSrcPort() {
		return (Integer)eGet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__UDP_SRC_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUdpSrcPort(int newUdpSrcPort) {
		eSet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__UDP_SRC_PORT, newUdpSrcPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpSrc() {
		return (String)eGet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__IP_SRC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpSrc(String newIpSrc) {
		eSet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__IP_SRC, newIpSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVirtLnkID() {
		return (String)eGet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__VIRT_LNK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtLnkID(String newVirtLnkID) {
		eSet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__VIRT_LNK_ID, newVirtLnkID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpDst() {
		return (String)eGet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__IP_DST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpDst(String newIpDst) {
		eSet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__IP_DST, newIpDst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUdpDestPort() {
		return (String)eGet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__UDP_DEST_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUdpDestPort(String newUdpDestPort) {
		eSet(EzafdxPackage.Literals.AFDX_VIRTUAL_LINK__UDP_DEST_PORT, newUdpDestPort);
	}

} //AFDXVirtualLinkImpl
