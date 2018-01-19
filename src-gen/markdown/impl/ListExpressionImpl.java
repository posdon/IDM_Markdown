/**
 */
package markdown.impl;

import java.util.Collection;

import markdown.ListExpression;
import markdown.MarkdownPackage;
import markdown.TextExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markdown.impl.ListExpressionImpl#getStartingValue <em>Starting Value</em>}</li>
 *   <li>{@link markdown.impl.ListExpressionImpl#getListContent <em>List Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListExpressionImpl extends ExpressionImpl implements ListExpression {
	/**
	 * The default value of the '{@link #getStartingValue() <em>Starting Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STARTING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingValue() <em>Starting Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingValue()
	 * @generated
	 * @ordered
	 */
	protected Integer startingValue = STARTING_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListContent() <em>List Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListContent()
	 * @generated
	 * @ordered
	 */
	protected EList<TextExpression> listContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.LIST_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartingValue() {
		return startingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingValue(Integer newStartingValue) {
		Integer oldStartingValue = startingValue;
		startingValue = newStartingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.LIST_EXPRESSION__STARTING_VALUE,
					oldStartingValue, startingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextExpression> getListContent() {
		if (listContent == null) {
			listContent = new EObjectContainmentEList<TextExpression>(TextExpression.class, this,
					MarkdownPackage.LIST_EXPRESSION__LIST_CONTENT);
		}
		return listContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MarkdownPackage.LIST_EXPRESSION__LIST_CONTENT:
			return ((InternalEList<?>) getListContent()).basicRemove(otherEnd, msgs);
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
		case MarkdownPackage.LIST_EXPRESSION__STARTING_VALUE:
			return getStartingValue();
		case MarkdownPackage.LIST_EXPRESSION__LIST_CONTENT:
			return getListContent();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MarkdownPackage.LIST_EXPRESSION__STARTING_VALUE:
			setStartingValue((Integer) newValue);
			return;
		case MarkdownPackage.LIST_EXPRESSION__LIST_CONTENT:
			getListContent().clear();
			getListContent().addAll((Collection<? extends TextExpression>) newValue);
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
		case MarkdownPackage.LIST_EXPRESSION__STARTING_VALUE:
			setStartingValue(STARTING_VALUE_EDEFAULT);
			return;
		case MarkdownPackage.LIST_EXPRESSION__LIST_CONTENT:
			getListContent().clear();
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
		case MarkdownPackage.LIST_EXPRESSION__STARTING_VALUE:
			return STARTING_VALUE_EDEFAULT == null ? startingValue != null
					: !STARTING_VALUE_EDEFAULT.equals(startingValue);
		case MarkdownPackage.LIST_EXPRESSION__LIST_CONTENT:
			return listContent != null && !listContent.isEmpty();
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
		result.append(" (startingValue: ");
		result.append(startingValue);
		result.append(')');
		return result.toString();
	}

} //ListExpressionImpl
