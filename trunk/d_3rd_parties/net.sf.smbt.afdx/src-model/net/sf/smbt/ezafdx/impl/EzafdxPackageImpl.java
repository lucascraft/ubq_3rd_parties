/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx.impl;

import net.sf.smbt.ezafdx.AFDXBundle;
import net.sf.smbt.ezafdx.AFDXFrame;
import net.sf.smbt.ezafdx.AFDXPayload;
import net.sf.smbt.ezafdx.AFDXVirtualLink;
import net.sf.smbt.ezafdx.EzafdxFactory;
import net.sf.smbt.ezafdx.EzafdxPackage;

import net.sf.smbt.ezafdxtopology.EzafdxtopologyPackage;

import net.sf.smbt.ezafdxtopology.impl.EzafdxtopologyPackageImpl;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzafdxPackageImpl extends EPackageImpl implements EzafdxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afdxFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afdxPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afdxBundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afdxVirtualLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzafdxPackageImpl() {
		super(eNS_URI, EzafdxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzafdxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzafdxPackage init() {
		if (isInited) return (EzafdxPackage)EPackage.Registry.INSTANCE.getEPackage(EzafdxPackage.eNS_URI);

		// Obtain or create and register package
		EzafdxPackageImpl theEzafdxPackage = (EzafdxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzafdxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzafdxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EzafdxtopologyPackageImpl theEzafdxtopologyPackage = (EzafdxtopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EzafdxtopologyPackage.eNS_URI) instanceof EzafdxtopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EzafdxtopologyPackage.eNS_URI) : EzafdxtopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theEzafdxPackage.createPackageContents();
		theEzafdxtopologyPackage.createPackageContents();

		// Initialize created meta-data
		theEzafdxPackage.initializePackageContents();
		theEzafdxtopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzafdxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzafdxPackage.eNS_URI, theEzafdxPackage);
		return theEzafdxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFDXFrame() {
		return afdxFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_Preamble() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_Sfd() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_MacDest() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_MacSrc() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_TypeIPv4() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_IpHeader() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_UdpHeader() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_Payload() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_Padding() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_Rsn() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_Fcn() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXFrame_Ifg() {
		return (EAttribute)afdxFrameEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFDXPayload() {
		return afdxPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFDXPayload_Data() {
		return (EReference)afdxPayloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFDXPayload_Vl() {
		return (EReference)afdxPayloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFDXBundle() {
		return afdxBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFDXVirtualLink() {
		return afdxVirtualLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXVirtualLink_UdpSrcPort() {
		return (EAttribute)afdxVirtualLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXVirtualLink_IpSrc() {
		return (EAttribute)afdxVirtualLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXVirtualLink_VirtLnkID() {
		return (EAttribute)afdxVirtualLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXVirtualLink_IpDst() {
		return (EAttribute)afdxVirtualLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFDXVirtualLink_UdpDestPort() {
		return (EAttribute)afdxVirtualLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzafdxFactory getEzafdxFactory() {
		return (EzafdxFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		afdxFrameEClass = createEClass(AFDX_FRAME);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__PREAMBLE);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__SFD);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__MAC_DEST);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__MAC_SRC);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__TYPE_IPV4);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__IP_HEADER);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__UDP_HEADER);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__PAYLOAD);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__PADDING);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__RSN);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__FCN);
		createEAttribute(afdxFrameEClass, AFDX_FRAME__IFG);

		afdxPayloadEClass = createEClass(AFDX_PAYLOAD);
		createEReference(afdxPayloadEClass, AFDX_PAYLOAD__VL);
		createEReference(afdxPayloadEClass, AFDX_PAYLOAD__DATA);

		afdxBundleEClass = createEClass(AFDX_BUNDLE);

		afdxVirtualLinkEClass = createEClass(AFDX_VIRTUAL_LINK);
		createEAttribute(afdxVirtualLinkEClass, AFDX_VIRTUAL_LINK__UDP_SRC_PORT);
		createEAttribute(afdxVirtualLinkEClass, AFDX_VIRTUAL_LINK__IP_SRC);
		createEAttribute(afdxVirtualLinkEClass, AFDX_VIRTUAL_LINK__VIRT_LNK_ID);
		createEAttribute(afdxVirtualLinkEClass, AFDX_VIRTUAL_LINK__IP_DST);
		createEAttribute(afdxVirtualLinkEClass, AFDX_VIRTUAL_LINK__UDP_DEST_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		afdxPayloadEClass.getESuperTypes().add(theCmdPackage.getCmd());
		afdxBundleEClass.getESuperTypes().add(theCmdPackage.getCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(afdxFrameEClass, AFDXFrame.class, "AFDXFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAFDXFrame_Preamble(), ecorePackage.getEByteArray(), "preamble", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_Sfd(), ecorePackage.getEByte(), "sfd", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_MacDest(), ecorePackage.getEByteArray(), "macDest", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_MacSrc(), ecorePackage.getEByteArray(), "macSrc", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_TypeIPv4(), ecorePackage.getEByteArray(), "typeIPv4", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_IpHeader(), ecorePackage.getEByteArray(), "ipHeader", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_UdpHeader(), ecorePackage.getEByteArray(), "udpHeader", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_Payload(), ecorePackage.getEByteArray(), "payload", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_Padding(), ecorePackage.getEByteArray(), "padding", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_Rsn(), ecorePackage.getEByte(), "rsn", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_Fcn(), ecorePackage.getEByteArray(), "fcn", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXFrame_Ifg(), ecorePackage.getEByteArray(), "ifg", null, 0, 1, AFDXFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afdxPayloadEClass, AFDXPayload.class, "AFDXPayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAFDXPayload_Vl(), this.getAFDXVirtualLink(), null, "vl", null, 0, 1, AFDXPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAFDXPayload_Data(), this.getAFDXFrame(), null, "data", null, 0, 1, AFDXPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afdxBundleEClass, AFDXBundle.class, "AFDXBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(afdxBundleEClass, null, "getData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(afdxVirtualLinkEClass, AFDXVirtualLink.class, "AFDXVirtualLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAFDXVirtualLink_UdpSrcPort(), ecorePackage.getEInt(), "udpSrcPort", null, 0, 1, AFDXVirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXVirtualLink_IpSrc(), ecorePackage.getEString(), "ipSrc", null, 0, 1, AFDXVirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXVirtualLink_VirtLnkID(), ecorePackage.getEString(), "virtLnkID", null, 0, 1, AFDXVirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXVirtualLink_IpDst(), ecorePackage.getEString(), "ipDst", null, 0, 1, AFDXVirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFDXVirtualLink_UdpDestPort(), ecorePackage.getEString(), "udpDestPort", null, 0, 1, AFDXVirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EzafdxPackageImpl
