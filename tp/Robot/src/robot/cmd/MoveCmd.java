/**
 */
package robot.cmd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.cmd.MoveCmd#getPower <em>Power</em>}</li>
 * </ul>
 *
 * @see robot.cmd.CmdPackage#getMoveCmd()
 * @model
 * @generated
 */
public interface MoveCmd extends CommandExp {
	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(double)
	 * @see robot.cmd.CmdPackage#getMoveCmd_Power()
	 * @model required="true"
	 * @generated
	 */
	double getPower();

	/**
	 * Sets the value of the '{@link robot.cmd.MoveCmd#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(double value);

} // MoveCmd
