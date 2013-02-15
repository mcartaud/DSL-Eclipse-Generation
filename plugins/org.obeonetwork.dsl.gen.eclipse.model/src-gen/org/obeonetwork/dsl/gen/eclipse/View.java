/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.View#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.View#isIsTree <em>Is Tree</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.View#getActions <em>Actions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.View#getMenus <em>Menus</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.View#getPerspectives <em>Perspectives</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView()
 * @model
 * @generated
 */
public interface View extends Part
{

  /**
   * Returns the value of the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' attribute.
   * @see #setCategory(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView_Category()
   * @model unique="false"
   * @generated
   */
  String getCategory();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.View#getCategory <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' attribute.
   * @see #getCategory()
   * @generated
   */
  void setCategory(String value);

  /**
   * Returns the value of the '<em><b>Is Tree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Tree</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Tree</em>' attribute.
   * @see #setIsTree(boolean)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView_IsTree()
   * @model unique="false"
   * @generated
   */
  boolean isIsTree();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.View#isIsTree <em>Is Tree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Tree</em>' attribute.
   * @see #isIsTree()
   * @generated
   */
  void setIsTree(boolean value);

  /**
   * Returns the value of the '<em><b>Perspectives</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Perspective}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Perspectives</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perspectives</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView_Perspectives()
   * @see org.obeonetwork.dsl.gen.eclipse.Perspective#getViews
   * @model opposite="views"
   * @generated
   */
  EList<Perspective> getPerspectives();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView_Menus()
   * @model containment="true"
   * @generated
   */
  EList<Menu> getMenus();
} // View
