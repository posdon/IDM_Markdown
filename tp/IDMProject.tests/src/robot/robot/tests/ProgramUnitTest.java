/**
 */
package robot.robot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.robot.ProgramUnit;
import robot.robot.RobotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Program Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramUnitTest extends TestCase {

	/**
	 * The fixture for this Program Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramUnit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgramUnitTest.class);
	}

	/**
	 * Constructs a new Program Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramUnitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Program Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProgramUnit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Program Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramUnit getFixture() {
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
		setFixture(RobotFactory.eINSTANCE.createProgramUnit());
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

} //ProgramUnitTest
