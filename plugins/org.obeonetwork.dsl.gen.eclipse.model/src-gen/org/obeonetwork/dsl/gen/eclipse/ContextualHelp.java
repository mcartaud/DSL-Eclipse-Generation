/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextual Help</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ContextualHelp#getContextualHelpID <em>Contextual Help ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ContextualHelp#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContextualHelp()
 * @model
 * @generated
 */
public interface ContextualHelp extends EObject
{
  /**
   * Returns the value of the '<em><b>Contextual Help ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contextual Help ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contextual Help ID</em>' attribute.
   * @see #setContextualHelpID(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContextualHelp_ContextualHelpID()
   * @model unique="false"
   * @generated
   */
  String getContextualHelpID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHelp#getContextualHelpID <em>Contextual Help ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contextual Help ID</em>' attribute.
   * @see #getContextualHelpID()
   * @generated
   */
  void setContextualHelpID(String value);

  /**
   * Returns the value of the '<em><b>Page</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Page</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page</em>' containment reference.
   * @see #setPage(Page)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContextualHelp_Page()
   * @model containment="true"
   * @generated
   */
  Page getPage();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHelp#getPage <em>Page</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Page</em>' containment reference.
   * @see #getPage()
   * @generated
   */
  void setPage(Page value);

} // ContextualHelp
