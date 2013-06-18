/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextual Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContextualHandler()
 * @model
 * @generated
 */
public interface ContextualHandler extends Handler {

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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContextualHandler_Commands()
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getHandlers
	 * @model opposite="handlers" required="true"
	 * @generated
	 */
	EList<Command> getCommands();
} // ContextualHandler
