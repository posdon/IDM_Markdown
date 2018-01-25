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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BL", "RULE_S", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'>'", "'`'", "'```'", "'#'", "'='", "'##'", "'-'", "'###'", "'#####'", "'######'", "'####'"
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


    // $ANTLR start "entryRuleQuoteExpression"
    // InternalHammilDSL.g:170:1: entryRuleQuoteExpression : ruleQuoteExpression EOF ;
    public final void entryRuleQuoteExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:171:1: ( ruleQuoteExpression EOF )
            // InternalHammilDSL.g:172:1: ruleQuoteExpression EOF
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
    // InternalHammilDSL.g:179:1: ruleQuoteExpression : ( ( rule__QuoteExpression__Group__0 ) ) ;
    public final void ruleQuoteExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:183:2: ( ( ( rule__QuoteExpression__Group__0 ) ) )
            // InternalHammilDSL.g:184:2: ( ( rule__QuoteExpression__Group__0 ) )
            {
            // InternalHammilDSL.g:184:2: ( ( rule__QuoteExpression__Group__0 ) )
            // InternalHammilDSL.g:185:3: ( rule__QuoteExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:186:3: ( rule__QuoteExpression__Group__0 )
            // InternalHammilDSL.g:186:4: rule__QuoteExpression__Group__0
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
    // InternalHammilDSL.g:195:1: entryRuleCodeExpression : ruleCodeExpression EOF ;
    public final void entryRuleCodeExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:196:1: ( ruleCodeExpression EOF )
            // InternalHammilDSL.g:197:1: ruleCodeExpression EOF
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
    // InternalHammilDSL.g:204:1: ruleCodeExpression : ( ( rule__CodeExpression__Alternatives ) ) ;
    public final void ruleCodeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:208:2: ( ( ( rule__CodeExpression__Alternatives ) ) )
            // InternalHammilDSL.g:209:2: ( ( rule__CodeExpression__Alternatives ) )
            {
            // InternalHammilDSL.g:209:2: ( ( rule__CodeExpression__Alternatives ) )
            // InternalHammilDSL.g:210:3: ( rule__CodeExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:211:3: ( rule__CodeExpression__Alternatives )
            // InternalHammilDSL.g:211:4: rule__CodeExpression__Alternatives
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
    // InternalHammilDSL.g:220:1: entryRuleHeaderDepth1Expression : ruleHeaderDepth1Expression EOF ;
    public final void entryRuleHeaderDepth1Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:221:1: ( ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:222:1: ruleHeaderDepth1Expression EOF
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
    // InternalHammilDSL.g:229:1: ruleHeaderDepth1Expression : ( ( rule__HeaderDepth1Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth1Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:233:2: ( ( ( rule__HeaderDepth1Expression__Alternatives ) ) )
            // InternalHammilDSL.g:234:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:234:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            // InternalHammilDSL.g:235:3: ( rule__HeaderDepth1Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:236:3: ( rule__HeaderDepth1Expression__Alternatives )
            // InternalHammilDSL.g:236:4: rule__HeaderDepth1Expression__Alternatives
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
    // InternalHammilDSL.g:245:1: entryRuleHeaderDepth2Expression : ruleHeaderDepth2Expression EOF ;
    public final void entryRuleHeaderDepth2Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:246:1: ( ruleHeaderDepth2Expression EOF )
            // InternalHammilDSL.g:247:1: ruleHeaderDepth2Expression EOF
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
    // InternalHammilDSL.g:254:1: ruleHeaderDepth2Expression : ( ( rule__HeaderDepth2Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth2Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:258:2: ( ( ( rule__HeaderDepth2Expression__Alternatives ) ) )
            // InternalHammilDSL.g:259:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:259:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            // InternalHammilDSL.g:260:3: ( rule__HeaderDepth2Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:261:3: ( rule__HeaderDepth2Expression__Alternatives )
            // InternalHammilDSL.g:261:4: rule__HeaderDepth2Expression__Alternatives
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
    // InternalHammilDSL.g:270:1: entryRuleHeaderDepth3Expression : ruleHeaderDepth3Expression EOF ;
    public final void entryRuleHeaderDepth3Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:271:1: ( ruleHeaderDepth3Expression EOF )
            // InternalHammilDSL.g:272:1: ruleHeaderDepth3Expression EOF
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
    // InternalHammilDSL.g:279:1: ruleHeaderDepth3Expression : ( ( rule__HeaderDepth3Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth3Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:283:2: ( ( ( rule__HeaderDepth3Expression__Group__0 ) ) )
            // InternalHammilDSL.g:284:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:284:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            // InternalHammilDSL.g:285:3: ( rule__HeaderDepth3Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:286:3: ( rule__HeaderDepth3Expression__Group__0 )
            // InternalHammilDSL.g:286:4: rule__HeaderDepth3Expression__Group__0
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
    // InternalHammilDSL.g:295:1: entryRuleHeaderDepth5Expression : ruleHeaderDepth5Expression EOF ;
    public final void entryRuleHeaderDepth5Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:296:1: ( ruleHeaderDepth5Expression EOF )
            // InternalHammilDSL.g:297:1: ruleHeaderDepth5Expression EOF
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
    // InternalHammilDSL.g:304:1: ruleHeaderDepth5Expression : ( ( rule__HeaderDepth5Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth5Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:308:2: ( ( ( rule__HeaderDepth5Expression__Group__0 ) ) )
            // InternalHammilDSL.g:309:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:309:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            // InternalHammilDSL.g:310:3: ( rule__HeaderDepth5Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:311:3: ( rule__HeaderDepth5Expression__Group__0 )
            // InternalHammilDSL.g:311:4: rule__HeaderDepth5Expression__Group__0
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
    // InternalHammilDSL.g:320:1: entryRuleHeaderDepth6Expression : ruleHeaderDepth6Expression EOF ;
    public final void entryRuleHeaderDepth6Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:321:1: ( ruleHeaderDepth6Expression EOF )
            // InternalHammilDSL.g:322:1: ruleHeaderDepth6Expression EOF
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
    // InternalHammilDSL.g:329:1: ruleHeaderDepth6Expression : ( ( rule__HeaderDepth6Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth6Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:333:2: ( ( ( rule__HeaderDepth6Expression__Group__0 ) ) )
            // InternalHammilDSL.g:334:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:334:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            // InternalHammilDSL.g:335:3: ( rule__HeaderDepth6Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:336:3: ( rule__HeaderDepth6Expression__Group__0 )
            // InternalHammilDSL.g:336:4: rule__HeaderDepth6Expression__Group__0
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
    // InternalHammilDSL.g:345:1: entryRuleHeaderDepth4Expression : ruleHeaderDepth4Expression EOF ;
    public final void entryRuleHeaderDepth4Expression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:346:1: ( ruleHeaderDepth4Expression EOF )
            // InternalHammilDSL.g:347:1: ruleHeaderDepth4Expression EOF
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
    // InternalHammilDSL.g:354:1: ruleHeaderDepth4Expression : ( ( rule__HeaderDepth4Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth4Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:358:2: ( ( ( rule__HeaderDepth4Expression__Group__0 ) ) )
            // InternalHammilDSL.g:359:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:359:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            // InternalHammilDSL.g:360:3: ( rule__HeaderDepth4Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:361:3: ( rule__HeaderDepth4Expression__Group__0 )
            // InternalHammilDSL.g:361:4: rule__HeaderDepth4Expression__Group__0
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
    // InternalHammilDSL.g:370:1: entryRuleTextualExpression : ruleTextualExpression EOF ;
    public final void entryRuleTextualExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:371:1: ( ruleTextualExpression EOF )
            // InternalHammilDSL.g:372:1: ruleTextualExpression EOF
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
    // InternalHammilDSL.g:379:1: ruleTextualExpression : ( ( rule__TextualExpression__ContentStringAssignment ) ) ;
    public final void ruleTextualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:383:2: ( ( ( rule__TextualExpression__ContentStringAssignment ) ) )
            // InternalHammilDSL.g:384:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            {
            // InternalHammilDSL.g:384:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            // InternalHammilDSL.g:385:3: ( rule__TextualExpression__ContentStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); 
            }
            // InternalHammilDSL.g:386:3: ( rule__TextualExpression__ContentStringAssignment )
            // InternalHammilDSL.g:386:4: rule__TextualExpression__ContentStringAssignment
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
    // InternalHammilDSL.g:395:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalHammilDSL.g:396:1: ( ruleString0 EOF )
            // InternalHammilDSL.g:397:1: ruleString0 EOF
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
    // InternalHammilDSL.g:404:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:408:2: ( ( RULE_STRING ) )
            // InternalHammilDSL.g:409:2: ( RULE_STRING )
            {
            // InternalHammilDSL.g:409:2: ( RULE_STRING )
            // InternalHammilDSL.g:410:3: RULE_STRING
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
    // InternalHammilDSL.g:419:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Alternatives_0 ) ) | ( ruleTextExpression ) | ( ruleCodeExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:423:1: ( ( ( rule__Expression__Alternatives_0 ) ) | ( ruleTextExpression ) | ( ruleCodeExpression ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||LA1_2==RULE_STRING||(LA1_2>=9 && LA1_2<=12)||LA1_2==14||(LA1_2>=16 && LA1_2<=19)) ) {
                    alt1=2;
                }
                else if ( (LA1_2==RULE_BL) ) {
                    alt1=1;
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
                {
                alt1=2;
                }
                break;
            case 10:
            case 11:
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
                    // InternalHammilDSL.g:424:2: ( ( rule__Expression__Alternatives_0 ) )
                    {
                    // InternalHammilDSL.g:424:2: ( ( rule__Expression__Alternatives_0 ) )
                    // InternalHammilDSL.g:425:3: ( rule__Expression__Alternatives_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getAlternatives_0()); 
                    }
                    // InternalHammilDSL.g:426:3: ( rule__Expression__Alternatives_0 )
                    // InternalHammilDSL.g:426:4: rule__Expression__Alternatives_0
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
                    // InternalHammilDSL.g:430:2: ( ruleTextExpression )
                    {
                    // InternalHammilDSL.g:430:2: ( ruleTextExpression )
                    // InternalHammilDSL.g:431:3: ruleTextExpression
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
                    // InternalHammilDSL.g:436:2: ( ruleCodeExpression )
                    {
                    // InternalHammilDSL.g:436:2: ( ruleCodeExpression )
                    // InternalHammilDSL.g:437:3: ruleCodeExpression
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
    // InternalHammilDSL.g:446:1: rule__Expression__Alternatives_0 : ( ( ( ruleHeaderDepth1Expression ) ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) );
    public final void rule__Expression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:450:1: ( ( ( ruleHeaderDepth1Expression ) ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_BL) ) {
                    int LA2_8 = input.LA(3);

                    if ( (LA2_8==13) ) {
                        alt2=1;
                    }
                    else if ( (LA2_8==15) ) {
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
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
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
                    // InternalHammilDSL.g:451:2: ( ( ruleHeaderDepth1Expression ) )
                    {
                    // InternalHammilDSL.g:451:2: ( ( ruleHeaderDepth1Expression ) )
                    // InternalHammilDSL.g:452:3: ( ruleHeaderDepth1Expression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0_0()); 
                    }
                    // InternalHammilDSL.g:453:3: ( ruleHeaderDepth1Expression )
                    // InternalHammilDSL.g:453:4: ruleHeaderDepth1Expression
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
                    // InternalHammilDSL.g:457:2: ( ruleHeaderDepth2Expression )
                    {
                    // InternalHammilDSL.g:457:2: ( ruleHeaderDepth2Expression )
                    // InternalHammilDSL.g:458:3: ruleHeaderDepth2Expression
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
                    // InternalHammilDSL.g:463:2: ( ruleHeaderDepth3Expression )
                    {
                    // InternalHammilDSL.g:463:2: ( ruleHeaderDepth3Expression )
                    // InternalHammilDSL.g:464:3: ruleHeaderDepth3Expression
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
                    // InternalHammilDSL.g:469:2: ( ruleHeaderDepth4Expression )
                    {
                    // InternalHammilDSL.g:469:2: ( ruleHeaderDepth4Expression )
                    // InternalHammilDSL.g:470:3: ruleHeaderDepth4Expression
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
                    // InternalHammilDSL.g:475:2: ( ruleHeaderDepth5Expression )
                    {
                    // InternalHammilDSL.g:475:2: ( ruleHeaderDepth5Expression )
                    // InternalHammilDSL.g:476:3: ruleHeaderDepth5Expression
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
                    // InternalHammilDSL.g:481:2: ( ruleHeaderDepth6Expression )
                    {
                    // InternalHammilDSL.g:481:2: ( ruleHeaderDepth6Expression )
                    // InternalHammilDSL.g:482:3: ruleHeaderDepth6Expression
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
    // InternalHammilDSL.g:491:1: rule__TextExpression__Alternatives : ( ( ruleQuoteExpression ) | ( ruleTextualExpression ) );
    public final void rule__TextExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:495:1: ( ( ruleQuoteExpression ) | ( ruleTextualExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==9) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHammilDSL.g:496:2: ( ruleQuoteExpression )
                    {
                    // InternalHammilDSL.g:496:2: ( ruleQuoteExpression )
                    // InternalHammilDSL.g:497:3: ruleQuoteExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleQuoteExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:502:2: ( ruleTextualExpression )
                    {
                    // InternalHammilDSL.g:502:2: ( ruleTextualExpression )
                    // InternalHammilDSL.g:503:3: ruleTextualExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTextualExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall_1()); 
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


    // $ANTLR start "rule__CodeExpression__Alternatives"
    // InternalHammilDSL.g:512:1: rule__CodeExpression__Alternatives : ( ( ( rule__CodeExpression__Group_0__0 ) ) | ( ( rule__CodeExpression__Group_1__0 ) ) );
    public final void rule__CodeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:516:1: ( ( ( rule__CodeExpression__Group_0__0 ) ) | ( ( rule__CodeExpression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==10) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHammilDSL.g:517:2: ( ( rule__CodeExpression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:517:2: ( ( rule__CodeExpression__Group_0__0 ) )
                    // InternalHammilDSL.g:518:3: ( rule__CodeExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCodeExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:519:3: ( rule__CodeExpression__Group_0__0 )
                    // InternalHammilDSL.g:519:4: rule__CodeExpression__Group_0__0
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
                    // InternalHammilDSL.g:523:2: ( ( rule__CodeExpression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:523:2: ( ( rule__CodeExpression__Group_1__0 ) )
                    // InternalHammilDSL.g:524:3: ( rule__CodeExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCodeExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:525:3: ( rule__CodeExpression__Group_1__0 )
                    // InternalHammilDSL.g:525:4: rule__CodeExpression__Group_1__0
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
    // InternalHammilDSL.g:533:1: rule__HeaderDepth1Expression__Alternatives : ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth1Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:537:1: ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
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
                    // InternalHammilDSL.g:538:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:538:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:539:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:540:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    // InternalHammilDSL.g:540:4: rule__HeaderDepth1Expression__Group_0__0
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
                    // InternalHammilDSL.g:544:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:544:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:545:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:546:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    // InternalHammilDSL.g:546:4: rule__HeaderDepth1Expression__Group_1__0
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
    // InternalHammilDSL.g:554:1: rule__HeaderDepth2Expression__Alternatives : ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth2Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:558:1: ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
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
                    // InternalHammilDSL.g:559:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:559:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:560:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:561:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    // InternalHammilDSL.g:561:4: rule__HeaderDepth2Expression__Group_0__0
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
                    // InternalHammilDSL.g:565:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:565:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:566:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:567:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    // InternalHammilDSL.g:567:4: rule__HeaderDepth2Expression__Group_1__0
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
    // InternalHammilDSL.g:575:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:579:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalHammilDSL.g:580:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalHammilDSL.g:587:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:591:1: ( ( () ) )
            // InternalHammilDSL.g:592:1: ( () )
            {
            // InternalHammilDSL.g:592:1: ( () )
            // InternalHammilDSL.g:593:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalHammilDSL.g:594:2: ()
            // InternalHammilDSL.g:594:3: 
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
    // InternalHammilDSL.g:602:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:606:1: ( rule__File__Group__1__Impl )
            // InternalHammilDSL.g:607:2: rule__File__Group__1__Impl
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
    // InternalHammilDSL.g:613:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:617:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalHammilDSL.g:618:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalHammilDSL.g:618:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalHammilDSL.g:619:2: ( rule__File__ExpressionAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            }
            // InternalHammilDSL.g:620:2: ( rule__File__ExpressionAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||(LA7_0>=9 && LA7_0<=12)||LA7_0==14||(LA7_0>=16 && LA7_0<=19)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHammilDSL.g:620:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "rule__QuoteExpression__Group__0"
    // InternalHammilDSL.g:629:1: rule__QuoteExpression__Group__0 : rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 ;
    public final void rule__QuoteExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:633:1: ( rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 )
            // InternalHammilDSL.g:634:2: rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:641:1: rule__QuoteExpression__Group__0__Impl : ( '>' ) ;
    public final void rule__QuoteExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:645:1: ( ( '>' ) )
            // InternalHammilDSL.g:646:1: ( '>' )
            {
            // InternalHammilDSL.g:646:1: ( '>' )
            // InternalHammilDSL.g:647:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_0()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:656:1: rule__QuoteExpression__Group__1 : rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 ;
    public final void rule__QuoteExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:660:1: ( rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 )
            // InternalHammilDSL.g:661:2: rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2
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
    // InternalHammilDSL.g:668:1: rule__QuoteExpression__Group__1__Impl : ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) ) ;
    public final void rule__QuoteExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:672:1: ( ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) ) )
            // InternalHammilDSL.g:673:1: ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) )
            {
            // InternalHammilDSL.g:673:1: ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) )
            // InternalHammilDSL.g:674:2: ( rule__QuoteExpression__TextexpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getTextexpressionAssignment_1()); 
            }
            // InternalHammilDSL.g:675:2: ( rule__QuoteExpression__TextexpressionAssignment_1 )
            // InternalHammilDSL.g:675:3: rule__QuoteExpression__TextexpressionAssignment_1
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
    // InternalHammilDSL.g:683:1: rule__QuoteExpression__Group__2 : rule__QuoteExpression__Group__2__Impl ;
    public final void rule__QuoteExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:687:1: ( rule__QuoteExpression__Group__2__Impl )
            // InternalHammilDSL.g:688:2: rule__QuoteExpression__Group__2__Impl
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
    // InternalHammilDSL.g:694:1: rule__QuoteExpression__Group__2__Impl : ( RULE_BL ) ;
    public final void rule__QuoteExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:698:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:699:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:699:1: ( RULE_BL )
            // InternalHammilDSL.g:700:2: RULE_BL
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
    // InternalHammilDSL.g:710:1: rule__CodeExpression__Group_0__0 : rule__CodeExpression__Group_0__0__Impl rule__CodeExpression__Group_0__1 ;
    public final void rule__CodeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:714:1: ( rule__CodeExpression__Group_0__0__Impl rule__CodeExpression__Group_0__1 )
            // InternalHammilDSL.g:715:2: rule__CodeExpression__Group_0__0__Impl rule__CodeExpression__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHammilDSL.g:722:1: rule__CodeExpression__Group_0__0__Impl : ( '`' ) ;
    public final void rule__CodeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:726:1: ( ( '`' ) )
            // InternalHammilDSL.g:727:1: ( '`' )
            {
            // InternalHammilDSL.g:727:1: ( '`' )
            // InternalHammilDSL.g:728:2: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getGraveAccentKeyword_0_0()); 
            }
            match(input,10,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:737:1: rule__CodeExpression__Group_0__1 : rule__CodeExpression__Group_0__1__Impl rule__CodeExpression__Group_0__2 ;
    public final void rule__CodeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:741:1: ( rule__CodeExpression__Group_0__1__Impl rule__CodeExpression__Group_0__2 )
            // InternalHammilDSL.g:742:2: rule__CodeExpression__Group_0__1__Impl rule__CodeExpression__Group_0__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalHammilDSL.g:749:1: rule__CodeExpression__Group_0__1__Impl : ( ( rule__CodeExpression__TextAssignment_0_1 ) ) ;
    public final void rule__CodeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:753:1: ( ( ( rule__CodeExpression__TextAssignment_0_1 ) ) )
            // InternalHammilDSL.g:754:1: ( ( rule__CodeExpression__TextAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:754:1: ( ( rule__CodeExpression__TextAssignment_0_1 ) )
            // InternalHammilDSL.g:755:2: ( rule__CodeExpression__TextAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getTextAssignment_0_1()); 
            }
            // InternalHammilDSL.g:756:2: ( rule__CodeExpression__TextAssignment_0_1 )
            // InternalHammilDSL.g:756:3: rule__CodeExpression__TextAssignment_0_1
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
    // InternalHammilDSL.g:764:1: rule__CodeExpression__Group_0__2 : rule__CodeExpression__Group_0__2__Impl ;
    public final void rule__CodeExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:768:1: ( rule__CodeExpression__Group_0__2__Impl )
            // InternalHammilDSL.g:769:2: rule__CodeExpression__Group_0__2__Impl
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
    // InternalHammilDSL.g:775:1: rule__CodeExpression__Group_0__2__Impl : ( '`' ) ;
    public final void rule__CodeExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:779:1: ( ( '`' ) )
            // InternalHammilDSL.g:780:1: ( '`' )
            {
            // InternalHammilDSL.g:780:1: ( '`' )
            // InternalHammilDSL.g:781:2: '`'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getGraveAccentKeyword_0_2()); 
            }
            match(input,10,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:791:1: rule__CodeExpression__Group_1__0 : rule__CodeExpression__Group_1__0__Impl rule__CodeExpression__Group_1__1 ;
    public final void rule__CodeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:795:1: ( rule__CodeExpression__Group_1__0__Impl rule__CodeExpression__Group_1__1 )
            // InternalHammilDSL.g:796:2: rule__CodeExpression__Group_1__0__Impl rule__CodeExpression__Group_1__1
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
    // InternalHammilDSL.g:803:1: rule__CodeExpression__Group_1__0__Impl : ( '```' ) ;
    public final void rule__CodeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:807:1: ( ( '```' ) )
            // InternalHammilDSL.g:808:1: ( '```' )
            {
            // InternalHammilDSL.g:808:1: ( '```' )
            // InternalHammilDSL.g:809:2: '```'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getGraveAccentGraveAccentGraveAccentKeyword_1_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:818:1: rule__CodeExpression__Group_1__1 : rule__CodeExpression__Group_1__1__Impl rule__CodeExpression__Group_1__2 ;
    public final void rule__CodeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:822:1: ( rule__CodeExpression__Group_1__1__Impl rule__CodeExpression__Group_1__2 )
            // InternalHammilDSL.g:823:2: rule__CodeExpression__Group_1__1__Impl rule__CodeExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalHammilDSL.g:830:1: rule__CodeExpression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__CodeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:834:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:835:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:835:1: ( RULE_BL )
            // InternalHammilDSL.g:836:2: RULE_BL
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
    // InternalHammilDSL.g:845:1: rule__CodeExpression__Group_1__2 : rule__CodeExpression__Group_1__2__Impl rule__CodeExpression__Group_1__3 ;
    public final void rule__CodeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:849:1: ( rule__CodeExpression__Group_1__2__Impl rule__CodeExpression__Group_1__3 )
            // InternalHammilDSL.g:850:2: rule__CodeExpression__Group_1__2__Impl rule__CodeExpression__Group_1__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalHammilDSL.g:857:1: rule__CodeExpression__Group_1__2__Impl : ( ( rule__CodeExpression__TextAssignment_1_2 ) ) ;
    public final void rule__CodeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:861:1: ( ( ( rule__CodeExpression__TextAssignment_1_2 ) ) )
            // InternalHammilDSL.g:862:1: ( ( rule__CodeExpression__TextAssignment_1_2 ) )
            {
            // InternalHammilDSL.g:862:1: ( ( rule__CodeExpression__TextAssignment_1_2 ) )
            // InternalHammilDSL.g:863:2: ( rule__CodeExpression__TextAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getTextAssignment_1_2()); 
            }
            // InternalHammilDSL.g:864:2: ( rule__CodeExpression__TextAssignment_1_2 )
            // InternalHammilDSL.g:864:3: rule__CodeExpression__TextAssignment_1_2
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
    // InternalHammilDSL.g:872:1: rule__CodeExpression__Group_1__3 : rule__CodeExpression__Group_1__3__Impl rule__CodeExpression__Group_1__4 ;
    public final void rule__CodeExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:876:1: ( rule__CodeExpression__Group_1__3__Impl rule__CodeExpression__Group_1__4 )
            // InternalHammilDSL.g:877:2: rule__CodeExpression__Group_1__3__Impl rule__CodeExpression__Group_1__4
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
    // InternalHammilDSL.g:884:1: rule__CodeExpression__Group_1__3__Impl : ( '```' ) ;
    public final void rule__CodeExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:888:1: ( ( '```' ) )
            // InternalHammilDSL.g:889:1: ( '```' )
            {
            // InternalHammilDSL.g:889:1: ( '```' )
            // InternalHammilDSL.g:890:2: '```'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getGraveAccentGraveAccentGraveAccentKeyword_1_3()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:899:1: rule__CodeExpression__Group_1__4 : rule__CodeExpression__Group_1__4__Impl ;
    public final void rule__CodeExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:903:1: ( rule__CodeExpression__Group_1__4__Impl )
            // InternalHammilDSL.g:904:2: rule__CodeExpression__Group_1__4__Impl
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
    // InternalHammilDSL.g:910:1: rule__CodeExpression__Group_1__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__CodeExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:914:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:915:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:915:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:916:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeExpressionAccess().getBLTerminalRuleCall_1_4()); 
            }
            // InternalHammilDSL.g:917:2: ( RULE_BL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_BL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHammilDSL.g:917:3: RULE_BL
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
    // InternalHammilDSL.g:926:1: rule__HeaderDepth1Expression__Group_0__0 : rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 ;
    public final void rule__HeaderDepth1Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:930:1: ( rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 )
            // InternalHammilDSL.g:931:2: rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalHammilDSL.g:938:1: rule__HeaderDepth1Expression__Group_0__0__Impl : ( ( '#' ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:942:1: ( ( ( '#' ) ) )
            // InternalHammilDSL.g:943:1: ( ( '#' ) )
            {
            // InternalHammilDSL.g:943:1: ( ( '#' ) )
            // InternalHammilDSL.g:944:2: ( '#' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0()); 
            }
            // InternalHammilDSL.g:945:2: ( '#' )
            // InternalHammilDSL.g:945:3: '#'
            {
            match(input,12,FOLLOW_2); if (state.failed) return ;

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
    // InternalHammilDSL.g:953:1: rule__HeaderDepth1Expression__Group_0__1 : rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 ;
    public final void rule__HeaderDepth1Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:957:1: ( rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 )
            // InternalHammilDSL.g:958:2: rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalHammilDSL.g:965:1: rule__HeaderDepth1Expression__Group_0__1__Impl : ( ( ( RULE_S ) ) ( ( RULE_S )* ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:969:1: ( ( ( ( RULE_S ) ) ( ( RULE_S )* ) ) )
            // InternalHammilDSL.g:970:1: ( ( ( RULE_S ) ) ( ( RULE_S )* ) )
            {
            // InternalHammilDSL.g:970:1: ( ( ( RULE_S ) ) ( ( RULE_S )* ) )
            // InternalHammilDSL.g:971:2: ( ( RULE_S ) ) ( ( RULE_S )* )
            {
            // InternalHammilDSL.g:971:2: ( ( RULE_S ) )
            // InternalHammilDSL.g:972:3: ( RULE_S )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_1()); 
            }
            // InternalHammilDSL.g:973:3: ( RULE_S )
            // InternalHammilDSL.g:973:4: RULE_S
            {
            match(input,RULE_S,FOLLOW_11); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_1()); 
            }

            }

            // InternalHammilDSL.g:976:2: ( ( RULE_S )* )
            // InternalHammilDSL.g:977:3: ( RULE_S )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_1()); 
            }
            // InternalHammilDSL.g:978:3: ( RULE_S )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_S) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHammilDSL.g:978:4: RULE_S
            	    {
            	    match(input,RULE_S,FOLLOW_11); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalHammilDSL.g:987:1: rule__HeaderDepth1Expression__Group_0__2 : rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 ;
    public final void rule__HeaderDepth1Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:991:1: ( rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 )
            // InternalHammilDSL.g:992:2: rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalHammilDSL.g:999:1: rule__HeaderDepth1Expression__Group_0__2__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_0_2 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1003:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_0_2 ) ) )
            // InternalHammilDSL.g:1004:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_2 ) )
            {
            // InternalHammilDSL.g:1004:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_2 ) )
            // InternalHammilDSL.g:1005:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_2()); 
            }
            // InternalHammilDSL.g:1006:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_2 )
            // InternalHammilDSL.g:1006:3: rule__HeaderDepth1Expression__TitleAssignment_0_2
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
    // InternalHammilDSL.g:1014:1: rule__HeaderDepth1Expression__Group_0__3 : rule__HeaderDepth1Expression__Group_0__3__Impl rule__HeaderDepth1Expression__Group_0__4 ;
    public final void rule__HeaderDepth1Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1018:1: ( rule__HeaderDepth1Expression__Group_0__3__Impl rule__HeaderDepth1Expression__Group_0__4 )
            // InternalHammilDSL.g:1019:2: rule__HeaderDepth1Expression__Group_0__3__Impl rule__HeaderDepth1Expression__Group_0__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalHammilDSL.g:1026:1: rule__HeaderDepth1Expression__Group_0__3__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth1Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1030:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1031:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1031:1: ( ( '#' )* )
            // InternalHammilDSL.g:1032:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_3()); 
            }
            // InternalHammilDSL.g:1033:2: ( '#' )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalHammilDSL.g:1033:3: '#'
            	    {
            	    match(input,12,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalHammilDSL.g:1041:1: rule__HeaderDepth1Expression__Group_0__4 : rule__HeaderDepth1Expression__Group_0__4__Impl rule__HeaderDepth1Expression__Group_0__5 ;
    public final void rule__HeaderDepth1Expression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1045:1: ( rule__HeaderDepth1Expression__Group_0__4__Impl rule__HeaderDepth1Expression__Group_0__5 )
            // InternalHammilDSL.g:1046:2: rule__HeaderDepth1Expression__Group_0__4__Impl rule__HeaderDepth1Expression__Group_0__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalHammilDSL.g:1053:1: rule__HeaderDepth1Expression__Group_0__4__Impl : ( ( RULE_S )* ) ;
    public final void rule__HeaderDepth1Expression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1057:1: ( ( ( RULE_S )* ) )
            // InternalHammilDSL.g:1058:1: ( ( RULE_S )* )
            {
            // InternalHammilDSL.g:1058:1: ( ( RULE_S )* )
            // InternalHammilDSL.g:1059:2: ( RULE_S )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_4()); 
            }
            // InternalHammilDSL.g:1060:2: ( RULE_S )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_S) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHammilDSL.g:1060:3: RULE_S
            	    {
            	    match(input,RULE_S,FOLLOW_11); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalHammilDSL.g:1068:1: rule__HeaderDepth1Expression__Group_0__5 : rule__HeaderDepth1Expression__Group_0__5__Impl ;
    public final void rule__HeaderDepth1Expression__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1072:1: ( rule__HeaderDepth1Expression__Group_0__5__Impl )
            // InternalHammilDSL.g:1073:2: rule__HeaderDepth1Expression__Group_0__5__Impl
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
    // InternalHammilDSL.g:1079:1: rule__HeaderDepth1Expression__Group_0__5__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1083:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1084:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1084:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1085:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_5()); 
            }
            // InternalHammilDSL.g:1086:2: ( RULE_BL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHammilDSL.g:1086:3: RULE_BL
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
    // InternalHammilDSL.g:1095:1: rule__HeaderDepth1Expression__Group_1__0 : rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 ;
    public final void rule__HeaderDepth1Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1099:1: ( rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 )
            // InternalHammilDSL.g:1100:2: rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1
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
    // InternalHammilDSL.g:1107:1: rule__HeaderDepth1Expression__Group_1__0__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1111:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:1112:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:1112:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:1113:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); 
            }
            // InternalHammilDSL.g:1114:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:1114:3: rule__HeaderDepth1Expression__TitleAssignment_1_0
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
    // InternalHammilDSL.g:1122:1: rule__HeaderDepth1Expression__Group_1__1 : rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 ;
    public final void rule__HeaderDepth1Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1126:1: ( rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 )
            // InternalHammilDSL.g:1127:2: rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalHammilDSL.g:1134:1: rule__HeaderDepth1Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth1Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1138:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:1139:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:1139:1: ( RULE_BL )
            // InternalHammilDSL.g:1140:2: RULE_BL
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
    // InternalHammilDSL.g:1149:1: rule__HeaderDepth1Expression__Group_1__2 : rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 ;
    public final void rule__HeaderDepth1Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1153:1: ( rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 )
            // InternalHammilDSL.g:1154:2: rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3
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
    // InternalHammilDSL.g:1161:1: rule__HeaderDepth1Expression__Group_1__2__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1165:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // InternalHammilDSL.g:1166:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // InternalHammilDSL.g:1166:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // InternalHammilDSL.g:1167:2: ( ( '=' ) ) ( ( '=' )* )
            {
            // InternalHammilDSL.g:1167:2: ( ( '=' ) )
            // InternalHammilDSL.g:1168:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }
            // InternalHammilDSL.g:1169:3: ( '=' )
            // InternalHammilDSL.g:1169:4: '='
            {
            match(input,13,FOLLOW_15); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }

            }

            // InternalHammilDSL.g:1172:2: ( ( '=' )* )
            // InternalHammilDSL.g:1173:3: ( '=' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }
            // InternalHammilDSL.g:1174:3: ( '=' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHammilDSL.g:1174:4: '='
            	    {
            	    match(input,13,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalHammilDSL.g:1183:1: rule__HeaderDepth1Expression__Group_1__3 : rule__HeaderDepth1Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1187:1: ( rule__HeaderDepth1Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:1188:2: rule__HeaderDepth1Expression__Group_1__3__Impl
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
    // InternalHammilDSL.g:1194:1: rule__HeaderDepth1Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1198:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1199:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1199:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1200:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            }
            // InternalHammilDSL.g:1201:2: ( RULE_BL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHammilDSL.g:1201:3: RULE_BL
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
    // InternalHammilDSL.g:1210:1: rule__HeaderDepth2Expression__Group_0__0 : rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 ;
    public final void rule__HeaderDepth2Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1214:1: ( rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 )
            // InternalHammilDSL.g:1215:2: rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHammilDSL.g:1222:1: rule__HeaderDepth2Expression__Group_0__0__Impl : ( ( '##' ) ) ;
    public final void rule__HeaderDepth2Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1226:1: ( ( ( '##' ) ) )
            // InternalHammilDSL.g:1227:1: ( ( '##' ) )
            {
            // InternalHammilDSL.g:1227:1: ( ( '##' ) )
            // InternalHammilDSL.g:1228:2: ( '##' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0()); 
            }
            // InternalHammilDSL.g:1229:2: ( '##' )
            // InternalHammilDSL.g:1229:3: '##'
            {
            match(input,14,FOLLOW_2); if (state.failed) return ;

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
    // InternalHammilDSL.g:1237:1: rule__HeaderDepth2Expression__Group_0__1 : rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 ;
    public final void rule__HeaderDepth2Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1241:1: ( rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 )
            // InternalHammilDSL.g:1242:2: rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1249:1: rule__HeaderDepth2Expression__Group_0__1__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1253:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) )
            // InternalHammilDSL.g:1254:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:1254:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            // InternalHammilDSL.g:1255:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_0_1()); 
            }
            // InternalHammilDSL.g:1256:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            // InternalHammilDSL.g:1256:3: rule__HeaderDepth2Expression__TitleAssignment_0_1
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
    // InternalHammilDSL.g:1264:1: rule__HeaderDepth2Expression__Group_0__2 : rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 ;
    public final void rule__HeaderDepth2Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1268:1: ( rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 )
            // InternalHammilDSL.g:1269:2: rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1276:1: rule__HeaderDepth2Expression__Group_0__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth2Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1280:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1281:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1281:1: ( ( '#' )* )
            // InternalHammilDSL.g:1282:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2()); 
            }
            // InternalHammilDSL.g:1283:2: ( '#' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==EOF||(LA15_2>=RULE_STRING && LA15_2<=RULE_BL)||(LA15_2>=9 && LA15_2<=12)||LA15_2==14||(LA15_2>=16 && LA15_2<=19)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalHammilDSL.g:1283:3: '#'
            	    {
            	    match(input,12,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalHammilDSL.g:1291:1: rule__HeaderDepth2Expression__Group_0__3 : rule__HeaderDepth2Expression__Group_0__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1295:1: ( rule__HeaderDepth2Expression__Group_0__3__Impl )
            // InternalHammilDSL.g:1296:2: rule__HeaderDepth2Expression__Group_0__3__Impl
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
    // InternalHammilDSL.g:1302:1: rule__HeaderDepth2Expression__Group_0__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1306:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1307:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1307:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1308:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            }
            // InternalHammilDSL.g:1309:2: ( RULE_BL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHammilDSL.g:1309:3: RULE_BL
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
    // InternalHammilDSL.g:1318:1: rule__HeaderDepth2Expression__Group_1__0 : rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 ;
    public final void rule__HeaderDepth2Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1322:1: ( rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 )
            // InternalHammilDSL.g:1323:2: rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1
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
    // InternalHammilDSL.g:1330:1: rule__HeaderDepth2Expression__Group_1__0__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1334:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:1335:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:1335:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:1336:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_1_0()); 
            }
            // InternalHammilDSL.g:1337:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:1337:3: rule__HeaderDepth2Expression__TitleAssignment_1_0
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
    // InternalHammilDSL.g:1345:1: rule__HeaderDepth2Expression__Group_1__1 : rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 ;
    public final void rule__HeaderDepth2Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1349:1: ( rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 )
            // InternalHammilDSL.g:1350:2: rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalHammilDSL.g:1357:1: rule__HeaderDepth2Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth2Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1361:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:1362:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:1362:1: ( RULE_BL )
            // InternalHammilDSL.g:1363:2: RULE_BL
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
    // InternalHammilDSL.g:1372:1: rule__HeaderDepth2Expression__Group_1__2 : rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 ;
    public final void rule__HeaderDepth2Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1376:1: ( rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 )
            // InternalHammilDSL.g:1377:2: rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3
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
    // InternalHammilDSL.g:1384:1: rule__HeaderDepth2Expression__Group_1__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1388:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalHammilDSL.g:1389:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalHammilDSL.g:1389:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalHammilDSL.g:1390:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalHammilDSL.g:1390:2: ( ( '-' ) )
            // InternalHammilDSL.g:1391:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            }
            // InternalHammilDSL.g:1392:3: ( '-' )
            // InternalHammilDSL.g:1392:4: '-'
            {
            match(input,15,FOLLOW_18); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            }

            }

            // InternalHammilDSL.g:1395:2: ( ( '-' )* )
            // InternalHammilDSL.g:1396:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            }
            // InternalHammilDSL.g:1397:3: ( '-' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHammilDSL.g:1397:4: '-'
            	    {
            	    match(input,15,FOLLOW_18); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalHammilDSL.g:1406:1: rule__HeaderDepth2Expression__Group_1__3 : rule__HeaderDepth2Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1410:1: ( rule__HeaderDepth2Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:1411:2: rule__HeaderDepth2Expression__Group_1__3__Impl
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
    // InternalHammilDSL.g:1417:1: rule__HeaderDepth2Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1421:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1422:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1422:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1423:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            }
            // InternalHammilDSL.g:1424:2: ( RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHammilDSL.g:1424:3: RULE_BL
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
    // InternalHammilDSL.g:1433:1: rule__HeaderDepth3Expression__Group__0 : rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 ;
    public final void rule__HeaderDepth3Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1437:1: ( rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 )
            // InternalHammilDSL.g:1438:2: rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHammilDSL.g:1445:1: rule__HeaderDepth3Expression__Group__0__Impl : ( '###' ) ;
    public final void rule__HeaderDepth3Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1449:1: ( ( '###' ) )
            // InternalHammilDSL.g:1450:1: ( '###' )
            {
            // InternalHammilDSL.g:1450:1: ( '###' )
            // InternalHammilDSL.g:1451:2: '###'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:1460:1: rule__HeaderDepth3Expression__Group__1 : rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 ;
    public final void rule__HeaderDepth3Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1464:1: ( rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 )
            // InternalHammilDSL.g:1465:2: rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1472:1: rule__HeaderDepth3Expression__Group__1__Impl : ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth3Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1476:1: ( ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1477:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1477:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1478:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:1479:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1479:3: rule__HeaderDepth3Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1487:1: rule__HeaderDepth3Expression__Group__2 : rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 ;
    public final void rule__HeaderDepth3Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1491:1: ( rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 )
            // InternalHammilDSL.g:1492:2: rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1499:1: rule__HeaderDepth3Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth3Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1503:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1504:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1504:1: ( ( '#' )* )
            // InternalHammilDSL.g:1505:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:1506:2: ( '#' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==EOF||(LA19_2>=RULE_STRING && LA19_2<=RULE_BL)||(LA19_2>=9 && LA19_2<=12)||LA19_2==14||(LA19_2>=16 && LA19_2<=19)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalHammilDSL.g:1506:3: '#'
            	    {
            	    match(input,12,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalHammilDSL.g:1514:1: rule__HeaderDepth3Expression__Group__3 : rule__HeaderDepth3Expression__Group__3__Impl ;
    public final void rule__HeaderDepth3Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1518:1: ( rule__HeaderDepth3Expression__Group__3__Impl )
            // InternalHammilDSL.g:1519:2: rule__HeaderDepth3Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1525:1: rule__HeaderDepth3Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth3Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1529:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1530:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1530:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1531:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:1532:2: ( RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHammilDSL.g:1532:3: RULE_BL
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
    // InternalHammilDSL.g:1541:1: rule__HeaderDepth5Expression__Group__0 : rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 ;
    public final void rule__HeaderDepth5Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1545:1: ( rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 )
            // InternalHammilDSL.g:1546:2: rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHammilDSL.g:1553:1: rule__HeaderDepth5Expression__Group__0__Impl : ( '#####' ) ;
    public final void rule__HeaderDepth5Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1557:1: ( ( '#####' ) )
            // InternalHammilDSL.g:1558:1: ( '#####' )
            {
            // InternalHammilDSL.g:1558:1: ( '#####' )
            // InternalHammilDSL.g:1559:2: '#####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:1568:1: rule__HeaderDepth5Expression__Group__1 : rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 ;
    public final void rule__HeaderDepth5Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1572:1: ( rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 )
            // InternalHammilDSL.g:1573:2: rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1580:1: rule__HeaderDepth5Expression__Group__1__Impl : ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth5Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1584:1: ( ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1585:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1585:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1586:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:1587:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1587:3: rule__HeaderDepth5Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1595:1: rule__HeaderDepth5Expression__Group__2 : rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 ;
    public final void rule__HeaderDepth5Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1599:1: ( rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 )
            // InternalHammilDSL.g:1600:2: rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1607:1: rule__HeaderDepth5Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth5Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1611:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1612:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1612:1: ( ( '#' )* )
            // InternalHammilDSL.g:1613:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:1614:2: ( '#' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==12) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==EOF||(LA21_2>=RULE_STRING && LA21_2<=RULE_BL)||(LA21_2>=9 && LA21_2<=12)||LA21_2==14||(LA21_2>=16 && LA21_2<=19)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalHammilDSL.g:1614:3: '#'
            	    {
            	    match(input,12,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalHammilDSL.g:1622:1: rule__HeaderDepth5Expression__Group__3 : rule__HeaderDepth5Expression__Group__3__Impl ;
    public final void rule__HeaderDepth5Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1626:1: ( rule__HeaderDepth5Expression__Group__3__Impl )
            // InternalHammilDSL.g:1627:2: rule__HeaderDepth5Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1633:1: rule__HeaderDepth5Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth5Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1637:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1638:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1638:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1639:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:1640:2: ( RULE_BL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalHammilDSL.g:1640:3: RULE_BL
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
    // InternalHammilDSL.g:1649:1: rule__HeaderDepth6Expression__Group__0 : rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 ;
    public final void rule__HeaderDepth6Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1653:1: ( rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 )
            // InternalHammilDSL.g:1654:2: rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHammilDSL.g:1661:1: rule__HeaderDepth6Expression__Group__0__Impl : ( '######' ) ;
    public final void rule__HeaderDepth6Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1665:1: ( ( '######' ) )
            // InternalHammilDSL.g:1666:1: ( '######' )
            {
            // InternalHammilDSL.g:1666:1: ( '######' )
            // InternalHammilDSL.g:1667:2: '######'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:1676:1: rule__HeaderDepth6Expression__Group__1 : rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 ;
    public final void rule__HeaderDepth6Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1680:1: ( rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 )
            // InternalHammilDSL.g:1681:2: rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1688:1: rule__HeaderDepth6Expression__Group__1__Impl : ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth6Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1692:1: ( ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1693:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1693:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1694:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:1695:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1695:3: rule__HeaderDepth6Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1703:1: rule__HeaderDepth6Expression__Group__2 : rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 ;
    public final void rule__HeaderDepth6Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1707:1: ( rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 )
            // InternalHammilDSL.g:1708:2: rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1715:1: rule__HeaderDepth6Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth6Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1719:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1720:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1720:1: ( ( '#' )* )
            // InternalHammilDSL.g:1721:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:1722:2: ( '#' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==12) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==EOF||(LA23_2>=RULE_STRING && LA23_2<=RULE_BL)||(LA23_2>=9 && LA23_2<=12)||LA23_2==14||(LA23_2>=16 && LA23_2<=19)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalHammilDSL.g:1722:3: '#'
            	    {
            	    match(input,12,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalHammilDSL.g:1730:1: rule__HeaderDepth6Expression__Group__3 : rule__HeaderDepth6Expression__Group__3__Impl ;
    public final void rule__HeaderDepth6Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1734:1: ( rule__HeaderDepth6Expression__Group__3__Impl )
            // InternalHammilDSL.g:1735:2: rule__HeaderDepth6Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1741:1: rule__HeaderDepth6Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth6Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1745:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1746:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1746:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1747:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:1748:2: ( RULE_BL )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_BL) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHammilDSL.g:1748:3: RULE_BL
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
    // InternalHammilDSL.g:1757:1: rule__HeaderDepth4Expression__Group__0 : rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 ;
    public final void rule__HeaderDepth4Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1761:1: ( rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 )
            // InternalHammilDSL.g:1762:2: rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHammilDSL.g:1769:1: rule__HeaderDepth4Expression__Group__0__Impl : ( '####' ) ;
    public final void rule__HeaderDepth4Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1773:1: ( ( '####' ) )
            // InternalHammilDSL.g:1774:1: ( '####' )
            {
            // InternalHammilDSL.g:1774:1: ( '####' )
            // InternalHammilDSL.g:1775:2: '####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:1784:1: rule__HeaderDepth4Expression__Group__1 : rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 ;
    public final void rule__HeaderDepth4Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1788:1: ( rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 )
            // InternalHammilDSL.g:1789:2: rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1796:1: rule__HeaderDepth4Expression__Group__1__Impl : ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth4Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1800:1: ( ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1801:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1801:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1802:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:1803:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1803:3: rule__HeaderDepth4Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1811:1: rule__HeaderDepth4Expression__Group__2 : rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 ;
    public final void rule__HeaderDepth4Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1815:1: ( rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 )
            // InternalHammilDSL.g:1816:2: rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalHammilDSL.g:1823:1: rule__HeaderDepth4Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth4Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1827:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1828:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1828:1: ( ( '#' )* )
            // InternalHammilDSL.g:1829:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:1830:2: ( '#' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==12) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==EOF||(LA25_2>=RULE_STRING && LA25_2<=RULE_BL)||(LA25_2>=9 && LA25_2<=12)||LA25_2==14||(LA25_2>=16 && LA25_2<=19)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalHammilDSL.g:1830:3: '#'
            	    {
            	    match(input,12,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalHammilDSL.g:1838:1: rule__HeaderDepth4Expression__Group__3 : rule__HeaderDepth4Expression__Group__3__Impl ;
    public final void rule__HeaderDepth4Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1842:1: ( rule__HeaderDepth4Expression__Group__3__Impl )
            // InternalHammilDSL.g:1843:2: rule__HeaderDepth4Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1849:1: rule__HeaderDepth4Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth4Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1853:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1854:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1854:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1855:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:1856:2: ( RULE_BL )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_BL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHammilDSL.g:1856:3: RULE_BL
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
    // InternalHammilDSL.g:1865:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1869:1: ( ( ruleExpression ) )
            // InternalHammilDSL.g:1870:2: ( ruleExpression )
            {
            // InternalHammilDSL.g:1870:2: ( ruleExpression )
            // InternalHammilDSL.g:1871:3: ruleExpression
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
    // InternalHammilDSL.g:1880:1: rule__QuoteExpression__TextexpressionAssignment_1 : ( ruleTextExpression ) ;
    public final void rule__QuoteExpression__TextexpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1884:1: ( ( ruleTextExpression ) )
            // InternalHammilDSL.g:1885:2: ( ruleTextExpression )
            {
            // InternalHammilDSL.g:1885:2: ( ruleTextExpression )
            // InternalHammilDSL.g:1886:3: ruleTextExpression
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
    // InternalHammilDSL.g:1895:1: rule__CodeExpression__TextAssignment_0_1 : ( ruleString0 ) ;
    public final void rule__CodeExpression__TextAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1899:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:1900:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:1900:2: ( ruleString0 )
            // InternalHammilDSL.g:1901:3: ruleString0
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
    // InternalHammilDSL.g:1910:1: rule__CodeExpression__TextAssignment_1_2 : ( ruleString0 ) ;
    public final void rule__CodeExpression__TextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1914:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:1915:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:1915:2: ( ruleString0 )
            // InternalHammilDSL.g:1916:3: ruleString0
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
    // InternalHammilDSL.g:1925:1: rule__HeaderDepth1Expression__TitleAssignment_0_2 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1929:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1930:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1930:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1931:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1940:1: rule__HeaderDepth1Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1944:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1945:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1945:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1946:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1955:1: rule__HeaderDepth2Expression__TitleAssignment_0_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1959:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1960:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1960:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1961:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1970:1: rule__HeaderDepth2Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1974:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1975:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1975:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1976:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1985:1: rule__HeaderDepth3Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth3Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1989:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1990:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1990:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1991:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:2000:1: rule__HeaderDepth5Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth5Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2004:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2005:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2005:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2006:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:2015:1: rule__HeaderDepth6Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth6Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2019:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2020:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2020:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2021:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:2030:1: rule__HeaderDepth4Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth4Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2034:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:2035:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:2035:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:2036:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:2045:1: rule__TextualExpression__ContentStringAssignment : ( ruleString0 ) ;
    public final void rule__TextualExpression__ContentStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:2049:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:2050:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:2050:2: ( ruleString0 )
            // InternalHammilDSL.g:2051:3: ruleString0
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

    // $ANTLR start synpred15_InternalHammilDSL
    public final void synpred15_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:1033:3: ( '#' )
        // InternalHammilDSL.g:1033:3: '#'
        {
        match(input,12,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalHammilDSL

    // Delegated rules

    public final boolean synpred15_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\1\1\uffff\2\4\2\uffff\1\4";
    static final String dfa_3s = "\1\4\1\uffff\2\4\1\uffff\1\0\1\4";
    static final String dfa_4s = "\1\23\1\uffff\2\23\1\uffff\1\0\1\23";
    static final String dfa_5s = "\1\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String dfa_6s = "\5\uffff\1\0\1\uffff}>";
    static final String[] dfa_7s = {
            "\3\1\2\uffff\3\1\1\2\1\uffff\1\1\1\uffff\4\1",
            "",
            "\2\4\1\3\2\uffff\4\4\1\uffff\1\4\1\uffff\4\4",
            "\1\5\1\4\1\6\2\uffff\4\4\1\uffff\1\4\1\uffff\4\4",
            "",
            "\1\uffff",
            "\1\5\1\4\1\6\2\uffff\4\4\1\uffff\1\4\1\uffff\4\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1033:2: ( '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHammilDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000F5E10L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000F5E12L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001210L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008002L});

}