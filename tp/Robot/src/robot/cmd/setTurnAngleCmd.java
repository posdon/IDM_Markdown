/**
 */
package robot.cmd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>set Turn Angle Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.cmd.setTurnAngleCmd#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see robot.cmd.CmdPackage#getsetTurnAngleCmd()
 * @model
 * @generated
 */
public interface setTurnAngleCmd extends CommandExp {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(double)
	 * @see robot.cmd.CmdPackage#getsetTurnAngleCmd_Angle()
	 * @model required="true"
	 * @generated
	 */
	double getAngle();

	/**
	 * Sets the value of the '{@link robot.cmd.setTurnAngleCmd#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(double value);

} // setTurnAngleCmd