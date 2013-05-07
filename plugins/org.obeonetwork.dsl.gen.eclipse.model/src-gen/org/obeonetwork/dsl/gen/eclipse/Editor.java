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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Editor#isDynamicMenu <em>Dynamic Menu</em>}</li>
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
	 * Returns the value of the '<em><b>Dynamic Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Menu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Menu</em>' attribute.
	 * @see #setDynamicMenu(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditor_DynamicMenu()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDynamicMenu();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Editor#isDynamicMenu <em>Dynamic Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Menu</em>' attribute.
	 * @see #isDynamicMenu()
	 * @generated
	 */
	void setDynamicMenu(boolean value);

} // Editor
