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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.Application;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#getApplicationID <em>Application ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#getBaseNamespace <em>Base Namespace</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#isMavenCompilation <em>Maven Compilation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl#isGenerateTestsBundle <em>Generate Tests Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The default value of the '{@link #getApplicationID() <em>Application ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationID()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationID() <em>Application ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationID()
	 * @generated
	 * @ordered
	 */
	protected String applicationID = APPLICATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

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
	 * The default value of the '{@link #getBaseNamespace() <em>Base Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseNamespace() <em>Base Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseNamespace()
	 * @generated
	 * @ordered
	 */
	protected String baseNamespace = BASE_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMavenCompilation() <em>Maven Compilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMavenCompilation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAVEN_COMPILATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMavenCompilation() <em>Maven Compilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMavenCompilation()
	 * @generated
	 * @ordered
	 */
	protected boolean mavenCompilation = MAVEN_COMPILATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The default value of the '{@link #isGenerateTestsBundle() <em>Generate Tests Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTestsBundle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TESTS_BUNDLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateTestsBundle() <em>Generate Tests Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTestsBundle()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTestsBundle = GENERATE_TESTS_BUNDLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationID() {
		return applicationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationID(String newApplicationID) {
		String oldApplicationID = applicationID;
		applicationID = newApplicationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.APPLICATION__APPLICATION_ID, oldApplicationID, applicationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.APPLICATION__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.APPLICATION__COPYRIGHT, oldCopyright, copyright));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.APPLICATION__LICENSE, oldLicense, license));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.APPLICATION__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.APPLICATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseNamespace() {
		return baseNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseNamespace(String newBaseNamespace) {
		String oldBaseNamespace = baseNamespace;
		baseNamespace = newBaseNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.APPLICATION__BASE_NAMESPACE, oldBaseNamespace, baseNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMavenCompilation() {
		return mavenCompilation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMavenCompilation(boolean newMavenCompilation) {
		boolean oldMavenCompilation = mavenCompilation;
		mavenCompilation = newMavenCompilation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.APPLICATION__MAVEN_COMPILATION, oldMavenCompilation, mavenCompilation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<Project>(Project.class, this, EclipsePackage.APPLICATION__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateTestsBundle() {
		return generateTestsBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateTestsBundle(boolean newGenerateTestsBundle) {
		boolean oldGenerateTestsBundle = generateTestsBundle;
		generateTestsBundle = newGenerateTestsBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.APPLICATION__GENERATE_TESTS_BUNDLE, oldGenerateTestsBundle, generateTestsBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.APPLICATION__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
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
			case EclipsePackage.APPLICATION__APPLICATION_ID:
				return getApplicationID();
			case EclipsePackage.APPLICATION__PROVIDER:
				return getProvider();
			case EclipsePackage.APPLICATION__COPYRIGHT:
				return getCopyright();
			case EclipsePackage.APPLICATION__LICENSE:
				return getLicense();
			case EclipsePackage.APPLICATION__VERSION:
				return getVersion();
			case EclipsePackage.APPLICATION__DESCRIPTION:
				return getDescription();
			case EclipsePackage.APPLICATION__BASE_NAMESPACE:
				return getBaseNamespace();
			case EclipsePackage.APPLICATION__MAVEN_COMPILATION:
				return isMavenCompilation();
			case EclipsePackage.APPLICATION__PROJECTS:
				return getProjects();
			case EclipsePackage.APPLICATION__GENERATE_TESTS_BUNDLE:
				return isGenerateTestsBundle();
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
			case EclipsePackage.APPLICATION__APPLICATION_ID:
				setApplicationID((String)newValue);
				return;
			case EclipsePackage.APPLICATION__PROVIDER:
				setProvider((String)newValue);
				return;
			case EclipsePackage.APPLICATION__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case EclipsePackage.APPLICATION__LICENSE:
				setLicense((String)newValue);
				return;
			case EclipsePackage.APPLICATION__VERSION:
				setVersion((String)newValue);
				return;
			case EclipsePackage.APPLICATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EclipsePackage.APPLICATION__BASE_NAMESPACE:
				setBaseNamespace((String)newValue);
				return;
			case EclipsePackage.APPLICATION__MAVEN_COMPILATION:
				setMavenCompilation((Boolean)newValue);
				return;
			case EclipsePackage.APPLICATION__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case EclipsePackage.APPLICATION__GENERATE_TESTS_BUNDLE:
				setGenerateTestsBundle((Boolean)newValue);
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
			case EclipsePackage.APPLICATION__APPLICATION_ID:
				setApplicationID(APPLICATION_ID_EDEFAULT);
				return;
			case EclipsePackage.APPLICATION__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case EclipsePackage.APPLICATION__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case EclipsePackage.APPLICATION__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case EclipsePackage.APPLICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EclipsePackage.APPLICATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EclipsePackage.APPLICATION__BASE_NAMESPACE:
				setBaseNamespace(BASE_NAMESPACE_EDEFAULT);
				return;
			case EclipsePackage.APPLICATION__MAVEN_COMPILATION:
				setMavenCompilation(MAVEN_COMPILATION_EDEFAULT);
				return;
			case EclipsePackage.APPLICATION__PROJECTS:
				getProjects().clear();
				return;
			case EclipsePackage.APPLICATION__GENERATE_TESTS_BUNDLE:
				setGenerateTestsBundle(GENERATE_TESTS_BUNDLE_EDEFAULT);
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
			case EclipsePackage.APPLICATION__APPLICATION_ID:
				return APPLICATION_ID_EDEFAULT == null ? applicationID != null : !APPLICATION_ID_EDEFAULT.equals(applicationID);
			case EclipsePackage.APPLICATION__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case EclipsePackage.APPLICATION__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case EclipsePackage.APPLICATION__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case EclipsePackage.APPLICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EclipsePackage.APPLICATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EclipsePackage.APPLICATION__BASE_NAMESPACE:
				return BASE_NAMESPACE_EDEFAULT == null ? baseNamespace != null : !BASE_NAMESPACE_EDEFAULT.equals(baseNamespace);
			case EclipsePackage.APPLICATION__MAVEN_COMPILATION:
				return mavenCompilation != MAVEN_COMPILATION_EDEFAULT;
			case EclipsePackage.APPLICATION__PROJECTS:
				return projects != null && !projects.isEmpty();
			case EclipsePackage.APPLICATION__GENERATE_TESTS_BUNDLE:
				return generateTestsBundle != GENERATE_TESTS_BUNDLE_EDEFAULT;
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
		result.append(" (applicationID: ");
		result.append(applicationID);
		result.append(", provider: ");
		result.append(provider);
		result.append(", copyright: ");
		result.append(copyright);
		result.append(", license: ");
		result.append(license);
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(", baseNamespace: ");
		result.append(baseNamespace);
		result.append(", mavenCompilation: ");
		result.append(mavenCompilation);
		result.append(", generateTestsBundle: ");
		result.append(generateTestsBundle);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
