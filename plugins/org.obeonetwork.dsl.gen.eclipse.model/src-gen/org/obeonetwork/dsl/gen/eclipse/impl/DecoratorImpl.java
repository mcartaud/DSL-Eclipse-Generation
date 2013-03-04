/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.Decorator;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DecoratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DecoratorImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DecoratorImpl#isIsLightweight <em>Is Lightweight</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DecoratorImpl#isIsAdaptable <em>Is Adaptable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DecoratorImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecoratorImpl extends MinimalEObjectImpl.Container implements Decorator
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
   * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected static final String ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected String icon = ICON_EDEFAULT;

  /**
   * The default value of the '{@link #isIsLightweight() <em>Is Lightweight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLightweight()
   * @generated
   * @ordered
   */
  protected static final boolean IS_LIGHTWEIGHT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsLightweight() <em>Is Lightweight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLightweight()
   * @generated
   * @ordered
   */
  protected boolean isLightweight = IS_LIGHTWEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsAdaptable() <em>Is Adaptable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAdaptable()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ADAPTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAdaptable() <em>Is Adaptable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAdaptable()
   * @generated
   * @ordered
   */
  protected boolean isAdaptable = IS_ADAPTABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final Location LOCATION_EDEFAULT = Location.BOTTOM_RIGHT;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected Location location = LOCATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecoratorImpl()
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
    return EclipsePackage.Literals.DECORATOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.DECORATOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(String newIcon)
  {
    String oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.DECORATOR__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsLightweight()
  {
    return isLightweight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsLightweight(boolean newIsLightweight)
  {
    boolean oldIsLightweight = isLightweight;
    isLightweight = newIsLightweight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.DECORATOR__IS_LIGHTWEIGHT, oldIsLightweight, isLightweight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAdaptable()
  {
    return isAdaptable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAdaptable(boolean newIsAdaptable)
  {
    boolean oldIsAdaptable = isAdaptable;
    isAdaptable = newIsAdaptable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.DECORATOR__IS_ADAPTABLE, oldIsAdaptable, isAdaptable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(Location newLocation)
  {
    Location oldLocation = location;
    location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.DECORATOR__LOCATION, oldLocation, location));
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
      case EclipsePackage.DECORATOR__NAME:
        return getName();
      case EclipsePackage.DECORATOR__ICON:
        return getIcon();
      case EclipsePackage.DECORATOR__IS_LIGHTWEIGHT:
        return isIsLightweight();
      case EclipsePackage.DECORATOR__IS_ADAPTABLE:
        return isIsAdaptable();
      case EclipsePackage.DECORATOR__LOCATION:
        return getLocation();
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
      case EclipsePackage.DECORATOR__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.DECORATOR__ICON:
        setIcon((String)newValue);
        return;
      case EclipsePackage.DECORATOR__IS_LIGHTWEIGHT:
        setIsLightweight((Boolean)newValue);
        return;
      case EclipsePackage.DECORATOR__IS_ADAPTABLE:
        setIsAdaptable((Boolean)newValue);
        return;
      case EclipsePackage.DECORATOR__LOCATION:
        setLocation((Location)newValue);
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
      case EclipsePackage.DECORATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.DECORATOR__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case EclipsePackage.DECORATOR__IS_LIGHTWEIGHT:
        setIsLightweight(IS_LIGHTWEIGHT_EDEFAULT);
        return;
      case EclipsePackage.DECORATOR__IS_ADAPTABLE:
        setIsAdaptable(IS_ADAPTABLE_EDEFAULT);
        return;
      case EclipsePackage.DECORATOR__LOCATION:
        setLocation(LOCATION_EDEFAULT);
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
      case EclipsePackage.DECORATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.DECORATOR__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case EclipsePackage.DECORATOR__IS_LIGHTWEIGHT:
        return isLightweight != IS_LIGHTWEIGHT_EDEFAULT;
      case EclipsePackage.DECORATOR__IS_ADAPTABLE:
        return isAdaptable != IS_ADAPTABLE_EDEFAULT;
      case EclipsePackage.DECORATOR__LOCATION:
        return location != LOCATION_EDEFAULT;
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
    result.append(", icon: ");
    result.append(icon);
    result.append(", isLightweight: ");
    result.append(isLightweight);
    result.append(", isAdaptable: ");
    result.append(isAdaptable);
    result.append(", location: ");
    result.append(location);
    result.append(')');
    return result.toString();
  }

} //DecoratorImpl
