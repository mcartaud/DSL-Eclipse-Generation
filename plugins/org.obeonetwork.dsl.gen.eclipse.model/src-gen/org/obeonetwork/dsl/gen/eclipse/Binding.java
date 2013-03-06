/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Binding#getKeySequence <em>Key Sequence</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Binding#getCommand <em>Command</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Binding#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Sequence</em>' attribute.
	 * @see #setKeySequence(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBinding_KeySequence()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getKeySequence();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Binding#getKeySequence <em>Key Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Sequence</em>' attribute.
	 * @see #getKeySequence()
	 * @generated
	 */
	void setKeySequence(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Command#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBinding_Command()
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getBinding
	 * @model opposite="binding"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Binding#getCommand <em>Command</em>}' reference.
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBinding_Contexts()
	 * @model
	 * @generated
	 */
	EList<Context> getContexts();

} // Binding
