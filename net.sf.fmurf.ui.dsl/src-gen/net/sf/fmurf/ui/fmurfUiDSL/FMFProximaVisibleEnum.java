/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.fmurf.ui.fmurfUiDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FMF Proxima Visible Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFProximaVisibleEnum()
 * @model
 * @generated
 */
public enum FMFProximaVisibleEnum implements Enumerator
{
  /**
   * The '<em><b>VISIBLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISIBLE_VALUE
   * @generated
   * @ordered
   */
  VISIBLE(0, "VISIBLE", "VISIBLE"),

  /**
   * The '<em><b>HIDDEN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HIDDEN_VALUE
   * @generated
   * @ordered
   */
  HIDDEN(1, "HIDDEN", "HIDDEN");

  /**
   * The '<em><b>VISIBLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VISIBLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VISIBLE
   * @model
   * @generated
   * @ordered
   */
  public static final int VISIBLE_VALUE = 0;

  /**
   * The '<em><b>HIDDEN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HIDDEN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HIDDEN
   * @model
   * @generated
   * @ordered
   */
  public static final int HIDDEN_VALUE = 1;

  /**
   * An array of all the '<em><b>FMF Proxima Visible Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FMFProximaVisibleEnum[] VALUES_ARRAY =
    new FMFProximaVisibleEnum[]
    {
      VISIBLE,
      HIDDEN,
    };

  /**
   * A public read-only list of all the '<em><b>FMF Proxima Visible Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FMFProximaVisibleEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>FMF Proxima Visible Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFProximaVisibleEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FMFProximaVisibleEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FMF Proxima Visible Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFProximaVisibleEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FMFProximaVisibleEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FMF Proxima Visible Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFProximaVisibleEnum get(int value)
  {
    switch (value)
    {
      case VISIBLE_VALUE: return VISIBLE;
      case HIDDEN_VALUE: return HIDDEN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private FMFProximaVisibleEnum(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //FMFProximaVisibleEnum
