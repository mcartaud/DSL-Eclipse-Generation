/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Decorator#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Decorator#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Decorator#isIsLightweight <em>Is Lightweight</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Decorator#isIsAdaptable <em>Is Adaptable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Decorator#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDecorator()
 * @model
 * @generated
 */
public interface Decorator extends EObject {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDecorator_Name()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Decorator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDecorator_Icon()
	 * @model unique="false"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Decorator#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Is Lightweight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Lightweight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Lightweight</em>' attribute.
	 * @see #setIsLightweight(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDecorator_IsLightweight()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsLightweight();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Decorator#isIsLightweight <em>Is Lightweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Lightweight</em>' attribute.
	 * @see #isIsLightweight()
	 * @generated
	 */
	void setIsLightweight(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Adaptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Adaptable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Adaptable</em>' attribute.
	 * @see #setIsAdaptable(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDecorator_IsAdaptable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsAdaptable();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Decorator#isIsAdaptable <em>Is Adaptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Adaptable</em>' attribute.
	 * @see #isIsAdaptable()
	 * @generated
	 */
	void setIsAdaptable(boolean value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.gen.eclipse.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.Location
	 * @see #setLocation(Location)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getDecorator_Location()
	 * @model unique="false"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Decorator#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.Location
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // Decorator
