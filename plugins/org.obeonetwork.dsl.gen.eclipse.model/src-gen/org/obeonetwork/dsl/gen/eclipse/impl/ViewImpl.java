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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.Category;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Handler;
import org.obeonetwork.dsl.gen.eclipse.Menu;
import org.obeonetwork.dsl.gen.eclipse.Perspective;
import org.obeonetwork.dsl.gen.eclipse.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl#isIsTree <em>Is Tree</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl#isIsVisible <em>Is Visible</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends PartImpl implements View
{
  /**
   * The default value of the '{@link #isIsTree() <em>Is Tree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTree()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TREE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsTree() <em>Is Tree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTree()
   * @generated
   * @ordered
   */
  protected boolean isTree = IS_TREE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsVisible() <em>Is Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsVisible()
   * @generated
   * @ordered
   */
  protected static final boolean IS_VISIBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsVisible() <em>Is Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsVisible()
   * @generated
   * @ordered
   */
  protected boolean isVisible = IS_VISIBLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlers()
   * @generated
   * @ordered
   */
  protected EList<Handler> handlers;

  /**
   * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenus()
   * @generated
   * @ordered
   */
  protected EList<Menu> menus;

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
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected Category category;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewImpl()
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
    return EclipsePackage.Literals.VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsTree()
  {
    return isTree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsTree(boolean newIsTree)
  {
    boolean oldIsTree = isTree;
    isTree = newIsTree;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.VIEW__IS_TREE, oldIsTree, isTree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsVisible()
  {
    return isVisible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsVisible(boolean newIsVisible)
  {
    boolean oldIsVisible = isVisible;
    isVisible = newIsVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.VIEW__IS_VISIBLE, oldIsVisible, isVisible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Handler> getHandlers()
  {
    if (handlers == null)
    {
      handlers = new EObjectContainmentEList<Handler>(Handler.class, this, EclipsePackage.VIEW__HANDLERS);
    }
    return handlers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Menu> getMenus()
  {
    if (menus == null)
    {
      menus = new EObjectContainmentEList<Menu>(Menu.class, this, EclipsePackage.VIEW__MENUS);
    }
    return menus;
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
      perspectives = new EObjectWithInverseResolvingEList.ManyInverse<Perspective>(Perspective.class, this, EclipsePackage.VIEW__PERSPECTIVES, EclipsePackage.PERSPECTIVE__VIEWS);
    }
    return perspectives;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.VIEW__CATEGORY, oldCategory, category));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.VIEW__CATEGORY, oldCategory, newCategory);
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
        msgs = ((InternalEObject)category).eInverseRemove(this, EclipsePackage.CATEGORY__VIEWS, Category.class, msgs);
      if (newCategory != null)
        msgs = ((InternalEObject)newCategory).eInverseAdd(this, EclipsePackage.CATEGORY__VIEWS, Category.class, msgs);
      msgs = basicSetCategory(newCategory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.VIEW__CATEGORY, newCategory, newCategory));
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
      case EclipsePackage.VIEW__PERSPECTIVES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerspectives()).basicAdd(otherEnd, msgs);
      case EclipsePackage.VIEW__CATEGORY:
        if (category != null)
          msgs = ((InternalEObject)category).eInverseRemove(this, EclipsePackage.CATEGORY__VIEWS, Category.class, msgs);
        return basicSetCategory((Category)otherEnd, msgs);
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
      case EclipsePackage.VIEW__HANDLERS:
        return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
      case EclipsePackage.VIEW__MENUS:
        return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
      case EclipsePackage.VIEW__PERSPECTIVES:
        return ((InternalEList<?>)getPerspectives()).basicRemove(otherEnd, msgs);
      case EclipsePackage.VIEW__CATEGORY:
        return basicSetCategory(null, msgs);
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
      case EclipsePackage.VIEW__IS_TREE:
        return isIsTree();
      case EclipsePackage.VIEW__IS_VISIBLE:
        return isIsVisible();
      case EclipsePackage.VIEW__HANDLERS:
        return getHandlers();
      case EclipsePackage.VIEW__MENUS:
        return getMenus();
      case EclipsePackage.VIEW__PERSPECTIVES:
        return getPerspectives();
      case EclipsePackage.VIEW__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
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
      case EclipsePackage.VIEW__IS_TREE:
        setIsTree((Boolean)newValue);
        return;
      case EclipsePackage.VIEW__IS_VISIBLE:
        setIsVisible((Boolean)newValue);
        return;
      case EclipsePackage.VIEW__HANDLERS:
        getHandlers().clear();
        getHandlers().addAll((Collection<? extends Handler>)newValue);
        return;
      case EclipsePackage.VIEW__MENUS:
        getMenus().clear();
        getMenus().addAll((Collection<? extends Menu>)newValue);
        return;
      case EclipsePackage.VIEW__PERSPECTIVES:
        getPerspectives().clear();
        getPerspectives().addAll((Collection<? extends Perspective>)newValue);
        return;
      case EclipsePackage.VIEW__CATEGORY:
        setCategory((Category)newValue);
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
      case EclipsePackage.VIEW__IS_TREE:
        setIsTree(IS_TREE_EDEFAULT);
        return;
      case EclipsePackage.VIEW__IS_VISIBLE:
        setIsVisible(IS_VISIBLE_EDEFAULT);
        return;
      case EclipsePackage.VIEW__HANDLERS:
        getHandlers().clear();
        return;
      case EclipsePackage.VIEW__MENUS:
        getMenus().clear();
        return;
      case EclipsePackage.VIEW__PERSPECTIVES:
        getPerspectives().clear();
        return;
      case EclipsePackage.VIEW__CATEGORY:
        setCategory((Category)null);
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
      case EclipsePackage.VIEW__IS_TREE:
        return isTree != IS_TREE_EDEFAULT;
      case EclipsePackage.VIEW__IS_VISIBLE:
        return isVisible != IS_VISIBLE_EDEFAULT;
      case EclipsePackage.VIEW__HANDLERS:
        return handlers != null && !handlers.isEmpty();
      case EclipsePackage.VIEW__MENUS:
        return menus != null && !menus.isEmpty();
      case EclipsePackage.VIEW__PERSPECTIVES:
        return perspectives != null && !perspectives.isEmpty();
      case EclipsePackage.VIEW__CATEGORY:
        return category != null;
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
    result.append(" (isTree: ");
    result.append(isTree);
    result.append(", isVisible: ");
    result.append(isVisible);
    result.append(')');
    return result.toString();
  }

} //ViewImpl
