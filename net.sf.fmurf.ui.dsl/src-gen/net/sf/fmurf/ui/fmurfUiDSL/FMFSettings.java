/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMF Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscReceivePort <em>Osc Receive Port</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscSendAddress <em>Osc Send Address</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscSendPort <em>Osc Send Port</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getTuioPort <em>Tuio Port</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getLiveRate <em>Live Rate</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getProcessingRate <em>Processing Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFSettings()
 * @model
 * @generated
 */
public interface FMFSettings extends EObject
{
  /**
   * Returns the value of the '<em><b>Osc Receive Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Osc Receive Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Osc Receive Port</em>' attribute.
   * @see #setOscReceivePort(int)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFSettings_OscReceivePort()
   * @model
   * @generated
   */
  int getOscReceivePort();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscReceivePort <em>Osc Receive Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Osc Receive Port</em>' attribute.
   * @see #getOscReceivePort()
   * @generated
   */
  void setOscReceivePort(int value);

  /**
   * Returns the value of the '<em><b>Osc Send Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Osc Send Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Osc Send Address</em>' attribute.
   * @see #setOscSendAddress(String)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFSettings_OscSendAddress()
   * @model
   * @generated
   */
  String getOscSendAddress();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscSendAddress <em>Osc Send Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Osc Send Address</em>' attribute.
   * @see #getOscSendAddress()
   * @generated
   */
  void setOscSendAddress(String value);

  /**
   * Returns the value of the '<em><b>Osc Send Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Osc Send Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Osc Send Port</em>' attribute.
   * @see #setOscSendPort(int)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFSettings_OscSendPort()
   * @model
   * @generated
   */
  int getOscSendPort();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getOscSendPort <em>Osc Send Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Osc Send Port</em>' attribute.
   * @see #getOscSendPort()
   * @generated
   */
  void setOscSendPort(int value);

  /**
   * Returns the value of the '<em><b>Tuio Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuio Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuio Port</em>' attribute.
   * @see #setTuioPort(int)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFSettings_TuioPort()
   * @model
   * @generated
   */
  int getTuioPort();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getTuioPort <em>Tuio Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tuio Port</em>' attribute.
   * @see #getTuioPort()
   * @generated
   */
  void setTuioPort(int value);

  /**
   * Returns the value of the '<em><b>Live Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Live Rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Live Rate</em>' attribute.
   * @see #setLiveRate(int)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFSettings_LiveRate()
   * @model
   * @generated
   */
  int getLiveRate();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getLiveRate <em>Live Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Live Rate</em>' attribute.
   * @see #getLiveRate()
   * @generated
   */
  void setLiveRate(int value);

  /**
   * Returns the value of the '<em><b>Processing Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processing Rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processing Rate</em>' attribute.
   * @see #setProcessingRate(int)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFSettings_ProcessingRate()
   * @model
   * @generated
   */
  int getProcessingRate();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFSettings#getProcessingRate <em>Processing Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processing Rate</em>' attribute.
   * @see #getProcessingRate()
   * @generated
   */
  void setProcessingRate(int value);

} // FMFSettings
