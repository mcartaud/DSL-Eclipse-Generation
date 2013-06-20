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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.gen.eclipse.Activation;
import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.ContextualHandler;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contextual Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextualHandlerImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextualHandlerImpl#getActivateWith <em>Activate With</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextualHandlerImpl#getAssociatedWith <em>Associated With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextualHandlerImpl extends HandlerImpl implements ContextualHandler {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The default value of the '{@link #getActivateWith() <em>Activate With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivateWith()
	 * @generated
	 * @ordered
	 */
	protected static final Activation ACTIVATE_WITH_EDEFAULT = Activation.NULL;
	/**
	 * The cached value of the '{@link #getActivateWith() <em>Activate With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivateWith()
	 * @generated
	 * @ordered
	 */
	protected Activation activateWith = ACTIVATE_WITH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociatedWith() <em>Associated With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedWith()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> associatedWith;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextualHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.CONTEXTUAL_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectWithInverseResolvingEList.ManyInverse<Command>(Command.class, this, EclipsePackage.CONTEXTUAL_HANDLER__COMMANDS, EclipsePackage.COMMAND__HANDLERS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation getActivateWith() {
		return activateWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivateWith(Activation newActivateWith) {
		Activation oldActivateWith = activateWith;
		activateWith = newActivateWith == null ? ACTIVATE_WITH_EDEFAULT : newActivateWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.CONTEXTUAL_HANDLER__ACTIVATE_WITH, oldActivateWith, activateWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getAssociatedWith() {
		if (associatedWith == null) {
			associatedWith = new EObjectResolvingEList<Part>(Part.class, this, EclipsePackage.CONTEXTUAL_HANDLER__ASSOCIATED_WITH);
		}
		return associatedWith;
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
			case EclipsePackage.CONTEXTUAL_HANDLER__COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommands()).basicAdd(otherEnd, msgs);
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
			case EclipsePackage.CONTEXTUAL_HANDLER__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
			case EclipsePackage.CONTEXTUAL_HANDLER__COMMANDS:
				return getCommands();
			case EclipsePackage.CONTEXTUAL_HANDLER__ACTIVATE_WITH:
				return getActivateWith();
			case EclipsePackage.CONTEXTUAL_HANDLER__ASSOCIATED_WITH:
				return getAssociatedWith();
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
			case EclipsePackage.CONTEXTUAL_HANDLER__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case EclipsePackage.CONTEXTUAL_HANDLER__ACTIVATE_WITH:
				setActivateWith((Activation)newValue);
				return;
			case EclipsePackage.CONTEXTUAL_HANDLER__ASSOCIATED_WITH:
				getAssociatedWith().clear();
				getAssociatedWith().addAll((Collection<? extends Part>)newValue);
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
			case EclipsePackage.CONTEXTUAL_HANDLER__COMMANDS:
				getCommands().clear();
				return;
			case EclipsePackage.CONTEXTUAL_HANDLER__ACTIVATE_WITH:
				setActivateWith(ACTIVATE_WITH_EDEFAULT);
				return;
			case EclipsePackage.CONTEXTUAL_HANDLER__ASSOCIATED_WITH:
				getAssociatedWith().clear();
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
			case EclipsePackage.CONTEXTUAL_HANDLER__COMMANDS:
				return commands != null && !commands.isEmpty();
			case EclipsePackage.CONTEXTUAL_HANDLER__ACTIVATE_WITH:
				return activateWith != ACTIVATE_WITH_EDEFAULT;
			case EclipsePackage.CONTEXTUAL_HANDLER__ASSOCIATED_WITH:
				return associatedWith != null && !associatedWith.isEmpty();
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
		result.append(" (activateWith: ");
		result.append(activateWith);
		result.append(')');
		return result.toString();
	}

} //ContextualHandlerImpl
