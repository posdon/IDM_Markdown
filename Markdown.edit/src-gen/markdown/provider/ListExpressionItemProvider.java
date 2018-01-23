/**
 */
package markdown.provider;

import java.util.Collection;
import java.util.List;

import markdown.ListExpression;
import markdown.MarkdownFactory;
import markdown.MarkdownPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link markdown.ListExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addStartingValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Starting Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartingValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListExpression_startingValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListExpression_startingValue_feature",
								"_UI_ListExpression_type"),
						MarkdownPackage.Literals.LIST_EXPRESSION__STARTING_VALUE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(MarkdownPackage.Literals.LIST_EXPRESSION__LIST_CONTENT);
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
	 * This returns ListExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListExpression"));
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
		Integer labelValue = ((ListExpression) object).getStartingValue();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_ListExpression_type")
				: getString("_UI_ListExpression_type") + " " + label;
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

		switch (notification.getFeatureID(ListExpression.class)) {
		case MarkdownPackage.LIST_EXPRESSION__STARTING_VALUE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MarkdownPackage.LIST_EXPRESSION__LIST_CONTENT:
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

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.LIST_EXPRESSION__LIST_CONTENT,
				MarkdownFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.LIST_EXPRESSION__LIST_CONTENT,
				MarkdownFactory.eINSTANCE.createHorizontalExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.LIST_EXPRESSION__LIST_CONTENT,
				MarkdownFactory.eINSTANCE.createQuoteExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.LIST_EXPRESSION__LIST_CONTENT,
				MarkdownFactory.eINSTANCE.createEmphasisExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.LIST_EXPRESSION__LIST_CONTENT,
				MarkdownFactory.eINSTANCE.createItalicExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.LIST_EXPRESSION__LIST_CONTENT,
				MarkdownFactory.eINSTANCE.createStrongExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.LIST_EXPRESSION__LIST_CONTENT,
				MarkdownFactory.eINSTANCE.createScratchExpression()));

		newChildDescriptors.add(createChildParameter(MarkdownPackage.Literals.LIST_EXPRESSION__LIST_CONTENT,
				MarkdownFactory.eINSTANCE.createTextBloc()));
	}

}