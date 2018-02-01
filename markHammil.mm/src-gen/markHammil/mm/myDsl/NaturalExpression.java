/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natural Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markHammil.mm.myDsl.NaturalExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see markHammil.mm.myDsl.MyDslPackage#getNaturalExpression()
 * @model
 * @generated
 */
public interface NaturalExpression extends EmphasisExpression
{
  /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see markHammil.mm.myDsl.MyDslPackage#getNaturalExpression_Value()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getValue();

} // NaturalExpression