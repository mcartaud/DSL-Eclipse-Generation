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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Editor#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Editor#getEditorType <em>Editor Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditor()
 * @model
 * @generated
 */
public interface Editor extends Part {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditor_Extension()
	 * @model unique="false"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Editor#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Editor Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.gen.eclipse.EditorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Type</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.EditorType
	 * @see #setEditorType(EditorType)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditor_EditorType()
	 * @model
	 * @generated
	 */
	EditorType getEditorType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Editor#getEditorType <em>Editor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Type</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.EditorType
	 * @see #getEditorType()
	 * @generated
	 */
	void setEditorType(EditorType value);

} // Editor
