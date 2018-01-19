/**
 */
package markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.QuoteExpression#getTextexpression <em>Textexpression</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getQuoteExpression()
 * @model
 * @generated
 */
public interface QuoteExpression extends TextExpression {
	/**
	 * Returns the value of the '<em><b>Textexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textexpression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textexpression</em>' containment reference.
	 * @see #setTextexpression(TextExpression)
	 * @see markdown.MarkdownPackage#getQuoteExpression_Textexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextExpression getTextexpression();

	/**
	 * Sets the value of the '{@link markdown.QuoteExpression#getTextexpression <em>Textexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textexpression</em>' containment reference.
	 * @see #getTextexpression()
	 * @generated
	 */
	void setTextexpression(TextExpression value);

} // QuoteExpression
