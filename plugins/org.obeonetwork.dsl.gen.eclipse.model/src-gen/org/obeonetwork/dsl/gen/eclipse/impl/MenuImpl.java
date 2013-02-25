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

import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Menu;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#getMnecmonic <em>Mnecmonic</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#isMenuContribution <em>Menu Contribution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#isToolbarContribution <em>Toolbar Contribution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends MinimalEObjectImpl.Container implements Menu
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
   * The default value of the '{@link #getMnecmonic() <em>Mnecmonic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMnecmonic()
   * @generated
   * @ordered
   */
  protected static final String MNECMONIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMnecmonic() <em>Mnecmonic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMnecmonic()
   * @generated
   * @ordered
   */
  protected String mnecmonic = MNECMONIC_EDEFAULT;

  /**
   * The default value of the '{@link #isMenuContribution() <em>Menu Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMenuContribution()
   * @generated
   * @ordered
   */
  protected static final boolean MENU_CONTRIBUTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMenuContribution() <em>Menu Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMenuContribution()
   * @generated
   * @ordered
   */
  protected boolean menuContribution = MENU_CONTRIBUTION_EDEFAULT;

  /**
   * The default value of the '{@link #isToolbarContribution() <em>Toolbar Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToolbarContribution()
   * @generated
   * @ordered
   */
  protected static final boolean TOOLBAR_CONTRIBUTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isToolbarContribution() <em>Toolbar Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToolbarContribution()
   * @generated
   * @ordered
   */
  protected boolean toolbarContribution = TOOLBAR_CONTRIBUTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MenuImpl()
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
    return EclipsePackage.Literals.MENU;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.MENU__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMnecmonic()
  {
    return mnecmonic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMnecmonic(String newMnecmonic)
  {
    String oldMnecmonic = mnecmonic;
    mnecmonic = newMnecmonic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.MENU__MNECMONIC, oldMnecmonic, mnecmonic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMenuContribution()
  {
    return menuContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenuContribution(boolean newMenuContribution)
  {
    boolean oldMenuContribution = menuContribution;
    menuContribution = newMenuContribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.MENU__MENU_CONTRIBUTION, oldMenuContribution, menuContribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isToolbarContribution()
  {
    return toolbarContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToolbarContribution(boolean newToolbarContribution)
  {
    boolean oldToolbarContribution = toolbarContribution;
    toolbarContribution = newToolbarContribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.MENU__TOOLBAR_CONTRIBUTION, oldToolbarContribution, toolbarContribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectWithInverseResolvingEList<Command>(Command.class, this, EclipsePackage.MENU__COMMANDS, EclipsePackage.COMMAND__MENU);
    }
    return commands;
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
      case EclipsePackage.MENU__COMMANDS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommands()).basicAdd(otherEnd, msgs);
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
      case EclipsePackage.MENU__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
      case EclipsePackage.MENU__NAME:
        return getName();
      case EclipsePackage.MENU__MNECMONIC:
        return getMnecmonic();
      case EclipsePackage.MENU__MENU_CONTRIBUTION:
        return isMenuContribution();
      case EclipsePackage.MENU__TOOLBAR_CONTRIBUTION:
        return isToolbarContribution();
      case EclipsePackage.MENU__COMMANDS:
        return getCommands();
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
      case EclipsePackage.MENU__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.MENU__MNECMONIC:
        setMnecmonic((String)newValue);
        return;
      case EclipsePackage.MENU__MENU_CONTRIBUTION:
        setMenuContribution((Boolean)newValue);
        return;
      case EclipsePackage.MENU__TOOLBAR_CONTRIBUTION:
        setToolbarContribution((Boolean)newValue);
        return;
      case EclipsePackage.MENU__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
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
      case EclipsePackage.MENU__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.MENU__MNECMONIC:
        setMnecmonic(MNECMONIC_EDEFAULT);
        return;
      case EclipsePackage.MENU__MENU_CONTRIBUTION:
        setMenuContribution(MENU_CONTRIBUTION_EDEFAULT);
        return;
      case EclipsePackage.MENU__TOOLBAR_CONTRIBUTION:
        setToolbarContribution(TOOLBAR_CONTRIBUTION_EDEFAULT);
        return;
      case EclipsePackage.MENU__COMMANDS:
        getCommands().clear();
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
      case EclipsePackage.MENU__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.MENU__MNECMONIC:
        return MNECMONIC_EDEFAULT == null ? mnecmonic != null : !MNECMONIC_EDEFAULT.equals(mnecmonic);
      case EclipsePackage.MENU__MENU_CONTRIBUTION:
        return menuContribution != MENU_CONTRIBUTION_EDEFAULT;
      case EclipsePackage.MENU__TOOLBAR_CONTRIBUTION:
        return toolbarContribution != TOOLBAR_CONTRIBUTION_EDEFAULT;
      case EclipsePackage.MENU__COMMANDS:
        return commands != null && !commands.isEmpty();
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
    result.append(", mnecmonic: ");
    result.append(mnecmonic);
    result.append(", menuContribution: ");
    result.append(menuContribution);
    result.append(", toolbarContribution: ");
    result.append(toolbarContribution);
    result.append(')');
    return result.toString();
  }

} //MenuImpl
