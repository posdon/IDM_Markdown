/**
 */
package markdown.impl;

import java.util.Collection;

import markdown.EmphasisExpression;
import markdown.MarkdownPackage;
import markdown.ScratchExpression;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scratch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markdown.impl.ScratchExpressionImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScratchExpressionImpl extends EmphasisExpressionImpl implements ScratchExpression {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<EmphasisExpression> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScratchExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.SCRATCH_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmphasisExpression> getContent() {
		if (content == null) {
			content = new EObjectResolvingEList<EmphasisExpression>(EmphasisExpression.class, this,
					MarkdownPackage.SCRATCH_EXPRESSION__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarkdownPackage.SCRATCH_EXPRESSION__CONTENT:
			return getContent();
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
		case MarkdownPackage.SCRATCH_EXPRESSION__CONTENT:
			getContent().clear();
			getContent().addAll((Collection<? extends EmphasisExpression>) newValue);
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
		case MarkdownPackage.SCRATCH_EXPRESSION__CONTENT:
			getContent().clear();
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
		case MarkdownPackage.SCRATCH_EXPRESSION__CONTENT:
			return content != null && !content.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScratchExpressionImpl
