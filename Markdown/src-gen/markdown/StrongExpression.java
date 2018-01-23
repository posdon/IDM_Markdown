/**
 */
package markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strong Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.StrongExpression#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getStrongExpression()
 * @model
 * @generated
 */
public interface StrongExpression extends EmphasisExpression {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link markdown.EmphasisExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see markdown.MarkdownPackage#getStrongExpression_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EmphasisExpression> getContent();

} // StrongExpression
