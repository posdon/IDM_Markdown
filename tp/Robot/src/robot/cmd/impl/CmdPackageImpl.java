/**
 */
package robot.cmd.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robot.RobotPackage;
import robot.cflow.CflowPackage;

import robot.cflow.impl.CflowPackageImpl;

import robot.cmd.BipCmd;
import robot.cmd.CmdFactory;
import robot.cmd.CmdPackage;
import robot.cmd.CommandExp;
import robot.cmd.MoveCmd;
import robot.cmd.ObstacleCmd;
import robot.cmd.displayCmd;
import robot.cmd.hasTurnedCmd;
import robot.cmd.setTurnAngleCmd;
import robot.cmd.stopEngineCmd;
import robot.cmd.stopProgramCmd;
import robot.cmd.turnCmd;
import robot.impl.RobotPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmdPackageImpl extends EPackageImpl implements CmdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bipCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTurnAngleCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasTurnedCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEngineCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopProgramCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayCmdEClass = null;

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
	 * @see robot.cmd.CmdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CmdPackageImpl() {
		super(eNS_URI, CmdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CmdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CmdPackage init() {
		if (isInited) return (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Obtain or create and register package
		CmdPackageImpl theCmdPackage = (CmdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CmdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CmdPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RobotPackageImpl theRobotPackage = (RobotPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RobotPackage.eNS_URI) instanceof RobotPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RobotPackage.eNS_URI) : RobotPackage.eINSTANCE);
		CflowPackageImpl theCflowPackage = (CflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CflowPackage.eNS_URI) instanceof CflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CflowPackage.eNS_URI) : CflowPackage.eINSTANCE);

		// Create package meta-data objects
		theCmdPackage.createPackageContents();
		theRobotPackage.createPackageContents();
		theCflowPackage.createPackageContents();

		// Initialize created meta-data
		theCmdPackage.initializePackageContents();
		theRobotPackage.initializePackageContents();
		theCflowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCmdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CmdPackage.eNS_URI, theCmdPackage);
		return theCmdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandExp() {
		return commandExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstacleCmd() {
		return obstacleCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObstacleCmd_Distance() {
		return (EAttribute)obstacleCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveCmd() {
		return moveCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveCmd_Power() {
		return (EAttribute)moveCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBipCmd() {
		return bipCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBipCmd_Duration() {
		return (EAttribute)bipCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBipCmd_Power() {
		return (EAttribute)bipCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBipCmd_Repeat() {
		return (EAttribute)bipCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsetTurnAngleCmd() {
		return setTurnAngleCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsetTurnAngleCmd_Angle() {
		return (EAttribute)setTurnAngleCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethasTurnedCmd() {
		return hasTurnedCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gethasTurnedCmd_Angle() {
		return (EAttribute)hasTurnedCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstopEngineCmd() {
		return stopEngineCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getturnCmd() {
		return turnCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getturnCmd_Power() {
		return (EAttribute)turnCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getturnCmd_Angle() {
		return (EAttribute)turnCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstopProgramCmd() {
		return stopProgramCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdisplayCmd() {
		return displayCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdisplayCmd_Msg() {
		return (EAttribute)displayCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdisplayCmd_Duration() {
		return (EAttribute)displayCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdisplayCmd_Line() {
		return (EAttribute)displayCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdisplayCmd_Col() {
		return (EAttribute)displayCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdFactory getCmdFactory() {
		return (CmdFactory)getEFactoryInstance();
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
		commandExpEClass = createEClass(COMMAND_EXP);

		obstacleCmdEClass = createEClass(OBSTACLE_CMD);
		createEAttribute(obstacleCmdEClass, OBSTACLE_CMD__DISTANCE);

		moveCmdEClass = createEClass(MOVE_CMD);
		createEAttribute(moveCmdEClass, MOVE_CMD__POWER);

		bipCmdEClass = createEClass(BIP_CMD);
		createEAttribute(bipCmdEClass, BIP_CMD__DURATION);
		createEAttribute(bipCmdEClass, BIP_CMD__POWER);
		createEAttribute(bipCmdEClass, BIP_CMD__REPEAT);

		setTurnAngleCmdEClass = createEClass(SET_TURN_ANGLE_CMD);
		createEAttribute(setTurnAngleCmdEClass, SET_TURN_ANGLE_CMD__ANGLE);

		hasTurnedCmdEClass = createEClass(HAS_TURNED_CMD);
		createEAttribute(hasTurnedCmdEClass, HAS_TURNED_CMD__ANGLE);

		stopEngineCmdEClass = createEClass(STOP_ENGINE_CMD);

		turnCmdEClass = createEClass(TURN_CMD);
		createEAttribute(turnCmdEClass, TURN_CMD__POWER);
		createEAttribute(turnCmdEClass, TURN_CMD__ANGLE);

		stopProgramCmdEClass = createEClass(STOP_PROGRAM_CMD);

		displayCmdEClass = createEClass(DISPLAY_CMD);
		createEAttribute(displayCmdEClass, DISPLAY_CMD__MSG);
		createEAttribute(displayCmdEClass, DISPLAY_CMD__DURATION);
		createEAttribute(displayCmdEClass, DISPLAY_CMD__LINE);
		createEAttribute(displayCmdEClass, DISPLAY_CMD__COL);
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

		// Obtain other dependent packages
		CflowPackage theCflowPackage = (CflowPackage)EPackage.Registry.INSTANCE.getEPackage(CflowPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commandExpEClass.getESuperTypes().add(theCflowPackage.getExpression());
		obstacleCmdEClass.getESuperTypes().add(this.getCommandExp());
		moveCmdEClass.getESuperTypes().add(this.getCommandExp());
		bipCmdEClass.getESuperTypes().add(this.getCommandExp());
		setTurnAngleCmdEClass.getESuperTypes().add(this.getCommandExp());
		hasTurnedCmdEClass.getESuperTypes().add(this.getCommandExp());
		stopEngineCmdEClass.getESuperTypes().add(this.getCommandExp());
		turnCmdEClass.getESuperTypes().add(this.getCommandExp());
		stopProgramCmdEClass.getESuperTypes().add(this.getCommandExp());
		displayCmdEClass.getESuperTypes().add(this.getCommandExp());

		// Initialize classes, features, and operations; add parameters
		initEClass(commandExpEClass, CommandExp.class, "CommandExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(obstacleCmdEClass, ObstacleCmd.class, "ObstacleCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObstacleCmd_Distance(), ecorePackage.getEDouble(), "distance", null, 1, 1, ObstacleCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveCmdEClass, MoveCmd.class, "MoveCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveCmd_Power(), ecorePackage.getEDouble(), "power", null, 1, 1, MoveCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bipCmdEClass, BipCmd.class, "BipCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBipCmd_Duration(), ecorePackage.getEDouble(), "duration", null, 1, 1, BipCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBipCmd_Power(), ecorePackage.getEDouble(), "power", null, 1, 1, BipCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBipCmd_Repeat(), ecorePackage.getEBoolean(), "repeat", null, 1, 1, BipCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setTurnAngleCmdEClass, setTurnAngleCmd.class, "setTurnAngleCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsetTurnAngleCmd_Angle(), ecorePackage.getEDouble(), "angle", null, 1, 1, setTurnAngleCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasTurnedCmdEClass, hasTurnedCmd.class, "hasTurnedCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gethasTurnedCmd_Angle(), ecorePackage.getEDouble(), "angle", null, 1, 1, hasTurnedCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopEngineCmdEClass, stopEngineCmd.class, "stopEngineCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnCmdEClass, turnCmd.class, "turnCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getturnCmd_Power(), ecorePackage.getEDouble(), "power", null, 1, 1, turnCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getturnCmd_Angle(), ecorePackage.getEDouble(), "angle", null, 1, 1, turnCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopProgramCmdEClass, stopProgramCmd.class, "stopProgramCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayCmdEClass, displayCmd.class, "displayCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdisplayCmd_Msg(), ecorePackage.getEString(), "msg", null, 1, 1, displayCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdisplayCmd_Duration(), ecorePackage.getEDouble(), "duration", null, 1, 1, displayCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdisplayCmd_Line(), ecorePackage.getEInt(), "line", null, 1, 1, displayCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdisplayCmd_Col(), ecorePackage.getEInt(), "col", null, 1, 1, displayCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CmdPackageImpl
