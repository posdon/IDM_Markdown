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
 *   <li>{@link markdown.TextualExpression#getContent <em>Content</em>}</li>
 *   <li>{@link markdown.TextualExpression#getFollowingExpression <em>Following Expression</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getTextualExpression()
 * @model
 * @generated
 */
public interface TextualExpression extends EmphasisExpression {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see markdown.MarkdownPackage#getTextualExpression_Content()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link markdown.TextualExpression#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Following Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Following Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following Expression</em>' reference.
	 * @see #setFollowingExpression(EmphasisExpression)
	 * @see markdown.MarkdownPackage#getTextualExpression_FollowingExpression()
	 * @model
	 * @generated
	 */
	EmphasisExpression getFollowingExpression();

	/**
	 * Sets the value of the '{@link markdown.TextualExpression#getFollowingExpression <em>Following Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Following Expression</em>' reference.
	 * @see #getFollowingExpression()
	 * @generated
	 */
	void setFollowingExpression(EmphasisExpression value);

} // TextualExpression
