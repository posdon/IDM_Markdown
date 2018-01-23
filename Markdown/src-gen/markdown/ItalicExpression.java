/**
 */
package markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Italic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.ItalicExpression#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getItalicExpression()
 * @model
 * @generated
 */
public interface ItalicExpression extends EmphasisExpression {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference list.
	 * The list contents are of type {@link markdown.EmphasisExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference list.
	 * @see markdown.MarkdownPackage#getItalicExpression_Content()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<EmphasisExpression> getContent();

} // ItalicExpression
