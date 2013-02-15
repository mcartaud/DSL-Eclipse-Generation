/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.DynamicHelp;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.HelpPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Help</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DynamicHelpImpl#getHelpPage <em>Help Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicHelpImpl extends HelpImpl implements DynamicHelp
{
  /**
   * The cached value of the '{@link #getHelpPage() <em>Help Page</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpPage()
   * @generated
   * @ordered
   */
  protected HelpPage helpPage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicHelpImpl()
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
    return EclipsePackage.Literals.DYNAMIC_HELP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelpPage getHelpPage()
  {
    return helpPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHelpPage(HelpPage newHelpPage, NotificationChain msgs)
  {
    HelpPage oldHelpPage = helpPage;
    helpPage = newHelpPage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.DYNAMIC_HELP__HELP_PAGE, oldHelpPage, newHelpPage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelpPage(HelpPage newHelpPage)
  {
    if (newHelpPage != helpPage)
    {
      NotificationChain msgs = null;
      if (helpPage != null)
        msgs = ((InternalEObject)helpPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclipsePackage.DYNAMIC_HELP__HELP_PAGE, null, msgs);
      if (newHelpPage != null)
        msgs = ((InternalEObject)newHelpPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclipsePackage.DYNAMIC_HELP__HELP_PAGE, null, msgs);
      msgs = basicSetHelpPage(newHelpPage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.DYNAMIC_HELP__HELP_PAGE, newHelpPage, newHelpPage));
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
      case EclipsePackage.DYNAMIC_HELP__HELP_PAGE:
        return basicSetHelpPage(null, msgs);
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
      case EclipsePackage.DYNAMIC_HELP__HELP_PAGE:
        return getHelpPage();
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
      case EclipsePackage.DYNAMIC_HELP__HELP_PAGE:
        setHelpPage((HelpPage)newValue);
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
      case EclipsePackage.DYNAMIC_HELP__HELP_PAGE:
        setHelpPage((HelpPage)null);
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
      case EclipsePackage.DYNAMIC_HELP__HELP_PAGE:
        return helpPage != null;
    }
    return super.eIsSet(featureID);
  }

} //DynamicHelpImpl
