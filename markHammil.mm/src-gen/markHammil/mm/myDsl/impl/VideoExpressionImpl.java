/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl.impl;

import markHammil.mm.myDsl.EmphasisExpression;
import markHammil.mm.myDsl.MyDslPackage;
import markHammil.mm.myDsl.VideoExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markHammil.mm.myDsl.impl.VideoExpressionImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link markHammil.mm.myDsl.impl.VideoExpressionImpl#getLinkImage <em>Link Image</em>}</li>
 *   <li>{@link markHammil.mm.myDsl.impl.VideoExpressionImpl#getLinkVideo <em>Link Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoExpressionImpl extends TextExpressionImpl implements VideoExpression
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
   * The cached value of the '{@link #getLinkImage() <em>Link Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkImage()
   * @generated
   * @ordered
   */
  protected EmphasisExpression linkImage;

  /**
   * The cached value of the '{@link #getLinkVideo() <em>Link Video</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkVideo()
   * @generated
   * @ordered
   */
  protected EmphasisExpression linkVideo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideoExpressionImpl()
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
    return MyDslPackage.Literals.VIDEO_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VIDEO_EXPRESSION__ALT_TEXT, oldAltText, newAltText);
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
        msgs = ((InternalEObject)altText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VIDEO_EXPRESSION__ALT_TEXT, null, msgs);
      if (newAltText != null)
        msgs = ((InternalEObject)newAltText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VIDEO_EXPRESSION__ALT_TEXT, null, msgs);
      msgs = basicSetAltText(newAltText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VIDEO_EXPRESSION__ALT_TEXT, newAltText, newAltText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmphasisExpression getLinkImage()
  {
    return linkImage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinkImage(EmphasisExpression newLinkImage, NotificationChain msgs)
  {
    EmphasisExpression oldLinkImage = linkImage;
    linkImage = newLinkImage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VIDEO_EXPRESSION__LINK_IMAGE, oldLinkImage, newLinkImage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkImage(EmphasisExpression newLinkImage)
  {
    if (newLinkImage != linkImage)
    {
      NotificationChain msgs = null;
      if (linkImage != null)
        msgs = ((InternalEObject)linkImage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VIDEO_EXPRESSION__LINK_IMAGE, null, msgs);
      if (newLinkImage != null)
        msgs = ((InternalEObject)newLinkImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VIDEO_EXPRESSION__LINK_IMAGE, null, msgs);
      msgs = basicSetLinkImage(newLinkImage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VIDEO_EXPRESSION__LINK_IMAGE, newLinkImage, newLinkImage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmphasisExpression getLinkVideo()
  {
    return linkVideo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinkVideo(EmphasisExpression newLinkVideo, NotificationChain msgs)
  {
    EmphasisExpression oldLinkVideo = linkVideo;
    linkVideo = newLinkVideo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VIDEO_EXPRESSION__LINK_VIDEO, oldLinkVideo, newLinkVideo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkVideo(EmphasisExpression newLinkVideo)
  {
    if (newLinkVideo != linkVideo)
    {
      NotificationChain msgs = null;
      if (linkVideo != null)
        msgs = ((InternalEObject)linkVideo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VIDEO_EXPRESSION__LINK_VIDEO, null, msgs);
      if (newLinkVideo != null)
        msgs = ((InternalEObject)newLinkVideo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VIDEO_EXPRESSION__LINK_VIDEO, null, msgs);
      msgs = basicSetLinkVideo(newLinkVideo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VIDEO_EXPRESSION__LINK_VIDEO, newLinkVideo, newLinkVideo));
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
      case MyDslPackage.VIDEO_EXPRESSION__ALT_TEXT:
        return basicSetAltText(null, msgs);
      case MyDslPackage.VIDEO_EXPRESSION__LINK_IMAGE:
        return basicSetLinkImage(null, msgs);
      case MyDslPackage.VIDEO_EXPRESSION__LINK_VIDEO:
        return basicSetLinkVideo(null, msgs);
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
      case MyDslPackage.VIDEO_EXPRESSION__ALT_TEXT:
        return getAltText();
      case MyDslPackage.VIDEO_EXPRESSION__LINK_IMAGE:
        return getLinkImage();
      case MyDslPackage.VIDEO_EXPRESSION__LINK_VIDEO:
        return getLinkVideo();
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
      case MyDslPackage.VIDEO_EXPRESSION__ALT_TEXT:
        setAltText((EmphasisExpression)newValue);
        return;
      case MyDslPackage.VIDEO_EXPRESSION__LINK_IMAGE:
        setLinkImage((EmphasisExpression)newValue);
        return;
      case MyDslPackage.VIDEO_EXPRESSION__LINK_VIDEO:
        setLinkVideo((EmphasisExpression)newValue);
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
      case MyDslPackage.VIDEO_EXPRESSION__ALT_TEXT:
        setAltText((EmphasisExpression)null);
        return;
      case MyDslPackage.VIDEO_EXPRESSION__LINK_IMAGE:
        setLinkImage((EmphasisExpression)null);
        return;
      case MyDslPackage.VIDEO_EXPRESSION__LINK_VIDEO:
        setLinkVideo((EmphasisExpression)null);
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
      case MyDslPackage.VIDEO_EXPRESSION__ALT_TEXT:
        return altText != null;
      case MyDslPackage.VIDEO_EXPRESSION__LINK_IMAGE:
        return linkImage != null;
      case MyDslPackage.VIDEO_EXPRESSION__LINK_VIDEO:
        return linkVideo != null;
    }
    return super.eIsSet(featureID);
  }

} //VideoExpressionImpl
