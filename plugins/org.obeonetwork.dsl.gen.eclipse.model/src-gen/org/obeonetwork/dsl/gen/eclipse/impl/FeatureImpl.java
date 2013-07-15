/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.obeonetwork.dsl.gen.eclipse.Bundle;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Feature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getBundles <em>Bundles</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#isGenerateSdkFeature <em>Generate Sdk Feature</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getExcludeBundleForSdk <em>Exclude Bundle For Sdk</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getIncludedFeatures <em>Included Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends ProjectImpl implements Feature {
	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBundles() <em>Bundles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> bundles;

	/**
	 * The default value of the '{@link #isGenerateSdkFeature() <em>Generate Sdk Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateSdkFeature()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_SDK_FEATURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateSdkFeature() <em>Generate Sdk Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateSdkFeature()
	 * @generated
	 * @ordered
	 */
	protected boolean generateSdkFeature = GENERATE_SDK_FEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExcludeBundleForSdk() <em>Exclude Bundle For Sdk</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeBundleForSdk()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> excludeBundleForSdk;

	/**
	 * The cached value of the '{@link #getIncludedFeatures() <em>Included Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> includedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__COPYRIGHT, oldCopyright, copyright));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getBundles() {
		if (bundles == null) {
			bundles = new EObjectResolvingEList<Bundle>(Bundle.class, this, EclipsePackage.FEATURE__BUNDLES);
		}
		return bundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateSdkFeature() {
		return generateSdkFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateSdkFeature(boolean newGenerateSdkFeature) {
		boolean oldGenerateSdkFeature = generateSdkFeature;
		generateSdkFeature = newGenerateSdkFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__GENERATE_SDK_FEATURE, oldGenerateSdkFeature, generateSdkFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getExcludeBundleForSdk() {
		if (excludeBundleForSdk == null) {
			excludeBundleForSdk = new EObjectResolvingEList<Bundle>(Bundle.class, this, EclipsePackage.FEATURE__EXCLUDE_BUNDLE_FOR_SDK);
		}
		return excludeBundleForSdk;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getIncludedFeatures() {
		if (includedFeatures == null) {
			includedFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, EclipsePackage.FEATURE__INCLUDED_FEATURES);
		}
		return includedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsePackage.FEATURE__COPYRIGHT:
				return getCopyright();
			case EclipsePackage.FEATURE__DESCRIPTION:
				return getDescription();
			case EclipsePackage.FEATURE__VERSION:
				return getVersion();
			case EclipsePackage.FEATURE__LICENSE:
				return getLicense();
			case EclipsePackage.FEATURE__AUTHOR:
				return getAuthor();
			case EclipsePackage.FEATURE__BUNDLES:
				return getBundles();
			case EclipsePackage.FEATURE__GENERATE_SDK_FEATURE:
				return isGenerateSdkFeature();
			case EclipsePackage.FEATURE__EXCLUDE_BUNDLE_FOR_SDK:
				return getExcludeBundleForSdk();
			case EclipsePackage.FEATURE__INCLUDED_FEATURES:
				return getIncludedFeatures();
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
			case EclipsePackage.FEATURE__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case EclipsePackage.FEATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EclipsePackage.FEATURE__VERSION:
				setVersion((String)newValue);
				return;
			case EclipsePackage.FEATURE__LICENSE:
				setLicense((String)newValue);
				return;
			case EclipsePackage.FEATURE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case EclipsePackage.FEATURE__BUNDLES:
				getBundles().clear();
				getBundles().addAll((Collection<? extends Bundle>)newValue);
				return;
			case EclipsePackage.FEATURE__GENERATE_SDK_FEATURE:
				setGenerateSdkFeature((Boolean)newValue);
				return;
			case EclipsePackage.FEATURE__EXCLUDE_BUNDLE_FOR_SDK:
				getExcludeBundleForSdk().clear();
				getExcludeBundleForSdk().addAll((Collection<? extends Bundle>)newValue);
				return;
			case EclipsePackage.FEATURE__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
				getIncludedFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case EclipsePackage.FEATURE__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case EclipsePackage.FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EclipsePackage.FEATURE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EclipsePackage.FEATURE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case EclipsePackage.FEATURE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case EclipsePackage.FEATURE__BUNDLES:
				getBundles().clear();
				return;
			case EclipsePackage.FEATURE__GENERATE_SDK_FEATURE:
				setGenerateSdkFeature(GENERATE_SDK_FEATURE_EDEFAULT);
				return;
			case EclipsePackage.FEATURE__EXCLUDE_BUNDLE_FOR_SDK:
				getExcludeBundleForSdk().clear();
				return;
			case EclipsePackage.FEATURE__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
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
			case EclipsePackage.FEATURE__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case EclipsePackage.FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EclipsePackage.FEATURE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EclipsePackage.FEATURE__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case EclipsePackage.FEATURE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case EclipsePackage.FEATURE__BUNDLES:
				return bundles != null && !bundles.isEmpty();
			case EclipsePackage.FEATURE__GENERATE_SDK_FEATURE:
				return generateSdkFeature != GENERATE_SDK_FEATURE_EDEFAULT;
			case EclipsePackage.FEATURE__EXCLUDE_BUNDLE_FOR_SDK:
				return excludeBundleForSdk != null && !excludeBundleForSdk.isEmpty();
			case EclipsePackage.FEATURE__INCLUDED_FEATURES:
				return includedFeatures != null && !includedFeatures.isEmpty();
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
		result.append(" (copyright: ");
		result.append(copyright);
		result.append(", description: ");
		result.append(description);
		result.append(", version: ");
		result.append(version);
		result.append(", license: ");
		result.append(license);
		result.append(", author: ");
		result.append(author);
		result.append(", generateSdkFeature: ");
		result.append(generateSdkFeature);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
