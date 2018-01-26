/**
 */
package robot.cmd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>turn Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.cmd.turnCmd#getPower <em>Power</em>}</li>
 *   <li>{@link robot.cmd.turnCmd#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see robot.cmd.CmdPackage#getturnCmd()
 * @model
 * @generated
 */
public interface turnCmd extends CommandExp {
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
	 * @see robot.cmd.CmdPackage#getturnCmd_Power()
	 * @model required="true"
	 * @generated
	 */
	double getPower();

	/**
	 * Sets the value of the '{@link robot.cmd.turnCmd#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(double value);

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
	 * @see robot.cmd.CmdPackage#getturnCmd_Angle()
	 * @model required="true"
	 * @generated
	 */
	double getAngle();

	/**
	 * Sets the value of the '{@link robot.cmd.turnCmd#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(double value);

} // turnCmd
