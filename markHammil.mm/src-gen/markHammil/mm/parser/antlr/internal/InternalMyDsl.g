/*
 * generated by Xtext 2.12.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package markHammil.mm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package markHammil.mm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import markHammil.mm.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "File";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
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
						"markHammil.mm.MyDsl.Expression");
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
		(
			((
				(
					((
						ruleHeaderExpression
					)
					)=>
					(
						ruleHeaderExpression
					)
				)
				    |
				(
					(
						(
							ruleTextExpression
						)
					)
					(
						(RULE_BL)=>
						RULE_BL
					)?
				)
			)
			)=>
			(
				(
					((
						ruleHeaderExpression
					)
					)=>
					(
						{
							newCompositeNode(grammarAccess.getExpressionAccess().getCHeaderExpressionParserRuleCall_0_0_0_0());
						}
						lv_c_0_0=ruleHeaderExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExpressionRule());
							}
							set(
								$current,
								"c",
								lv_c_0_0,
								"markHammil.mm.MyDsl.HeaderExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getExpressionAccess().getCTextExpressionParserRuleCall_0_0_1_0_0());
							}
							lv_c_1_0=ruleTextExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getExpressionRule());
								}
								set(
									$current,
									"c",
									lv_c_1_0,
									"markHammil.mm.MyDsl.TextExpression");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						(RULE_BL)=>
						this_BL_2=RULE_BL
						{
							newLeafNode(this_BL_2, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_1_1());
						}
					)?
				)
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionAccess().getCBreakLineExpressionParserRuleCall_1_0());
				}
				lv_c_3_0=ruleBreakLineExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionRule());
					}
					set(
						$current,
						"c",
						lv_c_3_0,
						"markHammil.mm.MyDsl.BreakLineExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBreakLineExpression
entryRuleBreakLineExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBreakLineExpressionRule()); }
	iv_ruleBreakLineExpression=ruleBreakLineExpression
	{ $current=$iv_ruleBreakLineExpression.current; }
	EOF;

// Rule BreakLineExpression
ruleBreakLineExpression returns [EObject current=null]
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
					grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionBAction_0(),
					$current);
			}
		)
		this_BL_1=RULE_BL
		{
			newLeafNode(this_BL_1, grammarAccess.getBreakLineExpressionAccess().getBLTerminalRuleCall_1());
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
		(
			(
				{
					newCompositeNode(grammarAccess.getTextExpressionAccess().getCEmphasisExpressionParserRuleCall_0_0());
				}
				lv_c_0_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTextExpressionRule());
					}
					add(
						$current,
						"c",
						lv_c_0_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getTextExpressionAccess().getCQuoteExpressionParserRuleCall_1_0());
				}
				lv_c_1_0=ruleQuoteExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTextExpressionRule());
					}
					add(
						$current,
						"c",
						lv_c_1_0,
						"markHammil.mm.MyDsl.QuoteExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQuoteExpression
entryRuleQuoteExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuoteExpressionRule()); }
	iv_ruleQuoteExpression=ruleQuoteExpression
	{ $current=$iv_ruleQuoteExpression.current; }
	EOF;

// Rule QuoteExpression
ruleQuoteExpression returns [EObject current=null]
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
					grammarAccess.getQuoteExpressionAccess().getTextExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='>'
		{
			newLeafNode(otherlv_1, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getQuoteExpressionAccess().getContentTextExpressionParserRuleCall_2_0());
				}
				lv_content_2_0=ruleTextExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuoteExpressionRule());
					}
					add(
						$current,
						"content",
						lv_content_2_0,
						"markHammil.mm.MyDsl.TextExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(RULE_BL)=>
			this_BL_3=RULE_BL
			{
				newLeafNode(this_BL_3, grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_3());
			}
		)?
	)
;

// Entry rule entryRuleHeaderExpression
entryRuleHeaderExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeaderExpressionRule()); }
	iv_ruleHeaderExpression=ruleHeaderExpression
	{ $current=$iv_ruleHeaderExpression.current; }
	EOF;

// Rule HeaderExpression
ruleHeaderExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader1ExpressionParserRuleCall_0());
		}
		this_Header1Expression_0=ruleHeader1Expression
		{
			$current = $this_Header1Expression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader2ExpressionParserRuleCall_1());
		}
		this_Header2Expression_1=ruleHeader2Expression
		{
			$current = $this_Header2Expression_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader3ExpressionParserRuleCall_2());
		}
		this_Header3Expression_2=ruleHeader3Expression
		{
			$current = $this_Header3Expression_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader4ExpressionParserRuleCall_3());
		}
		this_Header4Expression_3=ruleHeader4Expression
		{
			$current = $this_Header4Expression_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader5ExpressionParserRuleCall_4());
		}
		this_Header5Expression_4=ruleHeader5Expression
		{
			$current = $this_Header5Expression_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader6ExpressionParserRuleCall_5());
		}
		this_Header6Expression_5=ruleHeader6Expression
		{
			$current = $this_Header6Expression_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleHeader1Expression
entryRuleHeader1Expression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeader1ExpressionRule()); }
	iv_ruleHeader1Expression=ruleHeader1Expression
	{ $current=$iv_ruleHeader1Expression.current; }
	EOF;

// Rule Header1Expression
ruleHeader1Expression returns [EObject current=null]
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
					grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='#'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeader1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
				}
				lv_title_2_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeader1ExpressionRule());
					}
					add(
						$current,
						"title",
						lv_title_2_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			('#'
			)=>
			otherlv_3='#'
			{
				newLeafNode(otherlv_3, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0());
			}
		)*
		(
			(RULE_BL)=>
			this_BL_4=RULE_BL
			{
				newLeafNode(this_BL_4, grammarAccess.getHeader1ExpressionAccess().getBLTerminalRuleCall_4());
			}
		)?
	)
;

// Entry rule entryRuleHeader2Expression
entryRuleHeader2Expression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeader2ExpressionRule()); }
	iv_ruleHeader2Expression=ruleHeader2Expression
	{ $current=$iv_ruleHeader2Expression.current; }
	EOF;

// Rule Header2Expression
ruleHeader2Expression returns [EObject current=null]
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
					grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='##'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeader2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
				}
				lv_title_2_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeader2ExpressionRule());
					}
					add(
						$current,
						"title",
						lv_title_2_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			('#'
			)=>
			otherlv_3='#'
			{
				newLeafNode(otherlv_3, grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0());
			}
		)*
		(
			(RULE_BL)=>
			this_BL_4=RULE_BL
			{
				newLeafNode(this_BL_4, grammarAccess.getHeader2ExpressionAccess().getBLTerminalRuleCall_4());
			}
		)?
	)
;

// Entry rule entryRuleHeader3Expression
entryRuleHeader3Expression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeader3ExpressionRule()); }
	iv_ruleHeader3Expression=ruleHeader3Expression
	{ $current=$iv_ruleHeader3Expression.current; }
	EOF;

// Rule Header3Expression
ruleHeader3Expression returns [EObject current=null]
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
					grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='###'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeader3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
				}
				lv_title_2_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeader3ExpressionRule());
					}
					add(
						$current,
						"title",
						lv_title_2_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			('#'
			)=>
			otherlv_3='#'
			{
				newLeafNode(otherlv_3, grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0());
			}
		)*
		(
			(RULE_BL)=>
			this_BL_4=RULE_BL
			{
				newLeafNode(this_BL_4, grammarAccess.getHeader3ExpressionAccess().getBLTerminalRuleCall_4());
			}
		)?
	)
;

// Entry rule entryRuleHeader4Expression
entryRuleHeader4Expression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeader4ExpressionRule()); }
	iv_ruleHeader4Expression=ruleHeader4Expression
	{ $current=$iv_ruleHeader4Expression.current; }
	EOF;

// Rule Header4Expression
ruleHeader4Expression returns [EObject current=null]
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
					grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='####'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeader4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
				}
				lv_title_2_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeader4ExpressionRule());
					}
					add(
						$current,
						"title",
						lv_title_2_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			('#'
			)=>
			otherlv_3='#'
			{
				newLeafNode(otherlv_3, grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0());
			}
		)*
		(
			(RULE_BL)=>
			this_BL_4=RULE_BL
			{
				newLeafNode(this_BL_4, grammarAccess.getHeader4ExpressionAccess().getBLTerminalRuleCall_4());
			}
		)?
	)
;

// Entry rule entryRuleHeader5Expression
entryRuleHeader5Expression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeader5ExpressionRule()); }
	iv_ruleHeader5Expression=ruleHeader5Expression
	{ $current=$iv_ruleHeader5Expression.current; }
	EOF;

// Rule Header5Expression
ruleHeader5Expression returns [EObject current=null]
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
					grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='#####'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeader5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
				}
				lv_title_2_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeader5ExpressionRule());
					}
					add(
						$current,
						"title",
						lv_title_2_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			('#'
			)=>
			otherlv_3='#'
			{
				newLeafNode(otherlv_3, grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0());
			}
		)*
		(
			(RULE_BL)=>
			this_BL_4=RULE_BL
			{
				newLeafNode(this_BL_4, grammarAccess.getHeader5ExpressionAccess().getBLTerminalRuleCall_4());
			}
		)?
	)
;

// Entry rule entryRuleHeader6Expression
entryRuleHeader6Expression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeader6ExpressionRule()); }
	iv_ruleHeader6Expression=ruleHeader6Expression
	{ $current=$iv_ruleHeader6Expression.current; }
	EOF;

// Rule Header6Expression
ruleHeader6Expression returns [EObject current=null]
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
					grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='######'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeader6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
				}
				lv_title_2_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeader6ExpressionRule());
					}
					add(
						$current,
						"title",
						lv_title_2_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			('#'
			)=>
			otherlv_3='#'
			{
				newLeafNode(otherlv_3, grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0());
			}
		)*
		(
			(RULE_BL)=>
			this_BL_4=RULE_BL
			{
				newLeafNode(this_BL_4, grammarAccess.getHeader6ExpressionAccess().getBLTerminalRuleCall_4());
			}
		)?
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
	(
		(
			((
				(
					((
						ruleStrongExpression
					)
					)=>
					(
						ruleStrongExpression
					)
				)
				    |
				(
					(
						ruleItalicExpression
					)
				)
				    |
				(
					(
						ruleScratchExpression
					)
				)
			)
			)=>
			(
				(
					((
						ruleStrongExpression
					)
					)=>
					(
						{
							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCStrongExpressionParserRuleCall_0_0_0_0());
						}
						lv_c_0_0=ruleStrongExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEmphasisExpressionRule());
							}
							add(
								$current,
								"c",
								lv_c_0_0,
								"markHammil.mm.MyDsl.StrongExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCItalicExpressionParserRuleCall_0_0_1_0());
						}
						lv_c_1_0=ruleItalicExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEmphasisExpressionRule());
							}
							add(
								$current,
								"c",
								lv_c_1_0,
								"markHammil.mm.MyDsl.ItalicExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCScratchExpressionParserRuleCall_0_0_2_0());
						}
						lv_c_2_0=ruleScratchExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEmphasisExpressionRule());
							}
							add(
								$current,
								"c",
								lv_c_2_0,
								"markHammil.mm.MyDsl.ScratchExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCNaturalExpressionParserRuleCall_1_0());
				}
				lv_c_3_0=ruleNaturalExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEmphasisExpressionRule());
					}
					add(
						$current,
						"c",
						lv_c_3_0,
						"markHammil.mm.MyDsl.NaturalExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)+
;

// Entry rule entryRuleStrongExpression
entryRuleStrongExpression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getStrongExpressionRule()); }
	iv_ruleStrongExpression=ruleStrongExpression
	{ $current=$iv_ruleStrongExpression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule StrongExpression
ruleStrongExpression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='**'
		{
			newLeafNode(otherlv_1, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStrongExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
				}
				lv_content_2_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStrongExpressionRule());
					}
					set(
						$current,
						"content",
						lv_content_2_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='**'
		{
			newLeafNode(otherlv_3, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_3());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleItalicExpression
entryRuleItalicExpression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getItalicExpressionRule()); }
	iv_ruleItalicExpression=ruleItalicExpression
	{ $current=$iv_ruleItalicExpression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule ItalicExpression
ruleItalicExpression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='*'
		{
			newLeafNode(otherlv_1, grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getItalicExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
				}
				lv_content_2_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getItalicExpressionRule());
					}
					set(
						$current,
						"content",
						lv_content_2_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='*'
		{
			newLeafNode(otherlv_3, grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_3());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleScratchExpression
entryRuleScratchExpression returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getScratchExpressionRule()); }
	iv_ruleScratchExpression=ruleScratchExpression
	{ $current=$iv_ruleScratchExpression.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule ScratchExpression
ruleScratchExpression returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='~~'
		{
			newLeafNode(otherlv_1, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScratchExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
				}
				lv_content_2_0=ruleEmphasisExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScratchExpressionRule());
					}
					set(
						$current,
						"content",
						lv_content_2_0,
						"markHammil.mm.MyDsl.EmphasisExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='~~'
		{
			newLeafNode(otherlv_3, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_3());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNaturalExpression
entryRuleNaturalExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNaturalExpressionRule()); }
	iv_ruleNaturalExpression=ruleNaturalExpression
	{ $current=$iv_ruleNaturalExpression.current; }
	EOF;

// Rule NaturalExpression
ruleNaturalExpression returns [EObject current=null]
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
					grammarAccess.getNaturalExpressionAccess().getEmphasisExpressionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getNaturalExpressionAccess().getValueContentParserRuleCall_1_0());
				}
				lv_value_1_0=ruleContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNaturalExpressionRule());
					}
					add(
						$current,
						"value",
						lv_value_1_0,
						"markHammil.mm.MyDsl.Content");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleContent
entryRuleContent returns [String current=null]:
	{ newCompositeNode(grammarAccess.getContentRule()); }
	iv_ruleContent=ruleContent
	{ $current=$iv_ruleContent.current.getText(); }
	EOF;

// Rule Content
ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getContentAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1());
		}
		    |
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getContentAccess().getINTTerminalRuleCall_2());
		}
		    |
		kw='\''
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getContentAccess().getApostropheKeyword_3());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getContentAccess().getHyphenMinusKeyword_4());
		}
		    |
		kw='|'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getContentAccess().getVerticalLineKeyword_5());
		}
		    |
		kw='"'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getContentAccess().getQuotationMarkKeyword_6());
		}
	)
;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_BL : '\r'? '\n';

RULE_WS : (' '|'\t');

fragment RULE_DIGIT : '0'..'9';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_ANY_OTHER : .;
