/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Help</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getHelpPage <em>Help Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDynamicHelp()
 * @model
 * @generated
 */
public interface DynamicHelp extends Help
{
  /**
   * Returns the value of the '<em><b>Help Page</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Help Page</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help Page</em>' containment reference.
   * @see #setHelpPage(HelpPage)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDynamicHelp_HelpPage()
   * @model containment="true"
   * @generated
   */
  HelpPage getHelpPage();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getHelpPage <em>Help Page</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Help Page</em>' containment reference.
   * @see #getHelpPage()
   * @generated
   */
  void setHelpPage(HelpPage value);

} // DynamicHelp
