/**
 */
package markdown.impl;

import markdown.CodeExpression;
import markdown.EmphasisExpression;
import markdown.Expression;
import markdown.File;
import markdown.HTMLExpression;
import markdown.HeaderDepth1Expression;
import markdown.HeaderDepth2Expression;
import markdown.HeaderDepth3Expression;
import markdown.HeaderDepth4Expression;
import markdown.HeaderDepth5Expression;
import markdown.HeaderDepth6Expression;
import markdown.HeaderExpression;
import markdown.HorizontalExpression;
import markdown.ImageExpression;
import markdown.ItalicExpression;
import markdown.LineBreakExpression;
import markdown.LinkExpression;
import markdown.ListExpression;
import markdown.MarkdownFactory;
import markdown.MarkdownPackage;
import markdown.QuoteExpression;
import markdown.ReferenceExpression;
import markdown.ScratchExpression;
import markdown.StrongExpression;
import markdown.TableExpression;
import markdown.TableLine;
import markdown.TextExpression;
import markdown.TextualExpression;
import markdown.VideoExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkdownPackageImpl extends EPackageImpl implements MarkdownPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quoteExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineBreakExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emphasisExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass italicExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scratchExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerDepth1ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerDepth2ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerDepth3ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerDepth5ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerDepth6ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerDepth4ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualExpressionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see markdown.MarkdownPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MarkdownPackageImpl() {
		super(eNS_URI, MarkdownFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MarkdownPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MarkdownPackage init() {
		if (isInited)
			return (MarkdownPackage) EPackage.Registry.INSTANCE.getEPackage(MarkdownPackage.eNS_URI);

		// Obtain or create and register package
		MarkdownPackageImpl theMarkdownPackage = (MarkdownPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof MarkdownPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new MarkdownPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMarkdownPackage.createPackageContents();

		// Initialize created meta-data
		theMarkdownPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMarkdownPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MarkdownPackage.eNS_URI, theMarkdownPackage);
		return theMarkdownPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Expression() {
		return (EReference) fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderExpression() {
		return headerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderExpression_Content() {
		return (EReference) headerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextExpression() {
		return textExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableExpression() {
		return tableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableExpression_Tablelines() {
		return (EReference) tableExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableLine() {
		return tableLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableLine_CellContent() {
		return (EReference) tableLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalExpression() {
		return horizontalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListExpression() {
		return listExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListExpression_StartingValue() {
		return (EAttribute) listExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListExpression_ListContent() {
		return (EReference) listExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuoteExpression() {
		return quoteExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuoteExpression_Textexpression() {
		return (EReference) quoteExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineBreakExpression() {
		return lineBreakExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmphasisExpression() {
		return emphasisExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItalicExpression() {
		return italicExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItalicExpression_Content() {
		return (EReference) italicExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrongExpression() {
		return strongExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrongExpression_Content() {
		return (EReference) strongExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScratchExpression() {
		return scratchExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScratchExpression_Content() {
		return (EReference) scratchExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTMLExpression() {
		return htmlExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLExpression_Text() {
		return (EAttribute) htmlExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeExpression() {
		return codeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeExpression_Text() {
		return (EAttribute) codeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceExpression() {
		return referenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceExpression_Name() {
		return (EAttribute) referenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceExpression_Value() {
		return (EAttribute) referenceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkExpression() {
		return linkExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkExpression_TextURL() {
		return (EAttribute) linkExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkExpression_TextBloc() {
		return (EReference) linkExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkExpression_IsReferenced() {
		return (EAttribute) linkExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageExpression() {
		return imageExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageExpression_TextURL() {
		return (EAttribute) imageExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageExpression_TextBloc() {
		return (EReference) imageExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageExpression_IsReferenced() {
		return (EAttribute) imageExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoExpression() {
		return videoExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoExpression_TextURL() {
		return (EAttribute) videoExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoExpression_TextIMG() {
		return (EAttribute) videoExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoExpression_TextBloc() {
		return (EReference) videoExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoExpression_IsReferenced() {
		return (EAttribute) videoExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderDepth1Expression() {
		return headerDepth1ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderDepth2Expression() {
		return headerDepth2ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderDepth3Expression() {
		return headerDepth3ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderDepth5Expression() {
		return headerDepth5ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderDepth6Expression() {
		return headerDepth6ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderDepth4Expression() {
		return headerDepth4ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualExpression() {
		return textualExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualExpression_Content() {
		return (EAttribute) textualExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextualExpression_FollowingExpression() {
		return (EReference) textualExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkdownFactory getMarkdownFactory() {
		return (MarkdownFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		fileEClass = createEClass(FILE);
		createEReference(fileEClass, FILE__EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);

		headerExpressionEClass = createEClass(HEADER_EXPRESSION);
		createEReference(headerExpressionEClass, HEADER_EXPRESSION__CONTENT);

		textExpressionEClass = createEClass(TEXT_EXPRESSION);

		tableExpressionEClass = createEClass(TABLE_EXPRESSION);
		createEReference(tableExpressionEClass, TABLE_EXPRESSION__TABLELINES);

		tableLineEClass = createEClass(TABLE_LINE);
		createEReference(tableLineEClass, TABLE_LINE__CELL_CONTENT);

		horizontalExpressionEClass = createEClass(HORIZONTAL_EXPRESSION);

		listExpressionEClass = createEClass(LIST_EXPRESSION);
		createEAttribute(listExpressionEClass, LIST_EXPRESSION__STARTING_VALUE);
		createEReference(listExpressionEClass, LIST_EXPRESSION__LIST_CONTENT);

		quoteExpressionEClass = createEClass(QUOTE_EXPRESSION);
		createEReference(quoteExpressionEClass, QUOTE_EXPRESSION__TEXTEXPRESSION);

		lineBreakExpressionEClass = createEClass(LINE_BREAK_EXPRESSION);

		emphasisExpressionEClass = createEClass(EMPHASIS_EXPRESSION);

		italicExpressionEClass = createEClass(ITALIC_EXPRESSION);
		createEReference(italicExpressionEClass, ITALIC_EXPRESSION__CONTENT);

		strongExpressionEClass = createEClass(STRONG_EXPRESSION);
		createEReference(strongExpressionEClass, STRONG_EXPRESSION__CONTENT);

		scratchExpressionEClass = createEClass(SCRATCH_EXPRESSION);
		createEReference(scratchExpressionEClass, SCRATCH_EXPRESSION__CONTENT);

		htmlExpressionEClass = createEClass(HTML_EXPRESSION);
		createEAttribute(htmlExpressionEClass, HTML_EXPRESSION__TEXT);

		codeExpressionEClass = createEClass(CODE_EXPRESSION);
		createEAttribute(codeExpressionEClass, CODE_EXPRESSION__TEXT);

		referenceExpressionEClass = createEClass(REFERENCE_EXPRESSION);
		createEAttribute(referenceExpressionEClass, REFERENCE_EXPRESSION__NAME);
		createEAttribute(referenceExpressionEClass, REFERENCE_EXPRESSION__VALUE);

		linkExpressionEClass = createEClass(LINK_EXPRESSION);
		createEAttribute(linkExpressionEClass, LINK_EXPRESSION__TEXT_URL);
		createEReference(linkExpressionEClass, LINK_EXPRESSION__TEXT_BLOC);
		createEAttribute(linkExpressionEClass, LINK_EXPRESSION__IS_REFERENCED);

		imageExpressionEClass = createEClass(IMAGE_EXPRESSION);
		createEAttribute(imageExpressionEClass, IMAGE_EXPRESSION__TEXT_URL);
		createEReference(imageExpressionEClass, IMAGE_EXPRESSION__TEXT_BLOC);
		createEAttribute(imageExpressionEClass, IMAGE_EXPRESSION__IS_REFERENCED);

		videoExpressionEClass = createEClass(VIDEO_EXPRESSION);
		createEAttribute(videoExpressionEClass, VIDEO_EXPRESSION__TEXT_URL);
		createEAttribute(videoExpressionEClass, VIDEO_EXPRESSION__TEXT_IMG);
		createEReference(videoExpressionEClass, VIDEO_EXPRESSION__TEXT_BLOC);
		createEAttribute(videoExpressionEClass, VIDEO_EXPRESSION__IS_REFERENCED);

		headerDepth1ExpressionEClass = createEClass(HEADER_DEPTH1_EXPRESSION);

		headerDepth2ExpressionEClass = createEClass(HEADER_DEPTH2_EXPRESSION);

		headerDepth3ExpressionEClass = createEClass(HEADER_DEPTH3_EXPRESSION);

		headerDepth5ExpressionEClass = createEClass(HEADER_DEPTH5_EXPRESSION);

		headerDepth6ExpressionEClass = createEClass(HEADER_DEPTH6_EXPRESSION);

		headerDepth4ExpressionEClass = createEClass(HEADER_DEPTH4_EXPRESSION);

		textualExpressionEClass = createEClass(TEXTUAL_EXPRESSION);
		createEAttribute(textualExpressionEClass, TEXTUAL_EXPRESSION__CONTENT);
		createEReference(textualExpressionEClass, TEXTUAL_EXPRESSION__FOLLOWING_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		headerExpressionEClass.getESuperTypes().add(this.getExpression());
		textExpressionEClass.getESuperTypes().add(this.getExpression());
		tableExpressionEClass.getESuperTypes().add(this.getExpression());
		horizontalExpressionEClass.getESuperTypes().add(this.getTextExpression());
		listExpressionEClass.getESuperTypes().add(this.getExpression());
		quoteExpressionEClass.getESuperTypes().add(this.getTextExpression());
		lineBreakExpressionEClass.getESuperTypes().add(this.getExpression());
		emphasisExpressionEClass.getESuperTypes().add(this.getTextExpression());
		italicExpressionEClass.getESuperTypes().add(this.getEmphasisExpression());
		strongExpressionEClass.getESuperTypes().add(this.getEmphasisExpression());
		scratchExpressionEClass.getESuperTypes().add(this.getEmphasisExpression());
		htmlExpressionEClass.getESuperTypes().add(this.getExpression());
		codeExpressionEClass.getESuperTypes().add(this.getExpression());
		referenceExpressionEClass.getESuperTypes().add(this.getExpression());
		linkExpressionEClass.getESuperTypes().add(this.getExpression());
		imageExpressionEClass.getESuperTypes().add(this.getExpression());
		videoExpressionEClass.getESuperTypes().add(this.getExpression());
		headerDepth1ExpressionEClass.getESuperTypes().add(this.getHeaderExpression());
		headerDepth2ExpressionEClass.getESuperTypes().add(this.getHeaderExpression());
		headerDepth3ExpressionEClass.getESuperTypes().add(this.getHeaderExpression());
		headerDepth5ExpressionEClass.getESuperTypes().add(this.getHeaderExpression());
		headerDepth6ExpressionEClass.getESuperTypes().add(this.getHeaderExpression());
		headerDepth4ExpressionEClass.getESuperTypes().add(this.getHeaderExpression());
		textualExpressionEClass.getESuperTypes().add(this.getEmphasisExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFile_Expression(), this.getExpression(), null, "expression", null, 0, -1, File.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerExpressionEClass, HeaderExpression.class, "HeaderExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeaderExpression_Content(), this.getEmphasisExpression(), null, "content", null, 1, 1,
				HeaderExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textExpressionEClass, TextExpression.class, "TextExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableExpressionEClass, TableExpression.class, "TableExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableExpression_Tablelines(), this.getTableLine(), null, "tablelines", null, 1, -1,
				TableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableLineEClass, TableLine.class, "TableLine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableLine_CellContent(), this.getTextExpression(), null, "cellContent", null, 1, -1,
				TableLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalExpressionEClass, HorizontalExpression.class, "HorizontalExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listExpressionEClass, ListExpression.class, "ListExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListExpression_StartingValue(), theXMLTypePackage.getIntObject(), "startingValue", null, 1, 1,
				ListExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getListExpression_ListContent(), this.getTextExpression(), null, "listContent", null, 1, -1,
				ListExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quoteExpressionEClass, QuoteExpression.class, "QuoteExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuoteExpression_Textexpression(), this.getTextExpression(), null, "textexpression", null, 1,
				1, QuoteExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineBreakExpressionEClass, LineBreakExpression.class, "LineBreakExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emphasisExpressionEClass, EmphasisExpression.class, "EmphasisExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(italicExpressionEClass, ItalicExpression.class, "ItalicExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItalicExpression_Content(), this.getEmphasisExpression(), null, "content", null, 1, 2,
				ItalicExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strongExpressionEClass, StrongExpression.class, "StrongExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrongExpression_Content(), this.getEmphasisExpression(), null, "content", null, 1, 2,
				StrongExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scratchExpressionEClass, ScratchExpression.class, "ScratchExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScratchExpression_Content(), this.getEmphasisExpression(), null, "content", null, 1, 2,
				ScratchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlExpressionEClass, HTMLExpression.class, "HTMLExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTMLExpression_Text(), theXMLTypePackage.getString(), "text", null, 1, 1,
				HTMLExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(codeExpressionEClass, CodeExpression.class, "CodeExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeExpression_Text(), theXMLTypePackage.getString(), "text", null, 1, 1,
				CodeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(referenceExpressionEClass, ReferenceExpression.class, "ReferenceExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceExpression_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				ReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceExpression_Value(), theXMLTypePackage.getString(), "value", null, 1, 1,
				ReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkExpressionEClass, LinkExpression.class, "LinkExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkExpression_TextURL(), theXMLTypePackage.getString(), "textURL", null, 1, 1,
				LinkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLinkExpression_TextBloc(), this.getEmphasisExpression(), null, "textBloc", null, 1, 1,
				LinkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkExpression_IsReferenced(), theXMLTypePackage.getBooleanObject(), "isReferenced", null, 1,
				1, LinkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(imageExpressionEClass, ImageExpression.class, "ImageExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageExpression_TextURL(), theXMLTypePackage.getString(), "textURL", null, 1, 1,
				ImageExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getImageExpression_TextBloc(), this.getEmphasisExpression(), null, "textBloc", null, 1, 1,
				ImageExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageExpression_IsReferenced(), theXMLTypePackage.getBooleanObject(), "isReferenced", null, 1,
				1, ImageExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(videoExpressionEClass, VideoExpression.class, "VideoExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideoExpression_TextURL(), theXMLTypePackage.getString(), "textURL", null, 1, 1,
				VideoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoExpression_TextIMG(), theXMLTypePackage.getString(), "textIMG", null, 1, 1,
				VideoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVideoExpression_TextBloc(), this.getEmphasisExpression(), null, "textBloc", null, 1, 1,
				VideoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoExpression_IsReferenced(), theXMLTypePackage.getBooleanObject(), "isReferenced", null, 1,
				1, VideoExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(headerDepth1ExpressionEClass, HeaderDepth1Expression.class, "HeaderDepth1Expression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerDepth2ExpressionEClass, HeaderDepth2Expression.class, "HeaderDepth2Expression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerDepth3ExpressionEClass, HeaderDepth3Expression.class, "HeaderDepth3Expression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerDepth5ExpressionEClass, HeaderDepth5Expression.class, "HeaderDepth5Expression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerDepth6ExpressionEClass, HeaderDepth6Expression.class, "HeaderDepth6Expression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerDepth4ExpressionEClass, HeaderDepth4Expression.class, "HeaderDepth4Expression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textualExpressionEClass, TextualExpression.class, "TextualExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextualExpression_Content(), theXMLTypePackage.getString(), "content", null, 1, 1,
				TextualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTextualExpression_FollowingExpression(), this.getEmphasisExpression(), null,
				"followingExpression", null, 0, 1, TextualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MarkdownPackageImpl
