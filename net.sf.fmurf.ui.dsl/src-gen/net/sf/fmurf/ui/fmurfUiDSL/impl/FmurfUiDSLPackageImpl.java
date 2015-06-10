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
import net.sf.fmurf.ui.fmurfUiDSL.Fiducial;
import net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLFactory;
import net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FmurfUiDSLPackageImpl extends EPackageImpl implements FmurfUiDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fmfuiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fiducialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fmfSettingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fmfProximaVisibleEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fmfFidStyleEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fmfKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fmfFidFunctionEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fmfFidKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fmfFidColorEnumEEnum = null;

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
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FmurfUiDSLPackageImpl()
  {
    super(eNS_URI, FmurfUiDSLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link FmurfUiDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FmurfUiDSLPackage init()
  {
    if (isInited) return (FmurfUiDSLPackage)EPackage.Registry.INSTANCE.getEPackage(FmurfUiDSLPackage.eNS_URI);

    // Obtain or create and register package
    FmurfUiDSLPackageImpl theFmurfUiDSLPackage = (FmurfUiDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FmurfUiDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FmurfUiDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFmurfUiDSLPackage.createPackageContents();

    // Initialize created meta-data
    theFmurfUiDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFmurfUiDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FmurfUiDSLPackage.eNS_URI, theFmurfUiDSLPackage);
    return theFmurfUiDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFMFUI()
  {
    return fmfuiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFMFUI_Settings()
  {
    return (EReference)fmfuiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFMFUI_Fiducials()
  {
    return (EReference)fmfuiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFiducial()
  {
    return fiducialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Name()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Uid()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Style()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Kind()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Fg()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Bg()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Radius()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Proxima()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_ProximaVisible()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Function()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFiducial_Range()
  {
    return (EAttribute)fiducialEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFMFSettings()
  {
    return fmfSettingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFMFSettings_OscReceivePort()
  {
    return (EAttribute)fmfSettingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFMFSettings_OscSendAddress()
  {
    return (EAttribute)fmfSettingsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFMFSettings_OscSendPort()
  {
    return (EAttribute)fmfSettingsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFMFSettings_TuioPort()
  {
    return (EAttribute)fmfSettingsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFMFSettings_LiveRate()
  {
    return (EAttribute)fmfSettingsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFMFSettings_ProcessingRate()
  {
    return (EAttribute)fmfSettingsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFMFProximaVisibleEnum()
  {
    return fmfProximaVisibleEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFMFFidStyleEnum()
  {
    return fmfFidStyleEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFMFKind()
  {
    return fmfKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFMFFidFunctionEnum()
  {
    return fmfFidFunctionEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFMFFidKind()
  {
    return fmfFidKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFMFFidColorEnum()
  {
    return fmfFidColorEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FmurfUiDSLFactory getFmurfUiDSLFactory()
  {
    return (FmurfUiDSLFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fmfuiEClass = createEClass(FMFUI);
    createEReference(fmfuiEClass, FMFUI__SETTINGS);
    createEReference(fmfuiEClass, FMFUI__FIDUCIALS);

    fiducialEClass = createEClass(FIDUCIAL);
    createEAttribute(fiducialEClass, FIDUCIAL__NAME);
    createEAttribute(fiducialEClass, FIDUCIAL__UID);
    createEAttribute(fiducialEClass, FIDUCIAL__STYLE);
    createEAttribute(fiducialEClass, FIDUCIAL__KIND);
    createEAttribute(fiducialEClass, FIDUCIAL__FG);
    createEAttribute(fiducialEClass, FIDUCIAL__BG);
    createEAttribute(fiducialEClass, FIDUCIAL__RADIUS);
    createEAttribute(fiducialEClass, FIDUCIAL__PROXIMA);
    createEAttribute(fiducialEClass, FIDUCIAL__PROXIMA_VISIBLE);
    createEAttribute(fiducialEClass, FIDUCIAL__FUNCTION);
    createEAttribute(fiducialEClass, FIDUCIAL__RANGE);

    fmfSettingsEClass = createEClass(FMF_SETTINGS);
    createEAttribute(fmfSettingsEClass, FMF_SETTINGS__OSC_RECEIVE_PORT);
    createEAttribute(fmfSettingsEClass, FMF_SETTINGS__OSC_SEND_ADDRESS);
    createEAttribute(fmfSettingsEClass, FMF_SETTINGS__OSC_SEND_PORT);
    createEAttribute(fmfSettingsEClass, FMF_SETTINGS__TUIO_PORT);
    createEAttribute(fmfSettingsEClass, FMF_SETTINGS__LIVE_RATE);
    createEAttribute(fmfSettingsEClass, FMF_SETTINGS__PROCESSING_RATE);

    // Create enums
    fmfProximaVisibleEnumEEnum = createEEnum(FMF_PROXIMA_VISIBLE_ENUM);
    fmfFidStyleEnumEEnum = createEEnum(FMF_FID_STYLE_ENUM);
    fmfKindEEnum = createEEnum(FMF_KIND);
    fmfFidFunctionEnumEEnum = createEEnum(FMF_FID_FUNCTION_ENUM);
    fmfFidKindEEnum = createEEnum(FMF_FID_KIND);
    fmfFidColorEnumEEnum = createEEnum(FMF_FID_COLOR_ENUM);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(fmfuiEClass, net.sf.fmurf.ui.fmurfUiDSL.FMFUI.class, "FMFUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFMFUI_Settings(), this.getFMFSettings(), null, "settings", null, 0, 1, net.sf.fmurf.ui.fmurfUiDSL.FMFUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFMFUI_Fiducials(), this.getFiducial(), null, "fiducials", null, 0, -1, net.sf.fmurf.ui.fmurfUiDSL.FMFUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fiducialEClass, Fiducial.class, "Fiducial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFiducial_Name(), ecorePackage.getEString(), "name", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_Uid(), ecorePackage.getEInt(), "uid", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_Style(), this.getFMFFidStyleEnum(), "style", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_Kind(), this.getFMFKind(), "kind", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_Fg(), this.getFMFFidColorEnum(), "fg", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_Bg(), this.getFMFFidColorEnum(), "bg", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_Radius(), ecorePackage.getEInt(), "radius", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_Proxima(), ecorePackage.getEInt(), "proxima", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_ProximaVisible(), this.getFMFProximaVisibleEnum(), "proximaVisible", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_Function(), this.getFMFFidFunctionEnum(), "function", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFiducial_Range(), ecorePackage.getEInt(), "range", null, 0, 1, Fiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fmfSettingsEClass, FMFSettings.class, "FMFSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFMFSettings_OscReceivePort(), ecorePackage.getEInt(), "oscReceivePort", null, 0, 1, FMFSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFMFSettings_OscSendAddress(), ecorePackage.getEString(), "oscSendAddress", null, 0, 1, FMFSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFMFSettings_OscSendPort(), ecorePackage.getEInt(), "oscSendPort", null, 0, 1, FMFSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFMFSettings_TuioPort(), ecorePackage.getEInt(), "tuioPort", null, 0, 1, FMFSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFMFSettings_LiveRate(), ecorePackage.getEInt(), "liveRate", null, 0, 1, FMFSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFMFSettings_ProcessingRate(), ecorePackage.getEInt(), "processingRate", null, 0, 1, FMFSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(fmfProximaVisibleEnumEEnum, FMFProximaVisibleEnum.class, "FMFProximaVisibleEnum");
    addEEnumLiteral(fmfProximaVisibleEnumEEnum, FMFProximaVisibleEnum.VISIBLE);
    addEEnumLiteral(fmfProximaVisibleEnumEEnum, FMFProximaVisibleEnum.HIDDEN);

    initEEnum(fmfFidStyleEnumEEnum, FMFFidStyleEnum.class, "FMFFidStyleEnum");
    addEEnumLiteral(fmfFidStyleEnumEEnum, FMFFidStyleEnum.DISC);
    addEEnumLiteral(fmfFidStyleEnumEEnum, FMFFidStyleEnum.SQUARE);
    addEEnumLiteral(fmfFidStyleEnumEEnum, FMFFidStyleEnum.PENTAGON);
    addEEnumLiteral(fmfFidStyleEnumEEnum, FMFFidStyleEnum.HEXAGON);
    addEEnumLiteral(fmfFidStyleEnumEEnum, FMFFidStyleEnum.EIGHTSTAR);

    initEEnum(fmfKindEEnum, FMFKind.class, "FMFKind");
    addEEnumLiteral(fmfKindEEnum, FMFKind.SIN_OSC);
    addEEnumLiteral(fmfKindEEnum, FMFKind.SQR_OSC);
    addEEnumLiteral(fmfKindEEnum, FMFKind.PULSE_OSC);
    addEEnumLiteral(fmfKindEEnum, FMFKind.TRI_OSC);
    addEEnumLiteral(fmfKindEEnum, FMFKind.SAW_OSC);
    addEEnumLiteral(fmfKindEEnum, FMFKind.SEQUENCER);
    addEEnumLiteral(fmfKindEEnum, FMFKind.SAMPLER);
    addEEnumLiteral(fmfKindEEnum, FMFKind.ECHO);
    addEEnumLiteral(fmfKindEEnum, FMFKind.REVERB);

    initEEnum(fmfFidFunctionEnumEEnum, FMFFidFunctionEnum.class, "FMFFidFunctionEnum");
    addEEnumLiteral(fmfFidFunctionEnumEEnum, FMFFidFunctionEnum.KNOB);
    addEEnumLiteral(fmfFidFunctionEnumEEnum, FMFFidFunctionEnum.NONE);

    initEEnum(fmfFidKindEEnum, FMFFidKind.class, "FMFFidKind");
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.SIN_OSC);
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.SQR_OSC);
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.TRI_OSC);
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.SAW_OSC);
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.PULSE_OSC);
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.PHASOR);
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.SEQUENCER);
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.SAMPLER);
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.REVERB);
    addEEnumLiteral(fmfFidKindEEnum, FMFFidKind.ECHO);

    initEEnum(fmfFidColorEnumEEnum, FMFFidColorEnum.class, "FMFFidColorEnum");
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.AQUAMARINE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.BAKERS_CHOCOLATE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.BLACK);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.BRASS);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.BRIGHT_GOLD);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.BROWN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.BRONZE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.GOLD);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.GREY);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.COPPER);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.CORAL);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.CYAN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.GREEN_YELLOW);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MAGENTA);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MAROON);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SIENNA);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SILVER);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SALMON);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.ORANGE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.PINK);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.RED);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SUMMER_SKY);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.TAN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.THISTLE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.TURQUOISE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.VERY_DARK_BROWN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.VERY_LIGHT_GREY);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.VIOLET);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.VIOLET_RED);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.WHEAT);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.WHITE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.YELLOW);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.YELLOW_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_YELLOW);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.BRONZE_II);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.CADET_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.COOL_COPPER);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.CORN_FLOWER_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_BROWN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_GREEN_COPPER);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_OLIVE_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_ORCHID);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_PURPLE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_SLATE_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_TURQUOISE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_TAN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DARK_WOOD);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DIM_GREY);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.DUSTY_ROSE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.FELDSPAR);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.FIREBRICK);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.FOREST_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.GOLDENROD);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.GREEN_COPPER);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.HUNTER_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.INDIAN_RED);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.KHAKI);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.LIGHT_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.LIGHT_GREY);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.LIGHT_STEEL_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.LIGHT_WOOD);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.LIME_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MANDARIAN_ORANGE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_AQUAMARINE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_FOREST_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_GOLDENROD);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_ORCHID);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_SEA_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_SLATE_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_SPRING_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_TURQUOISE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_VIOLET_RED);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MEDIUM_WOOD);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.MIDNIGHT_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.NAVY_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.NEON_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.NEON_PINK);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.NEW_MIDNIGHT_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.NEW_TAN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.OLD_GOLD);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.ORANGE_RED);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.ORCHID);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.PALE_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.PLUM);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.QUARTZ);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.RICH_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SCARLET);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SEA_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SEMI_SWEET_CHOCOLATE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SKY_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SLATE_BLUE);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SPICY_PINK);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.SPRING_GREEN);
    addEEnumLiteral(fmfFidColorEnumEEnum, FMFFidColorEnum.STEEL_BLUE);

    // Create resource
    createResource(eNS_URI);
  }

} //FmurfUiDSLPackageImpl
