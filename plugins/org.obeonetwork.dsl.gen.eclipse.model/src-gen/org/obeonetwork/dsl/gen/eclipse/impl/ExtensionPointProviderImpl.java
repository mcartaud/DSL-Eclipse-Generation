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
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider;
import org.obeonetwork.dsl.gen.eclipse.JavaAttribute;
import org.obeonetwork.dsl.gen.eclipse.StringAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Point Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointProviderImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointProviderImpl#getStringAttributes <em>String Attributes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointProviderImpl#getJavaAttributes <em>Java Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionPointProviderImpl extends EObjectImpl implements ExtensionPointProvider {
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
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStringAttributes() <em>String Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<StringAttribute> stringAttributes;

	/**
	 * The cached value of the '{@link #getJavaAttributes() <em>Java Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaAttribute> javaAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionPointProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.EXTENSION_POINT_PROVIDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.EXTENSION_POINT_PROVIDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.EXTENSION_POINT_PROVIDER__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringAttribute> getStringAttributes() {
		if (stringAttributes == null) {
			stringAttributes = new EObjectContainmentEList<StringAttribute>(StringAttribute.class, this, EclipsePackage.EXTENSION_POINT_PROVIDER__STRING_ATTRIBUTES);
		}
		return stringAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaAttribute> getJavaAttributes() {
		if (javaAttributes == null) {
			javaAttributes = new EObjectContainmentEList<JavaAttribute>(JavaAttribute.class, this, EclipsePackage.EXTENSION_POINT_PROVIDER__JAVA_ATTRIBUTES);
		}
		return javaAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.EXTENSION_POINT_PROVIDER__STRING_ATTRIBUTES:
				return ((InternalEList<?>)getStringAttributes()).basicRemove(otherEnd, msgs);
			case EclipsePackage.EXTENSION_POINT_PROVIDER__JAVA_ATTRIBUTES:
				return ((InternalEList<?>)getJavaAttributes()).basicRemove(otherEnd, msgs);
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
			case EclipsePackage.EXTENSION_POINT_PROVIDER__NAME:
				return getName();
			case EclipsePackage.EXTENSION_POINT_PROVIDER__CLASS_NAME:
				return getClassName();
			case EclipsePackage.EXTENSION_POINT_PROVIDER__STRING_ATTRIBUTES:
				return getStringAttributes();
			case EclipsePackage.EXTENSION_POINT_PROVIDER__JAVA_ATTRIBUTES:
				return getJavaAttributes();
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
			case EclipsePackage.EXTENSION_POINT_PROVIDER__NAME:
				setName((String)newValue);
				return;
			case EclipsePackage.EXTENSION_POINT_PROVIDER__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case EclipsePackage.EXTENSION_POINT_PROVIDER__STRING_ATTRIBUTES:
				getStringAttributes().clear();
				getStringAttributes().addAll((Collection<? extends StringAttribute>)newValue);
				return;
			case EclipsePackage.EXTENSION_POINT_PROVIDER__JAVA_ATTRIBUTES:
				getJavaAttributes().clear();
				getJavaAttributes().addAll((Collection<? extends JavaAttribute>)newValue);
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
			case EclipsePackage.EXTENSION_POINT_PROVIDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsePackage.EXTENSION_POINT_PROVIDER__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case EclipsePackage.EXTENSION_POINT_PROVIDER__STRING_ATTRIBUTES:
				getStringAttributes().clear();
				return;
			case EclipsePackage.EXTENSION_POINT_PROVIDER__JAVA_ATTRIBUTES:
				getJavaAttributes().clear();
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
			case EclipsePackage.EXTENSION_POINT_PROVIDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsePackage.EXTENSION_POINT_PROVIDER__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case EclipsePackage.EXTENSION_POINT_PROVIDER__STRING_ATTRIBUTES:
				return stringAttributes != null && !stringAttributes.isEmpty();
			case EclipsePackage.EXTENSION_POINT_PROVIDER__JAVA_ATTRIBUTES:
				return javaAttributes != null && !javaAttributes.isEmpty();
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
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //ExtensionPointProviderImpl
