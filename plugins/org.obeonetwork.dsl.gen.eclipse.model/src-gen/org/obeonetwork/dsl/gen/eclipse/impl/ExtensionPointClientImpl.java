/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient;
import org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Point Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointClientImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointClientImpl#getSequenceIteration <em>Sequence Iteration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionPointClientImpl extends EObjectImpl implements ExtensionPointClient {
	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected ExtensionPointProvider provider;

	/**
	 * The default value of the '{@link #getSequenceIteration() <em>Sequence Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceIteration()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_ITERATION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getSequenceIteration() <em>Sequence Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceIteration()
	 * @generated
	 * @ordered
	 */
	protected int sequenceIteration = SEQUENCE_ITERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionPointClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.EXTENSION_POINT_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPointProvider getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (ExtensionPointProvider)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.EXTENSION_POINT_CLIENT__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPointProvider basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(ExtensionPointProvider newProvider) {
		ExtensionPointProvider oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.EXTENSION_POINT_CLIENT__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceIteration() {
		return sequenceIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceIteration(int newSequenceIteration) {
		int oldSequenceIteration = sequenceIteration;
		sequenceIteration = newSequenceIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.EXTENSION_POINT_CLIENT__SEQUENCE_ITERATION, oldSequenceIteration, sequenceIteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsePackage.EXTENSION_POINT_CLIENT__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case EclipsePackage.EXTENSION_POINT_CLIENT__SEQUENCE_ITERATION:
				return getSequenceIteration();
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
			case EclipsePackage.EXTENSION_POINT_CLIENT__PROVIDER:
				setProvider((ExtensionPointProvider)newValue);
				return;
			case EclipsePackage.EXTENSION_POINT_CLIENT__SEQUENCE_ITERATION:
				setSequenceIteration((Integer)newValue);
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
			case EclipsePackage.EXTENSION_POINT_CLIENT__PROVIDER:
				setProvider((ExtensionPointProvider)null);
				return;
			case EclipsePackage.EXTENSION_POINT_CLIENT__SEQUENCE_ITERATION:
				setSequenceIteration(SEQUENCE_ITERATION_EDEFAULT);
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
			case EclipsePackage.EXTENSION_POINT_CLIENT__PROVIDER:
				return provider != null;
			case EclipsePackage.EXTENSION_POINT_CLIENT__SEQUENCE_ITERATION:
				return sequenceIteration != SEQUENCE_ITERATION_EDEFAULT;
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
		result.append(" (sequenceIteration: ");
		result.append(sequenceIteration);
		result.append(')');
		return result.toString();
	}

} //ExtensionPointClientImpl
