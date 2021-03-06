/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import markHammil.mm.myDsl.ImageExpression;
import markHammil.mm.myDsl.MyDslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageExpressionTest extends TestCase {

	/**
	 * The fixture for this Image Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImageExpressionTest.class);
	}

	/**
	 * Constructs a new Image Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Image Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ImageExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Image Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImageExpression getFixture() {
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
		setFixture(MyDslFactory.eINSTANCE.createImageExpression());
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

} //ImageExpressionTest
