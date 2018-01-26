/**
 */
package robot.cflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.cflow.AndExp#getLeftOperande <em>Left Operande</em>}</li>
 *   <li>{@link robot.cflow.AndExp#getRightOperande <em>Right Operande</em>}</li>
 * </ul>
 *
 * @see robot.cflow.CflowPackage#getAndExp()
 * @model
 * @generated
 */
public interface AndExp extends BooleanExp {
	/**
	 * Returns the value of the '<em><b>Left Operande</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operande</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operande</em>' containment reference.
	 * @see #setLeftOperande(BooleanExp)
	 * @see robot.cflow.CflowPackage#getAndExp_LeftOperande()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExp getLeftOperande();

	/**
	 * Sets the value of the '{@link robot.cflow.AndExp#getLeftOperande <em>Left Operande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operande</em>' containment reference.
	 * @see #getLeftOperande()
	 * @generated
	 */
	void setLeftOperande(BooleanExp value);

	/**
	 * Returns the value of the '<em><b>Right Operande</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operande</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operande</em>' containment reference.
	 * @see #setRightOperande(BooleanExp)
	 * @see robot.cflow.CflowPackage#getAndExp_RightOperande()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExp getRightOperande();

	/**
	 * Sets the value of the '{@link robot.cflow.AndExp#getRightOperande <em>Right Operande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operande</em>' containment reference.
	 * @see #getRightOperande()
	 * @generated
	 */
	void setRightOperande(BooleanExp value);

} // AndExp
