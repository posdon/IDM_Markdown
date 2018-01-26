/**
 */
package robot.robot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.robot.RobotFactory;
import robot.robot.StopEngineCmd;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stop Engine Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StopEngineCmdTest extends TestCase {

	/**
	 * The fixture for this Stop Engine Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopEngineCmd fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StopEngineCmdTest.class);
	}

	/**
	 * Constructs a new Stop Engine Cmd test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopEngineCmdTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Stop Engine Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StopEngineCmd fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Stop Engine Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopEngineCmd getFixture() {
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
		setFixture(RobotFactory.eINSTANCE.createStopEngineCmd());
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

} //StopEngineCmdTest
