/**
 */
package markdown.util;

import markdown.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see markdown.MarkdownPackage
 * @generated
 */
public class MarkdownAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MarkdownPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkdownAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MarkdownPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkdownSwitch<Adapter> modelSwitch = new MarkdownSwitch<Adapter>() {
		@Override
		public Adapter caseFile(File object) {
			return createFileAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseHeaderExpression(HeaderExpression object) {
			return createHeaderExpressionAdapter();
		}

		@Override
		public Adapter caseTextExpression(TextExpression object) {
			return createTextExpressionAdapter();
		}

		@Override
		public Adapter caseTableExpression(TableExpression object) {
			return createTableExpressionAdapter();
		}

		@Override
		public Adapter caseTableLine(TableLine object) {
			return createTableLineAdapter();
		}

		@Override
		public Adapter caseHorizontalExpression(HorizontalExpression object) {
			return createHorizontalExpressionAdapter();
		}

		@Override
		public Adapter caseListExpression(ListExpression object) {
			return createListExpressionAdapter();
		}

		@Override
		public Adapter caseQuoteExpression(QuoteExpression object) {
			return createQuoteExpressionAdapter();
		}

		@Override
		public Adapter caseLineBreakExpression(LineBreakExpression object) {
			return createLineBreakExpressionAdapter();
		}

		@Override
		public Adapter caseEmphasisExpression(EmphasisExpression object) {
			return createEmphasisExpressionAdapter();
		}

		@Override
		public Adapter caseItalicExpression(ItalicExpression object) {
			return createItalicExpressionAdapter();
		}

		@Override
		public Adapter caseStrongExpression(StrongExpression object) {
			return createStrongExpressionAdapter();
		}

		@Override
		public Adapter caseScratchExpression(ScratchExpression object) {
			return createScratchExpressionAdapter();
		}

		@Override
		public Adapter caseHTMLExpression(HTMLExpression object) {
			return createHTMLExpressionAdapter();
		}

		@Override
		public Adapter caseCodeExpression(CodeExpression object) {
			return createCodeExpressionAdapter();
		}

		@Override
		public Adapter caseReferenceExpression(ReferenceExpression object) {
			return createReferenceExpressionAdapter();
		}

		@Override
		public Adapter caseLinkExpression(LinkExpression object) {
			return createLinkExpressionAdapter();
		}

		@Override
		public Adapter caseImageExpression(ImageExpression object) {
			return createImageExpressionAdapter();
		}

		@Override
		public Adapter caseVideoExpression(VideoExpression object) {
			return createVideoExpressionAdapter();
		}

		@Override
		public Adapter caseHeaderDepth1Expression(HeaderDepth1Expression object) {
			return createHeaderDepth1ExpressionAdapter();
		}

		@Override
		public Adapter caseHeaderDepth2Expression(HeaderDepth2Expression object) {
			return createHeaderDepth2ExpressionAdapter();
		}

		@Override
		public Adapter caseHeaderDepth3Expression(HeaderDepth3Expression object) {
			return createHeaderDepth3ExpressionAdapter();
		}

		@Override
		public Adapter caseHeaderDepth5Expression(HeaderDepth5Expression object) {
			return createHeaderDepth5ExpressionAdapter();
		}

		@Override
		public Adapter caseHeaderDepth6Expression(HeaderDepth6Expression object) {
			return createHeaderDepth6ExpressionAdapter();
		}

		@Override
		public Adapter caseHeaderDepth4Expression(HeaderDepth4Expression object) {
			return createHeaderDepth4ExpressionAdapter();
		}

		@Override
		public Adapter caseTextualExpression(TextualExpression object) {
			return createTextualExpressionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.HeaderExpression <em>Header Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.HeaderExpression
	 * @generated
	 */
	public Adapter createHeaderExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.TextExpression <em>Text Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.TextExpression
	 * @generated
	 */
	public Adapter createTextExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.TableExpression <em>Table Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.TableExpression
	 * @generated
	 */
	public Adapter createTableExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.TableLine <em>Table Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.TableLine
	 * @generated
	 */
	public Adapter createTableLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.HorizontalExpression <em>Horizontal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.HorizontalExpression
	 * @generated
	 */
	public Adapter createHorizontalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.ListExpression <em>List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.ListExpression
	 * @generated
	 */
	public Adapter createListExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.QuoteExpression <em>Quote Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.QuoteExpression
	 * @generated
	 */
	public Adapter createQuoteExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.LineBreakExpression <em>Line Break Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.LineBreakExpression
	 * @generated
	 */
	public Adapter createLineBreakExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.EmphasisExpression <em>Emphasis Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.EmphasisExpression
	 * @generated
	 */
	public Adapter createEmphasisExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.ItalicExpression <em>Italic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.ItalicExpression
	 * @generated
	 */
	public Adapter createItalicExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.StrongExpression <em>Strong Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.StrongExpression
	 * @generated
	 */
	public Adapter createStrongExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.ScratchExpression <em>Scratch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.ScratchExpression
	 * @generated
	 */
	public Adapter createScratchExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.HTMLExpression <em>HTML Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.HTMLExpression
	 * @generated
	 */
	public Adapter createHTMLExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.CodeExpression <em>Code Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.CodeExpression
	 * @generated
	 */
	public Adapter createCodeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.ReferenceExpression <em>Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.ReferenceExpression
	 * @generated
	 */
	public Adapter createReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.LinkExpression <em>Link Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.LinkExpression
	 * @generated
	 */
	public Adapter createLinkExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.ImageExpression <em>Image Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.ImageExpression
	 * @generated
	 */
	public Adapter createImageExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.VideoExpression <em>Video Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.VideoExpression
	 * @generated
	 */
	public Adapter createVideoExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.HeaderDepth1Expression <em>Header Depth1 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.HeaderDepth1Expression
	 * @generated
	 */
	public Adapter createHeaderDepth1ExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.HeaderDepth2Expression <em>Header Depth2 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.HeaderDepth2Expression
	 * @generated
	 */
	public Adapter createHeaderDepth2ExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.HeaderDepth3Expression <em>Header Depth3 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.HeaderDepth3Expression
	 * @generated
	 */
	public Adapter createHeaderDepth3ExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.HeaderDepth5Expression <em>Header Depth5 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.HeaderDepth5Expression
	 * @generated
	 */
	public Adapter createHeaderDepth5ExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.HeaderDepth6Expression <em>Header Depth6 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.HeaderDepth6Expression
	 * @generated
	 */
	public Adapter createHeaderDepth6ExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.HeaderDepth4Expression <em>Header Depth4 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.HeaderDepth4Expression
	 * @generated
	 */
	public Adapter createHeaderDepth4ExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link markdown.TextualExpression <em>Textual Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see markdown.TextualExpression
	 * @generated
	 */
	public Adapter createTextualExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MarkdownAdapterFactory
