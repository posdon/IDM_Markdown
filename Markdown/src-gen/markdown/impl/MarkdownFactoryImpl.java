/**
 */
package markdown.impl;

import markdown.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkdownFactoryImpl extends EFactoryImpl implements MarkdownFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MarkdownFactory init() {
		try {
			MarkdownFactory theMarkdownFactory = (MarkdownFactory) EPackage.Registry.INSTANCE
					.getEFactory(MarkdownPackage.eNS_URI);
			if (theMarkdownFactory != null) {
				return theMarkdownFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MarkdownFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkdownFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MarkdownPackage.FILE:
			return createFile();
		case MarkdownPackage.TABLE_EXPRESSION:
			return createTableExpression();
		case MarkdownPackage.TABLE_LINE:
			return createTableLine();
		case MarkdownPackage.HORIZONTAL_EXPRESSION:
			return createHorizontalExpression();
		case MarkdownPackage.LIST_EXPRESSION:
			return createListExpression();
		case MarkdownPackage.QUOTE_EXPRESSION:
			return createQuoteExpression();
		case MarkdownPackage.LINE_BREAK_EXPRESSION:
			return createLineBreakExpression();
		case MarkdownPackage.ITALIC_EXPRESSION:
			return createItalicExpression();
		case MarkdownPackage.STRONG_EXPRESSION:
			return createStrongExpression();
		case MarkdownPackage.SCRATCH_EXPRESSION:
			return createScratchExpression();
		case MarkdownPackage.HTML_EXPRESSION:
			return createHTMLExpression();
		case MarkdownPackage.CODE_EXPRESSION:
			return createCodeExpression();
		case MarkdownPackage.REFERENCE_EXPRESSION:
			return createReferenceExpression();
		case MarkdownPackage.LINK_EXPRESSION:
			return createLinkExpression();
		case MarkdownPackage.IMAGE_EXPRESSION:
			return createImageExpression();
		case MarkdownPackage.VIDEO_EXPRESSION:
			return createVideoExpression();
		case MarkdownPackage.HEADER_DEPTH1_EXPRESSION:
			return createHeaderDepth1Expression();
		case MarkdownPackage.HEADER_DEPTH2_EXPRESSION:
			return createHeaderDepth2Expression();
		case MarkdownPackage.HEADER_DEPTH3_EXPRESSION:
			return createHeaderDepth3Expression();
		case MarkdownPackage.HEADER_DEPTH5_EXPRESSION:
			return createHeaderDepth5Expression();
		case MarkdownPackage.HEADER_DEPTH6_EXPRESSION:
			return createHeaderDepth6Expression();
		case MarkdownPackage.HEADER_DEPTH4_EXPRESSION:
			return createHeaderDepth4Expression();
		case MarkdownPackage.TEXTUAL_EXPRESSION:
			return createTextualExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableExpression createTableExpression() {
		TableExpressionImpl tableExpression = new TableExpressionImpl();
		return tableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableLine createTableLine() {
		TableLineImpl tableLine = new TableLineImpl();
		return tableLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalExpression createHorizontalExpression() {
		HorizontalExpressionImpl horizontalExpression = new HorizontalExpressionImpl();
		return horizontalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListExpression createListExpression() {
		ListExpressionImpl listExpression = new ListExpressionImpl();
		return listExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuoteExpression createQuoteExpression() {
		QuoteExpressionImpl quoteExpression = new QuoteExpressionImpl();
		return quoteExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreakExpression createLineBreakExpression() {
		LineBreakExpressionImpl lineBreakExpression = new LineBreakExpressionImpl();
		return lineBreakExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItalicExpression createItalicExpression() {
		ItalicExpressionImpl italicExpression = new ItalicExpressionImpl();
		return italicExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrongExpression createStrongExpression() {
		StrongExpressionImpl strongExpression = new StrongExpressionImpl();
		return strongExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScratchExpression createScratchExpression() {
		ScratchExpressionImpl scratchExpression = new ScratchExpressionImpl();
		return scratchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLExpression createHTMLExpression() {
		HTMLExpressionImpl htmlExpression = new HTMLExpressionImpl();
		return htmlExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeExpression createCodeExpression() {
		CodeExpressionImpl codeExpression = new CodeExpressionImpl();
		return codeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceExpression createReferenceExpression() {
		ReferenceExpressionImpl referenceExpression = new ReferenceExpressionImpl();
		return referenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkExpression createLinkExpression() {
		LinkExpressionImpl linkExpression = new LinkExpressionImpl();
		return linkExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageExpression createImageExpression() {
		ImageExpressionImpl imageExpression = new ImageExpressionImpl();
		return imageExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoExpression createVideoExpression() {
		VideoExpressionImpl videoExpression = new VideoExpressionImpl();
		return videoExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderDepth1Expression createHeaderDepth1Expression() {
		HeaderDepth1ExpressionImpl headerDepth1Expression = new HeaderDepth1ExpressionImpl();
		return headerDepth1Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderDepth2Expression createHeaderDepth2Expression() {
		HeaderDepth2ExpressionImpl headerDepth2Expression = new HeaderDepth2ExpressionImpl();
		return headerDepth2Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderDepth3Expression createHeaderDepth3Expression() {
		HeaderDepth3ExpressionImpl headerDepth3Expression = new HeaderDepth3ExpressionImpl();
		return headerDepth3Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderDepth5Expression createHeaderDepth5Expression() {
		HeaderDepth5ExpressionImpl headerDepth5Expression = new HeaderDepth5ExpressionImpl();
		return headerDepth5Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderDepth6Expression createHeaderDepth6Expression() {
		HeaderDepth6ExpressionImpl headerDepth6Expression = new HeaderDepth6ExpressionImpl();
		return headerDepth6Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderDepth4Expression createHeaderDepth4Expression() {
		HeaderDepth4ExpressionImpl headerDepth4Expression = new HeaderDepth4ExpressionImpl();
		return headerDepth4Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualExpression createTextualExpression() {
		TextualExpressionImpl textualExpression = new TextualExpressionImpl();
		return textualExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkdownPackage getMarkdownPackage() {
		return (MarkdownPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MarkdownPackage getPackage() {
		return MarkdownPackage.eINSTANCE;
	}

} //MarkdownFactoryImpl
