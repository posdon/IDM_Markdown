/**
 */
package markdown.impl;

import java.util.Collection;

import markdown.MarkdownPackage;
import markdown.TableLine;
import markdown.TextExpression;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markdown.impl.TableLineImpl#getCellContent <em>Cell Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableLineImpl extends MinimalEObjectImpl.Container implements TableLine {
	/**
	 * The cached value of the '{@link #getCellContent() <em>Cell Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellContent()
	 * @generated
	 * @ordered
	 */
	protected EList<TextExpression> cellContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.TABLE_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextExpression> getCellContent() {
		if (cellContent == null) {
			cellContent = new EObjectContainmentEList<TextExpression>(TextExpression.class, this,
					MarkdownPackage.TABLE_LINE__CELL_CONTENT);
		}
		return cellContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MarkdownPackage.TABLE_LINE__CELL_CONTENT:
			return ((InternalEList<?>) getCellContent()).basicRemove(otherEnd, msgs);
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
		case MarkdownPackage.TABLE_LINE__CELL_CONTENT:
			return getCellContent();
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
		case MarkdownPackage.TABLE_LINE__CELL_CONTENT:
			getCellContent().clear();
			getCellContent().addAll((Collection<? extends TextExpression>) newValue);
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
		case MarkdownPackage.TABLE_LINE__CELL_CONTENT:
			getCellContent().clear();
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
		case MarkdownPackage.TABLE_LINE__CELL_CONTENT:
			return cellContent != null && !cellContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableLineImpl
