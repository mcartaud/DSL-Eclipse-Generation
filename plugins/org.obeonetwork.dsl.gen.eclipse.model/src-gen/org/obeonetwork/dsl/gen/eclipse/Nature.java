/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Nature#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Nature#isHasToggleNature <em>Has Toggle Nature</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Nature#getBuilders <em>Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getNature()
 * @model
 * @generated
 */
public interface Nature extends EObject {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getNature_Name()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Nature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Toggle Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Toggle Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Toggle Nature</em>' attribute.
	 * @see #setHasToggleNature(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getNature_HasToggleNature()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHasToggleNature();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Nature#isHasToggleNature <em>Has Toggle Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Toggle Nature</em>' attribute.
	 * @see #isHasToggleNature()
	 * @generated
	 */
	void setHasToggleNature(boolean value);

	/**
	 * Returns the value of the '<em><b>Builders</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Builder}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Builder#getNatures <em>Natures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builders</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getNature_Builders()
	 * @see org.obeonetwork.dsl.gen.eclipse.Builder#getNatures
	 * @model opposite="natures" required="true"
	 * @generated
	 */
	EList<Builder> getBuilders();

} // Nature
