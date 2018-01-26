/**
 */
package robot.cmd.impl;

import org.eclipse.emf.ecore.EClass;

import robot.cflow.impl.ExpressionImpl;

import robot.cmd.CmdPackage;
import robot.cmd.CommandExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CommandExpImpl extends ExpressionImpl implements CommandExp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmdPackage.Literals.COMMAND_EXP;
	}

} //CommandExpImpl
