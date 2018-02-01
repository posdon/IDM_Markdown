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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BL", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_ANY_OTHER", "'-'", "'*'", "'_'", "'+'", "'\\''", "'|'", "'\"'", "'.'", "'>'", "'['", "']:'", "']('", "')'", "'!['", "'[!['", "')]('", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'~~'"
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
    public static final int T__36=36;
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


    // $ANTLR start "entryRuleHorizontalExpression"
    // InternalMyDsl.g:129:1: entryRuleHorizontalExpression : ruleHorizontalExpression EOF ;
    public final void entryRuleHorizontalExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:130:1: ( ruleHorizontalExpression EOF )
            // InternalMyDsl.g:131:1: ruleHorizontalExpression EOF
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
    // InternalMyDsl.g:138:1: ruleHorizontalExpression : ( ( rule__HorizontalExpression__Group__0 ) ) ;
    public final void ruleHorizontalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:142:2: ( ( ( rule__HorizontalExpression__Group__0 ) ) )
            // InternalMyDsl.g:143:2: ( ( rule__HorizontalExpression__Group__0 ) )
            {
            // InternalMyDsl.g:143:2: ( ( rule__HorizontalExpression__Group__0 ) )
            // InternalMyDsl.g:144:3: ( rule__HorizontalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:145:3: ( rule__HorizontalExpression__Group__0 )
            // InternalMyDsl.g:145:4: rule__HorizontalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleTextExpression"
    // InternalMyDsl.g:154:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:158:1: ( ruleTextExpression EOF )
            // InternalMyDsl.g:159:1: ruleTextExpression EOF
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
    // InternalMyDsl.g:169:1: ruleTextExpression : ( ( rule__TextExpression__Alternatives ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:174:2: ( ( ( rule__TextExpression__Alternatives ) ) )
            // InternalMyDsl.g:175:2: ( ( rule__TextExpression__Alternatives ) )
            {
            // InternalMyDsl.g:175:2: ( ( rule__TextExpression__Alternatives ) )
            // InternalMyDsl.g:176:3: ( rule__TextExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:177:3: ( rule__TextExpression__Alternatives )
            // InternalMyDsl.g:177:4: rule__TextExpression__Alternatives
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
    // InternalMyDsl.g:187:1: entryRuleListExpression : ruleListExpression EOF ;
    public final void entryRuleListExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:191:1: ( ruleListExpression EOF )
            // InternalMyDsl.g:192:1: ruleListExpression EOF
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
    // InternalMyDsl.g:202:1: ruleListExpression : ( ( rule__ListExpression__Alternatives ) ) ;
    public final void ruleListExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:207:2: ( ( ( rule__ListExpression__Alternatives ) ) )
            // InternalMyDsl.g:208:2: ( ( rule__ListExpression__Alternatives ) )
            {
            // InternalMyDsl.g:208:2: ( ( rule__ListExpression__Alternatives ) )
            // InternalMyDsl.g:209:3: ( rule__ListExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:210:3: ( rule__ListExpression__Alternatives )
            // InternalMyDsl.g:210:4: rule__ListExpression__Alternatives
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
    // InternalMyDsl.g:220:1: entryRuleQuoteExpression : ruleQuoteExpression EOF ;
    public final void entryRuleQuoteExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:221:1: ( ruleQuoteExpression EOF )
            // InternalMyDsl.g:222:1: ruleQuoteExpression EOF
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
    // InternalMyDsl.g:229:1: ruleQuoteExpression : ( ( rule__QuoteExpression__Group__0 ) ) ;
    public final void ruleQuoteExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:233:2: ( ( ( rule__QuoteExpression__Group__0 ) ) )
            // InternalMyDsl.g:234:2: ( ( rule__QuoteExpression__Group__0 ) )
            {
            // InternalMyDsl.g:234:2: ( ( rule__QuoteExpression__Group__0 ) )
            // InternalMyDsl.g:235:3: ( rule__QuoteExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:236:3: ( rule__QuoteExpression__Group__0 )
            // InternalMyDsl.g:236:4: rule__QuoteExpression__Group__0
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


    // $ANTLR start "entryRuleTabExpression"
    // InternalMyDsl.g:245:1: entryRuleTabExpression : ruleTabExpression EOF ;
    public final void entryRuleTabExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:246:1: ( ruleTabExpression EOF )
            // InternalMyDsl.g:247:1: ruleTabExpression EOF
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
    // InternalMyDsl.g:254:1: ruleTabExpression : ( ( rule__TabExpression__Group__0 ) ) ;
    public final void ruleTabExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:2: ( ( ( rule__TabExpression__Group__0 ) ) )
            // InternalMyDsl.g:259:2: ( ( rule__TabExpression__Group__0 ) )
            {
            // InternalMyDsl.g:259:2: ( ( rule__TabExpression__Group__0 ) )
            // InternalMyDsl.g:260:3: ( rule__TabExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:261:3: ( rule__TabExpression__Group__0 )
            // InternalMyDsl.g:261:4: rule__TabExpression__Group__0
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
    // InternalMyDsl.g:270:1: entryRuleTabSeparation : ruleTabSeparation EOF ;
    public final void entryRuleTabSeparation() throws RecognitionException {
        try {
            // InternalMyDsl.g:271:1: ( ruleTabSeparation EOF )
            // InternalMyDsl.g:272:1: ruleTabSeparation EOF
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
    // InternalMyDsl.g:279:1: ruleTabSeparation : ( ( rule__TabSeparation__Group__0 ) ) ;
    public final void ruleTabSeparation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:2: ( ( ( rule__TabSeparation__Group__0 ) ) )
            // InternalMyDsl.g:284:2: ( ( rule__TabSeparation__Group__0 ) )
            {
            // InternalMyDsl.g:284:2: ( ( rule__TabSeparation__Group__0 ) )
            // InternalMyDsl.g:285:3: ( rule__TabSeparation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup()); 
            }
            // InternalMyDsl.g:286:3: ( rule__TabSeparation__Group__0 )
            // InternalMyDsl.g:286:4: rule__TabSeparation__Group__0
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
    // InternalMyDsl.g:295:1: entryRuleLineExpression : ruleLineExpression EOF ;
    public final void entryRuleLineExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:296:1: ( ruleLineExpression EOF )
            // InternalMyDsl.g:297:1: ruleLineExpression EOF
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
    // InternalMyDsl.g:304:1: ruleLineExpression : ( ( rule__LineExpression__Group__0 ) ) ;
    public final void ruleLineExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:2: ( ( ( rule__LineExpression__Group__0 ) ) )
            // InternalMyDsl.g:309:2: ( ( rule__LineExpression__Group__0 ) )
            {
            // InternalMyDsl.g:309:2: ( ( rule__LineExpression__Group__0 ) )
            // InternalMyDsl.g:310:3: ( rule__LineExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:311:3: ( rule__LineExpression__Group__0 )
            // InternalMyDsl.g:311:4: rule__LineExpression__Group__0
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


    // $ANTLR start "entryRuleRefExpression"
    // InternalMyDsl.g:320:1: entryRuleRefExpression : ruleRefExpression EOF ;
    public final void entryRuleRefExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:321:1: ( ruleRefExpression EOF )
            // InternalMyDsl.g:322:1: ruleRefExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRefExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionRule()); 
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
    // $ANTLR end "entryRuleRefExpression"


    // $ANTLR start "ruleRefExpression"
    // InternalMyDsl.g:329:1: ruleRefExpression : ( ( rule__RefExpression__Group__0 ) ) ;
    public final void ruleRefExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:2: ( ( ( rule__RefExpression__Group__0 ) ) )
            // InternalMyDsl.g:334:2: ( ( rule__RefExpression__Group__0 ) )
            {
            // InternalMyDsl.g:334:2: ( ( rule__RefExpression__Group__0 ) )
            // InternalMyDsl.g:335:3: ( rule__RefExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:336:3: ( rule__RefExpression__Group__0 )
            // InternalMyDsl.g:336:4: rule__RefExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefExpression"


    // $ANTLR start "entryRuleLinkExpression"
    // InternalMyDsl.g:345:1: entryRuleLinkExpression : ruleLinkExpression EOF ;
    public final void entryRuleLinkExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:346:1: ( ruleLinkExpression EOF )
            // InternalMyDsl.g:347:1: ruleLinkExpression EOF
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
    // InternalMyDsl.g:354:1: ruleLinkExpression : ( ( rule__LinkExpression__Group__0 ) ) ;
    public final void ruleLinkExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:2: ( ( ( rule__LinkExpression__Group__0 ) ) )
            // InternalMyDsl.g:359:2: ( ( rule__LinkExpression__Group__0 ) )
            {
            // InternalMyDsl.g:359:2: ( ( rule__LinkExpression__Group__0 ) )
            // InternalMyDsl.g:360:3: ( rule__LinkExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:361:3: ( rule__LinkExpression__Group__0 )
            // InternalMyDsl.g:361:4: rule__LinkExpression__Group__0
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
    // InternalMyDsl.g:370:1: entryRuleImageExpression : ruleImageExpression EOF ;
    public final void entryRuleImageExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:371:1: ( ruleImageExpression EOF )
            // InternalMyDsl.g:372:1: ruleImageExpression EOF
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
    // InternalMyDsl.g:379:1: ruleImageExpression : ( ( rule__ImageExpression__Group__0 ) ) ;
    public final void ruleImageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:2: ( ( ( rule__ImageExpression__Group__0 ) ) )
            // InternalMyDsl.g:384:2: ( ( rule__ImageExpression__Group__0 ) )
            {
            // InternalMyDsl.g:384:2: ( ( rule__ImageExpression__Group__0 ) )
            // InternalMyDsl.g:385:3: ( rule__ImageExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:386:3: ( rule__ImageExpression__Group__0 )
            // InternalMyDsl.g:386:4: rule__ImageExpression__Group__0
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
    // InternalMyDsl.g:395:1: entryRuleVideoExpression : ruleVideoExpression EOF ;
    public final void entryRuleVideoExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:396:1: ( ruleVideoExpression EOF )
            // InternalMyDsl.g:397:1: ruleVideoExpression EOF
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
    // InternalMyDsl.g:404:1: ruleVideoExpression : ( ( rule__VideoExpression__Group__0 ) ) ;
    public final void ruleVideoExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:408:2: ( ( ( rule__VideoExpression__Group__0 ) ) )
            // InternalMyDsl.g:409:2: ( ( rule__VideoExpression__Group__0 ) )
            {
            // InternalMyDsl.g:409:2: ( ( rule__VideoExpression__Group__0 ) )
            // InternalMyDsl.g:410:3: ( rule__VideoExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:411:3: ( rule__VideoExpression__Group__0 )
            // InternalMyDsl.g:411:4: rule__VideoExpression__Group__0
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


    // $ANTLR start "entryRuleHeaderExpression"
    // InternalMyDsl.g:420:1: entryRuleHeaderExpression : ruleHeaderExpression EOF ;
    public final void entryRuleHeaderExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:421:1: ( ruleHeaderExpression EOF )
            // InternalMyDsl.g:422:1: ruleHeaderExpression EOF
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
    // InternalMyDsl.g:429:1: ruleHeaderExpression : ( ( rule__HeaderExpression__Alternatives ) ) ;
    public final void ruleHeaderExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:2: ( ( ( rule__HeaderExpression__Alternatives ) ) )
            // InternalMyDsl.g:434:2: ( ( rule__HeaderExpression__Alternatives ) )
            {
            // InternalMyDsl.g:434:2: ( ( rule__HeaderExpression__Alternatives ) )
            // InternalMyDsl.g:435:3: ( rule__HeaderExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:436:3: ( rule__HeaderExpression__Alternatives )
            // InternalMyDsl.g:436:4: rule__HeaderExpression__Alternatives
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
    // InternalMyDsl.g:445:1: entryRuleHeader1Expression : ruleHeader1Expression EOF ;
    public final void entryRuleHeader1Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:446:1: ( ruleHeader1Expression EOF )
            // InternalMyDsl.g:447:1: ruleHeader1Expression EOF
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
    // InternalMyDsl.g:454:1: ruleHeader1Expression : ( ( rule__Header1Expression__Group__0 ) ) ;
    public final void ruleHeader1Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:2: ( ( ( rule__Header1Expression__Group__0 ) ) )
            // InternalMyDsl.g:459:2: ( ( rule__Header1Expression__Group__0 ) )
            {
            // InternalMyDsl.g:459:2: ( ( rule__Header1Expression__Group__0 ) )
            // InternalMyDsl.g:460:3: ( rule__Header1Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:461:3: ( rule__Header1Expression__Group__0 )
            // InternalMyDsl.g:461:4: rule__Header1Expression__Group__0
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
    // InternalMyDsl.g:470:1: entryRuleHeader2Expression : ruleHeader2Expression EOF ;
    public final void entryRuleHeader2Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:471:1: ( ruleHeader2Expression EOF )
            // InternalMyDsl.g:472:1: ruleHeader2Expression EOF
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
    // InternalMyDsl.g:479:1: ruleHeader2Expression : ( ( rule__Header2Expression__Group__0 ) ) ;
    public final void ruleHeader2Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:2: ( ( ( rule__Header2Expression__Group__0 ) ) )
            // InternalMyDsl.g:484:2: ( ( rule__Header2Expression__Group__0 ) )
            {
            // InternalMyDsl.g:484:2: ( ( rule__Header2Expression__Group__0 ) )
            // InternalMyDsl.g:485:3: ( rule__Header2Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:486:3: ( rule__Header2Expression__Group__0 )
            // InternalMyDsl.g:486:4: rule__Header2Expression__Group__0
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
    // InternalMyDsl.g:495:1: entryRuleHeader3Expression : ruleHeader3Expression EOF ;
    public final void entryRuleHeader3Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:496:1: ( ruleHeader3Expression EOF )
            // InternalMyDsl.g:497:1: ruleHeader3Expression EOF
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
    // InternalMyDsl.g:504:1: ruleHeader3Expression : ( ( rule__Header3Expression__Group__0 ) ) ;
    public final void ruleHeader3Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:2: ( ( ( rule__Header3Expression__Group__0 ) ) )
            // InternalMyDsl.g:509:2: ( ( rule__Header3Expression__Group__0 ) )
            {
            // InternalMyDsl.g:509:2: ( ( rule__Header3Expression__Group__0 ) )
            // InternalMyDsl.g:510:3: ( rule__Header3Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:511:3: ( rule__Header3Expression__Group__0 )
            // InternalMyDsl.g:511:4: rule__Header3Expression__Group__0
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
    // InternalMyDsl.g:520:1: entryRuleHeader4Expression : ruleHeader4Expression EOF ;
    public final void entryRuleHeader4Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:521:1: ( ruleHeader4Expression EOF )
            // InternalMyDsl.g:522:1: ruleHeader4Expression EOF
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
    // InternalMyDsl.g:529:1: ruleHeader4Expression : ( ( rule__Header4Expression__Group__0 ) ) ;
    public final void ruleHeader4Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:533:2: ( ( ( rule__Header4Expression__Group__0 ) ) )
            // InternalMyDsl.g:534:2: ( ( rule__Header4Expression__Group__0 ) )
            {
            // InternalMyDsl.g:534:2: ( ( rule__Header4Expression__Group__0 ) )
            // InternalMyDsl.g:535:3: ( rule__Header4Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:536:3: ( rule__Header4Expression__Group__0 )
            // InternalMyDsl.g:536:4: rule__Header4Expression__Group__0
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
    // InternalMyDsl.g:545:1: entryRuleHeader5Expression : ruleHeader5Expression EOF ;
    public final void entryRuleHeader5Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:546:1: ( ruleHeader5Expression EOF )
            // InternalMyDsl.g:547:1: ruleHeader5Expression EOF
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
    // InternalMyDsl.g:554:1: ruleHeader5Expression : ( ( rule__Header5Expression__Group__0 ) ) ;
    public final void ruleHeader5Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:2: ( ( ( rule__Header5Expression__Group__0 ) ) )
            // InternalMyDsl.g:559:2: ( ( rule__Header5Expression__Group__0 ) )
            {
            // InternalMyDsl.g:559:2: ( ( rule__Header5Expression__Group__0 ) )
            // InternalMyDsl.g:560:3: ( rule__Header5Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:561:3: ( rule__Header5Expression__Group__0 )
            // InternalMyDsl.g:561:4: rule__Header5Expression__Group__0
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
    // InternalMyDsl.g:570:1: entryRuleHeader6Expression : ruleHeader6Expression EOF ;
    public final void entryRuleHeader6Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:571:1: ( ruleHeader6Expression EOF )
            // InternalMyDsl.g:572:1: ruleHeader6Expression EOF
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
    // InternalMyDsl.g:579:1: ruleHeader6Expression : ( ( rule__Header6Expression__Group__0 ) ) ;
    public final void ruleHeader6Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:2: ( ( ( rule__Header6Expression__Group__0 ) ) )
            // InternalMyDsl.g:584:2: ( ( rule__Header6Expression__Group__0 ) )
            {
            // InternalMyDsl.g:584:2: ( ( rule__Header6Expression__Group__0 ) )
            // InternalMyDsl.g:585:3: ( rule__Header6Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:586:3: ( rule__Header6Expression__Group__0 )
            // InternalMyDsl.g:586:4: rule__Header6Expression__Group__0
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
    // InternalMyDsl.g:595:1: entryRuleEmphasisExpression : ruleEmphasisExpression EOF ;
    public final void entryRuleEmphasisExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:596:1: ( ruleEmphasisExpression EOF )
            // InternalMyDsl.g:597:1: ruleEmphasisExpression EOF
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
    // InternalMyDsl.g:604:1: ruleEmphasisExpression : ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) ) ;
    public final void ruleEmphasisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:2: ( ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) ) )
            // InternalMyDsl.g:609:2: ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) )
            {
            // InternalMyDsl.g:609:2: ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) )
            // InternalMyDsl.g:610:3: ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* )
            {
            // InternalMyDsl.g:610:3: ( ( rule__EmphasisExpression__Alternatives ) )
            // InternalMyDsl.g:611:4: ( rule__EmphasisExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:612:4: ( rule__EmphasisExpression__Alternatives )
            // InternalMyDsl.g:612:5: rule__EmphasisExpression__Alternatives
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

            // InternalMyDsl.g:615:3: ( ( rule__EmphasisExpression__Alternatives )* )
            // InternalMyDsl.g:616:4: ( rule__EmphasisExpression__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:617:4: ( rule__EmphasisExpression__Alternatives )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:617:5: rule__EmphasisExpression__Alternatives
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
    // InternalMyDsl.g:627:1: entryRuleStrongExpression : ruleStrongExpression EOF ;
    public final void entryRuleStrongExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:631:1: ( ruleStrongExpression EOF )
            // InternalMyDsl.g:632:1: ruleStrongExpression EOF
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
    // InternalMyDsl.g:642:1: ruleStrongExpression : ( ( rule__StrongExpression__Group__0 ) ) ;
    public final void ruleStrongExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:2: ( ( ( rule__StrongExpression__Group__0 ) ) )
            // InternalMyDsl.g:648:2: ( ( rule__StrongExpression__Group__0 ) )
            {
            // InternalMyDsl.g:648:2: ( ( rule__StrongExpression__Group__0 ) )
            // InternalMyDsl.g:649:3: ( rule__StrongExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:650:3: ( rule__StrongExpression__Group__0 )
            // InternalMyDsl.g:650:4: rule__StrongExpression__Group__0
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
    // InternalMyDsl.g:660:1: entryRuleItalicExpression : ruleItalicExpression EOF ;
    public final void entryRuleItalicExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:664:1: ( ruleItalicExpression EOF )
            // InternalMyDsl.g:665:1: ruleItalicExpression EOF
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
    // InternalMyDsl.g:675:1: ruleItalicExpression : ( ( rule__ItalicExpression__Group__0 ) ) ;
    public final void ruleItalicExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:2: ( ( ( rule__ItalicExpression__Group__0 ) ) )
            // InternalMyDsl.g:681:2: ( ( rule__ItalicExpression__Group__0 ) )
            {
            // InternalMyDsl.g:681:2: ( ( rule__ItalicExpression__Group__0 ) )
            // InternalMyDsl.g:682:3: ( rule__ItalicExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:683:3: ( rule__ItalicExpression__Group__0 )
            // InternalMyDsl.g:683:4: rule__ItalicExpression__Group__0
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
    // InternalMyDsl.g:693:1: entryRuleScratchExpression : ruleScratchExpression EOF ;
    public final void entryRuleScratchExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:697:1: ( ruleScratchExpression EOF )
            // InternalMyDsl.g:698:1: ruleScratchExpression EOF
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
    // InternalMyDsl.g:708:1: ruleScratchExpression : ( ( rule__ScratchExpression__Group__0 ) ) ;
    public final void ruleScratchExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:2: ( ( ( rule__ScratchExpression__Group__0 ) ) )
            // InternalMyDsl.g:714:2: ( ( rule__ScratchExpression__Group__0 ) )
            {
            // InternalMyDsl.g:714:2: ( ( rule__ScratchExpression__Group__0 ) )
            // InternalMyDsl.g:715:3: ( rule__ScratchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:716:3: ( rule__ScratchExpression__Group__0 )
            // InternalMyDsl.g:716:4: rule__ScratchExpression__Group__0
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
    // InternalMyDsl.g:726:1: entryRuleNaturalExpression : ruleNaturalExpression EOF ;
    public final void entryRuleNaturalExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:727:1: ( ruleNaturalExpression EOF )
            // InternalMyDsl.g:728:1: ruleNaturalExpression EOF
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
    // InternalMyDsl.g:735:1: ruleNaturalExpression : ( ( rule__NaturalExpression__Group__0 ) ) ;
    public final void ruleNaturalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:2: ( ( ( rule__NaturalExpression__Group__0 ) ) )
            // InternalMyDsl.g:740:2: ( ( rule__NaturalExpression__Group__0 ) )
            {
            // InternalMyDsl.g:740:2: ( ( rule__NaturalExpression__Group__0 ) )
            // InternalMyDsl.g:741:3: ( rule__NaturalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:742:3: ( rule__NaturalExpression__Group__0 )
            // InternalMyDsl.g:742:4: rule__NaturalExpression__Group__0
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
    // InternalMyDsl.g:751:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:752:1: ( ruleContent EOF )
            // InternalMyDsl.g:753:1: ruleContent EOF
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
    // InternalMyDsl.g:760:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalMyDsl.g:765:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalMyDsl.g:765:2: ( ( rule__Content__Alternatives ) )
            // InternalMyDsl.g:766:3: ( rule__Content__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:767:3: ( rule__Content__Alternatives )
            // InternalMyDsl.g:767:4: rule__Content__Alternatives
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
    // InternalMyDsl.g:775:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:780:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:780:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalMyDsl.g:781:3: ( rule__Expression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:782:3: ( rule__Expression__Group_0__0 )
                    // InternalMyDsl.g:782:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:786:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:786:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalMyDsl.g:787:3: ( rule__Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:788:3: ( rule__Expression__Group_1__0 )
                    // InternalMyDsl.g:788:4: rule__Expression__Group_1__0
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


    // $ANTLR start "rule__Expression__Alternatives_0_0"
    // InternalMyDsl.g:796:1: rule__Expression__Alternatives_0_0 : ( ( ( rule__Expression__CAssignment_0_0_0 ) ) | ( ( rule__Expression__CAssignment_0_0_1 ) ) | ( ( rule__Expression__CAssignment_0_0_2 ) ) | ( ( rule__Expression__Group_0_0_3__0 ) ) | ( ( rule__Expression__Group_0_0_4__0 ) ) );
    public final void rule__Expression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( ( rule__Expression__CAssignment_0_0_0 ) ) | ( ( rule__Expression__CAssignment_0_0_1 ) ) | ( ( rule__Expression__CAssignment_0_0_2 ) ) | ( ( rule__Expression__Group_0_0_3__0 ) ) | ( ( rule__Expression__Group_0_0_4__0 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt3=1;
                }
                break;
            case RULE_BL:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 13:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=13 && LA3_4<=15)) ) {
                    alt3=4;
                }
                else if ( (LA3_4==RULE_WS) ) {
                    alt3=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==RULE_WS) ) {
                    alt3=5;
                }
                else if ( ((LA3_5>=13 && LA3_5<=15)) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case RULE_INT:
            case 16:
                {
                alt3=5;
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
                    // InternalMyDsl.g:801:2: ( ( rule__Expression__CAssignment_0_0_0 ) )
                    {
                    // InternalMyDsl.g:801:2: ( ( rule__Expression__CAssignment_0_0_0 ) )
                    // InternalMyDsl.g:802:3: ( rule__Expression__CAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCAssignment_0_0_0()); 
                    }
                    // InternalMyDsl.g:803:3: ( rule__Expression__CAssignment_0_0_0 )
                    // InternalMyDsl.g:803:4: rule__Expression__CAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__CAssignment_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getCAssignment_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:807:2: ( ( rule__Expression__CAssignment_0_0_1 ) )
                    {
                    // InternalMyDsl.g:807:2: ( ( rule__Expression__CAssignment_0_0_1 ) )
                    // InternalMyDsl.g:808:3: ( rule__Expression__CAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCAssignment_0_0_1()); 
                    }
                    // InternalMyDsl.g:809:3: ( rule__Expression__CAssignment_0_0_1 )
                    // InternalMyDsl.g:809:4: rule__Expression__CAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__CAssignment_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getCAssignment_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:813:2: ( ( rule__Expression__CAssignment_0_0_2 ) )
                    {
                    // InternalMyDsl.g:813:2: ( ( rule__Expression__CAssignment_0_0_2 ) )
                    // InternalMyDsl.g:814:3: ( rule__Expression__CAssignment_0_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCAssignment_0_0_2()); 
                    }
                    // InternalMyDsl.g:815:3: ( rule__Expression__CAssignment_0_0_2 )
                    // InternalMyDsl.g:815:4: rule__Expression__CAssignment_0_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__CAssignment_0_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getCAssignment_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:819:2: ( ( rule__Expression__Group_0_0_3__0 ) )
                    {
                    // InternalMyDsl.g:819:2: ( ( rule__Expression__Group_0_0_3__0 ) )
                    // InternalMyDsl.g:820:3: ( rule__Expression__Group_0_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_0_0_3()); 
                    }
                    // InternalMyDsl.g:821:3: ( rule__Expression__Group_0_0_3__0 )
                    // InternalMyDsl.g:821:4: rule__Expression__Group_0_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getGroup_0_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:825:2: ( ( rule__Expression__Group_0_0_4__0 ) )
                    {
                    // InternalMyDsl.g:825:2: ( ( rule__Expression__Group_0_0_4__0 ) )
                    // InternalMyDsl.g:826:3: ( rule__Expression__Group_0_0_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_0_0_4()); 
                    }
                    // InternalMyDsl.g:827:3: ( rule__Expression__Group_0_0_4__0 )
                    // InternalMyDsl.g:827:4: rule__Expression__Group_0_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getGroup_0_0_4()); 
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
    // $ANTLR end "rule__Expression__Alternatives_0_0"


    // $ANTLR start "rule__HorizontalExpression__Alternatives_1"
    // InternalMyDsl.g:835:1: rule__HorizontalExpression__Alternatives_1 : ( ( '-' ) | ( '*' ) | ( '_' ) );
    public final void rule__HorizontalExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( '-' ) | ( '*' ) | ( '_' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:840:2: ( '-' )
                    {
                    // InternalMyDsl.g:840:2: ( '-' )
                    // InternalMyDsl.g:841:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_1_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:846:2: ( '*' )
                    {
                    // InternalMyDsl.g:846:2: ( '*' )
                    // InternalMyDsl.g:847:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:852:2: ( '_' )
                    {
                    // InternalMyDsl.g:852:2: ( '_' )
                    // InternalMyDsl.g:853:3: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2()); 
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
    // $ANTLR end "rule__HorizontalExpression__Alternatives_1"


    // $ANTLR start "rule__HorizontalExpression__Alternatives_2"
    // InternalMyDsl.g:862:1: rule__HorizontalExpression__Alternatives_2 : ( ( '-' ) | ( '*' ) | ( '_' ) );
    public final void rule__HorizontalExpression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( '-' ) | ( '*' ) | ( '_' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:867:2: ( '-' )
                    {
                    // InternalMyDsl.g:867:2: ( '-' )
                    // InternalMyDsl.g:868:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_2_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:873:2: ( '*' )
                    {
                    // InternalMyDsl.g:873:2: ( '*' )
                    // InternalMyDsl.g:874:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_2_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:879:2: ( '_' )
                    {
                    // InternalMyDsl.g:879:2: ( '_' )
                    // InternalMyDsl.g:880:3: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_2()); 
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
    // $ANTLR end "rule__HorizontalExpression__Alternatives_2"


    // $ANTLR start "rule__HorizontalExpression__Alternatives_3"
    // InternalMyDsl.g:889:1: rule__HorizontalExpression__Alternatives_3 : ( ( '-' ) | ( '*' ) | ( '_' ) );
    public final void rule__HorizontalExpression__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( '-' ) | ( '*' ) | ( '_' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:894:2: ( '-' )
                    {
                    // InternalMyDsl.g:894:2: ( '-' )
                    // InternalMyDsl.g:895:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_3_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:900:2: ( '*' )
                    {
                    // InternalMyDsl.g:900:2: ( '*' )
                    // InternalMyDsl.g:901:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_3_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:906:2: ( '_' )
                    {
                    // InternalMyDsl.g:906:2: ( '_' )
                    // InternalMyDsl.g:907:3: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_3_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_3_2()); 
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
    // $ANTLR end "rule__HorizontalExpression__Alternatives_3"


    // $ANTLR start "rule__TextExpression__Alternatives"
    // InternalMyDsl.g:916:1: rule__TextExpression__Alternatives : ( ( ( rule__TextExpression__Group_0__0 ) ) | ( ruleEmphasisExpression ) );
    public final void rule__TextExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ( rule__TextExpression__Group_0__0 ) ) | ( ruleEmphasisExpression ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:921:2: ( ( rule__TextExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:921:2: ( ( rule__TextExpression__Group_0__0 ) )
                    // InternalMyDsl.g:922:3: ( rule__TextExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:923:3: ( rule__TextExpression__Group_0__0 )
                    // InternalMyDsl.g:923:4: rule__TextExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:927:2: ( ruleEmphasisExpression )
                    {
                    // InternalMyDsl.g:927:2: ( ruleEmphasisExpression )
                    // InternalMyDsl.g:928:3: ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getEmphasisExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEmphasisExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getEmphasisExpressionParserRuleCall_1()); 
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


    // $ANTLR start "rule__TextExpression__Alternatives_0_0"
    // InternalMyDsl.g:937:1: rule__TextExpression__Alternatives_0_0 : ( ( ( rule__TextExpression__Group_0_0_0__0 ) ) | ( ruleTabExpression ) | ( ruleQuoteExpression ) );
    public final void rule__TextExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( ( ( rule__TextExpression__Group_0_0_0__0 ) ) | ( ruleTabExpression ) | ( ruleQuoteExpression ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
            case 26:
            case 27:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 13:
            case 17:
            case 18:
            case 19:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:942:2: ( ( rule__TextExpression__Group_0_0_0__0 ) )
                    {
                    // InternalMyDsl.g:942:2: ( ( rule__TextExpression__Group_0_0_0__0 ) )
                    // InternalMyDsl.g:943:3: ( rule__TextExpression__Group_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getGroup_0_0_0()); 
                    }
                    // InternalMyDsl.g:944:3: ( rule__TextExpression__Group_0_0_0__0 )
                    // InternalMyDsl.g:944:4: rule__TextExpression__Group_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__Group_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getGroup_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:948:2: ( ruleTabExpression )
                    {
                    // InternalMyDsl.g:948:2: ( ruleTabExpression )
                    // InternalMyDsl.g:949:3: ruleTabExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getTabExpressionParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTabExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getTabExpressionParserRuleCall_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:954:2: ( ruleQuoteExpression )
                    {
                    // InternalMyDsl.g:954:2: ( ruleQuoteExpression )
                    // InternalMyDsl.g:955:3: ruleQuoteExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_0_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleQuoteExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_0_0_2()); 
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
    // $ANTLR end "rule__TextExpression__Alternatives_0_0"


    // $ANTLR start "rule__TextExpression__Alternatives_0_0_0_0"
    // InternalMyDsl.g:964:1: rule__TextExpression__Alternatives_0_0_0_0 : ( ( ( rule__TextExpression__Group_0_0_0_0_0__0 ) ) | ( ruleLinkExpression ) );
    public final void rule__TextExpression__Alternatives_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( ( rule__TextExpression__Group_0_0_0_0_0__0 ) ) | ( ruleLinkExpression ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=26 && LA9_0<=27)) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:969:2: ( ( rule__TextExpression__Group_0_0_0_0_0__0 ) )
                    {
                    // InternalMyDsl.g:969:2: ( ( rule__TextExpression__Group_0_0_0_0_0__0 ) )
                    // InternalMyDsl.g:970:3: ( rule__TextExpression__Group_0_0_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getGroup_0_0_0_0_0()); 
                    }
                    // InternalMyDsl.g:971:3: ( rule__TextExpression__Group_0_0_0_0_0__0 )
                    // InternalMyDsl.g:971:4: rule__TextExpression__Group_0_0_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextExpression__Group_0_0_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getGroup_0_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:975:2: ( ruleLinkExpression )
                    {
                    // InternalMyDsl.g:975:2: ( ruleLinkExpression )
                    // InternalMyDsl.g:976:3: ruleLinkExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getLinkExpressionParserRuleCall_0_0_0_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLinkExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getLinkExpressionParserRuleCall_0_0_0_0_1()); 
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
    // $ANTLR end "rule__TextExpression__Alternatives_0_0_0_0"


    // $ANTLR start "rule__TextExpression__Alternatives_0_0_0_0_0_0"
    // InternalMyDsl.g:985:1: rule__TextExpression__Alternatives_0_0_0_0_0_0 : ( ( ruleImageExpression ) | ( ( ruleVideoExpression ) ) );
    public final void rule__TextExpression__Alternatives_0_0_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( ruleImageExpression ) | ( ( ruleVideoExpression ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:990:2: ( ruleImageExpression )
                    {
                    // InternalMyDsl.g:990:2: ( ruleImageExpression )
                    // InternalMyDsl.g:991:3: ruleImageExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getImageExpressionParserRuleCall_0_0_0_0_0_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleImageExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getImageExpressionParserRuleCall_0_0_0_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:996:2: ( ( ruleVideoExpression ) )
                    {
                    // InternalMyDsl.g:996:2: ( ( ruleVideoExpression ) )
                    // InternalMyDsl.g:997:3: ( ruleVideoExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getVideoExpressionParserRuleCall_0_0_0_0_0_0_1()); 
                    }
                    // InternalMyDsl.g:998:3: ( ruleVideoExpression )
                    // InternalMyDsl.g:998:4: ruleVideoExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleVideoExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getVideoExpressionParserRuleCall_0_0_0_0_0_0_1()); 
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
    // $ANTLR end "rule__TextExpression__Alternatives_0_0_0_0_0_0"


    // $ANTLR start "rule__ListExpression__Alternatives"
    // InternalMyDsl.g:1006:1: rule__ListExpression__Alternatives : ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) ) );
    public final void rule__ListExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=13 && LA12_0<=14)||LA12_0==16) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1011:2: ( ( rule__ListExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1011:2: ( ( rule__ListExpression__Group_0__0 ) )
                    // InternalMyDsl.g:1012:3: ( rule__ListExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1013:3: ( rule__ListExpression__Group_0__0 )
                    // InternalMyDsl.g:1013:4: rule__ListExpression__Group_0__0
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
                    // InternalMyDsl.g:1017:2: ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) )
                    {
                    // InternalMyDsl.g:1017:2: ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) )
                    // InternalMyDsl.g:1018:3: ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* )
                    {
                    // InternalMyDsl.g:1018:3: ( ( rule__ListExpression__Group_1__0 ) )
                    // InternalMyDsl.g:1019:4: ( rule__ListExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:1020:4: ( rule__ListExpression__Group_1__0 )
                    // InternalMyDsl.g:1020:5: rule__ListExpression__Group_1__0
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

                    // InternalMyDsl.g:1023:3: ( ( rule__ListExpression__Group_1__0 )* )
                    // InternalMyDsl.g:1024:4: ( rule__ListExpression__Group_1__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:1025:4: ( rule__ListExpression__Group_1__0 )*
                    loop11:
                    do {
                        int alt11=2;
                        alt11 = dfa11.predict(input);
                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:1025:5: rule__ListExpression__Group_1__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__ListExpression__Group_1__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
    // InternalMyDsl.g:1034:1: rule__ListExpression__Alternatives_0_1_0 : ( ( '*' ) | ( '-' ) | ( '+' ) );
    public final void rule__ListExpression__Alternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1038:1: ( ( '*' ) | ( '-' ) | ( '+' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt13=1;
                }
                break;
            case 13:
                {
                alt13=2;
                }
                break;
            case 16:
                {
                alt13=3;
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
                    // InternalMyDsl.g:1039:2: ( '*' )
                    {
                    // InternalMyDsl.g:1039:2: ( '*' )
                    // InternalMyDsl.g:1040:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getAsteriskKeyword_0_1_0_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getAsteriskKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1045:2: ( '-' )
                    {
                    // InternalMyDsl.g:1045:2: ( '-' )
                    // InternalMyDsl.g:1046:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getHyphenMinusKeyword_0_1_0_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getHyphenMinusKeyword_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1051:2: ( '+' )
                    {
                    // InternalMyDsl.g:1051:2: ( '+' )
                    // InternalMyDsl.g:1052:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getPlusSignKeyword_0_1_0_2()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:1061:1: rule__HeaderExpression__Alternatives : ( ( ruleHeader1Expression ) | ( ruleHeader2Expression ) | ( ruleHeader3Expression ) | ( ruleHeader4Expression ) | ( ruleHeader5Expression ) | ( ruleHeader6Expression ) );
    public final void rule__HeaderExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1065:1: ( ( ruleHeader1Expression ) | ( ruleHeader2Expression ) | ( ruleHeader3Expression ) | ( ruleHeader4Expression ) | ( ruleHeader5Expression ) | ( ruleHeader6Expression ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            case 34:
                {
                alt14=6;
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
                    // InternalMyDsl.g:1066:2: ( ruleHeader1Expression )
                    {
                    // InternalMyDsl.g:1066:2: ( ruleHeader1Expression )
                    // InternalMyDsl.g:1067:3: ruleHeader1Expression
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
                    // InternalMyDsl.g:1072:2: ( ruleHeader2Expression )
                    {
                    // InternalMyDsl.g:1072:2: ( ruleHeader2Expression )
                    // InternalMyDsl.g:1073:3: ruleHeader2Expression
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
                    // InternalMyDsl.g:1078:2: ( ruleHeader3Expression )
                    {
                    // InternalMyDsl.g:1078:2: ( ruleHeader3Expression )
                    // InternalMyDsl.g:1079:3: ruleHeader3Expression
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
                    // InternalMyDsl.g:1084:2: ( ruleHeader4Expression )
                    {
                    // InternalMyDsl.g:1084:2: ( ruleHeader4Expression )
                    // InternalMyDsl.g:1085:3: ruleHeader4Expression
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
                    // InternalMyDsl.g:1090:2: ( ruleHeader5Expression )
                    {
                    // InternalMyDsl.g:1090:2: ( ruleHeader5Expression )
                    // InternalMyDsl.g:1091:3: ruleHeader5Expression
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
                    // InternalMyDsl.g:1096:2: ( ruleHeader6Expression )
                    {
                    // InternalMyDsl.g:1096:2: ( ruleHeader6Expression )
                    // InternalMyDsl.g:1097:3: ruleHeader6Expression
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
    // InternalMyDsl.g:1106:1: rule__EmphasisExpression__Alternatives : ( ( ( rule__EmphasisExpression__Group_0__0 ) ) | ( ( rule__EmphasisExpression__CAssignment_1 ) ) );
    public final void rule__EmphasisExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( ( ( rule__EmphasisExpression__Group_0__0 ) ) | ( ( rule__EmphasisExpression__CAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14||(LA15_0>=35 && LA15_0<=36)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||LA15_0==13||(LA15_0>=17 && LA15_0<=19)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1111:2: ( ( rule__EmphasisExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1111:2: ( ( rule__EmphasisExpression__Group_0__0 ) )
                    // InternalMyDsl.g:1112:3: ( rule__EmphasisExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1113:3: ( rule__EmphasisExpression__Group_0__0 )
                    // InternalMyDsl.g:1113:4: rule__EmphasisExpression__Group_0__0
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
                    // InternalMyDsl.g:1117:2: ( ( rule__EmphasisExpression__CAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1117:2: ( ( rule__EmphasisExpression__CAssignment_1 ) )
                    // InternalMyDsl.g:1118:3: ( rule__EmphasisExpression__CAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_1()); 
                    }
                    // InternalMyDsl.g:1119:3: ( rule__EmphasisExpression__CAssignment_1 )
                    // InternalMyDsl.g:1119:4: rule__EmphasisExpression__CAssignment_1
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
    // InternalMyDsl.g:1127:1: rule__EmphasisExpression__Alternatives_0_0 : ( ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) ) );
    public final void rule__EmphasisExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 14:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1132:2: ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) )
                    {
                    // InternalMyDsl.g:1132:2: ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) )
                    // InternalMyDsl.g:1133:3: ( rule__EmphasisExpression__CAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_0()); 
                    }
                    // InternalMyDsl.g:1134:3: ( rule__EmphasisExpression__CAssignment_0_0_0 )
                    // InternalMyDsl.g:1134:4: rule__EmphasisExpression__CAssignment_0_0_0
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
                    // InternalMyDsl.g:1138:2: ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) )
                    {
                    // InternalMyDsl.g:1138:2: ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) )
                    // InternalMyDsl.g:1139:3: ( rule__EmphasisExpression__CAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_1()); 
                    }
                    // InternalMyDsl.g:1140:3: ( rule__EmphasisExpression__CAssignment_0_0_1 )
                    // InternalMyDsl.g:1140:4: rule__EmphasisExpression__CAssignment_0_0_1
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
                    // InternalMyDsl.g:1144:2: ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) )
                    {
                    // InternalMyDsl.g:1144:2: ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) )
                    // InternalMyDsl.g:1145:3: ( rule__EmphasisExpression__CAssignment_0_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_2()); 
                    }
                    // InternalMyDsl.g:1146:3: ( rule__EmphasisExpression__CAssignment_0_0_2 )
                    // InternalMyDsl.g:1146:4: rule__EmphasisExpression__CAssignment_0_0_2
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
    // InternalMyDsl.g:1154:1: rule__Content__Alternatives : ( ( ( rule__Content__Group_0__0 ) ) | ( '\\'' ) | ( '-' ) | ( '|' ) | ( '\"' ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( ( ( rule__Content__Group_0__0 ) ) | ( '\\'' ) | ( '-' ) | ( '|' ) | ( '\"' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case 17:
                {
                alt17=2;
                }
                break;
            case 13:
                {
                alt17=3;
                }
                break;
            case 18:
                {
                alt17=4;
                }
                break;
            case 19:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1159:2: ( ( rule__Content__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1159:2: ( ( rule__Content__Group_0__0 ) )
                    // InternalMyDsl.g:1160:3: ( rule__Content__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1161:3: ( rule__Content__Group_0__0 )
                    // InternalMyDsl.g:1161:4: rule__Content__Group_0__0
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
                    // InternalMyDsl.g:1165:2: ( '\\'' )
                    {
                    // InternalMyDsl.g:1165:2: ( '\\'' )
                    // InternalMyDsl.g:1166:3: '\\''
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getApostropheKeyword_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getApostropheKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1171:2: ( '-' )
                    {
                    // InternalMyDsl.g:1171:2: ( '-' )
                    // InternalMyDsl.g:1172:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getHyphenMinusKeyword_2()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getHyphenMinusKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1177:2: ( '|' )
                    {
                    // InternalMyDsl.g:1177:2: ( '|' )
                    // InternalMyDsl.g:1178:3: '|'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getVerticalLineKeyword_3()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getVerticalLineKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1183:2: ( '\"' )
                    {
                    // InternalMyDsl.g:1183:2: ( '\"' )
                    // InternalMyDsl.g:1184:3: '\"'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getQuotationMarkKeyword_4()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:1193:1: rule__Content__Alternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__Content__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case RULE_STRING:
                {
                alt18=2;
                }
                break;
            case RULE_INT:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1198:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1198:2: ( RULE_ID )
                    // InternalMyDsl.g:1199:3: RULE_ID
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
                    // InternalMyDsl.g:1204:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1204:2: ( RULE_STRING )
                    // InternalMyDsl.g:1205:3: RULE_STRING
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
                    // InternalMyDsl.g:1210:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1210:2: ( RULE_INT )
                    // InternalMyDsl.g:1211:3: RULE_INT
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
    // InternalMyDsl.g:1220:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalMyDsl.g:1225:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalMyDsl.g:1232:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1236:1: ( ( () ) )
            // InternalMyDsl.g:1237:1: ( () )
            {
            // InternalMyDsl.g:1237:1: ( () )
            // InternalMyDsl.g:1238:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalMyDsl.g:1239:2: ()
            // InternalMyDsl.g:1239:3: 
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
    // InternalMyDsl.g:1247:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( rule__File__Group__1__Impl )
            // InternalMyDsl.g:1252:2: rule__File__Group__1__Impl
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
    // InternalMyDsl.g:1258:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalMyDsl.g:1263:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalMyDsl.g:1263:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalMyDsl.g:1264:2: ( rule__File__ExpressionAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            }
            // InternalMyDsl.g:1265:2: ( rule__File__ExpressionAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_BL)||(LA19_0>=13 && LA19_0<=19)||(LA19_0>=21 && LA19_0<=22)||(LA19_0>=26 && LA19_0<=27)||(LA19_0>=29 && LA19_0<=36)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1265:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalMyDsl.g:1274:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1278:1: ( rule__Expression__Group_0__0__Impl )
            // InternalMyDsl.g:1279:2: rule__Expression__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalMyDsl.g:1285:1: rule__Expression__Group_0__0__Impl : ( ( rule__Expression__Alternatives_0_0 ) ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1289:1: ( ( ( rule__Expression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:1290:1: ( ( rule__Expression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:1290:1: ( ( rule__Expression__Alternatives_0_0 ) )
            // InternalMyDsl.g:1291:2: ( rule__Expression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:1292:2: ( rule__Expression__Alternatives_0_0 )
            // InternalMyDsl.g:1292:3: rule__Expression__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0_0_3__0"
    // InternalMyDsl.g:1301:1: rule__Expression__Group_0_0_3__0 : rule__Expression__Group_0_0_3__0__Impl rule__Expression__Group_0_0_3__1 ;
    public final void rule__Expression__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( rule__Expression__Group_0_0_3__0__Impl rule__Expression__Group_0_0_3__1 )
            // InternalMyDsl.g:1306:2: rule__Expression__Group_0_0_3__0__Impl rule__Expression__Group_0_0_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_0_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0_0_3__0"


    // $ANTLR start "rule__Expression__Group_0_0_3__0__Impl"
    // InternalMyDsl.g:1313:1: rule__Expression__Group_0_0_3__0__Impl : ( ( rule__Expression__CAssignment_0_0_3_0 ) ) ;
    public final void rule__Expression__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1317:1: ( ( ( rule__Expression__CAssignment_0_0_3_0 ) ) )
            // InternalMyDsl.g:1318:1: ( ( rule__Expression__CAssignment_0_0_3_0 ) )
            {
            // InternalMyDsl.g:1318:1: ( ( rule__Expression__CAssignment_0_0_3_0 ) )
            // InternalMyDsl.g:1319:2: ( rule__Expression__CAssignment_0_0_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCAssignment_0_0_3_0()); 
            }
            // InternalMyDsl.g:1320:2: ( rule__Expression__CAssignment_0_0_3_0 )
            // InternalMyDsl.g:1320:3: rule__Expression__CAssignment_0_0_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__CAssignment_0_0_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCAssignment_0_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0_0_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_0_0_3__1"
    // InternalMyDsl.g:1328:1: rule__Expression__Group_0_0_3__1 : rule__Expression__Group_0_0_3__1__Impl ;
    public final void rule__Expression__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( rule__Expression__Group_0_0_3__1__Impl )
            // InternalMyDsl.g:1333:2: rule__Expression__Group_0_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0_0_3__1"


    // $ANTLR start "rule__Expression__Group_0_0_3__1__Impl"
    // InternalMyDsl.g:1339:1: rule__Expression__Group_0_0_3__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1343:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1344:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1344:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1345:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_3_1()); 
            }
            // InternalMyDsl.g:1346:2: ( RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred37_InternalMyDsl()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1346:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0_0_3__1__Impl"


    // $ANTLR start "rule__Expression__Group_0_0_4__0"
    // InternalMyDsl.g:1355:1: rule__Expression__Group_0_0_4__0 : rule__Expression__Group_0_0_4__0__Impl rule__Expression__Group_0_0_4__1 ;
    public final void rule__Expression__Group_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( rule__Expression__Group_0_0_4__0__Impl rule__Expression__Group_0_0_4__1 )
            // InternalMyDsl.g:1360:2: rule__Expression__Group_0_0_4__0__Impl rule__Expression__Group_0_0_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_0_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0_0_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0_0_4__0"


    // $ANTLR start "rule__Expression__Group_0_0_4__0__Impl"
    // InternalMyDsl.g:1367:1: rule__Expression__Group_0_0_4__0__Impl : ( ( rule__Expression__CAssignment_0_0_4_0 ) ) ;
    public final void rule__Expression__Group_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1371:1: ( ( ( rule__Expression__CAssignment_0_0_4_0 ) ) )
            // InternalMyDsl.g:1372:1: ( ( rule__Expression__CAssignment_0_0_4_0 ) )
            {
            // InternalMyDsl.g:1372:1: ( ( rule__Expression__CAssignment_0_0_4_0 ) )
            // InternalMyDsl.g:1373:2: ( rule__Expression__CAssignment_0_0_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCAssignment_0_0_4_0()); 
            }
            // InternalMyDsl.g:1374:2: ( rule__Expression__CAssignment_0_0_4_0 )
            // InternalMyDsl.g:1374:3: rule__Expression__CAssignment_0_0_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__CAssignment_0_0_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCAssignment_0_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0_0_4__0__Impl"


    // $ANTLR start "rule__Expression__Group_0_0_4__1"
    // InternalMyDsl.g:1382:1: rule__Expression__Group_0_0_4__1 : rule__Expression__Group_0_0_4__1__Impl ;
    public final void rule__Expression__Group_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( rule__Expression__Group_0_0_4__1__Impl )
            // InternalMyDsl.g:1387:2: rule__Expression__Group_0_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0_0_4__1"


    // $ANTLR start "rule__Expression__Group_0_0_4__1__Impl"
    // InternalMyDsl.g:1393:1: rule__Expression__Group_0_0_4__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1397:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1398:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1398:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1399:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_4_1()); 
            }
            // InternalMyDsl.g:1400:2: ( RULE_BL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_BL) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred38_InternalMyDsl()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1400:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0_0_4__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMyDsl.g:1409:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMyDsl.g:1414:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalMyDsl.g:1421:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__CAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( ( ( rule__Expression__CAssignment_1_0 ) ) )
            // InternalMyDsl.g:1426:1: ( ( rule__Expression__CAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1426:1: ( ( rule__Expression__CAssignment_1_0 ) )
            // InternalMyDsl.g:1427:2: ( rule__Expression__CAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCAssignment_1_0()); 
            }
            // InternalMyDsl.g:1428:2: ( rule__Expression__CAssignment_1_0 )
            // InternalMyDsl.g:1428:3: rule__Expression__CAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__CAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCAssignment_1_0()); 
            }

            }


            }

        }
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
    // InternalMyDsl.g:1436:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( rule__Expression__Group_1__1__Impl )
            // InternalMyDsl.g:1441:2: rule__Expression__Group_1__1__Impl
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
    // InternalMyDsl.g:1447:1: rule__Expression__Group_1__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1451:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1452:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1452:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1453:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1_1()); 
            }
            // InternalMyDsl.g:1454:2: ( RULE_BL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BL) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred39_InternalMyDsl()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1454:3: RULE_BL
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
    // InternalMyDsl.g:1463:1: rule__BreakLineExpression__Group__0 : rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1 ;
    public final void rule__BreakLineExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1 )
            // InternalMyDsl.g:1468:2: rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1475:1: rule__BreakLineExpression__Group__0__Impl : ( () ) ;
    public final void rule__BreakLineExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( ( () ) )
            // InternalMyDsl.g:1480:1: ( () )
            {
            // InternalMyDsl.g:1480:1: ( () )
            // InternalMyDsl.g:1481:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionAction_0()); 
            }
            // InternalMyDsl.g:1482:2: ()
            // InternalMyDsl.g:1482:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionAction_0()); 
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
    // InternalMyDsl.g:1490:1: rule__BreakLineExpression__Group__1 : rule__BreakLineExpression__Group__1__Impl ;
    public final void rule__BreakLineExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( rule__BreakLineExpression__Group__1__Impl )
            // InternalMyDsl.g:1495:2: rule__BreakLineExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BreakLineExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalMyDsl.g:1501:1: rule__BreakLineExpression__Group__1__Impl : ( RULE_BL ) ;
    public final void rule__BreakLineExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1505:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:1506:1: ( RULE_BL )
            {
            // InternalMyDsl.g:1506:1: ( RULE_BL )
            // InternalMyDsl.g:1507:2: RULE_BL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getBLTerminalRuleCall_1()); 
            }
            match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakLineExpressionAccess().getBLTerminalRuleCall_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__HorizontalExpression__Group__0"
    // InternalMyDsl.g:1517:1: rule__HorizontalExpression__Group__0 : rule__HorizontalExpression__Group__0__Impl rule__HorizontalExpression__Group__1 ;
    public final void rule__HorizontalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( rule__HorizontalExpression__Group__0__Impl rule__HorizontalExpression__Group__1 )
            // InternalMyDsl.g:1522:2: rule__HorizontalExpression__Group__0__Impl rule__HorizontalExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__HorizontalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group__0"


    // $ANTLR start "rule__HorizontalExpression__Group__0__Impl"
    // InternalMyDsl.g:1529:1: rule__HorizontalExpression__Group__0__Impl : ( () ) ;
    public final void rule__HorizontalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( () ) )
            // InternalMyDsl.g:1534:1: ( () )
            {
            // InternalMyDsl.g:1534:1: ( () )
            // InternalMyDsl.g:1535:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHorizontalExpressionAction_0()); 
            }
            // InternalMyDsl.g:1536:2: ()
            // InternalMyDsl.g:1536:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHorizontalExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group__0__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group__1"
    // InternalMyDsl.g:1544:1: rule__HorizontalExpression__Group__1 : rule__HorizontalExpression__Group__1__Impl rule__HorizontalExpression__Group__2 ;
    public final void rule__HorizontalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( rule__HorizontalExpression__Group__1__Impl rule__HorizontalExpression__Group__2 )
            // InternalMyDsl.g:1549:2: rule__HorizontalExpression__Group__1__Impl rule__HorizontalExpression__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__HorizontalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group__1"


    // $ANTLR start "rule__HorizontalExpression__Group__1__Impl"
    // InternalMyDsl.g:1556:1: rule__HorizontalExpression__Group__1__Impl : ( ( rule__HorizontalExpression__Alternatives_1 ) ) ;
    public final void rule__HorizontalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( ( ( rule__HorizontalExpression__Alternatives_1 ) ) )
            // InternalMyDsl.g:1561:1: ( ( rule__HorizontalExpression__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1561:1: ( ( rule__HorizontalExpression__Alternatives_1 ) )
            // InternalMyDsl.g:1562:2: ( rule__HorizontalExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAlternatives_1()); 
            }
            // InternalMyDsl.g:1563:2: ( rule__HorizontalExpression__Alternatives_1 )
            // InternalMyDsl.g:1563:3: rule__HorizontalExpression__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group__1__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group__2"
    // InternalMyDsl.g:1571:1: rule__HorizontalExpression__Group__2 : rule__HorizontalExpression__Group__2__Impl rule__HorizontalExpression__Group__3 ;
    public final void rule__HorizontalExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( rule__HorizontalExpression__Group__2__Impl rule__HorizontalExpression__Group__3 )
            // InternalMyDsl.g:1576:2: rule__HorizontalExpression__Group__2__Impl rule__HorizontalExpression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__HorizontalExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group__2"


    // $ANTLR start "rule__HorizontalExpression__Group__2__Impl"
    // InternalMyDsl.g:1583:1: rule__HorizontalExpression__Group__2__Impl : ( ( rule__HorizontalExpression__Alternatives_2 ) ) ;
    public final void rule__HorizontalExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1587:1: ( ( ( rule__HorizontalExpression__Alternatives_2 ) ) )
            // InternalMyDsl.g:1588:1: ( ( rule__HorizontalExpression__Alternatives_2 ) )
            {
            // InternalMyDsl.g:1588:1: ( ( rule__HorizontalExpression__Alternatives_2 ) )
            // InternalMyDsl.g:1589:2: ( rule__HorizontalExpression__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAlternatives_2()); 
            }
            // InternalMyDsl.g:1590:2: ( rule__HorizontalExpression__Alternatives_2 )
            // InternalMyDsl.g:1590:3: rule__HorizontalExpression__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group__2__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group__3"
    // InternalMyDsl.g:1598:1: rule__HorizontalExpression__Group__3 : rule__HorizontalExpression__Group__3__Impl ;
    public final void rule__HorizontalExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( rule__HorizontalExpression__Group__3__Impl )
            // InternalMyDsl.g:1603:2: rule__HorizontalExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group__3"


    // $ANTLR start "rule__HorizontalExpression__Group__3__Impl"
    // InternalMyDsl.g:1609:1: rule__HorizontalExpression__Group__3__Impl : ( ( ( rule__HorizontalExpression__Alternatives_3 ) ) ( ( rule__HorizontalExpression__Alternatives_3 )* ) ) ;
    public final void rule__HorizontalExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1613:1: ( ( ( ( rule__HorizontalExpression__Alternatives_3 ) ) ( ( rule__HorizontalExpression__Alternatives_3 )* ) ) )
            // InternalMyDsl.g:1614:1: ( ( ( rule__HorizontalExpression__Alternatives_3 ) ) ( ( rule__HorizontalExpression__Alternatives_3 )* ) )
            {
            // InternalMyDsl.g:1614:1: ( ( ( rule__HorizontalExpression__Alternatives_3 ) ) ( ( rule__HorizontalExpression__Alternatives_3 )* ) )
            // InternalMyDsl.g:1615:2: ( ( rule__HorizontalExpression__Alternatives_3 ) ) ( ( rule__HorizontalExpression__Alternatives_3 )* )
            {
            // InternalMyDsl.g:1615:2: ( ( rule__HorizontalExpression__Alternatives_3 ) )
            // InternalMyDsl.g:1616:3: ( rule__HorizontalExpression__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAlternatives_3()); 
            }
            // InternalMyDsl.g:1617:3: ( rule__HorizontalExpression__Alternatives_3 )
            // InternalMyDsl.g:1617:4: rule__HorizontalExpression__Alternatives_3
            {
            pushFollow(FOLLOW_9);
            rule__HorizontalExpression__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getAlternatives_3()); 
            }

            }

            // InternalMyDsl.g:1620:2: ( ( rule__HorizontalExpression__Alternatives_3 )* )
            // InternalMyDsl.g:1621:3: ( rule__HorizontalExpression__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAlternatives_3()); 
            }
            // InternalMyDsl.g:1622:3: ( rule__HorizontalExpression__Alternatives_3 )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1622:4: rule__HorizontalExpression__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__HorizontalExpression__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group__3__Impl"


    // $ANTLR start "rule__TextExpression__Group_0__0"
    // InternalMyDsl.g:1632:1: rule__TextExpression__Group_0__0 : rule__TextExpression__Group_0__0__Impl ;
    public final void rule__TextExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( rule__TextExpression__Group_0__0__Impl )
            // InternalMyDsl.g:1637:2: rule__TextExpression__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group_0__0"


    // $ANTLR start "rule__TextExpression__Group_0__0__Impl"
    // InternalMyDsl.g:1643:1: rule__TextExpression__Group_0__0__Impl : ( ( rule__TextExpression__Alternatives_0_0 ) ) ;
    public final void rule__TextExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( ( ( rule__TextExpression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:1648:1: ( ( rule__TextExpression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:1648:1: ( ( rule__TextExpression__Alternatives_0_0 ) )
            // InternalMyDsl.g:1649:2: ( rule__TextExpression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:1650:2: ( rule__TextExpression__Alternatives_0_0 )
            // InternalMyDsl.g:1650:3: rule__TextExpression__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TextExpression__Group_0_0_0__0"
    // InternalMyDsl.g:1659:1: rule__TextExpression__Group_0_0_0__0 : rule__TextExpression__Group_0_0_0__0__Impl ;
    public final void rule__TextExpression__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( rule__TextExpression__Group_0_0_0__0__Impl )
            // InternalMyDsl.g:1664:2: rule__TextExpression__Group_0_0_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Group_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group_0_0_0__0"


    // $ANTLR start "rule__TextExpression__Group_0_0_0__0__Impl"
    // InternalMyDsl.g:1670:1: rule__TextExpression__Group_0_0_0__0__Impl : ( ( rule__TextExpression__Alternatives_0_0_0_0 ) ) ;
    public final void rule__TextExpression__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( ( ( rule__TextExpression__Alternatives_0_0_0_0 ) ) )
            // InternalMyDsl.g:1675:1: ( ( rule__TextExpression__Alternatives_0_0_0_0 ) )
            {
            // InternalMyDsl.g:1675:1: ( ( rule__TextExpression__Alternatives_0_0_0_0 ) )
            // InternalMyDsl.g:1676:2: ( rule__TextExpression__Alternatives_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives_0_0_0_0()); 
            }
            // InternalMyDsl.g:1677:2: ( rule__TextExpression__Alternatives_0_0_0_0 )
            // InternalMyDsl.g:1677:3: rule__TextExpression__Alternatives_0_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Alternatives_0_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getAlternatives_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group_0_0_0__0__Impl"


    // $ANTLR start "rule__TextExpression__Group_0_0_0_0_0__0"
    // InternalMyDsl.g:1686:1: rule__TextExpression__Group_0_0_0_0_0__0 : rule__TextExpression__Group_0_0_0_0_0__0__Impl ;
    public final void rule__TextExpression__Group_0_0_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( rule__TextExpression__Group_0_0_0_0_0__0__Impl )
            // InternalMyDsl.g:1691:2: rule__TextExpression__Group_0_0_0_0_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Group_0_0_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group_0_0_0_0_0__0"


    // $ANTLR start "rule__TextExpression__Group_0_0_0_0_0__0__Impl"
    // InternalMyDsl.g:1697:1: rule__TextExpression__Group_0_0_0_0_0__0__Impl : ( ( rule__TextExpression__Alternatives_0_0_0_0_0_0 ) ) ;
    public final void rule__TextExpression__Group_0_0_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1701:1: ( ( ( rule__TextExpression__Alternatives_0_0_0_0_0_0 ) ) )
            // InternalMyDsl.g:1702:1: ( ( rule__TextExpression__Alternatives_0_0_0_0_0_0 ) )
            {
            // InternalMyDsl.g:1702:1: ( ( rule__TextExpression__Alternatives_0_0_0_0_0_0 ) )
            // InternalMyDsl.g:1703:2: ( rule__TextExpression__Alternatives_0_0_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives_0_0_0_0_0_0()); 
            }
            // InternalMyDsl.g:1704:2: ( rule__TextExpression__Alternatives_0_0_0_0_0_0 )
            // InternalMyDsl.g:1704:3: rule__TextExpression__Alternatives_0_0_0_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TextExpression__Alternatives_0_0_0_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getAlternatives_0_0_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group_0_0_0_0_0__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_0__0"
    // InternalMyDsl.g:1713:1: rule__ListExpression__Group_0__0 : rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 ;
    public final void rule__ListExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 )
            // InternalMyDsl.g:1718:2: rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1725:1: rule__ListExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( ( () ) )
            // InternalMyDsl.g:1730:1: ( () )
            {
            // InternalMyDsl.g:1730:1: ( () )
            // InternalMyDsl.g:1731:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getListExpressionAction_0_0()); 
            }
            // InternalMyDsl.g:1732:2: ()
            // InternalMyDsl.g:1732:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getListExpressionAction_0_0()); 
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
    // InternalMyDsl.g:1740:1: rule__ListExpression__Group_0__1 : rule__ListExpression__Group_0__1__Impl ;
    public final void rule__ListExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( rule__ListExpression__Group_0__1__Impl )
            // InternalMyDsl.g:1745:2: rule__ListExpression__Group_0__1__Impl
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
    // InternalMyDsl.g:1751:1: rule__ListExpression__Group_0__1__Impl : ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) ) ;
    public final void rule__ListExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1755:1: ( ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) ) )
            // InternalMyDsl.g:1756:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) )
            {
            // InternalMyDsl.g:1756:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) )
            // InternalMyDsl.g:1757:2: ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* )
            {
            // InternalMyDsl.g:1757:2: ( ( rule__ListExpression__Group_0_1__0 ) )
            // InternalMyDsl.g:1758:3: ( rule__ListExpression__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:1759:3: ( rule__ListExpression__Group_0_1__0 )
            // InternalMyDsl.g:1759:4: rule__ListExpression__Group_0_1__0
            {
            pushFollow(FOLLOW_11);
            rule__ListExpression__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }

            }

            // InternalMyDsl.g:1762:2: ( ( rule__ListExpression__Group_0_1__0 )* )
            // InternalMyDsl.g:1763:3: ( rule__ListExpression__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:1764:3: ( rule__ListExpression__Group_0_1__0 )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1764:4: rule__ListExpression__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ListExpression__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMyDsl.g:1774:1: rule__ListExpression__Group_0_1__0 : rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 ;
    public final void rule__ListExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 )
            // InternalMyDsl.g:1779:2: rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1786:1: rule__ListExpression__Group_0_1__0__Impl : ( ( rule__ListExpression__Alternatives_0_1_0 ) ) ;
    public final void rule__ListExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( ( ( rule__ListExpression__Alternatives_0_1_0 ) ) )
            // InternalMyDsl.g:1791:1: ( ( rule__ListExpression__Alternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:1791:1: ( ( rule__ListExpression__Alternatives_0_1_0 ) )
            // InternalMyDsl.g:1792:2: ( rule__ListExpression__Alternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAlternatives_0_1_0()); 
            }
            // InternalMyDsl.g:1793:2: ( rule__ListExpression__Alternatives_0_1_0 )
            // InternalMyDsl.g:1793:3: rule__ListExpression__Alternatives_0_1_0
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
    // InternalMyDsl.g:1801:1: rule__ListExpression__Group_0_1__1 : rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2 ;
    public final void rule__ListExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2 )
            // InternalMyDsl.g:1806:2: rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1813:1: rule__ListExpression__Group_0_1__1__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__ListExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1817:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // InternalMyDsl.g:1818:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // InternalMyDsl.g:1818:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // InternalMyDsl.g:1819:2: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // InternalMyDsl.g:1819:2: ( ( RULE_WS ) )
            // InternalMyDsl.g:1820:3: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }
            // InternalMyDsl.g:1821:3: ( RULE_WS )
            // InternalMyDsl.g:1821:4: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }

            }

            // InternalMyDsl.g:1824:2: ( ( RULE_WS )* )
            // InternalMyDsl.g:1825:3: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }
            // InternalMyDsl.g:1826:3: ( RULE_WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1826:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
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
    // $ANTLR end "rule__ListExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_0_1__2"
    // InternalMyDsl.g:1835:1: rule__ListExpression__Group_0_1__2 : rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3 ;
    public final void rule__ListExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1839:1: ( rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3 )
            // InternalMyDsl.g:1840:2: rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3
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
    // InternalMyDsl.g:1847:1: rule__ListExpression__Group_0_1__2__Impl : ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) ) ;
    public final void rule__ListExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) ) )
            // InternalMyDsl.g:1852:1: ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) )
            {
            // InternalMyDsl.g:1852:1: ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) )
            // InternalMyDsl.g:1853:2: ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentUnorderedAssignment_0_1_2()); 
            }
            // InternalMyDsl.g:1854:2: ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 )
            // InternalMyDsl.g:1854:3: rule__ListExpression__ContentUnorderedAssignment_0_1_2
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
    // InternalMyDsl.g:1862:1: rule__ListExpression__Group_0_1__3 : rule__ListExpression__Group_0_1__3__Impl ;
    public final void rule__ListExpression__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1866:1: ( rule__ListExpression__Group_0_1__3__Impl )
            // InternalMyDsl.g:1867:2: rule__ListExpression__Group_0_1__3__Impl
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
    // InternalMyDsl.g:1873:1: rule__ListExpression__Group_0_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ListExpression__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1878:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1878:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1879:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_0_1_3()); 
            }
            // InternalMyDsl.g:1880:2: ( RULE_BL )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_BL) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred43_InternalMyDsl()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1880:3: RULE_BL
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
    // InternalMyDsl.g:1889:1: rule__ListExpression__Group_1__0 : rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 ;
    public final void rule__ListExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1893:1: ( rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 )
            // InternalMyDsl.g:1894:2: rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1901:1: rule__ListExpression__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__ListExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1905:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1906:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1906:1: ( RULE_INT )
            // InternalMyDsl.g:1907:2: RULE_INT
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
    // InternalMyDsl.g:1916:1: rule__ListExpression__Group_1__1 : rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2 ;
    public final void rule__ListExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2 )
            // InternalMyDsl.g:1921:2: rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1928:1: rule__ListExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ListExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( ( '.' ) )
            // InternalMyDsl.g:1933:1: ( '.' )
            {
            // InternalMyDsl.g:1933:1: ( '.' )
            // InternalMyDsl.g:1934:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getFullStopKeyword_1_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:1943:1: rule__ListExpression__Group_1__2 : rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3 ;
    public final void rule__ListExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3 )
            // InternalMyDsl.g:1948:2: rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1955:1: rule__ListExpression__Group_1__2__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__ListExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // InternalMyDsl.g:1960:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // InternalMyDsl.g:1960:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // InternalMyDsl.g:1961:2: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // InternalMyDsl.g:1961:2: ( ( RULE_WS ) )
            // InternalMyDsl.g:1962:3: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }
            // InternalMyDsl.g:1963:3: ( RULE_WS )
            // InternalMyDsl.g:1963:4: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }

            }

            // InternalMyDsl.g:1966:2: ( ( RULE_WS )* )
            // InternalMyDsl.g:1967:3: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }
            // InternalMyDsl.g:1968:3: ( RULE_WS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:1968:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
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
    // $ANTLR end "rule__ListExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ListExpression__Group_1__3"
    // InternalMyDsl.g:1977:1: rule__ListExpression__Group_1__3 : rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4 ;
    public final void rule__ListExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4 )
            // InternalMyDsl.g:1982:2: rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4
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
    // InternalMyDsl.g:1989:1: rule__ListExpression__Group_1__3__Impl : ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) ) ;
    public final void rule__ListExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) ) )
            // InternalMyDsl.g:1994:1: ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) )
            {
            // InternalMyDsl.g:1994:1: ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) )
            // InternalMyDsl.g:1995:2: ( rule__ListExpression__ContentOrderedAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentOrderedAssignment_1_3()); 
            }
            // InternalMyDsl.g:1996:2: ( rule__ListExpression__ContentOrderedAssignment_1_3 )
            // InternalMyDsl.g:1996:3: rule__ListExpression__ContentOrderedAssignment_1_3
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
    // InternalMyDsl.g:2004:1: rule__ListExpression__Group_1__4 : rule__ListExpression__Group_1__4__Impl ;
    public final void rule__ListExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( rule__ListExpression__Group_1__4__Impl )
            // InternalMyDsl.g:2009:2: rule__ListExpression__Group_1__4__Impl
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
    // InternalMyDsl.g:2015:1: rule__ListExpression__Group_1__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ListExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:2020:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:2020:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:2021:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_1_4()); 
            }
            // InternalMyDsl.g:2022:2: ( RULE_BL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_BL) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred45_InternalMyDsl()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2022:3: RULE_BL
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
    // InternalMyDsl.g:2031:1: rule__QuoteExpression__Group__0 : rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 ;
    public final void rule__QuoteExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 )
            // InternalMyDsl.g:2036:2: rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2043:1: rule__QuoteExpression__Group__0__Impl : ( () ) ;
    public final void rule__QuoteExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2047:1: ( ( () ) )
            // InternalMyDsl.g:2048:1: ( () )
            {
            // InternalMyDsl.g:2048:1: ( () )
            // InternalMyDsl.g:2049:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getQuoteExpressionAction_0()); 
            }
            // InternalMyDsl.g:2050:2: ()
            // InternalMyDsl.g:2050:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuoteExpressionAccess().getQuoteExpressionAction_0()); 
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
    // InternalMyDsl.g:2058:1: rule__QuoteExpression__Group__1 : rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 ;
    public final void rule__QuoteExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 )
            // InternalMyDsl.g:2063:2: rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2
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
    // InternalMyDsl.g:2070:1: rule__QuoteExpression__Group__1__Impl : ( ( '>' ) ) ;
    public final void rule__QuoteExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( ( ( '>' ) ) )
            // InternalMyDsl.g:2075:1: ( ( '>' ) )
            {
            // InternalMyDsl.g:2075:1: ( ( '>' ) )
            // InternalMyDsl.g:2076:2: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1()); 
            }
            // InternalMyDsl.g:2077:2: ( '>' )
            // InternalMyDsl.g:2077:3: '>'
            {
            match(input,21,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:2085:1: rule__QuoteExpression__Group__2 : rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3 ;
    public final void rule__QuoteExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3 )
            // InternalMyDsl.g:2090:2: rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3
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
    // InternalMyDsl.g:2097:1: rule__QuoteExpression__Group__2__Impl : ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) ) ;
    public final void rule__QuoteExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) ) )
            // InternalMyDsl.g:2102:1: ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) )
            {
            // InternalMyDsl.g:2102:1: ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) )
            // InternalMyDsl.g:2103:2: ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* )
            {
            // InternalMyDsl.g:2103:2: ( ( rule__QuoteExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:2104:3: ( rule__QuoteExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:2105:3: ( rule__QuoteExpression__ContentAssignment_2 )
            // InternalMyDsl.g:2105:4: rule__QuoteExpression__ContentAssignment_2
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

            // InternalMyDsl.g:2108:2: ( ( rule__QuoteExpression__ContentAssignment_2 )* )
            // InternalMyDsl.g:2109:3: ( rule__QuoteExpression__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:2110:3: ( rule__QuoteExpression__ContentAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:2110:4: rule__QuoteExpression__ContentAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QuoteExpression__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalMyDsl.g:2119:1: rule__QuoteExpression__Group__3 : rule__QuoteExpression__Group__3__Impl ;
    public final void rule__QuoteExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( rule__QuoteExpression__Group__3__Impl )
            // InternalMyDsl.g:2124:2: rule__QuoteExpression__Group__3__Impl
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
    // InternalMyDsl.g:2130:1: rule__QuoteExpression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__QuoteExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:2135:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:2135:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:2136:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalMyDsl.g:2137:2: ( RULE_BL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_BL) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred47_InternalMyDsl()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2137:3: RULE_BL
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


    // $ANTLR start "rule__TabExpression__Group__0"
    // InternalMyDsl.g:2146:1: rule__TabExpression__Group__0 : rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1 ;
    public final void rule__TabExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1 )
            // InternalMyDsl.g:2151:2: rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1
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
    // InternalMyDsl.g:2158:1: rule__TabExpression__Group__0__Impl : ( () ) ;
    public final void rule__TabExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( ( () ) )
            // InternalMyDsl.g:2163:1: ( () )
            {
            // InternalMyDsl.g:2163:1: ( () )
            // InternalMyDsl.g:2164:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getTabExpressionAction_0()); 
            }
            // InternalMyDsl.g:2165:2: ()
            // InternalMyDsl.g:2165:3: 
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
    // InternalMyDsl.g:2173:1: rule__TabExpression__Group__1 : rule__TabExpression__Group__1__Impl ;
    public final void rule__TabExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( rule__TabExpression__Group__1__Impl )
            // InternalMyDsl.g:2178:2: rule__TabExpression__Group__1__Impl
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
    // InternalMyDsl.g:2184:1: rule__TabExpression__Group__1__Impl : ( ( rule__TabExpression__Group_1__0 ) ) ;
    public final void rule__TabExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( ( rule__TabExpression__Group_1__0 ) ) )
            // InternalMyDsl.g:2189:1: ( ( rule__TabExpression__Group_1__0 ) )
            {
            // InternalMyDsl.g:2189:1: ( ( rule__TabExpression__Group_1__0 ) )
            // InternalMyDsl.g:2190:2: ( rule__TabExpression__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:2191:2: ( rule__TabExpression__Group_1__0 )
            // InternalMyDsl.g:2191:3: rule__TabExpression__Group_1__0
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
    // InternalMyDsl.g:2200:1: rule__TabExpression__Group_1__0 : rule__TabExpression__Group_1__0__Impl ;
    public final void rule__TabExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( rule__TabExpression__Group_1__0__Impl )
            // InternalMyDsl.g:2205:2: rule__TabExpression__Group_1__0__Impl
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
    // InternalMyDsl.g:2211:1: rule__TabExpression__Group_1__0__Impl : ( ( rule__TabExpression__Group_1_0__0 ) ) ;
    public final void rule__TabExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( ( ( rule__TabExpression__Group_1_0__0 ) ) )
            // InternalMyDsl.g:2216:1: ( ( rule__TabExpression__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:2216:1: ( ( rule__TabExpression__Group_1_0__0 ) )
            // InternalMyDsl.g:2217:2: ( rule__TabExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0()); 
            }
            // InternalMyDsl.g:2218:2: ( rule__TabExpression__Group_1_0__0 )
            // InternalMyDsl.g:2218:3: rule__TabExpression__Group_1_0__0
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
    // InternalMyDsl.g:2227:1: rule__TabExpression__Group_1_0__0 : rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1 ;
    public final void rule__TabExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1 )
            // InternalMyDsl.g:2232:2: rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1
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
    // InternalMyDsl.g:2239:1: rule__TabExpression__Group_1_0__0__Impl : ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) ) ;
    public final void rule__TabExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) ) )
            // InternalMyDsl.g:2244:1: ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) )
            {
            // InternalMyDsl.g:2244:1: ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) )
            // InternalMyDsl.g:2245:2: ( rule__TabExpression__HeaderAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getHeaderAssignment_1_0_0()); 
            }
            // InternalMyDsl.g:2246:2: ( rule__TabExpression__HeaderAssignment_1_0_0 )
            // InternalMyDsl.g:2246:3: rule__TabExpression__HeaderAssignment_1_0_0
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
    // InternalMyDsl.g:2254:1: rule__TabExpression__Group_1_0__1 : rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2 ;
    public final void rule__TabExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2 )
            // InternalMyDsl.g:2259:2: rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2266:1: rule__TabExpression__Group_1_0__1__Impl : ( RULE_BL ) ;
    public final void rule__TabExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:2271:1: ( RULE_BL )
            {
            // InternalMyDsl.g:2271:1: ( RULE_BL )
            // InternalMyDsl.g:2272:2: RULE_BL
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
    // InternalMyDsl.g:2281:1: rule__TabExpression__Group_1_0__2 : rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3 ;
    public final void rule__TabExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3 )
            // InternalMyDsl.g:2286:2: rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3
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
    // InternalMyDsl.g:2293:1: rule__TabExpression__Group_1_0__2__Impl : ( ruleTabSeparation ) ;
    public final void rule__TabExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2297:1: ( ( ruleTabSeparation ) )
            // InternalMyDsl.g:2298:1: ( ruleTabSeparation )
            {
            // InternalMyDsl.g:2298:1: ( ruleTabSeparation )
            // InternalMyDsl.g:2299:2: ruleTabSeparation
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
    // InternalMyDsl.g:2308:1: rule__TabExpression__Group_1_0__3 : rule__TabExpression__Group_1_0__3__Impl ;
    public final void rule__TabExpression__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( rule__TabExpression__Group_1_0__3__Impl )
            // InternalMyDsl.g:2313:2: rule__TabExpression__Group_1_0__3__Impl
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
    // InternalMyDsl.g:2319:1: rule__TabExpression__Group_1_0__3__Impl : ( ( rule__TabExpression__Group_1_0_3__0 )* ) ;
    public final void rule__TabExpression__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( ( ( rule__TabExpression__Group_1_0_3__0 )* ) )
            // InternalMyDsl.g:2324:1: ( ( rule__TabExpression__Group_1_0_3__0 )* )
            {
            // InternalMyDsl.g:2324:1: ( ( rule__TabExpression__Group_1_0_3__0 )* )
            // InternalMyDsl.g:2325:2: ( rule__TabExpression__Group_1_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0_3()); 
            }
            // InternalMyDsl.g:2326:2: ( rule__TabExpression__Group_1_0_3__0 )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:2326:3: rule__TabExpression__Group_1_0_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TabExpression__Group_1_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalMyDsl.g:2335:1: rule__TabExpression__Group_1_0_3__0 : rule__TabExpression__Group_1_0_3__0__Impl ;
    public final void rule__TabExpression__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( rule__TabExpression__Group_1_0_3__0__Impl )
            // InternalMyDsl.g:2340:2: rule__TabExpression__Group_1_0_3__0__Impl
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
    // InternalMyDsl.g:2346:1: rule__TabExpression__Group_1_0_3__0__Impl : ( ( rule__TabExpression__Group_1_0_3_0__0 ) ) ;
    public final void rule__TabExpression__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2350:1: ( ( ( rule__TabExpression__Group_1_0_3_0__0 ) ) )
            // InternalMyDsl.g:2351:1: ( ( rule__TabExpression__Group_1_0_3_0__0 ) )
            {
            // InternalMyDsl.g:2351:1: ( ( rule__TabExpression__Group_1_0_3_0__0 ) )
            // InternalMyDsl.g:2352:2: ( rule__TabExpression__Group_1_0_3_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0_3_0()); 
            }
            // InternalMyDsl.g:2353:2: ( rule__TabExpression__Group_1_0_3_0__0 )
            // InternalMyDsl.g:2353:3: rule__TabExpression__Group_1_0_3_0__0
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
    // InternalMyDsl.g:2362:1: rule__TabExpression__Group_1_0_3_0__0 : rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1 ;
    public final void rule__TabExpression__Group_1_0_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1 )
            // InternalMyDsl.g:2367:2: rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1
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
    // InternalMyDsl.g:2374:1: rule__TabExpression__Group_1_0_3_0__0__Impl : ( RULE_BL ) ;
    public final void rule__TabExpression__Group_1_0_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:2379:1: ( RULE_BL )
            {
            // InternalMyDsl.g:2379:1: ( RULE_BL )
            // InternalMyDsl.g:2380:2: RULE_BL
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
    // InternalMyDsl.g:2389:1: rule__TabExpression__Group_1_0_3_0__1 : rule__TabExpression__Group_1_0_3_0__1__Impl ;
    public final void rule__TabExpression__Group_1_0_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( rule__TabExpression__Group_1_0_3_0__1__Impl )
            // InternalMyDsl.g:2394:2: rule__TabExpression__Group_1_0_3_0__1__Impl
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
    // InternalMyDsl.g:2400:1: rule__TabExpression__Group_1_0_3_0__1__Impl : ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) ) ;
    public final void rule__TabExpression__Group_1_0_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) ) )
            // InternalMyDsl.g:2405:1: ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) )
            {
            // InternalMyDsl.g:2405:1: ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) )
            // InternalMyDsl.g:2406:2: ( rule__TabExpression__LinesAssignment_1_0_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getLinesAssignment_1_0_3_0_1()); 
            }
            // InternalMyDsl.g:2407:2: ( rule__TabExpression__LinesAssignment_1_0_3_0_1 )
            // InternalMyDsl.g:2407:3: rule__TabExpression__LinesAssignment_1_0_3_0_1
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
    // InternalMyDsl.g:2416:1: rule__TabSeparation__Group__0 : rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1 ;
    public final void rule__TabSeparation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1 )
            // InternalMyDsl.g:2421:2: rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2428:1: rule__TabSeparation__Group__0__Impl : ( ( '|' )? ) ;
    public final void rule__TabSeparation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2433:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2433:1: ( ( '|' )? )
            // InternalMyDsl.g:2434:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_0()); 
            }
            // InternalMyDsl.g:2435:2: ( '|' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2435:3: '|'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:2443:1: rule__TabSeparation__Group__1 : rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2 ;
    public final void rule__TabSeparation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2 )
            // InternalMyDsl.g:2448:2: rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2455:1: rule__TabSeparation__Group__1__Impl : ( '-' ) ;
    public final void rule__TabSeparation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( ( '-' ) )
            // InternalMyDsl.g:2460:1: ( '-' )
            {
            // InternalMyDsl.g:2460:1: ( '-' )
            // InternalMyDsl.g:2461:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:2470:1: rule__TabSeparation__Group__2 : rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3 ;
    public final void rule__TabSeparation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3 )
            // InternalMyDsl.g:2475:2: rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2482:1: rule__TabSeparation__Group__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__TabSeparation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2486:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2487:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2487:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2488:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2488:2: ( ( '-' ) )
            // InternalMyDsl.g:2489:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }
            // InternalMyDsl.g:2490:3: ( '-' )
            // InternalMyDsl.g:2490:4: '-'
            {
            match(input,13,FOLLOW_21); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }

            }

            // InternalMyDsl.g:2493:2: ( ( '-' )* )
            // InternalMyDsl.g:2494:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }
            // InternalMyDsl.g:2495:3: ( '-' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==13) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:2495:4: '-'
            	    {
            	    match(input,13,FOLLOW_21); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalMyDsl.g:2504:1: rule__TabSeparation__Group__3 : rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4 ;
    public final void rule__TabSeparation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2508:1: ( rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4 )
            // InternalMyDsl.g:2509:2: rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2516:1: rule__TabSeparation__Group__3__Impl : ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) ) ;
    public final void rule__TabSeparation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2520:1: ( ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) ) )
            // InternalMyDsl.g:2521:1: ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) )
            {
            // InternalMyDsl.g:2521:1: ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) )
            // InternalMyDsl.g:2522:2: ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* )
            {
            // InternalMyDsl.g:2522:2: ( ( rule__TabSeparation__Group_3__0 ) )
            // InternalMyDsl.g:2523:3: ( rule__TabSeparation__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:2524:3: ( rule__TabSeparation__Group_3__0 )
            // InternalMyDsl.g:2524:4: rule__TabSeparation__Group_3__0
            {
            pushFollow(FOLLOW_22);
            rule__TabSeparation__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }

            }

            // InternalMyDsl.g:2527:2: ( ( rule__TabSeparation__Group_3__0 )* )
            // InternalMyDsl.g:2528:3: ( rule__TabSeparation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:2529:3: ( rule__TabSeparation__Group_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==13) ) {
                        int LA34_3 = input.LA(3);

                        if ( (LA34_3==13) ) {
                            int LA34_4 = input.LA(4);

                            if ( (synpred51_InternalMyDsl()) ) {
                                alt34=1;
                            }


                        }


                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:2529:4: rule__TabSeparation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TabSeparation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalMyDsl.g:2538:1: rule__TabSeparation__Group__4 : rule__TabSeparation__Group__4__Impl ;
    public final void rule__TabSeparation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( rule__TabSeparation__Group__4__Impl )
            // InternalMyDsl.g:2543:2: rule__TabSeparation__Group__4__Impl
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
    // InternalMyDsl.g:2549:1: rule__TabSeparation__Group__4__Impl : ( ( '|' )? ) ;
    public final void rule__TabSeparation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2554:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2554:1: ( ( '|' )? )
            // InternalMyDsl.g:2555:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_4()); 
            }
            // InternalMyDsl.g:2556:2: ( '|' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred52_InternalMyDsl()) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2556:3: '|'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:2565:1: rule__TabSeparation__Group_3__0 : rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1 ;
    public final void rule__TabSeparation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1 )
            // InternalMyDsl.g:2570:2: rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2577:1: rule__TabSeparation__Group_3__0__Impl : ( '|' ) ;
    public final void rule__TabSeparation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( ( '|' ) )
            // InternalMyDsl.g:2582:1: ( '|' )
            {
            // InternalMyDsl.g:2582:1: ( '|' )
            // InternalMyDsl.g:2583:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_3_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:2592:1: rule__TabSeparation__Group_3__1 : rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2 ;
    public final void rule__TabSeparation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2 )
            // InternalMyDsl.g:2597:2: rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2604:1: rule__TabSeparation__Group_3__1__Impl : ( '-' ) ;
    public final void rule__TabSeparation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( ( '-' ) )
            // InternalMyDsl.g:2609:1: ( '-' )
            {
            // InternalMyDsl.g:2609:1: ( '-' )
            // InternalMyDsl.g:2610:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:2619:1: rule__TabSeparation__Group_3__2 : rule__TabSeparation__Group_3__2__Impl ;
    public final void rule__TabSeparation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( rule__TabSeparation__Group_3__2__Impl )
            // InternalMyDsl.g:2624:2: rule__TabSeparation__Group_3__2__Impl
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
    // InternalMyDsl.g:2630:1: rule__TabSeparation__Group_3__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__TabSeparation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2634:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2635:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2635:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2636:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2636:2: ( ( '-' ) )
            // InternalMyDsl.g:2637:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }
            // InternalMyDsl.g:2638:3: ( '-' )
            // InternalMyDsl.g:2638:4: '-'
            {
            match(input,13,FOLLOW_21); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }

            }

            // InternalMyDsl.g:2641:2: ( ( '-' )* )
            // InternalMyDsl.g:2642:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }
            // InternalMyDsl.g:2643:3: ( '-' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==13) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred53_InternalMyDsl()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:2643:4: '-'
            	    {
            	    match(input,13,FOLLOW_21); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalMyDsl.g:2653:1: rule__LineExpression__Group__0 : rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1 ;
    public final void rule__LineExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2657:1: ( rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1 )
            // InternalMyDsl.g:2658:2: rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1
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
    // InternalMyDsl.g:2665:1: rule__LineExpression__Group__0__Impl : ( ( '|' )? ) ;
    public final void rule__LineExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2670:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2670:1: ( ( '|' )? )
            // InternalMyDsl.g:2671:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_0()); 
            }
            // InternalMyDsl.g:2672:2: ( '|' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==18) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred54_InternalMyDsl()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2672:3: '|'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:2680:1: rule__LineExpression__Group__1 : rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2 ;
    public final void rule__LineExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2 )
            // InternalMyDsl.g:2685:2: rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2692:1: rule__LineExpression__Group__1__Impl : ( ( rule__LineExpression__CellsAssignment_1 ) ) ;
    public final void rule__LineExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( ( ( rule__LineExpression__CellsAssignment_1 ) ) )
            // InternalMyDsl.g:2697:1: ( ( rule__LineExpression__CellsAssignment_1 ) )
            {
            // InternalMyDsl.g:2697:1: ( ( rule__LineExpression__CellsAssignment_1 ) )
            // InternalMyDsl.g:2698:2: ( rule__LineExpression__CellsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsAssignment_1()); 
            }
            // InternalMyDsl.g:2699:2: ( rule__LineExpression__CellsAssignment_1 )
            // InternalMyDsl.g:2699:3: rule__LineExpression__CellsAssignment_1
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
    // InternalMyDsl.g:2707:1: rule__LineExpression__Group__2 : rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3 ;
    public final void rule__LineExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2711:1: ( rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3 )
            // InternalMyDsl.g:2712:2: rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2719:1: rule__LineExpression__Group__2__Impl : ( ( rule__LineExpression__Group_2__0 )* ) ;
    public final void rule__LineExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( ( ( rule__LineExpression__Group_2__0 )* ) )
            // InternalMyDsl.g:2724:1: ( ( rule__LineExpression__Group_2__0 )* )
            {
            // InternalMyDsl.g:2724:1: ( ( rule__LineExpression__Group_2__0 )* )
            // InternalMyDsl.g:2725:2: ( rule__LineExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getGroup_2()); 
            }
            // InternalMyDsl.g:2726:2: ( rule__LineExpression__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:2726:3: rule__LineExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__LineExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalMyDsl.g:2734:1: rule__LineExpression__Group__3 : rule__LineExpression__Group__3__Impl ;
    public final void rule__LineExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2738:1: ( rule__LineExpression__Group__3__Impl )
            // InternalMyDsl.g:2739:2: rule__LineExpression__Group__3__Impl
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
    // InternalMyDsl.g:2745:1: rule__LineExpression__Group__3__Impl : ( ( '|' )? ) ;
    public final void rule__LineExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2750:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2750:1: ( ( '|' )? )
            // InternalMyDsl.g:2751:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_3()); 
            }
            // InternalMyDsl.g:2752:2: ( '|' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==18) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred56_InternalMyDsl()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2752:3: '|'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:2761:1: rule__LineExpression__Group_2__0 : rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1 ;
    public final void rule__LineExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2765:1: ( rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1 )
            // InternalMyDsl.g:2766:2: rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1
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
    // InternalMyDsl.g:2773:1: rule__LineExpression__Group_2__0__Impl : ( ( '|' ) ) ;
    public final void rule__LineExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( ( ( '|' ) ) )
            // InternalMyDsl.g:2778:1: ( ( '|' ) )
            {
            // InternalMyDsl.g:2778:1: ( ( '|' ) )
            // InternalMyDsl.g:2779:2: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_2_0()); 
            }
            // InternalMyDsl.g:2780:2: ( '|' )
            // InternalMyDsl.g:2780:3: '|'
            {
            match(input,18,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:2788:1: rule__LineExpression__Group_2__1 : rule__LineExpression__Group_2__1__Impl ;
    public final void rule__LineExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2792:1: ( rule__LineExpression__Group_2__1__Impl )
            // InternalMyDsl.g:2793:2: rule__LineExpression__Group_2__1__Impl
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
    // InternalMyDsl.g:2799:1: rule__LineExpression__Group_2__1__Impl : ( ( rule__LineExpression__CellsAssignment_2_1 ) ) ;
    public final void rule__LineExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( ( ( rule__LineExpression__CellsAssignment_2_1 ) ) )
            // InternalMyDsl.g:2804:1: ( ( rule__LineExpression__CellsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2804:1: ( ( rule__LineExpression__CellsAssignment_2_1 ) )
            // InternalMyDsl.g:2805:2: ( rule__LineExpression__CellsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsAssignment_2_1()); 
            }
            // InternalMyDsl.g:2806:2: ( rule__LineExpression__CellsAssignment_2_1 )
            // InternalMyDsl.g:2806:3: rule__LineExpression__CellsAssignment_2_1
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


    // $ANTLR start "rule__RefExpression__Group__0"
    // InternalMyDsl.g:2815:1: rule__RefExpression__Group__0 : rule__RefExpression__Group__0__Impl rule__RefExpression__Group__1 ;
    public final void rule__RefExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2819:1: ( rule__RefExpression__Group__0__Impl rule__RefExpression__Group__1 )
            // InternalMyDsl.g:2820:2: rule__RefExpression__Group__0__Impl rule__RefExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RefExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__0"


    // $ANTLR start "rule__RefExpression__Group__0__Impl"
    // InternalMyDsl.g:2827:1: rule__RefExpression__Group__0__Impl : ( () ) ;
    public final void rule__RefExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( () ) )
            // InternalMyDsl.g:2832:1: ( () )
            {
            // InternalMyDsl.g:2832:1: ( () )
            // InternalMyDsl.g:2833:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefExpressionAction_0()); 
            }
            // InternalMyDsl.g:2834:2: ()
            // InternalMyDsl.g:2834:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionAccess().getRefExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__0__Impl"


    // $ANTLR start "rule__RefExpression__Group__1"
    // InternalMyDsl.g:2842:1: rule__RefExpression__Group__1 : rule__RefExpression__Group__1__Impl rule__RefExpression__Group__2 ;
    public final void rule__RefExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( rule__RefExpression__Group__1__Impl rule__RefExpression__Group__2 )
            // InternalMyDsl.g:2847:2: rule__RefExpression__Group__1__Impl rule__RefExpression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RefExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__1"


    // $ANTLR start "rule__RefExpression__Group__1__Impl"
    // InternalMyDsl.g:2854:1: rule__RefExpression__Group__1__Impl : ( ( '[' ) ) ;
    public final void rule__RefExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:2859:1: ( ( '[' ) )
            {
            // InternalMyDsl.g:2859:1: ( ( '[' ) )
            // InternalMyDsl.g:2860:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:2861:2: ( '[' )
            // InternalMyDsl.g:2861:3: '['
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__1__Impl"


    // $ANTLR start "rule__RefExpression__Group__2"
    // InternalMyDsl.g:2869:1: rule__RefExpression__Group__2 : rule__RefExpression__Group__2__Impl rule__RefExpression__Group__3 ;
    public final void rule__RefExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2873:1: ( rule__RefExpression__Group__2__Impl rule__RefExpression__Group__3 )
            // InternalMyDsl.g:2874:2: rule__RefExpression__Group__2__Impl rule__RefExpression__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__RefExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__2"


    // $ANTLR start "rule__RefExpression__Group__2__Impl"
    // InternalMyDsl.g:2881:1: rule__RefExpression__Group__2__Impl : ( ( rule__RefExpression__RefNameAssignment_2 ) ) ;
    public final void rule__RefExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( ( ( rule__RefExpression__RefNameAssignment_2 ) ) )
            // InternalMyDsl.g:2886:1: ( ( rule__RefExpression__RefNameAssignment_2 ) )
            {
            // InternalMyDsl.g:2886:1: ( ( rule__RefExpression__RefNameAssignment_2 ) )
            // InternalMyDsl.g:2887:2: ( rule__RefExpression__RefNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefNameAssignment_2()); 
            }
            // InternalMyDsl.g:2888:2: ( rule__RefExpression__RefNameAssignment_2 )
            // InternalMyDsl.g:2888:3: rule__RefExpression__RefNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RefExpression__RefNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionAccess().getRefNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__2__Impl"


    // $ANTLR start "rule__RefExpression__Group__3"
    // InternalMyDsl.g:2896:1: rule__RefExpression__Group__3 : rule__RefExpression__Group__3__Impl rule__RefExpression__Group__4 ;
    public final void rule__RefExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2900:1: ( rule__RefExpression__Group__3__Impl rule__RefExpression__Group__4 )
            // InternalMyDsl.g:2901:2: rule__RefExpression__Group__3__Impl rule__RefExpression__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__RefExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__3"


    // $ANTLR start "rule__RefExpression__Group__3__Impl"
    // InternalMyDsl.g:2908:1: rule__RefExpression__Group__3__Impl : ( ( ']:' ) ) ;
    public final void rule__RefExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( ( ( ']:' ) ) )
            // InternalMyDsl.g:2913:1: ( ( ']:' ) )
            {
            // InternalMyDsl.g:2913:1: ( ( ']:' ) )
            // InternalMyDsl.g:2914:2: ( ']:' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRightSquareBracketColonKeyword_3()); 
            }
            // InternalMyDsl.g:2915:2: ( ']:' )
            // InternalMyDsl.g:2915:3: ']:'
            {
            match(input,23,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionAccess().getRightSquareBracketColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__3__Impl"


    // $ANTLR start "rule__RefExpression__Group__4"
    // InternalMyDsl.g:2923:1: rule__RefExpression__Group__4 : rule__RefExpression__Group__4__Impl rule__RefExpression__Group__5 ;
    public final void rule__RefExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2927:1: ( rule__RefExpression__Group__4__Impl rule__RefExpression__Group__5 )
            // InternalMyDsl.g:2928:2: rule__RefExpression__Group__4__Impl rule__RefExpression__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__RefExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__4"


    // $ANTLR start "rule__RefExpression__Group__4__Impl"
    // InternalMyDsl.g:2935:1: rule__RefExpression__Group__4__Impl : ( ( rule__RefExpression__RefContentAssignment_4 )? ) ;
    public final void rule__RefExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( ( ( rule__RefExpression__RefContentAssignment_4 )? ) )
            // InternalMyDsl.g:2940:1: ( ( rule__RefExpression__RefContentAssignment_4 )? )
            {
            // InternalMyDsl.g:2940:1: ( ( rule__RefExpression__RefContentAssignment_4 )? )
            // InternalMyDsl.g:2941:2: ( rule__RefExpression__RefContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefContentAssignment_4()); 
            }
            // InternalMyDsl.g:2942:2: ( rule__RefExpression__RefContentAssignment_4 )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2942:3: rule__RefExpression__RefContentAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__RefExpression__RefContentAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionAccess().getRefContentAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__4__Impl"


    // $ANTLR start "rule__RefExpression__Group__5"
    // InternalMyDsl.g:2950:1: rule__RefExpression__Group__5 : rule__RefExpression__Group__5__Impl ;
    public final void rule__RefExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2954:1: ( rule__RefExpression__Group__5__Impl )
            // InternalMyDsl.g:2955:2: rule__RefExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__5"


    // $ANTLR start "rule__RefExpression__Group__5__Impl"
    // InternalMyDsl.g:2961:1: rule__RefExpression__Group__5__Impl : ( ( RULE_BL )? ) ;
    public final void rule__RefExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:2966:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:2966:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:2967:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getBLTerminalRuleCall_5()); 
            }
            // InternalMyDsl.g:2968:2: ( RULE_BL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_BL) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred58_InternalMyDsl()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:2968:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionAccess().getBLTerminalRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__Group__5__Impl"


    // $ANTLR start "rule__LinkExpression__Group__0"
    // InternalMyDsl.g:2977:1: rule__LinkExpression__Group__0 : rule__LinkExpression__Group__0__Impl rule__LinkExpression__Group__1 ;
    public final void rule__LinkExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2981:1: ( rule__LinkExpression__Group__0__Impl rule__LinkExpression__Group__1 )
            // InternalMyDsl.g:2982:2: rule__LinkExpression__Group__0__Impl rule__LinkExpression__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2989:1: rule__LinkExpression__Group__0__Impl : ( () ) ;
    public final void rule__LinkExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( ( () ) )
            // InternalMyDsl.g:2994:1: ( () )
            {
            // InternalMyDsl.g:2994:1: ( () )
            // InternalMyDsl.g:2995:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0()); 
            }
            // InternalMyDsl.g:2996:2: ()
            // InternalMyDsl.g:2996:3: 
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
    // InternalMyDsl.g:3004:1: rule__LinkExpression__Group__1 : rule__LinkExpression__Group__1__Impl rule__LinkExpression__Group__2 ;
    public final void rule__LinkExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3008:1: ( rule__LinkExpression__Group__1__Impl rule__LinkExpression__Group__2 )
            // InternalMyDsl.g:3009:2: rule__LinkExpression__Group__1__Impl rule__LinkExpression__Group__2
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
    // InternalMyDsl.g:3016:1: rule__LinkExpression__Group__1__Impl : ( ( '[' ) ) ;
    public final void rule__LinkExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:3021:1: ( ( '[' ) )
            {
            // InternalMyDsl.g:3021:1: ( ( '[' ) )
            // InternalMyDsl.g:3022:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:3023:2: ( '[' )
            // InternalMyDsl.g:3023:3: '['
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3031:1: rule__LinkExpression__Group__2 : rule__LinkExpression__Group__2__Impl rule__LinkExpression__Group__3 ;
    public final void rule__LinkExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3035:1: ( rule__LinkExpression__Group__2__Impl rule__LinkExpression__Group__3 )
            // InternalMyDsl.g:3036:2: rule__LinkExpression__Group__2__Impl rule__LinkExpression__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3043:1: rule__LinkExpression__Group__2__Impl : ( ( rule__LinkExpression__AltTextAssignment_2 ) ) ;
    public final void rule__LinkExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( ( ( rule__LinkExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:3048:1: ( ( rule__LinkExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:3048:1: ( ( rule__LinkExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:3049:2: ( rule__LinkExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:3050:2: ( rule__LinkExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:3050:3: rule__LinkExpression__AltTextAssignment_2
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
    // InternalMyDsl.g:3058:1: rule__LinkExpression__Group__3 : rule__LinkExpression__Group__3__Impl rule__LinkExpression__Group__4 ;
    public final void rule__LinkExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3062:1: ( rule__LinkExpression__Group__3__Impl rule__LinkExpression__Group__4 )
            // InternalMyDsl.g:3063:2: rule__LinkExpression__Group__3__Impl rule__LinkExpression__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3070:1: rule__LinkExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__LinkExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3074:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:3075:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:3075:1: ( ( '](' ) )
            // InternalMyDsl.g:3076:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:3077:2: ( '](' )
            // InternalMyDsl.g:3077:3: ']('
            {
            match(input,24,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3085:1: rule__LinkExpression__Group__4 : rule__LinkExpression__Group__4__Impl rule__LinkExpression__Group__5 ;
    public final void rule__LinkExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3089:1: ( rule__LinkExpression__Group__4__Impl rule__LinkExpression__Group__5 )
            // InternalMyDsl.g:3090:2: rule__LinkExpression__Group__4__Impl rule__LinkExpression__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3097:1: rule__LinkExpression__Group__4__Impl : ( ( rule__LinkExpression__LinkContentAssignment_4 )? ) ;
    public final void rule__LinkExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( ( ( rule__LinkExpression__LinkContentAssignment_4 )? ) )
            // InternalMyDsl.g:3102:1: ( ( rule__LinkExpression__LinkContentAssignment_4 )? )
            {
            // InternalMyDsl.g:3102:1: ( ( rule__LinkExpression__LinkContentAssignment_4 )? )
            // InternalMyDsl.g:3103:2: ( rule__LinkExpression__LinkContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkContentAssignment_4()); 
            }
            // InternalMyDsl.g:3104:2: ( rule__LinkExpression__LinkContentAssignment_4 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INT)||LA42_0==13||(LA42_0>=17 && LA42_0<=19)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:3104:3: rule__LinkExpression__LinkContentAssignment_4
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
    // InternalMyDsl.g:3112:1: rule__LinkExpression__Group__5 : rule__LinkExpression__Group__5__Impl rule__LinkExpression__Group__6 ;
    public final void rule__LinkExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3116:1: ( rule__LinkExpression__Group__5__Impl rule__LinkExpression__Group__6 )
            // InternalMyDsl.g:3117:2: rule__LinkExpression__Group__5__Impl rule__LinkExpression__Group__6
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
    // InternalMyDsl.g:3124:1: rule__LinkExpression__Group__5__Impl : ( ( ')' ) ) ;
    public final void rule__LinkExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:3129:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:3129:1: ( ( ')' ) )
            // InternalMyDsl.g:3130:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:3131:2: ( ')' )
            // InternalMyDsl.g:3131:3: ')'
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3139:1: rule__LinkExpression__Group__6 : rule__LinkExpression__Group__6__Impl ;
    public final void rule__LinkExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3143:1: ( rule__LinkExpression__Group__6__Impl )
            // InternalMyDsl.g:3144:2: rule__LinkExpression__Group__6__Impl
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
    // InternalMyDsl.g:3150:1: rule__LinkExpression__Group__6__Impl : ( ( RULE_BL )? ) ;
    public final void rule__LinkExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3155:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3155:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3156:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_6()); 
            }
            // InternalMyDsl.g:3157:2: ( RULE_BL )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_BL) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred60_InternalMyDsl()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:3157:3: RULE_BL
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
    // InternalMyDsl.g:3166:1: rule__ImageExpression__Group__0 : rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1 ;
    public final void rule__ImageExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3170:1: ( rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1 )
            // InternalMyDsl.g:3171:2: rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3178:1: rule__ImageExpression__Group__0__Impl : ( () ) ;
    public final void rule__ImageExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( ( () ) )
            // InternalMyDsl.g:3183:1: ( () )
            {
            // InternalMyDsl.g:3183:1: ( () )
            // InternalMyDsl.g:3184:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getImageExpressionAction_0()); 
            }
            // InternalMyDsl.g:3185:2: ()
            // InternalMyDsl.g:3185:3: 
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
    // InternalMyDsl.g:3193:1: rule__ImageExpression__Group__1 : rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2 ;
    public final void rule__ImageExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3197:1: ( rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2 )
            // InternalMyDsl.g:3198:2: rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2
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
    // InternalMyDsl.g:3205:1: rule__ImageExpression__Group__1__Impl : ( ( '![' ) ) ;
    public final void rule__ImageExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( ( ( '![' ) ) )
            // InternalMyDsl.g:3210:1: ( ( '![' ) )
            {
            // InternalMyDsl.g:3210:1: ( ( '![' ) )
            // InternalMyDsl.g:3211:2: ( '![' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:3212:2: ( '![' )
            // InternalMyDsl.g:3212:3: '!['
            {
            match(input,26,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3220:1: rule__ImageExpression__Group__2 : rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3 ;
    public final void rule__ImageExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3224:1: ( rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3 )
            // InternalMyDsl.g:3225:2: rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3232:1: rule__ImageExpression__Group__2__Impl : ( ( rule__ImageExpression__AltTextAssignment_2 ) ) ;
    public final void rule__ImageExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( ( ( rule__ImageExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:3237:1: ( ( rule__ImageExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:3237:1: ( ( rule__ImageExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:3238:2: ( rule__ImageExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:3239:2: ( rule__ImageExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:3239:3: rule__ImageExpression__AltTextAssignment_2
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
    // InternalMyDsl.g:3247:1: rule__ImageExpression__Group__3 : rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4 ;
    public final void rule__ImageExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3251:1: ( rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4 )
            // InternalMyDsl.g:3252:2: rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3259:1: rule__ImageExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__ImageExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:3264:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:3264:1: ( ( '](' ) )
            // InternalMyDsl.g:3265:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:3266:2: ( '](' )
            // InternalMyDsl.g:3266:3: ']('
            {
            match(input,24,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3274:1: rule__ImageExpression__Group__4 : rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5 ;
    public final void rule__ImageExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3278:1: ( rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5 )
            // InternalMyDsl.g:3279:2: rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3286:1: rule__ImageExpression__Group__4__Impl : ( ( rule__ImageExpression__LinkContentAssignment_4 )? ) ;
    public final void rule__ImageExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( ( ( rule__ImageExpression__LinkContentAssignment_4 )? ) )
            // InternalMyDsl.g:3291:1: ( ( rule__ImageExpression__LinkContentAssignment_4 )? )
            {
            // InternalMyDsl.g:3291:1: ( ( rule__ImageExpression__LinkContentAssignment_4 )? )
            // InternalMyDsl.g:3292:2: ( rule__ImageExpression__LinkContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getLinkContentAssignment_4()); 
            }
            // InternalMyDsl.g:3293:2: ( rule__ImageExpression__LinkContentAssignment_4 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||LA44_0==13||(LA44_0>=17 && LA44_0<=19)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:3293:3: rule__ImageExpression__LinkContentAssignment_4
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
    // InternalMyDsl.g:3301:1: rule__ImageExpression__Group__5 : rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6 ;
    public final void rule__ImageExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3305:1: ( rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6 )
            // InternalMyDsl.g:3306:2: rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6
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
    // InternalMyDsl.g:3313:1: rule__ImageExpression__Group__5__Impl : ( ( ')' ) ) ;
    public final void rule__ImageExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:3318:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:3318:1: ( ( ')' ) )
            // InternalMyDsl.g:3319:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:3320:2: ( ')' )
            // InternalMyDsl.g:3320:3: ')'
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3328:1: rule__ImageExpression__Group__6 : rule__ImageExpression__Group__6__Impl ;
    public final void rule__ImageExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3332:1: ( rule__ImageExpression__Group__6__Impl )
            // InternalMyDsl.g:3333:2: rule__ImageExpression__Group__6__Impl
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
    // InternalMyDsl.g:3339:1: rule__ImageExpression__Group__6__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ImageExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3343:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3344:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3344:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3345:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getBLTerminalRuleCall_6()); 
            }
            // InternalMyDsl.g:3346:2: ( RULE_BL )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_BL) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred62_InternalMyDsl()) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:3346:3: RULE_BL
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
    // InternalMyDsl.g:3355:1: rule__VideoExpression__Group__0 : rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1 ;
    public final void rule__VideoExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3359:1: ( rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1 )
            // InternalMyDsl.g:3360:2: rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3367:1: rule__VideoExpression__Group__0__Impl : ( () ) ;
    public final void rule__VideoExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( ( () ) )
            // InternalMyDsl.g:3372:1: ( () )
            {
            // InternalMyDsl.g:3372:1: ( () )
            // InternalMyDsl.g:3373:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0()); 
            }
            // InternalMyDsl.g:3374:2: ()
            // InternalMyDsl.g:3374:3: 
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
    // InternalMyDsl.g:3382:1: rule__VideoExpression__Group__1 : rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2 ;
    public final void rule__VideoExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3386:1: ( rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2 )
            // InternalMyDsl.g:3387:2: rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2
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
    // InternalMyDsl.g:3394:1: rule__VideoExpression__Group__1__Impl : ( ( '[![' ) ) ;
    public final void rule__VideoExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( ( ( '[![' ) ) )
            // InternalMyDsl.g:3399:1: ( ( '[![' ) )
            {
            // InternalMyDsl.g:3399:1: ( ( '[![' ) )
            // InternalMyDsl.g:3400:2: ( '[![' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:3401:2: ( '[![' )
            // InternalMyDsl.g:3401:3: '[!['
            {
            match(input,27,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3409:1: rule__VideoExpression__Group__2 : rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3 ;
    public final void rule__VideoExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3413:1: ( rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3 )
            // InternalMyDsl.g:3414:2: rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3421:1: rule__VideoExpression__Group__2__Impl : ( ( rule__VideoExpression__AltTextAssignment_2 ) ) ;
    public final void rule__VideoExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( ( ( rule__VideoExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:3426:1: ( ( rule__VideoExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:3426:1: ( ( rule__VideoExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:3427:2: ( rule__VideoExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:3428:2: ( rule__VideoExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:3428:3: rule__VideoExpression__AltTextAssignment_2
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
    // InternalMyDsl.g:3436:1: rule__VideoExpression__Group__3 : rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4 ;
    public final void rule__VideoExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3440:1: ( rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4 )
            // InternalMyDsl.g:3441:2: rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3448:1: rule__VideoExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__VideoExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:3453:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:3453:1: ( ( '](' ) )
            // InternalMyDsl.g:3454:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:3455:2: ( '](' )
            // InternalMyDsl.g:3455:3: ']('
            {
            match(input,24,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3463:1: rule__VideoExpression__Group__4 : rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5 ;
    public final void rule__VideoExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3467:1: ( rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5 )
            // InternalMyDsl.g:3468:2: rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3475:1: rule__VideoExpression__Group__4__Impl : ( ( rule__VideoExpression__LinkImageAssignment_4 )? ) ;
    public final void rule__VideoExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( ( ( rule__VideoExpression__LinkImageAssignment_4 )? ) )
            // InternalMyDsl.g:3480:1: ( ( rule__VideoExpression__LinkImageAssignment_4 )? )
            {
            // InternalMyDsl.g:3480:1: ( ( rule__VideoExpression__LinkImageAssignment_4 )? )
            // InternalMyDsl.g:3481:2: ( rule__VideoExpression__LinkImageAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkImageAssignment_4()); 
            }
            // InternalMyDsl.g:3482:2: ( rule__VideoExpression__LinkImageAssignment_4 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_INT)||LA46_0==13||(LA46_0>=17 && LA46_0<=19)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:3482:3: rule__VideoExpression__LinkImageAssignment_4
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
    // InternalMyDsl.g:3490:1: rule__VideoExpression__Group__5 : rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6 ;
    public final void rule__VideoExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3494:1: ( rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6 )
            // InternalMyDsl.g:3495:2: rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3502:1: rule__VideoExpression__Group__5__Impl : ( ( ')](' ) ) ;
    public final void rule__VideoExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( ( ( ')](' ) ) )
            // InternalMyDsl.g:3507:1: ( ( ')](' ) )
            {
            // InternalMyDsl.g:3507:1: ( ( ')](' ) )
            // InternalMyDsl.g:3508:2: ( ')](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:3509:2: ( ')](' )
            // InternalMyDsl.g:3509:3: ')]('
            {
            match(input,28,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3517:1: rule__VideoExpression__Group__6 : rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7 ;
    public final void rule__VideoExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3521:1: ( rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7 )
            // InternalMyDsl.g:3522:2: rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3529:1: rule__VideoExpression__Group__6__Impl : ( ( rule__VideoExpression__LinkVideoAssignment_6 )? ) ;
    public final void rule__VideoExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( ( ( rule__VideoExpression__LinkVideoAssignment_6 )? ) )
            // InternalMyDsl.g:3534:1: ( ( rule__VideoExpression__LinkVideoAssignment_6 )? )
            {
            // InternalMyDsl.g:3534:1: ( ( rule__VideoExpression__LinkVideoAssignment_6 )? )
            // InternalMyDsl.g:3535:2: ( rule__VideoExpression__LinkVideoAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkVideoAssignment_6()); 
            }
            // InternalMyDsl.g:3536:2: ( rule__VideoExpression__LinkVideoAssignment_6 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_INT)||LA47_0==13||(LA47_0>=17 && LA47_0<=19)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:3536:3: rule__VideoExpression__LinkVideoAssignment_6
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
    // InternalMyDsl.g:3544:1: rule__VideoExpression__Group__7 : rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8 ;
    public final void rule__VideoExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3548:1: ( rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8 )
            // InternalMyDsl.g:3549:2: rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8
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
    // InternalMyDsl.g:3556:1: rule__VideoExpression__Group__7__Impl : ( ( ')' ) ) ;
    public final void rule__VideoExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:3561:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:3561:1: ( ( ')' ) )
            // InternalMyDsl.g:3562:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7()); 
            }
            // InternalMyDsl.g:3563:2: ( ')' )
            // InternalMyDsl.g:3563:3: ')'
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3571:1: rule__VideoExpression__Group__8 : rule__VideoExpression__Group__8__Impl ;
    public final void rule__VideoExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3575:1: ( rule__VideoExpression__Group__8__Impl )
            // InternalMyDsl.g:3576:2: rule__VideoExpression__Group__8__Impl
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
    // InternalMyDsl.g:3582:1: rule__VideoExpression__Group__8__Impl : ( ( RULE_BL )? ) ;
    public final void rule__VideoExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3587:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3587:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3588:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getBLTerminalRuleCall_8()); 
            }
            // InternalMyDsl.g:3589:2: ( RULE_BL )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_BL) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred65_InternalMyDsl()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:3589:3: RULE_BL
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


    // $ANTLR start "rule__Header1Expression__Group__0"
    // InternalMyDsl.g:3598:1: rule__Header1Expression__Group__0 : rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1 ;
    public final void rule__Header1Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3602:1: ( rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1 )
            // InternalMyDsl.g:3603:2: rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3610:1: rule__Header1Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header1Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( ( () ) )
            // InternalMyDsl.g:3615:1: ( () )
            {
            // InternalMyDsl.g:3615:1: ( () )
            // InternalMyDsl.g:3616:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3617:2: ()
            // InternalMyDsl.g:3617:3: 
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
    // InternalMyDsl.g:3625:1: rule__Header1Expression__Group__1 : rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2 ;
    public final void rule__Header1Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3629:1: ( rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2 )
            // InternalMyDsl.g:3630:2: rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:3637:1: rule__Header1Expression__Group__1__Impl : ( '#' ) ;
    public final void rule__Header1Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( ( '#' ) )
            // InternalMyDsl.g:3642:1: ( '#' )
            {
            // InternalMyDsl.g:3642:1: ( '#' )
            // InternalMyDsl.g:3643:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:3652:1: rule__Header1Expression__Group__2 : rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3 ;
    public final void rule__Header1Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3656:1: ( rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3 )
            // InternalMyDsl.g:3657:2: rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3664:1: rule__Header1Expression__Group__2__Impl : ( ( rule__Header1Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header1Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( ( ( rule__Header1Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3669:1: ( ( rule__Header1Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3669:1: ( ( rule__Header1Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3670:2: ( rule__Header1Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3671:2: ( rule__Header1Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3671:3: rule__Header1Expression__TitleAssignment_2
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
    // InternalMyDsl.g:3679:1: rule__Header1Expression__Group__3 : rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4 ;
    public final void rule__Header1Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3683:1: ( rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4 )
            // InternalMyDsl.g:3684:2: rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3691:1: rule__Header1Expression__Group__3__Impl : ( ( rule__Header1Expression__Group_3__0 )* ) ;
    public final void rule__Header1Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( ( ( rule__Header1Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3696:1: ( ( rule__Header1Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3696:1: ( ( rule__Header1Expression__Group_3__0 )* )
            // InternalMyDsl.g:3697:2: ( rule__Header1Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3698:2: ( rule__Header1Expression__Group_3__0 )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:3698:3: rule__Header1Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header1Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalMyDsl.g:3706:1: rule__Header1Expression__Group__4 : rule__Header1Expression__Group__4__Impl ;
    public final void rule__Header1Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3710:1: ( rule__Header1Expression__Group__4__Impl )
            // InternalMyDsl.g:3711:2: rule__Header1Expression__Group__4__Impl
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
    // InternalMyDsl.g:3717:1: rule__Header1Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header1Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3722:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3722:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3723:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3724:2: ( RULE_BL )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_BL) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred67_InternalMyDsl()) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:3724:3: RULE_BL
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
    // InternalMyDsl.g:3733:1: rule__Header1Expression__Group_3__0 : rule__Header1Expression__Group_3__0__Impl ;
    public final void rule__Header1Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3737:1: ( rule__Header1Expression__Group_3__0__Impl )
            // InternalMyDsl.g:3738:2: rule__Header1Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:3744:1: rule__Header1Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header1Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( ( '#' ) )
            // InternalMyDsl.g:3749:1: ( '#' )
            {
            // InternalMyDsl.g:3749:1: ( '#' )
            // InternalMyDsl.g:3750:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:3760:1: rule__Header2Expression__Group__0 : rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1 ;
    public final void rule__Header2Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3764:1: ( rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1 )
            // InternalMyDsl.g:3765:2: rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3772:1: rule__Header2Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header2Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( ( () ) )
            // InternalMyDsl.g:3777:1: ( () )
            {
            // InternalMyDsl.g:3777:1: ( () )
            // InternalMyDsl.g:3778:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3779:2: ()
            // InternalMyDsl.g:3779:3: 
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
    // InternalMyDsl.g:3787:1: rule__Header2Expression__Group__1 : rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2 ;
    public final void rule__Header2Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3791:1: ( rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2 )
            // InternalMyDsl.g:3792:2: rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:3799:1: rule__Header2Expression__Group__1__Impl : ( '##' ) ;
    public final void rule__Header2Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( ( '##' ) )
            // InternalMyDsl.g:3804:1: ( '##' )
            {
            // InternalMyDsl.g:3804:1: ( '##' )
            // InternalMyDsl.g:3805:2: '##'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:3814:1: rule__Header2Expression__Group__2 : rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3 ;
    public final void rule__Header2Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3818:1: ( rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3 )
            // InternalMyDsl.g:3819:2: rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3826:1: rule__Header2Expression__Group__2__Impl : ( ( rule__Header2Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header2Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( ( ( rule__Header2Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3831:1: ( ( rule__Header2Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3831:1: ( ( rule__Header2Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3832:2: ( rule__Header2Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3833:2: ( rule__Header2Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3833:3: rule__Header2Expression__TitleAssignment_2
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
    // InternalMyDsl.g:3841:1: rule__Header2Expression__Group__3 : rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4 ;
    public final void rule__Header2Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3845:1: ( rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4 )
            // InternalMyDsl.g:3846:2: rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3853:1: rule__Header2Expression__Group__3__Impl : ( ( rule__Header2Expression__Group_3__0 )* ) ;
    public final void rule__Header2Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( ( ( rule__Header2Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3858:1: ( ( rule__Header2Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3858:1: ( ( rule__Header2Expression__Group_3__0 )* )
            // InternalMyDsl.g:3859:2: ( rule__Header2Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3860:2: ( rule__Header2Expression__Group_3__0 )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // InternalMyDsl.g:3860:3: rule__Header2Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header2Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalMyDsl.g:3868:1: rule__Header2Expression__Group__4 : rule__Header2Expression__Group__4__Impl ;
    public final void rule__Header2Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3872:1: ( rule__Header2Expression__Group__4__Impl )
            // InternalMyDsl.g:3873:2: rule__Header2Expression__Group__4__Impl
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
    // InternalMyDsl.g:3879:1: rule__Header2Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header2Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3883:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3884:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3884:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3885:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3886:2: ( RULE_BL )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_BL) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred69_InternalMyDsl()) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:3886:3: RULE_BL
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
    // InternalMyDsl.g:3895:1: rule__Header2Expression__Group_3__0 : rule__Header2Expression__Group_3__0__Impl ;
    public final void rule__Header2Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3899:1: ( rule__Header2Expression__Group_3__0__Impl )
            // InternalMyDsl.g:3900:2: rule__Header2Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:3906:1: rule__Header2Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header2Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3910:1: ( ( '#' ) )
            // InternalMyDsl.g:3911:1: ( '#' )
            {
            // InternalMyDsl.g:3911:1: ( '#' )
            // InternalMyDsl.g:3912:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:3922:1: rule__Header3Expression__Group__0 : rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1 ;
    public final void rule__Header3Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3926:1: ( rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1 )
            // InternalMyDsl.g:3927:2: rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3934:1: rule__Header3Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header3Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( ( () ) )
            // InternalMyDsl.g:3939:1: ( () )
            {
            // InternalMyDsl.g:3939:1: ( () )
            // InternalMyDsl.g:3940:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3941:2: ()
            // InternalMyDsl.g:3941:3: 
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
    // InternalMyDsl.g:3949:1: rule__Header3Expression__Group__1 : rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2 ;
    public final void rule__Header3Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3953:1: ( rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2 )
            // InternalMyDsl.g:3954:2: rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:3961:1: rule__Header3Expression__Group__1__Impl : ( '###' ) ;
    public final void rule__Header3Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( ( '###' ) )
            // InternalMyDsl.g:3966:1: ( '###' )
            {
            // InternalMyDsl.g:3966:1: ( '###' )
            // InternalMyDsl.g:3967:2: '###'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:3976:1: rule__Header3Expression__Group__2 : rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3 ;
    public final void rule__Header3Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3980:1: ( rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3 )
            // InternalMyDsl.g:3981:2: rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3988:1: rule__Header3Expression__Group__2__Impl : ( ( rule__Header3Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header3Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( ( ( rule__Header3Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3993:1: ( ( rule__Header3Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3993:1: ( ( rule__Header3Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3994:2: ( rule__Header3Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3995:2: ( rule__Header3Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3995:3: rule__Header3Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4003:1: rule__Header3Expression__Group__3 : rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4 ;
    public final void rule__Header3Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4007:1: ( rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4 )
            // InternalMyDsl.g:4008:2: rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4015:1: rule__Header3Expression__Group__3__Impl : ( ( rule__Header3Expression__Group_3__0 )* ) ;
    public final void rule__Header3Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( ( ( rule__Header3Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4020:1: ( ( rule__Header3Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4020:1: ( ( rule__Header3Expression__Group_3__0 )* )
            // InternalMyDsl.g:4021:2: ( rule__Header3Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4022:2: ( rule__Header3Expression__Group_3__0 )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:4022:3: rule__Header3Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header3Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalMyDsl.g:4030:1: rule__Header3Expression__Group__4 : rule__Header3Expression__Group__4__Impl ;
    public final void rule__Header3Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4034:1: ( rule__Header3Expression__Group__4__Impl )
            // InternalMyDsl.g:4035:2: rule__Header3Expression__Group__4__Impl
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
    // InternalMyDsl.g:4041:1: rule__Header3Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header3Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4045:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4046:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4046:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4047:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4048:2: ( RULE_BL )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_BL) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred71_InternalMyDsl()) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:4048:3: RULE_BL
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
    // InternalMyDsl.g:4057:1: rule__Header3Expression__Group_3__0 : rule__Header3Expression__Group_3__0__Impl ;
    public final void rule__Header3Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4061:1: ( rule__Header3Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4062:2: rule__Header3Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4068:1: rule__Header3Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header3Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4072:1: ( ( '#' ) )
            // InternalMyDsl.g:4073:1: ( '#' )
            {
            // InternalMyDsl.g:4073:1: ( '#' )
            // InternalMyDsl.g:4074:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4084:1: rule__Header4Expression__Group__0 : rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1 ;
    public final void rule__Header4Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4088:1: ( rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1 )
            // InternalMyDsl.g:4089:2: rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4096:1: rule__Header4Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header4Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4100:1: ( ( () ) )
            // InternalMyDsl.g:4101:1: ( () )
            {
            // InternalMyDsl.g:4101:1: ( () )
            // InternalMyDsl.g:4102:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4103:2: ()
            // InternalMyDsl.g:4103:3: 
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
    // InternalMyDsl.g:4111:1: rule__Header4Expression__Group__1 : rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2 ;
    public final void rule__Header4Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4115:1: ( rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2 )
            // InternalMyDsl.g:4116:2: rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4123:1: rule__Header4Expression__Group__1__Impl : ( '####' ) ;
    public final void rule__Header4Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( ( '####' ) )
            // InternalMyDsl.g:4128:1: ( '####' )
            {
            // InternalMyDsl.g:4128:1: ( '####' )
            // InternalMyDsl.g:4129:2: '####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4138:1: rule__Header4Expression__Group__2 : rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3 ;
    public final void rule__Header4Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4142:1: ( rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3 )
            // InternalMyDsl.g:4143:2: rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4150:1: rule__Header4Expression__Group__2__Impl : ( ( rule__Header4Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header4Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( ( ( rule__Header4Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4155:1: ( ( rule__Header4Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4155:1: ( ( rule__Header4Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4156:2: ( rule__Header4Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4157:2: ( rule__Header4Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4157:3: rule__Header4Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4165:1: rule__Header4Expression__Group__3 : rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4 ;
    public final void rule__Header4Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4169:1: ( rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4 )
            // InternalMyDsl.g:4170:2: rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4177:1: rule__Header4Expression__Group__3__Impl : ( ( rule__Header4Expression__Group_3__0 )* ) ;
    public final void rule__Header4Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( ( ( rule__Header4Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4182:1: ( ( rule__Header4Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4182:1: ( ( rule__Header4Expression__Group_3__0 )* )
            // InternalMyDsl.g:4183:2: ( rule__Header4Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4184:2: ( rule__Header4Expression__Group_3__0 )*
            loop55:
            do {
                int alt55=2;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // InternalMyDsl.g:4184:3: rule__Header4Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header4Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalMyDsl.g:4192:1: rule__Header4Expression__Group__4 : rule__Header4Expression__Group__4__Impl ;
    public final void rule__Header4Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4196:1: ( rule__Header4Expression__Group__4__Impl )
            // InternalMyDsl.g:4197:2: rule__Header4Expression__Group__4__Impl
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
    // InternalMyDsl.g:4203:1: rule__Header4Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header4Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4207:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4208:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4208:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4209:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4210:2: ( RULE_BL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_BL) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred73_InternalMyDsl()) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:4210:3: RULE_BL
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
    // InternalMyDsl.g:4219:1: rule__Header4Expression__Group_3__0 : rule__Header4Expression__Group_3__0__Impl ;
    public final void rule__Header4Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4223:1: ( rule__Header4Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4224:2: rule__Header4Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4230:1: rule__Header4Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header4Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4234:1: ( ( '#' ) )
            // InternalMyDsl.g:4235:1: ( '#' )
            {
            // InternalMyDsl.g:4235:1: ( '#' )
            // InternalMyDsl.g:4236:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4246:1: rule__Header5Expression__Group__0 : rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1 ;
    public final void rule__Header5Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4250:1: ( rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1 )
            // InternalMyDsl.g:4251:2: rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:4258:1: rule__Header5Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header5Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4262:1: ( ( () ) )
            // InternalMyDsl.g:4263:1: ( () )
            {
            // InternalMyDsl.g:4263:1: ( () )
            // InternalMyDsl.g:4264:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4265:2: ()
            // InternalMyDsl.g:4265:3: 
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
    // InternalMyDsl.g:4273:1: rule__Header5Expression__Group__1 : rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2 ;
    public final void rule__Header5Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4277:1: ( rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2 )
            // InternalMyDsl.g:4278:2: rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4285:1: rule__Header5Expression__Group__1__Impl : ( '#####' ) ;
    public final void rule__Header5Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4289:1: ( ( '#####' ) )
            // InternalMyDsl.g:4290:1: ( '#####' )
            {
            // InternalMyDsl.g:4290:1: ( '#####' )
            // InternalMyDsl.g:4291:2: '#####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4300:1: rule__Header5Expression__Group__2 : rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3 ;
    public final void rule__Header5Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4304:1: ( rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3 )
            // InternalMyDsl.g:4305:2: rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4312:1: rule__Header5Expression__Group__2__Impl : ( ( rule__Header5Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header5Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4316:1: ( ( ( rule__Header5Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4317:1: ( ( rule__Header5Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4317:1: ( ( rule__Header5Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4318:2: ( rule__Header5Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4319:2: ( rule__Header5Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4319:3: rule__Header5Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4327:1: rule__Header5Expression__Group__3 : rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4 ;
    public final void rule__Header5Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4331:1: ( rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4 )
            // InternalMyDsl.g:4332:2: rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4339:1: rule__Header5Expression__Group__3__Impl : ( ( rule__Header5Expression__Group_3__0 )* ) ;
    public final void rule__Header5Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4343:1: ( ( ( rule__Header5Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4344:1: ( ( rule__Header5Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4344:1: ( ( rule__Header5Expression__Group_3__0 )* )
            // InternalMyDsl.g:4345:2: ( rule__Header5Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4346:2: ( rule__Header5Expression__Group_3__0 )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // InternalMyDsl.g:4346:3: rule__Header5Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header5Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalMyDsl.g:4354:1: rule__Header5Expression__Group__4 : rule__Header5Expression__Group__4__Impl ;
    public final void rule__Header5Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4358:1: ( rule__Header5Expression__Group__4__Impl )
            // InternalMyDsl.g:4359:2: rule__Header5Expression__Group__4__Impl
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
    // InternalMyDsl.g:4365:1: rule__Header5Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header5Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4369:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4370:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4370:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4371:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4372:2: ( RULE_BL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_BL) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred75_InternalMyDsl()) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:4372:3: RULE_BL
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
    // InternalMyDsl.g:4381:1: rule__Header5Expression__Group_3__0 : rule__Header5Expression__Group_3__0__Impl ;
    public final void rule__Header5Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4385:1: ( rule__Header5Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4386:2: rule__Header5Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4392:1: rule__Header5Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header5Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4396:1: ( ( '#' ) )
            // InternalMyDsl.g:4397:1: ( '#' )
            {
            // InternalMyDsl.g:4397:1: ( '#' )
            // InternalMyDsl.g:4398:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4408:1: rule__Header6Expression__Group__0 : rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1 ;
    public final void rule__Header6Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4412:1: ( rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1 )
            // InternalMyDsl.g:4413:2: rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4420:1: rule__Header6Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header6Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4424:1: ( ( () ) )
            // InternalMyDsl.g:4425:1: ( () )
            {
            // InternalMyDsl.g:4425:1: ( () )
            // InternalMyDsl.g:4426:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4427:2: ()
            // InternalMyDsl.g:4427:3: 
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
    // InternalMyDsl.g:4435:1: rule__Header6Expression__Group__1 : rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2 ;
    public final void rule__Header6Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4439:1: ( rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2 )
            // InternalMyDsl.g:4440:2: rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4447:1: rule__Header6Expression__Group__1__Impl : ( '######' ) ;
    public final void rule__Header6Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4451:1: ( ( '######' ) )
            // InternalMyDsl.g:4452:1: ( '######' )
            {
            // InternalMyDsl.g:4452:1: ( '######' )
            // InternalMyDsl.g:4453:2: '######'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4462:1: rule__Header6Expression__Group__2 : rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3 ;
    public final void rule__Header6Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4466:1: ( rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3 )
            // InternalMyDsl.g:4467:2: rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4474:1: rule__Header6Expression__Group__2__Impl : ( ( rule__Header6Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header6Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4478:1: ( ( ( rule__Header6Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4479:1: ( ( rule__Header6Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4479:1: ( ( rule__Header6Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4480:2: ( rule__Header6Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4481:2: ( rule__Header6Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4481:3: rule__Header6Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4489:1: rule__Header6Expression__Group__3 : rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4 ;
    public final void rule__Header6Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4493:1: ( rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4 )
            // InternalMyDsl.g:4494:2: rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4501:1: rule__Header6Expression__Group__3__Impl : ( ( rule__Header6Expression__Group_3__0 )* ) ;
    public final void rule__Header6Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4505:1: ( ( ( rule__Header6Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4506:1: ( ( rule__Header6Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4506:1: ( ( rule__Header6Expression__Group_3__0 )* )
            // InternalMyDsl.g:4507:2: ( rule__Header6Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4508:2: ( rule__Header6Expression__Group_3__0 )*
            loop59:
            do {
                int alt59=2;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // InternalMyDsl.g:4508:3: rule__Header6Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header6Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalMyDsl.g:4516:1: rule__Header6Expression__Group__4 : rule__Header6Expression__Group__4__Impl ;
    public final void rule__Header6Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4520:1: ( rule__Header6Expression__Group__4__Impl )
            // InternalMyDsl.g:4521:2: rule__Header6Expression__Group__4__Impl
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
    // InternalMyDsl.g:4527:1: rule__Header6Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header6Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4531:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4532:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4532:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4533:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4534:2: ( RULE_BL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_BL) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred77_InternalMyDsl()) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:4534:3: RULE_BL
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
    // InternalMyDsl.g:4543:1: rule__Header6Expression__Group_3__0 : rule__Header6Expression__Group_3__0__Impl ;
    public final void rule__Header6Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4547:1: ( rule__Header6Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4548:2: rule__Header6Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4554:1: rule__Header6Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header6Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( ( '#' ) )
            // InternalMyDsl.g:4559:1: ( '#' )
            {
            // InternalMyDsl.g:4559:1: ( '#' )
            // InternalMyDsl.g:4560:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4570:1: rule__EmphasisExpression__Group_0__0 : rule__EmphasisExpression__Group_0__0__Impl ;
    public final void rule__EmphasisExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4574:1: ( rule__EmphasisExpression__Group_0__0__Impl )
            // InternalMyDsl.g:4575:2: rule__EmphasisExpression__Group_0__0__Impl
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
    // InternalMyDsl.g:4581:1: rule__EmphasisExpression__Group_0__0__Impl : ( ( rule__EmphasisExpression__Alternatives_0_0 ) ) ;
    public final void rule__EmphasisExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4585:1: ( ( ( rule__EmphasisExpression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:4586:1: ( ( rule__EmphasisExpression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:4586:1: ( ( rule__EmphasisExpression__Alternatives_0_0 ) )
            // InternalMyDsl.g:4587:2: ( rule__EmphasisExpression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:4588:2: ( rule__EmphasisExpression__Alternatives_0_0 )
            // InternalMyDsl.g:4588:3: rule__EmphasisExpression__Alternatives_0_0
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
    // InternalMyDsl.g:4597:1: rule__StrongExpression__Group__0 : rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1 ;
    public final void rule__StrongExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4601:1: ( rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1 )
            // InternalMyDsl.g:4602:2: rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4609:1: rule__StrongExpression__Group__0__Impl : ( () ) ;
    public final void rule__StrongExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4613:1: ( ( () ) )
            // InternalMyDsl.g:4614:1: ( () )
            {
            // InternalMyDsl.g:4614:1: ( () )
            // InternalMyDsl.g:4615:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0()); 
            }
            // InternalMyDsl.g:4616:2: ()
            // InternalMyDsl.g:4616:3: 
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
    // InternalMyDsl.g:4624:1: rule__StrongExpression__Group__1 : rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2 ;
    public final void rule__StrongExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4628:1: ( rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2 )
            // InternalMyDsl.g:4629:2: rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4636:1: rule__StrongExpression__Group__1__Impl : ( '**' ) ;
    public final void rule__StrongExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4640:1: ( ( '**' ) )
            // InternalMyDsl.g:4641:1: ( '**' )
            {
            // InternalMyDsl.g:4641:1: ( '**' )
            // InternalMyDsl.g:4642:2: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4651:1: rule__StrongExpression__Group__2 : rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3 ;
    public final void rule__StrongExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4655:1: ( rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3 )
            // InternalMyDsl.g:4656:2: rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4663:1: rule__StrongExpression__Group__2__Impl : ( ( rule__StrongExpression__ContentAssignment_2 ) ) ;
    public final void rule__StrongExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4667:1: ( ( ( rule__StrongExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4668:1: ( ( rule__StrongExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4668:1: ( ( rule__StrongExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4669:2: ( rule__StrongExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4670:2: ( rule__StrongExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4670:3: rule__StrongExpression__ContentAssignment_2
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
    // InternalMyDsl.g:4678:1: rule__StrongExpression__Group__3 : rule__StrongExpression__Group__3__Impl ;
    public final void rule__StrongExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4682:1: ( rule__StrongExpression__Group__3__Impl )
            // InternalMyDsl.g:4683:2: rule__StrongExpression__Group__3__Impl
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
    // InternalMyDsl.g:4689:1: rule__StrongExpression__Group__3__Impl : ( '**' ) ;
    public final void rule__StrongExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4693:1: ( ( '**' ) )
            // InternalMyDsl.g:4694:1: ( '**' )
            {
            // InternalMyDsl.g:4694:1: ( '**' )
            // InternalMyDsl.g:4695:2: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4705:1: rule__ItalicExpression__Group__0 : rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1 ;
    public final void rule__ItalicExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4709:1: ( rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1 )
            // InternalMyDsl.g:4710:2: rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4717:1: rule__ItalicExpression__Group__0__Impl : ( () ) ;
    public final void rule__ItalicExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4721:1: ( ( () ) )
            // InternalMyDsl.g:4722:1: ( () )
            {
            // InternalMyDsl.g:4722:1: ( () )
            // InternalMyDsl.g:4723:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0()); 
            }
            // InternalMyDsl.g:4724:2: ()
            // InternalMyDsl.g:4724:3: 
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
    // InternalMyDsl.g:4732:1: rule__ItalicExpression__Group__1 : rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2 ;
    public final void rule__ItalicExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4736:1: ( rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2 )
            // InternalMyDsl.g:4737:2: rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4744:1: rule__ItalicExpression__Group__1__Impl : ( '*' ) ;
    public final void rule__ItalicExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4748:1: ( ( '*' ) )
            // InternalMyDsl.g:4749:1: ( '*' )
            {
            // InternalMyDsl.g:4749:1: ( '*' )
            // InternalMyDsl.g:4750:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4759:1: rule__ItalicExpression__Group__2 : rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3 ;
    public final void rule__ItalicExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4763:1: ( rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3 )
            // InternalMyDsl.g:4764:2: rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4771:1: rule__ItalicExpression__Group__2__Impl : ( ( rule__ItalicExpression__ContentAssignment_2 ) ) ;
    public final void rule__ItalicExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4775:1: ( ( ( rule__ItalicExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4776:1: ( ( rule__ItalicExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4776:1: ( ( rule__ItalicExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4777:2: ( rule__ItalicExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4778:2: ( rule__ItalicExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4778:3: rule__ItalicExpression__ContentAssignment_2
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
    // InternalMyDsl.g:4786:1: rule__ItalicExpression__Group__3 : rule__ItalicExpression__Group__3__Impl ;
    public final void rule__ItalicExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4790:1: ( rule__ItalicExpression__Group__3__Impl )
            // InternalMyDsl.g:4791:2: rule__ItalicExpression__Group__3__Impl
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
    // InternalMyDsl.g:4797:1: rule__ItalicExpression__Group__3__Impl : ( '*' ) ;
    public final void rule__ItalicExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4801:1: ( ( '*' ) )
            // InternalMyDsl.g:4802:1: ( '*' )
            {
            // InternalMyDsl.g:4802:1: ( '*' )
            // InternalMyDsl.g:4803:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4813:1: rule__ScratchExpression__Group__0 : rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1 ;
    public final void rule__ScratchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4817:1: ( rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1 )
            // InternalMyDsl.g:4818:2: rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4825:1: rule__ScratchExpression__Group__0__Impl : ( () ) ;
    public final void rule__ScratchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4829:1: ( ( () ) )
            // InternalMyDsl.g:4830:1: ( () )
            {
            // InternalMyDsl.g:4830:1: ( () )
            // InternalMyDsl.g:4831:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0()); 
            }
            // InternalMyDsl.g:4832:2: ()
            // InternalMyDsl.g:4832:3: 
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
    // InternalMyDsl.g:4840:1: rule__ScratchExpression__Group__1 : rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2 ;
    public final void rule__ScratchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4844:1: ( rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2 )
            // InternalMyDsl.g:4845:2: rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4852:1: rule__ScratchExpression__Group__1__Impl : ( '~~' ) ;
    public final void rule__ScratchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4856:1: ( ( '~~' ) )
            // InternalMyDsl.g:4857:1: ( '~~' )
            {
            // InternalMyDsl.g:4857:1: ( '~~' )
            // InternalMyDsl.g:4858:2: '~~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4867:1: rule__ScratchExpression__Group__2 : rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3 ;
    public final void rule__ScratchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4871:1: ( rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3 )
            // InternalMyDsl.g:4872:2: rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4879:1: rule__ScratchExpression__Group__2__Impl : ( ( rule__ScratchExpression__ContentAssignment_2 ) ) ;
    public final void rule__ScratchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4883:1: ( ( ( rule__ScratchExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4884:1: ( ( rule__ScratchExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4884:1: ( ( rule__ScratchExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4885:2: ( rule__ScratchExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4886:2: ( rule__ScratchExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4886:3: rule__ScratchExpression__ContentAssignment_2
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
    // InternalMyDsl.g:4894:1: rule__ScratchExpression__Group__3 : rule__ScratchExpression__Group__3__Impl ;
    public final void rule__ScratchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4898:1: ( rule__ScratchExpression__Group__3__Impl )
            // InternalMyDsl.g:4899:2: rule__ScratchExpression__Group__3__Impl
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
    // InternalMyDsl.g:4905:1: rule__ScratchExpression__Group__3__Impl : ( '~~' ) ;
    public final void rule__ScratchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4909:1: ( ( '~~' ) )
            // InternalMyDsl.g:4910:1: ( '~~' )
            {
            // InternalMyDsl.g:4910:1: ( '~~' )
            // InternalMyDsl.g:4911:2: '~~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4921:1: rule__NaturalExpression__Group__0 : rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 ;
    public final void rule__NaturalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4925:1: ( rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 )
            // InternalMyDsl.g:4926:2: rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1
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
    // InternalMyDsl.g:4933:1: rule__NaturalExpression__Group__0__Impl : ( () ) ;
    public final void rule__NaturalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4937:1: ( ( () ) )
            // InternalMyDsl.g:4938:1: ( () )
            {
            // InternalMyDsl.g:4938:1: ( () )
            // InternalMyDsl.g:4939:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getNaturalExpressionAction_0()); 
            }
            // InternalMyDsl.g:4940:2: ()
            // InternalMyDsl.g:4940:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNaturalExpressionAccess().getNaturalExpressionAction_0()); 
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
    // InternalMyDsl.g:4948:1: rule__NaturalExpression__Group__1 : rule__NaturalExpression__Group__1__Impl ;
    public final void rule__NaturalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4952:1: ( rule__NaturalExpression__Group__1__Impl )
            // InternalMyDsl.g:4953:2: rule__NaturalExpression__Group__1__Impl
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
    // InternalMyDsl.g:4959:1: rule__NaturalExpression__Group__1__Impl : ( ( rule__NaturalExpression__ValueAssignment_1 ) ) ;
    public final void rule__NaturalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4963:1: ( ( ( rule__NaturalExpression__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:4964:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:4964:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            // InternalMyDsl.g:4965:2: ( rule__NaturalExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getValueAssignment_1()); 
            }
            // InternalMyDsl.g:4966:2: ( rule__NaturalExpression__ValueAssignment_1 )
            // InternalMyDsl.g:4966:3: rule__NaturalExpression__ValueAssignment_1
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
    // InternalMyDsl.g:4975:1: rule__Content__Group_0__0 : rule__Content__Group_0__0__Impl ;
    public final void rule__Content__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4979:1: ( rule__Content__Group_0__0__Impl )
            // InternalMyDsl.g:4980:2: rule__Content__Group_0__0__Impl
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
    // InternalMyDsl.g:4986:1: rule__Content__Group_0__0__Impl : ( ( rule__Content__Alternatives_0_0 ) ) ;
    public final void rule__Content__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4990:1: ( ( ( rule__Content__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:4991:1: ( ( rule__Content__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:4991:1: ( ( rule__Content__Alternatives_0_0 ) )
            // InternalMyDsl.g:4992:2: ( rule__Content__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:4993:2: ( rule__Content__Alternatives_0_0 )
            // InternalMyDsl.g:4993:3: rule__Content__Alternatives_0_0
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
    // InternalMyDsl.g:5002:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5006:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5007:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5007:2: ( ruleExpression )
            // InternalMyDsl.g:5008:3: ruleExpression
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


    // $ANTLR start "rule__Expression__CAssignment_0_0_0"
    // InternalMyDsl.g:5017:1: rule__Expression__CAssignment_0_0_0 : ( ruleHeaderExpression ) ;
    public final void rule__Expression__CAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5021:1: ( ( ruleHeaderExpression ) )
            // InternalMyDsl.g:5022:2: ( ruleHeaderExpression )
            {
            // InternalMyDsl.g:5022:2: ( ruleHeaderExpression )
            // InternalMyDsl.g:5023:3: ruleHeaderExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCHeaderExpressionParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHeaderExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCHeaderExpressionParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CAssignment_0_0_0"


    // $ANTLR start "rule__Expression__CAssignment_0_0_1"
    // InternalMyDsl.g:5032:1: rule__Expression__CAssignment_0_0_1 : ( ruleBreakLineExpression ) ;
    public final void rule__Expression__CAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5036:1: ( ( ruleBreakLineExpression ) )
            // InternalMyDsl.g:5037:2: ( ruleBreakLineExpression )
            {
            // InternalMyDsl.g:5037:2: ( ruleBreakLineExpression )
            // InternalMyDsl.g:5038:3: ruleBreakLineExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCBreakLineExpressionParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBreakLineExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCBreakLineExpressionParserRuleCall_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CAssignment_0_0_1"


    // $ANTLR start "rule__Expression__CAssignment_0_0_2"
    // InternalMyDsl.g:5047:1: rule__Expression__CAssignment_0_0_2 : ( ruleRefExpression ) ;
    public final void rule__Expression__CAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5051:1: ( ( ruleRefExpression ) )
            // InternalMyDsl.g:5052:2: ( ruleRefExpression )
            {
            // InternalMyDsl.g:5052:2: ( ruleRefExpression )
            // InternalMyDsl.g:5053:3: ruleRefExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCRefExpressionParserRuleCall_0_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRefExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCRefExpressionParserRuleCall_0_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CAssignment_0_0_2"


    // $ANTLR start "rule__Expression__CAssignment_0_0_3_0"
    // InternalMyDsl.g:5062:1: rule__Expression__CAssignment_0_0_3_0 : ( ruleHorizontalExpression ) ;
    public final void rule__Expression__CAssignment_0_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5066:1: ( ( ruleHorizontalExpression ) )
            // InternalMyDsl.g:5067:2: ( ruleHorizontalExpression )
            {
            // InternalMyDsl.g:5067:2: ( ruleHorizontalExpression )
            // InternalMyDsl.g:5068:3: ruleHorizontalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCHorizontalExpressionParserRuleCall_0_0_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHorizontalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCHorizontalExpressionParserRuleCall_0_0_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CAssignment_0_0_3_0"


    // $ANTLR start "rule__Expression__CAssignment_0_0_4_0"
    // InternalMyDsl.g:5077:1: rule__Expression__CAssignment_0_0_4_0 : ( ruleListExpression ) ;
    public final void rule__Expression__CAssignment_0_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5081:1: ( ( ruleListExpression ) )
            // InternalMyDsl.g:5082:2: ( ruleListExpression )
            {
            // InternalMyDsl.g:5082:2: ( ruleListExpression )
            // InternalMyDsl.g:5083:3: ruleListExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCListExpressionParserRuleCall_0_0_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCListExpressionParserRuleCall_0_0_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CAssignment_0_0_4_0"


    // $ANTLR start "rule__Expression__CAssignment_1_0"
    // InternalMyDsl.g:5092:1: rule__Expression__CAssignment_1_0 : ( ruleTextExpression ) ;
    public final void rule__Expression__CAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5096:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5097:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5097:2: ( ruleTextExpression )
            // InternalMyDsl.g:5098:3: ruleTextExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCTextExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCTextExpressionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CAssignment_1_0"


    // $ANTLR start "rule__ListExpression__ContentUnorderedAssignment_0_1_2"
    // InternalMyDsl.g:5107:1: rule__ListExpression__ContentUnorderedAssignment_0_1_2 : ( ruleTextExpression ) ;
    public final void rule__ListExpression__ContentUnorderedAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5111:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5112:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5112:2: ( ruleTextExpression )
            // InternalMyDsl.g:5113:3: ruleTextExpression
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
    // InternalMyDsl.g:5122:1: rule__ListExpression__ContentOrderedAssignment_1_3 : ( ruleTextExpression ) ;
    public final void rule__ListExpression__ContentOrderedAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5126:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5127:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5127:2: ( ruleTextExpression )
            // InternalMyDsl.g:5128:3: ruleTextExpression
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
    // InternalMyDsl.g:5137:1: rule__QuoteExpression__ContentAssignment_2 : ( ruleTextExpression ) ;
    public final void rule__QuoteExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5141:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5142:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5142:2: ( ruleTextExpression )
            // InternalMyDsl.g:5143:3: ruleTextExpression
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


    // $ANTLR start "rule__TabExpression__HeaderAssignment_1_0_0"
    // InternalMyDsl.g:5152:1: rule__TabExpression__HeaderAssignment_1_0_0 : ( ruleLineExpression ) ;
    public final void rule__TabExpression__HeaderAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5156:1: ( ( ruleLineExpression ) )
            // InternalMyDsl.g:5157:2: ( ruleLineExpression )
            {
            // InternalMyDsl.g:5157:2: ( ruleLineExpression )
            // InternalMyDsl.g:5158:3: ruleLineExpression
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
    // InternalMyDsl.g:5167:1: rule__TabExpression__LinesAssignment_1_0_3_0_1 : ( ruleLineExpression ) ;
    public final void rule__TabExpression__LinesAssignment_1_0_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5171:1: ( ( ruleLineExpression ) )
            // InternalMyDsl.g:5172:2: ( ruleLineExpression )
            {
            // InternalMyDsl.g:5172:2: ( ruleLineExpression )
            // InternalMyDsl.g:5173:3: ruleLineExpression
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
    // InternalMyDsl.g:5182:1: rule__LineExpression__CellsAssignment_1 : ( ruleNaturalExpression ) ;
    public final void rule__LineExpression__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5186:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5187:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5187:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5188:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5197:1: rule__LineExpression__CellsAssignment_2_1 : ( ruleNaturalExpression ) ;
    public final void rule__LineExpression__CellsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5201:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5202:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5202:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5203:3: ruleNaturalExpression
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


    // $ANTLR start "rule__RefExpression__RefNameAssignment_2"
    // InternalMyDsl.g:5212:1: rule__RefExpression__RefNameAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__RefExpression__RefNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5216:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5217:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5217:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5218:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefNameNaturalExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionAccess().getRefNameNaturalExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__RefNameAssignment_2"


    // $ANTLR start "rule__RefExpression__RefContentAssignment_4"
    // InternalMyDsl.g:5227:1: rule__RefExpression__RefContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__RefExpression__RefContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5231:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5232:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5232:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5233:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefContentNaturalExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefExpressionAccess().getRefContentNaturalExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefExpression__RefContentAssignment_4"


    // $ANTLR start "rule__LinkExpression__AltTextAssignment_2"
    // InternalMyDsl.g:5242:1: rule__LinkExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5246:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5247:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5247:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5248:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5257:1: rule__LinkExpression__LinkContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__LinkContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5261:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5262:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5262:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5263:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5272:1: rule__ImageExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__ImageExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5276:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5277:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5277:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5278:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5287:1: rule__ImageExpression__LinkContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__ImageExpression__LinkContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5291:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5292:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5292:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5293:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5302:1: rule__VideoExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5306:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5307:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5307:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5308:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5317:1: rule__VideoExpression__LinkImageAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__LinkImageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5321:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5322:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5322:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5323:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5332:1: rule__VideoExpression__LinkVideoAssignment_6 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__LinkVideoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5336:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5337:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5337:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5338:3: ruleNaturalExpression
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


    // $ANTLR start "rule__Header1Expression__TitleAssignment_2"
    // InternalMyDsl.g:5347:1: rule__Header1Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header1Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5351:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5352:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5352:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5353:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5362:1: rule__Header2Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header2Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5366:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5367:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5367:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5368:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5377:1: rule__Header3Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header3Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5381:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5382:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5382:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5383:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5392:1: rule__Header4Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header4Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5396:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5397:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5397:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5398:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5407:1: rule__Header5Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header5Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5411:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5412:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5412:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5413:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5422:1: rule__Header6Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header6Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5426:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5427:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5427:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5428:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5437:1: rule__EmphasisExpression__CAssignment_0_0_0 : ( ruleStrongExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5441:1: ( ( ruleStrongExpression ) )
            // InternalMyDsl.g:5442:2: ( ruleStrongExpression )
            {
            // InternalMyDsl.g:5442:2: ( ruleStrongExpression )
            // InternalMyDsl.g:5443:3: ruleStrongExpression
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
    // InternalMyDsl.g:5452:1: rule__EmphasisExpression__CAssignment_0_0_1 : ( ruleItalicExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5456:1: ( ( ruleItalicExpression ) )
            // InternalMyDsl.g:5457:2: ( ruleItalicExpression )
            {
            // InternalMyDsl.g:5457:2: ( ruleItalicExpression )
            // InternalMyDsl.g:5458:3: ruleItalicExpression
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
    // InternalMyDsl.g:5467:1: rule__EmphasisExpression__CAssignment_0_0_2 : ( ruleScratchExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5471:1: ( ( ruleScratchExpression ) )
            // InternalMyDsl.g:5472:2: ( ruleScratchExpression )
            {
            // InternalMyDsl.g:5472:2: ( ruleScratchExpression )
            // InternalMyDsl.g:5473:3: ruleScratchExpression
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
    // InternalMyDsl.g:5482:1: rule__EmphasisExpression__CAssignment_1 : ( ruleNaturalExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5486:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5487:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5487:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5488:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5497:1: rule__StrongExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__StrongExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5501:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5502:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5502:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5503:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5512:1: rule__ItalicExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__ItalicExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5516:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5517:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5517:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5518:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5527:1: rule__ScratchExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__ScratchExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5531:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5532:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5532:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5533:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5542:1: rule__NaturalExpression__ValueAssignment_1 : ( ruleContent ) ;
    public final void rule__NaturalExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5546:1: ( ( ruleContent ) )
            // InternalMyDsl.g:5547:2: ( ruleContent )
            {
            // InternalMyDsl.g:5547:2: ( ruleContent )
            // InternalMyDsl.g:5548:3: ruleContent
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
        // InternalMyDsl.g:617:5: ( rule__EmphasisExpression__Alternatives )
        // InternalMyDsl.g:617:5: rule__EmphasisExpression__Alternatives
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
        // InternalMyDsl.g:780:2: ( ( ( rule__Expression__Group_0__0 ) ) )
        // InternalMyDsl.g:780:2: ( ( rule__Expression__Group_0__0 ) )
        {
        // InternalMyDsl.g:780:2: ( ( rule__Expression__Group_0__0 ) )
        // InternalMyDsl.g:781:3: ( rule__Expression__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getGroup_0()); 
        }
        // InternalMyDsl.g:782:3: ( rule__Expression__Group_0__0 )
        // InternalMyDsl.g:782:4: rule__Expression__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__Expression__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // $ANTLR start synpred13_InternalMyDsl
    public final void synpred13_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:921:2: ( ( ( rule__TextExpression__Group_0__0 ) ) )
        // InternalMyDsl.g:921:2: ( ( rule__TextExpression__Group_0__0 ) )
        {
        // InternalMyDsl.g:921:2: ( ( rule__TextExpression__Group_0__0 ) )
        // InternalMyDsl.g:922:3: ( rule__TextExpression__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTextExpressionAccess().getGroup_0()); 
        }
        // InternalMyDsl.g:923:3: ( rule__TextExpression__Group_0__0 )
        // InternalMyDsl.g:923:4: rule__TextExpression__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__TextExpression__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalMyDsl

    // $ANTLR start synpred19_InternalMyDsl
    public final void synpred19_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1025:5: ( rule__ListExpression__Group_1__0 )
        // InternalMyDsl.g:1025:5: rule__ListExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ListExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalMyDsl

    // $ANTLR start synpred37_InternalMyDsl
    public final void synpred37_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1346:3: ( RULE_BL )
        // InternalMyDsl.g:1346:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalMyDsl

    // $ANTLR start synpred38_InternalMyDsl
    public final void synpred38_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1400:3: ( RULE_BL )
        // InternalMyDsl.g:1400:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalMyDsl

    // $ANTLR start synpred39_InternalMyDsl
    public final void synpred39_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1454:3: ( RULE_BL )
        // InternalMyDsl.g:1454:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalMyDsl

    // $ANTLR start synpred40_InternalMyDsl
    public final void synpred40_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1622:4: ( rule__HorizontalExpression__Alternatives_3 )
        // InternalMyDsl.g:1622:4: rule__HorizontalExpression__Alternatives_3
        {
        pushFollow(FOLLOW_2);
        rule__HorizontalExpression__Alternatives_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalMyDsl

    // $ANTLR start synpred41_InternalMyDsl
    public final void synpred41_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1764:4: ( rule__ListExpression__Group_0_1__0 )
        // InternalMyDsl.g:1764:4: rule__ListExpression__Group_0_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ListExpression__Group_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalMyDsl

    // $ANTLR start synpred43_InternalMyDsl
    public final void synpred43_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1880:3: ( RULE_BL )
        // InternalMyDsl.g:1880:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalMyDsl

    // $ANTLR start synpred45_InternalMyDsl
    public final void synpred45_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2022:3: ( RULE_BL )
        // InternalMyDsl.g:2022:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalMyDsl

    // $ANTLR start synpred46_InternalMyDsl
    public final void synpred46_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2110:4: ( rule__QuoteExpression__ContentAssignment_2 )
        // InternalMyDsl.g:2110:4: rule__QuoteExpression__ContentAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__QuoteExpression__ContentAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalMyDsl

    // $ANTLR start synpred47_InternalMyDsl
    public final void synpred47_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2137:3: ( RULE_BL )
        // InternalMyDsl.g:2137:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalMyDsl

    // $ANTLR start synpred48_InternalMyDsl
    public final void synpred48_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2326:3: ( rule__TabExpression__Group_1_0_3__0 )
        // InternalMyDsl.g:2326:3: rule__TabExpression__Group_1_0_3__0
        {
        pushFollow(FOLLOW_2);
        rule__TabExpression__Group_1_0_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2529:4: ( rule__TabSeparation__Group_3__0 )
        // InternalMyDsl.g:2529:4: rule__TabSeparation__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__TabSeparation__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2556:3: ( '|' )
        // InternalMyDsl.g:2556:3: '|'
        {
        match(input,18,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalMyDsl

    // $ANTLR start synpred53_InternalMyDsl
    public final void synpred53_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2643:4: ( '-' )
        // InternalMyDsl.g:2643:4: '-'
        {
        match(input,13,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalMyDsl

    // $ANTLR start synpred54_InternalMyDsl
    public final void synpred54_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2672:3: ( '|' )
        // InternalMyDsl.g:2672:3: '|'
        {
        match(input,18,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalMyDsl

    // $ANTLR start synpred55_InternalMyDsl
    public final void synpred55_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2726:3: ( rule__LineExpression__Group_2__0 )
        // InternalMyDsl.g:2726:3: rule__LineExpression__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__LineExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalMyDsl

    // $ANTLR start synpred56_InternalMyDsl
    public final void synpred56_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2752:3: ( '|' )
        // InternalMyDsl.g:2752:3: '|'
        {
        match(input,18,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalMyDsl

    // $ANTLR start synpred57_InternalMyDsl
    public final void synpred57_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2942:3: ( rule__RefExpression__RefContentAssignment_4 )
        // InternalMyDsl.g:2942:3: rule__RefExpression__RefContentAssignment_4
        {
        pushFollow(FOLLOW_2);
        rule__RefExpression__RefContentAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalMyDsl

    // $ANTLR start synpred58_InternalMyDsl
    public final void synpred58_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2968:3: ( RULE_BL )
        // InternalMyDsl.g:2968:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalMyDsl

    // $ANTLR start synpred60_InternalMyDsl
    public final void synpred60_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3157:3: ( RULE_BL )
        // InternalMyDsl.g:3157:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalMyDsl

    // $ANTLR start synpred62_InternalMyDsl
    public final void synpred62_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3346:3: ( RULE_BL )
        // InternalMyDsl.g:3346:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalMyDsl

    // $ANTLR start synpred65_InternalMyDsl
    public final void synpred65_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3589:3: ( RULE_BL )
        // InternalMyDsl.g:3589:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalMyDsl

    // $ANTLR start synpred66_InternalMyDsl
    public final void synpred66_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3698:3: ( rule__Header1Expression__Group_3__0 )
        // InternalMyDsl.g:3698:3: rule__Header1Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header1Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalMyDsl

    // $ANTLR start synpred67_InternalMyDsl
    public final void synpred67_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3724:3: ( RULE_BL )
        // InternalMyDsl.g:3724:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalMyDsl

    // $ANTLR start synpred68_InternalMyDsl
    public final void synpred68_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3860:3: ( rule__Header2Expression__Group_3__0 )
        // InternalMyDsl.g:3860:3: rule__Header2Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header2Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalMyDsl

    // $ANTLR start synpred69_InternalMyDsl
    public final void synpred69_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3886:3: ( RULE_BL )
        // InternalMyDsl.g:3886:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalMyDsl

    // $ANTLR start synpred70_InternalMyDsl
    public final void synpred70_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4022:3: ( rule__Header3Expression__Group_3__0 )
        // InternalMyDsl.g:4022:3: rule__Header3Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header3Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalMyDsl

    // $ANTLR start synpred71_InternalMyDsl
    public final void synpred71_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4048:3: ( RULE_BL )
        // InternalMyDsl.g:4048:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalMyDsl

    // $ANTLR start synpred72_InternalMyDsl
    public final void synpred72_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4184:3: ( rule__Header4Expression__Group_3__0 )
        // InternalMyDsl.g:4184:3: rule__Header4Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header4Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalMyDsl

    // $ANTLR start synpred73_InternalMyDsl
    public final void synpred73_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4210:3: ( RULE_BL )
        // InternalMyDsl.g:4210:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalMyDsl

    // $ANTLR start synpred74_InternalMyDsl
    public final void synpred74_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4346:3: ( rule__Header5Expression__Group_3__0 )
        // InternalMyDsl.g:4346:3: rule__Header5Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header5Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalMyDsl

    // $ANTLR start synpred75_InternalMyDsl
    public final void synpred75_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4372:3: ( RULE_BL )
        // InternalMyDsl.g:4372:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalMyDsl

    // $ANTLR start synpred76_InternalMyDsl
    public final void synpred76_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4508:3: ( rule__Header6Expression__Group_3__0 )
        // InternalMyDsl.g:4508:3: rule__Header6Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header6Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_InternalMyDsl

    // $ANTLR start synpred77_InternalMyDsl
    public final void synpred77_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4534:3: ( RULE_BL )
        // InternalMyDsl.g:4534:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_InternalMyDsl

    // Delegated rules

    public final boolean synpred19_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred77_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred38_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred57_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred74_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred71_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred73_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred67_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred75_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred69_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalMyDsl_fragment(); // can never throw exception
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
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\1\31\uffff";
    static final String dfa_3s = "\1\4\11\uffff\2\0\2\uffff\1\0\2\uffff\5\0\1\uffff\2\0\1\uffff";
    static final String dfa_4s = "\1\44\11\uffff\2\0\2\uffff\1\0\2\uffff\5\0\1\uffff\2\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\27\uffff\1\1";
    static final String dfa_6s = "\12\uffff\1\0\1\1\2\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\22\1\23\1\16\1\1\5\uffff\1\12\1\13\2\1\1\24\1\21\1\25\1\uffff\2\1\3\uffff\2\1\1\uffff\6\1\1\27\1\30",
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
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
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
            return "()* loopback of 617:4: ( rule__EmphasisExpression__Alternatives )*";
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
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_18 = input.LA(1);

                         
                        int index1_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_18);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_19 = input.LA(1);

                         
                        int index1_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_19);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_20 = input.LA(1);

                         
                        int index1_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_21 = input.LA(1);

                         
                        int index1_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_21);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_23 = input.LA(1);

                         
                        int index1_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_23);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_24 = input.LA(1);

                         
                        int index1_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_24);
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
    static final String dfa_8s = "\30\uffff";
    static final String dfa_9s = "\1\4\7\uffff\3\0\2\uffff\1\0\12\uffff";
    static final String dfa_10s = "\1\44\7\uffff\3\0\2\uffff\1\0\12\uffff";
    static final String dfa_11s = "\1\uffff\1\1\14\uffff\1\2\11\uffff";
    static final String dfa_12s = "\10\uffff\1\0\1\1\1\2\2\uffff\1\3\12\uffff}>";
    static final String[] dfa_13s = {
            "\2\16\1\15\1\1\5\uffff\1\11\1\12\2\1\3\16\1\uffff\1\16\1\10\3\uffff\2\16\1\uffff\6\1\2\16",
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
            return "775:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );";
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

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_13);
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
    static final String dfa_14s = "\25\uffff";
    static final String dfa_15s = "\3\uffff\6\11\2\uffff\11\11\1\uffff";
    static final String dfa_16s = "\1\4\1\uffff\1\0\6\4\1\uffff\1\0\11\4\1\0";
    static final String dfa_17s = "\1\44\1\uffff\1\0\6\44\1\uffff\1\0\11\44\1\0";
    static final String dfa_18s = "\1\uffff\1\1\7\uffff\1\2\13\uffff";
    static final String dfa_19s = "\2\uffff\1\0\7\uffff\1\2\11\uffff\1\1}>";
    static final String[] dfa_20s = {
            "\1\3\1\4\1\5\6\uffff\1\7\1\11\2\uffff\1\6\1\2\1\10\1\uffff\2\1\3\uffff\2\1\7\uffff\2\11",
            "",
            "\1\uffff",
            "\3\11\1\13\5\uffff\5\11\1\12\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\5\11\1\12\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\5\11\1\12\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\5\11\1\12\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\5\11\1\12\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\5\11\1\12\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "",
            "\1\uffff",
            "\4\11\5\uffff\1\14\4\11\1\15\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\16\6\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\4\11\5\uffff\1\17\6\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\21\4\11\1\20\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\16\6\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\4\11\5\uffff\1\22\6\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\23\4\11\1\20\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\24\6\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\23\4\11\1\20\1\11\1\uffff\2\11\3\uffff\2\11\1\uffff\10\11",
            "\1\uffff"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "916:1: rule__TextExpression__Alternatives : ( ( ( rule__TextExpression__Group_0__0 ) ) | ( ruleEmphasisExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_20 = input.LA(1);

                         
                        int index7_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_10);
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
    static final String dfa_21s = "\1\4\15\uffff\1\0\13\uffff";
    static final String dfa_22s = "\1\44\15\uffff\1\0\13\uffff";
    static final String dfa_23s = "\16\uffff\1\0\13\uffff}>";
    static final String[] dfa_24s = {
            "\2\1\1\16\1\1\5\uffff\7\1\1\uffff\2\1\3\uffff\2\1\1\uffff\10\1",
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
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_5;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 1025:4: ( rule__ListExpression__Group_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\1\4\11\uffff\3\0\15\uffff";
    static final String dfa_26s = "\1\44\11\uffff\3\0\15\uffff";
    static final String dfa_27s = "\12\uffff\1\0\1\1\1\2\15\uffff}>";
    static final String[] dfa_28s = {
            "\4\1\5\uffff\1\12\1\13\1\14\4\1\1\uffff\2\1\3\uffff\2\1\1\uffff\10\1",
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

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_5;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 1622:3: ( rule__HorizontalExpression__Alternatives_3 )*";
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
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_12 = input.LA(1);

                         
                        int index23_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_12);
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
    static final String dfa_29s = "\1\4\11\uffff\2\0\1\uffff\1\0\14\uffff";
    static final String dfa_30s = "\1\44\11\uffff\2\0\1\uffff\1\0\14\uffff";
    static final String dfa_31s = "\12\uffff\1\0\1\1\1\uffff\1\2\14\uffff}>";
    static final String[] dfa_32s = {
            "\4\1\5\uffff\1\12\1\13\1\1\1\15\3\1\1\uffff\2\1\3\uffff\2\1\1\uffff\10\1",
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
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_5;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()* loopback of 1764:3: ( rule__ListExpression__Group_0_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_10 = input.LA(1);

                         
                        int index24_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_11 = input.LA(1);

                         
                        int index24_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_13 = input.LA(1);

                         
                        int index24_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_33s = "\1\4\10\uffff\3\0\2\uffff\13\0\1\uffff";
    static final String dfa_34s = "\1\44\10\uffff\3\0\2\uffff\13\0\1\uffff";
    static final String dfa_35s = "\11\uffff\1\0\1\1\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff}>";
    static final String[] dfa_36s = {
            "\1\22\1\23\1\16\1\1\5\uffff\1\12\1\13\2\1\1\24\1\21\1\25\1\uffff\1\26\1\11\3\uffff\1\17\1\20\1\uffff\6\1\1\27\1\30",
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
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_5;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 2110:3: ( rule__QuoteExpression__ContentAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_9 = input.LA(1);

                         
                        int index29_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_10 = input.LA(1);

                         
                        int index29_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_11 = input.LA(1);

                         
                        int index29_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_14 = input.LA(1);

                         
                        int index29_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_15 = input.LA(1);

                         
                        int index29_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_16 = input.LA(1);

                         
                        int index29_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_17 = input.LA(1);

                         
                        int index29_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_18 = input.LA(1);

                         
                        int index29_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA29_19 = input.LA(1);

                         
                        int index29_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA29_20 = input.LA(1);

                         
                        int index29_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA29_21 = input.LA(1);

                         
                        int index29_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_21);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA29_22 = input.LA(1);

                         
                        int index29_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_22);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA29_23 = input.LA(1);

                         
                        int index29_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_23);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA29_24 = input.LA(1);

                         
                        int index29_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_37s = "\13\uffff";
    static final String dfa_38s = "\1\1\1\uffff\1\1\10\uffff";
    static final String dfa_39s = "\1\4\1\uffff\1\4\7\0\1\uffff";
    static final String dfa_40s = "\1\44\1\uffff\1\44\7\0\1\uffff";
    static final String dfa_41s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_42s = "\3\uffff\1\0\1\5\1\1\1\4\1\2\1\3\1\6\1\uffff}>";
    static final String[] dfa_43s = {
            "\3\1\1\2\5\uffff\7\1\1\uffff\2\1\3\uffff\2\1\1\uffff\10\1",
            "",
            "\1\6\1\7\1\3\1\1\5\uffff\1\4\3\1\1\10\1\5\1\11\1\uffff\2\1\3\uffff\2\1\1\uffff\10\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "()* loopback of 2326:2: ( rule__TabExpression__Group_1_0_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_44s = "\2\2\11\uffff";
    static final String dfa_45s = "\2\4\1\uffff\7\0\1\uffff";
    static final String dfa_46s = "\2\44\1\uffff\7\0\1\uffff";
    static final String dfa_47s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_48s = "\3\uffff\1\0\1\2\1\5\1\3\1\6\1\4\1\1\1\uffff}>";
    static final String[] dfa_49s = {
            "\4\2\5\uffff\5\2\1\1\1\2\1\uffff\2\2\3\uffff\2\2\1\uffff\10\2",
            "\1\6\1\7\1\4\1\2\5\uffff\1\3\3\2\1\10\1\5\1\11\1\uffff\2\2\3\uffff\2\2\1\uffff\10\2",
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
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_37;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()* loopback of 2726:2: ( rule__LineExpression__Group_2__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_50s = "\12\uffff";
    static final String dfa_51s = "\1\10\11\uffff";
    static final String dfa_52s = "\1\4\7\0\2\uffff";
    static final String dfa_53s = "\1\44\7\0\2\uffff";
    static final String dfa_54s = "\10\uffff\1\2\1\1";
    static final String dfa_55s = "\1\uffff\1\3\1\5\1\0\1\2\1\6\1\1\1\4\2\uffff}>";
    static final String[] dfa_56s = {
            "\1\1\1\2\1\3\1\10\5\uffff\1\5\3\10\1\4\1\6\1\7\1\uffff\2\10\3\uffff\2\10\1\uffff\10\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_50;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "2942:2: ( rule__RefExpression__RefContentAssignment_4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_3 = input.LA(1);

                         
                        int index40_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_6 = input.LA(1);

                         
                        int index40_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_4 = input.LA(1);

                         
                        int index40_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_7 = input.LA(1);

                         
                        int index40_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA40_5 = input.LA(1);

                         
                        int index40_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_57s = "\1\4\2\uffff\1\0\26\uffff";
    static final String dfa_58s = "\1\44\2\uffff\1\0\26\uffff";
    static final String dfa_59s = "\3\uffff\1\0\26\uffff}>";
    static final String[] dfa_60s = {
            "\4\1\5\uffff\7\1\1\uffff\2\1\3\uffff\2\1\1\uffff\1\3\7\1",
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
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_5;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 3698:2: ( rule__Header1Expression__Group_3__0 )*";
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
                        if ( (synpred66_InternalMyDsl()) ) {s = 25;}

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
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_5;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 3860:2: ( rule__Header2Expression__Group_3__0 )*";
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
                        if ( (synpred68_InternalMyDsl()) ) {s = 25;}

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

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_5;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 4022:2: ( rule__Header3Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_5;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 4184:2: ( rule__Header4Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_5;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 4346:2: ( rule__Header5Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_3 = input.LA(1);

                         
                        int index57_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_5;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 4508:2: ( rule__Header6Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_3 = input.LA(1);

                         
                        int index59_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000018000E6072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001FEC6FE0F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001FEC6FE0F2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000016002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000180C6E6070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000018000E6070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000018000E60F0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000C400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000018020E6070L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000018100E6070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001800004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000000L});

}