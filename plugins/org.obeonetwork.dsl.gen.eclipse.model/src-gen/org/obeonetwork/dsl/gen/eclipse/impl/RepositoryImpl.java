/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Repository;
import org.obeonetwork.dsl.gen.eclipse.RepositoryCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl#getRepositoryCategories <em>Repository Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends ProjectImpl implements Repository {
	/**
	 * The cached value of the '{@link #getRepositoryCategories() <em>Repository Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryCategory> repositoryCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryCategory> getRepositoryCategories() {
		if (repositoryCategories == null) {
			repositoryCategories = new EObjectContainmentEList<RepositoryCategory>(
					RepositoryCategory.class, this,
					EclipsePackage.REPOSITORY__REPOSITORY_CATEGORIES);
		}
		return repositoryCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EclipsePackage.REPOSITORY__REPOSITORY_CATEGORIES:
			return ((InternalEList<?>) getRepositoryCategories()).basicRemove(
					otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EclipsePackage.REPOSITORY__NAME:
			return getName();
		case EclipsePackage.REPOSITORY__ID:
			return getID();
		case EclipsePackage.REPOSITORY__REPOSITORY_CATEGORIES:
			return getRepositoryCategories();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EclipsePackage.REPOSITORY__NAME:
			setName((String) newValue);
			return;
		case EclipsePackage.REPOSITORY__ID:
			setID((String) newValue);
			return;
		case EclipsePackage.REPOSITORY__REPOSITORY_CATEGORIES:
			getRepositoryCategories().clear();
			getRepositoryCategories().addAll(
					(Collection<? extends RepositoryCategory>) newValue);
			return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EclipsePackage.REPOSITORY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EclipsePackage.REPOSITORY__ID:
			setID(ID_EDEFAULT);
			return;
		case EclipsePackage.REPOSITORY__REPOSITORY_CATEGORIES:
			getRepositoryCategories().clear();
			return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EclipsePackage.REPOSITORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EclipsePackage.REPOSITORY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EclipsePackage.REPOSITORY__REPOSITORY_CATEGORIES:
			return repositoryCategories != null
					&& !repositoryCategories.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //RepositoryImpl
