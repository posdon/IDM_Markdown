/**
 */
package robot.cmd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.cmd.ObstacleCmd#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see robot.cmd.CmdPackage#getObstacleCmd()
 * @model
 * @generated
 */
public interface ObstacleCmd extends CommandExp {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see robot.cmd.CmdPackage#getObstacleCmd_Distance()
	 * @model required="true"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link robot.cmd.ObstacleCmd#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

} // ObstacleCmd
