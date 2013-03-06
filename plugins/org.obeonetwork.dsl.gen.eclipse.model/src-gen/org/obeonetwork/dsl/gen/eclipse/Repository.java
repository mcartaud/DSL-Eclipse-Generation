/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Repository#getRepositoryCategories <em>Repository Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends Project {
	/**
	 * Returns the value of the '<em><b>Repository Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Categories</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepository_RepositoryCategories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RepositoryCategory> getRepositoryCategories();

} // Repository
