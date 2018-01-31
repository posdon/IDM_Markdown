/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl.provider;


import java.util.Collection;
import java.util.List;

import markHammil.mm.myDsl.MyDslFactory;
import markHammil.mm.myDsl.MyDslPackage;
import markHammil.mm.myDsl.TextExpression;
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
 * This is the item provider adapter for a {@link markHammil.mm.myDsl.TextExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextExpressionItemProvider 
	extends ListExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextExpressionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MyDslPackage.Literals.TEXT_EXPRESSION__C);
			childrenFeatures.add(MyDslPackage.Literals.TEXT_EXPRESSION__CONTENT_UNORDERED);
			childrenFeatures.add(MyDslPackage.Literals.TEXT_EXPRESSION__CONTENT);
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
	 * This returns TextExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TextExpression_type");
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

		switch (notification.getFeatureID(TextExpression.class)) {
			case MyDslPackage.TEXT_EXPRESSION__C:
			case MyDslPackage.TEXT_EXPRESSION__CONTENT_UNORDERED:
			case MyDslPackage.TEXT_EXPRESSION__CONTENT:
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

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createFile()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createBreakLineExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createListExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createQuoteExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createRefExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createLinkExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createImageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createVideoExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createTabExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createLineExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createHeaderExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createHeader1Expression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createHeader2Expression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createHeader3Expression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createHeader4Expression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createHeader5Expression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createHeader6Expression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createEmphasisExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createBreakLineExpressionB()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createStrongExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createItalicExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__C,
				 MyDslFactory.eINSTANCE.createScratchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__CONTENT_UNORDERED,
				 MyDslFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.TEXT_EXPRESSION__CONTENT,
				 MyDslFactory.eINSTANCE.createTextExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MyDslPackage.Literals.LIST_EXPRESSION__CONTENT_ORDERED ||
			childFeature == MyDslPackage.Literals.TEXT_EXPRESSION__C ||
			childFeature == MyDslPackage.Literals.TEXT_EXPRESSION__CONTENT_UNORDERED ||
			childFeature == MyDslPackage.Literals.TEXT_EXPRESSION__CONTENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
