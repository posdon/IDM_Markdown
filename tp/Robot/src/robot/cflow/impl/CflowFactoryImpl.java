/**
 */
package robot.cflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robot.cflow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CflowFactoryImpl extends EFactoryImpl implements CflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CflowFactory init() {
		try {
			CflowFactory theCflowFactory = (CflowFactory)EPackage.Registry.INSTANCE.getEFactory(CflowPackage.eNS_URI);
			if (theCflowFactory != null) {
				return theCflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CflowPackage.LOOP_EXP: return createLoopExp();
			case CflowPackage.CONDITIONAL_EXP: return createConditionalExp();
			case CflowPackage.NOT_EXP: return createNotExp();
			case CflowPackage.AND_EXP: return createAndExp();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopExp createLoopExp() {
		LoopExpImpl loopExp = new LoopExpImpl();
		return loopExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExp createConditionalExp() {
		ConditionalExpImpl conditionalExp = new ConditionalExpImpl();
		return conditionalExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotExp createNotExp() {
		NotExpImpl notExp = new NotExpImpl();
		return notExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExp createAndExp() {
		AndExpImpl andExp = new AndExpImpl();
		return andExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CflowPackage getCflowPackage() {
		return (CflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CflowPackage getPackage() {
		return CflowPackage.eINSTANCE;
	}

} //CflowFactoryImpl
