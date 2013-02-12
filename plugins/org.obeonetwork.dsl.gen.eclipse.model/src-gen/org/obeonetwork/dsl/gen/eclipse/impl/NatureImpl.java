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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.Builder;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Nature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl#getLangageName <em>Langage Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl#getNatureID <em>Nature ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl#isHasToogleNature <em>Has Toogle Nature</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl#getBuilders <em>Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NatureImpl extends MinimalEObjectImpl.Container implements Nature
{
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
   * The default value of the '{@link #getLangageName() <em>Langage Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLangageName()
   * @generated
   * @ordered
   */
  protected static final String LANGAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLangageName() <em>Langage Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLangageName()
   * @generated
   * @ordered
   */
  protected String langageName = LANGAGE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNatureID() <em>Nature ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNatureID()
   * @generated
   * @ordered
   */
  protected static final String NATURE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNatureID() <em>Nature ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNatureID()
   * @generated
   * @ordered
   */
  protected String natureID = NATURE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #isHasToogleNature() <em>Has Toogle Nature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasToogleNature()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_TOOGLE_NATURE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasToogleNature() <em>Has Toogle Nature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasToogleNature()
   * @generated
   * @ordered
   */
  protected boolean hasToogleNature = HAS_TOOGLE_NATURE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBuilders() <em>Builders</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuilders()
   * @generated
   * @ordered
   */
  protected EList<Builder> builders;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NatureImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EclipsePackage.Literals.NATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.NATURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLangageName()
  {
    return langageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLangageName(String newLangageName)
  {
    String oldLangageName = langageName;
    langageName = newLangageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.NATURE__LANGAGE_NAME, oldLangageName, langageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNatureID()
  {
    return natureID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNatureID(String newNatureID)
  {
    String oldNatureID = natureID;
    natureID = newNatureID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.NATURE__NATURE_ID, oldNatureID, natureID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasToogleNature()
  {
    return hasToogleNature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasToogleNature(boolean newHasToogleNature)
  {
    boolean oldHasToogleNature = hasToogleNature;
    hasToogleNature = newHasToogleNature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.NATURE__HAS_TOOGLE_NATURE, oldHasToogleNature, hasToogleNature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Builder> getBuilders()
  {
    if (builders == null)
    {
      builders = new EObjectWithInverseResolvingEList.ManyInverse<Builder>(Builder.class, this, EclipsePackage.NATURE__BUILDERS, EclipsePackage.BUILDER__NATURES);
    }
    return builders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EclipsePackage.NATURE__BUILDERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getBuilders()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EclipsePackage.NATURE__BUILDERS:
        return ((InternalEList<?>)getBuilders()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EclipsePackage.NATURE__NAME:
        return getName();
      case EclipsePackage.NATURE__LANGAGE_NAME:
        return getLangageName();
      case EclipsePackage.NATURE__NATURE_ID:
        return getNatureID();
      case EclipsePackage.NATURE__HAS_TOOGLE_NATURE:
        return isHasToogleNature();
      case EclipsePackage.NATURE__BUILDERS:
        return getBuilders();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EclipsePackage.NATURE__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.NATURE__LANGAGE_NAME:
        setLangageName((String)newValue);
        return;
      case EclipsePackage.NATURE__NATURE_ID:
        setNatureID((String)newValue);
        return;
      case EclipsePackage.NATURE__HAS_TOOGLE_NATURE:
        setHasToogleNature((Boolean)newValue);
        return;
      case EclipsePackage.NATURE__BUILDERS:
        getBuilders().clear();
        getBuilders().addAll((Collection<? extends Builder>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EclipsePackage.NATURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.NATURE__LANGAGE_NAME:
        setLangageName(LANGAGE_NAME_EDEFAULT);
        return;
      case EclipsePackage.NATURE__NATURE_ID:
        setNatureID(NATURE_ID_EDEFAULT);
        return;
      case EclipsePackage.NATURE__HAS_TOOGLE_NATURE:
        setHasToogleNature(HAS_TOOGLE_NATURE_EDEFAULT);
        return;
      case EclipsePackage.NATURE__BUILDERS:
        getBuilders().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EclipsePackage.NATURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.NATURE__LANGAGE_NAME:
        return LANGAGE_NAME_EDEFAULT == null ? langageName != null : !LANGAGE_NAME_EDEFAULT.equals(langageName);
      case EclipsePackage.NATURE__NATURE_ID:
        return NATURE_ID_EDEFAULT == null ? natureID != null : !NATURE_ID_EDEFAULT.equals(natureID);
      case EclipsePackage.NATURE__HAS_TOOGLE_NATURE:
        return hasToogleNature != HAS_TOOGLE_NATURE_EDEFAULT;
      case EclipsePackage.NATURE__BUILDERS:
        return builders != null && !builders.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", langageName: ");
    result.append(langageName);
    result.append(", natureID: ");
    result.append(natureID);
    result.append(", hasToogleNature: ");
    result.append(hasToogleNature);
    result.append(')');
    return result.toString();
  }

} //NatureImpl
