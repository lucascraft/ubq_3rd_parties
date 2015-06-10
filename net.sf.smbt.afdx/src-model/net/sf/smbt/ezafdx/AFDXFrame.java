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
 * A representation of the model object '<em><b>AFDX Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getSfd <em>Sfd</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getMacDest <em>Mac Dest</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getMacSrc <em>Mac Src</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getTypeIPv4 <em>Type IPv4</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getIpHeader <em>Ip Header</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getUdpHeader <em>Udp Header</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getPayload <em>Payload</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getPadding <em>Padding</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getRsn <em>Rsn</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getFcn <em>Fcn</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXFrame#getIfg <em>Ifg</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AFDXFrame extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Preamble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preamble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preamble</em>' attribute.
	 * @see #setPreamble(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_Preamble()
	 * @model
	 * @generated
	 */
	byte[] getPreamble();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getPreamble <em>Preamble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preamble</em>' attribute.
	 * @see #getPreamble()
	 * @generated
	 */
	void setPreamble(byte[] value);

	/**
	 * Returns the value of the '<em><b>Sfd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sfd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sfd</em>' attribute.
	 * @see #setSfd(byte)
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_Sfd()
	 * @model
	 * @generated
	 */
	byte getSfd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getSfd <em>Sfd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sfd</em>' attribute.
	 * @see #getSfd()
	 * @generated
	 */
	void setSfd(byte value);

	/**
	 * Returns the value of the '<em><b>Mac Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac Dest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac Dest</em>' attribute.
	 * @see #setMacDest(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_MacDest()
	 * @model
	 * @generated
	 */
	byte[] getMacDest();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getMacDest <em>Mac Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Dest</em>' attribute.
	 * @see #getMacDest()
	 * @generated
	 */
	void setMacDest(byte[] value);

	/**
	 * Returns the value of the '<em><b>Mac Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac Src</em>' attribute.
	 * @see #setMacSrc(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_MacSrc()
	 * @model
	 * @generated
	 */
	byte[] getMacSrc();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getMacSrc <em>Mac Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Src</em>' attribute.
	 * @see #getMacSrc()
	 * @generated
	 */
	void setMacSrc(byte[] value);

	/**
	 * Returns the value of the '<em><b>Type IPv4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type IPv4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type IPv4</em>' attribute.
	 * @see #setTypeIPv4(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_TypeIPv4()
	 * @model
	 * @generated
	 */
	byte[] getTypeIPv4();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getTypeIPv4 <em>Type IPv4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type IPv4</em>' attribute.
	 * @see #getTypeIPv4()
	 * @generated
	 */
	void setTypeIPv4(byte[] value);

	/**
	 * Returns the value of the '<em><b>Ip Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Header</em>' attribute.
	 * @see #setIpHeader(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_IpHeader()
	 * @model
	 * @generated
	 */
	byte[] getIpHeader();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getIpHeader <em>Ip Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Header</em>' attribute.
	 * @see #getIpHeader()
	 * @generated
	 */
	void setIpHeader(byte[] value);

	/**
	 * Returns the value of the '<em><b>Udp Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udp Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udp Header</em>' attribute.
	 * @see #setUdpHeader(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_UdpHeader()
	 * @model
	 * @generated
	 */
	byte[] getUdpHeader();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getUdpHeader <em>Udp Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udp Header</em>' attribute.
	 * @see #getUdpHeader()
	 * @generated
	 */
	void setUdpHeader(byte[] value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' attribute.
	 * @see #setPayload(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_Payload()
	 * @model
	 * @generated
	 */
	byte[] getPayload();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getPayload <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' attribute.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(byte[] value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' attribute.
	 * @see #setPadding(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_Padding()
	 * @model
	 * @generated
	 */
	byte[] getPadding();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' attribute.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(byte[] value);

	/**
	 * Returns the value of the '<em><b>Rsn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rsn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rsn</em>' attribute.
	 * @see #setRsn(byte)
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_Rsn()
	 * @model
	 * @generated
	 */
	byte getRsn();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getRsn <em>Rsn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rsn</em>' attribute.
	 * @see #getRsn()
	 * @generated
	 */
	void setRsn(byte value);

	/**
	 * Returns the value of the '<em><b>Fcn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fcn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fcn</em>' attribute.
	 * @see #setFcn(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_Fcn()
	 * @model
	 * @generated
	 */
	byte[] getFcn();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getFcn <em>Fcn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fcn</em>' attribute.
	 * @see #getFcn()
	 * @generated
	 */
	void setFcn(byte[] value);

	/**
	 * Returns the value of the '<em><b>Ifg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifg</em>' attribute.
	 * @see #setIfg(byte[])
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXFrame_Ifg()
	 * @model
	 * @generated
	 */
	byte[] getIfg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXFrame#getIfg <em>Ifg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifg</em>' attribute.
	 * @see #getIfg()
	 * @generated
	 */
	void setIfg(byte[] value);

} // AFDXFrame
