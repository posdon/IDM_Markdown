/*
 * generated by Xtext 2.12.0
 */
package markHammil.mm.serializer;

import com.google.inject.Inject;
import java.util.Set;
import markHammil.mm.myDsl.EmphasisExpression;
import markHammil.mm.myDsl.File;
import markHammil.mm.myDsl.Header;
import markHammil.mm.myDsl.MyDslPackage;
import markHammil.mm.services.MyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.EMPHASIS_EXPRESSION:
				sequence_NaturalExpression(context, (EmphasisExpression) semanticObject); 
				return; 
			case MyDslPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case MyDslPackage.HEADER:
				sequence_HeaderExpression(context, (Header) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     File returns File
	 *
	 * Constraint:
	 *     expression+=Expression*
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Header
	 *     HeaderExpression returns Header
	 *
	 * Constraint:
	 *     title=EmphasisExpression
	 */
	protected void sequence_HeaderExpression(ISerializationContext context, Header semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.HEADER__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.HEADER__TITLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeaderExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EmphasisExpression returns EmphasisExpression
	 *     NaturalExpression returns EmphasisExpression
	 *
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_NaturalExpression(ISerializationContext context, EmphasisExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EMPHASIS_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EMPHASIS_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNaturalExpressionAccess().getValueIDTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
