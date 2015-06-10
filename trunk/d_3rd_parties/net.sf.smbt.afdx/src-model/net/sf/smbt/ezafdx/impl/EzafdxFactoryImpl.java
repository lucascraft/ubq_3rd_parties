/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx.impl;

import net.sf.smbt.ezafdx.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzafdxFactoryImpl extends EFactoryImpl implements EzafdxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzafdxFactory init() {
		try {
			EzafdxFactory theEzafdxFactory = (EzafdxFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezafdx/1.0"); 
			if (theEzafdxFactory != null) {
				return theEzafdxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzafdxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzafdxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzafdxPackage.AFDX_FRAME: return (EObject)createAFDXFrame();
			case EzafdxPackage.AFDX_PAYLOAD: return (EObject)createAFDXPayload();
			case EzafdxPackage.AFDX_BUNDLE: return (EObject)createAFDXBundle();
			case EzafdxPackage.AFDX_VIRTUAL_LINK: return (EObject)createAFDXVirtualLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFDXFrame createAFDXFrame() {
		AFDXFrameImpl afdxFrame = new AFDXFrameImpl();
		return afdxFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFDXPayload createAFDXPayload() {
		AFDXPayloadImpl afdxPayload = new AFDXPayloadImpl();
		return afdxPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFDXBundle createAFDXBundle() {
		AFDXBundleImpl afdxBundle = new AFDXBundleImpl();
		return afdxBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFDXVirtualLink createAFDXVirtualLink() {
		AFDXVirtualLinkImpl afdxVirtualLink = new AFDXVirtualLinkImpl();
		return afdxVirtualLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzafdxPackage getEzafdxPackage() {
		return (EzafdxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzafdxPackage getPackage() {
		return EzafdxPackage.eINSTANCE;
	}

} //EzafdxFactoryImpl
