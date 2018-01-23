/**
 */
package markdown.impl;

import markdown.EmphasisExpression;
import markdown.MarkdownPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emphasis Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EmphasisExpressionImpl extends TextExpressionImpl implements EmphasisExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmphasisExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.EMPHASIS_EXPRESSION;
	}

} //EmphasisExpressionImpl
