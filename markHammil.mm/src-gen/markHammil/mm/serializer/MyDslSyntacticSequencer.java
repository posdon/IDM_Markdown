/*
 * generated by Xtext 2.12.0
 */
package markHammil.mm.serializer;

import com.google.inject.Inject;
import java.util.List;
import markHammil.mm.services.MyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CodeExpression_BLTerminalRuleCall_0_3_1_q;
	protected AbstractElementAlias match_Expression_BLTerminalRuleCall_0_0_1_1_q;
	protected AbstractElementAlias match_Header1Expression_BLTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Header1Expression_NumberSignKeyword_3_0_a;
	protected AbstractElementAlias match_Header2Expression_BLTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Header2Expression_NumberSignKeyword_3_0_a;
	protected AbstractElementAlias match_Header3Expression_BLTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Header3Expression_NumberSignKeyword_3_0_a;
	protected AbstractElementAlias match_Header4Expression_BLTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Header4Expression_NumberSignKeyword_3_0_a;
	protected AbstractElementAlias match_Header5Expression_BLTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Header5Expression_NumberSignKeyword_3_0_a;
	protected AbstractElementAlias match_Header6Expression_BLTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Header6Expression_NumberSignKeyword_3_0_a;
	protected AbstractElementAlias match_ImageExpression_BLTerminalRuleCall_6_q;
	protected AbstractElementAlias match_LinkExpression_BLTerminalRuleCall_0_6_q;
	protected AbstractElementAlias match_LinkExpression_BLTerminalRuleCall_1_5_q;
	protected AbstractElementAlias match_QuoteExpression_BLTerminalRuleCall_3_q;
	protected AbstractElementAlias match_RefExpression_BLTerminalRuleCall_5_q;
	protected AbstractElementAlias match_VideoExpression_BLTerminalRuleCall_8_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_CodeExpression_BLTerminalRuleCall_0_3_1_q = new TokenAlias(false, true, grammarAccess.getCodeExpressionAccess().getBLTerminalRuleCall_0_3_1());
		match_Expression_BLTerminalRuleCall_0_0_1_1_q = new TokenAlias(false, true, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_1_1());
		match_Header1Expression_BLTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getHeader1ExpressionAccess().getBLTerminalRuleCall_4());
		match_Header1Expression_NumberSignKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0());
		match_Header2Expression_BLTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getHeader2ExpressionAccess().getBLTerminalRuleCall_4());
		match_Header2Expression_NumberSignKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0());
		match_Header3Expression_BLTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getHeader3ExpressionAccess().getBLTerminalRuleCall_4());
		match_Header3Expression_NumberSignKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0());
		match_Header4Expression_BLTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getHeader4ExpressionAccess().getBLTerminalRuleCall_4());
		match_Header4Expression_NumberSignKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0());
		match_Header5Expression_BLTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getHeader5ExpressionAccess().getBLTerminalRuleCall_4());
		match_Header5Expression_NumberSignKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0());
		match_Header6Expression_BLTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getHeader6ExpressionAccess().getBLTerminalRuleCall_4());
		match_Header6Expression_NumberSignKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0());
		match_ImageExpression_BLTerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getImageExpressionAccess().getBLTerminalRuleCall_6());
		match_LinkExpression_BLTerminalRuleCall_0_6_q = new TokenAlias(false, true, grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_0_6());
		match_LinkExpression_BLTerminalRuleCall_1_5_q = new TokenAlias(false, true, grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_1_5());
		match_QuoteExpression_BLTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_3());
		match_RefExpression_BLTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getRefExpressionAccess().getBLTerminalRuleCall_5());
		match_VideoExpression_BLTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getVideoExpressionAccess().getBLTerminalRuleCall_8());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBLRule())
			return getBLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BL: ('\r'? '\n');
	 */
	protected String getBLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_CodeExpression_BLTerminalRuleCall_0_3_1_q.equals(syntax))
				emit_CodeExpression_BLTerminalRuleCall_0_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Expression_BLTerminalRuleCall_0_0_1_1_q.equals(syntax))
				emit_Expression_BLTerminalRuleCall_0_0_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header1Expression_BLTerminalRuleCall_4_q.equals(syntax))
				emit_Header1Expression_BLTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header1Expression_NumberSignKeyword_3_0_a.equals(syntax))
				emit_Header1Expression_NumberSignKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header2Expression_BLTerminalRuleCall_4_q.equals(syntax))
				emit_Header2Expression_BLTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header2Expression_NumberSignKeyword_3_0_a.equals(syntax))
				emit_Header2Expression_NumberSignKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header3Expression_BLTerminalRuleCall_4_q.equals(syntax))
				emit_Header3Expression_BLTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header3Expression_NumberSignKeyword_3_0_a.equals(syntax))
				emit_Header3Expression_NumberSignKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header4Expression_BLTerminalRuleCall_4_q.equals(syntax))
				emit_Header4Expression_BLTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header4Expression_NumberSignKeyword_3_0_a.equals(syntax))
				emit_Header4Expression_NumberSignKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header5Expression_BLTerminalRuleCall_4_q.equals(syntax))
				emit_Header5Expression_BLTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header5Expression_NumberSignKeyword_3_0_a.equals(syntax))
				emit_Header5Expression_NumberSignKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header6Expression_BLTerminalRuleCall_4_q.equals(syntax))
				emit_Header6Expression_BLTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Header6Expression_NumberSignKeyword_3_0_a.equals(syntax))
				emit_Header6Expression_NumberSignKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImageExpression_BLTerminalRuleCall_6_q.equals(syntax))
				emit_ImageExpression_BLTerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinkExpression_BLTerminalRuleCall_0_6_q.equals(syntax))
				emit_LinkExpression_BLTerminalRuleCall_0_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinkExpression_BLTerminalRuleCall_1_5_q.equals(syntax))
				emit_LinkExpression_BLTerminalRuleCall_1_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_QuoteExpression_BLTerminalRuleCall_3_q.equals(syntax))
				emit_QuoteExpression_BLTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RefExpression_BLTerminalRuleCall_5_q.equals(syntax))
				emit_RefExpression_BLTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_VideoExpression_BLTerminalRuleCall_8_q.equals(syntax))
				emit_VideoExpression_BLTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     content+=TextExpression (ambiguity) '```' BL (rule end)
	 *     content+=TextExpression (ambiguity) content+=TextExpression
	 */
	protected void emit_CodeExpression_BLTerminalRuleCall_0_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     c=TextExpression (ambiguity) (rule end)
	 */
	protected void emit_Expression_BLTerminalRuleCall_0_0_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression '#'* (ambiguity) (rule end)
	 */
	protected void emit_Header1Expression_BLTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'*
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression (ambiguity) BL? (rule end)
	 */
	protected void emit_Header1Expression_NumberSignKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression '#'* (ambiguity) (rule end)
	 */
	protected void emit_Header2Expression_BLTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'*
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression (ambiguity) BL? (rule end)
	 */
	protected void emit_Header2Expression_NumberSignKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression '#'* (ambiguity) (rule end)
	 */
	protected void emit_Header3Expression_BLTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'*
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression (ambiguity) BL? (rule end)
	 */
	protected void emit_Header3Expression_NumberSignKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression '#'* (ambiguity) (rule end)
	 */
	protected void emit_Header4Expression_BLTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'*
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression (ambiguity) BL? (rule end)
	 */
	protected void emit_Header4Expression_NumberSignKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression '#'* (ambiguity) (rule end)
	 */
	protected void emit_Header5Expression_BLTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'*
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression (ambiguity) BL? (rule end)
	 */
	protected void emit_Header5Expression_NumberSignKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression '#'* (ambiguity) (rule end)
	 */
	protected void emit_Header6Expression_BLTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'*
	 *
	 * This ambiguous syntax occurs at:
	 *     title+=EmphasisExpression (ambiguity) BL? (rule end)
	 */
	protected void emit_Header6Expression_NumberSignKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     altText=NaturalExpression '](' ')' (ambiguity) (rule end)
	 *     linkContent=NaturalExpression ')' (ambiguity) (rule end)
	 */
	protected void emit_ImageExpression_BLTerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     altText=NaturalExpression '](' ')' (ambiguity) (rule end)
	 *     linkContent=NaturalExpression ')' (ambiguity) (rule end)
	 */
	protected void emit_LinkExpression_BLTerminalRuleCall_0_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     altText=NaturalExpression '][' ']' (ambiguity) (rule end)
	 *     refName=NaturalExpression ']' (ambiguity) (rule end)
	 */
	protected void emit_LinkExpression_BLTerminalRuleCall_1_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     content+=TextExpression (ambiguity) (rule end)
	 */
	protected void emit_QuoteExpression_BLTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     refContent=NaturalExpression (ambiguity) (rule end)
	 *     refName=NaturalExpression ']:' (ambiguity) (rule end)
	 */
	protected void emit_RefExpression_BLTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     altText=NaturalExpression '](' ')](' ')' (ambiguity) (rule end)
	 *     linkImage=NaturalExpression ')](' ')' (ambiguity) (rule end)
	 *     linkVideo=NaturalExpression ')' (ambiguity) (rule end)
	 */
	protected void emit_VideoExpression_BLTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
