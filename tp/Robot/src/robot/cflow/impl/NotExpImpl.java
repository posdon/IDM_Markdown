/**
 */
package robot.cflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.cflow.BooleanExp;
import robot.cflow.CflowPackage;
import robot.cflow.NotExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.cflow.impl.NotExpImpl#getOperande <em>Operande</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotExpImpl extends BooleanExpImpl implements NotExp {
	/**
	 * The cached value of the '{@link #getOperande() <em>Operande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperande()
	 * @generated
	 * @ordered
	 */
	protected BooleanExp operande;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CflowPackage.Literals.NOT_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExp getOperande() {
		return operande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperande(BooleanExp newOperande, NotificationChain msgs) {
		BooleanExp oldOperande = operande;
		operande = newOperande;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CflowPackage.NOT_EXP__OPERANDE, oldOperande, newOperande);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperande(BooleanExp newOperande) {
		if (newOperande != operande) {
			NotificationChain msgs = null;
			if (operande != null)
				msgs = ((InternalEObject)operande).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CflowPackage.NOT_EXP__OPERANDE, null, msgs);
			if (newOperande != null)
				msgs = ((InternalEObject)newOperande).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CflowPackage.NOT_EXP__OPERANDE, null, msgs);
			msgs = basicSetOperande(newOperande, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CflowPackage.NOT_EXP__OPERANDE, newOperande, newOperande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CflowPackage.NOT_EXP__OPERANDE:
				return basicSetOperande(null, msgs);
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
			case CflowPackage.NOT_EXP__OPERANDE:
				return getOperande();
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
			case CflowPackage.NOT_EXP__OPERANDE:
				setOperande((BooleanExp)newValue);
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
			case CflowPackage.NOT_EXP__OPERANDE:
				setOperande((BooleanExp)null);
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
			case CflowPackage.NOT_EXP__OPERANDE:
				return operande != null;
		}
		return super.eIsSet(featureID);
	}

} //NotExpImpl
