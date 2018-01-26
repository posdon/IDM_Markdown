/**
 */
package robot.cflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see robot.cflow.CflowPackage
 * @generated
 */
public interface CflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CflowFactory eINSTANCE = robot.cflow.impl.CflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Loop Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Exp</em>'.
	 * @generated
	 */
	LoopExp createLoopExp();

	/**
	 * Returns a new object of class '<em>Conditional Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Exp</em>'.
	 * @generated
	 */
	ConditionalExp createConditionalExp();

	/**
	 * Returns a new object of class '<em>Not Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Exp</em>'.
	 * @generated
	 */
	NotExp createNotExp();

	/**
	 * Returns a new object of class '<em>And Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Exp</em>'.
	 * @generated
	 */
	AndExp createAndExp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CflowPackage getCflowPackage();

} //CflowFactory
