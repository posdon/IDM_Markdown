/**
 */
package robot.flotCtrl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.flotCtrl.AndExp;
import robot.flotCtrl.FlotCtrlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>And Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndExpTest extends TestCase {

	/**
	 * The fixture for this And Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndExp fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AndExpTest.class);
	}

	/**
	 * Constructs a new And Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this And Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AndExp fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this And Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndExp getFixture() {
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
		setFixture(FlotCtrlFactory.eINSTANCE.createAndExp());
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

} //AndExpTest
