/**
 */
package markdown.impl;

import markdown.EmphasisExpression;
import markdown.MarkdownPackage;
import markdown.TextualExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markdown.impl.TextualExpressionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link markdown.impl.TextualExpressionImpl#getFollowingExpression <em>Following Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextualExpressionImpl extends EmphasisExpressionImpl implements TextualExpression {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFollowingExpression() <em>Following Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingExpression()
	 * @generated
	 * @ordered
	 */
	protected EmphasisExpression followingExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.TEXTUAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT,
					oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmphasisExpression getFollowingExpression() {
		if (followingExpression != null && followingExpression.eIsProxy()) {
			InternalEObject oldFollowingExpression = (InternalEObject) followingExpression;
			followingExpression = (EmphasisExpression) eResolveProxy(oldFollowingExpression);
			if (followingExpression != oldFollowingExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MarkdownPackage.TEXTUAL_EXPRESSION__FOLLOWING_EXPRESSION, oldFollowingExpression,
							followingExpression));
			}
		}
		return followingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmphasisExpression basicGetFollowingExpression() {
		return followingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowingExpression(EmphasisExpression newFollowingExpression) {
		EmphasisExpression oldFollowingExpression = followingExpression;
		followingExpression = newFollowingExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MarkdownPackage.TEXTUAL_EXPRESSION__FOLLOWING_EXPRESSION, oldFollowingExpression,
					followingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT:
			return getContent();
		case MarkdownPackage.TEXTUAL_EXPRESSION__FOLLOWING_EXPRESSION:
			if (resolve)
				return getFollowingExpression();
			return basicGetFollowingExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT:
			setContent((String) newValue);
			return;
		case MarkdownPackage.TEXTUAL_EXPRESSION__FOLLOWING_EXPRESSION:
			setFollowingExpression((EmphasisExpression) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case MarkdownPackage.TEXTUAL_EXPRESSION__FOLLOWING_EXPRESSION:
			setFollowingExpression((EmphasisExpression) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case MarkdownPackage.TEXTUAL_EXPRESSION__FOLLOWING_EXPRESSION:
			return followingExpression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //TextualExpressionImpl
