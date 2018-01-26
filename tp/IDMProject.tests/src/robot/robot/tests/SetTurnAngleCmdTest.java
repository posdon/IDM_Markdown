/**
 */
package robot.robot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.robot.RobotFactory;
import robot.robot.SetTurnAngleCmd;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Set Turn Angle Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetTurnAngleCmdTest extends TestCase {

	/**
	 * The fixture for this Set Turn Angle Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTurnAngleCmd fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SetTurnAngleCmdTest.class);
	}

	/**
	 * Constructs a new Set Turn Angle Cmd test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTurnAngleCmdTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Set Turn Angle Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SetTurnAngleCmd fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Set Turn Angle Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTurnAngleCmd getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotFactory.eINSTANCE.createSetTurnAngleCmd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SetTurnAngleCmdTest
