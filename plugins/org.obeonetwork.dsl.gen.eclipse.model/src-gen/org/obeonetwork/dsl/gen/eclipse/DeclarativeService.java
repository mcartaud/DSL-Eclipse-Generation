/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarative Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getServiceClassName <em>Service Class Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getDelegatorClass <em>Delegator Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getProvidedServices <em>Provided Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getServiceClassPackage <em>Service Class Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDeclarativeService()
 * @model
 * @generated
 */
public interface DeclarativeService extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class Name</em>' attribute.
	 * @see #setServiceClassName(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDeclarativeService_ServiceClassName()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.JavaName" required="true"
	 * @generated
	 */
	String getServiceClassName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getServiceClassName <em>Service Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class Name</em>' attribute.
	 * @see #getServiceClassName()
	 * @generated
	 */
	void setServiceClassName(String value);

	/**
	 * Returns the value of the '<em><b>Delegator Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegator Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegator Class</em>' reference.
	 * @see #setDelegatorClass(GenClass)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDeclarativeService_DelegatorClass()
	 * @model required="true"
	 * @generated
	 */
	GenClass getDelegatorClass();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getDelegatorClass <em>Delegator Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegator Class</em>' reference.
	 * @see #getDelegatorClass()
	 * @generated
	 */
	void setDelegatorClass(GenClass value);

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

	/**
	 * Returns the value of the '<em><b>Service Class Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Class Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class Package</em>' reference.
	 * @see #setServiceClassPackage(GenPackage)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDeclarativeService_ServiceClassPackage()
	 * @model required="true"
	 * @generated
	 */
	GenPackage getServiceClassPackage();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getServiceClassPackage <em>Service Class Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class Package</em>' reference.
	 * @see #getServiceClassPackage()
	 * @generated
	 */
	void setServiceClassPackage(GenPackage value);

} // DeclarativeService
