/**
 */
package robot.cflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.cflow.ConditionalExp#getThen <em>Then</em>}</li>
 *   <li>{@link robot.cflow.ConditionalExp#getElse <em>Else</em>}</li>
 *   <li>{@link robot.cflow.ConditionalExp#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see robot.cflow.CflowPackage#getConditionalExp()
 * @model
 * @generated
 */
public interface ConditionalExp extends Expression {
	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference list.
	 * The list contents are of type {@link robot.cflow.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference list.
	 * @see robot.cflow.CflowPackage#getConditionalExp_Then()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getThen();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link robot.cflow.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see robot.cflow.CflowPackage#getConditionalExp_Else()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getElse();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BooleanExp)
	 * @see robot.cflow.CflowPackage#getConditionalExp_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExp getCondition();

	/**
	 * Sets the value of the '{@link robot.cflow.ConditionalExp#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BooleanExp value);

} // ConditionalExp
