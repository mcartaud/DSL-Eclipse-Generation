/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.gen.eclipse.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipseFactoryImpl extends EFactoryImpl implements EclipseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EclipseFactory init()
  {
    try
    {
      EclipseFactory theEclipseFactory = (EclipseFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeonetwork.org/dsl/eclipse"); 
      if (theEclipseFactory != null)
      {
        return theEclipseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EclipseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclipseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EclipsePackage.APPLICATION: return createApplication();
      case EclipsePackage.REPOSITORY: return createRepository();
      case EclipsePackage.FEATURE: return createFeature();
      case EclipsePackage.BUNDLE: return createBundle();
      case EclipsePackage.IMPORTED_PACKAGE_DECLARATION: return createImportedPackageDeclaration();
      case EclipsePackage.ACTION_SET: return createActionSet();
      case EclipsePackage.MENU: return createMenu();
      case EclipsePackage.ACTION: return createAction();
      case EclipsePackage.PART_CATEGORY: return createPartCategory();
      case EclipsePackage.VIEW: return createView();
      case EclipsePackage.EDITOR: return createEditor();
      case EclipsePackage.PERSPECTIVE: return createPerspective();
      case EclipsePackage.BINDING: return createBinding();
      case EclipsePackage.HELP: return createHelp();
      case EclipsePackage.PAGE: return createPage();
      case EclipsePackage.CONTEXTUAL_HELP: return createContextualHelp();
      case EclipsePackage.PROVIDED_SERVICE: return createProvidedService();
      case EclipsePackage.REQUIRED_SERVICE: return createRequiredService();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repository createRepository()
  {
    RepositoryImpl repository = new RepositoryImpl();
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bundle createBundle()
  {
    BundleImpl bundle = new BundleImpl();
    return bundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportedPackageDeclaration createImportedPackageDeclaration()
  {
    ImportedPackageDeclarationImpl importedPackageDeclaration = new ImportedPackageDeclarationImpl();
    return importedPackageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionSet createActionSet()
  {
    ActionSetImpl actionSet = new ActionSetImpl();
    return actionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menu createMenu()
  {
    MenuImpl menu = new MenuImpl();
    return menu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartCategory createPartCategory()
  {
    PartCategoryImpl partCategory = new PartCategoryImpl();
    return partCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Editor createEditor()
  {
    EditorImpl editor = new EditorImpl();
    return editor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Perspective createPerspective()
  {
    PerspectiveImpl perspective = new PerspectiveImpl();
    return perspective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Help createHelp()
  {
    HelpImpl help = new HelpImpl();
    return help;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextualHelp createContextualHelp()
  {
    ContextualHelpImpl contextualHelp = new ContextualHelpImpl();
    return contextualHelp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedService createProvidedService()
  {
    ProvidedServiceImpl providedService = new ProvidedServiceImpl();
    return providedService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredService createRequiredService()
  {
    RequiredServiceImpl requiredService = new RequiredServiceImpl();
    return requiredService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclipsePackage getEclipsePackage()
  {
    return (EclipsePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EclipsePackage getPackage()
  {
    return EclipsePackage.eINSTANCE;
  }

} //EclipseFactoryImpl
