/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Editor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl#getEditorID <em>Editor ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditorImpl extends PartImpl implements Editor
{
  /**
   * The default value of the '{@link #getEditorID() <em>Editor ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditorID()
   * @generated
   * @ordered
   */
  protected static final String EDITOR_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEditorID() <em>Editor ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditorID()
   * @generated
   * @ordered
   */
  protected String editorID = EDITOR_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected static final String LANGUAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected String language = LANGUAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditorImpl()
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
    return EclipsePackage.Literals.EDITOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEditorID()
  {
    return editorID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditorID(String newEditorID)
  {
    String oldEditorID = editorID;
    editorID = newEditorID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.EDITOR__EDITOR_ID, oldEditorID, editorID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLanguage()
  {
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLanguage(String newLanguage)
  {
    String oldLanguage = language;
    language = newLanguage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.EDITOR__LANGUAGE, oldLanguage, language));
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
      case EclipsePackage.EDITOR__EDITOR_ID:
        return getEditorID();
      case EclipsePackage.EDITOR__LANGUAGE:
        return getLanguage();
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
      case EclipsePackage.EDITOR__EDITOR_ID:
        setEditorID((String)newValue);
        return;
      case EclipsePackage.EDITOR__LANGUAGE:
        setLanguage((String)newValue);
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
      case EclipsePackage.EDITOR__EDITOR_ID:
        setEditorID(EDITOR_ID_EDEFAULT);
        return;
      case EclipsePackage.EDITOR__LANGUAGE:
        setLanguage(LANGUAGE_EDEFAULT);
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
      case EclipsePackage.EDITOR__EDITOR_ID:
        return EDITOR_ID_EDEFAULT == null ? editorID != null : !EDITOR_ID_EDEFAULT.equals(editorID);
      case EclipsePackage.EDITOR__LANGUAGE:
        return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
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
    result.append(" (editorID: ");
    result.append(editorID);
    result.append(", language: ");
    result.append(language);
    result.append(')');
    return result.toString();
  }

} //EditorImpl
