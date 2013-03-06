/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getBind <em>Bind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRequiredService()
 * @model
 * @generated
 */
public interface RequiredService extends EObject {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRequiredService_Name()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Integer)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRequiredService_LowerBound()
	 * @model unique="false"
	 * @generated
	 */
	Integer getLowerBound();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Integer)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRequiredService_UpperBound()
	 * @model unique="false"
	 * @generated
	 */
	Integer getUpperBound();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind</em>' attribute.
	 * @see #setBind(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRequiredService_Bind()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.JavaName"
	 * @generated
	 */
	String getBind();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getBind <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind</em>' attribute.
	 * @see #getBind()
	 * @generated
	 */
	void setBind(String value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(GenClass)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRequiredService_Interface()
	 * @model required="true"
	 * @generated
	 */
	GenClass getInterface();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(GenClass value);

} // RequiredService
