/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Action#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Action#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Action#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAction_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tooltip</em>' attribute.
   * @see #setTooltip(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAction_Tooltip()
   * @model unique="false"
   * @generated
   */
  String getTooltip();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Action#getTooltip <em>Tooltip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tooltip</em>' attribute.
   * @see #getTooltip()
   * @generated
   */
  void setTooltip(String value);

  /**
   * Returns the value of the '<em><b>Command</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Command#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' reference.
   * @see #setCommand(Command)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAction_Command()
   * @see org.obeonetwork.dsl.gen.eclipse.Command#getAction
   * @model opposite="action"
   * @generated
   */
  Command getCommand();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Action#getCommand <em>Command</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(Command value);

} // Action
