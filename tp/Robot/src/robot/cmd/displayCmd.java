/**
 */
package robot.cmd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>display Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.cmd.displayCmd#getMsg <em>Msg</em>}</li>
 *   <li>{@link robot.cmd.displayCmd#getDuration <em>Duration</em>}</li>
 *   <li>{@link robot.cmd.displayCmd#getLine <em>Line</em>}</li>
 *   <li>{@link robot.cmd.displayCmd#getCol <em>Col</em>}</li>
 * </ul>
 *
 * @see robot.cmd.CmdPackage#getdisplayCmd()
 * @model
 * @generated
 */
public interface displayCmd extends CommandExp {
	/**
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see #setMsg(String)
	 * @see robot.cmd.CmdPackage#getdisplayCmd_Msg()
	 * @model required="true"
	 * @generated
	 */
	String getMsg();

	/**
	 * Sets the value of the '{@link robot.cmd.displayCmd#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(String value);

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
	 * @see robot.cmd.CmdPackage#getdisplayCmd_Duration()
	 * @model required="true"
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link robot.cmd.displayCmd#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see robot.cmd.CmdPackage#getdisplayCmd_Line()
	 * @model required="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link robot.cmd.displayCmd#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' attribute.
	 * @see #setCol(int)
	 * @see robot.cmd.CmdPackage#getdisplayCmd_Col()
	 * @model required="true"
	 * @generated
	 */
	int getCol();

	/**
	 * Sets the value of the '{@link robot.cmd.displayCmd#getCol <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' attribute.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(int value);

} // displayCmd
