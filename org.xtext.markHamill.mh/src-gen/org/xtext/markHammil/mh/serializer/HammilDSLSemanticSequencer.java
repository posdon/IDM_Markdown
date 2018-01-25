/*
 * generated by Xtext 2.12.0
 */
package org.xtext.markHammil.mh.serializer;

import com.google.inject.Inject;
import java.util.Set;
import markdown.CodeExpression;
import markdown.File;
import markdown.HeaderDepth1Expression;
import markdown.HeaderDepth2Expression;
import markdown.HeaderDepth3Expression;
import markdown.HeaderDepth4Expression;
import markdown.HeaderDepth5Expression;
import markdown.HeaderDepth6Expression;
import markdown.HorizontalExpression;
import markdown.MarkdownPackage;
import markdown.QuoteExpression;
import markdown.TextualExpression;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.markHammil.mh.services.HammilDSLGrammarAccess;

@SuppressWarnings("all")
public class HammilDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HammilDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MarkdownPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MarkdownPackage.CODE_EXPRESSION:
				sequence_CodeExpression(context, (CodeExpression) semanticObject); 
				return; 
			case MarkdownPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case MarkdownPackage.HEADER_DEPTH1_EXPRESSION:
				sequence_HeaderDepth1Expression(context, (HeaderDepth1Expression) semanticObject); 
				return; 
			case MarkdownPackage.HEADER_DEPTH2_EXPRESSION:
				sequence_HeaderDepth2Expression(context, (HeaderDepth2Expression) semanticObject); 
				return; 
			case MarkdownPackage.HEADER_DEPTH3_EXPRESSION:
				sequence_HeaderDepth3Expression(context, (HeaderDepth3Expression) semanticObject); 
				return; 
			case MarkdownPackage.HEADER_DEPTH4_EXPRESSION:
				sequence_HeaderDepth4Expression(context, (HeaderDepth4Expression) semanticObject); 
				return; 
			case MarkdownPackage.HEADER_DEPTH5_EXPRESSION:
				sequence_HeaderDepth5Expression(context, (HeaderDepth5Expression) semanticObject); 
				return; 
			case MarkdownPackage.HEADER_DEPTH6_EXPRESSION:
				sequence_HeaderDepth6Expression(context, (HeaderDepth6Expression) semanticObject); 
				return; 
			case MarkdownPackage.HORIZONTAL_EXPRESSION:
				sequence_HorizontalExpression(context, (HorizontalExpression) semanticObject); 
				return; 
			case MarkdownPackage.QUOTE_EXPRESSION:
				sequence_QuoteExpression(context, (QuoteExpression) semanticObject); 
				return; 
			case MarkdownPackage.TEXTUAL_EXPRESSION:
				sequence_TextualExpression(context, (TextualExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns CodeExpression
	 *     CodeExpression returns CodeExpression
	 *
	 * Constraint:
	 *     (text=String0 | text=String0)
	 */
	protected void sequence_CodeExpression(ISerializationContext context, CodeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     Expression returns HeaderDepth1Expression
	 *     HeaderDepth1Expression returns HeaderDepth1Expression
	 *
	 * Constraint:
	 *     (title=EmphasisExpression | title=EmphasisExpression)
	 */
	protected void sequence_HeaderDepth1Expression(ISerializationContext context, HeaderDepth1Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns HeaderDepth2Expression
	 *     HeaderDepth2Expression returns HeaderDepth2Expression
	 *
	 * Constraint:
	 *     (title=EmphasisExpression | title=EmphasisExpression)
	 */
	protected void sequence_HeaderDepth2Expression(ISerializationContext context, HeaderDepth2Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns HeaderDepth3Expression
	 *     HeaderDepth3Expression returns HeaderDepth3Expression
	 *
	 * Constraint:
	 *     title=EmphasisExpression
	 */
	protected void sequence_HeaderDepth3Expression(ISerializationContext context, HeaderDepth3Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MarkdownPackage.Literals.HEADER_EXPRESSION__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkdownPackage.Literals.HEADER_EXPRESSION__TITLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns HeaderDepth4Expression
	 *     HeaderDepth4Expression returns HeaderDepth4Expression
	 *
	 * Constraint:
	 *     title=EmphasisExpression
	 */
	protected void sequence_HeaderDepth4Expression(ISerializationContext context, HeaderDepth4Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MarkdownPackage.Literals.HEADER_EXPRESSION__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkdownPackage.Literals.HEADER_EXPRESSION__TITLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns HeaderDepth5Expression
	 *     HeaderDepth5Expression returns HeaderDepth5Expression
	 *
	 * Constraint:
	 *     title=EmphasisExpression
	 */
	protected void sequence_HeaderDepth5Expression(ISerializationContext context, HeaderDepth5Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MarkdownPackage.Literals.HEADER_EXPRESSION__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkdownPackage.Literals.HEADER_EXPRESSION__TITLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns HeaderDepth6Expression
	 *     HeaderDepth6Expression returns HeaderDepth6Expression
	 *
	 * Constraint:
	 *     title=EmphasisExpression
	 */
	protected void sequence_HeaderDepth6Expression(ISerializationContext context, HeaderDepth6Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MarkdownPackage.Literals.HEADER_EXPRESSION__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkdownPackage.Literals.HEADER_EXPRESSION__TITLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns HorizontalExpression
	 *     TextExpression returns HorizontalExpression
	 *     HorizontalExpression returns HorizontalExpression
	 *
	 * Constraint:
	 *     {HorizontalExpression}
	 */
	protected void sequence_HorizontalExpression(ISerializationContext context, HorizontalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns QuoteExpression
	 *     TextExpression returns QuoteExpression
	 *     QuoteExpression returns QuoteExpression
	 *
	 * Constraint:
	 *     textexpression=TextExpression
	 */
	protected void sequence_QuoteExpression(ISerializationContext context, QuoteExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MarkdownPackage.Literals.QUOTE_EXPRESSION__TEXTEXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkdownPackage.Literals.QUOTE_EXPRESSION__TEXTEXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQuoteExpressionAccess().getTextexpressionTextExpressionParserRuleCall_1_0(), semanticObject.getTextexpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns TextualExpression
	 *     TextExpression returns TextualExpression
	 *     EmphasisExpression returns TextualExpression
	 *     TextualExpression returns TextualExpression
	 *
	 * Constraint:
	 *     contentString=String0
	 */
	protected void sequence_TextualExpression(ISerializationContext context, TextualExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MarkdownPackage.Literals.TEXTUAL_EXPRESSION__CONTENT_STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkdownPackage.Literals.TEXTUAL_EXPRESSION__CONTENT_STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0(), semanticObject.getContentString());
		feeder.finish();
	}
	
	
}
