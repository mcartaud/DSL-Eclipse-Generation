/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.obeonetwork.dsl.gen.eclipsemodel.Bundle;
import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelFactory;
import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleItemProvider
  extends ItemProviderAdapter
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

      addNamePropertyDescriptor(object);
      addSymbolicNamePropertyDescriptor(object);
      addVersionPropertyDescriptor(object);
      addRequiredEnvironmentPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Bundle_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Bundle_name_feature", "_UI_Bundle_type"),
         EclipsemodelPackage.Literals.BUNDLE__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Symbolic Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSymbolicNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Bundle_symbolicName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Bundle_symbolicName_feature", "_UI_Bundle_type"),
         EclipsemodelPackage.Literals.BUNDLE__SYMBOLIC_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
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
         EclipsemodelPackage.Literals.BUNDLE__VERSION,
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
         EclipsemodelPackage.Literals.BUNDLE__REQUIRED_ENVIRONMENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
      childrenFeatures.add(EclipsemodelPackage.Literals.BUNDLE__SERVICES);
      childrenFeatures.add(EclipsemodelPackage.Literals.BUNDLE__PART_CATEGORIES);
      childrenFeatures.add(EclipsemodelPackage.Literals.BUNDLE__PERSPECTIVES);
      childrenFeatures.add(EclipsemodelPackage.Literals.BUNDLE__HELPS);
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
      case EclipsemodelPackage.BUNDLE__NAME:
      case EclipsemodelPackage.BUNDLE__SYMBOLIC_NAME:
      case EclipsemodelPackage.BUNDLE__VERSION:
      case EclipsemodelPackage.BUNDLE__REQUIRED_ENVIRONMENT:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case EclipsemodelPackage.BUNDLE__SERVICES:
      case EclipsemodelPackage.BUNDLE__PART_CATEGORIES:
      case EclipsemodelPackage.BUNDLE__PERSPECTIVES:
      case EclipsemodelPackage.BUNDLE__HELPS:
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
        (EclipsemodelPackage.Literals.BUNDLE__SERVICES,
         EclipsemodelFactory.eINSTANCE.createService()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsemodelPackage.Literals.BUNDLE__PART_CATEGORIES,
         EclipsemodelFactory.eINSTANCE.createPartCategory()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsemodelPackage.Literals.BUNDLE__PERSPECTIVES,
         EclipsemodelFactory.eINSTANCE.createPerspective()));

    newChildDescriptors.add
      (createChildParameter
        (EclipsemodelPackage.Literals.BUNDLE__HELPS,
         EclipsemodelFactory.eINSTANCE.createHelp()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return EclipsemodelEditPlugin.INSTANCE;
  }

}
