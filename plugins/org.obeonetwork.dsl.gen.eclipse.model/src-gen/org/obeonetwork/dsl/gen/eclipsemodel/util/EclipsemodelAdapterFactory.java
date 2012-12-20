/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.gen.eclipsemodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage
 * @generated
 */
public class EclipsemodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EclipsemodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclipsemodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EclipsemodelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EclipsemodelSwitch<Adapter> modelSwitch =
    new EclipsemodelSwitch<Adapter>()
    {
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseRepository(Repository object)
      {
        return createRepositoryAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseBundle(Bundle object)
      {
        return createBundleAdapter();
      }
      @Override
      public Adapter caseActionSet(ActionSet object)
      {
        return createActionSetAdapter();
      }
      @Override
      public Adapter caseMenu(Menu object)
      {
        return createMenuAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter casePartCategory(PartCategory object)
      {
        return createPartCategoryAdapter();
      }
      @Override
      public Adapter casePart(Part object)
      {
        return createPartAdapter();
      }
      @Override
      public Adapter caseView(View object)
      {
        return createViewAdapter();
      }
      @Override
      public Adapter caseEditor(Editor object)
      {
        return createEditorAdapter();
      }
      @Override
      public Adapter casePerspective(Perspective object)
      {
        return createPerspectiveAdapter();
      }
      @Override
      public Adapter caseBinding(Binding object)
      {
        return createBindingAdapter();
      }
      @Override
      public Adapter caseHelp(Help object)
      {
        return createHelpAdapter();
      }
      @Override
      public Adapter casePage(Page object)
      {
        return createPageAdapter();
      }
      @Override
      public Adapter caseContextualHelp(ContextualHelp object)
      {
        return createContextualHelpAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository
   * @generated
   */
  public Adapter createRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle
   * @generated
   */
  public Adapter createBundleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.ActionSet <em>Action Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ActionSet
   * @generated
   */
  public Adapter createActionSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Menu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Menu
   * @generated
   */
  public Adapter createMenuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.PartCategory <em>Part Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.PartCategory
   * @generated
   */
  public Adapter createPartCategoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Part
   * @generated
   */
  public Adapter createPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.View
   * @generated
   */
  public Adapter createViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Editor <em>Editor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Editor
   * @generated
   */
  public Adapter createEditorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective <em>Perspective</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Perspective
   * @generated
   */
  public Adapter createPerspectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Binding
   * @generated
   */
  public Adapter createBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Help <em>Help</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Help
   * @generated
   */
  public Adapter createHelpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Page
   * @generated
   */
  public Adapter createPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.ContextualHelp <em>Contextual Help</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ContextualHelp
   * @generated
   */
  public Adapter createContextualHelpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EclipsemodelAdapterFactory
