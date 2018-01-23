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
 *   <li>{@link markdown.TableLine#getNbColumn <em>Nb Column</em>}</li>
 *   <li>{@link markdown.TableLine#getCellContent <em>Cell Content</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getTableLine()
 * @model
 * @generated
 */
public interface TableLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Column</em>' attribute.
	 * @see #setNbColumn(Integer)
	 * @see markdown.MarkdownPackage#getTableLine_NbColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject" required="true"
	 * @generated
	 */
	Integer getNbColumn();

	/**
	 * Sets the value of the '{@link markdown.TableLine#getNbColumn <em>Nb Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Column</em>' attribute.
	 * @see #getNbColumn()
	 * @generated
	 */
	void setNbColumn(Integer value);

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
