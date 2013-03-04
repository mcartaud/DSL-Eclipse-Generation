/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.Binding;
import org.obeonetwork.dsl.gen.eclipse.Category;
import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Handler;
import org.obeonetwork.dsl.gen.eclipse.Menu;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
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
   * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltip()
   * @generated
   * @ordered
   */
  protected static final String TOOLTIP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltip()
   * @generated
   * @ordered
   */
  protected String tooltip = TOOLTIP_EDEFAULT;

  /**
   * The cached value of the '{@link #getHandler() <em>Handler</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected Handler handler;

  /**
   * The cached value of the '{@link #getMenu() <em>Menu</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenu()
   * @generated
   * @ordered
   */
  protected Menu menu;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected Category category;

  /**
   * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinding()
   * @generated
   * @ordered
   */
  protected Binding binding;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
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
    return EclipsePackage.Literals.COMMAND;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTooltip()
  {
    return tooltip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTooltip(String newTooltip)
  {
    String oldTooltip = tooltip;
    tooltip = newTooltip;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__TOOLTIP, oldTooltip, tooltip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Handler getHandler()
  {
    if (handler != null && handler.eIsProxy())
    {
      InternalEObject oldHandler = (InternalEObject)handler;
      handler = (Handler)eResolveProxy(oldHandler);
      if (handler != oldHandler)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.COMMAND__HANDLER, oldHandler, handler));
      }
    }
    return handler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Handler basicGetHandler()
  {
    return handler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHandler(Handler newHandler, NotificationChain msgs)
  {
    Handler oldHandler = handler;
    handler = newHandler;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__HANDLER, oldHandler, newHandler);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandler(Handler newHandler)
  {
    if (newHandler != handler)
    {
      NotificationChain msgs = null;
      if (handler != null)
        msgs = ((InternalEObject)handler).eInverseRemove(this, EclipsePackage.HANDLER__COMMAND, Handler.class, msgs);
      if (newHandler != null)
        msgs = ((InternalEObject)newHandler).eInverseAdd(this, EclipsePackage.HANDLER__COMMAND, Handler.class, msgs);
      msgs = basicSetHandler(newHandler, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__HANDLER, newHandler, newHandler));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menu getMenu()
  {
    if (menu != null && menu.eIsProxy())
    {
      InternalEObject oldMenu = (InternalEObject)menu;
      menu = (Menu)eResolveProxy(oldMenu);
      if (menu != oldMenu)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.COMMAND__MENU, oldMenu, menu));
      }
    }
    return menu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menu basicGetMenu()
  {
    return menu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMenu(Menu newMenu, NotificationChain msgs)
  {
    Menu oldMenu = menu;
    menu = newMenu;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__MENU, oldMenu, newMenu);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenu(Menu newMenu)
  {
    if (newMenu != menu)
    {
      NotificationChain msgs = null;
      if (menu != null)
        msgs = ((InternalEObject)menu).eInverseRemove(this, EclipsePackage.MENU__COMMANDS, Menu.class, msgs);
      if (newMenu != null)
        msgs = ((InternalEObject)newMenu).eInverseAdd(this, EclipsePackage.MENU__COMMANDS, Menu.class, msgs);
      msgs = basicSetMenu(newMenu, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__MENU, newMenu, newMenu));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category getCategory()
  {
    if (category != null && category.eIsProxy())
    {
      InternalEObject oldCategory = (InternalEObject)category;
      category = (Category)eResolveProxy(oldCategory);
      if (category != oldCategory)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.COMMAND__CATEGORY, oldCategory, category));
      }
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category basicGetCategory()
  {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCategory(Category newCategory, NotificationChain msgs)
  {
    Category oldCategory = category;
    category = newCategory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__CATEGORY, oldCategory, newCategory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(Category newCategory)
  {
    if (newCategory != category)
    {
      NotificationChain msgs = null;
      if (category != null)
        msgs = ((InternalEObject)category).eInverseRemove(this, EclipsePackage.CATEGORY__COMMANDS, Category.class, msgs);
      if (newCategory != null)
        msgs = ((InternalEObject)newCategory).eInverseAdd(this, EclipsePackage.CATEGORY__COMMANDS, Category.class, msgs);
      msgs = basicSetCategory(newCategory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__CATEGORY, newCategory, newCategory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding getBinding()
  {
    if (binding != null && binding.eIsProxy())
    {
      InternalEObject oldBinding = (InternalEObject)binding;
      binding = (Binding)eResolveProxy(oldBinding);
      if (binding != oldBinding)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.COMMAND__BINDING, oldBinding, binding));
      }
    }
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding basicGetBinding()
  {
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinding(Binding newBinding, NotificationChain msgs)
  {
    Binding oldBinding = binding;
    binding = newBinding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__BINDING, oldBinding, newBinding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinding(Binding newBinding)
  {
    if (newBinding != binding)
    {
      NotificationChain msgs = null;
      if (binding != null)
        msgs = ((InternalEObject)binding).eInverseRemove(this, EclipsePackage.BINDING__COMMAND, Binding.class, msgs);
      if (newBinding != null)
        msgs = ((InternalEObject)newBinding).eInverseAdd(this, EclipsePackage.BINDING__COMMAND, Binding.class, msgs);
      msgs = basicSetBinding(newBinding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.COMMAND__BINDING, newBinding, newBinding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EclipsePackage.COMMAND__HANDLER:
        if (handler != null)
          msgs = ((InternalEObject)handler).eInverseRemove(this, EclipsePackage.HANDLER__COMMAND, Handler.class, msgs);
        return basicSetHandler((Handler)otherEnd, msgs);
      case EclipsePackage.COMMAND__MENU:
        if (menu != null)
          msgs = ((InternalEObject)menu).eInverseRemove(this, EclipsePackage.MENU__COMMANDS, Menu.class, msgs);
        return basicSetMenu((Menu)otherEnd, msgs);
      case EclipsePackage.COMMAND__CATEGORY:
        if (category != null)
          msgs = ((InternalEObject)category).eInverseRemove(this, EclipsePackage.CATEGORY__COMMANDS, Category.class, msgs);
        return basicSetCategory((Category)otherEnd, msgs);
      case EclipsePackage.COMMAND__BINDING:
        if (binding != null)
          msgs = ((InternalEObject)binding).eInverseRemove(this, EclipsePackage.BINDING__COMMAND, Binding.class, msgs);
        return basicSetBinding((Binding)otherEnd, msgs);
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
      case EclipsePackage.COMMAND__HANDLER:
        return basicSetHandler(null, msgs);
      case EclipsePackage.COMMAND__MENU:
        return basicSetMenu(null, msgs);
      case EclipsePackage.COMMAND__CATEGORY:
        return basicSetCategory(null, msgs);
      case EclipsePackage.COMMAND__BINDING:
        return basicSetBinding(null, msgs);
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
      case EclipsePackage.COMMAND__NAME:
        return getName();
      case EclipsePackage.COMMAND__ICON:
        return getIcon();
      case EclipsePackage.COMMAND__TOOLTIP:
        return getTooltip();
      case EclipsePackage.COMMAND__HANDLER:
        if (resolve) return getHandler();
        return basicGetHandler();
      case EclipsePackage.COMMAND__MENU:
        if (resolve) return getMenu();
        return basicGetMenu();
      case EclipsePackage.COMMAND__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
      case EclipsePackage.COMMAND__BINDING:
        if (resolve) return getBinding();
        return basicGetBinding();
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
      case EclipsePackage.COMMAND__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.COMMAND__ICON:
        setIcon((String)newValue);
        return;
      case EclipsePackage.COMMAND__TOOLTIP:
        setTooltip((String)newValue);
        return;
      case EclipsePackage.COMMAND__HANDLER:
        setHandler((Handler)newValue);
        return;
      case EclipsePackage.COMMAND__MENU:
        setMenu((Menu)newValue);
        return;
      case EclipsePackage.COMMAND__CATEGORY:
        setCategory((Category)newValue);
        return;
      case EclipsePackage.COMMAND__BINDING:
        setBinding((Binding)newValue);
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
      case EclipsePackage.COMMAND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.COMMAND__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case EclipsePackage.COMMAND__TOOLTIP:
        setTooltip(TOOLTIP_EDEFAULT);
        return;
      case EclipsePackage.COMMAND__HANDLER:
        setHandler((Handler)null);
        return;
      case EclipsePackage.COMMAND__MENU:
        setMenu((Menu)null);
        return;
      case EclipsePackage.COMMAND__CATEGORY:
        setCategory((Category)null);
        return;
      case EclipsePackage.COMMAND__BINDING:
        setBinding((Binding)null);
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
      case EclipsePackage.COMMAND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.COMMAND__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case EclipsePackage.COMMAND__TOOLTIP:
        return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
      case EclipsePackage.COMMAND__HANDLER:
        return handler != null;
      case EclipsePackage.COMMAND__MENU:
        return menu != null;
      case EclipsePackage.COMMAND__CATEGORY:
        return category != null;
      case EclipsePackage.COMMAND__BINDING:
        return binding != null;
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
    result.append(", tooltip: ");
    result.append(tooltip);
    result.append(')');
    return result.toString();
  }

} //CommandImpl
