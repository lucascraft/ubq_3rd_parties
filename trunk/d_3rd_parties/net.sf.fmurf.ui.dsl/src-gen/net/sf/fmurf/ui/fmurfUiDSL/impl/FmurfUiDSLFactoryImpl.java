/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL.impl;

import net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum;
import net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum;
import net.sf.fmurf.ui.fmurfUiDSL.FMFFidKind;
import net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum;
import net.sf.fmurf.ui.fmurfUiDSL.FMFKind;
import net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum;
import net.sf.fmurf.ui.fmurfUiDSL.FMFSettings;
import net.sf.fmurf.ui.fmurfUiDSL.FMFUI;
import net.sf.fmurf.ui.fmurfUiDSL.Fiducial;
import net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLFactory;
import net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class FmurfUiDSLFactoryImpl extends EFactoryImpl implements FmurfUiDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FmurfUiDSLFactory init()
  {
    try
    {
      FmurfUiDSLFactory theFmurfUiDSLFactory = (FmurfUiDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/fmurf/ui/FmurfUiDSL"); 
      if (theFmurfUiDSLFactory != null)
      {
        return theFmurfUiDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FmurfUiDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FmurfUiDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FmurfUiDSLPackage.FMFUI: return createFMFUI();
      case FmurfUiDSLPackage.FIDUCIAL: return createFiducial();
      case FmurfUiDSLPackage.FMF_SETTINGS: return createFMFSettings();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FmurfUiDSLPackage.FMF_PROXIMA_VISIBLE_ENUM:
        return createFMFProximaVisibleEnumFromString(eDataType, initialValue);
      case FmurfUiDSLPackage.FMF_FID_STYLE_ENUM:
        return createFMFFidStyleEnumFromString(eDataType, initialValue);
      case FmurfUiDSLPackage.FMF_KIND:
        return createFMFKindFromString(eDataType, initialValue);
      case FmurfUiDSLPackage.FMF_FID_FUNCTION_ENUM:
        return createFMFFidFunctionEnumFromString(eDataType, initialValue);
      case FmurfUiDSLPackage.FMF_FID_KIND:
        return createFMFFidKindFromString(eDataType, initialValue);
      case FmurfUiDSLPackage.FMF_FID_COLOR_ENUM:
        return createFMFFidColorEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FmurfUiDSLPackage.FMF_PROXIMA_VISIBLE_ENUM:
        return convertFMFProximaVisibleEnumToString(eDataType, instanceValue);
      case FmurfUiDSLPackage.FMF_FID_STYLE_ENUM:
        return convertFMFFidStyleEnumToString(eDataType, instanceValue);
      case FmurfUiDSLPackage.FMF_KIND:
        return convertFMFKindToString(eDataType, instanceValue);
      case FmurfUiDSLPackage.FMF_FID_FUNCTION_ENUM:
        return convertFMFFidFunctionEnumToString(eDataType, instanceValue);
      case FmurfUiDSLPackage.FMF_FID_KIND:
        return convertFMFFidKindToString(eDataType, instanceValue);
      case FmurfUiDSLPackage.FMF_FID_COLOR_ENUM:
        return convertFMFFidColorEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFUI createFMFUI()
  {
    FMFUIImpl fmfui = new FMFUIImpl();
    return fmfui;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fiducial createFiducial()
  {
    FiducialImpl fiducial = new FiducialImpl();
    return fiducial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFSettings createFMFSettings()
  {
    FMFSettingsImpl fmfSettings = new FMFSettingsImpl();
    return fmfSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFProximaVisibleEnum createFMFProximaVisibleEnumFromString(EDataType eDataType, String initialValue)
  {
    FMFProximaVisibleEnum result = FMFProximaVisibleEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFMFProximaVisibleEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFFidStyleEnum createFMFFidStyleEnumFromString(EDataType eDataType, String initialValue)
  {
    FMFFidStyleEnum result = FMFFidStyleEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFMFFidStyleEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFKind createFMFKindFromString(EDataType eDataType, String initialValue)
  {
    FMFKind result = FMFKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFMFKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFFidFunctionEnum createFMFFidFunctionEnumFromString(EDataType eDataType, String initialValue)
  {
    FMFFidFunctionEnum result = FMFFidFunctionEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFMFFidFunctionEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFFidKind createFMFFidKindFromString(EDataType eDataType, String initialValue)
  {
    FMFFidKind result = FMFFidKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFMFFidKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFFidColorEnum createFMFFidColorEnumFromString(EDataType eDataType, String initialValue)
  {
    FMFFidColorEnum result = FMFFidColorEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFMFFidColorEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FmurfUiDSLPackage getFmurfUiDSLPackage()
  {
    return (FmurfUiDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FmurfUiDSLPackage getPackage()
  {
    return FmurfUiDSLPackage.eINSTANCE;
  }

} //FmurfUiDSLFactoryImpl
