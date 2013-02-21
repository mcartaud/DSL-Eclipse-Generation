/**
 */
package org.obeonetwork.dsl.gen.eclipse;

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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Menu#getCommand <em>Command</em>}</li>
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
   * Returns the value of the '<em><b>Command</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Command#getMenu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' reference.
   * @see #setCommand(Command)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getMenu_Command()
   * @see org.obeonetwork.dsl.gen.eclipse.Command#getMenu
   * @model opposite="menu"
   * @generated
   */
  Command getCommand();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Menu#getCommand <em>Command</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(Command value);

} // Menu
