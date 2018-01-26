/**
 */
package robot.robot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.robot.RobotFactory;
import robot.robot.StopProgramCmd;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stop Program Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StopProgramCmdTest extends TestCase {

	/**
	 * The fixture for this Stop Program Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopProgramCmd fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StopProgramCmdTest.class);
	}

	/**
	 * Constructs a new Stop Program Cmd test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopProgramCmdTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Stop Program Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StopProgramCmd fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Stop Program Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopProgramCmd getFixture() {
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
		setFixture(RobotFactory.eINSTANCE.createStopProgramCmd());
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

} //StopProgramCmdTest
