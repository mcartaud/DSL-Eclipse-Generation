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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.ActionSet;
import org.obeonetwork.dsl.gen.eclipse.ContextualHelp;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Part;
import org.obeonetwork.dsl.gen.eclipse.Perspective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getPartID <em>Part ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getActionSets <em>Action Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getContextualHelp <em>Contextual Help</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartImpl extends MinimalEObjectImpl.Container implements Part
{
  /**
   * The default value of the '{@link #getPartID() <em>Part ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartID()
   * @generated
   * @ordered
   */
  protected static final String PART_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPartID() <em>Part ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartID()
   * @generated
   * @ordered
   */
  protected String partID = PART_ID_EDEFAULT;

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
   * The cached value of the '{@link #getActionSets() <em>Action Sets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionSets()
   * @generated
   * @ordered
   */
  protected EList<ActionSet> actionSets;

  /**
   * The cached value of the '{@link #getContextualHelp() <em>Contextual Help</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextualHelp()
   * @generated
   * @ordered
   */
  protected ContextualHelp contextualHelp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartImpl()
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
    return EclipsePackage.Literals.PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPartID()
  {
    return partID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartID(String newPartID)
  {
    String oldPartID = partID;
    partID = newPartID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PART__PART_ID, oldPartID, partID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PART__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PART__DESCRIPTION, oldDescription, description));
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
      actionSets = new EObjectContainmentEList<ActionSet>(ActionSet.class, this, EclipsePackage.PART__ACTION_SETS);
    }
    return actionSets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextualHelp getContextualHelp()
  {
    return contextualHelp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextualHelp(ContextualHelp newContextualHelp, NotificationChain msgs)
  {
    ContextualHelp oldContextualHelp = contextualHelp;
    contextualHelp = newContextualHelp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.PART__CONTEXTUAL_HELP, oldContextualHelp, newContextualHelp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextualHelp(ContextualHelp newContextualHelp)
  {
    if (newContextualHelp != contextualHelp)
    {
      NotificationChain msgs = null;
      if (contextualHelp != null)
        msgs = ((InternalEObject)contextualHelp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclipsePackage.PART__CONTEXTUAL_HELP, null, msgs);
      if (newContextualHelp != null)
        msgs = ((InternalEObject)newContextualHelp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclipsePackage.PART__CONTEXTUAL_HELP, null, msgs);
      msgs = basicSetContextualHelp(newContextualHelp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PART__CONTEXTUAL_HELP, newContextualHelp, newContextualHelp));
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
      case EclipsePackage.PART__ACTION_SETS:
        return ((InternalEList<?>)getActionSets()).basicRemove(otherEnd, msgs);
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        return basicSetContextualHelp(null, msgs);
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
      case EclipsePackage.PART__PART_ID:
        return getPartID();
      case EclipsePackage.PART__NAME:
        return getName();
      case EclipsePackage.PART__DESCRIPTION:
        return getDescription();
      case EclipsePackage.PART__ACTION_SETS:
        return getActionSets();
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        return getContextualHelp();
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
      case EclipsePackage.PART__PART_ID:
        setPartID((String)newValue);
        return;
      case EclipsePackage.PART__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.PART__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case EclipsePackage.PART__ACTION_SETS:
        getActionSets().clear();
        getActionSets().addAll((Collection<? extends ActionSet>)newValue);
        return;
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        setContextualHelp((ContextualHelp)newValue);
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
      case EclipsePackage.PART__PART_ID:
        setPartID(PART_ID_EDEFAULT);
        return;
      case EclipsePackage.PART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.PART__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case EclipsePackage.PART__ACTION_SETS:
        getActionSets().clear();
        return;
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        setContextualHelp((ContextualHelp)null);
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
      case EclipsePackage.PART__PART_ID:
        return PART_ID_EDEFAULT == null ? partID != null : !PART_ID_EDEFAULT.equals(partID);
      case EclipsePackage.PART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.PART__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case EclipsePackage.PART__ACTION_SETS:
        return actionSets != null && !actionSets.isEmpty();
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        return contextualHelp != null;
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
    result.append(" (partID: ");
    result.append(partID);
    result.append(", name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //PartImpl
