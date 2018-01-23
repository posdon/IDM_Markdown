/**
 */
package markdown;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markdown.TableLine#getCellContent <em>Cell Content</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getTableLine()
 * @model
 * @generated
 */
public interface TableLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Content</b></em>' containment reference list.
	 * The list contents are of type {@link markdown.TextExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Content</em>' containment reference list.
	 * @see markdown.MarkdownPackage#getTableLine_CellContent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TextExpression> getCellContent();

} // TableLine
