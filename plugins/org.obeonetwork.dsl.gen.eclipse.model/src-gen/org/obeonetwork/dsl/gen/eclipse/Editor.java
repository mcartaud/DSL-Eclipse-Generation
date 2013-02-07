/**
 */
package org.obeonetwork.dsl.gen.eclipse;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Editor#getEditorID <em>Editor ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Editor#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditor()
 * @model
 * @generated
 */
public interface Editor extends Part
{
  /**
   * Returns the value of the '<em><b>Editor ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Editor ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Editor ID</em>' attribute.
   * @see #setEditorID(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditor_EditorID()
   * @model unique="false"
   * @generated
   */
  String getEditorID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Editor#getEditorID <em>Editor ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Editor ID</em>' attribute.
   * @see #getEditorID()
   * @generated
   */
  void setEditorID(String value);

  /**
   * Returns the value of the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' attribute.
   * @see #setLanguage(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditor_Language()
   * @model unique="false"
   * @generated
   */
  String getLanguage();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Editor#getLanguage <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' attribute.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(String value);

} // Editor
