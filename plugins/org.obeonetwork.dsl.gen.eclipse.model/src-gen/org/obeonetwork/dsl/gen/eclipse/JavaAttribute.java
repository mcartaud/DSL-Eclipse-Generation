/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.JavaAttribute#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.JavaAttribute#getNonQualifiedName <em>Non Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getJavaAttribute()
 * @model
 * @generated
 */
public interface JavaAttribute extends EObject {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getJavaAttribute_Name()
	 * @model dataType="org.obeonetwork.dsl.gen.eclipse.Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.JavaAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getJavaAttribute_NonQualifiedName()
	 * @model dataType="org.obeonetwork.dsl.gen.eclipse.JavaName"
	 * @generated
	 */
	String getNonQualifiedName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.JavaAttribute#getNonQualifiedName <em>Non Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Qualified Name</em>' attribute.
	 * @see #getNonQualifiedName()
	 * @generated
	 */
	void setNonQualifiedName(String value);

} // JavaAttribute
