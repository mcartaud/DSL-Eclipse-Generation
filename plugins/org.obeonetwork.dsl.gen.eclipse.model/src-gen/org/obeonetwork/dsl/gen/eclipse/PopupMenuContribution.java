/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Popup Menu Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getMenus <em>Menus</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPopupMenuContribution()
 * @model
 * @generated
 */
public interface PopupMenuContribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPopupMenuContribution_Commands()
	 * @model
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.MenuContribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPopupMenuContribution_Menus()
	 * @model
	 * @generated
	 */
	EList<MenuContribution> getMenus();

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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPopupMenuContribution_Name()
	 * @model dataType="org.obeonetwork.dsl.gen.eclipse.Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PopupMenuContribution
