/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Point Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient#getSequenceIteration <em>Sequence Iteration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getExtensionPointClient()
 * @model
 * @generated
 */
public interface ExtensionPointClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(ExtensionPointProvider)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getExtensionPointClient_Provider()
	 * @model required="true"
	 * @generated
	 */
	ExtensionPointProvider getProvider();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(ExtensionPointProvider value);

	/**
	 * Returns the value of the '<em><b>Sequence Iteration</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Iteration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Iteration</em>' attribute.
	 * @see #setSequenceIteration(int)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getExtensionPointClient_SequenceIteration()
	 * @model default="1"
	 * @generated
	 */
	int getSequenceIteration();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient#getSequenceIteration <em>Sequence Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Iteration</em>' attribute.
	 * @see #getSequenceIteration()
	 * @generated
	 */
	void setSequenceIteration(int value);

} // ExtensionPointClient
