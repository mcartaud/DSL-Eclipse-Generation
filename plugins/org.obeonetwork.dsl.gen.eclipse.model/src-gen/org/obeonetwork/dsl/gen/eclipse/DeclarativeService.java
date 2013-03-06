/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarative Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getImplentationClass <em>Implentation Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getProvidedServices <em>Provided Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getRequiredServices <em>Required Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDeclarativeService()
 * @model
 * @generated
 */
public interface DeclarativeService extends EObject {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDeclarativeService_Name()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Implentation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implentation Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implentation Class</em>' reference.
	 * @see #setImplentationClass(GenClass)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDeclarativeService_ImplentationClass()
	 * @model required="true"
	 * @generated
	 */
	GenClass getImplentationClass();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getImplentationClass <em>Implentation Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implentation Class</em>' reference.
	 * @see #getImplentationClass()
	 * @generated
	 */
	void setImplentationClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Provided Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ProvidedService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Services</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDeclarativeService_ProvidedServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedService> getProvidedServices();

	/**
	 * Returns the value of the '<em><b>Required Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.RequiredService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Services</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDeclarativeService_RequiredServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredService> getRequiredServices();

} // DeclarativeService
