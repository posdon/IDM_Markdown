package markHammil.mm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import markHammil.mm.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_WS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_ANY_OTHER", "'true'", "'*'", "'-'", "'+'", "'.'", "'>'", "'['", "']('", "')'", "'!['", "'[!['", "')]('", "'|'", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'~~'", "'\\''", "'\"'"
    };
    public static final int RULE_STRING=8;
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
    public static final int RULE_ID=7;
    public static final int RULE_WS=5;
    public static final int RULE_DIGIT=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_BL=4;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "File";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFile"
    // InternalMyDsl.g:64:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleFile= ruleFile EOF )
            // InternalMyDsl.g:65:2: iv_ruleFile= ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalMyDsl.g:71:1: ruleFile returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleExpression ) )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () ( (lv_expression_1_0= ruleExpression ) )* ) )
            // InternalMyDsl.g:78:2: ( () ( (lv_expression_1_0= ruleExpression ) )* )
            {
            // InternalMyDsl.g:78:2: ( () ( (lv_expression_1_0= ruleExpression ) )* )
            // InternalMyDsl.g:79:3: () ( (lv_expression_1_0= ruleExpression ) )*
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFileAccess().getFileAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:86:3: ( (lv_expression_1_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||(LA1_0>=13 && LA1_0<=16)||(LA1_0>=18 && LA1_0<=19)||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=25 && LA1_0<=35)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:87:4: (lv_expression_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:87:4: (lv_expression_1_0= ruleExpression )
            	    // InternalMyDsl.g:88:5: lv_expression_1_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_expression_1_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFileRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expression",
            	      						lv_expression_1_0,
            	      						"markHammil.mm.MyDsl.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:109:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:109:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:110:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:116:1: ruleExpression returns [EObject current=null] : ( ( ( ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression ) | this_BreakLineExpression_1= ruleBreakLineExpression | (this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ) | (this_TextExpression_4= ruleTextExpression ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_3=null;
        Token this_BL_5=null;
        EObject this_HeaderExpression_0 = null;

        EObject this_BreakLineExpression_1 = null;

        EObject this_ListExpression_2 = null;

        EObject this_TextExpression_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:122:2: ( ( ( ( ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression ) | this_BreakLineExpression_1= ruleBreakLineExpression | (this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ) | (this_TextExpression_4= ruleTextExpression ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) ) )
            // InternalMyDsl.g:123:2: ( ( ( ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression ) | this_BreakLineExpression_1= ruleBreakLineExpression | (this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ) | (this_TextExpression_4= ruleTextExpression ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) )
            {
            // InternalMyDsl.g:123:2: ( ( ( ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression ) | this_BreakLineExpression_1= ruleBreakLineExpression | (this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ) | (this_TextExpression_4= ruleTextExpression ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:124:3: ( ( ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression ) | this_BreakLineExpression_1= ruleBreakLineExpression | (this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) )
                    {
                    // InternalMyDsl.g:124:3: ( ( ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression ) | this_BreakLineExpression_1= ruleBreakLineExpression | (this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) )
                    int alt3=3;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==26) && (synpred1_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==27) && (synpred1_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==28) && (synpred1_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==29) && (synpred1_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==30) && (synpred1_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==31) && (synpred1_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==13) ) {
                        alt3=2;
                    }
                    else if ( (LA3_0==RULE_INT||(LA3_0>=14 && LA3_0<=16)) ) {
                        alt3=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalMyDsl.g:125:4: ( ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression )
                            {
                            // InternalMyDsl.g:125:4: ( ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression )
                            // InternalMyDsl.g:126:5: ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpressionAccess().getHeaderExpressionParserRuleCall_0_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderExpression_0=ruleHeaderExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_HeaderExpression_0;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:137:4: this_BreakLineExpression_1= ruleBreakLineExpression
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getExpressionAccess().getBreakLineExpressionParserRuleCall_0_1());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_BreakLineExpression_1=ruleBreakLineExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_BreakLineExpression_1;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:146:4: (this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
                            {
                            // InternalMyDsl.g:146:4: (this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
                            // InternalMyDsl.g:147:5: this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )?
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpressionAccess().getListExpressionParserRuleCall_0_2_0());
                              				
                            }
                            pushFollow(FOLLOW_4);
                            this_ListExpression_2=ruleListExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_ListExpression_2;
                              					afterParserOrEnumRuleCall();
                              				
                            }
                            // InternalMyDsl.g:155:5: ( ( RULE_BL )=>this_BL_3= RULE_BL )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==RULE_BL) && (synpred2_InternalMyDsl())) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // InternalMyDsl.g:156:6: ( RULE_BL )=>this_BL_3= RULE_BL
                                    {
                                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(this_BL_3, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_2_1());
                                      					
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:165:3: (this_TextExpression_4= ruleTextExpression ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
                    {
                    // InternalMyDsl.g:165:3: (this_TextExpression_4= ruleTextExpression ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
                    // InternalMyDsl.g:166:4: this_TextExpression_4= ruleTextExpression ( ( RULE_BL )=>this_BL_5= RULE_BL )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getTextExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_TextExpression_4=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TextExpression_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:174:4: ( ( RULE_BL )=>this_BL_5= RULE_BL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_BL) && (synpred3_InternalMyDsl())) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:175:5: ( RULE_BL )=>this_BL_5= RULE_BL
                            {
                            this_BL_5=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_5, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBreakLineExpression"
    // InternalMyDsl.g:186:1: entryRuleBreakLineExpression returns [EObject current=null] : iv_ruleBreakLineExpression= ruleBreakLineExpression EOF ;
    public final EObject entryRuleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakLineExpression = null;


        try {
            // InternalMyDsl.g:186:60: (iv_ruleBreakLineExpression= ruleBreakLineExpression EOF )
            // InternalMyDsl.g:187:2: iv_ruleBreakLineExpression= ruleBreakLineExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakLineExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakLineExpression=ruleBreakLineExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakLineExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakLineExpression"


    // $ANTLR start "ruleBreakLineExpression"
    // InternalMyDsl.g:193:1: ruleBreakLineExpression returns [EObject current=null] : ( () ( (lv_isBR_1_0= 'true' ) ) this_BL_2= RULE_BL ) ;
    public final EObject ruleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isBR_1_0=null;
        Token this_BL_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:199:2: ( ( () ( (lv_isBR_1_0= 'true' ) ) this_BL_2= RULE_BL ) )
            // InternalMyDsl.g:200:2: ( () ( (lv_isBR_1_0= 'true' ) ) this_BL_2= RULE_BL )
            {
            // InternalMyDsl.g:200:2: ( () ( (lv_isBR_1_0= 'true' ) ) this_BL_2= RULE_BL )
            // InternalMyDsl.g:201:3: () ( (lv_isBR_1_0= 'true' ) ) this_BL_2= RULE_BL
            {
            // InternalMyDsl.g:201:3: ()
            // InternalMyDsl.g:202:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionBAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:208:3: ( (lv_isBR_1_0= 'true' ) )
            // InternalMyDsl.g:209:4: (lv_isBR_1_0= 'true' )
            {
            // InternalMyDsl.g:209:4: (lv_isBR_1_0= 'true' )
            // InternalMyDsl.g:210:5: lv_isBR_1_0= 'true'
            {
            lv_isBR_1_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isBR_1_0, grammarAccess.getBreakLineExpressionAccess().getIsBRTrueKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBreakLineExpressionRule());
              					}
              					setWithLastConsumed(current, "isBR", true, "true");
              				
            }

            }


            }

            this_BL_2=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BL_2, grammarAccess.getBreakLineExpressionAccess().getBLTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakLineExpression"


    // $ANTLR start "entryRuleTextExpression"
    // InternalMyDsl.g:230:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:232:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalMyDsl.g:233:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalMyDsl.g:242:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;

        EObject lv_c_4_0 = null;

        EObject lv_c_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:249:2: ( ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) ) )
            // InternalMyDsl.g:250:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) )
            {
            // InternalMyDsl.g:250:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:251:3: ( (lv_c_0_0= ruleEmphasisExpression ) )
                    {
                    // InternalMyDsl.g:251:3: ( (lv_c_0_0= ruleEmphasisExpression ) )
                    // InternalMyDsl.g:252:4: (lv_c_0_0= ruleEmphasisExpression )
                    {
                    // InternalMyDsl.g:252:4: (lv_c_0_0= ruleEmphasisExpression )
                    // InternalMyDsl.g:253:5: lv_c_0_0= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTextExpressionAccess().getCEmphasisExpressionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_c_0_0=ruleEmphasisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                      					}
                      					set(
                      						current,
                      						"c",
                      						lv_c_0_0,
                      						"markHammil.mm.MyDsl.EmphasisExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:271:3: ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) )
                    {
                    // InternalMyDsl.g:271:3: ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) )
                    // InternalMyDsl.g:272:4: ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) )
                    {
                    // InternalMyDsl.g:314:4: ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) )
                    int alt7=3;
                    switch ( input.LA(1) ) {
                    case 18:
                        {
                        alt7=1;
                        }
                        break;
                    case RULE_INT:
                    case RULE_ID:
                    case RULE_STRING:
                    case 15:
                    case 25:
                    case 34:
                    case 35:
                        {
                        alt7=2;
                        }
                        break;
                    case 19:
                    case 22:
                    case 23:
                        {
                        alt7=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }

                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:315:5: ( (lv_c_1_0= ruleQuoteExpression ) )
                            {
                            // InternalMyDsl.g:315:5: ( (lv_c_1_0= ruleQuoteExpression ) )
                            // InternalMyDsl.g:316:6: (lv_c_1_0= ruleQuoteExpression )
                            {
                            // InternalMyDsl.g:316:6: (lv_c_1_0= ruleQuoteExpression )
                            // InternalMyDsl.g:317:7: lv_c_1_0= ruleQuoteExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTextExpressionAccess().getCQuoteExpressionParserRuleCall_1_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_c_1_0=ruleQuoteExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                              							}
                              							set(
                              								current,
                              								"c",
                              								lv_c_1_0,
                              								"markHammil.mm.MyDsl.QuoteExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:335:5: ( (lv_c_2_0= ruleTabExpression ) )
                            {
                            // InternalMyDsl.g:335:5: ( (lv_c_2_0= ruleTabExpression ) )
                            // InternalMyDsl.g:336:6: (lv_c_2_0= ruleTabExpression )
                            {
                            // InternalMyDsl.g:336:6: (lv_c_2_0= ruleTabExpression )
                            // InternalMyDsl.g:337:7: lv_c_2_0= ruleTabExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTextExpressionAccess().getCTabExpressionParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_c_2_0=ruleTabExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                              							}
                              							set(
                              								current,
                              								"c",
                              								lv_c_2_0,
                              								"markHammil.mm.MyDsl.TabExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:355:5: ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) )
                            {
                            // InternalMyDsl.g:355:5: ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) )
                            int alt6=3;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==19) ) {
                                alt6=1;
                            }
                            else if ( (LA6_0==22) && (synpred7_InternalMyDsl())) {
                                alt6=2;
                            }
                            else if ( (LA6_0==23) && (synpred8_InternalMyDsl())) {
                                alt6=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 0, input);

                                throw nvae;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalMyDsl.g:356:6: ( (lv_c_3_0= ruleLinkExpression ) )
                                    {
                                    // InternalMyDsl.g:356:6: ( (lv_c_3_0= ruleLinkExpression ) )
                                    // InternalMyDsl.g:357:7: (lv_c_3_0= ruleLinkExpression )
                                    {
                                    // InternalMyDsl.g:357:7: (lv_c_3_0= ruleLinkExpression )
                                    // InternalMyDsl.g:358:8: lv_c_3_0= ruleLinkExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getTextExpressionAccess().getCLinkExpressionParserRuleCall_1_0_2_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_c_3_0=ruleLinkExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                                      								}
                                      								set(
                                      									current,
                                      									"c",
                                      									lv_c_3_0,
                                      									"markHammil.mm.MyDsl.LinkExpression");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:376:6: ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) )
                                    {
                                    // InternalMyDsl.g:376:6: ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) )
                                    // InternalMyDsl.g:377:7: ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression )
                                    {
                                    // InternalMyDsl.g:381:7: (lv_c_4_0= ruleImageExpression )
                                    // InternalMyDsl.g:382:8: lv_c_4_0= ruleImageExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getTextExpressionAccess().getCImageExpressionParserRuleCall_1_0_2_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_c_4_0=ruleImageExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                                      								}
                                      								set(
                                      									current,
                                      									"c",
                                      									lv_c_4_0,
                                      									"markHammil.mm.MyDsl.ImageExpression");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // InternalMyDsl.g:400:6: ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) )
                                    {
                                    // InternalMyDsl.g:400:6: ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) )
                                    // InternalMyDsl.g:401:7: ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression )
                                    {
                                    // InternalMyDsl.g:405:7: (lv_c_5_0= ruleVideoExpression )
                                    // InternalMyDsl.g:406:8: lv_c_5_0= ruleVideoExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getTextExpressionAccess().getCVideoExpressionParserRuleCall_1_0_2_2_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_c_5_0=ruleVideoExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                                      								}
                                      								set(
                                      									current,
                                      									"c",
                                      									lv_c_5_0,
                                      									"markHammil.mm.MyDsl.VideoExpression");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleListExpression"
    // InternalMyDsl.g:433:1: entryRuleListExpression returns [EObject current=null] : iv_ruleListExpression= ruleListExpression EOF ;
    public final EObject entryRuleListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:435:2: (iv_ruleListExpression= ruleListExpression EOF )
            // InternalMyDsl.g:436:2: iv_ruleListExpression= ruleListExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListExpression=ruleListExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleListExpression"


    // $ANTLR start "ruleListExpression"
    // InternalMyDsl.g:445:1: ruleListExpression returns [EObject current=null] : ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )* ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ ) ;
    public final EObject ruleListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        Token this_BL_6=null;
        Token this_INT_7=null;
        Token otherlv_8=null;
        Token this_WS_9=null;
        Token this_BL_11=null;
        EObject lv_contentUnordered_5_0 = null;

        EObject lv_contentOrdered_10_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:452:2: ( ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )* ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ ) )
            // InternalMyDsl.g:453:2: ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )* ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ )
            {
            // InternalMyDsl.g:453:2: ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )* ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=14 && LA16_0<=16)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_INT) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:454:3: ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )* ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ )
                    {
                    // InternalMyDsl.g:454:3: ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )* ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ )
                    // InternalMyDsl.g:455:4: () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )* ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+
                    {
                    // InternalMyDsl.g:455:4: ()
                    // InternalMyDsl.g:456:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getListExpressionAccess().getTextExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyDsl.g:462:4: ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )* ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case 14:
                            {
                            alt12=1;
                            }
                            break;
                        case 15:
                            {
                            alt12=1;
                            }
                            break;
                        case 16:
                            {
                            alt12=1;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:463:5: (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )* ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    	    {
                    	    // InternalMyDsl.g:463:5: (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' )
                    	    int alt9=3;
                    	    switch ( input.LA(1) ) {
                    	    case 14:
                    	        {
                    	        alt9=1;
                    	        }
                    	        break;
                    	    case 15:
                    	        {
                    	        alt9=2;
                    	        }
                    	        break;
                    	    case 16:
                    	        {
                    	        alt9=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalMyDsl.g:464:6: otherlv_1= '*'
                    	            {
                    	            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_1, grammarAccess.getListExpressionAccess().getAsteriskKeyword_0_1_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDsl.g:469:6: otherlv_2= '-'
                    	            {
                    	            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_2, grammarAccess.getListExpressionAccess().getHyphenMinusKeyword_0_1_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalMyDsl.g:474:6: otherlv_3= '+'
                    	            {
                    	            otherlv_3=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_3, grammarAccess.getListExpressionAccess().getPlusSignKeyword_0_1_0_2());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalMyDsl.g:479:5: (this_WS_4= RULE_WS )*
                    	    loop10:
                    	    do {
                    	        int alt10=2;
                    	        int LA10_0 = input.LA(1);

                    	        if ( (LA10_0==RULE_WS) ) {
                    	            alt10=1;
                    	        }


                    	        switch (alt10) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:480:6: this_WS_4= RULE_WS
                    	    	    {
                    	    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(this_WS_4, grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1());
                    	    	      					
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop10;
                    	        }
                    	    } while (true);

                    	    // InternalMyDsl.g:485:5: ( (lv_contentUnordered_5_0= ruleTextExpression ) )
                    	    // InternalMyDsl.g:486:6: (lv_contentUnordered_5_0= ruleTextExpression )
                    	    {
                    	    // InternalMyDsl.g:486:6: (lv_contentUnordered_5_0= ruleTextExpression )
                    	    // InternalMyDsl.g:487:7: lv_contentUnordered_5_0= ruleTextExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListExpressionAccess().getContentUnorderedTextExpressionParserRuleCall_0_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_contentUnordered_5_0=ruleTextExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getListExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"contentUnordered",
                    	      								lv_contentUnordered_5_0,
                    	      								"markHammil.mm.MyDsl.TextExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalMyDsl.g:504:5: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==RULE_BL) ) {
                    	        int LA11_1 = input.LA(2);

                    	        if ( (synpred9_InternalMyDsl()) ) {
                    	            alt11=1;
                    	        }
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // InternalMyDsl.g:505:6: ( RULE_BL )=>this_BL_6= RULE_BL
                    	            {
                    	            this_BL_6=(Token)match(input,RULE_BL,FOLLOW_8); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_BL_6, grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_0_1_3());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:514:3: (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+
                    {
                    // InternalMyDsl.g:514:3: (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_INT) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:515:4: this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )?
                    	    {
                    	    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(this_INT_7, grammarAccess.getListExpressionAccess().getINTTerminalRuleCall_1_0());
                    	      			
                    	    }
                    	    otherlv_8=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(otherlv_8, grammarAccess.getListExpressionAccess().getFullStopKeyword_1_1());
                    	      			
                    	    }
                    	    // InternalMyDsl.g:523:4: (this_WS_9= RULE_WS )*
                    	    loop13:
                    	    do {
                    	        int alt13=2;
                    	        int LA13_0 = input.LA(1);

                    	        if ( (LA13_0==RULE_WS) ) {
                    	            alt13=1;
                    	        }


                    	        switch (alt13) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:524:5: this_WS_9= RULE_WS
                    	    	    {
                    	    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      					newLeafNode(this_WS_9, grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2());
                    	    	      				
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop13;
                    	        }
                    	    } while (true);

                    	    // InternalMyDsl.g:529:4: ( (lv_contentOrdered_10_0= ruleTextExpression ) )
                    	    // InternalMyDsl.g:530:5: (lv_contentOrdered_10_0= ruleTextExpression )
                    	    {
                    	    // InternalMyDsl.g:530:5: (lv_contentOrdered_10_0= ruleTextExpression )
                    	    // InternalMyDsl.g:531:6: lv_contentOrdered_10_0= ruleTextExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getListExpressionAccess().getContentOrderedTextExpressionParserRuleCall_1_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_contentOrdered_10_0=ruleTextExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getListExpressionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"contentOrdered",
                    	      							lv_contentOrdered_10_0,
                    	      							"markHammil.mm.MyDsl.TextExpression");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }

                    	    // InternalMyDsl.g:548:4: ( ( RULE_BL )=>this_BL_11= RULE_BL )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==RULE_BL) ) {
                    	        int LA14_1 = input.LA(2);

                    	        if ( (synpred10_InternalMyDsl()) ) {
                    	            alt14=1;
                    	        }
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // InternalMyDsl.g:549:5: ( RULE_BL )=>this_BL_11= RULE_BL
                    	            {
                    	            this_BL_11=(Token)match(input,RULE_BL,FOLLOW_11); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              					newLeafNode(this_BL_11, grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_1_4());
                    	              				
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleListExpression"


    // $ANTLR start "entryRuleQuoteExpression"
    // InternalMyDsl.g:563:1: entryRuleQuoteExpression returns [EObject current=null] : iv_ruleQuoteExpression= ruleQuoteExpression EOF ;
    public final EObject entryRuleQuoteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuoteExpression = null;


        try {
            // InternalMyDsl.g:563:56: (iv_ruleQuoteExpression= ruleQuoteExpression EOF )
            // InternalMyDsl.g:564:2: iv_ruleQuoteExpression= ruleQuoteExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuoteExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuoteExpression=ruleQuoteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuoteExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuoteExpression"


    // $ANTLR start "ruleQuoteExpression"
    // InternalMyDsl.g:570:1: ruleQuoteExpression returns [EObject current=null] : ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ;
    public final EObject ruleQuoteExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BL_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:576:2: ( ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) )
            // InternalMyDsl.g:577:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            {
            // InternalMyDsl.g:577:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            // InternalMyDsl.g:578:3: () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            {
            // InternalMyDsl.g:578:3: ()
            // InternalMyDsl.g:579:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQuoteExpressionAccess().getTextExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:585:3: ( ( '>' )=>otherlv_1= '>' )
            // InternalMyDsl.g:586:4: ( '>' )=>otherlv_1= '>'
            {
            otherlv_1=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:592:3: ( (lv_content_2_0= ruleTextExpression ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:593:4: (lv_content_2_0= ruleTextExpression )
            	    {
            	    // InternalMyDsl.g:593:4: (lv_content_2_0= ruleTextExpression )
            	    // InternalMyDsl.g:594:5: lv_content_2_0= ruleTextExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getQuoteExpressionAccess().getContentTextExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_content_2_0=ruleTextExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getQuoteExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"content",
            	      						lv_content_2_0,
            	      						"markHammil.mm.MyDsl.TextExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // InternalMyDsl.g:611:3: ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred12_InternalMyDsl()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:612:4: ( RULE_BL )=>this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_3, grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuoteExpression"


    // $ANTLR start "entryRuleLinkExpression"
    // InternalMyDsl.g:622:1: entryRuleLinkExpression returns [EObject current=null] : iv_ruleLinkExpression= ruleLinkExpression EOF ;
    public final EObject entryRuleLinkExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkExpression = null;


        try {
            // InternalMyDsl.g:622:55: (iv_ruleLinkExpression= ruleLinkExpression EOF )
            // InternalMyDsl.g:623:2: iv_ruleLinkExpression= ruleLinkExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLinkExpression=ruleLinkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLinkExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkExpression"


    // $ANTLR start "ruleLinkExpression"
    // InternalMyDsl.g:629:1: ruleLinkExpression returns [EObject current=null] : ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ;
    public final EObject ruleLinkExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_BL_6=null;
        EObject lv_altText_2_0 = null;

        EObject lv_linkContent_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:635:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
            // InternalMyDsl.g:636:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            {
            // InternalMyDsl.g:636:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            // InternalMyDsl.g:637:3: () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            {
            // InternalMyDsl.g:637:3: ()
            // InternalMyDsl.g:638:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:644:3: ( ( '[' )=>otherlv_1= '[' )
            // InternalMyDsl.g:645:4: ( '[' )=>otherlv_1= '['
            {
            otherlv_1=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:651:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:652:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:652:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:653:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_altText_2_0=ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLinkExpressionRule());
              					}
              					set(
              						current,
              						"altText",
              						lv_altText_2_0,
              						"markHammil.mm.MyDsl.NaturalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:670:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:671:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:677:3: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_INT && LA19_0<=RULE_STRING)||LA19_0==15||LA19_0==25||(LA19_0>=34 && LA19_0<=35)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:678:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:678:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:679:5: lv_linkContent_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLinkExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_linkContent_4_0=ruleNaturalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLinkExpressionRule());
                      					}
                      					set(
                      						current,
                      						"linkContent",
                      						lv_linkContent_4_0,
                      						"markHammil.mm.MyDsl.NaturalExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:696:3: ( ( ')' )=>otherlv_5= ')' )
            // InternalMyDsl.g:697:4: ( ')' )=>otherlv_5= ')'
            {
            otherlv_5=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:703:3: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred16_InternalMyDsl()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:704:4: ( RULE_BL )=>this_BL_6= RULE_BL
                    {
                    this_BL_6=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_6, grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_6());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkExpression"


    // $ANTLR start "entryRuleImageExpression"
    // InternalMyDsl.g:714:1: entryRuleImageExpression returns [EObject current=null] : iv_ruleImageExpression= ruleImageExpression EOF ;
    public final EObject entryRuleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageExpression = null;


        try {
            // InternalMyDsl.g:714:56: (iv_ruleImageExpression= ruleImageExpression EOF )
            // InternalMyDsl.g:715:2: iv_ruleImageExpression= ruleImageExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImageExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImageExpression=ruleImageExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImageExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageExpression"


    // $ANTLR start "ruleImageExpression"
    // InternalMyDsl.g:721:1: ruleImageExpression returns [EObject current=null] : ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ;
    public final EObject ruleImageExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_BL_6=null;
        EObject lv_altText_2_0 = null;

        EObject lv_linkContent_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:727:2: ( ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
            // InternalMyDsl.g:728:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            {
            // InternalMyDsl.g:728:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            // InternalMyDsl.g:729:3: () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            {
            // InternalMyDsl.g:729:3: ()
            // InternalMyDsl.g:730:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getImageExpressionAccess().getImageExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:736:3: ( ( '![' )=>otherlv_1= '![' )
            // InternalMyDsl.g:737:4: ( '![' )=>otherlv_1= '!['
            {
            otherlv_1=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:743:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:744:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:744:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:745:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImageExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_altText_2_0=ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImageExpressionRule());
              					}
              					set(
              						current,
              						"altText",
              						lv_altText_2_0,
              						"markHammil.mm.MyDsl.NaturalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:762:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:763:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:769:3: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)||LA21_0==15||LA21_0==25||(LA21_0>=34 && LA21_0<=35)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:770:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:770:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:771:5: lv_linkContent_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImageExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_linkContent_4_0=ruleNaturalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getImageExpressionRule());
                      					}
                      					set(
                      						current,
                      						"linkContent",
                      						lv_linkContent_4_0,
                      						"markHammil.mm.MyDsl.NaturalExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:788:3: ( ( ')' )=>otherlv_5= ')' )
            // InternalMyDsl.g:789:4: ( ')' )=>otherlv_5= ')'
            {
            otherlv_5=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:795:3: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BL) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred20_InternalMyDsl()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:796:4: ( RULE_BL )=>this_BL_6= RULE_BL
                    {
                    this_BL_6=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_6, grammarAccess.getImageExpressionAccess().getBLTerminalRuleCall_6());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageExpression"


    // $ANTLR start "entryRuleVideoExpression"
    // InternalMyDsl.g:806:1: entryRuleVideoExpression returns [EObject current=null] : iv_ruleVideoExpression= ruleVideoExpression EOF ;
    public final EObject entryRuleVideoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoExpression = null;


        try {
            // InternalMyDsl.g:806:56: (iv_ruleVideoExpression= ruleVideoExpression EOF )
            // InternalMyDsl.g:807:2: iv_ruleVideoExpression= ruleVideoExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVideoExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVideoExpression=ruleVideoExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVideoExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoExpression"


    // $ANTLR start "ruleVideoExpression"
    // InternalMyDsl.g:813:1: ruleVideoExpression returns [EObject current=null] : ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) ;
    public final EObject ruleVideoExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_BL_8=null;
        EObject lv_altText_2_0 = null;

        EObject lv_linkImage_4_0 = null;

        EObject lv_linkVideo_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:819:2: ( ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) )
            // InternalMyDsl.g:820:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            {
            // InternalMyDsl.g:820:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            // InternalMyDsl.g:821:3: () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            {
            // InternalMyDsl.g:821:3: ()
            // InternalMyDsl.g:822:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:828:3: ( ( '[![' )=>otherlv_1= '[![' )
            // InternalMyDsl.g:829:4: ( '[![' )=>otherlv_1= '[!['
            {
            otherlv_1=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:835:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:836:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:836:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:837:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVideoExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_altText_2_0=ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVideoExpressionRule());
              					}
              					set(
              						current,
              						"altText",
              						lv_altText_2_0,
              						"markHammil.mm.MyDsl.NaturalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:854:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:855:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:861:3: ( (lv_linkImage_4_0= ruleNaturalExpression ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_INT && LA23_0<=RULE_STRING)||LA23_0==15||LA23_0==25||(LA23_0>=34 && LA23_0<=35)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:862:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:862:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:863:5: lv_linkImage_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkImageNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_linkImage_4_0=ruleNaturalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVideoExpressionRule());
                      					}
                      					set(
                      						current,
                      						"linkImage",
                      						lv_linkImage_4_0,
                      						"markHammil.mm.MyDsl.NaturalExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:880:3: ( ( ')](' )=>otherlv_5= ')](' )
            // InternalMyDsl.g:881:4: ( ')](' )=>otherlv_5= ')]('
            {
            otherlv_5=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:887:3: ( (lv_linkVideo_6_0= ruleNaturalExpression ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_INT && LA24_0<=RULE_STRING)||LA24_0==15||LA24_0==25||(LA24_0>=34 && LA24_0<=35)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:888:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:888:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    // InternalMyDsl.g:889:5: lv_linkVideo_6_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkVideoNaturalExpressionParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_linkVideo_6_0=ruleNaturalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVideoExpressionRule());
                      					}
                      					set(
                      						current,
                      						"linkVideo",
                      						lv_linkVideo_6_0,
                      						"markHammil.mm.MyDsl.NaturalExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:906:3: ( ( ')' )=>otherlv_7= ')' )
            // InternalMyDsl.g:907:4: ( ')' )=>otherlv_7= ')'
            {
            otherlv_7=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7());
              			
            }

            }

            // InternalMyDsl.g:913:3: ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_BL) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred25_InternalMyDsl()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:914:4: ( RULE_BL )=>this_BL_8= RULE_BL
                    {
                    this_BL_8=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_8, grammarAccess.getVideoExpressionAccess().getBLTerminalRuleCall_8());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoExpression"


    // $ANTLR start "entryRuleTabExpression"
    // InternalMyDsl.g:924:1: entryRuleTabExpression returns [EObject current=null] : iv_ruleTabExpression= ruleTabExpression EOF ;
    public final EObject entryRuleTabExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabExpression = null;


        try {
            // InternalMyDsl.g:924:54: (iv_ruleTabExpression= ruleTabExpression EOF )
            // InternalMyDsl.g:925:2: iv_ruleTabExpression= ruleTabExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTabExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTabExpression=ruleTabExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTabExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTabExpression"


    // $ANTLR start "ruleTabExpression"
    // InternalMyDsl.g:931:1: ruleTabExpression returns [EObject current=null] : ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) ) ;
    public final EObject ruleTabExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_2=null;
        Token this_BL_4=null;
        EObject lv_header_1_0 = null;

        EObject lv_lines_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:937:2: ( ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) ) )
            // InternalMyDsl.g:938:2: ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) )
            {
            // InternalMyDsl.g:938:2: ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) )
            // InternalMyDsl.g:939:3: () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) )
            {
            // InternalMyDsl.g:939:3: ()
            // InternalMyDsl.g:940:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTabExpressionAccess().getTabExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:946:3: ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) )
            // InternalMyDsl.g:947:4: ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* )
            {
            // InternalMyDsl.g:985:4: ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* )
            // InternalMyDsl.g:986:5: ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*
            {
            // InternalMyDsl.g:986:5: ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) )
            // InternalMyDsl.g:987:6: ( '|' )=> (lv_header_1_0= ruleLineExpression )
            {
            // InternalMyDsl.g:988:6: (lv_header_1_0= ruleLineExpression )
            // InternalMyDsl.g:989:7: lv_header_1_0= ruleLineExpression
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getTabExpressionAccess().getHeaderLineExpressionParserRuleCall_1_0_0_0());
              						
            }
            pushFollow(FOLLOW_5);
            lv_header_1_0=ruleLineExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElementForParent(grammarAccess.getTabExpressionRule());
              							}
              							set(
              								current,
              								"header",
              								lv_header_1_0,
              								"markHammil.mm.MyDsl.LineExpression");
              							afterParserOrEnumRuleCall();
              						
            }

            }


            }

            this_BL_2=(Token)match(input,RULE_BL,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(this_BL_2, grammarAccess.getTabExpressionAccess().getBLTerminalRuleCall_1_0_1());
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTabExpressionAccess().getTabSeparationParserRuleCall_1_0_2());
              				
            }
            pushFollow(FOLLOW_4);
            ruleTabSeparation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }
            // InternalMyDsl.g:1017:5: ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:1018:6: ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) )
            	    {
            	    // InternalMyDsl.g:1031:6: (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) )
            	    // InternalMyDsl.g:1032:7: this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) )
            	    {
            	    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(this_BL_4, grammarAccess.getTabExpressionAccess().getBLTerminalRuleCall_1_0_3_0_0());
            	      						
            	    }
            	    // InternalMyDsl.g:1036:7: ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) )
            	    // InternalMyDsl.g:1037:8: ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression )
            	    {
            	    // InternalMyDsl.g:1041:8: (lv_lines_5_0= ruleLineExpression )
            	    // InternalMyDsl.g:1042:9: lv_lines_5_0= ruleLineExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getTabExpressionAccess().getLinesLineExpressionParserRuleCall_1_0_3_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_lines_5_0=ruleLineExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElementForParent(grammarAccess.getTabExpressionRule());
            	      									}
            	      									add(
            	      										current,
            	      										"lines",
            	      										lv_lines_5_0,
            	      										"markHammil.mm.MyDsl.LineExpression");
            	      									afterParserOrEnumRuleCall();
            	      								
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTabExpression"


    // $ANTLR start "entryRuleTabSeparation"
    // InternalMyDsl.g:1067:1: entryRuleTabSeparation returns [String current=null] : iv_ruleTabSeparation= ruleTabSeparation EOF ;
    public final String entryRuleTabSeparation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTabSeparation = null;


        try {
            // InternalMyDsl.g:1067:53: (iv_ruleTabSeparation= ruleTabSeparation EOF )
            // InternalMyDsl.g:1068:2: iv_ruleTabSeparation= ruleTabSeparation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTabSeparationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTabSeparation=ruleTabSeparation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTabSeparation.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTabSeparation"


    // $ANTLR start "ruleTabSeparation"
    // InternalMyDsl.g:1074:1: ruleTabSeparation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? ) ;
    public final AntlrDatatypeRuleToken ruleTabSeparation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1080:2: ( ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? ) )
            // InternalMyDsl.g:1081:2: ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? )
            {
            // InternalMyDsl.g:1081:2: ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? )
            // InternalMyDsl.g:1082:3: (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )?
            {
            // InternalMyDsl.g:1082:3: (kw= '|' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1083:4: kw= '|'
                    {
                    kw=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,15,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_1());
              		
            }
            // InternalMyDsl.g:1094:3: (kw= '-' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:1095:4: kw= '-'
            	    {
            	    kw=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            // InternalMyDsl.g:1101:3: (kw= '|' kw= '-' (kw= '-' )+ )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==15) ) {
                        int LA30_3 = input.LA(3);

                        if ( (LA30_3==15) ) {
                            alt30=1;
                        }


                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:1102:4: kw= '|' kw= '-' (kw= '-' )+
            	    {
            	    kw=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_3_0());
            	      			
            	    }
            	    kw=(Token)match(input,15,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_1());
            	      			
            	    }
            	    // InternalMyDsl.g:1112:4: (kw= '-' )+
            	    int cnt29=0;
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==15) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1113:5: kw= '-'
            	    	    {
            	    	    kw=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(kw);
            	    	      					newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt29 >= 1 ) break loop29;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(29, input);
            	                throw eee;
            	        }
            	        cnt29++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // InternalMyDsl.g:1120:3: (kw= '|' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1121:4: kw= '|'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTabSeparation"


    // $ANTLR start "entryRuleLineExpression"
    // InternalMyDsl.g:1131:1: entryRuleLineExpression returns [EObject current=null] : iv_ruleLineExpression= ruleLineExpression EOF ;
    public final EObject entryRuleLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineExpression = null;


        try {
            // InternalMyDsl.g:1131:55: (iv_ruleLineExpression= ruleLineExpression EOF )
            // InternalMyDsl.g:1132:2: iv_ruleLineExpression= ruleLineExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLineExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLineExpression=ruleLineExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLineExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineExpression"


    // $ANTLR start "ruleLineExpression"
    // InternalMyDsl.g:1138:1: ruleLineExpression returns [EObject current=null] : ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? ) ;
    public final EObject ruleLineExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cells_1_0 = null;

        EObject lv_cells_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1144:2: ( ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? ) )
            // InternalMyDsl.g:1145:2: ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? )
            {
            // InternalMyDsl.g:1145:2: ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? )
            // InternalMyDsl.g:1146:3: ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )?
            {
            // InternalMyDsl.g:1146:3: ( ( '|' )=>otherlv_0= '|' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred35_InternalMyDsl()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1147:4: ( '|' )=>otherlv_0= '|'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalMyDsl.g:1153:3: ( (lv_cells_1_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1154:4: (lv_cells_1_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1154:4: (lv_cells_1_0= ruleNaturalExpression )
            // InternalMyDsl.g:1155:5: lv_cells_1_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_cells_1_0=ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLineExpressionRule());
              					}
              					add(
              						current,
              						"cells",
              						lv_cells_1_0,
              						"markHammil.mm.MyDsl.NaturalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1172:3: ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:1173:4: ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:1173:4: ( ( '|' )=>otherlv_2= '|' )
            	    // InternalMyDsl.g:1174:5: ( '|' )=>otherlv_2= '|'
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_2_0());
            	      				
            	    }

            	    }

            	    // InternalMyDsl.g:1180:4: ( (lv_cells_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:1181:5: (lv_cells_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:1181:5: (lv_cells_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:1182:6: lv_cells_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_cells_3_0=ruleNaturalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLineExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"cells",
            	      							lv_cells_3_0,
            	      							"markHammil.mm.MyDsl.NaturalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalMyDsl.g:1200:3: ( ( '|' )=>otherlv_4= '|' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred37_InternalMyDsl()) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1201:4: ( '|' )=>otherlv_4= '|'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineExpression"


    // $ANTLR start "entryRuleHeaderExpression"
    // InternalMyDsl.g:1211:1: entryRuleHeaderExpression returns [EObject current=null] : iv_ruleHeaderExpression= ruleHeaderExpression EOF ;
    public final EObject entryRuleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderExpression = null;


        try {
            // InternalMyDsl.g:1211:57: (iv_ruleHeaderExpression= ruleHeaderExpression EOF )
            // InternalMyDsl.g:1212:2: iv_ruleHeaderExpression= ruleHeaderExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeaderExpression=ruleHeaderExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeaderExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderExpression"


    // $ANTLR start "ruleHeaderExpression"
    // InternalMyDsl.g:1218:1: ruleHeaderExpression returns [EObject current=null] : (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) ;
    public final EObject ruleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Header1Expression_0 = null;

        EObject this_Header2Expression_1 = null;

        EObject this_Header3Expression_2 = null;

        EObject this_Header4Expression_3 = null;

        EObject this_Header5Expression_4 = null;

        EObject this_Header6Expression_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1224:2: ( (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) )
            // InternalMyDsl.g:1225:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            {
            // InternalMyDsl.g:1225:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            int alt35=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt35=1;
                }
                break;
            case 27:
                {
                alt35=2;
                }
                break;
            case 28:
                {
                alt35=3;
                }
                break;
            case 29:
                {
                alt35=4;
                }
                break;
            case 30:
                {
                alt35=5;
                }
                break;
            case 31:
                {
                alt35=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1226:3: this_Header1Expression_0= ruleHeader1Expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader1ExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Header1Expression_0=ruleHeader1Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Header1Expression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1235:3: this_Header2Expression_1= ruleHeader2Expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader2ExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Header2Expression_1=ruleHeader2Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Header2Expression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1244:3: this_Header3Expression_2= ruleHeader3Expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader3ExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Header3Expression_2=ruleHeader3Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Header3Expression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1253:3: this_Header4Expression_3= ruleHeader4Expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader4ExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Header4Expression_3=ruleHeader4Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Header4Expression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1262:3: this_Header5Expression_4= ruleHeader5Expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader5ExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Header5Expression_4=ruleHeader5Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Header5Expression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1271:3: this_Header6Expression_5= ruleHeader6Expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeader6ExpressionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Header6Expression_5=ruleHeader6Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Header6Expression_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderExpression"


    // $ANTLR start "entryRuleHeader1Expression"
    // InternalMyDsl.g:1283:1: entryRuleHeader1Expression returns [EObject current=null] : iv_ruleHeader1Expression= ruleHeader1Expression EOF ;
    public final EObject entryRuleHeader1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader1Expression = null;


        try {
            // InternalMyDsl.g:1283:58: (iv_ruleHeader1Expression= ruleHeader1Expression EOF )
            // InternalMyDsl.g:1284:2: iv_ruleHeader1Expression= ruleHeader1Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeader1ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeader1Expression=ruleHeader1Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeader1Expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader1Expression"


    // $ANTLR start "ruleHeader1Expression"
    // InternalMyDsl.g:1290:1: ruleHeader1Expression returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader1Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1296:2: ( ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1297:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1297:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1298:3: () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1298:3: ()
            // InternalMyDsl.g:1299:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1309:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1310:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1310:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1311:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_title_2_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeader1ExpressionRule());
              					}
              					add(
              						current,
              						"title",
              						lv_title_2_0,
              						"markHammil.mm.MyDsl.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1328:3: ( ( '#' )=>otherlv_3= '#' )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:1329:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalMyDsl.g:1336:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_BL) && (synpred39_InternalMyDsl())) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1337:4: ( RULE_BL )=>this_BL_4= RULE_BL
                    {
                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_4, grammarAccess.getHeader1ExpressionAccess().getBLTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader1Expression"


    // $ANTLR start "entryRuleHeader2Expression"
    // InternalMyDsl.g:1347:1: entryRuleHeader2Expression returns [EObject current=null] : iv_ruleHeader2Expression= ruleHeader2Expression EOF ;
    public final EObject entryRuleHeader2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader2Expression = null;


        try {
            // InternalMyDsl.g:1347:58: (iv_ruleHeader2Expression= ruleHeader2Expression EOF )
            // InternalMyDsl.g:1348:2: iv_ruleHeader2Expression= ruleHeader2Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeader2ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeader2Expression=ruleHeader2Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeader2Expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader2Expression"


    // $ANTLR start "ruleHeader2Expression"
    // InternalMyDsl.g:1354:1: ruleHeader2Expression returns [EObject current=null] : ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader2Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1360:2: ( ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1361:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1361:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1362:3: () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1362:3: ()
            // InternalMyDsl.g:1363:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1373:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1374:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1374:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1375:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_title_2_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeader2ExpressionRule());
              					}
              					add(
              						current,
              						"title",
              						lv_title_2_0,
              						"markHammil.mm.MyDsl.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1392:3: ( ( '#' )=>otherlv_3= '#' )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:1393:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalMyDsl.g:1400:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_BL) && (synpred41_InternalMyDsl())) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1401:4: ( RULE_BL )=>this_BL_4= RULE_BL
                    {
                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_4, grammarAccess.getHeader2ExpressionAccess().getBLTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader2Expression"


    // $ANTLR start "entryRuleHeader3Expression"
    // InternalMyDsl.g:1411:1: entryRuleHeader3Expression returns [EObject current=null] : iv_ruleHeader3Expression= ruleHeader3Expression EOF ;
    public final EObject entryRuleHeader3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader3Expression = null;


        try {
            // InternalMyDsl.g:1411:58: (iv_ruleHeader3Expression= ruleHeader3Expression EOF )
            // InternalMyDsl.g:1412:2: iv_ruleHeader3Expression= ruleHeader3Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeader3ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeader3Expression=ruleHeader3Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeader3Expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader3Expression"


    // $ANTLR start "ruleHeader3Expression"
    // InternalMyDsl.g:1418:1: ruleHeader3Expression returns [EObject current=null] : ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1424:2: ( ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1425:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1425:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1426:3: () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1426:3: ()
            // InternalMyDsl.g:1427:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1437:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1438:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1438:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1439:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_title_2_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeader3ExpressionRule());
              					}
              					add(
              						current,
              						"title",
              						lv_title_2_0,
              						"markHammil.mm.MyDsl.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1456:3: ( ( '#' )=>otherlv_3= '#' )*
            loop40:
            do {
                int alt40=2;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:1457:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalMyDsl.g:1464:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_BL) && (synpred43_InternalMyDsl())) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1465:4: ( RULE_BL )=>this_BL_4= RULE_BL
                    {
                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_4, grammarAccess.getHeader3ExpressionAccess().getBLTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader3Expression"


    // $ANTLR start "entryRuleHeader4Expression"
    // InternalMyDsl.g:1475:1: entryRuleHeader4Expression returns [EObject current=null] : iv_ruleHeader4Expression= ruleHeader4Expression EOF ;
    public final EObject entryRuleHeader4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader4Expression = null;


        try {
            // InternalMyDsl.g:1475:58: (iv_ruleHeader4Expression= ruleHeader4Expression EOF )
            // InternalMyDsl.g:1476:2: iv_ruleHeader4Expression= ruleHeader4Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeader4ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeader4Expression=ruleHeader4Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeader4Expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader4Expression"


    // $ANTLR start "ruleHeader4Expression"
    // InternalMyDsl.g:1482:1: ruleHeader4Expression returns [EObject current=null] : ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1488:2: ( ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1489:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1489:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1490:3: () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1490:3: ()
            // InternalMyDsl.g:1491:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1501:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1502:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1502:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1503:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_title_2_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeader4ExpressionRule());
              					}
              					add(
              						current,
              						"title",
              						lv_title_2_0,
              						"markHammil.mm.MyDsl.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1520:3: ( ( '#' )=>otherlv_3= '#' )*
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:1521:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalMyDsl.g:1528:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_BL) && (synpred45_InternalMyDsl())) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1529:4: ( RULE_BL )=>this_BL_4= RULE_BL
                    {
                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_4, grammarAccess.getHeader4ExpressionAccess().getBLTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader4Expression"


    // $ANTLR start "entryRuleHeader5Expression"
    // InternalMyDsl.g:1539:1: entryRuleHeader5Expression returns [EObject current=null] : iv_ruleHeader5Expression= ruleHeader5Expression EOF ;
    public final EObject entryRuleHeader5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader5Expression = null;


        try {
            // InternalMyDsl.g:1539:58: (iv_ruleHeader5Expression= ruleHeader5Expression EOF )
            // InternalMyDsl.g:1540:2: iv_ruleHeader5Expression= ruleHeader5Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeader5ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeader5Expression=ruleHeader5Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeader5Expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader5Expression"


    // $ANTLR start "ruleHeader5Expression"
    // InternalMyDsl.g:1546:1: ruleHeader5Expression returns [EObject current=null] : ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1552:2: ( ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1553:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1553:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1554:3: () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1554:3: ()
            // InternalMyDsl.g:1555:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1565:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1566:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1566:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1567:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_title_2_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeader5ExpressionRule());
              					}
              					add(
              						current,
              						"title",
              						lv_title_2_0,
              						"markHammil.mm.MyDsl.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1584:3: ( ( '#' )=>otherlv_3= '#' )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // InternalMyDsl.g:1585:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalMyDsl.g:1592:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_BL) && (synpred47_InternalMyDsl())) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1593:4: ( RULE_BL )=>this_BL_4= RULE_BL
                    {
                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_4, grammarAccess.getHeader5ExpressionAccess().getBLTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader5Expression"


    // $ANTLR start "entryRuleHeader6Expression"
    // InternalMyDsl.g:1603:1: entryRuleHeader6Expression returns [EObject current=null] : iv_ruleHeader6Expression= ruleHeader6Expression EOF ;
    public final EObject entryRuleHeader6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader6Expression = null;


        try {
            // InternalMyDsl.g:1603:58: (iv_ruleHeader6Expression= ruleHeader6Expression EOF )
            // InternalMyDsl.g:1604:2: iv_ruleHeader6Expression= ruleHeader6Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeader6ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeader6Expression=ruleHeader6Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeader6Expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader6Expression"


    // $ANTLR start "ruleHeader6Expression"
    // InternalMyDsl.g:1610:1: ruleHeader6Expression returns [EObject current=null] : ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1616:2: ( ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1617:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1617:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1618:3: () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1618:3: ()
            // InternalMyDsl.g:1619:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1629:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1630:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1630:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1631:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_title_2_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeader6ExpressionRule());
              					}
              					add(
              						current,
              						"title",
              						lv_title_2_0,
              						"markHammil.mm.MyDsl.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1648:3: ( ( '#' )=>otherlv_3= '#' )*
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:1649:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalMyDsl.g:1656:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_BL) && (synpred49_InternalMyDsl())) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:1657:4: ( RULE_BL )=>this_BL_4= RULE_BL
                    {
                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_4, grammarAccess.getHeader6ExpressionAccess().getBLTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader6Expression"


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalMyDsl.g:1667:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalMyDsl.g:1667:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalMyDsl.g:1668:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmphasisExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmphasisExpression=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmphasisExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmphasisExpression"


    // $ANTLR start "ruleEmphasisExpression"
    // InternalMyDsl.g:1674:1: ruleEmphasisExpression returns [EObject current=null] : ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1680:2: ( ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ )
            // InternalMyDsl.g:1681:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            {
            // InternalMyDsl.g:1681:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=3;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:1682:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    {
            	    // InternalMyDsl.g:1682:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    // InternalMyDsl.g:1683:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    {
            	    // InternalMyDsl.g:1707:4: ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    int alt48=3;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==32) && (synpred52_InternalMyDsl())) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==14) ) {
            	        alt48=2;
            	    }
            	    else if ( (LA48_0==33) ) {
            	        alt48=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalMyDsl.g:1708:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            {
            	            // InternalMyDsl.g:1708:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            // InternalMyDsl.g:1709:6: ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression )
            	            {
            	            // InternalMyDsl.g:1713:6: (lv_c_0_0= ruleStrongExpression )
            	            // InternalMyDsl.g:1714:7: lv_c_0_0= ruleStrongExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCStrongExpressionParserRuleCall_0_0_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_25);
            	            lv_c_0_0=ruleStrongExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getEmphasisExpressionRule());
            	              							}
            	              							add(
            	              								current,
            	              								"c",
            	              								lv_c_0_0,
            	              								"markHammil.mm.MyDsl.StrongExpression");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1732:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            {
            	            // InternalMyDsl.g:1732:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            // InternalMyDsl.g:1733:6: (lv_c_1_0= ruleItalicExpression )
            	            {
            	            // InternalMyDsl.g:1733:6: (lv_c_1_0= ruleItalicExpression )
            	            // InternalMyDsl.g:1734:7: lv_c_1_0= ruleItalicExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCItalicExpressionParserRuleCall_0_0_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_25);
            	            lv_c_1_0=ruleItalicExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getEmphasisExpressionRule());
            	              							}
            	              							add(
            	              								current,
            	              								"c",
            	              								lv_c_1_0,
            	              								"markHammil.mm.MyDsl.ItalicExpression");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:1752:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            {
            	            // InternalMyDsl.g:1752:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            // InternalMyDsl.g:1753:6: (lv_c_2_0= ruleScratchExpression )
            	            {
            	            // InternalMyDsl.g:1753:6: (lv_c_2_0= ruleScratchExpression )
            	            // InternalMyDsl.g:1754:7: lv_c_2_0= ruleScratchExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCScratchExpressionParserRuleCall_0_0_2_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_25);
            	            lv_c_2_0=ruleScratchExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getEmphasisExpressionRule());
            	              							}
            	              							add(
            	              								current,
            	              								"c",
            	              								lv_c_2_0,
            	              								"markHammil.mm.MyDsl.ScratchExpression");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1774:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:1774:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:1775:4: (lv_c_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:1775:4: (lv_c_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:1776:5: lv_c_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCNaturalExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_c_3_0=ruleNaturalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEmphasisExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"c",
            	      						lv_c_3_0,
            	      						"markHammil.mm.MyDsl.NaturalExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmphasisExpression"


    // $ANTLR start "entryRuleStrongExpression"
    // InternalMyDsl.g:1797:1: entryRuleStrongExpression returns [EObject current=null] : iv_ruleStrongExpression= ruleStrongExpression EOF ;
    public final EObject entryRuleStrongExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrongExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1799:2: (iv_ruleStrongExpression= ruleStrongExpression EOF )
            // InternalMyDsl.g:1800:2: iv_ruleStrongExpression= ruleStrongExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrongExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStrongExpression=ruleStrongExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStrongExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStrongExpression"


    // $ANTLR start "ruleStrongExpression"
    // InternalMyDsl.g:1809:1: ruleStrongExpression returns [EObject current=null] : ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) ;
    public final EObject ruleStrongExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1816:2: ( ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) )
            // InternalMyDsl.g:1817:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            {
            // InternalMyDsl.g:1817:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            // InternalMyDsl.g:1818:3: () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**'
            {
            // InternalMyDsl.g:1818:3: ()
            // InternalMyDsl.g:1819:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1());
              		
            }
            // InternalMyDsl.g:1829:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1830:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1830:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1831:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStrongExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_content_2_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStrongExpressionRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"markHammil.mm.MyDsl.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStrongExpression"


    // $ANTLR start "entryRuleItalicExpression"
    // InternalMyDsl.g:1859:1: entryRuleItalicExpression returns [EObject current=null] : iv_ruleItalicExpression= ruleItalicExpression EOF ;
    public final EObject entryRuleItalicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1861:2: (iv_ruleItalicExpression= ruleItalicExpression EOF )
            // InternalMyDsl.g:1862:2: iv_ruleItalicExpression= ruleItalicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItalicExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleItalicExpression=ruleItalicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItalicExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleItalicExpression"


    // $ANTLR start "ruleItalicExpression"
    // InternalMyDsl.g:1871:1: ruleItalicExpression returns [EObject current=null] : ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) ;
    public final EObject ruleItalicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1878:2: ( ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) )
            // InternalMyDsl.g:1879:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            {
            // InternalMyDsl.g:1879:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            // InternalMyDsl.g:1880:3: () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*'
            {
            // InternalMyDsl.g:1880:3: ()
            // InternalMyDsl.g:1881:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_1());
              		
            }
            // InternalMyDsl.g:1891:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1892:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1892:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1893:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItalicExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_content_2_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getItalicExpressionRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"markHammil.mm.MyDsl.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleItalicExpression"


    // $ANTLR start "entryRuleScratchExpression"
    // InternalMyDsl.g:1921:1: entryRuleScratchExpression returns [EObject current=null] : iv_ruleScratchExpression= ruleScratchExpression EOF ;
    public final EObject entryRuleScratchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScratchExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1923:2: (iv_ruleScratchExpression= ruleScratchExpression EOF )
            // InternalMyDsl.g:1924:2: iv_ruleScratchExpression= ruleScratchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScratchExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScratchExpression=ruleScratchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScratchExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleScratchExpression"


    // $ANTLR start "ruleScratchExpression"
    // InternalMyDsl.g:1933:1: ruleScratchExpression returns [EObject current=null] : ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) ;
    public final EObject ruleScratchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1940:2: ( ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) )
            // InternalMyDsl.g:1941:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            {
            // InternalMyDsl.g:1941:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            // InternalMyDsl.g:1942:3: () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~'
            {
            // InternalMyDsl.g:1942:3: ()
            // InternalMyDsl.g:1943:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1());
              		
            }
            // InternalMyDsl.g:1953:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1954:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1954:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1955:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScratchExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_content_2_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScratchExpressionRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"markHammil.mm.MyDsl.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleScratchExpression"


    // $ANTLR start "entryRuleNaturalExpression"
    // InternalMyDsl.g:1983:1: entryRuleNaturalExpression returns [EObject current=null] : iv_ruleNaturalExpression= ruleNaturalExpression EOF ;
    public final EObject entryRuleNaturalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalExpression = null;


        try {
            // InternalMyDsl.g:1983:58: (iv_ruleNaturalExpression= ruleNaturalExpression EOF )
            // InternalMyDsl.g:1984:2: iv_ruleNaturalExpression= ruleNaturalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNaturalExpression=ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNaturalExpression"


    // $ANTLR start "ruleNaturalExpression"
    // InternalMyDsl.g:1990:1: ruleNaturalExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleContent ) ) ) ;
    public final EObject ruleNaturalExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1996:2: ( ( () ( (lv_value_1_0= ruleContent ) ) ) )
            // InternalMyDsl.g:1997:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            {
            // InternalMyDsl.g:1997:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            // InternalMyDsl.g:1998:3: () ( (lv_value_1_0= ruleContent ) )
            {
            // InternalMyDsl.g:1998:3: ()
            // InternalMyDsl.g:1999:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNaturalExpressionAccess().getEmphasisExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:2005:3: ( (lv_value_1_0= ruleContent ) )
            // InternalMyDsl.g:2006:4: (lv_value_1_0= ruleContent )
            {
            // InternalMyDsl.g:2006:4: (lv_value_1_0= ruleContent )
            // InternalMyDsl.g:2007:5: lv_value_1_0= ruleContent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNaturalExpressionAccess().getValueContentParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNaturalExpressionRule());
              					}
              					add(
              						current,
              						"value",
              						lv_value_1_0,
              						"markHammil.mm.MyDsl.Content");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNaturalExpression"


    // $ANTLR start "entryRuleContent"
    // InternalMyDsl.g:2028:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


        try {
            // InternalMyDsl.g:2028:47: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:2029:2: iv_ruleContent= ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContent.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalMyDsl.g:2035:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2041:2: ( ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) )
            // InternalMyDsl.g:2042:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            {
            // InternalMyDsl.g:2042:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            int alt51=5;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) && (synpred53_InternalMyDsl())) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_STRING) && (synpred53_InternalMyDsl())) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_INT) && (synpred53_InternalMyDsl())) {
                alt51=1;
            }
            else if ( (LA51_0==34) ) {
                alt51=2;
            }
            else if ( (LA51_0==15) ) {
                alt51=3;
            }
            else if ( (LA51_0==25) ) {
                alt51=4;
            }
            else if ( (LA51_0==35) ) {
                alt51=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2043:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    {
                    // InternalMyDsl.g:2043:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    // InternalMyDsl.g:2044:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    {
                    // InternalMyDsl.g:2052:4: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    int alt50=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt50=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt50=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt50=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // InternalMyDsl.g:2053:5: this_ID_0= RULE_ID
                            {
                            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ID_0);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_ID_0, grammarAccess.getContentAccess().getIDTerminalRuleCall_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:2061:5: this_STRING_1= RULE_STRING
                            {
                            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_STRING_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_STRING_1, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:2069:5: this_INT_2= RULE_INT
                            {
                            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_INT_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_2, grammarAccess.getContentAccess().getINTTerminalRuleCall_0_0_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2079:3: kw= '\\''
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getApostropheKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2085:3: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getHyphenMinusKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2091:3: kw= '|'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getVerticalLineKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2097:3: kw= '\"'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getQuotationMarkKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:126:5: ( ruleHeaderExpression )
        // InternalMyDsl.g:126:6: ruleHeaderExpression
        {
        pushFollow(FOLLOW_2);
        ruleHeaderExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:156:6: ( RULE_BL )
        // InternalMyDsl.g:156:7: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // $ANTLR start synpred3_InternalMyDsl
    public final void synpred3_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:175:5: ( RULE_BL )
        // InternalMyDsl.g:175:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // $ANTLR start synpred4_InternalMyDsl
    public final void synpred4_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:293:7: ( ( ruleImageExpression ) )
        // InternalMyDsl.g:293:8: ( ruleImageExpression )
        {
        // InternalMyDsl.g:293:8: ( ruleImageExpression )
        // InternalMyDsl.g:294:8: ruleImageExpression
        {
        pushFollow(FOLLOW_2);
        ruleImageExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalMyDsl

    // $ANTLR start synpred5_InternalMyDsl
    public final void synpred5_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:303:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:303:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:303:8: ( ruleVideoExpression )
        // InternalMyDsl.g:304:8: ruleVideoExpression
        {
        pushFollow(FOLLOW_2);
        ruleVideoExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalMyDsl

    // $ANTLR start synpred6_InternalMyDsl
    public final void synpred6_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:272:4: ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )
        // InternalMyDsl.g:272:5: ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )
        {
        // InternalMyDsl.g:272:5: ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )
        int alt53=3;
        switch ( input.LA(1) ) {
        case 18:
            {
            alt53=1;
            }
            break;
        case RULE_INT:
        case RULE_ID:
        case RULE_STRING:
        case 15:
        case 25:
        case 34:
        case 35:
            {
            alt53=2;
            }
            break;
        case 19:
        case 22:
        case 23:
            {
            alt53=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 53, 0, input);

            throw nvae;
        }

        switch (alt53) {
            case 1 :
                // InternalMyDsl.g:273:5: ( ( ruleQuoteExpression ) )
                {
                // InternalMyDsl.g:273:5: ( ( ruleQuoteExpression ) )
                // InternalMyDsl.g:274:6: ( ruleQuoteExpression )
                {
                // InternalMyDsl.g:274:6: ( ruleQuoteExpression )
                // InternalMyDsl.g:275:7: ruleQuoteExpression
                {
                pushFollow(FOLLOW_2);
                ruleQuoteExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalMyDsl.g:279:5: ( ( ruleTabExpression ) )
                {
                // InternalMyDsl.g:279:5: ( ( ruleTabExpression ) )
                // InternalMyDsl.g:280:6: ( ruleTabExpression )
                {
                // InternalMyDsl.g:280:6: ( ruleTabExpression )
                // InternalMyDsl.g:281:7: ruleTabExpression
                {
                pushFollow(FOLLOW_2);
                ruleTabExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalMyDsl.g:285:5: ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
                {
                // InternalMyDsl.g:285:5: ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
                int alt52=3;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==19) ) {
                    alt52=1;
                }
                else if ( (LA52_0==22) && (synpred4_InternalMyDsl())) {
                    alt52=2;
                }
                else if ( (LA52_0==23) && (synpred5_InternalMyDsl())) {
                    alt52=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 0, input);

                    throw nvae;
                }
                switch (alt52) {
                    case 1 :
                        // InternalMyDsl.g:286:6: ( ( ruleLinkExpression ) )
                        {
                        // InternalMyDsl.g:286:6: ( ( ruleLinkExpression ) )
                        // InternalMyDsl.g:287:7: ( ruleLinkExpression )
                        {
                        // InternalMyDsl.g:287:7: ( ruleLinkExpression )
                        // InternalMyDsl.g:288:8: ruleLinkExpression
                        {
                        pushFollow(FOLLOW_2);
                        ruleLinkExpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 2 :
                        // InternalMyDsl.g:292:6: ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) )
                        {
                        // InternalMyDsl.g:292:6: ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) )
                        // InternalMyDsl.g:293:7: ( ( ruleImageExpression ) )=> ( ruleImageExpression )
                        {
                        // InternalMyDsl.g:297:7: ( ruleImageExpression )
                        // InternalMyDsl.g:298:8: ruleImageExpression
                        {
                        pushFollow(FOLLOW_2);
                        ruleImageExpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 3 :
                        // InternalMyDsl.g:302:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                        {
                        // InternalMyDsl.g:302:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                        // InternalMyDsl.g:303:7: ( ( ruleVideoExpression ) )=> ( ruleVideoExpression )
                        {
                        // InternalMyDsl.g:307:7: ( ruleVideoExpression )
                        // InternalMyDsl.g:308:8: ruleVideoExpression
                        {
                        pushFollow(FOLLOW_2);
                        ruleVideoExpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }
                        break;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred6_InternalMyDsl

    // $ANTLR start synpred7_InternalMyDsl
    public final void synpred7_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:377:7: ( ( ruleImageExpression ) )
        // InternalMyDsl.g:377:8: ( ruleImageExpression )
        {
        // InternalMyDsl.g:377:8: ( ruleImageExpression )
        // InternalMyDsl.g:378:8: ruleImageExpression
        {
        pushFollow(FOLLOW_2);
        ruleImageExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalMyDsl

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:401:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:401:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:401:8: ( ruleVideoExpression )
        // InternalMyDsl.g:402:8: ruleVideoExpression
        {
        pushFollow(FOLLOW_2);
        ruleVideoExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:505:6: ( RULE_BL )
        // InternalMyDsl.g:505:7: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalMyDsl

    // $ANTLR start synpred10_InternalMyDsl
    public final void synpred10_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:549:5: ( RULE_BL )
        // InternalMyDsl.g:549:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalMyDsl

    // $ANTLR start synpred12_InternalMyDsl
    public final void synpred12_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:612:4: ( RULE_BL )
        // InternalMyDsl.g:612:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalMyDsl

    // $ANTLR start synpred15_InternalMyDsl
    public final void synpred15_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:697:4: ( ')' )
        // InternalMyDsl.g:697:5: ')'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalMyDsl

    // $ANTLR start synpred16_InternalMyDsl
    public final void synpred16_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:704:4: ( RULE_BL )
        // InternalMyDsl.g:704:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalMyDsl

    // $ANTLR start synpred19_InternalMyDsl
    public final void synpred19_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:789:4: ( ')' )
        // InternalMyDsl.g:789:5: ')'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalMyDsl

    // $ANTLR start synpred20_InternalMyDsl
    public final void synpred20_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:796:4: ( RULE_BL )
        // InternalMyDsl.g:796:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalMyDsl

    // $ANTLR start synpred23_InternalMyDsl
    public final void synpred23_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:881:4: ( ')](' )
        // InternalMyDsl.g:881:5: ')]('
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalMyDsl

    // $ANTLR start synpred24_InternalMyDsl
    public final void synpred24_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:907:4: ( ')' )
        // InternalMyDsl.g:907:5: ')'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalMyDsl

    // $ANTLR start synpred25_InternalMyDsl
    public final void synpred25_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:914:4: ( RULE_BL )
        // InternalMyDsl.g:914:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalMyDsl

    // $ANTLR start synpred33_InternalMyDsl
    public final void synpred33_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1018:6: ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )
        // InternalMyDsl.g:1018:7: ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) )
        {
        // InternalMyDsl.g:1018:7: ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) )
        // InternalMyDsl.g:1019:7: RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) )
        {
        match(input,RULE_BL,FOLLOW_14); if (state.failed) return ;
        // InternalMyDsl.g:1020:7: ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) )
        // InternalMyDsl.g:1021:8: ( ( ruleLineExpression ) )=> ( ruleLineExpression )
        {
        // InternalMyDsl.g:1025:8: ( ruleLineExpression )
        // InternalMyDsl.g:1026:9: ruleLineExpression
        {
        pushFollow(FOLLOW_2);
        ruleLineExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred33_InternalMyDsl

    // $ANTLR start synpred35_InternalMyDsl
    public final void synpred35_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1147:4: ( '|' )
        // InternalMyDsl.g:1147:5: '|'
        {
        match(input,25,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalMyDsl

    // $ANTLR start synpred36_InternalMyDsl
    public final void synpred36_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1174:5: ( '|' )
        // InternalMyDsl.g:1174:6: '|'
        {
        match(input,25,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalMyDsl

    // $ANTLR start synpred37_InternalMyDsl
    public final void synpred37_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1201:4: ( '|' )
        // InternalMyDsl.g:1201:5: '|'
        {
        match(input,25,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalMyDsl

    // $ANTLR start synpred38_InternalMyDsl
    public final void synpred38_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1329:4: ( '#' )
        // InternalMyDsl.g:1329:5: '#'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalMyDsl

    // $ANTLR start synpred39_InternalMyDsl
    public final void synpred39_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1337:4: ( RULE_BL )
        // InternalMyDsl.g:1337:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalMyDsl

    // $ANTLR start synpred40_InternalMyDsl
    public final void synpred40_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1393:4: ( '#' )
        // InternalMyDsl.g:1393:5: '#'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalMyDsl

    // $ANTLR start synpred41_InternalMyDsl
    public final void synpred41_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1401:4: ( RULE_BL )
        // InternalMyDsl.g:1401:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalMyDsl

    // $ANTLR start synpred42_InternalMyDsl
    public final void synpred42_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1457:4: ( '#' )
        // InternalMyDsl.g:1457:5: '#'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalMyDsl

    // $ANTLR start synpred43_InternalMyDsl
    public final void synpred43_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1465:4: ( RULE_BL )
        // InternalMyDsl.g:1465:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalMyDsl

    // $ANTLR start synpred44_InternalMyDsl
    public final void synpred44_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1521:4: ( '#' )
        // InternalMyDsl.g:1521:5: '#'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalMyDsl

    // $ANTLR start synpred45_InternalMyDsl
    public final void synpred45_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1529:4: ( RULE_BL )
        // InternalMyDsl.g:1529:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalMyDsl

    // $ANTLR start synpred46_InternalMyDsl
    public final void synpred46_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1585:4: ( '#' )
        // InternalMyDsl.g:1585:5: '#'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalMyDsl

    // $ANTLR start synpred47_InternalMyDsl
    public final void synpred47_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1593:4: ( RULE_BL )
        // InternalMyDsl.g:1593:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalMyDsl

    // $ANTLR start synpred48_InternalMyDsl
    public final void synpred48_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1649:4: ( '#' )
        // InternalMyDsl.g:1649:5: '#'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalMyDsl

    // $ANTLR start synpred49_InternalMyDsl
    public final void synpred49_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1657:4: ( RULE_BL )
        // InternalMyDsl.g:1657:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalMyDsl

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1685:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:1685:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:1685:7: ( ruleStrongExpression )
        // InternalMyDsl.g:1686:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1683:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )
        // InternalMyDsl.g:1683:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        {
        // InternalMyDsl.g:1683:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        int alt55=3;
        int LA55_0 = input.LA(1);

        if ( (LA55_0==32) && (synpred50_InternalMyDsl())) {
            alt55=1;
        }
        else if ( (LA55_0==14) ) {
            alt55=2;
        }
        else if ( (LA55_0==33) ) {
            alt55=3;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 55, 0, input);

            throw nvae;
        }
        switch (alt55) {
            case 1 :
                // InternalMyDsl.g:1684:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                {
                // InternalMyDsl.g:1684:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                // InternalMyDsl.g:1685:6: ( ( ruleStrongExpression ) )=> ( ruleStrongExpression )
                {
                // InternalMyDsl.g:1689:6: ( ruleStrongExpression )
                // InternalMyDsl.g:1690:7: ruleStrongExpression
                {
                pushFollow(FOLLOW_2);
                ruleStrongExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalMyDsl.g:1694:5: ( ( ruleItalicExpression ) )
                {
                // InternalMyDsl.g:1694:5: ( ( ruleItalicExpression ) )
                // InternalMyDsl.g:1695:6: ( ruleItalicExpression )
                {
                // InternalMyDsl.g:1695:6: ( ruleItalicExpression )
                // InternalMyDsl.g:1696:7: ruleItalicExpression
                {
                pushFollow(FOLLOW_2);
                ruleItalicExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalMyDsl.g:1700:5: ( ( ruleScratchExpression ) )
                {
                // InternalMyDsl.g:1700:5: ( ( ruleScratchExpression ) )
                // InternalMyDsl.g:1701:6: ( ruleScratchExpression )
                {
                // InternalMyDsl.g:1701:6: ( ruleScratchExpression )
                // InternalMyDsl.g:1702:7: ruleScratchExpression
                {
                pushFollow(FOLLOW_2);
                ruleScratchExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1709:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:1709:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:1709:7: ( ruleStrongExpression )
        // InternalMyDsl.g:1710:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred52_InternalMyDsl

    // $ANTLR start synpred53_InternalMyDsl
    public final void synpred53_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2044:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )
        // InternalMyDsl.g:2044:5: ( RULE_ID | RULE_STRING | RULE_INT )
        {
        if ( (input.LA(1)>=RULE_INT && input.LA(1)<=RULE_STRING) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred53_InternalMyDsl

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
    public final boolean synpred6_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred4_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred9_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred15_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred23_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred16_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred12_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred20_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred8_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\6\26\uffff";
    static final String dfa_3s = "\1\43\26\uffff";
    static final String dfa_4s = "\1\uffff\1\1\6\uffff\2\1\1\uffff\1\1\1\2\12\uffff";
    static final String dfa_5s = "\27\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\2\14\4\uffff\1\1\1\10\1\11\1\1\1\uffff\2\14\2\uffff\2\14\1\uffff\1\14\6\1\4\14",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "123:2: ( ( ( ( ruleHeaderExpression )=>this_HeaderExpression_0= ruleHeaderExpression ) | this_BreakLineExpression_1= ruleBreakLineExpression | (this_ListExpression_2= ruleListExpression ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ) | (this_TextExpression_4= ruleTextExpression ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) )";
        }
    }
    static final String dfa_7s = "\25\uffff";
    static final String dfa_8s = "\2\uffff\5\1\1\uffff\1\1\5\uffff\6\1\1\uffff";
    static final String dfa_9s = "\1\6\1\uffff\5\4\1\0\1\4\4\uffff\1\0\6\4\1\0";
    static final String dfa_10s = "\1\43\1\uffff\5\43\1\0\1\43\4\uffff\1\0\6\43\1\0";
    static final String dfa_11s = "\1\uffff\1\1\7\uffff\4\2\10\uffff";
    static final String dfa_12s = "\1\0\6\uffff\1\1\5\uffff\1\3\6\uffff\1\2}>";
    static final String[] dfa_13s = {
            "\1\4\1\2\1\3\5\uffff\1\1\1\6\2\uffff\1\11\1\12\2\uffff\1\13\1\14\1\uffff\1\7\6\uffff\2\1\1\5\1\10",
            "",
            "\1\16\1\uffff\3\1\4\uffff\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\15\12\1",
            "\1\16\1\uffff\3\1\4\uffff\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\15\12\1",
            "\1\16\1\uffff\3\1\4\uffff\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\15\12\1",
            "\1\16\1\uffff\3\1\4\uffff\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\15\12\1",
            "\1\16\1\uffff\3\1\4\uffff\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\15\12\1",
            "\1\uffff",
            "\1\16\1\uffff\3\1\4\uffff\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\15\12\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\1\1\uffff\3\1\4\uffff\2\1\1\20\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\17\12\1",
            "\1\1\1\uffff\3\1\4\uffff\2\1\1\20\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\13\1",
            "\5\1\4\uffff\2\1\1\21\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\13\1",
            "\5\1\4\uffff\2\1\1\21\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\22\12\1",
            "\1\1\1\uffff\3\1\4\uffff\2\1\1\23\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\13\1",
            "\5\1\4\uffff\2\1\1\24\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\13\1",
            "\1\uffff"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "250:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                         
                        int index8_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_0==14||(LA8_0>=32 && LA8_0<=33)) ) {s = 1;}

                        else if ( (LA8_0==RULE_ID) ) {s = 2;}

                        else if ( (LA8_0==RULE_STRING) ) {s = 3;}

                        else if ( (LA8_0==RULE_INT) ) {s = 4;}

                        else if ( (LA8_0==34) ) {s = 5;}

                        else if ( (LA8_0==15) ) {s = 6;}

                        else if ( (LA8_0==25) ) {s = 7;}

                        else if ( (LA8_0==35) ) {s = 8;}

                        else if ( (LA8_0==18) && (synpred6_InternalMyDsl())) {s = 9;}

                        else if ( (LA8_0==19) && (synpred6_InternalMyDsl())) {s = 10;}

                        else if ( (LA8_0==22) && (synpred6_InternalMyDsl())) {s = 11;}

                        else if ( (LA8_0==23) && (synpred6_InternalMyDsl())) {s = 12;}

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred6_InternalMyDsl()) ) {s = 12;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_20 = input.LA(1);

                         
                        int index8_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred6_InternalMyDsl()) ) {s = 12;}

                         
                        input.seek(index8_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_13 = input.LA(1);

                         
                        int index8_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred6_InternalMyDsl()) ) {s = 12;}

                         
                        input.seek(index8_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\31\uffff";
    static final String dfa_15s = "\1\1\30\uffff";
    static final String dfa_16s = "\1\4\30\uffff";
    static final String dfa_17s = "\1\43\30\uffff";
    static final String dfa_18s = "\1\uffff\1\2\10\uffff\2\1\1\uffff\14\1";
    static final String dfa_19s = "\31\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\uffff\1\15\1\20\1\21\4\uffff\1\1\1\12\1\13\1\1\1\uffff\1\25\1\26\2\uffff\1\27\1\30\1\uffff\1\23\6\1\1\16\1\17\1\22\1\24",
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
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()+ loopback of 592:3: ( (lv_content_2_0= ruleTextExpression ) )+";
        }
    }
    static final String dfa_21s = "\13\uffff";
    static final String dfa_22s = "\2\2\11\uffff";
    static final String dfa_23s = "\2\4\1\uffff\7\0\1\uffff";
    static final String dfa_24s = "\2\43\1\uffff\7\0\1\uffff";
    static final String dfa_25s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_26s = "\3\uffff\1\0\1\6\1\2\1\4\1\5\1\3\1\1\1\uffff}>";
    static final String[] dfa_27s = {
            "\1\1\1\uffff\3\2\4\uffff\4\2\1\uffff\2\2\2\uffff\2\2\1\uffff\13\2",
            "\1\2\1\uffff\1\4\1\5\1\6\4\uffff\2\2\1\3\1\2\1\uffff\2\2\2\uffff\2\2\1\uffff\1\10\10\2\1\7\1\11",
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

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "()* loopback of 1017:5: ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_7 = input.LA(1);

                         
                        int index26_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_4);
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
    static final String dfa_28s = "\3\uffff\1\1\1\4\1\0\1\2\1\6\1\5\1\3\1\uffff}>";
    static final String[] dfa_29s = {
            "\1\2\1\uffff\3\2\4\uffff\4\2\1\uffff\2\2\2\uffff\2\2\1\uffff\1\1\12\2",
            "\1\2\1\uffff\1\5\1\6\1\7\4\uffff\2\2\1\4\1\2\1\uffff\2\2\2\uffff\2\2\1\uffff\1\3\10\2\1\10\1\11",
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
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "()* loopback of 1172:3: ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_9 = input.LA(1);

                         
                        int index33_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_4 = input.LA(1);

                         
                        int index33_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_30s = "\32\uffff";
    static final String dfa_31s = "\1\1\31\uffff";
    static final String dfa_32s = "\1\4\2\uffff\1\0\26\uffff";
    static final String dfa_33s = "\1\43\2\uffff\1\0\26\uffff";
    static final String dfa_34s = "\1\uffff\1\2\27\uffff\1\1";
    static final String dfa_35s = "\3\uffff\1\0\26\uffff}>";
    static final String[] dfa_36s = {
            "\1\1\1\uffff\3\1\4\uffff\4\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\1\1\3\11\1",
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

    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_30;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 1328:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_30;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 1392:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred40_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_3);
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

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_30;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 1456:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred42_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_3);
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

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_30;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 1520:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_30;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 1584:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_3 = input.LA(1);

                         
                        int index44_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_30;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 1648:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_3 = input.LA(1);

                         
                        int index46_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index46_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_37s = "\1\4\11\uffff\1\0\3\uffff\2\0\12\uffff";
    static final String dfa_38s = "\1\43\11\uffff\1\0\3\uffff\2\0\12\uffff";
    static final String dfa_39s = "\1\uffff\1\3\11\uffff\1\2\1\uffff\1\2\2\uffff\5\2\4\uffff\1\1";
    static final String dfa_40s = "\12\uffff\1\0\3\uffff\1\1\1\2\12\uffff}>";
    static final String[] dfa_41s = {
            "\1\1\1\uffff\1\15\1\20\1\21\4\uffff\1\1\1\12\1\13\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\23\6\1\1\16\1\17\1\22\1\24",
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
            ""
    };
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_30;
            this.eof = dfa_31;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_40;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "()+ loopback of 1681:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_10 = input.LA(1);

                         
                        int index49_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_14 = input.LA(1);

                         
                        int index49_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_15 = input.LA(1);

                         
                        int index49_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_15);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000FFECDE1C2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000FFECDE1F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000FFECDE1D0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000FFECDE1D2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000F0200C1C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000F0220C1C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000F0300C1C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002008002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000F0200C1C2L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});

}