/**
 */
package markdown;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see markdown.MarkdownFactory
 * @model kind="package"
 * @generated
 */
public interface MarkdownPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "markdown";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/markdown";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "markdown";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkdownPackage eINSTANCE = markdown.impl.MarkdownPackageImpl.init();

	/**
	 * The meta object id for the '{@link markdown.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.FileImpl
	 * @see markdown.impl.MarkdownPackageImpl#getFile()
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
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link markdown.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.ExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getExpression()
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
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link markdown.impl.HeaderExpressionImpl <em>Header Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.HeaderExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getHeaderExpression()
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
	 * The number of operations of the '<em>Header Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.TextExpressionImpl <em>Text Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.TextExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getTextExpression()
	 * @generated
	 */
	int TEXT_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Text Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.TableExpressionImpl <em>Table Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.TableExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getTableExpression()
	 * @generated
	 */
	int TABLE_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Tablelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_EXPRESSION__TABLELINES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.TableLineImpl <em>Table Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.TableLineImpl
	 * @see markdown.impl.MarkdownPackageImpl#getTableLine()
	 * @generated
	 */
	int TABLE_LINE = 5;

	/**
	 * The feature id for the '<em><b>Cell Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LINE__CELL_CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Table Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link markdown.impl.HorizontalExpressionImpl <em>Horizontal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.HorizontalExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getHorizontalExpression()
	 * @generated
	 */
	int HORIZONTAL_EXPRESSION = 6;

	/**
	 * The number of structural features of the '<em>Horizontal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_EXPRESSION_FEATURE_COUNT = TEXT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_EXPRESSION_OPERATION_COUNT = TEXT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.ListExpressionImpl <em>List Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.ListExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getListExpression()
	 * @generated
	 */
	int LIST_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Starting Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EXPRESSION__STARTING_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EXPRESSION__LIST_CONTENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.QuoteExpressionImpl <em>Quote Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.QuoteExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getQuoteExpression()
	 * @generated
	 */
	int QUOTE_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Textexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_EXPRESSION__TEXTEXPRESSION = TEXT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quote Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_EXPRESSION_FEATURE_COUNT = TEXT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quote Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_EXPRESSION_OPERATION_COUNT = TEXT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.LineBreakExpressionImpl <em>Line Break Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.LineBreakExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getLineBreakExpression()
	 * @generated
	 */
	int LINE_BREAK_EXPRESSION = 9;

	/**
	 * The number of structural features of the '<em>Line Break Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Break Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.EmphasisExpressionImpl <em>Emphasis Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.EmphasisExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getEmphasisExpression()
	 * @generated
	 */
	int EMPHASIS_EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Emphasis Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_EXPRESSION_FEATURE_COUNT = TEXT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Emphasis Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_EXPRESSION_OPERATION_COUNT = TEXT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.ItalicExpressionImpl <em>Italic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.ItalicExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getItalicExpression()
	 * @generated
	 */
	int ITALIC_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_EXPRESSION__CONTENT = EMPHASIS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Italic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_EXPRESSION_FEATURE_COUNT = EMPHASIS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Italic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_EXPRESSION_OPERATION_COUNT = EMPHASIS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.StrongExpressionImpl <em>Strong Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.StrongExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getStrongExpression()
	 * @generated
	 */
	int STRONG_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EXPRESSION__CONTENT = EMPHASIS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strong Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EXPRESSION_FEATURE_COUNT = EMPHASIS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Strong Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EXPRESSION_OPERATION_COUNT = EMPHASIS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.ScratchExpressionImpl <em>Scratch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.ScratchExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getScratchExpression()
	 * @generated
	 */
	int SCRATCH_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_EXPRESSION__CONTENT = EMPHASIS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scratch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_EXPRESSION_FEATURE_COUNT = EMPHASIS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scratch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_EXPRESSION_OPERATION_COUNT = EMPHASIS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.HTMLExpressionImpl <em>HTML Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.HTMLExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getHTMLExpression()
	 * @generated
	 */
	int HTML_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_EXPRESSION__TEXT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HTML Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HTML Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.CodeExpressionImpl <em>Code Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.CodeExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getCodeExpression()
	 * @generated
	 */
	int CODE_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EXPRESSION__TEXT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.ReferenceExpressionImpl <em>Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.ReferenceExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getReferenceExpression()
	 * @generated
	 */
	int REFERENCE_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.LinkExpressionImpl <em>Link Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.LinkExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getLinkExpression()
	 * @generated
	 */
	int LINK_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Text URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXPRESSION__TEXT_URL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Referenced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXPRESSION__IS_REFERENCED = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.ImageExpressionImpl <em>Image Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.ImageExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getImageExpression()
	 * @generated
	 */
	int IMAGE_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Text URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EXPRESSION__TEXT_URL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Referenced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EXPRESSION__IS_REFERENCED = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.VideoExpressionImpl <em>Video Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.VideoExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getVideoExpression()
	 * @generated
	 */
	int VIDEO_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Text URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_EXPRESSION__TEXT_URL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text IMG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_EXPRESSION__TEXT_IMG = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Referenced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_EXPRESSION__IS_REFERENCED = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Video Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Video Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.HeaderDepth1ExpressionImpl <em>Header Depth1 Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.HeaderDepth1ExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth1Expression()
	 * @generated
	 */
	int HEADER_DEPTH1_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH1_EXPRESSION__TITLE = HEADER_EXPRESSION__TITLE;

	/**
	 * The number of structural features of the '<em>Header Depth1 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH1_EXPRESSION_FEATURE_COUNT = HEADER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header Depth1 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH1_EXPRESSION_OPERATION_COUNT = HEADER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.HeaderDepth2ExpressionImpl <em>Header Depth2 Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.HeaderDepth2ExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth2Expression()
	 * @generated
	 */
	int HEADER_DEPTH2_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH2_EXPRESSION__TITLE = HEADER_EXPRESSION__TITLE;

	/**
	 * The number of structural features of the '<em>Header Depth2 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH2_EXPRESSION_FEATURE_COUNT = HEADER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header Depth2 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH2_EXPRESSION_OPERATION_COUNT = HEADER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.HeaderDepth3ExpressionImpl <em>Header Depth3 Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.HeaderDepth3ExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth3Expression()
	 * @generated
	 */
	int HEADER_DEPTH3_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH3_EXPRESSION__TITLE = HEADER_EXPRESSION__TITLE;

	/**
	 * The number of structural features of the '<em>Header Depth3 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH3_EXPRESSION_FEATURE_COUNT = HEADER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header Depth3 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH3_EXPRESSION_OPERATION_COUNT = HEADER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.HeaderDepth5ExpressionImpl <em>Header Depth5 Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.HeaderDepth5ExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth5Expression()
	 * @generated
	 */
	int HEADER_DEPTH5_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH5_EXPRESSION__TITLE = HEADER_EXPRESSION__TITLE;

	/**
	 * The number of structural features of the '<em>Header Depth5 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH5_EXPRESSION_FEATURE_COUNT = HEADER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header Depth5 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH5_EXPRESSION_OPERATION_COUNT = HEADER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.HeaderDepth6ExpressionImpl <em>Header Depth6 Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.HeaderDepth6ExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth6Expression()
	 * @generated
	 */
	int HEADER_DEPTH6_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH6_EXPRESSION__TITLE = HEADER_EXPRESSION__TITLE;

	/**
	 * The number of structural features of the '<em>Header Depth6 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH6_EXPRESSION_FEATURE_COUNT = HEADER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header Depth6 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH6_EXPRESSION_OPERATION_COUNT = HEADER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.HeaderDepth4ExpressionImpl <em>Header Depth4 Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.HeaderDepth4ExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth4Expression()
	 * @generated
	 */
	int HEADER_DEPTH4_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH4_EXPRESSION__TITLE = HEADER_EXPRESSION__TITLE;

	/**
	 * The number of structural features of the '<em>Header Depth4 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH4_EXPRESSION_FEATURE_COUNT = HEADER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header Depth4 Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_DEPTH4_EXPRESSION_OPERATION_COUNT = HEADER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link markdown.impl.TextualExpressionImpl <em>Textual Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see markdown.impl.TextualExpressionImpl
	 * @see markdown.impl.MarkdownPackageImpl#getTextualExpression()
	 * @generated
	 */
	int TEXTUAL_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Content String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__CONTENT_STRING = EMPHASIS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION_FEATURE_COUNT = EMPHASIS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Textual Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION_OPERATION_COUNT = EMPHASIS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link markdown.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see markdown.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link markdown.File#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see markdown.File#getExpression()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Expression();

	/**
	 * Returns the meta object for class '{@link markdown.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see markdown.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link markdown.HeaderExpression <em>Header Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Expression</em>'.
	 * @see markdown.HeaderExpression
	 * @generated
	 */
	EClass getHeaderExpression();

	/**
	 * Returns the meta object for the containment reference '{@link markdown.HeaderExpression#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see markdown.HeaderExpression#getTitle()
	 * @see #getHeaderExpression()
	 * @generated
	 */
	EReference getHeaderExpression_Title();

	/**
	 * Returns the meta object for class '{@link markdown.TextExpression <em>Text Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Expression</em>'.
	 * @see markdown.TextExpression
	 * @generated
	 */
	EClass getTextExpression();

	/**
	 * Returns the meta object for class '{@link markdown.TableExpression <em>Table Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Expression</em>'.
	 * @see markdown.TableExpression
	 * @generated
	 */
	EClass getTableExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link markdown.TableExpression#getTablelines <em>Tablelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablelines</em>'.
	 * @see markdown.TableExpression#getTablelines()
	 * @see #getTableExpression()
	 * @generated
	 */
	EReference getTableExpression_Tablelines();

	/**
	 * Returns the meta object for class '{@link markdown.TableLine <em>Table Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Line</em>'.
	 * @see markdown.TableLine
	 * @generated
	 */
	EClass getTableLine();

	/**
	 * Returns the meta object for the containment reference list '{@link markdown.TableLine#getCellContent <em>Cell Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Content</em>'.
	 * @see markdown.TableLine#getCellContent()
	 * @see #getTableLine()
	 * @generated
	 */
	EReference getTableLine_CellContent();

	/**
	 * Returns the meta object for class '{@link markdown.HorizontalExpression <em>Horizontal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Expression</em>'.
	 * @see markdown.HorizontalExpression
	 * @generated
	 */
	EClass getHorizontalExpression();

	/**
	 * Returns the meta object for class '{@link markdown.ListExpression <em>List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Expression</em>'.
	 * @see markdown.ListExpression
	 * @generated
	 */
	EClass getListExpression();

	/**
	 * Returns the meta object for the attribute '{@link markdown.ListExpression#getStartingValue <em>Starting Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Value</em>'.
	 * @see markdown.ListExpression#getStartingValue()
	 * @see #getListExpression()
	 * @generated
	 */
	EAttribute getListExpression_StartingValue();

	/**
	 * Returns the meta object for the containment reference list '{@link markdown.ListExpression#getListContent <em>List Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Content</em>'.
	 * @see markdown.ListExpression#getListContent()
	 * @see #getListExpression()
	 * @generated
	 */
	EReference getListExpression_ListContent();

	/**
	 * Returns the meta object for class '{@link markdown.QuoteExpression <em>Quote Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quote Expression</em>'.
	 * @see markdown.QuoteExpression
	 * @generated
	 */
	EClass getQuoteExpression();

	/**
	 * Returns the meta object for the containment reference '{@link markdown.QuoteExpression#getTextexpression <em>Textexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textexpression</em>'.
	 * @see markdown.QuoteExpression#getTextexpression()
	 * @see #getQuoteExpression()
	 * @generated
	 */
	EReference getQuoteExpression_Textexpression();

	/**
	 * Returns the meta object for class '{@link markdown.LineBreakExpression <em>Line Break Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Break Expression</em>'.
	 * @see markdown.LineBreakExpression
	 * @generated
	 */
	EClass getLineBreakExpression();

	/**
	 * Returns the meta object for class '{@link markdown.EmphasisExpression <em>Emphasis Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasis Expression</em>'.
	 * @see markdown.EmphasisExpression
	 * @generated
	 */
	EClass getEmphasisExpression();

	/**
	 * Returns the meta object for class '{@link markdown.ItalicExpression <em>Italic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic Expression</em>'.
	 * @see markdown.ItalicExpression
	 * @generated
	 */
	EClass getItalicExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link markdown.ItalicExpression#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see markdown.ItalicExpression#getContent()
	 * @see #getItalicExpression()
	 * @generated
	 */
	EReference getItalicExpression_Content();

	/**
	 * Returns the meta object for class '{@link markdown.StrongExpression <em>Strong Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Expression</em>'.
	 * @see markdown.StrongExpression
	 * @generated
	 */
	EClass getStrongExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link markdown.StrongExpression#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see markdown.StrongExpression#getContent()
	 * @see #getStrongExpression()
	 * @generated
	 */
	EReference getStrongExpression_Content();

	/**
	 * Returns the meta object for class '{@link markdown.ScratchExpression <em>Scratch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scratch Expression</em>'.
	 * @see markdown.ScratchExpression
	 * @generated
	 */
	EClass getScratchExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link markdown.ScratchExpression#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see markdown.ScratchExpression#getContent()
	 * @see #getScratchExpression()
	 * @generated
	 */
	EReference getScratchExpression_Content();

	/**
	 * Returns the meta object for class '{@link markdown.HTMLExpression <em>HTML Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Expression</em>'.
	 * @see markdown.HTMLExpression
	 * @generated
	 */
	EClass getHTMLExpression();

	/**
	 * Returns the meta object for the attribute '{@link markdown.HTMLExpression#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see markdown.HTMLExpression#getText()
	 * @see #getHTMLExpression()
	 * @generated
	 */
	EAttribute getHTMLExpression_Text();

	/**
	 * Returns the meta object for class '{@link markdown.CodeExpression <em>Code Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Expression</em>'.
	 * @see markdown.CodeExpression
	 * @generated
	 */
	EClass getCodeExpression();

	/**
	 * Returns the meta object for the attribute '{@link markdown.CodeExpression#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see markdown.CodeExpression#getText()
	 * @see #getCodeExpression()
	 * @generated
	 */
	EAttribute getCodeExpression_Text();

	/**
	 * Returns the meta object for class '{@link markdown.ReferenceExpression <em>Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Expression</em>'.
	 * @see markdown.ReferenceExpression
	 * @generated
	 */
	EClass getReferenceExpression();

	/**
	 * Returns the meta object for the attribute '{@link markdown.ReferenceExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see markdown.ReferenceExpression#getName()
	 * @see #getReferenceExpression()
	 * @generated
	 */
	EAttribute getReferenceExpression_Name();

	/**
	 * Returns the meta object for the attribute '{@link markdown.ReferenceExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see markdown.ReferenceExpression#getValue()
	 * @see #getReferenceExpression()
	 * @generated
	 */
	EAttribute getReferenceExpression_Value();

	/**
	 * Returns the meta object for class '{@link markdown.LinkExpression <em>Link Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Expression</em>'.
	 * @see markdown.LinkExpression
	 * @generated
	 */
	EClass getLinkExpression();

	/**
	 * Returns the meta object for the attribute '{@link markdown.LinkExpression#getTextURL <em>Text URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text URL</em>'.
	 * @see markdown.LinkExpression#getTextURL()
	 * @see #getLinkExpression()
	 * @generated
	 */
	EAttribute getLinkExpression_TextURL();

	/**
	 * Returns the meta object for the attribute '{@link markdown.LinkExpression#getIsReferenced <em>Is Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Referenced</em>'.
	 * @see markdown.LinkExpression#getIsReferenced()
	 * @see #getLinkExpression()
	 * @generated
	 */
	EAttribute getLinkExpression_IsReferenced();

	/**
	 * Returns the meta object for class '{@link markdown.ImageExpression <em>Image Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Expression</em>'.
	 * @see markdown.ImageExpression
	 * @generated
	 */
	EClass getImageExpression();

	/**
	 * Returns the meta object for the attribute '{@link markdown.ImageExpression#getTextURL <em>Text URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text URL</em>'.
	 * @see markdown.ImageExpression#getTextURL()
	 * @see #getImageExpression()
	 * @generated
	 */
	EAttribute getImageExpression_TextURL();

	/**
	 * Returns the meta object for the attribute '{@link markdown.ImageExpression#getIsReferenced <em>Is Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Referenced</em>'.
	 * @see markdown.ImageExpression#getIsReferenced()
	 * @see #getImageExpression()
	 * @generated
	 */
	EAttribute getImageExpression_IsReferenced();

	/**
	 * Returns the meta object for class '{@link markdown.VideoExpression <em>Video Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Expression</em>'.
	 * @see markdown.VideoExpression
	 * @generated
	 */
	EClass getVideoExpression();

	/**
	 * Returns the meta object for the attribute '{@link markdown.VideoExpression#getTextURL <em>Text URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text URL</em>'.
	 * @see markdown.VideoExpression#getTextURL()
	 * @see #getVideoExpression()
	 * @generated
	 */
	EAttribute getVideoExpression_TextURL();

	/**
	 * Returns the meta object for the attribute '{@link markdown.VideoExpression#getTextIMG <em>Text IMG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text IMG</em>'.
	 * @see markdown.VideoExpression#getTextIMG()
	 * @see #getVideoExpression()
	 * @generated
	 */
	EAttribute getVideoExpression_TextIMG();

	/**
	 * Returns the meta object for the attribute '{@link markdown.VideoExpression#getIsReferenced <em>Is Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Referenced</em>'.
	 * @see markdown.VideoExpression#getIsReferenced()
	 * @see #getVideoExpression()
	 * @generated
	 */
	EAttribute getVideoExpression_IsReferenced();

	/**
	 * Returns the meta object for class '{@link markdown.HeaderDepth1Expression <em>Header Depth1 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Depth1 Expression</em>'.
	 * @see markdown.HeaderDepth1Expression
	 * @generated
	 */
	EClass getHeaderDepth1Expression();

	/**
	 * Returns the meta object for class '{@link markdown.HeaderDepth2Expression <em>Header Depth2 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Depth2 Expression</em>'.
	 * @see markdown.HeaderDepth2Expression
	 * @generated
	 */
	EClass getHeaderDepth2Expression();

	/**
	 * Returns the meta object for class '{@link markdown.HeaderDepth3Expression <em>Header Depth3 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Depth3 Expression</em>'.
	 * @see markdown.HeaderDepth3Expression
	 * @generated
	 */
	EClass getHeaderDepth3Expression();

	/**
	 * Returns the meta object for class '{@link markdown.HeaderDepth5Expression <em>Header Depth5 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Depth5 Expression</em>'.
	 * @see markdown.HeaderDepth5Expression
	 * @generated
	 */
	EClass getHeaderDepth5Expression();

	/**
	 * Returns the meta object for class '{@link markdown.HeaderDepth6Expression <em>Header Depth6 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Depth6 Expression</em>'.
	 * @see markdown.HeaderDepth6Expression
	 * @generated
	 */
	EClass getHeaderDepth6Expression();

	/**
	 * Returns the meta object for class '{@link markdown.HeaderDepth4Expression <em>Header Depth4 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Depth4 Expression</em>'.
	 * @see markdown.HeaderDepth4Expression
	 * @generated
	 */
	EClass getHeaderDepth4Expression();

	/**
	 * Returns the meta object for class '{@link markdown.TextualExpression <em>Textual Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Expression</em>'.
	 * @see markdown.TextualExpression
	 * @generated
	 */
	EClass getTextualExpression();

	/**
	 * Returns the meta object for the attribute '{@link markdown.TextualExpression#getContentString <em>Content String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content String</em>'.
	 * @see markdown.TextualExpression#getContentString()
	 * @see #getTextualExpression()
	 * @generated
	 */
	EAttribute getTextualExpression_ContentString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarkdownFactory getMarkdownFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link markdown.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.FileImpl
		 * @see markdown.impl.MarkdownPackageImpl#getFile()
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
		 * The meta object literal for the '{@link markdown.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.ExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link markdown.impl.HeaderExpressionImpl <em>Header Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.HeaderExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getHeaderExpression()
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
		 * The meta object literal for the '{@link markdown.impl.TextExpressionImpl <em>Text Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.TextExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getTextExpression()
		 * @generated
		 */
		EClass TEXT_EXPRESSION = eINSTANCE.getTextExpression();

		/**
		 * The meta object literal for the '{@link markdown.impl.TableExpressionImpl <em>Table Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.TableExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getTableExpression()
		 * @generated
		 */
		EClass TABLE_EXPRESSION = eINSTANCE.getTableExpression();

		/**
		 * The meta object literal for the '<em><b>Tablelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_EXPRESSION__TABLELINES = eINSTANCE.getTableExpression_Tablelines();

		/**
		 * The meta object literal for the '{@link markdown.impl.TableLineImpl <em>Table Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.TableLineImpl
		 * @see markdown.impl.MarkdownPackageImpl#getTableLine()
		 * @generated
		 */
		EClass TABLE_LINE = eINSTANCE.getTableLine();

		/**
		 * The meta object literal for the '<em><b>Cell Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_LINE__CELL_CONTENT = eINSTANCE.getTableLine_CellContent();

		/**
		 * The meta object literal for the '{@link markdown.impl.HorizontalExpressionImpl <em>Horizontal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.HorizontalExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getHorizontalExpression()
		 * @generated
		 */
		EClass HORIZONTAL_EXPRESSION = eINSTANCE.getHorizontalExpression();

		/**
		 * The meta object literal for the '{@link markdown.impl.ListExpressionImpl <em>List Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.ListExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getListExpression()
		 * @generated
		 */
		EClass LIST_EXPRESSION = eINSTANCE.getListExpression();

		/**
		 * The meta object literal for the '<em><b>Starting Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_EXPRESSION__STARTING_VALUE = eINSTANCE.getListExpression_StartingValue();

		/**
		 * The meta object literal for the '<em><b>List Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_EXPRESSION__LIST_CONTENT = eINSTANCE.getListExpression_ListContent();

		/**
		 * The meta object literal for the '{@link markdown.impl.QuoteExpressionImpl <em>Quote Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.QuoteExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getQuoteExpression()
		 * @generated
		 */
		EClass QUOTE_EXPRESSION = eINSTANCE.getQuoteExpression();

		/**
		 * The meta object literal for the '<em><b>Textexpression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_EXPRESSION__TEXTEXPRESSION = eINSTANCE.getQuoteExpression_Textexpression();

		/**
		 * The meta object literal for the '{@link markdown.impl.LineBreakExpressionImpl <em>Line Break Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.LineBreakExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getLineBreakExpression()
		 * @generated
		 */
		EClass LINE_BREAK_EXPRESSION = eINSTANCE.getLineBreakExpression();

		/**
		 * The meta object literal for the '{@link markdown.impl.EmphasisExpressionImpl <em>Emphasis Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.EmphasisExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getEmphasisExpression()
		 * @generated
		 */
		EClass EMPHASIS_EXPRESSION = eINSTANCE.getEmphasisExpression();

		/**
		 * The meta object literal for the '{@link markdown.impl.ItalicExpressionImpl <em>Italic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.ItalicExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getItalicExpression()
		 * @generated
		 */
		EClass ITALIC_EXPRESSION = eINSTANCE.getItalicExpression();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITALIC_EXPRESSION__CONTENT = eINSTANCE.getItalicExpression_Content();

		/**
		 * The meta object literal for the '{@link markdown.impl.StrongExpressionImpl <em>Strong Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.StrongExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getStrongExpression()
		 * @generated
		 */
		EClass STRONG_EXPRESSION = eINSTANCE.getStrongExpression();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRONG_EXPRESSION__CONTENT = eINSTANCE.getStrongExpression_Content();

		/**
		 * The meta object literal for the '{@link markdown.impl.ScratchExpressionImpl <em>Scratch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.ScratchExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getScratchExpression()
		 * @generated
		 */
		EClass SCRATCH_EXPRESSION = eINSTANCE.getScratchExpression();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRATCH_EXPRESSION__CONTENT = eINSTANCE.getScratchExpression_Content();

		/**
		 * The meta object literal for the '{@link markdown.impl.HTMLExpressionImpl <em>HTML Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.HTMLExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getHTMLExpression()
		 * @generated
		 */
		EClass HTML_EXPRESSION = eINSTANCE.getHTMLExpression();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_EXPRESSION__TEXT = eINSTANCE.getHTMLExpression_Text();

		/**
		 * The meta object literal for the '{@link markdown.impl.CodeExpressionImpl <em>Code Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.CodeExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getCodeExpression()
		 * @generated
		 */
		EClass CODE_EXPRESSION = eINSTANCE.getCodeExpression();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_EXPRESSION__TEXT = eINSTANCE.getCodeExpression_Text();

		/**
		 * The meta object literal for the '{@link markdown.impl.ReferenceExpressionImpl <em>Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.ReferenceExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getReferenceExpression()
		 * @generated
		 */
		EClass REFERENCE_EXPRESSION = eINSTANCE.getReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_EXPRESSION__NAME = eINSTANCE.getReferenceExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_EXPRESSION__VALUE = eINSTANCE.getReferenceExpression_Value();

		/**
		 * The meta object literal for the '{@link markdown.impl.LinkExpressionImpl <em>Link Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.LinkExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getLinkExpression()
		 * @generated
		 */
		EClass LINK_EXPRESSION = eINSTANCE.getLinkExpression();

		/**
		 * The meta object literal for the '<em><b>Text URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_EXPRESSION__TEXT_URL = eINSTANCE.getLinkExpression_TextURL();

		/**
		 * The meta object literal for the '<em><b>Is Referenced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_EXPRESSION__IS_REFERENCED = eINSTANCE.getLinkExpression_IsReferenced();

		/**
		 * The meta object literal for the '{@link markdown.impl.ImageExpressionImpl <em>Image Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.ImageExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getImageExpression()
		 * @generated
		 */
		EClass IMAGE_EXPRESSION = eINSTANCE.getImageExpression();

		/**
		 * The meta object literal for the '<em><b>Text URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_EXPRESSION__TEXT_URL = eINSTANCE.getImageExpression_TextURL();

		/**
		 * The meta object literal for the '<em><b>Is Referenced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_EXPRESSION__IS_REFERENCED = eINSTANCE.getImageExpression_IsReferenced();

		/**
		 * The meta object literal for the '{@link markdown.impl.VideoExpressionImpl <em>Video Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.VideoExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getVideoExpression()
		 * @generated
		 */
		EClass VIDEO_EXPRESSION = eINSTANCE.getVideoExpression();

		/**
		 * The meta object literal for the '<em><b>Text URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_EXPRESSION__TEXT_URL = eINSTANCE.getVideoExpression_TextURL();

		/**
		 * The meta object literal for the '<em><b>Text IMG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_EXPRESSION__TEXT_IMG = eINSTANCE.getVideoExpression_TextIMG();

		/**
		 * The meta object literal for the '<em><b>Is Referenced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_EXPRESSION__IS_REFERENCED = eINSTANCE.getVideoExpression_IsReferenced();

		/**
		 * The meta object literal for the '{@link markdown.impl.HeaderDepth1ExpressionImpl <em>Header Depth1 Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.HeaderDepth1ExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth1Expression()
		 * @generated
		 */
		EClass HEADER_DEPTH1_EXPRESSION = eINSTANCE.getHeaderDepth1Expression();

		/**
		 * The meta object literal for the '{@link markdown.impl.HeaderDepth2ExpressionImpl <em>Header Depth2 Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.HeaderDepth2ExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth2Expression()
		 * @generated
		 */
		EClass HEADER_DEPTH2_EXPRESSION = eINSTANCE.getHeaderDepth2Expression();

		/**
		 * The meta object literal for the '{@link markdown.impl.HeaderDepth3ExpressionImpl <em>Header Depth3 Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.HeaderDepth3ExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth3Expression()
		 * @generated
		 */
		EClass HEADER_DEPTH3_EXPRESSION = eINSTANCE.getHeaderDepth3Expression();

		/**
		 * The meta object literal for the '{@link markdown.impl.HeaderDepth5ExpressionImpl <em>Header Depth5 Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.HeaderDepth5ExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth5Expression()
		 * @generated
		 */
		EClass HEADER_DEPTH5_EXPRESSION = eINSTANCE.getHeaderDepth5Expression();

		/**
		 * The meta object literal for the '{@link markdown.impl.HeaderDepth6ExpressionImpl <em>Header Depth6 Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.HeaderDepth6ExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth6Expression()
		 * @generated
		 */
		EClass HEADER_DEPTH6_EXPRESSION = eINSTANCE.getHeaderDepth6Expression();

		/**
		 * The meta object literal for the '{@link markdown.impl.HeaderDepth4ExpressionImpl <em>Header Depth4 Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.HeaderDepth4ExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getHeaderDepth4Expression()
		 * @generated
		 */
		EClass HEADER_DEPTH4_EXPRESSION = eINSTANCE.getHeaderDepth4Expression();

		/**
		 * The meta object literal for the '{@link markdown.impl.TextualExpressionImpl <em>Textual Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see markdown.impl.TextualExpressionImpl
		 * @see markdown.impl.MarkdownPackageImpl#getTextualExpression()
		 * @generated
		 */
		EClass TEXTUAL_EXPRESSION = eINSTANCE.getTextualExpression();

		/**
		 * The meta object literal for the '<em><b>Content String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_EXPRESSION__CONTENT_STRING = eINSTANCE.getTextualExpression_ContentString();

	}

} //MarkdownPackage
