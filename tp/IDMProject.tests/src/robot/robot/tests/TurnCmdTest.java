/**
 */
package robot.robot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.robot.RobotFactory;
import robot.robot.TurnCmd;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Turn Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurnCmdTest extends TestCase {

	/**
	 * The fixture for this Turn Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnCmd fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TurnCmdTest.class);
	}

	/**
	 * Constructs a new Turn Cmd test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnCmdTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Turn Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TurnCmd fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Turn Cmd test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnCmd getFixture() {
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
		setFixture(RobotFactory.eINSTANCE.createTurnCmd());
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

} //TurnCmdTest
