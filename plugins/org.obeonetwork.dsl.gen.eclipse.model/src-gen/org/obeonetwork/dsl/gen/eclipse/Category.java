/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Category#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Category#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Category#getViews <em>Views</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Category#getWizards <em>Wizards</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCategory_Name()
   * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Name" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Category#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Command}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Command#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCategory_Commands()
   * @see org.obeonetwork.dsl.gen.eclipse.Command#getCategory
   * @model opposite="category"
   * @generated
   */
  EList<Command> getCommands();

  /**
   * Returns the value of the '<em><b>Views</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.View}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.View#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Views</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCategory_Views()
   * @see org.obeonetwork.dsl.gen.eclipse.View#getCategory
   * @model opposite="category"
   * @generated
   */
  EList<View> getViews();

  /**
   * Returns the value of the '<em><b>Wizards</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Wizard}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Wizard#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wizards</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wizards</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getCategory_Wizards()
   * @see org.obeonetwork.dsl.gen.eclipse.Wizard#getCategory
   * @model opposite="category"
   * @generated
   */
  EList<Wizard> getWizards();

} // Category
