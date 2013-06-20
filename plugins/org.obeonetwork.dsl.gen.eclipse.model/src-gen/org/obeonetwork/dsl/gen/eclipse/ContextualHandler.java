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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getActivateWith <em>Activate With</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getAssociatedWith <em>Associated With</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Activate With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activate With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activate With</em>' attribute.
	 * @see #setActivateWith(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContextualHandler_ActivateWith()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Namespace"
	 * @generated
	 */
	String getActivateWith();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getActivateWith <em>Activate With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activate With</em>' attribute.
	 * @see #getActivateWith()
	 * @generated
	 */
	void setActivateWith(String value);

	/**
	 * Returns the value of the '<em><b>Associated With</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated With</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContextualHandler_AssociatedWith()
	 * @model
	 * @generated
	 */
	EList<Part> getAssociatedWith();

} // ContextualHandler
