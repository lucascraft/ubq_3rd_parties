/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx.impl;

import net.sf.smbt.ezafdx.AFDXFrame;
import net.sf.smbt.ezafdx.AFDXPayload;
import net.sf.smbt.ezafdx.AFDXVirtualLink;
import net.sf.smbt.ezafdx.EzafdxPackage;

import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AFDX Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXPayloadImpl#getVl <em>Vl</em>}</li>
 *   <li>{@link net.sf.smbt.ezafdx.impl.AFDXPayloadImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AFDXPayloadImpl extends CmdImpl implements AFDXPayload {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFDXPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzafdxPackage.Literals.AFDX_PAYLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFDXFrame getData() {
		return (AFDXFrame)eGet(EzafdxPackage.Literals.AFDX_PAYLOAD__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(AFDXFrame newData) {
		eSet(EzafdxPackage.Literals.AFDX_PAYLOAD__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFDXVirtualLink getVl() {
		return (AFDXVirtualLink)eGet(EzafdxPackage.Literals.AFDX_PAYLOAD__VL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVl(AFDXVirtualLink newVl) {
		eSet(EzafdxPackage.Literals.AFDX_PAYLOAD__VL, newVl);
	}

} //AFDXPayloadImpl
