/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Editor;
import org.obeonetwork.dsl.gen.eclipse.Perspective;
import org.obeonetwork.dsl.gen.eclipse.ToolbarContribution;
import org.obeonetwork.dsl.gen.eclipse.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toolbar Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ToolbarContributionImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ToolbarContributionImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ToolbarContributionImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ToolbarContributionImpl#getEditors <em>Editors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolbarContributionImpl extends EObjectImpl implements ToolbarContribution {
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
	 * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Perspective> perspectives;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<Editor> editors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolbarContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.TOOLBAR_CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectResolvingEList<Command>(Command.class, this, EclipsePackage.TOOLBAR_CONTRIBUTION__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Perspective> getPerspectives() {
		if (perspectives == null) {
			perspectives = new EObjectResolvingEList<Perspective>(Perspective.class, this, EclipsePackage.TOOLBAR_CONTRIBUTION__PERSPECTIVES);
		}
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectResolvingEList<View>(View.class, this, EclipsePackage.TOOLBAR_CONTRIBUTION__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Editor> getEditors() {
		if (editors == null) {
			editors = new EObjectResolvingEList<Editor>(Editor.class, this, EclipsePackage.TOOLBAR_CONTRIBUTION__EDITORS);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsePackage.TOOLBAR_CONTRIBUTION__COMMANDS:
				return getCommands();
			case EclipsePackage.TOOLBAR_CONTRIBUTION__PERSPECTIVES:
				return getPerspectives();
			case EclipsePackage.TOOLBAR_CONTRIBUTION__VIEWS:
				return getViews();
			case EclipsePackage.TOOLBAR_CONTRIBUTION__EDITORS:
				return getEditors();
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
			case EclipsePackage.TOOLBAR_CONTRIBUTION__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case EclipsePackage.TOOLBAR_CONTRIBUTION__PERSPECTIVES:
				getPerspectives().clear();
				getPerspectives().addAll((Collection<? extends Perspective>)newValue);
				return;
			case EclipsePackage.TOOLBAR_CONTRIBUTION__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case EclipsePackage.TOOLBAR_CONTRIBUTION__EDITORS:
				getEditors().clear();
				getEditors().addAll((Collection<? extends Editor>)newValue);
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
			case EclipsePackage.TOOLBAR_CONTRIBUTION__COMMANDS:
				getCommands().clear();
				return;
			case EclipsePackage.TOOLBAR_CONTRIBUTION__PERSPECTIVES:
				getPerspectives().clear();
				return;
			case EclipsePackage.TOOLBAR_CONTRIBUTION__VIEWS:
				getViews().clear();
				return;
			case EclipsePackage.TOOLBAR_CONTRIBUTION__EDITORS:
				getEditors().clear();
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
			case EclipsePackage.TOOLBAR_CONTRIBUTION__COMMANDS:
				return commands != null && !commands.isEmpty();
			case EclipsePackage.TOOLBAR_CONTRIBUTION__PERSPECTIVES:
				return perspectives != null && !perspectives.isEmpty();
			case EclipsePackage.TOOLBAR_CONTRIBUTION__VIEWS:
				return views != null && !views.isEmpty();
			case EclipsePackage.TOOLBAR_CONTRIBUTION__EDITORS:
				return editors != null && !editors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToolbarContributionImpl
