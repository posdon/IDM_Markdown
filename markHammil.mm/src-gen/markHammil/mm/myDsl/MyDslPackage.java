/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see markHammil.mm.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mm.markHammil/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = markHammil.mm.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link markHammil.mm.myDsl.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see markHammil.mm.myDsl.impl.FileImpl
   * @see markHammil.mm.myDsl.impl.MyDslPackageImpl#getFile()
   * @generated
   */
  int FILE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link markHammil.mm.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see markHammil.mm.myDsl.impl.ExpressionImpl
   * @see markHammil.mm.myDsl.impl.MyDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link markHammil.mm.myDsl.impl.HeaderExpressionImpl <em>Header Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see markHammil.mm.myDsl.impl.HeaderExpressionImpl
   * @see markHammil.mm.myDsl.impl.MyDslPackageImpl#getHeaderExpression()
   * @generated
   */
  int HEADER_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_EXPRESSION__TITLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Header Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link markHammil.mm.myDsl.impl.EmphasisExpressionImpl <em>Emphasis Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see markHammil.mm.myDsl.impl.EmphasisExpressionImpl
   * @see markHammil.mm.myDsl.impl.MyDslPackageImpl#getEmphasisExpression()
   * @generated
   */
  int EMPHASIS_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPHASIS_EXPRESSION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Emphasis Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPHASIS_EXPRESSION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link markHammil.mm.myDsl.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see markHammil.mm.myDsl.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference list '{@link markHammil.mm.myDsl.File#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see markHammil.mm.myDsl.File#getExpression()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Expression();

  /**
   * Returns the meta object for class '{@link markHammil.mm.myDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see markHammil.mm.myDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link markHammil.mm.myDsl.HeaderExpression <em>Header Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Expression</em>'.
   * @see markHammil.mm.myDsl.HeaderExpression
   * @generated
   */
  EClass getHeaderExpression();

  /**
   * Returns the meta object for the containment reference '{@link markHammil.mm.myDsl.HeaderExpression#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see markHammil.mm.myDsl.HeaderExpression#getTitle()
   * @see #getHeaderExpression()
   * @generated
   */
  EReference getHeaderExpression_Title();

  /**
   * Returns the meta object for class '{@link markHammil.mm.myDsl.EmphasisExpression <em>Emphasis Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emphasis Expression</em>'.
   * @see markHammil.mm.myDsl.EmphasisExpression
   * @generated
   */
  EClass getEmphasisExpression();

  /**
   * Returns the meta object for the attribute '{@link markHammil.mm.myDsl.EmphasisExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see markHammil.mm.myDsl.EmphasisExpression#getValue()
   * @see #getEmphasisExpression()
   * @generated
   */
  EAttribute getEmphasisExpression_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link markHammil.mm.myDsl.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see markHammil.mm.myDsl.impl.FileImpl
     * @see markHammil.mm.myDsl.impl.MyDslPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__EXPRESSION = eINSTANCE.getFile_Expression();

    /**
     * The meta object literal for the '{@link markHammil.mm.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see markHammil.mm.myDsl.impl.ExpressionImpl
     * @see markHammil.mm.myDsl.impl.MyDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link markHammil.mm.myDsl.impl.HeaderExpressionImpl <em>Header Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see markHammil.mm.myDsl.impl.HeaderExpressionImpl
     * @see markHammil.mm.myDsl.impl.MyDslPackageImpl#getHeaderExpression()
     * @generated
     */
    EClass HEADER_EXPRESSION = eINSTANCE.getHeaderExpression();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADER_EXPRESSION__TITLE = eINSTANCE.getHeaderExpression_Title();

    /**
     * The meta object literal for the '{@link markHammil.mm.myDsl.impl.EmphasisExpressionImpl <em>Emphasis Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see markHammil.mm.myDsl.impl.EmphasisExpressionImpl
     * @see markHammil.mm.myDsl.impl.MyDslPackageImpl#getEmphasisExpression()
     * @generated
     */
    EClass EMPHASIS_EXPRESSION = eINSTANCE.getEmphasisExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPHASIS_EXPRESSION__VALUE = eINSTANCE.getEmphasisExpression_Value();

  }

} //MyDslPackage