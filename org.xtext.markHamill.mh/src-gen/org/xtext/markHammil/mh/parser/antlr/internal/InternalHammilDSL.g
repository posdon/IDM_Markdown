/*
 * generated by Xtext 2.12.0
 */
grammar InternalHammilDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.markHammil.mh.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.markHammil.mh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.markHammil.mh.services.HammilDSLGrammarAccess;

}

@parser::members {

 	private HammilDSLGrammarAccess grammarAccess;

    public InternalHammilDSLParser(TokenStream input, HammilDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "File";
   	}

   	@Override
   	protected HammilDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	iv_ruleFile=ruleFile
	{ $current=$iv_ruleFile.current; }
	EOF;

// Rule File
ruleFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFileAccess().getFileAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0());
				}
				lv_expression_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFileRule());
					}
					add(
						$current,
						"expression",
						lv_expression_1_0,
						"org.xtext.markHammil.mh.HammilDSL.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getQuoteExpressionParserRuleCall_0());
		}
		this_QuoteExpression_0=ruleQuoteExpression
		{
			$current = $this_QuoteExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_1());
		}
		this_HeaderDepth1Expression_1=ruleHeaderDepth1Expression
		{
			$current = $this_HeaderDepth1Expression_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_2());
		}
		this_HeaderDepth2Expression_2=ruleHeaderDepth2Expression
		{
			$current = $this_HeaderDepth2Expression_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_3());
		}
		this_HeaderDepth3Expression_3=ruleHeaderDepth3Expression
		{
			$current = $this_HeaderDepth3Expression_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_4());
		}
		this_HeaderDepth4Expression_4=ruleHeaderDepth4Expression
		{
			$current = $this_HeaderDepth4Expression_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_5());
		}
		this_HeaderDepth5Expression_5=ruleHeaderDepth5Expression
		{
			$current = $this_HeaderDepth5Expression_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_6());
		}
		this_HeaderDepth6Expression_6=ruleHeaderDepth6Expression
		{
			$current = $this_HeaderDepth6Expression_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTextExpression
entryRuleTextExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextExpressionRule()); }
	iv_ruleTextExpression=ruleTextExpression
	{ $current=$iv_ruleTextExpression.current; }
	EOF;

// Rule TextExpression
ruleTextExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall_0());
		}
		this_TextualExpression_0=ruleTextualExpression
		{
			$current = $this_TextualExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_1());
		}
		this_QuoteExpression_1=ruleQuoteExpression
		{
			$current = $this_QuoteExpression_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEmphasisExpression
entryRuleEmphasisExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEmphasisExpressionRule()); }
	iv_ruleEmphasisExpression=ruleEmphasisExpression
	{ $current=$iv_ruleEmphasisExpression.current; }
	EOF;

