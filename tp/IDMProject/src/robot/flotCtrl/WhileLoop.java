/**
 */
package robot.flotCtrl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.flotCtrl.WhileLoop#getLoopCond <em>Loop Cond</em>}</li>
 *   <li>{@link robot.flotCtrl.WhileLoop#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see robot.flotCtrl.FlotCtrlPackage#getWhileLoop()
 * @model
 * @generated
 */
public interface WhileLoop extends Expression {
	/**
	 * Returns the value of the '<em><b>Loop Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Cond</em>' containment reference.
	 * @see #setLoopCond(BoolExp)
	 * @see robot.flotCtrl.FlotCtrlPackage#getWhileLoop_LoopCond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExp getLoopCond();

	/**
	 * Sets the value of the '{@link robot.flotCtrl.WhileLoop#getLoopCond <em>Loop Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Cond</em>' containment reference.
	 * @see #getLoopCond()
	 * @generated
	 */
	void setLoopCond(BoolExp value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link robot.flotCtrl.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see robot.flotCtrl.FlotCtrlPackage#getWhileLoop_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getBlock();

} // WhileLoop
