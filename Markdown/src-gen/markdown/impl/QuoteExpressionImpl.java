/**
 */
package markdown.impl;

import markdown.MarkdownPackage;
import markdown.QuoteExpression;
import markdown.TextExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quote Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markdown.impl.QuoteExpressionImpl#getTextexpression <em>Textexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuoteExpressionImpl extends TextExpressionImpl implements QuoteExpression {
	/**
	 * The cached value of the '{@link #getTextexpression() <em>Textexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextexpression()
	 * @generated
	 * @ordered
	 */
	protected TextExpression textexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuoteExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.QUOTE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextExpression getTextexpression() {
		return textexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextexpression(TextExpression newTextexpression, NotificationChain msgs) {
		TextExpression oldTextexpression = textexpression;
		textexpression = newTextexpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MarkdownPackage.QUOTE_EXPRESSION__TEXTEXPRESSION, oldTextexpression, newTextexpression);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextexpression(TextExpression newTextexpression) {
		if (newTextexpression != textexpression) {
			NotificationChain msgs = null;
			if (textexpression != null)
				msgs = ((InternalEObject) textexpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MarkdownPackage.QUOTE_EXPRESSION__TEXTEXPRESSION, null, msgs);
			if (newTextexpression != null)
				msgs = ((InternalEObject) newTextexpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MarkdownPackage.QUOTE_EXPRESSION__TEXTEXPRESSION, null, msgs);
			msgs = basicSetTextexpression(newTextexpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.QUOTE_EXPRESSION__TEXTEXPRESSION,
					newTextexpression, newTextexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MarkdownPackage.QUOTE_EXPRESSION__TEXTEXPRESSION:
			return basicSetTextexpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarkdownPackage.QUOTE_EXPRESSION__TEXTEXPRESSION:
			return getTextexpression();
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
		case MarkdownPackage.QUOTE_EXPRESSION__TEXTEXPRESSION:
			setTextexpression((TextExpression) newValue);
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
		case MarkdownPackage.QUOTE_EXPRESSION__TEXTEXPRESSION:
			setTextexpression((TextExpression) null);
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
		case MarkdownPackage.QUOTE_EXPRESSION__TEXTEXPRESSION:
			return textexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //QuoteExpressionImpl
