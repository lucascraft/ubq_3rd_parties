/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFDX Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXPayload#getVl <em>Vl</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.AFDXPayload#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXPayload()
 * @model
 * @generated
 */
public interface AFDXPayload extends Cmd {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(AFDXFrame)
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXPayload_Data()
	 * @model containment="true"
	 * @generated
	 */
	AFDXFrame getData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXPayload#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(AFDXFrame value);

	/**
	 * Returns the value of the '<em><b>Vl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vl</em>' reference.
	 * @see #setVl(AFDXVirtualLink)
	 * @see net.sf.smbt.ezafdx.EzafdxPackage#getAFDXPayload_Vl()
	 * @model
	 * @generated
	 */
	AFDXVirtualLink getVl();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezafdx.AFDXPayload#getVl <em>Vl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vl</em>' reference.
	 * @see #getVl()
	 * @generated
	 */
	void setVl(AFDXVirtualLink value);

} // AFDXPayload
