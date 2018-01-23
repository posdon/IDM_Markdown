/**
 */
package markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.HeaderExpression#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getHeaderExpression()
 * @model abstract="true"
 * @generated
 */
public interface HeaderExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(EmphasisExpression)
	 * @see markdown.MarkdownPackage#getHeaderExpression_Content()
	 * @model required="true"
	 * @generated
	 */
	EmphasisExpression getContent();

	/**
	 * Sets the value of the '{@link markdown.HeaderExpression#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(EmphasisExpression value);

} // HeaderExpression
