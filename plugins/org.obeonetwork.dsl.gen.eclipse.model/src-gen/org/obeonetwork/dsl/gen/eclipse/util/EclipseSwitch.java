/**
 */
package org.obeonetwork.dsl.gen.eclipse.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.obeonetwork.dsl.gen.eclipse.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage
 * @generated
 */
public class EclipseSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EclipsePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclipseSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EclipsePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EclipsePackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.PROJECT:
      {
        Project project = (Project)theEObject;
        T result = caseProject(project);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.REPOSITORY:
      {
        Repository repository = (Repository)theEObject;
        T result = caseRepository(repository);
        if (result == null) result = caseProject(repository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = caseProject(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.BUNDLE:
      {
        Bundle bundle = (Bundle)theEObject;
        T result = caseBundle(bundle);
        if (result == null) result = caseProject(bundle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.IMPORTED_PACKAGE_DECLARATION:
      {
        ImportedPackageDeclaration importedPackageDeclaration = (ImportedPackageDeclaration)theEObject;
        T result = caseImportedPackageDeclaration(importedPackageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.PROVIDED_SERVICE:
      {
        ProvidedService providedService = (ProvidedService)theEObject;
        T result = caseProvidedService(providedService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.REQUIRED_SERVICE:
      {
        RequiredService requiredService = (RequiredService)theEObject;
        T result = caseRequiredService(requiredService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.BUILDER:
      {
        Builder builder = (Builder)theEObject;
        T result = caseBuilder(builder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.NATURE:
      {
        Nature nature = (Nature)theEObject;
        T result = caseNature(nature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.WIZARD:
      {
        Wizard wizard = (Wizard)theEObject;
        T result = caseWizard(wizard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.PROJECT_WIZARD:
      {
        ProjectWizard projectWizard = (ProjectWizard)theEObject;
        T result = caseProjectWizard(projectWizard);
        if (result == null) result = caseWizard(projectWizard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.EXTENSION:
      {
        Extension extension = (Extension)theEObject;
        T result = caseExtension(extension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.DECORATOR:
      {
        Decorator decorator = (Decorator)theEObject;
        T result = caseDecorator(decorator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.MARKER:
      {
        Marker marker = (Marker)theEObject;
        T result = caseMarker(marker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.PERSPECTIVE:
      {
        Perspective perspective = (Perspective)theEObject;
        T result = casePerspective(perspective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.PART:
      {
        Part part = (Part)theEObject;
        T result = casePart(part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.PART_CATEGORY:
      {
        PartCategory partCategory = (PartCategory)theEObject;
        T result = casePartCategory(partCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.VIEW:
      {
        View view = (View)theEObject;
        T result = caseView(view);
        if (result == null) result = casePart(view);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.EDITOR:
      {
        Editor editor = (Editor)theEObject;
        T result = caseEditor(editor);
        if (result == null) result = casePart(editor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.ACTION_SET:
      {
        ActionSet actionSet = (ActionSet)theEObject;
        T result = caseActionSet(actionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.MENU:
      {
        Menu menu = (Menu)theEObject;
        T result = caseMenu(menu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclipsePackage.DYNAMIC_HELP:
      {
        DynamicHelp dynamicHelp = (DynamicHelp)theEObject;
        T result = caseDynamicHelp(dynamicHelp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepository(Repository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBundle(Bundle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imported Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imported Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportedPackageDeclaration(ImportedPackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedService(ProvidedService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredService(RequiredService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Builder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Builder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuilder(Builder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNature(Nature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wizard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wizard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWizard(Wizard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project Wizard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project Wizard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectWizard(ProjectWizard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtension(Extension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decorator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decorator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecorator(Decorator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Marker</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Marker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarker(Marker object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Perspective</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Perspective</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerspective(Perspective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePart(Part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Part Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Part Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartCategory(PartCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseView(View object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Editor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Editor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditor(Editor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionSet(ActionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenu(Menu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Help</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Help</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicHelp(DynamicHelp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EclipseSwitch
