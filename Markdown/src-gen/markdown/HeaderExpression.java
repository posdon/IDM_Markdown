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
 *   <li>{@link markdown.HeaderExpression#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getHeaderExpression()
 * @model abstract="true"
 * @generated
 */
public interface HeaderExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(EmphasisExpression)
	 * @see markdown.MarkdownPackage#getHeaderExpression_Title()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EmphasisExpression getTitle();

	/**
	 * Sets the value of the '{@link markdown.HeaderExpression#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(EmphasisExpression value);

} // HeaderExpression
