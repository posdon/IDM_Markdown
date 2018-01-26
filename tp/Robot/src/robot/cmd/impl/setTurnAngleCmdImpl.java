/**
 */
package robot.cmd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.cmd.CmdPackage;
import robot.cmd.setTurnAngleCmd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>set Turn Angle Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.cmd.impl.setTurnAngleCmdImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class setTurnAngleCmdImpl extends CommandExpImpl implements setTurnAngleCmd {
	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected double angle = ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected setTurnAngleCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmdPackage.Literals.SET_TURN_ANGLE_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(double newAngle) {
		double oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmdPackage.SET_TURN_ANGLE_CMD__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CmdPackage.SET_TURN_ANGLE_CMD__ANGLE:
				return getAngle();
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
			case CmdPackage.SET_TURN_ANGLE_CMD__ANGLE:
				setAngle((Double)newValue);
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
			case CmdPackage.SET_TURN_ANGLE_CMD__ANGLE:
				setAngle(ANGLE_EDEFAULT);
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
			case CmdPackage.SET_TURN_ANGLE_CMD__ANGLE:
				return angle != ANGLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (angle: ");
		result.append(angle);
		result.append(')');
		return result.toString();
	}

} //setTurnAngleCmdImpl
