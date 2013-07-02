/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Attribute#getNonQualifiedName <em>Non Qualified Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Non Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Qualified Name</em>' attribute.
	 * @see #setNonQualifiedName(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAttribute_NonQualifiedName()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Name" required="true"
	 * @generated
	 */
	String getNonQualifiedName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Attribute#getNonQualifiedName <em>Non Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Qualified Name</em>' attribute.
	 * @see #getNonQualifiedName()
	 * @generated
	 */
	void setNonQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.gen.eclipse.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.Type
	 * @see #setType(Type)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAttribute_Type()
	 * @model unique="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Attribute
