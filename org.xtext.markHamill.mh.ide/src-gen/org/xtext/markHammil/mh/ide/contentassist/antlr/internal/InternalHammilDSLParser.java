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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHammilDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_DIGIT", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ANY_OTHER", "'# '", "'#'", "'='"
    };
    public static final int RULE_ID=12;
    public static final int RULE_WS=8;
    public static final int RULE_DIGIT=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=11;
    public static final int T__16=16;
    public static final int RULE_INT=10;
    public static final int RULE_BL=5;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalHammilDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHammilDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHammilDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHammilDSL.g"; }


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



    // $ANTLR start "entryRuleFile"
    // InternalHammilDSL.g:54:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalHammilDSL.g:55:1: ( ruleFile EOF )
            // InternalHammilDSL.g:56:1: ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalHammilDSL.g:63:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:67:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalHammilDSL.g:68:2: ( ( rule__File__Group__0 ) )
            {
            // InternalHammilDSL.g:68:2: ( ( rule__File__Group__0 ) )
            // InternalHammilDSL.g:69:3: ( rule__File__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup()); 
            }
            // InternalHammilDSL.g:70:3: ( rule__File__Group__0 )
            // InternalHammilDSL.g:70:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleExpression"
    // InternalHammilDSL.g:79:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:80:1: ( ruleExpression EOF )
            // InternalHammilDSL.g:81:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalHammilDSL.g:88:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:92:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalHammilDSL.g:93:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:93:2: ( ( rule__Expression__Alternatives ) )
            // InternalHammilDSL.g:94:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:95:3: ( rule__Expression__Alternatives )
            // InternalHammilDSL.g:95:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalHammilDSL.g:104:1: entryRuleEmphasisExpression : ruleEmphasisExpression EOF ;
    public final void entryRuleEmphasisExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:105:1: ( ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:106:1: ruleEmphasisExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmphasisExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmphasisExpression"


    // $ANTLR start "ruleEmphasisExpression"
    // InternalHammilDSL.g:113:1: ruleEmphasisExpression : ( ruleTextualExpression ) ;
    public final void ruleEmphasisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:117:2: ( ( ruleTextualExpression ) )
            // InternalHammilDSL.g:118:2: ( ruleTextualExpression )
            {
            // InternalHammilDSL.g:118:2: ( ruleTextualExpression )
            // InternalHammilDSL.g:119:3: ruleTextualExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getTextualExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleTextualExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmphasisExpressionAccess().getTextualExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmphasisExpression"


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHammilDSL.g:129:1: entryRuleHeaderDepth1Expression : ruleHeaderDepth1Expression EOF ;
    public final void entryRuleHeaderDepth1Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalHammilDSL.g:133:1: ( ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:134:1: ruleHeaderDepth1Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeaderDepth1Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderDepth1Expression"


    // $ANTLR start "ruleHeaderDepth1Expression"
    // InternalHammilDSL.g:144:1: ruleHeaderDepth1Expression : ( ( rule__HeaderDepth1Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth1Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:149:2: ( ( ( rule__HeaderDepth1Expression__Alternatives ) ) )
            // InternalHammilDSL.g:150:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:150:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            // InternalHammilDSL.g:151:3: ( rule__HeaderDepth1Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:152:3: ( rule__HeaderDepth1Expression__Alternatives )
            // InternalHammilDSL.g:152:4: rule__HeaderDepth1Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleHeaderDepth1Expression"


    // $ANTLR start "entryRuleTextualExpression"
    // InternalHammilDSL.g:162:1: entryRuleTextualExpression : ruleTextualExpression EOF ;
    public final void entryRuleTextualExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:163:1: ( ruleTextualExpression EOF )
            // InternalHammilDSL.g:164:1: ruleTextualExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTextualExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextualExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextualExpression"


    // $ANTLR start "ruleTextualExpression"
    // InternalHammilDSL.g:171:1: ruleTextualExpression : ( ( rule__TextualExpression__ContentStringAssignment ) ) ;
    public final void ruleTextualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:175:2: ( ( ( rule__TextualExpression__ContentStringAssignment ) ) )
            // InternalHammilDSL.g:176:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            {
            // InternalHammilDSL.g:176:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            // InternalHammilDSL.g:177:3: ( rule__TextualExpression__ContentStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); 
            }
            // InternalHammilDSL.g:178:3: ( rule__TextualExpression__ContentStringAssignment )
            // InternalHammilDSL.g:178:4: rule__TextualExpression__ContentStringAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TextualExpression__ContentStringAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextualExpression"


    // $ANTLR start "entryRuleString0"
    // InternalHammilDSL.g:187:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalHammilDSL.g:188:1: ( ruleString0 EOF )
            // InternalHammilDSL.g:189:1: ruleString0 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getString0Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getString0Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalHammilDSL.g:196:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:200:2: ( ( RULE_STRING ) )
            // InternalHammilDSL.g:201:2: ( RULE_STRING )
            {
            // InternalHammilDSL.g:201:2: ( RULE_STRING )
            // InternalHammilDSL.g:202:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalHammilDSL.g:211:1: rule__Expression__Alternatives : ( ( ( ruleHeaderDepth1Expression ) ) | ( RULE_BL ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:215:1: ( ( ( ruleHeaderDepth1Expression ) ) | ( RULE_BL ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING||LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_BL) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHammilDSL.g:216:2: ( ( ruleHeaderDepth1Expression ) )
                    {
                    // InternalHammilDSL.g:216:2: ( ( ruleHeaderDepth1Expression ) )
                    // InternalHammilDSL.g:217:3: ( ruleHeaderDepth1Expression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0()); 
                    }
                    // InternalHammilDSL.g:218:3: ( ruleHeaderDepth1Expression )
                    // InternalHammilDSL.g:218:4: ruleHeaderDepth1Expression
                    {
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth1Expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:222:2: ( RULE_BL )
                    {
                    // InternalHammilDSL.g:222:2: ( RULE_BL )
                    // InternalHammilDSL.g:223:3: RULE_BL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1()); 
                    }
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__HeaderDepth1Expression__Alternatives"
    // InternalHammilDSL.g:232:1: rule__HeaderDepth1Expression__Alternatives : ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth1Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:236:1: ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHammilDSL.g:237:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:237:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:238:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:239:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    // InternalHammilDSL.g:239:4: rule__HeaderDepth1Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HeaderDepth1Expression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:243:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:243:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:244:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:245:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    // InternalHammilDSL.g:245:4: rule__HeaderDepth1Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HeaderDepth1Expression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Alternatives"


    // $ANTLR start "rule__File__Group__0"
    // InternalHammilDSL.g:253:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:257:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalHammilDSL.g:258:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalHammilDSL.g:265:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:269:1: ( ( () ) )
            // InternalHammilDSL.g:270:1: ( () )
            {
            // InternalHammilDSL.g:270:1: ( () )
            // InternalHammilDSL.g:271:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalHammilDSL.g:272:2: ()
            // InternalHammilDSL.g:272:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getFileAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalHammilDSL.g:280:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:284:1: ( rule__File__Group__1__Impl )
            // InternalHammilDSL.g:285:2: rule__File__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalHammilDSL.g:291:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:295:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalHammilDSL.g:296:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalHammilDSL.g:296:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalHammilDSL.g:297:2: ( rule__File__ExpressionAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            }
            // InternalHammilDSL.g:298:2: ( rule__File__ExpressionAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_BL)||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHammilDSL.g:298:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__0"
    // InternalHammilDSL.g:307:1: rule__HeaderDepth1Expression__Group_0__0 : rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 ;
    public final void rule__HeaderDepth1Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:311:1: ( rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 )
            // InternalHammilDSL.g:312:2: rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__HeaderDepth1Expression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__0"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__0__Impl"
    // InternalHammilDSL.g:319:1: rule__HeaderDepth1Expression__Group_0__0__Impl : ( '# ' ) ;
    public final void rule__HeaderDepth1Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:323:1: ( ( '# ' ) )
            // InternalHammilDSL.g:324:1: ( '# ' )
            {
            // InternalHammilDSL.g:324:1: ( '# ' )
            // InternalHammilDSL.g:325:2: '# '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignSpaceKeyword_0_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignSpaceKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__0__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__1"
    // InternalHammilDSL.g:334:1: rule__HeaderDepth1Expression__Group_0__1 : rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 ;
    public final void rule__HeaderDepth1Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:338:1: ( rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 )
            // InternalHammilDSL.g:339:2: rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__HeaderDepth1Expression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__1"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__1__Impl"
    // InternalHammilDSL.g:346:1: rule__HeaderDepth1Expression__Group_0__1__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:350:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) ) )
            // InternalHammilDSL.g:351:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:351:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) )
            // InternalHammilDSL.g:352:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_1()); 
            }
            // InternalHammilDSL.g:353:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_1 )
            // InternalHammilDSL.g:353:3: rule__HeaderDepth1Expression__TitleAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__TitleAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__1__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__2"
    // InternalHammilDSL.g:361:1: rule__HeaderDepth1Expression__Group_0__2 : rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 ;
    public final void rule__HeaderDepth1Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:365:1: ( rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 )
            // InternalHammilDSL.g:366:2: rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3
            {
            pushFollow(FOLLOW_6);
            rule__HeaderDepth1Expression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__2"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__2__Impl"
    // InternalHammilDSL.g:373:1: rule__HeaderDepth1Expression__Group_0__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth1Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:377:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:378:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:378:1: ( ( '#' )* )
            // InternalHammilDSL.g:379:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2()); 
            }
            // InternalHammilDSL.g:380:2: ( '#' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHammilDSL.g:380:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__2__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__3"
    // InternalHammilDSL.g:388:1: rule__HeaderDepth1Expression__Group_0__3 : rule__HeaderDepth1Expression__Group_0__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:392:1: ( rule__HeaderDepth1Expression__Group_0__3__Impl )
            // InternalHammilDSL.g:393:2: rule__HeaderDepth1Expression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__3"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__3__Impl"
    // InternalHammilDSL.g:399:1: rule__HeaderDepth1Expression__Group_0__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:403:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:404:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:404:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:405:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            }
            // InternalHammilDSL.g:406:2: ( RULE_BL )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_BL) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred5_InternalHammilDSL()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalHammilDSL.g:406:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__3__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_1__0"
    // InternalHammilDSL.g:415:1: rule__HeaderDepth1Expression__Group_1__0 : rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 ;
    public final void rule__HeaderDepth1Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:419:1: ( rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 )
            // InternalHammilDSL.g:420:2: rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth1Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_1__0"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_1__0__Impl"
    // InternalHammilDSL.g:427:1: rule__HeaderDepth1Expression__Group_1__0__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:431:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:432:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:432:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:433:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); 
            }
            // InternalHammilDSL.g:434:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:434:3: rule__HeaderDepth1Expression__TitleAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__TitleAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_1__0__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_1__1"
    // InternalHammilDSL.g:442:1: rule__HeaderDepth1Expression__Group_1__1 : rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 ;
    public final void rule__HeaderDepth1Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:446:1: ( rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 )
            // InternalHammilDSL.g:447:2: rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__HeaderDepth1Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_1__1"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_1__1__Impl"
    // InternalHammilDSL.g:454:1: rule__HeaderDepth1Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth1Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:458:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:459:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:459:1: ( RULE_BL )
            // InternalHammilDSL.g:460:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_1__1__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_1__2"
    // InternalHammilDSL.g:469:1: rule__HeaderDepth1Expression__Group_1__2 : rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 ;
    public final void rule__HeaderDepth1Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:473:1: ( rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 )
            // InternalHammilDSL.g:474:2: rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth1Expression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_1__2"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_1__2__Impl"
    // InternalHammilDSL.g:481:1: rule__HeaderDepth1Expression__Group_1__2__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:485:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // InternalHammilDSL.g:486:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // InternalHammilDSL.g:486:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // InternalHammilDSL.g:487:2: ( ( '=' ) ) ( ( '=' )* )
            {
            // InternalHammilDSL.g:487:2: ( ( '=' ) )
            // InternalHammilDSL.g:488:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }
            // InternalHammilDSL.g:489:3: ( '=' )
            // InternalHammilDSL.g:489:4: '='
            {
            match(input,16,FOLLOW_10); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }

            }

            // InternalHammilDSL.g:492:2: ( ( '=' )* )
            // InternalHammilDSL.g:493:3: ( '=' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }
            // InternalHammilDSL.g:494:3: ( '=' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHammilDSL.g:494:4: '='
            	    {
            	    match(input,16,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_1__2__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_1__3"
    // InternalHammilDSL.g:503:1: rule__HeaderDepth1Expression__Group_1__3 : rule__HeaderDepth1Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:507:1: ( rule__HeaderDepth1Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:508:2: rule__HeaderDepth1Expression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_1__3"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_1__3__Impl"
    // InternalHammilDSL.g:514:1: rule__HeaderDepth1Expression__Group_1__3__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth1Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:518:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:519:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:519:1: ( RULE_BL )
            // InternalHammilDSL.g:520:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group_1__3__Impl"


    // $ANTLR start "rule__File__ExpressionAssignment_1"
    // InternalHammilDSL.g:530:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:534:1: ( ( ruleExpression ) )
            // InternalHammilDSL.g:535:2: ( ruleExpression )
            {
            // InternalHammilDSL.g:535:2: ( ruleExpression )
            // InternalHammilDSL.g:536:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ExpressionAssignment_1"


    // $ANTLR start "rule__HeaderDepth1Expression__TitleAssignment_0_1"
    // InternalHammilDSL.g:545:1: rule__HeaderDepth1Expression__TitleAssignment_0_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:549:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:550:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:550:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:551:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__TitleAssignment_0_1"


    // $ANTLR start "rule__HeaderDepth1Expression__TitleAssignment_1_0"
    // InternalHammilDSL.g:560:1: rule__HeaderDepth1Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:564:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:565:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:565:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:566:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__TitleAssignment_1_0"


    // $ANTLR start "rule__TextualExpression__ContentStringAssignment"
    // InternalHammilDSL.g:575:1: rule__TextualExpression__ContentStringAssignment : ( ruleString0 ) ;
    public final void rule__TextualExpression__ContentStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:579:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:580:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:580:2: ( ruleString0 )
            // InternalHammilDSL.g:581:3: ruleString0
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextualExpression__ContentStringAssignment"

    // $ANTLR start synpred5_InternalHammilDSL
    public final void synpred5_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:406:3: ( RULE_BL )
        // InternalHammilDSL.g:406:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalHammilDSL

    // Delegated rules

    public final boolean synpred5_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});

}