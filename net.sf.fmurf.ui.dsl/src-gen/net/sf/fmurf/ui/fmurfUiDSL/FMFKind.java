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
 * A representation of the literals of the enumeration '<em><b>FMF Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFKind()
 * @model
 * @generated
 */
public enum FMFKind implements Enumerator
{
  /**
   * The '<em><b>SIN OSC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIN_OSC_VALUE
   * @generated
   * @ordered
   */
  SIN_OSC(0, "SIN_OSC", "SIN_OSC"),

  /**
   * The '<em><b>SQR OSC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SQR_OSC_VALUE
   * @generated
   * @ordered
   */
  SQR_OSC(1, "SQR_OSC", "SQR_OSC"),

  /**
   * The '<em><b>PULSE OSC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PULSE_OSC_VALUE
   * @generated
   * @ordered
   */
  PULSE_OSC(2, "PULSE_OSC", "PULSE_OSC"),

  /**
   * The '<em><b>TRI OSC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRI_OSC_VALUE
   * @generated
   * @ordered
   */
  TRI_OSC(3, "TRI_OSC", "TRI_OSC"),

  /**
   * The '<em><b>SAW OSC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAW_OSC_VALUE
   * @generated
   * @ordered
   */
  SAW_OSC(4, "SAW_OSC", "SAW_OSC"),

  /**
   * The '<em><b>SEQUENCER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEQUENCER_VALUE
   * @generated
   * @ordered
   */
  SEQUENCER(5, "SEQUENCER", "SEQUENCER"),

  /**
   * The '<em><b>SAMPLER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAMPLER_VALUE
   * @generated
   * @ordered
   */
  SAMPLER(6, "SAMPLER", "SAMPLER"),

  /**
   * The '<em><b>ECHO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ECHO_VALUE
   * @generated
   * @ordered
   */
  ECHO(7, "ECHO", "ECHO"),

  /**
   * The '<em><b>REVERB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REVERB_VALUE
   * @generated
   * @ordered
   */
  REVERB(8, "REVERB", "REVERB");

  /**
   * The '<em><b>SIN OSC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SIN OSC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIN_OSC
   * @model
   * @generated
   * @ordered
   */
  public static final int SIN_OSC_VALUE = 0;

  /**
   * The '<em><b>SQR OSC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SQR OSC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SQR_OSC
   * @model
   * @generated
   * @ordered
   */
  public static final int SQR_OSC_VALUE = 1;

  /**
   * The '<em><b>PULSE OSC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PULSE OSC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PULSE_OSC
   * @model
   * @generated
   * @ordered
   */
  public static final int PULSE_OSC_VALUE = 2;

  /**
   * The '<em><b>TRI OSC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TRI OSC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRI_OSC
   * @model
   * @generated
   * @ordered
   */
  public static final int TRI_OSC_VALUE = 3;

  /**
   * The '<em><b>SAW OSC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SAW OSC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAW_OSC
   * @model
   * @generated
   * @ordered
   */
  public static final int SAW_OSC_VALUE = 4;

  /**
   * The '<em><b>SEQUENCER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SEQUENCER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SEQUENCER
   * @model
   * @generated
   * @ordered
   */
  public static final int SEQUENCER_VALUE = 5;

  /**
   * The '<em><b>SAMPLER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SAMPLER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAMPLER
   * @model
   * @generated
   * @ordered
   */
  public static final int SAMPLER_VALUE = 6;

  /**
   * The '<em><b>ECHO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ECHO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ECHO
   * @model
   * @generated
   * @ordered
   */
  public static final int ECHO_VALUE = 7;

  /**
   * The '<em><b>REVERB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REVERB</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REVERB
   * @model
   * @generated
   * @ordered
   */
  public static final int REVERB_VALUE = 8;

  /**
   * An array of all the '<em><b>FMF Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FMFKind[] VALUES_ARRAY =
    new FMFKind[]
    {
      SIN_OSC,
      SQR_OSC,
      PULSE_OSC,
      TRI_OSC,
      SAW_OSC,
      SEQUENCER,
      SAMPLER,
      ECHO,
      REVERB,
    };

  /**
   * A public read-only list of all the '<em><b>FMF Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FMFKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>FMF Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FMFKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FMF Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FMFKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FMF Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFKind get(int value)
  {
    switch (value)
    {
      case SIN_OSC_VALUE: return SIN_OSC;
      case SQR_OSC_VALUE: return SQR_OSC;
      case PULSE_OSC_VALUE: return PULSE_OSC;
      case TRI_OSC_VALUE: return TRI_OSC;
      case SAW_OSC_VALUE: return SAW_OSC;
      case SEQUENCER_VALUE: return SEQUENCER;
      case SAMPLER_VALUE: return SAMPLER;
      case ECHO_VALUE: return ECHO;
      case REVERB_VALUE: return REVERB;
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
  private FMFKind(int value, String name, String literal)
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
  
} //FMFKind
