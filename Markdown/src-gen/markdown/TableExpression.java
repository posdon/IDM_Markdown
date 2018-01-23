/**
 */
package markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.TableExpression#getTablelines <em>Tablelines</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getTableExpression()
 * @model
 * @generated
 */
public interface TableExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Tablelines</b></em>' containment reference list.
	 * The list contents are of type {@link markdown.TableLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablelines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablelines</em>' containment reference list.
	 * @see markdown.MarkdownPackage#getTableExpression_Tablelines()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TableLine> getTablelines();

} // TableExpression
