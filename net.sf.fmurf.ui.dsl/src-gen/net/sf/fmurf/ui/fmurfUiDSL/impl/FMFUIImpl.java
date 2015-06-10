/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL.impl;

import java.util.Collection;

import net.sf.fmurf.ui.fmurfUiDSL.FMFSettings;
import net.sf.fmurf.ui.fmurfUiDSL.FMFUI;
import net.sf.fmurf.ui.fmurfUiDSL.Fiducial;
import net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMFUI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFUIImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FMFUIImpl#getFiducials <em>Fiducials</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FMFUIImpl extends MinimalEObjectImpl.Container implements FMFUI
{
  /**
   * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettings()
   * @generated
   * @ordered
   */
  protected FMFSettings settings;

  /**
   * The cached value of the '{@link #getFiducials() <em>Fiducials</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiducials()
   * @generated
   * @ordered
   */
  protected EList<Fiducial> fiducials;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FMFUIImpl()
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
    return FmurfUiDSLPackage.Literals.FMFUI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFSettings getSettings()
  {
    return settings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSettings(FMFSettings newSettings, NotificationChain msgs)
  {
    FMFSettings oldSettings = settings;
    settings = newSettings;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FMFUI__SETTINGS, oldSettings, newSettings);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSettings(FMFSettings newSettings)
  {
    if (newSettings != settings)
    {
      NotificationChain msgs = null;
      if (settings != null)
        msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmurfUiDSLPackage.FMFUI__SETTINGS, null, msgs);
      if (newSettings != null)
        msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmurfUiDSLPackage.FMFUI__SETTINGS, null, msgs);
      msgs = basicSetSettings(newSettings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FMFUI__SETTINGS, newSettings, newSettings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fiducial> getFiducials()
  {
    if (fiducials == null)
    {
      fiducials = new EObjectContainmentEList<Fiducial>(Fiducial.class, this, FmurfUiDSLPackage.FMFUI__FIDUCIALS);
    }
    return fiducials;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FmurfUiDSLPackage.FMFUI__SETTINGS:
        return basicSetSettings(null, msgs);
      case FmurfUiDSLPackage.FMFUI__FIDUCIALS:
        return ((InternalEList<?>)getFiducials()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FmurfUiDSLPackage.FMFUI__SETTINGS:
        return getSettings();
      case FmurfUiDSLPackage.FMFUI__FIDUCIALS:
        return getFiducials();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FmurfUiDSLPackage.FMFUI__SETTINGS:
        setSettings((FMFSettings)newValue);
        return;
      case FmurfUiDSLPackage.FMFUI__FIDUCIALS:
        getFiducials().clear();
        getFiducials().addAll((Collection<? extends Fiducial>)newValue);
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
      case FmurfUiDSLPackage.FMFUI__SETTINGS:
        setSettings((FMFSettings)null);
        return;
      case FmurfUiDSLPackage.FMFUI__FIDUCIALS:
        getFiducials().clear();
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
      case FmurfUiDSLPackage.FMFUI__SETTINGS:
        return settings != null;
      case FmurfUiDSLPackage.FMFUI__FIDUCIALS:
        return fiducials != null && !fiducials.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FMFUIImpl
