/**
 */
package robot.cflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robot.RobotPackage;
import robot.cflow.AndExp;
import robot.cflow.BooleanExp;
import robot.cflow.CflowFactory;
import robot.cflow.CflowPackage;
import robot.cflow.ConditionalExp;
import robot.cflow.Expression;
import robot.cflow.LoopExp;
import robot.cflow.NotExp;
import robot.cmd.CmdPackage;

import robot.cmd.impl.CmdPackageImpl;
import robot.impl.RobotPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CflowPackageImpl extends EPackageImpl implements CflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see robot.cflow.CflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CflowPackageImpl() {
		super(eNS_URI, CflowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CflowPackage init() {
		if (isInited) return (CflowPackage)EPackage.Registry.INSTANCE.getEPackage(CflowPackage.eNS_URI);

		// Obtain or create and register package
		CflowPackageImpl theCflowPackage = (CflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CflowPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RobotPackageImpl theRobotPackage = (RobotPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RobotPackage.eNS_URI) instanceof RobotPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RobotPackage.eNS_URI) : RobotPackage.eINSTANCE);
		CmdPackageImpl theCmdPackage = (CmdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI) instanceof CmdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI) : CmdPackage.eINSTANCE);

		// Create package meta-data objects
		theCflowPackage.createPackageContents();
		theRobotPackage.createPackageContents();
		theCmdPackage.createPackageContents();

		// Initialize created meta-data
		theCflowPackage.initializePackageContents();
		theRobotPackage.initializePackageContents();
		theCmdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CflowPackage.eNS_URI, theCflowPackage);
		return theCflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopExp() {
		return loopExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopExp_Body() {
		return (EReference)loopExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopExp_Condition() {
		return (EReference)loopExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExp() {
		return conditionalExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExp_Then() {
		return (EReference)conditionalExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExp_Else() {
		return (EReference)conditionalExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExp_Condition() {
		return (EReference)conditionalExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExp() {
		return booleanExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotExp() {
		return notExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotExp_Operande() {
		return (EReference)notExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExp() {
		return andExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExp_LeftOperande() {
		return (EReference)andExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExp_RightOperande() {
		return (EReference)andExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CflowFactory getCflowFactory() {
		return (CflowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		expressionEClass = createEClass(EXPRESSION);

		loopExpEClass = createEClass(LOOP_EXP);
		createEReference(loopExpEClass, LOOP_EXP__BODY);
		createEReference(loopExpEClass, LOOP_EXP__CONDITION);

		conditionalExpEClass = createEClass(CONDITIONAL_EXP);
		createEReference(conditionalExpEClass, CONDITIONAL_EXP__THEN);
		createEReference(conditionalExpEClass, CONDITIONAL_EXP__ELSE);
		createEReference(conditionalExpEClass, CONDITIONAL_EXP__CONDITION);

		booleanExpEClass = createEClass(BOOLEAN_EXP);

		notExpEClass = createEClass(NOT_EXP);
		createEReference(notExpEClass, NOT_EXP__OPERANDE);

		andExpEClass = createEClass(AND_EXP);
		createEReference(andExpEClass, AND_EXP__LEFT_OPERANDE);
		createEReference(andExpEClass, AND_EXP__RIGHT_OPERANDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		loopExpEClass.getESuperTypes().add(this.getExpression());
		conditionalExpEClass.getESuperTypes().add(this.getExpression());
		booleanExpEClass.getESuperTypes().add(this.getExpression());
		notExpEClass.getESuperTypes().add(this.getBooleanExp());
		andExpEClass.getESuperTypes().add(this.getBooleanExp());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopExpEClass, LoopExp.class, "LoopExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopExp_Body(), this.getExpression(), null, "body", null, 0, -1, LoopExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopExp_Condition(), this.getBooleanExp(), null, "condition", null, 1, 1, LoopExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalExpEClass, ConditionalExp.class, "ConditionalExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalExp_Then(), this.getExpression(), null, "then", null, 0, -1, ConditionalExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExp_Else(), this.getExpression(), null, "else", null, 0, -1, ConditionalExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExp_Condition(), this.getBooleanExp(), null, "condition", null, 1, 1, ConditionalExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpEClass, BooleanExp.class, "BooleanExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notExpEClass, NotExp.class, "NotExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotExp_Operande(), this.getBooleanExp(), null, "operande", null, 1, 1, NotExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andExpEClass, AndExp.class, "AndExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndExp_LeftOperande(), this.getBooleanExp(), null, "leftOperande", null, 1, 1, AndExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndExp_RightOperande(), this.getBooleanExp(), null, "rightOperande", null, 1, 1, AndExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CflowPackageImpl
