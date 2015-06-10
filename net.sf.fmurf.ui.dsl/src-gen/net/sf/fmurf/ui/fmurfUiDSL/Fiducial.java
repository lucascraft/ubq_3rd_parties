/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fiducial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getUid <em>Uid</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getStyle <em>Style</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getFg <em>Fg</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getBg <em>Bg</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getProxima <em>Proxima</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getProximaVisible <em>Proxima Visible</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getFunction <em>Function</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial()
 * @model
 * @generated
 */
public interface Fiducial extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uid</em>' attribute.
   * @see #setUid(int)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Uid()
   * @model
   * @generated
   */
  int getUid();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(int value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum
   * @see #setStyle(FMFFidStyleEnum)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Style()
   * @model
   * @generated
   */
  FMFFidStyleEnum getStyle();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum
   * @see #getStyle()
   * @generated
   */
  void setStyle(FMFFidStyleEnum value);

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.fmurf.ui.fmurfUiDSL.FMFKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFKind
   * @see #setKind(FMFKind)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Kind()
   * @model
   * @generated
   */
  FMFKind getKind();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFKind
   * @see #getKind()
   * @generated
   */
  void setKind(FMFKind value);

  /**
   * Returns the value of the '<em><b>Fg</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fg</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum
   * @see #setFg(FMFFidColorEnum)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Fg()
   * @model
   * @generated
   */
  FMFFidColorEnum getFg();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getFg <em>Fg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fg</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum
   * @see #getFg()
   * @generated
   */
  void setFg(FMFFidColorEnum value);

  /**
   * Returns the value of the '<em><b>Bg</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bg</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum
   * @see #setBg(FMFFidColorEnum)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Bg()
   * @model
   * @generated
   */
  FMFFidColorEnum getBg();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getBg <em>Bg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bg</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum
   * @see #getBg()
   * @generated
   */
  void setBg(FMFFidColorEnum value);

  /**
   * Returns the value of the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radius</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Radius</em>' attribute.
   * @see #setRadius(int)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Radius()
   * @model
   * @generated
   */
  int getRadius();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getRadius <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius</em>' attribute.
   * @see #getRadius()
   * @generated
   */
  void setRadius(int value);

  /**
   * Returns the value of the '<em><b>Proxima</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proxima</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proxima</em>' attribute.
   * @see #setProxima(int)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Proxima()
   * @model
   * @generated
   */
  int getProxima();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getProxima <em>Proxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proxima</em>' attribute.
   * @see #getProxima()
   * @generated
   */
  void setProxima(int value);

  /**
   * Returns the value of the '<em><b>Proxima Visible</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proxima Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proxima Visible</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum
   * @see #setProximaVisible(FMFProximaVisibleEnum)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_ProximaVisible()
   * @model
   * @generated
   */
  FMFProximaVisibleEnum getProximaVisible();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getProximaVisible <em>Proxima Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proxima Visible</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum
   * @see #getProximaVisible()
   * @generated
   */
  void setProximaVisible(FMFProximaVisibleEnum value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum
   * @see #setFunction(FMFFidFunctionEnum)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Function()
   * @model
   * @generated
   */
  FMFFidFunctionEnum getFunction();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum
   * @see #getFunction()
   * @generated
   */
  void setFunction(FMFFidFunctionEnum value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' attribute.
   * @see #setRange(int)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFiducial_Range()
   * @model
   * @generated
   */
  int getRange();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial#getRange <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' attribute.
   * @see #getRange()
   * @generated
   */
  void setRange(int value);

} // Fiducial
