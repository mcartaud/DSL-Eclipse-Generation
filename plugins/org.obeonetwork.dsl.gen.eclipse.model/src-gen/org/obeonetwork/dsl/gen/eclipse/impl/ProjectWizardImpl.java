/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.gen.eclipse.Category;
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
			natures = new EObjectResolvingEList<Nature>(Nature.class, this,
					EclipsePackage.PROJECT_WIZARD__NATURES);
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
		case EclipsePackage.PROJECT_WIZARD__NAME:
			return getName();
		case EclipsePackage.PROJECT_WIZARD__TITLE:
			return getTitle();
		case EclipsePackage.PROJECT_WIZARD__DESCRIPTION:
			return getDescription();
		case EclipsePackage.PROJECT_WIZARD__ICON:
			return getIcon();
		case EclipsePackage.PROJECT_WIZARD__IS_PROJECT:
			return isIsProject();
		case EclipsePackage.PROJECT_WIZARD__CATEGORY:
			if (resolve)
				return getCategory();
			return basicGetCategory();
		case EclipsePackage.PROJECT_WIZARD__NATURES:
			return getNatures();
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
		case EclipsePackage.PROJECT_WIZARD__NAME:
			setName((String) newValue);
			return;
		case EclipsePackage.PROJECT_WIZARD__TITLE:
			setTitle((String) newValue);
			return;
		case EclipsePackage.PROJECT_WIZARD__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EclipsePackage.PROJECT_WIZARD__ICON:
			setIcon((String) newValue);
			return;
		case EclipsePackage.PROJECT_WIZARD__IS_PROJECT:
			setIsProject((Boolean) newValue);
			return;
		case EclipsePackage.PROJECT_WIZARD__CATEGORY:
			setCategory((Category) newValue);
			return;
		case EclipsePackage.PROJECT_WIZARD__NATURES:
			getNatures().clear();
			getNatures().addAll((Collection<? extends Nature>) newValue);
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
		case EclipsePackage.PROJECT_WIZARD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EclipsePackage.PROJECT_WIZARD__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case EclipsePackage.PROJECT_WIZARD__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EclipsePackage.PROJECT_WIZARD__ICON:
			setIcon(ICON_EDEFAULT);
			return;
		case EclipsePackage.PROJECT_WIZARD__IS_PROJECT:
			setIsProject(IS_PROJECT_EDEFAULT);
			return;
		case EclipsePackage.PROJECT_WIZARD__CATEGORY:
			setCategory((Category) null);
			return;
		case EclipsePackage.PROJECT_WIZARD__NATURES:
			getNatures().clear();
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
		case EclipsePackage.PROJECT_WIZARD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EclipsePackage.PROJECT_WIZARD__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT
					.equals(title);
		case EclipsePackage.PROJECT_WIZARD__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
		case EclipsePackage.PROJECT_WIZARD__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT
					.equals(icon);
		case EclipsePackage.PROJECT_WIZARD__IS_PROJECT:
			return ((eFlags & IS_PROJECT_EFLAG) != 0) != IS_PROJECT_EDEFAULT;
		case EclipsePackage.PROJECT_WIZARD__CATEGORY:
			return category != null;
		case EclipsePackage.PROJECT_WIZARD__NATURES:
			return natures != null && !natures.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //ProjectWizardImpl
