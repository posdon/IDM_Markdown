/**
 */
package markdown.impl;

import markdown.MarkdownPackage;
import markdown.TextExpression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TextExpressionImpl extends ExpressionImpl implements TextExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkdownPackage.Literals.TEXT_EXPRESSION;
	}

} //TextExpressionImpl
