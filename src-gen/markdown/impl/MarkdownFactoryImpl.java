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
		case MarkdownPackage.HEADER_EXPRESSION:
			return createHeaderExpression();
		case MarkdownPackage.TEXT_EXPRESSION:
			return createTextExpression();
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
		case MarkdownPackage.EMPHASIS_EXPRESSION:
			return createEmphasisExpression();
		case MarkdownPackage.ITALIC_EXPRESSION:
			return createItalicExpression();
		case MarkdownPackage.STRONG_EXPRESSION:
			return createStrongExpression();
		case MarkdownPackage.SCRATCH_EXPRESSION:
			return createScratchExpression();
		case MarkdownPackage.TEXT_BLOC:
			return createTextBloc();
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
	public HeaderExpression createHeaderExpression() {
		HeaderExpressionImpl headerExpression = new HeaderExpressionImpl();
		return headerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextExpression createTextExpression() {
		TextExpressionImpl textExpression = new TextExpressionImpl();
		return textExpression;
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
	public EmphasisExpression createEmphasisExpression() {
		EmphasisExpressionImpl emphasisExpression = new EmphasisExpressionImpl();
		return emphasisExpression;
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
	public TextBloc createTextBloc() {
		TextBlocImpl textBloc = new TextBlocImpl();
		return textBloc;
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
