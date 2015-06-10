/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdxtopology.impl;

import net.sf.smbt.ezafdxtopology.*;

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
public class EzafdxtopologyFactoryImpl extends EFactoryImpl implements EzafdxtopologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzafdxtopologyFactory init() {
		try {
			EzafdxtopologyFactory theEzafdxtopologyFactory = (EzafdxtopologyFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezafdxtopology/1.0"); 
			if (theEzafdxtopologyFactory != null) {
				return theEzafdxtopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzafdxtopologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzafdxtopologyFactoryImpl() {
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
			case EzafdxtopologyPackage.AFDX_TOPOLOGY: return (EObject)createAFDXTopology();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFDXTopology createAFDXTopology() {
		AFDXTopologyImpl afdxTopology = new AFDXTopologyImpl();
		return afdxTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzafdxtopologyPackage getEzafdxtopologyPackage() {
		return (EzafdxtopologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzafdxtopologyPackage getPackage() {
		return EzafdxtopologyPackage.eINSTANCE;
	}

} //EzafdxtopologyFactoryImpl
