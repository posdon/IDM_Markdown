/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link markHammil.mm.myDsl.File#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see markHammil.mm.myDsl.MyDslPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link markHammil.mm.myDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see markHammil.mm.myDsl.MyDslPackage#getFile_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

} // File