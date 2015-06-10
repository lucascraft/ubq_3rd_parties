/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFDX Virtual Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getUdpSrcPort <em>Udp Src Port</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getIpSrc <em>Ip Src</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getVirtLnkID <em>Virt Lnk ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getIpDst <em>Ip Dst</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getUdpDestPort <em>Udp Dest Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXVirtualLink()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AFDXVirtualLink extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Udp Src Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udp Src Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udp Src Port</em>' attribute.
	 * @see #setUdpSrcPort(int)
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXVirtualLink_UdpSrcPort()
	 * @model
	 * @generated
	 */
	int getUdpSrcPort();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getUdpSrcPort <em>Udp Src Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udp Src Port</em>' attribute.
	 * @see #getUdpSrcPort()
	 * @generated
	 */
	void setUdpSrcPort(int value);

	/**
	 * Returns the value of the '<em><b>Ip Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Src</em>' attribute.
	 * @see #setIpSrc(String)
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXVirtualLink_IpSrc()
	 * @model
	 * @generated
	 */
	String getIpSrc();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getIpSrc <em>Ip Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Src</em>' attribute.
	 * @see #getIpSrc()
	 * @generated
	 */
	void setIpSrc(String value);

	/**
	 * Returns the value of the '<em><b>Virt Lnk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virt Lnk ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virt Lnk ID</em>' attribute.
	 * @see #setVirtLnkID(String)
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXVirtualLink_VirtLnkID()
	 * @model
	 * @generated
	 */
	String getVirtLnkID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getVirtLnkID <em>Virt Lnk ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virt Lnk ID</em>' attribute.
	 * @see #getVirtLnkID()
	 * @generated
	 */
	void setVirtLnkID(String value);

	/**
	 * Returns the value of the '<em><b>Ip Dst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Dst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Dst</em>' attribute.
	 * @see #setIpDst(String)
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXVirtualLink_IpDst()
	 * @model
	 * @generated
	 */
	String getIpDst();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getIpDst <em>Ip Dst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Dst</em>' attribute.
	 * @see #getIpDst()
	 * @generated
	 */
	void setIpDst(String value);

	/**
	 * Returns the value of the '<em><b>Udp Dest Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udp Dest Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udp Dest Port</em>' attribute.
	 * @see #setUdpDestPort(String)
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXVirtualLink_UdpDestPort()
	 * @model
	 * @generated
	 */
	String getUdpDestPort();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getUdpDestPort <em>Udp Dest Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udp Dest Port</em>' attribute.
	 * @see #getUdpDestPort()
	 * @generated
	 */
	void setUdpDestPort(String value);

} // AFDXVirtualLink
