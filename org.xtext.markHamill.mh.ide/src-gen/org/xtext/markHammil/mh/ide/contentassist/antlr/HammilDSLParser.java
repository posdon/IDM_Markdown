/*
 * generated by Xtext 2.12.0
 */
package org.xtext.markHammil.mh.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.markHammil.mh.ide.contentassist.antlr.internal.InternalHammilDSLParser;
import org.xtext.markHammil.mh.services.HammilDSLGrammarAccess;

public class HammilDSLParser extends AbstractContentAssistParser {

	@Inject
	private HammilDSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalHammilDSLParser createParser() {
		InternalHammilDSLParser result = new InternalHammilDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives(), "rule__HeaderDepth1Expression__Alternatives");
					put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
					put(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0(), "rule__HeaderDepth1Expression__Group_0__0");
					put(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1(), "rule__HeaderDepth1Expression__Group_1__0");
					put(grammarAccess.getFileAccess().getExpressionAssignment_1(), "rule__File__ExpressionAssignment_1");
					put(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_1(), "rule__HeaderDepth1Expression__TitleAssignment_0_1");
					put(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0(), "rule__HeaderDepth1Expression__TitleAssignment_1_0");
					put(grammarAccess.getTextualExpressionAccess().getContentStringAssignment(), "rule__TextualExpression__ContentStringAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public HammilDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HammilDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}