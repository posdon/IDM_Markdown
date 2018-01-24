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


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalHammilDSL.g:103:1: entryRuleEmphasisExpression : ruleEmphasisExpression EOF ;
    public final void entryRuleEmphasisExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:104:1: ( ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:105:1: ruleEmphasisExpression EOF
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
    // InternalHammilDSL.g:112:1: ruleEmphasisExpression : ( ruleTextualExpression ) ;
    public final void ruleEmphasisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:116:2: ( ( ruleTextualExpression ) )
            // InternalHammilDSL.g:117:2: ( ruleTextualExpression )
            {
            // InternalHammilDSL.g:117:2: ( ruleTextualExpression )
            // InternalHammilDSL.g:118:3: ruleTextualExpression
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


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHammilDSL.g:128:1: entryRuleHeaderDepth1Expression : ruleHeaderDepth1Expression EOF ;
    public final void entryRuleHeaderDepth1Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:132:1: ( ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:133:1: ruleHeaderDepth1Expression EOF
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
    // InternalHammilDSL.g:143:1: ruleHeaderDepth1Expression : ( ( rule__HeaderDepth1Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth1Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:148:2: ( ( ( rule__HeaderDepth1Expression__Alternatives ) ) )
            // InternalHammilDSL.g:149:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:149:2: ( ( rule__HeaderDepth1Expression__Alternatives ) )
            // InternalHammilDSL.g:150:3: ( rule__HeaderDepth1Expression__Alternatives )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getAlternatives()); 
            // InternalHammilDSL.g:151:3: ( rule__HeaderDepth1Expression__Alternatives )
            // InternalHammilDSL.g:151:4: rule__HeaderDepth1Expression__Alternatives
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
    // InternalHammilDSL.g:161:1: entryRuleHeaderDepth2Expression : ruleHeaderDepth2Expression EOF ;
    public final void entryRuleHeaderDepth2Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:165:1: ( ruleHeaderDepth2Expression EOF )
            // InternalHammilDSL.g:166:1: ruleHeaderDepth2Expression EOF
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
    // InternalHammilDSL.g:176:1: ruleHeaderDepth2Expression : ( ( rule__HeaderDepth2Expression__Alternatives ) ) ;
    public final void ruleHeaderDepth2Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:181:2: ( ( ( rule__HeaderDepth2Expression__Alternatives ) ) )
            // InternalHammilDSL.g:182:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            {
            // InternalHammilDSL.g:182:2: ( ( rule__HeaderDepth2Expression__Alternatives ) )
            // InternalHammilDSL.g:183:3: ( rule__HeaderDepth2Expression__Alternatives )
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getAlternatives()); 
            // InternalHammilDSL.g:184:3: ( rule__HeaderDepth2Expression__Alternatives )
            // InternalHammilDSL.g:184:4: rule__HeaderDepth2Expression__Alternatives
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
    // InternalHammilDSL.g:194:1: entryRuleHeaderDepth3Expression : ruleHeaderDepth3Expression EOF ;
    public final void entryRuleHeaderDepth3Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:198:1: ( ruleHeaderDepth3Expression EOF )
            // InternalHammilDSL.g:199:1: ruleHeaderDepth3Expression EOF
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
    // InternalHammilDSL.g:209:1: ruleHeaderDepth3Expression : ( ( rule__HeaderDepth3Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth3Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:214:2: ( ( ( rule__HeaderDepth3Expression__Group__0 ) ) )
            // InternalHammilDSL.g:215:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:215:2: ( ( rule__HeaderDepth3Expression__Group__0 ) )
            // InternalHammilDSL.g:216:3: ( rule__HeaderDepth3Expression__Group__0 )
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getGroup()); 
            // InternalHammilDSL.g:217:3: ( rule__HeaderDepth3Expression__Group__0 )
            // InternalHammilDSL.g:217:4: rule__HeaderDepth3Expression__Group__0
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
    // InternalHammilDSL.g:227:1: entryRuleHeaderDepth5Expression : ruleHeaderDepth5Expression EOF ;
    public final void entryRuleHeaderDepth5Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:231:1: ( ruleHeaderDepth5Expression EOF )
            // InternalHammilDSL.g:232:1: ruleHeaderDepth5Expression EOF
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
    // InternalHammilDSL.g:242:1: ruleHeaderDepth5Expression : ( ( rule__HeaderDepth5Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth5Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:247:2: ( ( ( rule__HeaderDepth5Expression__Group__0 ) ) )
            // InternalHammilDSL.g:248:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:248:2: ( ( rule__HeaderDepth5Expression__Group__0 ) )
            // InternalHammilDSL.g:249:3: ( rule__HeaderDepth5Expression__Group__0 )
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getGroup()); 
            // InternalHammilDSL.g:250:3: ( rule__HeaderDepth5Expression__Group__0 )
            // InternalHammilDSL.g:250:4: rule__HeaderDepth5Expression__Group__0
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
    // InternalHammilDSL.g:260:1: entryRuleHeaderDepth6Expression : ruleHeaderDepth6Expression EOF ;
    public final void entryRuleHeaderDepth6Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:264:1: ( ruleHeaderDepth6Expression EOF )
            // InternalHammilDSL.g:265:1: ruleHeaderDepth6Expression EOF
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
    // InternalHammilDSL.g:275:1: ruleHeaderDepth6Expression : ( ( rule__HeaderDepth6Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth6Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:280:2: ( ( ( rule__HeaderDepth6Expression__Group__0 ) ) )
            // InternalHammilDSL.g:281:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:281:2: ( ( rule__HeaderDepth6Expression__Group__0 ) )
            // InternalHammilDSL.g:282:3: ( rule__HeaderDepth6Expression__Group__0 )
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getGroup()); 
            // InternalHammilDSL.g:283:3: ( rule__HeaderDepth6Expression__Group__0 )
            // InternalHammilDSL.g:283:4: rule__HeaderDepth6Expression__Group__0
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
    // InternalHammilDSL.g:293:1: entryRuleHeaderDepth4Expression : ruleHeaderDepth4Expression EOF ;
    public final void entryRuleHeaderDepth4Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:297:1: ( ruleHeaderDepth4Expression EOF )
            // InternalHammilDSL.g:298:1: ruleHeaderDepth4Expression EOF
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
    // InternalHammilDSL.g:308:1: ruleHeaderDepth4Expression : ( ( rule__HeaderDepth4Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth4Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:313:2: ( ( ( rule__HeaderDepth4Expression__Group__0 ) ) )
            // InternalHammilDSL.g:314:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            {
            // InternalHammilDSL.g:314:2: ( ( rule__HeaderDepth4Expression__Group__0 ) )
            // InternalHammilDSL.g:315:3: ( rule__HeaderDepth4Expression__Group__0 )
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getGroup()); 
            // InternalHammilDSL.g:316:3: ( rule__HeaderDepth4Expression__Group__0 )
            // InternalHammilDSL.g:316:4: rule__HeaderDepth4Expression__Group__0
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
    // InternalHammilDSL.g:326:1: entryRuleTextualExpression : ruleTextualExpression EOF ;
    public final void entryRuleTextualExpression() throws RecognitionException {
        try {
            // InternalHammilDSL.g:327:1: ( ruleTextualExpression EOF )
            // InternalHammilDSL.g:328:1: ruleTextualExpression EOF
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
    // InternalHammilDSL.g:335:1: ruleTextualExpression : ( ( rule__TextualExpression__ContentStringAssignment ) ) ;
    public final void ruleTextualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:339:2: ( ( ( rule__TextualExpression__ContentStringAssignment ) ) )
            // InternalHammilDSL.g:340:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            {
            // InternalHammilDSL.g:340:2: ( ( rule__TextualExpression__ContentStringAssignment ) )
            // InternalHammilDSL.g:341:3: ( rule__TextualExpression__ContentStringAssignment )
            {
             before(grammarAccess.getTextualExpressionAccess().getContentStringAssignment()); 
            // InternalHammilDSL.g:342:3: ( rule__TextualExpression__ContentStringAssignment )
            // InternalHammilDSL.g:342:4: rule__TextualExpression__ContentStringAssignment
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
    // InternalHammilDSL.g:351:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalHammilDSL.g:352:1: ( ruleString0 EOF )
            // InternalHammilDSL.g:353:1: ruleString0 EOF
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
    // InternalHammilDSL.g:360:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:364:2: ( ( RULE_STRING ) )
            // InternalHammilDSL.g:365:2: ( RULE_STRING )
            {
            // InternalHammilDSL.g:365:2: ( RULE_STRING )
            // InternalHammilDSL.g:366:3: RULE_STRING
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
    // InternalHammilDSL.g:375:1: rule__Expression__Alternatives : ( ( ruleHeaderDepth1Expression ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:379:1: ( ( ruleHeaderDepth1Expression ) | ( ruleHeaderDepth2Expression ) | ( ruleHeaderDepth3Expression ) | ( ruleHeaderDepth4Expression ) | ( ruleHeaderDepth5Expression ) | ( ruleHeaderDepth6Expression ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_BL) ) {
                    int LA1_8 = input.LA(3);

                    if ( (LA1_8==18) ) {
                        alt1=2;
                    }
                    else if ( (LA1_8==16) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 8, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            case 21:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHammilDSL.g:380:2: ( ruleHeaderDepth1Expression )
                    {
                    // InternalHammilDSL.g:380:2: ( ruleHeaderDepth1Expression )
                    // InternalHammilDSL.g:381:3: ruleHeaderDepth1Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth1Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:386:2: ( ruleHeaderDepth2Expression )
                    {
                    // InternalHammilDSL.g:386:2: ( ruleHeaderDepth2Expression )
                    // InternalHammilDSL.g:387:3: ruleHeaderDepth2Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth2Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:392:2: ( ruleHeaderDepth3Expression )
                    {
                    // InternalHammilDSL.g:392:2: ( ruleHeaderDepth3Expression )
                    // InternalHammilDSL.g:393:3: ruleHeaderDepth3Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth3Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHammilDSL.g:398:2: ( ruleHeaderDepth4Expression )
                    {
                    // InternalHammilDSL.g:398:2: ( ruleHeaderDepth4Expression )
                    // InternalHammilDSL.g:399:3: ruleHeaderDepth4Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth4Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHammilDSL.g:404:2: ( ruleHeaderDepth5Expression )
                    {
                    // InternalHammilDSL.g:404:2: ( ruleHeaderDepth5Expression )
                    // InternalHammilDSL.g:405:3: ruleHeaderDepth5Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth5Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHammilDSL.g:410:2: ( ruleHeaderDepth6Expression )
                    {
                    // InternalHammilDSL.g:410:2: ( ruleHeaderDepth6Expression )
                    // InternalHammilDSL.g:411:3: ruleHeaderDepth6Expression
                    {
                     before(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleHeaderDepth6Expression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_5()); 

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
    // InternalHammilDSL.g:420:1: rule__HeaderDepth1Expression__Alternatives : ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth1Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:424:1: ( ( ( rule__HeaderDepth1Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth1Expression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHammilDSL.g:425:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:425:2: ( ( rule__HeaderDepth1Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:426:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    {
                     before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_0()); 
                    // InternalHammilDSL.g:427:3: ( rule__HeaderDepth1Expression__Group_0__0 )
                    // InternalHammilDSL.g:427:4: rule__HeaderDepth1Expression__Group_0__0
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
                    // InternalHammilDSL.g:431:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:431:2: ( ( rule__HeaderDepth1Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:432:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    {
                     before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup_1()); 
                    // InternalHammilDSL.g:433:3: ( rule__HeaderDepth1Expression__Group_1__0 )
                    // InternalHammilDSL.g:433:4: rule__HeaderDepth1Expression__Group_1__0
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
    // InternalHammilDSL.g:441:1: rule__HeaderDepth2Expression__Alternatives : ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) );
    public final void rule__HeaderDepth2Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:445:1: ( ( ( rule__HeaderDepth2Expression__Group_0__0 ) ) | ( ( rule__HeaderDepth2Expression__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
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
                    // InternalHammilDSL.g:446:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    {
                    // InternalHammilDSL.g:446:2: ( ( rule__HeaderDepth2Expression__Group_0__0 ) )
                    // InternalHammilDSL.g:447:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    {
                     before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_0()); 
                    // InternalHammilDSL.g:448:3: ( rule__HeaderDepth2Expression__Group_0__0 )
                    // InternalHammilDSL.g:448:4: rule__HeaderDepth2Expression__Group_0__0
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
                    // InternalHammilDSL.g:452:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    {
                    // InternalHammilDSL.g:452:2: ( ( rule__HeaderDepth2Expression__Group_1__0 ) )
                    // InternalHammilDSL.g:453:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    {
                     before(grammarAccess.getHeaderDepth2ExpressionAccess().getGroup_1()); 
                    // InternalHammilDSL.g:454:3: ( rule__HeaderDepth2Expression__Group_1__0 )
                    // InternalHammilDSL.g:454:4: rule__HeaderDepth2Expression__Group_1__0
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
    // InternalHammilDSL.g:462:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:466:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalHammilDSL.g:467:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalHammilDSL.g:474:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:478:1: ( ( () ) )
            // InternalHammilDSL.g:479:1: ( () )
            {
            // InternalHammilDSL.g:479:1: ( () )
            // InternalHammilDSL.g:480:2: ()
            {
             before(grammarAccess.getFileAccess().getFileAction_0()); 
            // InternalHammilDSL.g:481:2: ()
            // InternalHammilDSL.g:481:3: 
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
    // InternalHammilDSL.g:489:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:493:1: ( rule__File__Group__1__Impl )
            // InternalHammilDSL.g:494:2: rule__File__Group__1__Impl
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
    // InternalHammilDSL.g:500:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:504:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalHammilDSL.g:505:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalHammilDSL.g:505:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalHammilDSL.g:506:2: ( rule__File__ExpressionAssignment_1 )*
            {
             before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            // InternalHammilDSL.g:507:2: ( rule__File__ExpressionAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||LA4_0==15||LA4_0==17||(LA4_0>=19 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHammilDSL.g:507:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "rule__HeaderDepth1Expression__Group_0__0"
    // InternalHammilDSL.g:516:1: rule__HeaderDepth1Expression__Group_0__0 : rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 ;
    public final void rule__HeaderDepth1Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:520:1: ( rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1 )
            // InternalHammilDSL.g:521:2: rule__HeaderDepth1Expression__Group_0__0__Impl rule__HeaderDepth1Expression__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:528:1: rule__HeaderDepth1Expression__Group_0__0__Impl : ( '#' ) ;
    public final void rule__HeaderDepth1Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:532:1: ( ( '#' ) )
            // InternalHammilDSL.g:533:1: ( '#' )
            {
            // InternalHammilDSL.g:533:1: ( '#' )
            // InternalHammilDSL.g:534:2: '#'
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalHammilDSL.g:543:1: rule__HeaderDepth1Expression__Group_0__1 : rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 ;
    public final void rule__HeaderDepth1Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:547:1: ( rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2 )
            // InternalHammilDSL.g:548:2: rule__HeaderDepth1Expression__Group_0__1__Impl rule__HeaderDepth1Expression__Group_0__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:555:1: rule__HeaderDepth1Expression__Group_0__1__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:559:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) ) )
            // InternalHammilDSL.g:560:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:560:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_0_1 ) )
            // InternalHammilDSL.g:561:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_1 )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_0_1()); 
            // InternalHammilDSL.g:562:2: ( rule__HeaderDepth1Expression__TitleAssignment_0_1 )
            // InternalHammilDSL.g:562:3: rule__HeaderDepth1Expression__TitleAssignment_0_1
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
    // InternalHammilDSL.g:570:1: rule__HeaderDepth1Expression__Group_0__2 : rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 ;
    public final void rule__HeaderDepth1Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:574:1: ( rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3 )
            // InternalHammilDSL.g:575:2: rule__HeaderDepth1Expression__Group_0__2__Impl rule__HeaderDepth1Expression__Group_0__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:582:1: rule__HeaderDepth1Expression__Group_0__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth1Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:586:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:587:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:587:1: ( ( '#' )* )
            // InternalHammilDSL.g:588:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2()); 
            // InternalHammilDSL.g:589:2: ( '#' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==EOF||LA5_2==RULE_BL||LA5_2==15||LA5_2==17||(LA5_2>=19 && LA5_2<=22)) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==RULE_STRING) ) {
                        int LA5_4 = input.LA(3);

                        if ( (LA5_4==RULE_BL) ) {
                            int LA5_5 = input.LA(4);

                            if ( (LA5_5==16||LA5_5==18) ) {
                                alt5=1;
                            }


                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalHammilDSL.g:589:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalHammilDSL.g:597:1: rule__HeaderDepth1Expression__Group_0__3 : rule__HeaderDepth1Expression__Group_0__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:601:1: ( rule__HeaderDepth1Expression__Group_0__3__Impl )
            // InternalHammilDSL.g:602:2: rule__HeaderDepth1Expression__Group_0__3__Impl
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
    // InternalHammilDSL.g:608:1: rule__HeaderDepth1Expression__Group_0__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:612:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:613:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:613:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:614:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            // InternalHammilDSL.g:615:2: ( RULE_BL )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_BL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHammilDSL.g:615:3: RULE_BL
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
    // InternalHammilDSL.g:624:1: rule__HeaderDepth1Expression__Group_1__0 : rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 ;
    public final void rule__HeaderDepth1Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:628:1: ( rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1 )
            // InternalHammilDSL.g:629:2: rule__HeaderDepth1Expression__Group_1__0__Impl rule__HeaderDepth1Expression__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalHammilDSL.g:636:1: rule__HeaderDepth1Expression__Group_1__0__Impl : ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:640:1: ( ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:641:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:641:1: ( ( rule__HeaderDepth1Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:642:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleAssignment_1_0()); 
            // InternalHammilDSL.g:643:2: ( rule__HeaderDepth1Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:643:3: rule__HeaderDepth1Expression__TitleAssignment_1_0
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
    // InternalHammilDSL.g:651:1: rule__HeaderDepth1Expression__Group_1__1 : rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 ;
    public final void rule__HeaderDepth1Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:655:1: ( rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2 )
            // InternalHammilDSL.g:656:2: rule__HeaderDepth1Expression__Group_1__1__Impl rule__HeaderDepth1Expression__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHammilDSL.g:663:1: rule__HeaderDepth1Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth1Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:667:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:668:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:668:1: ( RULE_BL )
            // InternalHammilDSL.g:669:2: RULE_BL
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
    // InternalHammilDSL.g:678:1: rule__HeaderDepth1Expression__Group_1__2 : rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 ;
    public final void rule__HeaderDepth1Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:682:1: ( rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3 )
            // InternalHammilDSL.g:683:2: rule__HeaderDepth1Expression__Group_1__2__Impl rule__HeaderDepth1Expression__Group_1__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalHammilDSL.g:690:1: rule__HeaderDepth1Expression__Group_1__2__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__HeaderDepth1Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:694:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // InternalHammilDSL.g:695:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // InternalHammilDSL.g:695:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // InternalHammilDSL.g:696:2: ( ( '=' ) ) ( ( '=' )* )
            {
            // InternalHammilDSL.g:696:2: ( ( '=' ) )
            // InternalHammilDSL.g:697:3: ( '=' )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            // InternalHammilDSL.g:698:3: ( '=' )
            // InternalHammilDSL.g:698:4: '='
            {
            match(input,16,FOLLOW_10); 

            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 

            }

            // InternalHammilDSL.g:701:2: ( ( '=' )* )
            // InternalHammilDSL.g:702:3: ( '=' )*
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2()); 
            // InternalHammilDSL.g:703:3: ( '=' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHammilDSL.g:703:4: '='
            	    {
            	    match(input,16,FOLLOW_10); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalHammilDSL.g:712:1: rule__HeaderDepth1Expression__Group_1__3 : rule__HeaderDepth1Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth1Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:716:1: ( rule__HeaderDepth1Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:717:2: rule__HeaderDepth1Expression__Group_1__3__Impl
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
    // InternalHammilDSL.g:723:1: rule__HeaderDepth1Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth1Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:727:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:728:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:728:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:729:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            // InternalHammilDSL.g:730:2: ( RULE_BL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_BL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHammilDSL.g:730:3: RULE_BL
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
    // InternalHammilDSL.g:739:1: rule__HeaderDepth2Expression__Group_0__0 : rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 ;
    public final void rule__HeaderDepth2Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:743:1: ( rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1 )
            // InternalHammilDSL.g:744:2: rule__HeaderDepth2Expression__Group_0__0__Impl rule__HeaderDepth2Expression__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:751:1: rule__HeaderDepth2Expression__Group_0__0__Impl : ( '##' ) ;
    public final void rule__HeaderDepth2Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:755:1: ( ( '##' ) )
            // InternalHammilDSL.g:756:1: ( '##' )
            {
            // InternalHammilDSL.g:756:1: ( '##' )
            // InternalHammilDSL.g:757:2: '##'
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalHammilDSL.g:766:1: rule__HeaderDepth2Expression__Group_0__1 : rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 ;
    public final void rule__HeaderDepth2Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:770:1: ( rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2 )
            // InternalHammilDSL.g:771:2: rule__HeaderDepth2Expression__Group_0__1__Impl rule__HeaderDepth2Expression__Group_0__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:778:1: rule__HeaderDepth2Expression__Group_0__1__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:782:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) ) )
            // InternalHammilDSL.g:783:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            {
            // InternalHammilDSL.g:783:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_0_1 ) )
            // InternalHammilDSL.g:784:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_0_1()); 
            // InternalHammilDSL.g:785:2: ( rule__HeaderDepth2Expression__TitleAssignment_0_1 )
            // InternalHammilDSL.g:785:3: rule__HeaderDepth2Expression__TitleAssignment_0_1
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
    // InternalHammilDSL.g:793:1: rule__HeaderDepth2Expression__Group_0__2 : rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 ;
    public final void rule__HeaderDepth2Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:797:1: ( rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3 )
            // InternalHammilDSL.g:798:2: rule__HeaderDepth2Expression__Group_0__2__Impl rule__HeaderDepth2Expression__Group_0__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:805:1: rule__HeaderDepth2Expression__Group_0__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth2Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:809:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:810:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:810:1: ( ( '#' )* )
            // InternalHammilDSL.g:811:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2()); 
            // InternalHammilDSL.g:812:2: ( '#' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==RULE_STRING) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==RULE_BL) ) {
                            int LA9_5 = input.LA(4);

                            if ( (LA9_5==16||LA9_5==18) ) {
                                alt9=1;
                            }


                        }


                    }
                    else if ( (LA9_2==EOF||LA9_2==RULE_BL||LA9_2==15||LA9_2==17||(LA9_2>=19 && LA9_2<=22)) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalHammilDSL.g:812:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalHammilDSL.g:820:1: rule__HeaderDepth2Expression__Group_0__3 : rule__HeaderDepth2Expression__Group_0__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:824:1: ( rule__HeaderDepth2Expression__Group_0__3__Impl )
            // InternalHammilDSL.g:825:2: rule__HeaderDepth2Expression__Group_0__3__Impl
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
    // InternalHammilDSL.g:831:1: rule__HeaderDepth2Expression__Group_0__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:835:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:836:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:836:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:837:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3()); 
            // InternalHammilDSL.g:838:2: ( RULE_BL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_BL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHammilDSL.g:838:3: RULE_BL
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
    // InternalHammilDSL.g:847:1: rule__HeaderDepth2Expression__Group_1__0 : rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 ;
    public final void rule__HeaderDepth2Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:851:1: ( rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1 )
            // InternalHammilDSL.g:852:2: rule__HeaderDepth2Expression__Group_1__0__Impl rule__HeaderDepth2Expression__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalHammilDSL.g:859:1: rule__HeaderDepth2Expression__Group_1__0__Impl : ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:863:1: ( ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) ) )
            // InternalHammilDSL.g:864:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            {
            // InternalHammilDSL.g:864:1: ( ( rule__HeaderDepth2Expression__TitleAssignment_1_0 ) )
            // InternalHammilDSL.g:865:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleAssignment_1_0()); 
            // InternalHammilDSL.g:866:2: ( rule__HeaderDepth2Expression__TitleAssignment_1_0 )
            // InternalHammilDSL.g:866:3: rule__HeaderDepth2Expression__TitleAssignment_1_0
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
    // InternalHammilDSL.g:874:1: rule__HeaderDepth2Expression__Group_1__1 : rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 ;
    public final void rule__HeaderDepth2Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:878:1: ( rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2 )
            // InternalHammilDSL.g:879:2: rule__HeaderDepth2Expression__Group_1__1__Impl rule__HeaderDepth2Expression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalHammilDSL.g:886:1: rule__HeaderDepth2Expression__Group_1__1__Impl : ( RULE_BL ) ;
    public final void rule__HeaderDepth2Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:890:1: ( ( RULE_BL ) )
            // InternalHammilDSL.g:891:1: ( RULE_BL )
            {
            // InternalHammilDSL.g:891:1: ( RULE_BL )
            // InternalHammilDSL.g:892:2: RULE_BL
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
    // InternalHammilDSL.g:901:1: rule__HeaderDepth2Expression__Group_1__2 : rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 ;
    public final void rule__HeaderDepth2Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:905:1: ( rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3 )
            // InternalHammilDSL.g:906:2: rule__HeaderDepth2Expression__Group_1__2__Impl rule__HeaderDepth2Expression__Group_1__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalHammilDSL.g:913:1: rule__HeaderDepth2Expression__Group_1__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__HeaderDepth2Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:917:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalHammilDSL.g:918:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalHammilDSL.g:918:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalHammilDSL.g:919:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalHammilDSL.g:919:2: ( ( '-' ) )
            // InternalHammilDSL.g:920:3: ( '-' )
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            // InternalHammilDSL.g:921:3: ( '-' )
            // InternalHammilDSL.g:921:4: '-'
            {
            match(input,18,FOLLOW_12); 

            }

             after(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 

            }

            // InternalHammilDSL.g:924:2: ( ( '-' )* )
            // InternalHammilDSL.g:925:3: ( '-' )*
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2()); 
            // InternalHammilDSL.g:926:3: ( '-' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHammilDSL.g:926:4: '-'
            	    {
            	    match(input,18,FOLLOW_12); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalHammilDSL.g:935:1: rule__HeaderDepth2Expression__Group_1__3 : rule__HeaderDepth2Expression__Group_1__3__Impl ;
    public final void rule__HeaderDepth2Expression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:939:1: ( rule__HeaderDepth2Expression__Group_1__3__Impl )
            // InternalHammilDSL.g:940:2: rule__HeaderDepth2Expression__Group_1__3__Impl
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
    // InternalHammilDSL.g:946:1: rule__HeaderDepth2Expression__Group_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth2Expression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:950:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:951:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:951:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:952:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3()); 
            // InternalHammilDSL.g:953:2: ( RULE_BL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHammilDSL.g:953:3: RULE_BL
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
    // InternalHammilDSL.g:962:1: rule__HeaderDepth3Expression__Group__0 : rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 ;
    public final void rule__HeaderDepth3Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:966:1: ( rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1 )
            // InternalHammilDSL.g:967:2: rule__HeaderDepth3Expression__Group__0__Impl rule__HeaderDepth3Expression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:974:1: rule__HeaderDepth3Expression__Group__0__Impl : ( '###' ) ;
    public final void rule__HeaderDepth3Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:978:1: ( ( '###' ) )
            // InternalHammilDSL.g:979:1: ( '###' )
            {
            // InternalHammilDSL.g:979:1: ( '###' )
            // InternalHammilDSL.g:980:2: '###'
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalHammilDSL.g:989:1: rule__HeaderDepth3Expression__Group__1 : rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 ;
    public final void rule__HeaderDepth3Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:993:1: ( rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2 )
            // InternalHammilDSL.g:994:2: rule__HeaderDepth3Expression__Group__1__Impl rule__HeaderDepth3Expression__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1001:1: rule__HeaderDepth3Expression__Group__1__Impl : ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth3Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1005:1: ( ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1006:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1006:1: ( ( rule__HeaderDepth3Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1007:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleAssignment_1()); 
            // InternalHammilDSL.g:1008:2: ( rule__HeaderDepth3Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1008:3: rule__HeaderDepth3Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1016:1: rule__HeaderDepth3Expression__Group__2 : rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 ;
    public final void rule__HeaderDepth3Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1020:1: ( rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3 )
            // InternalHammilDSL.g:1021:2: rule__HeaderDepth3Expression__Group__2__Impl rule__HeaderDepth3Expression__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1028:1: rule__HeaderDepth3Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth3Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1032:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1033:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1033:1: ( ( '#' )* )
            // InternalHammilDSL.g:1034:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2()); 
            // InternalHammilDSL.g:1035:2: ( '#' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==EOF||LA13_2==RULE_BL||LA13_2==15||LA13_2==17||(LA13_2>=19 && LA13_2<=22)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==RULE_STRING) ) {
                        int LA13_4 = input.LA(3);

                        if ( (LA13_4==RULE_BL) ) {
                            int LA13_5 = input.LA(4);

                            if ( (LA13_5==16||LA13_5==18) ) {
                                alt13=1;
                            }


                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalHammilDSL.g:1035:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalHammilDSL.g:1043:1: rule__HeaderDepth3Expression__Group__3 : rule__HeaderDepth3Expression__Group__3__Impl ;
    public final void rule__HeaderDepth3Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1047:1: ( rule__HeaderDepth3Expression__Group__3__Impl )
            // InternalHammilDSL.g:1048:2: rule__HeaderDepth3Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1054:1: rule__HeaderDepth3Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth3Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1058:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1059:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1059:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1060:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3()); 
            // InternalHammilDSL.g:1061:2: ( RULE_BL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHammilDSL.g:1061:3: RULE_BL
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
    // InternalHammilDSL.g:1070:1: rule__HeaderDepth5Expression__Group__0 : rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 ;
    public final void rule__HeaderDepth5Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1074:1: ( rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1 )
            // InternalHammilDSL.g:1075:2: rule__HeaderDepth5Expression__Group__0__Impl rule__HeaderDepth5Expression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:1082:1: rule__HeaderDepth5Expression__Group__0__Impl : ( '#####' ) ;
    public final void rule__HeaderDepth5Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1086:1: ( ( '#####' ) )
            // InternalHammilDSL.g:1087:1: ( '#####' )
            {
            // InternalHammilDSL.g:1087:1: ( '#####' )
            // InternalHammilDSL.g:1088:2: '#####'
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalHammilDSL.g:1097:1: rule__HeaderDepth5Expression__Group__1 : rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 ;
    public final void rule__HeaderDepth5Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1101:1: ( rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2 )
            // InternalHammilDSL.g:1102:2: rule__HeaderDepth5Expression__Group__1__Impl rule__HeaderDepth5Expression__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1109:1: rule__HeaderDepth5Expression__Group__1__Impl : ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth5Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1113:1: ( ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1114:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1114:1: ( ( rule__HeaderDepth5Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1115:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleAssignment_1()); 
            // InternalHammilDSL.g:1116:2: ( rule__HeaderDepth5Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1116:3: rule__HeaderDepth5Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1124:1: rule__HeaderDepth5Expression__Group__2 : rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 ;
    public final void rule__HeaderDepth5Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1128:1: ( rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3 )
            // InternalHammilDSL.g:1129:2: rule__HeaderDepth5Expression__Group__2__Impl rule__HeaderDepth5Expression__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1136:1: rule__HeaderDepth5Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth5Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1140:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1141:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1141:1: ( ( '#' )* )
            // InternalHammilDSL.g:1142:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2()); 
            // InternalHammilDSL.g:1143:2: ( '#' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==EOF||LA15_2==RULE_BL||LA15_2==15||LA15_2==17||(LA15_2>=19 && LA15_2<=22)) ) {
                        alt15=1;
                    }
                    else if ( (LA15_2==RULE_STRING) ) {
                        int LA15_4 = input.LA(3);

                        if ( (LA15_4==RULE_BL) ) {
                            int LA15_5 = input.LA(4);

                            if ( (LA15_5==16||LA15_5==18) ) {
                                alt15=1;
                            }


                        }


                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalHammilDSL.g:1143:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalHammilDSL.g:1151:1: rule__HeaderDepth5Expression__Group__3 : rule__HeaderDepth5Expression__Group__3__Impl ;
    public final void rule__HeaderDepth5Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1155:1: ( rule__HeaderDepth5Expression__Group__3__Impl )
            // InternalHammilDSL.g:1156:2: rule__HeaderDepth5Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1162:1: rule__HeaderDepth5Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth5Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1166:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1167:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1167:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1168:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3()); 
            // InternalHammilDSL.g:1169:2: ( RULE_BL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHammilDSL.g:1169:3: RULE_BL
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
    // InternalHammilDSL.g:1178:1: rule__HeaderDepth6Expression__Group__0 : rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 ;
    public final void rule__HeaderDepth6Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1182:1: ( rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1 )
            // InternalHammilDSL.g:1183:2: rule__HeaderDepth6Expression__Group__0__Impl rule__HeaderDepth6Expression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:1190:1: rule__HeaderDepth6Expression__Group__0__Impl : ( '######' ) ;
    public final void rule__HeaderDepth6Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1194:1: ( ( '######' ) )
            // InternalHammilDSL.g:1195:1: ( '######' )
            {
            // InternalHammilDSL.g:1195:1: ( '######' )
            // InternalHammilDSL.g:1196:2: '######'
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalHammilDSL.g:1205:1: rule__HeaderDepth6Expression__Group__1 : rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 ;
    public final void rule__HeaderDepth6Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1209:1: ( rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2 )
            // InternalHammilDSL.g:1210:2: rule__HeaderDepth6Expression__Group__1__Impl rule__HeaderDepth6Expression__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1217:1: rule__HeaderDepth6Expression__Group__1__Impl : ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth6Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1221:1: ( ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1222:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1222:1: ( ( rule__HeaderDepth6Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1223:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleAssignment_1()); 
            // InternalHammilDSL.g:1224:2: ( rule__HeaderDepth6Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1224:3: rule__HeaderDepth6Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1232:1: rule__HeaderDepth6Expression__Group__2 : rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 ;
    public final void rule__HeaderDepth6Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1236:1: ( rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3 )
            // InternalHammilDSL.g:1237:2: rule__HeaderDepth6Expression__Group__2__Impl rule__HeaderDepth6Expression__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1244:1: rule__HeaderDepth6Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth6Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1248:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1249:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1249:1: ( ( '#' )* )
            // InternalHammilDSL.g:1250:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2()); 
            // InternalHammilDSL.g:1251:2: ( '#' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_STRING) ) {
                        int LA17_3 = input.LA(3);

                        if ( (LA17_3==RULE_BL) ) {
                            int LA17_5 = input.LA(4);

                            if ( (LA17_5==16||LA17_5==18) ) {
                                alt17=1;
                            }


                        }


                    }
                    else if ( (LA17_2==EOF||LA17_2==RULE_BL||LA17_2==15||LA17_2==17||(LA17_2>=19 && LA17_2<=22)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalHammilDSL.g:1251:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalHammilDSL.g:1259:1: rule__HeaderDepth6Expression__Group__3 : rule__HeaderDepth6Expression__Group__3__Impl ;
    public final void rule__HeaderDepth6Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1263:1: ( rule__HeaderDepth6Expression__Group__3__Impl )
            // InternalHammilDSL.g:1264:2: rule__HeaderDepth6Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1270:1: rule__HeaderDepth6Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth6Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1274:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1275:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1275:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1276:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3()); 
            // InternalHammilDSL.g:1277:2: ( RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHammilDSL.g:1277:3: RULE_BL
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
    // InternalHammilDSL.g:1286:1: rule__HeaderDepth4Expression__Group__0 : rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 ;
    public final void rule__HeaderDepth4Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1290:1: ( rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1 )
            // InternalHammilDSL.g:1291:2: rule__HeaderDepth4Expression__Group__0__Impl rule__HeaderDepth4Expression__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalHammilDSL.g:1298:1: rule__HeaderDepth4Expression__Group__0__Impl : ( '####' ) ;
    public final void rule__HeaderDepth4Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1302:1: ( ( '####' ) )
            // InternalHammilDSL.g:1303:1: ( '####' )
            {
            // InternalHammilDSL.g:1303:1: ( '####' )
            // InternalHammilDSL.g:1304:2: '####'
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalHammilDSL.g:1313:1: rule__HeaderDepth4Expression__Group__1 : rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 ;
    public final void rule__HeaderDepth4Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1317:1: ( rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2 )
            // InternalHammilDSL.g:1318:2: rule__HeaderDepth4Expression__Group__1__Impl rule__HeaderDepth4Expression__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1325:1: rule__HeaderDepth4Expression__Group__1__Impl : ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderDepth4Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1329:1: ( ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) ) )
            // InternalHammilDSL.g:1330:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            {
            // InternalHammilDSL.g:1330:1: ( ( rule__HeaderDepth4Expression__TitleAssignment_1 ) )
            // InternalHammilDSL.g:1331:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleAssignment_1()); 
            // InternalHammilDSL.g:1332:2: ( rule__HeaderDepth4Expression__TitleAssignment_1 )
            // InternalHammilDSL.g:1332:3: rule__HeaderDepth4Expression__TitleAssignment_1
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
    // InternalHammilDSL.g:1340:1: rule__HeaderDepth4Expression__Group__2 : rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 ;
    public final void rule__HeaderDepth4Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1344:1: ( rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3 )
            // InternalHammilDSL.g:1345:2: rule__HeaderDepth4Expression__Group__2__Impl rule__HeaderDepth4Expression__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalHammilDSL.g:1352:1: rule__HeaderDepth4Expression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderDepth4Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1356:1: ( ( ( '#' )* ) )
            // InternalHammilDSL.g:1357:1: ( ( '#' )* )
            {
            // InternalHammilDSL.g:1357:1: ( ( '#' )* )
            // InternalHammilDSL.g:1358:2: ( '#' )*
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2()); 
            // InternalHammilDSL.g:1359:2: ( '#' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==EOF||LA19_2==RULE_BL||LA19_2==15||LA19_2==17||(LA19_2>=19 && LA19_2<=22)) ) {
                        alt19=1;
                    }
                    else if ( (LA19_2==RULE_STRING) ) {
                        int LA19_4 = input.LA(3);

                        if ( (LA19_4==RULE_BL) ) {
                            int LA19_5 = input.LA(4);

                            if ( (LA19_5==16||LA19_5==18) ) {
                                alt19=1;
                            }


                        }


                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalHammilDSL.g:1359:3: '#'
            	    {
            	    match(input,15,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalHammilDSL.g:1367:1: rule__HeaderDepth4Expression__Group__3 : rule__HeaderDepth4Expression__Group__3__Impl ;
    public final void rule__HeaderDepth4Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1371:1: ( rule__HeaderDepth4Expression__Group__3__Impl )
            // InternalHammilDSL.g:1372:2: rule__HeaderDepth4Expression__Group__3__Impl
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
    // InternalHammilDSL.g:1378:1: rule__HeaderDepth4Expression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderDepth4Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1382:1: ( ( ( RULE_BL )? ) )
            // InternalHammilDSL.g:1383:1: ( ( RULE_BL )? )
            {
            // InternalHammilDSL.g:1383:1: ( ( RULE_BL )? )
            // InternalHammilDSL.g:1384:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3()); 
            // InternalHammilDSL.g:1385:2: ( RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHammilDSL.g:1385:3: RULE_BL
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
    // InternalHammilDSL.g:1394:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1398:1: ( ( ruleExpression ) )
            // InternalHammilDSL.g:1399:2: ( ruleExpression )
            {
            // InternalHammilDSL.g:1399:2: ( ruleExpression )
            // InternalHammilDSL.g:1400:3: ruleExpression
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


    // $ANTLR start "rule__HeaderDepth1Expression__TitleAssignment_0_1"
    // InternalHammilDSL.g:1409:1: rule__HeaderDepth1Expression__TitleAssignment_0_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1413:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1414:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1414:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1415:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1424:1: rule__HeaderDepth1Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth1Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1428:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1429:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1429:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1430:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1439:1: rule__HeaderDepth2Expression__TitleAssignment_0_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1443:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1444:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1444:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1445:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1454:1: rule__HeaderDepth2Expression__TitleAssignment_1_0 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth2Expression__TitleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1458:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1459:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1459:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1460:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1469:1: rule__HeaderDepth3Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth3Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1473:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1474:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1474:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1475:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1484:1: rule__HeaderDepth5Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth5Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1488:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1489:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1489:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1490:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1499:1: rule__HeaderDepth6Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth6Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1503:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1504:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1504:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1505:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1514:1: rule__HeaderDepth4Expression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderDepth4Expression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1518:1: ( ( ruleEmphasisExpression ) )
            // InternalHammilDSL.g:1519:2: ( ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:1519:2: ( ruleEmphasisExpression )
            // InternalHammilDSL.g:1520:3: ruleEmphasisExpression
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
    // InternalHammilDSL.g:1529:1: rule__TextualExpression__ContentStringAssignment : ( ruleString0 ) ;
    public final void rule__TextualExpression__ContentStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHammilDSL.g:1533:1: ( ( ruleString0 ) )
            // InternalHammilDSL.g:1534:2: ( ruleString0 )
            {
            // InternalHammilDSL.g:1534:2: ( ruleString0 )
            // InternalHammilDSL.g:1535:3: ruleString0
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