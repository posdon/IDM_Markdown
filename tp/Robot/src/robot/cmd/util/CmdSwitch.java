/**
 */
package robot.cmd.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import robot.cflow.Expression;

import robot.cmd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see robot.cmd.CmdPackage
 * @generated
 */
public class CmdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CmdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdSwitch() {
		if (modelPackage == null) {
			modelPackage = CmdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CmdPackage.COMMAND_EXP: {
				CommandExp commandExp = (CommandExp)theEObject;
				T result = caseCommandExp(commandExp);
				if (result == null) result = caseExpression(commandExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmdPackage.OBSTACLE_CMD: {
				ObstacleCmd obstacleCmd = (ObstacleCmd)theEObject;
				T result = caseObstacleCmd(obstacleCmd);
				if (result == null) result = caseCommandExp(obstacleCmd);
				if (result == null) result = caseExpression(obstacleCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmdPackage.MOVE_CMD: {
				MoveCmd moveCmd = (MoveCmd)theEObject;
				T result = caseMoveCmd(moveCmd);
				if (result == null) result = caseCommandExp(moveCmd);
				if (result == null) result = caseExpression(moveCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmdPackage.BIP_CMD: {
				BipCmd bipCmd = (BipCmd)theEObject;
				T result = caseBipCmd(bipCmd);
				if (result == null) result = caseCommandExp(bipCmd);
				if (result == null) result = caseExpression(bipCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmdPackage.SET_TURN_ANGLE_CMD: {
				setTurnAngleCmd setTurnAngleCmd = (setTurnAngleCmd)theEObject;
				T result = casesetTurnAngleCmd(setTurnAngleCmd);
				if (result == null) result = caseCommandExp(setTurnAngleCmd);
				if (result == null) result = caseExpression(setTurnAngleCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmdPackage.HAS_TURNED_CMD: {
				hasTurnedCmd hasTurnedCmd = (hasTurnedCmd)theEObject;
				T result = casehasTurnedCmd(hasTurnedCmd);
				if (result == null) result = caseCommandExp(hasTurnedCmd);
				if (result == null) result = caseExpression(hasTurnedCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmdPackage.STOP_ENGINE_CMD: {
				stopEngineCmd stopEngineCmd = (stopEngineCmd)theEObject;
				T result = casestopEngineCmd(stopEngineCmd);
				if (result == null) result = caseCommandExp(stopEngineCmd);
				if (result == null) result = caseExpression(stopEngineCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmdPackage.TURN_CMD: {
				turnCmd turnCmd = (turnCmd)theEObject;
				T result = caseturnCmd(turnCmd);
				if (result == null) result = caseCommandExp(turnCmd);
				if (result == null) result = caseExpression(turnCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmdPackage.STOP_PROGRAM_CMD: {
				stopProgramCmd stopProgramCmd = (stopProgramCmd)theEObject;
				T result = casestopProgramCmd(stopProgramCmd);
				if (result == null) result = caseCommandExp(stopProgramCmd);
				if (result == null) result = caseExpression(stopProgramCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmdPackage.DISPLAY_CMD: {
				displayCmd displayCmd = (displayCmd)theEObject;
				T result = casedisplayCmd(displayCmd);
				if (result == null) result = caseCommandExp(displayCmd);
				if (result == null) result = caseExpression(displayCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandExp(CommandExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obstacle Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obstacle Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObstacleCmd(ObstacleCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveCmd(MoveCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bip Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bip Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBipCmd(BipCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>set Turn Angle Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>set Turn Angle Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesetTurnAngleCmd(setTurnAngleCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>has Turned Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>has Turned Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehasTurnedCmd(hasTurnedCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>stop Engine Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>stop Engine Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestopEngineCmd(stopEngineCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>turn Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>turn Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseturnCmd(turnCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>stop Program Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>stop Program Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestopProgramCmd(stopProgramCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>display Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>display Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedisplayCmd(displayCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CmdSwitch
