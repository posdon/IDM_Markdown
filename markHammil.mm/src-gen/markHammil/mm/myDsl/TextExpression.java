/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markHammil.mm.myDsl.TextExpression#getC <em>C</em>}</li>
 *   <li>{@link markHammil.mm.myDsl.TextExpression#getContentUnordered <em>Content Unordered</em>}</li>
 *   <li>{@link markHammil.mm.myDsl.TextExpression#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see markHammil.mm.myDsl.MyDslPackage#getTextExpression()
 * @model
 * @generated
 */
public interface TextExpression extends ListExpression, QuoteExpression
{
  /**
	 * Returns the value of the '<em><b>C</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' containment reference list.
	 * @see markHammil.mm.myDsl.MyDslPackage#getTextExpression_C()
	 * @model containment="true"
	 * @generated
	 */
  EList<EObject> getC();

  /**
	 * Returns the value of the '<em><b>Content Unordered</b></em>' containment reference list.
	 * The list contents are of type {@link markHammil.mm.myDsl.TextExpression}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content Unordered</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Unordered</em>' containment reference list.
	 * @see markHammil.mm.myDsl.MyDslPackage#getTextExpression_ContentUnordered()
	 * @model containment="true"
	 * @generated
	 */
  EList<TextExpression> getContentUnordered();

  /**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link markHammil.mm.myDsl.TextExpression}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see markHammil.mm.myDsl.MyDslPackage#getTextExpression_Content()
	 * @model containment="true"
	 * @generated
	 */
  EList<TextExpression> getContent();

} // TextExpression
