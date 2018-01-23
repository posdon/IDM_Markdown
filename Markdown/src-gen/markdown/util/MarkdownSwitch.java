/**
 */
package markdown.util;

import markdown.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see markdown.MarkdownPackage
 * @generated
 */
public class MarkdownSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MarkdownPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkdownSwitch() {
		if (modelPackage == null) {
			modelPackage = MarkdownPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MarkdownPackage.FILE: {
			File file = (File) theEObject;
			T result = caseFile(file);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.HEADER_EXPRESSION: {
			HeaderExpression headerExpression = (HeaderExpression) theEObject;
			T result = caseHeaderExpression(headerExpression);
			if (result == null)
				result = caseExpression(headerExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.TEXT_EXPRESSION: {
			TextExpression textExpression = (TextExpression) theEObject;
			T result = caseTextExpression(textExpression);
			if (result == null)
				result = caseExpression(textExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.TABLE_EXPRESSION: {
			TableExpression tableExpression = (TableExpression) theEObject;
			T result = caseTableExpression(tableExpression);
			if (result == null)
				result = caseExpression(tableExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.TABLE_LINE: {
			TableLine tableLine = (TableLine) theEObject;
			T result = caseTableLine(tableLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.HORIZONTAL_EXPRESSION: {
			HorizontalExpression horizontalExpression = (HorizontalExpression) theEObject;
			T result = caseHorizontalExpression(horizontalExpression);
			if (result == null)
				result = caseTextExpression(horizontalExpression);
			if (result == null)
				result = caseExpression(horizontalExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.LIST_EXPRESSION: {
			ListExpression listExpression = (ListExpression) theEObject;
			T result = caseListExpression(listExpression);
			if (result == null)
				result = caseExpression(listExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.QUOTE_EXPRESSION: {
			QuoteExpression quoteExpression = (QuoteExpression) theEObject;
			T result = caseQuoteExpression(quoteExpression);
			if (result == null)
				result = caseTextExpression(quoteExpression);
			if (result == null)
				result = caseExpression(quoteExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.LINE_BREAK_EXPRESSION: {
			LineBreakExpression lineBreakExpression = (LineBreakExpression) theEObject;
			T result = caseLineBreakExpression(lineBreakExpression);
			if (result == null)
				result = caseExpression(lineBreakExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.EMPHASIS_EXPRESSION: {
			EmphasisExpression emphasisExpression = (EmphasisExpression) theEObject;
			T result = caseEmphasisExpression(emphasisExpression);
			if (result == null)
				result = caseTextExpression(emphasisExpression);
			if (result == null)
				result = caseExpression(emphasisExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.ITALIC_EXPRESSION: {
			ItalicExpression italicExpression = (ItalicExpression) theEObject;
			T result = caseItalicExpression(italicExpression);
			if (result == null)
				result = caseEmphasisExpression(italicExpression);
			if (result == null)
				result = caseTextExpression(italicExpression);
			if (result == null)
				result = caseExpression(italicExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.STRONG_EXPRESSION: {
			StrongExpression strongExpression = (StrongExpression) theEObject;
			T result = caseStrongExpression(strongExpression);
			if (result == null)
				result = caseEmphasisExpression(strongExpression);
			if (result == null)
				result = caseTextExpression(strongExpression);
			if (result == null)
				result = caseExpression(strongExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.SCRATCH_EXPRESSION: {
			ScratchExpression scratchExpression = (ScratchExpression) theEObject;
			T result = caseScratchExpression(scratchExpression);
			if (result == null)
				result = caseEmphasisExpression(scratchExpression);
			if (result == null)
				result = caseTextExpression(scratchExpression);
			if (result == null)
				result = caseExpression(scratchExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.HTML_EXPRESSION: {
			HTMLExpression htmlExpression = (HTMLExpression) theEObject;
			T result = caseHTMLExpression(htmlExpression);
			if (result == null)
				result = caseExpression(htmlExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.CODE_EXPRESSION: {
			CodeExpression codeExpression = (CodeExpression) theEObject;
			T result = caseCodeExpression(codeExpression);
			if (result == null)
				result = caseExpression(codeExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.REFERENCE_EXPRESSION: {
			ReferenceExpression referenceExpression = (ReferenceExpression) theEObject;
			T result = caseReferenceExpression(referenceExpression);
			if (result == null)
				result = caseExpression(referenceExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.LINK_EXPRESSION: {
			LinkExpression linkExpression = (LinkExpression) theEObject;
			T result = caseLinkExpression(linkExpression);
			if (result == null)
				result = caseExpression(linkExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.IMAGE_EXPRESSION: {
			ImageExpression imageExpression = (ImageExpression) theEObject;
			T result = caseImageExpression(imageExpression);
			if (result == null)
				result = caseExpression(imageExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.VIDEO_EXPRESSION: {
			VideoExpression videoExpression = (VideoExpression) theEObject;
			T result = caseVideoExpression(videoExpression);
			if (result == null)
				result = caseExpression(videoExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.HEADER_DEPTH1_EXPRESSION: {
			HeaderDepth1Expression headerDepth1Expression = (HeaderDepth1Expression) theEObject;
			T result = caseHeaderDepth1Expression(headerDepth1Expression);
			if (result == null)
				result = caseHeaderExpression(headerDepth1Expression);
			if (result == null)
				result = caseExpression(headerDepth1Expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.HEADER_DEPTH2_EXPRESSION: {
			HeaderDepth2Expression headerDepth2Expression = (HeaderDepth2Expression) theEObject;
			T result = caseHeaderDepth2Expression(headerDepth2Expression);
			if (result == null)
				result = caseHeaderExpression(headerDepth2Expression);
			if (result == null)
				result = caseExpression(headerDepth2Expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.HEADER_DEPTH3_EXPRESSION: {
			HeaderDepth3Expression headerDepth3Expression = (HeaderDepth3Expression) theEObject;
			T result = caseHeaderDepth3Expression(headerDepth3Expression);
			if (result == null)
				result = caseHeaderExpression(headerDepth3Expression);
			if (result == null)
				result = caseExpression(headerDepth3Expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.HEADER_DEPTH5_EXPRESSION: {
			HeaderDepth5Expression headerDepth5Expression = (HeaderDepth5Expression) theEObject;
			T result = caseHeaderDepth5Expression(headerDepth5Expression);
			if (result == null)
				result = caseHeaderExpression(headerDepth5Expression);
			if (result == null)
				result = caseExpression(headerDepth5Expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.HEADER_DEPTH6_EXPRESSION: {
			HeaderDepth6Expression headerDepth6Expression = (HeaderDepth6Expression) theEObject;
			T result = caseHeaderDepth6Expression(headerDepth6Expression);
			if (result == null)
				result = caseHeaderExpression(headerDepth6Expression);
			if (result == null)
				result = caseExpression(headerDepth6Expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.HEADER_DEPTH4_EXPRESSION: {
			HeaderDepth4Expression headerDepth4Expression = (HeaderDepth4Expression) theEObject;
			T result = caseHeaderDepth4Expression(headerDepth4Expression);
			if (result == null)
				result = caseHeaderExpression(headerDepth4Expression);
			if (result == null)
				result = caseExpression(headerDepth4Expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MarkdownPackage.TEXTUAL_EXPRESSION: {
			TextualExpression textualExpression = (TextualExpression) theEObject;
			T result = caseTextualExpression(textualExpression);
			if (result == null)
				result = caseEmphasisExpression(textualExpression);
			if (result == null)
				result = caseTextExpression(textualExpression);
			if (result == null)
				result = caseExpression(textualExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderExpression(HeaderExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextExpression(TextExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableExpression(TableExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableLine(TableLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalExpression(HorizontalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListExpression(ListExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quote Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quote Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuoteExpression(QuoteExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Break Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Break Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineBreakExpression(LineBreakExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emphasis Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emphasis Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmphasisExpression(EmphasisExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalicExpression(ItalicExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongExpression(StrongExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scratch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scratch Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScratchExpression(ScratchExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLExpression(HTMLExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeExpression(CodeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceExpression(ReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkExpression(LinkExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageExpression(ImageExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoExpression(VideoExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Depth1 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Depth1 Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderDepth1Expression(HeaderDepth1Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Depth2 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Depth2 Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderDepth2Expression(HeaderDepth2Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Depth3 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Depth3 Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderDepth3Expression(HeaderDepth3Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Depth5 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Depth5 Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderDepth5Expression(HeaderDepth5Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Depth6 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Depth6 Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderDepth6Expression(HeaderDepth6Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Depth4 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Depth4 Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderDepth4Expression(HeaderDepth4Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualExpression(TextualExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MarkdownSwitch
