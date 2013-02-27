/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Help</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getTitle <em>Title</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getHelpPages <em>Help Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDynamicHelp()
 * @model
 * @generated
 */
public interface DynamicHelp extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDynamicHelp_Description()
   * @model unique="false"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDynamicHelp_Label()
   * @model unique="false"
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDynamicHelp_Title()
   * @model unique="false"
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Help Pages</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.HelpPage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Help Pages</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help Pages</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDynamicHelp_HelpPages()
   * @model
   * @generated
   */
  EList<HelpPage> getHelpPages();

} // DynamicHelp
