/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl.tests;

import junit.textui.TestRunner;

import markHammil.mm.myDsl.Header2Expression;
import markHammil.mm.myDsl.MyDslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Header2 Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Header2ExpressionTest extends HeaderExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Header2ExpressionTest.class);
	}

	/**
	 * Constructs a new Header2 Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header2ExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Header2 Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Header2Expression getFixture() {
		return (Header2Expression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyDslFactory.eINSTANCE.createHeader2Expression());
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

} //Header2ExpressionTest
