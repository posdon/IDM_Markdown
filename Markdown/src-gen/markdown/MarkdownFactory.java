/**
 */
package markdown;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see markdown.MarkdownPackage
 * @generated
 */
public interface MarkdownFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkdownFactory eINSTANCE = markdown.impl.MarkdownFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Table Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Expression</em>'.
	 * @generated
	 */
	TableExpression createTableExpression();

	/**
	 * Returns a new object of class '<em>Table Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Line</em>'.
	 * @generated
	 */
	TableLine createTableLine();

	/**
	 * Returns a new object of class '<em>Horizontal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Expression</em>'.
	 * @generated
	 */
	HorizontalExpression createHorizontalExpression();

	/**
	 * Returns a new object of class '<em>List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Expression</em>'.
	 * @generated
	 */
	ListExpression createListExpression();

	/**
	 * Returns a new object of class '<em>Quote Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quote Expression</em>'.
	 * @generated
	 */
	QuoteExpression createQuoteExpression();

	/**
	 * Returns a new object of class '<em>Line Break Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Break Expression</em>'.
	 * @generated
	 */
	LineBreakExpression createLineBreakExpression();

	/**
	 * Returns a new object of class '<em>Italic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Italic Expression</em>'.
	 * @generated
	 */
	ItalicExpression createItalicExpression();

	/**
	 * Returns a new object of class '<em>Strong Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong Expression</em>'.
	 * @generated
	 */
	StrongExpression createStrongExpression();

	/**
	 * Returns a new object of class '<em>Scratch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scratch Expression</em>'.
	 * @generated
	 */
	ScratchExpression createScratchExpression();

	/**
	 * Returns a new object of class '<em>HTML Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Expression</em>'.
	 * @generated
	 */
	HTMLExpression createHTMLExpression();

	/**
	 * Returns a new object of class '<em>Code Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Expression</em>'.
	 * @generated
	 */
	CodeExpression createCodeExpression();

	/**
	 * Returns a new object of class '<em>Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Expression</em>'.
	 * @generated
	 */
	ReferenceExpression createReferenceExpression();

	/**
	 * Returns a new object of class '<em>Link Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Expression</em>'.
	 * @generated
	 */
	LinkExpression createLinkExpression();

	/**
	 * Returns a new object of class '<em>Image Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Expression</em>'.
	 * @generated
	 */
	ImageExpression createImageExpression();

	/**
	 * Returns a new object of class '<em>Video Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Expression</em>'.
	 * @generated
	 */
	VideoExpression createVideoExpression();

	/**
	 * Returns a new object of class '<em>Header Depth1 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Depth1 Expression</em>'.
	 * @generated
	 */
	HeaderDepth1Expression createHeaderDepth1Expression();

	/**
	 * Returns a new object of class '<em>Header Depth2 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Depth2 Expression</em>'.
	 * @generated
	 */
	HeaderDepth2Expression createHeaderDepth2Expression();

	/**
	 * Returns a new object of class '<em>Header Depth3 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Depth3 Expression</em>'.
	 * @generated
	 */
	HeaderDepth3Expression createHeaderDepth3Expression();

	/**
	 * Returns a new object of class '<em>Header Depth5 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Depth5 Expression</em>'.
	 * @generated
	 */
	HeaderDepth5Expression createHeaderDepth5Expression();

	/**
	 * Returns a new object of class '<em>Header Depth6 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Depth6 Expression</em>'.
	 * @generated
	 */
	HeaderDepth6Expression createHeaderDepth6Expression();

	/**
	 * Returns a new object of class '<em>Header Depth4 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Depth4 Expression</em>'.
	 * @generated
	 */
	HeaderDepth4Expression createHeaderDepth4Expression();

	/**
	 * Returns a new object of class '<em>Textual Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textual Expression</em>'.
	 * @generated
	 */
	TextualExpression createTextualExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MarkdownPackage getMarkdownPackage();

} //MarkdownFactory
