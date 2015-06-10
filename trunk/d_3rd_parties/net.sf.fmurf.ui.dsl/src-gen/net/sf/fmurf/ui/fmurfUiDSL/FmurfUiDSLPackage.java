/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLFactory
 * @model kind="package"
 * @generated
 */
public interface FmurfUiDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fmurfUiDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sf.net/fmurf/ui/FmurfUiDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fmurfUiDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FmurfUiDSLPackage eINSTANCE = net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFUIImpl <em>FMFUI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FMFUIImpl
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFUI()
   * @generated
   */
  int FMFUI = 0;

  /**
   * The feature id for the '<em><b>Settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMFUI__SETTINGS = 0;

  /**
   * The feature id for the '<em><b>Fiducials</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMFUI__FIDUCIALS = 1;

  /**
   * The number of structural features of the '<em>FMFUI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMFUI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl <em>Fiducial</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFiducial()
   * @generated
   */
  int FIDUCIAL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__UID = 1;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__STYLE = 2;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__KIND = 3;

  /**
   * The feature id for the '<em><b>Fg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__FG = 4;

  /**
   * The feature id for the '<em><b>Bg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__BG = 5;

  /**
   * The feature id for the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__RADIUS = 6;

  /**
   * The feature id for the '<em><b>Proxima</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__PROXIMA = 7;

  /**
   * The feature id for the '<em><b>Proxima Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__PROXIMA_VISIBLE = 8;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__FUNCTION = 9;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL__RANGE = 10;

  /**
   * The number of structural features of the '<em>Fiducial</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIDUCIAL_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl <em>FMF Settings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFSettings()
   * @generated
   */
  int FMF_SETTINGS = 2;

  /**
   * The feature id for the '<em><b>Osc Receive Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMF_SETTINGS__OSC_RECEIVE_PORT = 0;

  /**
   * The feature id for the '<em><b>Osc Send Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMF_SETTINGS__OSC_SEND_ADDRESS = 1;

  /**
   * The feature id for the '<em><b>Osc Send Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMF_SETTINGS__OSC_SEND_PORT = 2;

  /**
   * The feature id for the '<em><b>Tuio Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMF_SETTINGS__TUIO_PORT = 3;

  /**
   * The feature id for the '<em><b>Live Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMF_SETTINGS__LIVE_RATE = 4;

  /**
   * The feature id for the '<em><b>Processing Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMF_SETTINGS__PROCESSING_RATE = 5;

  /**
   * The number of structural features of the '<em>FMF Settings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FMF_SETTINGS_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum <em>FMF Proxima Visible Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFProximaVisibleEnum()
   * @generated
   */
  int FMF_PROXIMA_VISIBLE_ENUM = 3;

  /**
   * The meta object id for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum <em>FMF Fid Style Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFFidStyleEnum()
   * @generated
   */
  int FMF_FID_STYLE_ENUM = 4;

  /**
   * The meta object id for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFKind <em>FMF Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFKind
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFKind()
   * @generated
   */
  int FMF_KIND = 5;

  /**
   * The meta object id for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum <em>FMF Fid Function Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFFidFunctionEnum()
   * @generated
   */
  int FMF_FID_FUNCTION_ENUM = 6;

  /**
   * The meta object id for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidKind <em>FMF Fid Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidKind
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFFidKind()
   * @generated
   */
  int FMF_FID_KIND = 7;

  /**
   * The meta object id for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum <em>FMF Fid Color Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum
   * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFFidColorEnum()
   * @generated
   */
  int FMF_FID_COLOR_ENUM = 8;


  /**
   * Returns the meta object for class '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFUI <em>FMFUI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FMFUI</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFUI
   * @generated
   */
  EClass getFMFUI();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFUI#getSettings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Settings</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFUI#getSettings()
   * @see #getFMFUI()
   * @generated
   */
  EReference getFMFUI_Settings();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFUI#getFiducials <em>Fiducials</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fiducials</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFUI#getFiducials()
   * @see #getFMFUI()
   * @generated
   */
  EReference getFMFUI_Fiducials();

  /**
   * Returns the meta object for class '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial <em>Fiducial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fiducial</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial
   * @generated
   */
  EClass getFiducial();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getName()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getUid()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Uid();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getStyle()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Style();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getKind()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Kind();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getFg <em>Fg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fg</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getFg()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Fg();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getBg <em>Bg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bg</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getBg()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Bg();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getRadius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radius</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getRadius()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Radius();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getProxima <em>Proxima</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proxima</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getProxima()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Proxima();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getProximaVisible <em>Proxima Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proxima Visible</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getProximaVisible()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_ProximaVisible();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getFunction()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Function();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getRange()
   * @see #getFiducial()
   * @generated
   */
  EAttribute getFiducial_Range();

  /**
   * Returns the meta object for class '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings <em>FMF Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FMF Settings</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFSettings
   * @generated
   */
  EClass getFMFSettings();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscReceivePort <em>Osc Receive Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Osc Receive Port</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscReceivePort()
   * @see #getFMFSettings()
   * @generated
   */
  EAttribute getFMFSettings_OscReceivePort();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscSendAddress <em>Osc Send Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Osc Send Address</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscSendAddress()
   * @see #getFMFSettings()
   * @generated
   */
  EAttribute getFMFSettings_OscSendAddress();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscSendPort <em>Osc Send Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Osc Send Port</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscSendPort()
   * @see #getFMFSettings()
   * @generated
   */
  EAttribute getFMFSettings_OscSendPort();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getTuioPort <em>Tuio Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tuio Port</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getTuioPort()
   * @see #getFMFSettings()
   * @generated
   */
  EAttribute getFMFSettings_TuioPort();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getLiveRate <em>Live Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Live Rate</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getLiveRate()
   * @see #getFMFSettings()
   * @generated
   */
  EAttribute getFMFSettings_LiveRate();

  /**
   * Returns the meta object for the attribute '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getProcessingRate <em>Processing Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processing Rate</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getProcessingRate()
   * @see #getFMFSettings()
   * @generated
   */
  EAttribute getFMFSettings_ProcessingRate();

  /**
   * Returns the meta object for enum '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum <em>FMF Proxima Visible Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>FMF Proxima Visible Enum</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum
   * @generated
   */
  EEnum getFMFProximaVisibleEnum();

  /**
   * Returns the meta object for enum '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum <em>FMF Fid Style Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>FMF Fid Style Enum</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum
   * @generated
   */
  EEnum getFMFFidStyleEnum();

  /**
   * Returns the meta object for enum '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFKind <em>FMF Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>FMF Kind</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFKind
   * @generated
   */
  EEnum getFMFKind();

  /**
   * Returns the meta object for enum '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum <em>FMF Fid Function Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>FMF Fid Function Enum</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum
   * @generated
   */
  EEnum getFMFFidFunctionEnum();

  /**
   * Returns the meta object for enum '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidKind <em>FMF Fid Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>FMF Fid Kind</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidKind
   * @generated
   */
  EEnum getFMFFidKind();

  /**
   * Returns the meta object for enum '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum <em>FMF Fid Color Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>FMF Fid Color Enum</em>'.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum
   * @generated
   */
  EEnum getFMFFidColorEnum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FmurfUiDSLFactory getFmurfUiDSLFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFUIImpl <em>FMFUI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FMFUIImpl
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFUI()
     * @generated
     */
    EClass FMFUI = eINSTANCE.getFMFUI();

    /**
     * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FMFUI__SETTINGS = eINSTANCE.getFMFUI_Settings();

    /**
     * The meta object literal for the '<em><b>Fiducials</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FMFUI__FIDUCIALS = eINSTANCE.getFMFUI_Fiducials();

    /**
     * The meta object literal for the '{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl <em>Fiducial</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFiducial()
     * @generated
     */
    EClass FIDUCIAL = eINSTANCE.getFiducial();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__NAME = eINSTANCE.getFiducial_Name();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__UID = eINSTANCE.getFiducial_Uid();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__STYLE = eINSTANCE.getFiducial_Style();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__KIND = eINSTANCE.getFiducial_Kind();

    /**
     * The meta object literal for the '<em><b>Fg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__FG = eINSTANCE.getFiducial_Fg();

    /**
     * The meta object literal for the '<em><b>Bg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__BG = eINSTANCE.getFiducial_Bg();

    /**
     * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__RADIUS = eINSTANCE.getFiducial_Radius();

    /**
     * The meta object literal for the '<em><b>Proxima</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__PROXIMA = eINSTANCE.getFiducial_Proxima();

    /**
     * The meta object literal for the '<em><b>Proxima Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__PROXIMA_VISIBLE = eINSTANCE.getFiducial_ProximaVisible();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__FUNCTION = eINSTANCE.getFiducial_Function();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIDUCIAL__RANGE = eINSTANCE.getFiducial_Range();

    /**
     * The meta object literal for the '{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl <em>FMF Settings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFSettings()
     * @generated
     */
    EClass FMF_SETTINGS = eINSTANCE.getFMFSettings();

    /**
     * The meta object literal for the '<em><b>Osc Receive Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FMF_SETTINGS__OSC_RECEIVE_PORT = eINSTANCE.getFMFSettings_OscReceivePort();

    /**
     * The meta object literal for the '<em><b>Osc Send Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FMF_SETTINGS__OSC_SEND_ADDRESS = eINSTANCE.getFMFSettings_OscSendAddress();

    /**
     * The meta object literal for the '<em><b>Osc Send Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FMF_SETTINGS__OSC_SEND_PORT = eINSTANCE.getFMFSettings_OscSendPort();

    /**
     * The meta object literal for the '<em><b>Tuio Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FMF_SETTINGS__TUIO_PORT = eINSTANCE.getFMFSettings_TuioPort();

    /**
     * The meta object literal for the '<em><b>Live Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FMF_SETTINGS__LIVE_RATE = eINSTANCE.getFMFSettings_LiveRate();

    /**
     * The meta object literal for the '<em><b>Processing Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FMF_SETTINGS__PROCESSING_RATE = eINSTANCE.getFMFSettings_ProcessingRate();

    /**
     * The meta object literal for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum <em>FMF Proxima Visible Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFProximaVisibleEnum()
     * @generated
     */
    EEnum FMF_PROXIMA_VISIBLE_ENUM = eINSTANCE.getFMFProximaVisibleEnum();

    /**
     * The meta object literal for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum <em>FMF Fid Style Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFFidStyleEnum()
     * @generated
     */
    EEnum FMF_FID_STYLE_ENUM = eINSTANCE.getFMFFidStyleEnum();

    /**
     * The meta object literal for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFKind <em>FMF Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.fmurf.ui.fmurfUiDSL.FMFKind
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFKind()
     * @generated
     */
    EEnum FMF_KIND = eINSTANCE.getFMFKind();

    /**
     * The meta object literal for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum <em>FMF Fid Function Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFFidFunctionEnum()
     * @generated
     */
    EEnum FMF_FID_FUNCTION_ENUM = eINSTANCE.getFMFFidFunctionEnum();

    /**
     * The meta object literal for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidKind <em>FMF Fid Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidKind
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFFidKind()
     * @generated
     */
    EEnum FMF_FID_KIND = eINSTANCE.getFMFFidKind();

    /**
     * The meta object literal for the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum <em>FMF Fid Color Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum
     * @see net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLPackageImpl#getFMFFidColorEnum()
     * @generated
     */
    EEnum FMF_FID_COLOR_ENUM = eINSTANCE.getFMFFidColorEnum();

  }

} //FmurfUiDSLPackage
