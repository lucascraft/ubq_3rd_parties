/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezafdx.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezafdx.AFDXFrame;
import net.sf.smbt.ezafdx.EzafdxPackage;

import net.sf.smbt.ezafdxtopology.provider.EzafdxtopologyEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.ezafdx.AFDXFrame} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AFDXFrameItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFDXFrameItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPreamblePropertyDescriptor(object);
			addSfdPropertyDescriptor(object);
			addMacDestPropertyDescriptor(object);
			addMacSrcPropertyDescriptor(object);
			addTypeIPv4PropertyDescriptor(object);
			addIpHeaderPropertyDescriptor(object);
			addUdpHeaderPropertyDescriptor(object);
			addPayloadPropertyDescriptor(object);
			addPaddingPropertyDescriptor(object);
			addRsnPropertyDescriptor(object);
			addFcnPropertyDescriptor(object);
			addIfgPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Preamble feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreamblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_preamble_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_preamble_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__PREAMBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sfd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSfdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_sfd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_sfd_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__SFD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mac Dest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMacDestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_macDest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_macDest_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__MAC_DEST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mac Src feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMacSrcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_macSrc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_macSrc_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__MAC_SRC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type IPv4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeIPv4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_typeIPv4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_typeIPv4_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__TYPE_IPV4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ip Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_ipHeader_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_ipHeader_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__IP_HEADER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Udp Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUdpHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_udpHeader_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_udpHeader_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__UDP_HEADER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Payload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPayloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_payload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_payload_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__PAYLOAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Padding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaddingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_padding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_padding_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__PADDING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rsn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRsnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_rsn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_rsn_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__RSN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fcn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFcnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_fcn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_fcn_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__FCN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ifg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIfgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AFDXFrame_ifg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AFDXFrame_ifg_feature", "_UI_AFDXFrame_type"),
				 EzafdxPackage.Literals.AFDX_FRAME__IFG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AFDXFrame.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AFDXFrame"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		byte[] labelValue = ((AFDXFrame)object).getPreamble();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_AFDXFrame_type") :
			getString("_UI_AFDXFrame_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AFDXFrame.class)) {
			case EzafdxPackage.AFDX_FRAME__PREAMBLE:
			case EzafdxPackage.AFDX_FRAME__SFD:
			case EzafdxPackage.AFDX_FRAME__MAC_DEST:
			case EzafdxPackage.AFDX_FRAME__MAC_SRC:
			case EzafdxPackage.AFDX_FRAME__TYPE_IPV4:
			case EzafdxPackage.AFDX_FRAME__IP_HEADER:
			case EzafdxPackage.AFDX_FRAME__UDP_HEADER:
			case EzafdxPackage.AFDX_FRAME__PAYLOAD:
			case EzafdxPackage.AFDX_FRAME__PADDING:
			case EzafdxPackage.AFDX_FRAME__RSN:
			case EzafdxPackage.AFDX_FRAME__FCN:
			case EzafdxPackage.AFDX_FRAME__IFG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EzafdxtopologyEditPlugin.INSTANCE;
	}

}
