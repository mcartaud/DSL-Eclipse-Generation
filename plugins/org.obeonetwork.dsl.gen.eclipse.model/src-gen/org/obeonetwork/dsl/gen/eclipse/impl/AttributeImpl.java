/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.Attribute;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.AttributeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.AttributeImpl#isTranslatable <em>Translatable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.AttributeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
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
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * The default value of the '{@link #isTranslatable() <em>Translatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTranslatable()
   * @generated
   * @ordered
   */
  protected static final boolean TRANSLATABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTranslatable() <em>Translatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTranslatable()
   * @generated
   * @ordered
   */
  protected boolean translatable = TRANSLATABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final Type TYPE_EDEFAULT = Type.STRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return EclipsePackage.Literals.ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.ATTRIBUTE__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTranslatable()
  {
    return translatable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTranslatable(boolean newTranslatable)
  {
    boolean oldTranslatable = translatable;
    translatable = newTranslatable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.ATTRIBUTE__TRANSLATABLE, oldTranslatable, translatable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.ATTRIBUTE__TYPE, oldType, type));
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
      case EclipsePackage.ATTRIBUTE__NAME:
        return getName();
      case EclipsePackage.ATTRIBUTE__REQUIRED:
        return isRequired();
      case EclipsePackage.ATTRIBUTE__TRANSLATABLE:
        return isTranslatable();
      case EclipsePackage.ATTRIBUTE__TYPE:
        return getType();
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
      case EclipsePackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.ATTRIBUTE__REQUIRED:
        setRequired((Boolean)newValue);
        return;
      case EclipsePackage.ATTRIBUTE__TRANSLATABLE:
        setTranslatable((Boolean)newValue);
        return;
      case EclipsePackage.ATTRIBUTE__TYPE:
        setType((Type)newValue);
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
      case EclipsePackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.ATTRIBUTE__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case EclipsePackage.ATTRIBUTE__TRANSLATABLE:
        setTranslatable(TRANSLATABLE_EDEFAULT);
        return;
      case EclipsePackage.ATTRIBUTE__TYPE:
        setType(TYPE_EDEFAULT);
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
      case EclipsePackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.ATTRIBUTE__REQUIRED:
        return required != REQUIRED_EDEFAULT;
      case EclipsePackage.ATTRIBUTE__TRANSLATABLE:
        return translatable != TRANSLATABLE_EDEFAULT;
      case EclipsePackage.ATTRIBUTE__TYPE:
        return type != TYPE_EDEFAULT;
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
    result.append(", required: ");
    result.append(required);
    result.append(", translatable: ");
    result.append(translatable);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
