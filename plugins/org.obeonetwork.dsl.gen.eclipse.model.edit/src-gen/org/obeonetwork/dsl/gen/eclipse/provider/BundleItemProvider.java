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
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__NATURES);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__BUILDERS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__WIZARDS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__EXTENSIONS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__DECORATORS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__MARKERS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__PERSPECTIVES);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__EDITORS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__VIEWS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__HELP_CONTENTS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__COMMANDS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__MENUS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__ACTION_SETS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__PART_CATEGORIES);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__CONTEXTS);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__CATEGORIES);
      childrenFeatures.add(EclipsePackage.Literals.BUNDLE__BINDINGS);
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
    String label = ((Bundle)object).getName();
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
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case EclipsePackage.BUNDLE__PROVIDED_SERVICES:
      case EclipsePackage.BUNDLE__REQUIRED_SERVICES:
      case EclipsePackage.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS:
      case EclipsePackage.BUNDLE__NATURES:
      case EclipsePackage.BUNDLE__BUILDERS:
      case EclipsePackage.BUNDLE__WIZARDS:
      case EclipsePackage.BUNDLE__EXTENSIONS:
      case EclipsePackage.BUNDLE__DECORATORS:
      case EclipsePackage.BUNDLE__MARKERS:
      case EclipsePackage.BUNDLE__PERSPECTIVES:
      case EclipsePackage.BUNDLE__EDITORS:
      case EclipsePackage.BUNDLE__VIEWS:
      case EclipsePackage.BUNDLE__HELP_CONTENTS:
      case EclipsePackage.BUNDLE__COMMANDS:
      case EclipsePackage.BUNDLE__MENUS:
      case EclipsePackage.BUNDLE__ACTION_SETS:
      case EclipsePackage.BUNDLE__PART_CATEGORIES:
      case EclipsePackage.BUNDLE__CONTEXTS:
      case EclipsePackage.BUNDLE__CATEGORIES:
      case EclipsePackage.BUNDLE__BINDINGS:
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
        (EclipsePackage.Literals.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS,
         EclipseFactory.eINSTANCE.createImportedPackageDeclaration()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__NATURES,
         EclipseFactory.eINSTANCE.createNature()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__BUILDERS,
         EclipseFactory.eINSTANCE.createBuilder()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__WIZARDS,
         EclipseFactory.eINSTANCE.createWizard()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__WIZARDS,
         EclipseFactory.eINSTANCE.createProjectWizard()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__EXTENSIONS,
         EclipseFactory.eINSTANCE.createExtension()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__DECORATORS,
         EclipseFactory.eINSTANCE.createDecorator()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__MARKERS,
         EclipseFactory.eINSTANCE.createMarker()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__PERSPECTIVES,
         EclipseFactory.eINSTANCE.createPerspective()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__EDITORS,
         EclipseFactory.eINSTANCE.createEditor()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__VIEWS,
         EclipseFactory.eINSTANCE.createView()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__HELP_CONTENTS,
         EclipseFactory.eINSTANCE.createHelpContents()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__COMMANDS,
         EclipseFactory.eINSTANCE.createCommand()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__MENUS,
         EclipseFactory.eINSTANCE.createMenu()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__ACTION_SETS,
         EclipseFactory.eINSTANCE.createActionSet()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__PART_CATEGORIES,
         EclipseFactory.eINSTANCE.createPartCategory()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__CONTEXTS,
         EclipseFactory.eINSTANCE.createContext()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__CATEGORIES,
         EclipseFactory.eINSTANCE.createCategory()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsePackage.Literals.BUNDLE__BINDINGS,
         EclipseFactory.eINSTANCE.createBinding()));
  }

}
