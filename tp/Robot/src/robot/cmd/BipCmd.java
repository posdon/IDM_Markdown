/**
 */
package robot.cmd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bip Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.cmd.BipCmd#getDuration <em>Duration</em>}</li>
 *   <li>{@link robot.cmd.BipCmd#getPower <em>Power</em>}</li>
 *   <li>{@link robot.cmd.BipCmd#isRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @see robot.cmd.CmdPackage#getBipCmd()
 * @model
 * @generated
 */
public interface BipCmd extends CommandExp {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see robot.cmd.CmdPackage#getBipCmd_Duration()
	 * @model required="true"
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link robot.cmd.BipCmd#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

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
	 * @see robot.cmd.CmdPackage#getBipCmd_Power()
	 * @model required="true"
	 * @generated
	 */
	double getPower();

	/**
	 * Sets the value of the '{@link robot.cmd.BipCmd#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(double value);

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see #setRepeat(boolean)
	 * @see robot.cmd.CmdPackage#getBipCmd_Repeat()
	 * @model required="true"
	 * @generated
	 */
	boolean isRepeat();

	/**
	 * Sets the value of the '{@link robot.cmd.BipCmd#isRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see #isRepeat()
	 * @generated
	 */
	void setRepeat(boolean value);

} // BipCmd
