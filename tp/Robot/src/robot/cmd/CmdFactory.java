/**
 */
package robot.cmd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see robot.cmd.CmdPackage
 * @generated
 */
public interface CmdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmdFactory eINSTANCE = robot.cmd.impl.CmdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Obstacle Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstacle Cmd</em>'.
	 * @generated
	 */
	ObstacleCmd createObstacleCmd();

	/**
	 * Returns a new object of class '<em>Move Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Cmd</em>'.
	 * @generated
	 */
	MoveCmd createMoveCmd();

	/**
	 * Returns a new object of class '<em>Bip Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bip Cmd</em>'.
	 * @generated
	 */
	BipCmd createBipCmd();

	/**
	 * Returns a new object of class '<em>set Turn Angle Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>set Turn Angle Cmd</em>'.
	 * @generated
	 */
	setTurnAngleCmd createsetTurnAngleCmd();

	/**
	 * Returns a new object of class '<em>has Turned Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>has Turned Cmd</em>'.
	 * @generated
	 */
	hasTurnedCmd createhasTurnedCmd();

	/**
	 * Returns a new object of class '<em>stop Engine Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>stop Engine Cmd</em>'.
	 * @generated
	 */
	stopEngineCmd createstopEngineCmd();

	/**
	 * Returns a new object of class '<em>turn Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>turn Cmd</em>'.
	 * @generated
	 */
	turnCmd createturnCmd();

	/**
	 * Returns a new object of class '<em>stop Program Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>stop Program Cmd</em>'.
	 * @generated
	 */
	stopProgramCmd createstopProgramCmd();

	/**
	 * Returns a new object of class '<em>display Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>display Cmd</em>'.
	 * @generated
	 */
	displayCmd createdisplayCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CmdPackage getCmdPackage();

} //CmdFactory
