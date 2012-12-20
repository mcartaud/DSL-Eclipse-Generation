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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipsemodel.ActionSet;
import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;
import org.obeonetwork.dsl.gen.eclipsemodel.Part;
import org.obeonetwork.dsl.gen.eclipsemodel.Perspective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PerspectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PerspectiveImpl#getPerspectiveID <em>Perspective ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PerspectiveImpl#getActionSets <em>Action Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PerspectiveImpl#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerspectiveImpl extends MinimalEObjectImpl.Container implements Perspective
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
   * The default value of the '{@link #getPerspectiveID() <em>Perspective ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerspectiveID()
   * @generated
   * @ordered
   */
  protected static final String PERSPECTIVE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPerspectiveID() <em>Perspective ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerspectiveID()
   * @generated
   * @ordered
   */
  protected String perspectiveID = PERSPECTIVE_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getActionSets() <em>Action Sets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionSets()
   * @generated
   * @ordered
   */
  protected EList<ActionSet> actionSets;

  /**
   * The cached value of the '{@link #getParts() <em>Parts</em>}' reference list.
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
  protected PerspectiveImpl()
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
    return EclipsemodelPackage.Literals.PERSPECTIVE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.PERSPECTIVE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPerspectiveID()
  {
    return perspectiveID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerspectiveID(String newPerspectiveID)
  {
    String oldPerspectiveID = perspectiveID;
    perspectiveID = newPerspectiveID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.PERSPECTIVE__PERSPECTIVE_ID, oldPerspectiveID, perspectiveID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionSet> getActionSets()
  {
    if (actionSets == null)
    {
      actionSets = new EObjectContainmentEList<ActionSet>(ActionSet.class, this, EclipsemodelPackage.PERSPECTIVE__ACTION_SETS);
    }
    return actionSets;
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
      parts = new EObjectWithInverseResolvingEList.ManyInverse<Part>(Part.class, this, EclipsemodelPackage.PERSPECTIVE__PARTS, EclipsemodelPackage.PART__PERSPECTIVES);
    }
    return parts;
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
      case EclipsemodelPackage.PERSPECTIVE__PARTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getParts()).basicAdd(otherEnd, msgs);
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
      case EclipsemodelPackage.PERSPECTIVE__ACTION_SETS:
        return ((InternalEList<?>)getActionSets()).basicRemove(otherEnd, msgs);
      case EclipsemodelPackage.PERSPECTIVE__PARTS:
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
      case EclipsemodelPackage.PERSPECTIVE__NAME:
        return getName();
      case EclipsemodelPackage.PERSPECTIVE__PERSPECTIVE_ID:
        return getPerspectiveID();
      case EclipsemodelPackage.PERSPECTIVE__ACTION_SETS:
        return getActionSets();
      case EclipsemodelPackage.PERSPECTIVE__PARTS:
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
      case EclipsemodelPackage.PERSPECTIVE__NAME:
        setName((String)newValue);
        return;
      case EclipsemodelPackage.PERSPECTIVE__PERSPECTIVE_ID:
        setPerspectiveID((String)newValue);
        return;
      case EclipsemodelPackage.PERSPECTIVE__ACTION_SETS:
        getActionSets().clear();
        getActionSets().addAll((Collection<? extends ActionSet>)newValue);
        return;
      case EclipsemodelPackage.PERSPECTIVE__PARTS:
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
      case EclipsemodelPackage.PERSPECTIVE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.PERSPECTIVE__PERSPECTIVE_ID:
        setPerspectiveID(PERSPECTIVE_ID_EDEFAULT);
        return;
      case EclipsemodelPackage.PERSPECTIVE__ACTION_SETS:
        getActionSets().clear();
        return;
      case EclipsemodelPackage.PERSPECTIVE__PARTS:
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
      case EclipsemodelPackage.PERSPECTIVE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsemodelPackage.PERSPECTIVE__PERSPECTIVE_ID:
        return PERSPECTIVE_ID_EDEFAULT == null ? perspectiveID != null : !PERSPECTIVE_ID_EDEFAULT.equals(perspectiveID);
      case EclipsemodelPackage.PERSPECTIVE__ACTION_SETS:
        return actionSets != null && !actionSets.isEmpty();
      case EclipsemodelPackage.PERSPECTIVE__PARTS:
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
    result.append(", perspectiveID: ");
    result.append(perspectiveID);
    result.append(')');
    return result.toString();
  }

} //PerspectiveImpl
