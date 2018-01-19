/**
 */
package markdown.impl;

import markdown.MarkdownPackage;
import markdown.TextBloc;
import markdown.VideoExpression;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link markdown.impl.VideoExpressionImpl#getTextURL <em>Text URL</em>}</li>
 *   <li>{@link markdown.impl.VideoExpressionImpl#getTextIMG <em>Text IMG</em>}</li>
 *   <li>{@link markdown.impl.VideoExpressionImpl#getTextbloc <em>Textbloc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoExpressionImpl extends ExpressionImpl implements VideoExpression {
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
	 * The default value of the '{@link #getTextIMG() <em>Text IMG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIMG()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_IMG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextIMG() <em>Text IMG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIMG()
	 * @generated
	 * @ordered
	 */
	protected String textIMG = TEXT_IMG_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.VIDEO_EXPRESSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.VIDEO_EXPRESSION__TEXT_URL,
					oldTextURL, textURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextIMG() {
		return textIMG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextIMG(String newTextIMG) {
		String oldTextIMG = textIMG;
		textIMG = newTextIMG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.VIDEO_EXPRESSION__TEXT_IMG,
					oldTextIMG, textIMG));
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
							MarkdownPackage.VIDEO_EXPRESSION__TEXTBLOC, oldTextbloc, textbloc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.VIDEO_EXPRESSION__TEXTBLOC,
					oldTextbloc, textbloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_URL:
			return getTextURL();
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_IMG:
			return getTextIMG();
		case MarkdownPackage.VIDEO_EXPRESSION__TEXTBLOC:
			if (resolve)
				return getTextbloc();
			return basicGetTextbloc();
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
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_URL:
			setTextURL((String) newValue);
			return;
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_IMG:
			setTextIMG((String) newValue);
			return;
		case MarkdownPackage.VIDEO_EXPRESSION__TEXTBLOC:
			setTextbloc((TextBloc) newValue);
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
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_URL:
			setTextURL(TEXT_URL_EDEFAULT);
			return;
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_IMG:
			setTextIMG(TEXT_IMG_EDEFAULT);
			return;
		case MarkdownPackage.VIDEO_EXPRESSION__TEXTBLOC:
			setTextbloc((TextBloc) null);
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
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_URL:
			return TEXT_URL_EDEFAULT == null ? textURL != null : !TEXT_URL_EDEFAULT.equals(textURL);
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_IMG:
			return TEXT_IMG_EDEFAULT == null ? textIMG != null : !TEXT_IMG_EDEFAULT.equals(textIMG);
		case MarkdownPackage.VIDEO_EXPRESSION__TEXTBLOC:
			return textbloc != null;
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
		result.append(", textIMG: ");
		result.append(textIMG);
		result.append(')');
		return result.toString();
	}

} //VideoExpressionImpl
