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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Attribute#isRequired <em>Required</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Attribute#isTranslatable <em>Translatable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAttribute_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(boolean)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAttribute_Required()
   * @model unique="false"
   * @generated
   */
  boolean isRequired();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Attribute#isRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #isRequired()
   * @generated
   */
  void setRequired(boolean value);

  /**
   * Returns the value of the '<em><b>Translatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Translatable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Translatable</em>' attribute.
   * @see #setTranslatable(boolean)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getAttribute_Translatable()
   * @model unique="false"
   * @generated
   */
  boolean isTranslatable();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Attribute#isTranslatable <em>Translatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Translatable</em>' attribute.
   * @see #isTranslatable()
   * @generated
   */
  void setTranslatable(boolean value);

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
