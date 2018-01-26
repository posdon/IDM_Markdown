/**
 */
package robot.cflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.cflow.AndExp;
import robot.cflow.BooleanExp;
import robot.cflow.CflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.cflow.impl.AndExpImpl#getLeftOperande <em>Left Operande</em>}</li>
 *   <li>{@link robot.cflow.impl.AndExpImpl#getRightOperande <em>Right Operande</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndExpImpl extends BooleanExpImpl implements AndExp {
	/**
	 * The cached value of the '{@link #getLeftOperande() <em>Left Operande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperande()
	 * @generated
	 * @ordered
	 */
	protected BooleanExp leftOperande;

	/**
	 * The cached value of the '{@link #getRightOperande() <em>Right Operande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperande()
	 * @generated
	 * @ordered
	 */
	protected BooleanExp rightOperande;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CflowPackage.Literals.AND_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExp getLeftOperande() {
		return leftOperande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftOperande(BooleanExp newLeftOperande, NotificationChain msgs) {
		BooleanExp oldLeftOperande = leftOperande;
		leftOperande = newLeftOperande;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CflowPackage.AND_EXP__LEFT_OPERANDE, oldLeftOperande, newLeftOperande);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftOperande(BooleanExp newLeftOperande) {
		if (newLeftOperande != leftOperande) {
			NotificationChain msgs = null;
			if (leftOperande != null)
				msgs = ((InternalEObject)leftOperande).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CflowPackage.AND_EXP__LEFT_OPERANDE, null, msgs);
			if (newLeftOperande != null)
				msgs = ((InternalEObject)newLeftOperande).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CflowPackage.AND_EXP__LEFT_OPERANDE, null, msgs);
			msgs = basicSetLeftOperande(newLeftOperande, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CflowPackage.AND_EXP__LEFT_OPERANDE, newLeftOperande, newLeftOperande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExp getRightOperande() {
		return rightOperande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightOperande(BooleanExp newRightOperande, NotificationChain msgs) {
		BooleanExp oldRightOperande = rightOperande;
		rightOperande = newRightOperande;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CflowPackage.AND_EXP__RIGHT_OPERANDE, oldRightOperande, newRightOperande);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightOperande(BooleanExp newRightOperande) {
		if (newRightOperande != rightOperande) {
			NotificationChain msgs = null;
			if (rightOperande != null)
				msgs = ((InternalEObject)rightOperande).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CflowPackage.AND_EXP__RIGHT_OPERANDE, null, msgs);
			if (newRightOperande != null)
				msgs = ((InternalEObject)newRightOperande).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CflowPackage.AND_EXP__RIGHT_OPERANDE, null, msgs);
			msgs = basicSetRightOperande(newRightOperande, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CflowPackage.AND_EXP__RIGHT_OPERANDE, newRightOperande, newRightOperande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CflowPackage.AND_EXP__LEFT_OPERANDE:
				return basicSetLeftOperande(null, msgs);
			case CflowPackage.AND_EXP__RIGHT_OPERANDE:
				return basicSetRightOperande(null, msgs);
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
			case CflowPackage.AND_EXP__LEFT_OPERANDE:
				return getLeftOperande();
			case CflowPackage.AND_EXP__RIGHT_OPERANDE:
				return getRightOperande();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CflowPackage.AND_EXP__LEFT_OPERANDE:
				setLeftOperande((BooleanExp)newValue);
				return;
			case CflowPackage.AND_EXP__RIGHT_OPERANDE:
				setRightOperande((BooleanExp)newValue);
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
			case CflowPackage.AND_EXP__LEFT_OPERANDE:
				setLeftOperande((BooleanExp)null);
				return;
			case CflowPackage.AND_EXP__RIGHT_OPERANDE:
				setRightOperande((BooleanExp)null);
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
			case CflowPackage.AND_EXP__LEFT_OPERANDE:
				return leftOperande != null;
			case CflowPackage.AND_EXP__RIGHT_OPERANDE:
				return rightOperande != null;
		}
		return super.eIsSet(featureID);
	}

} //AndExpImpl
