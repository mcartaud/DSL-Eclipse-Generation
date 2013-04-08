/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Handler#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Handler#getMnemonic <em>Mnemonic</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Handler#getCommand <em>Command</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Handler#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHandler()
 * @model
 * @generated
 */
public interface Handler extends EObject {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHandler_Name()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Handler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mnemonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mnemonic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mnemonic</em>' attribute.
	 * @see #setMnemonic(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHandler_Mnemonic()
	 * @model unique="false"
	 * @generated
	 */
	String getMnemonic();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Handler#getMnemonic <em>Mnemonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mnemonic</em>' attribute.
	 * @see #getMnemonic()
	 * @generated
	 */
	void setMnemonic(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Command#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHandler_Command()
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getHandler
	 * @model opposite="handler"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Handler#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHandler_Contexts()
	 * @model
	 * @generated
	 */
	EList<Context> getContexts();

} // Handler