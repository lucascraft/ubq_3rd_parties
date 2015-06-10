/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see net.sf.smbt.ezafdx.EzafdxFactory
 * @model kind="package"
 * @generated
 */
public interface EzafdxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezafdx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezafdx/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezafdx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzafdxPackage eINSTANCE = net.sf.smbt.ezafdx.impl.EzafdxPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl <em>AFDX Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezafdx.impl.AFDXFrameImpl
	 * @see net.sf.smbt.ezafdx.impl.EzafdxPackageImpl#getAFDXFrame()
	 * @generated
	 */
	int AFDX_FRAME = 0;

	/**
	 * The feature id for the '<em><b>Preamble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__PREAMBLE = 0;

	/**
	 * The feature id for the '<em><b>Sfd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__SFD = 1;

	/**
	 * The feature id for the '<em><b>Mac Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__MAC_DEST = 2;

	/**
	 * The feature id for the '<em><b>Mac Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__MAC_SRC = 3;

	/**
	 * The feature id for the '<em><b>Type IPv4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__TYPE_IPV4 = 4;

	/**
	 * The feature id for the '<em><b>Ip Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__IP_HEADER = 5;

	/**
	 * The feature id for the '<em><b>Udp Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__UDP_HEADER = 6;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__PAYLOAD = 7;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__PADDING = 8;

	/**
	 * The feature id for the '<em><b>Rsn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__RSN = 9;

	/**
	 * The feature id for the '<em><b>Fcn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__FCN = 10;

	/**
	 * The feature id for the '<em><b>Ifg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME__IFG = 11;

	/**
	 * The number of structural features of the '<em>AFDX Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_FRAME_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezafdx.impl.AFDXPayloadImpl <em>AFDX Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezafdx.impl.AFDXPayloadImpl
	 * @see net.sf.smbt.ezafdx.impl.EzafdxPackageImpl#getAFDXPayload()
	 * @generated
	 */
	int AFDX_PAYLOAD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_PAYLOAD__ID = CmdPackage.CMD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_PAYLOAD__NAME = CmdPackage.CMD__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_PAYLOAD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Vl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_PAYLOAD__VL = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_PAYLOAD__DATA = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AFDX Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_PAYLOAD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezafdx.impl.AFDXBundleImpl <em>AFDX Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezafdx.impl.AFDXBundleImpl
	 * @see net.sf.smbt.ezafdx.impl.EzafdxPackageImpl#getAFDXBundle()
	 * @generated
	 */
	int AFDX_BUNDLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_BUNDLE__ID = CmdPackage.CMD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_BUNDLE__NAME = CmdPackage.CMD__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_BUNDLE__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The number of structural features of the '<em>AFDX Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_BUNDLE_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezafdx.impl.AFDXVirtualLinkImpl <em>AFDX Virtual Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezafdx.impl.AFDXVirtualLinkImpl
	 * @see net.sf.smbt.ezafdx.impl.EzafdxPackageImpl#getAFDXVirtualLink()
	 * @generated
	 */
	int AFDX_VIRTUAL_LINK = 3;

	/**
	 * The feature id for the '<em><b>Udp Src Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_VIRTUAL_LINK__UDP_SRC_PORT = 0;

	/**
	 * The feature id for the '<em><b>Ip Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_VIRTUAL_LINK__IP_SRC = 1;

	/**
	 * The feature id for the '<em><b>Virt Lnk ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_VIRTUAL_LINK__VIRT_LNK_ID = 2;

	/**
	 * The feature id for the '<em><b>Ip Dst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_VIRTUAL_LINK__IP_DST = 3;

	/**
	 * The feature id for the '<em><b>Udp Dest Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_VIRTUAL_LINK__UDP_DEST_PORT = 4;

	/**
	 * The number of structural features of the '<em>AFDX Virtual Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_VIRTUAL_LINK_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezafdx.AFDXFrame <em>AFDX Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFDX Frame</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame
	 * @generated
	 */
	EClass getAFDXFrame();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getPreamble <em>Preamble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preamble</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getPreamble()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_Preamble();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getSfd <em>Sfd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sfd</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getSfd()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_Sfd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getMacDest <em>Mac Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Dest</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getMacDest()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_MacDest();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getMacSrc <em>Mac Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Src</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getMacSrc()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_MacSrc();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getTypeIPv4 <em>Type IPv4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type IPv4</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getTypeIPv4()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_TypeIPv4();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getIpHeader <em>Ip Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Header</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getIpHeader()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_IpHeader();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getUdpHeader <em>Udp Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Udp Header</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getUdpHeader()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_UdpHeader();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getPayload()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_Payload();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getPadding()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_Padding();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getRsn <em>Rsn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rsn</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getRsn()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_Rsn();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getFcn <em>Fcn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fcn</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getFcn()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_Fcn();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXFrame#getIfg <em>Ifg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifg</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXFrame#getIfg()
	 * @see #getAFDXFrame()
	 * @generated
	 */
	EAttribute getAFDXFrame_Ifg();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezafdx.AFDXPayload <em>AFDX Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFDX Payload</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXPayload
	 * @generated
	 */
	EClass getAFDXPayload();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezafdx.AFDXPayload#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXPayload#getData()
	 * @see #getAFDXPayload()
	 * @generated
	 */
	EReference getAFDXPayload_Data();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezafdx.AFDXPayload#getVl <em>Vl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vl</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXPayload#getVl()
	 * @see #getAFDXPayload()
	 * @generated
	 */
	EReference getAFDXPayload_Vl();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezafdx.AFDXBundle <em>AFDX Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFDX Bundle</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXBundle
	 * @generated
	 */
	EClass getAFDXBundle();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezafdx.AFDXVirtualLink <em>AFDX Virtual Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFDX Virtual Link</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXVirtualLink
	 * @generated
	 */
	EClass getAFDXVirtualLink();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getUdpSrcPort <em>Udp Src Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Udp Src Port</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXVirtualLink#getUdpSrcPort()
	 * @see #getAFDXVirtualLink()
	 * @generated
	 */
	EAttribute getAFDXVirtualLink_UdpSrcPort();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getIpSrc <em>Ip Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Src</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXVirtualLink#getIpSrc()
	 * @see #getAFDXVirtualLink()
	 * @generated
	 */
	EAttribute getAFDXVirtualLink_IpSrc();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getVirtLnkID <em>Virt Lnk ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virt Lnk ID</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXVirtualLink#getVirtLnkID()
	 * @see #getAFDXVirtualLink()
	 * @generated
	 */
	EAttribute getAFDXVirtualLink_VirtLnkID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getIpDst <em>Ip Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Dst</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXVirtualLink#getIpDst()
	 * @see #getAFDXVirtualLink()
	 * @generated
	 */
	EAttribute getAFDXVirtualLink_IpDst();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezafdx.AFDXVirtualLink#getUdpDestPort <em>Udp Dest Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Udp Dest Port</em>'.
	 * @see net.sf.smbt.ezafdx.AFDXVirtualLink#getUdpDestPort()
	 * @see #getAFDXVirtualLink()
	 * @generated
	 */
	EAttribute getAFDXVirtualLink_UdpDestPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzafdxFactory getEzafdxFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezafdx.impl.AFDXFrameImpl <em>AFDX Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezafdx.impl.AFDXFrameImpl
		 * @see net.sf.smbt.ezafdx.impl.EzafdxPackageImpl#getAFDXFrame()
		 * @generated
		 */
		EClass AFDX_FRAME = eINSTANCE.getAFDXFrame();

		/**
		 * The meta object literal for the '<em><b>Preamble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__PREAMBLE = eINSTANCE.getAFDXFrame_Preamble();

		/**
		 * The meta object literal for the '<em><b>Sfd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__SFD = eINSTANCE.getAFDXFrame_Sfd();

		/**
		 * The meta object literal for the '<em><b>Mac Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__MAC_DEST = eINSTANCE.getAFDXFrame_MacDest();

		/**
		 * The meta object literal for the '<em><b>Mac Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__MAC_SRC = eINSTANCE.getAFDXFrame_MacSrc();

		/**
		 * The meta object literal for the '<em><b>Type IPv4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__TYPE_IPV4 = eINSTANCE.getAFDXFrame_TypeIPv4();

		/**
		 * The meta object literal for the '<em><b>Ip Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__IP_HEADER = eINSTANCE.getAFDXFrame_IpHeader();

		/**
		 * The meta object literal for the '<em><b>Udp Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__UDP_HEADER = eINSTANCE.getAFDXFrame_UdpHeader();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__PAYLOAD = eINSTANCE.getAFDXFrame_Payload();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__PADDING = eINSTANCE.getAFDXFrame_Padding();

		/**
		 * The meta object literal for the '<em><b>Rsn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__RSN = eINSTANCE.getAFDXFrame_Rsn();

		/**
		 * The meta object literal for the '<em><b>Fcn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__FCN = eINSTANCE.getAFDXFrame_Fcn();

		/**
		 * The meta object literal for the '<em><b>Ifg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_FRAME__IFG = eINSTANCE.getAFDXFrame_Ifg();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezafdx.impl.AFDXPayloadImpl <em>AFDX Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezafdx.impl.AFDXPayloadImpl
		 * @see net.sf.smbt.ezafdx.impl.EzafdxPackageImpl#getAFDXPayload()
		 * @generated
		 */
		EClass AFDX_PAYLOAD = eINSTANCE.getAFDXPayload();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFDX_PAYLOAD__DATA = eINSTANCE.getAFDXPayload_Data();

		/**
		 * The meta object literal for the '<em><b>Vl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFDX_PAYLOAD__VL = eINSTANCE.getAFDXPayload_Vl();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezafdx.impl.AFDXBundleImpl <em>AFDX Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezafdx.impl.AFDXBundleImpl
		 * @see net.sf.smbt.ezafdx.impl.EzafdxPackageImpl#getAFDXBundle()
		 * @generated
		 */
		EClass AFDX_BUNDLE = eINSTANCE.getAFDXBundle();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezafdx.impl.AFDXVirtualLinkImpl <em>AFDX Virtual Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezafdx.impl.AFDXVirtualLinkImpl
		 * @see net.sf.smbt.ezafdx.impl.EzafdxPackageImpl#getAFDXVirtualLink()
		 * @generated
		 */
		EClass AFDX_VIRTUAL_LINK = eINSTANCE.getAFDXVirtualLink();

		/**
		 * The meta object literal for the '<em><b>Udp Src Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_VIRTUAL_LINK__UDP_SRC_PORT = eINSTANCE.getAFDXVirtualLink_UdpSrcPort();

		/**
		 * The meta object literal for the '<em><b>Ip Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_VIRTUAL_LINK__IP_SRC = eINSTANCE.getAFDXVirtualLink_IpSrc();

		/**
		 * The meta object literal for the '<em><b>Virt Lnk ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_VIRTUAL_LINK__VIRT_LNK_ID = eINSTANCE.getAFDXVirtualLink_VirtLnkID();

		/**
		 * The meta object literal for the '<em><b>Ip Dst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_VIRTUAL_LINK__IP_DST = eINSTANCE.getAFDXVirtualLink_IpDst();

		/**
		 * The meta object literal for the '<em><b>Udp Dest Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFDX_VIRTUAL_LINK__UDP_DEST_PORT = eINSTANCE.getAFDXVirtualLink_UdpDestPort();

	}

} //EzafdxPackage
