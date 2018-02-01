package markHammil.mm.ide.contentassist.antlr.internal;

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
import markHammil.mm.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BL", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_ANY_OTHER", "'*'", "'-'", "'+'", "'\\''", "'|'", "'\"'", "'.'", "'>'", "'['", "']('", "')'", "'!['", "'[!['", "')]('", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'~~'", "'true'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=8;
    public static final int RULE_DIGIT=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_BL=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:54:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalMyDsl.g:55:1: ( ruleFile EOF )
            // InternalMyDsl.g:56:1: ruleFile EOF
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
    // InternalMyDsl.g:63:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:67:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalMyDsl.g:68:2: ( ( rule__File__Group__0 ) )
            {
            // InternalMyDsl.g:68:2: ( ( rule__File__Group__0 ) )
            // InternalMyDsl.g:69:3: ( rule__File__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup()); 
            }
            // InternalMyDsl.g:70:3: ( rule__File__Group__0 )
            // InternalMyDsl.g:70:4: rule__File__Group__0
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
    // InternalMyDsl.g:79:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:80:1: ( ruleExpression EOF )
            // InternalMyDsl.g:81:1: ruleExpression EOF
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
    // InternalMyDsl.g:88:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:92:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:93:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:93:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:94:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:95:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:95:4: rule__Expression__Alternatives
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


    // $ANTLR start "entryRuleBreakLineExpression"
    // InternalMyDsl.g:104:1: entryRuleBreakLineExpression : ruleBreakLineExpression EOF ;
    public final void entryRuleBreakLineExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:105:1: ( ruleBreakLineExpression EOF )
            // InternalMyDsl.g:106:1: ruleBreakLineExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBreakLineExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakLineExpressionRule()); 
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
    // $ANTLR end "entryRuleBreakLineExpression"


    // $ANTLR start "ruleBreakLineExpression"
    // InternalMyDsl.g:113:1: ruleBreakLineExpression : ( ( rule__BreakLineExpression__Group__0 ) ) ;
    public final void ruleBreakLineExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:117:2: ( ( ( rule__BreakLineExpression__Group__0 ) ) )
            // InternalMyDsl.g:118:2: ( ( rule__BreakLineExpression__Group__0 ) )
            {
            // InternalMyDsl.g:118:2: ( ( rule__BreakLineExpression__Group__0 ) )
            // InternalMyDsl.g:119:3: ( rule__BreakLineExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:120:3: ( rule__BreakLineExpression__Group__0 )
            // InternalMyDsl.g:120:4: rule__BreakLineExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BreakLineExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakLineExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleBreakLineExpression"


    // $ANTLR start "entryRuleTextExpression"
    // InternalMyDsl.g:129:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:133:1: ( ruleTextExpression EOF )
            // InternalMyDsl.g:134:1: ruleTextExpression EOF
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
    // InternalMyDsl.g:144:1: ruleTextExpression : ( ( rule__TextExpression__Alternatives ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:149:2: ( ( ( rule__TextExpression__Alternatives ) ) )
            // InternalMyDsl.g:150:2: ( ( rule__TextExpression__Alternatives ) )
            {
            // InternalMyDsl.g:150:2: ( ( rule__TextExpression__Alternatives ) )
            // InternalMyDsl.g:151:3: ( rule__TextExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:152:3: ( rule__TextExpression__Alternatives )
            // InternalMyDsl.g:152:4: rule__TextExpression__Alternatives
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


    // $ANTLR start "entryRuleListExpression"
    // InternalMyDsl.g:162:1: entryRuleListExpression : ruleListExpression EOF ;
    public final void entryRuleListExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:166:1: ( ruleListExpression EOF )
            // InternalMyDsl.g:167:1: ruleListExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionRule()); 
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
    // $ANTLR end "entryRuleListExpression"


    // $ANTLR start "ruleListExpression"
    // InternalMyDsl.g:177:1: ruleListExpression : ( ( rule__ListExpression__Alternatives ) ) ;
    public final void ruleListExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:2: ( ( ( rule__ListExpression__Alternatives ) ) )
            // InternalMyDsl.g:183:2: ( ( rule__ListExpression__Alternatives ) )
            {
            // InternalMyDsl.g:183:2: ( ( rule__ListExpression__Alternatives ) )
            // InternalMyDsl.g:184:3: ( rule__ListExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:185:3: ( rule__ListExpression__Alternatives )
            // InternalMyDsl.g:185:4: rule__ListExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleListExpression"


    // $ANTLR start "entryRuleQuoteExpression"
    // InternalMyDsl.g:195:1: entryRuleQuoteExpression : ruleQuoteExpression EOF ;
    public final void entryRuleQuoteExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:196:1: ( ruleQuoteExpression EOF )
            // InternalMyDsl.g:197:1: ruleQuoteExpression EOF
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
    // InternalMyDsl.g:204:1: ruleQuoteExpression : ( ( rule__QuoteExpression__Group__0 ) ) ;
    public final void ruleQuoteExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:208:2: ( ( ( rule__QuoteExpression__Group__0 ) ) )
            // InternalMyDsl.g:209:2: ( ( rule__QuoteExpression__Group__0 ) )
            {
            // InternalMyDsl.g:209:2: ( ( rule__QuoteExpression__Group__0 ) )
            // InternalMyDsl.g:210:3: ( rule__QuoteExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:211:3: ( rule__QuoteExpression__Group__0 )
            // InternalMyDsl.g:211:4: rule__QuoteExpression__Group__0
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


    // $ANTLR start "entryRuleLinkExpression"
    // InternalMyDsl.g:220:1: entryRuleLinkExpression : ruleLinkExpression EOF ;
    public final void entryRuleLinkExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:221:1: ( ruleLinkExpression EOF )
            // InternalMyDsl.g:222:1: ruleLinkExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLinkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionRule()); 
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
    // $ANTLR end "entryRuleLinkExpression"


    // $ANTLR start "ruleLinkExpression"
    // InternalMyDsl.g:229:1: ruleLinkExpression : ( ( rule__LinkExpression__Group__0 ) ) ;
    public final void ruleLinkExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:233:2: ( ( ( rule__LinkExpression__Group__0 ) ) )
            // InternalMyDsl.g:234:2: ( ( rule__LinkExpression__Group__0 ) )
            {
            // InternalMyDsl.g:234:2: ( ( rule__LinkExpression__Group__0 ) )
            // InternalMyDsl.g:235:3: ( rule__LinkExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:236:3: ( rule__LinkExpression__Group__0 )
            // InternalMyDsl.g:236:4: rule__LinkExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleLinkExpression"


    // $ANTLR start "entryRuleImageExpression"
    // InternalMyDsl.g:245:1: entryRuleImageExpression : ruleImageExpression EOF ;
    public final void entryRuleImageExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:246:1: ( ruleImageExpression EOF )
            // InternalMyDsl.g:247:1: ruleImageExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImageExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionRule()); 
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
    // $ANTLR end "entryRuleImageExpression"


    // $ANTLR start "ruleImageExpression"
    // InternalMyDsl.g:254:1: ruleImageExpression : ( ( rule__ImageExpression__Group__0 ) ) ;
    public final void ruleImageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:2: ( ( ( rule__ImageExpression__Group__0 ) ) )
            // InternalMyDsl.g:259:2: ( ( rule__ImageExpression__Group__0 ) )
            {
            // InternalMyDsl.g:259:2: ( ( rule__ImageExpression__Group__0 ) )
            // InternalMyDsl.g:260:3: ( rule__ImageExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:261:3: ( rule__ImageExpression__Group__0 )
            // InternalMyDsl.g:261:4: rule__ImageExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleImageExpression"


    // $ANTLR start "entryRuleVideoExpression"
    // InternalMyDsl.g:270:1: entryRuleVideoExpression : ruleVideoExpression EOF ;
    public final void entryRuleVideoExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:271:1: ( ruleVideoExpression EOF )
            // InternalMyDsl.g:272:1: ruleVideoExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVideoExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionRule()); 
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
    // $ANTLR end "entryRuleVideoExpression"


    // $ANTLR start "ruleVideoExpression"
    // InternalMyDsl.g:279:1: ruleVideoExpression : ( ( rule__VideoExpression__Group__0 ) ) ;
    public final void ruleVideoExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:2: ( ( ( rule__VideoExpression__Group__0 ) ) )
            // InternalMyDsl.g:284:2: ( ( rule__VideoExpression__Group__0 ) )
            {
            // InternalMyDsl.g:284:2: ( ( rule__VideoExpression__Group__0 ) )
            // InternalMyDsl.g:285:3: ( rule__VideoExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:286:3: ( rule__VideoExpression__Group__0 )
            // InternalMyDsl.g:286:4: rule__VideoExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleVideoExpression"


    // $ANTLR start "entryRuleTabExpression"
    // InternalMyDsl.g:295:1: entryRuleTabExpression : ruleTabExpression EOF ;
    public final void entryRuleTabExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:296:1: ( ruleTabExpression EOF )
            // InternalMyDsl.g:297:1: ruleTabExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTabExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionRule()); 
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
    // $ANTLR end "entryRuleTabExpression"


    // $ANTLR start "ruleTabExpression"
    // InternalMyDsl.g:304:1: ruleTabExpression : ( ( rule__TabExpression__Group__0 ) ) ;
    public final void ruleTabExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:2: ( ( ( rule__TabExpression__Group__0 ) ) )
            // InternalMyDsl.g:309:2: ( ( rule__TabExpression__Group__0 ) )
            {
            // InternalMyDsl.g:309:2: ( ( rule__TabExpression__Group__0 ) )
            // InternalMyDsl.g:310:3: ( rule__TabExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:311:3: ( rule__TabExpression__Group__0 )
            // InternalMyDsl.g:311:4: rule__TabExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleTabExpression"


    // $ANTLR start "entryRuleTabSeparation"
    // InternalMyDsl.g:320:1: entryRuleTabSeparation : ruleTabSeparation EOF ;
    public final void entryRuleTabSeparation() throws RecognitionException {
        try {
            // InternalMyDsl.g:321:1: ( ruleTabSeparation EOF )
            // InternalMyDsl.g:322:1: ruleTabSeparation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTabSeparation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationRule()); 
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
    // $ANTLR end "entryRuleTabSeparation"


    // $ANTLR start "ruleTabSeparation"
    // InternalMyDsl.g:329:1: ruleTabSeparation : ( ( rule__TabSeparation__Group__0 ) ) ;
    public final void ruleTabSeparation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:2: ( ( ( rule__TabSeparation__Group__0 ) ) )
            // InternalMyDsl.g:334:2: ( ( rule__TabSeparation__Group__0 ) )
            {
            // InternalMyDsl.g:334:2: ( ( rule__TabSeparation__Group__0 ) )
            // InternalMyDsl.g:335:3: ( rule__TabSeparation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup()); 
            }
            // InternalMyDsl.g:336:3: ( rule__TabSeparation__Group__0 )
            // InternalMyDsl.g:336:4: rule__TabSeparation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TabSeparation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getGroup()); 
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
    // $ANTLR end "ruleTabSeparation"


    // $ANTLR start "entryRuleLineExpression"
    // InternalMyDsl.g:345:1: entryRuleLineExpression : ruleLineExpression EOF ;
    public final void entryRuleLineExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:346:1: ( ruleLineExpression EOF )
            // InternalMyDsl.g:347:1: ruleLineExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLineExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionRule()); 
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
    // $ANTLR end "entryRuleLineExpression"


    // $ANTLR start "ruleLineExpression"
    // InternalMyDsl.g:354:1: ruleLineExpression : ( ( rule__LineExpression__Group__0 ) ) ;
    public final void ruleLineExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:2: ( ( ( rule__LineExpression__Group__0 ) ) )
            // InternalMyDsl.g:359:2: ( ( rule__LineExpression__Group__0 ) )
            {
            // InternalMyDsl.g:359:2: ( ( rule__LineExpression__Group__0 ) )
            // InternalMyDsl.g:360:3: ( rule__LineExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:361:3: ( rule__LineExpression__Group__0 )
            // InternalMyDsl.g:361:4: rule__LineExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleLineExpression"


    // $ANTLR start "entryRuleHeaderExpression"
    // InternalMyDsl.g:370:1: entryRuleHeaderExpression : ruleHeaderExpression EOF ;
    public final void entryRuleHeaderExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:371:1: ( ruleHeaderExpression EOF )
            // InternalMyDsl.g:372:1: ruleHeaderExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeaderExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderExpressionRule()); 
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
    // $ANTLR end "entryRuleHeaderExpression"


    // $ANTLR start "ruleHeaderExpression"
    // InternalMyDsl.g:379:1: ruleHeaderExpression : ( ( rule__HeaderExpression__Alternatives ) ) ;
    public final void ruleHeaderExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:2: ( ( ( rule__HeaderExpression__Alternatives ) ) )
            // InternalMyDsl.g:384:2: ( ( rule__HeaderExpression__Alternatives ) )
            {
            // InternalMyDsl.g:384:2: ( ( rule__HeaderExpression__Alternatives ) )
            // InternalMyDsl.g:385:3: ( rule__HeaderExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:386:3: ( rule__HeaderExpression__Alternatives )
            // InternalMyDsl.g:386:4: rule__HeaderExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HeaderExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleHeaderExpression"


    // $ANTLR start "entryRuleHeader1Expression"
    // InternalMyDsl.g:395:1: entryRuleHeader1Expression : ruleHeader1Expression EOF ;
    public final void entryRuleHeader1Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:396:1: ( ruleHeader1Expression EOF )
            // InternalMyDsl.g:397:1: ruleHeader1Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeader1Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader1ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeader1Expression"


    // $ANTLR start "ruleHeader1Expression"
    // InternalMyDsl.g:404:1: ruleHeader1Expression : ( ( rule__Header1Expression__Group__0 ) ) ;
    public final void ruleHeader1Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:408:2: ( ( ( rule__Header1Expression__Group__0 ) ) )
            // InternalMyDsl.g:409:2: ( ( rule__Header1Expression__Group__0 ) )
            {
            // InternalMyDsl.g:409:2: ( ( rule__Header1Expression__Group__0 ) )
            // InternalMyDsl.g:410:3: ( rule__Header1Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:411:3: ( rule__Header1Expression__Group__0 )
            // InternalMyDsl.g:411:4: rule__Header1Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header1Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader1ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeader1Expression"


    // $ANTLR start "entryRuleHeader2Expression"
    // InternalMyDsl.g:420:1: entryRuleHeader2Expression : ruleHeader2Expression EOF ;
    public final void entryRuleHeader2Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:421:1: ( ruleHeader2Expression EOF )
            // InternalMyDsl.g:422:1: ruleHeader2Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeader2Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader2ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeader2Expression"


    // $ANTLR start "ruleHeader2Expression"
    // InternalMyDsl.g:429:1: ruleHeader2Expression : ( ( rule__Header2Expression__Group__0 ) ) ;
    public final void ruleHeader2Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:2: ( ( ( rule__Header2Expression__Group__0 ) ) )
            // InternalMyDsl.g:434:2: ( ( rule__Header2Expression__Group__0 ) )
            {
            // InternalMyDsl.g:434:2: ( ( rule__Header2Expression__Group__0 ) )
            // InternalMyDsl.g:435:3: ( rule__Header2Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:436:3: ( rule__Header2Expression__Group__0 )
            // InternalMyDsl.g:436:4: rule__Header2Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header2Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader2ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeader2Expression"


    // $ANTLR start "entryRuleHeader3Expression"
    // InternalMyDsl.g:445:1: entryRuleHeader3Expression : ruleHeader3Expression EOF ;
    public final void entryRuleHeader3Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:446:1: ( ruleHeader3Expression EOF )
            // InternalMyDsl.g:447:1: ruleHeader3Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeader3Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader3ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeader3Expression"


    // $ANTLR start "ruleHeader3Expression"
    // InternalMyDsl.g:454:1: ruleHeader3Expression : ( ( rule__Header3Expression__Group__0 ) ) ;
    public final void ruleHeader3Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:2: ( ( ( rule__Header3Expression__Group__0 ) ) )
            // InternalMyDsl.g:459:2: ( ( rule__Header3Expression__Group__0 ) )
            {
            // InternalMyDsl.g:459:2: ( ( rule__Header3Expression__Group__0 ) )
            // InternalMyDsl.g:460:3: ( rule__Header3Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:461:3: ( rule__Header3Expression__Group__0 )
            // InternalMyDsl.g:461:4: rule__Header3Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header3Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader3ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeader3Expression"


    // $ANTLR start "entryRuleHeader4Expression"
    // InternalMyDsl.g:470:1: entryRuleHeader4Expression : ruleHeader4Expression EOF ;
    public final void entryRuleHeader4Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:471:1: ( ruleHeader4Expression EOF )
            // InternalMyDsl.g:472:1: ruleHeader4Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeader4Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader4ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeader4Expression"


    // $ANTLR start "ruleHeader4Expression"
    // InternalMyDsl.g:479:1: ruleHeader4Expression : ( ( rule__Header4Expression__Group__0 ) ) ;
    public final void ruleHeader4Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:2: ( ( ( rule__Header4Expression__Group__0 ) ) )
            // InternalMyDsl.g:484:2: ( ( rule__Header4Expression__Group__0 ) )
            {
            // InternalMyDsl.g:484:2: ( ( rule__Header4Expression__Group__0 ) )
            // InternalMyDsl.g:485:3: ( rule__Header4Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:486:3: ( rule__Header4Expression__Group__0 )
            // InternalMyDsl.g:486:4: rule__Header4Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header4Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader4ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeader4Expression"


    // $ANTLR start "entryRuleHeader5Expression"
    // InternalMyDsl.g:495:1: entryRuleHeader5Expression : ruleHeader5Expression EOF ;
    public final void entryRuleHeader5Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:496:1: ( ruleHeader5Expression EOF )
            // InternalMyDsl.g:497:1: ruleHeader5Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeader5Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader5ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeader5Expression"


    // $ANTLR start "ruleHeader5Expression"
    // InternalMyDsl.g:504:1: ruleHeader5Expression : ( ( rule__Header5Expression__Group__0 ) ) ;
    public final void ruleHeader5Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:2: ( ( ( rule__Header5Expression__Group__0 ) ) )
            // InternalMyDsl.g:509:2: ( ( rule__Header5Expression__Group__0 ) )
            {
            // InternalMyDsl.g:509:2: ( ( rule__Header5Expression__Group__0 ) )
            // InternalMyDsl.g:510:3: ( rule__Header5Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:511:3: ( rule__Header5Expression__Group__0 )
            // InternalMyDsl.g:511:4: rule__Header5Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header5Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader5ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeader5Expression"


    // $ANTLR start "entryRuleHeader6Expression"
    // InternalMyDsl.g:520:1: entryRuleHeader6Expression : ruleHeader6Expression EOF ;
    public final void entryRuleHeader6Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:521:1: ( ruleHeader6Expression EOF )
            // InternalMyDsl.g:522:1: ruleHeader6Expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeader6Expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader6ExpressionRule()); 
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
    // $ANTLR end "entryRuleHeader6Expression"


    // $ANTLR start "ruleHeader6Expression"
    // InternalMyDsl.g:529:1: ruleHeader6Expression : ( ( rule__Header6Expression__Group__0 ) ) ;
    public final void ruleHeader6Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:533:2: ( ( ( rule__Header6Expression__Group__0 ) ) )
            // InternalMyDsl.g:534:2: ( ( rule__Header6Expression__Group__0 ) )
            {
            // InternalMyDsl.g:534:2: ( ( rule__Header6Expression__Group__0 ) )
            // InternalMyDsl.g:535:3: ( rule__Header6Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:536:3: ( rule__Header6Expression__Group__0 )
            // InternalMyDsl.g:536:4: rule__Header6Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header6Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader6ExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleHeader6Expression"


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalMyDsl.g:545:1: entryRuleEmphasisExpression : ruleEmphasisExpression EOF ;
    public final void entryRuleEmphasisExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:546:1: ( ruleEmphasisExpression EOF )
            // InternalMyDsl.g:547:1: ruleEmphasisExpression EOF
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
    // InternalMyDsl.g:554:1: ruleEmphasisExpression : ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) ) ;
    public final void ruleEmphasisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:2: ( ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) ) )
            // InternalMyDsl.g:559:2: ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) )
            {
            // InternalMyDsl.g:559:2: ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) )
            // InternalMyDsl.g:560:3: ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* )
            {
            // InternalMyDsl.g:560:3: ( ( rule__EmphasisExpression__Alternatives ) )
            // InternalMyDsl.g:561:4: ( rule__EmphasisExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:562:4: ( rule__EmphasisExpression__Alternatives )
            // InternalMyDsl.g:562:5: rule__EmphasisExpression__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__EmphasisExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmphasisExpressionAccess().getAlternatives()); 
            }

            }

            // InternalMyDsl.g:565:3: ( ( rule__EmphasisExpression__Alternatives )* )
            // InternalMyDsl.g:566:4: ( rule__EmphasisExpression__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:567:4: ( rule__EmphasisExpression__Alternatives )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:567:5: rule__EmphasisExpression__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__EmphasisExpression__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmphasisExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEmphasisExpression"


    // $ANTLR start "entryRuleStrongExpression"
    // InternalMyDsl.g:577:1: entryRuleStrongExpression : ruleStrongExpression EOF ;
    public final void entryRuleStrongExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:581:1: ( ruleStrongExpression EOF )
            // InternalMyDsl.g:582:1: ruleStrongExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStrongExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrongExpressionRule()); 
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
    // $ANTLR end "entryRuleStrongExpression"


    // $ANTLR start "ruleStrongExpression"
    // InternalMyDsl.g:592:1: ruleStrongExpression : ( ( rule__StrongExpression__Group__0 ) ) ;
    public final void ruleStrongExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:597:2: ( ( ( rule__StrongExpression__Group__0 ) ) )
            // InternalMyDsl.g:598:2: ( ( rule__StrongExpression__Group__0 ) )
            {
            // InternalMyDsl.g:598:2: ( ( rule__StrongExpression__Group__0 ) )
            // InternalMyDsl.g:599:3: ( rule__StrongExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:600:3: ( rule__StrongExpression__Group__0 )
            // InternalMyDsl.g:600:4: rule__StrongExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StrongExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrongExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleStrongExpression"


    // $ANTLR start "entryRuleItalicExpression"
    // InternalMyDsl.g:610:1: entryRuleItalicExpression : ruleItalicExpression EOF ;
    public final void entryRuleItalicExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:614:1: ( ruleItalicExpression EOF )
            // InternalMyDsl.g:615:1: ruleItalicExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleItalicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicExpressionRule()); 
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
    // $ANTLR end "entryRuleItalicExpression"


    // $ANTLR start "ruleItalicExpression"
    // InternalMyDsl.g:625:1: ruleItalicExpression : ( ( rule__ItalicExpression__Group__0 ) ) ;
    public final void ruleItalicExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:2: ( ( ( rule__ItalicExpression__Group__0 ) ) )
            // InternalMyDsl.g:631:2: ( ( rule__ItalicExpression__Group__0 ) )
            {
            // InternalMyDsl.g:631:2: ( ( rule__ItalicExpression__Group__0 ) )
            // InternalMyDsl.g:632:3: ( rule__ItalicExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:633:3: ( rule__ItalicExpression__Group__0 )
            // InternalMyDsl.g:633:4: rule__ItalicExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItalicExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleItalicExpression"


    // $ANTLR start "entryRuleScratchExpression"
    // InternalMyDsl.g:643:1: entryRuleScratchExpression : ruleScratchExpression EOF ;
    public final void entryRuleScratchExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:647:1: ( ruleScratchExpression EOF )
            // InternalMyDsl.g:648:1: ruleScratchExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleScratchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScratchExpressionRule()); 
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
    // $ANTLR end "entryRuleScratchExpression"


    // $ANTLR start "ruleScratchExpression"
    // InternalMyDsl.g:658:1: ruleScratchExpression : ( ( rule__ScratchExpression__Group__0 ) ) ;
    public final void ruleScratchExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:2: ( ( ( rule__ScratchExpression__Group__0 ) ) )
            // InternalMyDsl.g:664:2: ( ( rule__ScratchExpression__Group__0 ) )
            {
            // InternalMyDsl.g:664:2: ( ( rule__ScratchExpression__Group__0 ) )
            // InternalMyDsl.g:665:3: ( rule__ScratchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:666:3: ( rule__ScratchExpression__Group__0 )
            // InternalMyDsl.g:666:4: rule__ScratchExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScratchExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScratchExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleScratchExpression"


    // $ANTLR start "entryRuleNaturalExpression"
    // InternalMyDsl.g:676:1: entryRuleNaturalExpression : ruleNaturalExpression EOF ;
    public final void entryRuleNaturalExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:677:1: ( ruleNaturalExpression EOF )
            // InternalMyDsl.g:678:1: ruleNaturalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNaturalExpressionRule()); 
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
    // $ANTLR end "entryRuleNaturalExpression"


    // $ANTLR start "ruleNaturalExpression"
    // InternalMyDsl.g:685:1: ruleNaturalExpression : ( ( rule__NaturalExpression__Group__0 ) ) ;
    public final void ruleNaturalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:689:2: ( ( ( rule__NaturalExpression__Group__0 ) ) )
            // InternalMyDsl.g:690:2: ( ( rule__NaturalExpression__Group__0 ) )
            {
            // InternalMyDsl.g:690:2: ( ( rule__NaturalExpression__Group__0 ) )
            // InternalMyDsl.g:691:3: ( rule__NaturalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:692:3: ( rule__NaturalExpression__Group__0 )
            // InternalMyDsl.g:692:4: rule__NaturalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NaturalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNaturalExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleNaturalExpression"


    // $ANTLR start "entryRuleContent"
    // InternalMyDsl.g:701:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:702:1: ( ruleContent EOF )
            // InternalMyDsl.g:703:1: ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentRule()); 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalMyDsl.g:710:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:714:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalMyDsl.g:715:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalMyDsl.g:715:2: ( ( rule__Content__Alternatives ) )
            // InternalMyDsl.g:716:3: ( rule__Content__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:717:3: ( rule__Content__Alternatives )
            // InternalMyDsl.g:717:4: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleContent"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:725:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Alternatives_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( ( rule__Expression__Alternatives_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:730:2: ( ( rule__Expression__Alternatives_0 ) )
                    {
                    // InternalMyDsl.g:730:2: ( ( rule__Expression__Alternatives_0 ) )
                    // InternalMyDsl.g:731:3: ( rule__Expression__Alternatives_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getAlternatives_0()); 
                    }
                    // InternalMyDsl.g:732:3: ( rule__Expression__Alternatives_0 )
                    // InternalMyDsl.g:732:4: rule__Expression__Alternatives_0
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
                    // InternalMyDsl.g:736:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:736:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalMyDsl.g:737:3: ( rule__Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:738:3: ( rule__Expression__Group_1__0 )
                    // InternalMyDsl.g:738:4: rule__Expression__Group_1__0
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


    // $ANTLR start "rule__Expression__Alternatives_0"
    // InternalMyDsl.g:746:1: rule__Expression__Alternatives_0 : ( ( ( ruleHeaderExpression ) ) | ( ruleBreakLineExpression ) | ( ( rule__Expression__Group_0_2__0 ) ) );
    public final void rule__Expression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( ( ruleHeaderExpression ) ) | ( ruleBreakLineExpression ) | ( ( rule__Expression__Group_0_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
            case 13:
            case 14:
            case 15:
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
                    // InternalMyDsl.g:751:2: ( ( ruleHeaderExpression ) )
                    {
                    // InternalMyDsl.g:751:2: ( ( ruleHeaderExpression ) )
                    // InternalMyDsl.g:752:3: ( ruleHeaderExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getHeaderExpressionParserRuleCall_0_0()); 
                    }
                    // InternalMyDsl.g:753:3: ( ruleHeaderExpression )
                    // InternalMyDsl.g:753:4: ruleHeaderExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleHeaderExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getHeaderExpressionParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:757:2: ( ruleBreakLineExpression )
                    {
                    // InternalMyDsl.g:757:2: ( ruleBreakLineExpression )
                    // InternalMyDsl.g:758:3: ruleBreakLineExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBreakLineExpressionParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBreakLineExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBreakLineExpressionParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:763:2: ( ( rule__Expression__Group_0_2__0 ) )
                    {
                    // InternalMyDsl.g:763:2: ( ( rule__Expression__Group_0_2__0 ) )
                    // InternalMyDsl.g:764:3: ( rule__Expression__Group_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_0_2()); 
                    }
                    // InternalMyDsl.g:765:3: ( rule__Expression__Group_0_2__0 )
                    // InternalMyDsl.g:765:4: rule__Expression__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getGroup_0_2()); 
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
    // InternalMyDsl.g:773:1: rule__TextExpression__Alternatives : ( ( ( rule__TextExpression__CAssignment_0 ) ) | ( ( rule__TextExpression__Group_1__0 ) ) );
    public final void rule__TextExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( ( rule__TextExpression__CAssignment_0 ) ) | ( ( rule__TextExpression__Group_1__0 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:778:2: ( ( rule__TextExpression__CAssignment_0 ) )
                    {
                    // InternalMyDsl.g:778:2: ( ( rule__TextExpression__CAssignment_0 ) )
                    // InternalMyDsl.g:779:3: ( rule__TextExpression__CAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getCAssignment_0()); 
                    }
                    // InternalMyDsl.g:780:3: ( rule__TextExpression__CAssignment_0 )
                    // InternalMyDsl.g:780:4: rule__TextExpression__CAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__CAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getCAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:784:2: ( ( rule__TextExpression__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:784:2: ( ( rule__TextExpression__Group_1__0 ) )
                    // InternalMyDsl.g:785:3: ( rule__TextExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:786:3: ( rule__TextExpression__Group_1__0 )
                    // InternalMyDsl.g:786:4: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getGroup_1()); 
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


    // $ANTLR start "rule__TextExpression__Alternatives_1_0"
    // InternalMyDsl.g:794:1: rule__TextExpression__Alternatives_1_0 : ( ( ( rule__TextExpression__CAssignment_1_0_0 ) ) | ( ( rule__TextExpression__CAssignment_1_0_1 ) ) | ( ( rule__TextExpression__Alternatives_1_0_2 ) ) );
    public final void rule__TextExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( ( ( rule__TextExpression__CAssignment_1_0_0 ) ) | ( ( rule__TextExpression__CAssignment_1_0_1 ) ) | ( ( rule__TextExpression__Alternatives_1_0_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 14:
            case 16:
            case 17:
            case 18:
                {
                alt5=2;
                }
                break;
            case 21:
            case 24:
            case 25:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:799:2: ( ( rule__TextExpression__CAssignment_1_0_0 ) )
                    {
                    // InternalMyDsl.g:799:2: ( ( rule__TextExpression__CAssignment_1_0_0 ) )
                    // InternalMyDsl.g:800:3: ( rule__TextExpression__CAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_0()); 
                    }
                    // InternalMyDsl.g:801:3: ( rule__TextExpression__CAssignment_1_0_0 )
                    // InternalMyDsl.g:801:4: rule__TextExpression__CAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__CAssignment_1_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:805:2: ( ( rule__TextExpression__CAssignment_1_0_1 ) )
                    {
                    // InternalMyDsl.g:805:2: ( ( rule__TextExpression__CAssignment_1_0_1 ) )
                    // InternalMyDsl.g:806:3: ( rule__TextExpression__CAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_1()); 
                    }
                    // InternalMyDsl.g:807:3: ( rule__TextExpression__CAssignment_1_0_1 )
                    // InternalMyDsl.g:807:4: rule__TextExpression__CAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__CAssignment_1_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:811:2: ( ( rule__TextExpression__Alternatives_1_0_2 ) )
                    {
                    // InternalMyDsl.g:811:2: ( ( rule__TextExpression__Alternatives_1_0_2 ) )
                    // InternalMyDsl.g:812:3: ( rule__TextExpression__Alternatives_1_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getAlternatives_1_0_2()); 
                    }
                    // InternalMyDsl.g:813:3: ( rule__TextExpression__Alternatives_1_0_2 )
                    // InternalMyDsl.g:813:4: rule__TextExpression__Alternatives_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__Alternatives_1_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getAlternatives_1_0_2()); 
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
    // $ANTLR end "rule__TextExpression__Alternatives_1_0"


    // $ANTLR start "rule__TextExpression__Alternatives_1_0_2"
    // InternalMyDsl.g:821:1: rule__TextExpression__Alternatives_1_0_2 : ( ( ( rule__TextExpression__CAssignment_1_0_2_0 ) ) | ( ( rule__TextExpression__CAssignment_1_0_2_1 ) ) | ( ( rule__TextExpression__CAssignment_1_0_2_2 ) ) );
    public final void rule__TextExpression__Alternatives_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( ( ( rule__TextExpression__CAssignment_1_0_2_0 ) ) | ( ( rule__TextExpression__CAssignment_1_0_2_1 ) ) | ( ( rule__TextExpression__CAssignment_1_0_2_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:826:2: ( ( rule__TextExpression__CAssignment_1_0_2_0 ) )
                    {
                    // InternalMyDsl.g:826:2: ( ( rule__TextExpression__CAssignment_1_0_2_0 ) )
                    // InternalMyDsl.g:827:3: ( rule__TextExpression__CAssignment_1_0_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_2_0()); 
                    }
                    // InternalMyDsl.g:828:3: ( rule__TextExpression__CAssignment_1_0_2_0 )
                    // InternalMyDsl.g:828:4: rule__TextExpression__CAssignment_1_0_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__CAssignment_1_0_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:832:2: ( ( rule__TextExpression__CAssignment_1_0_2_1 ) )
                    {
                    // InternalMyDsl.g:832:2: ( ( rule__TextExpression__CAssignment_1_0_2_1 ) )
                    // InternalMyDsl.g:833:3: ( rule__TextExpression__CAssignment_1_0_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_2_1()); 
                    }
                    // InternalMyDsl.g:834:3: ( rule__TextExpression__CAssignment_1_0_2_1 )
                    // InternalMyDsl.g:834:4: rule__TextExpression__CAssignment_1_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__CAssignment_1_0_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:838:2: ( ( rule__TextExpression__CAssignment_1_0_2_2 ) )
                    {
                    // InternalMyDsl.g:838:2: ( ( rule__TextExpression__CAssignment_1_0_2_2 ) )
                    // InternalMyDsl.g:839:3: ( rule__TextExpression__CAssignment_1_0_2_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_2_2()); 
                    }
                    // InternalMyDsl.g:840:3: ( rule__TextExpression__CAssignment_1_0_2_2 )
                    // InternalMyDsl.g:840:4: rule__TextExpression__CAssignment_1_0_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__CAssignment_1_0_2_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getCAssignment_1_0_2_2()); 
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
    // $ANTLR end "rule__TextExpression__Alternatives_1_0_2"


    // $ANTLR start "rule__ListExpression__Alternatives"
    // InternalMyDsl.g:848:1: rule__ListExpression__Alternatives : ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) ) );
    public final void rule__ListExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=13 && LA8_0<=15)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:853:2: ( ( rule__ListExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:853:2: ( ( rule__ListExpression__Group_0__0 ) )
                    // InternalMyDsl.g:854:3: ( rule__ListExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:855:3: ( rule__ListExpression__Group_0__0 )
                    // InternalMyDsl.g:855:4: rule__ListExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:859:2: ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) )
                    {
                    // InternalMyDsl.g:859:2: ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) )
                    // InternalMyDsl.g:860:3: ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* )
                    {
                    // InternalMyDsl.g:860:3: ( ( rule__ListExpression__Group_1__0 ) )
                    // InternalMyDsl.g:861:4: ( rule__ListExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:862:4: ( rule__ListExpression__Group_1__0 )
                    // InternalMyDsl.g:862:5: rule__ListExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__ListExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }

                    }

                    // InternalMyDsl.g:865:3: ( ( rule__ListExpression__Group_1__0 )* )
                    // InternalMyDsl.g:866:4: ( rule__ListExpression__Group_1__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:867:4: ( rule__ListExpression__Group_1__0 )*
                    loop7:
                    do {
                        int alt7=2;
                        alt7 = dfa7.predict(input);
                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:867:5: rule__ListExpression__Group_1__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__ListExpression__Group_1__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__ListExpression__Alternatives"


    // $ANTLR start "rule__ListExpression__Alternatives_0_1_0"
    // InternalMyDsl.g:876:1: rule__ListExpression__Alternatives_0_1_0 : ( ( '*' ) | ( '-' ) | ( '+' ) );
    public final void rule__ListExpression__Alternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( ( '*' ) | ( '-' ) | ( '+' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:881:2: ( '*' )
                    {
                    // InternalMyDsl.g:881:2: ( '*' )
                    // InternalMyDsl.g:882:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getAsteriskKeyword_0_1_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getAsteriskKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:887:2: ( '-' )
                    {
                    // InternalMyDsl.g:887:2: ( '-' )
                    // InternalMyDsl.g:888:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getHyphenMinusKeyword_0_1_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getHyphenMinusKeyword_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:893:2: ( '+' )
                    {
                    // InternalMyDsl.g:893:2: ( '+' )
                    // InternalMyDsl.g:894:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getPlusSignKeyword_0_1_0_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getPlusSignKeyword_0_1_0_2()); 
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
    // $ANTLR end "rule__ListExpression__Alternatives_0_1_0"


    // $ANTLR start "rule__HeaderExpression__Alternatives"
    // InternalMyDsl.g:903:1: rule__HeaderExpression__Alternatives : ( ( ruleHeader1Expression ) | ( ruleHeader2Expression ) | ( ruleHeader3Expression ) | ( ruleHeader4Expression ) | ( ruleHeader5Expression ) | ( ruleHeader6Expression ) );
    public final void rule__HeaderExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( ruleHeader1Expression ) | ( ruleHeader2Expression ) | ( ruleHeader3Expression ) | ( ruleHeader4Expression ) | ( ruleHeader5Expression ) | ( ruleHeader6Expression ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            case 31:
                {
                alt10=5;
                }
                break;
            case 32:
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:908:2: ( ruleHeader1Expression )
                    {
                    // InternalMyDsl.g:908:2: ( ruleHeader1Expression )
                    // InternalMyDsl.g:909:3: ruleHeader1Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderExpressionAccess().getHeader1ExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeader1Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderExpressionAccess().getHeader1ExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:914:2: ( ruleHeader2Expression )
                    {
                    // InternalMyDsl.g:914:2: ( ruleHeader2Expression )
                    // InternalMyDsl.g:915:3: ruleHeader2Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderExpressionAccess().getHeader2ExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeader2Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderExpressionAccess().getHeader2ExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:920:2: ( ruleHeader3Expression )
                    {
                    // InternalMyDsl.g:920:2: ( ruleHeader3Expression )
                    // InternalMyDsl.g:921:3: ruleHeader3Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderExpressionAccess().getHeader3ExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeader3Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderExpressionAccess().getHeader3ExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:926:2: ( ruleHeader4Expression )
                    {
                    // InternalMyDsl.g:926:2: ( ruleHeader4Expression )
                    // InternalMyDsl.g:927:3: ruleHeader4Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderExpressionAccess().getHeader4ExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeader4Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderExpressionAccess().getHeader4ExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:932:2: ( ruleHeader5Expression )
                    {
                    // InternalMyDsl.g:932:2: ( ruleHeader5Expression )
                    // InternalMyDsl.g:933:3: ruleHeader5Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderExpressionAccess().getHeader5ExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeader5Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderExpressionAccess().getHeader5ExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:938:2: ( ruleHeader6Expression )
                    {
                    // InternalMyDsl.g:938:2: ( ruleHeader6Expression )
                    // InternalMyDsl.g:939:3: ruleHeader6Expression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeaderExpressionAccess().getHeader6ExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHeader6Expression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeaderExpressionAccess().getHeader6ExpressionParserRuleCall_5()); 
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
    // $ANTLR end "rule__HeaderExpression__Alternatives"


    // $ANTLR start "rule__EmphasisExpression__Alternatives"
    // InternalMyDsl.g:948:1: rule__EmphasisExpression__Alternatives : ( ( ( rule__EmphasisExpression__Group_0__0 ) ) | ( ( rule__EmphasisExpression__CAssignment_1 ) ) );
    public final void rule__EmphasisExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:952:1: ( ( ( rule__EmphasisExpression__Group_0__0 ) ) | ( ( rule__EmphasisExpression__CAssignment_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13||(LA11_0>=33 && LA11_0<=34)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==14||(LA11_0>=16 && LA11_0<=18)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:953:2: ( ( rule__EmphasisExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:953:2: ( ( rule__EmphasisExpression__Group_0__0 ) )
                    // InternalMyDsl.g:954:3: ( rule__EmphasisExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:955:3: ( rule__EmphasisExpression__Group_0__0 )
                    // InternalMyDsl.g:955:4: rule__EmphasisExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmphasisExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmphasisExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:959:2: ( ( rule__EmphasisExpression__CAssignment_1 ) )
                    {
                    // InternalMyDsl.g:959:2: ( ( rule__EmphasisExpression__CAssignment_1 ) )
                    // InternalMyDsl.g:960:3: ( rule__EmphasisExpression__CAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_1()); 
                    }
                    // InternalMyDsl.g:961:3: ( rule__EmphasisExpression__CAssignment_1 )
                    // InternalMyDsl.g:961:4: rule__EmphasisExpression__CAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmphasisExpression__CAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmphasisExpressionAccess().getCAssignment_1()); 
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
    // $ANTLR end "rule__EmphasisExpression__Alternatives"


    // $ANTLR start "rule__EmphasisExpression__Alternatives_0_0"
    // InternalMyDsl.g:969:1: rule__EmphasisExpression__Alternatives_0_0 : ( ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) ) );
    public final void rule__EmphasisExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt12=1;
                }
                break;
            case 13:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:974:2: ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) )
                    {
                    // InternalMyDsl.g:974:2: ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) )
                    // InternalMyDsl.g:975:3: ( rule__EmphasisExpression__CAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_0()); 
                    }
                    // InternalMyDsl.g:976:3: ( rule__EmphasisExpression__CAssignment_0_0_0 )
                    // InternalMyDsl.g:976:4: rule__EmphasisExpression__CAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmphasisExpression__CAssignment_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:980:2: ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) )
                    {
                    // InternalMyDsl.g:980:2: ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) )
                    // InternalMyDsl.g:981:3: ( rule__EmphasisExpression__CAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_1()); 
                    }
                    // InternalMyDsl.g:982:3: ( rule__EmphasisExpression__CAssignment_0_0_1 )
                    // InternalMyDsl.g:982:4: rule__EmphasisExpression__CAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmphasisExpression__CAssignment_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:986:2: ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) )
                    {
                    // InternalMyDsl.g:986:2: ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) )
                    // InternalMyDsl.g:987:3: ( rule__EmphasisExpression__CAssignment_0_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_2()); 
                    }
                    // InternalMyDsl.g:988:3: ( rule__EmphasisExpression__CAssignment_0_0_2 )
                    // InternalMyDsl.g:988:4: rule__EmphasisExpression__CAssignment_0_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmphasisExpression__CAssignment_0_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_2()); 
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
    // $ANTLR end "rule__EmphasisExpression__Alternatives_0_0"


    // $ANTLR start "rule__Content__Alternatives"
    // InternalMyDsl.g:996:1: rule__Content__Alternatives : ( ( ( rule__Content__Group_0__0 ) ) | ( '\\'' ) | ( '-' ) | ( '|' ) | ( '\"' ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( ( rule__Content__Group_0__0 ) ) | ( '\\'' ) | ( '-' ) | ( '|' ) | ( '\"' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
                {
                alt13=1;
                }
                break;
            case 16:
                {
                alt13=2;
                }
                break;
            case 14:
                {
                alt13=3;
                }
                break;
            case 17:
                {
                alt13=4;
                }
                break;
            case 18:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1001:2: ( ( rule__Content__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1001:2: ( ( rule__Content__Group_0__0 ) )
                    // InternalMyDsl.g:1002:3: ( rule__Content__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1003:3: ( rule__Content__Group_0__0 )
                    // InternalMyDsl.g:1003:4: rule__Content__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1007:2: ( '\\'' )
                    {
                    // InternalMyDsl.g:1007:2: ( '\\'' )
                    // InternalMyDsl.g:1008:3: '\\''
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getApostropheKeyword_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getApostropheKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1013:2: ( '-' )
                    {
                    // InternalMyDsl.g:1013:2: ( '-' )
                    // InternalMyDsl.g:1014:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getHyphenMinusKeyword_2()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getHyphenMinusKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1019:2: ( '|' )
                    {
                    // InternalMyDsl.g:1019:2: ( '|' )
                    // InternalMyDsl.g:1020:3: '|'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getVerticalLineKeyword_3()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getVerticalLineKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1025:2: ( '\"' )
                    {
                    // InternalMyDsl.g:1025:2: ( '\"' )
                    // InternalMyDsl.g:1026:3: '\"'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getQuotationMarkKeyword_4()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getQuotationMarkKeyword_4()); 
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
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__Content__Alternatives_0_0"
    // InternalMyDsl.g:1035:1: rule__Content__Alternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__Content__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case RULE_INT:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1040:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1040:2: ( RULE_ID )
                    // InternalMyDsl.g:1041:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getIDTerminalRuleCall_0_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getIDTerminalRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1046:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1046:2: ( RULE_STRING )
                    // InternalMyDsl.g:1047:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1052:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1052:2: ( RULE_INT )
                    // InternalMyDsl.g:1053:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getINTTerminalRuleCall_0_0_2()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getINTTerminalRuleCall_0_0_2()); 
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
    // $ANTLR end "rule__Content__Alternatives_0_0"


    // $ANTLR start "rule__File__Group__0"
    // InternalMyDsl.g:1062:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalMyDsl.g:1067:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1074:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( ( () ) )
            // InternalMyDsl.g:1079:1: ( () )
            {
            // InternalMyDsl.g:1079:1: ( () )
            // InternalMyDsl.g:1080:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalMyDsl.g:1081:2: ()
            // InternalMyDsl.g:1081:3: 
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
    // InternalMyDsl.g:1089:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( rule__File__Group__1__Impl )
            // InternalMyDsl.g:1094:2: rule__File__Group__1__Impl
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
    // InternalMyDsl.g:1100:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalMyDsl.g:1105:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalMyDsl.g:1105:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalMyDsl.g:1106:2: ( rule__File__ExpressionAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            }
            // InternalMyDsl.g:1107:2: ( rule__File__ExpressionAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||(LA15_0>=13 && LA15_0<=18)||(LA15_0>=20 && LA15_0<=21)||(LA15_0>=24 && LA15_0<=25)||(LA15_0>=27 && LA15_0<=35)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1107:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "rule__Expression__Group_0_2__0"
    // InternalMyDsl.g:1116:1: rule__Expression__Group_0_2__0 : rule__Expression__Group_0_2__0__Impl rule__Expression__Group_0_2__1 ;
    public final void rule__Expression__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( rule__Expression__Group_0_2__0__Impl rule__Expression__Group_0_2__1 )
            // InternalMyDsl.g:1121:2: rule__Expression__Group_0_2__0__Impl rule__Expression__Group_0_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0_2__1();

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
    // $ANTLR end "rule__Expression__Group_0_2__0"


    // $ANTLR start "rule__Expression__Group_0_2__0__Impl"
    // InternalMyDsl.g:1128:1: rule__Expression__Group_0_2__0__Impl : ( ruleListExpression ) ;
    public final void rule__Expression__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( ruleListExpression ) )
            // InternalMyDsl.g:1133:1: ( ruleListExpression )
            {
            // InternalMyDsl.g:1133:1: ( ruleListExpression )
            // InternalMyDsl.g:1134:2: ruleListExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getListExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getListExpressionParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__Expression__Group_0_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_0_2__1"
    // InternalMyDsl.g:1143:1: rule__Expression__Group_0_2__1 : rule__Expression__Group_0_2__1__Impl ;
    public final void rule__Expression__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( rule__Expression__Group_0_2__1__Impl )
            // InternalMyDsl.g:1148:2: rule__Expression__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0_2__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_0_2__1"


    // $ANTLR start "rule__Expression__Group_0_2__1__Impl"
    // InternalMyDsl.g:1154:1: rule__Expression__Group_0_2__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1159:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1159:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1160:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_2_1()); 
            }
            // InternalMyDsl.g:1161:2: ( RULE_BL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1161:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_2_1()); 
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
    // $ANTLR end "rule__Expression__Group_0_2__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMyDsl.g:1170:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMyDsl.g:1175:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // InternalMyDsl.g:1182:1: rule__Expression__Group_1__0__Impl : ( ruleTextExpression ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:1187:1: ( ruleTextExpression )
            {
            // InternalMyDsl.g:1187:1: ( ruleTextExpression )
            // InternalMyDsl.g:1188:2: ruleTextExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getTextExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getTextExpressionParserRuleCall_1_0()); 
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


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalMyDsl.g:1197:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( rule__Expression__Group_1__1__Impl )
            // InternalMyDsl.g:1202:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalMyDsl.g:1208:1: rule__Expression__Group_1__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1213:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1213:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1214:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1_1()); 
            }
            // InternalMyDsl.g:1215:2: ( RULE_BL )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_BL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1215:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__BreakLineExpression__Group__0"
    // InternalMyDsl.g:1224:1: rule__BreakLineExpression__Group__0 : rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1 ;
    public final void rule__BreakLineExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1 )
            // InternalMyDsl.g:1229:2: rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BreakLineExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BreakLineExpression__Group__1();

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
    // $ANTLR end "rule__BreakLineExpression__Group__0"


    // $ANTLR start "rule__BreakLineExpression__Group__0__Impl"
    // InternalMyDsl.g:1236:1: rule__BreakLineExpression__Group__0__Impl : ( () ) ;
    public final void rule__BreakLineExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( ( () ) )
            // InternalMyDsl.g:1241:1: ( () )
            {
            // InternalMyDsl.g:1241:1: ( () )
            // InternalMyDsl.g:1242:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionBAction_0()); 
            }
            // InternalMyDsl.g:1243:2: ()
            // InternalMyDsl.g:1243:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionBAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreakLineExpression__Group__0__Impl"


    // $ANTLR start "rule__BreakLineExpression__Group__1"
    // InternalMyDsl.g:1251:1: rule__BreakLineExpression__Group__1 : rule__BreakLineExpression__Group__1__Impl rule__BreakLineExpression__Group__2 ;
    public final void rule__BreakLineExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( rule__BreakLineExpression__Group__1__Impl rule__BreakLineExpression__Group__2 )
            // InternalMyDsl.g:1256:2: rule__BreakLineExpression__Group__1__Impl rule__BreakLineExpression__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__BreakLineExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BreakLineExpression__Group__2();

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
    // $ANTLR end "rule__BreakLineExpression__Group__1"


    // $ANTLR start "rule__BreakLineExpression__Group__1__Impl"
    // InternalMyDsl.g:1263:1: rule__BreakLineExpression__Group__1__Impl : ( ( rule__BreakLineExpression__IsBRAssignment_1 ) ) ;
    public final void rule__BreakLineExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( ( ( rule__BreakLineExpression__IsBRAssignment_1 ) ) )
            // InternalMyDsl.g:1268:1: ( ( rule__BreakLineExpression__IsBRAssignment_1 ) )
            {
            // InternalMyDsl.g:1268:1: ( ( rule__BreakLineExpression__IsBRAssignment_1 ) )
            // InternalMyDsl.g:1269:2: ( rule__BreakLineExpression__IsBRAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getIsBRAssignment_1()); 
            }
            // InternalMyDsl.g:1270:2: ( rule__BreakLineExpression__IsBRAssignment_1 )
            // InternalMyDsl.g:1270:3: rule__BreakLineExpression__IsBRAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BreakLineExpression__IsBRAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakLineExpressionAccess().getIsBRAssignment_1()); 
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
    // $ANTLR end "rule__BreakLineExpression__Group__1__Impl"


    // $ANTLR start "rule__BreakLineExpression__Group__2"
    // InternalMyDsl.g:1278:1: rule__BreakLineExpression__Group__2 : rule__BreakLineExpression__Group__2__Impl ;
    public final void rule__BreakLineExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( rule__BreakLineExpression__Group__2__Impl )
            // InternalMyDsl.g:1283:2: rule__BreakLineExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BreakLineExpression__Group__2__Impl();

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
    // $ANTLR end "rule__BreakLineExpression__Group__2"


    // $ANTLR start "rule__BreakLineExpression__Group__2__Impl"
    // InternalMyDsl.g:1289:1: rule__BreakLineExpression__Group__2__Impl : ( RULE_BL ) ;
    public final void rule__BreakLineExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:1294:1: ( RULE_BL )
            {
            // InternalMyDsl.g:1294:1: ( RULE_BL )
            // InternalMyDsl.g:1295:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getBLTerminalRuleCall_2()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakLineExpressionAccess().getBLTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__BreakLineExpression__Group__2__Impl"


    // $ANTLR start "rule__TextExpression__Group_1__0"
    // InternalMyDsl.g:1305:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( rule__TextExpression__Group_1__0__Impl )
            // InternalMyDsl.g:1310:2: rule__TextExpression__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Group_1__0__Impl();

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
    // $ANTLR end "rule__TextExpression__Group_1__0"


    // $ANTLR start "rule__TextExpression__Group_1__0__Impl"
    // InternalMyDsl.g:1316:1: rule__TextExpression__Group_1__0__Impl : ( ( rule__TextExpression__Alternatives_1_0 ) ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( ( ( rule__TextExpression__Alternatives_1_0 ) ) )
            // InternalMyDsl.g:1321:1: ( ( rule__TextExpression__Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:1321:1: ( ( rule__TextExpression__Alternatives_1_0 ) )
            // InternalMyDsl.g:1322:2: ( rule__TextExpression__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives_1_0()); 
            }
            // InternalMyDsl.g:1323:2: ( rule__TextExpression__Alternatives_1_0 )
            // InternalMyDsl.g:1323:3: rule__TextExpression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__TextExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_0__0"
    // InternalMyDsl.g:1332:1: rule__ListExpression__Group_0__0 : rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 ;
    public final void rule__ListExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 )
            // InternalMyDsl.g:1337:2: rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__ListExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_0__1();

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
    // $ANTLR end "rule__ListExpression__Group_0__0"


    // $ANTLR start "rule__ListExpression__Group_0__0__Impl"
    // InternalMyDsl.g:1344:1: rule__ListExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( ( () ) )
            // InternalMyDsl.g:1349:1: ( () )
            {
            // InternalMyDsl.g:1349:1: ( () )
            // InternalMyDsl.g:1350:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getTextExpressionAction_0_0()); 
            }
            // InternalMyDsl.g:1351:2: ()
            // InternalMyDsl.g:1351:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getTextExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_0__1"
    // InternalMyDsl.g:1359:1: rule__ListExpression__Group_0__1 : rule__ListExpression__Group_0__1__Impl ;
    public final void rule__ListExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( rule__ListExpression__Group_0__1__Impl )
            // InternalMyDsl.g:1364:2: rule__ListExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_0__1__Impl();

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
    // $ANTLR end "rule__ListExpression__Group_0__1"


    // $ANTLR start "rule__ListExpression__Group_0__1__Impl"
    // InternalMyDsl.g:1370:1: rule__ListExpression__Group_0__1__Impl : ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) ) ;
    public final void rule__ListExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1374:1: ( ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) ) )
            // InternalMyDsl.g:1375:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) )
            {
            // InternalMyDsl.g:1375:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) )
            // InternalMyDsl.g:1376:2: ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* )
            {
            // InternalMyDsl.g:1376:2: ( ( rule__ListExpression__Group_0_1__0 ) )
            // InternalMyDsl.g:1377:3: ( rule__ListExpression__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:1378:3: ( rule__ListExpression__Group_0_1__0 )
            // InternalMyDsl.g:1378:4: rule__ListExpression__Group_0_1__0
            {
            pushFollow(FOLLOW_10);
            rule__ListExpression__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }

            }

            // InternalMyDsl.g:1381:2: ( ( rule__ListExpression__Group_0_1__0 )* )
            // InternalMyDsl.g:1382:3: ( rule__ListExpression__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:1383:3: ( rule__ListExpression__Group_0_1__0 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1383:4: rule__ListExpression__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ListExpression__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__ListExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_0_1__0"
    // InternalMyDsl.g:1393:1: rule__ListExpression__Group_0_1__0 : rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 ;
    public final void rule__ListExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1397:1: ( rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 )
            // InternalMyDsl.g:1398:2: rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ListExpression__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_0_1__1();

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
    // $ANTLR end "rule__ListExpression__Group_0_1__0"


    // $ANTLR start "rule__ListExpression__Group_0_1__0__Impl"
    // InternalMyDsl.g:1405:1: rule__ListExpression__Group_0_1__0__Impl : ( ( rule__ListExpression__Alternatives_0_1_0 ) ) ;
    public final void rule__ListExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( ( ( rule__ListExpression__Alternatives_0_1_0 ) ) )
            // InternalMyDsl.g:1410:1: ( ( rule__ListExpression__Alternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:1410:1: ( ( rule__ListExpression__Alternatives_0_1_0 ) )
            // InternalMyDsl.g:1411:2: ( rule__ListExpression__Alternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAlternatives_0_1_0()); 
            }
            // InternalMyDsl.g:1412:2: ( rule__ListExpression__Alternatives_0_1_0 )
            // InternalMyDsl.g:1412:3: rule__ListExpression__Alternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__Alternatives_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getAlternatives_0_1_0()); 
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
    // $ANTLR end "rule__ListExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_0_1__1"
    // InternalMyDsl.g:1420:1: rule__ListExpression__Group_0_1__1 : rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2 ;
    public final void rule__ListExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2 )
            // InternalMyDsl.g:1425:2: rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2
            {
            pushFollow(FOLLOW_11);
            rule__ListExpression__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_0_1__2();

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
    // $ANTLR end "rule__ListExpression__Group_0_1__1"


    // $ANTLR start "rule__ListExpression__Group_0_1__1__Impl"
    // InternalMyDsl.g:1432:1: rule__ListExpression__Group_0_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__ListExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( ( ( RULE_WS )* ) )
            // InternalMyDsl.g:1437:1: ( ( RULE_WS )* )
            {
            // InternalMyDsl.g:1437:1: ( ( RULE_WS )* )
            // InternalMyDsl.g:1438:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }
            // InternalMyDsl.g:1439:2: ( RULE_WS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1439:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_12); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
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
    // $ANTLR end "rule__ListExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_0_1__2"
    // InternalMyDsl.g:1447:1: rule__ListExpression__Group_0_1__2 : rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3 ;
    public final void rule__ListExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1451:1: ( rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3 )
            // InternalMyDsl.g:1452:2: rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3
            {
            pushFollow(FOLLOW_7);
            rule__ListExpression__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_0_1__3();

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
    // $ANTLR end "rule__ListExpression__Group_0_1__2"


    // $ANTLR start "rule__ListExpression__Group_0_1__2__Impl"
    // InternalMyDsl.g:1459:1: rule__ListExpression__Group_0_1__2__Impl : ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) ) ;
    public final void rule__ListExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) ) )
            // InternalMyDsl.g:1464:1: ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) )
            {
            // InternalMyDsl.g:1464:1: ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) )
            // InternalMyDsl.g:1465:2: ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentUnorderedAssignment_0_1_2()); 
            }
            // InternalMyDsl.g:1466:2: ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 )
            // InternalMyDsl.g:1466:3: rule__ListExpression__ContentUnorderedAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__ContentUnorderedAssignment_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getContentUnorderedAssignment_0_1_2()); 
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
    // $ANTLR end "rule__ListExpression__Group_0_1__2__Impl"


    // $ANTLR start "rule__ListExpression__Group_0_1__3"
    // InternalMyDsl.g:1474:1: rule__ListExpression__Group_0_1__3 : rule__ListExpression__Group_0_1__3__Impl ;
    public final void rule__ListExpression__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1478:1: ( rule__ListExpression__Group_0_1__3__Impl )
            // InternalMyDsl.g:1479:2: rule__ListExpression__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_0_1__3__Impl();

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
    // $ANTLR end "rule__ListExpression__Group_0_1__3"


    // $ANTLR start "rule__ListExpression__Group_0_1__3__Impl"
    // InternalMyDsl.g:1485:1: rule__ListExpression__Group_0_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ListExpression__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1490:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1490:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1491:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_0_1_3()); 
            }
            // InternalMyDsl.g:1492:2: ( RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred33_InternalMyDsl()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1492:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_0_1_3()); 
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
    // $ANTLR end "rule__ListExpression__Group_0_1__3__Impl"


    // $ANTLR start "rule__ListExpression__Group_1__0"
    // InternalMyDsl.g:1501:1: rule__ListExpression__Group_1__0 : rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 ;
    public final void rule__ListExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1505:1: ( rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 )
            // InternalMyDsl.g:1506:2: rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__ListExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_1__1();

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
    // $ANTLR end "rule__ListExpression__Group_1__0"


    // $ANTLR start "rule__ListExpression__Group_1__0__Impl"
    // InternalMyDsl.g:1513:1: rule__ListExpression__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__ListExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1518:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1518:1: ( RULE_INT )
            // InternalMyDsl.g:1519:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getINTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ListExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_1__1"
    // InternalMyDsl.g:1528:1: rule__ListExpression__Group_1__1 : rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2 ;
    public final void rule__ListExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1532:1: ( rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2 )
            // InternalMyDsl.g:1533:2: rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__ListExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_1__2();

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
    // $ANTLR end "rule__ListExpression__Group_1__1"


    // $ANTLR start "rule__ListExpression__Group_1__1__Impl"
    // InternalMyDsl.g:1540:1: rule__ListExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ListExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( ( '.' ) )
            // InternalMyDsl.g:1545:1: ( '.' )
            {
            // InternalMyDsl.g:1545:1: ( '.' )
            // InternalMyDsl.g:1546:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getFullStopKeyword_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getFullStopKeyword_1_1()); 
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
    // $ANTLR end "rule__ListExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_1__2"
    // InternalMyDsl.g:1555:1: rule__ListExpression__Group_1__2 : rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3 ;
    public final void rule__ListExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1559:1: ( rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3 )
            // InternalMyDsl.g:1560:2: rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__ListExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_1__3();

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
    // $ANTLR end "rule__ListExpression__Group_1__2"


    // $ANTLR start "rule__ListExpression__Group_1__2__Impl"
    // InternalMyDsl.g:1567:1: rule__ListExpression__Group_1__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__ListExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( ( ( RULE_WS )* ) )
            // InternalMyDsl.g:1572:1: ( ( RULE_WS )* )
            {
            // InternalMyDsl.g:1572:1: ( ( RULE_WS )* )
            // InternalMyDsl.g:1573:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }
            // InternalMyDsl.g:1574:2: ( RULE_WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1574:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_12); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
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
    // $ANTLR end "rule__ListExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ListExpression__Group_1__3"
    // InternalMyDsl.g:1582:1: rule__ListExpression__Group_1__3 : rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4 ;
    public final void rule__ListExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1586:1: ( rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4 )
            // InternalMyDsl.g:1587:2: rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__ListExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_1__4();

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
    // $ANTLR end "rule__ListExpression__Group_1__3"


    // $ANTLR start "rule__ListExpression__Group_1__3__Impl"
    // InternalMyDsl.g:1594:1: rule__ListExpression__Group_1__3__Impl : ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) ) ;
    public final void rule__ListExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) ) )
            // InternalMyDsl.g:1599:1: ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) )
            {
            // InternalMyDsl.g:1599:1: ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) )
            // InternalMyDsl.g:1600:2: ( rule__ListExpression__ContentOrderedAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentOrderedAssignment_1_3()); 
            }
            // InternalMyDsl.g:1601:2: ( rule__ListExpression__ContentOrderedAssignment_1_3 )
            // InternalMyDsl.g:1601:3: rule__ListExpression__ContentOrderedAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__ContentOrderedAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getContentOrderedAssignment_1_3()); 
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
    // $ANTLR end "rule__ListExpression__Group_1__3__Impl"


    // $ANTLR start "rule__ListExpression__Group_1__4"
    // InternalMyDsl.g:1609:1: rule__ListExpression__Group_1__4 : rule__ListExpression__Group_1__4__Impl ;
    public final void rule__ListExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1613:1: ( rule__ListExpression__Group_1__4__Impl )
            // InternalMyDsl.g:1614:2: rule__ListExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_1__4__Impl();

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
    // $ANTLR end "rule__ListExpression__Group_1__4"


    // $ANTLR start "rule__ListExpression__Group_1__4__Impl"
    // InternalMyDsl.g:1620:1: rule__ListExpression__Group_1__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ListExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1625:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1625:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1626:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_1_4()); 
            }
            // InternalMyDsl.g:1627:2: ( RULE_BL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BL) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred35_InternalMyDsl()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1627:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_1_4()); 
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
    // $ANTLR end "rule__ListExpression__Group_1__4__Impl"


    // $ANTLR start "rule__QuoteExpression__Group__0"
    // InternalMyDsl.g:1636:1: rule__QuoteExpression__Group__0 : rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 ;
    public final void rule__QuoteExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1640:1: ( rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 )
            // InternalMyDsl.g:1641:2: rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1648:1: rule__QuoteExpression__Group__0__Impl : ( () ) ;
    public final void rule__QuoteExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( ( () ) )
            // InternalMyDsl.g:1653:1: ( () )
            {
            // InternalMyDsl.g:1653:1: ( () )
            // InternalMyDsl.g:1654:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getTextExpressionAction_0()); 
            }
            // InternalMyDsl.g:1655:2: ()
            // InternalMyDsl.g:1655:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getTextExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuoteExpression__Group__0__Impl"


    // $ANTLR start "rule__QuoteExpression__Group__1"
    // InternalMyDsl.g:1663:1: rule__QuoteExpression__Group__1 : rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 ;
    public final void rule__QuoteExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1667:1: ( rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 )
            // InternalMyDsl.g:1668:2: rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1675:1: rule__QuoteExpression__Group__1__Impl : ( ( '>' ) ) ;
    public final void rule__QuoteExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( ( ( '>' ) ) )
            // InternalMyDsl.g:1680:1: ( ( '>' ) )
            {
            // InternalMyDsl.g:1680:1: ( ( '>' ) )
            // InternalMyDsl.g:1681:2: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1()); 
            }
            // InternalMyDsl.g:1682:2: ( '>' )
            // InternalMyDsl.g:1682:3: '>'
            {
            match(input,20,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1()); 
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
    // InternalMyDsl.g:1690:1: rule__QuoteExpression__Group__2 : rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3 ;
    public final void rule__QuoteExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1694:1: ( rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3 )
            // InternalMyDsl.g:1695:2: rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__QuoteExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__3();

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
    // InternalMyDsl.g:1702:1: rule__QuoteExpression__Group__2__Impl : ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) ) ;
    public final void rule__QuoteExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) ) )
            // InternalMyDsl.g:1707:1: ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) )
            {
            // InternalMyDsl.g:1707:1: ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) )
            // InternalMyDsl.g:1708:2: ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* )
            {
            // InternalMyDsl.g:1708:2: ( ( rule__QuoteExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:1709:3: ( rule__QuoteExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:1710:3: ( rule__QuoteExpression__ContentAssignment_2 )
            // InternalMyDsl.g:1710:4: rule__QuoteExpression__ContentAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__QuoteExpression__ContentAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
            }

            }

            // InternalMyDsl.g:1713:2: ( ( rule__QuoteExpression__ContentAssignment_2 )* )
            // InternalMyDsl.g:1714:3: ( rule__QuoteExpression__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:1715:3: ( rule__QuoteExpression__ContentAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1715:4: rule__QuoteExpression__ContentAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QuoteExpression__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
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
    // $ANTLR end "rule__QuoteExpression__Group__2__Impl"


    // $ANTLR start "rule__QuoteExpression__Group__3"
    // InternalMyDsl.g:1724:1: rule__QuoteExpression__Group__3 : rule__QuoteExpression__Group__3__Impl ;
    public final void rule__QuoteExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( rule__QuoteExpression__Group__3__Impl )
            // InternalMyDsl.g:1729:2: rule__QuoteExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuoteExpression__Group__3__Impl();

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
    // $ANTLR end "rule__QuoteExpression__Group__3"


    // $ANTLR start "rule__QuoteExpression__Group__3__Impl"
    // InternalMyDsl.g:1735:1: rule__QuoteExpression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__QuoteExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1739:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1740:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1740:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1741:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalMyDsl.g:1742:2: ( RULE_BL )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_BL) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred37_InternalMyDsl()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1742:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__QuoteExpression__Group__3__Impl"


    // $ANTLR start "rule__LinkExpression__Group__0"
    // InternalMyDsl.g:1751:1: rule__LinkExpression__Group__0 : rule__LinkExpression__Group__0__Impl rule__LinkExpression__Group__1 ;
    public final void rule__LinkExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1755:1: ( rule__LinkExpression__Group__0__Impl rule__LinkExpression__Group__1 )
            // InternalMyDsl.g:1756:2: rule__LinkExpression__Group__0__Impl rule__LinkExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__LinkExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group__1();

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
    // $ANTLR end "rule__LinkExpression__Group__0"


    // $ANTLR start "rule__LinkExpression__Group__0__Impl"
    // InternalMyDsl.g:1763:1: rule__LinkExpression__Group__0__Impl : ( () ) ;
    public final void rule__LinkExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1767:1: ( ( () ) )
            // InternalMyDsl.g:1768:1: ( () )
            {
            // InternalMyDsl.g:1768:1: ( () )
            // InternalMyDsl.g:1769:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0()); 
            }
            // InternalMyDsl.g:1770:2: ()
            // InternalMyDsl.g:1770:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group__0__Impl"


    // $ANTLR start "rule__LinkExpression__Group__1"
    // InternalMyDsl.g:1778:1: rule__LinkExpression__Group__1 : rule__LinkExpression__Group__1__Impl rule__LinkExpression__Group__2 ;
    public final void rule__LinkExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( rule__LinkExpression__Group__1__Impl rule__LinkExpression__Group__2 )
            // InternalMyDsl.g:1783:2: rule__LinkExpression__Group__1__Impl rule__LinkExpression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__LinkExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group__2();

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
    // $ANTLR end "rule__LinkExpression__Group__1"


    // $ANTLR start "rule__LinkExpression__Group__1__Impl"
    // InternalMyDsl.g:1790:1: rule__LinkExpression__Group__1__Impl : ( ( '[' ) ) ;
    public final void rule__LinkExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1794:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:1795:1: ( ( '[' ) )
            {
            // InternalMyDsl.g:1795:1: ( ( '[' ) )
            // InternalMyDsl.g:1796:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:1797:2: ( '[' )
            // InternalMyDsl.g:1797:3: '['
            {
            match(input,21,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__LinkExpression__Group__1__Impl"


    // $ANTLR start "rule__LinkExpression__Group__2"
    // InternalMyDsl.g:1805:1: rule__LinkExpression__Group__2 : rule__LinkExpression__Group__2__Impl rule__LinkExpression__Group__3 ;
    public final void rule__LinkExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( rule__LinkExpression__Group__2__Impl rule__LinkExpression__Group__3 )
            // InternalMyDsl.g:1810:2: rule__LinkExpression__Group__2__Impl rule__LinkExpression__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__LinkExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group__3();

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
    // $ANTLR end "rule__LinkExpression__Group__2"


    // $ANTLR start "rule__LinkExpression__Group__2__Impl"
    // InternalMyDsl.g:1817:1: rule__LinkExpression__Group__2__Impl : ( ( rule__LinkExpression__AltTextAssignment_2 ) ) ;
    public final void rule__LinkExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1821:1: ( ( ( rule__LinkExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:1822:1: ( ( rule__LinkExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:1822:1: ( ( rule__LinkExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:1823:2: ( rule__LinkExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:1824:2: ( rule__LinkExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:1824:3: rule__LinkExpression__AltTextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LinkExpression__AltTextAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getAltTextAssignment_2()); 
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
    // $ANTLR end "rule__LinkExpression__Group__2__Impl"


    // $ANTLR start "rule__LinkExpression__Group__3"
    // InternalMyDsl.g:1832:1: rule__LinkExpression__Group__3 : rule__LinkExpression__Group__3__Impl rule__LinkExpression__Group__4 ;
    public final void rule__LinkExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( rule__LinkExpression__Group__3__Impl rule__LinkExpression__Group__4 )
            // InternalMyDsl.g:1837:2: rule__LinkExpression__Group__3__Impl rule__LinkExpression__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__LinkExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group__4();

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
    // $ANTLR end "rule__LinkExpression__Group__3"


    // $ANTLR start "rule__LinkExpression__Group__3__Impl"
    // InternalMyDsl.g:1844:1: rule__LinkExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__LinkExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1848:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:1849:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:1849:1: ( ( '](' ) )
            // InternalMyDsl.g:1850:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:1851:2: ( '](' )
            // InternalMyDsl.g:1851:3: ']('
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__LinkExpression__Group__3__Impl"


    // $ANTLR start "rule__LinkExpression__Group__4"
    // InternalMyDsl.g:1859:1: rule__LinkExpression__Group__4 : rule__LinkExpression__Group__4__Impl rule__LinkExpression__Group__5 ;
    public final void rule__LinkExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( rule__LinkExpression__Group__4__Impl rule__LinkExpression__Group__5 )
            // InternalMyDsl.g:1864:2: rule__LinkExpression__Group__4__Impl rule__LinkExpression__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__LinkExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group__5();

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
    // $ANTLR end "rule__LinkExpression__Group__4"


    // $ANTLR start "rule__LinkExpression__Group__4__Impl"
    // InternalMyDsl.g:1871:1: rule__LinkExpression__Group__4__Impl : ( ( rule__LinkExpression__LinkContentAssignment_4 )? ) ;
    public final void rule__LinkExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1875:1: ( ( ( rule__LinkExpression__LinkContentAssignment_4 )? ) )
            // InternalMyDsl.g:1876:1: ( ( rule__LinkExpression__LinkContentAssignment_4 )? )
            {
            // InternalMyDsl.g:1876:1: ( ( rule__LinkExpression__LinkContentAssignment_4 )? )
            // InternalMyDsl.g:1877:2: ( rule__LinkExpression__LinkContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkContentAssignment_4()); 
            }
            // InternalMyDsl.g:1878:2: ( rule__LinkExpression__LinkContentAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_INT)||LA25_0==14||(LA25_0>=16 && LA25_0<=18)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1878:3: rule__LinkExpression__LinkContentAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkExpression__LinkContentAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getLinkContentAssignment_4()); 
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
    // $ANTLR end "rule__LinkExpression__Group__4__Impl"


    // $ANTLR start "rule__LinkExpression__Group__5"
    // InternalMyDsl.g:1886:1: rule__LinkExpression__Group__5 : rule__LinkExpression__Group__5__Impl rule__LinkExpression__Group__6 ;
    public final void rule__LinkExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1890:1: ( rule__LinkExpression__Group__5__Impl rule__LinkExpression__Group__6 )
            // InternalMyDsl.g:1891:2: rule__LinkExpression__Group__5__Impl rule__LinkExpression__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__LinkExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group__6();

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
    // $ANTLR end "rule__LinkExpression__Group__5"


    // $ANTLR start "rule__LinkExpression__Group__5__Impl"
    // InternalMyDsl.g:1898:1: rule__LinkExpression__Group__5__Impl : ( ( ')' ) ) ;
    public final void rule__LinkExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1902:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:1903:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:1903:1: ( ( ')' ) )
            // InternalMyDsl.g:1904:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:1905:2: ( ')' )
            // InternalMyDsl.g:1905:3: ')'
            {
            match(input,23,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__LinkExpression__Group__5__Impl"


    // $ANTLR start "rule__LinkExpression__Group__6"
    // InternalMyDsl.g:1913:1: rule__LinkExpression__Group__6 : rule__LinkExpression__Group__6__Impl ;
    public final void rule__LinkExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( rule__LinkExpression__Group__6__Impl )
            // InternalMyDsl.g:1918:2: rule__LinkExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group__6__Impl();

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
    // $ANTLR end "rule__LinkExpression__Group__6"


    // $ANTLR start "rule__LinkExpression__Group__6__Impl"
    // InternalMyDsl.g:1924:1: rule__LinkExpression__Group__6__Impl : ( ( RULE_BL )? ) ;
    public final void rule__LinkExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1928:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1929:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1929:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1930:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_6()); 
            }
            // InternalMyDsl.g:1931:2: ( RULE_BL )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_BL) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred39_InternalMyDsl()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1931:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_6()); 
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
    // $ANTLR end "rule__LinkExpression__Group__6__Impl"


    // $ANTLR start "rule__ImageExpression__Group__0"
    // InternalMyDsl.g:1940:1: rule__ImageExpression__Group__0 : rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1 ;
    public final void rule__ImageExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1 )
            // InternalMyDsl.g:1945:2: rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ImageExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImageExpression__Group__1();

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
    // $ANTLR end "rule__ImageExpression__Group__0"


    // $ANTLR start "rule__ImageExpression__Group__0__Impl"
    // InternalMyDsl.g:1952:1: rule__ImageExpression__Group__0__Impl : ( () ) ;
    public final void rule__ImageExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1956:1: ( ( () ) )
            // InternalMyDsl.g:1957:1: ( () )
            {
            // InternalMyDsl.g:1957:1: ( () )
            // InternalMyDsl.g:1958:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getImageExpressionAction_0()); 
            }
            // InternalMyDsl.g:1959:2: ()
            // InternalMyDsl.g:1959:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getImageExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageExpression__Group__0__Impl"


    // $ANTLR start "rule__ImageExpression__Group__1"
    // InternalMyDsl.g:1967:1: rule__ImageExpression__Group__1 : rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2 ;
    public final void rule__ImageExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1971:1: ( rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2 )
            // InternalMyDsl.g:1972:2: rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ImageExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImageExpression__Group__2();

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
    // $ANTLR end "rule__ImageExpression__Group__1"


    // $ANTLR start "rule__ImageExpression__Group__1__Impl"
    // InternalMyDsl.g:1979:1: rule__ImageExpression__Group__1__Impl : ( ( '![' ) ) ;
    public final void rule__ImageExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1983:1: ( ( ( '![' ) ) )
            // InternalMyDsl.g:1984:1: ( ( '![' ) )
            {
            // InternalMyDsl.g:1984:1: ( ( '![' ) )
            // InternalMyDsl.g:1985:2: ( '![' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:1986:2: ( '![' )
            // InternalMyDsl.g:1986:3: '!['
            {
            match(input,24,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__ImageExpression__Group__1__Impl"


    // $ANTLR start "rule__ImageExpression__Group__2"
    // InternalMyDsl.g:1994:1: rule__ImageExpression__Group__2 : rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3 ;
    public final void rule__ImageExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1998:1: ( rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3 )
            // InternalMyDsl.g:1999:2: rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ImageExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImageExpression__Group__3();

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
    // $ANTLR end "rule__ImageExpression__Group__2"


    // $ANTLR start "rule__ImageExpression__Group__2__Impl"
    // InternalMyDsl.g:2006:1: rule__ImageExpression__Group__2__Impl : ( ( rule__ImageExpression__AltTextAssignment_2 ) ) ;
    public final void rule__ImageExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2010:1: ( ( ( rule__ImageExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:2011:1: ( ( rule__ImageExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:2011:1: ( ( rule__ImageExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:2012:2: ( rule__ImageExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:2013:2: ( rule__ImageExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:2013:3: rule__ImageExpression__AltTextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageExpression__AltTextAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getAltTextAssignment_2()); 
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
    // $ANTLR end "rule__ImageExpression__Group__2__Impl"


    // $ANTLR start "rule__ImageExpression__Group__3"
    // InternalMyDsl.g:2021:1: rule__ImageExpression__Group__3 : rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4 ;
    public final void rule__ImageExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2025:1: ( rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4 )
            // InternalMyDsl.g:2026:2: rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ImageExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImageExpression__Group__4();

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
    // $ANTLR end "rule__ImageExpression__Group__3"


    // $ANTLR start "rule__ImageExpression__Group__3__Impl"
    // InternalMyDsl.g:2033:1: rule__ImageExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__ImageExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2037:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:2038:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:2038:1: ( ( '](' ) )
            // InternalMyDsl.g:2039:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:2040:2: ( '](' )
            // InternalMyDsl.g:2040:3: ']('
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__ImageExpression__Group__3__Impl"


    // $ANTLR start "rule__ImageExpression__Group__4"
    // InternalMyDsl.g:2048:1: rule__ImageExpression__Group__4 : rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5 ;
    public final void rule__ImageExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5 )
            // InternalMyDsl.g:2053:2: rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ImageExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImageExpression__Group__5();

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
    // $ANTLR end "rule__ImageExpression__Group__4"


    // $ANTLR start "rule__ImageExpression__Group__4__Impl"
    // InternalMyDsl.g:2060:1: rule__ImageExpression__Group__4__Impl : ( ( rule__ImageExpression__LinkContentAssignment_4 )? ) ;
    public final void rule__ImageExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2064:1: ( ( ( rule__ImageExpression__LinkContentAssignment_4 )? ) )
            // InternalMyDsl.g:2065:1: ( ( rule__ImageExpression__LinkContentAssignment_4 )? )
            {
            // InternalMyDsl.g:2065:1: ( ( rule__ImageExpression__LinkContentAssignment_4 )? )
            // InternalMyDsl.g:2066:2: ( rule__ImageExpression__LinkContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getLinkContentAssignment_4()); 
            }
            // InternalMyDsl.g:2067:2: ( rule__ImageExpression__LinkContentAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INT)||LA27_0==14||(LA27_0>=16 && LA27_0<=18)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2067:3: rule__ImageExpression__LinkContentAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageExpression__LinkContentAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getLinkContentAssignment_4()); 
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
    // $ANTLR end "rule__ImageExpression__Group__4__Impl"


    // $ANTLR start "rule__ImageExpression__Group__5"
    // InternalMyDsl.g:2075:1: rule__ImageExpression__Group__5 : rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6 ;
    public final void rule__ImageExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2079:1: ( rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6 )
            // InternalMyDsl.g:2080:2: rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ImageExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImageExpression__Group__6();

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
    // $ANTLR end "rule__ImageExpression__Group__5"


    // $ANTLR start "rule__ImageExpression__Group__5__Impl"
    // InternalMyDsl.g:2087:1: rule__ImageExpression__Group__5__Impl : ( ( ')' ) ) ;
    public final void rule__ImageExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2091:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:2092:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:2092:1: ( ( ')' ) )
            // InternalMyDsl.g:2093:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:2094:2: ( ')' )
            // InternalMyDsl.g:2094:3: ')'
            {
            match(input,23,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__ImageExpression__Group__5__Impl"


    // $ANTLR start "rule__ImageExpression__Group__6"
    // InternalMyDsl.g:2102:1: rule__ImageExpression__Group__6 : rule__ImageExpression__Group__6__Impl ;
    public final void rule__ImageExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( rule__ImageExpression__Group__6__Impl )
            // InternalMyDsl.g:2107:2: rule__ImageExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageExpression__Group__6__Impl();

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
    // $ANTLR end "rule__ImageExpression__Group__6"


    // $ANTLR start "rule__ImageExpression__Group__6__Impl"
    // InternalMyDsl.g:2113:1: rule__ImageExpression__Group__6__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ImageExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2117:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:2118:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:2118:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:2119:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getBLTerminalRuleCall_6()); 
            }
            // InternalMyDsl.g:2120:2: ( RULE_BL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_BL) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred41_InternalMyDsl()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2120:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getBLTerminalRuleCall_6()); 
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
    // $ANTLR end "rule__ImageExpression__Group__6__Impl"


    // $ANTLR start "rule__VideoExpression__Group__0"
    // InternalMyDsl.g:2129:1: rule__VideoExpression__Group__0 : rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1 ;
    public final void rule__VideoExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2133:1: ( rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1 )
            // InternalMyDsl.g:2134:2: rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__VideoExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__1();

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
    // $ANTLR end "rule__VideoExpression__Group__0"


    // $ANTLR start "rule__VideoExpression__Group__0__Impl"
    // InternalMyDsl.g:2141:1: rule__VideoExpression__Group__0__Impl : ( () ) ;
    public final void rule__VideoExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2145:1: ( ( () ) )
            // InternalMyDsl.g:2146:1: ( () )
            {
            // InternalMyDsl.g:2146:1: ( () )
            // InternalMyDsl.g:2147:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0()); 
            }
            // InternalMyDsl.g:2148:2: ()
            // InternalMyDsl.g:2148:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoExpression__Group__0__Impl"


    // $ANTLR start "rule__VideoExpression__Group__1"
    // InternalMyDsl.g:2156:1: rule__VideoExpression__Group__1 : rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2 ;
    public final void rule__VideoExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2 )
            // InternalMyDsl.g:2161:2: rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__VideoExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__2();

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
    // $ANTLR end "rule__VideoExpression__Group__1"


    // $ANTLR start "rule__VideoExpression__Group__1__Impl"
    // InternalMyDsl.g:2168:1: rule__VideoExpression__Group__1__Impl : ( ( '[![' ) ) ;
    public final void rule__VideoExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2172:1: ( ( ( '[![' ) ) )
            // InternalMyDsl.g:2173:1: ( ( '[![' ) )
            {
            // InternalMyDsl.g:2173:1: ( ( '[![' ) )
            // InternalMyDsl.g:2174:2: ( '[![' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:2175:2: ( '[![' )
            // InternalMyDsl.g:2175:3: '[!['
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__VideoExpression__Group__1__Impl"


    // $ANTLR start "rule__VideoExpression__Group__2"
    // InternalMyDsl.g:2183:1: rule__VideoExpression__Group__2 : rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3 ;
    public final void rule__VideoExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2187:1: ( rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3 )
            // InternalMyDsl.g:2188:2: rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__VideoExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__3();

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
    // $ANTLR end "rule__VideoExpression__Group__2"


    // $ANTLR start "rule__VideoExpression__Group__2__Impl"
    // InternalMyDsl.g:2195:1: rule__VideoExpression__Group__2__Impl : ( ( rule__VideoExpression__AltTextAssignment_2 ) ) ;
    public final void rule__VideoExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2199:1: ( ( ( rule__VideoExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:2200:1: ( ( rule__VideoExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:2200:1: ( ( rule__VideoExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:2201:2: ( rule__VideoExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:2202:2: ( rule__VideoExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:2202:3: rule__VideoExpression__AltTextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VideoExpression__AltTextAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getAltTextAssignment_2()); 
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
    // $ANTLR end "rule__VideoExpression__Group__2__Impl"


    // $ANTLR start "rule__VideoExpression__Group__3"
    // InternalMyDsl.g:2210:1: rule__VideoExpression__Group__3 : rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4 ;
    public final void rule__VideoExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2214:1: ( rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4 )
            // InternalMyDsl.g:2215:2: rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__VideoExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__4();

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
    // $ANTLR end "rule__VideoExpression__Group__3"


    // $ANTLR start "rule__VideoExpression__Group__3__Impl"
    // InternalMyDsl.g:2222:1: rule__VideoExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__VideoExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2226:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:2227:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:2227:1: ( ( '](' ) )
            // InternalMyDsl.g:2228:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:2229:2: ( '](' )
            // InternalMyDsl.g:2229:3: ']('
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__VideoExpression__Group__3__Impl"


    // $ANTLR start "rule__VideoExpression__Group__4"
    // InternalMyDsl.g:2237:1: rule__VideoExpression__Group__4 : rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5 ;
    public final void rule__VideoExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2241:1: ( rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5 )
            // InternalMyDsl.g:2242:2: rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__VideoExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__5();

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
    // $ANTLR end "rule__VideoExpression__Group__4"


    // $ANTLR start "rule__VideoExpression__Group__4__Impl"
    // InternalMyDsl.g:2249:1: rule__VideoExpression__Group__4__Impl : ( ( rule__VideoExpression__LinkImageAssignment_4 )? ) ;
    public final void rule__VideoExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2253:1: ( ( ( rule__VideoExpression__LinkImageAssignment_4 )? ) )
            // InternalMyDsl.g:2254:1: ( ( rule__VideoExpression__LinkImageAssignment_4 )? )
            {
            // InternalMyDsl.g:2254:1: ( ( rule__VideoExpression__LinkImageAssignment_4 )? )
            // InternalMyDsl.g:2255:2: ( rule__VideoExpression__LinkImageAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkImageAssignment_4()); 
            }
            // InternalMyDsl.g:2256:2: ( rule__VideoExpression__LinkImageAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==14||(LA29_0>=16 && LA29_0<=18)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2256:3: rule__VideoExpression__LinkImageAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoExpression__LinkImageAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getLinkImageAssignment_4()); 
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
    // $ANTLR end "rule__VideoExpression__Group__4__Impl"


    // $ANTLR start "rule__VideoExpression__Group__5"
    // InternalMyDsl.g:2264:1: rule__VideoExpression__Group__5 : rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6 ;
    public final void rule__VideoExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6 )
            // InternalMyDsl.g:2269:2: rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__VideoExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__6();

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
    // $ANTLR end "rule__VideoExpression__Group__5"


    // $ANTLR start "rule__VideoExpression__Group__5__Impl"
    // InternalMyDsl.g:2276:1: rule__VideoExpression__Group__5__Impl : ( ( ')](' ) ) ;
    public final void rule__VideoExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( ( ')](' ) ) )
            // InternalMyDsl.g:2281:1: ( ( ')](' ) )
            {
            // InternalMyDsl.g:2281:1: ( ( ')](' ) )
            // InternalMyDsl.g:2282:2: ( ')](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:2283:2: ( ')](' )
            // InternalMyDsl.g:2283:3: ')]('
            {
            match(input,26,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__VideoExpression__Group__5__Impl"


    // $ANTLR start "rule__VideoExpression__Group__6"
    // InternalMyDsl.g:2291:1: rule__VideoExpression__Group__6 : rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7 ;
    public final void rule__VideoExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7 )
            // InternalMyDsl.g:2296:2: rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__VideoExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__7();

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
    // $ANTLR end "rule__VideoExpression__Group__6"


    // $ANTLR start "rule__VideoExpression__Group__6__Impl"
    // InternalMyDsl.g:2303:1: rule__VideoExpression__Group__6__Impl : ( ( rule__VideoExpression__LinkVideoAssignment_6 )? ) ;
    public final void rule__VideoExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2307:1: ( ( ( rule__VideoExpression__LinkVideoAssignment_6 )? ) )
            // InternalMyDsl.g:2308:1: ( ( rule__VideoExpression__LinkVideoAssignment_6 )? )
            {
            // InternalMyDsl.g:2308:1: ( ( rule__VideoExpression__LinkVideoAssignment_6 )? )
            // InternalMyDsl.g:2309:2: ( rule__VideoExpression__LinkVideoAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkVideoAssignment_6()); 
            }
            // InternalMyDsl.g:2310:2: ( rule__VideoExpression__LinkVideoAssignment_6 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||LA30_0==14||(LA30_0>=16 && LA30_0<=18)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2310:3: rule__VideoExpression__LinkVideoAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoExpression__LinkVideoAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getLinkVideoAssignment_6()); 
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
    // $ANTLR end "rule__VideoExpression__Group__6__Impl"


    // $ANTLR start "rule__VideoExpression__Group__7"
    // InternalMyDsl.g:2318:1: rule__VideoExpression__Group__7 : rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8 ;
    public final void rule__VideoExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2322:1: ( rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8 )
            // InternalMyDsl.g:2323:2: rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__VideoExpression__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__8();

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
    // $ANTLR end "rule__VideoExpression__Group__7"


    // $ANTLR start "rule__VideoExpression__Group__7__Impl"
    // InternalMyDsl.g:2330:1: rule__VideoExpression__Group__7__Impl : ( ( ')' ) ) ;
    public final void rule__VideoExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2334:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:2335:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:2335:1: ( ( ')' ) )
            // InternalMyDsl.g:2336:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7()); 
            }
            // InternalMyDsl.g:2337:2: ( ')' )
            // InternalMyDsl.g:2337:3: ')'
            {
            match(input,23,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7()); 
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
    // $ANTLR end "rule__VideoExpression__Group__7__Impl"


    // $ANTLR start "rule__VideoExpression__Group__8"
    // InternalMyDsl.g:2345:1: rule__VideoExpression__Group__8 : rule__VideoExpression__Group__8__Impl ;
    public final void rule__VideoExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2349:1: ( rule__VideoExpression__Group__8__Impl )
            // InternalMyDsl.g:2350:2: rule__VideoExpression__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoExpression__Group__8__Impl();

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
    // $ANTLR end "rule__VideoExpression__Group__8"


    // $ANTLR start "rule__VideoExpression__Group__8__Impl"
    // InternalMyDsl.g:2356:1: rule__VideoExpression__Group__8__Impl : ( ( RULE_BL )? ) ;
    public final void rule__VideoExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2360:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:2361:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:2361:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:2362:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getBLTerminalRuleCall_8()); 
            }
            // InternalMyDsl.g:2363:2: ( RULE_BL )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_BL) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred44_InternalMyDsl()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2363:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getBLTerminalRuleCall_8()); 
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
    // $ANTLR end "rule__VideoExpression__Group__8__Impl"


    // $ANTLR start "rule__TabExpression__Group__0"
    // InternalMyDsl.g:2372:1: rule__TabExpression__Group__0 : rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1 ;
    public final void rule__TabExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2376:1: ( rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1 )
            // InternalMyDsl.g:2377:2: rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__TabExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group__1();

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
    // $ANTLR end "rule__TabExpression__Group__0"


    // $ANTLR start "rule__TabExpression__Group__0__Impl"
    // InternalMyDsl.g:2384:1: rule__TabExpression__Group__0__Impl : ( () ) ;
    public final void rule__TabExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2388:1: ( ( () ) )
            // InternalMyDsl.g:2389:1: ( () )
            {
            // InternalMyDsl.g:2389:1: ( () )
            // InternalMyDsl.g:2390:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getTabExpressionAction_0()); 
            }
            // InternalMyDsl.g:2391:2: ()
            // InternalMyDsl.g:2391:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getTabExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabExpression__Group__0__Impl"


    // $ANTLR start "rule__TabExpression__Group__1"
    // InternalMyDsl.g:2399:1: rule__TabExpression__Group__1 : rule__TabExpression__Group__1__Impl ;
    public final void rule__TabExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2403:1: ( rule__TabExpression__Group__1__Impl )
            // InternalMyDsl.g:2404:2: rule__TabExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group__1__Impl();

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
    // $ANTLR end "rule__TabExpression__Group__1"


    // $ANTLR start "rule__TabExpression__Group__1__Impl"
    // InternalMyDsl.g:2410:1: rule__TabExpression__Group__1__Impl : ( ( rule__TabExpression__Group_1__0 ) ) ;
    public final void rule__TabExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2414:1: ( ( ( rule__TabExpression__Group_1__0 ) ) )
            // InternalMyDsl.g:2415:1: ( ( rule__TabExpression__Group_1__0 ) )
            {
            // InternalMyDsl.g:2415:1: ( ( rule__TabExpression__Group_1__0 ) )
            // InternalMyDsl.g:2416:2: ( rule__TabExpression__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:2417:2: ( rule__TabExpression__Group_1__0 )
            // InternalMyDsl.g:2417:3: rule__TabExpression__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__TabExpression__Group__1__Impl"


    // $ANTLR start "rule__TabExpression__Group_1__0"
    // InternalMyDsl.g:2426:1: rule__TabExpression__Group_1__0 : rule__TabExpression__Group_1__0__Impl ;
    public final void rule__TabExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2430:1: ( rule__TabExpression__Group_1__0__Impl )
            // InternalMyDsl.g:2431:2: rule__TabExpression__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1__0__Impl();

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
    // $ANTLR end "rule__TabExpression__Group_1__0"


    // $ANTLR start "rule__TabExpression__Group_1__0__Impl"
    // InternalMyDsl.g:2437:1: rule__TabExpression__Group_1__0__Impl : ( ( rule__TabExpression__Group_1_0__0 ) ) ;
    public final void rule__TabExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2441:1: ( ( ( rule__TabExpression__Group_1_0__0 ) ) )
            // InternalMyDsl.g:2442:1: ( ( rule__TabExpression__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:2442:1: ( ( rule__TabExpression__Group_1_0__0 ) )
            // InternalMyDsl.g:2443:2: ( rule__TabExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0()); 
            }
            // InternalMyDsl.g:2444:2: ( rule__TabExpression__Group_1_0__0 )
            // InternalMyDsl.g:2444:3: rule__TabExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__TabExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TabExpression__Group_1_0__0"
    // InternalMyDsl.g:2453:1: rule__TabExpression__Group_1_0__0 : rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1 ;
    public final void rule__TabExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2457:1: ( rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1 )
            // InternalMyDsl.g:2458:2: rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_7);
            rule__TabExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1_0__1();

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
    // $ANTLR end "rule__TabExpression__Group_1_0__0"


    // $ANTLR start "rule__TabExpression__Group_1_0__0__Impl"
    // InternalMyDsl.g:2465:1: rule__TabExpression__Group_1_0__0__Impl : ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) ) ;
    public final void rule__TabExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2469:1: ( ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) ) )
            // InternalMyDsl.g:2470:1: ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) )
            {
            // InternalMyDsl.g:2470:1: ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) )
            // InternalMyDsl.g:2471:2: ( rule__TabExpression__HeaderAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getHeaderAssignment_1_0_0()); 
            }
            // InternalMyDsl.g:2472:2: ( rule__TabExpression__HeaderAssignment_1_0_0 )
            // InternalMyDsl.g:2472:3: rule__TabExpression__HeaderAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__HeaderAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getHeaderAssignment_1_0_0()); 
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
    // $ANTLR end "rule__TabExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__TabExpression__Group_1_0__1"
    // InternalMyDsl.g:2480:1: rule__TabExpression__Group_1_0__1 : rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2 ;
    public final void rule__TabExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2484:1: ( rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2 )
            // InternalMyDsl.g:2485:2: rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2
            {
            pushFollow(FOLLOW_21);
            rule__TabExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1_0__2();

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
    // $ANTLR end "rule__TabExpression__Group_1_0__1"


    // $ANTLR start "rule__TabExpression__Group_1_0__1__Impl"
    // InternalMyDsl.g:2492:1: rule__TabExpression__Group_1_0__1__Impl : ( RULE_BL ) ;
    public final void rule__TabExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2496:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:2497:1: ( RULE_BL )
            {
            // InternalMyDsl.g:2497:1: ( RULE_BL )
            // InternalMyDsl.g:2498:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getBLTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getBLTerminalRuleCall_1_0_1()); 
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
    // $ANTLR end "rule__TabExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__TabExpression__Group_1_0__2"
    // InternalMyDsl.g:2507:1: rule__TabExpression__Group_1_0__2 : rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3 ;
    public final void rule__TabExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2511:1: ( rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3 )
            // InternalMyDsl.g:2512:2: rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3
            {
            pushFollow(FOLLOW_7);
            rule__TabExpression__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1_0__3();

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
    // $ANTLR end "rule__TabExpression__Group_1_0__2"


    // $ANTLR start "rule__TabExpression__Group_1_0__2__Impl"
    // InternalMyDsl.g:2519:1: rule__TabExpression__Group_1_0__2__Impl : ( ruleTabSeparation ) ;
    public final void rule__TabExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2523:1: ( ( ruleTabSeparation ) )
            // InternalMyDsl.g:2524:1: ( ruleTabSeparation )
            {
            // InternalMyDsl.g:2524:1: ( ruleTabSeparation )
            // InternalMyDsl.g:2525:2: ruleTabSeparation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getTabSeparationParserRuleCall_1_0_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleTabSeparation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getTabSeparationParserRuleCall_1_0_2()); 
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
    // $ANTLR end "rule__TabExpression__Group_1_0__2__Impl"


    // $ANTLR start "rule__TabExpression__Group_1_0__3"
    // InternalMyDsl.g:2534:1: rule__TabExpression__Group_1_0__3 : rule__TabExpression__Group_1_0__3__Impl ;
    public final void rule__TabExpression__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( rule__TabExpression__Group_1_0__3__Impl )
            // InternalMyDsl.g:2539:2: rule__TabExpression__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1_0__3__Impl();

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
    // $ANTLR end "rule__TabExpression__Group_1_0__3"


    // $ANTLR start "rule__TabExpression__Group_1_0__3__Impl"
    // InternalMyDsl.g:2545:1: rule__TabExpression__Group_1_0__3__Impl : ( ( rule__TabExpression__Group_1_0_3__0 )* ) ;
    public final void rule__TabExpression__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2549:1: ( ( ( rule__TabExpression__Group_1_0_3__0 )* ) )
            // InternalMyDsl.g:2550:1: ( ( rule__TabExpression__Group_1_0_3__0 )* )
            {
            // InternalMyDsl.g:2550:1: ( ( rule__TabExpression__Group_1_0_3__0 )* )
            // InternalMyDsl.g:2551:2: ( rule__TabExpression__Group_1_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0_3()); 
            }
            // InternalMyDsl.g:2552:2: ( rule__TabExpression__Group_1_0_3__0 )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:2552:3: rule__TabExpression__Group_1_0_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TabExpression__Group_1_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getGroup_1_0_3()); 
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
    // $ANTLR end "rule__TabExpression__Group_1_0__3__Impl"


    // $ANTLR start "rule__TabExpression__Group_1_0_3__0"
    // InternalMyDsl.g:2561:1: rule__TabExpression__Group_1_0_3__0 : rule__TabExpression__Group_1_0_3__0__Impl ;
    public final void rule__TabExpression__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2565:1: ( rule__TabExpression__Group_1_0_3__0__Impl )
            // InternalMyDsl.g:2566:2: rule__TabExpression__Group_1_0_3__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1_0_3__0__Impl();

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
    // $ANTLR end "rule__TabExpression__Group_1_0_3__0"


    // $ANTLR start "rule__TabExpression__Group_1_0_3__0__Impl"
    // InternalMyDsl.g:2572:1: rule__TabExpression__Group_1_0_3__0__Impl : ( ( rule__TabExpression__Group_1_0_3_0__0 ) ) ;
    public final void rule__TabExpression__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2576:1: ( ( ( rule__TabExpression__Group_1_0_3_0__0 ) ) )
            // InternalMyDsl.g:2577:1: ( ( rule__TabExpression__Group_1_0_3_0__0 ) )
            {
            // InternalMyDsl.g:2577:1: ( ( rule__TabExpression__Group_1_0_3_0__0 ) )
            // InternalMyDsl.g:2578:2: ( rule__TabExpression__Group_1_0_3_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0_3_0()); 
            }
            // InternalMyDsl.g:2579:2: ( rule__TabExpression__Group_1_0_3_0__0 )
            // InternalMyDsl.g:2579:3: rule__TabExpression__Group_1_0_3_0__0
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1_0_3_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getGroup_1_0_3_0()); 
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
    // $ANTLR end "rule__TabExpression__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__TabExpression__Group_1_0_3_0__0"
    // InternalMyDsl.g:2588:1: rule__TabExpression__Group_1_0_3_0__0 : rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1 ;
    public final void rule__TabExpression__Group_1_0_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1 )
            // InternalMyDsl.g:2593:2: rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1
            {
            pushFollow(FOLLOW_16);
            rule__TabExpression__Group_1_0_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1_0_3_0__1();

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
    // $ANTLR end "rule__TabExpression__Group_1_0_3_0__0"


    // $ANTLR start "rule__TabExpression__Group_1_0_3_0__0__Impl"
    // InternalMyDsl.g:2600:1: rule__TabExpression__Group_1_0_3_0__0__Impl : ( RULE_BL ) ;
    public final void rule__TabExpression__Group_1_0_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2604:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:2605:1: ( RULE_BL )
            {
            // InternalMyDsl.g:2605:1: ( RULE_BL )
            // InternalMyDsl.g:2606:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getBLTerminalRuleCall_1_0_3_0_0()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getBLTerminalRuleCall_1_0_3_0_0()); 
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
    // $ANTLR end "rule__TabExpression__Group_1_0_3_0__0__Impl"


    // $ANTLR start "rule__TabExpression__Group_1_0_3_0__1"
    // InternalMyDsl.g:2615:1: rule__TabExpression__Group_1_0_3_0__1 : rule__TabExpression__Group_1_0_3_0__1__Impl ;
    public final void rule__TabExpression__Group_1_0_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2619:1: ( rule__TabExpression__Group_1_0_3_0__1__Impl )
            // InternalMyDsl.g:2620:2: rule__TabExpression__Group_1_0_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__Group_1_0_3_0__1__Impl();

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
    // $ANTLR end "rule__TabExpression__Group_1_0_3_0__1"


    // $ANTLR start "rule__TabExpression__Group_1_0_3_0__1__Impl"
    // InternalMyDsl.g:2626:1: rule__TabExpression__Group_1_0_3_0__1__Impl : ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) ) ;
    public final void rule__TabExpression__Group_1_0_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2630:1: ( ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) ) )
            // InternalMyDsl.g:2631:1: ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) )
            {
            // InternalMyDsl.g:2631:1: ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) )
            // InternalMyDsl.g:2632:2: ( rule__TabExpression__LinesAssignment_1_0_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getLinesAssignment_1_0_3_0_1()); 
            }
            // InternalMyDsl.g:2633:2: ( rule__TabExpression__LinesAssignment_1_0_3_0_1 )
            // InternalMyDsl.g:2633:3: rule__TabExpression__LinesAssignment_1_0_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TabExpression__LinesAssignment_1_0_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getLinesAssignment_1_0_3_0_1()); 
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
    // $ANTLR end "rule__TabExpression__Group_1_0_3_0__1__Impl"


    // $ANTLR start "rule__TabSeparation__Group__0"
    // InternalMyDsl.g:2642:1: rule__TabSeparation__Group__0 : rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1 ;
    public final void rule__TabSeparation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2646:1: ( rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1 )
            // InternalMyDsl.g:2647:2: rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TabSeparation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabSeparation__Group__1();

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
    // $ANTLR end "rule__TabSeparation__Group__0"


    // $ANTLR start "rule__TabSeparation__Group__0__Impl"
    // InternalMyDsl.g:2654:1: rule__TabSeparation__Group__0__Impl : ( ( '|' )? ) ;
    public final void rule__TabSeparation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2658:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2659:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2659:1: ( ( '|' )? )
            // InternalMyDsl.g:2660:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_0()); 
            }
            // InternalMyDsl.g:2661:2: ( '|' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2661:3: '|'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_0()); 
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
    // $ANTLR end "rule__TabSeparation__Group__0__Impl"


    // $ANTLR start "rule__TabSeparation__Group__1"
    // InternalMyDsl.g:2669:1: rule__TabSeparation__Group__1 : rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2 ;
    public final void rule__TabSeparation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2 )
            // InternalMyDsl.g:2674:2: rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__TabSeparation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabSeparation__Group__2();

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
    // $ANTLR end "rule__TabSeparation__Group__1"


    // $ANTLR start "rule__TabSeparation__Group__1__Impl"
    // InternalMyDsl.g:2681:1: rule__TabSeparation__Group__1__Impl : ( '-' ) ;
    public final void rule__TabSeparation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2685:1: ( ( '-' ) )
            // InternalMyDsl.g:2686:1: ( '-' )
            {
            // InternalMyDsl.g:2686:1: ( '-' )
            // InternalMyDsl.g:2687:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_1()); 
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
    // $ANTLR end "rule__TabSeparation__Group__1__Impl"


    // $ANTLR start "rule__TabSeparation__Group__2"
    // InternalMyDsl.g:2696:1: rule__TabSeparation__Group__2 : rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3 ;
    public final void rule__TabSeparation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2700:1: ( rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3 )
            // InternalMyDsl.g:2701:2: rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__TabSeparation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabSeparation__Group__3();

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
    // $ANTLR end "rule__TabSeparation__Group__2"


    // $ANTLR start "rule__TabSeparation__Group__2__Impl"
    // InternalMyDsl.g:2708:1: rule__TabSeparation__Group__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__TabSeparation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2712:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2713:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2713:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2714:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2714:2: ( ( '-' ) )
            // InternalMyDsl.g:2715:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }
            // InternalMyDsl.g:2716:3: ( '-' )
            // InternalMyDsl.g:2716:4: '-'
            {
            match(input,14,FOLLOW_25); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }

            }

            // InternalMyDsl.g:2719:2: ( ( '-' )* )
            // InternalMyDsl.g:2720:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }
            // InternalMyDsl.g:2721:3: ( '-' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==14) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:2721:4: '-'
            	    {
            	    match(input,14,FOLLOW_25); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
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
    // $ANTLR end "rule__TabSeparation__Group__2__Impl"


    // $ANTLR start "rule__TabSeparation__Group__3"
    // InternalMyDsl.g:2730:1: rule__TabSeparation__Group__3 : rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4 ;
    public final void rule__TabSeparation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2734:1: ( rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4 )
            // InternalMyDsl.g:2735:2: rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__TabSeparation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabSeparation__Group__4();

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
    // $ANTLR end "rule__TabSeparation__Group__3"


    // $ANTLR start "rule__TabSeparation__Group__3__Impl"
    // InternalMyDsl.g:2742:1: rule__TabSeparation__Group__3__Impl : ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) ) ;
    public final void rule__TabSeparation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2746:1: ( ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) ) )
            // InternalMyDsl.g:2747:1: ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) )
            {
            // InternalMyDsl.g:2747:1: ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) )
            // InternalMyDsl.g:2748:2: ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* )
            {
            // InternalMyDsl.g:2748:2: ( ( rule__TabSeparation__Group_3__0 ) )
            // InternalMyDsl.g:2749:3: ( rule__TabSeparation__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:2750:3: ( rule__TabSeparation__Group_3__0 )
            // InternalMyDsl.g:2750:4: rule__TabSeparation__Group_3__0
            {
            pushFollow(FOLLOW_26);
            rule__TabSeparation__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }

            }

            // InternalMyDsl.g:2753:2: ( ( rule__TabSeparation__Group_3__0 )* )
            // InternalMyDsl.g:2754:3: ( rule__TabSeparation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:2755:3: ( rule__TabSeparation__Group_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==14) ) {
                        int LA35_3 = input.LA(3);

                        if ( (LA35_3==14) ) {
                            int LA35_4 = input.LA(4);

                            if ( (synpred48_InternalMyDsl()) ) {
                                alt35=1;
                            }


                        }


                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:2755:4: rule__TabSeparation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__TabSeparation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__TabSeparation__Group__3__Impl"


    // $ANTLR start "rule__TabSeparation__Group__4"
    // InternalMyDsl.g:2764:1: rule__TabSeparation__Group__4 : rule__TabSeparation__Group__4__Impl ;
    public final void rule__TabSeparation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2768:1: ( rule__TabSeparation__Group__4__Impl )
            // InternalMyDsl.g:2769:2: rule__TabSeparation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TabSeparation__Group__4__Impl();

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
    // $ANTLR end "rule__TabSeparation__Group__4"


    // $ANTLR start "rule__TabSeparation__Group__4__Impl"
    // InternalMyDsl.g:2775:1: rule__TabSeparation__Group__4__Impl : ( ( '|' )? ) ;
    public final void rule__TabSeparation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2780:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2780:1: ( ( '|' )? )
            // InternalMyDsl.g:2781:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_4()); 
            }
            // InternalMyDsl.g:2782:2: ( '|' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred49_InternalMyDsl()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2782:3: '|'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_4()); 
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
    // $ANTLR end "rule__TabSeparation__Group__4__Impl"


    // $ANTLR start "rule__TabSeparation__Group_3__0"
    // InternalMyDsl.g:2791:1: rule__TabSeparation__Group_3__0 : rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1 ;
    public final void rule__TabSeparation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2795:1: ( rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1 )
            // InternalMyDsl.g:2796:2: rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__TabSeparation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabSeparation__Group_3__1();

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
    // $ANTLR end "rule__TabSeparation__Group_3__0"


    // $ANTLR start "rule__TabSeparation__Group_3__0__Impl"
    // InternalMyDsl.g:2803:1: rule__TabSeparation__Group_3__0__Impl : ( '|' ) ;
    public final void rule__TabSeparation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2807:1: ( ( '|' ) )
            // InternalMyDsl.g:2808:1: ( '|' )
            {
            // InternalMyDsl.g:2808:1: ( '|' )
            // InternalMyDsl.g:2809:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_3_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_3_0()); 
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
    // $ANTLR end "rule__TabSeparation__Group_3__0__Impl"


    // $ANTLR start "rule__TabSeparation__Group_3__1"
    // InternalMyDsl.g:2818:1: rule__TabSeparation__Group_3__1 : rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2 ;
    public final void rule__TabSeparation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2822:1: ( rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2 )
            // InternalMyDsl.g:2823:2: rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__TabSeparation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TabSeparation__Group_3__2();

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
    // $ANTLR end "rule__TabSeparation__Group_3__1"


    // $ANTLR start "rule__TabSeparation__Group_3__1__Impl"
    // InternalMyDsl.g:2830:1: rule__TabSeparation__Group_3__1__Impl : ( '-' ) ;
    public final void rule__TabSeparation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2834:1: ( ( '-' ) )
            // InternalMyDsl.g:2835:1: ( '-' )
            {
            // InternalMyDsl.g:2835:1: ( '-' )
            // InternalMyDsl.g:2836:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_1()); 
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
    // $ANTLR end "rule__TabSeparation__Group_3__1__Impl"


    // $ANTLR start "rule__TabSeparation__Group_3__2"
    // InternalMyDsl.g:2845:1: rule__TabSeparation__Group_3__2 : rule__TabSeparation__Group_3__2__Impl ;
    public final void rule__TabSeparation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2849:1: ( rule__TabSeparation__Group_3__2__Impl )
            // InternalMyDsl.g:2850:2: rule__TabSeparation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TabSeparation__Group_3__2__Impl();

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
    // $ANTLR end "rule__TabSeparation__Group_3__2"


    // $ANTLR start "rule__TabSeparation__Group_3__2__Impl"
    // InternalMyDsl.g:2856:1: rule__TabSeparation__Group_3__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__TabSeparation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2861:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2861:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2862:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2862:2: ( ( '-' ) )
            // InternalMyDsl.g:2863:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }
            // InternalMyDsl.g:2864:3: ( '-' )
            // InternalMyDsl.g:2864:4: '-'
            {
            match(input,14,FOLLOW_25); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }

            }

            // InternalMyDsl.g:2867:2: ( ( '-' )* )
            // InternalMyDsl.g:2868:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }
            // InternalMyDsl.g:2869:3: ( '-' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==14) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred50_InternalMyDsl()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:2869:4: '-'
            	    {
            	    match(input,14,FOLLOW_25); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
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
    // $ANTLR end "rule__TabSeparation__Group_3__2__Impl"


    // $ANTLR start "rule__LineExpression__Group__0"
    // InternalMyDsl.g:2879:1: rule__LineExpression__Group__0 : rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1 ;
    public final void rule__LineExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2883:1: ( rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1 )
            // InternalMyDsl.g:2884:2: rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__LineExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LineExpression__Group__1();

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
    // $ANTLR end "rule__LineExpression__Group__0"


    // $ANTLR start "rule__LineExpression__Group__0__Impl"
    // InternalMyDsl.g:2891:1: rule__LineExpression__Group__0__Impl : ( ( '|' )? ) ;
    public final void rule__LineExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2895:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2896:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2896:1: ( ( '|' )? )
            // InternalMyDsl.g:2897:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_0()); 
            }
            // InternalMyDsl.g:2898:2: ( '|' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred51_InternalMyDsl()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2898:3: '|'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_0()); 
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
    // $ANTLR end "rule__LineExpression__Group__0__Impl"


    // $ANTLR start "rule__LineExpression__Group__1"
    // InternalMyDsl.g:2906:1: rule__LineExpression__Group__1 : rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2 ;
    public final void rule__LineExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2910:1: ( rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2 )
            // InternalMyDsl.g:2911:2: rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__LineExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LineExpression__Group__2();

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
    // $ANTLR end "rule__LineExpression__Group__1"


    // $ANTLR start "rule__LineExpression__Group__1__Impl"
    // InternalMyDsl.g:2918:1: rule__LineExpression__Group__1__Impl : ( ( rule__LineExpression__CellsAssignment_1 ) ) ;
    public final void rule__LineExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2922:1: ( ( ( rule__LineExpression__CellsAssignment_1 ) ) )
            // InternalMyDsl.g:2923:1: ( ( rule__LineExpression__CellsAssignment_1 ) )
            {
            // InternalMyDsl.g:2923:1: ( ( rule__LineExpression__CellsAssignment_1 ) )
            // InternalMyDsl.g:2924:2: ( rule__LineExpression__CellsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsAssignment_1()); 
            }
            // InternalMyDsl.g:2925:2: ( rule__LineExpression__CellsAssignment_1 )
            // InternalMyDsl.g:2925:3: rule__LineExpression__CellsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LineExpression__CellsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionAccess().getCellsAssignment_1()); 
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
    // $ANTLR end "rule__LineExpression__Group__1__Impl"


    // $ANTLR start "rule__LineExpression__Group__2"
    // InternalMyDsl.g:2933:1: rule__LineExpression__Group__2 : rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3 ;
    public final void rule__LineExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2937:1: ( rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3 )
            // InternalMyDsl.g:2938:2: rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__LineExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LineExpression__Group__3();

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
    // $ANTLR end "rule__LineExpression__Group__2"


    // $ANTLR start "rule__LineExpression__Group__2__Impl"
    // InternalMyDsl.g:2945:1: rule__LineExpression__Group__2__Impl : ( ( rule__LineExpression__Group_2__0 )* ) ;
    public final void rule__LineExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2949:1: ( ( ( rule__LineExpression__Group_2__0 )* ) )
            // InternalMyDsl.g:2950:1: ( ( rule__LineExpression__Group_2__0 )* )
            {
            // InternalMyDsl.g:2950:1: ( ( rule__LineExpression__Group_2__0 )* )
            // InternalMyDsl.g:2951:2: ( rule__LineExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getGroup_2()); 
            }
            // InternalMyDsl.g:2952:2: ( rule__LineExpression__Group_2__0 )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:2952:3: rule__LineExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__LineExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionAccess().getGroup_2()); 
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
    // $ANTLR end "rule__LineExpression__Group__2__Impl"


    // $ANTLR start "rule__LineExpression__Group__3"
    // InternalMyDsl.g:2960:1: rule__LineExpression__Group__3 : rule__LineExpression__Group__3__Impl ;
    public final void rule__LineExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2964:1: ( rule__LineExpression__Group__3__Impl )
            // InternalMyDsl.g:2965:2: rule__LineExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineExpression__Group__3__Impl();

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
    // $ANTLR end "rule__LineExpression__Group__3"


    // $ANTLR start "rule__LineExpression__Group__3__Impl"
    // InternalMyDsl.g:2971:1: rule__LineExpression__Group__3__Impl : ( ( '|' )? ) ;
    public final void rule__LineExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2975:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2976:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2976:1: ( ( '|' )? )
            // InternalMyDsl.g:2977:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_3()); 
            }
            // InternalMyDsl.g:2978:2: ( '|' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==17) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred53_InternalMyDsl()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2978:3: '|'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_3()); 
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
    // $ANTLR end "rule__LineExpression__Group__3__Impl"


    // $ANTLR start "rule__LineExpression__Group_2__0"
    // InternalMyDsl.g:2987:1: rule__LineExpression__Group_2__0 : rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1 ;
    public final void rule__LineExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2991:1: ( rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1 )
            // InternalMyDsl.g:2992:2: rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__LineExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LineExpression__Group_2__1();

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
    // $ANTLR end "rule__LineExpression__Group_2__0"


    // $ANTLR start "rule__LineExpression__Group_2__0__Impl"
    // InternalMyDsl.g:2999:1: rule__LineExpression__Group_2__0__Impl : ( ( '|' ) ) ;
    public final void rule__LineExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3003:1: ( ( ( '|' ) ) )
            // InternalMyDsl.g:3004:1: ( ( '|' ) )
            {
            // InternalMyDsl.g:3004:1: ( ( '|' ) )
            // InternalMyDsl.g:3005:2: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_2_0()); 
            }
            // InternalMyDsl.g:3006:2: ( '|' )
            // InternalMyDsl.g:3006:3: '|'
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_2_0()); 
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
    // $ANTLR end "rule__LineExpression__Group_2__0__Impl"


    // $ANTLR start "rule__LineExpression__Group_2__1"
    // InternalMyDsl.g:3014:1: rule__LineExpression__Group_2__1 : rule__LineExpression__Group_2__1__Impl ;
    public final void rule__LineExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3018:1: ( rule__LineExpression__Group_2__1__Impl )
            // InternalMyDsl.g:3019:2: rule__LineExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__LineExpression__Group_2__1"


    // $ANTLR start "rule__LineExpression__Group_2__1__Impl"
    // InternalMyDsl.g:3025:1: rule__LineExpression__Group_2__1__Impl : ( ( rule__LineExpression__CellsAssignment_2_1 ) ) ;
    public final void rule__LineExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3029:1: ( ( ( rule__LineExpression__CellsAssignment_2_1 ) ) )
            // InternalMyDsl.g:3030:1: ( ( rule__LineExpression__CellsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3030:1: ( ( rule__LineExpression__CellsAssignment_2_1 ) )
            // InternalMyDsl.g:3031:2: ( rule__LineExpression__CellsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsAssignment_2_1()); 
            }
            // InternalMyDsl.g:3032:2: ( rule__LineExpression__CellsAssignment_2_1 )
            // InternalMyDsl.g:3032:3: rule__LineExpression__CellsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LineExpression__CellsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionAccess().getCellsAssignment_2_1()); 
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
    // $ANTLR end "rule__LineExpression__Group_2__1__Impl"


    // $ANTLR start "rule__Header1Expression__Group__0"
    // InternalMyDsl.g:3041:1: rule__Header1Expression__Group__0 : rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1 ;
    public final void rule__Header1Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1 )
            // InternalMyDsl.g:3046:2: rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Header1Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header1Expression__Group__1();

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
    // $ANTLR end "rule__Header1Expression__Group__0"


    // $ANTLR start "rule__Header1Expression__Group__0__Impl"
    // InternalMyDsl.g:3053:1: rule__Header1Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header1Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3057:1: ( ( () ) )
            // InternalMyDsl.g:3058:1: ( () )
            {
            // InternalMyDsl.g:3058:1: ( () )
            // InternalMyDsl.g:3059:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3060:2: ()
            // InternalMyDsl.g:3060:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header1Expression__Group__0__Impl"


    // $ANTLR start "rule__Header1Expression__Group__1"
    // InternalMyDsl.g:3068:1: rule__Header1Expression__Group__1 : rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2 ;
    public final void rule__Header1Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3072:1: ( rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2 )
            // InternalMyDsl.g:3073:2: rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Header1Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header1Expression__Group__2();

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
    // $ANTLR end "rule__Header1Expression__Group__1"


    // $ANTLR start "rule__Header1Expression__Group__1__Impl"
    // InternalMyDsl.g:3080:1: rule__Header1Expression__Group__1__Impl : ( '#' ) ;
    public final void rule__Header1Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3084:1: ( ( '#' ) )
            // InternalMyDsl.g:3085:1: ( '#' )
            {
            // InternalMyDsl.g:3085:1: ( '#' )
            // InternalMyDsl.g:3086:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1()); 
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
    // $ANTLR end "rule__Header1Expression__Group__1__Impl"


    // $ANTLR start "rule__Header1Expression__Group__2"
    // InternalMyDsl.g:3095:1: rule__Header1Expression__Group__2 : rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3 ;
    public final void rule__Header1Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3099:1: ( rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3 )
            // InternalMyDsl.g:3100:2: rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Header1Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header1Expression__Group__3();

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
    // $ANTLR end "rule__Header1Expression__Group__2"


    // $ANTLR start "rule__Header1Expression__Group__2__Impl"
    // InternalMyDsl.g:3107:1: rule__Header1Expression__Group__2__Impl : ( ( rule__Header1Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header1Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3111:1: ( ( ( rule__Header1Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3112:1: ( ( rule__Header1Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3112:1: ( ( rule__Header1Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3113:2: ( rule__Header1Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3114:2: ( rule__Header1Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3114:3: rule__Header1Expression__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Header1Expression__TitleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader1ExpressionAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Header1Expression__Group__2__Impl"


    // $ANTLR start "rule__Header1Expression__Group__3"
    // InternalMyDsl.g:3122:1: rule__Header1Expression__Group__3 : rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4 ;
    public final void rule__Header1Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3126:1: ( rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4 )
            // InternalMyDsl.g:3127:2: rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Header1Expression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header1Expression__Group__4();

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
    // $ANTLR end "rule__Header1Expression__Group__3"


    // $ANTLR start "rule__Header1Expression__Group__3__Impl"
    // InternalMyDsl.g:3134:1: rule__Header1Expression__Group__3__Impl : ( ( rule__Header1Expression__Group_3__0 )* ) ;
    public final void rule__Header1Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3138:1: ( ( ( rule__Header1Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3139:1: ( ( rule__Header1Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3139:1: ( ( rule__Header1Expression__Group_3__0 )* )
            // InternalMyDsl.g:3140:2: ( rule__Header1Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3141:2: ( rule__Header1Expression__Group_3__0 )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:3141:3: rule__Header1Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Header1Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader1ExpressionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Header1Expression__Group__3__Impl"


    // $ANTLR start "rule__Header1Expression__Group__4"
    // InternalMyDsl.g:3149:1: rule__Header1Expression__Group__4 : rule__Header1Expression__Group__4__Impl ;
    public final void rule__Header1Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3153:1: ( rule__Header1Expression__Group__4__Impl )
            // InternalMyDsl.g:3154:2: rule__Header1Expression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header1Expression__Group__4__Impl();

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
    // $ANTLR end "rule__Header1Expression__Group__4"


    // $ANTLR start "rule__Header1Expression__Group__4__Impl"
    // InternalMyDsl.g:3160:1: rule__Header1Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header1Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3164:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3165:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3165:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3166:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3167:2: ( RULE_BL )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_BL) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:3167:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader1ExpressionAccess().getBLTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Header1Expression__Group__4__Impl"


    // $ANTLR start "rule__Header1Expression__Group_3__0"
    // InternalMyDsl.g:3176:1: rule__Header1Expression__Group_3__0 : rule__Header1Expression__Group_3__0__Impl ;
    public final void rule__Header1Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3180:1: ( rule__Header1Expression__Group_3__0__Impl )
            // InternalMyDsl.g:3181:2: rule__Header1Expression__Group_3__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header1Expression__Group_3__0__Impl();

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
    // $ANTLR end "rule__Header1Expression__Group_3__0"


    // $ANTLR start "rule__Header1Expression__Group_3__0__Impl"
    // InternalMyDsl.g:3187:1: rule__Header1Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header1Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( ( '#' ) )
            // InternalMyDsl.g:3192:1: ( '#' )
            {
            // InternalMyDsl.g:3192:1: ( '#' )
            // InternalMyDsl.g:3193:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0()); 
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
    // $ANTLR end "rule__Header1Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Header2Expression__Group__0"
    // InternalMyDsl.g:3203:1: rule__Header2Expression__Group__0 : rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1 ;
    public final void rule__Header2Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3207:1: ( rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1 )
            // InternalMyDsl.g:3208:2: rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Header2Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header2Expression__Group__1();

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
    // $ANTLR end "rule__Header2Expression__Group__0"


    // $ANTLR start "rule__Header2Expression__Group__0__Impl"
    // InternalMyDsl.g:3215:1: rule__Header2Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header2Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3219:1: ( ( () ) )
            // InternalMyDsl.g:3220:1: ( () )
            {
            // InternalMyDsl.g:3220:1: ( () )
            // InternalMyDsl.g:3221:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3222:2: ()
            // InternalMyDsl.g:3222:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header2Expression__Group__0__Impl"


    // $ANTLR start "rule__Header2Expression__Group__1"
    // InternalMyDsl.g:3230:1: rule__Header2Expression__Group__1 : rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2 ;
    public final void rule__Header2Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3234:1: ( rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2 )
            // InternalMyDsl.g:3235:2: rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Header2Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header2Expression__Group__2();

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
    // $ANTLR end "rule__Header2Expression__Group__1"


    // $ANTLR start "rule__Header2Expression__Group__1__Impl"
    // InternalMyDsl.g:3242:1: rule__Header2Expression__Group__1__Impl : ( '##' ) ;
    public final void rule__Header2Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3246:1: ( ( '##' ) )
            // InternalMyDsl.g:3247:1: ( '##' )
            {
            // InternalMyDsl.g:3247:1: ( '##' )
            // InternalMyDsl.g:3248:2: '##'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1()); 
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
    // $ANTLR end "rule__Header2Expression__Group__1__Impl"


    // $ANTLR start "rule__Header2Expression__Group__2"
    // InternalMyDsl.g:3257:1: rule__Header2Expression__Group__2 : rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3 ;
    public final void rule__Header2Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3261:1: ( rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3 )
            // InternalMyDsl.g:3262:2: rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Header2Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header2Expression__Group__3();

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
    // $ANTLR end "rule__Header2Expression__Group__2"


    // $ANTLR start "rule__Header2Expression__Group__2__Impl"
    // InternalMyDsl.g:3269:1: rule__Header2Expression__Group__2__Impl : ( ( rule__Header2Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header2Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3273:1: ( ( ( rule__Header2Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3274:1: ( ( rule__Header2Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3274:1: ( ( rule__Header2Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3275:2: ( rule__Header2Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3276:2: ( rule__Header2Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3276:3: rule__Header2Expression__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Header2Expression__TitleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader2ExpressionAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Header2Expression__Group__2__Impl"


    // $ANTLR start "rule__Header2Expression__Group__3"
    // InternalMyDsl.g:3284:1: rule__Header2Expression__Group__3 : rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4 ;
    public final void rule__Header2Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3288:1: ( rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4 )
            // InternalMyDsl.g:3289:2: rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Header2Expression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header2Expression__Group__4();

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
    // $ANTLR end "rule__Header2Expression__Group__3"


    // $ANTLR start "rule__Header2Expression__Group__3__Impl"
    // InternalMyDsl.g:3296:1: rule__Header2Expression__Group__3__Impl : ( ( rule__Header2Expression__Group_3__0 )* ) ;
    public final void rule__Header2Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3300:1: ( ( ( rule__Header2Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3301:1: ( ( rule__Header2Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3301:1: ( ( rule__Header2Expression__Group_3__0 )* )
            // InternalMyDsl.g:3302:2: ( rule__Header2Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3303:2: ( rule__Header2Expression__Group_3__0 )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:3303:3: rule__Header2Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Header2Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader2ExpressionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Header2Expression__Group__3__Impl"


    // $ANTLR start "rule__Header2Expression__Group__4"
    // InternalMyDsl.g:3311:1: rule__Header2Expression__Group__4 : rule__Header2Expression__Group__4__Impl ;
    public final void rule__Header2Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3315:1: ( rule__Header2Expression__Group__4__Impl )
            // InternalMyDsl.g:3316:2: rule__Header2Expression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header2Expression__Group__4__Impl();

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
    // $ANTLR end "rule__Header2Expression__Group__4"


    // $ANTLR start "rule__Header2Expression__Group__4__Impl"
    // InternalMyDsl.g:3322:1: rule__Header2Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header2Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3326:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3327:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3327:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3328:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3329:2: ( RULE_BL )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_BL) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:3329:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader2ExpressionAccess().getBLTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Header2Expression__Group__4__Impl"


    // $ANTLR start "rule__Header2Expression__Group_3__0"
    // InternalMyDsl.g:3338:1: rule__Header2Expression__Group_3__0 : rule__Header2Expression__Group_3__0__Impl ;
    public final void rule__Header2Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3342:1: ( rule__Header2Expression__Group_3__0__Impl )
            // InternalMyDsl.g:3343:2: rule__Header2Expression__Group_3__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header2Expression__Group_3__0__Impl();

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
    // $ANTLR end "rule__Header2Expression__Group_3__0"


    // $ANTLR start "rule__Header2Expression__Group_3__0__Impl"
    // InternalMyDsl.g:3349:1: rule__Header2Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header2Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3353:1: ( ( '#' ) )
            // InternalMyDsl.g:3354:1: ( '#' )
            {
            // InternalMyDsl.g:3354:1: ( '#' )
            // InternalMyDsl.g:3355:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0()); 
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
    // $ANTLR end "rule__Header2Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Header3Expression__Group__0"
    // InternalMyDsl.g:3365:1: rule__Header3Expression__Group__0 : rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1 ;
    public final void rule__Header3Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3369:1: ( rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1 )
            // InternalMyDsl.g:3370:2: rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Header3Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header3Expression__Group__1();

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
    // $ANTLR end "rule__Header3Expression__Group__0"


    // $ANTLR start "rule__Header3Expression__Group__0__Impl"
    // InternalMyDsl.g:3377:1: rule__Header3Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header3Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3381:1: ( ( () ) )
            // InternalMyDsl.g:3382:1: ( () )
            {
            // InternalMyDsl.g:3382:1: ( () )
            // InternalMyDsl.g:3383:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3384:2: ()
            // InternalMyDsl.g:3384:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header3Expression__Group__0__Impl"


    // $ANTLR start "rule__Header3Expression__Group__1"
    // InternalMyDsl.g:3392:1: rule__Header3Expression__Group__1 : rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2 ;
    public final void rule__Header3Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3396:1: ( rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2 )
            // InternalMyDsl.g:3397:2: rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Header3Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header3Expression__Group__2();

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
    // $ANTLR end "rule__Header3Expression__Group__1"


    // $ANTLR start "rule__Header3Expression__Group__1__Impl"
    // InternalMyDsl.g:3404:1: rule__Header3Expression__Group__1__Impl : ( '###' ) ;
    public final void rule__Header3Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3408:1: ( ( '###' ) )
            // InternalMyDsl.g:3409:1: ( '###' )
            {
            // InternalMyDsl.g:3409:1: ( '###' )
            // InternalMyDsl.g:3410:2: '###'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1()); 
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
    // $ANTLR end "rule__Header3Expression__Group__1__Impl"


    // $ANTLR start "rule__Header3Expression__Group__2"
    // InternalMyDsl.g:3419:1: rule__Header3Expression__Group__2 : rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3 ;
    public final void rule__Header3Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3423:1: ( rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3 )
            // InternalMyDsl.g:3424:2: rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Header3Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header3Expression__Group__3();

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
    // $ANTLR end "rule__Header3Expression__Group__2"


    // $ANTLR start "rule__Header3Expression__Group__2__Impl"
    // InternalMyDsl.g:3431:1: rule__Header3Expression__Group__2__Impl : ( ( rule__Header3Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header3Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3435:1: ( ( ( rule__Header3Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3436:1: ( ( rule__Header3Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3436:1: ( ( rule__Header3Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3437:2: ( rule__Header3Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3438:2: ( rule__Header3Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3438:3: rule__Header3Expression__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Header3Expression__TitleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader3ExpressionAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Header3Expression__Group__2__Impl"


    // $ANTLR start "rule__Header3Expression__Group__3"
    // InternalMyDsl.g:3446:1: rule__Header3Expression__Group__3 : rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4 ;
    public final void rule__Header3Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3450:1: ( rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4 )
            // InternalMyDsl.g:3451:2: rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Header3Expression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header3Expression__Group__4();

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
    // $ANTLR end "rule__Header3Expression__Group__3"


    // $ANTLR start "rule__Header3Expression__Group__3__Impl"
    // InternalMyDsl.g:3458:1: rule__Header3Expression__Group__3__Impl : ( ( rule__Header3Expression__Group_3__0 )* ) ;
    public final void rule__Header3Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3462:1: ( ( ( rule__Header3Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3463:1: ( ( rule__Header3Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3463:1: ( ( rule__Header3Expression__Group_3__0 )* )
            // InternalMyDsl.g:3464:2: ( rule__Header3Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3465:2: ( rule__Header3Expression__Group_3__0 )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:3465:3: rule__Header3Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Header3Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader3ExpressionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Header3Expression__Group__3__Impl"


    // $ANTLR start "rule__Header3Expression__Group__4"
    // InternalMyDsl.g:3473:1: rule__Header3Expression__Group__4 : rule__Header3Expression__Group__4__Impl ;
    public final void rule__Header3Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3477:1: ( rule__Header3Expression__Group__4__Impl )
            // InternalMyDsl.g:3478:2: rule__Header3Expression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header3Expression__Group__4__Impl();

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
    // $ANTLR end "rule__Header3Expression__Group__4"


    // $ANTLR start "rule__Header3Expression__Group__4__Impl"
    // InternalMyDsl.g:3484:1: rule__Header3Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header3Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3488:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3489:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3489:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3490:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3491:2: ( RULE_BL )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_BL) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:3491:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader3ExpressionAccess().getBLTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Header3Expression__Group__4__Impl"


    // $ANTLR start "rule__Header3Expression__Group_3__0"
    // InternalMyDsl.g:3500:1: rule__Header3Expression__Group_3__0 : rule__Header3Expression__Group_3__0__Impl ;
    public final void rule__Header3Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3504:1: ( rule__Header3Expression__Group_3__0__Impl )
            // InternalMyDsl.g:3505:2: rule__Header3Expression__Group_3__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header3Expression__Group_3__0__Impl();

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
    // $ANTLR end "rule__Header3Expression__Group_3__0"


    // $ANTLR start "rule__Header3Expression__Group_3__0__Impl"
    // InternalMyDsl.g:3511:1: rule__Header3Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header3Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3515:1: ( ( '#' ) )
            // InternalMyDsl.g:3516:1: ( '#' )
            {
            // InternalMyDsl.g:3516:1: ( '#' )
            // InternalMyDsl.g:3517:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0()); 
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
    // $ANTLR end "rule__Header3Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Header4Expression__Group__0"
    // InternalMyDsl.g:3527:1: rule__Header4Expression__Group__0 : rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1 ;
    public final void rule__Header4Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3531:1: ( rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1 )
            // InternalMyDsl.g:3532:2: rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Header4Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header4Expression__Group__1();

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
    // $ANTLR end "rule__Header4Expression__Group__0"


    // $ANTLR start "rule__Header4Expression__Group__0__Impl"
    // InternalMyDsl.g:3539:1: rule__Header4Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header4Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3543:1: ( ( () ) )
            // InternalMyDsl.g:3544:1: ( () )
            {
            // InternalMyDsl.g:3544:1: ( () )
            // InternalMyDsl.g:3545:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3546:2: ()
            // InternalMyDsl.g:3546:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header4Expression__Group__0__Impl"


    // $ANTLR start "rule__Header4Expression__Group__1"
    // InternalMyDsl.g:3554:1: rule__Header4Expression__Group__1 : rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2 ;
    public final void rule__Header4Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3558:1: ( rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2 )
            // InternalMyDsl.g:3559:2: rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Header4Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header4Expression__Group__2();

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
    // $ANTLR end "rule__Header4Expression__Group__1"


    // $ANTLR start "rule__Header4Expression__Group__1__Impl"
    // InternalMyDsl.g:3566:1: rule__Header4Expression__Group__1__Impl : ( '####' ) ;
    public final void rule__Header4Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3570:1: ( ( '####' ) )
            // InternalMyDsl.g:3571:1: ( '####' )
            {
            // InternalMyDsl.g:3571:1: ( '####' )
            // InternalMyDsl.g:3572:2: '####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
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
    // $ANTLR end "rule__Header4Expression__Group__1__Impl"


    // $ANTLR start "rule__Header4Expression__Group__2"
    // InternalMyDsl.g:3581:1: rule__Header4Expression__Group__2 : rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3 ;
    public final void rule__Header4Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3585:1: ( rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3 )
            // InternalMyDsl.g:3586:2: rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Header4Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header4Expression__Group__3();

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
    // $ANTLR end "rule__Header4Expression__Group__2"


    // $ANTLR start "rule__Header4Expression__Group__2__Impl"
    // InternalMyDsl.g:3593:1: rule__Header4Expression__Group__2__Impl : ( ( rule__Header4Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header4Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3597:1: ( ( ( rule__Header4Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3598:1: ( ( rule__Header4Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3598:1: ( ( rule__Header4Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3599:2: ( rule__Header4Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3600:2: ( rule__Header4Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3600:3: rule__Header4Expression__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Header4Expression__TitleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader4ExpressionAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Header4Expression__Group__2__Impl"


    // $ANTLR start "rule__Header4Expression__Group__3"
    // InternalMyDsl.g:3608:1: rule__Header4Expression__Group__3 : rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4 ;
    public final void rule__Header4Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3612:1: ( rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4 )
            // InternalMyDsl.g:3613:2: rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Header4Expression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header4Expression__Group__4();

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
    // $ANTLR end "rule__Header4Expression__Group__3"


    // $ANTLR start "rule__Header4Expression__Group__3__Impl"
    // InternalMyDsl.g:3620:1: rule__Header4Expression__Group__3__Impl : ( ( rule__Header4Expression__Group_3__0 )* ) ;
    public final void rule__Header4Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3624:1: ( ( ( rule__Header4Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3625:1: ( ( rule__Header4Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3625:1: ( ( rule__Header4Expression__Group_3__0 )* )
            // InternalMyDsl.g:3626:2: ( rule__Header4Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3627:2: ( rule__Header4Expression__Group_3__0 )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:3627:3: rule__Header4Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Header4Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader4ExpressionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Header4Expression__Group__3__Impl"


    // $ANTLR start "rule__Header4Expression__Group__4"
    // InternalMyDsl.g:3635:1: rule__Header4Expression__Group__4 : rule__Header4Expression__Group__4__Impl ;
    public final void rule__Header4Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3639:1: ( rule__Header4Expression__Group__4__Impl )
            // InternalMyDsl.g:3640:2: rule__Header4Expression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header4Expression__Group__4__Impl();

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
    // $ANTLR end "rule__Header4Expression__Group__4"


    // $ANTLR start "rule__Header4Expression__Group__4__Impl"
    // InternalMyDsl.g:3646:1: rule__Header4Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header4Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3650:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3651:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3651:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3652:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3653:2: ( RULE_BL )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_BL) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:3653:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader4ExpressionAccess().getBLTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Header4Expression__Group__4__Impl"


    // $ANTLR start "rule__Header4Expression__Group_3__0"
    // InternalMyDsl.g:3662:1: rule__Header4Expression__Group_3__0 : rule__Header4Expression__Group_3__0__Impl ;
    public final void rule__Header4Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3666:1: ( rule__Header4Expression__Group_3__0__Impl )
            // InternalMyDsl.g:3667:2: rule__Header4Expression__Group_3__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header4Expression__Group_3__0__Impl();

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
    // $ANTLR end "rule__Header4Expression__Group_3__0"


    // $ANTLR start "rule__Header4Expression__Group_3__0__Impl"
    // InternalMyDsl.g:3673:1: rule__Header4Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header4Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3677:1: ( ( '#' ) )
            // InternalMyDsl.g:3678:1: ( '#' )
            {
            // InternalMyDsl.g:3678:1: ( '#' )
            // InternalMyDsl.g:3679:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0()); 
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
    // $ANTLR end "rule__Header4Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Header5Expression__Group__0"
    // InternalMyDsl.g:3689:1: rule__Header5Expression__Group__0 : rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1 ;
    public final void rule__Header5Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3693:1: ( rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1 )
            // InternalMyDsl.g:3694:2: rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Header5Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header5Expression__Group__1();

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
    // $ANTLR end "rule__Header5Expression__Group__0"


    // $ANTLR start "rule__Header5Expression__Group__0__Impl"
    // InternalMyDsl.g:3701:1: rule__Header5Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header5Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3705:1: ( ( () ) )
            // InternalMyDsl.g:3706:1: ( () )
            {
            // InternalMyDsl.g:3706:1: ( () )
            // InternalMyDsl.g:3707:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3708:2: ()
            // InternalMyDsl.g:3708:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header5Expression__Group__0__Impl"


    // $ANTLR start "rule__Header5Expression__Group__1"
    // InternalMyDsl.g:3716:1: rule__Header5Expression__Group__1 : rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2 ;
    public final void rule__Header5Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3720:1: ( rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2 )
            // InternalMyDsl.g:3721:2: rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Header5Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header5Expression__Group__2();

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
    // $ANTLR end "rule__Header5Expression__Group__1"


    // $ANTLR start "rule__Header5Expression__Group__1__Impl"
    // InternalMyDsl.g:3728:1: rule__Header5Expression__Group__1__Impl : ( '#####' ) ;
    public final void rule__Header5Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3732:1: ( ( '#####' ) )
            // InternalMyDsl.g:3733:1: ( '#####' )
            {
            // InternalMyDsl.g:3733:1: ( '#####' )
            // InternalMyDsl.g:3734:2: '#####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
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
    // $ANTLR end "rule__Header5Expression__Group__1__Impl"


    // $ANTLR start "rule__Header5Expression__Group__2"
    // InternalMyDsl.g:3743:1: rule__Header5Expression__Group__2 : rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3 ;
    public final void rule__Header5Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3747:1: ( rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3 )
            // InternalMyDsl.g:3748:2: rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Header5Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header5Expression__Group__3();

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
    // $ANTLR end "rule__Header5Expression__Group__2"


    // $ANTLR start "rule__Header5Expression__Group__2__Impl"
    // InternalMyDsl.g:3755:1: rule__Header5Expression__Group__2__Impl : ( ( rule__Header5Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header5Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3759:1: ( ( ( rule__Header5Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3760:1: ( ( rule__Header5Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3760:1: ( ( rule__Header5Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3761:2: ( rule__Header5Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3762:2: ( rule__Header5Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3762:3: rule__Header5Expression__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Header5Expression__TitleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader5ExpressionAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Header5Expression__Group__2__Impl"


    // $ANTLR start "rule__Header5Expression__Group__3"
    // InternalMyDsl.g:3770:1: rule__Header5Expression__Group__3 : rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4 ;
    public final void rule__Header5Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3774:1: ( rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4 )
            // InternalMyDsl.g:3775:2: rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Header5Expression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header5Expression__Group__4();

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
    // $ANTLR end "rule__Header5Expression__Group__3"


    // $ANTLR start "rule__Header5Expression__Group__3__Impl"
    // InternalMyDsl.g:3782:1: rule__Header5Expression__Group__3__Impl : ( ( rule__Header5Expression__Group_3__0 )* ) ;
    public final void rule__Header5Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3786:1: ( ( ( rule__Header5Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3787:1: ( ( rule__Header5Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3787:1: ( ( rule__Header5Expression__Group_3__0 )* )
            // InternalMyDsl.g:3788:2: ( rule__Header5Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3789:2: ( rule__Header5Expression__Group_3__0 )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:3789:3: rule__Header5Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Header5Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader5ExpressionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Header5Expression__Group__3__Impl"


    // $ANTLR start "rule__Header5Expression__Group__4"
    // InternalMyDsl.g:3797:1: rule__Header5Expression__Group__4 : rule__Header5Expression__Group__4__Impl ;
    public final void rule__Header5Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3801:1: ( rule__Header5Expression__Group__4__Impl )
            // InternalMyDsl.g:3802:2: rule__Header5Expression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header5Expression__Group__4__Impl();

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
    // $ANTLR end "rule__Header5Expression__Group__4"


    // $ANTLR start "rule__Header5Expression__Group__4__Impl"
    // InternalMyDsl.g:3808:1: rule__Header5Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header5Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3812:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3813:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3813:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3814:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3815:2: ( RULE_BL )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_BL) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:3815:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader5ExpressionAccess().getBLTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Header5Expression__Group__4__Impl"


    // $ANTLR start "rule__Header5Expression__Group_3__0"
    // InternalMyDsl.g:3824:1: rule__Header5Expression__Group_3__0 : rule__Header5Expression__Group_3__0__Impl ;
    public final void rule__Header5Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3828:1: ( rule__Header5Expression__Group_3__0__Impl )
            // InternalMyDsl.g:3829:2: rule__Header5Expression__Group_3__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header5Expression__Group_3__0__Impl();

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
    // $ANTLR end "rule__Header5Expression__Group_3__0"


    // $ANTLR start "rule__Header5Expression__Group_3__0__Impl"
    // InternalMyDsl.g:3835:1: rule__Header5Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header5Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3839:1: ( ( '#' ) )
            // InternalMyDsl.g:3840:1: ( '#' )
            {
            // InternalMyDsl.g:3840:1: ( '#' )
            // InternalMyDsl.g:3841:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0()); 
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
    // $ANTLR end "rule__Header5Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Header6Expression__Group__0"
    // InternalMyDsl.g:3851:1: rule__Header6Expression__Group__0 : rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1 ;
    public final void rule__Header6Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3855:1: ( rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1 )
            // InternalMyDsl.g:3856:2: rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Header6Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header6Expression__Group__1();

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
    // $ANTLR end "rule__Header6Expression__Group__0"


    // $ANTLR start "rule__Header6Expression__Group__0__Impl"
    // InternalMyDsl.g:3863:1: rule__Header6Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header6Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3867:1: ( ( () ) )
            // InternalMyDsl.g:3868:1: ( () )
            {
            // InternalMyDsl.g:3868:1: ( () )
            // InternalMyDsl.g:3869:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3870:2: ()
            // InternalMyDsl.g:3870:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header6Expression__Group__0__Impl"


    // $ANTLR start "rule__Header6Expression__Group__1"
    // InternalMyDsl.g:3878:1: rule__Header6Expression__Group__1 : rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2 ;
    public final void rule__Header6Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3882:1: ( rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2 )
            // InternalMyDsl.g:3883:2: rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Header6Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header6Expression__Group__2();

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
    // $ANTLR end "rule__Header6Expression__Group__1"


    // $ANTLR start "rule__Header6Expression__Group__1__Impl"
    // InternalMyDsl.g:3890:1: rule__Header6Expression__Group__1__Impl : ( '######' ) ;
    public final void rule__Header6Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3894:1: ( ( '######' ) )
            // InternalMyDsl.g:3895:1: ( '######' )
            {
            // InternalMyDsl.g:3895:1: ( '######' )
            // InternalMyDsl.g:3896:2: '######'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
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
    // $ANTLR end "rule__Header6Expression__Group__1__Impl"


    // $ANTLR start "rule__Header6Expression__Group__2"
    // InternalMyDsl.g:3905:1: rule__Header6Expression__Group__2 : rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3 ;
    public final void rule__Header6Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3909:1: ( rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3 )
            // InternalMyDsl.g:3910:2: rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Header6Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header6Expression__Group__3();

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
    // $ANTLR end "rule__Header6Expression__Group__2"


    // $ANTLR start "rule__Header6Expression__Group__2__Impl"
    // InternalMyDsl.g:3917:1: rule__Header6Expression__Group__2__Impl : ( ( rule__Header6Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header6Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3921:1: ( ( ( rule__Header6Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3922:1: ( ( rule__Header6Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3922:1: ( ( rule__Header6Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3923:2: ( rule__Header6Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3924:2: ( rule__Header6Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3924:3: rule__Header6Expression__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Header6Expression__TitleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader6ExpressionAccess().getTitleAssignment_2()); 
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
    // $ANTLR end "rule__Header6Expression__Group__2__Impl"


    // $ANTLR start "rule__Header6Expression__Group__3"
    // InternalMyDsl.g:3932:1: rule__Header6Expression__Group__3 : rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4 ;
    public final void rule__Header6Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3936:1: ( rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4 )
            // InternalMyDsl.g:3937:2: rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Header6Expression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Header6Expression__Group__4();

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
    // $ANTLR end "rule__Header6Expression__Group__3"


    // $ANTLR start "rule__Header6Expression__Group__3__Impl"
    // InternalMyDsl.g:3944:1: rule__Header6Expression__Group__3__Impl : ( ( rule__Header6Expression__Group_3__0 )* ) ;
    public final void rule__Header6Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3948:1: ( ( ( rule__Header6Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3949:1: ( ( rule__Header6Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3949:1: ( ( rule__Header6Expression__Group_3__0 )* )
            // InternalMyDsl.g:3950:2: ( rule__Header6Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3951:2: ( rule__Header6Expression__Group_3__0 )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // InternalMyDsl.g:3951:3: rule__Header6Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Header6Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader6ExpressionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Header6Expression__Group__3__Impl"


    // $ANTLR start "rule__Header6Expression__Group__4"
    // InternalMyDsl.g:3959:1: rule__Header6Expression__Group__4 : rule__Header6Expression__Group__4__Impl ;
    public final void rule__Header6Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3963:1: ( rule__Header6Expression__Group__4__Impl )
            // InternalMyDsl.g:3964:2: rule__Header6Expression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header6Expression__Group__4__Impl();

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
    // $ANTLR end "rule__Header6Expression__Group__4"


    // $ANTLR start "rule__Header6Expression__Group__4__Impl"
    // InternalMyDsl.g:3970:1: rule__Header6Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header6Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3974:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3975:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3975:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3976:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3977:2: ( RULE_BL )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_BL) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:3977:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader6ExpressionAccess().getBLTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Header6Expression__Group__4__Impl"


    // $ANTLR start "rule__Header6Expression__Group_3__0"
    // InternalMyDsl.g:3986:1: rule__Header6Expression__Group_3__0 : rule__Header6Expression__Group_3__0__Impl ;
    public final void rule__Header6Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( rule__Header6Expression__Group_3__0__Impl )
            // InternalMyDsl.g:3991:2: rule__Header6Expression__Group_3__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header6Expression__Group_3__0__Impl();

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
    // $ANTLR end "rule__Header6Expression__Group_3__0"


    // $ANTLR start "rule__Header6Expression__Group_3__0__Impl"
    // InternalMyDsl.g:3997:1: rule__Header6Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header6Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4001:1: ( ( '#' ) )
            // InternalMyDsl.g:4002:1: ( '#' )
            {
            // InternalMyDsl.g:4002:1: ( '#' )
            // InternalMyDsl.g:4003:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0()); 
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
    // $ANTLR end "rule__Header6Expression__Group_3__0__Impl"


    // $ANTLR start "rule__EmphasisExpression__Group_0__0"
    // InternalMyDsl.g:4013:1: rule__EmphasisExpression__Group_0__0 : rule__EmphasisExpression__Group_0__0__Impl ;
    public final void rule__EmphasisExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4017:1: ( rule__EmphasisExpression__Group_0__0__Impl )
            // InternalMyDsl.g:4018:2: rule__EmphasisExpression__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmphasisExpression__Group_0__0__Impl();

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
    // $ANTLR end "rule__EmphasisExpression__Group_0__0"


    // $ANTLR start "rule__EmphasisExpression__Group_0__0__Impl"
    // InternalMyDsl.g:4024:1: rule__EmphasisExpression__Group_0__0__Impl : ( ( rule__EmphasisExpression__Alternatives_0_0 ) ) ;
    public final void rule__EmphasisExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4028:1: ( ( ( rule__EmphasisExpression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:4029:1: ( ( rule__EmphasisExpression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:4029:1: ( ( rule__EmphasisExpression__Alternatives_0_0 ) )
            // InternalMyDsl.g:4030:2: ( rule__EmphasisExpression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:4031:2: ( rule__EmphasisExpression__Alternatives_0_0 )
            // InternalMyDsl.g:4031:3: rule__EmphasisExpression__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__EmphasisExpression__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmphasisExpressionAccess().getAlternatives_0_0()); 
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
    // $ANTLR end "rule__EmphasisExpression__Group_0__0__Impl"


    // $ANTLR start "rule__StrongExpression__Group__0"
    // InternalMyDsl.g:4040:1: rule__StrongExpression__Group__0 : rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1 ;
    public final void rule__StrongExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4044:1: ( rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1 )
            // InternalMyDsl.g:4045:2: rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__StrongExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StrongExpression__Group__1();

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
    // $ANTLR end "rule__StrongExpression__Group__0"


    // $ANTLR start "rule__StrongExpression__Group__0__Impl"
    // InternalMyDsl.g:4052:1: rule__StrongExpression__Group__0__Impl : ( () ) ;
    public final void rule__StrongExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4056:1: ( ( () ) )
            // InternalMyDsl.g:4057:1: ( () )
            {
            // InternalMyDsl.g:4057:1: ( () )
            // InternalMyDsl.g:4058:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0()); 
            }
            // InternalMyDsl.g:4059:2: ()
            // InternalMyDsl.g:4059:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrongExpression__Group__0__Impl"


    // $ANTLR start "rule__StrongExpression__Group__1"
    // InternalMyDsl.g:4067:1: rule__StrongExpression__Group__1 : rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2 ;
    public final void rule__StrongExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4071:1: ( rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2 )
            // InternalMyDsl.g:4072:2: rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__StrongExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StrongExpression__Group__2();

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
    // $ANTLR end "rule__StrongExpression__Group__1"


    // $ANTLR start "rule__StrongExpression__Group__1__Impl"
    // InternalMyDsl.g:4079:1: rule__StrongExpression__Group__1__Impl : ( '**' ) ;
    public final void rule__StrongExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4083:1: ( ( '**' ) )
            // InternalMyDsl.g:4084:1: ( '**' )
            {
            // InternalMyDsl.g:4084:1: ( '**' )
            // InternalMyDsl.g:4085:2: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__StrongExpression__Group__1__Impl"


    // $ANTLR start "rule__StrongExpression__Group__2"
    // InternalMyDsl.g:4094:1: rule__StrongExpression__Group__2 : rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3 ;
    public final void rule__StrongExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4098:1: ( rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3 )
            // InternalMyDsl.g:4099:2: rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__StrongExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StrongExpression__Group__3();

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
    // $ANTLR end "rule__StrongExpression__Group__2"


    // $ANTLR start "rule__StrongExpression__Group__2__Impl"
    // InternalMyDsl.g:4106:1: rule__StrongExpression__Group__2__Impl : ( ( rule__StrongExpression__ContentAssignment_2 ) ) ;
    public final void rule__StrongExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4110:1: ( ( ( rule__StrongExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4111:1: ( ( rule__StrongExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4111:1: ( ( rule__StrongExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4112:2: ( rule__StrongExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4113:2: ( rule__StrongExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4113:3: rule__StrongExpression__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StrongExpression__ContentAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrongExpressionAccess().getContentAssignment_2()); 
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
    // $ANTLR end "rule__StrongExpression__Group__2__Impl"


    // $ANTLR start "rule__StrongExpression__Group__3"
    // InternalMyDsl.g:4121:1: rule__StrongExpression__Group__3 : rule__StrongExpression__Group__3__Impl ;
    public final void rule__StrongExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4125:1: ( rule__StrongExpression__Group__3__Impl )
            // InternalMyDsl.g:4126:2: rule__StrongExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StrongExpression__Group__3__Impl();

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
    // $ANTLR end "rule__StrongExpression__Group__3"


    // $ANTLR start "rule__StrongExpression__Group__3__Impl"
    // InternalMyDsl.g:4132:1: rule__StrongExpression__Group__3__Impl : ( '**' ) ;
    public final void rule__StrongExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4136:1: ( ( '**' ) )
            // InternalMyDsl.g:4137:1: ( '**' )
            {
            // InternalMyDsl.g:4137:1: ( '**' )
            // InternalMyDsl.g:4138:2: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_3()); 
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
    // $ANTLR end "rule__StrongExpression__Group__3__Impl"


    // $ANTLR start "rule__ItalicExpression__Group__0"
    // InternalMyDsl.g:4148:1: rule__ItalicExpression__Group__0 : rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1 ;
    public final void rule__ItalicExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4152:1: ( rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1 )
            // InternalMyDsl.g:4153:2: rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ItalicExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItalicExpression__Group__1();

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
    // $ANTLR end "rule__ItalicExpression__Group__0"


    // $ANTLR start "rule__ItalicExpression__Group__0__Impl"
    // InternalMyDsl.g:4160:1: rule__ItalicExpression__Group__0__Impl : ( () ) ;
    public final void rule__ItalicExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4164:1: ( ( () ) )
            // InternalMyDsl.g:4165:1: ( () )
            {
            // InternalMyDsl.g:4165:1: ( () )
            // InternalMyDsl.g:4166:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0()); 
            }
            // InternalMyDsl.g:4167:2: ()
            // InternalMyDsl.g:4167:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicExpression__Group__0__Impl"


    // $ANTLR start "rule__ItalicExpression__Group__1"
    // InternalMyDsl.g:4175:1: rule__ItalicExpression__Group__1 : rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2 ;
    public final void rule__ItalicExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4179:1: ( rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2 )
            // InternalMyDsl.g:4180:2: rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ItalicExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItalicExpression__Group__2();

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
    // $ANTLR end "rule__ItalicExpression__Group__1"


    // $ANTLR start "rule__ItalicExpression__Group__1__Impl"
    // InternalMyDsl.g:4187:1: rule__ItalicExpression__Group__1__Impl : ( '*' ) ;
    public final void rule__ItalicExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4191:1: ( ( '*' ) )
            // InternalMyDsl.g:4192:1: ( '*' )
            {
            // InternalMyDsl.g:4192:1: ( '*' )
            // InternalMyDsl.g:4193:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__ItalicExpression__Group__1__Impl"


    // $ANTLR start "rule__ItalicExpression__Group__2"
    // InternalMyDsl.g:4202:1: rule__ItalicExpression__Group__2 : rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3 ;
    public final void rule__ItalicExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4206:1: ( rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3 )
            // InternalMyDsl.g:4207:2: rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__ItalicExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItalicExpression__Group__3();

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
    // $ANTLR end "rule__ItalicExpression__Group__2"


    // $ANTLR start "rule__ItalicExpression__Group__2__Impl"
    // InternalMyDsl.g:4214:1: rule__ItalicExpression__Group__2__Impl : ( ( rule__ItalicExpression__ContentAssignment_2 ) ) ;
    public final void rule__ItalicExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4218:1: ( ( ( rule__ItalicExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4219:1: ( ( rule__ItalicExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4219:1: ( ( rule__ItalicExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4220:2: ( rule__ItalicExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4221:2: ( rule__ItalicExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4221:3: rule__ItalicExpression__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ItalicExpression__ContentAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicExpressionAccess().getContentAssignment_2()); 
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
    // $ANTLR end "rule__ItalicExpression__Group__2__Impl"


    // $ANTLR start "rule__ItalicExpression__Group__3"
    // InternalMyDsl.g:4229:1: rule__ItalicExpression__Group__3 : rule__ItalicExpression__Group__3__Impl ;
    public final void rule__ItalicExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4233:1: ( rule__ItalicExpression__Group__3__Impl )
            // InternalMyDsl.g:4234:2: rule__ItalicExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItalicExpression__Group__3__Impl();

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
    // $ANTLR end "rule__ItalicExpression__Group__3"


    // $ANTLR start "rule__ItalicExpression__Group__3__Impl"
    // InternalMyDsl.g:4240:1: rule__ItalicExpression__Group__3__Impl : ( '*' ) ;
    public final void rule__ItalicExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4244:1: ( ( '*' ) )
            // InternalMyDsl.g:4245:1: ( '*' )
            {
            // InternalMyDsl.g:4245:1: ( '*' )
            // InternalMyDsl.g:4246:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_3()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_3()); 
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
    // $ANTLR end "rule__ItalicExpression__Group__3__Impl"


    // $ANTLR start "rule__ScratchExpression__Group__0"
    // InternalMyDsl.g:4256:1: rule__ScratchExpression__Group__0 : rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1 ;
    public final void rule__ScratchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4260:1: ( rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1 )
            // InternalMyDsl.g:4261:2: rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ScratchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScratchExpression__Group__1();

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
    // $ANTLR end "rule__ScratchExpression__Group__0"


    // $ANTLR start "rule__ScratchExpression__Group__0__Impl"
    // InternalMyDsl.g:4268:1: rule__ScratchExpression__Group__0__Impl : ( () ) ;
    public final void rule__ScratchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4272:1: ( ( () ) )
            // InternalMyDsl.g:4273:1: ( () )
            {
            // InternalMyDsl.g:4273:1: ( () )
            // InternalMyDsl.g:4274:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0()); 
            }
            // InternalMyDsl.g:4275:2: ()
            // InternalMyDsl.g:4275:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScratchExpression__Group__0__Impl"


    // $ANTLR start "rule__ScratchExpression__Group__1"
    // InternalMyDsl.g:4283:1: rule__ScratchExpression__Group__1 : rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2 ;
    public final void rule__ScratchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4287:1: ( rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2 )
            // InternalMyDsl.g:4288:2: rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ScratchExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScratchExpression__Group__2();

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
    // $ANTLR end "rule__ScratchExpression__Group__1"


    // $ANTLR start "rule__ScratchExpression__Group__1__Impl"
    // InternalMyDsl.g:4295:1: rule__ScratchExpression__Group__1__Impl : ( '~~' ) ;
    public final void rule__ScratchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4299:1: ( ( '~~' ) )
            // InternalMyDsl.g:4300:1: ( '~~' )
            {
            // InternalMyDsl.g:4300:1: ( '~~' )
            // InternalMyDsl.g:4301:2: '~~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1()); 
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
    // $ANTLR end "rule__ScratchExpression__Group__1__Impl"


    // $ANTLR start "rule__ScratchExpression__Group__2"
    // InternalMyDsl.g:4310:1: rule__ScratchExpression__Group__2 : rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3 ;
    public final void rule__ScratchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4314:1: ( rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3 )
            // InternalMyDsl.g:4315:2: rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__ScratchExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ScratchExpression__Group__3();

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
    // $ANTLR end "rule__ScratchExpression__Group__2"


    // $ANTLR start "rule__ScratchExpression__Group__2__Impl"
    // InternalMyDsl.g:4322:1: rule__ScratchExpression__Group__2__Impl : ( ( rule__ScratchExpression__ContentAssignment_2 ) ) ;
    public final void rule__ScratchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4326:1: ( ( ( rule__ScratchExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4327:1: ( ( rule__ScratchExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4327:1: ( ( rule__ScratchExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4328:2: ( rule__ScratchExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4329:2: ( rule__ScratchExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4329:3: rule__ScratchExpression__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScratchExpression__ContentAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScratchExpressionAccess().getContentAssignment_2()); 
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
    // $ANTLR end "rule__ScratchExpression__Group__2__Impl"


    // $ANTLR start "rule__ScratchExpression__Group__3"
    // InternalMyDsl.g:4337:1: rule__ScratchExpression__Group__3 : rule__ScratchExpression__Group__3__Impl ;
    public final void rule__ScratchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4341:1: ( rule__ScratchExpression__Group__3__Impl )
            // InternalMyDsl.g:4342:2: rule__ScratchExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScratchExpression__Group__3__Impl();

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
    // $ANTLR end "rule__ScratchExpression__Group__3"


    // $ANTLR start "rule__ScratchExpression__Group__3__Impl"
    // InternalMyDsl.g:4348:1: rule__ScratchExpression__Group__3__Impl : ( '~~' ) ;
    public final void rule__ScratchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4352:1: ( ( '~~' ) )
            // InternalMyDsl.g:4353:1: ( '~~' )
            {
            // InternalMyDsl.g:4353:1: ( '~~' )
            // InternalMyDsl.g:4354:2: '~~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_3()); 
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
    // $ANTLR end "rule__ScratchExpression__Group__3__Impl"


    // $ANTLR start "rule__NaturalExpression__Group__0"
    // InternalMyDsl.g:4364:1: rule__NaturalExpression__Group__0 : rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 ;
    public final void rule__NaturalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4368:1: ( rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 )
            // InternalMyDsl.g:4369:2: rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__NaturalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NaturalExpression__Group__1();

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
    // $ANTLR end "rule__NaturalExpression__Group__0"


    // $ANTLR start "rule__NaturalExpression__Group__0__Impl"
    // InternalMyDsl.g:4376:1: rule__NaturalExpression__Group__0__Impl : ( () ) ;
    public final void rule__NaturalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4380:1: ( ( () ) )
            // InternalMyDsl.g:4381:1: ( () )
            {
            // InternalMyDsl.g:4381:1: ( () )
            // InternalMyDsl.g:4382:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getEmphasisExpressionAction_0()); 
            }
            // InternalMyDsl.g:4383:2: ()
            // InternalMyDsl.g:4383:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNaturalExpressionAccess().getEmphasisExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaturalExpression__Group__0__Impl"


    // $ANTLR start "rule__NaturalExpression__Group__1"
    // InternalMyDsl.g:4391:1: rule__NaturalExpression__Group__1 : rule__NaturalExpression__Group__1__Impl ;
    public final void rule__NaturalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4395:1: ( rule__NaturalExpression__Group__1__Impl )
            // InternalMyDsl.g:4396:2: rule__NaturalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NaturalExpression__Group__1__Impl();

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
    // $ANTLR end "rule__NaturalExpression__Group__1"


    // $ANTLR start "rule__NaturalExpression__Group__1__Impl"
    // InternalMyDsl.g:4402:1: rule__NaturalExpression__Group__1__Impl : ( ( rule__NaturalExpression__ValueAssignment_1 ) ) ;
    public final void rule__NaturalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4406:1: ( ( ( rule__NaturalExpression__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:4407:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:4407:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            // InternalMyDsl.g:4408:2: ( rule__NaturalExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getValueAssignment_1()); 
            }
            // InternalMyDsl.g:4409:2: ( rule__NaturalExpression__ValueAssignment_1 )
            // InternalMyDsl.g:4409:3: rule__NaturalExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NaturalExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNaturalExpressionAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__NaturalExpression__Group__1__Impl"


    // $ANTLR start "rule__Content__Group_0__0"
    // InternalMyDsl.g:4418:1: rule__Content__Group_0__0 : rule__Content__Group_0__0__Impl ;
    public final void rule__Content__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4422:1: ( rule__Content__Group_0__0__Impl )
            // InternalMyDsl.g:4423:2: rule__Content__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group_0__0__Impl();

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
    // $ANTLR end "rule__Content__Group_0__0"


    // $ANTLR start "rule__Content__Group_0__0__Impl"
    // InternalMyDsl.g:4429:1: rule__Content__Group_0__0__Impl : ( ( rule__Content__Alternatives_0_0 ) ) ;
    public final void rule__Content__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4433:1: ( ( ( rule__Content__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:4434:1: ( ( rule__Content__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:4434:1: ( ( rule__Content__Alternatives_0_0 ) )
            // InternalMyDsl.g:4435:2: ( rule__Content__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:4436:2: ( rule__Content__Alternatives_0_0 )
            // InternalMyDsl.g:4436:3: rule__Content__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentAccess().getAlternatives_0_0()); 
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
    // $ANTLR end "rule__Content__Group_0__0__Impl"


    // $ANTLR start "rule__File__ExpressionAssignment_1"
    // InternalMyDsl.g:4445:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4449:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4450:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4450:2: ( ruleExpression )
            // InternalMyDsl.g:4451:3: ruleExpression
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


    // $ANTLR start "rule__BreakLineExpression__IsBRAssignment_1"
    // InternalMyDsl.g:4460:1: rule__BreakLineExpression__IsBRAssignment_1 : ( ( 'true' ) ) ;
    public final void rule__BreakLineExpression__IsBRAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4464:1: ( ( ( 'true' ) ) )
            // InternalMyDsl.g:4465:2: ( ( 'true' ) )
            {
            // InternalMyDsl.g:4465:2: ( ( 'true' ) )
            // InternalMyDsl.g:4466:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getIsBRTrueKeyword_1_0()); 
            }
            // InternalMyDsl.g:4467:3: ( 'true' )
            // InternalMyDsl.g:4468:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getIsBRTrueKeyword_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakLineExpressionAccess().getIsBRTrueKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakLineExpressionAccess().getIsBRTrueKeyword_1_0()); 
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
    // $ANTLR end "rule__BreakLineExpression__IsBRAssignment_1"


    // $ANTLR start "rule__TextExpression__CAssignment_0"
    // InternalMyDsl.g:4479:1: rule__TextExpression__CAssignment_0 : ( ruleEmphasisExpression ) ;
    public final void rule__TextExpression__CAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4483:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4484:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4484:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4485:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCEmphasisExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCEmphasisExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__TextExpression__CAssignment_0"


    // $ANTLR start "rule__TextExpression__CAssignment_1_0_0"
    // InternalMyDsl.g:4494:1: rule__TextExpression__CAssignment_1_0_0 : ( ruleQuoteExpression ) ;
    public final void rule__TextExpression__CAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4498:1: ( ( ruleQuoteExpression ) )
            // InternalMyDsl.g:4499:2: ( ruleQuoteExpression )
            {
            // InternalMyDsl.g:4499:2: ( ruleQuoteExpression )
            // InternalMyDsl.g:4500:3: ruleQuoteExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCQuoteExpressionParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQuoteExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCQuoteExpressionParserRuleCall_1_0_0_0()); 
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
    // $ANTLR end "rule__TextExpression__CAssignment_1_0_0"


    // $ANTLR start "rule__TextExpression__CAssignment_1_0_1"
    // InternalMyDsl.g:4509:1: rule__TextExpression__CAssignment_1_0_1 : ( ruleTabExpression ) ;
    public final void rule__TextExpression__CAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4513:1: ( ( ruleTabExpression ) )
            // InternalMyDsl.g:4514:2: ( ruleTabExpression )
            {
            // InternalMyDsl.g:4514:2: ( ruleTabExpression )
            // InternalMyDsl.g:4515:3: ruleTabExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCTabExpressionParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTabExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCTabExpressionParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__TextExpression__CAssignment_1_0_1"


    // $ANTLR start "rule__TextExpression__CAssignment_1_0_2_0"
    // InternalMyDsl.g:4524:1: rule__TextExpression__CAssignment_1_0_2_0 : ( ruleLinkExpression ) ;
    public final void rule__TextExpression__CAssignment_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4528:1: ( ( ruleLinkExpression ) )
            // InternalMyDsl.g:4529:2: ( ruleLinkExpression )
            {
            // InternalMyDsl.g:4529:2: ( ruleLinkExpression )
            // InternalMyDsl.g:4530:3: ruleLinkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCLinkExpressionParserRuleCall_1_0_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLinkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCLinkExpressionParserRuleCall_1_0_2_0_0()); 
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
    // $ANTLR end "rule__TextExpression__CAssignment_1_0_2_0"


    // $ANTLR start "rule__TextExpression__CAssignment_1_0_2_1"
    // InternalMyDsl.g:4539:1: rule__TextExpression__CAssignment_1_0_2_1 : ( ruleImageExpression ) ;
    public final void rule__TextExpression__CAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4543:1: ( ( ruleImageExpression ) )
            // InternalMyDsl.g:4544:2: ( ruleImageExpression )
            {
            // InternalMyDsl.g:4544:2: ( ruleImageExpression )
            // InternalMyDsl.g:4545:3: ruleImageExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCImageExpressionParserRuleCall_1_0_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImageExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCImageExpressionParserRuleCall_1_0_2_1_0()); 
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
    // $ANTLR end "rule__TextExpression__CAssignment_1_0_2_1"


    // $ANTLR start "rule__TextExpression__CAssignment_1_0_2_2"
    // InternalMyDsl.g:4554:1: rule__TextExpression__CAssignment_1_0_2_2 : ( ruleVideoExpression ) ;
    public final void rule__TextExpression__CAssignment_1_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( ( ruleVideoExpression ) )
            // InternalMyDsl.g:4559:2: ( ruleVideoExpression )
            {
            // InternalMyDsl.g:4559:2: ( ruleVideoExpression )
            // InternalMyDsl.g:4560:3: ruleVideoExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCVideoExpressionParserRuleCall_1_0_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVideoExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCVideoExpressionParserRuleCall_1_0_2_2_0()); 
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
    // $ANTLR end "rule__TextExpression__CAssignment_1_0_2_2"


    // $ANTLR start "rule__ListExpression__ContentUnorderedAssignment_0_1_2"
    // InternalMyDsl.g:4569:1: rule__ListExpression__ContentUnorderedAssignment_0_1_2 : ( ruleTextExpression ) ;
    public final void rule__ListExpression__ContentUnorderedAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4573:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:4574:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:4574:2: ( ruleTextExpression )
            // InternalMyDsl.g:4575:3: ruleTextExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentUnorderedTextExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getContentUnorderedTextExpressionParserRuleCall_0_1_2_0()); 
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
    // $ANTLR end "rule__ListExpression__ContentUnorderedAssignment_0_1_2"


    // $ANTLR start "rule__ListExpression__ContentOrderedAssignment_1_3"
    // InternalMyDsl.g:4584:1: rule__ListExpression__ContentOrderedAssignment_1_3 : ( ruleTextExpression ) ;
    public final void rule__ListExpression__ContentOrderedAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4588:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:4589:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:4589:2: ( ruleTextExpression )
            // InternalMyDsl.g:4590:3: ruleTextExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentOrderedTextExpressionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getContentOrderedTextExpressionParserRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__ListExpression__ContentOrderedAssignment_1_3"


    // $ANTLR start "rule__QuoteExpression__ContentAssignment_2"
    // InternalMyDsl.g:4599:1: rule__QuoteExpression__ContentAssignment_2 : ( ruleTextExpression ) ;
    public final void rule__QuoteExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4603:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:4604:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:4604:2: ( ruleTextExpression )
            // InternalMyDsl.g:4605:3: ruleTextExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getContentTextExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getContentTextExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__QuoteExpression__ContentAssignment_2"


    // $ANTLR start "rule__LinkExpression__AltTextAssignment_2"
    // InternalMyDsl.g:4614:1: rule__LinkExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4618:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4619:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4619:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4620:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__LinkExpression__AltTextAssignment_2"


    // $ANTLR start "rule__LinkExpression__LinkContentAssignment_4"
    // InternalMyDsl.g:4629:1: rule__LinkExpression__LinkContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__LinkContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4633:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4634:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4634:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4635:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__LinkExpression__LinkContentAssignment_4"


    // $ANTLR start "rule__ImageExpression__AltTextAssignment_2"
    // InternalMyDsl.g:4644:1: rule__ImageExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__ImageExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4648:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4649:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4649:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4650:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ImageExpression__AltTextAssignment_2"


    // $ANTLR start "rule__ImageExpression__LinkContentAssignment_4"
    // InternalMyDsl.g:4659:1: rule__ImageExpression__LinkContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__ImageExpression__LinkContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4663:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4664:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4664:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4665:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__ImageExpression__LinkContentAssignment_4"


    // $ANTLR start "rule__VideoExpression__AltTextAssignment_2"
    // InternalMyDsl.g:4674:1: rule__VideoExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4678:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4679:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4679:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4680:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__VideoExpression__AltTextAssignment_2"


    // $ANTLR start "rule__VideoExpression__LinkImageAssignment_4"
    // InternalMyDsl.g:4689:1: rule__VideoExpression__LinkImageAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__LinkImageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4693:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4694:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4694:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4695:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkImageNaturalExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getLinkImageNaturalExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__VideoExpression__LinkImageAssignment_4"


    // $ANTLR start "rule__VideoExpression__LinkVideoAssignment_6"
    // InternalMyDsl.g:4704:1: rule__VideoExpression__LinkVideoAssignment_6 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__LinkVideoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4708:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4709:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4709:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4710:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkVideoNaturalExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVideoExpressionAccess().getLinkVideoNaturalExpressionParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__VideoExpression__LinkVideoAssignment_6"


    // $ANTLR start "rule__TabExpression__HeaderAssignment_1_0_0"
    // InternalMyDsl.g:4719:1: rule__TabExpression__HeaderAssignment_1_0_0 : ( ruleLineExpression ) ;
    public final void rule__TabExpression__HeaderAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4723:1: ( ( ruleLineExpression ) )
            // InternalMyDsl.g:4724:2: ( ruleLineExpression )
            {
            // InternalMyDsl.g:4724:2: ( ruleLineExpression )
            // InternalMyDsl.g:4725:3: ruleLineExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getHeaderLineExpressionParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLineExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getHeaderLineExpressionParserRuleCall_1_0_0_0()); 
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
    // $ANTLR end "rule__TabExpression__HeaderAssignment_1_0_0"


    // $ANTLR start "rule__TabExpression__LinesAssignment_1_0_3_0_1"
    // InternalMyDsl.g:4734:1: rule__TabExpression__LinesAssignment_1_0_3_0_1 : ( ruleLineExpression ) ;
    public final void rule__TabExpression__LinesAssignment_1_0_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4738:1: ( ( ruleLineExpression ) )
            // InternalMyDsl.g:4739:2: ( ruleLineExpression )
            {
            // InternalMyDsl.g:4739:2: ( ruleLineExpression )
            // InternalMyDsl.g:4740:3: ruleLineExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getLinesLineExpressionParserRuleCall_1_0_3_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLineExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabExpressionAccess().getLinesLineExpressionParserRuleCall_1_0_3_0_1_0()); 
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
    // $ANTLR end "rule__TabExpression__LinesAssignment_1_0_3_0_1"


    // $ANTLR start "rule__LineExpression__CellsAssignment_1"
    // InternalMyDsl.g:4749:1: rule__LineExpression__CellsAssignment_1 : ( ruleNaturalExpression ) ;
    public final void rule__LineExpression__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4753:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4754:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4754:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4755:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LineExpression__CellsAssignment_1"


    // $ANTLR start "rule__LineExpression__CellsAssignment_2_1"
    // InternalMyDsl.g:4764:1: rule__LineExpression__CellsAssignment_2_1 : ( ruleNaturalExpression ) ;
    public final void rule__LineExpression__CellsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4768:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4769:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4769:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4770:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__LineExpression__CellsAssignment_2_1"


    // $ANTLR start "rule__Header1Expression__TitleAssignment_2"
    // InternalMyDsl.g:4779:1: rule__Header1Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header1Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4783:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4784:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4784:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4785:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Header1Expression__TitleAssignment_2"


    // $ANTLR start "rule__Header2Expression__TitleAssignment_2"
    // InternalMyDsl.g:4794:1: rule__Header2Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header2Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4798:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4799:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4799:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4800:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Header2Expression__TitleAssignment_2"


    // $ANTLR start "rule__Header3Expression__TitleAssignment_2"
    // InternalMyDsl.g:4809:1: rule__Header3Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header3Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4813:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4814:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4814:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4815:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Header3Expression__TitleAssignment_2"


    // $ANTLR start "rule__Header4Expression__TitleAssignment_2"
    // InternalMyDsl.g:4824:1: rule__Header4Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header4Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4828:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4829:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4829:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4830:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Header4Expression__TitleAssignment_2"


    // $ANTLR start "rule__Header5Expression__TitleAssignment_2"
    // InternalMyDsl.g:4839:1: rule__Header5Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header5Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4843:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4844:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4844:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4845:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Header5Expression__TitleAssignment_2"


    // $ANTLR start "rule__Header6Expression__TitleAssignment_2"
    // InternalMyDsl.g:4854:1: rule__Header6Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header6Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4858:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4859:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4859:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4860:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeader6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Header6Expression__TitleAssignment_2"


    // $ANTLR start "rule__EmphasisExpression__CAssignment_0_0_0"
    // InternalMyDsl.g:4869:1: rule__EmphasisExpression__CAssignment_0_0_0 : ( ruleStrongExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4873:1: ( ( ruleStrongExpression ) )
            // InternalMyDsl.g:4874:2: ( ruleStrongExpression )
            {
            // InternalMyDsl.g:4874:2: ( ruleStrongExpression )
            // InternalMyDsl.g:4875:3: ruleStrongExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getCStrongExpressionParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStrongExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmphasisExpressionAccess().getCStrongExpressionParserRuleCall_0_0_0_0()); 
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
    // $ANTLR end "rule__EmphasisExpression__CAssignment_0_0_0"


    // $ANTLR start "rule__EmphasisExpression__CAssignment_0_0_1"
    // InternalMyDsl.g:4884:1: rule__EmphasisExpression__CAssignment_0_0_1 : ( ruleItalicExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4888:1: ( ( ruleItalicExpression ) )
            // InternalMyDsl.g:4889:2: ( ruleItalicExpression )
            {
            // InternalMyDsl.g:4889:2: ( ruleItalicExpression )
            // InternalMyDsl.g:4890:3: ruleItalicExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getCItalicExpressionParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleItalicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmphasisExpressionAccess().getCItalicExpressionParserRuleCall_0_0_1_0()); 
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
    // $ANTLR end "rule__EmphasisExpression__CAssignment_0_0_1"


    // $ANTLR start "rule__EmphasisExpression__CAssignment_0_0_2"
    // InternalMyDsl.g:4899:1: rule__EmphasisExpression__CAssignment_0_0_2 : ( ruleScratchExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4903:1: ( ( ruleScratchExpression ) )
            // InternalMyDsl.g:4904:2: ( ruleScratchExpression )
            {
            // InternalMyDsl.g:4904:2: ( ruleScratchExpression )
            // InternalMyDsl.g:4905:3: ruleScratchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getCScratchExpressionParserRuleCall_0_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleScratchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmphasisExpressionAccess().getCScratchExpressionParserRuleCall_0_0_2_0()); 
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
    // $ANTLR end "rule__EmphasisExpression__CAssignment_0_0_2"


    // $ANTLR start "rule__EmphasisExpression__CAssignment_1"
    // InternalMyDsl.g:4914:1: rule__EmphasisExpression__CAssignment_1 : ( ruleNaturalExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4918:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:4919:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:4919:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:4920:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getCNaturalExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmphasisExpressionAccess().getCNaturalExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__EmphasisExpression__CAssignment_1"


    // $ANTLR start "rule__StrongExpression__ContentAssignment_2"
    // InternalMyDsl.g:4929:1: rule__StrongExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__StrongExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4933:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4934:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4934:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4935:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrongExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__StrongExpression__ContentAssignment_2"


    // $ANTLR start "rule__ItalicExpression__ContentAssignment_2"
    // InternalMyDsl.g:4944:1: rule__ItalicExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__ItalicExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4948:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4949:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4949:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4950:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ItalicExpression__ContentAssignment_2"


    // $ANTLR start "rule__ScratchExpression__ContentAssignment_2"
    // InternalMyDsl.g:4959:1: rule__ScratchExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__ScratchExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4963:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:4964:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:4964:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:4965:3: ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScratchExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ScratchExpression__ContentAssignment_2"


    // $ANTLR start "rule__NaturalExpression__ValueAssignment_1"
    // InternalMyDsl.g:4974:1: rule__NaturalExpression__ValueAssignment_1 : ( ruleContent ) ;
    public final void rule__NaturalExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4978:1: ( ( ruleContent ) )
            // InternalMyDsl.g:4979:2: ( ruleContent )
            {
            // InternalMyDsl.g:4979:2: ( ruleContent )
            // InternalMyDsl.g:4980:3: ruleContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getValueContentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNaturalExpressionAccess().getValueContentParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__NaturalExpression__ValueAssignment_1"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:567:5: ( rule__EmphasisExpression__Alternatives )
        // InternalMyDsl.g:567:5: rule__EmphasisExpression__Alternatives
        {
        pushFollow(FOLLOW_2);
        rule__EmphasisExpression__Alternatives();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:730:2: ( ( ( rule__Expression__Alternatives_0 ) ) )
        // InternalMyDsl.g:730:2: ( ( rule__Expression__Alternatives_0 ) )
        {
        // InternalMyDsl.g:730:2: ( ( rule__Expression__Alternatives_0 ) )
        // InternalMyDsl.g:731:3: ( rule__Expression__Alternatives_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getAlternatives_0()); 
        }
        // InternalMyDsl.g:732:3: ( rule__Expression__Alternatives_0 )
        // InternalMyDsl.g:732:4: rule__Expression__Alternatives_0
        {
        pushFollow(FOLLOW_2);
        rule__Expression__Alternatives_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // $ANTLR start synpred5_InternalMyDsl
    public final void synpred5_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:778:2: ( ( ( rule__TextExpression__CAssignment_0 ) ) )
        // InternalMyDsl.g:778:2: ( ( rule__TextExpression__CAssignment_0 ) )
        {
        // InternalMyDsl.g:778:2: ( ( rule__TextExpression__CAssignment_0 ) )
        // InternalMyDsl.g:779:3: ( rule__TextExpression__CAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTextExpressionAccess().getCAssignment_0()); 
        }
        // InternalMyDsl.g:780:3: ( rule__TextExpression__CAssignment_0 )
        // InternalMyDsl.g:780:4: rule__TextExpression__CAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__TextExpression__CAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalMyDsl

    // $ANTLR start synpred11_InternalMyDsl
    public final void synpred11_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:867:5: ( rule__ListExpression__Group_1__0 )
        // InternalMyDsl.g:867:5: rule__ListExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ListExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalMyDsl

    // $ANTLR start synpred31_InternalMyDsl
    public final void synpred31_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1383:4: ( rule__ListExpression__Group_0_1__0 )
        // InternalMyDsl.g:1383:4: rule__ListExpression__Group_0_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ListExpression__Group_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalMyDsl

    // $ANTLR start synpred33_InternalMyDsl
    public final void synpred33_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1492:3: ( RULE_BL )
        // InternalMyDsl.g:1492:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalMyDsl

    // $ANTLR start synpred35_InternalMyDsl
    public final void synpred35_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1627:3: ( RULE_BL )
        // InternalMyDsl.g:1627:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalMyDsl

    // $ANTLR start synpred36_InternalMyDsl
    public final void synpred36_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1715:4: ( rule__QuoteExpression__ContentAssignment_2 )
        // InternalMyDsl.g:1715:4: rule__QuoteExpression__ContentAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__QuoteExpression__ContentAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalMyDsl

    // $ANTLR start synpred37_InternalMyDsl
    public final void synpred37_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1742:3: ( RULE_BL )
        // InternalMyDsl.g:1742:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalMyDsl

    // $ANTLR start synpred39_InternalMyDsl
    public final void synpred39_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1931:3: ( RULE_BL )
        // InternalMyDsl.g:1931:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalMyDsl

    // $ANTLR start synpred41_InternalMyDsl
    public final void synpred41_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2120:3: ( RULE_BL )
        // InternalMyDsl.g:2120:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalMyDsl

    // $ANTLR start synpred44_InternalMyDsl
    public final void synpred44_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2363:3: ( RULE_BL )
        // InternalMyDsl.g:2363:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalMyDsl

    // $ANTLR start synpred45_InternalMyDsl
    public final void synpred45_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2552:3: ( rule__TabExpression__Group_1_0_3__0 )
        // InternalMyDsl.g:2552:3: rule__TabExpression__Group_1_0_3__0
        {
        pushFollow(FOLLOW_2);
        rule__TabExpression__Group_1_0_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalMyDsl

    // $ANTLR start synpred48_InternalMyDsl
    public final void synpred48_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2755:4: ( rule__TabSeparation__Group_3__0 )
        // InternalMyDsl.g:2755:4: rule__TabSeparation__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__TabSeparation__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalMyDsl

    // $ANTLR start synpred49_InternalMyDsl
    public final void synpred49_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2782:3: ( '|' )
        // InternalMyDsl.g:2782:3: '|'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalMyDsl

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2869:4: ( '-' )
        // InternalMyDsl.g:2869:4: '-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2898:3: ( '|' )
        // InternalMyDsl.g:2898:3: '|'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2952:3: ( rule__LineExpression__Group_2__0 )
        // InternalMyDsl.g:2952:3: rule__LineExpression__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__LineExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalMyDsl

    // $ANTLR start synpred53_InternalMyDsl
    public final void synpred53_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2978:3: ( '|' )
        // InternalMyDsl.g:2978:3: '|'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalMyDsl

    // $ANTLR start synpred54_InternalMyDsl
    public final void synpred54_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3141:3: ( rule__Header1Expression__Group_3__0 )
        // InternalMyDsl.g:3141:3: rule__Header1Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header1Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalMyDsl

    // $ANTLR start synpred56_InternalMyDsl
    public final void synpred56_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3303:3: ( rule__Header2Expression__Group_3__0 )
        // InternalMyDsl.g:3303:3: rule__Header2Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header2Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalMyDsl

    // $ANTLR start synpred58_InternalMyDsl
    public final void synpred58_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3465:3: ( rule__Header3Expression__Group_3__0 )
        // InternalMyDsl.g:3465:3: rule__Header3Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header3Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalMyDsl

    // $ANTLR start synpred60_InternalMyDsl
    public final void synpred60_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3627:3: ( rule__Header4Expression__Group_3__0 )
        // InternalMyDsl.g:3627:3: rule__Header4Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header4Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalMyDsl

    // $ANTLR start synpred62_InternalMyDsl
    public final void synpred62_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3789:3: ( rule__Header5Expression__Group_3__0 )
        // InternalMyDsl.g:3789:3: rule__Header5Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header5Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalMyDsl

    // $ANTLR start synpred64_InternalMyDsl
    public final void synpred64_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3951:3: ( rule__Header6Expression__Group_3__0 )
        // InternalMyDsl.g:3951:3: rule__Header6Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header6Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalMyDsl

    // Delegated rules

    public final boolean synpred41_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\1\31\uffff";
    static final String dfa_3s = "\1\4\11\uffff\2\0\1\uffff\10\0\5\uffff";
    static final String dfa_4s = "\1\43\11\uffff\2\0\1\uffff\10\0\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\27\uffff\1\1";
    static final String dfa_6s = "\12\uffff\1\0\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\20\1\21\1\15\1\1\5\uffff\1\12\1\13\1\1\1\22\1\23\1\24\1\uffff\2\1\2\uffff\2\1\1\uffff\6\1\1\16\1\17\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 567:4: ( rule__EmphasisExpression__Alternatives )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_18 = input.LA(1);

                         
                        int index1_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_19 = input.LA(1);

                         
                        int index1_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_20 = input.LA(1);

                         
                        int index1_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\27\uffff";
    static final String dfa_9s = "\1\4\7\uffff\2\0\1\uffff\1\0\13\uffff";
    static final String dfa_10s = "\1\43\7\uffff\2\0\1\uffff\1\0\13\uffff";
    static final String dfa_11s = "\1\uffff\1\1\12\uffff\1\2\12\uffff";
    static final String dfa_12s = "\10\uffff\1\0\1\1\1\uffff\1\2\13\uffff}>";
    static final String[] dfa_13s = {
            "\2\14\1\13\6\uffff\1\10\1\11\1\1\3\14\1\uffff\2\14\2\uffff\2\14\1\uffff\6\1\2\14\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "725:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Alternatives_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\33\uffff";
    static final String dfa_15s = "\2\uffff\5\1\1\uffff\1\1\2\uffff\12\1\1\uffff\3\1\1\uffff\1\1";
    static final String dfa_16s = "\1\4\1\uffff\5\4\1\0\1\4\1\uffff\1\0\12\4\1\0\3\4\1\0\1\4";
    static final String dfa_17s = "\1\42\1\uffff\5\43\1\0\1\43\1\uffff\1\0\12\43\1\0\3\43\1\0\1\43";
    static final String dfa_18s = "\1\uffff\1\1\7\uffff\1\2\21\uffff";
    static final String dfa_19s = "\7\uffff\1\0\2\uffff\1\1\12\uffff\1\3\3\uffff\1\2\1\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\1\3\1\4\6\uffff\1\1\1\6\1\uffff\1\5\1\7\1\10\1\uffff\2\11\2\uffff\2\11\7\uffff\2\1",
            "",
            "\3\1\1\13\5\uffff\4\1\1\12\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\3\1\1\13\5\uffff\4\1\1\12\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\3\1\1\13\5\uffff\4\1\1\12\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\3\1\1\13\5\uffff\4\1\1\12\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\3\1\1\13\5\uffff\4\1\1\12\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\1\uffff",
            "\3\1\1\13\5\uffff\4\1\1\12\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "",
            "\1\uffff",
            "\4\1\5\uffff\1\1\1\14\2\1\1\15\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\5\1\4\uffff\1\1\1\16\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\4\1\5\uffff\1\1\1\17\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\5\1\4\uffff\1\1\1\21\2\1\1\20\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\5\1\4\uffff\1\1\1\16\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\4\1\5\uffff\1\1\1\22\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\5\1\4\uffff\1\1\1\24\2\1\1\23\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\5\1\4\uffff\1\1\1\25\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\4\1\5\uffff\1\1\1\26\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\5\1\4\uffff\1\1\1\30\2\1\1\27\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\1\uffff",
            "\5\1\4\uffff\1\1\1\31\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\4\1\5\uffff\1\1\1\32\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\5\1\4\uffff\1\1\1\30\2\1\1\27\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\1\uffff",
            "\5\1\4\uffff\1\1\1\31\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "773:1: rule__TextExpression__Alternatives : ( ( ( rule__TextExpression__CAssignment_0 ) ) | ( ( rule__TextExpression__Group_1__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_25 = input.LA(1);

                         
                        int index4_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_25);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_21 = input.LA(1);

                         
                        int index4_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\1\4\14\uffff\1\0\14\uffff";
    static final String dfa_22s = "\1\43\14\uffff\1\0\14\uffff";
    static final String dfa_23s = "\15\uffff\1\0\14\uffff}>";
    static final String[] dfa_24s = {
            "\2\1\1\15\1\1\5\uffff\6\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_5;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 867:4: ( rule__ListExpression__Group_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_13 = input.LA(1);

                         
                        int index7_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\1\4\11\uffff\3\0\15\uffff";
    static final String dfa_26s = "\1\43\11\uffff\3\0\15\uffff";
    static final String dfa_27s = "\12\uffff\1\0\1\1\1\2\15\uffff}>";
    static final String[] dfa_28s = {
            "\4\1\5\uffff\1\12\1\13\1\14\3\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_5;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 1383:3: ( rule__ListExpression__Group_0_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\1\4\11\uffff\2\0\1\uffff\14\0\1\uffff";
    static final String dfa_30s = "\1\43\11\uffff\2\0\1\uffff\14\0\1\uffff";
    static final String dfa_31s = "\12\uffff\1\0\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff}>";
    static final String[] dfa_32s = {
            "\1\20\1\21\1\15\1\1\5\uffff\1\12\1\13\1\1\1\22\1\23\1\24\1\uffff\1\25\1\26\2\uffff\1\27\1\30\1\uffff\6\1\1\16\1\17\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_5;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()* loopback of 1715:3: ( rule__QuoteExpression__ContentAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_13 = input.LA(1);

                         
                        int index23_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_14 = input.LA(1);

                         
                        int index23_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_15 = input.LA(1);

                         
                        int index23_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_16 = input.LA(1);

                         
                        int index23_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_17 = input.LA(1);

                         
                        int index23_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_18 = input.LA(1);

                         
                        int index23_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_19 = input.LA(1);

                         
                        int index23_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_20 = input.LA(1);

                         
                        int index23_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_21 = input.LA(1);

                         
                        int index23_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_21);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA23_22 = input.LA(1);

                         
                        int index23_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_22);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA23_23 = input.LA(1);

                         
                        int index23_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_23);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA23_24 = input.LA(1);

                         
                        int index23_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_33s = "\13\uffff";
    static final String dfa_34s = "\1\1\1\uffff\1\1\10\uffff";
    static final String dfa_35s = "\1\4\1\uffff\1\4\7\0\1\uffff";
    static final String dfa_36s = "\1\43\1\uffff\1\43\7\0\1\uffff";
    static final String dfa_37s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_38s = "\3\uffff\1\1\1\0\1\5\1\2\1\3\1\4\1\6\1\uffff}>";
    static final String[] dfa_39s = {
            "\3\1\1\2\5\uffff\6\1\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "",
            "\1\5\1\6\1\4\1\1\5\uffff\1\1\1\3\1\1\1\7\1\10\1\11\1\uffff\2\1\2\uffff\2\1\1\uffff\11\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_33;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "()* loopback of 2552:2: ( rule__TabExpression__Group_1_0_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\2\2\11\uffff";
    static final String dfa_41s = "\2\4\1\uffff\7\0\1\uffff";
    static final String dfa_42s = "\2\43\1\uffff\7\0\1\uffff";
    static final String dfa_43s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_44s = "\3\uffff\1\5\1\6\1\1\1\2\1\0\1\3\1\4\1\uffff}>";
    static final String[] dfa_45s = {
            "\4\2\5\uffff\4\2\1\1\1\2\1\uffff\2\2\2\uffff\2\2\1\uffff\11\2",
            "\1\3\1\4\1\5\1\2\5\uffff\1\2\1\7\1\2\1\6\1\10\1\11\1\uffff\2\2\2\uffff\2\2\1\uffff\11\2",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_33;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "()* loopback of 2952:2: ( rule__LineExpression__Group_2__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_9 = input.LA(1);

                         
                        int index39_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_46s = "\1\4\2\uffff\1\0\26\uffff";
    static final String dfa_47s = "\1\43\2\uffff\1\0\26\uffff";
    static final String dfa_48s = "\3\uffff\1\0\26\uffff}>";
    static final String[] dfa_49s = {
            "\4\1\5\uffff\6\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\3\10\1",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_5;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()* loopback of 3141:2: ( rule__Header1Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_5;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()* loopback of 3303:2: ( rule__Header2Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_3 = input.LA(1);

                         
                        int index43_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_5;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()* loopback of 3465:2: ( rule__Header3Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_3 = input.LA(1);

                         
                        int index45_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index45_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_5;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()* loopback of 3627:2: ( rule__Header4Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_3 = input.LA(1);

                         
                        int index47_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_5;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()* loopback of 3789:2: ( rule__Header5Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_3 = input.LA(1);

                         
                        int index49_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_5;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()* loopback of 3951:2: ( rule__Header6Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000600076072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000FFB37E070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000FFB37E072L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000FFB37E170L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000600076070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000600876070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000604076070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000001F8000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000600002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});

}