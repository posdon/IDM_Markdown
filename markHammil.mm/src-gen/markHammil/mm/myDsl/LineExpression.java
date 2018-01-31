/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markHammil.mm.myDsl.LineExpression#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see markHammil.mm.myDsl.MyDslPackage#getLineExpression()
 * @model
 * @generated
 */
public interface LineExpression extends EObject
{
  /**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link markHammil.mm.myDsl.EmphasisExpression}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see markHammil.mm.myDsl.MyDslPackage#getLineExpression_Cells()
	 * @model containment="true"
	 * @generated
	 */
  EList<EmphasisExpression> getCells();

} // LineExpression
