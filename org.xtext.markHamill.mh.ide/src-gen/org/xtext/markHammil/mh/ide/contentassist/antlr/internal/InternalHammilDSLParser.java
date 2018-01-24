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

@SuppressWarnings("all")
public class InternalHammilDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_S", "RULE_DIGIT", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'#'", "'='", "'##'", "'-'", "'###'", "'#####'", "'######'", "'####'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=11;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=12;
    public static final int RULE_WS=13;
    public static final int RULE_DIGIT=9;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_S=8;
    public static final int RULE_INT=10;
    public static final int RULE_BL=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
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
    // InternalHammilDSL.g:53:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalHammilDSL.g:54:1: ( ruleFile EOF )
            // InternalHammilDSL.g:55:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:62:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:66:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalHammilDSL.g:67:2: ( ( rule__File__Group__0 ) )
            {
            // InternalHammilDSL.g:67:2: ( ( rule__File__Group__0 ) )
            // InternalHammilDSL.g:68:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalHammilDSL.g:69:3: ( rule__File__Group__0 )
            // InternalHammilDSL.g:69:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

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
    // InternalHammilDSL.g:78:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:79:1: ( ruleExpression EOF )
            // InternalHammilDSL.g:80:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:87:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:91:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalHammilDSL.g:92:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:92:2: ( ( rule__Expression__Alternatives ) )
            // InternalHammilDSL.g:93:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalHammilDSL.g:94:3: ( rule__Expression__Alternatives )
            // InternalHammilDSL.g:94:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleTextExpression"
    // InternalHammilDSL.g:103:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:104:1: ( ruleTextExpression EOF )
            // InternalHammilDSL.g:105:1: ruleTextExpression EOF
            {
             before(grammarAccess.getTextExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTextExpression();

            state._fsp--;

             after(grammarAccess.getTextExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalHammilDSL.g:112:1: ruleTextExpression : ( ( rule__TextExpression__Alternatives ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:116:2: ( ( ( rule__TextExpression__Alternatives ) ) )
            // InternalHammilDSL.g:117:2: ( ( rule__TextExpression__Alternatives ) )
            {
            // InternalHammilDSL.g:117:2: ( ( rule__TextExpression__Alternatives ) )
            // InternalHammilDSL.g:118:3: ( rule__TextExpression__Alternatives )
            {
             before(grammarAccess.getTextExpressionAccess().getAlternatives()); 
            // InternalHammilDSL.g:119:3: ( rule__TextExpression__Alternatives )
            // InternalHammilDSL.g:119:4: rule__TextExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalHammilDSL.g:128:1: entryRuleEmphasisExpression : ruleEmphasisExpression EOF ;
    public final void entryRuleEmphasisExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:129:1: ( ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:130:1: ruleEmphasisExpression EOF
            {
             before(grammarAccess.getEmphasisExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getEmphasisExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:137:1: ruleEmphasisExpression : ( ruleTextualExpression ) ;
    public final void ruleEmphasisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:141:2: ( ( ruleTextualExpression ) )
            // InternalHammilDSL.g:142:2: ( ruleTextualExpression )
            {
            // InternalHammilDSL.g:142:2: ( ruleTextualExpression )
            // InternalHammilDSL.g:143:3: ruleTextualExpression
            {
             before(grammarAccess.getEmphasisExpressionAccess().getTextualExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTextualExpression();

            state._fsp--;

             after(grammarAccess.getEmphasisExpressionAccess().getTextualExpressionParserRuleCall()); 

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
    // InternalHammilDSL.g:153:1: entryRuleQuoteExpression : ruleQuoteExpression EOF ;
    public final void entryRuleQuoteExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:157:1: ( ruleQuoteExpression EOF )
            // InternalHammilDSL.g:158:1: ruleQuoteExpression EOF
            {
             before(grammarAccess.getQuoteExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuoteExpression();

            state._fsp--;

             after(grammarAccess.getQuoteExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuoteExpression"


    // $ANTLR start "ruleQuoteExpression"
    // InternalHammilDSL.g:168:1: ruleQuoteExpression : ( ( rule__QuoteExpression__Group__0 ) ) ;
    public final void ruleQuoteExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:173:2: ( ( ( rule__QuoteExpression__Group__0 ) ) )
            // InternalHammilDSL.g:174:2: ( ( rule__QuoteExpression__Group__0 ) )
            {
            // InternalHammilDSL.g:174:2: ( ( rule__QuoteExpression__Group__0 ) )
            // InternalHammilDSL.g:175:3: ( rule__QuoteExpression__Group__0 )
            {
             before(grammarAccess.getQuoteExpressionAccess().getGroup()); 
            // InternalHammilDSL.g:176:3: ( rule__QuoteExpression__Group__0 )
            // InternalHammilDSL.g:176:4: rule__QuoteExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuoteExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleQuoteExpression"


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHammilDSL.g:186:1: entryRuleHeaderDepth1Expression : ruleHeaderDepth1Expression EOF ;
    public final void entryRuleHeaderDepth1Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:190:1: ( ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:191:1: ruleHeaderDepth1Expression EOF
            {
             before(grammarAccess.getHeaderDepth1ExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaderDepth1Expression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth1ExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:201:1: ruleHeaderDepth1Expression : ( ( rule__HeaderDepth1Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth1Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:206:2: ( ( ( rule__HeaderDepth1Expression__Alternatives ) ) )
            // InternalHammilDSL.g:207:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:207:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            // InternalHammilDSL.g:208:3: ( rule__HeaderDepth1Expression__Alternatives )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); 
            // InternalHammilDSL.g:209:3: ( rule__HeaderDepth1Expression__Alternatives )
            // InternalHammilDSL.g:209:4: rule__HeaderDepth1Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleHeaderDepth2Expression"
    // InternalHammilDSL.g:219:1: entryRuleHeaderDepth2Expression : ruleHeaderDepth2Expression EOF ;
    public final void entryRuleHeaderDepth2Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:223:1: ( ruleHeaderDepth2Expression EOF )
            // InternalHammilDSL.g:224:1: ruleHeaderDepth2Expression EOF
            {
             before(grammarAccess.getHeaderDepth2ExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaderDepth2Expression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth2ExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeaderDepth2Expression"


    // $ANTLR start "ruleHeaderDepth2Expression"
    // InternalHammilDSL.g:234:1: ruleHeaderDepth2Expression : ( ( rule__HeaderDepth2Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth2Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:239:2: ( ( ( rule__HeaderDepth2Expression__Alternatives ) ) )
            // InternalHammilDSL.g:240:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:240:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            // InternalHammilDSL.g:241:3: ( rule__HeaderDepth2Expression__Alternatives )
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getAlternatives()); 
            // InternalHammilDSL.g:242:3: ( rule__HeaderDepth2Expression__Alternatives )
            // InternalHammilDSL.g:242:4: rule__HeaderDepth2Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHeaderDepth2Expression"


    // $ANTLR start "entryRuleHeaderDepth3Expression"
    // InternalHammilDSL.g:252:1: entryRuleHeaderDepth3Expression : ruleHeaderDepth3Expression EOF ;
    public final void entryRuleHeaderDepth3Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:256:1: ( ruleHeaderDepth3Expression EOF )
            // InternalHammilDSL.g:257:1: ruleHeaderDepth3Expression EOF
            {
             before(grammarAccess.getHeaderDepth3ExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaderDepth3Expression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth3ExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeaderDepth3Expression"


    // $ANTLR start "ruleHeaderDepth3Expression"
    // InternalHammilDSL.g:267:1: ruleHeaderDepth3Expression : ( ( rule__HeaderDepth3Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth3Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:272:2: ( ( ( rule__HeaderDepth3Expression__Group__0 ) ) )
            // InternalHammilDSL.g:273:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:273:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            // InternalHammilDSL.g:274:3: ( rule__HeaderDepth3Expression__Group__0 )
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getGroup()); 
            // InternalHammilDSL.g:275:3: ( rule__HeaderDepth3Expression__Group__0 )
            // InternalHammilDSL.g:275:4: rule__HeaderDepth3Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth3ExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleHeaderDepth3Expression"


    // $ANTLR start "entryRuleHeaderDepth5Expression"
    // InternalHammilDSL.g:285:1: entryRuleHeaderDepth5Expression : ruleHeaderDepth5Expression EOF ;
    public final void entryRuleHeaderDepth5Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:289:1: ( ruleHeaderDepth5Expression EOF )
            // InternalHammilDSL.g:290:1: ruleHeaderDepth5Expression EOF
            {
             before(grammarAccess.getHeaderDepth5ExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaderDepth5Expression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth5ExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeaderDepth5Expression"


    // $ANTLR start "ruleHeaderDepth5Expression"
    // InternalHammilDSL.g:300:1: ruleHeaderDepth5Expression : ( ( rule__HeaderDepth5Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth5Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:305:2: ( ( ( rule__HeaderDepth5Expression__Group__0 ) ) )
            // InternalHammilDSL.g:306:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:306:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            // InternalHammilDSL.g:307:3: ( rule__HeaderDepth5Expression__Group__0 )
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getGroup()); 
            // InternalHammilDSL.g:308:3: ( rule__HeaderDepth5Expression__Group__0 )
            // InternalHammilDSL.g:308:4: rule__HeaderDepth5Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth5ExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleHeaderDepth5Expression"


    // $ANTLR start "entryRuleHeaderDepth6Expression"
    // InternalHammilDSL.g:318:1: entryRuleHeaderDepth6Expression : ruleHeaderDepth6Expression EOF ;
    public final void entryRuleHeaderDepth6Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:322:1: ( ruleHeaderDepth6Expression EOF )
            // InternalHammilDSL.g:323:1: ruleHeaderDepth6Expression EOF
            {
             before(grammarAccess.getHeaderDepth6ExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaderDepth6Expression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth6ExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeaderDepth6Expression"


    // $ANTLR start "ruleHeaderDepth6Expression"
    // InternalHammilDSL.g:333:1: ruleHeaderDepth6Expression : ( ( rule__HeaderDepth6Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth6Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:338:2: ( ( ( rule__HeaderDepth6Expression__Group__0 ) ) )
            // InternalHammilDSL.g:339:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:339:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            // InternalHammilDSL.g:340:3: ( rule__HeaderDepth6Expression__Group__0 )
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getGroup()); 
            // InternalHammilDSL.g:341:3: ( rule__HeaderDepth6Expression__Group__0 )
            // InternalHammilDSL.g:341:4: rule__HeaderDepth6Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth6ExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleHeaderDepth6Expression"


    // $ANTLR start "entryRuleHeaderDepth4Expression"
    // InternalHammilDSL.g:351:1: entryRuleHeaderDepth4Expression : ruleHeaderDepth4Expression EOF ;
    public final void entryRuleHeaderDepth4Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:355:1: ( ruleHeaderDepth4Expression EOF )
            // InternalHammilDSL.g:356:1: ruleHeaderDepth4Expression EOF
            {
             before(grammarAccess.getHeaderDepth4ExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaderDepth4Expression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth4ExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeaderDepth4Expression"


    // $ANTLR start "ruleHeaderDepth4Expression"
    // InternalHammilDSL.g:366:1: ruleHeaderDepth4Expression : ( ( rule__HeaderDepth4Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth4Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:371:2: ( ( ( rule__HeaderDepth4Expression__Group__0 ) ) )
            // InternalHammilDSL.g:372:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:372:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            // InternalHammilDSL.g:373:3: ( rule__HeaderDepth4Expression__Group__0 )
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getGroup()); 
            // InternalHammilDSL.g:374:3: ( rule__HeaderDepth4Expression__Group__0 )
            // InternalHammilDSL.g:374:4: rule__HeaderDepth4Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth4ExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleHeaderDepth4Expression"


    // $ANTLR start "entryRuleTextualExpression"
    // InternalHammilDSL.g:384:1: entryRuleTextualExpression : ruleTextualExpression EOF ;
    public final void entryRuleTextualExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:385:1: ( ruleTextualExpression EOF )
            // InternalHammilDSL.g:386:1: ruleTextualExpression EOF
            {
             before(grammarAccess.getTextualExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTextualExpression();

            state._fsp--;

             after(grammarAccess.getTextualExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:393:1: ruleTextualExpression : ( ( rule__TextualExpression__ContentStringAssignment ) ) ;
    public final void ruleTextualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:397:2: ( ( ( rule__TextualExpression__ContentStringAssignment ) ) )
            // InternalHammilDSL.g:398:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            {
            // InternalHammilDSL.g:398:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            // InternalHammilDSL.g:399:3: ( rule__TextualExpression__ContentStringAssignment )
            {
             before(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); 
            // InternalHammilDSL.g:400:3: ( rule__TextualExpression__ContentStringAssignment )
            // InternalHammilDSL.g:400:4: rule__TextualExpression__ContentStringAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TextualExpression__ContentStringAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); 

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
    // InternalHammilDSL.g:409:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalHammilDSL.g:410:1: ( ruleString0 EOF )
            // InternalHammilDSL.g:411:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:418:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:422:2: ( ( RULE_STRING ) )
            // InternalHammilDSL.g:423:2: ( RULE_STRING )
            {
            // InternalHammilDSL.g:423:2: ( RULE_STRING )
            // InternalHammilDSL.g:424:3: RULE_STRING
            {
             before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 

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
    // InternalHammilDSL.g:433:1: rule__Expression__Alternatives : ( ( ruleQuoteExpression ) | ( ruleHeaderDepth1Expression ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:437:1: ( ( ruleQuoteExpression ) | ( ruleHeaderDepth1Expression ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalHammilDSL.g:438:2: ( ruleQuoteExpression )
                    {
                    // InternalHammilDSL.g:438:2: ( ruleQuoteExpression )
                    // InternalHammilDSL.g:439:3: ruleQuoteExpression
                    {
                     before(grammarAccess.getExpressionAccess().getQuoteExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQuoteExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getQuoteExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:444:2: ( ruleHeaderDepth1Expression )
                    {
                    // InternalHammilDSL.g:444:2: ( ruleHeaderDepth1Expression )
                    // InternalHammilDSL.g:445:3: ruleHeaderDepth1Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth1Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:450:2: ( ruleHeaderDepth2Expression )
                    {
                    // InternalHammilDSL.g:450:2: ( ruleHeaderDepth2Expression )
                    // InternalHammilDSL.g:451:3: ruleHeaderDepth2Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth2Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHammilDSL.g:456:2: ( ruleHeaderDepth3Expression )
                    {
                    // InternalHammilDSL.g:456:2: ( ruleHeaderDepth3Expression )
                    // InternalHammilDSL.g:457:3: ruleHeaderDepth3Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth3Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHammilDSL.g:462:2: ( ruleHeaderDepth4Expression )
                    {
                    // InternalHammilDSL.g:462:2: ( ruleHeaderDepth4Expression )
                    // InternalHammilDSL.g:463:3: ruleHeaderDepth4Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth4Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHammilDSL.g:468:2: ( ruleHeaderDepth5Expression )
                    {
                    // InternalHammilDSL.g:468:2: ( ruleHeaderDepth5Expression )
                    // InternalHammilDSL.g:469:3: ruleHeaderDepth5Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth5Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHammilDSL.g:474:2: ( ruleHeaderDepth6Expression )
                    {
                    // InternalHammilDSL.g:474:2: ( ruleHeaderDepth6Expression )
                    // InternalHammilDSL.g:475:3: ruleHeaderDepth6Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth6Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_6()); 

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


    // $ANTLR start "rule__TextExpression__Alternatives"
    // InternalHammilDSL.g:484:1: rule__TextExpression__Alternatives : ( ( ruleTextualExpression ) | ( ruleQuoteExpression ) );
    public final void rule__TextExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:488:1: ( ( ruleTextualExpression ) | ( ruleQuoteExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHammilDSL.g:489:2: ( ruleTextualExpression )
                    {
                    // InternalHammilDSL.g:489:2: ( ruleTextualExpression )
                    // InternalHammilDSL.g:490:3: ruleTextualExpression
                    {
                     before(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextualExpression();

                    state._fsp--;

                     after(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:495:2: ( ruleQuoteExpression )
                    {
                    // InternalHammilDSL.g:495:2: ( ruleQuoteExpression )
                    // InternalHammilDSL.g:496:3: ruleQuoteExpression
                    {
                     before(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuoteExpression();

                    state._fsp--;

                     after(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_1()); 

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


    // $ANTLR start "rule__HeaderDepth1Expression__Alternatives"
    // InternalHammilDSL.g:505:1: rule__HeaderDepth1Expression__Alternatives : ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth1Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:509:1: ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHammilDSL.g:510:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:510:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:511:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    {
                     before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); 
                    // InternalHammilDSL.g:512:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    // InternalHammilDSL.g:512:4: rule__HeaderDepth1Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HeaderDepth1Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:516:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:516:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:517:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    {
                     before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); 
                    // InternalHammilDSL.g:518:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    // InternalHammilDSL.g:518:4: rule__HeaderDepth1Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HeaderDepth1Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); 

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
    // InternalHammilDSL.g:526:1: rule__HeaderDepth2Expression__Alternatives : ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth2Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:530:1: ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHammilDSL.g:531:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:531:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:532:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    {
                     before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_0()); 
                    // InternalHammilDSL.g:533:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    // InternalHammilDSL.g:533:4: rule__HeaderDepth2Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HeaderDepth2Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:537:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:537:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:538:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    {
                     before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_1()); 
                    // InternalHammilDSL.g:539:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    // InternalHammilDSL.g:539:4: rule__HeaderDepth2Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HeaderDepth2Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_1()); 

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
    // InternalHammilDSL.g:547:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:551:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalHammilDSL.g:552:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:559:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:563:1: ( ( () ) )
            // InternalHammilDSL.g:564:1: ( () )
            {
            // InternalHammilDSL.g:564:1: ( () )
            // InternalHammilDSL.g:565:2: ()
            {
             before(grammarAccess.getFileAccess().getFileAction_0()); 
            // InternalHammilDSL.g:566:2: ()
            // InternalHammilDSL.g:566:3: 
            {
            }

             after(grammarAccess.getFileAccess().getFileAction_0()); 

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
    // InternalHammilDSL.g:574:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:578:1: ( rule__File__Group__1__Impl )
            // InternalHammilDSL.g:579:2: rule__File__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:585:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:589:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalHammilDSL.g:590:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalHammilDSL.g:590:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalHammilDSL.g:591:2: ( rule__File__ExpressionAssignment_1 )*
            {
             before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            // InternalHammilDSL.g:592:2: ( rule__File__ExpressionAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||(LA5_0>=15 && LA5_0<=16)||LA5_0==18||(LA5_0>=20 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHammilDSL.g:592:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getExpressionAssignment_1()); 

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
    // InternalHammilDSL.g:601:1: rule__QuoteExpression__Group__0 : rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 ;
    public final void rule__QuoteExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:605:1: ( rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 )
            // InternalHammilDSL.g:606:2: rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__QuoteExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:613:1: rule__QuoteExpression__Group__0__Impl : ( '>' ) ;
    public final void rule__QuoteExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:617:1: ( ( '>' ) )
            // InternalHammilDSL.g:618:1: ( '>' )
            {
            // InternalHammilDSL.g:618:1: ( '>' )
            // InternalHammilDSL.g:619:2: '>'
            {
             before(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_0()); 

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
    // InternalHammilDSL.g:628:1: rule__QuoteExpression__Group__1 : rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 ;
    public final void rule__QuoteExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:632:1: ( rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 )
            // InternalHammilDSL.g:633:2: rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__QuoteExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__2();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:640:1: rule__QuoteExpression__Group__1__Impl : ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) ) ;
    public final void rule__QuoteExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:644:1: ( ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) ) )
            // InternalHammilDSL.g:645:1: ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) )
            {
            // InternalHammilDSL.g:645:1: ( ( rule__QuoteExpression__TextexpressionAssignment_1 ) )
            // InternalHammilDSL.g:646:2: ( rule__QuoteExpression__TextexpressionAssignment_1 )
            {
             before(grammarAccess.getQuoteExpressionAccess().getTextexpressionAssignment_1()); 
            // InternalHammilDSL.g:647:2: ( rule__QuoteExpression__TextexpressionAssignment_1 )
            // InternalHammilDSL.g:647:3: rule__QuoteExpression__TextexpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__TextexpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuoteExpressionAccess().getTextexpressionAssignment_1()); 

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
    // InternalHammilDSL.g:655:1: rule__QuoteExpression__Group__2 : rule__QuoteExpression__Group__2__Impl ;
    public final void rule__QuoteExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:659:1: ( rule__QuoteExpression__Group__2__Impl )
            // InternalHammilDSL.g:660:2: rule__QuoteExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:666:1: rule__QuoteExpression__Group__2__Impl : ( ( RULE_BL )? ) ;
    public final void rule__QuoteExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:670:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:671:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:671:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:672:2: ( RULE_BL )?
            {
             before(grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_2()); 
            // InternalHammilDSL.g:673:2: ( RULE_BL )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_BL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHammilDSL.g:673:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_2()); 

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


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__0"
    // InternalHammilDSL.g:682:1: rule__HeaderDepth1Expression__Group_0__0 : rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 ;
    public final void rule__HeaderDepth1Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:686:1: ( rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 )
            // InternalHammilDSL.g:687:2: rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__HeaderDepth1Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:694:1: rule__HeaderDepth1Expression__Group_0__0__Impl : ( '#' ) ;
    public final void rule__HeaderDepth1Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:698:1: ( ( '#' ) )
            // InternalHammilDSL.g:699:1: ( '#' )
            {
            // InternalHammilDSL.g:699:1: ( '#' )
            // InternalHammilDSL.g:700:2: '#'
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0()); 

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
    // InternalHammilDSL.g:709:1: rule__HeaderDepth1Expression__Group_0__1 : rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 ;
    public final void rule__HeaderDepth1Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:713:1: ( rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 )
            // InternalHammilDSL.g:714:2: rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth1Expression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:721:1: rule__HeaderDepth1Expression__Group_0__1__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:725:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) ) )
            // InternalHammilDSL.g:726:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:726:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) )
            // InternalHammilDSL.g:727:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_1 )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_1()); 
            // InternalHammilDSL.g:728:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_1 )
            // InternalHammilDSL.g:728:3: rule__HeaderDepth1Expression__TitleAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__TitleAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_1()); 

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
    // InternalHammilDSL.g:736:1: rule__HeaderDepth1Expression__Group_0__2 : rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 ;
    public final void rule__HeaderDepth1Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:740:1: ( rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 )
            // InternalHammilDSL.g:741:2: rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth1Expression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__3();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:748:1: rule__HeaderDepth1Expression__Group_0__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth1Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:752:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:753:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:753:1: ( ( '#' )* )
            // InternalHammilDSL.g:754:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2()); 
            // InternalHammilDSL.g:755:2: ( '#' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==EOF||LA7_2==RULE_BL||(LA7_2>=15 && LA7_2<=16)||LA7_2==18||(LA7_2>=20 && LA7_2<=23)) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==RULE_STRING) ) {
                        int LA7_4 = input.LA(3);

                        if ( (LA7_4==RULE_BL) ) {
                            int LA7_5 = input.LA(4);

                            if ( (LA7_5==17||LA7_5==19) ) {
                                alt7=1;
                            }


                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalHammilDSL.g:755:3: '#'
            	    {
            	    match(input,16,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2()); 

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
    // InternalHammilDSL.g:763:1: rule__HeaderDepth1Expression__Group_0__3 : rule__HeaderDepth1Expression__Group_0__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:767:1: ( rule__HeaderDepth1Expression__Group_0__3__Impl )
            // InternalHammilDSL.g:768:2: rule__HeaderDepth1Expression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_0__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:774:1: rule__HeaderDepth1Expression__Group_0__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:778:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:779:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:779:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:780:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            // InternalHammilDSL.g:781:2: ( RULE_BL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_BL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHammilDSL.g:781:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3()); 

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
    // InternalHammilDSL.g:790:1: rule__HeaderDepth1Expression__Group_1__0 : rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 ;
    public final void rule__HeaderDepth1Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:794:1: ( rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 )
            // InternalHammilDSL.g:795:2: rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__HeaderDepth1Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:802:1: rule__HeaderDepth1Expression__Group_1__0__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:806:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:807:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:807:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:808:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); 
            // InternalHammilDSL.g:809:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:809:3: rule__HeaderDepth1Expression__TitleAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__TitleAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); 

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
    // InternalHammilDSL.g:817:1: rule__HeaderDepth1Expression__Group_1__1 : rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 ;
    public final void rule__HeaderDepth1Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:821:1: ( rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 )
            // InternalHammilDSL.g:822:2: rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__HeaderDepth1Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:829:1: rule__HeaderDepth1Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth1Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:833:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:834:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:834:1: ( RULE_BL )
            // InternalHammilDSL.g:835:2: RULE_BL
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1()); 
            match(input,RULE_BL,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1()); 

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
    // InternalHammilDSL.g:844:1: rule__HeaderDepth1Expression__Group_1__2 : rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 ;
    public final void rule__HeaderDepth1Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:848:1: ( rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 )
            // InternalHammilDSL.g:849:2: rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__HeaderDepth1Expression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:856:1: rule__HeaderDepth1Expression__Group_1__2__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:860:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // InternalHammilDSL.g:861:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // InternalHammilDSL.g:861:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // InternalHammilDSL.g:862:2: ( ( '=' ) ) ( ( '=' )* )
            {
            // InternalHammilDSL.g:862:2: ( ( '=' ) )
            // InternalHammilDSL.g:863:3: ( '=' )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            // InternalHammilDSL.g:864:3: ( '=' )
            // InternalHammilDSL.g:864:4: '='
            {
            match(input,17,FOLLOW_11); 

            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 

            }

            // InternalHammilDSL.g:867:2: ( ( '=' )* )
            // InternalHammilDSL.g:868:3: ( '=' )*
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            // InternalHammilDSL.g:869:3: ( '=' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHammilDSL.g:869:4: '='
            	    {
            	    match(input,17,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 

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
    // InternalHammilDSL.g:878:1: rule__HeaderDepth1Expression__Group_1__3 : rule__HeaderDepth1Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:882:1: ( rule__HeaderDepth1Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:883:2: rule__HeaderDepth1Expression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group_1__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:889:1: rule__HeaderDepth1Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:893:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:894:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:894:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:895:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            // InternalHammilDSL.g:896:2: ( RULE_BL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_BL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHammilDSL.g:896:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); 

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
    // InternalHammilDSL.g:905:1: rule__HeaderDepth2Expression__Group_0__0 : rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 ;
    public final void rule__HeaderDepth2Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:909:1: ( rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 )
            // InternalHammilDSL.g:910:2: rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__HeaderDepth2Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:917:1: rule__HeaderDepth2Expression__Group_0__0__Impl : ( '##' ) ;
    public final void rule__HeaderDepth2Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:921:1: ( ( '##' ) )
            // InternalHammilDSL.g:922:1: ( '##' )
            {
            // InternalHammilDSL.g:922:1: ( '##' )
            // InternalHammilDSL.g:923:2: '##'
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0()); 

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
    // InternalHammilDSL.g:932:1: rule__HeaderDepth2Expression__Group_0__1 : rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 ;
    public final void rule__HeaderDepth2Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:936:1: ( rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 )
            // InternalHammilDSL.g:937:2: rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth2Expression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:944:1: rule__HeaderDepth2Expression__Group_0__1__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:948:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) )
            // InternalHammilDSL.g:949:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:949:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            // InternalHammilDSL.g:950:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_0_1()); 
            // InternalHammilDSL.g:951:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            // InternalHammilDSL.g:951:3: rule__HeaderDepth2Expression__TitleAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__TitleAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_0_1()); 

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
    // InternalHammilDSL.g:959:1: rule__HeaderDepth2Expression__Group_0__2 : rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 ;
    public final void rule__HeaderDepth2Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:963:1: ( rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 )
            // InternalHammilDSL.g:964:2: rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth2Expression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_0__3();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:971:1: rule__HeaderDepth2Expression__Group_0__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth2Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:975:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:976:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:976:1: ( ( '#' )* )
            // InternalHammilDSL.g:977:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2()); 
            // InternalHammilDSL.g:978:2: ( '#' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_STRING) ) {
                        int LA11_3 = input.LA(3);

                        if ( (LA11_3==RULE_BL) ) {
                            int LA11_5 = input.LA(4);

                            if ( (LA11_5==17||LA11_5==19) ) {
                                alt11=1;
                            }


                        }


                    }
                    else if ( (LA11_2==EOF||LA11_2==RULE_BL||(LA11_2>=15 && LA11_2<=16)||LA11_2==18||(LA11_2>=20 && LA11_2<=23)) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalHammilDSL.g:978:3: '#'
            	    {
            	    match(input,16,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2()); 

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
    // InternalHammilDSL.g:986:1: rule__HeaderDepth2Expression__Group_0__3 : rule__HeaderDepth2Expression__Group_0__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:990:1: ( rule__HeaderDepth2Expression__Group_0__3__Impl )
            // InternalHammilDSL.g:991:2: rule__HeaderDepth2Expression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_0__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:997:1: rule__HeaderDepth2Expression__Group_0__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1001:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1002:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1002:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1003:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            // InternalHammilDSL.g:1004:2: ( RULE_BL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHammilDSL.g:1004:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3()); 

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
    // InternalHammilDSL.g:1013:1: rule__HeaderDepth2Expression__Group_1__0 : rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 ;
    public final void rule__HeaderDepth2Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1017:1: ( rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 )
            // InternalHammilDSL.g:1018:2: rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__HeaderDepth2Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1025:1: rule__HeaderDepth2Expression__Group_1__0__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1029:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:1030:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:1030:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:1031:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_1_0()); 
            // InternalHammilDSL.g:1032:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:1032:3: rule__HeaderDepth2Expression__TitleAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__TitleAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_1_0()); 

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
    // InternalHammilDSL.g:1040:1: rule__HeaderDepth2Expression__Group_1__1 : rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 ;
    public final void rule__HeaderDepth2Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1044:1: ( rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 )
            // InternalHammilDSL.g:1045:2: rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__HeaderDepth2Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1052:1: rule__HeaderDepth2Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth2Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1056:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:1057:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:1057:1: ( RULE_BL )
            // InternalHammilDSL.g:1058:2: RULE_BL
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_1()); 
            match(input,RULE_BL,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_1()); 

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
    // InternalHammilDSL.g:1067:1: rule__HeaderDepth2Expression__Group_1__2 : rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 ;
    public final void rule__HeaderDepth2Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1071:1: ( rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 )
            // InternalHammilDSL.g:1072:2: rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__HeaderDepth2Expression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1079:1: rule__HeaderDepth2Expression__Group_1__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1083:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalHammilDSL.g:1084:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalHammilDSL.g:1084:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalHammilDSL.g:1085:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalHammilDSL.g:1085:2: ( ( '-' ) )
            // InternalHammilDSL.g:1086:3: ( '-' )
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            // InternalHammilDSL.g:1087:3: ( '-' )
            // InternalHammilDSL.g:1087:4: '-'
            {
            match(input,19,FOLLOW_13); 

            }

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 

            }

            // InternalHammilDSL.g:1090:2: ( ( '-' )* )
            // InternalHammilDSL.g:1091:3: ( '-' )*
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            // InternalHammilDSL.g:1092:3: ( '-' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHammilDSL.g:1092:4: '-'
            	    {
            	    match(input,19,FOLLOW_13); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 

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
    // InternalHammilDSL.g:1101:1: rule__HeaderDepth2Expression__Group_1__3 : rule__HeaderDepth2Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1105:1: ( rule__HeaderDepth2Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:1106:2: rule__HeaderDepth2Expression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth2Expression__Group_1__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1112:1: rule__HeaderDepth2Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1116:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1117:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1117:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1118:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            // InternalHammilDSL.g:1119:2: ( RULE_BL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHammilDSL.g:1119:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3()); 

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
    // InternalHammilDSL.g:1128:1: rule__HeaderDepth3Expression__Group__0 : rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 ;
    public final void rule__HeaderDepth3Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1132:1: ( rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 )
            // InternalHammilDSL.g:1133:2: rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__HeaderDepth3Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1140:1: rule__HeaderDepth3Expression__Group__0__Impl : ( '###' ) ;
    public final void rule__HeaderDepth3Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1144:1: ( ( '###' ) )
            // InternalHammilDSL.g:1145:1: ( '###' )
            {
            // InternalHammilDSL.g:1145:1: ( '###' )
            // InternalHammilDSL.g:1146:2: '###'
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0()); 

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
    // InternalHammilDSL.g:1155:1: rule__HeaderDepth3Expression__Group__1 : rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 ;
    public final void rule__HeaderDepth3Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1159:1: ( rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 )
            // InternalHammilDSL.g:1160:2: rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth3Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__2();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1167:1: rule__HeaderDepth3Expression__Group__1__Impl : ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth3Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1171:1: ( ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1172:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1172:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1173:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleAssignment_1()); 
            // InternalHammilDSL.g:1174:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1174:3: rule__HeaderDepth3Expression__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleAssignment_1()); 

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
    // InternalHammilDSL.g:1182:1: rule__HeaderDepth3Expression__Group__2 : rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 ;
    public final void rule__HeaderDepth3Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1186:1: ( rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 )
            // InternalHammilDSL.g:1187:2: rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth3Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__3();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1194:1: rule__HeaderDepth3Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth3Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1198:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1199:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1199:1: ( ( '#' )* )
            // InternalHammilDSL.g:1200:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2()); 
            // InternalHammilDSL.g:1201:2: ( '#' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_STRING) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==RULE_BL) ) {
                            int LA15_5 = input.LA(4);

                            if ( (LA15_5==17||LA15_5==19) ) {
                                alt15=1;
                            }


                        }


                    }
                    else if ( (LA15_2==EOF||LA15_2==RULE_BL||(LA15_2>=15 && LA15_2<=16)||LA15_2==18||(LA15_2>=20 && LA15_2<=23)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalHammilDSL.g:1201:3: '#'
            	    {
            	    match(input,16,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2()); 

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
    // InternalHammilDSL.g:1209:1: rule__HeaderDepth3Expression__Group__3 : rule__HeaderDepth3Expression__Group__3__Impl ;
    public final void rule__HeaderDepth3Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1213:1: ( rule__HeaderDepth3Expression__Group__3__Impl )
            // InternalHammilDSL.g:1214:2: rule__HeaderDepth3Expression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth3Expression__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1220:1: rule__HeaderDepth3Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth3Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1224:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1225:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1225:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1226:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3()); 
            // InternalHammilDSL.g:1227:2: ( RULE_BL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHammilDSL.g:1227:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3()); 

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
    // InternalHammilDSL.g:1236:1: rule__HeaderDepth5Expression__Group__0 : rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 ;
    public final void rule__HeaderDepth5Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1240:1: ( rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 )
            // InternalHammilDSL.g:1241:2: rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__HeaderDepth5Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1248:1: rule__HeaderDepth5Expression__Group__0__Impl : ( '#####' ) ;
    public final void rule__HeaderDepth5Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1252:1: ( ( '#####' ) )
            // InternalHammilDSL.g:1253:1: ( '#####' )
            {
            // InternalHammilDSL.g:1253:1: ( '#####' )
            // InternalHammilDSL.g:1254:2: '#####'
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 

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
    // InternalHammilDSL.g:1263:1: rule__HeaderDepth5Expression__Group__1 : rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 ;
    public final void rule__HeaderDepth5Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1267:1: ( rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 )
            // InternalHammilDSL.g:1268:2: rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth5Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__2();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1275:1: rule__HeaderDepth5Expression__Group__1__Impl : ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth5Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1279:1: ( ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1280:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1280:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1281:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleAssignment_1()); 
            // InternalHammilDSL.g:1282:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1282:3: rule__HeaderDepth5Expression__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleAssignment_1()); 

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
    // InternalHammilDSL.g:1290:1: rule__HeaderDepth5Expression__Group__2 : rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 ;
    public final void rule__HeaderDepth5Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1294:1: ( rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 )
            // InternalHammilDSL.g:1295:2: rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth5Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__3();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1302:1: rule__HeaderDepth5Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth5Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1306:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1307:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1307:1: ( ( '#' )* )
            // InternalHammilDSL.g:1308:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2()); 
            // InternalHammilDSL.g:1309:2: ( '#' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==EOF||LA17_2==RULE_BL||(LA17_2>=15 && LA17_2<=16)||LA17_2==18||(LA17_2>=20 && LA17_2<=23)) ) {
                        alt17=1;
                    }
                    else if ( (LA17_2==RULE_STRING) ) {
                        int LA17_4 = input.LA(3);

                        if ( (LA17_4==RULE_BL) ) {
                            int LA17_5 = input.LA(4);

                            if ( (LA17_5==17||LA17_5==19) ) {
                                alt17=1;
                            }


                        }


                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalHammilDSL.g:1309:3: '#'
            	    {
            	    match(input,16,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2()); 

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
    // InternalHammilDSL.g:1317:1: rule__HeaderDepth5Expression__Group__3 : rule__HeaderDepth5Expression__Group__3__Impl ;
    public final void rule__HeaderDepth5Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1321:1: ( rule__HeaderDepth5Expression__Group__3__Impl )
            // InternalHammilDSL.g:1322:2: rule__HeaderDepth5Expression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth5Expression__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1328:1: rule__HeaderDepth5Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth5Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1332:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1333:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1333:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1334:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3()); 
            // InternalHammilDSL.g:1335:2: ( RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHammilDSL.g:1335:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3()); 

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
    // InternalHammilDSL.g:1344:1: rule__HeaderDepth6Expression__Group__0 : rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 ;
    public final void rule__HeaderDepth6Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1348:1: ( rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 )
            // InternalHammilDSL.g:1349:2: rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__HeaderDepth6Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1356:1: rule__HeaderDepth6Expression__Group__0__Impl : ( '######' ) ;
    public final void rule__HeaderDepth6Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1360:1: ( ( '######' ) )
            // InternalHammilDSL.g:1361:1: ( '######' )
            {
            // InternalHammilDSL.g:1361:1: ( '######' )
            // InternalHammilDSL.g:1362:2: '######'
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 

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
    // InternalHammilDSL.g:1371:1: rule__HeaderDepth6Expression__Group__1 : rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 ;
    public final void rule__HeaderDepth6Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1375:1: ( rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 )
            // InternalHammilDSL.g:1376:2: rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth6Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__2();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1383:1: rule__HeaderDepth6Expression__Group__1__Impl : ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth6Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1387:1: ( ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1388:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1388:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1389:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleAssignment_1()); 
            // InternalHammilDSL.g:1390:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1390:3: rule__HeaderDepth6Expression__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleAssignment_1()); 

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
    // InternalHammilDSL.g:1398:1: rule__HeaderDepth6Expression__Group__2 : rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 ;
    public final void rule__HeaderDepth6Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1402:1: ( rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 )
            // InternalHammilDSL.g:1403:2: rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth6Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__3();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1410:1: rule__HeaderDepth6Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth6Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1414:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1415:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1415:1: ( ( '#' )* )
            // InternalHammilDSL.g:1416:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2()); 
            // InternalHammilDSL.g:1417:2: ( '#' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==EOF||LA19_2==RULE_BL||(LA19_2>=15 && LA19_2<=16)||LA19_2==18||(LA19_2>=20 && LA19_2<=23)) ) {
                        alt19=1;
                    }
                    else if ( (LA19_2==RULE_STRING) ) {
                        int LA19_4 = input.LA(3);

                        if ( (LA19_4==RULE_BL) ) {
                            int LA19_5 = input.LA(4);

                            if ( (LA19_5==17||LA19_5==19) ) {
                                alt19=1;
                            }


                        }


                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalHammilDSL.g:1417:3: '#'
            	    {
            	    match(input,16,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2()); 

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
    // InternalHammilDSL.g:1425:1: rule__HeaderDepth6Expression__Group__3 : rule__HeaderDepth6Expression__Group__3__Impl ;
    public final void rule__HeaderDepth6Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1429:1: ( rule__HeaderDepth6Expression__Group__3__Impl )
            // InternalHammilDSL.g:1430:2: rule__HeaderDepth6Expression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth6Expression__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1436:1: rule__HeaderDepth6Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth6Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1440:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1441:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1441:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1442:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3()); 
            // InternalHammilDSL.g:1443:2: ( RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHammilDSL.g:1443:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3()); 

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
    // InternalHammilDSL.g:1452:1: rule__HeaderDepth4Expression__Group__0 : rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 ;
    public final void rule__HeaderDepth4Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1456:1: ( rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 )
            // InternalHammilDSL.g:1457:2: rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__HeaderDepth4Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1464:1: rule__HeaderDepth4Expression__Group__0__Impl : ( '####' ) ;
    public final void rule__HeaderDepth4Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1468:1: ( ( '####' ) )
            // InternalHammilDSL.g:1469:1: ( '####' )
            {
            // InternalHammilDSL.g:1469:1: ( '####' )
            // InternalHammilDSL.g:1470:2: '####'
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0()); 

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
    // InternalHammilDSL.g:1479:1: rule__HeaderDepth4Expression__Group__1 : rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 ;
    public final void rule__HeaderDepth4Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1483:1: ( rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 )
            // InternalHammilDSL.g:1484:2: rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth4Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__2();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1491:1: rule__HeaderDepth4Expression__Group__1__Impl : ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth4Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1495:1: ( ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1496:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1496:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1497:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleAssignment_1()); 
            // InternalHammilDSL.g:1498:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1498:3: rule__HeaderDepth4Expression__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleAssignment_1()); 

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
    // InternalHammilDSL.g:1506:1: rule__HeaderDepth4Expression__Group__2 : rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 ;
    public final void rule__HeaderDepth4Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1510:1: ( rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 )
            // InternalHammilDSL.g:1511:2: rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__HeaderDepth4Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__3();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1518:1: rule__HeaderDepth4Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth4Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1522:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1523:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1523:1: ( ( '#' )* )
            // InternalHammilDSL.g:1524:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2()); 
            // InternalHammilDSL.g:1525:2: ( '#' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_STRING) ) {
                        int LA21_3 = input.LA(3);

                        if ( (LA21_3==RULE_BL) ) {
                            int LA21_5 = input.LA(4);

                            if ( (LA21_5==17||LA21_5==19) ) {
                                alt21=1;
                            }


                        }


                    }
                    else if ( (LA21_2==EOF||LA21_2==RULE_BL||(LA21_2>=15 && LA21_2<=16)||LA21_2==18||(LA21_2>=20 && LA21_2<=23)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalHammilDSL.g:1525:3: '#'
            	    {
            	    match(input,16,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2()); 

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
    // InternalHammilDSL.g:1533:1: rule__HeaderDepth4Expression__Group__3 : rule__HeaderDepth4Expression__Group__3__Impl ;
    public final void rule__HeaderDepth4Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1537:1: ( rule__HeaderDepth4Expression__Group__3__Impl )
            // InternalHammilDSL.g:1538:2: rule__HeaderDepth4Expression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth4Expression__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalHammilDSL.g:1544:1: rule__HeaderDepth4Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth4Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1548:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1549:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1549:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1550:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3()); 
            // InternalHammilDSL.g:1551:2: ( RULE_BL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalHammilDSL.g:1551:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3()); 

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
    // InternalHammilDSL.g:1560:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1564:1: ( ( ruleExpression ) )
            // InternalHammilDSL.g:1565:2: ( ruleExpression )
            {
            // InternalHammilDSL.g:1565:2: ( ruleExpression )
            // InternalHammilDSL.g:1566:3: ruleExpression
            {
             before(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // InternalHammilDSL.g:1575:1: rule__QuoteExpression__TextexpressionAssignment_1 : ( ruleTextExpression ) ;
    public final void rule__QuoteExpression__TextexpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1579:1: ( ( ruleTextExpression ) )
            // InternalHammilDSL.g:1580:2: ( ruleTextExpression )
            {
            // InternalHammilDSL.g:1580:2: ( ruleTextExpression )
            // InternalHammilDSL.g:1581:3: ruleTextExpression
            {
             before(grammarAccess.getQuoteExpressionAccess().getTextexpressionTextExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextExpression();

            state._fsp--;

             after(grammarAccess.getQuoteExpressionAccess().getTextexpressionTextExpressionParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__HeaderDepth1Expression__TitleAssignment_0_1"
    // InternalHammilDSL.g:1590:1: rule__HeaderDepth1Expression__TitleAssignment_0_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1594:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1595:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1595:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1596:3: ruleEmphasisExpression
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); 

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
    // InternalHammilDSL.g:1605:1: rule__HeaderDepth1Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1609:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1610:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1610:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1611:3: ruleEmphasisExpression
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); 

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
    // InternalHammilDSL.g:1620:1: rule__HeaderDepth2Expression__TitleAssignment_0_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1624:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1625:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1625:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1626:3: ruleEmphasisExpression
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0()); 

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
    // InternalHammilDSL.g:1635:1: rule__HeaderDepth2Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1639:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1640:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1640:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1641:3: ruleEmphasisExpression
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0()); 

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
    // InternalHammilDSL.g:1650:1: rule__HeaderDepth3Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth3Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1654:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1655:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1655:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1656:3: ruleEmphasisExpression
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 

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
    // InternalHammilDSL.g:1665:1: rule__HeaderDepth5Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth5Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1669:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1670:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1670:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1671:3: ruleEmphasisExpression
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 

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
    // InternalHammilDSL.g:1680:1: rule__HeaderDepth6Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth6Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1684:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1685:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1685:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1686:3: ruleEmphasisExpression
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 

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
    // InternalHammilDSL.g:1695:1: rule__HeaderDepth4Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth4Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1699:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1700:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1700:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1701:3: ruleEmphasisExpression
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 

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
    // InternalHammilDSL.g:1710:1: rule__TextualExpression__ContentStringAssignment : ( ruleString0 ) ;
    public final void rule__TextualExpression__ContentStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1714:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:1715:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:1715:2: ( ruleString0 )
            // InternalHammilDSL.g:1716:3: ruleString0
            {
             before(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0()); 

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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\5\5\uffff\1\21";
    static final String dfa_3s = "\1\27\2\uffff\1\5\5\uffff\1\23";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\12\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\5\1\7\1\10\1\6",
            "",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "433:1: rule__Expression__Alternatives : ( ( ruleQuoteExpression ) | ( ruleHeaderDepth1Expression ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000F58010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000F58012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});

}