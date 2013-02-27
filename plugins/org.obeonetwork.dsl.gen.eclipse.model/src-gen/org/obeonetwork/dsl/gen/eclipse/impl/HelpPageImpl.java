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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.HelpPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Help Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpPageImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpPageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpPageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpPageImpl#getHelpPages <em>Help Pages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpPageImpl#getExternalHelpPages <em>External Help Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HelpPageImpl extends MinimalEObjectImpl.Container implements HelpPage
{
  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

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
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getHelpPages() <em>Help Pages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpPages()
   * @generated
   * @ordered
   */
  protected EList<HelpPage> helpPages;

  /**
   * The cached value of the '{@link #getExternalHelpPages() <em>External Help Pages</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalHelpPages()
   * @generated
   * @ordered
   */
  protected EList<HelpPage> externalHelpPages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HelpPageImpl()
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
    return EclipsePackage.Literals.HELP_PAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.HELP_PAGE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.HELP_PAGE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.HELP_PAGE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HelpPage> getHelpPages()
  {
    if (helpPages == null)
    {
      helpPages = new EObjectContainmentEList<HelpPage>(HelpPage.class, this, EclipsePackage.HELP_PAGE__HELP_PAGES);
    }
    return helpPages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HelpPage> getExternalHelpPages()
  {
    if (externalHelpPages == null)
    {
      externalHelpPages = new EObjectResolvingEList<HelpPage>(HelpPage.class, this, EclipsePackage.HELP_PAGE__EXTERNAL_HELP_PAGES);
    }
    return externalHelpPages;
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
      case EclipsePackage.HELP_PAGE__HELP_PAGES:
        return ((InternalEList<?>)getHelpPages()).basicRemove(otherEnd, msgs);
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
      case EclipsePackage.HELP_PAGE__LABEL:
        return getLabel();
      case EclipsePackage.HELP_PAGE__DESCRIPTION:
        return getDescription();
      case EclipsePackage.HELP_PAGE__TITLE:
        return getTitle();
      case EclipsePackage.HELP_PAGE__HELP_PAGES:
        return getHelpPages();
      case EclipsePackage.HELP_PAGE__EXTERNAL_HELP_PAGES:
        return getExternalHelpPages();
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
      case EclipsePackage.HELP_PAGE__LABEL:
        setLabel((String)newValue);
        return;
      case EclipsePackage.HELP_PAGE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case EclipsePackage.HELP_PAGE__TITLE:
        setTitle((String)newValue);
        return;
      case EclipsePackage.HELP_PAGE__HELP_PAGES:
        getHelpPages().clear();
        getHelpPages().addAll((Collection<? extends HelpPage>)newValue);
        return;
      case EclipsePackage.HELP_PAGE__EXTERNAL_HELP_PAGES:
        getExternalHelpPages().clear();
        getExternalHelpPages().addAll((Collection<? extends HelpPage>)newValue);
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
      case EclipsePackage.HELP_PAGE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case EclipsePackage.HELP_PAGE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case EclipsePackage.HELP_PAGE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case EclipsePackage.HELP_PAGE__HELP_PAGES:
        getHelpPages().clear();
        return;
      case EclipsePackage.HELP_PAGE__EXTERNAL_HELP_PAGES:
        getExternalHelpPages().clear();
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
      case EclipsePackage.HELP_PAGE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case EclipsePackage.HELP_PAGE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case EclipsePackage.HELP_PAGE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case EclipsePackage.HELP_PAGE__HELP_PAGES:
        return helpPages != null && !helpPages.isEmpty();
      case EclipsePackage.HELP_PAGE__EXTERNAL_HELP_PAGES:
        return externalHelpPages != null && !externalHelpPages.isEmpty();
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
    result.append(" (label: ");
    result.append(label);
    result.append(", description: ");
    result.append(description);
    result.append(", title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //HelpPageImpl
