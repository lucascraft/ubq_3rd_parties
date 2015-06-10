/**
 * <copyright>
 * </copyright>
 *
 * $Id: ColorsFactoryImpl.java,v 1.1 2008/12/28 12:22:56 lucascraft Exp $
 */
package net.sf.smbt.model.colors.impl;

import net.sf.smbt.model.colors.ColorsFactory;
import net.sf.smbt.model.colors.ColorsPackage;
import net.sf.smbt.model.colors.HSB;
import net.sf.smbt.model.colors.RGB;

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
public class ColorsFactoryImpl extends EFactoryImpl implements ColorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColorsFactory init() {
		try {
			ColorsFactory theColorsFactory = (ColorsFactory)EPackage.Registry.INSTANCE.getEFactory("http://net.sf.smbt/colors/1.0.0"); 
			if (theColorsFactory != null) {
				return theColorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ColorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorsFactoryImpl() {
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
			case ColorsPackage.HSB: return createHSB();
			case ColorsPackage.RGB: return createRGB();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSB createHSB() {
		HSBImpl hsb = new HSBImpl();
		return hsb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGB createRGB() {
		RGBImpl rgb = new RGBImpl();
		return rgb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorsPackage getColorsPackage() {
		return (ColorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ColorsPackage getPackage() {
		return ColorsPackage.eINSTANCE;
	}

} //ColorsFactoryImpl
