/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage
 * @generated
 */
public interface EclipseFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EclipseFactory eINSTANCE = org.obeonetwork.dsl.gen.eclipse.impl.EclipseFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository</em>'.
   * @generated
   */
  Repository createRepository();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Bundle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bundle</em>'.
   * @generated
   */
  Bundle createBundle();

  /**
   * Returns a new object of class '<em>Imported Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imported Package Declaration</em>'.
   * @generated
   */
  ImportedPackageDeclaration createImportedPackageDeclaration();

  /**
   * Returns a new object of class '<em>Action Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Set</em>'.
   * @generated
   */
  ActionSet createActionSet();

  /**
   * Returns a new object of class '<em>Menu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menu</em>'.
   * @generated
   */
  Menu createMenu();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Part Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Part Category</em>'.
   * @generated
   */
  PartCategory createPartCategory();

  /**
   * Returns a new object of class '<em>View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View</em>'.
   * @generated
   */
  View createView();

  /**
   * Returns a new object of class '<em>Editor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Editor</em>'.
   * @generated
   */
  Editor createEditor();

  /**
   * Returns a new object of class '<em>Perspective</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Perspective</em>'.
   * @generated
   */
  Perspective createPerspective();

  /**
   * Returns a new object of class '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding</em>'.
   * @generated
   */
  Binding createBinding();

  /**
   * Returns a new object of class '<em>Help</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Help</em>'.
   * @generated
   */
  Help createHelp();

  /**
   * Returns a new object of class '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page</em>'.
   * @generated
   */
  Page createPage();

  /**
   * Returns a new object of class '<em>Contextual Help</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contextual Help</em>'.
   * @generated
   */
  ContextualHelp createContextualHelp();

  /**
   * Returns a new object of class '<em>Provided Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provided Service</em>'.
   * @generated
   */
  ProvidedService createProvidedService();

  /**
   * Returns a new object of class '<em>Required Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Service</em>'.
   * @generated
   */
  RequiredService createRequiredService();

  /**
   * Returns a new object of class '<em>Builder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Builder</em>'.
   * @generated
   */
  Builder createBuilder();

  /**
   * Returns a new object of class '<em>Nature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nature</em>'.
   * @generated
   */
  Nature createNature();

  /**
   * Returns a new object of class '<em>Wizard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wizard</em>'.
   * @generated
   */
  Wizard createWizard();

  /**
   * Returns a new object of class '<em>Project Wizard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project Wizard</em>'.
   * @generated
   */
  ProjectWizard createProjectWizard();

  /**
   * Returns a new object of class '<em>Extension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension</em>'.
   * @generated
   */
  Extension createExtension();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EclipsePackage getEclipsePackage();

} //EclipseFactory
