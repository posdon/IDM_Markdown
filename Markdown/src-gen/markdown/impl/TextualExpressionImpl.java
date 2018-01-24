/**
 */
package markdown.impl;

import markdown.MarkdownPackage;
import markdown.TextualExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markdown.impl.TextualExpressionImpl#getContentString <em>Content String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextualExpressionImpl extends EmphasisExpressionImpl implements TextualExpression {
	/**
	 * The default value of the '{@link #getContentString() <em>Content String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentString() <em>Content String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentString()
	 * @generated
	 * @ordered
	 */
	protected String contentString = CONTENT_STRING_EDEFAULT;

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
	public String getContentString() {
		return contentString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentString(String newContentString) {
		String oldContentString = contentString;
		contentString = newContentString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT_STRING,
					oldContentString, contentString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT_STRING:
			return getContentString();
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
		case MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT_STRING:
			setContentString((String) newValue);
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
		case MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT_STRING:
			setContentString(CONTENT_STRING_EDEFAULT);
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
		case MarkdownPackage.TEXTUAL_EXPRESSION__CONTENT_STRING:
			return CONTENT_STRING_EDEFAULT == null ? contentString != null
					: !CONTENT_STRING_EDEFAULT.equals(contentString);
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
		result.append(" (contentString: ");
		result.append(contentString);
		result.append(')');
		return result.toString();
	}

} //TextualExpressionImpl
