/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.cc2250.ezlivingcolors1.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd;

import net.sf.xqz.model.cmd.PRIORITY;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetHSVCmd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LivingColorsSetHSVCmdItemProvider
	extends LivingColorsCmdItemProvider
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
	public LivingColorsSetHSVCmdItemProvider(AdapterFactory adapterFactory) {
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

			addAddrPropertyDescriptor(object);
			addHPropertyDescriptor(object);
			addSPropertyDescriptor(object);
			addVPropertyDescriptor(object);
			addIndexPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Addr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LivingColorsSetHSVCmd_addr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LivingColorsSetHSVCmd_addr_feature", "_UI_LivingColorsSetHSVCmd_type"),
				 Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__ADDR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the H feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LivingColorsSetHSVCmd_h_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LivingColorsSetHSVCmd_h_feature", "_UI_LivingColorsSetHSVCmd_type"),
				 Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__H,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LivingColorsSetHSVCmd_s_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LivingColorsSetHSVCmd_s_feature", "_UI_LivingColorsSetHSVCmd_type"),
				 Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__S,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the V feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LivingColorsSetHSVCmd_v_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LivingColorsSetHSVCmd_v_feature", "_UI_LivingColorsSetHSVCmd_type"),
				 Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__V,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LivingColorsSetHSVCmd_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LivingColorsSetHSVCmd_index_feature", "_UI_LivingColorsSetHSVCmd_type"),
				 Ezlivingcolors1Package.Literals.LIVING_COLORS_SET_HSV_CMD__INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LivingColorsSetHSVCmd.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LivingColorsSetHSVCmd"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PRIORITY labelValue = ((LivingColorsSetHSVCmd)object).getPriority();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_LivingColorsSetHSVCmd_type") :
			getString("_UI_LivingColorsSetHSVCmd_type") + " " + label;
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

		switch (notification.getFeatureID(LivingColorsSetHSVCmd.class)) {
			case Ezlivingcolors1Package.LIVING_COLORS_SET_HSV_CMD__ADDR:
			case Ezlivingcolors1Package.LIVING_COLORS_SET_HSV_CMD__H:
			case Ezlivingcolors1Package.LIVING_COLORS_SET_HSV_CMD__S:
			case Ezlivingcolors1Package.LIVING_COLORS_SET_HSV_CMD__V:
			case Ezlivingcolors1Package.LIVING_COLORS_SET_HSV_CMD__INDEX:
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

}
