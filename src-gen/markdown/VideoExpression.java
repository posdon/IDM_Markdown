/**
 */
package markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.VideoExpression#getTextURL <em>Text URL</em>}</li>
 *   <li>{@link markdown.VideoExpression#getTextIMG <em>Text IMG</em>}</li>
 *   <li>{@link markdown.VideoExpression#getTextbloc <em>Textbloc</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getVideoExpression()
 * @model
 * @generated
 */
public interface VideoExpression extends Expression {
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
	 * @see markdown.MarkdownPackage#getVideoExpression_TextURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTextURL();

	/**
	 * Sets the value of the '{@link markdown.VideoExpression#getTextURL <em>Text URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text URL</em>' attribute.
	 * @see #getTextURL()
	 * @generated
	 */
	void setTextURL(String value);

	/**
	 * Returns the value of the '<em><b>Text IMG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text IMG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text IMG</em>' attribute.
	 * @see #setTextIMG(String)
	 * @see markdown.MarkdownPackage#getVideoExpression_TextIMG()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTextIMG();

	/**
	 * Sets the value of the '{@link markdown.VideoExpression#getTextIMG <em>Text IMG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text IMG</em>' attribute.
	 * @see #getTextIMG()
	 * @generated
	 */
	void setTextIMG(String value);

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
	 * @see markdown.MarkdownPackage#getVideoExpression_Textbloc()
	 * @model required="true"
	 * @generated
	 */
	TextBloc getTextbloc();

	/**
	 * Sets the value of the '{@link markdown.VideoExpression#getTextbloc <em>Textbloc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textbloc</em>' reference.
	 * @see #getTextbloc()
	 * @generated
	 */
	void setTextbloc(TextBloc value);

} // VideoExpression
