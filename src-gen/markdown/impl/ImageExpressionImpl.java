/**
 */
package markdown.impl;

import markdown.ImageExpression;
import markdown.MarkdownPackage;
import markdown.TextBloc;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link markdown.impl.ImageExpressionImpl#getTextbloc <em>Textbloc</em>}</li>
 *   <li>{@link markdown.impl.ImageExpressionImpl#getTextURL <em>Text URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageExpressionImpl extends ExpressionImpl implements ImageExpression {
	/**
	 * The cached value of the '{@link #getTextbloc() <em>Textbloc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextbloc()
	 * @generated
	 * @ordered
	 */
	protected TextBloc textbloc;

	/**
	 * The default value of the '{@link #getTextURL() <em>Text URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextURL()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextURL() <em>Text URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextURL()
	 * @generated
	 * @ordered
	 */
	protected String textURL = TEXT_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.IMAGE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBloc getTextbloc() {
		if (textbloc != null && textbloc.eIsProxy()) {
			InternalEObject oldTextbloc = (InternalEObject) textbloc;
			textbloc = (TextBloc) eResolveProxy(oldTextbloc);
			if (textbloc != oldTextbloc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MarkdownPackage.IMAGE_EXPRESSION__TEXTBLOC, oldTextbloc, textbloc));
			}
		}
		return textbloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBloc basicGetTextbloc() {
		return textbloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextbloc(TextBloc newTextbloc) {
		TextBloc oldTextbloc = textbloc;
		textbloc = newTextbloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.IMAGE_EXPRESSION__TEXTBLOC,
					oldTextbloc, textbloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextURL() {
		return textURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextURL(String newTextURL) {
		String oldTextURL = textURL;
		textURL = newTextURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.IMAGE_EXPRESSION__TEXT_URL,
					oldTextURL, textURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarkdownPackage.IMAGE_EXPRESSION__TEXTBLOC:
			if (resolve)
				return getTextbloc();
			return basicGetTextbloc();
		case MarkdownPackage.IMAGE_EXPRESSION__TEXT_URL:
			return getTextURL();
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
		case MarkdownPackage.IMAGE_EXPRESSION__TEXTBLOC:
			setTextbloc((TextBloc) newValue);
			return;
		case MarkdownPackage.IMAGE_EXPRESSION__TEXT_URL:
			setTextURL((String) newValue);
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
		case MarkdownPackage.IMAGE_EXPRESSION__TEXTBLOC:
			setTextbloc((TextBloc) null);
			return;
		case MarkdownPackage.IMAGE_EXPRESSION__TEXT_URL:
			setTextURL(TEXT_URL_EDEFAULT);
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
		case MarkdownPackage.IMAGE_EXPRESSION__TEXTBLOC:
			return textbloc != null;
		case MarkdownPackage.IMAGE_EXPRESSION__TEXT_URL:
			return TEXT_URL_EDEFAULT == null ? textURL != null : !TEXT_URL_EDEFAULT.equals(textURL);
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
		result.append(" (textURL: ");
		result.append(textURL);
		result.append(')');
		return result.toString();
	}

} //ImageExpressionImpl
