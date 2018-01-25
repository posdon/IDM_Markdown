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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_S", "RULE_DIGIT", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'='", "'##'", "'-'", "'###'", "'#####'", "'######'", "'####'"
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


    // $ANTLR start "entryRuleTextExpression"
    // InternalHammilDSL.g:104:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:105:1: ( ruleTextExpression EOF )
            // InternalHammilDSL.g:106:1: ruleTextExpression EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalHammilDSL.g:113:1: ruleTextExpression : ( ruleTextualExpression ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:117:2: ( ( ruleTextualExpression ) )
            // InternalHammilDSL.g:118:2: ( ruleTextualExpression )
            {
            // InternalHammilDSL.g:118:2: ( ruleTextualExpression )
            // InternalHammilDSL.g:119:3: ruleTextualExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleTextualExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall()); 
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalHammilDSL.g:129:1: entryRuleEmphasisExpression : ruleEmphasisExpression EOF ;
    public final void entryRuleEmphasisExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:130:1: ( ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:131:1: ruleEmphasisExpression EOF
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
    // InternalHammilDSL.g:138:1: ruleEmphasisExpression : ( ruleTextualExpression ) ;
    public final void ruleEmphasisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:142:2: ( ( ruleTextualExpression ) )
            // InternalHammilDSL.g:143:2: ( ruleTextualExpression )
            {
            // InternalHammilDSL.g:143:2: ( ruleTextualExpression )
            // InternalHammilDSL.g:144:3: ruleTextualExpression
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
    // InternalHammilDSL.g:154:1: entryRuleHeaderDepth1Expression : ruleHeaderDepth1Expression EOF ;
    public final void entryRuleHeaderDepth1Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:158:1: ( ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:159:1: ruleHeaderDepth1Expression EOF
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
    // InternalHammilDSL.g:169:1: ruleHeaderDepth1Expression : ( ( rule__HeaderDepth1Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth1Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:174:2: ( ( ( rule__HeaderDepth1Expression__Alternatives ) ) )
            // InternalHammilDSL.g:175:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:175:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            // InternalHammilDSL.g:176:3: ( rule__HeaderDepth1Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:177:3: ( rule__HeaderDepth1Expression__Alternatives )
            // InternalHammilDSL.g:177:4: rule__HeaderDepth1Expression__Alternatives
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


    // $ANTLR start "entryRuleHeaderDepth2Expression"
    // InternalHammilDSL.g:187:1: entryRuleHeaderDepth2Expression : ruleHeaderDepth2Expression EOF ;
    public final void entryRuleHeaderDepth2Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:191:1: ( ruleHeaderDepth2Expression EOF )
            // InternalHammilDSL.g:192:1: ruleHeaderDepth2Expression EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderDepth2Expression"


    // $ANTLR start "ruleHeaderDepth2Expression"
    // InternalHammilDSL.g:202:1: ruleHeaderDepth2Expression : ( ( rule__HeaderDepth2Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth2Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:207:2: ( ( ( rule__HeaderDepth2Expression__Alternatives ) ) )
            // InternalHammilDSL.g:208:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:208:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            // InternalHammilDSL.g:209:3: ( rule__HeaderDepth2Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getAlternatives()); 
            }
            // InternalHammilDSL.g:210:3: ( rule__HeaderDepth2Expression__Alternatives )
            // InternalHammilDSL.g:210:4: rule__HeaderDepth2Expression__Alternatives
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleHeaderDepth2Expression"


    // $ANTLR start "entryRuleHeaderDepth3Expression"
    // InternalHammilDSL.g:220:1: entryRuleHeaderDepth3Expression : ruleHeaderDepth3Expression EOF ;
    public final void entryRuleHeaderDepth3Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:224:1: ( ruleHeaderDepth3Expression EOF )
            // InternalHammilDSL.g:225:1: ruleHeaderDepth3Expression EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderDepth3Expression"


    // $ANTLR start "ruleHeaderDepth3Expression"
    // InternalHammilDSL.g:235:1: ruleHeaderDepth3Expression : ( ( rule__HeaderDepth3Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth3Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:240:2: ( ( ( rule__HeaderDepth3Expression__Group__0 ) ) )
            // InternalHammilDSL.g:241:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:241:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            // InternalHammilDSL.g:242:3: ( rule__HeaderDepth3Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:243:3: ( rule__HeaderDepth3Expression__Group__0 )
            // InternalHammilDSL.g:243:4: rule__HeaderDepth3Expression__Group__0
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleHeaderDepth3Expression"


    // $ANTLR start "entryRuleHeaderDepth5Expression"
    // InternalHammilDSL.g:253:1: entryRuleHeaderDepth5Expression : ruleHeaderDepth5Expression EOF ;
    public final void entryRuleHeaderDepth5Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:257:1: ( ruleHeaderDepth5Expression EOF )
            // InternalHammilDSL.g:258:1: ruleHeaderDepth5Expression EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderDepth5Expression"


    // $ANTLR start "ruleHeaderDepth5Expression"
    // InternalHammilDSL.g:268:1: ruleHeaderDepth5Expression : ( ( rule__HeaderDepth5Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth5Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:273:2: ( ( ( rule__HeaderDepth5Expression__Group__0 ) ) )
            // InternalHammilDSL.g:274:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:274:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            // InternalHammilDSL.g:275:3: ( rule__HeaderDepth5Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:276:3: ( rule__HeaderDepth5Expression__Group__0 )
            // InternalHammilDSL.g:276:4: rule__HeaderDepth5Expression__Group__0
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleHeaderDepth5Expression"


    // $ANTLR start "entryRuleHeaderDepth6Expression"
    // InternalHammilDSL.g:286:1: entryRuleHeaderDepth6Expression : ruleHeaderDepth6Expression EOF ;
    public final void entryRuleHeaderDepth6Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:290:1: ( ruleHeaderDepth6Expression EOF )
            // InternalHammilDSL.g:291:1: ruleHeaderDepth6Expression EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderDepth6Expression"


    // $ANTLR start "ruleHeaderDepth6Expression"
    // InternalHammilDSL.g:301:1: ruleHeaderDepth6Expression : ( ( rule__HeaderDepth6Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth6Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:306:2: ( ( ( rule__HeaderDepth6Expression__Group__0 ) ) )
            // InternalHammilDSL.g:307:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:307:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            // InternalHammilDSL.g:308:3: ( rule__HeaderDepth6Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:309:3: ( rule__HeaderDepth6Expression__Group__0 )
            // InternalHammilDSL.g:309:4: rule__HeaderDepth6Expression__Group__0
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleHeaderDepth6Expression"


    // $ANTLR start "entryRuleHeaderDepth4Expression"
    // InternalHammilDSL.g:319:1: entryRuleHeaderDepth4Expression : ruleHeaderDepth4Expression EOF ;
    public final void entryRuleHeaderDepth4Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:323:1: ( ruleHeaderDepth4Expression EOF )
            // InternalHammilDSL.g:324:1: ruleHeaderDepth4Expression EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderDepth4Expression"


    // $ANTLR start "ruleHeaderDepth4Expression"
    // InternalHammilDSL.g:334:1: ruleHeaderDepth4Expression : ( ( rule__HeaderDepth4Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth4Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:339:2: ( ( ( rule__HeaderDepth4Expression__Group__0 ) ) )
            // InternalHammilDSL.g:340:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:340:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            // InternalHammilDSL.g:341:3: ( rule__HeaderDepth4Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getGroup()); 
            }
            // InternalHammilDSL.g:342:3: ( rule__HeaderDepth4Expression__Group__0 )
            // InternalHammilDSL.g:342:4: rule__HeaderDepth4Expression__Group__0
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleHeaderDepth4Expression"


    // $ANTLR start "entryRuleTextualExpression"
    // InternalHammilDSL.g:352:1: entryRuleTextualExpression : ruleTextualExpression EOF ;
    public final void entryRuleTextualExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:353:1: ( ruleTextualExpression EOF )
            // InternalHammilDSL.g:354:1: ruleTextualExpression EOF
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
    // InternalHammilDSL.g:361:1: ruleTextualExpression : ( ( rule__TextualExpression__ContentStringAssignment ) ) ;
    public final void ruleTextualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:365:2: ( ( ( rule__TextualExpression__ContentStringAssignment ) ) )
            // InternalHammilDSL.g:366:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            {
            // InternalHammilDSL.g:366:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            // InternalHammilDSL.g:367:3: ( rule__TextualExpression__ContentStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); 
            }
            // InternalHammilDSL.g:368:3: ( rule__TextualExpression__ContentStringAssignment )
            // InternalHammilDSL.g:368:4: rule__TextualExpression__ContentStringAssignment
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
    // InternalHammilDSL.g:377:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalHammilDSL.g:378:1: ( ruleString0 EOF )
            // InternalHammilDSL.g:379:1: ruleString0 EOF
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
    // InternalHammilDSL.g:386:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:390:2: ( ( RULE_STRING ) )
            // InternalHammilDSL.g:391:2: ( RULE_STRING )
            {
            // InternalHammilDSL.g:391:2: ( RULE_STRING )
            // InternalHammilDSL.g:392:3: RULE_STRING
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
    // InternalHammilDSL.g:401:1: rule__Expression__Alternatives : ( ( ruleTextualExpression ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:405:1: ( ( ruleTextualExpression ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_BL) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_STRING||LA1_1==15||LA1_1==17||(LA1_1>=19 && LA1_1<=22)) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==15||LA1_0==17||(LA1_0>=19 && LA1_0<=22)) ) {
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
                    // InternalHammilDSL.g:406:2: ( ruleTextualExpression )
                    {
                    // InternalHammilDSL.g:406:2: ( ruleTextualExpression )
                    // InternalHammilDSL.g:407:3: ruleTextualExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getTextualExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTextualExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getTextualExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:412:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:412:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:413:3: ( rule__Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:414:3: ( rule__Expression__Group_1__0 )
                    // InternalHammilDSL.g:414:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getGroup_1()); 
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


    // $ANTLR start "rule__Expression__Alternatives_1_0"
    // InternalHammilDSL.g:422:1: rule__Expression__Alternatives_1_0 : ( ( ruleHeaderDepth1Expression ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:426:1: ( ( ruleHeaderDepth1Expression ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) )
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

                    if ( (LA2_8==18) ) {
                        alt2=2;
                    }
                    else if ( (LA2_8==16) ) {
                        alt2=1;
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
            case 19:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
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
                    // InternalHammilDSL.g:427:2: ( ruleHeaderDepth1Expression )
                    {
                    // InternalHammilDSL.g:427:2: ( ruleHeaderDepth1Expression )
                    // InternalHammilDSL.g:428:3: ruleHeaderDepth1Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth1Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:433:2: ( ruleHeaderDepth2Expression )
                    {
                    // InternalHammilDSL.g:433:2: ( ruleHeaderDepth2Expression )
                    // InternalHammilDSL.g:434:3: ruleHeaderDepth2Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth2Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:439:2: ( ruleHeaderDepth3Expression )
                    {
                    // InternalHammilDSL.g:439:2: ( ruleHeaderDepth3Expression )
                    // InternalHammilDSL.g:440:3: ruleHeaderDepth3Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_1_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth3Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalHammilDSL.g:445:2: ( ruleHeaderDepth4Expression )
                    {
                    // InternalHammilDSL.g:445:2: ( ruleHeaderDepth4Expression )
                    // InternalHammilDSL.g:446:3: ruleHeaderDepth4Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_1_0_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth4Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalHammilDSL.g:451:2: ( ruleHeaderDepth5Expression )
                    {
                    // InternalHammilDSL.g:451:2: ( ruleHeaderDepth5Expression )
                    // InternalHammilDSL.g:452:3: ruleHeaderDepth5Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_1_0_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth5Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalHammilDSL.g:457:2: ( ruleHeaderDepth6Expression )
                    {
                    // InternalHammilDSL.g:457:2: ( ruleHeaderDepth6Expression )
                    // InternalHammilDSL.g:458:3: ruleHeaderDepth6Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_1_0_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth6Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_1_0_5()); 
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
    // $ANTLR end "rule__Expression__Alternatives_1_0"


    // $ANTLR start "rule__HeaderDepth1Expression__Alternatives"
    // InternalHammilDSL.g:467:1: rule__HeaderDepth1Expression__Alternatives : ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth1Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:471:1: ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
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
                    // InternalHammilDSL.g:472:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:472:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:473:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:474:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    // InternalHammilDSL.g:474:4: rule__HeaderDepth1Expression__Group_0__0
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
                    // InternalHammilDSL.g:478:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:478:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:479:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:480:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    // InternalHammilDSL.g:480:4: rule__HeaderDepth1Expression__Group_1__0
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
    // InternalHammilDSL.g:488:1: rule__HeaderDepth2Expression__Alternatives : ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth2Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:492:1: ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
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
                    // InternalHammilDSL.g:493:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:493:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:494:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_0()); 
                    }
                    // InternalHammilDSL.g:495:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    // InternalHammilDSL.g:495:4: rule__HeaderDepth2Expression__Group_0__0
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
                    // InternalHammilDSL.g:499:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:499:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:500:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_1()); 
                    }
                    // InternalHammilDSL.g:501:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    // InternalHammilDSL.g:501:4: rule__HeaderDepth2Expression__Group_1__0
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
    // InternalHammilDSL.g:509:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:513:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalHammilDSL.g:514:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalHammilDSL.g:521:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:525:1: ( ( () ) )
            // InternalHammilDSL.g:526:1: ( () )
            {
            // InternalHammilDSL.g:526:1: ( () )
            // InternalHammilDSL.g:527:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalHammilDSL.g:528:2: ()
            // InternalHammilDSL.g:528:3: 
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
    // InternalHammilDSL.g:536:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:540:1: ( rule__File__Group__1__Impl )
            // InternalHammilDSL.g:541:2: rule__File__Group__1__Impl
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
    // InternalHammilDSL.g:547:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:551:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalHammilDSL.g:552:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalHammilDSL.g:552:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalHammilDSL.g:553:2: ( rule__File__ExpressionAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            }
            // InternalHammilDSL.g:554:2: ( rule__File__ExpressionAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==15||LA5_0==17||(LA5_0>=19 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHammilDSL.g:554:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalHammilDSL.g:563:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:567:1: ( rule__Expression__Group_1__0__Impl )
            // InternalHammilDSL.g:568:2: rule__Expression__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__0__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalHammilDSL.g:574:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:578:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalHammilDSL.g:579:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalHammilDSL.g:579:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalHammilDSL.g:580:2: ( rule__Expression__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            }
            // InternalHammilDSL.g:581:2: ( rule__Expression__Alternatives_1_0 )
            // InternalHammilDSL.g:581:3: rule__Expression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__0"
    // InternalHammilDSL.g:590:1: rule__HeaderDepth1Expression__Group_0__0 : rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 ;
    public final void rule__HeaderDepth1Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:594:1: ( rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 )
            // InternalHammilDSL.g:595:2: rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1
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
    // InternalHammilDSL.g:602:1: rule__HeaderDepth1Expression__Group_0__0__Impl : ( ( '#' ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:606:1: ( ( ( '#' ) ) )
            // InternalHammilDSL.g:607:1: ( ( '#' ) )
            {
            // InternalHammilDSL.g:607:1: ( ( '#' ) )
            // InternalHammilDSL.g:608:2: ( '#' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0()); 
            }
            // InternalHammilDSL.g:609:2: ( '#' )
            // InternalHammilDSL.g:609:3: '#'
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
    // InternalHammilDSL.g:617:1: rule__HeaderDepth1Expression__Group_0__1 : rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 ;
    public final void rule__HeaderDepth1Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:621:1: ( rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 )
            // InternalHammilDSL.g:622:2: rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2
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
    // InternalHammilDSL.g:629:1: rule__HeaderDepth1Expression__Group_0__1__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:633:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) ) )
            // InternalHammilDSL.g:634:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:634:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) )
            // InternalHammilDSL.g:635:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_1()); 
            }
            // InternalHammilDSL.g:636:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_1 )
            // InternalHammilDSL.g:636:3: rule__HeaderDepth1Expression__TitleAssignment_0_1
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
    // InternalHammilDSL.g:644:1: rule__HeaderDepth1Expression__Group_0__2 : rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 ;
    public final void rule__HeaderDepth1Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:648:1: ( rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 )
            // InternalHammilDSL.g:649:2: rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3
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
    // InternalHammilDSL.g:656:1: rule__HeaderDepth1Expression__Group_0__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth1Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:660:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:661:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:661:1: ( ( '#' )* )
            // InternalHammilDSL.g:662:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2()); 
            }
            // InternalHammilDSL.g:663:2: ( '#' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==EOF||LA6_2==RULE_BL||LA6_2==15||LA6_2==17||(LA6_2>=19 && LA6_2<=22)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==RULE_STRING) ) {
                        int LA6_4 = input.LA(3);

                        if ( (synpred10_InternalHammilDSL()) ) {
                            alt6=1;
                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalHammilDSL.g:663:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalHammilDSL.g:671:1: rule__HeaderDepth1Expression__Group_0__3 : rule__HeaderDepth1Expression__Group_0__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:675:1: ( rule__HeaderDepth1Expression__Group_0__3__Impl )
            // InternalHammilDSL.g:676:2: rule__HeaderDepth1Expression__Group_0__3__Impl
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
    // InternalHammilDSL.g:682:1: rule__HeaderDepth1Expression__Group_0__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:686:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:687:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:687:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:688:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            }
            // InternalHammilDSL.g:689:2: ( RULE_BL )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHammilDSL.g:689:3: RULE_BL
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
    // InternalHammilDSL.g:698:1: rule__HeaderDepth1Expression__Group_1__0 : rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 ;
    public final void rule__HeaderDepth1Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:702:1: ( rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 )
            // InternalHammilDSL.g:703:2: rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1
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
    // InternalHammilDSL.g:710:1: rule__HeaderDepth1Expression__Group_1__0__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:714:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:715:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:715:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:716:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); 
            }
            // InternalHammilDSL.g:717:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:717:3: rule__HeaderDepth1Expression__TitleAssignment_1_0
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
    // InternalHammilDSL.g:725:1: rule__HeaderDepth1Expression__Group_1__1 : rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 ;
    public final void rule__HeaderDepth1Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:729:1: ( rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 )
            // InternalHammilDSL.g:730:2: rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2
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
    // InternalHammilDSL.g:737:1: rule__HeaderDepth1Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth1Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:741:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:742:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:742:1: ( RULE_BL )
            // InternalHammilDSL.g:743:2: RULE_BL
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
    // InternalHammilDSL.g:752:1: rule__HeaderDepth1Expression__Group_1__2 : rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 ;
    public final void rule__HeaderDepth1Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:756:1: ( rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 )
            // InternalHammilDSL.g:757:2: rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3
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
    // InternalHammilDSL.g:764:1: rule__HeaderDepth1Expression__Group_1__2__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:768:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // InternalHammilDSL.g:769:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // InternalHammilDSL.g:769:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // InternalHammilDSL.g:770:2: ( ( '=' ) ) ( ( '=' )* )
            {
            // InternalHammilDSL.g:770:2: ( ( '=' ) )
            // InternalHammilDSL.g:771:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }
            // InternalHammilDSL.g:772:3: ( '=' )
            // InternalHammilDSL.g:772:4: '='
            {
            match(input,16,FOLLOW_10); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }

            }

            // InternalHammilDSL.g:775:2: ( ( '=' )* )
            // InternalHammilDSL.g:776:3: ( '=' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            }
            // InternalHammilDSL.g:777:3: ( '=' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHammilDSL.g:777:4: '='
            	    {
            	    match(input,16,FOLLOW_10); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalHammilDSL.g:786:1: rule__HeaderDepth1Expression__Group_1__3 : rule__HeaderDepth1Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:790:1: ( rule__HeaderDepth1Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:791:2: rule__HeaderDepth1Expression__Group_1__3__Impl
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
    // InternalHammilDSL.g:797:1: rule__HeaderDepth1Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:801:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:802:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:802:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:803:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            }
            // InternalHammilDSL.g:804:2: ( RULE_BL )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_BL) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalHammilDSL.g:804:3: RULE_BL
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
    // InternalHammilDSL.g:813:1: rule__HeaderDepth2Expression__Group_0__0 : rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 ;
    public final void rule__HeaderDepth2Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:817:1: ( rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 )
            // InternalHammilDSL.g:818:2: rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:825:1: rule__HeaderDepth2Expression__Group_0__0__Impl : ( ( '##' ) ) ;
    public final void rule__HeaderDepth2Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:829:1: ( ( ( '##' ) ) )
            // InternalHammilDSL.g:830:1: ( ( '##' ) )
            {
            // InternalHammilDSL.g:830:1: ( ( '##' ) )
            // InternalHammilDSL.g:831:2: ( '##' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0()); 
            }
            // InternalHammilDSL.g:832:2: ( '##' )
            // InternalHammilDSL.g:832:3: '##'
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
    // InternalHammilDSL.g:840:1: rule__HeaderDepth2Expression__Group_0__1 : rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 ;
    public final void rule__HeaderDepth2Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:844:1: ( rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 )
            // InternalHammilDSL.g:845:2: rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:852:1: rule__HeaderDepth2Expression__Group_0__1__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:856:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) )
            // InternalHammilDSL.g:857:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:857:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            // InternalHammilDSL.g:858:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_0_1()); 
            }
            // InternalHammilDSL.g:859:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            // InternalHammilDSL.g:859:3: rule__HeaderDepth2Expression__TitleAssignment_0_1
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
    // InternalHammilDSL.g:867:1: rule__HeaderDepth2Expression__Group_0__2 : rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 ;
    public final void rule__HeaderDepth2Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:871:1: ( rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 )
            // InternalHammilDSL.g:872:2: rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:879:1: rule__HeaderDepth2Expression__Group_0__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth2Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:883:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:884:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:884:1: ( ( '#' )* )
            // InternalHammilDSL.g:885:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2()); 
            }
            // InternalHammilDSL.g:886:2: ( '#' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==EOF||LA10_2==RULE_BL||LA10_2==15||LA10_2==17||(LA10_2>=19 && LA10_2<=22)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==RULE_STRING) ) {
                        int LA10_4 = input.LA(3);

                        if ( (synpred14_InternalHammilDSL()) ) {
                            alt10=1;
                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalHammilDSL.g:886:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalHammilDSL.g:894:1: rule__HeaderDepth2Expression__Group_0__3 : rule__HeaderDepth2Expression__Group_0__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:898:1: ( rule__HeaderDepth2Expression__Group_0__3__Impl )
            // InternalHammilDSL.g:899:2: rule__HeaderDepth2Expression__Group_0__3__Impl
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
    // InternalHammilDSL.g:905:1: rule__HeaderDepth2Expression__Group_0__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:909:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:910:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:910:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:911:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            }
            // InternalHammilDSL.g:912:2: ( RULE_BL )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_BL) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHammilDSL.g:912:3: RULE_BL
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
    // InternalHammilDSL.g:921:1: rule__HeaderDepth2Expression__Group_1__0 : rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 ;
    public final void rule__HeaderDepth2Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:925:1: ( rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 )
            // InternalHammilDSL.g:926:2: rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalHammilDSL.g:933:1: rule__HeaderDepth2Expression__Group_1__0__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:937:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:938:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:938:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:939:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_1_0()); 
            }
            // InternalHammilDSL.g:940:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:940:3: rule__HeaderDepth2Expression__TitleAssignment_1_0
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
    // InternalHammilDSL.g:948:1: rule__HeaderDepth2Expression__Group_1__1 : rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 ;
    public final void rule__HeaderDepth2Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:952:1: ( rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 )
            // InternalHammilDSL.g:953:2: rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalHammilDSL.g:960:1: rule__HeaderDepth2Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth2Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:964:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:965:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:965:1: ( RULE_BL )
            // InternalHammilDSL.g:966:2: RULE_BL
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
    // InternalHammilDSL.g:975:1: rule__HeaderDepth2Expression__Group_1__2 : rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 ;
    public final void rule__HeaderDepth2Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:979:1: ( rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 )
            // InternalHammilDSL.g:980:2: rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalHammilDSL.g:987:1: rule__HeaderDepth2Expression__Group_1__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:991:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalHammilDSL.g:992:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalHammilDSL.g:992:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalHammilDSL.g:993:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalHammilDSL.g:993:2: ( ( '-' ) )
            // InternalHammilDSL.g:994:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            }
            // InternalHammilDSL.g:995:3: ( '-' )
            // InternalHammilDSL.g:995:4: '-'
            {
            match(input,18,FOLLOW_12); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            }

            }

            // InternalHammilDSL.g:998:2: ( ( '-' )* )
            // InternalHammilDSL.g:999:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            }
            // InternalHammilDSL.g:1000:3: ( '-' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHammilDSL.g:1000:4: '-'
            	    {
            	    match(input,18,FOLLOW_12); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalHammilDSL.g:1009:1: rule__HeaderDepth2Expression__Group_1__3 : rule__HeaderDepth2Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1013:1: ( rule__HeaderDepth2Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:1014:2: rule__HeaderDepth2Expression__Group_1__3__Impl
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
    // InternalHammilDSL.g:1020:1: rule__HeaderDepth2Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1024:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1025:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1025:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1026:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            }
            // InternalHammilDSL.g:1027:2: ( RULE_BL )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHammilDSL.g:1027:3: RULE_BL
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
    // InternalHammilDSL.g:1036:1: rule__HeaderDepth3Expression__Group__0 : rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 ;
    public final void rule__HeaderDepth3Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1040:1: ( rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 )
            // InternalHammilDSL.g:1041:2: rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:1048:1: rule__HeaderDepth3Expression__Group__0__Impl : ( '###' ) ;
    public final void rule__HeaderDepth3Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1052:1: ( ( '###' ) )
            // InternalHammilDSL.g:1053:1: ( '###' )
            {
            // InternalHammilDSL.g:1053:1: ( '###' )
            // InternalHammilDSL.g:1054:2: '###'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:1063:1: rule__HeaderDepth3Expression__Group__1 : rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 ;
    public final void rule__HeaderDepth3Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1067:1: ( rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 )
            // InternalHammilDSL.g:1068:2: rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1075:1: rule__HeaderDepth3Expression__Group__1__Impl : ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth3Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1079:1: ( ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1080:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1080:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1081:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:1082:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1082:3: rule__HeaderDepth3Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1090:1: rule__HeaderDepth3Expression__Group__2 : rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 ;
    public final void rule__HeaderDepth3Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1094:1: ( rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 )
            // InternalHammilDSL.g:1095:2: rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1102:1: rule__HeaderDepth3Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth3Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1106:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1107:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1107:1: ( ( '#' )* )
            // InternalHammilDSL.g:1108:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:1109:2: ( '#' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_STRING) ) {
                        int LA14_3 = input.LA(3);

                        if ( (synpred18_InternalHammilDSL()) ) {
                            alt14=1;
                        }


                    }
                    else if ( (LA14_2==EOF||LA14_2==RULE_BL||LA14_2==15||LA14_2==17||(LA14_2>=19 && LA14_2<=22)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalHammilDSL.g:1109:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalHammilDSL.g:1117:1: rule__HeaderDepth3Expression__Group__3 : rule__HeaderDepth3Expression__Group__3__Impl ;
    public final void rule__HeaderDepth3Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1121:1: ( rule__HeaderDepth3Expression__Group__3__Impl )
            // InternalHammilDSL.g:1122:2: rule__HeaderDepth3Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1128:1: rule__HeaderDepth3Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth3Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1132:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1133:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1133:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1134:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:1135:2: ( RULE_BL )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHammilDSL.g:1135:3: RULE_BL
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
    // InternalHammilDSL.g:1144:1: rule__HeaderDepth5Expression__Group__0 : rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 ;
    public final void rule__HeaderDepth5Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1148:1: ( rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 )
            // InternalHammilDSL.g:1149:2: rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:1156:1: rule__HeaderDepth5Expression__Group__0__Impl : ( '#####' ) ;
    public final void rule__HeaderDepth5Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1160:1: ( ( '#####' ) )
            // InternalHammilDSL.g:1161:1: ( '#####' )
            {
            // InternalHammilDSL.g:1161:1: ( '#####' )
            // InternalHammilDSL.g:1162:2: '#####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:1171:1: rule__HeaderDepth5Expression__Group__1 : rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 ;
    public final void rule__HeaderDepth5Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1175:1: ( rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 )
            // InternalHammilDSL.g:1176:2: rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1183:1: rule__HeaderDepth5Expression__Group__1__Impl : ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth5Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1187:1: ( ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1188:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1188:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1189:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:1190:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1190:3: rule__HeaderDepth5Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1198:1: rule__HeaderDepth5Expression__Group__2 : rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 ;
    public final void rule__HeaderDepth5Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1202:1: ( rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 )
            // InternalHammilDSL.g:1203:2: rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1210:1: rule__HeaderDepth5Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth5Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1214:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1215:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1215:1: ( ( '#' )* )
            // InternalHammilDSL.g:1216:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:1217:2: ( '#' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==RULE_STRING) ) {
                        int LA16_3 = input.LA(3);

                        if ( (synpred20_InternalHammilDSL()) ) {
                            alt16=1;
                        }


                    }
                    else if ( (LA16_2==EOF||LA16_2==RULE_BL||LA16_2==15||LA16_2==17||(LA16_2>=19 && LA16_2<=22)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalHammilDSL.g:1217:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalHammilDSL.g:1225:1: rule__HeaderDepth5Expression__Group__3 : rule__HeaderDepth5Expression__Group__3__Impl ;
    public final void rule__HeaderDepth5Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1229:1: ( rule__HeaderDepth5Expression__Group__3__Impl )
            // InternalHammilDSL.g:1230:2: rule__HeaderDepth5Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1236:1: rule__HeaderDepth5Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth5Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1240:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1241:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1241:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1242:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:1243:2: ( RULE_BL )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_BL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalHammilDSL.g:1243:3: RULE_BL
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
    // InternalHammilDSL.g:1252:1: rule__HeaderDepth6Expression__Group__0 : rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 ;
    public final void rule__HeaderDepth6Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1256:1: ( rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 )
            // InternalHammilDSL.g:1257:2: rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:1264:1: rule__HeaderDepth6Expression__Group__0__Impl : ( '######' ) ;
    public final void rule__HeaderDepth6Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1268:1: ( ( '######' ) )
            // InternalHammilDSL.g:1269:1: ( '######' )
            {
            // InternalHammilDSL.g:1269:1: ( '######' )
            // InternalHammilDSL.g:1270:2: '######'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:1279:1: rule__HeaderDepth6Expression__Group__1 : rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 ;
    public final void rule__HeaderDepth6Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1283:1: ( rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 )
            // InternalHammilDSL.g:1284:2: rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1291:1: rule__HeaderDepth6Expression__Group__1__Impl : ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth6Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1295:1: ( ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1296:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1296:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1297:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:1298:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1298:3: rule__HeaderDepth6Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1306:1: rule__HeaderDepth6Expression__Group__2 : rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 ;
    public final void rule__HeaderDepth6Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1310:1: ( rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 )
            // InternalHammilDSL.g:1311:2: rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1318:1: rule__HeaderDepth6Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth6Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1322:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1323:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1323:1: ( ( '#' )* )
            // InternalHammilDSL.g:1324:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:1325:2: ( '#' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==EOF||LA18_2==RULE_BL||LA18_2==15||LA18_2==17||(LA18_2>=19 && LA18_2<=22)) ) {
                        alt18=1;
                    }
                    else if ( (LA18_2==RULE_STRING) ) {
                        int LA18_4 = input.LA(3);

                        if ( (synpred22_InternalHammilDSL()) ) {
                            alt18=1;
                        }


                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalHammilDSL.g:1325:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalHammilDSL.g:1333:1: rule__HeaderDepth6Expression__Group__3 : rule__HeaderDepth6Expression__Group__3__Impl ;
    public final void rule__HeaderDepth6Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1337:1: ( rule__HeaderDepth6Expression__Group__3__Impl )
            // InternalHammilDSL.g:1338:2: rule__HeaderDepth6Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1344:1: rule__HeaderDepth6Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth6Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1348:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1349:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1349:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1350:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:1351:2: ( RULE_BL )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_BL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHammilDSL.g:1351:3: RULE_BL
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
    // InternalHammilDSL.g:1360:1: rule__HeaderDepth4Expression__Group__0 : rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 ;
    public final void rule__HeaderDepth4Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1364:1: ( rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 )
            // InternalHammilDSL.g:1365:2: rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:1372:1: rule__HeaderDepth4Expression__Group__0__Impl : ( '####' ) ;
    public final void rule__HeaderDepth4Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1376:1: ( ( '####' ) )
            // InternalHammilDSL.g:1377:1: ( '####' )
            {
            // InternalHammilDSL.g:1377:1: ( '####' )
            // InternalHammilDSL.g:1378:2: '####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalHammilDSL.g:1387:1: rule__HeaderDepth4Expression__Group__1 : rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 ;
    public final void rule__HeaderDepth4Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1391:1: ( rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 )
            // InternalHammilDSL.g:1392:2: rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1399:1: rule__HeaderDepth4Expression__Group__1__Impl : ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth4Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1403:1: ( ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1404:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1404:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1405:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleAssignment_1()); 
            }
            // InternalHammilDSL.g:1406:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1406:3: rule__HeaderDepth4Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1414:1: rule__HeaderDepth4Expression__Group__2 : rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 ;
    public final void rule__HeaderDepth4Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1418:1: ( rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 )
            // InternalHammilDSL.g:1419:2: rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1426:1: rule__HeaderDepth4Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth4Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1430:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1431:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1431:1: ( ( '#' )* )
            // InternalHammilDSL.g:1432:2: ( '#' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2()); 
            }
            // InternalHammilDSL.g:1433:2: ( '#' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==EOF||LA20_2==RULE_BL||LA20_2==15||LA20_2==17||(LA20_2>=19 && LA20_2<=22)) ) {
                        alt20=1;
                    }
                    else if ( (LA20_2==RULE_STRING) ) {
                        int LA20_4 = input.LA(3);

                        if ( (synpred24_InternalHammilDSL()) ) {
                            alt20=1;
                        }


                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalHammilDSL.g:1433:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalHammilDSL.g:1441:1: rule__HeaderDepth4Expression__Group__3 : rule__HeaderDepth4Expression__Group__3__Impl ;
    public final void rule__HeaderDepth4Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1445:1: ( rule__HeaderDepth4Expression__Group__3__Impl )
            // InternalHammilDSL.g:1446:2: rule__HeaderDepth4Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1452:1: rule__HeaderDepth4Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth4Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1456:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1457:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1457:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1458:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalHammilDSL.g:1459:2: ( RULE_BL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_BL) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalHammilDSL.g:1459:3: RULE_BL
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
    // InternalHammilDSL.g:1468:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1472:1: ( ( ruleExpression ) )
            // InternalHammilDSL.g:1473:2: ( ruleExpression )
            {
            // InternalHammilDSL.g:1473:2: ( ruleExpression )
            // InternalHammilDSL.g:1474:3: ruleExpression
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
    // InternalHammilDSL.g:1483:1: rule__HeaderDepth1Expression__TitleAssignment_0_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1487:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1488:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1488:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1489:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1498:1: rule__HeaderDepth1Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1502:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1503:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1503:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1504:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1513:1: rule__HeaderDepth2Expression__TitleAssignment_0_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1517:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1518:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1518:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1519:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1528:1: rule__HeaderDepth2Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1532:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1533:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1533:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1534:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1543:1: rule__HeaderDepth3Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth3Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1547:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1548:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1548:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1549:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1558:1: rule__HeaderDepth5Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth5Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1562:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1563:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1563:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1564:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1573:1: rule__HeaderDepth6Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth6Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1577:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1578:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1578:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1579:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1588:1: rule__HeaderDepth4Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth4Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1592:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1593:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1593:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1594:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1603:1: rule__TextualExpression__ContentStringAssignment : ( ruleString0 ) ;
    public final void rule__TextualExpression__ContentStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1607:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:1608:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:1608:2: ( ruleString0 )
            // InternalHammilDSL.g:1609:3: ruleString0
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

    // $ANTLR start synpred10_InternalHammilDSL
    public final void synpred10_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:663:3: ( '#' )
        // InternalHammilDSL.g:663:3: '#'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalHammilDSL

    // $ANTLR start synpred14_InternalHammilDSL
    public final void synpred14_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:886:3: ( '#' )
        // InternalHammilDSL.g:886:3: '#'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalHammilDSL

    // $ANTLR start synpred18_InternalHammilDSL
    public final void synpred18_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:1109:3: ( '#' )
        // InternalHammilDSL.g:1109:3: '#'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalHammilDSL

    // $ANTLR start synpred20_InternalHammilDSL
    public final void synpred20_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:1217:3: ( '#' )
        // InternalHammilDSL.g:1217:3: '#'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalHammilDSL

    // $ANTLR start synpred22_InternalHammilDSL
    public final void synpred22_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:1325:3: ( '#' )
        // InternalHammilDSL.g:1325:3: '#'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHammilDSL

    // $ANTLR start synpred24_InternalHammilDSL
    public final void synpred24_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:1433:3: ( '#' )
        // InternalHammilDSL.g:1433:3: '#'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalHammilDSL

    // Delegated rules

    public final boolean synpred22_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHammilDSL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000007A8010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000007A8012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});

}