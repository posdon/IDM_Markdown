/**
 */
package markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.ListExpression#getStartingValue <em>Starting Value</em>}</li>
 *   <li>{@link markdown.ListExpression#getListContent <em>List Content</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getListExpression()
 * @model
 * @generated
 */
public interface ListExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Starting Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Value</em>' attribute.
	 * @see #setStartingValue(Integer)
	 * @see markdown.MarkdownPackage#getListExpression_StartingValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject" required="true"
	 * @generated
	 */
	Integer getStartingValue();

	/**
	 * Sets the value of the '{@link markdown.ListExpression#getStartingValue <em>Starting Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Value</em>' attribute.
	 * @see #getStartingValue()
	 * @generated
	 */
	void setStartingValue(Integer value);

	/**
	 * Returns the value of the '<em><b>List Content</b></em>' containment reference list.
	 * The list contents are of type {@link markdown.TextExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Content</em>' containment reference list.
	 * @see markdown.MarkdownPackage#getListExpression_ListContent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TextExpression> getListContent();

} // ListExpression
