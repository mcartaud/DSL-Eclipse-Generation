/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.Category;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Wizard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.WizardImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.WizardImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.WizardImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.WizardImpl#isIsProject <em>Is Project</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.WizardImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WizardImpl extends EObjectImpl implements Wizard {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	 * The default value of the '{@link #isIsProject() <em>Is Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProject() <em>Is Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProject()
	 * @generated
	 * @ordered
	 */
	protected boolean isProject = IS_PROJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WizardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.WIZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.WIZARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.WIZARD__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.WIZARD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProject() {
		return isProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProject(boolean newIsProject) {
		boolean oldIsProject = isProject;
		isProject = newIsProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.WIZARD__IS_PROJECT, oldIsProject, isProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Category)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.WIZARD__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Category newCategory, NotificationChain msgs) {
		Category oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.WIZARD__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EclipsePackage.CATEGORY__WIZARDS, Category.class, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EclipsePackage.CATEGORY__WIZARDS, Category.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.WIZARD__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.WIZARD__CATEGORY:
				if (category != null)
					msgs = ((InternalEObject)category).eInverseRemove(this, EclipsePackage.CATEGORY__WIZARDS, Category.class, msgs);
				return basicSetCategory((Category)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.WIZARD__CATEGORY:
				return basicSetCategory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsePackage.WIZARD__NAME:
				return getName();
			case EclipsePackage.WIZARD__TITLE:
				return getTitle();
			case EclipsePackage.WIZARD__DESCRIPTION:
				return getDescription();
			case EclipsePackage.WIZARD__IS_PROJECT:
				return isIsProject();
			case EclipsePackage.WIZARD__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EclipsePackage.WIZARD__NAME:
				setName((String)newValue);
				return;
			case EclipsePackage.WIZARD__TITLE:
				setTitle((String)newValue);
				return;
			case EclipsePackage.WIZARD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EclipsePackage.WIZARD__IS_PROJECT:
				setIsProject((Boolean)newValue);
				return;
			case EclipsePackage.WIZARD__CATEGORY:
				setCategory((Category)newValue);
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
			case EclipsePackage.WIZARD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsePackage.WIZARD__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case EclipsePackage.WIZARD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EclipsePackage.WIZARD__IS_PROJECT:
				setIsProject(IS_PROJECT_EDEFAULT);
				return;
			case EclipsePackage.WIZARD__CATEGORY:
				setCategory((Category)null);
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
			case EclipsePackage.WIZARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsePackage.WIZARD__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case EclipsePackage.WIZARD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EclipsePackage.WIZARD__IS_PROJECT:
				return isProject != IS_PROJECT_EDEFAULT;
			case EclipsePackage.WIZARD__CATEGORY:
				return category != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", isProject: ");
		result.append(isProject);
		result.append(')');
		return result.toString();
	}

} //WizardImpl
