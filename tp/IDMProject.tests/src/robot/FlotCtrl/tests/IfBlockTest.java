/**
 */
package robot.FlotCtrl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robot.FlotCtrl.FlotCtrlFactory;
import robot.FlotCtrl.IfBlock;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If Block</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfBlockTest extends TestCase {

	/**
	 * The fixture for this If Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfBlock fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfBlockTest.class);
	}

	/**
	 * Constructs a new If Block test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfBlockTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this If Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IfBlock fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this If Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfBlock getFixture() {
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
		setFixture(FlotCtrlFactory.eINSTANCE.createIfBlock());
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

} //IfBlockTest
