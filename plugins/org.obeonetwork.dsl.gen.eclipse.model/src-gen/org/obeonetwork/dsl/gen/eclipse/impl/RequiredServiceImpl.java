/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.RequiredService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredServiceImpl extends EObjectImpl implements RequiredService {
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
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Integer lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Integer upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected static final String BIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected String bind = BIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected GenClass interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.REQUIRED_SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.REQUIRED_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(Integer newLowerBound) {
		Integer oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND,
					oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(Integer newUpperBound) {
		Integer oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND,
					oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBind() {
		return bind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBind(String newBind) {
		String oldBind = bind;
		bind = newBind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.REQUIRED_SERVICE__BIND, oldBind, bind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject) interface_;
			interface_ = (GenClass) eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EclipsePackage.REQUIRED_SERVICE__INTERFACE,
							oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(GenClass newInterface) {
		GenClass oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.REQUIRED_SERVICE__INTERFACE, oldInterface,
					interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EclipsePackage.REQUIRED_SERVICE__NAME:
			return getName();
		case EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND:
			return getLowerBound();
		case EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND:
			return getUpperBound();
		case EclipsePackage.REQUIRED_SERVICE__BIND:
			return getBind();
		case EclipsePackage.REQUIRED_SERVICE__INTERFACE:
			if (resolve)
				return getInterface();
			return basicGetInterface();
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
		case EclipsePackage.REQUIRED_SERVICE__NAME:
			setName((String) newValue);
			return;
		case EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND:
			setLowerBound((Integer) newValue);
			return;
		case EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND:
			setUpperBound((Integer) newValue);
			return;
		case EclipsePackage.REQUIRED_SERVICE__BIND:
			setBind((String) newValue);
			return;
		case EclipsePackage.REQUIRED_SERVICE__INTERFACE:
			setInterface((GenClass) newValue);
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
		case EclipsePackage.REQUIRED_SERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND:
			setLowerBound(LOWER_BOUND_EDEFAULT);
			return;
		case EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND:
			setUpperBound(UPPER_BOUND_EDEFAULT);
			return;
		case EclipsePackage.REQUIRED_SERVICE__BIND:
			setBind(BIND_EDEFAULT);
			return;
		case EclipsePackage.REQUIRED_SERVICE__INTERFACE:
			setInterface((GenClass) null);
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
		case EclipsePackage.REQUIRED_SERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND:
			return LOWER_BOUND_EDEFAULT == null ? lowerBound != null
					: !LOWER_BOUND_EDEFAULT.equals(lowerBound);
		case EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND:
			return UPPER_BOUND_EDEFAULT == null ? upperBound != null
					: !UPPER_BOUND_EDEFAULT.equals(upperBound);
		case EclipsePackage.REQUIRED_SERVICE__BIND:
			return BIND_EDEFAULT == null ? bind != null : !BIND_EDEFAULT
					.equals(bind);
		case EclipsePackage.REQUIRED_SERVICE__INTERFACE:
			return interface_ != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", bind: ");
		result.append(bind);
		result.append(')');
		return result.toString();
	}

} //RequiredServiceImpl
