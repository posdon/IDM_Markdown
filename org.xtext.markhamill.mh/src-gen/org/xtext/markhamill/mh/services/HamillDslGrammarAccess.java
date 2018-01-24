/*
 * generated by Xtext 2.12.0
 */
package org.xtext.markhamill.mh.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class HamillDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class FileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.File");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFileAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		
		//File markdown::File:
		//	{markdown::File} expression+=Expression*;
		@Override public ParserRule getRule() { return rule; }
		
		//{markdown::File} expression+=Expression*
		public Group getGroup() { return cGroup; }
		
		//{markdown::File}
		public Action getFileAction_0() { return cFileAction_0; }
		
		//expression+=Expression*
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.Expression");
		private final RuleCall cHeaderExpressionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expression markdown::Expression:
		//	HeaderExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//HeaderExpression
		public RuleCall getHeaderExpressionParserRuleCall() { return cHeaderExpressionParserRuleCall; }
	}
	public class TextualExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.TextualExpression");
		private final Assignment cContentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentIDTerminalRuleCall_0 = (RuleCall)cContentAssignment.eContents().get(0);
		
		//// | HeaderExpression;
		///*EmphasisExpression returns markdown::EmphasisExpression:
		//	 TextualExpression;
		//
		///* 
		//ItalicExpression returns markdown::ItalicExpression hidden(WS):
		//	 ('*'|'_') content+=[markdown::EmphasisExpression] ('*'|'_') WS* (content+=[markdown::EmphasisExpression])*
		//	;
		//
		//StrongExpression returns markdown::StrongExpression hidden(WS):
		//	 ('**'|'__') content+=[markdown::EmphasisExpression] ('**'|'__') WS* (content+=[markdown::EmphasisExpression])*
		//	 ;
		//
		//ScratchExpression returns markdown::ScratchExpression hidden(WS):
		//	'~~' content+=[markdown::EmphasisExpression] '~~' WS* (content+=[markdown::EmphasisExpression])*
		//	;
		//
		//*/ TextualExpression markdown::TextualExpression hidden(WS):
		//	content=ID
		//	//(followingExpression=[markdown::EmphasisExpression])?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//content=ID
		public Assignment getContentAssignment() { return cContentAssignment; }
		
		//ID
		public RuleCall getContentIDTerminalRuleCall_0() { return cContentIDTerminalRuleCall_0; }
	}
	public class HeaderExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.HeaderExpression");
		private final RuleCall cHeaderDepth1ExpressionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//HeaderExpression markdown::HeaderExpression:
		//	HeaderDepth1Expression //| =>( HeaderDepth2Expression |  =>( HeaderDepth3Expression | =>( HeaderDepth4Expression | =>(HeaderDepth5Expression | =>HeaderDepth6Expression))))
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//HeaderDepth1Expression
		public RuleCall getHeaderDepth1ExpressionParserRuleCall() { return cHeaderDepth1ExpressionParserRuleCall; }
	}
	public class HeaderDepth1ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.HeaderDepth1Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cContentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cContentTextualExpressionCrossReference_1_0 = (CrossReference)cContentAssignment_1.eContents().get(0);
		private final RuleCall cContentTextualExpressionIDTerminalRuleCall_1_0_1 = (RuleCall)cContentTextualExpressionCrossReference_1_0.eContents().get(1);
		
		//HeaderDepth1Expression markdown::HeaderDepth1Expression hidden(WS):
		//	'#' content=[markdown::TextualExpression];
		@Override public ParserRule getRule() { return rule; }
		
		//'#' content=[markdown::TextualExpression]
		public Group getGroup() { return cGroup; }
		
		//'#'
		public Keyword getNumberSignKeyword_0() { return cNumberSignKeyword_0; }
		
		//content=[markdown::TextualExpression]
		public Assignment getContentAssignment_1() { return cContentAssignment_1; }
		
		//[markdown::TextualExpression]
		public CrossReference getContentTextualExpressionCrossReference_1_0() { return cContentTextualExpressionCrossReference_1_0; }
		
		//ID
		public RuleCall getContentTextualExpressionIDTerminalRuleCall_1_0_1() { return cContentTextualExpressionIDTerminalRuleCall_1_0_1; }
	}
	public class BOOLEAN_LITERALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.BOOLEAN_LITERAL");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		///* 
		//HeaderDepth2Expression returns markdown::HeaderDepth2Expression hidden(WS):
		//	'##'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION |
		//	content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION  ('-')+  LINE_BREAK_EXPRESSION
		//	;
		//
		//HeaderDepth3Expression returns markdown::HeaderDepth3Expression hidden(WS):
		//	'###'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION
		//	;
		//
		//HeaderDepth5Expression returns markdown::HeaderDepth5Expression hidden(WS):
		//	'#####'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION
		//	;
		//
		//HeaderDepth6Expression returns markdown::HeaderDepth6Expression hidden(WS):
		//	'######'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION
		//	;
		//
		//HeaderDepth4Expression returns markdown::HeaderDepth4Expression hidden(WS):
		//	'####'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION
		//	;
		//*/ /* 
		//IntObject returns type::IntObject:
		//	'IntObject'; // TODO: implement this rule and an appropriate IValueConverter
		//*/ BOOLEAN_LITERAL ecore::EBoolean:
		//	'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	
	
	private final FileElements pFile;
	private final ExpressionElements pExpression;
	private final TextualExpressionElements pTextualExpression;
	private final HeaderExpressionElements pHeaderExpression;
	private final HeaderDepth1ExpressionElements pHeaderDepth1Expression;
	private final BOOLEAN_LITERALElements pBOOLEAN_LITERAL;
	private final TerminalRule tSTRING;
	private final TerminalRule tID;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tDIGIT;
	private final TerminalRule tDOUBLE;
	private final TerminalRule tINT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public HamillDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFile = new FileElements();
		this.pExpression = new ExpressionElements();
		this.pTextualExpression = new TextualExpressionElements();
		this.pHeaderExpression = new HeaderExpressionElements();
		this.pHeaderDepth1Expression = new HeaderDepth1ExpressionElements();
		this.pBOOLEAN_LITERAL = new BOOLEAN_LITERALElements();
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.STRING");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.ID");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.WS");
		this.tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.DIGIT");
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.DOUBLE");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.markhamill.mh.HamillDsl.INT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.markhamill.mh.HamillDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//File markdown::File:
	//	{markdown::File} expression+=Expression*;
	public FileElements getFileAccess() {
		return pFile;
	}
	
	public ParserRule getFileRule() {
		return getFileAccess().getRule();
	}
	
	//Expression markdown::Expression:
	//	HeaderExpression;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//// | HeaderExpression;
	///*EmphasisExpression returns markdown::EmphasisExpression:
	//	 TextualExpression;
	//
	///* 
	//ItalicExpression returns markdown::ItalicExpression hidden(WS):
	//	 ('*'|'_') content+=[markdown::EmphasisExpression] ('*'|'_') WS* (content+=[markdown::EmphasisExpression])*
	//	;
	//
	//StrongExpression returns markdown::StrongExpression hidden(WS):
	//	 ('**'|'__') content+=[markdown::EmphasisExpression] ('**'|'__') WS* (content+=[markdown::EmphasisExpression])*
	//	 ;
	//
	//ScratchExpression returns markdown::ScratchExpression hidden(WS):
	//	'~~' content+=[markdown::EmphasisExpression] '~~' WS* (content+=[markdown::EmphasisExpression])*
	//	;
	//
	//*/ TextualExpression markdown::TextualExpression hidden(WS):
	//	content=ID
	//	//(followingExpression=[markdown::EmphasisExpression])?
	//;
	public TextualExpressionElements getTextualExpressionAccess() {
		return pTextualExpression;
	}
	
	public ParserRule getTextualExpressionRule() {
		return getTextualExpressionAccess().getRule();
	}
	
	//HeaderExpression markdown::HeaderExpression:
	//	HeaderDepth1Expression //| =>( HeaderDepth2Expression |  =>( HeaderDepth3Expression | =>( HeaderDepth4Expression | =>(HeaderDepth5Expression | =>HeaderDepth6Expression))))
	//;
	public HeaderExpressionElements getHeaderExpressionAccess() {
		return pHeaderExpression;
	}
	
	public ParserRule getHeaderExpressionRule() {
		return getHeaderExpressionAccess().getRule();
	}
	
	//HeaderDepth1Expression markdown::HeaderDepth1Expression hidden(WS):
	//	'#' content=[markdown::TextualExpression];
	public HeaderDepth1ExpressionElements getHeaderDepth1ExpressionAccess() {
		return pHeaderDepth1Expression;
	}
	
	public ParserRule getHeaderDepth1ExpressionRule() {
		return getHeaderDepth1ExpressionAccess().getRule();
	}
	
	///* 
	//HeaderDepth2Expression returns markdown::HeaderDepth2Expression hidden(WS):
	//	'##'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION |
	//	content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION  ('-')+  LINE_BREAK_EXPRESSION
	//	;
	//
	//HeaderDepth3Expression returns markdown::HeaderDepth3Expression hidden(WS):
	//	'###'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION
	//	;
	//
	//HeaderDepth5Expression returns markdown::HeaderDepth5Expression hidden(WS):
	//	'#####'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION
	//	;
	//
	//HeaderDepth6Expression returns markdown::HeaderDepth6Expression hidden(WS):
	//	'######'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION
	//	;
	//
	//HeaderDepth4Expression returns markdown::HeaderDepth4Expression hidden(WS):
	//	'####'  content=[markdown::EmphasisExpression] LINE_BREAK_EXPRESSION
	//	;
	//*/ /* 
	//IntObject returns type::IntObject:
	//	'IntObject'; // TODO: implement this rule and an appropriate IValueConverter
	//*/ BOOLEAN_LITERAL ecore::EBoolean:
	//	'true' | 'false';
	public BOOLEAN_LITERALElements getBOOLEAN_LITERALAccess() {
		return pBOOLEAN_LITERAL;
	}
	
	public ParserRule getBOOLEAN_LITERALRule() {
		return getBOOLEAN_LITERALAccess().getRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal fragment DIGIT:
	//	'0'..'9';
	public TerminalRule getDIGITRule() {
		return tDIGIT;
	}
	
	//terminal DOUBLE returns ecore::EDouble:
	//	INT ('.' DIGIT*);
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal INT returns ecore::EInt:
	//	'0' | '1'..'9' DIGIT*;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
