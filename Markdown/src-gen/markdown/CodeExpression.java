/**
 */
package markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.CodeExpression#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getCodeExpression()
 * @model
 * @generated
 */
public interface CodeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see markdown.MarkdownPackage#getCodeExpression_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link markdown.CodeExpression#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // CodeExpression
