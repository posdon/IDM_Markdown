/**
 */
package robot.flotCtrl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.flotCtrl.FlotCtrlFactory;
import robot.flotCtrl.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileLoopTest extends TestCase {

	/**
	 * The fixture for this While Loop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoop fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhileLoopTest.class);
	}

	/**
	 * Constructs a new While Loop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoopTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this While Loop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WhileLoop fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this While Loop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoop getFixture() {
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
		setFixture(FlotCtrlFactory.eINSTANCE.createWhileLoop());
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

} //WhileLoopTest
