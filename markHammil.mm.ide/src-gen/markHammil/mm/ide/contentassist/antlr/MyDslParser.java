/*
 * generated by Xtext 2.12.0
 */
package markHammil.mm.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import markHammil.mm.ide.contentassist.antlr.internal.InternalMyDslParser;
import markHammil.mm.services.MyDslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
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
					put(grammarAccess.getExpressionAccess().getAlternatives_0_0(), "rule__Expression__Alternatives_0_0");
					put(grammarAccess.getHorizontalExpressionAccess().getAlternatives_1(), "rule__HorizontalExpression__Alternatives_1");
					put(grammarAccess.getHorizontalExpressionAccess().getAlternatives_2(), "rule__HorizontalExpression__Alternatives_2");
					put(grammarAccess.getHorizontalExpressionAccess().getAlternatives_3(), "rule__HorizontalExpression__Alternatives_3");
					put(grammarAccess.getTextExpressionAccess().getAlternatives(), "rule__TextExpression__Alternatives");
					put(grammarAccess.getTextExpressionAccess().getAlternatives_0_0(), "rule__TextExpression__Alternatives_0_0");
					put(grammarAccess.getURLedExpressionAccess().getAlternatives_1(), "rule__URLedExpression__Alternatives_1");
					put(grammarAccess.getURLedExpressionAccess().getAlternatives_1_0_0(), "rule__URLedExpression__Alternatives_1_0_0");
					put(grammarAccess.getListExpressionAccess().getAlternatives(), "rule__ListExpression__Alternatives");
					put(grammarAccess.getListExpressionAccess().getAlternatives_0_1_0(), "rule__ListExpression__Alternatives_0_1_0");
					put(grammarAccess.getHeaderExpressionAccess().getAlternatives(), "rule__HeaderExpression__Alternatives");
					put(grammarAccess.getEmphasisExpressionAccess().getAlternatives(), "rule__EmphasisExpression__Alternatives");
					put(grammarAccess.getEmphasisExpressionAccess().getAlternatives_0_0(), "rule__EmphasisExpression__Alternatives_0_0");
					put(grammarAccess.getContentAccess().getAlternatives(), "rule__Content__Alternatives");
					put(grammarAccess.getContentAccess().getAlternatives_0_0(), "rule__Content__Alternatives_0_0");
					put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_0(), "rule__Expression__Group_0__0");
					put(grammarAccess.getExpressionAccess().getGroup_0_0_3(), "rule__Expression__Group_0_0_3__0");
					put(grammarAccess.getExpressionAccess().getGroup_0_0_4(), "rule__Expression__Group_0_0_4__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getBreakLineExpressionAccess().getGroup(), "rule__BreakLineExpression__Group__0");
					put(grammarAccess.getHorizontalExpressionAccess().getGroup(), "rule__HorizontalExpression__Group__0");
					put(grammarAccess.getTextExpressionAccess().getGroup_0(), "rule__TextExpression__Group_0__0");
					put(grammarAccess.getURLedExpressionAccess().getGroup(), "rule__URLedExpression__Group__0");
					put(grammarAccess.getURLedExpressionAccess().getGroup_1_0(), "rule__URLedExpression__Group_1_0__0");
					put(grammarAccess.getListExpressionAccess().getGroup_0(), "rule__ListExpression__Group_0__0");
					put(grammarAccess.getListExpressionAccess().getGroup_0_1(), "rule__ListExpression__Group_0_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_1(), "rule__ListExpression__Group_1__0");
					put(grammarAccess.getQuoteExpressionAccess().getGroup(), "rule__QuoteExpression__Group__0");
					put(grammarAccess.getTabExpressionAccess().getGroup(), "rule__TabExpression__Group__0");
					put(grammarAccess.getTabExpressionAccess().getGroup_1(), "rule__TabExpression__Group_1__0");
					put(grammarAccess.getTabExpressionAccess().getGroup_1_0(), "rule__TabExpression__Group_1_0__0");
					put(grammarAccess.getTabExpressionAccess().getGroup_1_0_3(), "rule__TabExpression__Group_1_0_3__0");
					put(grammarAccess.getTabExpressionAccess().getGroup_1_0_3_0(), "rule__TabExpression__Group_1_0_3_0__0");
					put(grammarAccess.getTabSeparationAccess().getGroup(), "rule__TabSeparation__Group__0");
					put(grammarAccess.getTabSeparationAccess().getGroup_3(), "rule__TabSeparation__Group_3__0");
					put(grammarAccess.getLineExpressionAccess().getGroup(), "rule__LineExpression__Group__0");
					put(grammarAccess.getLineExpressionAccess().getGroup_2(), "rule__LineExpression__Group_2__0");
					put(grammarAccess.getRefExpressionAccess().getGroup(), "rule__RefExpression__Group__0");
					put(grammarAccess.getLinkExpressionAccess().getGroup(), "rule__LinkExpression__Group__0");
					put(grammarAccess.getImageExpressionAccess().getGroup(), "rule__ImageExpression__Group__0");
					put(grammarAccess.getVideoExpressionAccess().getGroup(), "rule__VideoExpression__Group__0");
					put(grammarAccess.getHeader1ExpressionAccess().getGroup(), "rule__Header1Expression__Group__0");
					put(grammarAccess.getHeader1ExpressionAccess().getGroup_3(), "rule__Header1Expression__Group_3__0");
					put(grammarAccess.getHeader2ExpressionAccess().getGroup(), "rule__Header2Expression__Group__0");
					put(grammarAccess.getHeader2ExpressionAccess().getGroup_3(), "rule__Header2Expression__Group_3__0");
					put(grammarAccess.getHeader3ExpressionAccess().getGroup(), "rule__Header3Expression__Group__0");
					put(grammarAccess.getHeader3ExpressionAccess().getGroup_3(), "rule__Header3Expression__Group_3__0");
					put(grammarAccess.getHeader4ExpressionAccess().getGroup(), "rule__Header4Expression__Group__0");
					put(grammarAccess.getHeader4ExpressionAccess().getGroup_3(), "rule__Header4Expression__Group_3__0");
					put(grammarAccess.getHeader5ExpressionAccess().getGroup(), "rule__Header5Expression__Group__0");
					put(grammarAccess.getHeader5ExpressionAccess().getGroup_3(), "rule__Header5Expression__Group_3__0");
					put(grammarAccess.getHeader6ExpressionAccess().getGroup(), "rule__Header6Expression__Group__0");
					put(grammarAccess.getHeader6ExpressionAccess().getGroup_3(), "rule__Header6Expression__Group_3__0");
					put(grammarAccess.getEmphasisExpressionAccess().getGroup_0(), "rule__EmphasisExpression__Group_0__0");
					put(grammarAccess.getStrongExpressionAccess().getGroup(), "rule__StrongExpression__Group__0");
					put(grammarAccess.getItalicExpressionAccess().getGroup(), "rule__ItalicExpression__Group__0");
					put(grammarAccess.getScratchExpressionAccess().getGroup(), "rule__ScratchExpression__Group__0");
					put(grammarAccess.getNaturalExpressionAccess().getGroup(), "rule__NaturalExpression__Group__0");
					put(grammarAccess.getContentAccess().getGroup_0(), "rule__Content__Group_0__0");
					put(grammarAccess.getFileAccess().getExpressionAssignment_1(), "rule__File__ExpressionAssignment_1");
					put(grammarAccess.getExpressionAccess().getCAssignment_0_0_0(), "rule__Expression__CAssignment_0_0_0");
					put(grammarAccess.getExpressionAccess().getCAssignment_0_0_1(), "rule__Expression__CAssignment_0_0_1");
					put(grammarAccess.getExpressionAccess().getCAssignment_0_0_2(), "rule__Expression__CAssignment_0_0_2");
					put(grammarAccess.getExpressionAccess().getCAssignment_0_0_3_0(), "rule__Expression__CAssignment_0_0_3_0");
					put(grammarAccess.getExpressionAccess().getCAssignment_0_0_4_0(), "rule__Expression__CAssignment_0_0_4_0");
					put(grammarAccess.getExpressionAccess().getCAssignment_1_0(), "rule__Expression__CAssignment_1_0");
					put(grammarAccess.getURLedExpressionAccess().getCAssignment_1_0_0_0(), "rule__URLedExpression__CAssignment_1_0_0_0");
					put(grammarAccess.getURLedExpressionAccess().getCAssignment_1_0_0_1(), "rule__URLedExpression__CAssignment_1_0_0_1");
					put(grammarAccess.getURLedExpressionAccess().getCAssignment_1_1(), "rule__URLedExpression__CAssignment_1_1");
					put(grammarAccess.getListExpressionAccess().getContentUnorderedAssignment_0_1_2(), "rule__ListExpression__ContentUnorderedAssignment_0_1_2");
					put(grammarAccess.getListExpressionAccess().getContentOrderedAssignment_1_3(), "rule__ListExpression__ContentOrderedAssignment_1_3");
					put(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2(), "rule__QuoteExpression__ContentAssignment_2");
					put(grammarAccess.getTabExpressionAccess().getHeaderAssignment_1_0_0(), "rule__TabExpression__HeaderAssignment_1_0_0");
					put(grammarAccess.getTabExpressionAccess().getLinesAssignment_1_0_3_0_1(), "rule__TabExpression__LinesAssignment_1_0_3_0_1");
					put(grammarAccess.getLineExpressionAccess().getCellsAssignment_1(), "rule__LineExpression__CellsAssignment_1");
					put(grammarAccess.getLineExpressionAccess().getCellsAssignment_2_1(), "rule__LineExpression__CellsAssignment_2_1");
					put(grammarAccess.getRefExpressionAccess().getRefNameAssignment_2(), "rule__RefExpression__RefNameAssignment_2");
					put(grammarAccess.getRefExpressionAccess().getRefContentAssignment_4(), "rule__RefExpression__RefContentAssignment_4");
					put(grammarAccess.getLinkExpressionAccess().getAltTextAssignment_2(), "rule__LinkExpression__AltTextAssignment_2");
					put(grammarAccess.getLinkExpressionAccess().getLinkContentAssignment_4(), "rule__LinkExpression__LinkContentAssignment_4");
					put(grammarAccess.getImageExpressionAccess().getAltTextAssignment_2(), "rule__ImageExpression__AltTextAssignment_2");
					put(grammarAccess.getImageExpressionAccess().getLinkContentAssignment_4(), "rule__ImageExpression__LinkContentAssignment_4");
					put(grammarAccess.getVideoExpressionAccess().getAltTextAssignment_2(), "rule__VideoExpression__AltTextAssignment_2");
					put(grammarAccess.getVideoExpressionAccess().getLinkImageAssignment_4(), "rule__VideoExpression__LinkImageAssignment_4");
					put(grammarAccess.getVideoExpressionAccess().getLinkVideoAssignment_6(), "rule__VideoExpression__LinkVideoAssignment_6");
					put(grammarAccess.getHeader1ExpressionAccess().getTitleAssignment_2(), "rule__Header1Expression__TitleAssignment_2");
					put(grammarAccess.getHeader2ExpressionAccess().getTitleAssignment_2(), "rule__Header2Expression__TitleAssignment_2");
					put(grammarAccess.getHeader3ExpressionAccess().getTitleAssignment_2(), "rule__Header3Expression__TitleAssignment_2");
					put(grammarAccess.getHeader4ExpressionAccess().getTitleAssignment_2(), "rule__Header4Expression__TitleAssignment_2");
					put(grammarAccess.getHeader5ExpressionAccess().getTitleAssignment_2(), "rule__Header5Expression__TitleAssignment_2");
					put(grammarAccess.getHeader6ExpressionAccess().getTitleAssignment_2(), "rule__Header6Expression__TitleAssignment_2");
					put(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_0(), "rule__EmphasisExpression__CAssignment_0_0_0");
					put(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_1(), "rule__EmphasisExpression__CAssignment_0_0_1");
					put(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_2(), "rule__EmphasisExpression__CAssignment_0_0_2");
					put(grammarAccess.getEmphasisExpressionAccess().getCAssignment_1(), "rule__EmphasisExpression__CAssignment_1");
					put(grammarAccess.getStrongExpressionAccess().getContentAssignment_2(), "rule__StrongExpression__ContentAssignment_2");
					put(grammarAccess.getItalicExpressionAccess().getContentAssignment_2(), "rule__ItalicExpression__ContentAssignment_2");
					put(grammarAccess.getScratchExpressionAccess().getContentAssignment_2(), "rule__ScratchExpression__ContentAssignment_2");
					put(grammarAccess.getNaturalExpressionAccess().getValueAssignment_1(), "rule__NaturalExpression__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
