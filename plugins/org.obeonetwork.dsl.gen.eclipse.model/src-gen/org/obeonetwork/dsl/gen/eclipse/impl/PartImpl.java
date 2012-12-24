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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getContextualHelp <em>Contextual Help</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getPerspectives <em>Perspectives</em>}</li>
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
   * The cached value of the '{@link #getContextualHelp() <em>Contextual Help</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextualHelp()
   * @generated
   * @ordered
   */
  protected ContextualHelp contextualHelp;

  /**
   * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerspectives()
   * @generated
   * @ordered
   */
  protected EList<Perspective> perspectives;

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
  public EList<Perspective> getPerspectives()
  {
    if (perspectives == null)
    {
      perspectives = new EObjectWithInverseResolvingEList.ManyInverse<Perspective>(Perspective.class, this, EclipsePackage.PART__PERSPECTIVES, EclipsePackage.PERSPECTIVE__PARTS);
    }
    return perspectives;
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
      case EclipsePackage.PART__PERSPECTIVES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerspectives()).basicAdd(otherEnd, msgs);
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
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        return basicSetContextualHelp(null, msgs);
      case EclipsePackage.PART__PERSPECTIVES:
        return ((InternalEList<?>)getPerspectives()).basicRemove(otherEnd, msgs);
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
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        return getContextualHelp();
      case EclipsePackage.PART__PERSPECTIVES:
        return getPerspectives();
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
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        setContextualHelp((ContextualHelp)newValue);
        return;
      case EclipsePackage.PART__PERSPECTIVES:
        getPerspectives().clear();
        getPerspectives().addAll((Collection<? extends Perspective>)newValue);
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
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        setContextualHelp((ContextualHelp)null);
        return;
      case EclipsePackage.PART__PERSPECTIVES:
        getPerspectives().clear();
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
      case EclipsePackage.PART__CONTEXTUAL_HELP:
        return contextualHelp != null;
      case EclipsePackage.PART__PERSPECTIVES:
        return perspectives != null && !perspectives.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //PartImpl
