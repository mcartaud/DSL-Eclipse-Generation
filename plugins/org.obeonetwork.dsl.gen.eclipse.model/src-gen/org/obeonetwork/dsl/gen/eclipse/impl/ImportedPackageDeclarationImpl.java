/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ImportedPackageDeclarationImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ImportedPackageDeclarationImpl#getPackageVersion <em>Package Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportedPackageDeclarationImpl extends EObjectImpl implements
		ImportedPackageDeclaration {
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageVersion() <em>Package Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageVersion() <em>Package Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVersion()
	 * @generated
	 * @ordered
	 */
	protected String packageVersion = PACKAGE_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportedPackageDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.IMPORTED_PACKAGE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_NAME,
					oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageVersion() {
		return packageVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageVersion(String newPackageVersion) {
		String oldPackageVersion = packageVersion;
		packageVersion = newPackageVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_VERSION,
					oldPackageVersion, packageVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_NAME:
			return getPackageName();
		case EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_VERSION:
			return getPackageVersion();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_NAME:
			setPackageName((String) newValue);
			return;
		case EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_VERSION:
			setPackageVersion((String) newValue);
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
		case EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_NAME:
			setPackageName(PACKAGE_NAME_EDEFAULT);
			return;
		case EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_VERSION:
			setPackageVersion(PACKAGE_VERSION_EDEFAULT);
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
		case EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_NAME:
			return PACKAGE_NAME_EDEFAULT == null ? packageName != null
					: !PACKAGE_NAME_EDEFAULT.equals(packageName);
		case EclipsePackage.IMPORTED_PACKAGE_DECLARATION__PACKAGE_VERSION:
			return PACKAGE_VERSION_EDEFAULT == null ? packageVersion != null
					: !PACKAGE_VERSION_EDEFAULT.equals(packageVersion);
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
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", packageVersion: ");
		result.append(packageVersion);
		result.append(')');
		return result.toString();
	}

} //ImportedPackageDeclarationImpl
