/**
 */
package markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.TextualExpression#getContentString <em>Content String</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getTextualExpression()
 * @model
 * @generated
 */
public interface TextualExpression extends EmphasisExpression {
	/**
	 * Returns the value of the '<em><b>Content String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content String</em>' attribute.
	 * @see #setContentString(String)
	 * @see markdown.MarkdownPackage#getTextualExpression_ContentString()
	 * @model required="true"
	 * @generated
	 */
	String getContentString();

	/**
	 * Sets the value of the '{@link markdown.TextualExpression#getContentString <em>Content String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content String</em>' attribute.
	 * @see #getContentString()
	 * @generated
	 */
	void setContentString(String value);

} // TextualExpression
