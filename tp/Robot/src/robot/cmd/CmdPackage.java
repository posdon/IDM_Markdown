/**
 */
package robot.cmd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import robot.cflow.CflowPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robot.cmd.CmdFactory
 * @model kind="package"
 * @generated
 */
public interface CmdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cmd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cmd.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cmd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmdPackage eINSTANCE = robot.cmd.impl.CmdPackageImpl.init();

	/**
	 * The meta object id for the '{@link robot.cmd.impl.CommandExpImpl <em>Command Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.CommandExpImpl
	 * @see robot.cmd.impl.CmdPackageImpl#getCommandExp()
	 * @generated
	 */
	int COMMAND_EXP = 0;

	/**
	 * The number of structural features of the '<em>Command Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXP_FEATURE_COUNT = CflowPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXP_OPERATION_COUNT = CflowPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cmd.impl.ObstacleCmdImpl <em>Obstacle Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.ObstacleCmdImpl
	 * @see robot.cmd.impl.CmdPackageImpl#getObstacleCmd()
	 * @generated
	 */
	int OBSTACLE_CMD = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_CMD__DISTANCE = COMMAND_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obstacle Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_CMD_FEATURE_COUNT = COMMAND_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Obstacle Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_CMD_OPERATION_COUNT = COMMAND_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cmd.impl.MoveCmdImpl <em>Move Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.MoveCmdImpl
	 * @see robot.cmd.impl.CmdPackageImpl#getMoveCmd()
	 * @generated
	 */
	int MOVE_CMD = 2;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CMD__POWER = COMMAND_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CMD_FEATURE_COUNT = COMMAND_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CMD_OPERATION_COUNT = COMMAND_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cmd.impl.BipCmdImpl <em>Bip Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.BipCmdImpl
	 * @see robot.cmd.impl.CmdPackageImpl#getBipCmd()
	 * @generated
	 */
	int BIP_CMD = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP_CMD__DURATION = COMMAND_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP_CMD__POWER = COMMAND_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP_CMD__REPEAT = COMMAND_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bip Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP_CMD_FEATURE_COUNT = COMMAND_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bip Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP_CMD_OPERATION_COUNT = COMMAND_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cmd.impl.setTurnAngleCmdImpl <em>set Turn Angle Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.setTurnAngleCmdImpl
	 * @see robot.cmd.impl.CmdPackageImpl#getsetTurnAngleCmd()
	 * @generated
	 */
	int SET_TURN_ANGLE_CMD = 4;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TURN_ANGLE_CMD__ANGLE = COMMAND_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>set Turn Angle Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TURN_ANGLE_CMD_FEATURE_COUNT = COMMAND_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>set Turn Angle Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TURN_ANGLE_CMD_OPERATION_COUNT = COMMAND_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cmd.impl.hasTurnedCmdImpl <em>has Turned Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.hasTurnedCmdImpl
	 * @see robot.cmd.impl.CmdPackageImpl#gethasTurnedCmd()
	 * @generated
	 */
	int HAS_TURNED_CMD = 5;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TURNED_CMD__ANGLE = COMMAND_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>has Turned Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TURNED_CMD_FEATURE_COUNT = COMMAND_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>has Turned Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TURNED_CMD_OPERATION_COUNT = COMMAND_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cmd.impl.stopEngineCmdImpl <em>stop Engine Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.stopEngineCmdImpl
	 * @see robot.cmd.impl.CmdPackageImpl#getstopEngineCmd()
	 * @generated
	 */
	int STOP_ENGINE_CMD = 6;

	/**
	 * The number of structural features of the '<em>stop Engine Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ENGINE_CMD_FEATURE_COUNT = COMMAND_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>stop Engine Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ENGINE_CMD_OPERATION_COUNT = COMMAND_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cmd.impl.turnCmdImpl <em>turn Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.turnCmdImpl
	 * @see robot.cmd.impl.CmdPackageImpl#getturnCmd()
	 * @generated
	 */
	int TURN_CMD = 7;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CMD__POWER = COMMAND_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CMD__ANGLE = COMMAND_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>turn Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CMD_FEATURE_COUNT = COMMAND_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>turn Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CMD_OPERATION_COUNT = COMMAND_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cmd.impl.stopProgramCmdImpl <em>stop Program Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.stopProgramCmdImpl
	 * @see robot.cmd.impl.CmdPackageImpl#getstopProgramCmd()
	 * @generated
	 */
	int STOP_PROGRAM_CMD = 8;

	/**
	 * The number of structural features of the '<em>stop Program Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_PROGRAM_CMD_FEATURE_COUNT = COMMAND_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>stop Program Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_PROGRAM_CMD_OPERATION_COUNT = COMMAND_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cmd.impl.displayCmdImpl <em>display Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cmd.impl.displayCmdImpl
	 * @see robot.cmd.impl.CmdPackageImpl#getdisplayCmd()
	 * @generated
	 */
	int DISPLAY_CMD = 9;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CMD__MSG = COMMAND_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CMD__DURATION = COMMAND_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CMD__LINE = COMMAND_EXP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CMD__COL = COMMAND_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>display Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CMD_FEATURE_COUNT = COMMAND_EXP_FEATURE_COUNT + 4;


	/**
	 * The number of operations of the '<em>display Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_CMD_OPERATION_COUNT = COMMAND_EXP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link robot.cmd.CommandExp <em>Command Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Exp</em>'.
	 * @see robot.cmd.CommandExp
	 * @generated
	 */
	EClass getCommandExp();

	/**
	 * Returns the meta object for class '{@link robot.cmd.ObstacleCmd <em>Obstacle Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle Cmd</em>'.
	 * @see robot.cmd.ObstacleCmd
	 * @generated
	 */
	EClass getObstacleCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.ObstacleCmd#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see robot.cmd.ObstacleCmd#getDistance()
	 * @see #getObstacleCmd()
	 * @generated
	 */
	EAttribute getObstacleCmd_Distance();

	/**
	 * Returns the meta object for class '{@link robot.cmd.MoveCmd <em>Move Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Cmd</em>'.
	 * @see robot.cmd.MoveCmd
	 * @generated
	 */
	EClass getMoveCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.MoveCmd#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see robot.cmd.MoveCmd#getPower()
	 * @see #getMoveCmd()
	 * @generated
	 */
	EAttribute getMoveCmd_Power();

	/**
	 * Returns the meta object for class '{@link robot.cmd.BipCmd <em>Bip Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bip Cmd</em>'.
	 * @see robot.cmd.BipCmd
	 * @generated
	 */
	EClass getBipCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.BipCmd#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see robot.cmd.BipCmd#getDuration()
	 * @see #getBipCmd()
	 * @generated
	 */
	EAttribute getBipCmd_Duration();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.BipCmd#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see robot.cmd.BipCmd#getPower()
	 * @see #getBipCmd()
	 * @generated
	 */
	EAttribute getBipCmd_Power();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.BipCmd#isRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see robot.cmd.BipCmd#isRepeat()
	 * @see #getBipCmd()
	 * @generated
	 */
	EAttribute getBipCmd_Repeat();

	/**
	 * Returns the meta object for class '{@link robot.cmd.setTurnAngleCmd <em>set Turn Angle Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>set Turn Angle Cmd</em>'.
	 * @see robot.cmd.setTurnAngleCmd
	 * @generated
	 */
	EClass getsetTurnAngleCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.setTurnAngleCmd#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robot.cmd.setTurnAngleCmd#getAngle()
	 * @see #getsetTurnAngleCmd()
	 * @generated
	 */
	EAttribute getsetTurnAngleCmd_Angle();

	/**
	 * Returns the meta object for class '{@link robot.cmd.hasTurnedCmd <em>has Turned Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>has Turned Cmd</em>'.
	 * @see robot.cmd.hasTurnedCmd
	 * @generated
	 */
	EClass gethasTurnedCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.hasTurnedCmd#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robot.cmd.hasTurnedCmd#getAngle()
	 * @see #gethasTurnedCmd()
	 * @generated
	 */
	EAttribute gethasTurnedCmd_Angle();

	/**
	 * Returns the meta object for class '{@link robot.cmd.stopEngineCmd <em>stop Engine Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stop Engine Cmd</em>'.
	 * @see robot.cmd.stopEngineCmd
	 * @generated
	 */
	EClass getstopEngineCmd();

	/**
	 * Returns the meta object for class '{@link robot.cmd.turnCmd <em>turn Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>turn Cmd</em>'.
	 * @see robot.cmd.turnCmd
	 * @generated
	 */
	EClass getturnCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.turnCmd#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see robot.cmd.turnCmd#getPower()
	 * @see #getturnCmd()
	 * @generated
	 */
	EAttribute getturnCmd_Power();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.turnCmd#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robot.cmd.turnCmd#getAngle()
	 * @see #getturnCmd()
	 * @generated
	 */
	EAttribute getturnCmd_Angle();

	/**
	 * Returns the meta object for class '{@link robot.cmd.stopProgramCmd <em>stop Program Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stop Program Cmd</em>'.
	 * @see robot.cmd.stopProgramCmd
	 * @generated
	 */
	EClass getstopProgramCmd();

	/**
	 * Returns the meta object for class '{@link robot.cmd.displayCmd <em>display Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>display Cmd</em>'.
	 * @see robot.cmd.displayCmd
	 * @generated
	 */
	EClass getdisplayCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.displayCmd#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see robot.cmd.displayCmd#getMsg()
	 * @see #getdisplayCmd()
	 * @generated
	 */
	EAttribute getdisplayCmd_Msg();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.displayCmd#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see robot.cmd.displayCmd#getDuration()
	 * @see #getdisplayCmd()
	 * @generated
	 */
	EAttribute getdisplayCmd_Duration();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.displayCmd#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see robot.cmd.displayCmd#getLine()
	 * @see #getdisplayCmd()
	 * @generated
	 */
	EAttribute getdisplayCmd_Line();

	/**
	 * Returns the meta object for the attribute '{@link robot.cmd.displayCmd#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col</em>'.
	 * @see robot.cmd.displayCmd#getCol()
	 * @see #getdisplayCmd()
	 * @generated
	 */
	EAttribute getdisplayCmd_Col();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CmdFactory getCmdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robot.cmd.impl.CommandExpImpl <em>Command Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.CommandExpImpl
		 * @see robot.cmd.impl.CmdPackageImpl#getCommandExp()
		 * @generated
		 */
		EClass COMMAND_EXP = eINSTANCE.getCommandExp();

		/**
		 * The meta object literal for the '{@link robot.cmd.impl.ObstacleCmdImpl <em>Obstacle Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.ObstacleCmdImpl
		 * @see robot.cmd.impl.CmdPackageImpl#getObstacleCmd()
		 * @generated
		 */
		EClass OBSTACLE_CMD = eINSTANCE.getObstacleCmd();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSTACLE_CMD__DISTANCE = eINSTANCE.getObstacleCmd_Distance();

		/**
		 * The meta object literal for the '{@link robot.cmd.impl.MoveCmdImpl <em>Move Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.MoveCmdImpl
		 * @see robot.cmd.impl.CmdPackageImpl#getMoveCmd()
		 * @generated
		 */
		EClass MOVE_CMD = eINSTANCE.getMoveCmd();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_CMD__POWER = eINSTANCE.getMoveCmd_Power();

		/**
		 * The meta object literal for the '{@link robot.cmd.impl.BipCmdImpl <em>Bip Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.BipCmdImpl
		 * @see robot.cmd.impl.CmdPackageImpl#getBipCmd()
		 * @generated
		 */
		EClass BIP_CMD = eINSTANCE.getBipCmd();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIP_CMD__DURATION = eINSTANCE.getBipCmd_Duration();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIP_CMD__POWER = eINSTANCE.getBipCmd_Power();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIP_CMD__REPEAT = eINSTANCE.getBipCmd_Repeat();

		/**
		 * The meta object literal for the '{@link robot.cmd.impl.setTurnAngleCmdImpl <em>set Turn Angle Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.setTurnAngleCmdImpl
		 * @see robot.cmd.impl.CmdPackageImpl#getsetTurnAngleCmd()
		 * @generated
		 */
		EClass SET_TURN_ANGLE_CMD = eINSTANCE.getsetTurnAngleCmd();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TURN_ANGLE_CMD__ANGLE = eINSTANCE.getsetTurnAngleCmd_Angle();

		/**
		 * The meta object literal for the '{@link robot.cmd.impl.hasTurnedCmdImpl <em>has Turned Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.hasTurnedCmdImpl
		 * @see robot.cmd.impl.CmdPackageImpl#gethasTurnedCmd()
		 * @generated
		 */
		EClass HAS_TURNED_CMD = eINSTANCE.gethasTurnedCmd();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_TURNED_CMD__ANGLE = eINSTANCE.gethasTurnedCmd_Angle();

		/**
		 * The meta object literal for the '{@link robot.cmd.impl.stopEngineCmdImpl <em>stop Engine Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.stopEngineCmdImpl
		 * @see robot.cmd.impl.CmdPackageImpl#getstopEngineCmd()
		 * @generated
		 */
		EClass STOP_ENGINE_CMD = eINSTANCE.getstopEngineCmd();

		/**
		 * The meta object literal for the '{@link robot.cmd.impl.turnCmdImpl <em>turn Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.turnCmdImpl
		 * @see robot.cmd.impl.CmdPackageImpl#getturnCmd()
		 * @generated
		 */
		EClass TURN_CMD = eINSTANCE.getturnCmd();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_CMD__POWER = eINSTANCE.getturnCmd_Power();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_CMD__ANGLE = eINSTANCE.getturnCmd_Angle();

		/**
		 * The meta object literal for the '{@link robot.cmd.impl.stopProgramCmdImpl <em>stop Program Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.stopProgramCmdImpl
		 * @see robot.cmd.impl.CmdPackageImpl#getstopProgramCmd()
		 * @generated
		 */
		EClass STOP_PROGRAM_CMD = eINSTANCE.getstopProgramCmd();

		/**
		 * The meta object literal for the '{@link robot.cmd.impl.displayCmdImpl <em>display Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cmd.impl.displayCmdImpl
		 * @see robot.cmd.impl.CmdPackageImpl#getdisplayCmd()
		 * @generated
		 */
		EClass DISPLAY_CMD = eINSTANCE.getdisplayCmd();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_CMD__MSG = eINSTANCE.getdisplayCmd_Msg();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_CMD__DURATION = eINSTANCE.getdisplayCmd_Duration();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_CMD__LINE = eINSTANCE.getdisplayCmd_Line();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_CMD__COL = eINSTANCE.getdisplayCmd_Col();

	}

} //CmdPackage
