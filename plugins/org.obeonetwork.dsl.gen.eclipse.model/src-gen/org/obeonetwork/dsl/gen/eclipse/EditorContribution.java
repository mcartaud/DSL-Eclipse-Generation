/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#getEditor <em>Editor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#getActions <em>Actions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#getMenus <em>Menus</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#isToolbarContribution <em>Toolbar Contribution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#isMenuContribution <em>Menu Contribution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#isPopupContribution <em>Popup Contribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditorContribution()
 * @model
 * @generated
 */
public interface EditorContribution extends EObject {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditorContribution_Name()
	 * @model dataType="org.obeonetwork.dsl.gen.eclipse.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' reference.
	 * @see #setEditor(Editor)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditorContribution_Editor()
	 * @model required="true"
	 * @generated
	 */
	Editor getEditor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#getEditor <em>Editor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' reference.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(Editor value);

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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditorContribution_Actions()
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditorContribution_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();

	/**
	 * Returns the value of the '<em><b>Toolbar Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolbar Contribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolbar Contribution</em>' attribute.
	 * @see #setToolbarContribution(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditorContribution_ToolbarContribution()
	 * @model
	 * @generated
	 */
	boolean isToolbarContribution();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#isToolbarContribution <em>Toolbar Contribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toolbar Contribution</em>' attribute.
	 * @see #isToolbarContribution()
	 * @generated
	 */
	void setToolbarContribution(boolean value);

	/**
	 * Returns the value of the '<em><b>Menu Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Contribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Contribution</em>' attribute.
	 * @see #setMenuContribution(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditorContribution_MenuContribution()
	 * @model
	 * @generated
	 */
	boolean isMenuContribution();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#isMenuContribution <em>Menu Contribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Contribution</em>' attribute.
	 * @see #isMenuContribution()
	 * @generated
	 */
	void setMenuContribution(boolean value);

	/**
	 * Returns the value of the '<em><b>Popup Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Popup Contribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Popup Contribution</em>' attribute.
	 * @see #setPopupContribution(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getEditorContribution_PopupContribution()
	 * @model
	 * @generated
	 */
	boolean isPopupContribution();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.EditorContribution#isPopupContribution <em>Popup Contribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popup Contribution</em>' attribute.
	 * @see #isPopupContribution()
	 * @generated
	 */
	void setPopupContribution(boolean value);

} // EditorContribution
