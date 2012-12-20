/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.gen.eclipsemodel.ContextualHelp;
import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;
import org.obeonetwork.dsl.gen.eclipsemodel.Page;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contextual Help</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ContextualHelpImpl#getContextualHelpID <em>Contextual Help ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ContextualHelpImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextualHelpImpl extends MinimalEObjectImpl.Container implements ContextualHelp
{
  /**
   * The default value of the '{@link #getContextualHelpID() <em>Contextual Help ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextualHelpID()
   * @generated
   * @ordered
   */
  protected static final String CONTEXTUAL_HELP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContextualHelpID() <em>Contextual Help ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextualHelpID()
   * @generated
   * @ordered
   */
  protected String contextualHelpID = CONTEXTUAL_HELP_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPage()
   * @generated
   * @ordered
   */
  protected Page page;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextualHelpImpl()
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
    return EclipsemodelPackage.Literals.CONTEXTUAL_HELP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContextualHelpID()
  {
    return contextualHelpID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextualHelpID(String newContextualHelpID)
  {
    String oldContextualHelpID = contextualHelpID;
    contextualHelpID = newContextualHelpID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.CONTEXTUAL_HELP__CONTEXTUAL_HELP_ID, oldContextualHelpID, contextualHelpID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page getPage()
  {
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPage(Page newPage, NotificationChain msgs)
  {
    Page oldPage = page;
    page = newPage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.CONTEXTUAL_HELP__PAGE, oldPage, newPage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPage(Page newPage)
  {
    if (newPage != page)
    {
      NotificationChain msgs = null;
      if (page != null)
        msgs = ((InternalEObject)page).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclipsemodelPackage.CONTEXTUAL_HELP__PAGE, null, msgs);
      if (newPage != null)
        msgs = ((InternalEObject)newPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclipsemodelPackage.CONTEXTUAL_HELP__PAGE, null, msgs);
      msgs = basicSetPage(newPage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.CONTEXTUAL_HELP__PAGE, newPage, newPage));
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
      case EclipsemodelPackage.CONTEXTUAL_HELP__PAGE:
        return basicSetPage(null, msgs);
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
      case EclipsemodelPackage.CONTEXTUAL_HELP__CONTEXTUAL_HELP_ID:
        return getContextualHelpID();
      case EclipsemodelPackage.CONTEXTUAL_HELP__PAGE:
        return getPage();
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
      case EclipsemodelPackage.CONTEXTUAL_HELP__CONTEXTUAL_HELP_ID:
        setContextualHelpID((String)newValue);
        return;
      case EclipsemodelPackage.CONTEXTUAL_HELP__PAGE:
        setPage((Page)newValue);
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
      case EclipsemodelPackage.CONTEXTUAL_HELP__CONTEXTUAL_HELP_ID:
        setContextualHelpID(CONTEXTUAL_HELP_ID_EDEFAULT);
        return;
      case EclipsemodelPackage.CONTEXTUAL_HELP__PAGE:
        setPage((Page)null);
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
      case EclipsemodelPackage.CONTEXTUAL_HELP__CONTEXTUAL_HELP_ID:
        return CONTEXTUAL_HELP_ID_EDEFAULT == null ? contextualHelpID != null : !CONTEXTUAL_HELP_ID_EDEFAULT.equals(contextualHelpID);
      case EclipsemodelPackage.CONTEXTUAL_HELP__PAGE:
        return page != null;
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
    result.append(" (contextualHelpID: ");
    result.append(contextualHelpID);
    result.append(')');
    return result.toString();
  }

} //ContextualHelpImpl
