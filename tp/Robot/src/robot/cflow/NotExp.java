/**
 */
package robot.cflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.cflow.NotExp#getOperande <em>Operande</em>}</li>
 * </ul>
 *
 * @see robot.cflow.CflowPackage#getNotExp()
 * @model
 * @generated
 */
public interface NotExp extends BooleanExp {
	/**
	 * Returns the value of the '<em><b>Operande</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operande</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operande</em>' containment reference.
	 * @see #setOperande(BooleanExp)
	 * @see robot.cflow.CflowPackage#getNotExp_Operande()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExp getOperande();

	/**
	 * Sets the value of the '{@link robot.cflow.NotExp#getOperande <em>Operande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operande</em>' containment reference.
	 * @see #getOperande()
	 * @generated
	 */
	void setOperande(BooleanExp value);

} // NotExp
