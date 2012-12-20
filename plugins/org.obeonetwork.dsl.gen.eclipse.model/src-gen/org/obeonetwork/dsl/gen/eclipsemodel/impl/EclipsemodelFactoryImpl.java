/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.gen.eclipsemodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipsemodelFactoryImpl extends EFactoryImpl implements EclipsemodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EclipsemodelFactory init()
  {
    try
    {
      EclipsemodelFactory theEclipsemodelFactory = (EclipsemodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeonetwork.org/dsl/eclipse"); 
      if (theEclipsemodelFactory != null)
      {
        return theEclipsemodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EclipsemodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclipsemodelFactoryImpl()
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
      case EclipsemodelPackage.APPLICATION: return createApplication();
      case EclipsemodelPackage.REPOSITORY: return createRepository();
      case EclipsemodelPackage.FEATURE: return createFeature();
      case EclipsemodelPackage.BUNDLE: return createBundle();
      case EclipsemodelPackage.ACTION_SET: return createActionSet();
      case EclipsemodelPackage.MENU: return createMenu();
      case EclipsemodelPackage.ACTION: return createAction();
      case EclipsemodelPackage.PART_CATEGORY: return createPartCategory();
      case EclipsemodelPackage.VIEW: return createView();
      case EclipsemodelPackage.EDITOR: return createEditor();
      case EclipsemodelPackage.PERSPECTIVE: return createPerspective();
      case EclipsemodelPackage.BINDING: return createBinding();
      case EclipsemodelPackage.HELP: return createHelp();
      case EclipsemodelPackage.PAGE: return createPage();
      case EclipsemodelPackage.CONTEXTUAL_HELP: return createContextualHelp();
      case EclipsemodelPackage.SERVICE: return createService();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EclipsemodelPackage.SERVICE_KIND:
        return createServiceKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EclipsemodelPackage.SERVICE_KIND:
        return convertServiceKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceKind createServiceKindFromString(EDataType eDataType, String initialValue)
  {
    ServiceKind result = ServiceKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertServiceKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclipsemodelPackage getEclipsemodelPackage()
  {
    return (EclipsemodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EclipsemodelPackage getPackage()
  {
    return EclipsemodelPackage.eINSTANCE;
  }

} //EclipsemodelFactoryImpl
