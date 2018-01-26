/**
 */
package robot.flotCtrl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.flotCtrl.IfBlock#getCondition <em>Condition</em>}</li>
 *   <li>{@link robot.flotCtrl.IfBlock#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link robot.flotCtrl.IfBlock#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see robot.flotCtrl.FlotCtrlPackage#getIfBlock()
 * @model
 * @generated
 */
public interface IfBlock extends Expression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BoolExp)
	 * @see robot.flotCtrl.FlotCtrlPackage#getIfBlock_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExp getCondition();

	/**
	 * Sets the value of the '{@link robot.flotCtrl.IfBlock#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BoolExp value);

	/**
	 * Returns the value of the '<em><b>Then Block</b></em>' containment reference list.
	 * The list contents are of type {@link robot.flotCtrl.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Block</em>' containment reference list.
	 * @see robot.flotCtrl.FlotCtrlPackage#getIfBlock_ThenBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getThenBlock();

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference list.
	 * The list contents are of type {@link robot.flotCtrl.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference list.
	 * @see robot.flotCtrl.FlotCtrlPackage#getIfBlock_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getElseBlock();

} // IfBlock
