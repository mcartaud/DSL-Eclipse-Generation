/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.gen.eclipse.Binding;
import org.obeonetwork.dsl.gen.eclipse.Category;
import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.ContextualHandler;
import org.obeonetwork.dsl.gen.eclipse.DefaultHandler;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getDefaultHandler <em>Default Handler</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getMnemonic <em>Mnemonic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends EObjectImpl implements Command {
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
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected String tooltip = TOOLTIP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextualHandler> handlers;

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
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected Binding binding;

	/**
	 * The cached value of the '{@link #getDefaultHandler() <em>Default Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHandler()
	 * @generated
	 * @ordered
	 */
	protected DefaultHandler defaultHandler;

	/**
	 * The default value of the '{@link #getMnemonic() <em>Mnemonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonic()
	 * @generated
	 * @ordered
	 */
	protected static final char MNEMONIC_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getMnemonic() <em>Mnemonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonic()
	 * @generated
	 * @ordered
	 */
	protected char mnemonic = MNEMONIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		String oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextualHandler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectWithInverseResolvingEList.ManyInverse<ContextualHandler>(ContextualHandler.class, this, EclipsePackage.COMMAND__HANDLERS, EclipsePackage.CONTEXTUAL_HANDLER__COMMANDS);
		}
		return handlers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.COMMAND__CATEGORY, oldCategory, category));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EclipsePackage.CATEGORY__COMMANDS, Category.class, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EclipsePackage.CATEGORY__COMMANDS, Category.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject)binding;
			binding = (Binding)eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.COMMAND__BINDING, oldBinding, binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(Binding newBinding, NotificationChain msgs) {
		Binding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__BINDING, oldBinding, newBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(Binding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, EclipsePackage.BINDING__COMMAND, Binding.class, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, EclipsePackage.BINDING__COMMAND, Binding.class, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultHandler getDefaultHandler() {
		return defaultHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultHandler(DefaultHandler newDefaultHandler, NotificationChain msgs) {
		DefaultHandler oldDefaultHandler = defaultHandler;
		defaultHandler = newDefaultHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__DEFAULT_HANDLER, oldDefaultHandler, newDefaultHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultHandler(DefaultHandler newDefaultHandler) {
		if (newDefaultHandler != defaultHandler) {
			NotificationChain msgs = null;
			if (defaultHandler != null)
				msgs = ((InternalEObject)defaultHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclipsePackage.COMMAND__DEFAULT_HANDLER, null, msgs);
			if (newDefaultHandler != null)
				msgs = ((InternalEObject)newDefaultHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclipsePackage.COMMAND__DEFAULT_HANDLER, null, msgs);
			msgs = basicSetDefaultHandler(newDefaultHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__DEFAULT_HANDLER, newDefaultHandler, newDefaultHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getMnemonic() {
		return mnemonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMnemonic(char newMnemonic) {
		char oldMnemonic = mnemonic;
		mnemonic = newMnemonic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__MNEMONIC, oldMnemonic, mnemonic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.COMMAND__HANDLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHandlers()).basicAdd(otherEnd, msgs);
			case EclipsePackage.COMMAND__CATEGORY:
				if (category != null)
					msgs = ((InternalEObject)category).eInverseRemove(this, EclipsePackage.CATEGORY__COMMANDS, Category.class, msgs);
				return basicSetCategory((Category)otherEnd, msgs);
			case EclipsePackage.COMMAND__BINDING:
				if (binding != null)
					msgs = ((InternalEObject)binding).eInverseRemove(this, EclipsePackage.BINDING__COMMAND, Binding.class, msgs);
				return basicSetBinding((Binding)otherEnd, msgs);
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
			case EclipsePackage.COMMAND__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case EclipsePackage.COMMAND__CATEGORY:
				return basicSetCategory(null, msgs);
			case EclipsePackage.COMMAND__BINDING:
				return basicSetBinding(null, msgs);
			case EclipsePackage.COMMAND__DEFAULT_HANDLER:
				return basicSetDefaultHandler(null, msgs);
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
			case EclipsePackage.COMMAND__NAME:
				return getName();
			case EclipsePackage.COMMAND__TOOLTIP:
				return getTooltip();
			case EclipsePackage.COMMAND__HANDLERS:
				return getHandlers();
			case EclipsePackage.COMMAND__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case EclipsePackage.COMMAND__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
			case EclipsePackage.COMMAND__DEFAULT_HANDLER:
				return getDefaultHandler();
			case EclipsePackage.COMMAND__MNEMONIC:
				return getMnemonic();
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
			case EclipsePackage.COMMAND__NAME:
				setName((String)newValue);
				return;
			case EclipsePackage.COMMAND__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case EclipsePackage.COMMAND__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends ContextualHandler>)newValue);
				return;
			case EclipsePackage.COMMAND__CATEGORY:
				setCategory((Category)newValue);
				return;
			case EclipsePackage.COMMAND__BINDING:
				setBinding((Binding)newValue);
				return;
			case EclipsePackage.COMMAND__DEFAULT_HANDLER:
				setDefaultHandler((DefaultHandler)newValue);
				return;
			case EclipsePackage.COMMAND__MNEMONIC:
				setMnemonic((Character)newValue);
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
			case EclipsePackage.COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsePackage.COMMAND__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case EclipsePackage.COMMAND__HANDLERS:
				getHandlers().clear();
				return;
			case EclipsePackage.COMMAND__CATEGORY:
				setCategory((Category)null);
				return;
			case EclipsePackage.COMMAND__BINDING:
				setBinding((Binding)null);
				return;
			case EclipsePackage.COMMAND__DEFAULT_HANDLER:
				setDefaultHandler((DefaultHandler)null);
				return;
			case EclipsePackage.COMMAND__MNEMONIC:
				setMnemonic(MNEMONIC_EDEFAULT);
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
			case EclipsePackage.COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsePackage.COMMAND__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case EclipsePackage.COMMAND__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case EclipsePackage.COMMAND__CATEGORY:
				return category != null;
			case EclipsePackage.COMMAND__BINDING:
				return binding != null;
			case EclipsePackage.COMMAND__DEFAULT_HANDLER:
				return defaultHandler != null;
			case EclipsePackage.COMMAND__MNEMONIC:
				return mnemonic != MNEMONIC_EDEFAULT;
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
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(", mnemonic: ");
		result.append(mnemonic);
		result.append(')');
		return result.toString();
	}

} //CommandImpl
