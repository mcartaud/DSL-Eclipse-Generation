/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.gen.eclipse.DynamicHelp;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.HelpPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Help</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DynamicHelpImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DynamicHelpImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DynamicHelpImpl#getHelpPages <em>Help Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicHelpImpl extends EObjectImpl implements DynamicHelp {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHelpPages() <em>Help Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpPages()
	 * @generated
	 * @ordered
	 */
	protected EList<HelpPage> helpPages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicHelpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.DYNAMIC_HELP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.DYNAMIC_HELP__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.DYNAMIC_HELP__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HelpPage> getHelpPages() {
		if (helpPages == null) {
			helpPages = new EObjectResolvingEList<HelpPage>(HelpPage.class,
					this, EclipsePackage.DYNAMIC_HELP__HELP_PAGES);
		}
		return helpPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EclipsePackage.DYNAMIC_HELP__LABEL:
			return getLabel();
		case EclipsePackage.DYNAMIC_HELP__DESCRIPTION:
			return getDescription();
		case EclipsePackage.DYNAMIC_HELP__HELP_PAGES:
			return getHelpPages();
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
		case EclipsePackage.DYNAMIC_HELP__LABEL:
			setLabel((String) newValue);
			return;
		case EclipsePackage.DYNAMIC_HELP__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EclipsePackage.DYNAMIC_HELP__HELP_PAGES:
			getHelpPages().clear();
			getHelpPages().addAll((Collection<? extends HelpPage>) newValue);
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
		case EclipsePackage.DYNAMIC_HELP__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case EclipsePackage.DYNAMIC_HELP__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EclipsePackage.DYNAMIC_HELP__HELP_PAGES:
			getHelpPages().clear();
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
		case EclipsePackage.DYNAMIC_HELP__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT
					.equals(label);
		case EclipsePackage.DYNAMIC_HELP__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
		case EclipsePackage.DYNAMIC_HELP__HELP_PAGES:
			return helpPages != null && !helpPages.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DynamicHelpImpl
