/**
 */
package robot.robot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import robot.flotCtrl.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.robot.ProgramUnit#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see robot.robot.RobotPackage#getProgramUnit()
 * @model
 * @generated
 */
public interface ProgramUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link robot.flotCtrl.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see robot.robot.RobotPackage#getProgramUnit_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getBlock();

} // ProgramUnit
