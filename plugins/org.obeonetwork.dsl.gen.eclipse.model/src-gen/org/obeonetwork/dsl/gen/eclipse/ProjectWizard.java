/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Wizard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ProjectWizard#getNatures <em>Natures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProjectWizard()
 * @model
 * @generated
 */
public interface ProjectWizard extends Wizard
{
  /**
   * Returns the value of the '<em><b>Natures</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Nature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Natures</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Natures</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProjectWizard_Natures()
   * @model
   * @generated
   */
  EList<Nature> getNatures();

} // ProjectWizard
