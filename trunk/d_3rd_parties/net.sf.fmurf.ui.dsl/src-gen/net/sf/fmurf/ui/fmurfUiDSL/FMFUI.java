/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMFUI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.FMFUI#getSettings <em>Settings</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.FMFUI#getFiducials <em>Fiducials</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFUI()
 * @model
 * @generated
 */
public interface FMFUI extends EObject
{
  /**
   * Returns the value of the '<em><b>Settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Settings</em>' containment reference.
   * @see #setSettings(FMFSettings)
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFUI_Settings()
   * @model containment="true"
   * @generated
   */
  FMFSettings getSettings();

  /**
   * Sets the value of the '{@link net.sf.fmurf.ui.fmurfUiDSL.FMFUI#getSettings <em>Settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Settings</em>' containment reference.
   * @see #getSettings()
   * @generated
   */
  void setSettings(FMFSettings value);

  /**
   * Returns the value of the '<em><b>Fiducials</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.fmurf.ui.fmurfUiDSL.Fiducial}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fiducials</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fiducials</em>' containment reference list.
   * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFUI_Fiducials()
   * @model containment="true"
   * @generated
   */
  EList<Fiducial> getFiducials();

} // FMFUI