// Rule EmphasisExpression
ruleEmphasisExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getTextualExpressionParserRuleCall());
	}
	this_TextualExpression_0=ruleTextualExpression
	{
		$current = $this_TextualExpression_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleQuoteExpression
entryRuleQuoteExpression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}:
	{ newCompositeNode(grammarAccess.getQuoteExpressionRule()); }
	iv_ruleQuoteExpression=ruleQuoteExpression
	{ $current=$iv_ruleQuoteExpression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule QuoteExpression
ruleQuoteExpression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='>'
		{
			newLeafNode(otherlv_0, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getQuoteExpressionAccess().getTextexpressionTextExpressionParserRuleCall_1_0());
				}
				lv_textexpression_1_0=ruleTextExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuoteExpressionRule());
					}
					set(
						$current,
						"textexpression",
						lv_textexpression_1_0,
						"org.xtext.markHammil.mh.HammilDSL.TextExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_BL_2=RULE_BL
			{
				newLeafNode(this_BL_2, grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_2());
			}
		)?
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleHeaderDepth1Expression
entryRuleHeaderDepth1Expression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}:
	{ newCompositeNode(grammarAccess.getHeaderDepth1ExpressionRule()); }
	iv_ruleHeaderDepth1Expression=ruleHeaderDepth1Expression
	{ $current=$iv_ruleHeaderDepth1Expression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule HeaderDepth1Expression
ruleHeaderDepth1Expression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='#'
			{
				newLeafNode(otherlv_0, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0());
					}
					lv_title_1_0=ruleEmphasisExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHeaderDepth1ExpressionRule());
						}
						set(
							$current,
							"title",
							lv_title_1_0,
							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2='#'
				{
					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2());
				}
			)*
			(
				this_BL_3=RULE_BL
				{
					newLeafNode(this_BL_3, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3());
				}
			)?
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
					}
					lv_title_4_0=ruleEmphasisExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHeaderDepth1ExpressionRule());
						}
						set(
							$current,
							"title",
							lv_title_4_0,
							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_BL_5=RULE_BL
			{
				newLeafNode(this_BL_5, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1());
			}
			(
				otherlv_6='='
				{
					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2());
				}
			)+
			(
				this_BL_7=RULE_BL
				{
					newLeafNode(this_BL_7, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3());
				}
			)?
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleHeaderDepth2Expression
entryRuleHeaderDepth2Expression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}:
	{ newCompositeNode(grammarAccess.getHeaderDepth2ExpressionRule()); }
	iv_ruleHeaderDepth2Expression=ruleHeaderDepth2Expression
	{ $current=$iv_ruleHeaderDepth2Expression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule HeaderDepth2Expression
ruleHeaderDepth2Expression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='##'
			{
				newLeafNode(otherlv_0, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0());
					}
					lv_title_1_0=ruleEmphasisExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHeaderDepth2ExpressionRule());
						}
						set(
							$current,
							"title",
							lv_title_1_0,
							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2='#'
				{
					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2());
				}
			)*
			(
				this_BL_3=RULE_BL
				{
					newLeafNode(this_BL_3, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3());
				}
			)?
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
					}
					lv_title_4_0=ruleEmphasisExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHeaderDepth2ExpressionRule());
						}
						set(
							$current,
							"title",
							lv_title_4_0,
							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_BL_5=RULE_BL
			{
				newLeafNode(this_BL_5, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_1());
			}
			(
				otherlv_6='-'
				{
					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2());
				}
			)+
			(
				this_BL_7=RULE_BL
				{
					newLeafNode(this_BL_7, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3());
				}
			)?
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleHeaderDepth3Expression
entryRuleHeaderDepth3Expression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}:
	{ newCompositeNode(grammarAccess.getHeaderDepth3ExpressionRule()); }
	iv_ruleHeaderDepth3Expression=ruleHeaderDepth3Expression
	{ $current=$iv_ruleHeaderDepth3Expression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule HeaderDepth3Expression
ruleHeaderDepth3Expression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='###'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
				}
				lv_title_1_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderDepth3ExpressionRule());
					}
					set(
						$current,
						"title",
						lv_title_1_0,
						"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='#'
			{
				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2());
			}
		)*
		(
			this_BL_3=RULE_BL
			{
				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3());
			}
		)?
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleHeaderDepth5Expression
entryRuleHeaderDepth5Expression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}:
	{ newCompositeNode(grammarAccess.getHeaderDepth5ExpressionRule()); }
	iv_ruleHeaderDepth5Expression=ruleHeaderDepth5Expression
	{ $current=$iv_ruleHeaderDepth5Expression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule HeaderDepth5Expression
ruleHeaderDepth5Expression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#####'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
				}
				lv_title_1_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderDepth5ExpressionRule());
					}
					set(
						$current,
						"title",
						lv_title_1_0,
						"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='#'
			{
				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2());
			}
		)*
		(
			this_BL_3=RULE_BL
			{
				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3());
			}
		)?
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleHeaderDepth6Expression
entryRuleHeaderDepth6Expression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}:
	{ newCompositeNode(grammarAccess.getHeaderDepth6ExpressionRule()); }
	iv_ruleHeaderDepth6Expression=ruleHeaderDepth6Expression
	{ $current=$iv_ruleHeaderDepth6Expression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule HeaderDepth6Expression
ruleHeaderDepth6Expression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='######'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
				}
				lv_title_1_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderDepth6ExpressionRule());
					}
					set(
						$current,
						"title",
						lv_title_1_0,
						"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='#'
			{
				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2());
			}
		)*
		(
			this_BL_3=RULE_BL
			{
				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3());
			}
		)?
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleHeaderDepth4Expression
entryRuleHeaderDepth4Expression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}:
	{ newCompositeNode(grammarAccess.getHeaderDepth4ExpressionRule()); }
	iv_ruleHeaderDepth4Expression=ruleHeaderDepth4Expression
	{ $current=$iv_ruleHeaderDepth4Expression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule HeaderDepth4Expression
ruleHeaderDepth4Expression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='####'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
				}
				lv_title_1_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderDepth4ExpressionRule());
					}
					set(
						$current,
						"title",
						lv_title_1_0,
						"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='#'
			{
				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2());
			}
		)*
		(
			this_BL_3=RULE_BL
			{
				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3());
			}
		)?
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleTextualExpression
entryRuleTextualExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextualExpressionRule()); }
	iv_ruleTextualExpression=ruleTextualExpression
	{ $current=$iv_ruleTextualExpression.current; }
	EOF;

// Rule TextualExpression
ruleTextualExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0());
			}
			lv_contentString_0_0=ruleString0
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTextualExpressionRule());
				}
				set(
					$current,
					"contentString",
					lv_contentString_0_0,
					"org.xtext.markHammil.mh.HammilDSL.String0");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleString0
entryRuleString0 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getString0Rule()); }
	iv_ruleString0=ruleString0
	{ $current=$iv_ruleString0.current.getText(); }
	EOF;

// Rule String0
ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getString0Access().getSTRINGTerminalRuleCall());
	}
;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_BL : '\r'? '\n';

RULE_S : (' '|'\t');

fragment RULE_DIGIT : '0'..'9';

RULE_DOUBLE : RULE_INT '.' RULE_DIGIT*;

fragment RULE_INT : ('0'|'1'..'9' RULE_DIGIT*);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
