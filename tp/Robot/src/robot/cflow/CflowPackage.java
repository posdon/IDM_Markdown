/**
 */
package robot.cflow;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robot.cflow.CflowFactory
 * @model kind="package"
 * @generated
 */
public interface CflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CflowPackage eINSTANCE = robot.cflow.impl.CflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link robot.cflow.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cflow.impl.ExpressionImpl
	 * @see robot.cflow.impl.CflowPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.cflow.impl.LoopExpImpl <em>Loop Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cflow.impl.LoopExpImpl
	 * @see robot.cflow.impl.CflowPackageImpl#getLoopExp()
	 * @generated
	 */
	int LOOP_EXP = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__BODY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__CONDITION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cflow.impl.ConditionalExpImpl <em>Conditional Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cflow.impl.ConditionalExpImpl
	 * @see robot.cflow.impl.CflowPackageImpl#getConditionalExp()
	 * @generated
	 */
	int CONDITIONAL_EXP = 2;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXP__THEN = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXP__ELSE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXP__CONDITION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cflow.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cflow.impl.BooleanExpImpl
	 * @see robot.cflow.impl.CflowPackageImpl#getBooleanExp()
	 * @generated
	 */
	int BOOLEAN_EXP = 3;

	/**
	 * The number of structural features of the '<em>Boolean Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cflow.impl.NotExpImpl <em>Not Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cflow.impl.NotExpImpl
	 * @see robot.cflow.impl.CflowPackageImpl#getNotExp()
	 * @generated
	 */
	int NOT_EXP = 4;

	/**
	 * The feature id for the '<em><b>Operande</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXP__OPERANDE = BOOLEAN_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXP_FEATURE_COUNT = BOOLEAN_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXP_OPERATION_COUNT = BOOLEAN_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.cflow.impl.AndExpImpl <em>And Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.cflow.impl.AndExpImpl
	 * @see robot.cflow.impl.CflowPackageImpl#getAndExp()
	 * @generated
	 */
	int AND_EXP = 5;

	/**
	 * The feature id for the '<em><b>Left Operande</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP__LEFT_OPERANDE = BOOLEAN_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operande</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP__RIGHT_OPERANDE = BOOLEAN_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP_FEATURE_COUNT = BOOLEAN_EXP_FEATURE_COUNT + 2;


	/**
	 * The number of operations of the '<em>And Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP_OPERATION_COUNT = BOOLEAN_EXP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link robot.cflow.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see robot.cflow.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link robot.cflow.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Exp</em>'.
	 * @see robot.cflow.LoopExp
	 * @generated
	 */
	EClass getLoopExp();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.cflow.LoopExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see robot.cflow.LoopExp#getBody()
	 * @see #getLoopExp()
	 * @generated
	 */
	EReference getLoopExp_Body();

	/**
	 * Returns the meta object for the containment reference '{@link robot.cflow.LoopExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robot.cflow.LoopExp#getCondition()
	 * @see #getLoopExp()
	 * @generated
	 */
	EReference getLoopExp_Condition();

	/**
	 * Returns the meta object for class '{@link robot.cflow.ConditionalExp <em>Conditional Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Exp</em>'.
	 * @see robot.cflow.ConditionalExp
	 * @generated
	 */
	EClass getConditionalExp();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.cflow.ConditionalExp#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see robot.cflow.ConditionalExp#getThen()
	 * @see #getConditionalExp()
	 * @generated
	 */
	EReference getConditionalExp_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.cflow.ConditionalExp#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see robot.cflow.ConditionalExp#getElse()
	 * @see #getConditionalExp()
	 * @generated
	 */
	EReference getConditionalExp_Else();

	/**
	 * Returns the meta object for the containment reference '{@link robot.cflow.ConditionalExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robot.cflow.ConditionalExp#getCondition()
	 * @see #getConditionalExp()
	 * @generated
	 */
	EReference getConditionalExp_Condition();

	/**
	 * Returns the meta object for class '{@link robot.cflow.BooleanExp <em>Boolean Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Exp</em>'.
	 * @see robot.cflow.BooleanExp
	 * @generated
	 */
	EClass getBooleanExp();

	/**
	 * Returns the meta object for class '{@link robot.cflow.NotExp <em>Not Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Exp</em>'.
	 * @see robot.cflow.NotExp
	 * @generated
	 */
	EClass getNotExp();

	/**
	 * Returns the meta object for the containment reference '{@link robot.cflow.NotExp#getOperande <em>Operande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operande</em>'.
	 * @see robot.cflow.NotExp#getOperande()
	 * @see #getNotExp()
	 * @generated
	 */
	EReference getNotExp_Operande();

	/**
	 * Returns the meta object for class '{@link robot.cflow.AndExp <em>And Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Exp</em>'.
	 * @see robot.cflow.AndExp
	 * @generated
	 */
	EClass getAndExp();

	/**
	 * Returns the meta object for the containment reference '{@link robot.cflow.AndExp#getLeftOperande <em>Left Operande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operande</em>'.
	 * @see robot.cflow.AndExp#getLeftOperande()
	 * @see #getAndExp()
	 * @generated
	 */
	EReference getAndExp_LeftOperande();

	/**
	 * Returns the meta object for the containment reference '{@link robot.cflow.AndExp#getRightOperande <em>Right Operande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operande</em>'.
	 * @see robot.cflow.AndExp#getRightOperande()
	 * @see #getAndExp()
	 * @generated
	 */
	EReference getAndExp_RightOperande();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CflowFactory getCflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robot.cflow.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cflow.impl.ExpressionImpl
		 * @see robot.cflow.impl.CflowPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link robot.cflow.impl.LoopExpImpl <em>Loop Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cflow.impl.LoopExpImpl
		 * @see robot.cflow.impl.CflowPackageImpl#getLoopExp()
		 * @generated
		 */
		EClass LOOP_EXP = eINSTANCE.getLoopExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_EXP__BODY = eINSTANCE.getLoopExp_Body();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_EXP__CONDITION = eINSTANCE.getLoopExp_Condition();

		/**
		 * The meta object literal for the '{@link robot.cflow.impl.ConditionalExpImpl <em>Conditional Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cflow.impl.ConditionalExpImpl
		 * @see robot.cflow.impl.CflowPackageImpl#getConditionalExp()
		 * @generated
		 */
		EClass CONDITIONAL_EXP = eINSTANCE.getConditionalExp();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXP__THEN = eINSTANCE.getConditionalExp_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXP__ELSE = eINSTANCE.getConditionalExp_Else();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXP__CONDITION = eINSTANCE.getConditionalExp_Condition();

		/**
		 * The meta object literal for the '{@link robot.cflow.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cflow.impl.BooleanExpImpl
		 * @see robot.cflow.impl.CflowPackageImpl#getBooleanExp()
		 * @generated
		 */
		EClass BOOLEAN_EXP = eINSTANCE.getBooleanExp();

		/**
		 * The meta object literal for the '{@link robot.cflow.impl.NotExpImpl <em>Not Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cflow.impl.NotExpImpl
		 * @see robot.cflow.impl.CflowPackageImpl#getNotExp()
		 * @generated
		 */
		EClass NOT_EXP = eINSTANCE.getNotExp();

		/**
		 * The meta object literal for the '<em><b>Operande</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXP__OPERANDE = eINSTANCE.getNotExp_Operande();

		/**
		 * The meta object literal for the '{@link robot.cflow.impl.AndExpImpl <em>And Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.cflow.impl.AndExpImpl
		 * @see robot.cflow.impl.CflowPackageImpl#getAndExp()
		 * @generated
		 */
		EClass AND_EXP = eINSTANCE.getAndExp();

		/**
		 * The meta object literal for the '<em><b>Left Operande</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXP__LEFT_OPERANDE = eINSTANCE.getAndExp_LeftOperande();

		/**
		 * The meta object literal for the '<em><b>Right Operande</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXP__RIGHT_OPERANDE = eINSTANCE.getAndExp_RightOperande();

	}

} //CflowPackage
