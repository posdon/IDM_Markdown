/**
 */
package robot.robot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.robot.ObstacleCmd;
import robot.robot.RobotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Obstacle Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObstacleCmdTest extends TestCase {

	/**
	 * The fixture for this Obstacle Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstacleCmd fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObstacleCmdTest.class);
	}

	/**
	 * Constructs a new Obstacle Cmd test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObstacleCmdTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Obstacle Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ObstacleCmd fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Obstacle Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstacleCmd getFixture() {
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
		setFixture(RobotFactory.eINSTANCE.createObstacleCmd());
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

} //ObstacleCmdTest
