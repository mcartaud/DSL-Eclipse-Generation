/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;
import org.obeonetwork.dsl.gen.eclipsemodel.Part;
import org.obeonetwork.dsl.gen.eclipsemodel.PartCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PartCategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PartCategoryImpl#getPartCategoryID <em>Part Category ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PartCategoryImpl#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartCategoryImpl extends MinimalEObjectImpl.Container implements PartCategory
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
   * The default value of the '{@link #getPartCategoryID() <em>Part Category ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartCategoryID()
   * @generated
   * @ordered
   */
  protected static final String PART_CATEGORY_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPartCategoryID() <em>Part Category ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartCategoryID()
   * @generated
   * @ordered
   */
  protected String partCategoryID = PART_CATEGORY_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParts()
   * @generated
   * @ordered
   */
  protected EList<Part> parts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartCategoryImpl()
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
    return EclipsemodelPackage.Literals.PART_CATEGORY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.PART_CATEGORY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPartCategoryID()
  {
    return partCategoryID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartCategoryID(String newPartCategoryID)
  {
    String oldPartCategoryID = partCategoryID;
    partCategoryID = newPartCategoryID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.PART_CATEGORY__PART_CATEGORY_ID, oldPartCategoryID, partCategoryID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Part> getParts()
  {
    if (parts == null)
    {
      parts = new EObjectContainmentEList<Part>(Part.class, this, EclipsemodelPackage.PART_CATEGORY__PARTS);
    }
    return parts;
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
      case EclipsemodelPackage.PART_CATEGORY__PARTS:
        return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
      case EclipsemodelPackage.PART_CATEGORY__NAME:
        return getName();
      case EclipsemodelPackage.PART_CATEGORY__PART_CATEGORY_ID:
        return getPartCategoryID();
      case EclipsemodelPackage.PART_CATEGORY__PARTS:
        return getParts();
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
      case EclipsemodelPackage.PART_CATEGORY__NAME:
        setName((String)newValue);
        return;
      case EclipsemodelPackage.PART_CATEGORY__PART_CATEGORY_ID:
        setPartCategoryID((String)newValue);
        return;
      case EclipsemodelPackage.PART_CATEGORY__PARTS:
        getParts().clear();
        getParts().addAll((Collection<? extends Part>)newValue);
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
      case EclipsemodelPackage.PART_CATEGORY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.PART_CATEGORY__PART_CATEGORY_ID:
        setPartCategoryID(PART_CATEGORY_ID_EDEFAULT);
        return;
      case EclipsemodelPackage.PART_CATEGORY__PARTS:
        getParts().clear();
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
      case EclipsemodelPackage.PART_CATEGORY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsemodelPackage.PART_CATEGORY__PART_CATEGORY_ID:
        return PART_CATEGORY_ID_EDEFAULT == null ? partCategoryID != null : !PART_CATEGORY_ID_EDEFAULT.equals(partCategoryID);
      case EclipsemodelPackage.PART_CATEGORY__PARTS:
        return parts != null && !parts.isEmpty();
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
    result.append(", partCategoryID: ");
    result.append(partCategoryID);
    result.append(')');
    return result.toString();
  }

} //PartCategoryImpl
