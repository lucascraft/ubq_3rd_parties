/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage
 * @generated
 */
public interface FmurfUiDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FmurfUiDSLFactory eINSTANCE = net.sf.fmurf.ui.fmurfUiDSL.impl.FmurfUiDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>FMFUI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FMFUI</em>'.
   * @generated
   */
  FMFUI createFMFUI();

  /**
   * Returns a new object of class '<em>Fiducial</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fiducial</em>'.
   * @generated
   */
  Fiducial createFiducial();

  /**
   * Returns a new object of class '<em>FMF Settings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FMF Settings</em>'.
   * @generated
   */
  FMFSettings createFMFSettings();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FmurfUiDSLPackage getFmurfUiDSLPackage();

} //FmurfUiDSLFactory
