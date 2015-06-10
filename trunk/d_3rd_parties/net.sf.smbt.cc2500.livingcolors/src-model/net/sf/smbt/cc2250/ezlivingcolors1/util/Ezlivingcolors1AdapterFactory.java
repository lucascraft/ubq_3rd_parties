/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.util;

import net.sf.smbt.cc2250.ezlivingcolors1.*;
import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivinColorsClearLampsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCheckAddressCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsInitCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsLearnLampsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnOffLampCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package
 * @generated
 */
public class Ezlivingcolors1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ezlivingcolors1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ezlivingcolors1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ezlivingcolors1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ezlivingcolors1Switch<Adapter> modelSwitch =
		new Ezlivingcolors1Switch<Adapter>() {
			@Override
			public Adapter caseLivingColorsSetRGBCmd(LivingColorsSetRGBCmd object) {
				return createLivingColorsSetRGBCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsSetHSVCmd(LivingColorsSetHSVCmd object) {
				return createLivingColorsSetHSVCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsInitCmd(LivingColorsInitCmd object) {
				return createLivingColorsInitCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsGetMaxNumLampsCmd(LivingColorsGetMaxNumLampsCmd object) {
				return createLivingColorsGetMaxNumLampsCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsAddLampCmd(LivingColorsAddLampCmd object) {
				return createLivingColorsAddLampCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsLearnLampsCmd(LivingColorsLearnLampsCmd object) {
				return createLivingColorsLearnLampsCmdAdapter();
			}
			@Override
			public Adapter caseLivinColorsClearLampsCmd(LivinColorsClearLampsCmd object) {
				return createLivinColorsClearLampsCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsTurnLampOnRGBCmd(LivingColorsTurnLampOnRGBCmd object) {
				return createLivingColorsTurnLampOnRGBCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsTurnLampOnHSVCmd(LivingColorsTurnLampOnHSVCmd object) {
				return createLivingColorsTurnLampOnHSVCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsTurnOffLampCmd(LivingColorsTurnOffLampCmd object) {
				return createLivingColorsTurnOffLampCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsSetAddressCmd(LivingColorsSetAddressCmd object) {
				return createLivingColorsSetAddressCmdAdapter();
			}
			@Override
			public Adapter caseLiivngColorsSendCommandCmd(LiivngColorsSendCommandCmd object) {
				return createLiivngColorsSendCommandCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsCmd(LivingColorsCmd object) {
				return createLivingColorsCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsCheckAddressCmd(LivingColorsCheckAddressCmd object) {
				return createLivingColorsCheckAddressCmdAdapter();
			}
			@Override
			public Adapter caseLivingColorsGetLampCmd(LivingColorsGetLampCmd object) {
				return createLivingColorsGetLampCmdAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd <em>Living Colors Set RGB Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd
	 * @generated
	 */
	public Adapter createLivingColorsSetRGBCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd <em>Living Colors Set HSV Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd
	 * @generated
	 */
	public Adapter createLivingColorsSetHSVCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsInitCmd <em>Living Colors Init Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsInitCmd
	 * @generated
	 */
	public Adapter createLivingColorsInitCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd <em>Living Colors Get Max Num Lamps Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetMaxNumLampsCmd
	 * @generated
	 */
	public Adapter createLivingColorsGetMaxNumLampsCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd <em>Living Colors Add Lamp Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd
	 * @generated
	 */
	public Adapter createLivingColorsAddLampCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd <em>Living Colors Get Lamp Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsGetLampCmd
	 * @generated
	 */
	public Adapter createLivingColorsGetLampCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsLearnLampsCmd <em>Living Colors Learn Lamps Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsLearnLampsCmd
	 * @generated
	 */
	public Adapter createLivingColorsLearnLampsCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivinColorsClearLampsCmd <em>Livin Colors Clear Lamps Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivinColorsClearLampsCmd
	 * @generated
	 */
	public Adapter createLivinColorsClearLampsCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd <em>Living Colors Turn Lamp On RGB Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd
	 * @generated
	 */
	public Adapter createLivingColorsTurnLampOnRGBCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd <em>Living Colors Turn Lamp On HSV Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnHSVCmd
	 * @generated
	 */
	public Adapter createLivingColorsTurnLampOnHSVCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnOffLampCmd <em>Living Colors Turn Off Lamp Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnOffLampCmd
	 * @generated
	 */
	public Adapter createLivingColorsTurnOffLampCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd <em>Living Colors Set Address Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd
	 * @generated
	 */
	public Adapter createLivingColorsSetAddressCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd <em>Liivng Colors Send Command Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LiivngColorsSendCommandCmd
	 * @generated
	 */
	public Adapter createLiivngColorsSendCommandCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd <em>Living Colors Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd
	 * @generated
	 */
	public Adapter createLivingColorsCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCheckAddressCmd <em>Living Colors Check Address Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCheckAddressCmd
	 * @generated
	 */
	public Adapter createLivingColorsCheckAddressCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Ezlivingcolors1AdapterFactory
