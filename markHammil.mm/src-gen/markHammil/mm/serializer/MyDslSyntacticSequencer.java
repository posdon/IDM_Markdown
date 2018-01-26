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
	protected AbstractElementAlias match_HeaderExpression_BLTerminalRuleCall_3_q;
	protected AbstractElementAlias match_HeaderExpression_NumberSignKeyword_2_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_HeaderExpression_BLTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getHeaderExpressionAccess().getBLTerminalRuleCall_3());
		match_HeaderExpression_NumberSignKeyword_2_a = new TokenAlias(true, true, grammarAccess.getHeaderExpressionAccess().getNumberSignKeyword_2());
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
			if (match_HeaderExpression_BLTerminalRuleCall_3_q.equals(syntax))
				emit_HeaderExpression_BLTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HeaderExpression_NumberSignKeyword_2_a.equals(syntax))
				emit_HeaderExpression_NumberSignKeyword_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     BL?
	 *
	 * This ambiguous syntax occurs at:
	 *     title=EmphasisExpression '#'* (ambiguity) (rule end)
	 */
	protected void emit_HeaderExpression_BLTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'*
	 *
	 * This ambiguous syntax occurs at:
	 *     title=EmphasisExpression (ambiguity) BL? (rule end)
	 */
	protected void emit_HeaderExpression_NumberSignKeyword_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
