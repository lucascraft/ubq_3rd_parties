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
 * A representation of the literals of the enumeration '<em><b>FMF Fid Style Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFFidStyleEnum()
 * @model
 * @generated
 */
public enum FMFFidStyleEnum implements Enumerator
{
  /**
   * The '<em><b>DISC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISC_VALUE
   * @generated
   * @ordered
   */
  DISC(0, "DISC", "DISC"),

  /**
   * The '<em><b>SQUARE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SQUARE_VALUE
   * @generated
   * @ordered
   */
  SQUARE(1, "SQUARE", "SQUARE"),

  /**
   * The '<em><b>PENTAGON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PENTAGON_VALUE
   * @generated
   * @ordered
   */
  PENTAGON(2, "PENTAGON", "PENTAGON"),

  /**
   * The '<em><b>HEXAGON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HEXAGON_VALUE
   * @generated
   * @ordered
   */
  HEXAGON(3, "HEXAGON", "HEXAGON"),

  /**
   * The '<em><b>EIGHTSTAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EIGHTSTAR_VALUE
   * @generated
   * @ordered
   */
  EIGHTSTAR(4, "EIGHTSTAR", "EIGHTSTAR");

  /**
   * The '<em><b>DISC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DISC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISC
   * @model
   * @generated
   * @ordered
   */
  public static final int DISC_VALUE = 0;

  /**
   * The '<em><b>SQUARE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SQUARE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SQUARE
   * @model
   * @generated
   * @ordered
   */
  public static final int SQUARE_VALUE = 1;

  /**
   * The '<em><b>PENTAGON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PENTAGON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PENTAGON
   * @model
   * @generated
   * @ordered
   */
  public static final int PENTAGON_VALUE = 2;

  /**
   * The '<em><b>HEXAGON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HEXAGON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HEXAGON
   * @model
   * @generated
   * @ordered
   */
  public static final int HEXAGON_VALUE = 3;

  /**
   * The '<em><b>EIGHTSTAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EIGHTSTAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EIGHTSTAR
   * @model
   * @generated
   * @ordered
   */
  public static final int EIGHTSTAR_VALUE = 4;

  /**
   * An array of all the '<em><b>FMF Fid Style Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FMFFidStyleEnum[] VALUES_ARRAY =
    new FMFFidStyleEnum[]
    {
      DISC,
      SQUARE,
      PENTAGON,
      HEXAGON,
      EIGHTSTAR,
    };

  /**
   * A public read-only list of all the '<em><b>FMF Fid Style Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FMFFidStyleEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>FMF Fid Style Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFFidStyleEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FMFFidStyleEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FMF Fid Style Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFFidStyleEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FMFFidStyleEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FMF Fid Style Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFFidStyleEnum get(int value)
  {
    switch (value)
    {
      case DISC_VALUE: return DISC;
      case SQUARE_VALUE: return SQUARE;
      case PENTAGON_VALUE: return PENTAGON;
      case HEXAGON_VALUE: return HEXAGON;
      case EIGHTSTAR_VALUE: return EIGHTSTAR;
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
  private FMFFidStyleEnum(int value, String name, String literal)
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
  
} //FMFFidStyleEnum
