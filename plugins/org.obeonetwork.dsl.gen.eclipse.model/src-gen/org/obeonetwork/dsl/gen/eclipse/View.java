/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.View#isIsVisible <em>Is Visible</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.View#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.View#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView()
 * @model
 * @generated
 */
public interface View extends Part {
	/**
	 * Returns the value of the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Visible</em>' attribute.
	 * @see #setIsVisible(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView_IsVisible()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsVisible();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.View#isIsVisible <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Visible</em>' attribute.
	 * @see #isIsVisible()
	 * @generated
	 */
	void setIsVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Perspectives</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Perspective}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspectives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspectives</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView_Perspectives()
	 * @see org.obeonetwork.dsl.gen.eclipse.Perspective#getViews
	 * @model opposite="views"
	 * @generated
	 */
	EList<Perspective> getPerspectives();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Category#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getView_Category()
	 * @see org.obeonetwork.dsl.gen.eclipse.Category#getViews
	 * @model opposite="views"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.View#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

} // View
