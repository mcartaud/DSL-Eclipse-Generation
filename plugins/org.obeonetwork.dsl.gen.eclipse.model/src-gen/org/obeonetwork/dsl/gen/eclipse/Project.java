/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Project#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Project#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProject()
 * @model abstract="true"
 * @generated
 */
public interface Project extends EObject {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProject_Name()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProject_ID()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Namespace" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Project#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // Project
