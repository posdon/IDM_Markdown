/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl.provider;

import java.util.ArrayList;
import java.util.Collection;

import markHammil.mm.myDsl.util.MyDslAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslItemProviderAdapterFactory extends MyDslAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyDslItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.File} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileItemProvider fileItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileAdapter() {
		if (fileItemProvider == null) {
			fileItemProvider = new FileItemProvider(this);
		}

		return fileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionItemProvider expressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionAdapter() {
		if (expressionItemProvider == null) {
			expressionItemProvider = new ExpressionItemProvider(this);
		}

		return expressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.BreakLineExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakLineExpressionItemProvider breakLineExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.BreakLineExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBreakLineExpressionAdapter() {
		if (breakLineExpressionItemProvider == null) {
			breakLineExpressionItemProvider = new BreakLineExpressionItemProvider(this);
		}

		return breakLineExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.TextExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextExpressionItemProvider textExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.TextExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextExpressionAdapter() {
		if (textExpressionItemProvider == null) {
			textExpressionItemProvider = new TextExpressionItemProvider(this);
		}

		return textExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.QuoteExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuoteExpressionItemProvider quoteExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.QuoteExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuoteExpressionAdapter() {
		if (quoteExpressionItemProvider == null) {
			quoteExpressionItemProvider = new QuoteExpressionItemProvider(this);
		}

		return quoteExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.CodeExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeExpressionItemProvider codeExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.CodeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeExpressionAdapter() {
		if (codeExpressionItemProvider == null) {
			codeExpressionItemProvider = new CodeExpressionItemProvider(this);
		}

		return codeExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.RefExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefExpressionItemProvider refExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.RefExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRefExpressionAdapter() {
		if (refExpressionItemProvider == null) {
			refExpressionItemProvider = new RefExpressionItemProvider(this);
		}

		return refExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.LinkExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkExpressionItemProvider linkExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.LinkExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkExpressionAdapter() {
		if (linkExpressionItemProvider == null) {
			linkExpressionItemProvider = new LinkExpressionItemProvider(this);
		}

		return linkExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.ImageExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageExpressionItemProvider imageExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.ImageExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageExpressionAdapter() {
		if (imageExpressionItemProvider == null) {
			imageExpressionItemProvider = new ImageExpressionItemProvider(this);
		}

		return imageExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.VideoExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoExpressionItemProvider videoExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.VideoExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVideoExpressionAdapter() {
		if (videoExpressionItemProvider == null) {
			videoExpressionItemProvider = new VideoExpressionItemProvider(this);
		}

		return videoExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.HeaderExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderExpressionItemProvider headerExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.HeaderExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeaderExpressionAdapter() {
		if (headerExpressionItemProvider == null) {
			headerExpressionItemProvider = new HeaderExpressionItemProvider(this);
		}

		return headerExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.Header1Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Header1ExpressionItemProvider header1ExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.Header1Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeader1ExpressionAdapter() {
		if (header1ExpressionItemProvider == null) {
			header1ExpressionItemProvider = new Header1ExpressionItemProvider(this);
		}

		return header1ExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.Header2Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Header2ExpressionItemProvider header2ExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.Header2Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeader2ExpressionAdapter() {
		if (header2ExpressionItemProvider == null) {
			header2ExpressionItemProvider = new Header2ExpressionItemProvider(this);
		}

		return header2ExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.Header3Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Header3ExpressionItemProvider header3ExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.Header3Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeader3ExpressionAdapter() {
		if (header3ExpressionItemProvider == null) {
			header3ExpressionItemProvider = new Header3ExpressionItemProvider(this);
		}

		return header3ExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.Header4Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Header4ExpressionItemProvider header4ExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.Header4Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeader4ExpressionAdapter() {
		if (header4ExpressionItemProvider == null) {
			header4ExpressionItemProvider = new Header4ExpressionItemProvider(this);
		}

		return header4ExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.Header5Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Header5ExpressionItemProvider header5ExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.Header5Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeader5ExpressionAdapter() {
		if (header5ExpressionItemProvider == null) {
			header5ExpressionItemProvider = new Header5ExpressionItemProvider(this);
		}

		return header5ExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.Header6Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Header6ExpressionItemProvider header6ExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.Header6Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeader6ExpressionAdapter() {
		if (header6ExpressionItemProvider == null) {
			header6ExpressionItemProvider = new Header6ExpressionItemProvider(this);
		}

		return header6ExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.EmphasisExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmphasisExpressionItemProvider emphasisExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.EmphasisExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmphasisExpressionAdapter() {
		if (emphasisExpressionItemProvider == null) {
			emphasisExpressionItemProvider = new EmphasisExpressionItemProvider(this);
		}

		return emphasisExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.BreakLineExpressionB} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakLineExpressionBItemProvider breakLineExpressionBItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.BreakLineExpressionB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBreakLineExpressionBAdapter() {
		if (breakLineExpressionBItemProvider == null) {
			breakLineExpressionBItemProvider = new BreakLineExpressionBItemProvider(this);
		}

		return breakLineExpressionBItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.StrongExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongExpressionItemProvider strongExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.StrongExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStrongExpressionAdapter() {
		if (strongExpressionItemProvider == null) {
			strongExpressionItemProvider = new StrongExpressionItemProvider(this);
		}

		return strongExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.ItalicExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItalicExpressionItemProvider italicExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.ItalicExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItalicExpressionAdapter() {
		if (italicExpressionItemProvider == null) {
			italicExpressionItemProvider = new ItalicExpressionItemProvider(this);
		}

		return italicExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link markHammil.mm.myDsl.ScratchExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScratchExpressionItemProvider scratchExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link markHammil.mm.myDsl.ScratchExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScratchExpressionAdapter() {
		if (scratchExpressionItemProvider == null) {
			scratchExpressionItemProvider = new ScratchExpressionItemProvider(this);
		}

		return scratchExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (fileItemProvider != null) fileItemProvider.dispose();
		if (expressionItemProvider != null) expressionItemProvider.dispose();
		if (breakLineExpressionItemProvider != null) breakLineExpressionItemProvider.dispose();
		if (textExpressionItemProvider != null) textExpressionItemProvider.dispose();
		if (quoteExpressionItemProvider != null) quoteExpressionItemProvider.dispose();
		if (codeExpressionItemProvider != null) codeExpressionItemProvider.dispose();
		if (refExpressionItemProvider != null) refExpressionItemProvider.dispose();
		if (linkExpressionItemProvider != null) linkExpressionItemProvider.dispose();
		if (imageExpressionItemProvider != null) imageExpressionItemProvider.dispose();
		if (videoExpressionItemProvider != null) videoExpressionItemProvider.dispose();
		if (headerExpressionItemProvider != null) headerExpressionItemProvider.dispose();
		if (header1ExpressionItemProvider != null) header1ExpressionItemProvider.dispose();
		if (header2ExpressionItemProvider != null) header2ExpressionItemProvider.dispose();
		if (header3ExpressionItemProvider != null) header3ExpressionItemProvider.dispose();
		if (header4ExpressionItemProvider != null) header4ExpressionItemProvider.dispose();
		if (header5ExpressionItemProvider != null) header5ExpressionItemProvider.dispose();
		if (header6ExpressionItemProvider != null) header6ExpressionItemProvider.dispose();
		if (emphasisExpressionItemProvider != null) emphasisExpressionItemProvider.dispose();
		if (breakLineExpressionBItemProvider != null) breakLineExpressionBItemProvider.dispose();
		if (strongExpressionItemProvider != null) strongExpressionItemProvider.dispose();
		if (italicExpressionItemProvider != null) italicExpressionItemProvider.dispose();
		if (scratchExpressionItemProvider != null) scratchExpressionItemProvider.dispose();
	}

}
