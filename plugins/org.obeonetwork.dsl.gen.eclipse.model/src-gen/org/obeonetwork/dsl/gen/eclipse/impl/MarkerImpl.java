/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Marker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MarkerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MarkerImpl#getMarkerID <em>Marker ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MarkerImpl#isIsPersistant <em>Is Persistant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkerImpl extends MinimalEObjectImpl.Container implements Marker
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
   * The default value of the '{@link #getMarkerID() <em>Marker ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarkerID()
   * @generated
   * @ordered
   */
  protected static final String MARKER_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMarkerID() <em>Marker ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarkerID()
   * @generated
   * @ordered
   */
  protected String markerID = MARKER_ID_EDEFAULT;

  /**
   * The default value of the '{@link #isIsPersistant() <em>Is Persistant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPersistant()
   * @generated
   * @ordered
   */
  protected static final boolean IS_PERSISTANT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsPersistant() <em>Is Persistant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPersistant()
   * @generated
   * @ordered
   */
  protected boolean isPersistant = IS_PERSISTANT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarkerImpl()
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
    return EclipsePackage.Literals.MARKER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.MARKER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMarkerID()
  {
    return markerID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMarkerID(String newMarkerID)
  {
    String oldMarkerID = markerID;
    markerID = newMarkerID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.MARKER__MARKER_ID, oldMarkerID, markerID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsPersistant()
  {
    return isPersistant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsPersistant(boolean newIsPersistant)
  {
    boolean oldIsPersistant = isPersistant;
    isPersistant = newIsPersistant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.MARKER__IS_PERSISTANT, oldIsPersistant, isPersistant));
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
      case EclipsePackage.MARKER__NAME:
        return getName();
      case EclipsePackage.MARKER__MARKER_ID:
        return getMarkerID();
      case EclipsePackage.MARKER__IS_PERSISTANT:
        return isIsPersistant();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EclipsePackage.MARKER__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.MARKER__MARKER_ID:
        setMarkerID((String)newValue);
        return;
      case EclipsePackage.MARKER__IS_PERSISTANT:
        setIsPersistant((Boolean)newValue);
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
      case EclipsePackage.MARKER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.MARKER__MARKER_ID:
        setMarkerID(MARKER_ID_EDEFAULT);
        return;
      case EclipsePackage.MARKER__IS_PERSISTANT:
        setIsPersistant(IS_PERSISTANT_EDEFAULT);
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
      case EclipsePackage.MARKER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.MARKER__MARKER_ID:
        return MARKER_ID_EDEFAULT == null ? markerID != null : !MARKER_ID_EDEFAULT.equals(markerID);
      case EclipsePackage.MARKER__IS_PERSISTANT:
        return isPersistant != IS_PERSISTANT_EDEFAULT;
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
    result.append(", markerID: ");
    result.append(markerID);
    result.append(", isPersistant: ");
    result.append(isPersistant);
    result.append(')');
    return result.toString();
  }

} //MarkerImpl