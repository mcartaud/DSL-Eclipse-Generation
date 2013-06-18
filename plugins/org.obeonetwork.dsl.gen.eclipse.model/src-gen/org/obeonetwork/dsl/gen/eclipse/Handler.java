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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Handler#getDefaultCommand <em>Default Command</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Handler#getCommands <em>Commands</em>}</li>
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
	 * @see #setMnemonic(char)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHandler_Mnemonic()
	 * @model unique="false"
	 * @generated
	 */
	char getMnemonic();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Handler#getMnemonic <em>Mnemonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mnemonic</em>' attribute.
	 * @see #getMnemonic()
	 * @generated
	 */
	void setMnemonic(char value);

	/**
	 * Returns the value of the '<em><b>Default Command</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Command#getDefaultHandler <em>Default Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Command</em>' reference.
	 * @see #setDefaultCommand(Command)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHandler_DefaultCommand()
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getDefaultHandler
	 * @model opposite="defaultHandler" required="true"
	 * @generated
	 */
	Command getDefaultCommand();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Handler#getDefaultCommand <em>Default Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Command</em>' reference.
	 * @see #getDefaultCommand()
	 * @generated
	 */
	void setDefaultCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Command}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Command#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getHandler_Commands()
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getHandlers
	 * @model opposite="handlers"
	 * @generated
	 */
	EList<Command> getCommands();

} // Handler
