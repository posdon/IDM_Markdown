/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl.impl;

import java.util.Collection;

import markHammil.mm.myDsl.ListExpression;
import markHammil.mm.myDsl.MyDslPackage;
import markHammil.mm.myDsl.TextExpression;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link markHammil.mm.myDsl.impl.ListExpressionImpl#getContentUnordered <em>Content Unordered</em>}</li>
 *   <li>{@link markHammil.mm.myDsl.impl.ListExpressionImpl#getContentOrdered <em>Content Ordered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListExpressionImpl extends MinimalEObjectImpl.Container implements ListExpression
{
  /**
	 * The cached value of the '{@link #getContentUnordered() <em>Content Unordered</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContentUnordered()
	 * @generated
	 * @ordered
	 */
  protected EList<TextExpression> contentUnordered;

  /**
	 * The cached value of the '{@link #getContentOrdered() <em>Content Ordered</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContentOrdered()
	 * @generated
	 * @ordered
	 */
  protected EList<TextExpression> contentOrdered;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ListExpressionImpl()
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
		return MyDslPackage.Literals.LIST_EXPRESSION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TextExpression> getContentUnordered()
  {
		if (contentUnordered == null) {
			contentUnordered = new EObjectContainmentEList<TextExpression>(TextExpression.class, this, MyDslPackage.LIST_EXPRESSION__CONTENT_UNORDERED);
		}
		return contentUnordered;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TextExpression> getContentOrdered()
  {
		if (contentOrdered == null) {
			contentOrdered = new EObjectContainmentEList<TextExpression>(TextExpression.class, this, MyDslPackage.LIST_EXPRESSION__CONTENT_ORDERED);
		}
		return contentOrdered;
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
			case MyDslPackage.LIST_EXPRESSION__CONTENT_UNORDERED:
				return ((InternalEList<?>)getContentUnordered()).basicRemove(otherEnd, msgs);
			case MyDslPackage.LIST_EXPRESSION__CONTENT_ORDERED:
				return ((InternalEList<?>)getContentOrdered()).basicRemove(otherEnd, msgs);
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
			case MyDslPackage.LIST_EXPRESSION__CONTENT_UNORDERED:
				return getContentUnordered();
			case MyDslPackage.LIST_EXPRESSION__CONTENT_ORDERED:
				return getContentOrdered();
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
			case MyDslPackage.LIST_EXPRESSION__CONTENT_UNORDERED:
				getContentUnordered().clear();
				getContentUnordered().addAll((Collection<? extends TextExpression>)newValue);
				return;
			case MyDslPackage.LIST_EXPRESSION__CONTENT_ORDERED:
				getContentOrdered().clear();
				getContentOrdered().addAll((Collection<? extends TextExpression>)newValue);
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
			case MyDslPackage.LIST_EXPRESSION__CONTENT_UNORDERED:
				getContentUnordered().clear();
				return;
			case MyDslPackage.LIST_EXPRESSION__CONTENT_ORDERED:
				getContentOrdered().clear();
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
			case MyDslPackage.LIST_EXPRESSION__CONTENT_UNORDERED:
				return contentUnordered != null && !contentUnordered.isEmpty();
			case MyDslPackage.LIST_EXPRESSION__CONTENT_ORDERED:
				return contentOrdered != null && !contentOrdered.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListExpressionImpl