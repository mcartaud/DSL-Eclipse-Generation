/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Nature;
import org.obeonetwork.dsl.gen.eclipse.ProjectWizard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Wizard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ProjectWizardImpl#getNatures <em>Natures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectWizardImpl extends WizardImpl implements ProjectWizard {
	/**
	 * The cached value of the '{@link #getNatures() <em>Natures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Nature> natures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectWizardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.PROJECT_WIZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nature> getNatures() {
		if (natures == null) {
			natures = new EObjectResolvingEList<Nature>(Nature.class, this, EclipsePackage.PROJECT_WIZARD__NATURES);
		}
		return natures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsePackage.PROJECT_WIZARD__NATURES:
				return getNatures();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case EclipsePackage.PROJECT_WIZARD__NATURES:
				getNatures().clear();
				getNatures().addAll((Collection<? extends Nature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EclipsePackage.PROJECT_WIZARD__NATURES:
				getNatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EclipsePackage.PROJECT_WIZARD__NATURES:
				return natures != null && !natures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectWizardImpl
