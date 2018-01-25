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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BL", "RULE_S", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'-'", "'*'", "'_'", "'>'", "'`'", "'```'", "'#'", "'='", "'##'", "'###'", "'#####'", "'######'", "'####'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int RULE_S=6;
    public static final int RULE_BL=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

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
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalHammilDSL.g:83:1: ( ruleExpression EOF )
            // InternalHammilDSL.g:84:1: ruleExpression EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalHammilDSL.g:94:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:99:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalHammilDSL.g:100:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:100:2: ( ( rule__Expression__Alternatives ) )
            // InternalHammilDSL.g:101:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:102:3: ( rule__Expression__Alternatives )
            // InternalHammilDSL.g:102:4: rule__Expression__Alternatives
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTextExpression"
    // InternalHammilDSL.g:112:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:116:1: ( ruleTextExpression EOF )
            // InternalHammilDSL.g:117:1: ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
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
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalHammilDSL.g:127:1: ruleTextExpression : ( ( rule__TextExpression__Alternatives ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:132:2: ( ( ( rule__TextExpression__Alternatives ) ) )
            // InternalHammilDSL.g:133:2: ( ( rule__TextExpression__Alternatives ) )
            {
            // InternalHammilDSL.g:133:2: ( ( rule__TextExpression__Alternatives ) )
            // InternalHammilDSL.g:134:3: ( rule__TextExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:135:3: ( rule__TextExpression__Alternatives )
            // InternalHammilDSL.g:135:4: rule__TextExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalHammilDSL.g:145:1: entryRuleEmphasisExpression : ruleEmphasisExpression EOF ;
    public final void entryRuleEmphasisExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:146:1: ( ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:147:1: ruleEmphasisExpression EOF
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
    // InternalHammilDSL.g:154:1: ruleEmphasisExpression : ( ruleTextualExpression ) ;
    public final void ruleEmphasisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:158:2: ( ( ruleTextualExpression ) )
            // InternalHammilDSL.g:159:2: ( ruleTextualExpression )
            {
            // InternalHammilDSL.g:159:2: ( ruleTextualExpression )
            // InternalHammilDSL.g:160:3: ruleTextualExpression
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


    // $ANTLR start "entryRuleHorizontalExpression"
    // InternalHammilDSL.g:170:1: entryRuleHorizontalExpression : ruleHorizontalExpression EOF ;
    public final void entryRuleHorizontalExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:171:1: ( ruleHorizontalExpression EOF )
            // InternalHammilDSL.g:172:1: ruleHorizontalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHorizontalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionRule()); 
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
    // $ANTLR end "entryRuleHorizontalExpression"


    // $ANTLR start "ruleHorizontalExpression"
    // InternalHammilDSL.g:179:1: ruleHorizontalExpression : ( ( rule__HorizontalExpression__Alternatives ) ) ;
    public final void ruleHorizontalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:183:2: ( ( ( rule__HorizontalExpression__Alternatives ) ) )
            // InternalHammilDSL.g:184:2: ( ( rule__HorizontalExpression__Alternatives ) )
            {
            // InternalHammilDSL.g:184:2: ( ( rule__HorizontalExpression__Alternatives ) )
            // InternalHammilDSL.g:185:3: ( rule__HorizontalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:186:3: ( rule__HorizontalExpression__Alternatives )
            // InternalHammilDSL.g:186:4: rule__HorizontalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleHorizontalExpression"


    // $ANTLR start "entryRuleQuoteExpression"
    // InternalHammilDSL.g:195:1: entryRuleQuoteExpression : ruleQuoteExpression EOF ;
    public final void entryRuleQuoteExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:196:1: ( ruleQuoteExpression EOF )
            // InternalHammilDSL.g:197:1: ruleQuoteExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQuoteExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionRule()); 
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
    // $ANTLR end "entryRuleQuoteExpression"


    // $ANTLR start "ruleQuoteExpression"
    // InternalHammilDSL.g:204:1: ruleQuoteExpression : ( ( rule__QuoteExpression__Group__0 ) ) ;
    public final void ruleQuoteExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:208:2: ( ( ( rule__QuoteExpression__Group__0 ) ) )
            // InternalHammilDSL.g:209:2: ( ( rule__QuoteExpression__Group__0 ) )
            {
            // InternalHammilDSL.g:209:2: ( ( rule__QuoteExpression__Group__0 ) )
            // InternalHammilDSL.g:210:3: ( rule__QuoteExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:211:3: ( rule__QuoteExpression__Group__0 )
            // InternalHammilDSL.g:211:4: rule__QuoteExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleQuoteExpression"


    // $ANTLR start "entryRuleCodeExpression"
    // InternalHammilDSL.g:220:1: entryRuleCodeExpression : ruleCodeExpression EOF ;
    public final void entryRuleCodeExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:221:1: ( ruleCodeExpression EOF )
            // InternalHammilDSL.g:222:1: ruleCodeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCodeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionRule()); 
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
    // $ANTLR end "entryRuleCodeExpression"


    // $ANTLR start "ruleCodeExpression"
    // InternalHammilDSL.g:229:1: ruleCodeExpression : ( ( rule__CodeExpression__Alternatives ) ) ;
    public final void ruleCodeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:233:2: ( ( ( rule__CodeExpression__Alternatives ) ) )
            // InternalHammilDSL.g:234:2: ( ( rule__CodeExpression__Alternatives ) )
            {
            // InternalHammilDSL.g:234:2: ( ( rule__CodeExpression__Alternatives ) )
            // InternalHammilDSL.g:235:3: ( rule__CodeExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:236:3: ( rule__CodeExpression__Alternatives )
            // InternalHammilDSL.g:236:4: rule__CodeExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CodeExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCodeExpression"


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHammilDSL.g:245:1: entryRuleHeaderDepth1Expression : ruleHeaderDepth1Expression EOF ;
    public final void entryRuleHeaderDepth1Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:246:1: ( ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:247:1: ruleHeaderDepth1Expression EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderDepth1Expression"


    // $ANTLR start "ruleHeaderDepth1Expression"
    // InternalHammilDSL.g:254:1: ruleHeaderDepth1Expression : ( ( rule__HeaderDepth1Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth1Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:258:2: ( ( ( rule__HeaderDepth1Expression__Alternatives ) ) )
            // InternalHammilDSL.g:259:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:259:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            // InternalHammilDSL.g:260:3: ( rule__HeaderDepth1Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:261:3: ( rule__HeaderDepth1Expression__Alternatives )
            // InternalHammilDSL.g:261:4: rule__HeaderDepth1Expression__Alternatives
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

        }
        return ;
    }
    // $ANTLR end "ruleHeaderDepth1Expression"


    // $ANTLR start "entryRuleHeaderDepth2Expression"
    // InternalHammilDSL.g:270:1: entryRuleHeaderDepth2Expression : ruleHeaderDepth2Expression EOF ;
    public final void entryRuleHeaderDepth2Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:271:1: ( ruleHeaderDepth2Expression EOF )
            // InternalHammilDSL.g:272:1: ruleHeaderDepth2Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeaderDepth2Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeaderDepth2Expression"


    // $ANTLR start "ruleHeaderDepth2Expression"
    // InternalHammilDSL.g:279:1: ruleHeaderDepth2Expression : ( ( rule__HeaderDepth2Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth2Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:283:2: ( ( ( rule__HeaderDepth2Expression__Alternatives ) ) )
            // InternalHammilDSL.g:284:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:284:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            // InternalHammilDSL.g:285:3: ( rule__HeaderDepth2Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:286:3: ( rule__HeaderDepth2Expression__Alternatives )
            // InternalHammilDSL.g:286:4: rule__HeaderDepth2Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleHeaderDepth2Expression"


    // $ANTLR start "entryRuleHeaderDepth3Expression"
    // InternalHammilDSL.g:295:1: entryRuleHeaderDepth3Expression : ruleHeaderDepth3Expression EOF ;
    public final void entryRuleHeaderDepth3Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:296:1: ( ruleHeaderDepth3Expression EOF )
            // InternalHammilDSL.g:297:1: ruleHeaderDepth3Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeaderDepth3Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth3ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeaderDepth3Expression"


    // $ANTLR start "ruleHeaderDepth3Expression"
    // InternalHammilDSL.g:304:1: ruleHeaderDepth3Expression : ( ( rule__HeaderDepth3Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth3Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:308:2: ( ( ( rule__HeaderDepth3Expression__Group__0 ) ) )
            // InternalHammilDSL.g:309:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:309:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            // InternalHammilDSL.g:310:3: ( rule__HeaderDepth3Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:311:3: ( rule__HeaderDepth3Expression__Group__0 )
            // InternalHammilDSL.g:311:4: rule__HeaderDepth3Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth3ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeaderDepth3Expression"


    // $ANTLR start "entryRuleHeaderDepth5Expression"
    // InternalHammilDSL.g:320:1: entryRuleHeaderDepth5Expression : ruleHeaderDepth5Expression EOF ;
    public final void entryRuleHeaderDepth5Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:321:1: ( ruleHeaderDepth5Expression EOF )
            // InternalHammilDSL.g:322:1: ruleHeaderDepth5Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeaderDepth5Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth5ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeaderDepth5Expression"


    // $ANTLR start "ruleHeaderDepth5Expression"
    // InternalHammilDSL.g:329:1: ruleHeaderDepth5Expression : ( ( rule__HeaderDepth5Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth5Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:333:2: ( ( ( rule__HeaderDepth5Expression__Group__0 ) ) )
            // InternalHammilDSL.g:334:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:334:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            // InternalHammilDSL.g:335:3: ( rule__HeaderDepth5Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:336:3: ( rule__HeaderDepth5Expression__Group__0 )
            // InternalHammilDSL.g:336:4: rule__HeaderDepth5Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth5ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeaderDepth5Expression"


    // $ANTLR start "entryRuleHeaderDepth6Expression"
    // InternalHammilDSL.g:345:1: entryRuleHeaderDepth6Expression : ruleHeaderDepth6Expression EOF ;
    public final void entryRuleHeaderDepth6Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:346:1: ( ruleHeaderDepth6Expression EOF )
            // InternalHammilDSL.g:347:1: ruleHeaderDepth6Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeaderDepth6Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth6ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeaderDepth6Expression"


    // $ANTLR start "ruleHeaderDepth6Expression"
    // InternalHammilDSL.g:354:1: ruleHeaderDepth6Expression : ( ( rule__HeaderDepth6Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth6Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:358:2: ( ( ( rule__HeaderDepth6Expression__Group__0 ) ) )
            // InternalHammilDSL.g:359:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:359:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            // InternalHammilDSL.g:360:3: ( rule__HeaderDepth6Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:361:3: ( rule__HeaderDepth6Expression__Group__0 )
            // InternalHammilDSL.g:361:4: rule__HeaderDepth6Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth6ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeaderDepth6Expression"


    // $ANTLR start "entryRuleHeaderDepth4Expression"
    // InternalHammilDSL.g:370:1: entryRuleHeaderDepth4Expression : ruleHeaderDepth4Expression EOF ;
    public final void entryRuleHeaderDepth4Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:371:1: ( ruleHeaderDepth4Expression EOF )
            // InternalHammilDSL.g:372:1: ruleHeaderDepth4Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeaderDepth4Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth4ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeaderDepth4Expression"


    // $ANTLR start "ruleHeaderDepth4Expression"
    // InternalHammilDSL.g:379:1: ruleHeaderDepth4Expression : ( ( rule__HeaderDepth4Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth4Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:383:2: ( ( ( rule__HeaderDepth4Expression__Group__0 ) ) )
            // InternalHammilDSL.g:384:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:384:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            // InternalHammilDSL.g:385:3: ( rule__HeaderDepth4Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:386:3: ( rule__HeaderDepth4Expression__Group__0 )
            // InternalHammilDSL.g:386:4: rule__HeaderDepth4Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth4ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeaderDepth4Expression"


    // $ANTLR start "entryRuleTextualExpression"
    // InternalHammilDSL.g:395:1: entryRuleTextualExpression : ruleTextualExpression EOF ;
    public final void entryRuleTextualExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:396:1: ( ruleTextualExpression EOF )
            // InternalHammilDSL.g:397:1: ruleTextualExpression EOF
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
    // InternalHammilDSL.g:404:1: ruleTextualExpression : ( ( rule__TextualExpression__ContentStringAssignment ) ) ;
    public final void ruleTextualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:408:2: ( ( ( rule__TextualExpression__ContentStringAssignment ) ) )
            // InternalHammilDSL.g:409:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            {
            // InternalHammilDSL.g:409:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            // InternalHammilDSL.g:410:3: ( rule__TextualExpression__ContentStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); 
            }
            // InternalHammilDSL.g:411:3: ( rule__TextualExpression__ContentStringAssignment )
            // InternalHammilDSL.g:411:4: rule__TextualExpression__ContentStringAssignment
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
    // InternalHammilDSL.g:420:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalHammilDSL.g:421:1: ( ruleString0 EOF )
            // InternalHammilDSL.g:422:1: ruleString0 EOF
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
    // InternalHammilDSL.g:429:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:433:2: ( ( RULE_STRING ) )
            // InternalHammilDSL.g:434:2: ( RULE_STRING )
            {
            // InternalHammilDSL.g:434:2: ( RULE_STRING )
            // InternalHammilDSL.g:435:3: RULE_STRING
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
    // InternalHammilDSL.g:444:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Alternatives_0 ) ) | ( ruleTextExpression ) | ( ruleCodeExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:448:1: ( ( ( rule__Expression__Alternatives_0 ) ) | ( ruleTextExpression ) | ( ruleCodeExpression ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_BL) ) {
                    alt1=1;
                }
                else if ( (LA1_2==EOF||LA1_2==RULE_STRING||(LA1_2>=9 && LA1_2<=15)||(LA1_2>=17 && LA1_2<=21)) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHammilDSL.g:449:2: ( ( rule__Expression__Alternatives_0 ) )
                    {
                    // InternalHammilDSL.g:449:2: ( ( rule__Expression__Alternatives_0 ) )
                    // InternalHammilDSL.g:450:3: ( rule__Expression__Alternatives_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getAlternatives_0()); 
                    }
                    // InternalHammilDSL.g:451:3: ( rule__Expression__Alternatives_0 )
                    // InternalHammilDSL.g:451:4: rule__Expression__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getAlternatives_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:455:2: ( ruleTextExpression )
                    {
                    // InternalHammilDSL.g:455:2: ( ruleTextExpression )
                    // InternalHammilDSL.g:456:3: ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getTextExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getTextExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:461:2: ( ruleCodeExpression )
                    {
                    // InternalHammilDSL.g:461:2: ( ruleCodeExpression )
                    // InternalHammilDSL.g:462:3: ruleCodeExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCodeExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCodeExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getCodeExpressionParserRuleCall_2()); 
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


    // $ANTLR start "rule__Expression__Alternatives_0"
    // InternalHammilDSL.g:471:1: rule__Expression__Alternatives_0 : ( ( ( ruleHeaderDepth1Expression ) ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) );
    public final void rule__Expression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:475:1: ( ( ( ruleHeaderDepth1Expression ) ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_BL) ) {
                    int LA2_8 = input.LA(3);

                    if ( (LA2_8==16) ) {
                        alt2=1;
                    }
                    else if ( (LA2_8==9) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 8, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            case 20:
                {
                alt2=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalHammilDSL.g:476:2: ( ( ruleHeaderDepth1Expression ) )
                    {
                    // InternalHammilDSL.g:476:2: ( ( ruleHeaderDepth1Expression ) )
                    // InternalHammilDSL.g:477:3: ( ruleHeaderDepth1Expression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0_0()); 
                    }
                    // InternalHammilDSL.g:478:3: ( ruleHeaderDepth1Expression )
                    // InternalHammilDSL.g:478:4: ruleHeaderDepth1Expression
                    {
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth1Expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:482:2: ( ruleHeaderDepth2Expression )
                    {
                    // InternalHammilDSL.g:482:2: ( ruleHeaderDepth2Expression )
                    // InternalHammilDSL.g:483:3: ruleHeaderDepth2Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth2Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:488:2: ( ruleHeaderDepth3Expression )
                    {
                    // InternalHammilDSL.g:488:2: ( ruleHeaderDepth3Expression )
                    // InternalHammilDSL.g:489:3: ruleHeaderDepth3Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth3Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalHammilDSL.g:494:2: ( ruleHeaderDepth4Expression )
                    {
                    // InternalHammilDSL.g:494:2: ( ruleHeaderDepth4Expression )
                    // InternalHammilDSL.g:495:3: ruleHeaderDepth4Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_0_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth4Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalHammilDSL.g:500:2: ( ruleHeaderDepth5Expression )
                    {
                    // InternalHammilDSL.g:500:2: ( ruleHeaderDepth5Expression )
                    // InternalHammilDSL.g:501:3: ruleHeaderDepth5Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_0_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth5Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalHammilDSL.g:506:2: ( ruleHeaderDepth6Expression )
                    {
                    // InternalHammilDSL.g:506:2: ( ruleHeaderDepth6Expression )
                    // InternalHammilDSL.g:507:3: ruleHeaderDepth6Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_0_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth6Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_0_5()); 
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
    // $ANTLR end "rule__Expression__Alternatives_0"


    // $ANTLR start "rule__TextExpression__Alternatives"
    // InternalHammilDSL.g:516:1: rule__TextExpression__Alternatives : ( ( ruleHorizontalExpression ) | ( ruleQuoteExpression ) | ( ruleTextualExpression ) );
    public final void rule__TextExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:520:1: ( ( ruleHorizontalExpression ) | ( ruleQuoteExpression ) | ( ruleTextualExpression ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 9:
            case 10:
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHammilDSL.g:521:2: ( ruleHorizontalExpression )
                    {
                    // InternalHammilDSL.g:521:2: ( ruleHorizontalExpression )
                    // InternalHammilDSL.g:522:3: ruleHorizontalExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getHorizontalExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHorizontalExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getHorizontalExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:527:2: ( ruleQuoteExpression )
                    {
                    // InternalHammilDSL.g:527:2: ( ruleQuoteExpression )
                    // InternalHammilDSL.g:528:3: ruleQuoteExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleQuoteExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:533:2: ( ruleTextualExpression )
                    {
                    // InternalHammilDSL.g:533:2: ( ruleTextualExpression )
                    // InternalHammilDSL.g:534:3: ruleTextualExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTextualExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall_2()); 
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
    // $ANTLR end "rule__TextExpression__Alternatives"


    // $ANTLR start "rule__HorizontalExpression__Alternatives"
    // InternalHammilDSL.g:543:1: rule__HorizontalExpression__Alternatives : ( ( ( rule__HorizontalExpression__Group_0__0 ) ) | ( ( rule__HorizontalExpression__Group_1__0 ) ) | ( ( rule__HorizontalExpression__Group_2__0 ) ) );
    public final void rule__HorizontalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:547:1: ( ( ( rule__HorizontalExpression__Group_0__0 ) ) | ( ( rule__HorizontalExpression__Group_1__0 ) ) | ( ( rule__HorizontalExpression__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt4=1;
                }
                break;
            case 10:
                {
                alt4=2;
                }
                break;
            case 11:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalHammilDSL.g:548:2: ( ( rule__HorizontalExpression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:548:2: ( ( rule__HorizontalExpression__Group_0__0 ) )
                    // InternalHammilDSL.g:549:3: ( rule__HorizontalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:550:3: ( rule__HorizontalExpression__Group_0__0 )
                    // InternalHammilDSL.g:550:4: rule__HorizontalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:554:2: ( ( rule__HorizontalExpression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:554:2: ( ( rule__HorizontalExpression__Group_1__0 ) )
                    // InternalHammilDSL.g:555:3: ( rule__HorizontalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:556:3: ( rule__HorizontalExpression__Group_1__0 )
                    // InternalHammilDSL.g:556:4: rule__HorizontalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:560:2: ( ( rule__HorizontalExpression__Group_2__0 ) )
                    {
                    // InternalHammilDSL.g:560:2: ( ( rule__HorizontalExpression__Group_2__0 ) )
                    // InternalHammilDSL.g:561:3: ( rule__HorizontalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getGroup_2()); 
                    }
                    // InternalHammilDSL.g:562:3: ( rule__HorizontalExpression__Group_2__0 )
                    // InternalHammilDSL.g:562:4: rule__HorizontalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HorizontalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().getGroup_2()); 
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
    // $ANTLR end "rule__HorizontalExpression__Alternatives"


    // $ANTLR start "rule__CodeExpression__Alternatives"
    // InternalHammilDSL.g:570:1: rule__CodeExpression__Alternatives : ( ( ( rule__CodeExpression__Group_0__0 ) ) | ( ( rule__CodeExpression__Group_1__0 ) ) );
    public final void rule__CodeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:574:1: ( ( ( rule__CodeExpression__Group_0__0 ) ) | ( ( rule__CodeExpression__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHammilDSL.g:575:2: ( ( rule__CodeExpression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:575:2: ( ( rule__CodeExpression__Group_0__0 ) )
                    // InternalHammilDSL.g:576:3: ( rule__CodeExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCodeExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:577:3: ( rule__CodeExpression__Group_0__0 )
                    // InternalHammilDSL.g:577:4: rule__CodeExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CodeExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCodeExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:581:2: ( ( rule__CodeExpression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:581:2: ( ( rule__CodeExpression__Group_1__0 ) )
                    // InternalHammilDSL.g:582:3: ( rule__CodeExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCodeExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:583:3: ( rule__CodeExpression__Group_1__0 )
                    // InternalHammilDSL.g:583:4: rule__CodeExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CodeExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCodeExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CodeExpression__Alternatives"


    // $ANTLR start "rule__HeaderDepth1Expression__Alternatives"
    // InternalHammilDSL.g:591:1: rule__HeaderDepth1Expression__Alternatives : ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth1Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:595:1: ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHammilDSL.g:596:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:596:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:597:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:598:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    // InternalHammilDSL.g:598:4: rule__HeaderDepth1Expression__Group_0__0
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
                    // InternalHammilDSL.g:602:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:602:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:603:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:604:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    // InternalHammilDSL.g:604:4: rule__HeaderDepth1Expression__Group_1__0
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


    // $ANTLR start "rule__HeaderDepth2Expression__Alternatives"
    // InternalHammilDSL.g:612:1: rule__HeaderDepth2Expression__Alternatives : ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth2Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:616:1: ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHammilDSL.g:617:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:617:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:618:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:619:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    // InternalHammilDSL.g:619:4: rule__HeaderDepth2Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HeaderDepth2Expression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:623:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:623:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:624:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:625:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    // InternalHammilDSL.g:625:4: rule__HeaderDepth2Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HeaderDepth2Expression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__Alternatives"


    // $ANTLR start "rule__File__Group__0"
    // InternalHammilDSL.g:633:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:637:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalHammilDSL.g:638:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalHammilDSL.g:645:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:649:1: ( ( () ) )
            // InternalHammilDSL.g:650:1: ( () )
            {
            // InternalHammilDSL.g:650:1: ( () )
            // InternalHammilDSL.g:651:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalHammilDSL.g:652:2: ()
            // InternalHammilDSL.g:652:3: 
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
    // InternalHammilDSL.g:660:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:664:1: ( rule__File__Group__1__Impl )
            // InternalHammilDSL.g:665:2: rule__File__Group__1__Impl
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
    // InternalHammilDSL.g:671:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:675:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalHammilDSL.g:676:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalHammilDSL.g:676:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalHammilDSL.g:677:2: ( rule__File__ExpressionAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            }
            // InternalHammilDSL.g:678:2: ( rule__File__ExpressionAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING||(LA8_0>=9 && LA8_0<=15)||(LA8_0>=17 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHammilDSL.g:678:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "rule__HorizontalExpression__Group_0__0"
    // InternalHammilDSL.g:687:1: rule__HorizontalExpression__Group_0__0 : rule__HorizontalExpression__Group_0__0__Impl rule__HorizontalExpression__Group_0__1 ;
    public final void rule__HorizontalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:691:1: ( rule__HorizontalExpression__Group_0__0__Impl rule__HorizontalExpression__Group_0__1 )
            // InternalHammilDSL.g:692:2: rule__HorizontalExpression__Group_0__0__Impl rule__HorizontalExpression__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__HorizontalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0__1();

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
    // $ANTLR end "rule__HorizontalExpression__Group_0__0"


    // $ANTLR start "rule__HorizontalExpression__Group_0__0__Impl"
    // InternalHammilDSL.g:699:1: rule__HorizontalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__HorizontalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:703:1: ( ( () ) )
            // InternalHammilDSL.g:704:1: ( () )
            {
            // InternalHammilDSL.g:704:1: ( () )
            // InternalHammilDSL.g:705:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHorizontalExpressionAction_0_0()); 
            }
            // InternalHammilDSL.g:706:2: ()
            // InternalHammilDSL.g:706:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHorizontalExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_0__1"
    // InternalHammilDSL.g:714:1: rule__HorizontalExpression__Group_0__1 : rule__HorizontalExpression__Group_0__1__Impl rule__HorizontalExpression__Group_0__2 ;
    public final void rule__HorizontalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:718:1: ( rule__HorizontalExpression__Group_0__1__Impl rule__HorizontalExpression__Group_0__2 )
            // InternalHammilDSL.g:719:2: rule__HorizontalExpression__Group_0__1__Impl rule__HorizontalExpression__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__HorizontalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0__2();

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
    // $ANTLR end "rule__HorizontalExpression__Group_0__1"


    // $ANTLR start "rule__HorizontalExpression__Group_0__1__Impl"
    // InternalHammilDSL.g:726:1: rule__HorizontalExpression__Group_0__1__Impl : ( '-' ) ;
    public final void rule__HorizontalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:730:1: ( ( '-' ) )
            // InternalHammilDSL.g:731:1: ( '-' )
            {
            // InternalHammilDSL.g:731:1: ( '-' )
            // InternalHammilDSL.g:732:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_0__2"
    // InternalHammilDSL.g:741:1: rule__HorizontalExpression__Group_0__2 : rule__HorizontalExpression__Group_0__2__Impl rule__HorizontalExpression__Group_0__3 ;
    public final void rule__HorizontalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:745:1: ( rule__HorizontalExpression__Group_0__2__Impl rule__HorizontalExpression__Group_0__3 )
            // InternalHammilDSL.g:746:2: rule__HorizontalExpression__Group_0__2__Impl rule__HorizontalExpression__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__HorizontalExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0__3();

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
    // $ANTLR end "rule__HorizontalExpression__Group_0__2"


    // $ANTLR start "rule__HorizontalExpression__Group_0__2__Impl"
    // InternalHammilDSL.g:753:1: rule__HorizontalExpression__Group_0__2__Impl : ( '-' ) ;
    public final void rule__HorizontalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:757:1: ( ( '-' ) )
            // InternalHammilDSL.g:758:1: ( '-' )
            {
            // InternalHammilDSL.g:758:1: ( '-' )
            // InternalHammilDSL.g:759:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_2()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_2()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_0__2__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_0__3"
    // InternalHammilDSL.g:768:1: rule__HorizontalExpression__Group_0__3 : rule__HorizontalExpression__Group_0__3__Impl rule__HorizontalExpression__Group_0__4 ;
    public final void rule__HorizontalExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:772:1: ( rule__HorizontalExpression__Group_0__3__Impl rule__HorizontalExpression__Group_0__4 )
            // InternalHammilDSL.g:773:2: rule__HorizontalExpression__Group_0__3__Impl rule__HorizontalExpression__Group_0__4
            {
            pushFollow(FOLLOW_6);
            rule__HorizontalExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0__4();

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
    // $ANTLR end "rule__HorizontalExpression__Group_0__3"


    // $ANTLR start "rule__HorizontalExpression__Group_0__3__Impl"
    // InternalHammilDSL.g:780:1: rule__HorizontalExpression__Group_0__3__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__HorizontalExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:784:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalHammilDSL.g:785:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalHammilDSL.g:785:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalHammilDSL.g:786:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalHammilDSL.g:786:2: ( ( '-' ) )
            // InternalHammilDSL.g:787:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_3()); 
            }
            // InternalHammilDSL.g:788:3: ( '-' )
            // InternalHammilDSL.g:788:4: '-'
            {
            match(input,9,FOLLOW_7); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_3()); 
            }

            }

            // InternalHammilDSL.g:791:2: ( ( '-' )* )
            // InternalHammilDSL.g:792:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_3()); 
            }
            // InternalHammilDSL.g:793:3: ( '-' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==9) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHammilDSL.g:793:4: '-'
            	    {
            	    match(input,9,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_3()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_0__3__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_0__4"
    // InternalHammilDSL.g:802:1: rule__HorizontalExpression__Group_0__4 : rule__HorizontalExpression__Group_0__4__Impl ;
    public final void rule__HorizontalExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:806:1: ( rule__HorizontalExpression__Group_0__4__Impl )
            // InternalHammilDSL.g:807:2: rule__HorizontalExpression__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0__4__Impl();

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
    // $ANTLR end "rule__HorizontalExpression__Group_0__4"


    // $ANTLR start "rule__HorizontalExpression__Group_0__4__Impl"
    // InternalHammilDSL.g:813:1: rule__HorizontalExpression__Group_0__4__Impl : ( RULE_BL ) ;
    public final void rule__HorizontalExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:817:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:818:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:818:1: ( RULE_BL )
            // InternalHammilDSL.g:819:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getBLTerminalRuleCall_0_4()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getBLTerminalRuleCall_0_4()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_0__4__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_1__0"
    // InternalHammilDSL.g:829:1: rule__HorizontalExpression__Group_1__0 : rule__HorizontalExpression__Group_1__0__Impl rule__HorizontalExpression__Group_1__1 ;
    public final void rule__HorizontalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:833:1: ( rule__HorizontalExpression__Group_1__0__Impl rule__HorizontalExpression__Group_1__1 )
            // InternalHammilDSL.g:834:2: rule__HorizontalExpression__Group_1__0__Impl rule__HorizontalExpression__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__HorizontalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_1__1();

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
    // $ANTLR end "rule__HorizontalExpression__Group_1__0"


    // $ANTLR start "rule__HorizontalExpression__Group_1__0__Impl"
    // InternalHammilDSL.g:841:1: rule__HorizontalExpression__Group_1__0__Impl : ( '*' ) ;
    public final void rule__HorizontalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:845:1: ( ( '*' ) )
            // InternalHammilDSL.g:846:1: ( '*' )
            {
            // InternalHammilDSL.g:846:1: ( '*' )
            // InternalHammilDSL.g:847:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_0()); 
            }
            match(input,10,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_0()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_1__1"
    // InternalHammilDSL.g:856:1: rule__HorizontalExpression__Group_1__1 : rule__HorizontalExpression__Group_1__1__Impl rule__HorizontalExpression__Group_1__2 ;
    public final void rule__HorizontalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:860:1: ( rule__HorizontalExpression__Group_1__1__Impl rule__HorizontalExpression__Group_1__2 )
            // InternalHammilDSL.g:861:2: rule__HorizontalExpression__Group_1__1__Impl rule__HorizontalExpression__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__HorizontalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_1__2();

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
    // $ANTLR end "rule__HorizontalExpression__Group_1__1"


    // $ANTLR start "rule__HorizontalExpression__Group_1__1__Impl"
    // InternalHammilDSL.g:868:1: rule__HorizontalExpression__Group_1__1__Impl : ( '*' ) ;
    public final void rule__HorizontalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:872:1: ( ( '*' ) )
            // InternalHammilDSL.g:873:1: ( '*' )
            {
            // InternalHammilDSL.g:873:1: ( '*' )
            // InternalHammilDSL.g:874:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,10,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_1()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_1__2"
    // InternalHammilDSL.g:883:1: rule__HorizontalExpression__Group_1__2 : rule__HorizontalExpression__Group_1__2__Impl rule__HorizontalExpression__Group_1__3 ;
    public final void rule__HorizontalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:887:1: ( rule__HorizontalExpression__Group_1__2__Impl rule__HorizontalExpression__Group_1__3 )
            // InternalHammilDSL.g:888:2: rule__HorizontalExpression__Group_1__2__Impl rule__HorizontalExpression__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__HorizontalExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_1__3();

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
    // $ANTLR end "rule__HorizontalExpression__Group_1__2"


    // $ANTLR start "rule__HorizontalExpression__Group_1__2__Impl"
    // InternalHammilDSL.g:895:1: rule__HorizontalExpression__Group_1__2__Impl : ( ( ( '*' ) ) ( ( '*' )* ) ) ;
    public final void rule__HorizontalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:899:1: ( ( ( ( '*' ) ) ( ( '*' )* ) ) )
            // InternalHammilDSL.g:900:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            {
            // InternalHammilDSL.g:900:1: ( ( ( '*' ) ) ( ( '*' )* ) )
            // InternalHammilDSL.g:901:2: ( ( '*' ) ) ( ( '*' )* )
            {
            // InternalHammilDSL.g:901:2: ( ( '*' ) )
            // InternalHammilDSL.g:902:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_2()); 
            }
            // InternalHammilDSL.g:903:3: ( '*' )
            // InternalHammilDSL.g:903:4: '*'
            {
            match(input,10,FOLLOW_9); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_2()); 
            }

            }

            // InternalHammilDSL.g:906:2: ( ( '*' )* )
            // InternalHammilDSL.g:907:3: ( '*' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_2()); 
            }
            // InternalHammilDSL.g:908:3: ( '*' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==10) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHammilDSL.g:908:4: '*'
            	    {
            	    match(input,10,FOLLOW_9); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_2()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_1__3"
    // InternalHammilDSL.g:917:1: rule__HorizontalExpression__Group_1__3 : rule__HorizontalExpression__Group_1__3__Impl ;
    public final void rule__HorizontalExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:921:1: ( rule__HorizontalExpression__Group_1__3__Impl )
            // InternalHammilDSL.g:922:2: rule__HorizontalExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_1__3__Impl();

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
    // $ANTLR end "rule__HorizontalExpression__Group_1__3"


    // $ANTLR start "rule__HorizontalExpression__Group_1__3__Impl"
    // InternalHammilDSL.g:928:1: rule__HorizontalExpression__Group_1__3__Impl : ( RULE_BL ) ;
    public final void rule__HorizontalExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:932:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:933:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:933:1: ( RULE_BL )
            // InternalHammilDSL.g:934:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getBLTerminalRuleCall_1_3()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getBLTerminalRuleCall_1_3()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_1__3__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_2__0"
    // InternalHammilDSL.g:944:1: rule__HorizontalExpression__Group_2__0 : rule__HorizontalExpression__Group_2__0__Impl rule__HorizontalExpression__Group_2__1 ;
    public final void rule__HorizontalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:948:1: ( rule__HorizontalExpression__Group_2__0__Impl rule__HorizontalExpression__Group_2__1 )
            // InternalHammilDSL.g:949:2: rule__HorizontalExpression__Group_2__0__Impl rule__HorizontalExpression__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__HorizontalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_2__1();

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
    // $ANTLR end "rule__HorizontalExpression__Group_2__0"


    // $ANTLR start "rule__HorizontalExpression__Group_2__0__Impl"
    // InternalHammilDSL.g:956:1: rule__HorizontalExpression__Group_2__0__Impl : ( '_' ) ;
    public final void rule__HorizontalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:960:1: ( ( '_' ) )
            // InternalHammilDSL.g:961:1: ( '_' )
            {
            // InternalHammilDSL.g:961:1: ( '_' )
            // InternalHammilDSL.g:962:2: '_'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_0()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_2__1"
    // InternalHammilDSL.g:971:1: rule__HorizontalExpression__Group_2__1 : rule__HorizontalExpression__Group_2__1__Impl rule__HorizontalExpression__Group_2__2 ;
    public final void rule__HorizontalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:975:1: ( rule__HorizontalExpression__Group_2__1__Impl rule__HorizontalExpression__Group_2__2 )
            // InternalHammilDSL.g:976:2: rule__HorizontalExpression__Group_2__1__Impl rule__HorizontalExpression__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__HorizontalExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_2__2();

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
    // $ANTLR end "rule__HorizontalExpression__Group_2__1"


    // $ANTLR start "rule__HorizontalExpression__Group_2__1__Impl"
    // InternalHammilDSL.g:983:1: rule__HorizontalExpression__Group_2__1__Impl : ( '_' ) ;
    public final void rule__HorizontalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:987:1: ( ( '_' ) )
            // InternalHammilDSL.g:988:1: ( '_' )
            {
            // InternalHammilDSL.g:988:1: ( '_' )
            // InternalHammilDSL.g:989:2: '_'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_1()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_2__2"
    // InternalHammilDSL.g:998:1: rule__HorizontalExpression__Group_2__2 : rule__HorizontalExpression__Group_2__2__Impl rule__HorizontalExpression__Group_2__3 ;
    public final void rule__HorizontalExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1002:1: ( rule__HorizontalExpression__Group_2__2__Impl rule__HorizontalExpression__Group_2__3 )
            // InternalHammilDSL.g:1003:2: rule__HorizontalExpression__Group_2__2__Impl rule__HorizontalExpression__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__HorizontalExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_2__3();

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
    // $ANTLR end "rule__HorizontalExpression__Group_2__2"


    // $ANTLR start "rule__HorizontalExpression__Group_2__2__Impl"
    // InternalHammilDSL.g:1010:1: rule__HorizontalExpression__Group_2__2__Impl : ( ( ( '_' ) ) ( ( '_' )* ) ) ;
    public final void rule__HorizontalExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1014:1: ( ( ( ( '_' ) ) ( ( '_' )* ) ) )
            // InternalHammilDSL.g:1015:1: ( ( ( '_' ) ) ( ( '_' )* ) )
            {
            // InternalHammilDSL.g:1015:1: ( ( ( '_' ) ) ( ( '_' )* ) )
            // InternalHammilDSL.g:1016:2: ( ( '_' ) ) ( ( '_' )* )
            {
            // InternalHammilDSL.g:1016:2: ( ( '_' ) )
            // InternalHammilDSL.g:1017:3: ( '_' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_2()); 
            }
            // InternalHammilDSL.g:1018:3: ( '_' )
            // InternalHammilDSL.g:1018:4: '_'
            {
            match(input,11,FOLLOW_11); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_2()); 
            }

            }

            // InternalHammilDSL.g:1021:2: ( ( '_' )* )
            // InternalHammilDSL.g:1022:3: ( '_' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_2()); 
            }
            // InternalHammilDSL.g:1023:3: ( '_' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHammilDSL.g:1023:4: '_'
            	    {
            	    match(input,11,FOLLOW_11); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_2()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_2__2__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_2__3"
    // InternalHammilDSL.g:1032:1: rule__HorizontalExpression__Group_2__3 : rule__HorizontalExpression__Group_2__3__Impl ;
    public final void rule__HorizontalExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1036:1: ( rule__HorizontalExpression__Group_2__3__Impl )
            // InternalHammilDSL.g:1037:2: rule__HorizontalExpression__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_2__3__Impl();

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
    // $ANTLR end "rule__HorizontalExpression__Group_2__3"


    // $ANTLR start "rule__HorizontalExpression__Group_2__3__Impl"
    // InternalHammilDSL.g:1043:1: rule__HorizontalExpression__Group_2__3__Impl : ( RULE_BL ) ;
    public final void rule__HorizontalExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1047:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:1048:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:1048:1: ( RULE_BL )
            // InternalHammilDSL.g:1049:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getBLTerminalRuleCall_2_3()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getBLTerminalRuleCall_2_3()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_2__3__Impl"


    // $ANTLR start "rule__QuoteExpression__Group__0"
    // InternalHammilDSL.g:1059:1: rule__QuoteExpression__Group__0 : rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 ;
    public final void rule__QuoteExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1063:1: ( rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 )
            // InternalHammilDSL.g:1064:2: rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__QuoteExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__1();

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
    // $ANTLR end "rule__QuoteExpression__Group__0"


    // $ANTLR start "rule__QuoteExpression__Group__0__Impl"
    // InternalHammilDSL.g:1071:1: rule__QuoteExpression__Group__0__Impl : ( '>' ) ;
    public final void rule__QuoteExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1075:1: ( ( '>' ) )
            // InternalHammilDSL.g:1076:1: ( '>' )
            {
            // InternalHammilDSL.g:1076:1: ( '>' )
            // InternalHammilDSL.g:1077:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_0()); 
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
    // $ANTLR end "rule__QuoteExpression__Group__0__Impl"


    // $ANTLR start "rule__QuoteExpression__Group__1"
    // InternalHammilDSL.g:1086:1: rule__QuoteExpression__Group__1 : rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 ;
    public final void rule__QuoteExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1090:1: ( rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 )
            // InternalHammilDSL.g:1091:2: rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__QuoteExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__2();

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
    // $ANTLR end "rule__QuoteExpression__Group__1"


    // $ANTLR start "rule__QuoteExpression__Group__1__Impl"
    // InternalHammilDSL.g:1098:1: rule__QuoteExpression__Group__1__Impl : ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) ) ;
    public final void rule__QuoteExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1102:1: ( ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) ) )
            // InternalHammilDSL.g:1103:1: ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) )
            {
            // InternalHammilDSL.g:1103:1: ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) )
            // InternalHammilDSL.g:1104:2: ( rule__QuoteExpression__TextexpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getTextexpressionAssignment_1()); 
            }
            // InternalHammilDSL.g:1105:2: ( rule__QuoteExpression__TextexpressionAssignment_1 )
            // InternalHammilDSL.g:1105:3: rule__QuoteExpression__TextexpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__TextexpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getTextexpressionAssignment_1()); 
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
    // $ANTLR end "rule__QuoteExpression__Group__1__Impl"


    // $ANTLR start "rule__QuoteExpression__Group__2"
    // InternalHammilDSL.g:1113:1: rule__QuoteExpression__Group__2 : rule__QuoteExpression__Group__2__Impl ;
    public final void rule__QuoteExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1117:1: ( rule__QuoteExpression__Group__2__Impl )
            // InternalHammilDSL.g:1118:2: rule__QuoteExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__2__Impl();

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
    // $ANTLR end "rule__QuoteExpression__Group__2"


    // $ANTLR start "rule__QuoteExpression__Group__2__Impl"
    // InternalHammilDSL.g:1124:1: rule__QuoteExpression__Group__2__Impl : ( RULE_BL ) ;
    public final void rule__QuoteExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1128:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:1129:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:1129:1: ( RULE_BL )
            // InternalHammilDSL.g:1130:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_2()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__QuoteExpression__Group__2__Impl"


    // $ANTLR start "rule__CodeExpression__Group_0__0"
    // InternalHammilDSL.g:1140:1: rule__CodeExpression__Group_0__0 : rule__CodeExpression__Group_0__0__Impl rule__CodeExpression__Group_0__1 ;
    public final void rule__CodeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1144:1: ( rule__CodeExpression__Group_0__0__Impl rule__CodeExpression__Group_0__1 )
            // InternalHammilDSL.g:1145:2: rule__CodeExpression__Group_0__0__Impl rule__CodeExpression__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__CodeExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CodeExpression__Group_0__1();

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
    // $ANTLR end "rule__CodeExpression__Group_0__0"


    // $ANTLR start "rule__CodeExpression__Group_0__0__Impl"
    // InternalHammilDSL.g:1152:1: rule__CodeExpression__Group_0__0__Impl : ( '`' ) ;
    public final void rule__CodeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1156:1: ( ( '`' ) )
            // InternalHammilDSL.g:1157:1: ( '`' )
            {
            // InternalHammilDSL.g:1157:1: ( '`' )
            // InternalHammilDSL.g:1158:2: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getGraveAccentKeyword_0_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getGraveAccentKeyword_0_0()); 
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
    // $ANTLR end "rule__CodeExpression__Group_0__0__Impl"


    // $ANTLR start "rule__CodeExpression__Group_0__1"
    // InternalHammilDSL.g:1167:1: rule__CodeExpression__Group_0__1 : rule__CodeExpression__Group_0__1__Impl rule__CodeExpression__Group_0__2 ;
    public final void rule__CodeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1171:1: ( rule__CodeExpression__Group_0__1__Impl rule__CodeExpression__Group_0__2 )
            // InternalHammilDSL.g:1172:2: rule__CodeExpression__Group_0__1__Impl rule__CodeExpression__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__CodeExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CodeExpression__Group_0__2();

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
    // $ANTLR end "rule__CodeExpression__Group_0__1"


    // $ANTLR start "rule__CodeExpression__Group_0__1__Impl"
    // InternalHammilDSL.g:1179:1: rule__CodeExpression__Group_0__1__Impl : ( ( rule__CodeExpression__TextAssignment_0_1 ) ) ;
    public final void rule__CodeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1183:1: ( ( ( rule__CodeExpression__TextAssignment_0_1 ) ) )
            // InternalHammilDSL.g:1184:1: ( ( rule__CodeExpression__TextAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:1184:1: ( ( rule__CodeExpression__TextAssignment_0_1 ) )
            // InternalHammilDSL.g:1185:2: ( rule__CodeExpression__TextAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getTextAssignment_0_1()); 
            }
            // InternalHammilDSL.g:1186:2: ( rule__CodeExpression__TextAssignment_0_1 )
            // InternalHammilDSL.g:1186:3: rule__CodeExpression__TextAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CodeExpression__TextAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getTextAssignment_0_1()); 
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
    // $ANTLR end "rule__CodeExpression__Group_0__1__Impl"


    // $ANTLR start "rule__CodeExpression__Group_0__2"
    // InternalHammilDSL.g:1194:1: rule__CodeExpression__Group_0__2 : rule__CodeExpression__Group_0__2__Impl ;
    public final void rule__CodeExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1198:1: ( rule__CodeExpression__Group_0__2__Impl )
            // InternalHammilDSL.g:1199:2: rule__CodeExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodeExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__CodeExpression__Group_0__2"


    // $ANTLR start "rule__CodeExpression__Group_0__2__Impl"
    // InternalHammilDSL.g:1205:1: rule__CodeExpression__Group_0__2__Impl : ( '`' ) ;
    public final void rule__CodeExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1209:1: ( ( '`' ) )
            // InternalHammilDSL.g:1210:1: ( '`' )
            {
            // InternalHammilDSL.g:1210:1: ( '`' )
            // InternalHammilDSL.g:1211:2: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getGraveAccentKeyword_0_2()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getGraveAccentKeyword_0_2()); 
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
    // $ANTLR end "rule__CodeExpression__Group_0__2__Impl"


    // $ANTLR start "rule__CodeExpression__Group_1__0"
    // InternalHammilDSL.g:1221:1: rule__CodeExpression__Group_1__0 : rule__CodeExpression__Group_1__0__Impl rule__CodeExpression__Group_1__1 ;
    public final void rule__CodeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1225:1: ( rule__CodeExpression__Group_1__0__Impl rule__CodeExpression__Group_1__1 )
            // InternalHammilDSL.g:1226:2: rule__CodeExpression__Group_1__0__Impl rule__CodeExpression__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__CodeExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CodeExpression__Group_1__1();

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
    // $ANTLR end "rule__CodeExpression__Group_1__0"


    // $ANTLR start "rule__CodeExpression__Group_1__0__Impl"
    // InternalHammilDSL.g:1233:1: rule__CodeExpression__Group_1__0__Impl : ( '```' ) ;
    public final void rule__CodeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1237:1: ( ( '```' ) )
            // InternalHammilDSL.g:1238:1: ( '```' )
            {
            // InternalHammilDSL.g:1238:1: ( '```' )
            // InternalHammilDSL.g:1239:2: '```'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getGraveAccentGraveAccentGraveAccentKeyword_1_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getGraveAccentGraveAccentGraveAccentKeyword_1_0()); 
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
    // $ANTLR end "rule__CodeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__CodeExpression__Group_1__1"
    // InternalHammilDSL.g:1248:1: rule__CodeExpression__Group_1__1 : rule__CodeExpression__Group_1__1__Impl rule__CodeExpression__Group_1__2 ;
    public final void rule__CodeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1252:1: ( rule__CodeExpression__Group_1__1__Impl rule__CodeExpression__Group_1__2 )
            // InternalHammilDSL.g:1253:2: rule__CodeExpression__Group_1__1__Impl rule__CodeExpression__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__CodeExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CodeExpression__Group_1__2();

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
    // $ANTLR end "rule__CodeExpression__Group_1__1"


    // $ANTLR start "rule__CodeExpression__Group_1__1__Impl"
    // InternalHammilDSL.g:1260:1: rule__CodeExpression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__CodeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1264:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:1265:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:1265:1: ( RULE_BL )
            // InternalHammilDSL.g:1266:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getBLTerminalRuleCall_1_1()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getBLTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__CodeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__CodeExpression__Group_1__2"
    // InternalHammilDSL.g:1275:1: rule__CodeExpression__Group_1__2 : rule__CodeExpression__Group_1__2__Impl rule__CodeExpression__Group_1__3 ;
    public final void rule__CodeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1279:1: ( rule__CodeExpression__Group_1__2__Impl rule__CodeExpression__Group_1__3 )
            // InternalHammilDSL.g:1280:2: rule__CodeExpression__Group_1__2__Impl rule__CodeExpression__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__CodeExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CodeExpression__Group_1__3();

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
    // $ANTLR end "rule__CodeExpression__Group_1__2"


    // $ANTLR start "rule__CodeExpression__Group_1__2__Impl"
    // InternalHammilDSL.g:1287:1: rule__CodeExpression__Group_1__2__Impl : ( ( rule__CodeExpression__TextAssignment_1_2 ) ) ;
    public final void rule__CodeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1291:1: ( ( ( rule__CodeExpression__TextAssignment_1_2 ) ) )
            // InternalHammilDSL.g:1292:1: ( ( rule__CodeExpression__TextAssignment_1_2 ) )
            {
            // InternalHammilDSL.g:1292:1: ( ( rule__CodeExpression__TextAssignment_1_2 ) )
            // InternalHammilDSL.g:1293:2: ( rule__CodeExpression__TextAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getTextAssignment_1_2()); 
            }
            // InternalHammilDSL.g:1294:2: ( rule__CodeExpression__TextAssignment_1_2 )
            // InternalHammilDSL.g:1294:3: rule__CodeExpression__TextAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CodeExpression__TextAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getTextAssignment_1_2()); 
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
    // $ANTLR end "rule__CodeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__CodeExpression__Group_1__3"
    // InternalHammilDSL.g:1302:1: rule__CodeExpression__Group_1__3 : rule__CodeExpression__Group_1__3__Impl rule__CodeExpression__Group_1__4 ;
    public final void rule__CodeExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1306:1: ( rule__CodeExpression__Group_1__3__Impl rule__CodeExpression__Group_1__4 )
            // InternalHammilDSL.g:1307:2: rule__CodeExpression__Group_1__3__Impl rule__CodeExpression__Group_1__4
            {
            pushFollow(FOLLOW_6);
            rule__CodeExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CodeExpression__Group_1__4();

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
    // $ANTLR end "rule__CodeExpression__Group_1__3"


    // $ANTLR start "rule__CodeExpression__Group_1__3__Impl"
    // InternalHammilDSL.g:1314:1: rule__CodeExpression__Group_1__3__Impl : ( '```' ) ;
    public final void rule__CodeExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1318:1: ( ( '```' ) )
            // InternalHammilDSL.g:1319:1: ( '```' )
            {
            // InternalHammilDSL.g:1319:1: ( '```' )
            // InternalHammilDSL.g:1320:2: '```'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getGraveAccentGraveAccentGraveAccentKeyword_1_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getGraveAccentGraveAccentGraveAccentKeyword_1_3()); 
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
    // $ANTLR end "rule__CodeExpression__Group_1__3__Impl"


    // $ANTLR start "rule__CodeExpression__Group_1__4"
    // InternalHammilDSL.g:1329:1: rule__CodeExpression__Group_1__4 : rule__CodeExpression__Group_1__4__Impl ;
    public final void rule__CodeExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1333:1: ( rule__CodeExpression__Group_1__4__Impl )
            // InternalHammilDSL.g:1334:2: rule__CodeExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodeExpression__Group_1__4__Impl();

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
    // $ANTLR end "rule__CodeExpression__Group_1__4"


    // $ANTLR start "rule__CodeExpression__Group_1__4__Impl"
    // InternalHammilDSL.g:1340:1: rule__CodeExpression__Group_1__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__CodeExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1344:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1345:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1345:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1346:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getBLTerminalRuleCall_1_4()); 
            }
            // InternalHammilDSL.g:1347:2: ( RULE_BL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHammilDSL.g:1347:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getBLTerminalRuleCall_1_4()); 
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
    // $ANTLR end "rule__CodeExpression__Group_1__4__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__0"
    // InternalHammilDSL.g:1356:1: rule__HeaderDepth1Expression__Group_0__0 : rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 ;
    public final void rule__HeaderDepth1Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1360:1: ( rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 )
            // InternalHammilDSL.g:1361:2: rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1368:1: rule__HeaderDepth1Expression__Group_0__0__Impl : ( ( '#' ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1372:1: ( ( ( '#' ) ) )
            // InternalHammilDSL.g:1373:1: ( ( '#' ) )
            {
            // InternalHammilDSL.g:1373:1: ( ( '#' ) )
            // InternalHammilDSL.g:1374:2: ( '#' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0()); 
            }
            // InternalHammilDSL.g:1375:2: ( '#' )
            // InternalHammilDSL.g:1375:3: '#'
            {
            match(input,15,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0()); 
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
    // InternalHammilDSL.g:1383:1: rule__HeaderDepth1Expression__Group_0__1 : rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 ;
    public final void rule__HeaderDepth1Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1387:1: ( rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 )
            // InternalHammilDSL.g:1388:2: rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalHammilDSL.g:1395:1: rule__HeaderDepth1Expression__Group_0__1__Impl : ( ( ( RULE_S ) ) ( ( RULE_S )* ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1399:1: ( ( ( ( RULE_S ) ) ( ( RULE_S )* ) ) )
            // InternalHammilDSL.g:1400:1: ( ( ( RULE_S ) ) ( ( RULE_S )* ) )
            {
            // InternalHammilDSL.g:1400:1: ( ( ( RULE_S ) ) ( ( RULE_S )* ) )
            // InternalHammilDSL.g:1401:2: ( ( RULE_S ) ) ( ( RULE_S )* )
            {
            // InternalHammilDSL.g:1401:2: ( ( RULE_S ) )
            // InternalHammilDSL.g:1402:3: ( RULE_S )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_1()); 
            }
            // InternalHammilDSL.g:1403:3: ( RULE_S )
            // InternalHammilDSL.g:1403:4: RULE_S
            {
            match(input,RULE_S,FOLLOW_17); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_1()); 
            }

            }

            // InternalHammilDSL.g:1406:2: ( ( RULE_S )* )
            // InternalHammilDSL.g:1407:3: ( RULE_S )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_1()); 
            }
            // InternalHammilDSL.g:1408:3: ( RULE_S )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_S) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHammilDSL.g:1408:4: RULE_S
            	    {
            	    match(input,RULE_S,FOLLOW_17); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_1()); 
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
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__1__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__2"
    // InternalHammilDSL.g:1417:1: rule__HeaderDepth1Expression__Group_0__2 : rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 ;
    public final void rule__HeaderDepth1Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1421:1: ( rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 )
            // InternalHammilDSL.g:1422:2: rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalHammilDSL.g:1429:1: rule__HeaderDepth1Expression__Group_0__2__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_0_2 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1433:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_0_2 ) ) )
            // InternalHammilDSL.g:1434:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_2 ) )
            {
            // InternalHammilDSL.g:1434:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_2 ) )
            // InternalHammilDSL.g:1435:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_2()); 
            }
            // InternalHammilDSL.g:1436:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_2 )
            // InternalHammilDSL.g:1436:3: rule__HeaderDepth1Expression__TitleAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__TitleAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_2()); 
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
    // InternalHammilDSL.g:1444:1: rule__HeaderDepth1Expression__Group_0__3 : rule__HeaderDepth1Expression__Group_0__3__Impl rule__HeaderDepth1Expression__Group_0__4 ;
    public final void rule__HeaderDepth1Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1448:1: ( rule__HeaderDepth1Expression__Group_0__3__Impl rule__HeaderDepth1Expression__Group_0__4 )
            // InternalHammilDSL.g:1449:2: rule__HeaderDepth1Expression__Group_0__3__Impl rule__HeaderDepth1Expression__Group_0__4
            {
            pushFollow(FOLLOW_18);
            rule__HeaderDepth1Expression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__4();

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
    // InternalHammilDSL.g:1456:1: rule__HeaderDepth1Expression__Group_0__3__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth1Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1460:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1461:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1461:1: ( ( '#' )* )
            // InternalHammilDSL.g:1462:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_3()); 
            }
            // InternalHammilDSL.g:1463:2: ( '#' )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalHammilDSL.g:1463:3: '#'
            	    {
            	    match(input,15,FOLLOW_19); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_3()); 
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


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__4"
    // InternalHammilDSL.g:1471:1: rule__HeaderDepth1Expression__Group_0__4 : rule__HeaderDepth1Expression__Group_0__4__Impl rule__HeaderDepth1Expression__Group_0__5 ;
    public final void rule__HeaderDepth1Expression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1475:1: ( rule__HeaderDepth1Expression__Group_0__4__Impl rule__HeaderDepth1Expression__Group_0__5 )
            // InternalHammilDSL.g:1476:2: rule__HeaderDepth1Expression__Group_0__4__Impl rule__HeaderDepth1Expression__Group_0__5
            {
            pushFollow(FOLLOW_18);
            rule__HeaderDepth1Expression__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__5();

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
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__4"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__4__Impl"
    // InternalHammilDSL.g:1483:1: rule__HeaderDepth1Expression__Group_0__4__Impl : ( ( RULE_S )* ) ;
    public final void rule__HeaderDepth1Expression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1487:1: ( ( ( RULE_S )* ) )
            // InternalHammilDSL.g:1488:1: ( ( RULE_S )* )
            {
            // InternalHammilDSL.g:1488:1: ( ( RULE_S )* )
            // InternalHammilDSL.g:1489:2: ( RULE_S )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_4()); 
            }
            // InternalHammilDSL.g:1490:2: ( RULE_S )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_S) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHammilDSL.g:1490:3: RULE_S
            	    {
            	    match(input,RULE_S,FOLLOW_17); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_4()); 
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
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__4__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__5"
    // InternalHammilDSL.g:1498:1: rule__HeaderDepth1Expression__Group_0__5 : rule__HeaderDepth1Expression__Group_0__5__Impl ;
    public final void rule__HeaderDepth1Expression__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1502:1: ( rule__HeaderDepth1Expression__Group_0__5__Impl )
            // InternalHammilDSL.g:1503:2: rule__HeaderDepth1Expression__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__5__Impl();

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
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__5"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__5__Impl"
    // InternalHammilDSL.g:1509:1: rule__HeaderDepth1Expression__Group_0__5__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1513:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1514:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1514:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1515:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_5()); 
            }
            // InternalHammilDSL.g:1516:2: ( RULE_BL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHammilDSL.g:1516:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_5()); 
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
    // $ANTLR end "rule__HeaderDepth1Expression__Group_0__5__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_1__0"
    // InternalHammilDSL.g:1525:1: rule__HeaderDepth1Expression__Group_1__0 : rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 ;
    public final void rule__HeaderDepth1Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1529:1: ( rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 )
            // InternalHammilDSL.g:1530:2: rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1537:1: rule__HeaderDepth1Expression__Group_1__0__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1541:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:1542:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:1542:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:1543:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); 
            }
            // InternalHammilDSL.g:1544:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:1544:3: rule__HeaderDepth1Expression__TitleAssignment_1_0
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
    // InternalHammilDSL.g:1552:1: rule__HeaderDepth1Expression__Group_1__1 : rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 ;
    public final void rule__HeaderDepth1Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1556:1: ( rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 )
            // InternalHammilDSL.g:1557:2: rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalHammilDSL.g:1564:1: rule__HeaderDepth1Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth1Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1568:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:1569:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:1569:1: ( RULE_BL )
            // InternalHammilDSL.g:1570:2: RULE_BL
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
    // InternalHammilDSL.g:1579:1: rule__HeaderDepth1Expression__Group_1__2 : rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 ;
    public final void rule__HeaderDepth1Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1583:1: ( rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 )
            // InternalHammilDSL.g:1584:2: rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1591:1: rule__HeaderDepth1Expression__Group_1__2__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1595:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // InternalHammilDSL.g:1596:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // InternalHammilDSL.g:1596:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // InternalHammilDSL.g:1597:2: ( ( '=' ) ) ( ( '=' )* )
            {
            // InternalHammilDSL.g:1597:2: ( ( '=' ) )
            // InternalHammilDSL.g:1598:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }
            // InternalHammilDSL.g:1599:3: ( '=' )
            // InternalHammilDSL.g:1599:4: '='
            {
            match(input,16,FOLLOW_21); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }

            }

            // InternalHammilDSL.g:1602:2: ( ( '=' )* )
            // InternalHammilDSL.g:1603:3: ( '=' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }
            // InternalHammilDSL.g:1604:3: ( '=' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHammilDSL.g:1604:4: '='
            	    {
            	    match(input,16,FOLLOW_21); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalHammilDSL.g:1613:1: rule__HeaderDepth1Expression__Group_1__3 : rule__HeaderDepth1Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1617:1: ( rule__HeaderDepth1Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:1618:2: rule__HeaderDepth1Expression__Group_1__3__Impl
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
    // InternalHammilDSL.g:1624:1: rule__HeaderDepth1Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1628:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1629:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1629:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1630:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            }
            // InternalHammilDSL.g:1631:2: ( RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHammilDSL.g:1631:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

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


    // $ANTLR start "rule__HeaderDepth2Expression__Group_0__0"
    // InternalHammilDSL.g:1640:1: rule__HeaderDepth2Expression__Group_0__0 : rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 ;
    public final void rule__HeaderDepth2Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1644:1: ( rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 )
            // InternalHammilDSL.g:1645:2: rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__HeaderDepth2Expression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_0__1();

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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_0__0"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_0__0__Impl"
    // InternalHammilDSL.g:1652:1: rule__HeaderDepth2Expression__Group_0__0__Impl : ( ( '##' ) ) ;
    public final void rule__HeaderDepth2Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1656:1: ( ( ( '##' ) ) )
            // InternalHammilDSL.g:1657:1: ( ( '##' ) )
            {
            // InternalHammilDSL.g:1657:1: ( ( '##' ) )
            // InternalHammilDSL.g:1658:2: ( '##' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0()); 
            }
            // InternalHammilDSL.g:1659:2: ( '##' )
            // InternalHammilDSL.g:1659:3: '##'
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_0__0__Impl"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_0__1"
    // InternalHammilDSL.g:1667:1: rule__HeaderDepth2Expression__Group_0__1 : rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 ;
    public final void rule__HeaderDepth2Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1671:1: ( rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 )
            // InternalHammilDSL.g:1672:2: rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth2Expression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_0__2();

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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_0__1"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_0__1__Impl"
    // InternalHammilDSL.g:1679:1: rule__HeaderDepth2Expression__Group_0__1__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1683:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) )
            // InternalHammilDSL.g:1684:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:1684:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            // InternalHammilDSL.g:1685:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_0_1()); 
            }
            // InternalHammilDSL.g:1686:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            // InternalHammilDSL.g:1686:3: rule__HeaderDepth2Expression__TitleAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__TitleAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_0_1()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_0__1__Impl"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_0__2"
    // InternalHammilDSL.g:1694:1: rule__HeaderDepth2Expression__Group_0__2 : rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 ;
    public final void rule__HeaderDepth2Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1698:1: ( rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 )
            // InternalHammilDSL.g:1699:2: rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth2Expression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_0__3();

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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_0__2"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_0__2__Impl"
    // InternalHammilDSL.g:1706:1: rule__HeaderDepth2Expression__Group_0__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth2Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1710:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1711:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1711:1: ( ( '#' )* )
            // InternalHammilDSL.g:1712:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2()); 
            }
            // InternalHammilDSL.g:1713:2: ( '#' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==EOF||(LA19_2>=RULE_STRING && LA19_2<=RULE_BL)||(LA19_2>=9 && LA19_2<=15)||(LA19_2>=17 && LA19_2<=21)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalHammilDSL.g:1713:3: '#'
            	    {
            	    match(input,15,FOLLOW_19); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_0__2__Impl"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_0__3"
    // InternalHammilDSL.g:1721:1: rule__HeaderDepth2Expression__Group_0__3 : rule__HeaderDepth2Expression__Group_0__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1725:1: ( rule__HeaderDepth2Expression__Group_0__3__Impl )
            // InternalHammilDSL.g:1726:2: rule__HeaderDepth2Expression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_0__3__Impl();

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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_0__3"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_0__3__Impl"
    // InternalHammilDSL.g:1732:1: rule__HeaderDepth2Expression__Group_0__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1736:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1737:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1737:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1738:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            }
            // InternalHammilDSL.g:1739:2: ( RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHammilDSL.g:1739:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_0__3__Impl"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_1__0"
    // InternalHammilDSL.g:1748:1: rule__HeaderDepth2Expression__Group_1__0 : rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 ;
    public final void rule__HeaderDepth2Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1752:1: ( rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 )
            // InternalHammilDSL.g:1753:2: rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__HeaderDepth2Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_1__1();

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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_1__0"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_1__0__Impl"
    // InternalHammilDSL.g:1760:1: rule__HeaderDepth2Expression__Group_1__0__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1764:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:1765:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:1765:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:1766:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_1_0()); 
            }
            // InternalHammilDSL.g:1767:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:1767:3: rule__HeaderDepth2Expression__TitleAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__TitleAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_1_0()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_1__0__Impl"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_1__1"
    // InternalHammilDSL.g:1775:1: rule__HeaderDepth2Expression__Group_1__1 : rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 ;
    public final void rule__HeaderDepth2Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1779:1: ( rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 )
            // InternalHammilDSL.g:1780:2: rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__HeaderDepth2Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_1__2();

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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_1__1"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_1__1__Impl"
    // InternalHammilDSL.g:1787:1: rule__HeaderDepth2Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth2Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1791:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:1792:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:1792:1: ( RULE_BL )
            // InternalHammilDSL.g:1793:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_1()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_1__1__Impl"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_1__2"
    // InternalHammilDSL.g:1802:1: rule__HeaderDepth2Expression__Group_1__2 : rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 ;
    public final void rule__HeaderDepth2Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1806:1: ( rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 )
            // InternalHammilDSL.g:1807:2: rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__HeaderDepth2Expression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_1__3();

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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_1__2"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_1__2__Impl"
    // InternalHammilDSL.g:1814:1: rule__HeaderDepth2Expression__Group_1__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1818:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalHammilDSL.g:1819:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalHammilDSL.g:1819:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalHammilDSL.g:1820:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalHammilDSL.g:1820:2: ( ( '-' ) )
            // InternalHammilDSL.g:1821:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            }
            // InternalHammilDSL.g:1822:3: ( '-' )
            // InternalHammilDSL.g:1822:4: '-'
            {
            match(input,9,FOLLOW_7); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            }

            }

            // InternalHammilDSL.g:1825:2: ( ( '-' )* )
            // InternalHammilDSL.g:1826:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            }
            // InternalHammilDSL.g:1827:3: ( '-' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==9) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==9) ) {
                        int LA21_3 = input.LA(3);

                        if ( (LA21_3==9) ) {
                            switch ( input.LA(4) ) {
                            case 9:
                                {
                                int LA21_6 = input.LA(5);

                                if ( (synpred28_InternalHammilDSL()) ) {
                                    alt21=1;
                                }


                                }
                                break;
                            case RULE_BL:
                                {
                                int LA21_7 = input.LA(5);

                                if ( (synpred28_InternalHammilDSL()) ) {
                                    alt21=1;
                                }


                                }
                                break;
                            case EOF:
                            case RULE_STRING:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                                {
                                alt21=1;
                                }
                                break;

                            }

                        }
                        else if ( (LA21_3==EOF||(LA21_3>=RULE_STRING && LA21_3<=RULE_BL)||(LA21_3>=10 && LA21_3<=15)||(LA21_3>=17 && LA21_3<=21)) ) {
                            alt21=1;
                        }


                    }
                    else if ( (LA21_2==EOF||(LA21_2>=RULE_STRING && LA21_2<=RULE_BL)||(LA21_2>=10 && LA21_2<=15)||(LA21_2>=17 && LA21_2<=21)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalHammilDSL.g:1827:4: '-'
            	    {
            	    match(input,9,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_1__2__Impl"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_1__3"
    // InternalHammilDSL.g:1836:1: rule__HeaderDepth2Expression__Group_1__3 : rule__HeaderDepth2Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1840:1: ( rule__HeaderDepth2Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:1841:2: rule__HeaderDepth2Expression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_1__3__Impl();

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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_1__3"


    // $ANTLR start "rule__HeaderDepth2Expression__Group_1__3__Impl"
    // InternalHammilDSL.g:1847:1: rule__HeaderDepth2Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1851:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1852:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1852:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1853:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            }
            // InternalHammilDSL.g:1854:2: ( RULE_BL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalHammilDSL.g:1854:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__Group_1__3__Impl"


    // $ANTLR start "rule__HeaderDepth3Expression__Group__0"
    // InternalHammilDSL.g:1863:1: rule__HeaderDepth3Expression__Group__0 : rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 ;
    public final void rule__HeaderDepth3Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1867:1: ( rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 )
            // InternalHammilDSL.g:1868:2: rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__HeaderDepth3Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__1();

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
    // $ANTLR end "rule__HeaderDepth3Expression__Group__0"


    // $ANTLR start "rule__HeaderDepth3Expression__Group__0__Impl"
    // InternalHammilDSL.g:1875:1: rule__HeaderDepth3Expression__Group__0__Impl : ( '###' ) ;
    public final void rule__HeaderDepth3Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1879:1: ( ( '###' ) )
            // InternalHammilDSL.g:1880:1: ( '###' )
            {
            // InternalHammilDSL.g:1880:1: ( '###' )
            // InternalHammilDSL.g:1881:2: '###'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0()); 
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
    // $ANTLR end "rule__HeaderDepth3Expression__Group__0__Impl"


    // $ANTLR start "rule__HeaderDepth3Expression__Group__1"
    // InternalHammilDSL.g:1890:1: rule__HeaderDepth3Expression__Group__1 : rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 ;
    public final void rule__HeaderDepth3Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1894:1: ( rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 )
            // InternalHammilDSL.g:1895:2: rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth3Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__2();

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
    // $ANTLR end "rule__HeaderDepth3Expression__Group__1"


    // $ANTLR start "rule__HeaderDepth3Expression__Group__1__Impl"
    // InternalHammilDSL.g:1902:1: rule__HeaderDepth3Expression__Group__1__Impl : ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth3Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1906:1: ( ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1907:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1907:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1908:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:1909:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1909:3: rule__HeaderDepth3Expression__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__TitleAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleAssignment_1()); 
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
    // $ANTLR end "rule__HeaderDepth3Expression__Group__1__Impl"


    // $ANTLR start "rule__HeaderDepth3Expression__Group__2"
    // InternalHammilDSL.g:1917:1: rule__HeaderDepth3Expression__Group__2 : rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 ;
    public final void rule__HeaderDepth3Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1921:1: ( rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 )
            // InternalHammilDSL.g:1922:2: rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth3Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__3();

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
    // $ANTLR end "rule__HeaderDepth3Expression__Group__2"


    // $ANTLR start "rule__HeaderDepth3Expression__Group__2__Impl"
    // InternalHammilDSL.g:1929:1: rule__HeaderDepth3Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth3Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1933:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1934:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1934:1: ( ( '#' )* )
            // InternalHammilDSL.g:1935:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:1936:2: ( '#' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==EOF||(LA23_2>=RULE_STRING && LA23_2<=RULE_BL)||(LA23_2>=9 && LA23_2<=15)||(LA23_2>=17 && LA23_2<=21)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalHammilDSL.g:1936:3: '#'
            	    {
            	    match(input,15,FOLLOW_19); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2()); 
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
    // $ANTLR end "rule__HeaderDepth3Expression__Group__2__Impl"


    // $ANTLR start "rule__HeaderDepth3Expression__Group__3"
    // InternalHammilDSL.g:1944:1: rule__HeaderDepth3Expression__Group__3 : rule__HeaderDepth3Expression__Group__3__Impl ;
    public final void rule__HeaderDepth3Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1948:1: ( rule__HeaderDepth3Expression__Group__3__Impl )
            // InternalHammilDSL.g:1949:2: rule__HeaderDepth3Expression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__3__Impl();

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
    // $ANTLR end "rule__HeaderDepth3Expression__Group__3"


    // $ANTLR start "rule__HeaderDepth3Expression__Group__3__Impl"
    // InternalHammilDSL.g:1955:1: rule__HeaderDepth3Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth3Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1959:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1960:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1960:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1961:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:1962:2: ( RULE_BL )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_BL) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHammilDSL.g:1962:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__HeaderDepth3Expression__Group__3__Impl"


    // $ANTLR start "rule__HeaderDepth5Expression__Group__0"
    // InternalHammilDSL.g:1971:1: rule__HeaderDepth5Expression__Group__0 : rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 ;
    public final void rule__HeaderDepth5Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1975:1: ( rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 )
            // InternalHammilDSL.g:1976:2: rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__HeaderDepth5Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__1();

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
    // $ANTLR end "rule__HeaderDepth5Expression__Group__0"


    // $ANTLR start "rule__HeaderDepth5Expression__Group__0__Impl"
    // InternalHammilDSL.g:1983:1: rule__HeaderDepth5Expression__Group__0__Impl : ( '#####' ) ;
    public final void rule__HeaderDepth5Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1987:1: ( ( '#####' ) )
            // InternalHammilDSL.g:1988:1: ( '#####' )
            {
            // InternalHammilDSL.g:1988:1: ( '#####' )
            // InternalHammilDSL.g:1989:2: '#####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
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
    // $ANTLR end "rule__HeaderDepth5Expression__Group__0__Impl"


    // $ANTLR start "rule__HeaderDepth5Expression__Group__1"
    // InternalHammilDSL.g:1998:1: rule__HeaderDepth5Expression__Group__1 : rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 ;
    public final void rule__HeaderDepth5Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2002:1: ( rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 )
            // InternalHammilDSL.g:2003:2: rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth5Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__2();

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
    // $ANTLR end "rule__HeaderDepth5Expression__Group__1"


    // $ANTLR start "rule__HeaderDepth5Expression__Group__1__Impl"
    // InternalHammilDSL.g:2010:1: rule__HeaderDepth5Expression__Group__1__Impl : ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth5Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2014:1: ( ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:2015:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:2015:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:2016:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:2017:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:2017:3: rule__HeaderDepth5Expression__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__TitleAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleAssignment_1()); 
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
    // $ANTLR end "rule__HeaderDepth5Expression__Group__1__Impl"


    // $ANTLR start "rule__HeaderDepth5Expression__Group__2"
    // InternalHammilDSL.g:2025:1: rule__HeaderDepth5Expression__Group__2 : rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 ;
    public final void rule__HeaderDepth5Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2029:1: ( rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 )
            // InternalHammilDSL.g:2030:2: rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth5Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__3();

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
    // $ANTLR end "rule__HeaderDepth5Expression__Group__2"


    // $ANTLR start "rule__HeaderDepth5Expression__Group__2__Impl"
    // InternalHammilDSL.g:2037:1: rule__HeaderDepth5Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth5Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2041:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:2042:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:2042:1: ( ( '#' )* )
            // InternalHammilDSL.g:2043:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:2044:2: ( '#' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==EOF||(LA25_2>=RULE_STRING && LA25_2<=RULE_BL)||(LA25_2>=9 && LA25_2<=15)||(LA25_2>=17 && LA25_2<=21)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalHammilDSL.g:2044:3: '#'
            	    {
            	    match(input,15,FOLLOW_19); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2()); 
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
    // $ANTLR end "rule__HeaderDepth5Expression__Group__2__Impl"


    // $ANTLR start "rule__HeaderDepth5Expression__Group__3"
    // InternalHammilDSL.g:2052:1: rule__HeaderDepth5Expression__Group__3 : rule__HeaderDepth5Expression__Group__3__Impl ;
    public final void rule__HeaderDepth5Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2056:1: ( rule__HeaderDepth5Expression__Group__3__Impl )
            // InternalHammilDSL.g:2057:2: rule__HeaderDepth5Expression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__3__Impl();

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
    // $ANTLR end "rule__HeaderDepth5Expression__Group__3"


    // $ANTLR start "rule__HeaderDepth5Expression__Group__3__Impl"
    // InternalHammilDSL.g:2063:1: rule__HeaderDepth5Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth5Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2067:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:2068:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:2068:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:2069:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:2070:2: ( RULE_BL )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_BL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHammilDSL.g:2070:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__HeaderDepth5Expression__Group__3__Impl"


    // $ANTLR start "rule__HeaderDepth6Expression__Group__0"
    // InternalHammilDSL.g:2079:1: rule__HeaderDepth6Expression__Group__0 : rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 ;
    public final void rule__HeaderDepth6Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2083:1: ( rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 )
            // InternalHammilDSL.g:2084:2: rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__HeaderDepth6Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__1();

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
    // $ANTLR end "rule__HeaderDepth6Expression__Group__0"


    // $ANTLR start "rule__HeaderDepth6Expression__Group__0__Impl"
    // InternalHammilDSL.g:2091:1: rule__HeaderDepth6Expression__Group__0__Impl : ( '######' ) ;
    public final void rule__HeaderDepth6Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2095:1: ( ( '######' ) )
            // InternalHammilDSL.g:2096:1: ( '######' )
            {
            // InternalHammilDSL.g:2096:1: ( '######' )
            // InternalHammilDSL.g:2097:2: '######'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
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
    // $ANTLR end "rule__HeaderDepth6Expression__Group__0__Impl"


    // $ANTLR start "rule__HeaderDepth6Expression__Group__1"
    // InternalHammilDSL.g:2106:1: rule__HeaderDepth6Expression__Group__1 : rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 ;
    public final void rule__HeaderDepth6Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2110:1: ( rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 )
            // InternalHammilDSL.g:2111:2: rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth6Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__2();

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
    // $ANTLR end "rule__HeaderDepth6Expression__Group__1"


    // $ANTLR start "rule__HeaderDepth6Expression__Group__1__Impl"
    // InternalHammilDSL.g:2118:1: rule__HeaderDepth6Expression__Group__1__Impl : ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth6Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2122:1: ( ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:2123:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:2123:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:2124:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:2125:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:2125:3: rule__HeaderDepth6Expression__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__TitleAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleAssignment_1()); 
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
    // $ANTLR end "rule__HeaderDepth6Expression__Group__1__Impl"


    // $ANTLR start "rule__HeaderDepth6Expression__Group__2"
    // InternalHammilDSL.g:2133:1: rule__HeaderDepth6Expression__Group__2 : rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 ;
    public final void rule__HeaderDepth6Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2137:1: ( rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 )
            // InternalHammilDSL.g:2138:2: rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth6Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__3();

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
    // $ANTLR end "rule__HeaderDepth6Expression__Group__2"


    // $ANTLR start "rule__HeaderDepth6Expression__Group__2__Impl"
    // InternalHammilDSL.g:2145:1: rule__HeaderDepth6Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth6Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2149:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:2150:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:2150:1: ( ( '#' )* )
            // InternalHammilDSL.g:2151:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:2152:2: ( '#' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==EOF||(LA27_2>=RULE_STRING && LA27_2<=RULE_BL)||(LA27_2>=9 && LA27_2<=15)||(LA27_2>=17 && LA27_2<=21)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalHammilDSL.g:2152:3: '#'
            	    {
            	    match(input,15,FOLLOW_19); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2()); 
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
    // $ANTLR end "rule__HeaderDepth6Expression__Group__2__Impl"


    // $ANTLR start "rule__HeaderDepth6Expression__Group__3"
    // InternalHammilDSL.g:2160:1: rule__HeaderDepth6Expression__Group__3 : rule__HeaderDepth6Expression__Group__3__Impl ;
    public final void rule__HeaderDepth6Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2164:1: ( rule__HeaderDepth6Expression__Group__3__Impl )
            // InternalHammilDSL.g:2165:2: rule__HeaderDepth6Expression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__3__Impl();

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
    // $ANTLR end "rule__HeaderDepth6Expression__Group__3"


    // $ANTLR start "rule__HeaderDepth6Expression__Group__3__Impl"
    // InternalHammilDSL.g:2171:1: rule__HeaderDepth6Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth6Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2175:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:2176:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:2176:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:2177:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:2178:2: ( RULE_BL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_BL) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalHammilDSL.g:2178:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__HeaderDepth6Expression__Group__3__Impl"


    // $ANTLR start "rule__HeaderDepth4Expression__Group__0"
    // InternalHammilDSL.g:2187:1: rule__HeaderDepth4Expression__Group__0 : rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 ;
    public final void rule__HeaderDepth4Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2191:1: ( rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 )
            // InternalHammilDSL.g:2192:2: rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__HeaderDepth4Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__1();

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
    // $ANTLR end "rule__HeaderDepth4Expression__Group__0"


    // $ANTLR start "rule__HeaderDepth4Expression__Group__0__Impl"
    // InternalHammilDSL.g:2199:1: rule__HeaderDepth4Expression__Group__0__Impl : ( '####' ) ;
    public final void rule__HeaderDepth4Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2203:1: ( ( '####' ) )
            // InternalHammilDSL.g:2204:1: ( '####' )
            {
            // InternalHammilDSL.g:2204:1: ( '####' )
            // InternalHammilDSL.g:2205:2: '####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
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
    // $ANTLR end "rule__HeaderDepth4Expression__Group__0__Impl"


    // $ANTLR start "rule__HeaderDepth4Expression__Group__1"
    // InternalHammilDSL.g:2214:1: rule__HeaderDepth4Expression__Group__1 : rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 ;
    public final void rule__HeaderDepth4Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2218:1: ( rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 )
            // InternalHammilDSL.g:2219:2: rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth4Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__2();

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
    // $ANTLR end "rule__HeaderDepth4Expression__Group__1"


    // $ANTLR start "rule__HeaderDepth4Expression__Group__1__Impl"
    // InternalHammilDSL.g:2226:1: rule__HeaderDepth4Expression__Group__1__Impl : ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth4Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2230:1: ( ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:2231:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:2231:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:2232:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:2233:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:2233:3: rule__HeaderDepth4Expression__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__TitleAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleAssignment_1()); 
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
    // $ANTLR end "rule__HeaderDepth4Expression__Group__1__Impl"


    // $ANTLR start "rule__HeaderDepth4Expression__Group__2"
    // InternalHammilDSL.g:2241:1: rule__HeaderDepth4Expression__Group__2 : rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 ;
    public final void rule__HeaderDepth4Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2245:1: ( rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 )
            // InternalHammilDSL.g:2246:2: rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__HeaderDepth4Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__3();

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
    // $ANTLR end "rule__HeaderDepth4Expression__Group__2"


    // $ANTLR start "rule__HeaderDepth4Expression__Group__2__Impl"
    // InternalHammilDSL.g:2253:1: rule__HeaderDepth4Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth4Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2257:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:2258:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:2258:1: ( ( '#' )* )
            // InternalHammilDSL.g:2259:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:2260:2: ( '#' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==EOF||(LA29_2>=RULE_STRING && LA29_2<=RULE_BL)||(LA29_2>=9 && LA29_2<=15)||(LA29_2>=17 && LA29_2<=21)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalHammilDSL.g:2260:3: '#'
            	    {
            	    match(input,15,FOLLOW_19); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2()); 
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
    // $ANTLR end "rule__HeaderDepth4Expression__Group__2__Impl"


    // $ANTLR start "rule__HeaderDepth4Expression__Group__3"
    // InternalHammilDSL.g:2268:1: rule__HeaderDepth4Expression__Group__3 : rule__HeaderDepth4Expression__Group__3__Impl ;
    public final void rule__HeaderDepth4Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2272:1: ( rule__HeaderDepth4Expression__Group__3__Impl )
            // InternalHammilDSL.g:2273:2: rule__HeaderDepth4Expression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__3__Impl();

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
    // $ANTLR end "rule__HeaderDepth4Expression__Group__3"


    // $ANTLR start "rule__HeaderDepth4Expression__Group__3__Impl"
    // InternalHammilDSL.g:2279:1: rule__HeaderDepth4Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth4Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2283:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:2284:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:2284:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:2285:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:2286:2: ( RULE_BL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_BL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHammilDSL.g:2286:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__HeaderDepth4Expression__Group__3__Impl"


    // $ANTLR start "rule__File__ExpressionAssignment_1"
    // InternalHammilDSL.g:2295:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2299:1: ( ( ruleExpression ) )
            // InternalHammilDSL.g:2300:2: ( ruleExpression )
            {
            // InternalHammilDSL.g:2300:2: ( ruleExpression )
            // InternalHammilDSL.g:2301:3: ruleExpression
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


    // $ANTLR start "rule__QuoteExpression__TextexpressionAssignment_1"
    // InternalHammilDSL.g:2310:1: rule__QuoteExpression__TextexpressionAssignment_1 : ( ruleTextExpression ) ;
    public final void rule__QuoteExpression__TextexpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2314:1: ( ( ruleTextExpression ) )
            // InternalHammilDSL.g:2315:2: ( ruleTextExpression )
            {
            // InternalHammilDSL.g:2315:2: ( ruleTextExpression )
            // InternalHammilDSL.g:2316:3: ruleTextExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getTextexpressionTextExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getTextexpressionTextExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__QuoteExpression__TextexpressionAssignment_1"


    // $ANTLR start "rule__CodeExpression__TextAssignment_0_1"
    // InternalHammilDSL.g:2325:1: rule__CodeExpression__TextAssignment_0_1 : ( ruleString0 ) ;
    public final void rule__CodeExpression__TextAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2329:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:2330:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:2330:2: ( ruleString0 )
            // InternalHammilDSL.g:2331:3: ruleString0
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getTextString0ParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getTextString0ParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__CodeExpression__TextAssignment_0_1"


    // $ANTLR start "rule__CodeExpression__TextAssignment_1_2"
    // InternalHammilDSL.g:2340:1: rule__CodeExpression__TextAssignment_1_2 : ( ruleString0 ) ;
    public final void rule__CodeExpression__TextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2344:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:2345:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:2345:2: ( ruleString0 )
            // InternalHammilDSL.g:2346:3: ruleString0
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getTextString0ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeExpressionAccess().getTextString0ParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__CodeExpression__TextAssignment_1_2"


    // $ANTLR start "rule__HeaderDepth1Expression__TitleAssignment_0_2"
    // InternalHammilDSL.g:2355:1: rule__HeaderDepth1Expression__TitleAssignment_0_2 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2359:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2360:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2360:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2361:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__HeaderDepth1Expression__TitleAssignment_0_2"


    // $ANTLR start "rule__HeaderDepth1Expression__TitleAssignment_1_0"
    // InternalHammilDSL.g:2370:1: rule__HeaderDepth1Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2374:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2375:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2375:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2376:3: ruleEmphasisExpression
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


    // $ANTLR start "rule__HeaderDepth2Expression__TitleAssignment_0_1"
    // InternalHammilDSL.g:2385:1: rule__HeaderDepth2Expression__TitleAssignment_0_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2389:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2390:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2390:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2391:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__TitleAssignment_0_1"


    // $ANTLR start "rule__HeaderDepth2Expression__TitleAssignment_1_0"
    // InternalHammilDSL.g:2400:1: rule__HeaderDepth2Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2404:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2405:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2405:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2406:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__HeaderDepth2Expression__TitleAssignment_1_0"


    // $ANTLR start "rule__HeaderDepth3Expression__TitleAssignment_1"
    // InternalHammilDSL.g:2415:1: rule__HeaderDepth3Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth3Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2419:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2420:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2420:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2421:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__HeaderDepth3Expression__TitleAssignment_1"


    // $ANTLR start "rule__HeaderDepth5Expression__TitleAssignment_1"
    // InternalHammilDSL.g:2430:1: rule__HeaderDepth5Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth5Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2434:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2435:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2435:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2436:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__HeaderDepth5Expression__TitleAssignment_1"


    // $ANTLR start "rule__HeaderDepth6Expression__TitleAssignment_1"
    // InternalHammilDSL.g:2445:1: rule__HeaderDepth6Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth6Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2449:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2450:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2450:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2451:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__HeaderDepth6Expression__TitleAssignment_1"


    // $ANTLR start "rule__HeaderDepth4Expression__TitleAssignment_1"
    // InternalHammilDSL.g:2460:1: rule__HeaderDepth4Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth4Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2464:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2465:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2465:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2466:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__HeaderDepth4Expression__TitleAssignment_1"


    // $ANTLR start "rule__TextualExpression__ContentStringAssignment"
    // InternalHammilDSL.g:2475:1: rule__TextualExpression__ContentStringAssignment : ( ruleString0 ) ;
    public final void rule__TextualExpression__ContentStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2479:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:2480:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:2480:2: ( ruleString0 )
            // InternalHammilDSL.g:2481:3: ruleString0
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

    // $ANTLR start synpred21_InternalHammilDSL
    public final void synpred21_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:1463:3: ( '#' )
        // InternalHammilDSL.g:1463:3: '#'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalHammilDSL

    // $ANTLR start synpred28_InternalHammilDSL
    public final void synpred28_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:1827:4: ( '-' )
        // InternalHammilDSL.g:1827:4: '-'
        {
        match(input,9,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalHammilDSL

    // Delegated rules

    public final boolean synpred21_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\1\1\uffff\2\4\2\uffff\1\4";
    static final String dfa_3s = "\1\4\1\uffff\2\4\1\uffff\1\0\1\4";
    static final String dfa_4s = "\1\25\1\uffff\2\25\1\uffff\1\0\1\25";
    static final String dfa_5s = "\1\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String dfa_6s = "\5\uffff\1\0\1\uffff}>";
    static final String[] dfa_7s = {
            "\3\1\2\uffff\6\1\1\2\1\uffff\5\1",
            "",
            "\2\4\1\3\2\uffff\7\4\1\uffff\5\4",
            "\1\5\1\4\1\6\2\uffff\7\4\1\uffff\5\4",
            "",
            "\1\uffff",
            "\1\5\1\4\1\6\2\uffff\7\4\1\uffff\5\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1463:2: ( '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalHammilDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003EFE10L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003EFE12L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000009E10L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008020L});

}