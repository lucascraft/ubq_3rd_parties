/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL.impl;

import net.sf.fmurf.ui.fmurfUiDSL.FMFFidColorEnum;
import net.sf.fmurf.ui.fmurfUiDSL.FMFFidFunctionEnum;
import net.sf.fmurf.ui.fmurfUiDSL.FMFFidStyleEnum;
import net.sf.fmurf.ui.fmurfUiDSL.FMFKind;
import net.sf.fmurf.ui.fmurfUiDSL.FMFProximaVisibleEnum;
import net.sf.fmurf.ui.fmurfUiDSL.Fiducial;
import net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fiducial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getFg <em>Fg</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getProxima <em>Proxima</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getProximaVisible <em>Proxima Visible</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.sf.fmurf.ui.fmurfUiDSL.impl.FiducialImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FiducialImpl extends MinimalEObjectImpl.Container implements Fiducial
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
  protected static final int UID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
  protected int uid = UID_EDEFAULT;

  /**
   * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected static final FMFFidStyleEnum STYLE_EDEFAULT = FMFFidStyleEnum.DISC;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected FMFFidStyleEnum style = STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final FMFKind KIND_EDEFAULT = FMFKind.SIN_OSC;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected FMFKind kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getFg() <em>Fg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFg()
   * @generated
   * @ordered
   */
  protected static final FMFFidColorEnum FG_EDEFAULT = FMFFidColorEnum.AQUAMARINE;

  /**
   * The cached value of the '{@link #getFg() <em>Fg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFg()
   * @generated
   * @ordered
   */
  protected FMFFidColorEnum fg = FG_EDEFAULT;

  /**
   * The default value of the '{@link #getBg() <em>Bg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBg()
   * @generated
   * @ordered
   */
  protected static final FMFFidColorEnum BG_EDEFAULT = FMFFidColorEnum.AQUAMARINE;

  /**
   * The cached value of the '{@link #getBg() <em>Bg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBg()
   * @generated
   * @ordered
   */
  protected FMFFidColorEnum bg = BG_EDEFAULT;

  /**
   * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected static final int RADIUS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected int radius = RADIUS_EDEFAULT;

  /**
   * The default value of the '{@link #getProxima() <em>Proxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProxima()
   * @generated
   * @ordered
   */
  protected static final int PROXIMA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getProxima() <em>Proxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProxima()
   * @generated
   * @ordered
   */
  protected int proxima = PROXIMA_EDEFAULT;

  /**
   * The default value of the '{@link #getProximaVisible() <em>Proxima Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProximaVisible()
   * @generated
   * @ordered
   */
  protected static final FMFProximaVisibleEnum PROXIMA_VISIBLE_EDEFAULT = FMFProximaVisibleEnum.VISIBLE;

  /**
   * The cached value of the '{@link #getProximaVisible() <em>Proxima Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProximaVisible()
   * @generated
   * @ordered
   */
  protected FMFProximaVisibleEnum proximaVisible = PROXIMA_VISIBLE_EDEFAULT;

  /**
   * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected static final FMFFidFunctionEnum FUNCTION_EDEFAULT = FMFFidFunctionEnum.KNOB;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected FMFFidFunctionEnum function = FUNCTION_EDEFAULT;

  /**
   * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected static final int RANGE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected int range = RANGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FiducialImpl()
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
    return FmurfUiDSLPackage.Literals.FIDUCIAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUid()
  {
    return uid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUid(int newUid)
  {
    int oldUid = uid;
    uid = newUid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFFidStyleEnum getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(FMFFidStyleEnum newStyle)
  {
    FMFFidStyleEnum oldStyle = style;
    style = newStyle == null ? STYLE_EDEFAULT : newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(FMFKind newKind)
  {
    FMFKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFFidColorEnum getFg()
  {
    return fg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFg(FMFFidColorEnum newFg)
  {
    FMFFidColorEnum oldFg = fg;
    fg = newFg == null ? FG_EDEFAULT : newFg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__FG, oldFg, fg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFFidColorEnum getBg()
  {
    return bg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBg(FMFFidColorEnum newBg)
  {
    FMFFidColorEnum oldBg = bg;
    bg = newBg == null ? BG_EDEFAULT : newBg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__BG, oldBg, bg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRadius()
  {
    return radius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadius(int newRadius)
  {
    int oldRadius = radius;
    radius = newRadius;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__RADIUS, oldRadius, radius));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getProxima()
  {
    return proxima;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProxima(int newProxima)
  {
    int oldProxima = proxima;
    proxima = newProxima;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__PROXIMA, oldProxima, proxima));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFProximaVisibleEnum getProximaVisible()
  {
    return proximaVisible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProximaVisible(FMFProximaVisibleEnum newProximaVisible)
  {
    FMFProximaVisibleEnum oldProximaVisible = proximaVisible;
    proximaVisible = newProximaVisible == null ? PROXIMA_VISIBLE_EDEFAULT : newProximaVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__PROXIMA_VISIBLE, oldProximaVisible, proximaVisible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFFidFunctionEnum getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(FMFFidFunctionEnum newFunction)
  {
    FMFFidFunctionEnum oldFunction = function;
    function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(int newRange)
  {
    int oldRange = range;
    range = newRange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FmurfUiDSLPackage.FIDUCIAL__RANGE, oldRange, range));
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
      case FmurfUiDSLPackage.FIDUCIAL__NAME:
        return getName();
      case FmurfUiDSLPackage.FIDUCIAL__UID:
        return getUid();
      case FmurfUiDSLPackage.FIDUCIAL__STYLE:
        return getStyle();
      case FmurfUiDSLPackage.FIDUCIAL__KIND:
        return getKind();
      case FmurfUiDSLPackage.FIDUCIAL__FG:
        return getFg();
      case FmurfUiDSLPackage.FIDUCIAL__BG:
        return getBg();
      case FmurfUiDSLPackage.FIDUCIAL__RADIUS:
        return getRadius();
      case FmurfUiDSLPackage.FIDUCIAL__PROXIMA:
        return getProxima();
      case FmurfUiDSLPackage.FIDUCIAL__PROXIMA_VISIBLE:
        return getProximaVisible();
      case FmurfUiDSLPackage.FIDUCIAL__FUNCTION:
        return getFunction();
      case FmurfUiDSLPackage.FIDUCIAL__RANGE:
        return getRange();
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
      case FmurfUiDSLPackage.FIDUCIAL__NAME:
        setName((String)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__UID:
        setUid((Integer)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__STYLE:
        setStyle((FMFFidStyleEnum)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__KIND:
        setKind((FMFKind)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__FG:
        setFg((FMFFidColorEnum)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__BG:
        setBg((FMFFidColorEnum)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__RADIUS:
        setRadius((Integer)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__PROXIMA:
        setProxima((Integer)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__PROXIMA_VISIBLE:
        setProximaVisible((FMFProximaVisibleEnum)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__FUNCTION:
        setFunction((FMFFidFunctionEnum)newValue);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__RANGE:
        setRange((Integer)newValue);
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
      case FmurfUiDSLPackage.FIDUCIAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__UID:
        setUid(UID_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__FG:
        setFg(FG_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__BG:
        setBg(BG_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__RADIUS:
        setRadius(RADIUS_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__PROXIMA:
        setProxima(PROXIMA_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__PROXIMA_VISIBLE:
        setProximaVisible(PROXIMA_VISIBLE_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__FUNCTION:
        setFunction(FUNCTION_EDEFAULT);
        return;
      case FmurfUiDSLPackage.FIDUCIAL__RANGE:
        setRange(RANGE_EDEFAULT);
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
      case FmurfUiDSLPackage.FIDUCIAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FmurfUiDSLPackage.FIDUCIAL__UID:
        return uid != UID_EDEFAULT;
      case FmurfUiDSLPackage.FIDUCIAL__STYLE:
        return style != STYLE_EDEFAULT;
      case FmurfUiDSLPackage.FIDUCIAL__KIND:
        return kind != KIND_EDEFAULT;
      case FmurfUiDSLPackage.FIDUCIAL__FG:
        return fg != FG_EDEFAULT;
      case FmurfUiDSLPackage.FIDUCIAL__BG:
        return bg != BG_EDEFAULT;
      case FmurfUiDSLPackage.FIDUCIAL__RADIUS:
        return radius != RADIUS_EDEFAULT;
      case FmurfUiDSLPackage.FIDUCIAL__PROXIMA:
        return proxima != PROXIMA_EDEFAULT;
      case FmurfUiDSLPackage.FIDUCIAL__PROXIMA_VISIBLE:
        return proximaVisible != PROXIMA_VISIBLE_EDEFAULT;
      case FmurfUiDSLPackage.FIDUCIAL__FUNCTION:
        return function != FUNCTION_EDEFAULT;
      case FmurfUiDSLPackage.FIDUCIAL__RANGE:
        return range != RANGE_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", uid: ");
    result.append(uid);
    result.append(", style: ");
    result.append(style);
    result.append(", kind: ");
    result.append(kind);
    result.append(", fg: ");
    result.append(fg);
    result.append(", bg: ");
    result.append(bg);
    result.append(", radius: ");
    result.append(radius);
    result.append(", proxima: ");
    result.append(proxima);
    result.append(", proximaVisible: ");
    result.append(proximaVisible);
    result.append(", function: ");
    result.append(function);
    result.append(", range: ");
    result.append(range);
    result.append(')');
    return result.toString();
  }

} //FiducialImpl
