/**
 */
package markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.ImageExpression#getTextbloc <em>Textbloc</em>}</li>
 *   <li>{@link markdown.ImageExpression#getTextURL <em>Text URL</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getImageExpression()
 * @model
 * @generated
 */
public interface ImageExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Textbloc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textbloc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textbloc</em>' reference.
	 * @see #setTextbloc(TextBloc)
	 * @see markdown.MarkdownPackage#getImageExpression_Textbloc()
	 * @model required="true"
	 * @generated
	 */
	TextBloc getTextbloc();

	/**
	 * Sets the value of the '{@link markdown.ImageExpression#getTextbloc <em>Textbloc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textbloc</em>' reference.
	 * @see #getTextbloc()
	 * @generated
	 */
	void setTextbloc(TextBloc value);

	/**
	 * Returns the value of the '<em><b>Text URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text URL</em>' attribute.
	 * @see #setTextURL(String)
	 * @see markdown.MarkdownPackage#getImageExpression_TextURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTextURL();

	/**
	 * Sets the value of the '{@link markdown.ImageExpression#getTextURL <em>Text URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text URL</em>' attribute.
	 * @see #getTextURL()
	 * @generated
	 */
	void setTextURL(String value);

} // ImageExpression
