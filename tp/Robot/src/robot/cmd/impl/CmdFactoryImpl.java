/**
 */
package robot.cmd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robot.cmd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmdFactoryImpl extends EFactoryImpl implements CmdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmdFactory init() {
		try {
			CmdFactory theCmdFactory = (CmdFactory)EPackage.Registry.INSTANCE.getEFactory(CmdPackage.eNS_URI);
			if (theCmdFactory != null) {
				return theCmdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CmdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CmdPackage.OBSTACLE_CMD: return createObstacleCmd();
			case CmdPackage.MOVE_CMD: return createMoveCmd();
			case CmdPackage.BIP_CMD: return createBipCmd();
			case CmdPackage.SET_TURN_ANGLE_CMD: return createsetTurnAngleCmd();
			case CmdPackage.HAS_TURNED_CMD: return createhasTurnedCmd();
			case CmdPackage.STOP_ENGINE_CMD: return createstopEngineCmd();
			case CmdPackage.TURN_CMD: return createturnCmd();
			case CmdPackage.STOP_PROGRAM_CMD: return createstopProgramCmd();
			case CmdPackage.DISPLAY_CMD: return createdisplayCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObstacleCmd createObstacleCmd() {
		ObstacleCmdImpl obstacleCmd = new ObstacleCmdImpl();
		return obstacleCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveCmd createMoveCmd() {
		MoveCmdImpl moveCmd = new MoveCmdImpl();
		return moveCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BipCmd createBipCmd() {
		BipCmdImpl bipCmd = new BipCmdImpl();
		return bipCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public setTurnAngleCmd createsetTurnAngleCmd() {
		setTurnAngleCmdImpl setTurnAngleCmd = new setTurnAngleCmdImpl();
		return setTurnAngleCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hasTurnedCmd createhasTurnedCmd() {
		hasTurnedCmdImpl hasTurnedCmd = new hasTurnedCmdImpl();
		return hasTurnedCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stopEngineCmd createstopEngineCmd() {
		stopEngineCmdImpl stopEngineCmd = new stopEngineCmdImpl();
		return stopEngineCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public turnCmd createturnCmd() {
		turnCmdImpl turnCmd = new turnCmdImpl();
		return turnCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stopProgramCmd createstopProgramCmd() {
		stopProgramCmdImpl stopProgramCmd = new stopProgramCmdImpl();
		return stopProgramCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public displayCmd createdisplayCmd() {
		displayCmdImpl displayCmd = new displayCmdImpl();
		return displayCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPackage getCmdPackage() {
		return (CmdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CmdPackage getPackage() {
		return CmdPackage.eINSTANCE;
	}

} //CmdFactoryImpl
