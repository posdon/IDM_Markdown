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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BL", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_ANY_OTHER", "'*'", "'-'", "'+'", "'\\''", "'|'", "'\"'", "'.'", "'>'", "'_'", "'['", "']:'", "']('", "')'", "'!['", "'[!['", "')]('", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'~~'"
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


    // $ANTLR start "entryRuleTextExpression"
    // InternalMyDsl.g:104:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:108:1: ( ruleTextExpression EOF )
            // InternalMyDsl.g:109:1: ruleTextExpression EOF
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
    // InternalMyDsl.g:119:1: ruleTextExpression : ( ( rule__TextExpression__Alternatives ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:124:2: ( ( ( rule__TextExpression__Alternatives ) ) )
            // InternalMyDsl.g:125:2: ( ( rule__TextExpression__Alternatives ) )
            {
            // InternalMyDsl.g:125:2: ( ( rule__TextExpression__Alternatives ) )
            // InternalMyDsl.g:126:3: ( rule__TextExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:127:3: ( rule__TextExpression__Alternatives )
            // InternalMyDsl.g:127:4: rule__TextExpression__Alternatives
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
    // InternalMyDsl.g:137:1: entryRuleListExpression : ruleListExpression EOF ;
    public final void entryRuleListExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:141:1: ( ruleListExpression EOF )
            // InternalMyDsl.g:142:1: ruleListExpression EOF
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
    // InternalMyDsl.g:152:1: ruleListExpression : ( ( rule__ListExpression__Alternatives ) ) ;
    public final void ruleListExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:157:2: ( ( ( rule__ListExpression__Alternatives ) ) )
            // InternalMyDsl.g:158:2: ( ( rule__ListExpression__Alternatives ) )
            {
            // InternalMyDsl.g:158:2: ( ( rule__ListExpression__Alternatives ) )
            // InternalMyDsl.g:159:3: ( rule__ListExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:160:3: ( rule__ListExpression__Alternatives )
            // InternalMyDsl.g:160:4: rule__ListExpression__Alternatives
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
    // InternalMyDsl.g:170:1: entryRuleQuoteExpression : ruleQuoteExpression EOF ;
    public final void entryRuleQuoteExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:171:1: ( ruleQuoteExpression EOF )
            // InternalMyDsl.g:172:1: ruleQuoteExpression EOF
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
    // InternalMyDsl.g:179:1: ruleQuoteExpression : ( ( rule__QuoteExpression__Group__0 ) ) ;
    public final void ruleQuoteExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:183:2: ( ( ( rule__QuoteExpression__Group__0 ) ) )
            // InternalMyDsl.g:184:2: ( ( rule__QuoteExpression__Group__0 ) )
            {
            // InternalMyDsl.g:184:2: ( ( rule__QuoteExpression__Group__0 ) )
            // InternalMyDsl.g:185:3: ( rule__QuoteExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:186:3: ( rule__QuoteExpression__Group__0 )
            // InternalMyDsl.g:186:4: rule__QuoteExpression__Group__0
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


    // $ANTLR start "entryRuleBreakLineExpression"
    // InternalMyDsl.g:195:1: entryRuleBreakLineExpression : ruleBreakLineExpression EOF ;
    public final void entryRuleBreakLineExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:196:1: ( ruleBreakLineExpression EOF )
            // InternalMyDsl.g:197:1: ruleBreakLineExpression EOF
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
    // InternalMyDsl.g:204:1: ruleBreakLineExpression : ( ( rule__BreakLineExpression__Group__0 ) ) ;
    public final void ruleBreakLineExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:208:2: ( ( ( rule__BreakLineExpression__Group__0 ) ) )
            // InternalMyDsl.g:209:2: ( ( rule__BreakLineExpression__Group__0 ) )
            {
            // InternalMyDsl.g:209:2: ( ( rule__BreakLineExpression__Group__0 ) )
            // InternalMyDsl.g:210:3: ( rule__BreakLineExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:211:3: ( rule__BreakLineExpression__Group__0 )
            // InternalMyDsl.g:211:4: rule__BreakLineExpression__Group__0
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
    // InternalMyDsl.g:220:1: entryRuleHorizontalExpression : ruleHorizontalExpression EOF ;
    public final void entryRuleHorizontalExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:221:1: ( ruleHorizontalExpression EOF )
            // InternalMyDsl.g:222:1: ruleHorizontalExpression EOF
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
    // InternalMyDsl.g:229:1: ruleHorizontalExpression : ( ( rule__HorizontalExpression__Alternatives ) ) ;
    public final void ruleHorizontalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:233:2: ( ( ( rule__HorizontalExpression__Alternatives ) ) )
            // InternalMyDsl.g:234:2: ( ( rule__HorizontalExpression__Alternatives ) )
            {
            // InternalMyDsl.g:234:2: ( ( rule__HorizontalExpression__Alternatives ) )
            // InternalMyDsl.g:235:3: ( rule__HorizontalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:236:3: ( rule__HorizontalExpression__Alternatives )
            // InternalMyDsl.g:236:4: rule__HorizontalExpression__Alternatives
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


    // $ANTLR start "entryRuleURLedExpression"
    // InternalMyDsl.g:320:1: entryRuleURLedExpression : ruleURLedExpression EOF ;
    public final void entryRuleURLedExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:321:1: ( ruleURLedExpression EOF )
            // InternalMyDsl.g:322:1: ruleURLedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleURLedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLedExpressionRule()); 
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
    // $ANTLR end "entryRuleURLedExpression"


    // $ANTLR start "ruleURLedExpression"
    // InternalMyDsl.g:329:1: ruleURLedExpression : ( ( rule__URLedExpression__Group__0 ) ) ;
    public final void ruleURLedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:2: ( ( ( rule__URLedExpression__Group__0 ) ) )
            // InternalMyDsl.g:334:2: ( ( rule__URLedExpression__Group__0 ) )
            {
            // InternalMyDsl.g:334:2: ( ( rule__URLedExpression__Group__0 ) )
            // InternalMyDsl.g:335:3: ( rule__URLedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:336:3: ( rule__URLedExpression__Group__0 )
            // InternalMyDsl.g:336:4: rule__URLedExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__URLedExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLedExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURLedExpression"


    // $ANTLR start "entryRuleRefExpression"
    // InternalMyDsl.g:345:1: entryRuleRefExpression : ruleRefExpression EOF ;
    public final void entryRuleRefExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:346:1: ( ruleRefExpression EOF )
            // InternalMyDsl.g:347:1: ruleRefExpression EOF
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
    // InternalMyDsl.g:354:1: ruleRefExpression : ( ( rule__RefExpression__Group__0 ) ) ;
    public final void ruleRefExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:2: ( ( ( rule__RefExpression__Group__0 ) ) )
            // InternalMyDsl.g:359:2: ( ( rule__RefExpression__Group__0 ) )
            {
            // InternalMyDsl.g:359:2: ( ( rule__RefExpression__Group__0 ) )
            // InternalMyDsl.g:360:3: ( rule__RefExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:361:3: ( rule__RefExpression__Group__0 )
            // InternalMyDsl.g:361:4: rule__RefExpression__Group__0
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
    // InternalMyDsl.g:370:1: entryRuleLinkExpression : ruleLinkExpression EOF ;
    public final void entryRuleLinkExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:371:1: ( ruleLinkExpression EOF )
            // InternalMyDsl.g:372:1: ruleLinkExpression EOF
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
    // InternalMyDsl.g:379:1: ruleLinkExpression : ( ( rule__LinkExpression__Group__0 ) ) ;
    public final void ruleLinkExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:2: ( ( ( rule__LinkExpression__Group__0 ) ) )
            // InternalMyDsl.g:384:2: ( ( rule__LinkExpression__Group__0 ) )
            {
            // InternalMyDsl.g:384:2: ( ( rule__LinkExpression__Group__0 ) )
            // InternalMyDsl.g:385:3: ( rule__LinkExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:386:3: ( rule__LinkExpression__Group__0 )
            // InternalMyDsl.g:386:4: rule__LinkExpression__Group__0
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
    // InternalMyDsl.g:395:1: entryRuleImageExpression : ruleImageExpression EOF ;
    public final void entryRuleImageExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:396:1: ( ruleImageExpression EOF )
            // InternalMyDsl.g:397:1: ruleImageExpression EOF
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
    // InternalMyDsl.g:404:1: ruleImageExpression : ( ( rule__ImageExpression__Group__0 ) ) ;
    public final void ruleImageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:408:2: ( ( ( rule__ImageExpression__Group__0 ) ) )
            // InternalMyDsl.g:409:2: ( ( rule__ImageExpression__Group__0 ) )
            {
            // InternalMyDsl.g:409:2: ( ( rule__ImageExpression__Group__0 ) )
            // InternalMyDsl.g:410:3: ( rule__ImageExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:411:3: ( rule__ImageExpression__Group__0 )
            // InternalMyDsl.g:411:4: rule__ImageExpression__Group__0
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
    // InternalMyDsl.g:420:1: entryRuleVideoExpression : ruleVideoExpression EOF ;
    public final void entryRuleVideoExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:421:1: ( ruleVideoExpression EOF )
            // InternalMyDsl.g:422:1: ruleVideoExpression EOF
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
    // InternalMyDsl.g:429:1: ruleVideoExpression : ( ( rule__VideoExpression__Group__0 ) ) ;
    public final void ruleVideoExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:2: ( ( ( rule__VideoExpression__Group__0 ) ) )
            // InternalMyDsl.g:434:2: ( ( rule__VideoExpression__Group__0 ) )
            {
            // InternalMyDsl.g:434:2: ( ( rule__VideoExpression__Group__0 ) )
            // InternalMyDsl.g:435:3: ( rule__VideoExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:436:3: ( rule__VideoExpression__Group__0 )
            // InternalMyDsl.g:436:4: rule__VideoExpression__Group__0
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
    // InternalMyDsl.g:445:1: entryRuleHeaderExpression : ruleHeaderExpression EOF ;
    public final void entryRuleHeaderExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:446:1: ( ruleHeaderExpression EOF )
            // InternalMyDsl.g:447:1: ruleHeaderExpression EOF
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
    // InternalMyDsl.g:454:1: ruleHeaderExpression : ( ( rule__HeaderExpression__Alternatives ) ) ;
    public final void ruleHeaderExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:2: ( ( ( rule__HeaderExpression__Alternatives ) ) )
            // InternalMyDsl.g:459:2: ( ( rule__HeaderExpression__Alternatives ) )
            {
            // InternalMyDsl.g:459:2: ( ( rule__HeaderExpression__Alternatives ) )
            // InternalMyDsl.g:460:3: ( rule__HeaderExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:461:3: ( rule__HeaderExpression__Alternatives )
            // InternalMyDsl.g:461:4: rule__HeaderExpression__Alternatives
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
    // InternalMyDsl.g:470:1: entryRuleHeader1Expression : ruleHeader1Expression EOF ;
    public final void entryRuleHeader1Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:471:1: ( ruleHeader1Expression EOF )
            // InternalMyDsl.g:472:1: ruleHeader1Expression EOF
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
    // InternalMyDsl.g:479:1: ruleHeader1Expression : ( ( rule__Header1Expression__Group__0 ) ) ;
    public final void ruleHeader1Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:2: ( ( ( rule__Header1Expression__Group__0 ) ) )
            // InternalMyDsl.g:484:2: ( ( rule__Header1Expression__Group__0 ) )
            {
            // InternalMyDsl.g:484:2: ( ( rule__Header1Expression__Group__0 ) )
            // InternalMyDsl.g:485:3: ( rule__Header1Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:486:3: ( rule__Header1Expression__Group__0 )
            // InternalMyDsl.g:486:4: rule__Header1Expression__Group__0
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
    // InternalMyDsl.g:495:1: entryRuleHeader2Expression : ruleHeader2Expression EOF ;
    public final void entryRuleHeader2Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:496:1: ( ruleHeader2Expression EOF )
            // InternalMyDsl.g:497:1: ruleHeader2Expression EOF
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
    // InternalMyDsl.g:504:1: ruleHeader2Expression : ( ( rule__Header2Expression__Group__0 ) ) ;
    public final void ruleHeader2Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:2: ( ( ( rule__Header2Expression__Group__0 ) ) )
            // InternalMyDsl.g:509:2: ( ( rule__Header2Expression__Group__0 ) )
            {
            // InternalMyDsl.g:509:2: ( ( rule__Header2Expression__Group__0 ) )
            // InternalMyDsl.g:510:3: ( rule__Header2Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:511:3: ( rule__Header2Expression__Group__0 )
            // InternalMyDsl.g:511:4: rule__Header2Expression__Group__0
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
    // InternalMyDsl.g:520:1: entryRuleHeader3Expression : ruleHeader3Expression EOF ;
    public final void entryRuleHeader3Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:521:1: ( ruleHeader3Expression EOF )
            // InternalMyDsl.g:522:1: ruleHeader3Expression EOF
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
    // InternalMyDsl.g:529:1: ruleHeader3Expression : ( ( rule__Header3Expression__Group__0 ) ) ;
    public final void ruleHeader3Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:533:2: ( ( ( rule__Header3Expression__Group__0 ) ) )
            // InternalMyDsl.g:534:2: ( ( rule__Header3Expression__Group__0 ) )
            {
            // InternalMyDsl.g:534:2: ( ( rule__Header3Expression__Group__0 ) )
            // InternalMyDsl.g:535:3: ( rule__Header3Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:536:3: ( rule__Header3Expression__Group__0 )
            // InternalMyDsl.g:536:4: rule__Header3Expression__Group__0
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
    // InternalMyDsl.g:545:1: entryRuleHeader4Expression : ruleHeader4Expression EOF ;
    public final void entryRuleHeader4Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:546:1: ( ruleHeader4Expression EOF )
            // InternalMyDsl.g:547:1: ruleHeader4Expression EOF
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
    // InternalMyDsl.g:554:1: ruleHeader4Expression : ( ( rule__Header4Expression__Group__0 ) ) ;
    public final void ruleHeader4Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:2: ( ( ( rule__Header4Expression__Group__0 ) ) )
            // InternalMyDsl.g:559:2: ( ( rule__Header4Expression__Group__0 ) )
            {
            // InternalMyDsl.g:559:2: ( ( rule__Header4Expression__Group__0 ) )
            // InternalMyDsl.g:560:3: ( rule__Header4Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:561:3: ( rule__Header4Expression__Group__0 )
            // InternalMyDsl.g:561:4: rule__Header4Expression__Group__0
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
    // InternalMyDsl.g:570:1: entryRuleHeader5Expression : ruleHeader5Expression EOF ;
    public final void entryRuleHeader5Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:571:1: ( ruleHeader5Expression EOF )
            // InternalMyDsl.g:572:1: ruleHeader5Expression EOF
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
    // InternalMyDsl.g:579:1: ruleHeader5Expression : ( ( rule__Header5Expression__Group__0 ) ) ;
    public final void ruleHeader5Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:2: ( ( ( rule__Header5Expression__Group__0 ) ) )
            // InternalMyDsl.g:584:2: ( ( rule__Header5Expression__Group__0 ) )
            {
            // InternalMyDsl.g:584:2: ( ( rule__Header5Expression__Group__0 ) )
            // InternalMyDsl.g:585:3: ( rule__Header5Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:586:3: ( rule__Header5Expression__Group__0 )
            // InternalMyDsl.g:586:4: rule__Header5Expression__Group__0
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
    // InternalMyDsl.g:595:1: entryRuleHeader6Expression : ruleHeader6Expression EOF ;
    public final void entryRuleHeader6Expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:596:1: ( ruleHeader6Expression EOF )
            // InternalMyDsl.g:597:1: ruleHeader6Expression EOF
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
    // InternalMyDsl.g:604:1: ruleHeader6Expression : ( ( rule__Header6Expression__Group__0 ) ) ;
    public final void ruleHeader6Expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:2: ( ( ( rule__Header6Expression__Group__0 ) ) )
            // InternalMyDsl.g:609:2: ( ( rule__Header6Expression__Group__0 ) )
            {
            // InternalMyDsl.g:609:2: ( ( rule__Header6Expression__Group__0 ) )
            // InternalMyDsl.g:610:3: ( rule__Header6Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:611:3: ( rule__Header6Expression__Group__0 )
            // InternalMyDsl.g:611:4: rule__Header6Expression__Group__0
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
    // InternalMyDsl.g:620:1: entryRuleEmphasisExpression : ruleEmphasisExpression EOF ;
    public final void entryRuleEmphasisExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:621:1: ( ruleEmphasisExpression EOF )
            // InternalMyDsl.g:622:1: ruleEmphasisExpression EOF
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
    // InternalMyDsl.g:629:1: ruleEmphasisExpression : ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) ) ;
    public final void ruleEmphasisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:633:2: ( ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) ) )
            // InternalMyDsl.g:634:2: ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) )
            {
            // InternalMyDsl.g:634:2: ( ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* ) )
            // InternalMyDsl.g:635:3: ( ( rule__EmphasisExpression__Alternatives ) ) ( ( rule__EmphasisExpression__Alternatives )* )
            {
            // InternalMyDsl.g:635:3: ( ( rule__EmphasisExpression__Alternatives ) )
            // InternalMyDsl.g:636:4: ( rule__EmphasisExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:637:4: ( rule__EmphasisExpression__Alternatives )
            // InternalMyDsl.g:637:5: rule__EmphasisExpression__Alternatives
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

            // InternalMyDsl.g:640:3: ( ( rule__EmphasisExpression__Alternatives )* )
            // InternalMyDsl.g:641:4: ( rule__EmphasisExpression__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:642:4: ( rule__EmphasisExpression__Alternatives )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:642:5: rule__EmphasisExpression__Alternatives
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
    // InternalMyDsl.g:652:1: entryRuleStrongExpression : ruleStrongExpression EOF ;
    public final void entryRuleStrongExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:656:1: ( ruleStrongExpression EOF )
            // InternalMyDsl.g:657:1: ruleStrongExpression EOF
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
    // InternalMyDsl.g:667:1: ruleStrongExpression : ( ( rule__StrongExpression__Group__0 ) ) ;
    public final void ruleStrongExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:672:2: ( ( ( rule__StrongExpression__Group__0 ) ) )
            // InternalMyDsl.g:673:2: ( ( rule__StrongExpression__Group__0 ) )
            {
            // InternalMyDsl.g:673:2: ( ( rule__StrongExpression__Group__0 ) )
            // InternalMyDsl.g:674:3: ( rule__StrongExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:675:3: ( rule__StrongExpression__Group__0 )
            // InternalMyDsl.g:675:4: rule__StrongExpression__Group__0
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
    // InternalMyDsl.g:685:1: entryRuleItalicExpression : ruleItalicExpression EOF ;
    public final void entryRuleItalicExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:689:1: ( ruleItalicExpression EOF )
            // InternalMyDsl.g:690:1: ruleItalicExpression EOF
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
    // InternalMyDsl.g:700:1: ruleItalicExpression : ( ( rule__ItalicExpression__Group__0 ) ) ;
    public final void ruleItalicExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:705:2: ( ( ( rule__ItalicExpression__Group__0 ) ) )
            // InternalMyDsl.g:706:2: ( ( rule__ItalicExpression__Group__0 ) )
            {
            // InternalMyDsl.g:706:2: ( ( rule__ItalicExpression__Group__0 ) )
            // InternalMyDsl.g:707:3: ( rule__ItalicExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:708:3: ( rule__ItalicExpression__Group__0 )
            // InternalMyDsl.g:708:4: rule__ItalicExpression__Group__0
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
    // InternalMyDsl.g:718:1: entryRuleScratchExpression : ruleScratchExpression EOF ;
    public final void entryRuleScratchExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:722:1: ( ruleScratchExpression EOF )
            // InternalMyDsl.g:723:1: ruleScratchExpression EOF
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
    // InternalMyDsl.g:733:1: ruleScratchExpression : ( ( rule__ScratchExpression__Group__0 ) ) ;
    public final void ruleScratchExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:738:2: ( ( ( rule__ScratchExpression__Group__0 ) ) )
            // InternalMyDsl.g:739:2: ( ( rule__ScratchExpression__Group__0 ) )
            {
            // InternalMyDsl.g:739:2: ( ( rule__ScratchExpression__Group__0 ) )
            // InternalMyDsl.g:740:3: ( rule__ScratchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:741:3: ( rule__ScratchExpression__Group__0 )
            // InternalMyDsl.g:741:4: rule__ScratchExpression__Group__0
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
    // InternalMyDsl.g:751:1: entryRuleNaturalExpression : ruleNaturalExpression EOF ;
    public final void entryRuleNaturalExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:752:1: ( ruleNaturalExpression EOF )
            // InternalMyDsl.g:753:1: ruleNaturalExpression EOF
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
    // InternalMyDsl.g:760:1: ruleNaturalExpression : ( ( rule__NaturalExpression__Group__0 ) ) ;
    public final void ruleNaturalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:2: ( ( ( rule__NaturalExpression__Group__0 ) ) )
            // InternalMyDsl.g:765:2: ( ( rule__NaturalExpression__Group__0 ) )
            {
            // InternalMyDsl.g:765:2: ( ( rule__NaturalExpression__Group__0 ) )
            // InternalMyDsl.g:766:3: ( rule__NaturalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:767:3: ( rule__NaturalExpression__Group__0 )
            // InternalMyDsl.g:767:4: rule__NaturalExpression__Group__0
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
    // InternalMyDsl.g:776:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:777:1: ( ruleContent EOF )
            // InternalMyDsl.g:778:1: ruleContent EOF
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
    // InternalMyDsl.g:785:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:789:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalMyDsl.g:790:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalMyDsl.g:790:2: ( ( rule__Content__Alternatives ) )
            // InternalMyDsl.g:791:3: ( rule__Content__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:792:3: ( rule__Content__Alternatives )
            // InternalMyDsl.g:792:4: rule__Content__Alternatives
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
    // InternalMyDsl.g:800:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:805:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:805:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalMyDsl.g:806:3: ( rule__Expression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:807:3: ( rule__Expression__Group_0__0 )
                    // InternalMyDsl.g:807:4: rule__Expression__Group_0__0
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
                    // InternalMyDsl.g:811:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:811:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalMyDsl.g:812:3: ( rule__Expression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:813:3: ( rule__Expression__Group_1__0 )
                    // InternalMyDsl.g:813:4: rule__Expression__Group_1__0
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
    // InternalMyDsl.g:821:1: rule__Expression__Alternatives_0_0 : ( ( ( rule__Expression__CAssignment_0_0_0 ) ) | ( ( rule__Expression__CAssignment_0_0_1 ) ) | ( ( rule__Expression__CAssignment_0_0_2 ) ) | ( ( rule__Expression__Group_0_0_3__0 ) ) | ( ( rule__Expression__Group_0_0_4__0 ) ) );
    public final void rule__Expression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( ( ( rule__Expression__CAssignment_0_0_0 ) ) | ( ( rule__Expression__CAssignment_0_0_1 ) ) | ( ( rule__Expression__CAssignment_0_0_2 ) ) | ( ( rule__Expression__Group_0_0_3__0 ) ) | ( ( rule__Expression__Group_0_0_4__0 ) ) )
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
            case 14:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==14) ) {
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
            case 21:
                {
                alt3=4;
                }
                break;
            case RULE_INT:
            case 13:
            case 15:
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
                    // InternalMyDsl.g:826:2: ( ( rule__Expression__CAssignment_0_0_0 ) )
                    {
                    // InternalMyDsl.g:826:2: ( ( rule__Expression__CAssignment_0_0_0 ) )
                    // InternalMyDsl.g:827:3: ( rule__Expression__CAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCAssignment_0_0_0()); 
                    }
                    // InternalMyDsl.g:828:3: ( rule__Expression__CAssignment_0_0_0 )
                    // InternalMyDsl.g:828:4: rule__Expression__CAssignment_0_0_0
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
                    // InternalMyDsl.g:832:2: ( ( rule__Expression__CAssignment_0_0_1 ) )
                    {
                    // InternalMyDsl.g:832:2: ( ( rule__Expression__CAssignment_0_0_1 ) )
                    // InternalMyDsl.g:833:3: ( rule__Expression__CAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCAssignment_0_0_1()); 
                    }
                    // InternalMyDsl.g:834:3: ( rule__Expression__CAssignment_0_0_1 )
                    // InternalMyDsl.g:834:4: rule__Expression__CAssignment_0_0_1
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
                    // InternalMyDsl.g:838:2: ( ( rule__Expression__CAssignment_0_0_2 ) )
                    {
                    // InternalMyDsl.g:838:2: ( ( rule__Expression__CAssignment_0_0_2 ) )
                    // InternalMyDsl.g:839:3: ( rule__Expression__CAssignment_0_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCAssignment_0_0_2()); 
                    }
                    // InternalMyDsl.g:840:3: ( rule__Expression__CAssignment_0_0_2 )
                    // InternalMyDsl.g:840:4: rule__Expression__CAssignment_0_0_2
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
                    // InternalMyDsl.g:844:2: ( ( rule__Expression__Group_0_0_3__0 ) )
                    {
                    // InternalMyDsl.g:844:2: ( ( rule__Expression__Group_0_0_3__0 ) )
                    // InternalMyDsl.g:845:3: ( rule__Expression__Group_0_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_0_0_3()); 
                    }
                    // InternalMyDsl.g:846:3: ( rule__Expression__Group_0_0_3__0 )
                    // InternalMyDsl.g:846:4: rule__Expression__Group_0_0_3__0
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
                    // InternalMyDsl.g:850:2: ( ( rule__Expression__Group_0_0_4__0 ) )
                    {
                    // InternalMyDsl.g:850:2: ( ( rule__Expression__Group_0_0_4__0 ) )
                    // InternalMyDsl.g:851:3: ( rule__Expression__Group_0_0_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_0_0_4()); 
                    }
                    // InternalMyDsl.g:852:3: ( rule__Expression__Group_0_0_4__0 )
                    // InternalMyDsl.g:852:4: rule__Expression__Group_0_0_4__0
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


    // $ANTLR start "rule__TextExpression__Alternatives"
    // InternalMyDsl.g:860:1: rule__TextExpression__Alternatives : ( ( ( rule__TextExpression__Group_0__0 ) ) | ( ruleEmphasisExpression ) );
    public final void rule__TextExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( ( rule__TextExpression__Group_0__0 ) ) | ( ruleEmphasisExpression ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:865:2: ( ( rule__TextExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:865:2: ( ( rule__TextExpression__Group_0__0 ) )
                    // InternalMyDsl.g:866:3: ( rule__TextExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:867:3: ( rule__TextExpression__Group_0__0 )
                    // InternalMyDsl.g:867:4: rule__TextExpression__Group_0__0
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
                    // InternalMyDsl.g:871:2: ( ruleEmphasisExpression )
                    {
                    // InternalMyDsl.g:871:2: ( ruleEmphasisExpression )
                    // InternalMyDsl.g:872:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:881:1: rule__TextExpression__Alternatives_0_0 : ( ( ( ruleURLedExpression ) ) | ( ruleTabExpression ) | ( ruleQuoteExpression ) );
    public final void rule__TextExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( ( ( ruleURLedExpression ) ) | ( ruleTabExpression ) | ( ruleQuoteExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
            case 26:
            case 27:
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
            case 20:
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
                    // InternalMyDsl.g:886:2: ( ( ruleURLedExpression ) )
                    {
                    // InternalMyDsl.g:886:2: ( ( ruleURLedExpression ) )
                    // InternalMyDsl.g:887:3: ( ruleURLedExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextExpressionAccess().getURLedExpressionParserRuleCall_0_0_0()); 
                    }
                    // InternalMyDsl.g:888:3: ( ruleURLedExpression )
                    // InternalMyDsl.g:888:4: ruleURLedExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleURLedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextExpressionAccess().getURLedExpressionParserRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:892:2: ( ruleTabExpression )
                    {
                    // InternalMyDsl.g:892:2: ( ruleTabExpression )
                    // InternalMyDsl.g:893:3: ruleTabExpression
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
                    // InternalMyDsl.g:898:2: ( ruleQuoteExpression )
                    {
                    // InternalMyDsl.g:898:2: ( ruleQuoteExpression )
                    // InternalMyDsl.g:899:3: ruleQuoteExpression
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


    // $ANTLR start "rule__ListExpression__Alternatives"
    // InternalMyDsl.g:908:1: rule__ListExpression__Alternatives : ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) ) );
    public final void rule__ListExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:912:1: ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=13 && LA7_0<=15)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
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
                    // InternalMyDsl.g:913:2: ( ( rule__ListExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:913:2: ( ( rule__ListExpression__Group_0__0 ) )
                    // InternalMyDsl.g:914:3: ( rule__ListExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:915:3: ( rule__ListExpression__Group_0__0 )
                    // InternalMyDsl.g:915:4: rule__ListExpression__Group_0__0
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
                    // InternalMyDsl.g:919:2: ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) )
                    {
                    // InternalMyDsl.g:919:2: ( ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* ) )
                    // InternalMyDsl.g:920:3: ( ( rule__ListExpression__Group_1__0 ) ) ( ( rule__ListExpression__Group_1__0 )* )
                    {
                    // InternalMyDsl.g:920:3: ( ( rule__ListExpression__Group_1__0 ) )
                    // InternalMyDsl.g:921:4: ( rule__ListExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:922:4: ( rule__ListExpression__Group_1__0 )
                    // InternalMyDsl.g:922:5: rule__ListExpression__Group_1__0
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

                    // InternalMyDsl.g:925:3: ( ( rule__ListExpression__Group_1__0 )* )
                    // InternalMyDsl.g:926:4: ( rule__ListExpression__Group_1__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:927:4: ( rule__ListExpression__Group_1__0 )*
                    loop6:
                    do {
                        int alt6=2;
                        alt6 = dfa6.predict(input);
                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:927:5: rule__ListExpression__Group_1__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__ListExpression__Group_1__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
    // InternalMyDsl.g:936:1: rule__ListExpression__Alternatives_0_1_0 : ( ( '*' ) | ( '-' ) | ( '+' ) );
    public final void rule__ListExpression__Alternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:940:1: ( ( '*' ) | ( '-' ) | ( '+' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:941:2: ( '*' )
                    {
                    // InternalMyDsl.g:941:2: ( '*' )
                    // InternalMyDsl.g:942:3: '*'
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
                    // InternalMyDsl.g:947:2: ( '-' )
                    {
                    // InternalMyDsl.g:947:2: ( '-' )
                    // InternalMyDsl.g:948:3: '-'
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
                    // InternalMyDsl.g:953:2: ( '+' )
                    {
                    // InternalMyDsl.g:953:2: ( '+' )
                    // InternalMyDsl.g:954:3: '+'
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


    // $ANTLR start "rule__HorizontalExpression__Alternatives"
    // InternalMyDsl.g:963:1: rule__HorizontalExpression__Alternatives : ( ( ( rule__HorizontalExpression__Group_0__0 ) ) | ( ( rule__HorizontalExpression__Group_1__0 ) ) );
    public final void rule__HorizontalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:967:1: ( ( ( rule__HorizontalExpression__Group_0__0 ) ) | ( ( rule__HorizontalExpression__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
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
                    // InternalMyDsl.g:968:2: ( ( rule__HorizontalExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:968:2: ( ( rule__HorizontalExpression__Group_0__0 ) )
                    // InternalMyDsl.g:969:3: ( rule__HorizontalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:970:3: ( rule__HorizontalExpression__Group_0__0 )
                    // InternalMyDsl.g:970:4: rule__HorizontalExpression__Group_0__0
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
                    // InternalMyDsl.g:974:2: ( ( rule__HorizontalExpression__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:974:2: ( ( rule__HorizontalExpression__Group_1__0 ) )
                    // InternalMyDsl.g:975:3: ( rule__HorizontalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHorizontalExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:976:3: ( rule__HorizontalExpression__Group_1__0 )
                    // InternalMyDsl.g:976:4: rule__HorizontalExpression__Group_1__0
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

            }
        }
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


    // $ANTLR start "rule__URLedExpression__Alternatives_1"
    // InternalMyDsl.g:984:1: rule__URLedExpression__Alternatives_1 : ( ( ( rule__URLedExpression__Group_1_0__0 ) ) | ( ( rule__URLedExpression__CAssignment_1_1 ) ) );
    public final void rule__URLedExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( ( rule__URLedExpression__Group_1_0__0 ) ) | ( ( rule__URLedExpression__CAssignment_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
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
                    // InternalMyDsl.g:989:2: ( ( rule__URLedExpression__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:989:2: ( ( rule__URLedExpression__Group_1_0__0 ) )
                    // InternalMyDsl.g:990:3: ( rule__URLedExpression__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLedExpressionAccess().getGroup_1_0()); 
                    }
                    // InternalMyDsl.g:991:3: ( rule__URLedExpression__Group_1_0__0 )
                    // InternalMyDsl.g:991:4: rule__URLedExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__URLedExpression__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURLedExpressionAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:995:2: ( ( rule__URLedExpression__CAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:995:2: ( ( rule__URLedExpression__CAssignment_1_1 ) )
                    // InternalMyDsl.g:996:3: ( rule__URLedExpression__CAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLedExpressionAccess().getCAssignment_1_1()); 
                    }
                    // InternalMyDsl.g:997:3: ( rule__URLedExpression__CAssignment_1_1 )
                    // InternalMyDsl.g:997:4: rule__URLedExpression__CAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__URLedExpression__CAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURLedExpressionAccess().getCAssignment_1_1()); 
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
    // $ANTLR end "rule__URLedExpression__Alternatives_1"


    // $ANTLR start "rule__URLedExpression__Alternatives_1_0_0"
    // InternalMyDsl.g:1005:1: rule__URLedExpression__Alternatives_1_0_0 : ( ( ( rule__URLedExpression__CAssignment_1_0_0_0 ) ) | ( ( rule__URLedExpression__CAssignment_1_0_0_1 ) ) );
    public final void rule__URLedExpression__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( ( rule__URLedExpression__CAssignment_1_0_0_0 ) ) | ( ( rule__URLedExpression__CAssignment_1_0_0_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
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
                    // InternalMyDsl.g:1010:2: ( ( rule__URLedExpression__CAssignment_1_0_0_0 ) )
                    {
                    // InternalMyDsl.g:1010:2: ( ( rule__URLedExpression__CAssignment_1_0_0_0 ) )
                    // InternalMyDsl.g:1011:3: ( rule__URLedExpression__CAssignment_1_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLedExpressionAccess().getCAssignment_1_0_0_0()); 
                    }
                    // InternalMyDsl.g:1012:3: ( rule__URLedExpression__CAssignment_1_0_0_0 )
                    // InternalMyDsl.g:1012:4: rule__URLedExpression__CAssignment_1_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__URLedExpression__CAssignment_1_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURLedExpressionAccess().getCAssignment_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1016:2: ( ( rule__URLedExpression__CAssignment_1_0_0_1 ) )
                    {
                    // InternalMyDsl.g:1016:2: ( ( rule__URLedExpression__CAssignment_1_0_0_1 ) )
                    // InternalMyDsl.g:1017:3: ( rule__URLedExpression__CAssignment_1_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLedExpressionAccess().getCAssignment_1_0_0_1()); 
                    }
                    // InternalMyDsl.g:1018:3: ( rule__URLedExpression__CAssignment_1_0_0_1 )
                    // InternalMyDsl.g:1018:4: rule__URLedExpression__CAssignment_1_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__URLedExpression__CAssignment_1_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURLedExpressionAccess().getCAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__URLedExpression__Alternatives_1_0_0"


    // $ANTLR start "rule__HeaderExpression__Alternatives"
    // InternalMyDsl.g:1026:1: rule__HeaderExpression__Alternatives : ( ( ruleHeader1Expression ) | ( ruleHeader2Expression ) | ( ruleHeader3Expression ) | ( ruleHeader4Expression ) | ( ruleHeader5Expression ) | ( ruleHeader6Expression ) );
    public final void rule__HeaderExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( ruleHeader1Expression ) | ( ruleHeader2Expression ) | ( ruleHeader3Expression ) | ( ruleHeader4Expression ) | ( ruleHeader5Expression ) | ( ruleHeader6Expression ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 34:
                {
                alt12=6;
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
                    // InternalMyDsl.g:1031:2: ( ruleHeader1Expression )
                    {
                    // InternalMyDsl.g:1031:2: ( ruleHeader1Expression )
                    // InternalMyDsl.g:1032:3: ruleHeader1Expression
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
                    // InternalMyDsl.g:1037:2: ( ruleHeader2Expression )
                    {
                    // InternalMyDsl.g:1037:2: ( ruleHeader2Expression )
                    // InternalMyDsl.g:1038:3: ruleHeader2Expression
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
                    // InternalMyDsl.g:1043:2: ( ruleHeader3Expression )
                    {
                    // InternalMyDsl.g:1043:2: ( ruleHeader3Expression )
                    // InternalMyDsl.g:1044:3: ruleHeader3Expression
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
                    // InternalMyDsl.g:1049:2: ( ruleHeader4Expression )
                    {
                    // InternalMyDsl.g:1049:2: ( ruleHeader4Expression )
                    // InternalMyDsl.g:1050:3: ruleHeader4Expression
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
                    // InternalMyDsl.g:1055:2: ( ruleHeader5Expression )
                    {
                    // InternalMyDsl.g:1055:2: ( ruleHeader5Expression )
                    // InternalMyDsl.g:1056:3: ruleHeader5Expression
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
                    // InternalMyDsl.g:1061:2: ( ruleHeader6Expression )
                    {
                    // InternalMyDsl.g:1061:2: ( ruleHeader6Expression )
                    // InternalMyDsl.g:1062:3: ruleHeader6Expression
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
    // InternalMyDsl.g:1071:1: rule__EmphasisExpression__Alternatives : ( ( ( rule__EmphasisExpression__Group_0__0 ) ) | ( ( rule__EmphasisExpression__CAssignment_1 ) ) );
    public final void rule__EmphasisExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1075:1: ( ( ( rule__EmphasisExpression__Group_0__0 ) ) | ( ( rule__EmphasisExpression__CAssignment_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13||(LA13_0>=35 && LA13_0<=36)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==14||(LA13_0>=16 && LA13_0<=18)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1076:2: ( ( rule__EmphasisExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1076:2: ( ( rule__EmphasisExpression__Group_0__0 ) )
                    // InternalMyDsl.g:1077:3: ( rule__EmphasisExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1078:3: ( rule__EmphasisExpression__Group_0__0 )
                    // InternalMyDsl.g:1078:4: rule__EmphasisExpression__Group_0__0
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
                    // InternalMyDsl.g:1082:2: ( ( rule__EmphasisExpression__CAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1082:2: ( ( rule__EmphasisExpression__CAssignment_1 ) )
                    // InternalMyDsl.g:1083:3: ( rule__EmphasisExpression__CAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_1()); 
                    }
                    // InternalMyDsl.g:1084:3: ( rule__EmphasisExpression__CAssignment_1 )
                    // InternalMyDsl.g:1084:4: rule__EmphasisExpression__CAssignment_1
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
    // InternalMyDsl.g:1092:1: rule__EmphasisExpression__Alternatives_0_0 : ( ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) ) );
    public final void rule__EmphasisExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt14=1;
                }
                break;
            case 13:
                {
                alt14=2;
                }
                break;
            case 36:
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
                    // InternalMyDsl.g:1097:2: ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) )
                    {
                    // InternalMyDsl.g:1097:2: ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) )
                    // InternalMyDsl.g:1098:3: ( rule__EmphasisExpression__CAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_0()); 
                    }
                    // InternalMyDsl.g:1099:3: ( rule__EmphasisExpression__CAssignment_0_0_0 )
                    // InternalMyDsl.g:1099:4: rule__EmphasisExpression__CAssignment_0_0_0
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
                    // InternalMyDsl.g:1103:2: ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) )
                    {
                    // InternalMyDsl.g:1103:2: ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) )
                    // InternalMyDsl.g:1104:3: ( rule__EmphasisExpression__CAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_1()); 
                    }
                    // InternalMyDsl.g:1105:3: ( rule__EmphasisExpression__CAssignment_0_0_1 )
                    // InternalMyDsl.g:1105:4: rule__EmphasisExpression__CAssignment_0_0_1
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
                    // InternalMyDsl.g:1109:2: ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) )
                    {
                    // InternalMyDsl.g:1109:2: ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) )
                    // InternalMyDsl.g:1110:3: ( rule__EmphasisExpression__CAssignment_0_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_2()); 
                    }
                    // InternalMyDsl.g:1111:3: ( rule__EmphasisExpression__CAssignment_0_0_2 )
                    // InternalMyDsl.g:1111:4: rule__EmphasisExpression__CAssignment_0_0_2
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
    // InternalMyDsl.g:1119:1: rule__Content__Alternatives : ( ( ( rule__Content__Group_0__0 ) ) | ( '\\'' ) | ( '-' ) | ( '|' ) | ( '\"' ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( ( ( rule__Content__Group_0__0 ) ) | ( '\\'' ) | ( '-' ) | ( '|' ) | ( '\"' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case 16:
                {
                alt15=2;
                }
                break;
            case 14:
                {
                alt15=3;
                }
                break;
            case 17:
                {
                alt15=4;
                }
                break;
            case 18:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1124:2: ( ( rule__Content__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1124:2: ( ( rule__Content__Group_0__0 ) )
                    // InternalMyDsl.g:1125:3: ( rule__Content__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1126:3: ( rule__Content__Group_0__0 )
                    // InternalMyDsl.g:1126:4: rule__Content__Group_0__0
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
                    // InternalMyDsl.g:1130:2: ( '\\'' )
                    {
                    // InternalMyDsl.g:1130:2: ( '\\'' )
                    // InternalMyDsl.g:1131:3: '\\''
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
                    // InternalMyDsl.g:1136:2: ( '-' )
                    {
                    // InternalMyDsl.g:1136:2: ( '-' )
                    // InternalMyDsl.g:1137:3: '-'
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
                    // InternalMyDsl.g:1142:2: ( '|' )
                    {
                    // InternalMyDsl.g:1142:2: ( '|' )
                    // InternalMyDsl.g:1143:3: '|'
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
                    // InternalMyDsl.g:1148:2: ( '\"' )
                    {
                    // InternalMyDsl.g:1148:2: ( '\"' )
                    // InternalMyDsl.g:1149:3: '\"'
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
    // InternalMyDsl.g:1158:1: rule__Content__Alternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__Content__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case RULE_INT:
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
                    // InternalMyDsl.g:1163:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1163:2: ( RULE_ID )
                    // InternalMyDsl.g:1164:3: RULE_ID
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
                    // InternalMyDsl.g:1169:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1169:2: ( RULE_STRING )
                    // InternalMyDsl.g:1170:3: RULE_STRING
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
                    // InternalMyDsl.g:1175:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1175:2: ( RULE_INT )
                    // InternalMyDsl.g:1176:3: RULE_INT
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
    // InternalMyDsl.g:1185:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalMyDsl.g:1190:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalMyDsl.g:1197:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( ( () ) )
            // InternalMyDsl.g:1202:1: ( () )
            {
            // InternalMyDsl.g:1202:1: ( () )
            // InternalMyDsl.g:1203:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalMyDsl.g:1204:2: ()
            // InternalMyDsl.g:1204:3: 
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
    // InternalMyDsl.g:1212:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( rule__File__Group__1__Impl )
            // InternalMyDsl.g:1217:2: rule__File__Group__1__Impl
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
    // InternalMyDsl.g:1223:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1227:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalMyDsl.g:1228:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalMyDsl.g:1228:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalMyDsl.g:1229:2: ( rule__File__ExpressionAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            }
            // InternalMyDsl.g:1230:2: ( rule__File__ExpressionAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_BL)||(LA17_0>=13 && LA17_0<=18)||(LA17_0>=20 && LA17_0<=22)||(LA17_0>=26 && LA17_0<=27)||(LA17_0>=29 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1230:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:1239:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( rule__Expression__Group_0__0__Impl )
            // InternalMyDsl.g:1244:2: rule__Expression__Group_0__0__Impl
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
    // InternalMyDsl.g:1250:1: rule__Expression__Group_0__0__Impl : ( ( rule__Expression__Alternatives_0_0 ) ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1254:1: ( ( ( rule__Expression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:1255:1: ( ( rule__Expression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:1255:1: ( ( rule__Expression__Alternatives_0_0 ) )
            // InternalMyDsl.g:1256:2: ( rule__Expression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:1257:2: ( rule__Expression__Alternatives_0_0 )
            // InternalMyDsl.g:1257:3: rule__Expression__Alternatives_0_0
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
    // InternalMyDsl.g:1266:1: rule__Expression__Group_0_0_3__0 : rule__Expression__Group_0_0_3__0__Impl rule__Expression__Group_0_0_3__1 ;
    public final void rule__Expression__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( rule__Expression__Group_0_0_3__0__Impl rule__Expression__Group_0_0_3__1 )
            // InternalMyDsl.g:1271:2: rule__Expression__Group_0_0_3__0__Impl rule__Expression__Group_0_0_3__1
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
    // InternalMyDsl.g:1278:1: rule__Expression__Group_0_0_3__0__Impl : ( ( rule__Expression__CAssignment_0_0_3_0 ) ) ;
    public final void rule__Expression__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( ( ( rule__Expression__CAssignment_0_0_3_0 ) ) )
            // InternalMyDsl.g:1283:1: ( ( rule__Expression__CAssignment_0_0_3_0 ) )
            {
            // InternalMyDsl.g:1283:1: ( ( rule__Expression__CAssignment_0_0_3_0 ) )
            // InternalMyDsl.g:1284:2: ( rule__Expression__CAssignment_0_0_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCAssignment_0_0_3_0()); 
            }
            // InternalMyDsl.g:1285:2: ( rule__Expression__CAssignment_0_0_3_0 )
            // InternalMyDsl.g:1285:3: rule__Expression__CAssignment_0_0_3_0
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
    // InternalMyDsl.g:1293:1: rule__Expression__Group_0_0_3__1 : rule__Expression__Group_0_0_3__1__Impl ;
    public final void rule__Expression__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( rule__Expression__Group_0_0_3__1__Impl )
            // InternalMyDsl.g:1298:2: rule__Expression__Group_0_0_3__1__Impl
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
    // InternalMyDsl.g:1304:1: rule__Expression__Group_0_0_3__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1308:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1309:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1309:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1310:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_3_1()); 
            }
            // InternalMyDsl.g:1311:2: ( RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred32_InternalMyDsl()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1311:3: RULE_BL
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
    // InternalMyDsl.g:1320:1: rule__Expression__Group_0_0_4__0 : rule__Expression__Group_0_0_4__0__Impl rule__Expression__Group_0_0_4__1 ;
    public final void rule__Expression__Group_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( rule__Expression__Group_0_0_4__0__Impl rule__Expression__Group_0_0_4__1 )
            // InternalMyDsl.g:1325:2: rule__Expression__Group_0_0_4__0__Impl rule__Expression__Group_0_0_4__1
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
    // InternalMyDsl.g:1332:1: rule__Expression__Group_0_0_4__0__Impl : ( ( rule__Expression__CAssignment_0_0_4_0 ) ) ;
    public final void rule__Expression__Group_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( ( ( rule__Expression__CAssignment_0_0_4_0 ) ) )
            // InternalMyDsl.g:1337:1: ( ( rule__Expression__CAssignment_0_0_4_0 ) )
            {
            // InternalMyDsl.g:1337:1: ( ( rule__Expression__CAssignment_0_0_4_0 ) )
            // InternalMyDsl.g:1338:2: ( rule__Expression__CAssignment_0_0_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCAssignment_0_0_4_0()); 
            }
            // InternalMyDsl.g:1339:2: ( rule__Expression__CAssignment_0_0_4_0 )
            // InternalMyDsl.g:1339:3: rule__Expression__CAssignment_0_0_4_0
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
    // InternalMyDsl.g:1347:1: rule__Expression__Group_0_0_4__1 : rule__Expression__Group_0_0_4__1__Impl ;
    public final void rule__Expression__Group_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( rule__Expression__Group_0_0_4__1__Impl )
            // InternalMyDsl.g:1352:2: rule__Expression__Group_0_0_4__1__Impl
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
    // InternalMyDsl.g:1358:1: rule__Expression__Group_0_0_4__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1362:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1363:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1363:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1364:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_4_1()); 
            }
            // InternalMyDsl.g:1365:2: ( RULE_BL )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_BL) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred33_InternalMyDsl()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1365:3: RULE_BL
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
    // InternalMyDsl.g:1374:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMyDsl.g:1379:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalMyDsl.g:1386:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__CAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( ( ( rule__Expression__CAssignment_1_0 ) ) )
            // InternalMyDsl.g:1391:1: ( ( rule__Expression__CAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1391:1: ( ( rule__Expression__CAssignment_1_0 ) )
            // InternalMyDsl.g:1392:2: ( rule__Expression__CAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCAssignment_1_0()); 
            }
            // InternalMyDsl.g:1393:2: ( rule__Expression__CAssignment_1_0 )
            // InternalMyDsl.g:1393:3: rule__Expression__CAssignment_1_0
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
    // InternalMyDsl.g:1401:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( rule__Expression__Group_1__1__Impl )
            // InternalMyDsl.g:1406:2: rule__Expression__Group_1__1__Impl
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
    // InternalMyDsl.g:1412:1: rule__Expression__Group_1__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1416:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1417:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1417:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1418:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1_1()); 
            }
            // InternalMyDsl.g:1419:2: ( RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred34_InternalMyDsl()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1419:3: RULE_BL
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


    // $ANTLR start "rule__TextExpression__Group_0__0"
    // InternalMyDsl.g:1428:1: rule__TextExpression__Group_0__0 : rule__TextExpression__Group_0__0__Impl ;
    public final void rule__TextExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( rule__TextExpression__Group_0__0__Impl )
            // InternalMyDsl.g:1433:2: rule__TextExpression__Group_0__0__Impl
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
    // InternalMyDsl.g:1439:1: rule__TextExpression__Group_0__0__Impl : ( ( rule__TextExpression__Alternatives_0_0 ) ) ;
    public final void rule__TextExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( ( ( rule__TextExpression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:1444:1: ( ( rule__TextExpression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:1444:1: ( ( rule__TextExpression__Alternatives_0_0 ) )
            // InternalMyDsl.g:1445:2: ( rule__TextExpression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:1446:2: ( rule__TextExpression__Alternatives_0_0 )
            // InternalMyDsl.g:1446:3: rule__TextExpression__Alternatives_0_0
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


    // $ANTLR start "rule__ListExpression__Group_0__0"
    // InternalMyDsl.g:1455:1: rule__ListExpression__Group_0__0 : rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 ;
    public final void rule__ListExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1459:1: ( rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 )
            // InternalMyDsl.g:1460:2: rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1467:1: rule__ListExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( () ) )
            // InternalMyDsl.g:1472:1: ( () )
            {
            // InternalMyDsl.g:1472:1: ( () )
            // InternalMyDsl.g:1473:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getListExpressionAction_0_0()); 
            }
            // InternalMyDsl.g:1474:2: ()
            // InternalMyDsl.g:1474:3: 
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
    // InternalMyDsl.g:1482:1: rule__ListExpression__Group_0__1 : rule__ListExpression__Group_0__1__Impl ;
    public final void rule__ListExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( rule__ListExpression__Group_0__1__Impl )
            // InternalMyDsl.g:1487:2: rule__ListExpression__Group_0__1__Impl
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
    // InternalMyDsl.g:1493:1: rule__ListExpression__Group_0__1__Impl : ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) ) ;
    public final void rule__ListExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1497:1: ( ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) ) )
            // InternalMyDsl.g:1498:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) )
            {
            // InternalMyDsl.g:1498:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) )
            // InternalMyDsl.g:1499:2: ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* )
            {
            // InternalMyDsl.g:1499:2: ( ( rule__ListExpression__Group_0_1__0 ) )
            // InternalMyDsl.g:1500:3: ( rule__ListExpression__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:1501:3: ( rule__ListExpression__Group_0_1__0 )
            // InternalMyDsl.g:1501:4: rule__ListExpression__Group_0_1__0
            {
            pushFollow(FOLLOW_9);
            rule__ListExpression__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }

            }

            // InternalMyDsl.g:1504:2: ( ( rule__ListExpression__Group_0_1__0 )* )
            // InternalMyDsl.g:1505:3: ( rule__ListExpression__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:1506:3: ( rule__ListExpression__Group_0_1__0 )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1506:4: rule__ListExpression__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ListExpression__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:1516:1: rule__ListExpression__Group_0_1__0 : rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 ;
    public final void rule__ListExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1520:1: ( rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 )
            // InternalMyDsl.g:1521:2: rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1528:1: rule__ListExpression__Group_0_1__0__Impl : ( ( rule__ListExpression__Alternatives_0_1_0 ) ) ;
    public final void rule__ListExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1532:1: ( ( ( rule__ListExpression__Alternatives_0_1_0 ) ) )
            // InternalMyDsl.g:1533:1: ( ( rule__ListExpression__Alternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:1533:1: ( ( rule__ListExpression__Alternatives_0_1_0 ) )
            // InternalMyDsl.g:1534:2: ( rule__ListExpression__Alternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAlternatives_0_1_0()); 
            }
            // InternalMyDsl.g:1535:2: ( rule__ListExpression__Alternatives_0_1_0 )
            // InternalMyDsl.g:1535:3: rule__ListExpression__Alternatives_0_1_0
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
    // InternalMyDsl.g:1543:1: rule__ListExpression__Group_0_1__1 : rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2 ;
    public final void rule__ListExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2 )
            // InternalMyDsl.g:1548:2: rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2
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
    // InternalMyDsl.g:1555:1: rule__ListExpression__Group_0_1__1__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__ListExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1559:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // InternalMyDsl.g:1560:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // InternalMyDsl.g:1560:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // InternalMyDsl.g:1561:2: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // InternalMyDsl.g:1561:2: ( ( RULE_WS ) )
            // InternalMyDsl.g:1562:3: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }
            // InternalMyDsl.g:1563:3: ( RULE_WS )
            // InternalMyDsl.g:1563:4: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_11); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }

            }

            // InternalMyDsl.g:1566:2: ( ( RULE_WS )* )
            // InternalMyDsl.g:1567:3: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }
            // InternalMyDsl.g:1568:3: ( RULE_WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1568:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_11); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMyDsl.g:1577:1: rule__ListExpression__Group_0_1__2 : rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3 ;
    public final void rule__ListExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3 )
            // InternalMyDsl.g:1582:2: rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3
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
    // InternalMyDsl.g:1589:1: rule__ListExpression__Group_0_1__2__Impl : ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) ) ;
    public final void rule__ListExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) ) )
            // InternalMyDsl.g:1594:1: ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) )
            {
            // InternalMyDsl.g:1594:1: ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) )
            // InternalMyDsl.g:1595:2: ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentUnorderedAssignment_0_1_2()); 
            }
            // InternalMyDsl.g:1596:2: ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 )
            // InternalMyDsl.g:1596:3: rule__ListExpression__ContentUnorderedAssignment_0_1_2
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
    // InternalMyDsl.g:1604:1: rule__ListExpression__Group_0_1__3 : rule__ListExpression__Group_0_1__3__Impl ;
    public final void rule__ListExpression__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( rule__ListExpression__Group_0_1__3__Impl )
            // InternalMyDsl.g:1609:2: rule__ListExpression__Group_0_1__3__Impl
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
    // InternalMyDsl.g:1615:1: rule__ListExpression__Group_0_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ListExpression__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1620:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1620:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1621:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_0_1_3()); 
            }
            // InternalMyDsl.g:1622:2: ( RULE_BL )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_BL) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred37_InternalMyDsl()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1622:3: RULE_BL
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
    // InternalMyDsl.g:1631:1: rule__ListExpression__Group_1__0 : rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 ;
    public final void rule__ListExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 )
            // InternalMyDsl.g:1636:2: rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1643:1: rule__ListExpression__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__ListExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1648:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1648:1: ( RULE_INT )
            // InternalMyDsl.g:1649:2: RULE_INT
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
    // InternalMyDsl.g:1658:1: rule__ListExpression__Group_1__1 : rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2 ;
    public final void rule__ListExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2 )
            // InternalMyDsl.g:1663:2: rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1670:1: rule__ListExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ListExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( ( '.' ) )
            // InternalMyDsl.g:1675:1: ( '.' )
            {
            // InternalMyDsl.g:1675:1: ( '.' )
            // InternalMyDsl.g:1676:2: '.'
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
    // InternalMyDsl.g:1685:1: rule__ListExpression__Group_1__2 : rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3 ;
    public final void rule__ListExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1689:1: ( rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3 )
            // InternalMyDsl.g:1690:2: rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3
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
    // InternalMyDsl.g:1697:1: rule__ListExpression__Group_1__2__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__ListExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1701:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // InternalMyDsl.g:1702:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // InternalMyDsl.g:1702:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // InternalMyDsl.g:1703:2: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // InternalMyDsl.g:1703:2: ( ( RULE_WS ) )
            // InternalMyDsl.g:1704:3: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }
            // InternalMyDsl.g:1705:3: ( RULE_WS )
            // InternalMyDsl.g:1705:4: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_11); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }

            }

            // InternalMyDsl.g:1708:2: ( ( RULE_WS )* )
            // InternalMyDsl.g:1709:3: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }
            // InternalMyDsl.g:1710:3: ( RULE_WS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1710:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_11); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMyDsl.g:1719:1: rule__ListExpression__Group_1__3 : rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4 ;
    public final void rule__ListExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4 )
            // InternalMyDsl.g:1724:2: rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4
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
    // InternalMyDsl.g:1731:1: rule__ListExpression__Group_1__3__Impl : ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) ) ;
    public final void rule__ListExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1735:1: ( ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) ) )
            // InternalMyDsl.g:1736:1: ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) )
            {
            // InternalMyDsl.g:1736:1: ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) )
            // InternalMyDsl.g:1737:2: ( rule__ListExpression__ContentOrderedAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentOrderedAssignment_1_3()); 
            }
            // InternalMyDsl.g:1738:2: ( rule__ListExpression__ContentOrderedAssignment_1_3 )
            // InternalMyDsl.g:1738:3: rule__ListExpression__ContentOrderedAssignment_1_3
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
    // InternalMyDsl.g:1746:1: rule__ListExpression__Group_1__4 : rule__ListExpression__Group_1__4__Impl ;
    public final void rule__ListExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( rule__ListExpression__Group_1__4__Impl )
            // InternalMyDsl.g:1751:2: rule__ListExpression__Group_1__4__Impl
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
    // InternalMyDsl.g:1757:1: rule__ListExpression__Group_1__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ListExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1761:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1762:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1762:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1763:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_1_4()); 
            }
            // InternalMyDsl.g:1764:2: ( RULE_BL )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_BL) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred39_InternalMyDsl()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1764:3: RULE_BL
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
    // InternalMyDsl.g:1773:1: rule__QuoteExpression__Group__0 : rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 ;
    public final void rule__QuoteExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 )
            // InternalMyDsl.g:1778:2: rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1785:1: rule__QuoteExpression__Group__0__Impl : ( () ) ;
    public final void rule__QuoteExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( ( () ) )
            // InternalMyDsl.g:1790:1: ( () )
            {
            // InternalMyDsl.g:1790:1: ( () )
            // InternalMyDsl.g:1791:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getQuoteExpressionAction_0()); 
            }
            // InternalMyDsl.g:1792:2: ()
            // InternalMyDsl.g:1792:3: 
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
    // InternalMyDsl.g:1800:1: rule__QuoteExpression__Group__1 : rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 ;
    public final void rule__QuoteExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 )
            // InternalMyDsl.g:1805:2: rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2
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
    // InternalMyDsl.g:1812:1: rule__QuoteExpression__Group__1__Impl : ( ( '>' ) ) ;
    public final void rule__QuoteExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1816:1: ( ( ( '>' ) ) )
            // InternalMyDsl.g:1817:1: ( ( '>' ) )
            {
            // InternalMyDsl.g:1817:1: ( ( '>' ) )
            // InternalMyDsl.g:1818:2: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1()); 
            }
            // InternalMyDsl.g:1819:2: ( '>' )
            // InternalMyDsl.g:1819:3: '>'
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
    // InternalMyDsl.g:1827:1: rule__QuoteExpression__Group__2 : rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3 ;
    public final void rule__QuoteExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3 )
            // InternalMyDsl.g:1832:2: rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3
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
    // InternalMyDsl.g:1839:1: rule__QuoteExpression__Group__2__Impl : ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) ) ;
    public final void rule__QuoteExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) ) )
            // InternalMyDsl.g:1844:1: ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) )
            {
            // InternalMyDsl.g:1844:1: ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) )
            // InternalMyDsl.g:1845:2: ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* )
            {
            // InternalMyDsl.g:1845:2: ( ( rule__QuoteExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:1846:3: ( rule__QuoteExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:1847:3: ( rule__QuoteExpression__ContentAssignment_2 )
            // InternalMyDsl.g:1847:4: rule__QuoteExpression__ContentAssignment_2
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

            // InternalMyDsl.g:1850:2: ( ( rule__QuoteExpression__ContentAssignment_2 )* )
            // InternalMyDsl.g:1851:3: ( rule__QuoteExpression__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:1852:3: ( rule__QuoteExpression__ContentAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:1852:4: rule__QuoteExpression__ContentAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QuoteExpression__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMyDsl.g:1861:1: rule__QuoteExpression__Group__3 : rule__QuoteExpression__Group__3__Impl ;
    public final void rule__QuoteExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( rule__QuoteExpression__Group__3__Impl )
            // InternalMyDsl.g:1866:2: rule__QuoteExpression__Group__3__Impl
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
    // InternalMyDsl.g:1872:1: rule__QuoteExpression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__QuoteExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1877:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1877:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1878:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalMyDsl.g:1879:2: ( RULE_BL )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_BL) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred41_InternalMyDsl()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1879:3: RULE_BL
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


    // $ANTLR start "rule__BreakLineExpression__Group__0"
    // InternalMyDsl.g:1888:1: rule__BreakLineExpression__Group__0 : rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1 ;
    public final void rule__BreakLineExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1 )
            // InternalMyDsl.g:1893:2: rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1
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
    // InternalMyDsl.g:1900:1: rule__BreakLineExpression__Group__0__Impl : ( () ) ;
    public final void rule__BreakLineExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1904:1: ( ( () ) )
            // InternalMyDsl.g:1905:1: ( () )
            {
            // InternalMyDsl.g:1905:1: ( () )
            // InternalMyDsl.g:1906:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionAction_0()); 
            }
            // InternalMyDsl.g:1907:2: ()
            // InternalMyDsl.g:1907:3: 
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
    // InternalMyDsl.g:1915:1: rule__BreakLineExpression__Group__1 : rule__BreakLineExpression__Group__1__Impl ;
    public final void rule__BreakLineExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1919:1: ( rule__BreakLineExpression__Group__1__Impl )
            // InternalMyDsl.g:1920:2: rule__BreakLineExpression__Group__1__Impl
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
    // InternalMyDsl.g:1926:1: rule__BreakLineExpression__Group__1__Impl : ( RULE_BL ) ;
    public final void rule__BreakLineExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:1931:1: ( RULE_BL )
            {
            // InternalMyDsl.g:1931:1: ( RULE_BL )
            // InternalMyDsl.g:1932:2: RULE_BL
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


    // $ANTLR start "rule__HorizontalExpression__Group_0__0"
    // InternalMyDsl.g:1942:1: rule__HorizontalExpression__Group_0__0 : rule__HorizontalExpression__Group_0__0__Impl rule__HorizontalExpression__Group_0__1 ;
    public final void rule__HorizontalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( rule__HorizontalExpression__Group_0__0__Impl rule__HorizontalExpression__Group_0__1 )
            // InternalMyDsl.g:1947:2: rule__HorizontalExpression__Group_0__0__Impl rule__HorizontalExpression__Group_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1954:1: rule__HorizontalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__HorizontalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( ( () ) )
            // InternalMyDsl.g:1959:1: ( () )
            {
            // InternalMyDsl.g:1959:1: ( () )
            // InternalMyDsl.g:1960:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHorizontalExpressionAction_0_0()); 
            }
            // InternalMyDsl.g:1961:2: ()
            // InternalMyDsl.g:1961:3: 
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
    // InternalMyDsl.g:1969:1: rule__HorizontalExpression__Group_0__1 : rule__HorizontalExpression__Group_0__1__Impl ;
    public final void rule__HorizontalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( rule__HorizontalExpression__Group_0__1__Impl )
            // InternalMyDsl.g:1974:2: rule__HorizontalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalMyDsl.g:1980:1: rule__HorizontalExpression__Group_0__1__Impl : ( ( rule__HorizontalExpression__Group_0_1__0 ) ) ;
    public final void rule__HorizontalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( ( ( rule__HorizontalExpression__Group_0_1__0 ) ) )
            // InternalMyDsl.g:1985:1: ( ( rule__HorizontalExpression__Group_0_1__0 ) )
            {
            // InternalMyDsl.g:1985:1: ( ( rule__HorizontalExpression__Group_0_1__0 ) )
            // InternalMyDsl.g:1986:2: ( rule__HorizontalExpression__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:1987:2: ( rule__HorizontalExpression__Group_0_1__0 )
            // InternalMyDsl.g:1987:3: rule__HorizontalExpression__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getGroup_0_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__HorizontalExpression__Group_0_1__0"
    // InternalMyDsl.g:1996:1: rule__HorizontalExpression__Group_0_1__0 : rule__HorizontalExpression__Group_0_1__0__Impl rule__HorizontalExpression__Group_0_1__1 ;
    public final void rule__HorizontalExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( rule__HorizontalExpression__Group_0_1__0__Impl rule__HorizontalExpression__Group_0_1__1 )
            // InternalMyDsl.g:2001:2: rule__HorizontalExpression__Group_0_1__0__Impl rule__HorizontalExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__HorizontalExpression__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group_0_1__0"


    // $ANTLR start "rule__HorizontalExpression__Group_0_1__0__Impl"
    // InternalMyDsl.g:2008:1: rule__HorizontalExpression__Group_0_1__0__Impl : ( '-' ) ;
    public final void rule__HorizontalExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( ( '-' ) )
            // InternalMyDsl.g:2013:1: ( '-' )
            {
            // InternalMyDsl.g:2013:1: ( '-' )
            // InternalMyDsl.g:2014:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_0_1__1"
    // InternalMyDsl.g:2023:1: rule__HorizontalExpression__Group_0_1__1 : rule__HorizontalExpression__Group_0_1__1__Impl rule__HorizontalExpression__Group_0_1__2 ;
    public final void rule__HorizontalExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( rule__HorizontalExpression__Group_0_1__1__Impl rule__HorizontalExpression__Group_0_1__2 )
            // InternalMyDsl.g:2028:2: rule__HorizontalExpression__Group_0_1__1__Impl rule__HorizontalExpression__Group_0_1__2
            {
            pushFollow(FOLLOW_14);
            rule__HorizontalExpression__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group_0_1__1"


    // $ANTLR start "rule__HorizontalExpression__Group_0_1__1__Impl"
    // InternalMyDsl.g:2035:1: rule__HorizontalExpression__Group_0_1__1__Impl : ( '-' ) ;
    public final void rule__HorizontalExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2039:1: ( ( '-' ) )
            // InternalMyDsl.g:2040:1: ( '-' )
            {
            // InternalMyDsl.g:2040:1: ( '-' )
            // InternalMyDsl.g:2041:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_0_1__2"
    // InternalMyDsl.g:2050:1: rule__HorizontalExpression__Group_0_1__2 : rule__HorizontalExpression__Group_0_1__2__Impl ;
    public final void rule__HorizontalExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( rule__HorizontalExpression__Group_0_1__2__Impl )
            // InternalMyDsl.g:2055:2: rule__HorizontalExpression__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HorizontalExpression__Group_0_1__2"


    // $ANTLR start "rule__HorizontalExpression__Group_0_1__2__Impl"
    // InternalMyDsl.g:2061:1: rule__HorizontalExpression__Group_0_1__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__HorizontalExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2066:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2066:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2067:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2067:2: ( ( '-' ) )
            // InternalMyDsl.g:2068:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_2()); 
            }
            // InternalMyDsl.g:2069:3: ( '-' )
            // InternalMyDsl.g:2069:4: '-'
            {
            match(input,14,FOLLOW_15); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_2()); 
            }

            }

            // InternalMyDsl.g:2072:2: ( ( '-' )* )
            // InternalMyDsl.g:2073:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_2()); 
            }
            // InternalMyDsl.g:2074:3: ( '-' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred42_InternalMyDsl()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2074:4: '-'
            	    {
            	    match(input,14,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_2()); 
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
    // $ANTLR end "rule__HorizontalExpression__Group_0_1__2__Impl"


    // $ANTLR start "rule__HorizontalExpression__Group_1__0"
    // InternalMyDsl.g:2084:1: rule__HorizontalExpression__Group_1__0 : rule__HorizontalExpression__Group_1__0__Impl rule__HorizontalExpression__Group_1__1 ;
    public final void rule__HorizontalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( rule__HorizontalExpression__Group_1__0__Impl rule__HorizontalExpression__Group_1__1 )
            // InternalMyDsl.g:2089:2: rule__HorizontalExpression__Group_1__0__Impl rule__HorizontalExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2096:1: rule__HorizontalExpression__Group_1__0__Impl : ( '_' ) ;
    public final void rule__HorizontalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2100:1: ( ( '_' ) )
            // InternalMyDsl.g:2101:1: ( '_' )
            {
            // InternalMyDsl.g:2101:1: ( '_' )
            // InternalMyDsl.g:2102:2: '_'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_0()); 
            }

            }


            }

        }
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
    // InternalMyDsl.g:2111:1: rule__HorizontalExpression__Group_1__1 : rule__HorizontalExpression__Group_1__1__Impl rule__HorizontalExpression__Group_1__2 ;
    public final void rule__HorizontalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( rule__HorizontalExpression__Group_1__1__Impl rule__HorizontalExpression__Group_1__2 )
            // InternalMyDsl.g:2116:2: rule__HorizontalExpression__Group_1__1__Impl rule__HorizontalExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2123:1: rule__HorizontalExpression__Group_1__1__Impl : ( '_' ) ;
    public final void rule__HorizontalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2127:1: ( ( '_' ) )
            // InternalMyDsl.g:2128:1: ( '_' )
            {
            // InternalMyDsl.g:2128:1: ( '_' )
            // InternalMyDsl.g:2129:2: '_'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_1()); 
            }

            }


            }

        }
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
    // InternalMyDsl.g:2138:1: rule__HorizontalExpression__Group_1__2 : rule__HorizontalExpression__Group_1__2__Impl ;
    public final void rule__HorizontalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( rule__HorizontalExpression__Group_1__2__Impl )
            // InternalMyDsl.g:2143:2: rule__HorizontalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HorizontalExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalMyDsl.g:2149:1: rule__HorizontalExpression__Group_1__2__Impl : ( ( ( '_' ) ) ( ( '_' )* ) ) ;
    public final void rule__HorizontalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2153:1: ( ( ( ( '_' ) ) ( ( '_' )* ) ) )
            // InternalMyDsl.g:2154:1: ( ( ( '_' ) ) ( ( '_' )* ) )
            {
            // InternalMyDsl.g:2154:1: ( ( ( '_' ) ) ( ( '_' )* ) )
            // InternalMyDsl.g:2155:2: ( ( '_' ) ) ( ( '_' )* )
            {
            // InternalMyDsl.g:2155:2: ( ( '_' ) )
            // InternalMyDsl.g:2156:3: ( '_' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2()); 
            }
            // InternalMyDsl.g:2157:3: ( '_' )
            // InternalMyDsl.g:2157:4: '_'
            {
            match(input,21,FOLLOW_17); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2()); 
            }

            }

            // InternalMyDsl.g:2160:2: ( ( '_' )* )
            // InternalMyDsl.g:2161:3: ( '_' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2()); 
            }
            // InternalMyDsl.g:2162:3: ( '_' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==EOF||(LA29_2>=RULE_ID && LA29_2<=RULE_BL)||(LA29_2>=13 && LA29_2<=18)||LA29_2==20||LA29_2==22||(LA29_2>=26 && LA29_2<=27)||(LA29_2>=29 && LA29_2<=36)) ) {
                        alt29=1;
                    }
                    else if ( (LA29_2==21) ) {
                        int LA29_4 = input.LA(3);

                        if ( (LA29_4==21) ) {
                            int LA29_5 = input.LA(4);

                            if ( (synpred43_InternalMyDsl()) ) {
                                alt29=1;
                            }


                        }
                        else if ( (LA29_4==EOF||(LA29_4>=RULE_ID && LA29_4<=RULE_BL)||(LA29_4>=13 && LA29_4<=18)||LA29_4==20||LA29_4==22||(LA29_4>=26 && LA29_4<=27)||(LA29_4>=29 && LA29_4<=36)) ) {
                            alt29=1;
                        }


                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:2162:4: '_'
            	    {
            	    match(input,21,FOLLOW_17); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2()); 
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


    // $ANTLR start "rule__TabExpression__Group__0"
    // InternalMyDsl.g:2172:1: rule__TabExpression__Group__0 : rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1 ;
    public final void rule__TabExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1 )
            // InternalMyDsl.g:2177:2: rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2184:1: rule__TabExpression__Group__0__Impl : ( () ) ;
    public final void rule__TabExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( () ) )
            // InternalMyDsl.g:2189:1: ( () )
            {
            // InternalMyDsl.g:2189:1: ( () )
            // InternalMyDsl.g:2190:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getTabExpressionAction_0()); 
            }
            // InternalMyDsl.g:2191:2: ()
            // InternalMyDsl.g:2191:3: 
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
    // InternalMyDsl.g:2199:1: rule__TabExpression__Group__1 : rule__TabExpression__Group__1__Impl ;
    public final void rule__TabExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( rule__TabExpression__Group__1__Impl )
            // InternalMyDsl.g:2204:2: rule__TabExpression__Group__1__Impl
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
    // InternalMyDsl.g:2210:1: rule__TabExpression__Group__1__Impl : ( ( rule__TabExpression__Group_1__0 ) ) ;
    public final void rule__TabExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2214:1: ( ( ( rule__TabExpression__Group_1__0 ) ) )
            // InternalMyDsl.g:2215:1: ( ( rule__TabExpression__Group_1__0 ) )
            {
            // InternalMyDsl.g:2215:1: ( ( rule__TabExpression__Group_1__0 ) )
            // InternalMyDsl.g:2216:2: ( rule__TabExpression__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:2217:2: ( rule__TabExpression__Group_1__0 )
            // InternalMyDsl.g:2217:3: rule__TabExpression__Group_1__0
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
    // InternalMyDsl.g:2226:1: rule__TabExpression__Group_1__0 : rule__TabExpression__Group_1__0__Impl ;
    public final void rule__TabExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( rule__TabExpression__Group_1__0__Impl )
            // InternalMyDsl.g:2231:2: rule__TabExpression__Group_1__0__Impl
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
    // InternalMyDsl.g:2237:1: rule__TabExpression__Group_1__0__Impl : ( ( rule__TabExpression__Group_1_0__0 ) ) ;
    public final void rule__TabExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2241:1: ( ( ( rule__TabExpression__Group_1_0__0 ) ) )
            // InternalMyDsl.g:2242:1: ( ( rule__TabExpression__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:2242:1: ( ( rule__TabExpression__Group_1_0__0 ) )
            // InternalMyDsl.g:2243:2: ( rule__TabExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0()); 
            }
            // InternalMyDsl.g:2244:2: ( rule__TabExpression__Group_1_0__0 )
            // InternalMyDsl.g:2244:3: rule__TabExpression__Group_1_0__0
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
    // InternalMyDsl.g:2253:1: rule__TabExpression__Group_1_0__0 : rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1 ;
    public final void rule__TabExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1 )
            // InternalMyDsl.g:2258:2: rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1
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
    // InternalMyDsl.g:2265:1: rule__TabExpression__Group_1_0__0__Impl : ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) ) ;
    public final void rule__TabExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) ) )
            // InternalMyDsl.g:2270:1: ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) )
            {
            // InternalMyDsl.g:2270:1: ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) )
            // InternalMyDsl.g:2271:2: ( rule__TabExpression__HeaderAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getHeaderAssignment_1_0_0()); 
            }
            // InternalMyDsl.g:2272:2: ( rule__TabExpression__HeaderAssignment_1_0_0 )
            // InternalMyDsl.g:2272:3: rule__TabExpression__HeaderAssignment_1_0_0
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
    // InternalMyDsl.g:2280:1: rule__TabExpression__Group_1_0__1 : rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2 ;
    public final void rule__TabExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2 )
            // InternalMyDsl.g:2285:2: rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2292:1: rule__TabExpression__Group_1_0__1__Impl : ( RULE_BL ) ;
    public final void rule__TabExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:2297:1: ( RULE_BL )
            {
            // InternalMyDsl.g:2297:1: ( RULE_BL )
            // InternalMyDsl.g:2298:2: RULE_BL
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
    // InternalMyDsl.g:2307:1: rule__TabExpression__Group_1_0__2 : rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3 ;
    public final void rule__TabExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3 )
            // InternalMyDsl.g:2312:2: rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3
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
    // InternalMyDsl.g:2319:1: rule__TabExpression__Group_1_0__2__Impl : ( ruleTabSeparation ) ;
    public final void rule__TabExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( ( ruleTabSeparation ) )
            // InternalMyDsl.g:2324:1: ( ruleTabSeparation )
            {
            // InternalMyDsl.g:2324:1: ( ruleTabSeparation )
            // InternalMyDsl.g:2325:2: ruleTabSeparation
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
    // InternalMyDsl.g:2334:1: rule__TabExpression__Group_1_0__3 : rule__TabExpression__Group_1_0__3__Impl ;
    public final void rule__TabExpression__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( rule__TabExpression__Group_1_0__3__Impl )
            // InternalMyDsl.g:2339:2: rule__TabExpression__Group_1_0__3__Impl
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
    // InternalMyDsl.g:2345:1: rule__TabExpression__Group_1_0__3__Impl : ( ( rule__TabExpression__Group_1_0_3__0 )* ) ;
    public final void rule__TabExpression__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2349:1: ( ( ( rule__TabExpression__Group_1_0_3__0 )* ) )
            // InternalMyDsl.g:2350:1: ( ( rule__TabExpression__Group_1_0_3__0 )* )
            {
            // InternalMyDsl.g:2350:1: ( ( rule__TabExpression__Group_1_0_3__0 )* )
            // InternalMyDsl.g:2351:2: ( rule__TabExpression__Group_1_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0_3()); 
            }
            // InternalMyDsl.g:2352:2: ( rule__TabExpression__Group_1_0_3__0 )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:2352:3: rule__TabExpression__Group_1_0_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__TabExpression__Group_1_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMyDsl.g:2361:1: rule__TabExpression__Group_1_0_3__0 : rule__TabExpression__Group_1_0_3__0__Impl ;
    public final void rule__TabExpression__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( rule__TabExpression__Group_1_0_3__0__Impl )
            // InternalMyDsl.g:2366:2: rule__TabExpression__Group_1_0_3__0__Impl
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
    // InternalMyDsl.g:2372:1: rule__TabExpression__Group_1_0_3__0__Impl : ( ( rule__TabExpression__Group_1_0_3_0__0 ) ) ;
    public final void rule__TabExpression__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2376:1: ( ( ( rule__TabExpression__Group_1_0_3_0__0 ) ) )
            // InternalMyDsl.g:2377:1: ( ( rule__TabExpression__Group_1_0_3_0__0 ) )
            {
            // InternalMyDsl.g:2377:1: ( ( rule__TabExpression__Group_1_0_3_0__0 ) )
            // InternalMyDsl.g:2378:2: ( rule__TabExpression__Group_1_0_3_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0_3_0()); 
            }
            // InternalMyDsl.g:2379:2: ( rule__TabExpression__Group_1_0_3_0__0 )
            // InternalMyDsl.g:2379:3: rule__TabExpression__Group_1_0_3_0__0
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
    // InternalMyDsl.g:2388:1: rule__TabExpression__Group_1_0_3_0__0 : rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1 ;
    public final void rule__TabExpression__Group_1_0_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1 )
            // InternalMyDsl.g:2393:2: rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2400:1: rule__TabExpression__Group_1_0_3_0__0__Impl : ( RULE_BL ) ;
    public final void rule__TabExpression__Group_1_0_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:2405:1: ( RULE_BL )
            {
            // InternalMyDsl.g:2405:1: ( RULE_BL )
            // InternalMyDsl.g:2406:2: RULE_BL
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
    // InternalMyDsl.g:2415:1: rule__TabExpression__Group_1_0_3_0__1 : rule__TabExpression__Group_1_0_3_0__1__Impl ;
    public final void rule__TabExpression__Group_1_0_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( rule__TabExpression__Group_1_0_3_0__1__Impl )
            // InternalMyDsl.g:2420:2: rule__TabExpression__Group_1_0_3_0__1__Impl
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
    // InternalMyDsl.g:2426:1: rule__TabExpression__Group_1_0_3_0__1__Impl : ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) ) ;
    public final void rule__TabExpression__Group_1_0_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2430:1: ( ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) ) )
            // InternalMyDsl.g:2431:1: ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) )
            {
            // InternalMyDsl.g:2431:1: ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) )
            // InternalMyDsl.g:2432:2: ( rule__TabExpression__LinesAssignment_1_0_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getLinesAssignment_1_0_3_0_1()); 
            }
            // InternalMyDsl.g:2433:2: ( rule__TabExpression__LinesAssignment_1_0_3_0_1 )
            // InternalMyDsl.g:2433:3: rule__TabExpression__LinesAssignment_1_0_3_0_1
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
    // InternalMyDsl.g:2442:1: rule__TabSeparation__Group__0 : rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1 ;
    public final void rule__TabSeparation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1 )
            // InternalMyDsl.g:2447:2: rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2454:1: rule__TabSeparation__Group__0__Impl : ( ( '|' )? ) ;
    public final void rule__TabSeparation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2458:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2459:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2459:1: ( ( '|' )? )
            // InternalMyDsl.g:2460:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_0()); 
            }
            // InternalMyDsl.g:2461:2: ( '|' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2461:3: '|'
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
    // InternalMyDsl.g:2469:1: rule__TabSeparation__Group__1 : rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2 ;
    public final void rule__TabSeparation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2 )
            // InternalMyDsl.g:2474:2: rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2481:1: rule__TabSeparation__Group__1__Impl : ( '-' ) ;
    public final void rule__TabSeparation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( ( '-' ) )
            // InternalMyDsl.g:2486:1: ( '-' )
            {
            // InternalMyDsl.g:2486:1: ( '-' )
            // InternalMyDsl.g:2487:2: '-'
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
    // InternalMyDsl.g:2496:1: rule__TabSeparation__Group__2 : rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3 ;
    public final void rule__TabSeparation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3 )
            // InternalMyDsl.g:2501:2: rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2508:1: rule__TabSeparation__Group__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__TabSeparation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2513:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2513:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2514:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2514:2: ( ( '-' ) )
            // InternalMyDsl.g:2515:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }
            // InternalMyDsl.g:2516:3: ( '-' )
            // InternalMyDsl.g:2516:4: '-'
            {
            match(input,14,FOLLOW_15); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }

            }

            // InternalMyDsl.g:2519:2: ( ( '-' )* )
            // InternalMyDsl.g:2520:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }
            // InternalMyDsl.g:2521:3: ( '-' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==14) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:2521:4: '-'
            	    {
            	    match(input,14,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalMyDsl.g:2530:1: rule__TabSeparation__Group__3 : rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4 ;
    public final void rule__TabSeparation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4 )
            // InternalMyDsl.g:2535:2: rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2542:1: rule__TabSeparation__Group__3__Impl : ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) ) ;
    public final void rule__TabSeparation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2546:1: ( ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) ) )
            // InternalMyDsl.g:2547:1: ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) )
            {
            // InternalMyDsl.g:2547:1: ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) )
            // InternalMyDsl.g:2548:2: ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* )
            {
            // InternalMyDsl.g:2548:2: ( ( rule__TabSeparation__Group_3__0 ) )
            // InternalMyDsl.g:2549:3: ( rule__TabSeparation__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:2550:3: ( rule__TabSeparation__Group_3__0 )
            // InternalMyDsl.g:2550:4: rule__TabSeparation__Group_3__0
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

            // InternalMyDsl.g:2553:2: ( ( rule__TabSeparation__Group_3__0 )* )
            // InternalMyDsl.g:2554:3: ( rule__TabSeparation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:2555:3: ( rule__TabSeparation__Group_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==14) ) {
                        int LA33_3 = input.LA(3);

                        if ( (LA33_3==14) ) {
                            int LA33_4 = input.LA(4);

                            if ( (synpred47_InternalMyDsl()) ) {
                                alt33=1;
                            }


                        }


                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:2555:4: rule__TabSeparation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TabSeparation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalMyDsl.g:2564:1: rule__TabSeparation__Group__4 : rule__TabSeparation__Group__4__Impl ;
    public final void rule__TabSeparation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2568:1: ( rule__TabSeparation__Group__4__Impl )
            // InternalMyDsl.g:2569:2: rule__TabSeparation__Group__4__Impl
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
    // InternalMyDsl.g:2575:1: rule__TabSeparation__Group__4__Impl : ( ( '|' )? ) ;
    public final void rule__TabSeparation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2579:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2580:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2580:1: ( ( '|' )? )
            // InternalMyDsl.g:2581:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_4()); 
            }
            // InternalMyDsl.g:2582:2: ( '|' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred48_InternalMyDsl()) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:2582:3: '|'
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
    // InternalMyDsl.g:2591:1: rule__TabSeparation__Group_3__0 : rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1 ;
    public final void rule__TabSeparation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2595:1: ( rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1 )
            // InternalMyDsl.g:2596:2: rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2603:1: rule__TabSeparation__Group_3__0__Impl : ( '|' ) ;
    public final void rule__TabSeparation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( ( '|' ) )
            // InternalMyDsl.g:2608:1: ( '|' )
            {
            // InternalMyDsl.g:2608:1: ( '|' )
            // InternalMyDsl.g:2609:2: '|'
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
    // InternalMyDsl.g:2618:1: rule__TabSeparation__Group_3__1 : rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2 ;
    public final void rule__TabSeparation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2622:1: ( rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2 )
            // InternalMyDsl.g:2623:2: rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2630:1: rule__TabSeparation__Group_3__1__Impl : ( '-' ) ;
    public final void rule__TabSeparation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2634:1: ( ( '-' ) )
            // InternalMyDsl.g:2635:1: ( '-' )
            {
            // InternalMyDsl.g:2635:1: ( '-' )
            // InternalMyDsl.g:2636:2: '-'
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
    // InternalMyDsl.g:2645:1: rule__TabSeparation__Group_3__2 : rule__TabSeparation__Group_3__2__Impl ;
    public final void rule__TabSeparation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2649:1: ( rule__TabSeparation__Group_3__2__Impl )
            // InternalMyDsl.g:2650:2: rule__TabSeparation__Group_3__2__Impl
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
    // InternalMyDsl.g:2656:1: rule__TabSeparation__Group_3__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__TabSeparation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2660:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2661:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2661:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2662:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2662:2: ( ( '-' ) )
            // InternalMyDsl.g:2663:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }
            // InternalMyDsl.g:2664:3: ( '-' )
            // InternalMyDsl.g:2664:4: '-'
            {
            match(input,14,FOLLOW_15); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }

            }

            // InternalMyDsl.g:2667:2: ( ( '-' )* )
            // InternalMyDsl.g:2668:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }
            // InternalMyDsl.g:2669:3: ( '-' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==14) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred49_InternalMyDsl()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:2669:4: '-'
            	    {
            	    match(input,14,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalMyDsl.g:2679:1: rule__LineExpression__Group__0 : rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1 ;
    public final void rule__LineExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1 )
            // InternalMyDsl.g:2684:2: rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2691:1: rule__LineExpression__Group__0__Impl : ( ( '|' )? ) ;
    public final void rule__LineExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2695:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2696:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2696:1: ( ( '|' )? )
            // InternalMyDsl.g:2697:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_0()); 
            }
            // InternalMyDsl.g:2698:2: ( '|' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred50_InternalMyDsl()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2698:3: '|'
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
    // InternalMyDsl.g:2706:1: rule__LineExpression__Group__1 : rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2 ;
    public final void rule__LineExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2 )
            // InternalMyDsl.g:2711:2: rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2718:1: rule__LineExpression__Group__1__Impl : ( ( rule__LineExpression__CellsAssignment_1 ) ) ;
    public final void rule__LineExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( ( ( rule__LineExpression__CellsAssignment_1 ) ) )
            // InternalMyDsl.g:2723:1: ( ( rule__LineExpression__CellsAssignment_1 ) )
            {
            // InternalMyDsl.g:2723:1: ( ( rule__LineExpression__CellsAssignment_1 ) )
            // InternalMyDsl.g:2724:2: ( rule__LineExpression__CellsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsAssignment_1()); 
            }
            // InternalMyDsl.g:2725:2: ( rule__LineExpression__CellsAssignment_1 )
            // InternalMyDsl.g:2725:3: rule__LineExpression__CellsAssignment_1
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
    // InternalMyDsl.g:2733:1: rule__LineExpression__Group__2 : rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3 ;
    public final void rule__LineExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3 )
            // InternalMyDsl.g:2738:2: rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2745:1: rule__LineExpression__Group__2__Impl : ( ( rule__LineExpression__Group_2__0 )* ) ;
    public final void rule__LineExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( ( ( rule__LineExpression__Group_2__0 )* ) )
            // InternalMyDsl.g:2750:1: ( ( rule__LineExpression__Group_2__0 )* )
            {
            // InternalMyDsl.g:2750:1: ( ( rule__LineExpression__Group_2__0 )* )
            // InternalMyDsl.g:2751:2: ( rule__LineExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getGroup_2()); 
            }
            // InternalMyDsl.g:2752:2: ( rule__LineExpression__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:2752:3: rule__LineExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__LineExpression__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalMyDsl.g:2760:1: rule__LineExpression__Group__3 : rule__LineExpression__Group__3__Impl ;
    public final void rule__LineExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( rule__LineExpression__Group__3__Impl )
            // InternalMyDsl.g:2765:2: rule__LineExpression__Group__3__Impl
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
    // InternalMyDsl.g:2771:1: rule__LineExpression__Group__3__Impl : ( ( '|' )? ) ;
    public final void rule__LineExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2775:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2776:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2776:1: ( ( '|' )? )
            // InternalMyDsl.g:2777:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_3()); 
            }
            // InternalMyDsl.g:2778:2: ( '|' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred52_InternalMyDsl()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2778:3: '|'
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
    // InternalMyDsl.g:2787:1: rule__LineExpression__Group_2__0 : rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1 ;
    public final void rule__LineExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1 )
            // InternalMyDsl.g:2792:2: rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2799:1: rule__LineExpression__Group_2__0__Impl : ( ( '|' ) ) ;
    public final void rule__LineExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( ( ( '|' ) ) )
            // InternalMyDsl.g:2804:1: ( ( '|' ) )
            {
            // InternalMyDsl.g:2804:1: ( ( '|' ) )
            // InternalMyDsl.g:2805:2: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_2_0()); 
            }
            // InternalMyDsl.g:2806:2: ( '|' )
            // InternalMyDsl.g:2806:3: '|'
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
    // InternalMyDsl.g:2814:1: rule__LineExpression__Group_2__1 : rule__LineExpression__Group_2__1__Impl ;
    public final void rule__LineExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( rule__LineExpression__Group_2__1__Impl )
            // InternalMyDsl.g:2819:2: rule__LineExpression__Group_2__1__Impl
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
    // InternalMyDsl.g:2825:1: rule__LineExpression__Group_2__1__Impl : ( ( rule__LineExpression__CellsAssignment_2_1 ) ) ;
    public final void rule__LineExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2829:1: ( ( ( rule__LineExpression__CellsAssignment_2_1 ) ) )
            // InternalMyDsl.g:2830:1: ( ( rule__LineExpression__CellsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2830:1: ( ( rule__LineExpression__CellsAssignment_2_1 ) )
            // InternalMyDsl.g:2831:2: ( rule__LineExpression__CellsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsAssignment_2_1()); 
            }
            // InternalMyDsl.g:2832:2: ( rule__LineExpression__CellsAssignment_2_1 )
            // InternalMyDsl.g:2832:3: rule__LineExpression__CellsAssignment_2_1
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


    // $ANTLR start "rule__URLedExpression__Group__0"
    // InternalMyDsl.g:2841:1: rule__URLedExpression__Group__0 : rule__URLedExpression__Group__0__Impl rule__URLedExpression__Group__1 ;
    public final void rule__URLedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( rule__URLedExpression__Group__0__Impl rule__URLedExpression__Group__1 )
            // InternalMyDsl.g:2846:2: rule__URLedExpression__Group__0__Impl rule__URLedExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__URLedExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__URLedExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLedExpression__Group__0"


    // $ANTLR start "rule__URLedExpression__Group__0__Impl"
    // InternalMyDsl.g:2853:1: rule__URLedExpression__Group__0__Impl : ( () ) ;
    public final void rule__URLedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2857:1: ( ( () ) )
            // InternalMyDsl.g:2858:1: ( () )
            {
            // InternalMyDsl.g:2858:1: ( () )
            // InternalMyDsl.g:2859:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getURLedExpressionAction_0()); 
            }
            // InternalMyDsl.g:2860:2: ()
            // InternalMyDsl.g:2860:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLedExpressionAccess().getURLedExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLedExpression__Group__0__Impl"


    // $ANTLR start "rule__URLedExpression__Group__1"
    // InternalMyDsl.g:2868:1: rule__URLedExpression__Group__1 : rule__URLedExpression__Group__1__Impl ;
    public final void rule__URLedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( rule__URLedExpression__Group__1__Impl )
            // InternalMyDsl.g:2873:2: rule__URLedExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__URLedExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLedExpression__Group__1"


    // $ANTLR start "rule__URLedExpression__Group__1__Impl"
    // InternalMyDsl.g:2879:1: rule__URLedExpression__Group__1__Impl : ( ( rule__URLedExpression__Alternatives_1 ) ) ;
    public final void rule__URLedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2883:1: ( ( ( rule__URLedExpression__Alternatives_1 ) ) )
            // InternalMyDsl.g:2884:1: ( ( rule__URLedExpression__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2884:1: ( ( rule__URLedExpression__Alternatives_1 ) )
            // InternalMyDsl.g:2885:2: ( rule__URLedExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getAlternatives_1()); 
            }
            // InternalMyDsl.g:2886:2: ( rule__URLedExpression__Alternatives_1 )
            // InternalMyDsl.g:2886:3: rule__URLedExpression__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__URLedExpression__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLedExpressionAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLedExpression__Group__1__Impl"


    // $ANTLR start "rule__URLedExpression__Group_1_0__0"
    // InternalMyDsl.g:2895:1: rule__URLedExpression__Group_1_0__0 : rule__URLedExpression__Group_1_0__0__Impl ;
    public final void rule__URLedExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( rule__URLedExpression__Group_1_0__0__Impl )
            // InternalMyDsl.g:2900:2: rule__URLedExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__URLedExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLedExpression__Group_1_0__0"


    // $ANTLR start "rule__URLedExpression__Group_1_0__0__Impl"
    // InternalMyDsl.g:2906:1: rule__URLedExpression__Group_1_0__0__Impl : ( ( rule__URLedExpression__Alternatives_1_0_0 ) ) ;
    public final void rule__URLedExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2910:1: ( ( ( rule__URLedExpression__Alternatives_1_0_0 ) ) )
            // InternalMyDsl.g:2911:1: ( ( rule__URLedExpression__Alternatives_1_0_0 ) )
            {
            // InternalMyDsl.g:2911:1: ( ( rule__URLedExpression__Alternatives_1_0_0 ) )
            // InternalMyDsl.g:2912:2: ( rule__URLedExpression__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getAlternatives_1_0_0()); 
            }
            // InternalMyDsl.g:2913:2: ( rule__URLedExpression__Alternatives_1_0_0 )
            // InternalMyDsl.g:2913:3: rule__URLedExpression__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__URLedExpression__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLedExpressionAccess().getAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLedExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__RefExpression__Group__0"
    // InternalMyDsl.g:2922:1: rule__RefExpression__Group__0 : rule__RefExpression__Group__0__Impl rule__RefExpression__Group__1 ;
    public final void rule__RefExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( rule__RefExpression__Group__0__Impl rule__RefExpression__Group__1 )
            // InternalMyDsl.g:2927:2: rule__RefExpression__Group__0__Impl rule__RefExpression__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2934:1: rule__RefExpression__Group__0__Impl : ( () ) ;
    public final void rule__RefExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2938:1: ( ( () ) )
            // InternalMyDsl.g:2939:1: ( () )
            {
            // InternalMyDsl.g:2939:1: ( () )
            // InternalMyDsl.g:2940:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefExpressionAction_0()); 
            }
            // InternalMyDsl.g:2941:2: ()
            // InternalMyDsl.g:2941:3: 
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
    // InternalMyDsl.g:2949:1: rule__RefExpression__Group__1 : rule__RefExpression__Group__1__Impl rule__RefExpression__Group__2 ;
    public final void rule__RefExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( rule__RefExpression__Group__1__Impl rule__RefExpression__Group__2 )
            // InternalMyDsl.g:2954:2: rule__RefExpression__Group__1__Impl rule__RefExpression__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2961:1: rule__RefExpression__Group__1__Impl : ( ( '[' ) ) ;
    public final void rule__RefExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:2966:1: ( ( '[' ) )
            {
            // InternalMyDsl.g:2966:1: ( ( '[' ) )
            // InternalMyDsl.g:2967:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:2968:2: ( '[' )
            // InternalMyDsl.g:2968:3: '['
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
    // InternalMyDsl.g:2976:1: rule__RefExpression__Group__2 : rule__RefExpression__Group__2__Impl rule__RefExpression__Group__3 ;
    public final void rule__RefExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( rule__RefExpression__Group__2__Impl rule__RefExpression__Group__3 )
            // InternalMyDsl.g:2981:2: rule__RefExpression__Group__2__Impl rule__RefExpression__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2988:1: rule__RefExpression__Group__2__Impl : ( ( rule__RefExpression__RefNameAssignment_2 ) ) ;
    public final void rule__RefExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2992:1: ( ( ( rule__RefExpression__RefNameAssignment_2 ) ) )
            // InternalMyDsl.g:2993:1: ( ( rule__RefExpression__RefNameAssignment_2 ) )
            {
            // InternalMyDsl.g:2993:1: ( ( rule__RefExpression__RefNameAssignment_2 ) )
            // InternalMyDsl.g:2994:2: ( rule__RefExpression__RefNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefNameAssignment_2()); 
            }
            // InternalMyDsl.g:2995:2: ( rule__RefExpression__RefNameAssignment_2 )
            // InternalMyDsl.g:2995:3: rule__RefExpression__RefNameAssignment_2
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
    // InternalMyDsl.g:3003:1: rule__RefExpression__Group__3 : rule__RefExpression__Group__3__Impl rule__RefExpression__Group__4 ;
    public final void rule__RefExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( rule__RefExpression__Group__3__Impl rule__RefExpression__Group__4 )
            // InternalMyDsl.g:3008:2: rule__RefExpression__Group__3__Impl rule__RefExpression__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3015:1: rule__RefExpression__Group__3__Impl : ( ( ']:' ) ) ;
    public final void rule__RefExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3019:1: ( ( ( ']:' ) ) )
            // InternalMyDsl.g:3020:1: ( ( ']:' ) )
            {
            // InternalMyDsl.g:3020:1: ( ( ']:' ) )
            // InternalMyDsl.g:3021:2: ( ']:' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRightSquareBracketColonKeyword_3()); 
            }
            // InternalMyDsl.g:3022:2: ( ']:' )
            // InternalMyDsl.g:3022:3: ']:'
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
    // InternalMyDsl.g:3030:1: rule__RefExpression__Group__4 : rule__RefExpression__Group__4__Impl rule__RefExpression__Group__5 ;
    public final void rule__RefExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3034:1: ( rule__RefExpression__Group__4__Impl rule__RefExpression__Group__5 )
            // InternalMyDsl.g:3035:2: rule__RefExpression__Group__4__Impl rule__RefExpression__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3042:1: rule__RefExpression__Group__4__Impl : ( ( rule__RefExpression__RefContentAssignment_4 )? ) ;
    public final void rule__RefExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3046:1: ( ( ( rule__RefExpression__RefContentAssignment_4 )? ) )
            // InternalMyDsl.g:3047:1: ( ( rule__RefExpression__RefContentAssignment_4 )? )
            {
            // InternalMyDsl.g:3047:1: ( ( rule__RefExpression__RefContentAssignment_4 )? )
            // InternalMyDsl.g:3048:2: ( rule__RefExpression__RefContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefContentAssignment_4()); 
            }
            // InternalMyDsl.g:3049:2: ( rule__RefExpression__RefContentAssignment_4 )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:3049:3: rule__RefExpression__RefContentAssignment_4
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
    // InternalMyDsl.g:3057:1: rule__RefExpression__Group__5 : rule__RefExpression__Group__5__Impl ;
    public final void rule__RefExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( rule__RefExpression__Group__5__Impl )
            // InternalMyDsl.g:3062:2: rule__RefExpression__Group__5__Impl
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
    // InternalMyDsl.g:3068:1: rule__RefExpression__Group__5__Impl : ( ( RULE_BL )? ) ;
    public final void rule__RefExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3072:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3073:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3073:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3074:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getBLTerminalRuleCall_5()); 
            }
            // InternalMyDsl.g:3075:2: ( RULE_BL )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_BL) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred54_InternalMyDsl()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:3075:3: RULE_BL
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
    // InternalMyDsl.g:3084:1: rule__LinkExpression__Group__0 : rule__LinkExpression__Group__0__Impl rule__LinkExpression__Group__1 ;
    public final void rule__LinkExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( rule__LinkExpression__Group__0__Impl rule__LinkExpression__Group__1 )
            // InternalMyDsl.g:3089:2: rule__LinkExpression__Group__0__Impl rule__LinkExpression__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3096:1: rule__LinkExpression__Group__0__Impl : ( () ) ;
    public final void rule__LinkExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3100:1: ( ( () ) )
            // InternalMyDsl.g:3101:1: ( () )
            {
            // InternalMyDsl.g:3101:1: ( () )
            // InternalMyDsl.g:3102:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0()); 
            }
            // InternalMyDsl.g:3103:2: ()
            // InternalMyDsl.g:3103:3: 
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
    // InternalMyDsl.g:3111:1: rule__LinkExpression__Group__1 : rule__LinkExpression__Group__1__Impl rule__LinkExpression__Group__2 ;
    public final void rule__LinkExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( rule__LinkExpression__Group__1__Impl rule__LinkExpression__Group__2 )
            // InternalMyDsl.g:3116:2: rule__LinkExpression__Group__1__Impl rule__LinkExpression__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:3123:1: rule__LinkExpression__Group__1__Impl : ( ( '[' ) ) ;
    public final void rule__LinkExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:3128:1: ( ( '[' ) )
            {
            // InternalMyDsl.g:3128:1: ( ( '[' ) )
            // InternalMyDsl.g:3129:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:3130:2: ( '[' )
            // InternalMyDsl.g:3130:3: '['
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
    // InternalMyDsl.g:3138:1: rule__LinkExpression__Group__2 : rule__LinkExpression__Group__2__Impl rule__LinkExpression__Group__3 ;
    public final void rule__LinkExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( rule__LinkExpression__Group__2__Impl rule__LinkExpression__Group__3 )
            // InternalMyDsl.g:3143:2: rule__LinkExpression__Group__2__Impl rule__LinkExpression__Group__3
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
    // InternalMyDsl.g:3150:1: rule__LinkExpression__Group__2__Impl : ( ( rule__LinkExpression__AltTextAssignment_2 ) ) ;
    public final void rule__LinkExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( ( ( rule__LinkExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:3155:1: ( ( rule__LinkExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:3155:1: ( ( rule__LinkExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:3156:2: ( rule__LinkExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:3157:2: ( rule__LinkExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:3157:3: rule__LinkExpression__AltTextAssignment_2
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
    // InternalMyDsl.g:3165:1: rule__LinkExpression__Group__3 : rule__LinkExpression__Group__3__Impl rule__LinkExpression__Group__4 ;
    public final void rule__LinkExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( rule__LinkExpression__Group__3__Impl rule__LinkExpression__Group__4 )
            // InternalMyDsl.g:3170:2: rule__LinkExpression__Group__3__Impl rule__LinkExpression__Group__4
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
    // InternalMyDsl.g:3177:1: rule__LinkExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__LinkExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:3182:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:3182:1: ( ( '](' ) )
            // InternalMyDsl.g:3183:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:3184:2: ( '](' )
            // InternalMyDsl.g:3184:3: ']('
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
    // InternalMyDsl.g:3192:1: rule__LinkExpression__Group__4 : rule__LinkExpression__Group__4__Impl rule__LinkExpression__Group__5 ;
    public final void rule__LinkExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3196:1: ( rule__LinkExpression__Group__4__Impl rule__LinkExpression__Group__5 )
            // InternalMyDsl.g:3197:2: rule__LinkExpression__Group__4__Impl rule__LinkExpression__Group__5
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
    // InternalMyDsl.g:3204:1: rule__LinkExpression__Group__4__Impl : ( ( rule__LinkExpression__LinkContentAssignment_4 )? ) ;
    public final void rule__LinkExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3208:1: ( ( ( rule__LinkExpression__LinkContentAssignment_4 )? ) )
            // InternalMyDsl.g:3209:1: ( ( rule__LinkExpression__LinkContentAssignment_4 )? )
            {
            // InternalMyDsl.g:3209:1: ( ( rule__LinkExpression__LinkContentAssignment_4 )? )
            // InternalMyDsl.g:3210:2: ( rule__LinkExpression__LinkContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkContentAssignment_4()); 
            }
            // InternalMyDsl.g:3211:2: ( rule__LinkExpression__LinkContentAssignment_4 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||LA41_0==14||(LA41_0>=16 && LA41_0<=18)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:3211:3: rule__LinkExpression__LinkContentAssignment_4
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
    // InternalMyDsl.g:3219:1: rule__LinkExpression__Group__5 : rule__LinkExpression__Group__5__Impl rule__LinkExpression__Group__6 ;
    public final void rule__LinkExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( rule__LinkExpression__Group__5__Impl rule__LinkExpression__Group__6 )
            // InternalMyDsl.g:3224:2: rule__LinkExpression__Group__5__Impl rule__LinkExpression__Group__6
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
    // InternalMyDsl.g:3231:1: rule__LinkExpression__Group__5__Impl : ( ( ')' ) ) ;
    public final void rule__LinkExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3235:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:3236:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:3236:1: ( ( ')' ) )
            // InternalMyDsl.g:3237:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:3238:2: ( ')' )
            // InternalMyDsl.g:3238:3: ')'
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
    // InternalMyDsl.g:3246:1: rule__LinkExpression__Group__6 : rule__LinkExpression__Group__6__Impl ;
    public final void rule__LinkExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3250:1: ( rule__LinkExpression__Group__6__Impl )
            // InternalMyDsl.g:3251:2: rule__LinkExpression__Group__6__Impl
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
    // InternalMyDsl.g:3257:1: rule__LinkExpression__Group__6__Impl : ( ( RULE_BL )? ) ;
    public final void rule__LinkExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3261:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3262:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3262:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3263:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_6()); 
            }
            // InternalMyDsl.g:3264:2: ( RULE_BL )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_BL) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred56_InternalMyDsl()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:3264:3: RULE_BL
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
    // InternalMyDsl.g:3273:1: rule__ImageExpression__Group__0 : rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1 ;
    public final void rule__ImageExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1 )
            // InternalMyDsl.g:3278:2: rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1
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
    // InternalMyDsl.g:3285:1: rule__ImageExpression__Group__0__Impl : ( () ) ;
    public final void rule__ImageExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3289:1: ( ( () ) )
            // InternalMyDsl.g:3290:1: ( () )
            {
            // InternalMyDsl.g:3290:1: ( () )
            // InternalMyDsl.g:3291:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getImageExpressionAction_0()); 
            }
            // InternalMyDsl.g:3292:2: ()
            // InternalMyDsl.g:3292:3: 
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
    // InternalMyDsl.g:3300:1: rule__ImageExpression__Group__1 : rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2 ;
    public final void rule__ImageExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2 )
            // InternalMyDsl.g:3305:2: rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:3312:1: rule__ImageExpression__Group__1__Impl : ( ( '![' ) ) ;
    public final void rule__ImageExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( ( ( '![' ) ) )
            // InternalMyDsl.g:3317:1: ( ( '![' ) )
            {
            // InternalMyDsl.g:3317:1: ( ( '![' ) )
            // InternalMyDsl.g:3318:2: ( '![' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:3319:2: ( '![' )
            // InternalMyDsl.g:3319:3: '!['
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
    // InternalMyDsl.g:3327:1: rule__ImageExpression__Group__2 : rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3 ;
    public final void rule__ImageExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3331:1: ( rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3 )
            // InternalMyDsl.g:3332:2: rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3
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
    // InternalMyDsl.g:3339:1: rule__ImageExpression__Group__2__Impl : ( ( rule__ImageExpression__AltTextAssignment_2 ) ) ;
    public final void rule__ImageExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3343:1: ( ( ( rule__ImageExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:3344:1: ( ( rule__ImageExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:3344:1: ( ( rule__ImageExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:3345:2: ( rule__ImageExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:3346:2: ( rule__ImageExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:3346:3: rule__ImageExpression__AltTextAssignment_2
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
    // InternalMyDsl.g:3354:1: rule__ImageExpression__Group__3 : rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4 ;
    public final void rule__ImageExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3358:1: ( rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4 )
            // InternalMyDsl.g:3359:2: rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4
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
    // InternalMyDsl.g:3366:1: rule__ImageExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__ImageExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3370:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:3371:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:3371:1: ( ( '](' ) )
            // InternalMyDsl.g:3372:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:3373:2: ( '](' )
            // InternalMyDsl.g:3373:3: ']('
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
    // InternalMyDsl.g:3381:1: rule__ImageExpression__Group__4 : rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5 ;
    public final void rule__ImageExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3385:1: ( rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5 )
            // InternalMyDsl.g:3386:2: rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5
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
    // InternalMyDsl.g:3393:1: rule__ImageExpression__Group__4__Impl : ( ( rule__ImageExpression__LinkContentAssignment_4 )? ) ;
    public final void rule__ImageExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3397:1: ( ( ( rule__ImageExpression__LinkContentAssignment_4 )? ) )
            // InternalMyDsl.g:3398:1: ( ( rule__ImageExpression__LinkContentAssignment_4 )? )
            {
            // InternalMyDsl.g:3398:1: ( ( rule__ImageExpression__LinkContentAssignment_4 )? )
            // InternalMyDsl.g:3399:2: ( rule__ImageExpression__LinkContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getLinkContentAssignment_4()); 
            }
            // InternalMyDsl.g:3400:2: ( rule__ImageExpression__LinkContentAssignment_4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_INT)||LA43_0==14||(LA43_0>=16 && LA43_0<=18)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:3400:3: rule__ImageExpression__LinkContentAssignment_4
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
    // InternalMyDsl.g:3408:1: rule__ImageExpression__Group__5 : rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6 ;
    public final void rule__ImageExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3412:1: ( rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6 )
            // InternalMyDsl.g:3413:2: rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6
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
    // InternalMyDsl.g:3420:1: rule__ImageExpression__Group__5__Impl : ( ( ')' ) ) ;
    public final void rule__ImageExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3424:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:3425:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:3425:1: ( ( ')' ) )
            // InternalMyDsl.g:3426:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:3427:2: ( ')' )
            // InternalMyDsl.g:3427:3: ')'
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
    // InternalMyDsl.g:3435:1: rule__ImageExpression__Group__6 : rule__ImageExpression__Group__6__Impl ;
    public final void rule__ImageExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3439:1: ( rule__ImageExpression__Group__6__Impl )
            // InternalMyDsl.g:3440:2: rule__ImageExpression__Group__6__Impl
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
    // InternalMyDsl.g:3446:1: rule__ImageExpression__Group__6__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ImageExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3450:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3451:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3451:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3452:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getBLTerminalRuleCall_6()); 
            }
            // InternalMyDsl.g:3453:2: ( RULE_BL )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_BL) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred58_InternalMyDsl()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:3453:3: RULE_BL
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
    // InternalMyDsl.g:3462:1: rule__VideoExpression__Group__0 : rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1 ;
    public final void rule__VideoExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3466:1: ( rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1 )
            // InternalMyDsl.g:3467:2: rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1
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
    // InternalMyDsl.g:3474:1: rule__VideoExpression__Group__0__Impl : ( () ) ;
    public final void rule__VideoExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3478:1: ( ( () ) )
            // InternalMyDsl.g:3479:1: ( () )
            {
            // InternalMyDsl.g:3479:1: ( () )
            // InternalMyDsl.g:3480:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0()); 
            }
            // InternalMyDsl.g:3481:2: ()
            // InternalMyDsl.g:3481:3: 
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
    // InternalMyDsl.g:3489:1: rule__VideoExpression__Group__1 : rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2 ;
    public final void rule__VideoExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3493:1: ( rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2 )
            // InternalMyDsl.g:3494:2: rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:3501:1: rule__VideoExpression__Group__1__Impl : ( ( '[![' ) ) ;
    public final void rule__VideoExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3505:1: ( ( ( '[![' ) ) )
            // InternalMyDsl.g:3506:1: ( ( '[![' ) )
            {
            // InternalMyDsl.g:3506:1: ( ( '[![' ) )
            // InternalMyDsl.g:3507:2: ( '[![' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:3508:2: ( '[![' )
            // InternalMyDsl.g:3508:3: '[!['
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
    // InternalMyDsl.g:3516:1: rule__VideoExpression__Group__2 : rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3 ;
    public final void rule__VideoExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3520:1: ( rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3 )
            // InternalMyDsl.g:3521:2: rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3
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
    // InternalMyDsl.g:3528:1: rule__VideoExpression__Group__2__Impl : ( ( rule__VideoExpression__AltTextAssignment_2 ) ) ;
    public final void rule__VideoExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3532:1: ( ( ( rule__VideoExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:3533:1: ( ( rule__VideoExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:3533:1: ( ( rule__VideoExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:3534:2: ( rule__VideoExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:3535:2: ( rule__VideoExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:3535:3: rule__VideoExpression__AltTextAssignment_2
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
    // InternalMyDsl.g:3543:1: rule__VideoExpression__Group__3 : rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4 ;
    public final void rule__VideoExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3547:1: ( rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4 )
            // InternalMyDsl.g:3548:2: rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4
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
    // InternalMyDsl.g:3555:1: rule__VideoExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__VideoExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3559:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:3560:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:3560:1: ( ( '](' ) )
            // InternalMyDsl.g:3561:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:3562:2: ( '](' )
            // InternalMyDsl.g:3562:3: ']('
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
    // InternalMyDsl.g:3570:1: rule__VideoExpression__Group__4 : rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5 ;
    public final void rule__VideoExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3574:1: ( rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5 )
            // InternalMyDsl.g:3575:2: rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5
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
    // InternalMyDsl.g:3582:1: rule__VideoExpression__Group__4__Impl : ( ( rule__VideoExpression__LinkImageAssignment_4 )? ) ;
    public final void rule__VideoExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( ( ( rule__VideoExpression__LinkImageAssignment_4 )? ) )
            // InternalMyDsl.g:3587:1: ( ( rule__VideoExpression__LinkImageAssignment_4 )? )
            {
            // InternalMyDsl.g:3587:1: ( ( rule__VideoExpression__LinkImageAssignment_4 )? )
            // InternalMyDsl.g:3588:2: ( rule__VideoExpression__LinkImageAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkImageAssignment_4()); 
            }
            // InternalMyDsl.g:3589:2: ( rule__VideoExpression__LinkImageAssignment_4 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INT)||LA45_0==14||(LA45_0>=16 && LA45_0<=18)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:3589:3: rule__VideoExpression__LinkImageAssignment_4
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
    // InternalMyDsl.g:3597:1: rule__VideoExpression__Group__5 : rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6 ;
    public final void rule__VideoExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3601:1: ( rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6 )
            // InternalMyDsl.g:3602:2: rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6
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
    // InternalMyDsl.g:3609:1: rule__VideoExpression__Group__5__Impl : ( ( ')](' ) ) ;
    public final void rule__VideoExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3613:1: ( ( ( ')](' ) ) )
            // InternalMyDsl.g:3614:1: ( ( ')](' ) )
            {
            // InternalMyDsl.g:3614:1: ( ( ')](' ) )
            // InternalMyDsl.g:3615:2: ( ')](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:3616:2: ( ')](' )
            // InternalMyDsl.g:3616:3: ')]('
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
    // InternalMyDsl.g:3624:1: rule__VideoExpression__Group__6 : rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7 ;
    public final void rule__VideoExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3628:1: ( rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7 )
            // InternalMyDsl.g:3629:2: rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7
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
    // InternalMyDsl.g:3636:1: rule__VideoExpression__Group__6__Impl : ( ( rule__VideoExpression__LinkVideoAssignment_6 )? ) ;
    public final void rule__VideoExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( ( ( rule__VideoExpression__LinkVideoAssignment_6 )? ) )
            // InternalMyDsl.g:3641:1: ( ( rule__VideoExpression__LinkVideoAssignment_6 )? )
            {
            // InternalMyDsl.g:3641:1: ( ( rule__VideoExpression__LinkVideoAssignment_6 )? )
            // InternalMyDsl.g:3642:2: ( rule__VideoExpression__LinkVideoAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkVideoAssignment_6()); 
            }
            // InternalMyDsl.g:3643:2: ( rule__VideoExpression__LinkVideoAssignment_6 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_INT)||LA46_0==14||(LA46_0>=16 && LA46_0<=18)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:3643:3: rule__VideoExpression__LinkVideoAssignment_6
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
    // InternalMyDsl.g:3651:1: rule__VideoExpression__Group__7 : rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8 ;
    public final void rule__VideoExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8 )
            // InternalMyDsl.g:3656:2: rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8
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
    // InternalMyDsl.g:3663:1: rule__VideoExpression__Group__7__Impl : ( ( ')' ) ) ;
    public final void rule__VideoExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3667:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:3668:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:3668:1: ( ( ')' ) )
            // InternalMyDsl.g:3669:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7()); 
            }
            // InternalMyDsl.g:3670:2: ( ')' )
            // InternalMyDsl.g:3670:3: ')'
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
    // InternalMyDsl.g:3678:1: rule__VideoExpression__Group__8 : rule__VideoExpression__Group__8__Impl ;
    public final void rule__VideoExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3682:1: ( rule__VideoExpression__Group__8__Impl )
            // InternalMyDsl.g:3683:2: rule__VideoExpression__Group__8__Impl
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
    // InternalMyDsl.g:3689:1: rule__VideoExpression__Group__8__Impl : ( ( RULE_BL )? ) ;
    public final void rule__VideoExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3693:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3694:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3694:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3695:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getBLTerminalRuleCall_8()); 
            }
            // InternalMyDsl.g:3696:2: ( RULE_BL )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_BL) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred61_InternalMyDsl()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:3696:3: RULE_BL
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
    // InternalMyDsl.g:3705:1: rule__Header1Expression__Group__0 : rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1 ;
    public final void rule__Header1Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3709:1: ( rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1 )
            // InternalMyDsl.g:3710:2: rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1
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
    // InternalMyDsl.g:3717:1: rule__Header1Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header1Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( ( () ) )
            // InternalMyDsl.g:3722:1: ( () )
            {
            // InternalMyDsl.g:3722:1: ( () )
            // InternalMyDsl.g:3723:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3724:2: ()
            // InternalMyDsl.g:3724:3: 
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
    // InternalMyDsl.g:3732:1: rule__Header1Expression__Group__1 : rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2 ;
    public final void rule__Header1Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3736:1: ( rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2 )
            // InternalMyDsl.g:3737:2: rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2
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
    // InternalMyDsl.g:3744:1: rule__Header1Expression__Group__1__Impl : ( '#' ) ;
    public final void rule__Header1Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( ( '#' ) )
            // InternalMyDsl.g:3749:1: ( '#' )
            {
            // InternalMyDsl.g:3749:1: ( '#' )
            // InternalMyDsl.g:3750:2: '#'
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
    // InternalMyDsl.g:3759:1: rule__Header1Expression__Group__2 : rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3 ;
    public final void rule__Header1Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3763:1: ( rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3 )
            // InternalMyDsl.g:3764:2: rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3
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
    // InternalMyDsl.g:3771:1: rule__Header1Expression__Group__2__Impl : ( ( rule__Header1Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header1Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3775:1: ( ( ( rule__Header1Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3776:1: ( ( rule__Header1Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3776:1: ( ( rule__Header1Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3777:2: ( rule__Header1Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3778:2: ( rule__Header1Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3778:3: rule__Header1Expression__TitleAssignment_2
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
    // InternalMyDsl.g:3786:1: rule__Header1Expression__Group__3 : rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4 ;
    public final void rule__Header1Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3790:1: ( rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4 )
            // InternalMyDsl.g:3791:2: rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4
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
    // InternalMyDsl.g:3798:1: rule__Header1Expression__Group__3__Impl : ( ( rule__Header1Expression__Group_3__0 )* ) ;
    public final void rule__Header1Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3802:1: ( ( ( rule__Header1Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3803:1: ( ( rule__Header1Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3803:1: ( ( rule__Header1Expression__Group_3__0 )* )
            // InternalMyDsl.g:3804:2: ( rule__Header1Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3805:2: ( rule__Header1Expression__Group_3__0 )*
            loop48:
            do {
                int alt48=2;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // InternalMyDsl.g:3805:3: rule__Header1Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header1Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalMyDsl.g:3813:1: rule__Header1Expression__Group__4 : rule__Header1Expression__Group__4__Impl ;
    public final void rule__Header1Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( rule__Header1Expression__Group__4__Impl )
            // InternalMyDsl.g:3818:2: rule__Header1Expression__Group__4__Impl
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
    // InternalMyDsl.g:3824:1: rule__Header1Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header1Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3828:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3829:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3829:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3830:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3831:2: ( RULE_BL )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_BL) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred63_InternalMyDsl()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:3831:3: RULE_BL
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
    // InternalMyDsl.g:3840:1: rule__Header1Expression__Group_3__0 : rule__Header1Expression__Group_3__0__Impl ;
    public final void rule__Header1Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3844:1: ( rule__Header1Expression__Group_3__0__Impl )
            // InternalMyDsl.g:3845:2: rule__Header1Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:3851:1: rule__Header1Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header1Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3855:1: ( ( '#' ) )
            // InternalMyDsl.g:3856:1: ( '#' )
            {
            // InternalMyDsl.g:3856:1: ( '#' )
            // InternalMyDsl.g:3857:2: '#'
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
    // InternalMyDsl.g:3867:1: rule__Header2Expression__Group__0 : rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1 ;
    public final void rule__Header2Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3871:1: ( rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1 )
            // InternalMyDsl.g:3872:2: rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1
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
    // InternalMyDsl.g:3879:1: rule__Header2Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header2Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3883:1: ( ( () ) )
            // InternalMyDsl.g:3884:1: ( () )
            {
            // InternalMyDsl.g:3884:1: ( () )
            // InternalMyDsl.g:3885:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3886:2: ()
            // InternalMyDsl.g:3886:3: 
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
    // InternalMyDsl.g:3894:1: rule__Header2Expression__Group__1 : rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2 ;
    public final void rule__Header2Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3898:1: ( rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2 )
            // InternalMyDsl.g:3899:2: rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2
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
    // InternalMyDsl.g:3906:1: rule__Header2Expression__Group__1__Impl : ( '##' ) ;
    public final void rule__Header2Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3910:1: ( ( '##' ) )
            // InternalMyDsl.g:3911:1: ( '##' )
            {
            // InternalMyDsl.g:3911:1: ( '##' )
            // InternalMyDsl.g:3912:2: '##'
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
    // InternalMyDsl.g:3921:1: rule__Header2Expression__Group__2 : rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3 ;
    public final void rule__Header2Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3925:1: ( rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3 )
            // InternalMyDsl.g:3926:2: rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3
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
    // InternalMyDsl.g:3933:1: rule__Header2Expression__Group__2__Impl : ( ( rule__Header2Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header2Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3937:1: ( ( ( rule__Header2Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3938:1: ( ( rule__Header2Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3938:1: ( ( rule__Header2Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3939:2: ( rule__Header2Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3940:2: ( rule__Header2Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3940:3: rule__Header2Expression__TitleAssignment_2
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
    // InternalMyDsl.g:3948:1: rule__Header2Expression__Group__3 : rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4 ;
    public final void rule__Header2Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3952:1: ( rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4 )
            // InternalMyDsl.g:3953:2: rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4
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
    // InternalMyDsl.g:3960:1: rule__Header2Expression__Group__3__Impl : ( ( rule__Header2Expression__Group_3__0 )* ) ;
    public final void rule__Header2Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3964:1: ( ( ( rule__Header2Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3965:1: ( ( rule__Header2Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3965:1: ( ( rule__Header2Expression__Group_3__0 )* )
            // InternalMyDsl.g:3966:2: ( rule__Header2Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3967:2: ( rule__Header2Expression__Group_3__0 )*
            loop50:
            do {
                int alt50=2;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:3967:3: rule__Header2Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header2Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalMyDsl.g:3975:1: rule__Header2Expression__Group__4 : rule__Header2Expression__Group__4__Impl ;
    public final void rule__Header2Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3979:1: ( rule__Header2Expression__Group__4__Impl )
            // InternalMyDsl.g:3980:2: rule__Header2Expression__Group__4__Impl
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
    // InternalMyDsl.g:3986:1: rule__Header2Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header2Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3991:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3991:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3992:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:3993:2: ( RULE_BL )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_BL) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred65_InternalMyDsl()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:3993:3: RULE_BL
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
    // InternalMyDsl.g:4002:1: rule__Header2Expression__Group_3__0 : rule__Header2Expression__Group_3__0__Impl ;
    public final void rule__Header2Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4006:1: ( rule__Header2Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4007:2: rule__Header2Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4013:1: rule__Header2Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header2Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4017:1: ( ( '#' ) )
            // InternalMyDsl.g:4018:1: ( '#' )
            {
            // InternalMyDsl.g:4018:1: ( '#' )
            // InternalMyDsl.g:4019:2: '#'
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
    // InternalMyDsl.g:4029:1: rule__Header3Expression__Group__0 : rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1 ;
    public final void rule__Header3Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4033:1: ( rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1 )
            // InternalMyDsl.g:4034:2: rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1
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
    // InternalMyDsl.g:4041:1: rule__Header3Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header3Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4045:1: ( ( () ) )
            // InternalMyDsl.g:4046:1: ( () )
            {
            // InternalMyDsl.g:4046:1: ( () )
            // InternalMyDsl.g:4047:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4048:2: ()
            // InternalMyDsl.g:4048:3: 
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
    // InternalMyDsl.g:4056:1: rule__Header3Expression__Group__1 : rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2 ;
    public final void rule__Header3Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4060:1: ( rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2 )
            // InternalMyDsl.g:4061:2: rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2
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
    // InternalMyDsl.g:4068:1: rule__Header3Expression__Group__1__Impl : ( '###' ) ;
    public final void rule__Header3Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4072:1: ( ( '###' ) )
            // InternalMyDsl.g:4073:1: ( '###' )
            {
            // InternalMyDsl.g:4073:1: ( '###' )
            // InternalMyDsl.g:4074:2: '###'
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
    // InternalMyDsl.g:4083:1: rule__Header3Expression__Group__2 : rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3 ;
    public final void rule__Header3Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4087:1: ( rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3 )
            // InternalMyDsl.g:4088:2: rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3
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
    // InternalMyDsl.g:4095:1: rule__Header3Expression__Group__2__Impl : ( ( rule__Header3Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header3Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4099:1: ( ( ( rule__Header3Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4100:1: ( ( rule__Header3Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4100:1: ( ( rule__Header3Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4101:2: ( rule__Header3Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4102:2: ( rule__Header3Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4102:3: rule__Header3Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4110:1: rule__Header3Expression__Group__3 : rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4 ;
    public final void rule__Header3Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4114:1: ( rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4 )
            // InternalMyDsl.g:4115:2: rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4
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
    // InternalMyDsl.g:4122:1: rule__Header3Expression__Group__3__Impl : ( ( rule__Header3Expression__Group_3__0 )* ) ;
    public final void rule__Header3Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4126:1: ( ( ( rule__Header3Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4127:1: ( ( rule__Header3Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4127:1: ( ( rule__Header3Expression__Group_3__0 )* )
            // InternalMyDsl.g:4128:2: ( rule__Header3Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4129:2: ( rule__Header3Expression__Group_3__0 )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // InternalMyDsl.g:4129:3: rule__Header3Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header3Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalMyDsl.g:4137:1: rule__Header3Expression__Group__4 : rule__Header3Expression__Group__4__Impl ;
    public final void rule__Header3Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4141:1: ( rule__Header3Expression__Group__4__Impl )
            // InternalMyDsl.g:4142:2: rule__Header3Expression__Group__4__Impl
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
    // InternalMyDsl.g:4148:1: rule__Header3Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header3Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4152:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4153:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4153:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4154:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4155:2: ( RULE_BL )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_BL) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred67_InternalMyDsl()) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:4155:3: RULE_BL
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
    // InternalMyDsl.g:4164:1: rule__Header3Expression__Group_3__0 : rule__Header3Expression__Group_3__0__Impl ;
    public final void rule__Header3Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4168:1: ( rule__Header3Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4169:2: rule__Header3Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4175:1: rule__Header3Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header3Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4179:1: ( ( '#' ) )
            // InternalMyDsl.g:4180:1: ( '#' )
            {
            // InternalMyDsl.g:4180:1: ( '#' )
            // InternalMyDsl.g:4181:2: '#'
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
    // InternalMyDsl.g:4191:1: rule__Header4Expression__Group__0 : rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1 ;
    public final void rule__Header4Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4195:1: ( rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1 )
            // InternalMyDsl.g:4196:2: rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1
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
    // InternalMyDsl.g:4203:1: rule__Header4Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header4Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4207:1: ( ( () ) )
            // InternalMyDsl.g:4208:1: ( () )
            {
            // InternalMyDsl.g:4208:1: ( () )
            // InternalMyDsl.g:4209:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4210:2: ()
            // InternalMyDsl.g:4210:3: 
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
    // InternalMyDsl.g:4218:1: rule__Header4Expression__Group__1 : rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2 ;
    public final void rule__Header4Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4222:1: ( rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2 )
            // InternalMyDsl.g:4223:2: rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2
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
    // InternalMyDsl.g:4230:1: rule__Header4Expression__Group__1__Impl : ( '####' ) ;
    public final void rule__Header4Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4234:1: ( ( '####' ) )
            // InternalMyDsl.g:4235:1: ( '####' )
            {
            // InternalMyDsl.g:4235:1: ( '####' )
            // InternalMyDsl.g:4236:2: '####'
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
    // InternalMyDsl.g:4245:1: rule__Header4Expression__Group__2 : rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3 ;
    public final void rule__Header4Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4249:1: ( rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3 )
            // InternalMyDsl.g:4250:2: rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3
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
    // InternalMyDsl.g:4257:1: rule__Header4Expression__Group__2__Impl : ( ( rule__Header4Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header4Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4261:1: ( ( ( rule__Header4Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4262:1: ( ( rule__Header4Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4262:1: ( ( rule__Header4Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4263:2: ( rule__Header4Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4264:2: ( rule__Header4Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4264:3: rule__Header4Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4272:1: rule__Header4Expression__Group__3 : rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4 ;
    public final void rule__Header4Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4276:1: ( rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4 )
            // InternalMyDsl.g:4277:2: rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4
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
    // InternalMyDsl.g:4284:1: rule__Header4Expression__Group__3__Impl : ( ( rule__Header4Expression__Group_3__0 )* ) ;
    public final void rule__Header4Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4288:1: ( ( ( rule__Header4Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4289:1: ( ( rule__Header4Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4289:1: ( ( rule__Header4Expression__Group_3__0 )* )
            // InternalMyDsl.g:4290:2: ( rule__Header4Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4291:2: ( rule__Header4Expression__Group_3__0 )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // InternalMyDsl.g:4291:3: rule__Header4Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header4Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalMyDsl.g:4299:1: rule__Header4Expression__Group__4 : rule__Header4Expression__Group__4__Impl ;
    public final void rule__Header4Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4303:1: ( rule__Header4Expression__Group__4__Impl )
            // InternalMyDsl.g:4304:2: rule__Header4Expression__Group__4__Impl
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
    // InternalMyDsl.g:4310:1: rule__Header4Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header4Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4314:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4315:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4315:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4316:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4317:2: ( RULE_BL )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_BL) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred69_InternalMyDsl()) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:4317:3: RULE_BL
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
    // InternalMyDsl.g:4326:1: rule__Header4Expression__Group_3__0 : rule__Header4Expression__Group_3__0__Impl ;
    public final void rule__Header4Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4330:1: ( rule__Header4Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4331:2: rule__Header4Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4337:1: rule__Header4Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header4Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4341:1: ( ( '#' ) )
            // InternalMyDsl.g:4342:1: ( '#' )
            {
            // InternalMyDsl.g:4342:1: ( '#' )
            // InternalMyDsl.g:4343:2: '#'
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
    // InternalMyDsl.g:4353:1: rule__Header5Expression__Group__0 : rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1 ;
    public final void rule__Header5Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4357:1: ( rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1 )
            // InternalMyDsl.g:4358:2: rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1
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
    // InternalMyDsl.g:4365:1: rule__Header5Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header5Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4369:1: ( ( () ) )
            // InternalMyDsl.g:4370:1: ( () )
            {
            // InternalMyDsl.g:4370:1: ( () )
            // InternalMyDsl.g:4371:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4372:2: ()
            // InternalMyDsl.g:4372:3: 
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
    // InternalMyDsl.g:4380:1: rule__Header5Expression__Group__1 : rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2 ;
    public final void rule__Header5Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4384:1: ( rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2 )
            // InternalMyDsl.g:4385:2: rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2
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
    // InternalMyDsl.g:4392:1: rule__Header5Expression__Group__1__Impl : ( '#####' ) ;
    public final void rule__Header5Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4396:1: ( ( '#####' ) )
            // InternalMyDsl.g:4397:1: ( '#####' )
            {
            // InternalMyDsl.g:4397:1: ( '#####' )
            // InternalMyDsl.g:4398:2: '#####'
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
    // InternalMyDsl.g:4407:1: rule__Header5Expression__Group__2 : rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3 ;
    public final void rule__Header5Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4411:1: ( rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3 )
            // InternalMyDsl.g:4412:2: rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3
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
    // InternalMyDsl.g:4419:1: rule__Header5Expression__Group__2__Impl : ( ( rule__Header5Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header5Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4423:1: ( ( ( rule__Header5Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4424:1: ( ( rule__Header5Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4424:1: ( ( rule__Header5Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4425:2: ( rule__Header5Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4426:2: ( rule__Header5Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4426:3: rule__Header5Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4434:1: rule__Header5Expression__Group__3 : rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4 ;
    public final void rule__Header5Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4438:1: ( rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4 )
            // InternalMyDsl.g:4439:2: rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4
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
    // InternalMyDsl.g:4446:1: rule__Header5Expression__Group__3__Impl : ( ( rule__Header5Expression__Group_3__0 )* ) ;
    public final void rule__Header5Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4450:1: ( ( ( rule__Header5Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4451:1: ( ( rule__Header5Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4451:1: ( ( rule__Header5Expression__Group_3__0 )* )
            // InternalMyDsl.g:4452:2: ( rule__Header5Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4453:2: ( rule__Header5Expression__Group_3__0 )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:4453:3: rule__Header5Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header5Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalMyDsl.g:4461:1: rule__Header5Expression__Group__4 : rule__Header5Expression__Group__4__Impl ;
    public final void rule__Header5Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4465:1: ( rule__Header5Expression__Group__4__Impl )
            // InternalMyDsl.g:4466:2: rule__Header5Expression__Group__4__Impl
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
    // InternalMyDsl.g:4472:1: rule__Header5Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header5Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4476:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4477:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4477:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4478:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4479:2: ( RULE_BL )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_BL) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred71_InternalMyDsl()) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:4479:3: RULE_BL
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
    // InternalMyDsl.g:4488:1: rule__Header5Expression__Group_3__0 : rule__Header5Expression__Group_3__0__Impl ;
    public final void rule__Header5Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4492:1: ( rule__Header5Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4493:2: rule__Header5Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4499:1: rule__Header5Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header5Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4503:1: ( ( '#' ) )
            // InternalMyDsl.g:4504:1: ( '#' )
            {
            // InternalMyDsl.g:4504:1: ( '#' )
            // InternalMyDsl.g:4505:2: '#'
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
    // InternalMyDsl.g:4515:1: rule__Header6Expression__Group__0 : rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1 ;
    public final void rule__Header6Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4519:1: ( rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1 )
            // InternalMyDsl.g:4520:2: rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1
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
    // InternalMyDsl.g:4527:1: rule__Header6Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header6Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4531:1: ( ( () ) )
            // InternalMyDsl.g:4532:1: ( () )
            {
            // InternalMyDsl.g:4532:1: ( () )
            // InternalMyDsl.g:4533:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4534:2: ()
            // InternalMyDsl.g:4534:3: 
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
    // InternalMyDsl.g:4542:1: rule__Header6Expression__Group__1 : rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2 ;
    public final void rule__Header6Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4546:1: ( rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2 )
            // InternalMyDsl.g:4547:2: rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2
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
    // InternalMyDsl.g:4554:1: rule__Header6Expression__Group__1__Impl : ( '######' ) ;
    public final void rule__Header6Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( ( '######' ) )
            // InternalMyDsl.g:4559:1: ( '######' )
            {
            // InternalMyDsl.g:4559:1: ( '######' )
            // InternalMyDsl.g:4560:2: '######'
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
    // InternalMyDsl.g:4569:1: rule__Header6Expression__Group__2 : rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3 ;
    public final void rule__Header6Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4573:1: ( rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3 )
            // InternalMyDsl.g:4574:2: rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3
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
    // InternalMyDsl.g:4581:1: rule__Header6Expression__Group__2__Impl : ( ( rule__Header6Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header6Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4585:1: ( ( ( rule__Header6Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4586:1: ( ( rule__Header6Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4586:1: ( ( rule__Header6Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4587:2: ( rule__Header6Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4588:2: ( rule__Header6Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4588:3: rule__Header6Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4596:1: rule__Header6Expression__Group__3 : rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4 ;
    public final void rule__Header6Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4600:1: ( rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4 )
            // InternalMyDsl.g:4601:2: rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4
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
    // InternalMyDsl.g:4608:1: rule__Header6Expression__Group__3__Impl : ( ( rule__Header6Expression__Group_3__0 )* ) ;
    public final void rule__Header6Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4612:1: ( ( ( rule__Header6Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4613:1: ( ( rule__Header6Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4613:1: ( ( rule__Header6Expression__Group_3__0 )* )
            // InternalMyDsl.g:4614:2: ( rule__Header6Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4615:2: ( rule__Header6Expression__Group_3__0 )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // InternalMyDsl.g:4615:3: rule__Header6Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Header6Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalMyDsl.g:4623:1: rule__Header6Expression__Group__4 : rule__Header6Expression__Group__4__Impl ;
    public final void rule__Header6Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4627:1: ( rule__Header6Expression__Group__4__Impl )
            // InternalMyDsl.g:4628:2: rule__Header6Expression__Group__4__Impl
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
    // InternalMyDsl.g:4634:1: rule__Header6Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header6Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4638:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4639:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4639:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4640:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4641:2: ( RULE_BL )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_BL) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred73_InternalMyDsl()) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:4641:3: RULE_BL
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
    // InternalMyDsl.g:4650:1: rule__Header6Expression__Group_3__0 : rule__Header6Expression__Group_3__0__Impl ;
    public final void rule__Header6Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4654:1: ( rule__Header6Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4655:2: rule__Header6Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4661:1: rule__Header6Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header6Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4665:1: ( ( '#' ) )
            // InternalMyDsl.g:4666:1: ( '#' )
            {
            // InternalMyDsl.g:4666:1: ( '#' )
            // InternalMyDsl.g:4667:2: '#'
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
    // InternalMyDsl.g:4677:1: rule__EmphasisExpression__Group_0__0 : rule__EmphasisExpression__Group_0__0__Impl ;
    public final void rule__EmphasisExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4681:1: ( rule__EmphasisExpression__Group_0__0__Impl )
            // InternalMyDsl.g:4682:2: rule__EmphasisExpression__Group_0__0__Impl
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
    // InternalMyDsl.g:4688:1: rule__EmphasisExpression__Group_0__0__Impl : ( ( rule__EmphasisExpression__Alternatives_0_0 ) ) ;
    public final void rule__EmphasisExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4692:1: ( ( ( rule__EmphasisExpression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:4693:1: ( ( rule__EmphasisExpression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:4693:1: ( ( rule__EmphasisExpression__Alternatives_0_0 ) )
            // InternalMyDsl.g:4694:2: ( rule__EmphasisExpression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:4695:2: ( rule__EmphasisExpression__Alternatives_0_0 )
            // InternalMyDsl.g:4695:3: rule__EmphasisExpression__Alternatives_0_0
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
    // InternalMyDsl.g:4704:1: rule__StrongExpression__Group__0 : rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1 ;
    public final void rule__StrongExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4708:1: ( rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1 )
            // InternalMyDsl.g:4709:2: rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1
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
    // InternalMyDsl.g:4716:1: rule__StrongExpression__Group__0__Impl : ( () ) ;
    public final void rule__StrongExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4720:1: ( ( () ) )
            // InternalMyDsl.g:4721:1: ( () )
            {
            // InternalMyDsl.g:4721:1: ( () )
            // InternalMyDsl.g:4722:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0()); 
            }
            // InternalMyDsl.g:4723:2: ()
            // InternalMyDsl.g:4723:3: 
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
    // InternalMyDsl.g:4731:1: rule__StrongExpression__Group__1 : rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2 ;
    public final void rule__StrongExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4735:1: ( rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2 )
            // InternalMyDsl.g:4736:2: rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2
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
    // InternalMyDsl.g:4743:1: rule__StrongExpression__Group__1__Impl : ( '**' ) ;
    public final void rule__StrongExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4747:1: ( ( '**' ) )
            // InternalMyDsl.g:4748:1: ( '**' )
            {
            // InternalMyDsl.g:4748:1: ( '**' )
            // InternalMyDsl.g:4749:2: '**'
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
    // InternalMyDsl.g:4758:1: rule__StrongExpression__Group__2 : rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3 ;
    public final void rule__StrongExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4762:1: ( rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3 )
            // InternalMyDsl.g:4763:2: rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3
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
    // InternalMyDsl.g:4770:1: rule__StrongExpression__Group__2__Impl : ( ( rule__StrongExpression__ContentAssignment_2 ) ) ;
    public final void rule__StrongExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4774:1: ( ( ( rule__StrongExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4775:1: ( ( rule__StrongExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4775:1: ( ( rule__StrongExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4776:2: ( rule__StrongExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4777:2: ( rule__StrongExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4777:3: rule__StrongExpression__ContentAssignment_2
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
    // InternalMyDsl.g:4785:1: rule__StrongExpression__Group__3 : rule__StrongExpression__Group__3__Impl ;
    public final void rule__StrongExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4789:1: ( rule__StrongExpression__Group__3__Impl )
            // InternalMyDsl.g:4790:2: rule__StrongExpression__Group__3__Impl
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
    // InternalMyDsl.g:4796:1: rule__StrongExpression__Group__3__Impl : ( '**' ) ;
    public final void rule__StrongExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4800:1: ( ( '**' ) )
            // InternalMyDsl.g:4801:1: ( '**' )
            {
            // InternalMyDsl.g:4801:1: ( '**' )
            // InternalMyDsl.g:4802:2: '**'
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
    // InternalMyDsl.g:4812:1: rule__ItalicExpression__Group__0 : rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1 ;
    public final void rule__ItalicExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4816:1: ( rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1 )
            // InternalMyDsl.g:4817:2: rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1
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
    // InternalMyDsl.g:4824:1: rule__ItalicExpression__Group__0__Impl : ( () ) ;
    public final void rule__ItalicExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4828:1: ( ( () ) )
            // InternalMyDsl.g:4829:1: ( () )
            {
            // InternalMyDsl.g:4829:1: ( () )
            // InternalMyDsl.g:4830:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0()); 
            }
            // InternalMyDsl.g:4831:2: ()
            // InternalMyDsl.g:4831:3: 
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
    // InternalMyDsl.g:4839:1: rule__ItalicExpression__Group__1 : rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2 ;
    public final void rule__ItalicExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4843:1: ( rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2 )
            // InternalMyDsl.g:4844:2: rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2
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
    // InternalMyDsl.g:4851:1: rule__ItalicExpression__Group__1__Impl : ( '*' ) ;
    public final void rule__ItalicExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4855:1: ( ( '*' ) )
            // InternalMyDsl.g:4856:1: ( '*' )
            {
            // InternalMyDsl.g:4856:1: ( '*' )
            // InternalMyDsl.g:4857:2: '*'
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
    // InternalMyDsl.g:4866:1: rule__ItalicExpression__Group__2 : rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3 ;
    public final void rule__ItalicExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3 )
            // InternalMyDsl.g:4871:2: rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3
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
    // InternalMyDsl.g:4878:1: rule__ItalicExpression__Group__2__Impl : ( ( rule__ItalicExpression__ContentAssignment_2 ) ) ;
    public final void rule__ItalicExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4882:1: ( ( ( rule__ItalicExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4883:1: ( ( rule__ItalicExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4883:1: ( ( rule__ItalicExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4884:2: ( rule__ItalicExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4885:2: ( rule__ItalicExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4885:3: rule__ItalicExpression__ContentAssignment_2
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
    // InternalMyDsl.g:4893:1: rule__ItalicExpression__Group__3 : rule__ItalicExpression__Group__3__Impl ;
    public final void rule__ItalicExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4897:1: ( rule__ItalicExpression__Group__3__Impl )
            // InternalMyDsl.g:4898:2: rule__ItalicExpression__Group__3__Impl
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
    // InternalMyDsl.g:4904:1: rule__ItalicExpression__Group__3__Impl : ( '*' ) ;
    public final void rule__ItalicExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4908:1: ( ( '*' ) )
            // InternalMyDsl.g:4909:1: ( '*' )
            {
            // InternalMyDsl.g:4909:1: ( '*' )
            // InternalMyDsl.g:4910:2: '*'
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
    // InternalMyDsl.g:4920:1: rule__ScratchExpression__Group__0 : rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1 ;
    public final void rule__ScratchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4924:1: ( rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1 )
            // InternalMyDsl.g:4925:2: rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1
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
    // InternalMyDsl.g:4932:1: rule__ScratchExpression__Group__0__Impl : ( () ) ;
    public final void rule__ScratchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4936:1: ( ( () ) )
            // InternalMyDsl.g:4937:1: ( () )
            {
            // InternalMyDsl.g:4937:1: ( () )
            // InternalMyDsl.g:4938:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0()); 
            }
            // InternalMyDsl.g:4939:2: ()
            // InternalMyDsl.g:4939:3: 
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
    // InternalMyDsl.g:4947:1: rule__ScratchExpression__Group__1 : rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2 ;
    public final void rule__ScratchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4951:1: ( rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2 )
            // InternalMyDsl.g:4952:2: rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2
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
    // InternalMyDsl.g:4959:1: rule__ScratchExpression__Group__1__Impl : ( '~~' ) ;
    public final void rule__ScratchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4963:1: ( ( '~~' ) )
            // InternalMyDsl.g:4964:1: ( '~~' )
            {
            // InternalMyDsl.g:4964:1: ( '~~' )
            // InternalMyDsl.g:4965:2: '~~'
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
    // InternalMyDsl.g:4974:1: rule__ScratchExpression__Group__2 : rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3 ;
    public final void rule__ScratchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4978:1: ( rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3 )
            // InternalMyDsl.g:4979:2: rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3
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
    // InternalMyDsl.g:4986:1: rule__ScratchExpression__Group__2__Impl : ( ( rule__ScratchExpression__ContentAssignment_2 ) ) ;
    public final void rule__ScratchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4990:1: ( ( ( rule__ScratchExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4991:1: ( ( rule__ScratchExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4991:1: ( ( rule__ScratchExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4992:2: ( rule__ScratchExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4993:2: ( rule__ScratchExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4993:3: rule__ScratchExpression__ContentAssignment_2
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
    // InternalMyDsl.g:5001:1: rule__ScratchExpression__Group__3 : rule__ScratchExpression__Group__3__Impl ;
    public final void rule__ScratchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5005:1: ( rule__ScratchExpression__Group__3__Impl )
            // InternalMyDsl.g:5006:2: rule__ScratchExpression__Group__3__Impl
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
    // InternalMyDsl.g:5012:1: rule__ScratchExpression__Group__3__Impl : ( '~~' ) ;
    public final void rule__ScratchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5016:1: ( ( '~~' ) )
            // InternalMyDsl.g:5017:1: ( '~~' )
            {
            // InternalMyDsl.g:5017:1: ( '~~' )
            // InternalMyDsl.g:5018:2: '~~'
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
    // InternalMyDsl.g:5028:1: rule__NaturalExpression__Group__0 : rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 ;
    public final void rule__NaturalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5032:1: ( rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 )
            // InternalMyDsl.g:5033:2: rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:5040:1: rule__NaturalExpression__Group__0__Impl : ( () ) ;
    public final void rule__NaturalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5044:1: ( ( () ) )
            // InternalMyDsl.g:5045:1: ( () )
            {
            // InternalMyDsl.g:5045:1: ( () )
            // InternalMyDsl.g:5046:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getNaturalExpressionAction_0()); 
            }
            // InternalMyDsl.g:5047:2: ()
            // InternalMyDsl.g:5047:3: 
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
    // InternalMyDsl.g:5055:1: rule__NaturalExpression__Group__1 : rule__NaturalExpression__Group__1__Impl ;
    public final void rule__NaturalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5059:1: ( rule__NaturalExpression__Group__1__Impl )
            // InternalMyDsl.g:5060:2: rule__NaturalExpression__Group__1__Impl
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
    // InternalMyDsl.g:5066:1: rule__NaturalExpression__Group__1__Impl : ( ( rule__NaturalExpression__ValueAssignment_1 ) ) ;
    public final void rule__NaturalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5070:1: ( ( ( rule__NaturalExpression__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:5071:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:5071:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            // InternalMyDsl.g:5072:2: ( rule__NaturalExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getValueAssignment_1()); 
            }
            // InternalMyDsl.g:5073:2: ( rule__NaturalExpression__ValueAssignment_1 )
            // InternalMyDsl.g:5073:3: rule__NaturalExpression__ValueAssignment_1
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
    // InternalMyDsl.g:5082:1: rule__Content__Group_0__0 : rule__Content__Group_0__0__Impl ;
    public final void rule__Content__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5086:1: ( rule__Content__Group_0__0__Impl )
            // InternalMyDsl.g:5087:2: rule__Content__Group_0__0__Impl
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
    // InternalMyDsl.g:5093:1: rule__Content__Group_0__0__Impl : ( ( rule__Content__Alternatives_0_0 ) ) ;
    public final void rule__Content__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5097:1: ( ( ( rule__Content__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:5098:1: ( ( rule__Content__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:5098:1: ( ( rule__Content__Alternatives_0_0 ) )
            // InternalMyDsl.g:5099:2: ( rule__Content__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:5100:2: ( rule__Content__Alternatives_0_0 )
            // InternalMyDsl.g:5100:3: rule__Content__Alternatives_0_0
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
    // InternalMyDsl.g:5109:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5113:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5114:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5114:2: ( ruleExpression )
            // InternalMyDsl.g:5115:3: ruleExpression
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
    // InternalMyDsl.g:5124:1: rule__Expression__CAssignment_0_0_0 : ( ruleHeaderExpression ) ;
    public final void rule__Expression__CAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5128:1: ( ( ruleHeaderExpression ) )
            // InternalMyDsl.g:5129:2: ( ruleHeaderExpression )
            {
            // InternalMyDsl.g:5129:2: ( ruleHeaderExpression )
            // InternalMyDsl.g:5130:3: ruleHeaderExpression
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
    // InternalMyDsl.g:5139:1: rule__Expression__CAssignment_0_0_1 : ( ruleBreakLineExpression ) ;
    public final void rule__Expression__CAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5143:1: ( ( ruleBreakLineExpression ) )
            // InternalMyDsl.g:5144:2: ( ruleBreakLineExpression )
            {
            // InternalMyDsl.g:5144:2: ( ruleBreakLineExpression )
            // InternalMyDsl.g:5145:3: ruleBreakLineExpression
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
    // InternalMyDsl.g:5154:1: rule__Expression__CAssignment_0_0_2 : ( ruleRefExpression ) ;
    public final void rule__Expression__CAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5158:1: ( ( ruleRefExpression ) )
            // InternalMyDsl.g:5159:2: ( ruleRefExpression )
            {
            // InternalMyDsl.g:5159:2: ( ruleRefExpression )
            // InternalMyDsl.g:5160:3: ruleRefExpression
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
    // InternalMyDsl.g:5169:1: rule__Expression__CAssignment_0_0_3_0 : ( ruleHorizontalExpression ) ;
    public final void rule__Expression__CAssignment_0_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5173:1: ( ( ruleHorizontalExpression ) )
            // InternalMyDsl.g:5174:2: ( ruleHorizontalExpression )
            {
            // InternalMyDsl.g:5174:2: ( ruleHorizontalExpression )
            // InternalMyDsl.g:5175:3: ruleHorizontalExpression
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
    // InternalMyDsl.g:5184:1: rule__Expression__CAssignment_0_0_4_0 : ( ruleListExpression ) ;
    public final void rule__Expression__CAssignment_0_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5188:1: ( ( ruleListExpression ) )
            // InternalMyDsl.g:5189:2: ( ruleListExpression )
            {
            // InternalMyDsl.g:5189:2: ( ruleListExpression )
            // InternalMyDsl.g:5190:3: ruleListExpression
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
    // InternalMyDsl.g:5199:1: rule__Expression__CAssignment_1_0 : ( ruleTextExpression ) ;
    public final void rule__Expression__CAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5203:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5204:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5204:2: ( ruleTextExpression )
            // InternalMyDsl.g:5205:3: ruleTextExpression
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
    // InternalMyDsl.g:5214:1: rule__ListExpression__ContentUnorderedAssignment_0_1_2 : ( ruleTextExpression ) ;
    public final void rule__ListExpression__ContentUnorderedAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5218:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5219:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5219:2: ( ruleTextExpression )
            // InternalMyDsl.g:5220:3: ruleTextExpression
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
    // InternalMyDsl.g:5229:1: rule__ListExpression__ContentOrderedAssignment_1_3 : ( ruleTextExpression ) ;
    public final void rule__ListExpression__ContentOrderedAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5233:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5234:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5234:2: ( ruleTextExpression )
            // InternalMyDsl.g:5235:3: ruleTextExpression
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
    // InternalMyDsl.g:5244:1: rule__QuoteExpression__ContentAssignment_2 : ( ruleTextExpression ) ;
    public final void rule__QuoteExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5248:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5249:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5249:2: ( ruleTextExpression )
            // InternalMyDsl.g:5250:3: ruleTextExpression
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
    // InternalMyDsl.g:5259:1: rule__TabExpression__HeaderAssignment_1_0_0 : ( ruleLineExpression ) ;
    public final void rule__TabExpression__HeaderAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5263:1: ( ( ruleLineExpression ) )
            // InternalMyDsl.g:5264:2: ( ruleLineExpression )
            {
            // InternalMyDsl.g:5264:2: ( ruleLineExpression )
            // InternalMyDsl.g:5265:3: ruleLineExpression
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
    // InternalMyDsl.g:5274:1: rule__TabExpression__LinesAssignment_1_0_3_0_1 : ( ruleLineExpression ) ;
    public final void rule__TabExpression__LinesAssignment_1_0_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5278:1: ( ( ruleLineExpression ) )
            // InternalMyDsl.g:5279:2: ( ruleLineExpression )
            {
            // InternalMyDsl.g:5279:2: ( ruleLineExpression )
            // InternalMyDsl.g:5280:3: ruleLineExpression
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
    // InternalMyDsl.g:5289:1: rule__LineExpression__CellsAssignment_1 : ( ruleNaturalExpression ) ;
    public final void rule__LineExpression__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5293:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5294:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5294:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5295:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5304:1: rule__LineExpression__CellsAssignment_2_1 : ( ruleNaturalExpression ) ;
    public final void rule__LineExpression__CellsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5308:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5309:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5309:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5310:3: ruleNaturalExpression
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


    // $ANTLR start "rule__URLedExpression__CAssignment_1_0_0_0"
    // InternalMyDsl.g:5319:1: rule__URLedExpression__CAssignment_1_0_0_0 : ( ruleImageExpression ) ;
    public final void rule__URLedExpression__CAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5323:1: ( ( ruleImageExpression ) )
            // InternalMyDsl.g:5324:2: ( ruleImageExpression )
            {
            // InternalMyDsl.g:5324:2: ( ruleImageExpression )
            // InternalMyDsl.g:5325:3: ruleImageExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getCImageExpressionParserRuleCall_1_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImageExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLedExpressionAccess().getCImageExpressionParserRuleCall_1_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLedExpression__CAssignment_1_0_0_0"


    // $ANTLR start "rule__URLedExpression__CAssignment_1_0_0_1"
    // InternalMyDsl.g:5334:1: rule__URLedExpression__CAssignment_1_0_0_1 : ( ruleVideoExpression ) ;
    public final void rule__URLedExpression__CAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5338:1: ( ( ruleVideoExpression ) )
            // InternalMyDsl.g:5339:2: ( ruleVideoExpression )
            {
            // InternalMyDsl.g:5339:2: ( ruleVideoExpression )
            // InternalMyDsl.g:5340:3: ruleVideoExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getCVideoExpressionParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVideoExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLedExpressionAccess().getCVideoExpressionParserRuleCall_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLedExpression__CAssignment_1_0_0_1"


    // $ANTLR start "rule__URLedExpression__CAssignment_1_1"
    // InternalMyDsl.g:5349:1: rule__URLedExpression__CAssignment_1_1 : ( ruleLinkExpression ) ;
    public final void rule__URLedExpression__CAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5353:1: ( ( ruleLinkExpression ) )
            // InternalMyDsl.g:5354:2: ( ruleLinkExpression )
            {
            // InternalMyDsl.g:5354:2: ( ruleLinkExpression )
            // InternalMyDsl.g:5355:3: ruleLinkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getCLinkExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLinkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLedExpressionAccess().getCLinkExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLedExpression__CAssignment_1_1"


    // $ANTLR start "rule__RefExpression__RefNameAssignment_2"
    // InternalMyDsl.g:5364:1: rule__RefExpression__RefNameAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__RefExpression__RefNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5368:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5369:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5369:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5370:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5379:1: rule__RefExpression__RefContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__RefExpression__RefContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5383:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5384:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5384:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5385:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5394:1: rule__LinkExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5398:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5399:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5399:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5400:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5409:1: rule__LinkExpression__LinkContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__LinkContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5413:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5414:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5414:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5415:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5424:1: rule__ImageExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__ImageExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5428:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5429:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5429:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5430:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5439:1: rule__ImageExpression__LinkContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__ImageExpression__LinkContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5443:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5444:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5444:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5445:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5454:1: rule__VideoExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5458:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5459:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5459:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5460:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5469:1: rule__VideoExpression__LinkImageAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__LinkImageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5473:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5474:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5474:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5475:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5484:1: rule__VideoExpression__LinkVideoAssignment_6 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__LinkVideoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5488:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5489:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5489:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5490:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5499:1: rule__Header1Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header1Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5503:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5504:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5504:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5505:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5514:1: rule__Header2Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header2Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5518:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5519:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5519:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5520:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5529:1: rule__Header3Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header3Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5533:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5534:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5534:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5535:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5544:1: rule__Header4Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header4Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5548:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5549:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5549:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5550:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5559:1: rule__Header5Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header5Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5563:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5564:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5564:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5565:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5574:1: rule__Header6Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header6Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5578:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5579:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5579:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5580:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5589:1: rule__EmphasisExpression__CAssignment_0_0_0 : ( ruleStrongExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5593:1: ( ( ruleStrongExpression ) )
            // InternalMyDsl.g:5594:2: ( ruleStrongExpression )
            {
            // InternalMyDsl.g:5594:2: ( ruleStrongExpression )
            // InternalMyDsl.g:5595:3: ruleStrongExpression
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
    // InternalMyDsl.g:5604:1: rule__EmphasisExpression__CAssignment_0_0_1 : ( ruleItalicExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5608:1: ( ( ruleItalicExpression ) )
            // InternalMyDsl.g:5609:2: ( ruleItalicExpression )
            {
            // InternalMyDsl.g:5609:2: ( ruleItalicExpression )
            // InternalMyDsl.g:5610:3: ruleItalicExpression
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
    // InternalMyDsl.g:5619:1: rule__EmphasisExpression__CAssignment_0_0_2 : ( ruleScratchExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5623:1: ( ( ruleScratchExpression ) )
            // InternalMyDsl.g:5624:2: ( ruleScratchExpression )
            {
            // InternalMyDsl.g:5624:2: ( ruleScratchExpression )
            // InternalMyDsl.g:5625:3: ruleScratchExpression
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
    // InternalMyDsl.g:5634:1: rule__EmphasisExpression__CAssignment_1 : ( ruleNaturalExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5638:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5639:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5639:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5640:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5649:1: rule__StrongExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__StrongExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5653:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5654:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5654:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5655:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5664:1: rule__ItalicExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__ItalicExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5668:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5669:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5669:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5670:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5679:1: rule__ScratchExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__ScratchExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5683:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5684:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5684:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5685:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5694:1: rule__NaturalExpression__ValueAssignment_1 : ( ruleContent ) ;
    public final void rule__NaturalExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5698:1: ( ( ruleContent ) )
            // InternalMyDsl.g:5699:2: ( ruleContent )
            {
            // InternalMyDsl.g:5699:2: ( ruleContent )
            // InternalMyDsl.g:5700:3: ruleContent
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
        // InternalMyDsl.g:642:5: ( rule__EmphasisExpression__Alternatives )
        // InternalMyDsl.g:642:5: rule__EmphasisExpression__Alternatives
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
        // InternalMyDsl.g:805:2: ( ( ( rule__Expression__Group_0__0 ) ) )
        // InternalMyDsl.g:805:2: ( ( rule__Expression__Group_0__0 ) )
        {
        // InternalMyDsl.g:805:2: ( ( rule__Expression__Group_0__0 ) )
        // InternalMyDsl.g:806:3: ( rule__Expression__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getGroup_0()); 
        }
        // InternalMyDsl.g:807:3: ( rule__Expression__Group_0__0 )
        // InternalMyDsl.g:807:4: rule__Expression__Group_0__0
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

    // $ANTLR start synpred7_InternalMyDsl
    public final void synpred7_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:865:2: ( ( ( rule__TextExpression__Group_0__0 ) ) )
        // InternalMyDsl.g:865:2: ( ( rule__TextExpression__Group_0__0 ) )
        {
        // InternalMyDsl.g:865:2: ( ( rule__TextExpression__Group_0__0 ) )
        // InternalMyDsl.g:866:3: ( rule__TextExpression__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTextExpressionAccess().getGroup_0()); 
        }
        // InternalMyDsl.g:867:3: ( rule__TextExpression__Group_0__0 )
        // InternalMyDsl.g:867:4: rule__TextExpression__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__TextExpression__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalMyDsl

    // $ANTLR start synpred11_InternalMyDsl
    public final void synpred11_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:927:5: ( rule__ListExpression__Group_1__0 )
        // InternalMyDsl.g:927:5: rule__ListExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ListExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalMyDsl

    // $ANTLR start synpred32_InternalMyDsl
    public final void synpred32_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1311:3: ( RULE_BL )
        // InternalMyDsl.g:1311:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalMyDsl

    // $ANTLR start synpred33_InternalMyDsl
    public final void synpred33_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1365:3: ( RULE_BL )
        // InternalMyDsl.g:1365:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalMyDsl

    // $ANTLR start synpred34_InternalMyDsl
    public final void synpred34_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1419:3: ( RULE_BL )
        // InternalMyDsl.g:1419:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalMyDsl

    // $ANTLR start synpred35_InternalMyDsl
    public final void synpred35_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1506:4: ( rule__ListExpression__Group_0_1__0 )
        // InternalMyDsl.g:1506:4: rule__ListExpression__Group_0_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ListExpression__Group_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalMyDsl

    // $ANTLR start synpred37_InternalMyDsl
    public final void synpred37_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1622:3: ( RULE_BL )
        // InternalMyDsl.g:1622:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalMyDsl

    // $ANTLR start synpred39_InternalMyDsl
    public final void synpred39_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1764:3: ( RULE_BL )
        // InternalMyDsl.g:1764:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalMyDsl

    // $ANTLR start synpred40_InternalMyDsl
    public final void synpred40_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1852:4: ( rule__QuoteExpression__ContentAssignment_2 )
        // InternalMyDsl.g:1852:4: rule__QuoteExpression__ContentAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__QuoteExpression__ContentAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalMyDsl

    // $ANTLR start synpred41_InternalMyDsl
    public final void synpred41_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1879:3: ( RULE_BL )
        // InternalMyDsl.g:1879:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalMyDsl

    // $ANTLR start synpred42_InternalMyDsl
    public final void synpred42_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2074:4: ( '-' )
        // InternalMyDsl.g:2074:4: '-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalMyDsl

    // $ANTLR start synpred43_InternalMyDsl
    public final void synpred43_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2162:4: ( '_' )
        // InternalMyDsl.g:2162:4: '_'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalMyDsl

    // $ANTLR start synpred44_InternalMyDsl
    public final void synpred44_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2352:3: ( rule__TabExpression__Group_1_0_3__0 )
        // InternalMyDsl.g:2352:3: rule__TabExpression__Group_1_0_3__0
        {
        pushFollow(FOLLOW_2);
        rule__TabExpression__Group_1_0_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalMyDsl

    // $ANTLR start synpred47_InternalMyDsl
    public final void synpred47_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2555:4: ( rule__TabSeparation__Group_3__0 )
        // InternalMyDsl.g:2555:4: rule__TabSeparation__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__TabSeparation__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalMyDsl

    // $ANTLR start synpred48_InternalMyDsl
    public final void synpred48_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2582:3: ( '|' )
        // InternalMyDsl.g:2582:3: '|'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalMyDsl

    // $ANTLR start synpred49_InternalMyDsl
    public final void synpred49_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2669:4: ( '-' )
        // InternalMyDsl.g:2669:4: '-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalMyDsl

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2698:3: ( '|' )
        // InternalMyDsl.g:2698:3: '|'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2752:3: ( rule__LineExpression__Group_2__0 )
        // InternalMyDsl.g:2752:3: rule__LineExpression__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__LineExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2778:3: ( '|' )
        // InternalMyDsl.g:2778:3: '|'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalMyDsl

    // $ANTLR start synpred53_InternalMyDsl
    public final void synpred53_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3049:3: ( rule__RefExpression__RefContentAssignment_4 )
        // InternalMyDsl.g:3049:3: rule__RefExpression__RefContentAssignment_4
        {
        pushFollow(FOLLOW_2);
        rule__RefExpression__RefContentAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalMyDsl

    // $ANTLR start synpred54_InternalMyDsl
    public final void synpred54_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3075:3: ( RULE_BL )
        // InternalMyDsl.g:3075:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalMyDsl

    // $ANTLR start synpred56_InternalMyDsl
    public final void synpred56_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3264:3: ( RULE_BL )
        // InternalMyDsl.g:3264:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalMyDsl

    // $ANTLR start synpred58_InternalMyDsl
    public final void synpred58_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3453:3: ( RULE_BL )
        // InternalMyDsl.g:3453:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalMyDsl

    // $ANTLR start synpred61_InternalMyDsl
    public final void synpred61_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3696:3: ( RULE_BL )
        // InternalMyDsl.g:3696:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalMyDsl

    // $ANTLR start synpred62_InternalMyDsl
    public final void synpred62_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3805:3: ( rule__Header1Expression__Group_3__0 )
        // InternalMyDsl.g:3805:3: rule__Header1Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header1Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalMyDsl

    // $ANTLR start synpred63_InternalMyDsl
    public final void synpred63_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3831:3: ( RULE_BL )
        // InternalMyDsl.g:3831:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalMyDsl

    // $ANTLR start synpred64_InternalMyDsl
    public final void synpred64_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3967:3: ( rule__Header2Expression__Group_3__0 )
        // InternalMyDsl.g:3967:3: rule__Header2Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header2Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalMyDsl

    // $ANTLR start synpred65_InternalMyDsl
    public final void synpred65_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3993:3: ( RULE_BL )
        // InternalMyDsl.g:3993:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalMyDsl

    // $ANTLR start synpred66_InternalMyDsl
    public final void synpred66_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4129:3: ( rule__Header3Expression__Group_3__0 )
        // InternalMyDsl.g:4129:3: rule__Header3Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header3Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalMyDsl

    // $ANTLR start synpred67_InternalMyDsl
    public final void synpred67_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4155:3: ( RULE_BL )
        // InternalMyDsl.g:4155:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalMyDsl

    // $ANTLR start synpred68_InternalMyDsl
    public final void synpred68_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4291:3: ( rule__Header4Expression__Group_3__0 )
        // InternalMyDsl.g:4291:3: rule__Header4Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header4Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalMyDsl

    // $ANTLR start synpred69_InternalMyDsl
    public final void synpred69_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4317:3: ( RULE_BL )
        // InternalMyDsl.g:4317:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalMyDsl

    // $ANTLR start synpred70_InternalMyDsl
    public final void synpred70_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4453:3: ( rule__Header5Expression__Group_3__0 )
        // InternalMyDsl.g:4453:3: rule__Header5Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header5Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalMyDsl

    // $ANTLR start synpred71_InternalMyDsl
    public final void synpred71_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4479:3: ( RULE_BL )
        // InternalMyDsl.g:4479:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalMyDsl

    // $ANTLR start synpred72_InternalMyDsl
    public final void synpred72_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4615:3: ( rule__Header6Expression__Group_3__0 )
        // InternalMyDsl.g:4615:3: rule__Header6Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header6Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalMyDsl

    // $ANTLR start synpred73_InternalMyDsl
    public final void synpred73_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4641:3: ( RULE_BL )
        // InternalMyDsl.g:4641:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalMyDsl

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
    public final boolean synpred32_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred61_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred63_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred42_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalMyDsl_fragment(); // can never throw exception
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
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\1\31\uffff";
    static final String dfa_3s = "\1\4\11\uffff\1\0\1\uffff\1\0\1\uffff\1\0\2\uffff\5\0\1\uffff\2\0\1\uffff";
    static final String dfa_4s = "\1\44\11\uffff\1\0\1\uffff\1\0\1\uffff\1\0\2\uffff\5\0\1\uffff\2\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\27\uffff\1\1";
    static final String dfa_6s = "\12\uffff\1\0\1\uffff\1\1\1\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\22\1\23\1\16\1\1\5\uffff\1\14\1\12\1\1\1\24\1\21\1\25\1\uffff\3\1\3\uffff\2\1\1\uffff\6\1\1\27\1\30",
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
            "\1\uffff",
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
            return "()* loopback of 642:4: ( rule__EmphasisExpression__Alternatives )*";
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
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_12);
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
    static final String dfa_8s = "\20\uffff";
    static final String dfa_9s = "\3\uffff\1\6\1\uffff\1\6\10\uffff\1\6\1\uffff";
    static final String dfa_10s = "\1\4\1\uffff\4\4\1\uffff\7\27\1\4\1\0";
    static final String dfa_11s = "\1\44\1\uffff\1\22\3\44\1\uffff\7\30\1\44\1\0";
    static final String dfa_12s = "\1\uffff\1\1\4\uffff\1\2\11\uffff";
    static final String dfa_13s = "\17\uffff\1\0}>";
    static final String[] dfa_14s = {
            "\2\6\1\5\1\1\5\uffff\1\4\1\3\1\1\3\6\1\uffff\1\6\1\1\1\2\3\uffff\2\6\1\uffff\6\1\2\6",
            "",
            "\1\7\1\10\1\11\7\uffff\1\13\1\uffff\1\12\1\14\1\15",
            "\4\6\1\1\4\uffff\1\6\1\16\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\10\6",
            "\3\6\1\uffff\1\1\4\uffff\2\6\1\uffff\3\6\20\uffff\2\6",
            "\4\6\5\uffff\6\6\1\1\3\6\3\uffff\2\6\1\uffff\10\6",
            "",
            "\1\1\1\6",
            "\1\1\1\6",
            "\1\1\1\6",
            "\1\1\1\6",
            "\1\1\1\6",
            "\1\1\1\6",
            "\1\1\1\6",
            "\5\6\4\uffff\1\6\1\17\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\10\6",
            "\1\uffff"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "800:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index2_15);
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
    static final String dfa_15s = "\25\uffff";
    static final String dfa_16s = "\3\uffff\6\11\2\uffff\11\11\1\uffff";
    static final String dfa_17s = "\1\4\1\uffff\1\0\6\4\1\uffff\1\0\11\4\1\0";
    static final String dfa_18s = "\1\44\1\uffff\1\0\6\44\1\uffff\1\0\11\44\1\0";
    static final String dfa_19s = "\1\uffff\1\1\7\uffff\1\2\13\uffff";
    static final String dfa_20s = "\2\uffff\1\1\7\uffff\1\0\11\uffff\1\2}>";
    static final String[] dfa_21s = {
            "\1\3\1\4\1\5\6\uffff\1\11\1\7\1\uffff\1\6\1\2\1\10\1\uffff\1\1\1\uffff\1\1\3\uffff\2\1\7\uffff\2\11",
            "",
            "\1\uffff",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "",
            "\1\uffff",
            "\4\11\5\uffff\1\11\1\14\2\11\1\15\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\16\4\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\4\11\5\uffff\1\11\1\17\4\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\20\2\11\1\21\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\16\4\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\22\2\11\1\21\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\4\11\5\uffff\1\11\1\23\4\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\22\2\11\1\21\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\24\4\11\1\uffff\3\11\3\uffff\2\11\1\uffff\10\11",
            "\1\uffff"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "860:1: rule__TextExpression__Alternatives : ( ( ( rule__TextExpression__Group_0__0 ) ) | ( ruleEmphasisExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_20 = input.LA(1);

                         
                        int index4_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_20);
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
    static final String dfa_22s = "\1\4\15\uffff\1\0\13\uffff";
    static final String dfa_23s = "\1\44\15\uffff\1\0\13\uffff";
    static final String dfa_24s = "\16\uffff\1\0\13\uffff}>";
    static final String[] dfa_25s = {
            "\2\1\1\16\1\1\5\uffff\6\1\1\uffff\3\1\3\uffff\2\1\1\uffff\10\1",
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
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_5;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "()* loopback of 927:4: ( rule__ListExpression__Group_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_14 = input.LA(1);

                         
                        int index6_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\1\4\11\uffff\1\0\1\uffff\2\0\14\uffff";
    static final String dfa_27s = "\1\44\11\uffff\1\0\1\uffff\2\0\14\uffff";
    static final String dfa_28s = "\12\uffff\1\0\1\uffff\1\1\1\2\14\uffff}>";
    static final String[] dfa_29s = {
            "\4\1\5\uffff\1\14\1\12\1\15\3\1\1\uffff\3\1\3\uffff\2\1\1\uffff\10\1",
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
            ""
    };
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_5;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "()* loopback of 1506:3: ( rule__ListExpression__Group_0_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_12 = input.LA(1);

                         
                        int index21_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index21_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_13 = input.LA(1);

                         
                        int index21_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index21_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_30s = "\1\4\10\uffff\2\0\1\uffff\1\0\1\uffff\13\0\1\uffff";
    static final String dfa_31s = "\1\44\10\uffff\2\0\1\uffff\1\0\1\uffff\13\0\1\uffff";
    static final String dfa_32s = "\11\uffff\1\0\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff}>";
    static final String[] dfa_33s = {
            "\1\22\1\23\1\16\1\1\5\uffff\1\14\1\12\1\1\1\24\1\21\1\25\1\uffff\1\26\1\1\1\11\3\uffff\1\17\1\20\1\uffff\6\1\1\27\1\30",
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
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_5;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 1852:3: ( rule__QuoteExpression__ContentAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_10 = input.LA(1);

                         
                        int index26_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_12 = input.LA(1);

                         
                        int index26_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_14 = input.LA(1);

                         
                        int index26_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_15 = input.LA(1);

                         
                        int index26_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_16 = input.LA(1);

                         
                        int index26_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_17 = input.LA(1);

                         
                        int index26_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_18 = input.LA(1);

                         
                        int index26_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_19 = input.LA(1);

                         
                        int index26_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_20 = input.LA(1);

                         
                        int index26_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_21 = input.LA(1);

                         
                        int index26_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_21);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_22 = input.LA(1);

                         
                        int index26_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_22);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_23 = input.LA(1);

                         
                        int index26_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_23);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA26_24 = input.LA(1);

                         
                        int index26_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\13\uffff";
    static final String dfa_35s = "\1\1\1\uffff\1\1\10\uffff";
    static final String dfa_36s = "\1\4\1\uffff\1\4\7\0\1\uffff";
    static final String dfa_37s = "\1\44\1\uffff\1\44\7\0\1\uffff";
    static final String dfa_38s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_39s = "\3\uffff\1\6\1\2\1\3\1\4\1\0\1\5\1\1\1\uffff}>";
    static final String[] dfa_40s = {
            "\3\1\1\2\5\uffff\6\1\1\uffff\3\1\3\uffff\2\1\1\uffff\10\1",
            "",
            "\1\6\1\7\1\4\1\1\5\uffff\1\1\1\3\1\1\1\10\1\5\1\11\1\uffff\3\1\3\uffff\2\1\1\uffff\10\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 2352:2: ( rule__TabExpression__Group_1_0_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_7 = input.LA(1);

                         
                        int index30_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_9 = input.LA(1);

                         
                        int index30_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_8 = input.LA(1);

                         
                        int index30_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_41s = "\2\2\11\uffff";
    static final String dfa_42s = "\2\4\1\uffff\7\0\1\uffff";
    static final String dfa_43s = "\2\44\1\uffff\7\0\1\uffff";
    static final String dfa_44s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_45s = "\3\uffff\1\0\1\3\1\5\1\1\1\2\1\4\1\6\1\uffff}>";
    static final String[] dfa_46s = {
            "\4\2\5\uffff\4\2\1\1\1\2\1\uffff\3\2\3\uffff\2\2\1\uffff\10\2",
            "\1\3\1\4\1\5\1\2\5\uffff\1\2\1\7\1\2\1\6\1\10\1\11\1\uffff\3\2\3\uffff\2\2\1\uffff\10\2",
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
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_34;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "()* loopback of 2752:2: ( rule__LineExpression__Group_2__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_47s = "\12\uffff";
    static final String dfa_48s = "\1\10\11\uffff";
    static final String dfa_49s = "\1\4\7\0\2\uffff";
    static final String dfa_50s = "\1\44\7\0\2\uffff";
    static final String dfa_51s = "\10\uffff\1\2\1\1";
    static final String dfa_52s = "\1\uffff\1\0\1\5\1\3\1\4\1\2\1\1\1\6\2\uffff}>";
    static final String[] dfa_53s = {
            "\1\1\1\2\1\3\1\10\5\uffff\1\10\1\5\1\10\1\4\1\6\1\7\1\uffff\3\10\3\uffff\2\10\1\uffff\10\10",
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

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_47;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "3049:2: ( rule__RefExpression__RefContentAssignment_4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index39_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index39_7);
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
    static final String dfa_54s = "\1\4\2\uffff\1\0\26\uffff";
    static final String dfa_55s = "\1\44\2\uffff\1\0\26\uffff";
    static final String dfa_56s = "\3\uffff\1\0\26\uffff}>";
    static final String[] dfa_57s = {
            "\4\1\5\uffff\6\1\1\uffff\3\1\3\uffff\2\1\1\uffff\1\3\7\1",
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
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_5;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "()* loopback of 3805:2: ( rule__Header1Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_3 = input.LA(1);

                         
                        int index48_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_5;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "()* loopback of 3967:2: ( rule__Header2Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_5;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "()* loopback of 4129:2: ( rule__Header3Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_3 = input.LA(1);

                         
                        int index52_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index52_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_5;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "()* loopback of 4291:2: ( rule__Header4Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_5;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "()* loopback of 4453:2: ( rule__Header5Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_5;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "()* loopback of 4615:2: ( rule__Header6Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_3 = input.LA(1);

                         
                        int index58_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001800076072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001FEC77E0F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001FEC77E0F2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000180C576070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001800076070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000018000760F0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001802076070L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001810076070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001800002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000000L});

}