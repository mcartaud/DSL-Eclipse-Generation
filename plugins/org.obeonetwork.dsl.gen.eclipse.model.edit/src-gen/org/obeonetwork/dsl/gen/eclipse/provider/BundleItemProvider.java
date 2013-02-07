/**
 */
package org.obeonetwork.dsl.gen.eclipse.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.gen.eclipse.Bundle;
import org.obeonetwork.dsl.gen.eclipse.EclipseFactory;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Bundle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleItemProvider
  extends ProjectItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BundleItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addVersionPropertyDescriptor(object);
      addRequiredEnvironmentPropertyDescriptor(object);
      addVendorPropertyDescriptor(object);
      addBasePackagePropertyDescriptor(object);
      addExportedPackagesPropertyDescriptor(object);
      addOwnedPackagesPropertyDescriptor(object);
      addAllExportedPackagesPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Version feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addVersionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Bundle_version_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Bundle_version_feature", "_UI_Bundle_type"),
         EclipsePackage.Literals.BUNDLE__VERSION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Required Environment feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRequiredEnvironmentPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Bundle_requiredEnvironment_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Bundle_requiredEnvironment_feature", "_UI_Bundle_type"),
         EclipsePackage.Literals.BUNDLE__REQUIRED_ENVIRONMENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Vendor feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addVendorPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Bundle_vendor_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Bundle_vendor_feature", "_UI_Bundle_type"),
         EclipsePackage.Literals.BUNDLE__VENDOR,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Base Package feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBasePackagePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Bundle_basePackage_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Bundle_basePackage_feature", "_UI_Bundle_type"),
         EclipsePackage.Literals.BUNDLE__BASE_PACKAGE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Owned Packages feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOwnedPackagesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Bundle_ownedPackages_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Bundle_ownedPackages_feature", "_UI_Bundle_type"),
         EclipsePackage.Literals.BUNDLE__OWNED_PACKAGES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the All Exported Packages feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAllExportedPackagesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Bundle_allExportedPackages_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Bundle_allExportedPackages_feature", "_UI_Bundle_type"),
         EclipsePackage.Literals.BUNDLE__ALL_EXPORTED_PACKAGES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Exported Packages feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addExportedPackagesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Bundle_exportedPackages_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Bundle_exportedPackages_feature", "_UI_Bundle_type"),
         EclipsePackage.Literals.BUNDLE__EXPORTED_PACKAGES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__PROVIDED_SERVICES);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__REQUIRED_SERVICES);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__PART_CATEGORIES);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__PERSPECTIVES);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__HELPS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Bundle.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Bundle"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((Bundle)object).getProjectName();
    return label == null || label.length() == 0 ?
      getString("_UI_Bundle_type") :
      getString("_UI_Bundle_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(Bundle.class))
    {
      case EclipsePackage.BUNDLE__VERSION:
      case EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT:
      case EclipsePackage.BUNDLE__VENDOR:
      case EclipsePackage.BUNDLE__BASE_PACKAGE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case EclipsePackage.BUNDLE__PROVIDED_SERVICES:
      case EclipsePackage.BUNDLE__REQUIRED_SERVICES:
      case EclipsePackage.BUNDLE__PART_CATEGORIES:
      case EclipsePackage.BUNDLE__PERSPECTIVES:
      case EclipsePackage.BUNDLE__HELPS:
      case EclipsePackage.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__PROVIDED_SERVICES,
         EclipseFactory.eINSTANCE.createProvidedService()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__REQUIRED_SERVICES,
         EclipseFactory.eINSTANCE.createRequiredService()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__PART_CATEGORIES,
         EclipseFactory.eINSTANCE.createPartCategory()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__PERSPECTIVES,
         EclipseFactory.eINSTANCE.createPerspective()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__HELPS,
         EclipseFactory.eINSTANCE.createHelp()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS,
         EclipseFactory.eINSTANCE.createImportedPackageDeclaration()));
  }

}
