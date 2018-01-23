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
 *   <li>{@link markdown.VideoExpression#getTextBloc <em>Text Bloc</em>}</li>
 *   <li>{@link markdown.VideoExpression#getIsReferenced <em>Is Referenced</em>}</li>
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
	 * Returns the value of the '<em><b>Text Bloc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Bloc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Bloc</em>' reference.
	 * @see #setTextBloc(EmphasisExpression)
	 * @see markdown.MarkdownPackage#getVideoExpression_TextBloc()
	 * @model required="true"
	 * @generated
	 */
	EmphasisExpression getTextBloc();

	/**
	 * Sets the value of the '{@link markdown.VideoExpression#getTextBloc <em>Text Bloc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Bloc</em>' reference.
	 * @see #getTextBloc()
	 * @generated
	 */
	void setTextBloc(EmphasisExpression value);

	/**
	 * Returns the value of the '<em><b>Is Referenced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Referenced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Referenced</em>' attribute.
	 * @see #setIsReferenced(Boolean)
	 * @see markdown.MarkdownPackage#getVideoExpression_IsReferenced()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" required="true"
	 * @generated
	 */
	Boolean getIsReferenced();

	/**
	 * Sets the value of the '{@link markdown.VideoExpression#getIsReferenced <em>Is Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Referenced</em>' attribute.
	 * @see #getIsReferenced()
	 * @generated
	 */
	void setIsReferenced(Boolean value);

} // VideoExpression
