/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL.impl;

import net.sf.fmurf.ui.fmurfUiDSL.FMFSettings;
import net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMF Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl#getOscReceivePort <em>Osc Receive Port</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl#getOscSendAddress <em>Osc Send Address</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl#getOscSendPort <em>Osc Send Port</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl#getTuioPort <em>Tuio Port</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl#getLiveRate <em>Live Rate</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFSettingsImpl#getProcessingRate <em>Processing Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FMFSettingsImpl extends MinimalEObjectImpl.Container implements FMFSettings
{
  /**
   * The default value of the '{@link #getOscReceivePort() <em>Osc Receive Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOscReceivePort()
   * @generated
   * @ordered
   */
  protected static final int OSC_RECEIVE_PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOscReceivePort() <em>Osc Receive Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOscReceivePort()
   * @generated
   * @ordered
   */
  protected int oscReceivePort = OSC_RECEIVE_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getOscSendAddress() <em>Osc Send Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOscSendAddress()
   * @generated
   * @ordered
   */
  protected static final String OSC_SEND_ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOscSendAddress() <em>Osc Send Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOscSendAddress()
   * @generated
   * @ordered
   */
  protected String oscSendAddress = OSC_SEND_ADDRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getOscSendPort() <em>Osc Send Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOscSendPort()
   * @generated
   * @ordered
   */
  protected static final int OSC_SEND_PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOscSendPort() <em>Osc Send Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOscSendPort()
   * @generated
   * @ordered
   */
  protected int oscSendPort = OSC_SEND_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getTuioPort() <em>Tuio Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuioPort()
   * @generated
   * @ordered
   */
  protected static final int TUIO_PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTuioPort() <em>Tuio Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuioPort()
   * @generated
   * @ordered
   */
  protected int tuioPort = TUIO_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getLiveRate() <em>Live Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiveRate()
   * @generated
   * @ordered
   */
  protected static final int LIVE_RATE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLiveRate() <em>Live Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiveRate()
   * @generated
   * @ordered
   */
  protected int liveRate = LIVE_RATE_EDEFAULT;

  /**
   * The default value of the '{@link #getProcessingRate() <em>Processing Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessingRate()
   * @generated
   * @ordered
   */
  protected static final int PROCESSING_RATE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getProcessingRate() <em>Processing Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessingRate()
   * @generated
   * @ordered
   */
  protected int processingRate = PROCESSING_RATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FMFSettingsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FmurfUiDSLPackage.Literals.FMF_SETTINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOscReceivePort()
  {
    return oscReceivePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOscReceivePort(int newOscReceivePort)
  {
    int oldOscReceivePort = oscReceivePort;
    oscReceivePort = newOscReceivePort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FMF_SETTINGS__OSC_RECEIVE_PORT, oldOscReceivePort, oscReceivePort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOscSendAddress()
  {
    return oscSendAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOscSendAddress(String newOscSendAddress)
  {
    String oldOscSendAddress = oscSendAddress;
    oscSendAddress = newOscSendAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_ADDRESS, oldOscSendAddress, oscSendAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOscSendPort()
  {
    return oscSendPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOscSendPort(int newOscSendPort)
  {
    int oldOscSendPort = oscSendPort;
    oscSendPort = newOscSendPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_PORT, oldOscSendPort, oscSendPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTuioPort()
  {
    return tuioPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTuioPort(int newTuioPort)
  {
    int oldTuioPort = tuioPort;
    tuioPort = newTuioPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FMF_SETTINGS__TUIO_PORT, oldTuioPort, tuioPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLiveRate()
  {
    return liveRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiveRate(int newLiveRate)
  {
    int oldLiveRate = liveRate;
    liveRate = newLiveRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FMF_SETTINGS__LIVE_RATE, oldLiveRate, liveRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getProcessingRate()
  {
    return processingRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessingRate(int newProcessingRate)
  {
    int oldProcessingRate = processingRate;
    processingRate = newProcessingRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FMF_SETTINGS__PROCESSING_RATE, oldProcessingRate, processingRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_RECEIVE_PORT:
        return getOscReceivePort();
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_ADDRESS:
        return getOscSendAddress();
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_PORT:
        return getOscSendPort();
      case FmurfUiDSLPackage.FMF_SETTINGS__TUIO_PORT:
        return getTuioPort();
      case FmurfUiDSLPackage.FMF_SETTINGS__LIVE_RATE:
        return getLiveRate();
      case FmurfUiDSLPackage.FMF_SETTINGS__PROCESSING_RATE:
        return getProcessingRate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_RECEIVE_PORT:
        setOscReceivePort((Integer)newValue);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_ADDRESS:
        setOscSendAddress((String)newValue);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_PORT:
        setOscSendPort((Integer)newValue);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__TUIO_PORT:
        setTuioPort((Integer)newValue);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__LIVE_RATE:
        setLiveRate((Integer)newValue);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__PROCESSING_RATE:
        setProcessingRate((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_RECEIVE_PORT:
        setOscReceivePort(OSC_RECEIVE_PORT_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_ADDRESS:
        setOscSendAddress(OSC_SEND_ADDRESS_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_PORT:
        setOscSendPort(OSC_SEND_PORT_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__TUIO_PORT:
        setTuioPort(TUIO_PORT_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__LIVE_RATE:
        setLiveRate(LIVE_RATE_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FMF_SETTINGS__PROCESSING_RATE:
        setProcessingRate(PROCESSING_RATE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_RECEIVE_PORT:
        return oscReceivePort != OSC_RECEIVE_PORT_EDEFAULT;
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_ADDRESS:
        return OSC_SEND_ADDRESS_EDEFAULT == null ? oscSendAddress != null : !OSC_SEND_ADDRESS_EDEFAULT.equals(oscSendAddress);
      case FmurfUiDSLPackage.FMF_SETTINGS__OSC_SEND_PORT:
        return oscSendPort != OSC_SEND_PORT_EDEFAULT;
      case FmurfUiDSLPackage.FMF_SETTINGS__TUIO_PORT:
        return tuioPort != TUIO_PORT_EDEFAULT;
      case FmurfUiDSLPackage.FMF_SETTINGS__LIVE_RATE:
        return liveRate != LIVE_RATE_EDEFAULT;
      case FmurfUiDSLPackage.FMF_SETTINGS__PROCESSING_RATE:
        return processingRate != PROCESSING_RATE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (oscReceivePort: ");
    result.append(oscReceivePort);
    result.append(", oscSendAddress: ");
    result.append(oscSendAddress);
    result.append(", oscSendPort: ");
    result.append(oscSendPort);
    result.append(", tuioPort: ");
    result.append(tuioPort);
    result.append(", liveRate: ");
    result.append(liveRate);
    result.append(", processingRate: ");
    result.append(processingRate);
    result.append(')');
    return result.toString();
  }

} //FMFSettingsImpl
