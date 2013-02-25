/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Command#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Command#getAction <em>Action</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Command#getMenu <em>Menu</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Command#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Command#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Command#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCommand_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Command#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Action#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCommand_Action()
   * @see org.obeonetwork.dsl.gen.eclipse.Action#getCommand
   * @model opposite="command"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Command#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Menu</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Menu#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menu</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menu</em>' reference.
   * @see #setMenu(Menu)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCommand_Menu()
   * @see org.obeonetwork.dsl.gen.eclipse.Menu#getCommands
   * @model opposite="commands"
   * @generated
   */
  Menu getMenu();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Command#getMenu <em>Menu</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menu</em>' reference.
   * @see #getMenu()
   * @generated
   */
  void setMenu(Menu value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Category#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference.
   * @see #setCategory(Category)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCommand_Category()
   * @see org.obeonetwork.dsl.gen.eclipse.Category#getCommands
   * @model opposite="commands"
   * @generated
   */
  Category getCategory();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Command#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
  void setCategory(Category value);

  /**
   * Returns the value of the '<em><b>Binding</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Binding#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' reference.
   * @see #setBinding(Binding)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCommand_Binding()
   * @see org.obeonetwork.dsl.gen.eclipse.Binding#getCommand
   * @model opposite="command"
   * @generated
   */
  Binding getBinding();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Command#getBinding <em>Binding</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding</em>' reference.
   * @see #getBinding()
   * @generated
   */
  void setBinding(Binding value);

  /**
   * Returns the value of the '<em><b>Context</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Context#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference.
   * @see #setContext(Context)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCommand_Context()
   * @see org.obeonetwork.dsl.gen.eclipse.Context#getCommands
   * @model opposite="commands"
   * @generated
   */
  Context getContext();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Command#getContext <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' reference.
   * @see #getContext()
   * @generated
   */
  void setContext(Context value);

} // Command
