/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Help Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.HelpPage#getHelpPages <em>Help Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHelpPage()
 * @model
 * @generated
 */
public interface HelpPage extends Help
{
  /**
   * Returns the value of the '<em><b>Help Pages</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.HelpPage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Help Pages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help Pages</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHelpPage_HelpPages()
   * @model containment="true"
   * @generated
   */
  EList<HelpPage> getHelpPages();

} // HelpPage
