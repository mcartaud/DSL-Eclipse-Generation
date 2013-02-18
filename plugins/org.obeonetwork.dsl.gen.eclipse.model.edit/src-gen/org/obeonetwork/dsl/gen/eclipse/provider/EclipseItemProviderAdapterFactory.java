/**
 */
package org.obeonetwork.dsl.gen.eclipse.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.obeonetwork.dsl.gen.eclipse.util.EclipseAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipseItemProviderAdapterFactory extends EclipseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclipseItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Application} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationItemProvider applicationItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Application}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createApplicationAdapter()
  {
    if (applicationItemProvider == null)
    {
      applicationItemProvider = new ApplicationItemProvider(this);
    }

    return applicationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Repository} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryItemProvider repositoryItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Repository}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRepositoryAdapter()
  {
    if (repositoryItemProvider == null)
    {
      repositoryItemProvider = new RepositoryItemProvider(this);
    }

    return repositoryItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Feature} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureItemProvider featureItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFeatureAdapter()
  {
    if (featureItemProvider == null)
    {
      featureItemProvider = new FeatureItemProvider(this);
    }

    return featureItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Bundle} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BundleItemProvider bundleItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Bundle}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBundleAdapter()
  {
    if (bundleItemProvider == null)
    {
      bundleItemProvider = new BundleItemProvider(this);
    }

    return bundleItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportedPackageDeclarationItemProvider importedPackageDeclarationItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createImportedPackageDeclarationAdapter()
  {
    if (importedPackageDeclarationItemProvider == null)
    {
      importedPackageDeclarationItemProvider = new ImportedPackageDeclarationItemProvider(this);
    }

    return importedPackageDeclarationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.ProvidedService} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidedServiceItemProvider providedServiceItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.ProvidedService}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createProvidedServiceAdapter()
  {
    if (providedServiceItemProvider == null)
    {
      providedServiceItemProvider = new ProvidedServiceItemProvider(this);
    }

    return providedServiceItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.RequiredService} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequiredServiceItemProvider requiredServiceItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.RequiredService}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRequiredServiceAdapter()
  {
    if (requiredServiceItemProvider == null)
    {
      requiredServiceItemProvider = new RequiredServiceItemProvider(this);
    }

    return requiredServiceItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Builder} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuilderItemProvider builderItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Builder}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBuilderAdapter()
  {
    if (builderItemProvider == null)
    {
      builderItemProvider = new BuilderItemProvider(this);
    }

    return builderItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Nature} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NatureItemProvider natureItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Nature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createNatureAdapter()
  {
    if (natureItemProvider == null)
    {
      natureItemProvider = new NatureItemProvider(this);
    }

    return natureItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Wizard} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WizardItemProvider wizardItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Wizard}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createWizardAdapter()
  {
    if (wizardItemProvider == null)
    {
      wizardItemProvider = new WizardItemProvider(this);
    }

    return wizardItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.ProjectWizard} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectWizardItemProvider projectWizardItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.ProjectWizard}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createProjectWizardAdapter()
  {
    if (projectWizardItemProvider == null)
    {
      projectWizardItemProvider = new ProjectWizardItemProvider(this);
    }

    return projectWizardItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Extension} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtensionItemProvider extensionItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Extension}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createExtensionAdapter()
  {
    if (extensionItemProvider == null)
    {
      extensionItemProvider = new ExtensionItemProvider(this);
    }

    return extensionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Attribute} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeItemProvider attributeItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeAdapter()
  {
    if (attributeItemProvider == null)
    {
      attributeItemProvider = new AttributeItemProvider(this);
    }

    return attributeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Decorator} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecoratorItemProvider decoratorItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Decorator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDecoratorAdapter()
  {
    if (decoratorItemProvider == null)
    {
      decoratorItemProvider = new DecoratorItemProvider(this);
    }

    return decoratorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Marker} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarkerItemProvider markerItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Marker}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMarkerAdapter()
  {
    if (markerItemProvider == null)
    {
      markerItemProvider = new MarkerItemProvider(this);
    }

    return markerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Perspective} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerspectiveItemProvider perspectiveItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Perspective}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createPerspectiveAdapter()
  {
    if (perspectiveItemProvider == null)
    {
      perspectiveItemProvider = new PerspectiveItemProvider(this);
    }

    return perspectiveItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.PartCategory} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartCategoryItemProvider partCategoryItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.PartCategory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createPartCategoryAdapter()
  {
    if (partCategoryItemProvider == null)
    {
      partCategoryItemProvider = new PartCategoryItemProvider(this);
    }

    return partCategoryItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.View} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewItemProvider viewItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.View}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createViewAdapter()
  {
    if (viewItemProvider == null)
    {
      viewItemProvider = new ViewItemProvider(this);
    }

    return viewItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Editor} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditorItemProvider editorItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Editor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEditorAdapter()
  {
    if (editorItemProvider == null)
    {
      editorItemProvider = new EditorItemProvider(this);
    }

    return editorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.ActionSet} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionSetItemProvider actionSetItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.ActionSet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createActionSetAdapter()
  {
    if (actionSetItemProvider == null)
    {
      actionSetItemProvider = new ActionSetItemProvider(this);
    }

    return actionSetItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Menu} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MenuItemProvider menuItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Menu}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMenuAdapter()
  {
    if (menuItemProvider == null)
    {
      menuItemProvider = new MenuItemProvider(this);
    }

    return menuItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.Action} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionItemProvider actionItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createActionAdapter()
  {
    if (actionItemProvider == null)
    {
      actionItemProvider = new ActionItemProvider(this);
    }

    return actionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.HelpContents} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HelpContentsItemProvider helpContentsItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.HelpContents}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createHelpContentsAdapter()
  {
    if (helpContentsItemProvider == null)
    {
      helpContentsItemProvider = new HelpContentsItemProvider(this);
    }

    return helpContentsItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.HelpPage} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HelpPageItemProvider helpPageItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.HelpPage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createHelpPageAdapter()
  {
    if (helpPageItemProvider == null)
    {
      helpPageItemProvider = new HelpPageItemProvider(this);
    }

    return helpPageItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicHelpItemProvider dynamicHelpItemProvider;

  /**
   * This creates an adapter for a {@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDynamicHelpAdapter()
  {
    if (dynamicHelpItemProvider == null)
    {
      dynamicHelpItemProvider = new DynamicHelpItemProvider(this);
    }

    return dynamicHelpItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (applicationItemProvider != null) applicationItemProvider.dispose();
    if (repositoryItemProvider != null) repositoryItemProvider.dispose();
    if (featureItemProvider != null) featureItemProvider.dispose();
    if (bundleItemProvider != null) bundleItemProvider.dispose();
    if (importedPackageDeclarationItemProvider != null) importedPackageDeclarationItemProvider.dispose();
    if (providedServiceItemProvider != null) providedServiceItemProvider.dispose();
    if (requiredServiceItemProvider != null) requiredServiceItemProvider.dispose();
    if (builderItemProvider != null) builderItemProvider.dispose();
    if (natureItemProvider != null) natureItemProvider.dispose();
    if (wizardItemProvider != null) wizardItemProvider.dispose();
    if (projectWizardItemProvider != null) projectWizardItemProvider.dispose();
    if (extensionItemProvider != null) extensionItemProvider.dispose();
    if (attributeItemProvider != null) attributeItemProvider.dispose();
    if (decoratorItemProvider != null) decoratorItemProvider.dispose();
    if (markerItemProvider != null) markerItemProvider.dispose();
    if (perspectiveItemProvider != null) perspectiveItemProvider.dispose();
    if (partCategoryItemProvider != null) partCategoryItemProvider.dispose();
    if (viewItemProvider != null) viewItemProvider.dispose();
    if (editorItemProvider != null) editorItemProvider.dispose();
    if (actionSetItemProvider != null) actionSetItemProvider.dispose();
    if (menuItemProvider != null) menuItemProvider.dispose();
    if (actionItemProvider != null) actionItemProvider.dispose();
    if (helpContentsItemProvider != null) helpContentsItemProvider.dispose();
    if (helpPageItemProvider != null) helpPageItemProvider.dispose();
    if (dynamicHelpItemProvider != null) dynamicHelpItemProvider.dispose();
  }

}
