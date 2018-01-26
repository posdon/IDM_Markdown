/**
 */
package robot.cflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robot.cflow.BooleanExp;
import robot.cflow.CflowPackage;
import robot.cflow.ConditionalExp;
import robot.cflow.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.cflow.impl.ConditionalExpImpl#getThen <em>Then</em>}</li>
 *   <li>{@link robot.cflow.impl.ConditionalExpImpl#getElse <em>Else</em>}</li>
 *   <li>{@link robot.cflow.impl.ConditionalExpImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpImpl extends ExpressionImpl implements ConditionalExp {
	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> else_;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected BooleanExp condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CflowPackage.Literals.CONDITIONAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getThen() {
		if (then == null) {
			then = new EObjectContainmentEList<Expression>(Expression.class, this, CflowPackage.CONDITIONAL_EXP__THEN);
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getElse() {
		if (else_ == null) {
			else_ = new EObjectContainmentEList<Expression>(Expression.class, this, CflowPackage.CONDITIONAL_EXP__ELSE);
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExp getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(BooleanExp newCondition, NotificationChain msgs) {
		BooleanExp oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CflowPackage.CONDITIONAL_EXP__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(BooleanExp newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CflowPackage.CONDITIONAL_EXP__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CflowPackage.CONDITIONAL_EXP__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CflowPackage.CONDITIONAL_EXP__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CflowPackage.CONDITIONAL_EXP__THEN:
				return ((InternalEList<?>)getThen()).basicRemove(otherEnd, msgs);
			case CflowPackage.CONDITIONAL_EXP__ELSE:
				return ((InternalEList<?>)getElse()).basicRemove(otherEnd, msgs);
			case CflowPackage.CONDITIONAL_EXP__CONDITION:
				return basicSetCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CflowPackage.CONDITIONAL_EXP__THEN:
				return getThen();
			case CflowPackage.CONDITIONAL_EXP__ELSE:
				return getElse();
			case CflowPackage.CONDITIONAL_EXP__CONDITION:
				return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CflowPackage.CONDITIONAL_EXP__THEN:
				getThen().clear();
				getThen().addAll((Collection<? extends Expression>)newValue);
				return;
			case CflowPackage.CONDITIONAL_EXP__ELSE:
				getElse().clear();
				getElse().addAll((Collection<? extends Expression>)newValue);
				return;
			case CflowPackage.CONDITIONAL_EXP__CONDITION:
				setCondition((BooleanExp)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CflowPackage.CONDITIONAL_EXP__THEN:
				getThen().clear();
				return;
			case CflowPackage.CONDITIONAL_EXP__ELSE:
				getElse().clear();
				return;
			case CflowPackage.CONDITIONAL_EXP__CONDITION:
				setCondition((BooleanExp)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CflowPackage.CONDITIONAL_EXP__THEN:
				return then != null && !then.isEmpty();
			case CflowPackage.CONDITIONAL_EXP__ELSE:
				return else_ != null && !else_.isEmpty();
			case CflowPackage.CONDITIONAL_EXP__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpImpl
