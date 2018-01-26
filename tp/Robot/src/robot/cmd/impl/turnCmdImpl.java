/**
 */
package robot.cmd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.cmd.CmdPackage;
import robot.cmd.turnCmd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>turn Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.cmd.impl.turnCmdImpl#getPower <em>Power</em>}</li>
 *   <li>{@link robot.cmd.impl.turnCmdImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class turnCmdImpl extends CommandExpImpl implements turnCmd {
	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected double power = POWER_EDEFAULT;

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
	protected turnCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmdPackage.Literals.TURN_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(double newPower) {
		double oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmdPackage.TURN_CMD__POWER, oldPower, power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmdPackage.TURN_CMD__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CmdPackage.TURN_CMD__POWER:
				return getPower();
			case CmdPackage.TURN_CMD__ANGLE:
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
			case CmdPackage.TURN_CMD__POWER:
				setPower((Double)newValue);
				return;
			case CmdPackage.TURN_CMD__ANGLE:
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
			case CmdPackage.TURN_CMD__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case CmdPackage.TURN_CMD__ANGLE:
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
			case CmdPackage.TURN_CMD__POWER:
				return power != POWER_EDEFAULT;
			case CmdPackage.TURN_CMD__ANGLE:
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
		result.append(" (power: ");
		result.append(power);
		result.append(", angle: ");
		result.append(angle);
		result.append(')');
		return result.toString();
	}

} //turnCmdImpl
