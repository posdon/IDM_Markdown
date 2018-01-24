/*
 * generated by Xtext 2.12.0
 */
grammar InternalHammilDSL;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package org.xtext.markHammil.mh.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.markHammil.mh.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.markHammil.mh.services.HammilDSLGrammarAccess;

}
@parser::members {
	private HammilDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(HammilDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleFile
entryRuleFile
:
{ before(grammarAccess.getFileRule()); }
	 ruleFile
{ after(grammarAccess.getFileRule()); } 
	 EOF 
;

// Rule File
ruleFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFileAccess().getGroup()); }
		(rule__File__Group__0)
		{ after(grammarAccess.getFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEmphasisExpression
entryRuleEmphasisExpression
:
{ before(grammarAccess.getEmphasisExpressionRule()); }
	 ruleEmphasisExpression
{ after(grammarAccess.getEmphasisExpressionRule()); } 
	 EOF 
;

// Rule EmphasisExpression
ruleEmphasisExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEmphasisExpressionAccess().getTextualExpressionParserRuleCall()); }
		ruleTextualExpression
		{ after(grammarAccess.getEmphasisExpressionAccess().getTextualExpressionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHeaderDepth1Expression
entryRuleHeaderDepth1Expression
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getHeaderDepth1ExpressionRule()); }
	 ruleHeaderDepth1Expression
{ after(grammarAccess.getHeaderDepth1ExpressionRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule HeaderDepth1Expression
ruleHeaderDepth1Expression 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); }
		(rule__HeaderDepth1Expression__Alternatives)
		{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleTextualExpression
entryRuleTextualExpression
:
{ before(grammarAccess.getTextualExpressionRule()); }
	 ruleTextualExpression
{ after(grammarAccess.getTextualExpressionRule()); } 
	 EOF 
;

// Rule TextualExpression
ruleTextualExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); }
		(rule__TextualExpression__ContentStringAssignment)
		{ after(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleString0
entryRuleString0
:
{ before(grammarAccess.getString0Rule()); }
	 ruleString0
{ after(grammarAccess.getString0Rule()); } 
	 EOF 
;

// Rule String0
ruleString0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0()); }
		(ruleHeaderDepth1Expression)
		{ after(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1()); }
		RULE_BL
		{ after(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); }
		(rule__HeaderDepth1Expression__Group_0__0)
		{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); }
		(rule__HeaderDepth1Expression__Group_1__0)
		{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__File__Group__0__Impl
	rule__File__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFileAccess().getFileAction_0()); }
	()
	{ after(grammarAccess.getFileAccess().getFileAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__File__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFileAccess().getExpressionAssignment_1()); }
	(rule__File__ExpressionAssignment_1)*
	{ after(grammarAccess.getFileAccess().getExpressionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HeaderDepth1Expression__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeaderDepth1Expression__Group_0__0__Impl
	rule__HeaderDepth1Expression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignSpaceKeyword_0_0()); }
	'# '
	{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignSpaceKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeaderDepth1Expression__Group_0__1__Impl
	rule__HeaderDepth1Expression__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_1()); }
	(rule__HeaderDepth1Expression__TitleAssignment_0_1)
	{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeaderDepth1Expression__Group_0__2__Impl
	rule__HeaderDepth1Expression__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2()); }
	('#')*
	{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeaderDepth1Expression__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3()); }
	(RULE_BL)?
	{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HeaderDepth1Expression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeaderDepth1Expression__Group_1__0__Impl
	rule__HeaderDepth1Expression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); }
	(rule__HeaderDepth1Expression__TitleAssignment_1_0)
	{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeaderDepth1Expression__Group_1__1__Impl
	rule__HeaderDepth1Expression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1()); }
	RULE_BL
	{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeaderDepth1Expression__Group_1__2__Impl
	rule__HeaderDepth1Expression__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); }
		('=')
		{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); }
	)
	(
		{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); }
		('=')*
		{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeaderDepth1Expression__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); }
	RULE_BL
	{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__File__ExpressionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0()); }
		ruleExpression
		{ after(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__TitleAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); }
		ruleEmphasisExpression
		{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeaderDepth1Expression__TitleAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); }
		ruleEmphasisExpression
		{ after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TextualExpression__ContentStringAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0()); }
		ruleString0
		{ after(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_BL : '\r'? '\n';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

fragment RULE_DIGIT : '0'..'9';

RULE_DOUBLE : RULE_INT '.' RULE_DIGIT*;

fragment RULE_INT : ('0'|'1'..'9' RULE_DIGIT*);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ANY_OTHER : .;
