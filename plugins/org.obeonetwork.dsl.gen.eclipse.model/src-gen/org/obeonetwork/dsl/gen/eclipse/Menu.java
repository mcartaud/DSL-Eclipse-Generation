/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Menu#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Menu#getMnecmonic <em>Mnecmonic</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Menu#isMenuContribution <em>Menu Contribution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Menu#isToolbarContribution <em>Toolbar Contribution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Menu#getMenus <em>Menus</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Menu#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getMenu_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Menu#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mnecmonic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mnecmonic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mnecmonic</em>' attribute.
   * @see #setMnecmonic(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getMenu_Mnecmonic()
   * @model unique="false"
   * @generated
   */
  String getMnecmonic();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Menu#getMnecmonic <em>Mnecmonic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mnecmonic</em>' attribute.
   * @see #getMnecmonic()
   * @generated
   */
  void setMnecmonic(String value);

  /**
   * Returns the value of the '<em><b>Menu Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menu Contribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menu Contribution</em>' attribute.
   * @see #setMenuContribution(boolean)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getMenu_MenuContribution()
   * @model unique="false"
   * @generated
   */
  boolean isMenuContribution();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Menu#isMenuContribution <em>Menu Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menu Contribution</em>' attribute.
   * @see #isMenuContribution()
   * @generated
   */
  void setMenuContribution(boolean value);

  /**
   * Returns the value of the '<em><b>Toolbar Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Toolbar Contribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Toolbar Contribution</em>' attribute.
   * @see #setToolbarContribution(boolean)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getMenu_ToolbarContribution()
   * @model unique="false"
   * @generated
   */
  boolean isToolbarContribution();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Menu#isToolbarContribution <em>Toolbar Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Toolbar Contribution</em>' attribute.
   * @see #isToolbarContribution()
   * @generated
   */
  void setToolbarContribution(boolean value);

  /**
   * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Menu}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menus</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getMenu_Menus()
   * @model containment="true"
   * @generated
   */
  EList<Menu> getMenus();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Command}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Command#getMenu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getMenu_Commands()
   * @see org.obeonetwork.dsl.gen.eclipse.Command#getMenu
   * @model opposite="menu"
   * @generated
   */
  EList<Command> getCommands();

} // Menu
