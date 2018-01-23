/**
 */
package markdown.provider;

import java.util.Collection;
import java.util.List;

import markdown.File;
import markdown.MarkdownFactory;
import markdown.MarkdownPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link markdown.File} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MarkdownPackage.Literals.FILE__EXPRESSION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns File.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/File"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_File_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(File.class)) {
		case MarkdownPackage.FILE__EXPRESSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createTableExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createHorizontalExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createListExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createQuoteExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createLineBreakExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createItalicExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createStrongExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createScratchExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createHTMLExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createCodeExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createReferenceExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createLinkExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createImageExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createVideoExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createHeaderDepth1Expression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createHeaderDepth2Expression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createHeaderDepth3Expression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createHeaderDepth5Expression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createHeaderDepth6Expression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createHeaderDepth4Expression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.FILE__EXPRESSION,
				MarkdownFactory.eINSTANCE.createTextualExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MarkdownEditPlugin.INSTANCE;
	}

}
