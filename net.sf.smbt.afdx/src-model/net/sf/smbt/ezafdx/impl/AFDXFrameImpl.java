/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx.impl;

import net.sf.smbt.ezafdx.AFDXFrame;
import net.sf.smbt.ezafdx.EzafdxPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AFDX Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getSfd <em>Sfd</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getMacDest <em>Mac Dest</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getMacSrc <em>Mac Src</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getTypeIPv4 <em>Type IPv4</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getIpHeader <em>Ip Header</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getUdpHeader <em>Udp Header</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getRsn <em>Rsn</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getFcn <em>Fcn</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl#getIfg <em>Ifg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AFDXFrameImpl extends CDOObjectImpl implements AFDXFrame {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFDXFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzafdxPackage.Literals.AFDX_FRAME;
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
	public byte[] getPreamble() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__PREAMBLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreamble(byte[] newPreamble) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__PREAMBLE, newPreamble);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getSfd() {
		return (Byte)eGet(EzafdxPackage.Literals.AFDX_FRAME__SFD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfd(byte newSfd) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__SFD, newSfd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMacDest() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__MAC_DEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacDest(byte[] newMacDest) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__MAC_DEST, newMacDest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMacSrc() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__MAC_SRC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacSrc(byte[] newMacSrc) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__MAC_SRC, newMacSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getTypeIPv4() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__TYPE_IPV4, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeIPv4(byte[] newTypeIPv4) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__TYPE_IPV4, newTypeIPv4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getIpHeader() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__IP_HEADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpHeader(byte[] newIpHeader) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__IP_HEADER, newIpHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getUdpHeader() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__UDP_HEADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUdpHeader(byte[] newUdpHeader) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__UDP_HEADER, newUdpHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPayload() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__PAYLOAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayload(byte[] newPayload) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__PAYLOAD, newPayload);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPadding() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__PADDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding(byte[] newPadding) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__PADDING, newPadding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getRsn() {
		return (Byte)eGet(EzafdxPackage.Literals.AFDX_FRAME__RSN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRsn(byte newRsn) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__RSN, newRsn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getFcn() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__FCN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFcn(byte[] newFcn) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__FCN, newFcn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getIfg() {
		return (byte[])eGet(EzafdxPackage.Literals.AFDX_FRAME__IFG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfg(byte[] newIfg) {
		eSet(EzafdxPackage.Literals.AFDX_FRAME__IFG, newIfg);
	}

} //AFDXFrameImpl
