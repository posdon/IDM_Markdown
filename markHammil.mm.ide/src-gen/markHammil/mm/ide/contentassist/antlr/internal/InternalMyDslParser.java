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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BL", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_ANY_OTHER", "'*'", "'-'", "'+'", "'\\''", "'|'", "'\"'", "'.'", "'>'", "'_'", "'['", "']:'", "']('", "')'", "']['", "']'", "'!['", "'[!['", "')]('", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'~~'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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
    // InternalMyDsl.g:379:1: ruleLinkExpression : ( ( rule__LinkExpression__Alternatives ) ) ;
    public final void ruleLinkExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:2: ( ( ( rule__LinkExpression__Alternatives ) ) )
            // InternalMyDsl.g:384:2: ( ( rule__LinkExpression__Alternatives ) )
            {
            // InternalMyDsl.g:384:2: ( ( rule__LinkExpression__Alternatives ) )
            // InternalMyDsl.g:385:3: ( rule__LinkExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:386:3: ( rule__LinkExpression__Alternatives )
            // InternalMyDsl.g:386:4: rule__LinkExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
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
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
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
            case 28:
            case 29:
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

            if ( ((LA10_0>=28 && LA10_0<=29)) ) {
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

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
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


    // $ANTLR start "rule__LinkExpression__Alternatives"
    // InternalMyDsl.g:1026:1: rule__LinkExpression__Alternatives : ( ( ( rule__LinkExpression__Group_0__0 ) ) | ( ( rule__LinkExpression__Group_1__0 ) ) );
    public final void rule__LinkExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( ( rule__LinkExpression__Group_0__0 ) ) | ( ( rule__LinkExpression__Group_1__0 ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1031:2: ( ( rule__LinkExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1031:2: ( ( rule__LinkExpression__Group_0__0 ) )
                    // InternalMyDsl.g:1032:3: ( rule__LinkExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLinkExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1033:3: ( rule__LinkExpression__Group_0__0 )
                    // InternalMyDsl.g:1033:4: rule__LinkExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLinkExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1037:2: ( ( rule__LinkExpression__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1037:2: ( ( rule__LinkExpression__Group_1__0 ) )
                    // InternalMyDsl.g:1038:3: ( rule__LinkExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLinkExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:1039:3: ( rule__LinkExpression__Group_1__0 )
                    // InternalMyDsl.g:1039:4: rule__LinkExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLinkExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__LinkExpression__Alternatives"


    // $ANTLR start "rule__HeaderExpression__Alternatives"
    // InternalMyDsl.g:1047:1: rule__HeaderExpression__Alternatives : ( ( ruleHeader1Expression ) | ( ruleHeader2Expression ) | ( ruleHeader3Expression ) | ( ruleHeader4Expression ) | ( ruleHeader5Expression ) | ( ruleHeader6Expression ) );
    public final void rule__HeaderExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( ( ruleHeader1Expression ) | ( ruleHeader2Expression ) | ( ruleHeader3Expression ) | ( ruleHeader4Expression ) | ( ruleHeader5Expression ) | ( ruleHeader6Expression ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt13=1;
                }
                break;
            case 32:
                {
                alt13=2;
                }
                break;
            case 33:
                {
                alt13=3;
                }
                break;
            case 34:
                {
                alt13=4;
                }
                break;
            case 35:
                {
                alt13=5;
                }
                break;
            case 36:
                {
                alt13=6;
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
                    // InternalMyDsl.g:1052:2: ( ruleHeader1Expression )
                    {
                    // InternalMyDsl.g:1052:2: ( ruleHeader1Expression )
                    // InternalMyDsl.g:1053:3: ruleHeader1Expression
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
                    // InternalMyDsl.g:1058:2: ( ruleHeader2Expression )
                    {
                    // InternalMyDsl.g:1058:2: ( ruleHeader2Expression )
                    // InternalMyDsl.g:1059:3: ruleHeader2Expression
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
                    // InternalMyDsl.g:1064:2: ( ruleHeader3Expression )
                    {
                    // InternalMyDsl.g:1064:2: ( ruleHeader3Expression )
                    // InternalMyDsl.g:1065:3: ruleHeader3Expression
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
                    // InternalMyDsl.g:1070:2: ( ruleHeader4Expression )
                    {
                    // InternalMyDsl.g:1070:2: ( ruleHeader4Expression )
                    // InternalMyDsl.g:1071:3: ruleHeader4Expression
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
                    // InternalMyDsl.g:1076:2: ( ruleHeader5Expression )
                    {
                    // InternalMyDsl.g:1076:2: ( ruleHeader5Expression )
                    // InternalMyDsl.g:1077:3: ruleHeader5Expression
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
                    // InternalMyDsl.g:1082:2: ( ruleHeader6Expression )
                    {
                    // InternalMyDsl.g:1082:2: ( ruleHeader6Expression )
                    // InternalMyDsl.g:1083:3: ruleHeader6Expression
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
    // InternalMyDsl.g:1092:1: rule__EmphasisExpression__Alternatives : ( ( ( rule__EmphasisExpression__Group_0__0 ) ) | ( ( rule__EmphasisExpression__CAssignment_1 ) ) );
    public final void rule__EmphasisExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( ( rule__EmphasisExpression__Group_0__0 ) ) | ( ( rule__EmphasisExpression__CAssignment_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13||(LA14_0>=37 && LA14_0<=38)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==14||(LA14_0>=16 && LA14_0<=18)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1097:2: ( ( rule__EmphasisExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1097:2: ( ( rule__EmphasisExpression__Group_0__0 ) )
                    // InternalMyDsl.g:1098:3: ( rule__EmphasisExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1099:3: ( rule__EmphasisExpression__Group_0__0 )
                    // InternalMyDsl.g:1099:4: rule__EmphasisExpression__Group_0__0
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
                    // InternalMyDsl.g:1103:2: ( ( rule__EmphasisExpression__CAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1103:2: ( ( rule__EmphasisExpression__CAssignment_1 ) )
                    // InternalMyDsl.g:1104:3: ( rule__EmphasisExpression__CAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_1()); 
                    }
                    // InternalMyDsl.g:1105:3: ( rule__EmphasisExpression__CAssignment_1 )
                    // InternalMyDsl.g:1105:4: rule__EmphasisExpression__CAssignment_1
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
    // InternalMyDsl.g:1113:1: rule__EmphasisExpression__Alternatives_0_0 : ( ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) ) );
    public final void rule__EmphasisExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) ) | ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 13:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
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
                    // InternalMyDsl.g:1118:2: ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) )
                    {
                    // InternalMyDsl.g:1118:2: ( ( rule__EmphasisExpression__CAssignment_0_0_0 ) )
                    // InternalMyDsl.g:1119:3: ( rule__EmphasisExpression__CAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_0()); 
                    }
                    // InternalMyDsl.g:1120:3: ( rule__EmphasisExpression__CAssignment_0_0_0 )
                    // InternalMyDsl.g:1120:4: rule__EmphasisExpression__CAssignment_0_0_0
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
                    // InternalMyDsl.g:1124:2: ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) )
                    {
                    // InternalMyDsl.g:1124:2: ( ( rule__EmphasisExpression__CAssignment_0_0_1 ) )
                    // InternalMyDsl.g:1125:3: ( rule__EmphasisExpression__CAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_1()); 
                    }
                    // InternalMyDsl.g:1126:3: ( rule__EmphasisExpression__CAssignment_0_0_1 )
                    // InternalMyDsl.g:1126:4: rule__EmphasisExpression__CAssignment_0_0_1
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
                    // InternalMyDsl.g:1130:2: ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) )
                    {
                    // InternalMyDsl.g:1130:2: ( ( rule__EmphasisExpression__CAssignment_0_0_2 ) )
                    // InternalMyDsl.g:1131:3: ( rule__EmphasisExpression__CAssignment_0_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmphasisExpressionAccess().getCAssignment_0_0_2()); 
                    }
                    // InternalMyDsl.g:1132:3: ( rule__EmphasisExpression__CAssignment_0_0_2 )
                    // InternalMyDsl.g:1132:4: rule__EmphasisExpression__CAssignment_0_0_2
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
    // InternalMyDsl.g:1140:1: rule__Content__Alternatives : ( ( ( rule__Content__Group_0__0 ) ) | ( '\\'' ) | ( '-' ) | ( '|' ) | ( '\"' ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( ( ( rule__Content__Group_0__0 ) ) | ( '\\'' ) | ( '-' ) | ( '|' ) | ( '\"' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case 16:
                {
                alt16=2;
                }
                break;
            case 14:
                {
                alt16=3;
                }
                break;
            case 17:
                {
                alt16=4;
                }
                break;
            case 18:
                {
                alt16=5;
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
                    // InternalMyDsl.g:1145:2: ( ( rule__Content__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1145:2: ( ( rule__Content__Group_0__0 ) )
                    // InternalMyDsl.g:1146:3: ( rule__Content__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1147:3: ( rule__Content__Group_0__0 )
                    // InternalMyDsl.g:1147:4: rule__Content__Group_0__0
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
                    // InternalMyDsl.g:1151:2: ( '\\'' )
                    {
                    // InternalMyDsl.g:1151:2: ( '\\'' )
                    // InternalMyDsl.g:1152:3: '\\''
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
                    // InternalMyDsl.g:1157:2: ( '-' )
                    {
                    // InternalMyDsl.g:1157:2: ( '-' )
                    // InternalMyDsl.g:1158:3: '-'
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
                    // InternalMyDsl.g:1163:2: ( '|' )
                    {
                    // InternalMyDsl.g:1163:2: ( '|' )
                    // InternalMyDsl.g:1164:3: '|'
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
                    // InternalMyDsl.g:1169:2: ( '\"' )
                    {
                    // InternalMyDsl.g:1169:2: ( '\"' )
                    // InternalMyDsl.g:1170:3: '\"'
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
    // InternalMyDsl.g:1179:1: rule__Content__Alternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__Content__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
                {
                alt17=2;
                }
                break;
            case RULE_INT:
                {
                alt17=3;
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
                    // InternalMyDsl.g:1184:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1184:2: ( RULE_ID )
                    // InternalMyDsl.g:1185:3: RULE_ID
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
                    // InternalMyDsl.g:1190:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1190:2: ( RULE_STRING )
                    // InternalMyDsl.g:1191:3: RULE_STRING
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
                    // InternalMyDsl.g:1196:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1196:2: ( RULE_INT )
                    // InternalMyDsl.g:1197:3: RULE_INT
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
    // InternalMyDsl.g:1206:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1210:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalMyDsl.g:1211:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalMyDsl.g:1218:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( ( () ) )
            // InternalMyDsl.g:1223:1: ( () )
            {
            // InternalMyDsl.g:1223:1: ( () )
            // InternalMyDsl.g:1224:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalMyDsl.g:1225:2: ()
            // InternalMyDsl.g:1225:3: 
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
    // InternalMyDsl.g:1233:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( rule__File__Group__1__Impl )
            // InternalMyDsl.g:1238:2: rule__File__Group__1__Impl
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
    // InternalMyDsl.g:1244:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalMyDsl.g:1249:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalMyDsl.g:1249:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalMyDsl.g:1250:2: ( rule__File__ExpressionAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            }
            // InternalMyDsl.g:1251:2: ( rule__File__ExpressionAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_BL)||(LA18_0>=13 && LA18_0<=18)||(LA18_0>=20 && LA18_0<=22)||(LA18_0>=28 && LA18_0<=29)||(LA18_0>=31 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1251:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:1260:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1264:1: ( rule__Expression__Group_0__0__Impl )
            // InternalMyDsl.g:1265:2: rule__Expression__Group_0__0__Impl
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
    // InternalMyDsl.g:1271:1: rule__Expression__Group_0__0__Impl : ( ( rule__Expression__Alternatives_0_0 ) ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1275:1: ( ( ( rule__Expression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:1276:1: ( ( rule__Expression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:1276:1: ( ( rule__Expression__Alternatives_0_0 ) )
            // InternalMyDsl.g:1277:2: ( rule__Expression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:1278:2: ( rule__Expression__Alternatives_0_0 )
            // InternalMyDsl.g:1278:3: rule__Expression__Alternatives_0_0
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
    // InternalMyDsl.g:1287:1: rule__Expression__Group_0_0_3__0 : rule__Expression__Group_0_0_3__0__Impl rule__Expression__Group_0_0_3__1 ;
    public final void rule__Expression__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( rule__Expression__Group_0_0_3__0__Impl rule__Expression__Group_0_0_3__1 )
            // InternalMyDsl.g:1292:2: rule__Expression__Group_0_0_3__0__Impl rule__Expression__Group_0_0_3__1
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
    // InternalMyDsl.g:1299:1: rule__Expression__Group_0_0_3__0__Impl : ( ( rule__Expression__CAssignment_0_0_3_0 ) ) ;
    public final void rule__Expression__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( ( ( rule__Expression__CAssignment_0_0_3_0 ) ) )
            // InternalMyDsl.g:1304:1: ( ( rule__Expression__CAssignment_0_0_3_0 ) )
            {
            // InternalMyDsl.g:1304:1: ( ( rule__Expression__CAssignment_0_0_3_0 ) )
            // InternalMyDsl.g:1305:2: ( rule__Expression__CAssignment_0_0_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCAssignment_0_0_3_0()); 
            }
            // InternalMyDsl.g:1306:2: ( rule__Expression__CAssignment_0_0_3_0 )
            // InternalMyDsl.g:1306:3: rule__Expression__CAssignment_0_0_3_0
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
    // InternalMyDsl.g:1314:1: rule__Expression__Group_0_0_3__1 : rule__Expression__Group_0_0_3__1__Impl ;
    public final void rule__Expression__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( rule__Expression__Group_0_0_3__1__Impl )
            // InternalMyDsl.g:1319:2: rule__Expression__Group_0_0_3__1__Impl
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
    // InternalMyDsl.g:1325:1: rule__Expression__Group_0_0_3__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1330:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1330:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1331:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_3_1()); 
            }
            // InternalMyDsl.g:1332:2: ( RULE_BL )?
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
                    // InternalMyDsl.g:1332:3: RULE_BL
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
    // InternalMyDsl.g:1341:1: rule__Expression__Group_0_0_4__0 : rule__Expression__Group_0_0_4__0__Impl rule__Expression__Group_0_0_4__1 ;
    public final void rule__Expression__Group_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1345:1: ( rule__Expression__Group_0_0_4__0__Impl rule__Expression__Group_0_0_4__1 )
            // InternalMyDsl.g:1346:2: rule__Expression__Group_0_0_4__0__Impl rule__Expression__Group_0_0_4__1
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
    // InternalMyDsl.g:1353:1: rule__Expression__Group_0_0_4__0__Impl : ( ( rule__Expression__CAssignment_0_0_4_0 ) ) ;
    public final void rule__Expression__Group_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( ( ( rule__Expression__CAssignment_0_0_4_0 ) ) )
            // InternalMyDsl.g:1358:1: ( ( rule__Expression__CAssignment_0_0_4_0 ) )
            {
            // InternalMyDsl.g:1358:1: ( ( rule__Expression__CAssignment_0_0_4_0 ) )
            // InternalMyDsl.g:1359:2: ( rule__Expression__CAssignment_0_0_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCAssignment_0_0_4_0()); 
            }
            // InternalMyDsl.g:1360:2: ( rule__Expression__CAssignment_0_0_4_0 )
            // InternalMyDsl.g:1360:3: rule__Expression__CAssignment_0_0_4_0
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
    // InternalMyDsl.g:1368:1: rule__Expression__Group_0_0_4__1 : rule__Expression__Group_0_0_4__1__Impl ;
    public final void rule__Expression__Group_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( rule__Expression__Group_0_0_4__1__Impl )
            // InternalMyDsl.g:1373:2: rule__Expression__Group_0_0_4__1__Impl
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
    // InternalMyDsl.g:1379:1: rule__Expression__Group_0_0_4__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1384:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1384:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1385:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_4_1()); 
            }
            // InternalMyDsl.g:1386:2: ( RULE_BL )?
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
                    // InternalMyDsl.g:1386:3: RULE_BL
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
    // InternalMyDsl.g:1395:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1399:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMyDsl.g:1400:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalMyDsl.g:1407:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__CAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( ( ( rule__Expression__CAssignment_1_0 ) ) )
            // InternalMyDsl.g:1412:1: ( ( rule__Expression__CAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1412:1: ( ( rule__Expression__CAssignment_1_0 ) )
            // InternalMyDsl.g:1413:2: ( rule__Expression__CAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCAssignment_1_0()); 
            }
            // InternalMyDsl.g:1414:2: ( rule__Expression__CAssignment_1_0 )
            // InternalMyDsl.g:1414:3: rule__Expression__CAssignment_1_0
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
    // InternalMyDsl.g:1422:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1426:1: ( rule__Expression__Group_1__1__Impl )
            // InternalMyDsl.g:1427:2: rule__Expression__Group_1__1__Impl
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
    // InternalMyDsl.g:1433:1: rule__Expression__Group_1__1__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1437:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1438:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1438:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1439:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1_1()); 
            }
            // InternalMyDsl.g:1440:2: ( RULE_BL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_BL) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred35_InternalMyDsl()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1440:3: RULE_BL
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
    // InternalMyDsl.g:1449:1: rule__TextExpression__Group_0__0 : rule__TextExpression__Group_0__0__Impl ;
    public final void rule__TextExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( rule__TextExpression__Group_0__0__Impl )
            // InternalMyDsl.g:1454:2: rule__TextExpression__Group_0__0__Impl
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
    // InternalMyDsl.g:1460:1: rule__TextExpression__Group_0__0__Impl : ( ( rule__TextExpression__Alternatives_0_0 ) ) ;
    public final void rule__TextExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1464:1: ( ( ( rule__TextExpression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:1465:1: ( ( rule__TextExpression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:1465:1: ( ( rule__TextExpression__Alternatives_0_0 ) )
            // InternalMyDsl.g:1466:2: ( rule__TextExpression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:1467:2: ( rule__TextExpression__Alternatives_0_0 )
            // InternalMyDsl.g:1467:3: rule__TextExpression__Alternatives_0_0
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
    // InternalMyDsl.g:1476:1: rule__ListExpression__Group_0__0 : rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 ;
    public final void rule__ListExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 )
            // InternalMyDsl.g:1481:2: rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1
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
    // InternalMyDsl.g:1488:1: rule__ListExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( ( () ) )
            // InternalMyDsl.g:1493:1: ( () )
            {
            // InternalMyDsl.g:1493:1: ( () )
            // InternalMyDsl.g:1494:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getListExpressionAction_0_0()); 
            }
            // InternalMyDsl.g:1495:2: ()
            // InternalMyDsl.g:1495:3: 
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
    // InternalMyDsl.g:1503:1: rule__ListExpression__Group_0__1 : rule__ListExpression__Group_0__1__Impl ;
    public final void rule__ListExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1507:1: ( rule__ListExpression__Group_0__1__Impl )
            // InternalMyDsl.g:1508:2: rule__ListExpression__Group_0__1__Impl
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
    // InternalMyDsl.g:1514:1: rule__ListExpression__Group_0__1__Impl : ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) ) ;
    public final void rule__ListExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1518:1: ( ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) ) )
            // InternalMyDsl.g:1519:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) )
            {
            // InternalMyDsl.g:1519:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* ) )
            // InternalMyDsl.g:1520:2: ( ( rule__ListExpression__Group_0_1__0 ) ) ( ( rule__ListExpression__Group_0_1__0 )* )
            {
            // InternalMyDsl.g:1520:2: ( ( rule__ListExpression__Group_0_1__0 ) )
            // InternalMyDsl.g:1521:3: ( rule__ListExpression__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:1522:3: ( rule__ListExpression__Group_0_1__0 )
            // InternalMyDsl.g:1522:4: rule__ListExpression__Group_0_1__0
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

            // InternalMyDsl.g:1525:2: ( ( rule__ListExpression__Group_0_1__0 )* )
            // InternalMyDsl.g:1526:3: ( rule__ListExpression__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:1527:3: ( rule__ListExpression__Group_0_1__0 )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1527:4: rule__ListExpression__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ListExpression__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMyDsl.g:1537:1: rule__ListExpression__Group_0_1__0 : rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 ;
    public final void rule__ListExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 )
            // InternalMyDsl.g:1542:2: rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1
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
    // InternalMyDsl.g:1549:1: rule__ListExpression__Group_0_1__0__Impl : ( ( rule__ListExpression__Alternatives_0_1_0 ) ) ;
    public final void rule__ListExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( ( ( rule__ListExpression__Alternatives_0_1_0 ) ) )
            // InternalMyDsl.g:1554:1: ( ( rule__ListExpression__Alternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:1554:1: ( ( rule__ListExpression__Alternatives_0_1_0 ) )
            // InternalMyDsl.g:1555:2: ( rule__ListExpression__Alternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAlternatives_0_1_0()); 
            }
            // InternalMyDsl.g:1556:2: ( rule__ListExpression__Alternatives_0_1_0 )
            // InternalMyDsl.g:1556:3: rule__ListExpression__Alternatives_0_1_0
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
    // InternalMyDsl.g:1564:1: rule__ListExpression__Group_0_1__1 : rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2 ;
    public final void rule__ListExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2 )
            // InternalMyDsl.g:1569:2: rule__ListExpression__Group_0_1__1__Impl rule__ListExpression__Group_0_1__2
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
    // InternalMyDsl.g:1576:1: rule__ListExpression__Group_0_1__1__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__ListExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // InternalMyDsl.g:1581:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // InternalMyDsl.g:1581:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // InternalMyDsl.g:1582:2: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // InternalMyDsl.g:1582:2: ( ( RULE_WS ) )
            // InternalMyDsl.g:1583:3: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }
            // InternalMyDsl.g:1584:3: ( RULE_WS )
            // InternalMyDsl.g:1584:4: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_11); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }

            }

            // InternalMyDsl.g:1587:2: ( ( RULE_WS )* )
            // InternalMyDsl.g:1588:3: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1()); 
            }
            // InternalMyDsl.g:1589:3: ( RULE_WS )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_WS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1589:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_11); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMyDsl.g:1598:1: rule__ListExpression__Group_0_1__2 : rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3 ;
    public final void rule__ListExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3 )
            // InternalMyDsl.g:1603:2: rule__ListExpression__Group_0_1__2__Impl rule__ListExpression__Group_0_1__3
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
    // InternalMyDsl.g:1610:1: rule__ListExpression__Group_0_1__2__Impl : ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) ) ;
    public final void rule__ListExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) ) )
            // InternalMyDsl.g:1615:1: ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) )
            {
            // InternalMyDsl.g:1615:1: ( ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 ) )
            // InternalMyDsl.g:1616:2: ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentUnorderedAssignment_0_1_2()); 
            }
            // InternalMyDsl.g:1617:2: ( rule__ListExpression__ContentUnorderedAssignment_0_1_2 )
            // InternalMyDsl.g:1617:3: rule__ListExpression__ContentUnorderedAssignment_0_1_2
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
    // InternalMyDsl.g:1625:1: rule__ListExpression__Group_0_1__3 : rule__ListExpression__Group_0_1__3__Impl ;
    public final void rule__ListExpression__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( rule__ListExpression__Group_0_1__3__Impl )
            // InternalMyDsl.g:1630:2: rule__ListExpression__Group_0_1__3__Impl
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
    // InternalMyDsl.g:1636:1: rule__ListExpression__Group_0_1__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ListExpression__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1640:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1641:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1641:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1642:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_0_1_3()); 
            }
            // InternalMyDsl.g:1643:2: ( RULE_BL )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_BL) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred38_InternalMyDsl()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1643:3: RULE_BL
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
    // InternalMyDsl.g:1652:1: rule__ListExpression__Group_1__0 : rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 ;
    public final void rule__ListExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 )
            // InternalMyDsl.g:1657:2: rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1
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
    // InternalMyDsl.g:1664:1: rule__ListExpression__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__ListExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1669:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1669:1: ( RULE_INT )
            // InternalMyDsl.g:1670:2: RULE_INT
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
    // InternalMyDsl.g:1679:1: rule__ListExpression__Group_1__1 : rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2 ;
    public final void rule__ListExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2 )
            // InternalMyDsl.g:1684:2: rule__ListExpression__Group_1__1__Impl rule__ListExpression__Group_1__2
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
    // InternalMyDsl.g:1691:1: rule__ListExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ListExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( ( '.' ) )
            // InternalMyDsl.g:1696:1: ( '.' )
            {
            // InternalMyDsl.g:1696:1: ( '.' )
            // InternalMyDsl.g:1697:2: '.'
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
    // InternalMyDsl.g:1706:1: rule__ListExpression__Group_1__2 : rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3 ;
    public final void rule__ListExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3 )
            // InternalMyDsl.g:1711:2: rule__ListExpression__Group_1__2__Impl rule__ListExpression__Group_1__3
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
    // InternalMyDsl.g:1718:1: rule__ListExpression__Group_1__2__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__ListExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1722:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // InternalMyDsl.g:1723:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // InternalMyDsl.g:1723:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // InternalMyDsl.g:1724:2: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // InternalMyDsl.g:1724:2: ( ( RULE_WS ) )
            // InternalMyDsl.g:1725:3: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }
            // InternalMyDsl.g:1726:3: ( RULE_WS )
            // InternalMyDsl.g:1726:4: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_11); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }

            }

            // InternalMyDsl.g:1729:2: ( ( RULE_WS )* )
            // InternalMyDsl.g:1730:3: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2()); 
            }
            // InternalMyDsl.g:1731:3: ( RULE_WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1731:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_11); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMyDsl.g:1740:1: rule__ListExpression__Group_1__3 : rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4 ;
    public final void rule__ListExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4 )
            // InternalMyDsl.g:1745:2: rule__ListExpression__Group_1__3__Impl rule__ListExpression__Group_1__4
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
    // InternalMyDsl.g:1752:1: rule__ListExpression__Group_1__3__Impl : ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) ) ;
    public final void rule__ListExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) ) )
            // InternalMyDsl.g:1757:1: ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) )
            {
            // InternalMyDsl.g:1757:1: ( ( rule__ListExpression__ContentOrderedAssignment_1_3 ) )
            // InternalMyDsl.g:1758:2: ( rule__ListExpression__ContentOrderedAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getContentOrderedAssignment_1_3()); 
            }
            // InternalMyDsl.g:1759:2: ( rule__ListExpression__ContentOrderedAssignment_1_3 )
            // InternalMyDsl.g:1759:3: rule__ListExpression__ContentOrderedAssignment_1_3
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
    // InternalMyDsl.g:1767:1: rule__ListExpression__Group_1__4 : rule__ListExpression__Group_1__4__Impl ;
    public final void rule__ListExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( rule__ListExpression__Group_1__4__Impl )
            // InternalMyDsl.g:1772:2: rule__ListExpression__Group_1__4__Impl
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
    // InternalMyDsl.g:1778:1: rule__ListExpression__Group_1__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ListExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1783:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1783:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1784:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_1_4()); 
            }
            // InternalMyDsl.g:1785:2: ( RULE_BL )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_BL) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred40_InternalMyDsl()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1785:3: RULE_BL
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
    // InternalMyDsl.g:1794:1: rule__QuoteExpression__Group__0 : rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 ;
    public final void rule__QuoteExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1 )
            // InternalMyDsl.g:1799:2: rule__QuoteExpression__Group__0__Impl rule__QuoteExpression__Group__1
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
    // InternalMyDsl.g:1806:1: rule__QuoteExpression__Group__0__Impl : ( () ) ;
    public final void rule__QuoteExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( ( () ) )
            // InternalMyDsl.g:1811:1: ( () )
            {
            // InternalMyDsl.g:1811:1: ( () )
            // InternalMyDsl.g:1812:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getQuoteExpressionAction_0()); 
            }
            // InternalMyDsl.g:1813:2: ()
            // InternalMyDsl.g:1813:3: 
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
    // InternalMyDsl.g:1821:1: rule__QuoteExpression__Group__1 : rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 ;
    public final void rule__QuoteExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2 )
            // InternalMyDsl.g:1826:2: rule__QuoteExpression__Group__1__Impl rule__QuoteExpression__Group__2
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
    // InternalMyDsl.g:1833:1: rule__QuoteExpression__Group__1__Impl : ( ( '>' ) ) ;
    public final void rule__QuoteExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( ( ( '>' ) ) )
            // InternalMyDsl.g:1838:1: ( ( '>' ) )
            {
            // InternalMyDsl.g:1838:1: ( ( '>' ) )
            // InternalMyDsl.g:1839:2: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1()); 
            }
            // InternalMyDsl.g:1840:2: ( '>' )
            // InternalMyDsl.g:1840:3: '>'
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
    // InternalMyDsl.g:1848:1: rule__QuoteExpression__Group__2 : rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3 ;
    public final void rule__QuoteExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3 )
            // InternalMyDsl.g:1853:2: rule__QuoteExpression__Group__2__Impl rule__QuoteExpression__Group__3
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
    // InternalMyDsl.g:1860:1: rule__QuoteExpression__Group__2__Impl : ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) ) ;
    public final void rule__QuoteExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) ) )
            // InternalMyDsl.g:1865:1: ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) )
            {
            // InternalMyDsl.g:1865:1: ( ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* ) )
            // InternalMyDsl.g:1866:2: ( ( rule__QuoteExpression__ContentAssignment_2 ) ) ( ( rule__QuoteExpression__ContentAssignment_2 )* )
            {
            // InternalMyDsl.g:1866:2: ( ( rule__QuoteExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:1867:3: ( rule__QuoteExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:1868:3: ( rule__QuoteExpression__ContentAssignment_2 )
            // InternalMyDsl.g:1868:4: rule__QuoteExpression__ContentAssignment_2
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

            // InternalMyDsl.g:1871:2: ( ( rule__QuoteExpression__ContentAssignment_2 )* )
            // InternalMyDsl.g:1872:3: ( rule__QuoteExpression__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:1873:3: ( rule__QuoteExpression__ContentAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:1873:4: rule__QuoteExpression__ContentAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QuoteExpression__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMyDsl.g:1882:1: rule__QuoteExpression__Group__3 : rule__QuoteExpression__Group__3__Impl ;
    public final void rule__QuoteExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( rule__QuoteExpression__Group__3__Impl )
            // InternalMyDsl.g:1887:2: rule__QuoteExpression__Group__3__Impl
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
    // InternalMyDsl.g:1893:1: rule__QuoteExpression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__QuoteExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:1898:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:1898:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:1899:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_3()); 
            }
            // InternalMyDsl.g:1900:2: ( RULE_BL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_BL) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred42_InternalMyDsl()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1900:3: RULE_BL
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
    // InternalMyDsl.g:1909:1: rule__BreakLineExpression__Group__0 : rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1 ;
    public final void rule__BreakLineExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1 )
            // InternalMyDsl.g:1914:2: rule__BreakLineExpression__Group__0__Impl rule__BreakLineExpression__Group__1
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
    // InternalMyDsl.g:1921:1: rule__BreakLineExpression__Group__0__Impl : ( () ) ;
    public final void rule__BreakLineExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( ( () ) )
            // InternalMyDsl.g:1926:1: ( () )
            {
            // InternalMyDsl.g:1926:1: ( () )
            // InternalMyDsl.g:1927:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionAction_0()); 
            }
            // InternalMyDsl.g:1928:2: ()
            // InternalMyDsl.g:1928:3: 
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
    // InternalMyDsl.g:1936:1: rule__BreakLineExpression__Group__1 : rule__BreakLineExpression__Group__1__Impl ;
    public final void rule__BreakLineExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( rule__BreakLineExpression__Group__1__Impl )
            // InternalMyDsl.g:1941:2: rule__BreakLineExpression__Group__1__Impl
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
    // InternalMyDsl.g:1947:1: rule__BreakLineExpression__Group__1__Impl : ( RULE_BL ) ;
    public final void rule__BreakLineExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1951:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:1952:1: ( RULE_BL )
            {
            // InternalMyDsl.g:1952:1: ( RULE_BL )
            // InternalMyDsl.g:1953:2: RULE_BL
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
    // InternalMyDsl.g:1963:1: rule__HorizontalExpression__Group_0__0 : rule__HorizontalExpression__Group_0__0__Impl rule__HorizontalExpression__Group_0__1 ;
    public final void rule__HorizontalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( rule__HorizontalExpression__Group_0__0__Impl rule__HorizontalExpression__Group_0__1 )
            // InternalMyDsl.g:1968:2: rule__HorizontalExpression__Group_0__0__Impl rule__HorizontalExpression__Group_0__1
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
    // InternalMyDsl.g:1975:1: rule__HorizontalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__HorizontalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( ( () ) )
            // InternalMyDsl.g:1980:1: ( () )
            {
            // InternalMyDsl.g:1980:1: ( () )
            // InternalMyDsl.g:1981:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHorizontalExpressionAction_0_0()); 
            }
            // InternalMyDsl.g:1982:2: ()
            // InternalMyDsl.g:1982:3: 
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
    // InternalMyDsl.g:1990:1: rule__HorizontalExpression__Group_0__1 : rule__HorizontalExpression__Group_0__1__Impl ;
    public final void rule__HorizontalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( rule__HorizontalExpression__Group_0__1__Impl )
            // InternalMyDsl.g:1995:2: rule__HorizontalExpression__Group_0__1__Impl
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
    // InternalMyDsl.g:2001:1: rule__HorizontalExpression__Group_0__1__Impl : ( ( rule__HorizontalExpression__Group_0_1__0 ) ) ;
    public final void rule__HorizontalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2005:1: ( ( ( rule__HorizontalExpression__Group_0_1__0 ) ) )
            // InternalMyDsl.g:2006:1: ( ( rule__HorizontalExpression__Group_0_1__0 ) )
            {
            // InternalMyDsl.g:2006:1: ( ( rule__HorizontalExpression__Group_0_1__0 ) )
            // InternalMyDsl.g:2007:2: ( rule__HorizontalExpression__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getGroup_0_1()); 
            }
            // InternalMyDsl.g:2008:2: ( rule__HorizontalExpression__Group_0_1__0 )
            // InternalMyDsl.g:2008:3: rule__HorizontalExpression__Group_0_1__0
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
    // InternalMyDsl.g:2017:1: rule__HorizontalExpression__Group_0_1__0 : rule__HorizontalExpression__Group_0_1__0__Impl rule__HorizontalExpression__Group_0_1__1 ;
    public final void rule__HorizontalExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( rule__HorizontalExpression__Group_0_1__0__Impl rule__HorizontalExpression__Group_0_1__1 )
            // InternalMyDsl.g:2022:2: rule__HorizontalExpression__Group_0_1__0__Impl rule__HorizontalExpression__Group_0_1__1
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
    // InternalMyDsl.g:2029:1: rule__HorizontalExpression__Group_0_1__0__Impl : ( '-' ) ;
    public final void rule__HorizontalExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( ( '-' ) )
            // InternalMyDsl.g:2034:1: ( '-' )
            {
            // InternalMyDsl.g:2034:1: ( '-' )
            // InternalMyDsl.g:2035:2: '-'
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
    // InternalMyDsl.g:2044:1: rule__HorizontalExpression__Group_0_1__1 : rule__HorizontalExpression__Group_0_1__1__Impl rule__HorizontalExpression__Group_0_1__2 ;
    public final void rule__HorizontalExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( rule__HorizontalExpression__Group_0_1__1__Impl rule__HorizontalExpression__Group_0_1__2 )
            // InternalMyDsl.g:2049:2: rule__HorizontalExpression__Group_0_1__1__Impl rule__HorizontalExpression__Group_0_1__2
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
    // InternalMyDsl.g:2056:1: rule__HorizontalExpression__Group_0_1__1__Impl : ( '-' ) ;
    public final void rule__HorizontalExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( ( '-' ) )
            // InternalMyDsl.g:2061:1: ( '-' )
            {
            // InternalMyDsl.g:2061:1: ( '-' )
            // InternalMyDsl.g:2062:2: '-'
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
    // InternalMyDsl.g:2071:1: rule__HorizontalExpression__Group_0_1__2 : rule__HorizontalExpression__Group_0_1__2__Impl ;
    public final void rule__HorizontalExpression__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( rule__HorizontalExpression__Group_0_1__2__Impl )
            // InternalMyDsl.g:2076:2: rule__HorizontalExpression__Group_0_1__2__Impl
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
    // InternalMyDsl.g:2082:1: rule__HorizontalExpression__Group_0_1__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__HorizontalExpression__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2086:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2087:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2087:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2088:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2088:2: ( ( '-' ) )
            // InternalMyDsl.g:2089:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_2()); 
            }
            // InternalMyDsl.g:2090:3: ( '-' )
            // InternalMyDsl.g:2090:4: '-'
            {
            match(input,14,FOLLOW_15); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_2()); 
            }

            }

            // InternalMyDsl.g:2093:2: ( ( '-' )* )
            // InternalMyDsl.g:2094:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_2()); 
            }
            // InternalMyDsl.g:2095:3: ( '-' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==14) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred43_InternalMyDsl()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:2095:4: '-'
            	    {
            	    match(input,14,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalMyDsl.g:2105:1: rule__HorizontalExpression__Group_1__0 : rule__HorizontalExpression__Group_1__0__Impl rule__HorizontalExpression__Group_1__1 ;
    public final void rule__HorizontalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( rule__HorizontalExpression__Group_1__0__Impl rule__HorizontalExpression__Group_1__1 )
            // InternalMyDsl.g:2110:2: rule__HorizontalExpression__Group_1__0__Impl rule__HorizontalExpression__Group_1__1
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
    // InternalMyDsl.g:2117:1: rule__HorizontalExpression__Group_1__0__Impl : ( '_' ) ;
    public final void rule__HorizontalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2121:1: ( ( '_' ) )
            // InternalMyDsl.g:2122:1: ( '_' )
            {
            // InternalMyDsl.g:2122:1: ( '_' )
            // InternalMyDsl.g:2123:2: '_'
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
    // InternalMyDsl.g:2132:1: rule__HorizontalExpression__Group_1__1 : rule__HorizontalExpression__Group_1__1__Impl rule__HorizontalExpression__Group_1__2 ;
    public final void rule__HorizontalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( rule__HorizontalExpression__Group_1__1__Impl rule__HorizontalExpression__Group_1__2 )
            // InternalMyDsl.g:2137:2: rule__HorizontalExpression__Group_1__1__Impl rule__HorizontalExpression__Group_1__2
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
    // InternalMyDsl.g:2144:1: rule__HorizontalExpression__Group_1__1__Impl : ( '_' ) ;
    public final void rule__HorizontalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( ( '_' ) )
            // InternalMyDsl.g:2149:1: ( '_' )
            {
            // InternalMyDsl.g:2149:1: ( '_' )
            // InternalMyDsl.g:2150:2: '_'
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
    // InternalMyDsl.g:2159:1: rule__HorizontalExpression__Group_1__2 : rule__HorizontalExpression__Group_1__2__Impl ;
    public final void rule__HorizontalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( rule__HorizontalExpression__Group_1__2__Impl )
            // InternalMyDsl.g:2164:2: rule__HorizontalExpression__Group_1__2__Impl
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
    // InternalMyDsl.g:2170:1: rule__HorizontalExpression__Group_1__2__Impl : ( ( ( '_' ) ) ( ( '_' )* ) ) ;
    public final void rule__HorizontalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2174:1: ( ( ( ( '_' ) ) ( ( '_' )* ) ) )
            // InternalMyDsl.g:2175:1: ( ( ( '_' ) ) ( ( '_' )* ) )
            {
            // InternalMyDsl.g:2175:1: ( ( ( '_' ) ) ( ( '_' )* ) )
            // InternalMyDsl.g:2176:2: ( ( '_' ) ) ( ( '_' )* )
            {
            // InternalMyDsl.g:2176:2: ( ( '_' ) )
            // InternalMyDsl.g:2177:3: ( '_' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2()); 
            }
            // InternalMyDsl.g:2178:3: ( '_' )
            // InternalMyDsl.g:2178:4: '_'
            {
            match(input,21,FOLLOW_17); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2()); 
            }

            }

            // InternalMyDsl.g:2181:2: ( ( '_' )* )
            // InternalMyDsl.g:2182:3: ( '_' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2()); 
            }
            // InternalMyDsl.g:2183:3: ( '_' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==EOF||(LA30_2>=RULE_ID && LA30_2<=RULE_BL)||(LA30_2>=13 && LA30_2<=18)||LA30_2==20||LA30_2==22||(LA30_2>=28 && LA30_2<=29)||(LA30_2>=31 && LA30_2<=38)) ) {
                        alt30=1;
                    }
                    else if ( (LA30_2==21) ) {
                        int LA30_4 = input.LA(3);

                        if ( (LA30_4==EOF||(LA30_4>=RULE_ID && LA30_4<=RULE_BL)||(LA30_4>=13 && LA30_4<=18)||LA30_4==20||LA30_4==22||(LA30_4>=28 && LA30_4<=29)||(LA30_4>=31 && LA30_4<=38)) ) {
                            alt30=1;
                        }
                        else if ( (LA30_4==21) ) {
                            int LA30_5 = input.LA(4);

                            if ( (synpred44_InternalMyDsl()) ) {
                                alt30=1;
                            }


                        }


                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:2183:4: '_'
            	    {
            	    match(input,21,FOLLOW_17); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMyDsl.g:2193:1: rule__TabExpression__Group__0 : rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1 ;
    public final void rule__TabExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1 )
            // InternalMyDsl.g:2198:2: rule__TabExpression__Group__0__Impl rule__TabExpression__Group__1
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
    // InternalMyDsl.g:2205:1: rule__TabExpression__Group__0__Impl : ( () ) ;
    public final void rule__TabExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2209:1: ( ( () ) )
            // InternalMyDsl.g:2210:1: ( () )
            {
            // InternalMyDsl.g:2210:1: ( () )
            // InternalMyDsl.g:2211:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getTabExpressionAction_0()); 
            }
            // InternalMyDsl.g:2212:2: ()
            // InternalMyDsl.g:2212:3: 
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
    // InternalMyDsl.g:2220:1: rule__TabExpression__Group__1 : rule__TabExpression__Group__1__Impl ;
    public final void rule__TabExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( rule__TabExpression__Group__1__Impl )
            // InternalMyDsl.g:2225:2: rule__TabExpression__Group__1__Impl
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
    // InternalMyDsl.g:2231:1: rule__TabExpression__Group__1__Impl : ( ( rule__TabExpression__Group_1__0 ) ) ;
    public final void rule__TabExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( ( ( rule__TabExpression__Group_1__0 ) ) )
            // InternalMyDsl.g:2236:1: ( ( rule__TabExpression__Group_1__0 ) )
            {
            // InternalMyDsl.g:2236:1: ( ( rule__TabExpression__Group_1__0 ) )
            // InternalMyDsl.g:2237:2: ( rule__TabExpression__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:2238:2: ( rule__TabExpression__Group_1__0 )
            // InternalMyDsl.g:2238:3: rule__TabExpression__Group_1__0
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
    // InternalMyDsl.g:2247:1: rule__TabExpression__Group_1__0 : rule__TabExpression__Group_1__0__Impl ;
    public final void rule__TabExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( rule__TabExpression__Group_1__0__Impl )
            // InternalMyDsl.g:2252:2: rule__TabExpression__Group_1__0__Impl
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
    // InternalMyDsl.g:2258:1: rule__TabExpression__Group_1__0__Impl : ( ( rule__TabExpression__Group_1_0__0 ) ) ;
    public final void rule__TabExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2262:1: ( ( ( rule__TabExpression__Group_1_0__0 ) ) )
            // InternalMyDsl.g:2263:1: ( ( rule__TabExpression__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:2263:1: ( ( rule__TabExpression__Group_1_0__0 ) )
            // InternalMyDsl.g:2264:2: ( rule__TabExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0()); 
            }
            // InternalMyDsl.g:2265:2: ( rule__TabExpression__Group_1_0__0 )
            // InternalMyDsl.g:2265:3: rule__TabExpression__Group_1_0__0
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
    // InternalMyDsl.g:2274:1: rule__TabExpression__Group_1_0__0 : rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1 ;
    public final void rule__TabExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1 )
            // InternalMyDsl.g:2279:2: rule__TabExpression__Group_1_0__0__Impl rule__TabExpression__Group_1_0__1
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
    // InternalMyDsl.g:2286:1: rule__TabExpression__Group_1_0__0__Impl : ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) ) ;
    public final void rule__TabExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) ) )
            // InternalMyDsl.g:2291:1: ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) )
            {
            // InternalMyDsl.g:2291:1: ( ( rule__TabExpression__HeaderAssignment_1_0_0 ) )
            // InternalMyDsl.g:2292:2: ( rule__TabExpression__HeaderAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getHeaderAssignment_1_0_0()); 
            }
            // InternalMyDsl.g:2293:2: ( rule__TabExpression__HeaderAssignment_1_0_0 )
            // InternalMyDsl.g:2293:3: rule__TabExpression__HeaderAssignment_1_0_0
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
    // InternalMyDsl.g:2301:1: rule__TabExpression__Group_1_0__1 : rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2 ;
    public final void rule__TabExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2 )
            // InternalMyDsl.g:2306:2: rule__TabExpression__Group_1_0__1__Impl rule__TabExpression__Group_1_0__2
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
    // InternalMyDsl.g:2313:1: rule__TabExpression__Group_1_0__1__Impl : ( RULE_BL ) ;
    public final void rule__TabExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:2318:1: ( RULE_BL )
            {
            // InternalMyDsl.g:2318:1: ( RULE_BL )
            // InternalMyDsl.g:2319:2: RULE_BL
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
    // InternalMyDsl.g:2328:1: rule__TabExpression__Group_1_0__2 : rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3 ;
    public final void rule__TabExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3 )
            // InternalMyDsl.g:2333:2: rule__TabExpression__Group_1_0__2__Impl rule__TabExpression__Group_1_0__3
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
    // InternalMyDsl.g:2340:1: rule__TabExpression__Group_1_0__2__Impl : ( ruleTabSeparation ) ;
    public final void rule__TabExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2344:1: ( ( ruleTabSeparation ) )
            // InternalMyDsl.g:2345:1: ( ruleTabSeparation )
            {
            // InternalMyDsl.g:2345:1: ( ruleTabSeparation )
            // InternalMyDsl.g:2346:2: ruleTabSeparation
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
    // InternalMyDsl.g:2355:1: rule__TabExpression__Group_1_0__3 : rule__TabExpression__Group_1_0__3__Impl ;
    public final void rule__TabExpression__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( rule__TabExpression__Group_1_0__3__Impl )
            // InternalMyDsl.g:2360:2: rule__TabExpression__Group_1_0__3__Impl
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
    // InternalMyDsl.g:2366:1: rule__TabExpression__Group_1_0__3__Impl : ( ( rule__TabExpression__Group_1_0_3__0 )* ) ;
    public final void rule__TabExpression__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2370:1: ( ( ( rule__TabExpression__Group_1_0_3__0 )* ) )
            // InternalMyDsl.g:2371:1: ( ( rule__TabExpression__Group_1_0_3__0 )* )
            {
            // InternalMyDsl.g:2371:1: ( ( rule__TabExpression__Group_1_0_3__0 )* )
            // InternalMyDsl.g:2372:2: ( rule__TabExpression__Group_1_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0_3()); 
            }
            // InternalMyDsl.g:2373:2: ( rule__TabExpression__Group_1_0_3__0 )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:2373:3: rule__TabExpression__Group_1_0_3__0
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2382:1: rule__TabExpression__Group_1_0_3__0 : rule__TabExpression__Group_1_0_3__0__Impl ;
    public final void rule__TabExpression__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( rule__TabExpression__Group_1_0_3__0__Impl )
            // InternalMyDsl.g:2387:2: rule__TabExpression__Group_1_0_3__0__Impl
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
    // InternalMyDsl.g:2393:1: rule__TabExpression__Group_1_0_3__0__Impl : ( ( rule__TabExpression__Group_1_0_3_0__0 ) ) ;
    public final void rule__TabExpression__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2397:1: ( ( ( rule__TabExpression__Group_1_0_3_0__0 ) ) )
            // InternalMyDsl.g:2398:1: ( ( rule__TabExpression__Group_1_0_3_0__0 ) )
            {
            // InternalMyDsl.g:2398:1: ( ( rule__TabExpression__Group_1_0_3_0__0 ) )
            // InternalMyDsl.g:2399:2: ( rule__TabExpression__Group_1_0_3_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getGroup_1_0_3_0()); 
            }
            // InternalMyDsl.g:2400:2: ( rule__TabExpression__Group_1_0_3_0__0 )
            // InternalMyDsl.g:2400:3: rule__TabExpression__Group_1_0_3_0__0
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
    // InternalMyDsl.g:2409:1: rule__TabExpression__Group_1_0_3_0__0 : rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1 ;
    public final void rule__TabExpression__Group_1_0_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1 )
            // InternalMyDsl.g:2414:2: rule__TabExpression__Group_1_0_3_0__0__Impl rule__TabExpression__Group_1_0_3_0__1
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
    // InternalMyDsl.g:2421:1: rule__TabExpression__Group_1_0_3_0__0__Impl : ( RULE_BL ) ;
    public final void rule__TabExpression__Group_1_0_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( ( RULE_BL ) )
            // InternalMyDsl.g:2426:1: ( RULE_BL )
            {
            // InternalMyDsl.g:2426:1: ( RULE_BL )
            // InternalMyDsl.g:2427:2: RULE_BL
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
    // InternalMyDsl.g:2436:1: rule__TabExpression__Group_1_0_3_0__1 : rule__TabExpression__Group_1_0_3_0__1__Impl ;
    public final void rule__TabExpression__Group_1_0_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( rule__TabExpression__Group_1_0_3_0__1__Impl )
            // InternalMyDsl.g:2441:2: rule__TabExpression__Group_1_0_3_0__1__Impl
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
    // InternalMyDsl.g:2447:1: rule__TabExpression__Group_1_0_3_0__1__Impl : ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) ) ;
    public final void rule__TabExpression__Group_1_0_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2451:1: ( ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) ) )
            // InternalMyDsl.g:2452:1: ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) )
            {
            // InternalMyDsl.g:2452:1: ( ( rule__TabExpression__LinesAssignment_1_0_3_0_1 ) )
            // InternalMyDsl.g:2453:2: ( rule__TabExpression__LinesAssignment_1_0_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabExpressionAccess().getLinesAssignment_1_0_3_0_1()); 
            }
            // InternalMyDsl.g:2454:2: ( rule__TabExpression__LinesAssignment_1_0_3_0_1 )
            // InternalMyDsl.g:2454:3: rule__TabExpression__LinesAssignment_1_0_3_0_1
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
    // InternalMyDsl.g:2463:1: rule__TabSeparation__Group__0 : rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1 ;
    public final void rule__TabSeparation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1 )
            // InternalMyDsl.g:2468:2: rule__TabSeparation__Group__0__Impl rule__TabSeparation__Group__1
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
    // InternalMyDsl.g:2475:1: rule__TabSeparation__Group__0__Impl : ( ( '|' )? ) ;
    public final void rule__TabSeparation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2479:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2480:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2480:1: ( ( '|' )? )
            // InternalMyDsl.g:2481:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_0()); 
            }
            // InternalMyDsl.g:2482:2: ( '|' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2482:3: '|'
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
    // InternalMyDsl.g:2490:1: rule__TabSeparation__Group__1 : rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2 ;
    public final void rule__TabSeparation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2 )
            // InternalMyDsl.g:2495:2: rule__TabSeparation__Group__1__Impl rule__TabSeparation__Group__2
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
    // InternalMyDsl.g:2502:1: rule__TabSeparation__Group__1__Impl : ( '-' ) ;
    public final void rule__TabSeparation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( ( '-' ) )
            // InternalMyDsl.g:2507:1: ( '-' )
            {
            // InternalMyDsl.g:2507:1: ( '-' )
            // InternalMyDsl.g:2508:2: '-'
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
    // InternalMyDsl.g:2517:1: rule__TabSeparation__Group__2 : rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3 ;
    public final void rule__TabSeparation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3 )
            // InternalMyDsl.g:2522:2: rule__TabSeparation__Group__2__Impl rule__TabSeparation__Group__3
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
    // InternalMyDsl.g:2529:1: rule__TabSeparation__Group__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__TabSeparation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2534:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2534:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2535:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2535:2: ( ( '-' ) )
            // InternalMyDsl.g:2536:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }
            // InternalMyDsl.g:2537:3: ( '-' )
            // InternalMyDsl.g:2537:4: '-'
            {
            match(input,14,FOLLOW_15); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }

            }

            // InternalMyDsl.g:2540:2: ( ( '-' )* )
            // InternalMyDsl.g:2541:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2()); 
            }
            // InternalMyDsl.g:2542:3: ( '-' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==14) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:2542:4: '-'
            	    {
            	    match(input,14,FOLLOW_15); if (state.failed) return ;

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
    // InternalMyDsl.g:2551:1: rule__TabSeparation__Group__3 : rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4 ;
    public final void rule__TabSeparation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4 )
            // InternalMyDsl.g:2556:2: rule__TabSeparation__Group__3__Impl rule__TabSeparation__Group__4
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
    // InternalMyDsl.g:2563:1: rule__TabSeparation__Group__3__Impl : ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) ) ;
    public final void rule__TabSeparation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) ) )
            // InternalMyDsl.g:2568:1: ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) )
            {
            // InternalMyDsl.g:2568:1: ( ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* ) )
            // InternalMyDsl.g:2569:2: ( ( rule__TabSeparation__Group_3__0 ) ) ( ( rule__TabSeparation__Group_3__0 )* )
            {
            // InternalMyDsl.g:2569:2: ( ( rule__TabSeparation__Group_3__0 ) )
            // InternalMyDsl.g:2570:3: ( rule__TabSeparation__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:2571:3: ( rule__TabSeparation__Group_3__0 )
            // InternalMyDsl.g:2571:4: rule__TabSeparation__Group_3__0
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

            // InternalMyDsl.g:2574:2: ( ( rule__TabSeparation__Group_3__0 )* )
            // InternalMyDsl.g:2575:3: ( rule__TabSeparation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:2576:3: ( rule__TabSeparation__Group_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==14) ) {
                        int LA34_3 = input.LA(3);

                        if ( (LA34_3==14) ) {
                            int LA34_4 = input.LA(4);

                            if ( (synpred48_InternalMyDsl()) ) {
                                alt34=1;
                            }


                        }


                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:2576:4: rule__TabSeparation__Group_3__0
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
    // InternalMyDsl.g:2585:1: rule__TabSeparation__Group__4 : rule__TabSeparation__Group__4__Impl ;
    public final void rule__TabSeparation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2589:1: ( rule__TabSeparation__Group__4__Impl )
            // InternalMyDsl.g:2590:2: rule__TabSeparation__Group__4__Impl
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
    // InternalMyDsl.g:2596:1: rule__TabSeparation__Group__4__Impl : ( ( '|' )? ) ;
    public final void rule__TabSeparation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2600:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2601:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2601:1: ( ( '|' )? )
            // InternalMyDsl.g:2602:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_4()); 
            }
            // InternalMyDsl.g:2603:2: ( '|' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred49_InternalMyDsl()) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2603:3: '|'
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
    // InternalMyDsl.g:2612:1: rule__TabSeparation__Group_3__0 : rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1 ;
    public final void rule__TabSeparation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2616:1: ( rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1 )
            // InternalMyDsl.g:2617:2: rule__TabSeparation__Group_3__0__Impl rule__TabSeparation__Group_3__1
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
    // InternalMyDsl.g:2624:1: rule__TabSeparation__Group_3__0__Impl : ( '|' ) ;
    public final void rule__TabSeparation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2628:1: ( ( '|' ) )
            // InternalMyDsl.g:2629:1: ( '|' )
            {
            // InternalMyDsl.g:2629:1: ( '|' )
            // InternalMyDsl.g:2630:2: '|'
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
    // InternalMyDsl.g:2639:1: rule__TabSeparation__Group_3__1 : rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2 ;
    public final void rule__TabSeparation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2643:1: ( rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2 )
            // InternalMyDsl.g:2644:2: rule__TabSeparation__Group_3__1__Impl rule__TabSeparation__Group_3__2
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
    // InternalMyDsl.g:2651:1: rule__TabSeparation__Group_3__1__Impl : ( '-' ) ;
    public final void rule__TabSeparation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2655:1: ( ( '-' ) )
            // InternalMyDsl.g:2656:1: ( '-' )
            {
            // InternalMyDsl.g:2656:1: ( '-' )
            // InternalMyDsl.g:2657:2: '-'
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
    // InternalMyDsl.g:2666:1: rule__TabSeparation__Group_3__2 : rule__TabSeparation__Group_3__2__Impl ;
    public final void rule__TabSeparation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2670:1: ( rule__TabSeparation__Group_3__2__Impl )
            // InternalMyDsl.g:2671:2: rule__TabSeparation__Group_3__2__Impl
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
    // InternalMyDsl.g:2677:1: rule__TabSeparation__Group_3__2__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__TabSeparation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMyDsl.g:2682:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMyDsl.g:2682:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMyDsl.g:2683:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMyDsl.g:2683:2: ( ( '-' ) )
            // InternalMyDsl.g:2684:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }
            // InternalMyDsl.g:2685:3: ( '-' )
            // InternalMyDsl.g:2685:4: '-'
            {
            match(input,14,FOLLOW_15); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }

            }

            // InternalMyDsl.g:2688:2: ( ( '-' )* )
            // InternalMyDsl.g:2689:3: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2()); 
            }
            // InternalMyDsl.g:2690:3: ( '-' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==14) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred50_InternalMyDsl()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:2690:4: '-'
            	    {
            	    match(input,14,FOLLOW_15); if (state.failed) return ;

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
    // InternalMyDsl.g:2700:1: rule__LineExpression__Group__0 : rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1 ;
    public final void rule__LineExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1 )
            // InternalMyDsl.g:2705:2: rule__LineExpression__Group__0__Impl rule__LineExpression__Group__1
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
    // InternalMyDsl.g:2712:1: rule__LineExpression__Group__0__Impl : ( ( '|' )? ) ;
    public final void rule__LineExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2717:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2717:1: ( ( '|' )? )
            // InternalMyDsl.g:2718:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_0()); 
            }
            // InternalMyDsl.g:2719:2: ( '|' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred51_InternalMyDsl()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2719:3: '|'
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
    // InternalMyDsl.g:2727:1: rule__LineExpression__Group__1 : rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2 ;
    public final void rule__LineExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2731:1: ( rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2 )
            // InternalMyDsl.g:2732:2: rule__LineExpression__Group__1__Impl rule__LineExpression__Group__2
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
    // InternalMyDsl.g:2739:1: rule__LineExpression__Group__1__Impl : ( ( rule__LineExpression__CellsAssignment_1 ) ) ;
    public final void rule__LineExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( ( ( rule__LineExpression__CellsAssignment_1 ) ) )
            // InternalMyDsl.g:2744:1: ( ( rule__LineExpression__CellsAssignment_1 ) )
            {
            // InternalMyDsl.g:2744:1: ( ( rule__LineExpression__CellsAssignment_1 ) )
            // InternalMyDsl.g:2745:2: ( rule__LineExpression__CellsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsAssignment_1()); 
            }
            // InternalMyDsl.g:2746:2: ( rule__LineExpression__CellsAssignment_1 )
            // InternalMyDsl.g:2746:3: rule__LineExpression__CellsAssignment_1
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
    // InternalMyDsl.g:2754:1: rule__LineExpression__Group__2 : rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3 ;
    public final void rule__LineExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3 )
            // InternalMyDsl.g:2759:2: rule__LineExpression__Group__2__Impl rule__LineExpression__Group__3
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
    // InternalMyDsl.g:2766:1: rule__LineExpression__Group__2__Impl : ( ( rule__LineExpression__Group_2__0 )* ) ;
    public final void rule__LineExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2770:1: ( ( ( rule__LineExpression__Group_2__0 )* ) )
            // InternalMyDsl.g:2771:1: ( ( rule__LineExpression__Group_2__0 )* )
            {
            // InternalMyDsl.g:2771:1: ( ( rule__LineExpression__Group_2__0 )* )
            // InternalMyDsl.g:2772:2: ( rule__LineExpression__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getGroup_2()); 
            }
            // InternalMyDsl.g:2773:2: ( rule__LineExpression__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:2773:3: rule__LineExpression__Group_2__0
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
    // InternalMyDsl.g:2781:1: rule__LineExpression__Group__3 : rule__LineExpression__Group__3__Impl ;
    public final void rule__LineExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2785:1: ( rule__LineExpression__Group__3__Impl )
            // InternalMyDsl.g:2786:2: rule__LineExpression__Group__3__Impl
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
    // InternalMyDsl.g:2792:1: rule__LineExpression__Group__3__Impl : ( ( '|' )? ) ;
    public final void rule__LineExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2796:1: ( ( ( '|' )? ) )
            // InternalMyDsl.g:2797:1: ( ( '|' )? )
            {
            // InternalMyDsl.g:2797:1: ( ( '|' )? )
            // InternalMyDsl.g:2798:2: ( '|' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_3()); 
            }
            // InternalMyDsl.g:2799:2: ( '|' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==17) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred53_InternalMyDsl()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2799:3: '|'
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
    // InternalMyDsl.g:2808:1: rule__LineExpression__Group_2__0 : rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1 ;
    public final void rule__LineExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2812:1: ( rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1 )
            // InternalMyDsl.g:2813:2: rule__LineExpression__Group_2__0__Impl rule__LineExpression__Group_2__1
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
    // InternalMyDsl.g:2820:1: rule__LineExpression__Group_2__0__Impl : ( ( '|' ) ) ;
    public final void rule__LineExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( ( ( '|' ) ) )
            // InternalMyDsl.g:2825:1: ( ( '|' ) )
            {
            // InternalMyDsl.g:2825:1: ( ( '|' ) )
            // InternalMyDsl.g:2826:2: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_2_0()); 
            }
            // InternalMyDsl.g:2827:2: ( '|' )
            // InternalMyDsl.g:2827:3: '|'
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
    // InternalMyDsl.g:2835:1: rule__LineExpression__Group_2__1 : rule__LineExpression__Group_2__1__Impl ;
    public final void rule__LineExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2839:1: ( rule__LineExpression__Group_2__1__Impl )
            // InternalMyDsl.g:2840:2: rule__LineExpression__Group_2__1__Impl
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
    // InternalMyDsl.g:2846:1: rule__LineExpression__Group_2__1__Impl : ( ( rule__LineExpression__CellsAssignment_2_1 ) ) ;
    public final void rule__LineExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( ( ( rule__LineExpression__CellsAssignment_2_1 ) ) )
            // InternalMyDsl.g:2851:1: ( ( rule__LineExpression__CellsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2851:1: ( ( rule__LineExpression__CellsAssignment_2_1 ) )
            // InternalMyDsl.g:2852:2: ( rule__LineExpression__CellsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineExpressionAccess().getCellsAssignment_2_1()); 
            }
            // InternalMyDsl.g:2853:2: ( rule__LineExpression__CellsAssignment_2_1 )
            // InternalMyDsl.g:2853:3: rule__LineExpression__CellsAssignment_2_1
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
    // InternalMyDsl.g:2862:1: rule__URLedExpression__Group__0 : rule__URLedExpression__Group__0__Impl rule__URLedExpression__Group__1 ;
    public final void rule__URLedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2866:1: ( rule__URLedExpression__Group__0__Impl rule__URLedExpression__Group__1 )
            // InternalMyDsl.g:2867:2: rule__URLedExpression__Group__0__Impl rule__URLedExpression__Group__1
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
    // InternalMyDsl.g:2874:1: rule__URLedExpression__Group__0__Impl : ( () ) ;
    public final void rule__URLedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( ( () ) )
            // InternalMyDsl.g:2879:1: ( () )
            {
            // InternalMyDsl.g:2879:1: ( () )
            // InternalMyDsl.g:2880:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getURLedExpressionAction_0()); 
            }
            // InternalMyDsl.g:2881:2: ()
            // InternalMyDsl.g:2881:3: 
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
    // InternalMyDsl.g:2889:1: rule__URLedExpression__Group__1 : rule__URLedExpression__Group__1__Impl ;
    public final void rule__URLedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2893:1: ( rule__URLedExpression__Group__1__Impl )
            // InternalMyDsl.g:2894:2: rule__URLedExpression__Group__1__Impl
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
    // InternalMyDsl.g:2900:1: rule__URLedExpression__Group__1__Impl : ( ( rule__URLedExpression__Alternatives_1 ) ) ;
    public final void rule__URLedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2904:1: ( ( ( rule__URLedExpression__Alternatives_1 ) ) )
            // InternalMyDsl.g:2905:1: ( ( rule__URLedExpression__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2905:1: ( ( rule__URLedExpression__Alternatives_1 ) )
            // InternalMyDsl.g:2906:2: ( rule__URLedExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getAlternatives_1()); 
            }
            // InternalMyDsl.g:2907:2: ( rule__URLedExpression__Alternatives_1 )
            // InternalMyDsl.g:2907:3: rule__URLedExpression__Alternatives_1
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
    // InternalMyDsl.g:2916:1: rule__URLedExpression__Group_1_0__0 : rule__URLedExpression__Group_1_0__0__Impl ;
    public final void rule__URLedExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( rule__URLedExpression__Group_1_0__0__Impl )
            // InternalMyDsl.g:2921:2: rule__URLedExpression__Group_1_0__0__Impl
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
    // InternalMyDsl.g:2927:1: rule__URLedExpression__Group_1_0__0__Impl : ( ( rule__URLedExpression__Alternatives_1_0_0 ) ) ;
    public final void rule__URLedExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2931:1: ( ( ( rule__URLedExpression__Alternatives_1_0_0 ) ) )
            // InternalMyDsl.g:2932:1: ( ( rule__URLedExpression__Alternatives_1_0_0 ) )
            {
            // InternalMyDsl.g:2932:1: ( ( rule__URLedExpression__Alternatives_1_0_0 ) )
            // InternalMyDsl.g:2933:2: ( rule__URLedExpression__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLedExpressionAccess().getAlternatives_1_0_0()); 
            }
            // InternalMyDsl.g:2934:2: ( rule__URLedExpression__Alternatives_1_0_0 )
            // InternalMyDsl.g:2934:3: rule__URLedExpression__Alternatives_1_0_0
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
    // InternalMyDsl.g:2943:1: rule__RefExpression__Group__0 : rule__RefExpression__Group__0__Impl rule__RefExpression__Group__1 ;
    public final void rule__RefExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2947:1: ( rule__RefExpression__Group__0__Impl rule__RefExpression__Group__1 )
            // InternalMyDsl.g:2948:2: rule__RefExpression__Group__0__Impl rule__RefExpression__Group__1
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
    // InternalMyDsl.g:2955:1: rule__RefExpression__Group__0__Impl : ( () ) ;
    public final void rule__RefExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2959:1: ( ( () ) )
            // InternalMyDsl.g:2960:1: ( () )
            {
            // InternalMyDsl.g:2960:1: ( () )
            // InternalMyDsl.g:2961:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefExpressionAction_0()); 
            }
            // InternalMyDsl.g:2962:2: ()
            // InternalMyDsl.g:2962:3: 
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
    // InternalMyDsl.g:2970:1: rule__RefExpression__Group__1 : rule__RefExpression__Group__1__Impl rule__RefExpression__Group__2 ;
    public final void rule__RefExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2974:1: ( rule__RefExpression__Group__1__Impl rule__RefExpression__Group__2 )
            // InternalMyDsl.g:2975:2: rule__RefExpression__Group__1__Impl rule__RefExpression__Group__2
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
    // InternalMyDsl.g:2982:1: rule__RefExpression__Group__1__Impl : ( ( '[' ) ) ;
    public final void rule__RefExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:2987:1: ( ( '[' ) )
            {
            // InternalMyDsl.g:2987:1: ( ( '[' ) )
            // InternalMyDsl.g:2988:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:2989:2: ( '[' )
            // InternalMyDsl.g:2989:3: '['
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
    // InternalMyDsl.g:2997:1: rule__RefExpression__Group__2 : rule__RefExpression__Group__2__Impl rule__RefExpression__Group__3 ;
    public final void rule__RefExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3001:1: ( rule__RefExpression__Group__2__Impl rule__RefExpression__Group__3 )
            // InternalMyDsl.g:3002:2: rule__RefExpression__Group__2__Impl rule__RefExpression__Group__3
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
    // InternalMyDsl.g:3009:1: rule__RefExpression__Group__2__Impl : ( ( rule__RefExpression__RefNameAssignment_2 ) ) ;
    public final void rule__RefExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3013:1: ( ( ( rule__RefExpression__RefNameAssignment_2 ) ) )
            // InternalMyDsl.g:3014:1: ( ( rule__RefExpression__RefNameAssignment_2 ) )
            {
            // InternalMyDsl.g:3014:1: ( ( rule__RefExpression__RefNameAssignment_2 ) )
            // InternalMyDsl.g:3015:2: ( rule__RefExpression__RefNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefNameAssignment_2()); 
            }
            // InternalMyDsl.g:3016:2: ( rule__RefExpression__RefNameAssignment_2 )
            // InternalMyDsl.g:3016:3: rule__RefExpression__RefNameAssignment_2
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
    // InternalMyDsl.g:3024:1: rule__RefExpression__Group__3 : rule__RefExpression__Group__3__Impl rule__RefExpression__Group__4 ;
    public final void rule__RefExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3028:1: ( rule__RefExpression__Group__3__Impl rule__RefExpression__Group__4 )
            // InternalMyDsl.g:3029:2: rule__RefExpression__Group__3__Impl rule__RefExpression__Group__4
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
    // InternalMyDsl.g:3036:1: rule__RefExpression__Group__3__Impl : ( ( ']:' ) ) ;
    public final void rule__RefExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3040:1: ( ( ( ']:' ) ) )
            // InternalMyDsl.g:3041:1: ( ( ']:' ) )
            {
            // InternalMyDsl.g:3041:1: ( ( ']:' ) )
            // InternalMyDsl.g:3042:2: ( ']:' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRightSquareBracketColonKeyword_3()); 
            }
            // InternalMyDsl.g:3043:2: ( ']:' )
            // InternalMyDsl.g:3043:3: ']:'
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
    // InternalMyDsl.g:3051:1: rule__RefExpression__Group__4 : rule__RefExpression__Group__4__Impl rule__RefExpression__Group__5 ;
    public final void rule__RefExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3055:1: ( rule__RefExpression__Group__4__Impl rule__RefExpression__Group__5 )
            // InternalMyDsl.g:3056:2: rule__RefExpression__Group__4__Impl rule__RefExpression__Group__5
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
    // InternalMyDsl.g:3063:1: rule__RefExpression__Group__4__Impl : ( ( rule__RefExpression__RefContentAssignment_4 )? ) ;
    public final void rule__RefExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3067:1: ( ( ( rule__RefExpression__RefContentAssignment_4 )? ) )
            // InternalMyDsl.g:3068:1: ( ( rule__RefExpression__RefContentAssignment_4 )? )
            {
            // InternalMyDsl.g:3068:1: ( ( rule__RefExpression__RefContentAssignment_4 )? )
            // InternalMyDsl.g:3069:2: ( rule__RefExpression__RefContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getRefContentAssignment_4()); 
            }
            // InternalMyDsl.g:3070:2: ( rule__RefExpression__RefContentAssignment_4 )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:3070:3: rule__RefExpression__RefContentAssignment_4
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
    // InternalMyDsl.g:3078:1: rule__RefExpression__Group__5 : rule__RefExpression__Group__5__Impl ;
    public final void rule__RefExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3082:1: ( rule__RefExpression__Group__5__Impl )
            // InternalMyDsl.g:3083:2: rule__RefExpression__Group__5__Impl
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
    // InternalMyDsl.g:3089:1: rule__RefExpression__Group__5__Impl : ( ( RULE_BL )? ) ;
    public final void rule__RefExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3093:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3094:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3094:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3095:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefExpressionAccess().getBLTerminalRuleCall_5()); 
            }
            // InternalMyDsl.g:3096:2: ( RULE_BL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_BL) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred55_InternalMyDsl()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:3096:3: RULE_BL
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


    // $ANTLR start "rule__LinkExpression__Group_0__0"
    // InternalMyDsl.g:3105:1: rule__LinkExpression__Group_0__0 : rule__LinkExpression__Group_0__0__Impl rule__LinkExpression__Group_0__1 ;
    public final void rule__LinkExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3109:1: ( rule__LinkExpression__Group_0__0__Impl rule__LinkExpression__Group_0__1 )
            // InternalMyDsl.g:3110:2: rule__LinkExpression__Group_0__0__Impl rule__LinkExpression__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__LinkExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__0"


    // $ANTLR start "rule__LinkExpression__Group_0__0__Impl"
    // InternalMyDsl.g:3117:1: rule__LinkExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__LinkExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( ( () ) )
            // InternalMyDsl.g:3122:1: ( () )
            {
            // InternalMyDsl.g:3122:1: ( () )
            // InternalMyDsl.g:3123:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0_0()); 
            }
            // InternalMyDsl.g:3124:2: ()
            // InternalMyDsl.g:3124:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__0__Impl"


    // $ANTLR start "rule__LinkExpression__Group_0__1"
    // InternalMyDsl.g:3132:1: rule__LinkExpression__Group_0__1 : rule__LinkExpression__Group_0__1__Impl rule__LinkExpression__Group_0__2 ;
    public final void rule__LinkExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3136:1: ( rule__LinkExpression__Group_0__1__Impl rule__LinkExpression__Group_0__2 )
            // InternalMyDsl.g:3137:2: rule__LinkExpression__Group_0__1__Impl rule__LinkExpression__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__LinkExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__1"


    // $ANTLR start "rule__LinkExpression__Group_0__1__Impl"
    // InternalMyDsl.g:3144:1: rule__LinkExpression__Group_0__1__Impl : ( ( '[' ) ) ;
    public final void rule__LinkExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3148:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:3149:1: ( ( '[' ) )
            {
            // InternalMyDsl.g:3149:1: ( ( '[' ) )
            // InternalMyDsl.g:3150:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_0_1()); 
            }
            // InternalMyDsl.g:3151:2: ( '[' )
            // InternalMyDsl.g:3151:3: '['
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__1__Impl"


    // $ANTLR start "rule__LinkExpression__Group_0__2"
    // InternalMyDsl.g:3159:1: rule__LinkExpression__Group_0__2 : rule__LinkExpression__Group_0__2__Impl rule__LinkExpression__Group_0__3 ;
    public final void rule__LinkExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3163:1: ( rule__LinkExpression__Group_0__2__Impl rule__LinkExpression__Group_0__3 )
            // InternalMyDsl.g:3164:2: rule__LinkExpression__Group_0__2__Impl rule__LinkExpression__Group_0__3
            {
            pushFollow(FOLLOW_27);
            rule__LinkExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__2"


    // $ANTLR start "rule__LinkExpression__Group_0__2__Impl"
    // InternalMyDsl.g:3171:1: rule__LinkExpression__Group_0__2__Impl : ( ( rule__LinkExpression__AltTextAssignment_0_2 ) ) ;
    public final void rule__LinkExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3175:1: ( ( ( rule__LinkExpression__AltTextAssignment_0_2 ) ) )
            // InternalMyDsl.g:3176:1: ( ( rule__LinkExpression__AltTextAssignment_0_2 ) )
            {
            // InternalMyDsl.g:3176:1: ( ( rule__LinkExpression__AltTextAssignment_0_2 ) )
            // InternalMyDsl.g:3177:2: ( rule__LinkExpression__AltTextAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getAltTextAssignment_0_2()); 
            }
            // InternalMyDsl.g:3178:2: ( rule__LinkExpression__AltTextAssignment_0_2 )
            // InternalMyDsl.g:3178:3: rule__LinkExpression__AltTextAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__LinkExpression__AltTextAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getAltTextAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__2__Impl"


    // $ANTLR start "rule__LinkExpression__Group_0__3"
    // InternalMyDsl.g:3186:1: rule__LinkExpression__Group_0__3 : rule__LinkExpression__Group_0__3__Impl rule__LinkExpression__Group_0__4 ;
    public final void rule__LinkExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3190:1: ( rule__LinkExpression__Group_0__3__Impl rule__LinkExpression__Group_0__4 )
            // InternalMyDsl.g:3191:2: rule__LinkExpression__Group_0__3__Impl rule__LinkExpression__Group_0__4
            {
            pushFollow(FOLLOW_28);
            rule__LinkExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__3"


    // $ANTLR start "rule__LinkExpression__Group_0__3__Impl"
    // InternalMyDsl.g:3198:1: rule__LinkExpression__Group_0__3__Impl : ( ( '](' ) ) ;
    public final void rule__LinkExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3202:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:3203:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:3203:1: ( ( '](' ) )
            // InternalMyDsl.g:3204:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_0_3()); 
            }
            // InternalMyDsl.g:3205:2: ( '](' )
            // InternalMyDsl.g:3205:3: ']('
            {
            match(input,24,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__3__Impl"


    // $ANTLR start "rule__LinkExpression__Group_0__4"
    // InternalMyDsl.g:3213:1: rule__LinkExpression__Group_0__4 : rule__LinkExpression__Group_0__4__Impl rule__LinkExpression__Group_0__5 ;
    public final void rule__LinkExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3217:1: ( rule__LinkExpression__Group_0__4__Impl rule__LinkExpression__Group_0__5 )
            // InternalMyDsl.g:3218:2: rule__LinkExpression__Group_0__4__Impl rule__LinkExpression__Group_0__5
            {
            pushFollow(FOLLOW_28);
            rule__LinkExpression__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__4"


    // $ANTLR start "rule__LinkExpression__Group_0__4__Impl"
    // InternalMyDsl.g:3225:1: rule__LinkExpression__Group_0__4__Impl : ( ( rule__LinkExpression__LinkContentAssignment_0_4 )? ) ;
    public final void rule__LinkExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3229:1: ( ( ( rule__LinkExpression__LinkContentAssignment_0_4 )? ) )
            // InternalMyDsl.g:3230:1: ( ( rule__LinkExpression__LinkContentAssignment_0_4 )? )
            {
            // InternalMyDsl.g:3230:1: ( ( rule__LinkExpression__LinkContentAssignment_0_4 )? )
            // InternalMyDsl.g:3231:2: ( rule__LinkExpression__LinkContentAssignment_0_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkContentAssignment_0_4()); 
            }
            // InternalMyDsl.g:3232:2: ( rule__LinkExpression__LinkContentAssignment_0_4 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INT)||LA42_0==14||(LA42_0>=16 && LA42_0<=18)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:3232:3: rule__LinkExpression__LinkContentAssignment_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkExpression__LinkContentAssignment_0_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getLinkContentAssignment_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__4__Impl"


    // $ANTLR start "rule__LinkExpression__Group_0__5"
    // InternalMyDsl.g:3240:1: rule__LinkExpression__Group_0__5 : rule__LinkExpression__Group_0__5__Impl rule__LinkExpression__Group_0__6 ;
    public final void rule__LinkExpression__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3244:1: ( rule__LinkExpression__Group_0__5__Impl rule__LinkExpression__Group_0__6 )
            // InternalMyDsl.g:3245:2: rule__LinkExpression__Group_0__5__Impl rule__LinkExpression__Group_0__6
            {
            pushFollow(FOLLOW_7);
            rule__LinkExpression__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__5"


    // $ANTLR start "rule__LinkExpression__Group_0__5__Impl"
    // InternalMyDsl.g:3252:1: rule__LinkExpression__Group_0__5__Impl : ( ( ')' ) ) ;
    public final void rule__LinkExpression__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3256:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:3257:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:3257:1: ( ( ')' ) )
            // InternalMyDsl.g:3258:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_0_5()); 
            }
            // InternalMyDsl.g:3259:2: ( ')' )
            // InternalMyDsl.g:3259:3: ')'
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_0_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__5__Impl"


    // $ANTLR start "rule__LinkExpression__Group_0__6"
    // InternalMyDsl.g:3267:1: rule__LinkExpression__Group_0__6 : rule__LinkExpression__Group_0__6__Impl ;
    public final void rule__LinkExpression__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3271:1: ( rule__LinkExpression__Group_0__6__Impl )
            // InternalMyDsl.g:3272:2: rule__LinkExpression__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__6"


    // $ANTLR start "rule__LinkExpression__Group_0__6__Impl"
    // InternalMyDsl.g:3278:1: rule__LinkExpression__Group_0__6__Impl : ( ( RULE_BL )? ) ;
    public final void rule__LinkExpression__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3282:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3283:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3283:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3284:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_0_6()); 
            }
            // InternalMyDsl.g:3285:2: ( RULE_BL )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_BL) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred57_InternalMyDsl()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:3285:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_0_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_0__6__Impl"


    // $ANTLR start "rule__LinkExpression__Group_1__0"
    // InternalMyDsl.g:3294:1: rule__LinkExpression__Group_1__0 : rule__LinkExpression__Group_1__0__Impl rule__LinkExpression__Group_1__1 ;
    public final void rule__LinkExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3298:1: ( rule__LinkExpression__Group_1__0__Impl rule__LinkExpression__Group_1__1 )
            // InternalMyDsl.g:3299:2: rule__LinkExpression__Group_1__0__Impl rule__LinkExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__LinkExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__0"


    // $ANTLR start "rule__LinkExpression__Group_1__0__Impl"
    // InternalMyDsl.g:3306:1: rule__LinkExpression__Group_1__0__Impl : ( ( '[' ) ) ;
    public final void rule__LinkExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3310:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:3311:1: ( ( '[' ) )
            {
            // InternalMyDsl.g:3311:1: ( ( '[' ) )
            // InternalMyDsl.g:3312:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            // InternalMyDsl.g:3313:2: ( '[' )
            // InternalMyDsl.g:3313:3: '['
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LinkExpression__Group_1__1"
    // InternalMyDsl.g:3321:1: rule__LinkExpression__Group_1__1 : rule__LinkExpression__Group_1__1__Impl rule__LinkExpression__Group_1__2 ;
    public final void rule__LinkExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3325:1: ( rule__LinkExpression__Group_1__1__Impl rule__LinkExpression__Group_1__2 )
            // InternalMyDsl.g:3326:2: rule__LinkExpression__Group_1__1__Impl rule__LinkExpression__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__LinkExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__1"


    // $ANTLR start "rule__LinkExpression__Group_1__1__Impl"
    // InternalMyDsl.g:3333:1: rule__LinkExpression__Group_1__1__Impl : ( ( rule__LinkExpression__AltTextAssignment_1_1 ) ) ;
    public final void rule__LinkExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3337:1: ( ( ( rule__LinkExpression__AltTextAssignment_1_1 ) ) )
            // InternalMyDsl.g:3338:1: ( ( rule__LinkExpression__AltTextAssignment_1_1 ) )
            {
            // InternalMyDsl.g:3338:1: ( ( rule__LinkExpression__AltTextAssignment_1_1 ) )
            // InternalMyDsl.g:3339:2: ( rule__LinkExpression__AltTextAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getAltTextAssignment_1_1()); 
            }
            // InternalMyDsl.g:3340:2: ( rule__LinkExpression__AltTextAssignment_1_1 )
            // InternalMyDsl.g:3340:3: rule__LinkExpression__AltTextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkExpression__AltTextAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getAltTextAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LinkExpression__Group_1__2"
    // InternalMyDsl.g:3348:1: rule__LinkExpression__Group_1__2 : rule__LinkExpression__Group_1__2__Impl rule__LinkExpression__Group_1__3 ;
    public final void rule__LinkExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3352:1: ( rule__LinkExpression__Group_1__2__Impl rule__LinkExpression__Group_1__3 )
            // InternalMyDsl.g:3353:2: rule__LinkExpression__Group_1__2__Impl rule__LinkExpression__Group_1__3
            {
            pushFollow(FOLLOW_30);
            rule__LinkExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__2"


    // $ANTLR start "rule__LinkExpression__Group_1__2__Impl"
    // InternalMyDsl.g:3360:1: rule__LinkExpression__Group_1__2__Impl : ( ( '][' ) ) ;
    public final void rule__LinkExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3364:1: ( ( ( '][' ) ) )
            // InternalMyDsl.g:3365:1: ( ( '][' ) )
            {
            // InternalMyDsl.g:3365:1: ( ( '][' ) )
            // InternalMyDsl.g:3366:2: ( '][' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftSquareBracketKeyword_1_2()); 
            }
            // InternalMyDsl.g:3367:2: ( '][' )
            // InternalMyDsl.g:3367:3: ']['
            {
            match(input,26,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__2__Impl"


    // $ANTLR start "rule__LinkExpression__Group_1__3"
    // InternalMyDsl.g:3375:1: rule__LinkExpression__Group_1__3 : rule__LinkExpression__Group_1__3__Impl rule__LinkExpression__Group_1__4 ;
    public final void rule__LinkExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3379:1: ( rule__LinkExpression__Group_1__3__Impl rule__LinkExpression__Group_1__4 )
            // InternalMyDsl.g:3380:2: rule__LinkExpression__Group_1__3__Impl rule__LinkExpression__Group_1__4
            {
            pushFollow(FOLLOW_30);
            rule__LinkExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__3"


    // $ANTLR start "rule__LinkExpression__Group_1__3__Impl"
    // InternalMyDsl.g:3387:1: rule__LinkExpression__Group_1__3__Impl : ( ( rule__LinkExpression__RefNameAssignment_1_3 )? ) ;
    public final void rule__LinkExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3391:1: ( ( ( rule__LinkExpression__RefNameAssignment_1_3 )? ) )
            // InternalMyDsl.g:3392:1: ( ( rule__LinkExpression__RefNameAssignment_1_3 )? )
            {
            // InternalMyDsl.g:3392:1: ( ( rule__LinkExpression__RefNameAssignment_1_3 )? )
            // InternalMyDsl.g:3393:2: ( rule__LinkExpression__RefNameAssignment_1_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRefNameAssignment_1_3()); 
            }
            // InternalMyDsl.g:3394:2: ( rule__LinkExpression__RefNameAssignment_1_3 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||LA44_0==14||(LA44_0>=16 && LA44_0<=18)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:3394:3: rule__LinkExpression__RefNameAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkExpression__RefNameAssignment_1_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getRefNameAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__3__Impl"


    // $ANTLR start "rule__LinkExpression__Group_1__4"
    // InternalMyDsl.g:3402:1: rule__LinkExpression__Group_1__4 : rule__LinkExpression__Group_1__4__Impl rule__LinkExpression__Group_1__5 ;
    public final void rule__LinkExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3406:1: ( rule__LinkExpression__Group_1__4__Impl rule__LinkExpression__Group_1__5 )
            // InternalMyDsl.g:3407:2: rule__LinkExpression__Group_1__4__Impl rule__LinkExpression__Group_1__5
            {
            pushFollow(FOLLOW_7);
            rule__LinkExpression__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__4"


    // $ANTLR start "rule__LinkExpression__Group_1__4__Impl"
    // InternalMyDsl.g:3414:1: rule__LinkExpression__Group_1__4__Impl : ( ( ']' ) ) ;
    public final void rule__LinkExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3418:1: ( ( ( ']' ) ) )
            // InternalMyDsl.g:3419:1: ( ( ']' ) )
            {
            // InternalMyDsl.g:3419:1: ( ( ']' ) )
            // InternalMyDsl.g:3420:2: ( ']' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRightSquareBracketKeyword_1_4()); 
            }
            // InternalMyDsl.g:3421:2: ( ']' )
            // InternalMyDsl.g:3421:3: ']'
            {
            match(input,27,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getRightSquareBracketKeyword_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__4__Impl"


    // $ANTLR start "rule__LinkExpression__Group_1__5"
    // InternalMyDsl.g:3429:1: rule__LinkExpression__Group_1__5 : rule__LinkExpression__Group_1__5__Impl ;
    public final void rule__LinkExpression__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3433:1: ( rule__LinkExpression__Group_1__5__Impl )
            // InternalMyDsl.g:3434:2: rule__LinkExpression__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkExpression__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__5"


    // $ANTLR start "rule__LinkExpression__Group_1__5__Impl"
    // InternalMyDsl.g:3440:1: rule__LinkExpression__Group_1__5__Impl : ( ( RULE_BL )? ) ;
    public final void rule__LinkExpression__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3444:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3445:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3445:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3446:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_1_5()); 
            }
            // InternalMyDsl.g:3447:2: ( RULE_BL )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_BL) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred59_InternalMyDsl()) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:3447:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__Group_1__5__Impl"


    // $ANTLR start "rule__ImageExpression__Group__0"
    // InternalMyDsl.g:3456:1: rule__ImageExpression__Group__0 : rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1 ;
    public final void rule__ImageExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3460:1: ( rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1 )
            // InternalMyDsl.g:3461:2: rule__ImageExpression__Group__0__Impl rule__ImageExpression__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3468:1: rule__ImageExpression__Group__0__Impl : ( () ) ;
    public final void rule__ImageExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3472:1: ( ( () ) )
            // InternalMyDsl.g:3473:1: ( () )
            {
            // InternalMyDsl.g:3473:1: ( () )
            // InternalMyDsl.g:3474:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getImageExpressionAction_0()); 
            }
            // InternalMyDsl.g:3475:2: ()
            // InternalMyDsl.g:3475:3: 
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
    // InternalMyDsl.g:3483:1: rule__ImageExpression__Group__1 : rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2 ;
    public final void rule__ImageExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3487:1: ( rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2 )
            // InternalMyDsl.g:3488:2: rule__ImageExpression__Group__1__Impl rule__ImageExpression__Group__2
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
    // InternalMyDsl.g:3495:1: rule__ImageExpression__Group__1__Impl : ( ( '![' ) ) ;
    public final void rule__ImageExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3499:1: ( ( ( '![' ) ) )
            // InternalMyDsl.g:3500:1: ( ( '![' ) )
            {
            // InternalMyDsl.g:3500:1: ( ( '![' ) )
            // InternalMyDsl.g:3501:2: ( '![' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:3502:2: ( '![' )
            // InternalMyDsl.g:3502:3: '!['
            {
            match(input,28,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3510:1: rule__ImageExpression__Group__2 : rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3 ;
    public final void rule__ImageExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3514:1: ( rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3 )
            // InternalMyDsl.g:3515:2: rule__ImageExpression__Group__2__Impl rule__ImageExpression__Group__3
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
    // InternalMyDsl.g:3522:1: rule__ImageExpression__Group__2__Impl : ( ( rule__ImageExpression__AltTextAssignment_2 ) ) ;
    public final void rule__ImageExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3526:1: ( ( ( rule__ImageExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:3527:1: ( ( rule__ImageExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:3527:1: ( ( rule__ImageExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:3528:2: ( rule__ImageExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:3529:2: ( rule__ImageExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:3529:3: rule__ImageExpression__AltTextAssignment_2
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
    // InternalMyDsl.g:3537:1: rule__ImageExpression__Group__3 : rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4 ;
    public final void rule__ImageExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3541:1: ( rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4 )
            // InternalMyDsl.g:3542:2: rule__ImageExpression__Group__3__Impl rule__ImageExpression__Group__4
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
    // InternalMyDsl.g:3549:1: rule__ImageExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__ImageExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3553:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:3554:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:3554:1: ( ( '](' ) )
            // InternalMyDsl.g:3555:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:3556:2: ( '](' )
            // InternalMyDsl.g:3556:3: ']('
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
    // InternalMyDsl.g:3564:1: rule__ImageExpression__Group__4 : rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5 ;
    public final void rule__ImageExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3568:1: ( rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5 )
            // InternalMyDsl.g:3569:2: rule__ImageExpression__Group__4__Impl rule__ImageExpression__Group__5
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
    // InternalMyDsl.g:3576:1: rule__ImageExpression__Group__4__Impl : ( ( rule__ImageExpression__LinkContentAssignment_4 )? ) ;
    public final void rule__ImageExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3580:1: ( ( ( rule__ImageExpression__LinkContentAssignment_4 )? ) )
            // InternalMyDsl.g:3581:1: ( ( rule__ImageExpression__LinkContentAssignment_4 )? )
            {
            // InternalMyDsl.g:3581:1: ( ( rule__ImageExpression__LinkContentAssignment_4 )? )
            // InternalMyDsl.g:3582:2: ( rule__ImageExpression__LinkContentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getLinkContentAssignment_4()); 
            }
            // InternalMyDsl.g:3583:2: ( rule__ImageExpression__LinkContentAssignment_4 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_INT)||LA46_0==14||(LA46_0>=16 && LA46_0<=18)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:3583:3: rule__ImageExpression__LinkContentAssignment_4
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
    // InternalMyDsl.g:3591:1: rule__ImageExpression__Group__5 : rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6 ;
    public final void rule__ImageExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3595:1: ( rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6 )
            // InternalMyDsl.g:3596:2: rule__ImageExpression__Group__5__Impl rule__ImageExpression__Group__6
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
    // InternalMyDsl.g:3603:1: rule__ImageExpression__Group__5__Impl : ( ( ')' ) ) ;
    public final void rule__ImageExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3607:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:3608:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:3608:1: ( ( ')' ) )
            // InternalMyDsl.g:3609:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:3610:2: ( ')' )
            // InternalMyDsl.g:3610:3: ')'
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
    // InternalMyDsl.g:3618:1: rule__ImageExpression__Group__6 : rule__ImageExpression__Group__6__Impl ;
    public final void rule__ImageExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3622:1: ( rule__ImageExpression__Group__6__Impl )
            // InternalMyDsl.g:3623:2: rule__ImageExpression__Group__6__Impl
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
    // InternalMyDsl.g:3629:1: rule__ImageExpression__Group__6__Impl : ( ( RULE_BL )? ) ;
    public final void rule__ImageExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3633:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3634:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3634:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3635:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageExpressionAccess().getBLTerminalRuleCall_6()); 
            }
            // InternalMyDsl.g:3636:2: ( RULE_BL )?
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
                    // InternalMyDsl.g:3636:3: RULE_BL
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
    // InternalMyDsl.g:3645:1: rule__VideoExpression__Group__0 : rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1 ;
    public final void rule__VideoExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3649:1: ( rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1 )
            // InternalMyDsl.g:3650:2: rule__VideoExpression__Group__0__Impl rule__VideoExpression__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3657:1: rule__VideoExpression__Group__0__Impl : ( () ) ;
    public final void rule__VideoExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3661:1: ( ( () ) )
            // InternalMyDsl.g:3662:1: ( () )
            {
            // InternalMyDsl.g:3662:1: ( () )
            // InternalMyDsl.g:3663:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0()); 
            }
            // InternalMyDsl.g:3664:2: ()
            // InternalMyDsl.g:3664:3: 
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
    // InternalMyDsl.g:3672:1: rule__VideoExpression__Group__1 : rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2 ;
    public final void rule__VideoExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3676:1: ( rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2 )
            // InternalMyDsl.g:3677:2: rule__VideoExpression__Group__1__Impl rule__VideoExpression__Group__2
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
    // InternalMyDsl.g:3684:1: rule__VideoExpression__Group__1__Impl : ( ( '[![' ) ) ;
    public final void rule__VideoExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3688:1: ( ( ( '[![' ) ) )
            // InternalMyDsl.g:3689:1: ( ( '[![' ) )
            {
            // InternalMyDsl.g:3689:1: ( ( '[![' ) )
            // InternalMyDsl.g:3690:2: ( '[![' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1()); 
            }
            // InternalMyDsl.g:3691:2: ( '[![' )
            // InternalMyDsl.g:3691:3: '[!['
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3699:1: rule__VideoExpression__Group__2 : rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3 ;
    public final void rule__VideoExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3703:1: ( rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3 )
            // InternalMyDsl.g:3704:2: rule__VideoExpression__Group__2__Impl rule__VideoExpression__Group__3
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
    // InternalMyDsl.g:3711:1: rule__VideoExpression__Group__2__Impl : ( ( rule__VideoExpression__AltTextAssignment_2 ) ) ;
    public final void rule__VideoExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3715:1: ( ( ( rule__VideoExpression__AltTextAssignment_2 ) ) )
            // InternalMyDsl.g:3716:1: ( ( rule__VideoExpression__AltTextAssignment_2 ) )
            {
            // InternalMyDsl.g:3716:1: ( ( rule__VideoExpression__AltTextAssignment_2 ) )
            // InternalMyDsl.g:3717:2: ( rule__VideoExpression__AltTextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getAltTextAssignment_2()); 
            }
            // InternalMyDsl.g:3718:2: ( rule__VideoExpression__AltTextAssignment_2 )
            // InternalMyDsl.g:3718:3: rule__VideoExpression__AltTextAssignment_2
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
    // InternalMyDsl.g:3726:1: rule__VideoExpression__Group__3 : rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4 ;
    public final void rule__VideoExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3730:1: ( rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4 )
            // InternalMyDsl.g:3731:2: rule__VideoExpression__Group__3__Impl rule__VideoExpression__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3738:1: rule__VideoExpression__Group__3__Impl : ( ( '](' ) ) ;
    public final void rule__VideoExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3742:1: ( ( ( '](' ) ) )
            // InternalMyDsl.g:3743:1: ( ( '](' ) )
            {
            // InternalMyDsl.g:3743:1: ( ( '](' ) )
            // InternalMyDsl.g:3744:2: ( '](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3()); 
            }
            // InternalMyDsl.g:3745:2: ( '](' )
            // InternalMyDsl.g:3745:3: ']('
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
    // InternalMyDsl.g:3753:1: rule__VideoExpression__Group__4 : rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5 ;
    public final void rule__VideoExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3757:1: ( rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5 )
            // InternalMyDsl.g:3758:2: rule__VideoExpression__Group__4__Impl rule__VideoExpression__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3765:1: rule__VideoExpression__Group__4__Impl : ( ( rule__VideoExpression__LinkImageAssignment_4 )? ) ;
    public final void rule__VideoExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3769:1: ( ( ( rule__VideoExpression__LinkImageAssignment_4 )? ) )
            // InternalMyDsl.g:3770:1: ( ( rule__VideoExpression__LinkImageAssignment_4 )? )
            {
            // InternalMyDsl.g:3770:1: ( ( rule__VideoExpression__LinkImageAssignment_4 )? )
            // InternalMyDsl.g:3771:2: ( rule__VideoExpression__LinkImageAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkImageAssignment_4()); 
            }
            // InternalMyDsl.g:3772:2: ( rule__VideoExpression__LinkImageAssignment_4 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_INT)||LA48_0==14||(LA48_0>=16 && LA48_0<=18)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:3772:3: rule__VideoExpression__LinkImageAssignment_4
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
    // InternalMyDsl.g:3780:1: rule__VideoExpression__Group__5 : rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6 ;
    public final void rule__VideoExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3784:1: ( rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6 )
            // InternalMyDsl.g:3785:2: rule__VideoExpression__Group__5__Impl rule__VideoExpression__Group__6
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
    // InternalMyDsl.g:3792:1: rule__VideoExpression__Group__5__Impl : ( ( ')](' ) ) ;
    public final void rule__VideoExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3796:1: ( ( ( ')](' ) ) )
            // InternalMyDsl.g:3797:1: ( ( ')](' ) )
            {
            // InternalMyDsl.g:3797:1: ( ( ')](' ) )
            // InternalMyDsl.g:3798:2: ( ')](' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5()); 
            }
            // InternalMyDsl.g:3799:2: ( ')](' )
            // InternalMyDsl.g:3799:3: ')]('
            {
            match(input,30,FOLLOW_2); if (state.failed) return ;

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
    // InternalMyDsl.g:3807:1: rule__VideoExpression__Group__6 : rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7 ;
    public final void rule__VideoExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3811:1: ( rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7 )
            // InternalMyDsl.g:3812:2: rule__VideoExpression__Group__6__Impl rule__VideoExpression__Group__7
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
    // InternalMyDsl.g:3819:1: rule__VideoExpression__Group__6__Impl : ( ( rule__VideoExpression__LinkVideoAssignment_6 )? ) ;
    public final void rule__VideoExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3823:1: ( ( ( rule__VideoExpression__LinkVideoAssignment_6 )? ) )
            // InternalMyDsl.g:3824:1: ( ( rule__VideoExpression__LinkVideoAssignment_6 )? )
            {
            // InternalMyDsl.g:3824:1: ( ( rule__VideoExpression__LinkVideoAssignment_6 )? )
            // InternalMyDsl.g:3825:2: ( rule__VideoExpression__LinkVideoAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getLinkVideoAssignment_6()); 
            }
            // InternalMyDsl.g:3826:2: ( rule__VideoExpression__LinkVideoAssignment_6 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_INT)||LA49_0==14||(LA49_0>=16 && LA49_0<=18)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:3826:3: rule__VideoExpression__LinkVideoAssignment_6
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
    // InternalMyDsl.g:3834:1: rule__VideoExpression__Group__7 : rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8 ;
    public final void rule__VideoExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3838:1: ( rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8 )
            // InternalMyDsl.g:3839:2: rule__VideoExpression__Group__7__Impl rule__VideoExpression__Group__8
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
    // InternalMyDsl.g:3846:1: rule__VideoExpression__Group__7__Impl : ( ( ')' ) ) ;
    public final void rule__VideoExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3850:1: ( ( ( ')' ) ) )
            // InternalMyDsl.g:3851:1: ( ( ')' ) )
            {
            // InternalMyDsl.g:3851:1: ( ( ')' ) )
            // InternalMyDsl.g:3852:2: ( ')' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7()); 
            }
            // InternalMyDsl.g:3853:2: ( ')' )
            // InternalMyDsl.g:3853:3: ')'
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
    // InternalMyDsl.g:3861:1: rule__VideoExpression__Group__8 : rule__VideoExpression__Group__8__Impl ;
    public final void rule__VideoExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3865:1: ( rule__VideoExpression__Group__8__Impl )
            // InternalMyDsl.g:3866:2: rule__VideoExpression__Group__8__Impl
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
    // InternalMyDsl.g:3872:1: rule__VideoExpression__Group__8__Impl : ( ( RULE_BL )? ) ;
    public final void rule__VideoExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3876:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:3877:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:3877:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:3878:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVideoExpressionAccess().getBLTerminalRuleCall_8()); 
            }
            // InternalMyDsl.g:3879:2: ( RULE_BL )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_BL) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred64_InternalMyDsl()) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:3879:3: RULE_BL
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
    // InternalMyDsl.g:3888:1: rule__Header1Expression__Group__0 : rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1 ;
    public final void rule__Header1Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3892:1: ( rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1 )
            // InternalMyDsl.g:3893:2: rule__Header1Expression__Group__0__Impl rule__Header1Expression__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3900:1: rule__Header1Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header1Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3904:1: ( ( () ) )
            // InternalMyDsl.g:3905:1: ( () )
            {
            // InternalMyDsl.g:3905:1: ( () )
            // InternalMyDsl.g:3906:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0()); 
            }
            // InternalMyDsl.g:3907:2: ()
            // InternalMyDsl.g:3907:3: 
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
    // InternalMyDsl.g:3915:1: rule__Header1Expression__Group__1 : rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2 ;
    public final void rule__Header1Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3919:1: ( rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2 )
            // InternalMyDsl.g:3920:2: rule__Header1Expression__Group__1__Impl rule__Header1Expression__Group__2
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
    // InternalMyDsl.g:3927:1: rule__Header1Expression__Group__1__Impl : ( '#' ) ;
    public final void rule__Header1Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3931:1: ( ( '#' ) )
            // InternalMyDsl.g:3932:1: ( '#' )
            {
            // InternalMyDsl.g:3932:1: ( '#' )
            // InternalMyDsl.g:3933:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:3942:1: rule__Header1Expression__Group__2 : rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3 ;
    public final void rule__Header1Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3946:1: ( rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3 )
            // InternalMyDsl.g:3947:2: rule__Header1Expression__Group__2__Impl rule__Header1Expression__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3954:1: rule__Header1Expression__Group__2__Impl : ( ( rule__Header1Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header1Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3958:1: ( ( ( rule__Header1Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:3959:1: ( ( rule__Header1Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:3959:1: ( ( rule__Header1Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:3960:2: ( rule__Header1Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:3961:2: ( rule__Header1Expression__TitleAssignment_2 )
            // InternalMyDsl.g:3961:3: rule__Header1Expression__TitleAssignment_2
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
    // InternalMyDsl.g:3969:1: rule__Header1Expression__Group__3 : rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4 ;
    public final void rule__Header1Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3973:1: ( rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4 )
            // InternalMyDsl.g:3974:2: rule__Header1Expression__Group__3__Impl rule__Header1Expression__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3981:1: rule__Header1Expression__Group__3__Impl : ( ( rule__Header1Expression__Group_3__0 )* ) ;
    public final void rule__Header1Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3985:1: ( ( ( rule__Header1Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:3986:1: ( ( rule__Header1Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:3986:1: ( ( rule__Header1Expression__Group_3__0 )* )
            // InternalMyDsl.g:3987:2: ( rule__Header1Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:3988:2: ( rule__Header1Expression__Group_3__0 )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // InternalMyDsl.g:3988:3: rule__Header1Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Header1Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalMyDsl.g:3996:1: rule__Header1Expression__Group__4 : rule__Header1Expression__Group__4__Impl ;
    public final void rule__Header1Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4000:1: ( rule__Header1Expression__Group__4__Impl )
            // InternalMyDsl.g:4001:2: rule__Header1Expression__Group__4__Impl
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
    // InternalMyDsl.g:4007:1: rule__Header1Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header1Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4011:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4012:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4012:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4013:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4014:2: ( RULE_BL )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_BL) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred66_InternalMyDsl()) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:4014:3: RULE_BL
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
    // InternalMyDsl.g:4023:1: rule__Header1Expression__Group_3__0 : rule__Header1Expression__Group_3__0__Impl ;
    public final void rule__Header1Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4027:1: ( rule__Header1Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4028:2: rule__Header1Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4034:1: rule__Header1Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header1Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4038:1: ( ( '#' ) )
            // InternalMyDsl.g:4039:1: ( '#' )
            {
            // InternalMyDsl.g:4039:1: ( '#' )
            // InternalMyDsl.g:4040:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4050:1: rule__Header2Expression__Group__0 : rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1 ;
    public final void rule__Header2Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4054:1: ( rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1 )
            // InternalMyDsl.g:4055:2: rule__Header2Expression__Group__0__Impl rule__Header2Expression__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4062:1: rule__Header2Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header2Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4066:1: ( ( () ) )
            // InternalMyDsl.g:4067:1: ( () )
            {
            // InternalMyDsl.g:4067:1: ( () )
            // InternalMyDsl.g:4068:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4069:2: ()
            // InternalMyDsl.g:4069:3: 
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
    // InternalMyDsl.g:4077:1: rule__Header2Expression__Group__1 : rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2 ;
    public final void rule__Header2Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4081:1: ( rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2 )
            // InternalMyDsl.g:4082:2: rule__Header2Expression__Group__1__Impl rule__Header2Expression__Group__2
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
    // InternalMyDsl.g:4089:1: rule__Header2Expression__Group__1__Impl : ( '##' ) ;
    public final void rule__Header2Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4093:1: ( ( '##' ) )
            // InternalMyDsl.g:4094:1: ( '##' )
            {
            // InternalMyDsl.g:4094:1: ( '##' )
            // InternalMyDsl.g:4095:2: '##'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4104:1: rule__Header2Expression__Group__2 : rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3 ;
    public final void rule__Header2Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4108:1: ( rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3 )
            // InternalMyDsl.g:4109:2: rule__Header2Expression__Group__2__Impl rule__Header2Expression__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4116:1: rule__Header2Expression__Group__2__Impl : ( ( rule__Header2Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header2Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4120:1: ( ( ( rule__Header2Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4121:1: ( ( rule__Header2Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4121:1: ( ( rule__Header2Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4122:2: ( rule__Header2Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4123:2: ( rule__Header2Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4123:3: rule__Header2Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4131:1: rule__Header2Expression__Group__3 : rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4 ;
    public final void rule__Header2Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4135:1: ( rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4 )
            // InternalMyDsl.g:4136:2: rule__Header2Expression__Group__3__Impl rule__Header2Expression__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4143:1: rule__Header2Expression__Group__3__Impl : ( ( rule__Header2Expression__Group_3__0 )* ) ;
    public final void rule__Header2Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4147:1: ( ( ( rule__Header2Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4148:1: ( ( rule__Header2Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4148:1: ( ( rule__Header2Expression__Group_3__0 )* )
            // InternalMyDsl.g:4149:2: ( rule__Header2Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4150:2: ( rule__Header2Expression__Group_3__0 )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:4150:3: rule__Header2Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Header2Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalMyDsl.g:4158:1: rule__Header2Expression__Group__4 : rule__Header2Expression__Group__4__Impl ;
    public final void rule__Header2Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4162:1: ( rule__Header2Expression__Group__4__Impl )
            // InternalMyDsl.g:4163:2: rule__Header2Expression__Group__4__Impl
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
    // InternalMyDsl.g:4169:1: rule__Header2Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header2Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4173:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4174:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4174:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4175:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4176:2: ( RULE_BL )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_BL) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred68_InternalMyDsl()) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:4176:3: RULE_BL
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
    // InternalMyDsl.g:4185:1: rule__Header2Expression__Group_3__0 : rule__Header2Expression__Group_3__0__Impl ;
    public final void rule__Header2Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4189:1: ( rule__Header2Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4190:2: rule__Header2Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4196:1: rule__Header2Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header2Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4200:1: ( ( '#' ) )
            // InternalMyDsl.g:4201:1: ( '#' )
            {
            // InternalMyDsl.g:4201:1: ( '#' )
            // InternalMyDsl.g:4202:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4212:1: rule__Header3Expression__Group__0 : rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1 ;
    public final void rule__Header3Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4216:1: ( rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1 )
            // InternalMyDsl.g:4217:2: rule__Header3Expression__Group__0__Impl rule__Header3Expression__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:4224:1: rule__Header3Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header3Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4228:1: ( ( () ) )
            // InternalMyDsl.g:4229:1: ( () )
            {
            // InternalMyDsl.g:4229:1: ( () )
            // InternalMyDsl.g:4230:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4231:2: ()
            // InternalMyDsl.g:4231:3: 
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
    // InternalMyDsl.g:4239:1: rule__Header3Expression__Group__1 : rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2 ;
    public final void rule__Header3Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4243:1: ( rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2 )
            // InternalMyDsl.g:4244:2: rule__Header3Expression__Group__1__Impl rule__Header3Expression__Group__2
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
    // InternalMyDsl.g:4251:1: rule__Header3Expression__Group__1__Impl : ( '###' ) ;
    public final void rule__Header3Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4255:1: ( ( '###' ) )
            // InternalMyDsl.g:4256:1: ( '###' )
            {
            // InternalMyDsl.g:4256:1: ( '###' )
            // InternalMyDsl.g:4257:2: '###'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4266:1: rule__Header3Expression__Group__2 : rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3 ;
    public final void rule__Header3Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4270:1: ( rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3 )
            // InternalMyDsl.g:4271:2: rule__Header3Expression__Group__2__Impl rule__Header3Expression__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4278:1: rule__Header3Expression__Group__2__Impl : ( ( rule__Header3Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header3Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4282:1: ( ( ( rule__Header3Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4283:1: ( ( rule__Header3Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4283:1: ( ( rule__Header3Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4284:2: ( rule__Header3Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4285:2: ( rule__Header3Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4285:3: rule__Header3Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4293:1: rule__Header3Expression__Group__3 : rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4 ;
    public final void rule__Header3Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4297:1: ( rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4 )
            // InternalMyDsl.g:4298:2: rule__Header3Expression__Group__3__Impl rule__Header3Expression__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4305:1: rule__Header3Expression__Group__3__Impl : ( ( rule__Header3Expression__Group_3__0 )* ) ;
    public final void rule__Header3Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4309:1: ( ( ( rule__Header3Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4310:1: ( ( rule__Header3Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4310:1: ( ( rule__Header3Expression__Group_3__0 )* )
            // InternalMyDsl.g:4311:2: ( rule__Header3Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4312:2: ( rule__Header3Expression__Group_3__0 )*
            loop55:
            do {
                int alt55=2;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // InternalMyDsl.g:4312:3: rule__Header3Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Header3Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalMyDsl.g:4320:1: rule__Header3Expression__Group__4 : rule__Header3Expression__Group__4__Impl ;
    public final void rule__Header3Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4324:1: ( rule__Header3Expression__Group__4__Impl )
            // InternalMyDsl.g:4325:2: rule__Header3Expression__Group__4__Impl
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
    // InternalMyDsl.g:4331:1: rule__Header3Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header3Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4335:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4336:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4336:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4337:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4338:2: ( RULE_BL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_BL) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred70_InternalMyDsl()) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:4338:3: RULE_BL
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
    // InternalMyDsl.g:4347:1: rule__Header3Expression__Group_3__0 : rule__Header3Expression__Group_3__0__Impl ;
    public final void rule__Header3Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4351:1: ( rule__Header3Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4352:2: rule__Header3Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4358:1: rule__Header3Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header3Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4362:1: ( ( '#' ) )
            // InternalMyDsl.g:4363:1: ( '#' )
            {
            // InternalMyDsl.g:4363:1: ( '#' )
            // InternalMyDsl.g:4364:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4374:1: rule__Header4Expression__Group__0 : rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1 ;
    public final void rule__Header4Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4378:1: ( rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1 )
            // InternalMyDsl.g:4379:2: rule__Header4Expression__Group__0__Impl rule__Header4Expression__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4386:1: rule__Header4Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header4Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4390:1: ( ( () ) )
            // InternalMyDsl.g:4391:1: ( () )
            {
            // InternalMyDsl.g:4391:1: ( () )
            // InternalMyDsl.g:4392:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4393:2: ()
            // InternalMyDsl.g:4393:3: 
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
    // InternalMyDsl.g:4401:1: rule__Header4Expression__Group__1 : rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2 ;
    public final void rule__Header4Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4405:1: ( rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2 )
            // InternalMyDsl.g:4406:2: rule__Header4Expression__Group__1__Impl rule__Header4Expression__Group__2
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
    // InternalMyDsl.g:4413:1: rule__Header4Expression__Group__1__Impl : ( '####' ) ;
    public final void rule__Header4Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4417:1: ( ( '####' ) )
            // InternalMyDsl.g:4418:1: ( '####' )
            {
            // InternalMyDsl.g:4418:1: ( '####' )
            // InternalMyDsl.g:4419:2: '####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4428:1: rule__Header4Expression__Group__2 : rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3 ;
    public final void rule__Header4Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4432:1: ( rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3 )
            // InternalMyDsl.g:4433:2: rule__Header4Expression__Group__2__Impl rule__Header4Expression__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4440:1: rule__Header4Expression__Group__2__Impl : ( ( rule__Header4Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header4Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4444:1: ( ( ( rule__Header4Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4445:1: ( ( rule__Header4Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4445:1: ( ( rule__Header4Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4446:2: ( rule__Header4Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4447:2: ( rule__Header4Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4447:3: rule__Header4Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4455:1: rule__Header4Expression__Group__3 : rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4 ;
    public final void rule__Header4Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4459:1: ( rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4 )
            // InternalMyDsl.g:4460:2: rule__Header4Expression__Group__3__Impl rule__Header4Expression__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4467:1: rule__Header4Expression__Group__3__Impl : ( ( rule__Header4Expression__Group_3__0 )* ) ;
    public final void rule__Header4Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4471:1: ( ( ( rule__Header4Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4472:1: ( ( rule__Header4Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4472:1: ( ( rule__Header4Expression__Group_3__0 )* )
            // InternalMyDsl.g:4473:2: ( rule__Header4Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4474:2: ( rule__Header4Expression__Group_3__0 )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // InternalMyDsl.g:4474:3: rule__Header4Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Header4Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalMyDsl.g:4482:1: rule__Header4Expression__Group__4 : rule__Header4Expression__Group__4__Impl ;
    public final void rule__Header4Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4486:1: ( rule__Header4Expression__Group__4__Impl )
            // InternalMyDsl.g:4487:2: rule__Header4Expression__Group__4__Impl
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
    // InternalMyDsl.g:4493:1: rule__Header4Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header4Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4497:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4498:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4498:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4499:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4500:2: ( RULE_BL )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_BL) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred72_InternalMyDsl()) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:4500:3: RULE_BL
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
    // InternalMyDsl.g:4509:1: rule__Header4Expression__Group_3__0 : rule__Header4Expression__Group_3__0__Impl ;
    public final void rule__Header4Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4513:1: ( rule__Header4Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4514:2: rule__Header4Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4520:1: rule__Header4Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header4Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4524:1: ( ( '#' ) )
            // InternalMyDsl.g:4525:1: ( '#' )
            {
            // InternalMyDsl.g:4525:1: ( '#' )
            // InternalMyDsl.g:4526:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4536:1: rule__Header5Expression__Group__0 : rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1 ;
    public final void rule__Header5Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4540:1: ( rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1 )
            // InternalMyDsl.g:4541:2: rule__Header5Expression__Group__0__Impl rule__Header5Expression__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4548:1: rule__Header5Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header5Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4552:1: ( ( () ) )
            // InternalMyDsl.g:4553:1: ( () )
            {
            // InternalMyDsl.g:4553:1: ( () )
            // InternalMyDsl.g:4554:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4555:2: ()
            // InternalMyDsl.g:4555:3: 
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
    // InternalMyDsl.g:4563:1: rule__Header5Expression__Group__1 : rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2 ;
    public final void rule__Header5Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4567:1: ( rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2 )
            // InternalMyDsl.g:4568:2: rule__Header5Expression__Group__1__Impl rule__Header5Expression__Group__2
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
    // InternalMyDsl.g:4575:1: rule__Header5Expression__Group__1__Impl : ( '#####' ) ;
    public final void rule__Header5Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4579:1: ( ( '#####' ) )
            // InternalMyDsl.g:4580:1: ( '#####' )
            {
            // InternalMyDsl.g:4580:1: ( '#####' )
            // InternalMyDsl.g:4581:2: '#####'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4590:1: rule__Header5Expression__Group__2 : rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3 ;
    public final void rule__Header5Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4594:1: ( rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3 )
            // InternalMyDsl.g:4595:2: rule__Header5Expression__Group__2__Impl rule__Header5Expression__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4602:1: rule__Header5Expression__Group__2__Impl : ( ( rule__Header5Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header5Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4606:1: ( ( ( rule__Header5Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4607:1: ( ( rule__Header5Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4607:1: ( ( rule__Header5Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4608:2: ( rule__Header5Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4609:2: ( rule__Header5Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4609:3: rule__Header5Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4617:1: rule__Header5Expression__Group__3 : rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4 ;
    public final void rule__Header5Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4621:1: ( rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4 )
            // InternalMyDsl.g:4622:2: rule__Header5Expression__Group__3__Impl rule__Header5Expression__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4629:1: rule__Header5Expression__Group__3__Impl : ( ( rule__Header5Expression__Group_3__0 )* ) ;
    public final void rule__Header5Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4633:1: ( ( ( rule__Header5Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4634:1: ( ( rule__Header5Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4634:1: ( ( rule__Header5Expression__Group_3__0 )* )
            // InternalMyDsl.g:4635:2: ( rule__Header5Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4636:2: ( rule__Header5Expression__Group_3__0 )*
            loop59:
            do {
                int alt59=2;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // InternalMyDsl.g:4636:3: rule__Header5Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Header5Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalMyDsl.g:4644:1: rule__Header5Expression__Group__4 : rule__Header5Expression__Group__4__Impl ;
    public final void rule__Header5Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4648:1: ( rule__Header5Expression__Group__4__Impl )
            // InternalMyDsl.g:4649:2: rule__Header5Expression__Group__4__Impl
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
    // InternalMyDsl.g:4655:1: rule__Header5Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header5Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4659:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4660:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4660:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4661:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4662:2: ( RULE_BL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_BL) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred74_InternalMyDsl()) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:4662:3: RULE_BL
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
    // InternalMyDsl.g:4671:1: rule__Header5Expression__Group_3__0 : rule__Header5Expression__Group_3__0__Impl ;
    public final void rule__Header5Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4675:1: ( rule__Header5Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4676:2: rule__Header5Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4682:1: rule__Header5Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header5Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4686:1: ( ( '#' ) )
            // InternalMyDsl.g:4687:1: ( '#' )
            {
            // InternalMyDsl.g:4687:1: ( '#' )
            // InternalMyDsl.g:4688:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4698:1: rule__Header6Expression__Group__0 : rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1 ;
    public final void rule__Header6Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4702:1: ( rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1 )
            // InternalMyDsl.g:4703:2: rule__Header6Expression__Group__0__Impl rule__Header6Expression__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4710:1: rule__Header6Expression__Group__0__Impl : ( () ) ;
    public final void rule__Header6Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4714:1: ( ( () ) )
            // InternalMyDsl.g:4715:1: ( () )
            {
            // InternalMyDsl.g:4715:1: ( () )
            // InternalMyDsl.g:4716:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0()); 
            }
            // InternalMyDsl.g:4717:2: ()
            // InternalMyDsl.g:4717:3: 
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
    // InternalMyDsl.g:4725:1: rule__Header6Expression__Group__1 : rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2 ;
    public final void rule__Header6Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4729:1: ( rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2 )
            // InternalMyDsl.g:4730:2: rule__Header6Expression__Group__1__Impl rule__Header6Expression__Group__2
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
    // InternalMyDsl.g:4737:1: rule__Header6Expression__Group__1__Impl : ( '######' ) ;
    public final void rule__Header6Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4741:1: ( ( '######' ) )
            // InternalMyDsl.g:4742:1: ( '######' )
            {
            // InternalMyDsl.g:4742:1: ( '######' )
            // InternalMyDsl.g:4743:2: '######'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4752:1: rule__Header6Expression__Group__2 : rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3 ;
    public final void rule__Header6Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4756:1: ( rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3 )
            // InternalMyDsl.g:4757:2: rule__Header6Expression__Group__2__Impl rule__Header6Expression__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4764:1: rule__Header6Expression__Group__2__Impl : ( ( rule__Header6Expression__TitleAssignment_2 ) ) ;
    public final void rule__Header6Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4768:1: ( ( ( rule__Header6Expression__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:4769:1: ( ( rule__Header6Expression__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:4769:1: ( ( rule__Header6Expression__TitleAssignment_2 ) )
            // InternalMyDsl.g:4770:2: ( rule__Header6Expression__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getTitleAssignment_2()); 
            }
            // InternalMyDsl.g:4771:2: ( rule__Header6Expression__TitleAssignment_2 )
            // InternalMyDsl.g:4771:3: rule__Header6Expression__TitleAssignment_2
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
    // InternalMyDsl.g:4779:1: rule__Header6Expression__Group__3 : rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4 ;
    public final void rule__Header6Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4783:1: ( rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4 )
            // InternalMyDsl.g:4784:2: rule__Header6Expression__Group__3__Impl rule__Header6Expression__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:4791:1: rule__Header6Expression__Group__3__Impl : ( ( rule__Header6Expression__Group_3__0 )* ) ;
    public final void rule__Header6Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4795:1: ( ( ( rule__Header6Expression__Group_3__0 )* ) )
            // InternalMyDsl.g:4796:1: ( ( rule__Header6Expression__Group_3__0 )* )
            {
            // InternalMyDsl.g:4796:1: ( ( rule__Header6Expression__Group_3__0 )* )
            // InternalMyDsl.g:4797:2: ( rule__Header6Expression__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getGroup_3()); 
            }
            // InternalMyDsl.g:4798:2: ( rule__Header6Expression__Group_3__0 )*
            loop61:
            do {
                int alt61=2;
                alt61 = dfa61.predict(input);
                switch (alt61) {
            	case 1 :
            	    // InternalMyDsl.g:4798:3: rule__Header6Expression__Group_3__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Header6Expression__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalMyDsl.g:4806:1: rule__Header6Expression__Group__4 : rule__Header6Expression__Group__4__Impl ;
    public final void rule__Header6Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4810:1: ( rule__Header6Expression__Group__4__Impl )
            // InternalMyDsl.g:4811:2: rule__Header6Expression__Group__4__Impl
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
    // InternalMyDsl.g:4817:1: rule__Header6Expression__Group__4__Impl : ( ( RULE_BL )? ) ;
    public final void rule__Header6Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4821:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:4822:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:4822:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:4823:2: ( RULE_BL )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getBLTerminalRuleCall_4()); 
            }
            // InternalMyDsl.g:4824:2: ( RULE_BL )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_BL) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred76_InternalMyDsl()) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:4824:3: RULE_BL
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
    // InternalMyDsl.g:4833:1: rule__Header6Expression__Group_3__0 : rule__Header6Expression__Group_3__0__Impl ;
    public final void rule__Header6Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4837:1: ( rule__Header6Expression__Group_3__0__Impl )
            // InternalMyDsl.g:4838:2: rule__Header6Expression__Group_3__0__Impl
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
    // InternalMyDsl.g:4844:1: rule__Header6Expression__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Header6Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4848:1: ( ( '#' ) )
            // InternalMyDsl.g:4849:1: ( '#' )
            {
            // InternalMyDsl.g:4849:1: ( '#' )
            // InternalMyDsl.g:4850:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4860:1: rule__EmphasisExpression__Group_0__0 : rule__EmphasisExpression__Group_0__0__Impl ;
    public final void rule__EmphasisExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4864:1: ( rule__EmphasisExpression__Group_0__0__Impl )
            // InternalMyDsl.g:4865:2: rule__EmphasisExpression__Group_0__0__Impl
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
    // InternalMyDsl.g:4871:1: rule__EmphasisExpression__Group_0__0__Impl : ( ( rule__EmphasisExpression__Alternatives_0_0 ) ) ;
    public final void rule__EmphasisExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4875:1: ( ( ( rule__EmphasisExpression__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:4876:1: ( ( rule__EmphasisExpression__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:4876:1: ( ( rule__EmphasisExpression__Alternatives_0_0 ) )
            // InternalMyDsl.g:4877:2: ( rule__EmphasisExpression__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmphasisExpressionAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:4878:2: ( rule__EmphasisExpression__Alternatives_0_0 )
            // InternalMyDsl.g:4878:3: rule__EmphasisExpression__Alternatives_0_0
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
    // InternalMyDsl.g:4887:1: rule__StrongExpression__Group__0 : rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1 ;
    public final void rule__StrongExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4891:1: ( rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1 )
            // InternalMyDsl.g:4892:2: rule__StrongExpression__Group__0__Impl rule__StrongExpression__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4899:1: rule__StrongExpression__Group__0__Impl : ( () ) ;
    public final void rule__StrongExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4903:1: ( ( () ) )
            // InternalMyDsl.g:4904:1: ( () )
            {
            // InternalMyDsl.g:4904:1: ( () )
            // InternalMyDsl.g:4905:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0()); 
            }
            // InternalMyDsl.g:4906:2: ()
            // InternalMyDsl.g:4906:3: 
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
    // InternalMyDsl.g:4914:1: rule__StrongExpression__Group__1 : rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2 ;
    public final void rule__StrongExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4918:1: ( rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2 )
            // InternalMyDsl.g:4919:2: rule__StrongExpression__Group__1__Impl rule__StrongExpression__Group__2
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
    // InternalMyDsl.g:4926:1: rule__StrongExpression__Group__1__Impl : ( '**' ) ;
    public final void rule__StrongExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4930:1: ( ( '**' ) )
            // InternalMyDsl.g:4931:1: ( '**' )
            {
            // InternalMyDsl.g:4931:1: ( '**' )
            // InternalMyDsl.g:4932:2: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4941:1: rule__StrongExpression__Group__2 : rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3 ;
    public final void rule__StrongExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4945:1: ( rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3 )
            // InternalMyDsl.g:4946:2: rule__StrongExpression__Group__2__Impl rule__StrongExpression__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4953:1: rule__StrongExpression__Group__2__Impl : ( ( rule__StrongExpression__ContentAssignment_2 ) ) ;
    public final void rule__StrongExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4957:1: ( ( ( rule__StrongExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:4958:1: ( ( rule__StrongExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:4958:1: ( ( rule__StrongExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:4959:2: ( rule__StrongExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:4960:2: ( rule__StrongExpression__ContentAssignment_2 )
            // InternalMyDsl.g:4960:3: rule__StrongExpression__ContentAssignment_2
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
    // InternalMyDsl.g:4968:1: rule__StrongExpression__Group__3 : rule__StrongExpression__Group__3__Impl ;
    public final void rule__StrongExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4972:1: ( rule__StrongExpression__Group__3__Impl )
            // InternalMyDsl.g:4973:2: rule__StrongExpression__Group__3__Impl
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
    // InternalMyDsl.g:4979:1: rule__StrongExpression__Group__3__Impl : ( '**' ) ;
    public final void rule__StrongExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4983:1: ( ( '**' ) )
            // InternalMyDsl.g:4984:1: ( '**' )
            {
            // InternalMyDsl.g:4984:1: ( '**' )
            // InternalMyDsl.g:4985:2: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:4995:1: rule__ItalicExpression__Group__0 : rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1 ;
    public final void rule__ItalicExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4999:1: ( rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1 )
            // InternalMyDsl.g:5000:2: rule__ItalicExpression__Group__0__Impl rule__ItalicExpression__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:5007:1: rule__ItalicExpression__Group__0__Impl : ( () ) ;
    public final void rule__ItalicExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5011:1: ( ( () ) )
            // InternalMyDsl.g:5012:1: ( () )
            {
            // InternalMyDsl.g:5012:1: ( () )
            // InternalMyDsl.g:5013:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0()); 
            }
            // InternalMyDsl.g:5014:2: ()
            // InternalMyDsl.g:5014:3: 
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
    // InternalMyDsl.g:5022:1: rule__ItalicExpression__Group__1 : rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2 ;
    public final void rule__ItalicExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5026:1: ( rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2 )
            // InternalMyDsl.g:5027:2: rule__ItalicExpression__Group__1__Impl rule__ItalicExpression__Group__2
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
    // InternalMyDsl.g:5034:1: rule__ItalicExpression__Group__1__Impl : ( '*' ) ;
    public final void rule__ItalicExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5038:1: ( ( '*' ) )
            // InternalMyDsl.g:5039:1: ( '*' )
            {
            // InternalMyDsl.g:5039:1: ( '*' )
            // InternalMyDsl.g:5040:2: '*'
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
    // InternalMyDsl.g:5049:1: rule__ItalicExpression__Group__2 : rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3 ;
    public final void rule__ItalicExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5053:1: ( rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3 )
            // InternalMyDsl.g:5054:2: rule__ItalicExpression__Group__2__Impl rule__ItalicExpression__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:5061:1: rule__ItalicExpression__Group__2__Impl : ( ( rule__ItalicExpression__ContentAssignment_2 ) ) ;
    public final void rule__ItalicExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5065:1: ( ( ( rule__ItalicExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:5066:1: ( ( rule__ItalicExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:5066:1: ( ( rule__ItalicExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:5067:2: ( rule__ItalicExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:5068:2: ( rule__ItalicExpression__ContentAssignment_2 )
            // InternalMyDsl.g:5068:3: rule__ItalicExpression__ContentAssignment_2
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
    // InternalMyDsl.g:5076:1: rule__ItalicExpression__Group__3 : rule__ItalicExpression__Group__3__Impl ;
    public final void rule__ItalicExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5080:1: ( rule__ItalicExpression__Group__3__Impl )
            // InternalMyDsl.g:5081:2: rule__ItalicExpression__Group__3__Impl
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
    // InternalMyDsl.g:5087:1: rule__ItalicExpression__Group__3__Impl : ( '*' ) ;
    public final void rule__ItalicExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5091:1: ( ( '*' ) )
            // InternalMyDsl.g:5092:1: ( '*' )
            {
            // InternalMyDsl.g:5092:1: ( '*' )
            // InternalMyDsl.g:5093:2: '*'
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
    // InternalMyDsl.g:5103:1: rule__ScratchExpression__Group__0 : rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1 ;
    public final void rule__ScratchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5107:1: ( rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1 )
            // InternalMyDsl.g:5108:2: rule__ScratchExpression__Group__0__Impl rule__ScratchExpression__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5115:1: rule__ScratchExpression__Group__0__Impl : ( () ) ;
    public final void rule__ScratchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5119:1: ( ( () ) )
            // InternalMyDsl.g:5120:1: ( () )
            {
            // InternalMyDsl.g:5120:1: ( () )
            // InternalMyDsl.g:5121:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0()); 
            }
            // InternalMyDsl.g:5122:2: ()
            // InternalMyDsl.g:5122:3: 
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
    // InternalMyDsl.g:5130:1: rule__ScratchExpression__Group__1 : rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2 ;
    public final void rule__ScratchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5134:1: ( rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2 )
            // InternalMyDsl.g:5135:2: rule__ScratchExpression__Group__1__Impl rule__ScratchExpression__Group__2
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
    // InternalMyDsl.g:5142:1: rule__ScratchExpression__Group__1__Impl : ( '~~' ) ;
    public final void rule__ScratchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5146:1: ( ( '~~' ) )
            // InternalMyDsl.g:5147:1: ( '~~' )
            {
            // InternalMyDsl.g:5147:1: ( '~~' )
            // InternalMyDsl.g:5148:2: '~~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:5157:1: rule__ScratchExpression__Group__2 : rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3 ;
    public final void rule__ScratchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5161:1: ( rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3 )
            // InternalMyDsl.g:5162:2: rule__ScratchExpression__Group__2__Impl rule__ScratchExpression__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:5169:1: rule__ScratchExpression__Group__2__Impl : ( ( rule__ScratchExpression__ContentAssignment_2 ) ) ;
    public final void rule__ScratchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5173:1: ( ( ( rule__ScratchExpression__ContentAssignment_2 ) ) )
            // InternalMyDsl.g:5174:1: ( ( rule__ScratchExpression__ContentAssignment_2 ) )
            {
            // InternalMyDsl.g:5174:1: ( ( rule__ScratchExpression__ContentAssignment_2 ) )
            // InternalMyDsl.g:5175:2: ( rule__ScratchExpression__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getContentAssignment_2()); 
            }
            // InternalMyDsl.g:5176:2: ( rule__ScratchExpression__ContentAssignment_2 )
            // InternalMyDsl.g:5176:3: rule__ScratchExpression__ContentAssignment_2
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
    // InternalMyDsl.g:5184:1: rule__ScratchExpression__Group__3 : rule__ScratchExpression__Group__3__Impl ;
    public final void rule__ScratchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5188:1: ( rule__ScratchExpression__Group__3__Impl )
            // InternalMyDsl.g:5189:2: rule__ScratchExpression__Group__3__Impl
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
    // InternalMyDsl.g:5195:1: rule__ScratchExpression__Group__3__Impl : ( '~~' ) ;
    public final void rule__ScratchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5199:1: ( ( '~~' ) )
            // InternalMyDsl.g:5200:1: ( '~~' )
            {
            // InternalMyDsl.g:5200:1: ( '~~' )
            // InternalMyDsl.g:5201:2: '~~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMyDsl.g:5211:1: rule__NaturalExpression__Group__0 : rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 ;
    public final void rule__NaturalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5215:1: ( rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 )
            // InternalMyDsl.g:5216:2: rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1
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
    // InternalMyDsl.g:5223:1: rule__NaturalExpression__Group__0__Impl : ( () ) ;
    public final void rule__NaturalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5227:1: ( ( () ) )
            // InternalMyDsl.g:5228:1: ( () )
            {
            // InternalMyDsl.g:5228:1: ( () )
            // InternalMyDsl.g:5229:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getNaturalExpressionAction_0()); 
            }
            // InternalMyDsl.g:5230:2: ()
            // InternalMyDsl.g:5230:3: 
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
    // InternalMyDsl.g:5238:1: rule__NaturalExpression__Group__1 : rule__NaturalExpression__Group__1__Impl ;
    public final void rule__NaturalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5242:1: ( rule__NaturalExpression__Group__1__Impl )
            // InternalMyDsl.g:5243:2: rule__NaturalExpression__Group__1__Impl
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
    // InternalMyDsl.g:5249:1: rule__NaturalExpression__Group__1__Impl : ( ( rule__NaturalExpression__ValueAssignment_1 ) ) ;
    public final void rule__NaturalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5253:1: ( ( ( rule__NaturalExpression__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:5254:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:5254:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            // InternalMyDsl.g:5255:2: ( rule__NaturalExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNaturalExpressionAccess().getValueAssignment_1()); 
            }
            // InternalMyDsl.g:5256:2: ( rule__NaturalExpression__ValueAssignment_1 )
            // InternalMyDsl.g:5256:3: rule__NaturalExpression__ValueAssignment_1
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
    // InternalMyDsl.g:5265:1: rule__Content__Group_0__0 : rule__Content__Group_0__0__Impl ;
    public final void rule__Content__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5269:1: ( rule__Content__Group_0__0__Impl )
            // InternalMyDsl.g:5270:2: rule__Content__Group_0__0__Impl
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
    // InternalMyDsl.g:5276:1: rule__Content__Group_0__0__Impl : ( ( rule__Content__Alternatives_0_0 ) ) ;
    public final void rule__Content__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5280:1: ( ( ( rule__Content__Alternatives_0_0 ) ) )
            // InternalMyDsl.g:5281:1: ( ( rule__Content__Alternatives_0_0 ) )
            {
            // InternalMyDsl.g:5281:1: ( ( rule__Content__Alternatives_0_0 ) )
            // InternalMyDsl.g:5282:2: ( rule__Content__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives_0_0()); 
            }
            // InternalMyDsl.g:5283:2: ( rule__Content__Alternatives_0_0 )
            // InternalMyDsl.g:5283:3: rule__Content__Alternatives_0_0
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
    // InternalMyDsl.g:5292:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5296:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5297:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5297:2: ( ruleExpression )
            // InternalMyDsl.g:5298:3: ruleExpression
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
    // InternalMyDsl.g:5307:1: rule__Expression__CAssignment_0_0_0 : ( ruleHeaderExpression ) ;
    public final void rule__Expression__CAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5311:1: ( ( ruleHeaderExpression ) )
            // InternalMyDsl.g:5312:2: ( ruleHeaderExpression )
            {
            // InternalMyDsl.g:5312:2: ( ruleHeaderExpression )
            // InternalMyDsl.g:5313:3: ruleHeaderExpression
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
    // InternalMyDsl.g:5322:1: rule__Expression__CAssignment_0_0_1 : ( ruleBreakLineExpression ) ;
    public final void rule__Expression__CAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5326:1: ( ( ruleBreakLineExpression ) )
            // InternalMyDsl.g:5327:2: ( ruleBreakLineExpression )
            {
            // InternalMyDsl.g:5327:2: ( ruleBreakLineExpression )
            // InternalMyDsl.g:5328:3: ruleBreakLineExpression
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
    // InternalMyDsl.g:5337:1: rule__Expression__CAssignment_0_0_2 : ( ruleRefExpression ) ;
    public final void rule__Expression__CAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5341:1: ( ( ruleRefExpression ) )
            // InternalMyDsl.g:5342:2: ( ruleRefExpression )
            {
            // InternalMyDsl.g:5342:2: ( ruleRefExpression )
            // InternalMyDsl.g:5343:3: ruleRefExpression
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
    // InternalMyDsl.g:5352:1: rule__Expression__CAssignment_0_0_3_0 : ( ruleHorizontalExpression ) ;
    public final void rule__Expression__CAssignment_0_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5356:1: ( ( ruleHorizontalExpression ) )
            // InternalMyDsl.g:5357:2: ( ruleHorizontalExpression )
            {
            // InternalMyDsl.g:5357:2: ( ruleHorizontalExpression )
            // InternalMyDsl.g:5358:3: ruleHorizontalExpression
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
    // InternalMyDsl.g:5367:1: rule__Expression__CAssignment_0_0_4_0 : ( ruleListExpression ) ;
    public final void rule__Expression__CAssignment_0_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5371:1: ( ( ruleListExpression ) )
            // InternalMyDsl.g:5372:2: ( ruleListExpression )
            {
            // InternalMyDsl.g:5372:2: ( ruleListExpression )
            // InternalMyDsl.g:5373:3: ruleListExpression
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
    // InternalMyDsl.g:5382:1: rule__Expression__CAssignment_1_0 : ( ruleTextExpression ) ;
    public final void rule__Expression__CAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5386:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5387:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5387:2: ( ruleTextExpression )
            // InternalMyDsl.g:5388:3: ruleTextExpression
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
    // InternalMyDsl.g:5397:1: rule__ListExpression__ContentUnorderedAssignment_0_1_2 : ( ruleTextExpression ) ;
    public final void rule__ListExpression__ContentUnorderedAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5401:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5402:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5402:2: ( ruleTextExpression )
            // InternalMyDsl.g:5403:3: ruleTextExpression
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
    // InternalMyDsl.g:5412:1: rule__ListExpression__ContentOrderedAssignment_1_3 : ( ruleTextExpression ) ;
    public final void rule__ListExpression__ContentOrderedAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5416:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5417:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5417:2: ( ruleTextExpression )
            // InternalMyDsl.g:5418:3: ruleTextExpression
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
    // InternalMyDsl.g:5427:1: rule__QuoteExpression__ContentAssignment_2 : ( ruleTextExpression ) ;
    public final void rule__QuoteExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5431:1: ( ( ruleTextExpression ) )
            // InternalMyDsl.g:5432:2: ( ruleTextExpression )
            {
            // InternalMyDsl.g:5432:2: ( ruleTextExpression )
            // InternalMyDsl.g:5433:3: ruleTextExpression
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
    // InternalMyDsl.g:5442:1: rule__TabExpression__HeaderAssignment_1_0_0 : ( ruleLineExpression ) ;
    public final void rule__TabExpression__HeaderAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5446:1: ( ( ruleLineExpression ) )
            // InternalMyDsl.g:5447:2: ( ruleLineExpression )
            {
            // InternalMyDsl.g:5447:2: ( ruleLineExpression )
            // InternalMyDsl.g:5448:3: ruleLineExpression
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
    // InternalMyDsl.g:5457:1: rule__TabExpression__LinesAssignment_1_0_3_0_1 : ( ruleLineExpression ) ;
    public final void rule__TabExpression__LinesAssignment_1_0_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5461:1: ( ( ruleLineExpression ) )
            // InternalMyDsl.g:5462:2: ( ruleLineExpression )
            {
            // InternalMyDsl.g:5462:2: ( ruleLineExpression )
            // InternalMyDsl.g:5463:3: ruleLineExpression
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
    // InternalMyDsl.g:5472:1: rule__LineExpression__CellsAssignment_1 : ( ruleNaturalExpression ) ;
    public final void rule__LineExpression__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5476:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5477:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5477:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5478:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5487:1: rule__LineExpression__CellsAssignment_2_1 : ( ruleNaturalExpression ) ;
    public final void rule__LineExpression__CellsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5491:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5492:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5492:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5493:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5502:1: rule__URLedExpression__CAssignment_1_0_0_0 : ( ruleImageExpression ) ;
    public final void rule__URLedExpression__CAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5506:1: ( ( ruleImageExpression ) )
            // InternalMyDsl.g:5507:2: ( ruleImageExpression )
            {
            // InternalMyDsl.g:5507:2: ( ruleImageExpression )
            // InternalMyDsl.g:5508:3: ruleImageExpression
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
    // InternalMyDsl.g:5517:1: rule__URLedExpression__CAssignment_1_0_0_1 : ( ruleVideoExpression ) ;
    public final void rule__URLedExpression__CAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5521:1: ( ( ruleVideoExpression ) )
            // InternalMyDsl.g:5522:2: ( ruleVideoExpression )
            {
            // InternalMyDsl.g:5522:2: ( ruleVideoExpression )
            // InternalMyDsl.g:5523:3: ruleVideoExpression
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
    // InternalMyDsl.g:5532:1: rule__URLedExpression__CAssignment_1_1 : ( ruleLinkExpression ) ;
    public final void rule__URLedExpression__CAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5536:1: ( ( ruleLinkExpression ) )
            // InternalMyDsl.g:5537:2: ( ruleLinkExpression )
            {
            // InternalMyDsl.g:5537:2: ( ruleLinkExpression )
            // InternalMyDsl.g:5538:3: ruleLinkExpression
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
    // InternalMyDsl.g:5547:1: rule__RefExpression__RefNameAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__RefExpression__RefNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5551:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5552:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5552:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5553:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5562:1: rule__RefExpression__RefContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__RefExpression__RefContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5566:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5567:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5567:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5568:3: ruleNaturalExpression
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


    // $ANTLR start "rule__LinkExpression__AltTextAssignment_0_2"
    // InternalMyDsl.g:5577:1: rule__LinkExpression__AltTextAssignment_0_2 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__AltTextAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5581:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5582:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5582:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5583:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__AltTextAssignment_0_2"


    // $ANTLR start "rule__LinkExpression__LinkContentAssignment_0_4"
    // InternalMyDsl.g:5592:1: rule__LinkExpression__LinkContentAssignment_0_4 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__LinkContentAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5596:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5597:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5597:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5598:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_0_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__LinkContentAssignment_0_4"


    // $ANTLR start "rule__LinkExpression__AltTextAssignment_1_1"
    // InternalMyDsl.g:5607:1: rule__LinkExpression__AltTextAssignment_1_1 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__AltTextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5611:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5612:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5612:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5613:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__AltTextAssignment_1_1"


    // $ANTLR start "rule__LinkExpression__RefNameAssignment_1_3"
    // InternalMyDsl.g:5622:1: rule__LinkExpression__RefNameAssignment_1_3 : ( ruleNaturalExpression ) ;
    public final void rule__LinkExpression__RefNameAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5626:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5627:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5627:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5628:3: ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLinkExpressionAccess().getRefNameNaturalExpressionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLinkExpressionAccess().getRefNameNaturalExpressionParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkExpression__RefNameAssignment_1_3"


    // $ANTLR start "rule__ImageExpression__AltTextAssignment_2"
    // InternalMyDsl.g:5637:1: rule__ImageExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__ImageExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5641:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5642:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5642:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5643:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5652:1: rule__ImageExpression__LinkContentAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__ImageExpression__LinkContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5656:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5657:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5657:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5658:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5667:1: rule__VideoExpression__AltTextAssignment_2 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5671:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5672:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5672:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5673:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5682:1: rule__VideoExpression__LinkImageAssignment_4 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__LinkImageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5686:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5687:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5687:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5688:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5697:1: rule__VideoExpression__LinkVideoAssignment_6 : ( ruleNaturalExpression ) ;
    public final void rule__VideoExpression__LinkVideoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5701:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5702:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5702:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5703:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5712:1: rule__Header1Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header1Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5716:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5717:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5717:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5718:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5727:1: rule__Header2Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header2Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5731:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5732:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5732:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5733:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5742:1: rule__Header3Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header3Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5746:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5747:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5747:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5748:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5757:1: rule__Header4Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header4Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5761:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5762:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5762:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5763:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5772:1: rule__Header5Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header5Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5776:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5777:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5777:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5778:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5787:1: rule__Header6Expression__TitleAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__Header6Expression__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5791:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5792:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5792:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5793:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5802:1: rule__EmphasisExpression__CAssignment_0_0_0 : ( ruleStrongExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5806:1: ( ( ruleStrongExpression ) )
            // InternalMyDsl.g:5807:2: ( ruleStrongExpression )
            {
            // InternalMyDsl.g:5807:2: ( ruleStrongExpression )
            // InternalMyDsl.g:5808:3: ruleStrongExpression
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
    // InternalMyDsl.g:5817:1: rule__EmphasisExpression__CAssignment_0_0_1 : ( ruleItalicExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5821:1: ( ( ruleItalicExpression ) )
            // InternalMyDsl.g:5822:2: ( ruleItalicExpression )
            {
            // InternalMyDsl.g:5822:2: ( ruleItalicExpression )
            // InternalMyDsl.g:5823:3: ruleItalicExpression
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
    // InternalMyDsl.g:5832:1: rule__EmphasisExpression__CAssignment_0_0_2 : ( ruleScratchExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5836:1: ( ( ruleScratchExpression ) )
            // InternalMyDsl.g:5837:2: ( ruleScratchExpression )
            {
            // InternalMyDsl.g:5837:2: ( ruleScratchExpression )
            // InternalMyDsl.g:5838:3: ruleScratchExpression
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
    // InternalMyDsl.g:5847:1: rule__EmphasisExpression__CAssignment_1 : ( ruleNaturalExpression ) ;
    public final void rule__EmphasisExpression__CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5851:1: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:5852:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:5852:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:5853:3: ruleNaturalExpression
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
    // InternalMyDsl.g:5862:1: rule__StrongExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__StrongExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5866:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5867:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5867:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5868:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5877:1: rule__ItalicExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__ItalicExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5881:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5882:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5882:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5883:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5892:1: rule__ScratchExpression__ContentAssignment_2 : ( ruleEmphasisExpression ) ;
    public final void rule__ScratchExpression__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5896:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:5897:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:5897:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:5898:3: ruleEmphasisExpression
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
    // InternalMyDsl.g:5907:1: rule__NaturalExpression__ValueAssignment_1 : ( ruleContent ) ;
    public final void rule__NaturalExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5911:1: ( ( ruleContent ) )
            // InternalMyDsl.g:5912:2: ( ruleContent )
            {
            // InternalMyDsl.g:5912:2: ( ruleContent )
            // InternalMyDsl.g:5913:3: ruleContent
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

    // $ANTLR start synpred33_InternalMyDsl
    public final void synpred33_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1332:3: ( RULE_BL )
        // InternalMyDsl.g:1332:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalMyDsl

    // $ANTLR start synpred34_InternalMyDsl
    public final void synpred34_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1386:3: ( RULE_BL )
        // InternalMyDsl.g:1386:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalMyDsl

    // $ANTLR start synpred35_InternalMyDsl
    public final void synpred35_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1440:3: ( RULE_BL )
        // InternalMyDsl.g:1440:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalMyDsl

    // $ANTLR start synpred36_InternalMyDsl
    public final void synpred36_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1527:4: ( rule__ListExpression__Group_0_1__0 )
        // InternalMyDsl.g:1527:4: rule__ListExpression__Group_0_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ListExpression__Group_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalMyDsl

    // $ANTLR start synpred38_InternalMyDsl
    public final void synpred38_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1643:3: ( RULE_BL )
        // InternalMyDsl.g:1643:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalMyDsl

    // $ANTLR start synpred40_InternalMyDsl
    public final void synpred40_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1785:3: ( RULE_BL )
        // InternalMyDsl.g:1785:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalMyDsl

    // $ANTLR start synpred41_InternalMyDsl
    public final void synpred41_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1873:4: ( rule__QuoteExpression__ContentAssignment_2 )
        // InternalMyDsl.g:1873:4: rule__QuoteExpression__ContentAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__QuoteExpression__ContentAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalMyDsl

    // $ANTLR start synpred42_InternalMyDsl
    public final void synpred42_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1900:3: ( RULE_BL )
        // InternalMyDsl.g:1900:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalMyDsl

    // $ANTLR start synpred43_InternalMyDsl
    public final void synpred43_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2095:4: ( '-' )
        // InternalMyDsl.g:2095:4: '-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalMyDsl

    // $ANTLR start synpred44_InternalMyDsl
    public final void synpred44_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2183:4: ( '_' )
        // InternalMyDsl.g:2183:4: '_'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalMyDsl

    // $ANTLR start synpred45_InternalMyDsl
    public final void synpred45_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2373:3: ( rule__TabExpression__Group_1_0_3__0 )
        // InternalMyDsl.g:2373:3: rule__TabExpression__Group_1_0_3__0
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
        // InternalMyDsl.g:2576:4: ( rule__TabSeparation__Group_3__0 )
        // InternalMyDsl.g:2576:4: rule__TabSeparation__Group_3__0
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
        // InternalMyDsl.g:2603:3: ( '|' )
        // InternalMyDsl.g:2603:3: '|'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalMyDsl

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2690:4: ( '-' )
        // InternalMyDsl.g:2690:4: '-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2719:3: ( '|' )
        // InternalMyDsl.g:2719:3: '|'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2773:3: ( rule__LineExpression__Group_2__0 )
        // InternalMyDsl.g:2773:3: rule__LineExpression__Group_2__0
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
        // InternalMyDsl.g:2799:3: ( '|' )
        // InternalMyDsl.g:2799:3: '|'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalMyDsl

    // $ANTLR start synpred54_InternalMyDsl
    public final void synpred54_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3070:3: ( rule__RefExpression__RefContentAssignment_4 )
        // InternalMyDsl.g:3070:3: rule__RefExpression__RefContentAssignment_4
        {
        pushFollow(FOLLOW_2);
        rule__RefExpression__RefContentAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalMyDsl

    // $ANTLR start synpred55_InternalMyDsl
    public final void synpred55_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3096:3: ( RULE_BL )
        // InternalMyDsl.g:3096:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalMyDsl

    // $ANTLR start synpred57_InternalMyDsl
    public final void synpred57_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3285:3: ( RULE_BL )
        // InternalMyDsl.g:3285:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalMyDsl

    // $ANTLR start synpred59_InternalMyDsl
    public final void synpred59_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3447:3: ( RULE_BL )
        // InternalMyDsl.g:3447:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalMyDsl

    // $ANTLR start synpred61_InternalMyDsl
    public final void synpred61_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3636:3: ( RULE_BL )
        // InternalMyDsl.g:3636:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalMyDsl

    // $ANTLR start synpred64_InternalMyDsl
    public final void synpred64_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3879:3: ( RULE_BL )
        // InternalMyDsl.g:3879:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalMyDsl

    // $ANTLR start synpred65_InternalMyDsl
    public final void synpred65_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3988:3: ( rule__Header1Expression__Group_3__0 )
        // InternalMyDsl.g:3988:3: rule__Header1Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header1Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalMyDsl

    // $ANTLR start synpred66_InternalMyDsl
    public final void synpred66_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4014:3: ( RULE_BL )
        // InternalMyDsl.g:4014:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalMyDsl

    // $ANTLR start synpred67_InternalMyDsl
    public final void synpred67_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4150:3: ( rule__Header2Expression__Group_3__0 )
        // InternalMyDsl.g:4150:3: rule__Header2Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header2Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalMyDsl

    // $ANTLR start synpred68_InternalMyDsl
    public final void synpred68_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4176:3: ( RULE_BL )
        // InternalMyDsl.g:4176:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalMyDsl

    // $ANTLR start synpred69_InternalMyDsl
    public final void synpred69_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4312:3: ( rule__Header3Expression__Group_3__0 )
        // InternalMyDsl.g:4312:3: rule__Header3Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header3Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalMyDsl

    // $ANTLR start synpred70_InternalMyDsl
    public final void synpred70_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4338:3: ( RULE_BL )
        // InternalMyDsl.g:4338:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalMyDsl

    // $ANTLR start synpred71_InternalMyDsl
    public final void synpred71_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4474:3: ( rule__Header4Expression__Group_3__0 )
        // InternalMyDsl.g:4474:3: rule__Header4Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header4Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalMyDsl

    // $ANTLR start synpred72_InternalMyDsl
    public final void synpred72_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4500:3: ( RULE_BL )
        // InternalMyDsl.g:4500:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalMyDsl

    // $ANTLR start synpred73_InternalMyDsl
    public final void synpred73_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4636:3: ( rule__Header5Expression__Group_3__0 )
        // InternalMyDsl.g:4636:3: rule__Header5Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header5Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalMyDsl

    // $ANTLR start synpred74_InternalMyDsl
    public final void synpred74_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4662:3: ( RULE_BL )
        // InternalMyDsl.g:4662:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalMyDsl

    // $ANTLR start synpred75_InternalMyDsl
    public final void synpred75_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4798:3: ( rule__Header6Expression__Group_3__0 )
        // InternalMyDsl.g:4798:3: rule__Header6Expression__Group_3__0
        {
        pushFollow(FOLLOW_2);
        rule__Header6Expression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalMyDsl

    // $ANTLR start synpred76_InternalMyDsl
    public final void synpred76_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4824:3: ( RULE_BL )
        // InternalMyDsl.g:4824:3: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_InternalMyDsl

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
    public final boolean synpred59_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalMyDsl_fragment(); // can never throw exception
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
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\1\31\uffff";
    static final String dfa_3s = "\1\4\11\uffff\1\0\1\uffff\1\0\1\uffff\1\0\2\uffff\5\0\1\uffff\2\0\1\uffff";
    static final String dfa_4s = "\1\46\11\uffff\1\0\1\uffff\1\0\1\uffff\1\0\2\uffff\5\0\1\uffff\2\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\27\uffff\1\1";
    static final String dfa_6s = "\12\uffff\1\0\1\uffff\1\1\1\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\22\1\23\1\16\1\1\5\uffff\1\14\1\12\1\1\1\24\1\21\1\25\1\uffff\3\1\5\uffff\2\1\1\uffff\6\1\1\27\1\30",
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
    static final String dfa_11s = "\1\46\1\uffff\1\22\3\46\1\uffff\7\32\1\46\1\0";
    static final String dfa_12s = "\1\uffff\1\1\4\uffff\1\2\11\uffff";
    static final String dfa_13s = "\17\uffff\1\0}>";
    static final String[] dfa_14s = {
            "\2\6\1\5\1\1\5\uffff\1\4\1\3\1\1\3\6\1\uffff\1\6\1\1\1\2\5\uffff\2\6\1\uffff\6\1\2\6",
            "",
            "\1\7\1\10\1\11\7\uffff\1\13\1\uffff\1\12\1\14\1\15",
            "\4\6\1\1\4\uffff\1\6\1\16\4\6\1\uffff\3\6\5\uffff\2\6\1\uffff\10\6",
            "\3\6\1\uffff\1\1\4\uffff\2\6\1\uffff\3\6\22\uffff\2\6",
            "\4\6\5\uffff\6\6\1\1\3\6\5\uffff\2\6\1\uffff\10\6",
            "",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\5\6\4\uffff\1\6\1\17\4\6\1\uffff\3\6\5\uffff\2\6\1\uffff\10\6",
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
    static final String dfa_18s = "\1\46\1\uffff\1\0\6\46\1\uffff\1\0\11\46\1\0";
    static final String dfa_19s = "\1\uffff\1\1\7\uffff\1\2\13\uffff";
    static final String dfa_20s = "\2\uffff\1\1\7\uffff\1\0\11\uffff\1\2}>";
    static final String[] dfa_21s = {
            "\1\3\1\4\1\5\6\uffff\1\11\1\7\1\uffff\1\6\1\2\1\10\1\uffff\1\1\1\uffff\1\1\5\uffff\2\1\7\uffff\2\11",
            "",
            "\1\uffff",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\3\11\1\13\5\uffff\4\11\1\12\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "",
            "\1\uffff",
            "\4\11\5\uffff\1\11\1\14\2\11\1\15\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\16\4\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\4\11\5\uffff\1\11\1\17\4\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\20\2\11\1\21\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\16\4\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\22\2\11\1\21\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\4\11\5\uffff\1\11\1\23\4\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\22\2\11\1\21\1\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
            "\5\11\4\uffff\1\11\1\24\4\11\1\uffff\3\11\5\uffff\2\11\1\uffff\10\11",
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
    static final String dfa_23s = "\1\46\15\uffff\1\0\13\uffff";
    static final String dfa_24s = "\16\uffff\1\0\13\uffff}>";
    static final String[] dfa_25s = {
            "\2\1\1\16\1\1\5\uffff\6\1\1\uffff\3\1\5\uffff\2\1\1\uffff\10\1",
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
    static final String dfa_26s = "\13\uffff";
    static final String dfa_27s = "\1\26\1\4\7\30\2\uffff";
    static final String dfa_28s = "\1\26\1\22\7\32\2\uffff";
    static final String dfa_29s = "\11\uffff\1\1\1\2";
    static final String dfa_30s = "\13\uffff}>";
    static final String[] dfa_31s = {
            "\1\1",
            "\1\2\1\3\1\4\7\uffff\1\6\1\uffff\1\5\1\7\1\10",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1026:1: rule__LinkExpression__Alternatives : ( ( ( rule__LinkExpression__Group_0__0 ) ) | ( ( rule__LinkExpression__Group_1__0 ) ) );";
        }
    }
    static final String dfa_32s = "\1\4\11\uffff\1\0\1\uffff\2\0\14\uffff";
    static final String dfa_33s = "\1\46\11\uffff\1\0\1\uffff\2\0\14\uffff";
    static final String dfa_34s = "\12\uffff\1\0\1\uffff\1\1\1\2\14\uffff}>";
    static final String[] dfa_35s = {
            "\4\1\5\uffff\1\14\1\12\1\15\3\1\1\uffff\3\1\5\uffff\2\1\1\uffff\10\1",
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
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_5;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()* loopback of 1527:3: ( rule__ListExpression__Group_0_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_13 = input.LA(1);

                         
                        int index22_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_36s = "\1\4\10\uffff\2\0\1\uffff\1\0\1\uffff\13\0\1\uffff";
    static final String dfa_37s = "\1\46\10\uffff\2\0\1\uffff\1\0\1\uffff\13\0\1\uffff";
    static final String dfa_38s = "\11\uffff\1\0\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff}>";
    static final String[] dfa_39s = {
            "\1\22\1\23\1\16\1\1\5\uffff\1\14\1\12\1\1\1\24\1\21\1\25\1\uffff\1\26\1\1\1\11\5\uffff\1\17\1\20\1\uffff\6\1\1\27\1\30",
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
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_5;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "()* loopback of 1873:3: ( rule__QuoteExpression__ContentAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_9 = input.LA(1);

                         
                        int index27_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_10 = input.LA(1);

                         
                        int index27_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_12 = input.LA(1);

                         
                        int index27_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_14 = input.LA(1);

                         
                        int index27_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_15 = input.LA(1);

                         
                        int index27_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_16 = input.LA(1);

                         
                        int index27_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_17 = input.LA(1);

                         
                        int index27_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_18 = input.LA(1);

                         
                        int index27_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_19 = input.LA(1);

                         
                        int index27_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_20 = input.LA(1);

                         
                        int index27_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_21 = input.LA(1);

                         
                        int index27_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_21);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_22 = input.LA(1);

                         
                        int index27_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_22);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_23 = input.LA(1);

                         
                        int index27_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_23);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_24 = input.LA(1);

                         
                        int index27_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\1\1\1\uffff\1\1\10\uffff";
    static final String dfa_41s = "\1\4\1\uffff\1\4\7\0\1\uffff";
    static final String dfa_42s = "\1\46\1\uffff\1\46\7\0\1\uffff";
    static final String dfa_43s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_44s = "\3\uffff\1\4\1\3\1\2\1\0\1\5\1\6\1\1\1\uffff}>";
    static final String[] dfa_45s = {
            "\3\1\1\2\5\uffff\6\1\1\uffff\3\1\5\uffff\2\1\1\uffff\10\1",
            "",
            "\1\6\1\7\1\4\1\1\5\uffff\1\1\1\3\1\1\1\10\1\5\1\11\1\uffff\3\1\5\uffff\2\1\1\uffff\10\1",
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

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_26;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "()* loopback of 2373:2: ( rule__TabExpression__Group_1_0_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_8);
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
    static final String dfa_46s = "\2\2\11\uffff";
    static final String dfa_47s = "\2\4\1\uffff\7\0\1\uffff";
    static final String dfa_48s = "\2\46\1\uffff\7\0\1\uffff";
    static final String dfa_49s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_50s = "\3\uffff\1\1\1\5\1\0\1\3\1\2\1\6\1\4\1\uffff}>";
    static final String[] dfa_51s = {
            "\4\2\5\uffff\4\2\1\1\1\2\1\uffff\3\2\5\uffff\2\2\1\uffff\10\2",
            "\1\6\1\7\1\4\1\2\5\uffff\1\2\1\3\1\2\1\10\1\5\1\11\1\uffff\3\2\5\uffff\2\2\1\uffff\10\2",
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
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_26;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "()* loopback of 2773:2: ( rule__LineExpression__Group_2__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_8);
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
    static final String dfa_52s = "\12\uffff";
    static final String dfa_53s = "\1\10\11\uffff";
    static final String dfa_54s = "\1\4\7\0\2\uffff";
    static final String dfa_55s = "\1\46\7\0\2\uffff";
    static final String dfa_56s = "\10\uffff\1\2\1\1";
    static final String dfa_57s = "\1\uffff\1\1\1\5\1\0\1\3\1\6\1\4\1\2\2\uffff}>";
    static final String[] dfa_58s = {
            "\1\1\1\2\1\3\1\10\5\uffff\1\10\1\5\1\10\1\4\1\6\1\7\1\uffff\3\10\5\uffff\2\10\1\uffff\10\10",
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

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_52;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "3070:2: ( rule__RefExpression__RefContentAssignment_4 )?";
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
                        if ( (synpred54_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_7 = input.LA(1);

                         
                        int index40_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_4 = input.LA(1);

                         
                        int index40_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_6 = input.LA(1);

                         
                        int index40_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalMyDsl()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA40_5 = input.LA(1);

                         
                        int index40_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalMyDsl()) ) {s = 9;}

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
    static final String dfa_59s = "\1\4\2\uffff\1\0\26\uffff";
    static final String dfa_60s = "\1\46\2\uffff\1\0\26\uffff";
    static final String dfa_61s = "\3\uffff\1\0\26\uffff}>";
    static final String[] dfa_62s = {
            "\4\1\5\uffff\6\1\1\uffff\3\1\5\uffff\2\1\1\uffff\1\3\7\1",
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
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[][] dfa_62 = unpackEncodedStringArray(dfa_62s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_5;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "()* loopback of 3988:2: ( rule__Header1Expression__Group_3__0 )*";
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
                        if ( (synpred65_InternalMyDsl()) ) {s = 25;}

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
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_5;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "()* loopback of 4150:2: ( rule__Header2Expression__Group_3__0 )*";
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
                        if ( (synpred67_InternalMyDsl()) ) {s = 25;}

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
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_5;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "()* loopback of 4312:2: ( rule__Header3Expression__Group_3__0 )*";
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
                        if ( (synpred69_InternalMyDsl()) ) {s = 25;}

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
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_5;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "()* loopback of 4474:2: ( rule__Header4Expression__Group_3__0 )*";
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
                        if ( (synpred71_InternalMyDsl()) ) {s = 25;}

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
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_5;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "()* loopback of 4636:2: ( rule__Header5Expression__Group_3__0 )*";
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
                        if ( (synpred73_InternalMyDsl()) ) {s = 25;}

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

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_5;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "()* loopback of 4798:2: ( rule__Header6Expression__Group_3__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_3 = input.LA(1);

                         
                        int index61_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index61_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000006000076072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007FB077E0F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000007FB077E0F2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000006030576070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006000076070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000060000760F0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006002076070L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006008076070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006040076070L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000000000L});

}