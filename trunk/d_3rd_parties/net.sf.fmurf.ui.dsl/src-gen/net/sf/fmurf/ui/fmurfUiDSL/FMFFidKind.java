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
 * A representation of the literals of the enumeration '<em><b>FMF Fid Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage#getFMFFidKind()
 * @model
 * @generated
 */
public enum FMFFidKind implements Enumerator
{
  /**
   * The '<em><b>Sin Osc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIN_OSC_VALUE
   * @generated
   * @ordered
   */
  SIN_OSC(0, "SinOsc", "SinOsc"),

  /**
   * The '<em><b>Sqr Osc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SQR_OSC_VALUE
   * @generated
   * @ordered
   */
  SQR_OSC(1, "SqrOsc", "SqrOsc"),

  /**
   * The '<em><b>Tri Osc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRI_OSC_VALUE
   * @generated
   * @ordered
   */
  TRI_OSC(2, "TriOsc", "TriOsc"),

  /**
   * The '<em><b>Saw Osc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAW_OSC_VALUE
   * @generated
   * @ordered
   */
  SAW_OSC(3, "SawOsc", "SawOsc"),

  /**
   * The '<em><b>Pulse Osc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PULSE_OSC_VALUE
   * @generated
   * @ordered
   */
  PULSE_OSC(4, "PulseOsc", "PulseOsc"),

  /**
   * The '<em><b>Phasor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PHASOR_VALUE
   * @generated
   * @ordered
   */
  PHASOR(5, "Phasor", "Phasor"),

  /**
   * The '<em><b>Sequencer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEQUENCER_VALUE
   * @generated
   * @ordered
   */
  SEQUENCER(6, "Sequencer", "Sequencer"),

  /**
   * The '<em><b>Sampler</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAMPLER_VALUE
   * @generated
   * @ordered
   */
  SAMPLER(7, "Sampler", "Sampler"),

  /**
   * The '<em><b>Reverb</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REVERB_VALUE
   * @generated
   * @ordered
   */
  REVERB(8, "Reverb", "Reverb"),

  /**
   * The '<em><b>Echo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ECHO_VALUE
   * @generated
   * @ordered
   */
  ECHO(9, "Echo", "Echo");

  /**
   * The '<em><b>Sin Osc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sin Osc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIN_OSC
   * @model name="SinOsc"
   * @generated
   * @ordered
   */
  public static final int SIN_OSC_VALUE = 0;

  /**
   * The '<em><b>Sqr Osc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sqr Osc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SQR_OSC
   * @model name="SqrOsc"
   * @generated
   * @ordered
   */
  public static final int SQR_OSC_VALUE = 1;

  /**
   * The '<em><b>Tri Osc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tri Osc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRI_OSC
   * @model name="TriOsc"
   * @generated
   * @ordered
   */
  public static final int TRI_OSC_VALUE = 2;

  /**
   * The '<em><b>Saw Osc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Saw Osc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAW_OSC
   * @model name="SawOsc"
   * @generated
   * @ordered
   */
  public static final int SAW_OSC_VALUE = 3;

  /**
   * The '<em><b>Pulse Osc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pulse Osc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PULSE_OSC
   * @model name="PulseOsc"
   * @generated
   * @ordered
   */
  public static final int PULSE_OSC_VALUE = 4;

  /**
   * The '<em><b>Phasor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Phasor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PHASOR
   * @model name="Phasor"
   * @generated
   * @ordered
   */
  public static final int PHASOR_VALUE = 5;

  /**
   * The '<em><b>Sequencer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sequencer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SEQUENCER
   * @model name="Sequencer"
   * @generated
   * @ordered
   */
  public static final int SEQUENCER_VALUE = 6;

  /**
   * The '<em><b>Sampler</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sampler</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAMPLER
   * @model name="Sampler"
   * @generated
   * @ordered
   */
  public static final int SAMPLER_VALUE = 7;

  /**
   * The '<em><b>Reverb</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Reverb</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REVERB
   * @model name="Reverb"
   * @generated
   * @ordered
   */
  public static final int REVERB_VALUE = 8;

  /**
   * The '<em><b>Echo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Echo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ECHO
   * @model name="Echo"
   * @generated
   * @ordered
   */
  public static final int ECHO_VALUE = 9;

  /**
   * An array of all the '<em><b>FMF Fid Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FMFFidKind[] VALUES_ARRAY =
    new FMFFidKind[]
    {
      SIN_OSC,
      SQR_OSC,
      TRI_OSC,
      SAW_OSC,
      PULSE_OSC,
      PHASOR,
      SEQUENCER,
      SAMPLER,
      REVERB,
      ECHO,
    };

  /**
   * A public read-only list of all the '<em><b>FMF Fid Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FMFFidKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>FMF Fid Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFFidKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FMFFidKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FMF Fid Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFFidKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FMFFidKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FMF Fid Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFFidKind get(int value)
  {
    switch (value)
    {
      case SIN_OSC_VALUE: return SIN_OSC;
      case SQR_OSC_VALUE: return SQR_OSC;
      case TRI_OSC_VALUE: return TRI_OSC;
      case SAW_OSC_VALUE: return SAW_OSC;
      case PULSE_OSC_VALUE: return PULSE_OSC;
      case PHASOR_VALUE: return PHASOR;
      case SEQUENCER_VALUE: return SEQUENCER;
      case SAMPLER_VALUE: return SAMPLER;
      case REVERB_VALUE: return REVERB;
      case ECHO_VALUE: return ECHO;
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
  private FMFFidKind(int value, String name, String literal)
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
  
} //FMFFidKind
