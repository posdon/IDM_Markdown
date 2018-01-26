/**
 */
package robot.cmd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robot.cflow.Expression;

import robot.cmd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robot.cmd.CmdPackage
 * @generated
 */
public class CmdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CmdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CmdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdSwitch<Adapter> modelSwitch =
		new CmdSwitch<Adapter>() {
			@Override
			public Adapter caseCommandExp(CommandExp object) {
				return createCommandExpAdapter();
			}
			@Override
			public Adapter caseObstacleCmd(ObstacleCmd object) {
				return createObstacleCmdAdapter();
			}
			@Override
			public Adapter caseMoveCmd(MoveCmd object) {
				return createMoveCmdAdapter();
			}
			@Override
			public Adapter caseBipCmd(BipCmd object) {
				return createBipCmdAdapter();
			}
			@Override
			public Adapter casesetTurnAngleCmd(setTurnAngleCmd object) {
				return createsetTurnAngleCmdAdapter();
			}
			@Override
			public Adapter casehasTurnedCmd(hasTurnedCmd object) {
				return createhasTurnedCmdAdapter();
			}
			@Override
			public Adapter casestopEngineCmd(stopEngineCmd object) {
				return createstopEngineCmdAdapter();
			}
			@Override
			public Adapter caseturnCmd(turnCmd object) {
				return createturnCmdAdapter();
			}
			@Override
			public Adapter casestopProgramCmd(stopProgramCmd object) {
				return createstopProgramCmdAdapter();
			}
			@Override
			public Adapter casedisplayCmd(displayCmd object) {
				return createdisplayCmdAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.CommandExp <em>Command Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.CommandExp
	 * @generated
	 */
	public Adapter createCommandExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.ObstacleCmd <em>Obstacle Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.ObstacleCmd
	 * @generated
	 */
	public Adapter createObstacleCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.MoveCmd <em>Move Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.MoveCmd
	 * @generated
	 */
	public Adapter createMoveCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.BipCmd <em>Bip Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.BipCmd
	 * @generated
	 */
	public Adapter createBipCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.setTurnAngleCmd <em>set Turn Angle Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.setTurnAngleCmd
	 * @generated
	 */
	public Adapter createsetTurnAngleCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.hasTurnedCmd <em>has Turned Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.hasTurnedCmd
	 * @generated
	 */
	public Adapter createhasTurnedCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.stopEngineCmd <em>stop Engine Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.stopEngineCmd
	 * @generated
	 */
	public Adapter createstopEngineCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.turnCmd <em>turn Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.turnCmd
	 * @generated
	 */
	public Adapter createturnCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.stopProgramCmd <em>stop Program Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.stopProgramCmd
	 * @generated
	 */
	public Adapter createstopProgramCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cmd.displayCmd <em>display Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cmd.displayCmd
	 * @generated
	 */
	public Adapter createdisplayCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.cflow.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.cflow.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CmdAdapterFactory
