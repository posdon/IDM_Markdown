/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl.impl;

import java.util.Collection;

import markHammil.mm.myDsl.EmphasisExpression;
import markHammil.mm.myDsl.MyDslPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emphasis Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markHammil.mm.myDsl.impl.EmphasisExpressionImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmphasisExpressionImpl extends MinimalEObjectImpl.Container implements EmphasisExpression
{
  /**
	 * The cached value of the '{@link #getC() <em>C</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
  protected EList<EmphasisExpression> c;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EmphasisExpressionImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return MyDslPackage.Literals.EMPHASIS_EXPRESSION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<EmphasisExpression> getC()
  {
		if (c == null) {
			c = new EObjectContainmentEList<EmphasisExpression>(EmphasisExpression.class, this, MyDslPackage.EMPHASIS_EXPRESSION__C);
		}
		return c;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case MyDslPackage.EMPHASIS_EXPRESSION__C:
				return ((InternalEList<?>)getC()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case MyDslPackage.EMPHASIS_EXPRESSION__C:
				return getC();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case MyDslPackage.EMPHASIS_EXPRESSION__C:
				getC().clear();
				getC().addAll((Collection<? extends EmphasisExpression>)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case MyDslPackage.EMPHASIS_EXPRESSION__C:
				getC().clear();
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case MyDslPackage.EMPHASIS_EXPRESSION__C:
				return c != null && !c.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EmphasisExpressionImpl
