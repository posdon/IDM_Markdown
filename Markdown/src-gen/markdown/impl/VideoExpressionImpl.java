/**
 */
package markdown.impl;

import markdown.EmphasisExpression;
import markdown.MarkdownPackage;
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
 *   <li>{@link markdown.impl.VideoExpressionImpl#getTextBloc <em>Text Bloc</em>}</li>
 *   <li>{@link markdown.impl.VideoExpressionImpl#getIsReferenced <em>Is Referenced</em>}</li>
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
	 * The cached value of the '{@link #getTextBloc() <em>Text Bloc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBloc()
	 * @generated
	 * @ordered
	 */
	protected EmphasisExpression textBloc;

	/**
	 * The default value of the '{@link #getIsReferenced() <em>Is Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReferenced()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_REFERENCED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReferenced() <em>Is Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReferenced()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReferenced = IS_REFERENCED_EDEFAULT;

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
	public EmphasisExpression getTextBloc() {
		if (textBloc != null && textBloc.eIsProxy()) {
			InternalEObject oldTextBloc = (InternalEObject) textBloc;
			textBloc = (EmphasisExpression) eResolveProxy(oldTextBloc);
			if (textBloc != oldTextBloc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MarkdownPackage.VIDEO_EXPRESSION__TEXT_BLOC, oldTextBloc, textBloc));
			}
		}
		return textBloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmphasisExpression basicGetTextBloc() {
		return textBloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextBloc(EmphasisExpression newTextBloc) {
		EmphasisExpression oldTextBloc = textBloc;
		textBloc = newTextBloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.VIDEO_EXPRESSION__TEXT_BLOC,
					oldTextBloc, textBloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReferenced() {
		return isReferenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReferenced(Boolean newIsReferenced) {
		Boolean oldIsReferenced = isReferenced;
		isReferenced = newIsReferenced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.VIDEO_EXPRESSION__IS_REFERENCED,
					oldIsReferenced, isReferenced));
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
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_BLOC:
			if (resolve)
				return getTextBloc();
			return basicGetTextBloc();
		case MarkdownPackage.VIDEO_EXPRESSION__IS_REFERENCED:
			return getIsReferenced();
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
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_BLOC:
			setTextBloc((EmphasisExpression) newValue);
			return;
		case MarkdownPackage.VIDEO_EXPRESSION__IS_REFERENCED:
			setIsReferenced((Boolean) newValue);
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
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_BLOC:
			setTextBloc((EmphasisExpression) null);
			return;
		case MarkdownPackage.VIDEO_EXPRESSION__IS_REFERENCED:
			setIsReferenced(IS_REFERENCED_EDEFAULT);
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
		case MarkdownPackage.VIDEO_EXPRESSION__TEXT_BLOC:
			return textBloc != null;
		case MarkdownPackage.VIDEO_EXPRESSION__IS_REFERENCED:
			return IS_REFERENCED_EDEFAULT == null ? isReferenced != null : !IS_REFERENCED_EDEFAULT.equals(isReferenced);
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
		result.append(", isReferenced: ");
		result.append(isReferenced);
		result.append(')');
		return result.toString();
	}

} //VideoExpressionImpl
