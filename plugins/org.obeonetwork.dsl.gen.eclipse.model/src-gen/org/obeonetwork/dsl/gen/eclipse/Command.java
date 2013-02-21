/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Command#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Command#getBinding <em>Binding</em>}</li>
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
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Menu#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menu</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menu</em>' reference.
   * @see #setMenu(Menu)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCommand_Menu()
   * @see org.obeonetwork.dsl.gen.eclipse.Menu#getCommand
   * @model opposite="command"
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
   * Returns the value of the '<em><b>Categories</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Category}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Category#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Categories</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Categories</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCommand_Categories()
   * @see org.obeonetwork.dsl.gen.eclipse.Category#getCommands
   * @model opposite="commands"
   * @generated
   */
  EList<Category> getCategories();

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

} // Command
