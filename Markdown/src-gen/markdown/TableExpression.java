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
 *   <li>{@link markdown.TableExpression#getNbColumn <em>Nb Column</em>}</li>
 *   <li>{@link markdown.TableExpression#getTablelines <em>Tablelines</em>}</li>
 * </ul>
 *
 * @see markdown.MarkdownPackage#getTableExpression()
 * @model
 * @generated
 */
public interface TableExpression extends Expression {
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
	 * @see markdown.MarkdownPackage#getTableExpression_NbColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject" required="true"
	 * @generated
	 */
	Integer getNbColumn();

	/**
	 * Sets the value of the '{@link markdown.TableExpression#getNbColumn <em>Nb Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Column</em>' attribute.
	 * @see #getNbColumn()
	 * @generated
	 */
	void setNbColumn(Integer value);

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
