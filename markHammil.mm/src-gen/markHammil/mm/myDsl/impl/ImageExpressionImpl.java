/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl.impl;

import markHammil.mm.myDsl.EmphasisExpression;
import markHammil.mm.myDsl.ImageExpression;
import markHammil.mm.myDsl.MyDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markHammil.mm.myDsl.impl.ImageExpressionImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link markHammil.mm.myDsl.impl.ImageExpressionImpl#getLinkContent <em>Link Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageExpressionImpl extends TextExpressionImpl implements ImageExpression
{
  /**
   * The cached value of the '{@link #getAltText() <em>Alt Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAltText()
   * @generated
   * @ordered
   */
  protected EmphasisExpression altText;

  /**
   * The cached value of the '{@link #getLinkContent() <em>Link Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkContent()
   * @generated
   * @ordered
   */
  protected EmphasisExpression linkContent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageExpressionImpl()
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
    return MyDslPackage.Literals.IMAGE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmphasisExpression getAltText()
  {
    return altText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAltText(EmphasisExpression newAltText, NotificationChain msgs)
  {
    EmphasisExpression oldAltText = altText;
    altText = newAltText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IMAGE_EXPRESSION__ALT_TEXT, oldAltText, newAltText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAltText(EmphasisExpression newAltText)
  {
    if (newAltText != altText)
    {
      NotificationChain msgs = null;
      if (altText != null)
        msgs = ((InternalEObject)altText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IMAGE_EXPRESSION__ALT_TEXT, null, msgs);
      if (newAltText != null)
        msgs = ((InternalEObject)newAltText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IMAGE_EXPRESSION__ALT_TEXT, null, msgs);
      msgs = basicSetAltText(newAltText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IMAGE_EXPRESSION__ALT_TEXT, newAltText, newAltText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmphasisExpression getLinkContent()
  {
    return linkContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinkContent(EmphasisExpression newLinkContent, NotificationChain msgs)
  {
    EmphasisExpression oldLinkContent = linkContent;
    linkContent = newLinkContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IMAGE_EXPRESSION__LINK_CONTENT, oldLinkContent, newLinkContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkContent(EmphasisExpression newLinkContent)
  {
    if (newLinkContent != linkContent)
    {
      NotificationChain msgs = null;
      if (linkContent != null)
        msgs = ((InternalEObject)linkContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IMAGE_EXPRESSION__LINK_CONTENT, null, msgs);
      if (newLinkContent != null)
        msgs = ((InternalEObject)newLinkContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IMAGE_EXPRESSION__LINK_CONTENT, null, msgs);
      msgs = basicSetLinkContent(newLinkContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IMAGE_EXPRESSION__LINK_CONTENT, newLinkContent, newLinkContent));
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
      case MyDslPackage.IMAGE_EXPRESSION__ALT_TEXT:
        return basicSetAltText(null, msgs);
      case MyDslPackage.IMAGE_EXPRESSION__LINK_CONTENT:
        return basicSetLinkContent(null, msgs);
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
      case MyDslPackage.IMAGE_EXPRESSION__ALT_TEXT:
        return getAltText();
      case MyDslPackage.IMAGE_EXPRESSION__LINK_CONTENT:
        return getLinkContent();
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
      case MyDslPackage.IMAGE_EXPRESSION__ALT_TEXT:
        setAltText((EmphasisExpression)newValue);
        return;
      case MyDslPackage.IMAGE_EXPRESSION__LINK_CONTENT:
        setLinkContent((EmphasisExpression)newValue);
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
      case MyDslPackage.IMAGE_EXPRESSION__ALT_TEXT:
        setAltText((EmphasisExpression)null);
        return;
      case MyDslPackage.IMAGE_EXPRESSION__LINK_CONTENT:
        setLinkContent((EmphasisExpression)null);
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
      case MyDslPackage.IMAGE_EXPRESSION__ALT_TEXT:
        return altText != null;
      case MyDslPackage.IMAGE_EXPRESSION__LINK_CONTENT:
        return linkContent != null;
    }
    return super.eIsSet(featureID);
  }

} //ImageExpressionImpl
