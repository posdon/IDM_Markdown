/**
 */
package robot.robot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.robot.MoveCmd;
import robot.robot.RobotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Move Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoveCmdTest extends TestCase {

	/**
	 * The fixture for this Move Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveCmd fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MoveCmdTest.class);
	}

	/**
	 * Constructs a new Move Cmd test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveCmdTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Move Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MoveCmd fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Move Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveCmd getFixture() {
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
		setFixture(RobotFactory.eINSTANCE.createMoveCmd());
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

} //MoveCmdTest
