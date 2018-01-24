/**
 */
package markdown.impl;

import java.util.Collection;

import markdown.MarkdownPackage;
import markdown.TableExpression;
import markdown.TableLine;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markdown.impl.TableExpressionImpl#getTablelines <em>Tablelines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableExpressionImpl extends ExpressionImpl implements TableExpression {
	/**
	 * The cached value of the '{@link #getTablelines() <em>Tablelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablelines()
	 * @generated
	 * @ordered
	 */
	protected EList<TableLine> tablelines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.TABLE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableLine> getTablelines() {
		if (tablelines == null) {
			tablelines = new EObjectContainmentEList<TableLine>(TableLine.class, this,
					MarkdownPackage.TABLE_EXPRESSION__TABLELINES);
		}
		return tablelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MarkdownPackage.TABLE_EXPRESSION__TABLELINES:
			return ((InternalEList<?>) getTablelines()).basicRemove(otherEnd, msgs);
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
		case MarkdownPackage.TABLE_EXPRESSION__TABLELINES:
			return getTablelines();
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
		case MarkdownPackage.TABLE_EXPRESSION__TABLELINES:
			getTablelines().clear();
			getTablelines().addAll((Collection<? extends TableLine>) newValue);
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
		case MarkdownPackage.TABLE_EXPRESSION__TABLELINES:
			getTablelines().clear();
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
		case MarkdownPackage.TABLE_EXPRESSION__TABLELINES:
			return tablelines != null && !tablelines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableExpressionImpl
