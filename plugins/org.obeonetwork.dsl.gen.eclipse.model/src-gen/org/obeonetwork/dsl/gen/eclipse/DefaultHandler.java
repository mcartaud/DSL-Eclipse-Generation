/**
 */
package org.obeonetwork.dsl.gen.eclipse;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DefaultHandler#getDefaultCommand <em>Default Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDefaultHandler()
 * @model
 * @generated
 */
public interface DefaultHandler extends Handler {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDefaultHandler_DefaultCommand()
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getDefaultHandler
	 * @model opposite="defaultHandler" required="true"
	 * @generated
	 */
	Command getDefaultCommand();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DefaultHandler#getDefaultCommand <em>Default Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Command</em>' reference.
	 * @see #getDefaultCommand()
	 * @generated
	 */
	void setDefaultCommand(Command value);

} // DefaultHandler
